package mq;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: mq.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C8646c implements InterfaceC5830d<InterfaceC8644a> {

    /* JADX INFO: renamed from: a */
    public final C8645b f31634a;

    public C8646c(C8645b c8645b) {
        this.f31634a = c8645b;
    }

    /* JADX INFO: renamed from: a */
    public static C8646c m34723a(C8645b c8645b) {
        return new C8646c(c8645b);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC8644a m34724b(C8645b c8645b) {
        return (InterfaceC8644a) C5834h.m26194e(c8645b.getDataCollector());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8644a get() {
        return m34724b(this.f31634a);
    }
}
