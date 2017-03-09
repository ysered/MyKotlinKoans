package i_introduction._2_Named_Arguments

import org.junit.Assert.assertEquals

class _02_Default_And_Named_Params() {

    @org.junit.Test fun testJoinToString() {
        val listStr = listOf(1, 2, 3, 42, 555).joinToString(prefix = "{", postfix = "}")
        assertEquals("{1, 2, 3, 42, 555}", listStr)
    }

}