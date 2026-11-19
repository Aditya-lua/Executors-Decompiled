package com.withpersona.sdk2.inquiry.tracking;

import com.google.mlkit.common.MlKitException;
import gu.d;
import gu.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@f(c = "com.withpersona.sdk2.inquiry.tracking.RealTrackingEventsLogger$Companion", f = "RealTrackingEventsLogger.kt", l = {MlKitException.NOT_ENOUGH_SPACE, 111}, m = "createTrackingEventsRequest")
public final class RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1 extends d {
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
    public RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1(RealTrackingEventsLogger.Companion companion, eu.b<? super RealTrackingEventsLogger$Companion$createTrackingEventsRequest$1> bVar) {
        super(bVar);
        this.this$0 = companion;
    }

    @Override // gu.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createTrackingEventsRequest(null, null, this);
    }
}
