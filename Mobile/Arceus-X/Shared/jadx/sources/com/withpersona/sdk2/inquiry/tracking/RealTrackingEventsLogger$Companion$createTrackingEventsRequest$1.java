package com.withpersona.sdk2.inquiry.tracking;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$Companion", m39664f = "RealTrackingEventsLogger.kt", m39665l = {101, 111}, m39666m = "createTrackingEventsRequest")
@Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1 extends AbstractC10342d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RealTrackingEventsLogger.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1(RealTrackingEventsLogger.Companion companion, InterfaceC9557b<? super RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1> interfaceC9557b) {
        super(interfaceC9557b);
        this.this$0 = companion;
    }

    @Override // pt.AbstractC10339a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        return this.this$0.createTrackingEventsRequest(null, null, this);
    }
}
