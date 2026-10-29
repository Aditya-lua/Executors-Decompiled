package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.core.NetworkStateManager;
import ft.i;
import go.e;
import ku.p0;
import qq.c;
import um.w;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0696RealTrackingEventsLogger_Factory {
    private final i<TrackingEventsCache> cacheProvider;
    private final i<Context> contextProvider;
    private final i<p0> coroutineScopeProvider;
    private final i<e> featureFlagManagerProvider;
    private final i<TrackingMetadataProvider> metadataProvider;
    private final i<w> moshiProvider;
    private final i<NetworkStateManager> networkStateManagerProvider;
    private final i<c> sdkFilesManagerProvider;

    private C0696RealTrackingEventsLogger_Factory(i<Context> iVar, i<TrackingEventsCache> iVar2, i<w> iVar3, i<TrackingMetadataProvider> iVar4, i<c> iVar5, i<e> iVar6, i<p0> iVar7, i<NetworkStateManager> iVar8) {
        this.contextProvider = iVar;
        this.cacheProvider = iVar2;
        this.moshiProvider = iVar3;
        this.metadataProvider = iVar4;
        this.sdkFilesManagerProvider = iVar5;
        this.featureFlagManagerProvider = iVar6;
        this.coroutineScopeProvider = iVar7;
        this.networkStateManagerProvider = iVar8;
    }

    public static C0696RealTrackingEventsLogger_Factory create(i<Context> iVar, i<TrackingEventsCache> iVar2, i<w> iVar3, i<TrackingMetadataProvider> iVar4, i<c> iVar5, i<e> iVar6, i<p0> iVar7, i<NetworkStateManager> iVar8) {
        return new C0696RealTrackingEventsLogger_Factory(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8);
    }

    public static RealTrackingEventsLogger newInstance(Context context, TrackingEventsCache trackingEventsCache, w wVar, TrackingMetadataProvider trackingMetadataProvider, c cVar, e eVar, String str, p0 p0Var, NetworkStateManager networkStateManager) {
        return new RealTrackingEventsLogger(context, trackingEventsCache, wVar, trackingMetadataProvider, cVar, eVar, str, p0Var, networkStateManager);
    }

    public RealTrackingEventsLogger get(String str) {
        return newInstance(this.contextProvider.get(), this.cacheProvider.get(), this.moshiProvider.get(), this.metadataProvider.get(), this.sdkFilesManagerProvider.get(), this.featureFlagManagerProvider.get(), str, this.coroutineScopeProvider.get(), this.networkStateManagerProvider.get());
    }
}
