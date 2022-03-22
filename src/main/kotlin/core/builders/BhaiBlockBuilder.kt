package core.builders

import core.KBhaiLangDsl
import core.bhai

@KBhaiLangDsl
class BhaiBlockBuilder {

    infix fun bhai.bol(text: Any) {
        println(text)
    }

    infix fun bhai.jabTak(block: BhaiWhileBlockBuilder.() -> Unit) {
        return BhaiWhileBlockBuilder().apply(block).build()
    }

    infix fun bhai.agar(block: BhaiIfBlockBuilder.() -> Unit) {
        return BhaiIfBlockBuilder().apply(block).build()
    }

    fun build() {
        // do nothing at this point
    }
}