package org.foo

class Utilities implements  Serializable{

    def steps
    def CUSTOM_WORK_SPACE = "F:\\Jenkins_Workspace\\" +  "JOB_NAME" + "\\" + "BUILD_NUMBER"
    def VAR_1 = "VAR 1"
    def VAR_2 = "VAR 2"
    def VAR_3 = "VAR 3"

    Utilities(steps) {this.steps = steps}

    def mvn(args) {
        steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
    }
}
