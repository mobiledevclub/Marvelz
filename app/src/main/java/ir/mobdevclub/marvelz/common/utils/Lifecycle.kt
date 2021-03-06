package ir.mobdevclub.marvelz.common.utils

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import ir.mobdevclub.marvelz.common.Event
import ir.mobdevclub.marvelz.common.EventObserver
import ir.mobdevclub.marvelz.common.Failure

fun <T : Any, L : LiveData<T>> LifecycleOwner.observe(liveData: L, body: (T?) -> Unit) =
    liveData.observe(this, Observer(body))

fun <L : LiveData<Failure>> LifecycleOwner.failure(liveData: L, body: (Failure?) -> Unit) =
    liveData.observe(this, Observer(body))

fun <L : LiveData<Event<Failure>>> LifecycleOwner.failureEvent(liveData: L, body: (Failure?) -> Unit) =
    liveData.observe(this, EventObserver(body))

fun <T : Any, L : LiveData<Event<T>>> LifecycleOwner.observeEvent(liveData: L, body: (T?) -> Unit) =
    liveData.observe(this, EventObserver(body))
