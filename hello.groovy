@RestController
class HelloWorldController {
    @GetMapping("/hello")
    def hello(@RequestParam name) {
        "Hello, $name\n"
    }
} 