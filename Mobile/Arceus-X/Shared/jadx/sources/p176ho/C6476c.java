package p176ho;

import p136ft.InterfaceC5835i;
import p152go.C6159e;

/* JADX INFO: renamed from: ho.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C6476c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC5835i<C6159e> f24648a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5835i<InterfaceC6474a> f24649b;

    public C6476c(InterfaceC5835i<C6159e> interfaceC5835i, InterfaceC5835i<InterfaceC6474a> interfaceC5835i2) {
        this.f24648a = interfaceC5835i;
        this.f24649b = interfaceC5835i2;
    }

    /* JADX INFO: renamed from: a */
    public static C6476c m28231a(InterfaceC5835i<C6159e> interfaceC5835i, InterfaceC5835i<InterfaceC6474a> interfaceC5835i2) {
        return new C6476c(interfaceC5835i, interfaceC5835i2);
    }

    /* JADX INFO: renamed from: c */
    public static C6475b m28232c(String str, C6159e c6159e, InterfaceC6474a interfaceC6474a) {
        return new C6475b(str, c6159e, interfaceC6474a);
    }

    /* JADX INFO: renamed from: b */
    public C6475b m28233b(String str) {
        return m28232c(str, this.f24648a.get(), this.f24649b.get());
    }
}
