## Example

```kotlin
Kbhai {
        bhai bol "Hello World ..."

        val a = 3
        var b = 0

        bhai jabTak {
            yaSahiHai { b < 5 }
            toYeKar {
                bhai bol b

                bhai agar {
                    yaSahiHai { b == a }
                    toYeKar { bhai bol "b is equal to a" }
                }

                b += 1
            }
        }
    }
```
