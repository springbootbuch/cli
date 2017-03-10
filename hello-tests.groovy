class HelloWorldControllerTest {
    @Test
    void helloWorldShouldWork() throws Exception {
        assertEquals(
            "Hello, Reader\n", 
            new HelloWorldController()
                .hello("Reader"))
    }
}