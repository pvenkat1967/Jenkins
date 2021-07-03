job('nodeJS example')
    scm {
        git('git://github.com/pvenkat1967/Jenkins.git') { node -->
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