package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import ft.d;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class TrackingMetadataProvider_Factory implements d<TrackingMetadataProvider> {
    private final i<Context> contextProvider;

    private TrackingMetadataProvider_Factory(i<Context> iVar) {
        this.contextProvider = iVar;
    }

    public static TrackingMetadataProvider_Factory create(i<Context> iVar) {
        return new TrackingMetadataProvider_Factory(iVar);
    }

    public static TrackingMetadataProvider newInstance(Context context) {
        return new TrackingMetadataProvider(context);
    }

    @Override // ht.a
    public TrackingMetadataProvider get() {
        return newInstance(this.contextProvider.get());
    }
}
