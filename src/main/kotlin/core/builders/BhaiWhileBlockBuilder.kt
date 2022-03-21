package core.builders

class BhaiWhileBlockBuilder {
    private var _expression: () -> Boolean = { false }

    infix fun BhaiWhileBlockBuilder.yaSahiHai(block: () -> Boolean) {
        _expression = block
    }

    infix fun BhaiWhileBlockBuilder.toYeKar(block: () -> Unit) {
        while (_expression()) {
            block()
        }
    }

    fun build() {
        // do nothing at this point
    }
}