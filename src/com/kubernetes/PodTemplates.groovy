package com.ghostwritten.PodTemplates

public void dockerTemplate(body) {
  podTemplate(
        containers: [containerTemplate(name: 'docker', image: 'docker', command: 'sleep', args: '99d')],
        volumes: [hostPathVolume(hostPath: '/var/run/docker.sock', mountPath: '/var/run/docker.sock')]) {
    body.call()
}
}

public void mavenTemplate(body) {
  podTemplate(
        containers: [containerTemplate(name: 'maven', image: 'maven', command: 'sleep', args: '99d')],
        volumes: [secretVolume(secretName: 'maven-settings', mountPath: '/root/.m2'),
                  persistentVolumeClaim(claimName: 'maven-local-repo', mountPath: '/root/.m2repo')]) {
    body.call()
}
}
