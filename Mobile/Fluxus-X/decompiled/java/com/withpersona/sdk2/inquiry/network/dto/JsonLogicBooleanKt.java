package com.withpersona.sdk2.inquiry.network.dto;

import ms.m;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import zt.h;
import zt.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lms/i;", "jsonLogicEngine$delegate", "Lzt/h;", "getJsonLogicEngine", "()Lms/i;", "jsonLogicEngine", "network-inquiry_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class JsonLogicBooleanKt {

    @NotNull
    private static final h jsonLogicEngine$delegate = i.a(new Function0() { // from class: com.withpersona.sdk2.inquiry.network.dto.b
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JsonLogicBooleanKt.jsonLogicEngine_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final ms.i getJsonLogicEngine() {
        return (ms.i) jsonLogicEngine$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ms.i jsonLogicEngine_delegate$lambda$0() {
        ms.i.a aVar = new ms.i.a();
        m mVar = m.f24381a;
        return aVar.d(mVar.b()).b(mVar.a()).e();
    }
}
