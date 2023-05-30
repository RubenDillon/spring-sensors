allow_k8s_contexts('tkg2-tap-01')

SOURCE_IMAGE = os.getenv("SOURCE_IMAGE", default='dev.local/spring-sensors-source')
LOCAL_PATH = os.getenv("LOCAL_PATH", default='.')
NAMESPACE = os.getenv("NAMESPACE", default='default')

k8s_custom_deploy(
    'spring-sensors',
    apply_cmd="tanzu apps workload apply -f config/workload.yaml --live-update" +
               " --local-path " + LOCAL_PATH +
               " --source-image " + SOURCE_IMAGE +
               " --label apps.tanzu.vmware.com/has-tests=true " +
               " --param-yaml testing_pipeline_matching_labels='{"+"apps.tanzu.vmware.com/language"+": "+"java"+"}' " +
               " --namespace " + NAMESPACE +
               " --yes >/dev/null" +
               " && kubectl get workload spring-sensors --namespace " + NAMESPACE + " -o yaml",
    delete_cmd="tanzu apps workload delete -f config/workload.yaml --namespace " + NAMESPACE + " --yes",
    deps=['pom.xml', './target/classes'],
    container_selector='workload',
    live_update=[
      sync('./target/classes', '/workspace/BOOT-INF/classes')
    ]
)

k8s_resource('spring-sensors', port_forwards=["8080:8080"],
            extra_pod_selectors=[{'serving.knative.dev/service': 'spring-sensors'}])