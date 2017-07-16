println("Hello, World! This is kts gradle script")

apply<TestPlugin>()

class TestPlugin: Plugin<Project> {
    override
    fun apply(project: Project?) {
        println("Apply test plugin")
        project?.task("foo") {
            println("Task foo")
            doFirst {
                println("Task foo doFirst called")
            }
            doLast {
                println("Task foo doLast called")
            }
        }
    }
}