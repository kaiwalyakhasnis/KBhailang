## Try it out
https://play.kotlinlang.org/embed?short=HwbKXZOup&theme=darcula&from=1&to=27

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

## Use as dependency
<b>Step 1</b>. Add the JitPack repository to your build file
```groovy
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```
<b>Step 2</b>. Add the dependency
```gradle
    dependencies {
	        implementation 'com.github.kaiwalyakhasnis:KBhailang:0.0.3'
	}
```



