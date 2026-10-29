package ro;

import p136ft.InterfaceC5830d;
import p136ft.InterfaceC5835i;
import p475uq.C11930a;

/* JADX INFO: renamed from: ro.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C10966k implements InterfaceC5830d<C10960i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C11930a> f38799a;

    public C10966k(InterfaceC5835i<C11930a> interfaceC5835i) {
        this.f38799a = interfaceC5835i;
    }

    /* JADX INFO: renamed from: a */
    public static C10966k m41585a(InterfaceC5835i<C11930a> interfaceC5835i) {
        return new C10966k(interfaceC5835i);
    }

    /* JADX INFO: renamed from: c */
    public static C10960i m41586c(C11930a c11930a) {
        return new C10960i(c11930a);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C10960i get() {
        return m41586c(this.f38799a.get());
    }
}
