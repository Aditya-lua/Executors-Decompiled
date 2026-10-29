package p082dp;

import com.withpersona.sdk2.inquiry.FallbackMode;
import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: dp.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C4651e implements InterfaceC5830d<FallbackMode> {

    /* JADX INFO: renamed from: a */
    public final C4649c f19042a;

    public C4651e(C4649c c4649c) {
        this.f19042a = c4649c;
    }

    /* JADX INFO: renamed from: a */
    public static C4651e m22881a(C4649c c4649c) {
        return new C4651e(c4649c);
    }

    /* JADX INFO: renamed from: b */
    public static FallbackMode m22882b(C4649c c4649c) {
        return (FallbackMode) C5834h.m26194e(c4649c.getFallbackMode());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FallbackMode get() {
        return m22882b(this.f19042a);
    }
}
