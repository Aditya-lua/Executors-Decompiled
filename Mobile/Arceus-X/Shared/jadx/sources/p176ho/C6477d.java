package p176ho;

import p136ft.C5831e;
import p136ft.InterfaceC5835i;

/* JADX INFO: renamed from: ho.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6477d implements C6475b.a {

    /* JADX INFO: renamed from: a */
    public final C6476c f24650a;

    public C6477d(C6476c c6476c) {
        this.f24650a = c6476c;
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5835i<C6475b.a> m28234a(C6476c c6476c) {
        return C5831e.m26182a(new C6477d(c6476c));
    }

    @Override // p176ho.C6475b.a
    public C6475b create(String str) {
        return this.f24650a.m28233b(str);
    }
}
