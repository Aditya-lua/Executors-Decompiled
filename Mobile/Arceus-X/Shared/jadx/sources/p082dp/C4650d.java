package p082dp;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;
import p610zo.EnumC13962h;

/* JADX INFO: renamed from: dp.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C4650d implements InterfaceC5830d<EnumC13962h> {

    /* JADX INFO: renamed from: a */
    public final C4649c f19041a;

    public C4650d(C4649c c4649c) {
        this.f19041a = c4649c;
    }

    /* JADX INFO: renamed from: a */
    public static C4650d m22878a(C4649c c4649c) {
        return new C4650d(c4649c);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC13962h m22879b(C4649c c4649c) {
        return (EnumC13962h) C5834h.m26194e(c4649c.getEnvironment());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public EnumC13962h get() {
        return m22879b(this.f19041a);
    }
}
