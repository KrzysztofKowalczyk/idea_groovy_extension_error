package bar

import groovy.transform.CompileStatic

@CompileStatic
class Bar {

    protected void bar() {
       "String".foo()
    }
}
