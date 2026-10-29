package p163h8;

import ht.InterfaceC6564a;
import java.util.concurrent.Executor;
import p044c8.InterfaceC1559e;
import p071d8.InterfaceC4470b;
import p190i8.InterfaceC6683x;
import p212j8.InterfaceC7044d;
import p241k8.InterfaceC7490b;

/* JADX INFO: renamed from: h8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6318d implements InterfaceC4470b<C6317c> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<Executor> f24044a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6564a<InterfaceC1559e> f24045b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6564a<InterfaceC6683x> f24046c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6564a<InterfaceC7044d> f24047d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6564a<InterfaceC7490b> f24048e;

    public C6318d(InterfaceC6564a<Executor> interfaceC6564a, InterfaceC6564a<InterfaceC1559e> interfaceC6564a2, InterfaceC6564a<InterfaceC6683x> interfaceC6564a3, InterfaceC6564a<InterfaceC7044d> interfaceC6564a4, InterfaceC6564a<InterfaceC7490b> interfaceC6564a5) {
        this.f24044a = interfaceC6564a;
        this.f24045b = interfaceC6564a2;
        this.f24046c = interfaceC6564a3;
        this.f24047d = interfaceC6564a4;
        this.f24048e = interfaceC6564a5;
    }

    /* JADX INFO: renamed from: a */
    public static C6318d m27625a(InterfaceC6564a<Executor> interfaceC6564a, InterfaceC6564a<InterfaceC1559e> interfaceC6564a2, InterfaceC6564a<InterfaceC6683x> interfaceC6564a3, InterfaceC6564a<InterfaceC7044d> interfaceC6564a4, InterfaceC6564a<InterfaceC7490b> interfaceC6564a5) {
        return new C6318d(interfaceC6564a, interfaceC6564a2, interfaceC6564a3, interfaceC6564a4, interfaceC6564a5);
    }

    /* JADX INFO: renamed from: c */
    public static C6317c m27626c(Executor executor, InterfaceC1559e interfaceC1559e, InterfaceC6683x interfaceC6683x, InterfaceC7044d interfaceC7044d, InterfaceC7490b interfaceC7490b) {
        return new C6317c(executor, interfaceC1559e, interfaceC6683x, interfaceC7044d, interfaceC7490b);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6317c get() {
        return m27626c(this.f24044a.get(), this.f24045b.get(), this.f24046c.get(), this.f24047d.get(), this.f24048e.get());
    }
}
