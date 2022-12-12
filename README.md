# Jenkins Shared Library

Less makes more

- [Extending with Shared Libraries](https://www.jenkins.io/doc/book/pipeline/shared-libraries/)


1. [sayHi](./vars/saHi.groovy) pipeline script demo

```bash
@Library('jenkins-shared-library')_

import com.ghostwritten.GlobalVars

stage('SayHi') {
    echo 'Hello world'
    sayHi 'Jack'
    println GlobalVars.foo
}
```
