@Service
class Greeter {
    def hello = {name -> println "Hello, ${name}"}
}

@Component
class Application implements CommandLineRunner {
    @Autowired
    Greeter greeter
    
    void run(String... args) {
        greeter.hello((args as List)[0]?:'n/a')
    }
}