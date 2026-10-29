package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager;
import p136ft.InterfaceC5835i;
import p152go.C6159e;
import p256ku.InterfaceC7906p0;
import p391qq.C10700c;
import p471um.C11888w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14303RealTrackingEventsLogger_Factory {
    private final InterfaceC5835i<TrackingEventsCache> cacheProvider;
    private final InterfaceC5835i<Context> contextProvider;
    private final InterfaceC5835i<InterfaceC7906p0> coroutineScopeProvider;
    private final InterfaceC5835i<C6159e> featureFlagManagerProvider;
    private final InterfaceC5835i<TrackingMetadataProvider> metadataProvider;
    private final InterfaceC5835i<C11888w> moshiProvider;
    private final InterfaceC5835i<NetworkStateManager> networkStateManagerProvider;
    private final InterfaceC5835i<C10700c> sdkFilesManagerProvider;

    private C14303RealTrackingEventsLogger_Factory(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<TrackingEventsCache> interfaceC5835i2, InterfaceC5835i<C11888w> interfaceC5835i3, InterfaceC5835i<TrackingMetadataProvider> interfaceC5835i4, InterfaceC5835i<C10700c> interfaceC5835i5, InterfaceC5835i<C6159e> interfaceC5835i6, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i7, InterfaceC5835i<NetworkStateManager> interfaceC5835i8) {
        this.contextProvider = interfaceC5835i;
        this.cacheProvider = interfaceC5835i2;
        this.moshiProvider = interfaceC5835i3;
        this.metadataProvider = interfaceC5835i4;
        this.sdkFilesManagerProvider = interfaceC5835i5;
        this.featureFlagManagerProvider = interfaceC5835i6;
        this.coroutineScopeProvider = interfaceC5835i7;
        this.networkStateManagerProvider = interfaceC5835i8;
    }

    public static C14303RealTrackingEventsLogger_Factory create(InterfaceC5835i<Context> interfaceC5835i, InterfaceC5835i<TrackingEventsCache> interfaceC5835i2, InterfaceC5835i<C11888w> interfaceC5835i3, InterfaceC5835i<TrackingMetadataProvider> interfaceC5835i4, InterfaceC5835i<C10700c> interfaceC5835i5, InterfaceC5835i<C6159e> interfaceC5835i6, InterfaceC5835i<InterfaceC7906p0> interfaceC5835i7, InterfaceC5835i<NetworkStateManager> interfaceC5835i8) {
        return new C14303RealTrackingEventsLogger_Factory(interfaceC5835i, interfaceC5835i2, interfaceC5835i3, interfaceC5835i4, interfaceC5835i5, interfaceC5835i6, interfaceC5835i7, interfaceC5835i8);
    }

    public static RealTrackingEventsLogger newInstance(Context context, TrackingEventsCache trackingEventsCache, C11888w c11888w, TrackingMetadataProvider trackingMetadataProvider, C10700c c10700c, C6159e c6159e, String str, InterfaceC7906p0 interfaceC7906p0, NetworkStateManager networkStateManager) {
        return new RealTrackingEventsLogger(context, trackingEventsCache, c11888w, trackingMetadataProvider, c10700c, c6159e, str, interfaceC7906p0, networkStateManager);
    }

    public RealTrackingEventsLogger get(String str) {
        return newInstance(this.contextProvider.get(), this.cacheProvider.get(), this.moshiProvider.get(), this.metadataProvider.get(), this.sdkFilesManagerProvider.get(), this.featureFlagManagerProvider.get(), str, this.coroutineScopeProvider.get(), this.networkStateManagerProvider.get());
    }
}
