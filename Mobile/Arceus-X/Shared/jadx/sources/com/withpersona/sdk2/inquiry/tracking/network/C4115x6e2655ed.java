package com.withpersona.sdk2.inquiry.tracking.network;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import java.util.Set;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory */
/* JADX INFO: loaded from: classes3.dex */
public final class C4115x6e2655ed implements InterfaceC5830d<Set<JsonAdapterBinding<?>>> {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory$InstanceHolder */
    public static final class InstanceHolder {
        static final C4115x6e2655ed INSTANCE = new C4115x6e2655ed();

        private InstanceHolder() {
        }
    }

    public static C4115x6e2655ed create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
        return (Set) C5834h.m26194e(TrackingEventsServiceModule.provideMoshiJsonAdapterBinding());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public Set<JsonAdapterBinding<?>> get() {
        return provideMoshiJsonAdapterBinding();
    }
}
