job('nodeJS example')
    scm {
        git('git://github.com/wardviaene/docker-demo.git') { node --> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('pvenkat1967@gmail.com')
        }
    }
    trigger {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        npm install 
    }
