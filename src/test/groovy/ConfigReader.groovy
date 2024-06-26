
class ConfigReader {

	def static environ = "test"

	static ConfigObject getConfiguration() {
        def env = System.getProperty("env")

		if(env) {
			environ = env
		}

		def config = new ConfigSlurper(environ).parse(new File('src//test//resources//WUConfig.groovy').toURI().toURL())
		config
	}
}