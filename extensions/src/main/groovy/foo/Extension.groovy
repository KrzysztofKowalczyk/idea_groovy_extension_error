package foo

import groovy.transform.CompileStatic

@CompileStatic
abstract class Extension {

  static boolean foo(final String x) {
    return false
  }
}
