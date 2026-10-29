package com.withpersona.sdk2.inquiry.network.dto;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;
import p527wr.C12556m;
import p527wr.InterfaceC12552i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31665d2 = {"Lwr/i;", "jsonLogicEngine$delegate", "Ljt/h;", "getJsonLogicEngine", "()Lwr/i;", "jsonLogicEngine", "network-inquiry_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class JsonLogicBooleanKt {

    @NotNull
    private static final InterfaceC7341h jsonLogicEngine$delegate = C7342i.m30456b(new Function0() { // from class: com.withpersona.sdk2.inquiry.network.dto.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JsonLogicBooleanKt.jsonLogicEngine_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC12552i getJsonLogicEngine() {
        return (InterfaceC12552i) jsonLogicEngine$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC12552i jsonLogicEngine_delegate$lambda$0() {
        InterfaceC12552i.a aVar = new InterfaceC12552i.a();
        C12556m c12556m = C12556m.f44793a;
        return aVar.m46913d(c12556m.m46919b()).m46911b(c12556m.m46918a()).m46914e();
    }
}
