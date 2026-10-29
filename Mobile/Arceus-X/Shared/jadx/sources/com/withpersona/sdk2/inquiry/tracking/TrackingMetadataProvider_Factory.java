package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingMetadataProvider_Factory implements InterfaceC5830d<TrackingMetadataProvider> {
    private final InterfaceC5835i<Context> contextProvider;

    private TrackingMetadataProvider_Factory(InterfaceC5835i<Context> interfaceC5835i) {
        this.contextProvider = interfaceC5835i;
    }

    public static TrackingMetadataProvider_Factory create(InterfaceC5835i<Context> interfaceC5835i) {
        return new TrackingMetadataProvider_Factory(interfaceC5835i);
    }

    public static TrackingMetadataProvider newInstance(Context context) {
        return new TrackingMetadataProvider(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    public TrackingMetadataProvider get() {
        return newInstance(this.contextProvider.get());
    }
}
