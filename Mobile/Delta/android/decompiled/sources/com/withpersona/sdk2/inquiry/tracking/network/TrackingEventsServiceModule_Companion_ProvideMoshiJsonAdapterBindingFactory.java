package com.withpersona.sdk2.inquiry.tracking.network;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import ft.d;
import ft.h;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterBindingFactory implements d<Set<JsonAdapterBinding<?>>> {

    public static final class InstanceHolder {
        static final TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterBindingFactory INSTANCE = new TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterBindingFactory();

        private InstanceHolder() {
        }
    }

    public static TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterBindingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
        return (Set) h.e(TrackingEventsServiceModule.INSTANCE.provideMoshiJsonAdapterBinding());
    }

    @Override // ht.a
    public Set<JsonAdapterBinding<?>> get() {
        return provideMoshiJsonAdapterBinding();
    }
}
