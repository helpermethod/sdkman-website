article {
    a(name: 'listcandidates'){}
    h2 { yield 'List Candidates' }
    p {
        yield 'To get a listing of available Candidates:'
        pre { code '$ sdk list' }
        yield 'This will render a searchable alphabetic list with name, current stable default version, website URL, description and easy install command for each Candidate. The output is piped to '
        code 'less'
        yield ' so standard keyboard shortcuts may be used with '
        code 'q'
        yield ' to exit.'
        pre { code '''
================================================================================
Available Candidates
================================================================================
q-quit                                  /-search down
j-down                                  ?-search up
k-up                                    h-help
--------------------------------------------------------------------------------
Groovy (2.4.5)                                       http://www.groovy-lang.org/

Groovy is a powerful, optionally typed and dynamic language, with static-typing
and static compilation capabilities, for the Java platform aimed at multiplying
developers’ productivity thanks to a concise, familiar and easy to learn syntax.
It integrates smoothly with any Java program, and immediately delivers to your
application powerful features, including scripting capabilities, Domain-Specific
Language authoring, runtime and compile-time meta-programming and functional
programming.

                                                            $ sdk install groovy
--------------------------------------------------------------------------------
Scala (2.11.7)                                        http://www.scala-lang.org/
...
'''
        }
    }
}
br()

article {
    a(name: 'listversions'){}
    h2 { yield 'List Versions' }
    p {
        yield 'To get a listing of Candidate Versions:'
        pre { code '$ sdk list groovy' }
        yield 'This will result in a list view showing the available, local, installed and current versions of the SDK.'
        pre { code '''
================================================================================
Available Groovy Versions
================================================================================
 > * 2.4.4                2.3.1                2.0.8                1.8.3
     2.4.3                2.3.0                2.0.7                1.8.2
     2.4.2                2.2.2                2.0.6                1.8.1
     2.4.1                2.2.1                2.0.5                1.8.0
     2.4.0                2.2.0                2.0.4                1.7.9
     2.3.9                2.1.9                2.0.3                1.7.8
     2.3.8                2.1.8                2.0.2                1.7.7
     2.3.7                2.1.7                2.0.1                1.7.6
     2.3.6                2.1.6                2.0.0                1.7.5
     2.3.5                2.1.5                1.8.9                1.7.4
     2.3.4                2.1.4                1.8.8                1.7.3
     2.3.3                2.1.3                1.8.7                1.7.2
     2.3.2                2.1.2                1.8.6                1.7.11
     2.3.11               2.1.1                1.8.5                1.7.10
     2.3.10               2.1.0                1.8.4                1.7.1

================================================================================
+ - local version
* - installed
> - currently in use
================================================================================
'''
        }
    }
}
br()
