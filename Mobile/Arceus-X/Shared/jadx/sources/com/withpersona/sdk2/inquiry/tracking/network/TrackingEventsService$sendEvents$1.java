package com.withpersona.sdk2.inquiry.tracking.network;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsService", m39664f = "TrackingEventsService.kt", m39665l = {38}, m39666m = "sendEvents-0E7RQCE$tracking_events_release")
@Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TrackingEventsService$sendEvents$1 extends AbstractC10342d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TrackingEventsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingEventsService$sendEvents$1(TrackingEventsService trackingEventsService, InterfaceC9557b<? super TrackingEventsService$sendEvents$1> interfaceC9557b) {
        super(interfaceC9557b);
        this.this$0 = trackingEventsService;
    }

    @Override // pt.AbstractC10339a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        Object objM50805sendEvents0E7RQCE$tracking_events_release = this.this$0.m50805sendEvents0E7RQCE$tracking_events_release(null, null, this);
        return objM50805sendEvents0E7RQCE$tracking_events_release == C10047c.m38805e() ? objM50805sendEvents0E7RQCE$tracking_events_release : C7347n.m30459a(objM50805sendEvents0E7RQCE$tracking_events_release);
    }
}
