

def String CUSTOM_WORK_SPACE;

def call() {
    CUSTOM_WORK_SPACE = "F:\\Jenkins_Workspace\\" +  "${env.JOB_NAME}" + "\\" + "${env.BUILD_NUMBER}"
}

return this