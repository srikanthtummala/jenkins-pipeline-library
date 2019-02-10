

def String CUSTOM_WORK_SPACE;

def call() {
    CUSTOM_WORK_SPACE = "F:\\Jenkins_Workspace\\" +  "${env.JOB_NAME}" + "\\" + "${env.BUILD_NUMBER}"
    println(CUSTOM_WORK_SPACE)
}

return this;