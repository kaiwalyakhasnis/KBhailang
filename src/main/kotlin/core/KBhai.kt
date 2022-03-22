package core

import core.builders.BhaiBlockBuilder

object bhai

@DslMarker
annotation class KBhaiLangDsl

inline fun Kbhai(init: BhaiBlockBuilder.() -> Unit) {
    return BhaiBlockBuilder().apply(init).build()
}