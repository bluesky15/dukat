@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external open class Emitter {
    open fun addEvent(name: String): Emitter /* this */
}

external open class ProcessEmitter : Emitter {
    override fun addEvent(name: String): ProcessEmitter /* this */
}

/* extending interface from lib.es5.d.ts */
inline fun <T> Array<T>.shuffle(): Array<T> /* this */ = this.asDynamic().shuffle()