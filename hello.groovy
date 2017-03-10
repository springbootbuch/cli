@RestController
class HelloWorldController {
    @GetMapping("/hello")
    String hello(
        @RequestParam final String name
    ) {
        return "Hello, " + name + "\n"
    }
} 