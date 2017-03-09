@RestController
class HelloWorldController {
    @GetMapping("/hello")
    String helloWorld(
        @RequestParam final String name
    ) {
        return "Hello, " + name + "\n"
    }
} 