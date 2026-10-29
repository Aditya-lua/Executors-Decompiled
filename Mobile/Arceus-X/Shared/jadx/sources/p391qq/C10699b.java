package p391qq;

import p136ft.C5834h;
import p136ft.InterfaceC5830d;

/* JADX INFO: renamed from: qq.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C10699b implements InterfaceC5830d<C10700c> {

    /* JADX INFO: renamed from: a */
    public final C10698a f38228a;

    public C10699b(C10698a c10698a) {
        this.f38228a = c10698a;
    }

    /* JADX INFO: renamed from: a */
    public static C10699b m40775a(C10698a c10698a) {
        return new C10699b(c10698a);
    }

    /* JADX INFO: renamed from: c */
    public static C10700c m40776c(C10698a c10698a) {
        return (C10700c) C5834h.m26194e(c10698a.getSdkFilesManager());
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10700c get() {
        return m40776c(this.f38228a);
    }
}
