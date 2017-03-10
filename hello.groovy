@RestController
class HelloWorldController {
    @GetMapping("/hello")
    String hello(
        @RequestParam final String name
    ) {
        "Hello, $name\n"
    }
} 