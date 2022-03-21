package core.builders

class BhaiIfBlockBuilder {
    private var _expression: () -> Boolean = { false }

    infix fun BhaiIfBlockBuilder.yaSahiHai(block: () -> Boolean) {
        _expression = block
    }

    infix fun BhaiWhileBlockBuilder.toYeKar(block: () -> Unit) {
        if (_expression()) {
            block()
        }
    }

    fun build() {
        // do nothing at this point
    }
}