# Accelerator Log

## Options
```json
{
  "projectName" : "spring-sensors"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(GeneratorValidationTransform, UniquePath)
┃ ┏ ┏ engine.transformations[0].validated (Combo)
┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ engine.transformations[0].validated.delegate (Chain)
┃ ┃ ┃  Info Running Chain(Merge, UniquePath)
┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0] (Merge)
┃ ┃ ┃ ┃  Info Running Merge(Combo, Combo, Combo, Combo)
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[0] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[0].sources[0].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, Exclude)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[0].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**/*]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug README.MD matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoApplication.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoController.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/config/WebProperties.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/Sensor.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorData.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorRepository.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/tanzu/demo/DemoApplicationTests.java matched [**/*] -> included
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[0].delegate.transformations[1] (Exclude)
┃ ┃ ┃ ┃ ┃ ┃  Info Will exclude [config/*.yaml, Tiltfile, README.md, catalog/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug README.MD didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoApplication.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoController.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/config/WebProperties.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/Sensor.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorData.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorRepository.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┗ ┗ Debug src/test/java/org/tanzu/demo/DemoApplicationTests.java didn't match [config/*.yaml, Tiltfile, README.md, catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[1] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[0].sources[1].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[1].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [config/*.yaml, Tiltfile]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.MD didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile matched [config/*.yaml, Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml matched [config/*.yaml, Tiltfile] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoApplication.java didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoController.java didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/config/WebProperties.java didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/Sensor.java didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorData.java didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorRepository.java didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/tanzu/demo/DemoApplicationTests.java didn't match [config/*.yaml, Tiltfile] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[1].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [tanzu-java-web-app->spring-sensors]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[1].delegate.transformations[2] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [your-registry.io/project->dev.local]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[2] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[0].sources[2].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[2].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [README.md]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.MD didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoApplication.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoController.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/config/WebProperties.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/Sensor.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorData.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorRepository.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/tanzu/demo/DemoApplicationTests.java didn't match [README.md] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[2].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┗ ┗  Info Will replace [tanzu-java-web-app->spring-sensors]
┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[3] (Combo)
┃ ┃ ┃ ┃ ┃  Info Combo running as Chain
┃ ┃ ┃ ┃ ┃ engine.transformations[0].validated.delegate.transformations[0].sources[3].delegate (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(Include, ReplaceText, RewritePath)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[3].delegate.transformations[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃  Info Will include [catalog/*.yaml]
┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/MavenWrapperDownloader.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.jar didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug .tanzuignore didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug README.MD didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug Tiltfile didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug catalog/catalog-info.yaml matched [catalog/*.yaml] -> included
┃ ┃ ┃ ┃ ┃ ┃ Debug config/workload.yaml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoApplication.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/DemoController.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/config/WebProperties.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/Sensor.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorData.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/org/tanzu/demo/model/SensorRepository.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.properties didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/static/tanzu.css didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/templates/index.html didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┗ Debug src/test/java/org/tanzu/demo/DemoApplicationTests.java didn't match [catalog/*.yaml] -> excluded
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[3].delegate.transformations[1] (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [tanzu-java-web-app->spring-sensors]
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[0].validated.delegate.transformations[0].sources[3].delegate.transformations[2] (RewritePath)
┃ ┃ ┃ ┗ ┗ ┗ Debug Path 'catalog/catalog-info.yaml' matched '^(?<folder>.*/)?(?<filename>([^/]+?|)(?=(?<ext>\.[^/.]*)?)$)' with groups {ext=.yaml, folder=catalog/, filename=catalog-info.yaml, g0=catalog/catalog-info.yaml, g1=catalog/, g2=catalog-info.yaml, g3=catalog-info.yaml, g4=.yaml} and was rewritten to 'catalog-info.yaml'
┃ ┗ ┗ ╺ engine.transformations[0].validated.delegate.transformations[1] (UniquePath)
┗ ╺ engine.transformations[1] (UniquePath)
```
