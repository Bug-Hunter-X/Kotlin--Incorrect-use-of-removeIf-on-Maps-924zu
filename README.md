# Kotlin Map removeIf Bug

This repository demonstrates a common error when using the `removeIf` function on `MutableMap` in Kotlin.  The example shows how attempting to use `removeIf` directly on values leads to a compilation error because `removeIf` operates on the entry set, not just keys or values.

The solution provides the correct approach for removing entries based on a condition involving values.