package com.withpersona.sdk2.inquiry.tracking.network;

import gt.n;
import kotlin.Metadata;
import lt.b;
import mt.c;
import nt.d;
import nt.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@f(c = "com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService", f = "TrackingEventsService.kt", l = {38}, m = "sendEvents-0E7RQCE$tracking_events_release")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class TrackingEventsService$sendEvents$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsService$sendEvents$1(TrackingEventsService trackingEventsService, b<? super TrackingEventsService$sendEvents$1> bVar) {
        super(bVar);
        this.this$0 = trackingEventsService;
    }

    @Override // nt.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM71sendEvents0E7RQCE$tracking_events_release = this.this$0.m71sendEvents0E7RQCE$tracking_events_release(null, null, this);
        return objM71sendEvents0E7RQCE$tracking_events_release == c.e() ? objM71sendEvents0E7RQCE$tracking_events_release : n.a(objM71sendEvents0E7RQCE$tracking_events_release);
    }
}
