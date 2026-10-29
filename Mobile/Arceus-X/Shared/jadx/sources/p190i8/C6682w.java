package p190i8;

import ht.InterfaceC6564a;
import java.util.concurrent.Executor;
import p071d8.InterfaceC4470b;
import p212j8.InterfaceC7044d;
import p241k8.InterfaceC7490b;

/* JADX INFO: renamed from: i8.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6682w implements InterfaceC4470b<C6681v> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC6564a<Executor> f25759a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6564a<InterfaceC7044d> f25760b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6564a<InterfaceC6683x> f25761c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6564a<InterfaceC7490b> f25762d;

    public C6682w(InterfaceC6564a<Executor> interfaceC6564a, InterfaceC6564a<InterfaceC7044d> interfaceC6564a2, InterfaceC6564a<InterfaceC6683x> interfaceC6564a3, InterfaceC6564a<InterfaceC7490b> interfaceC6564a4) {
        this.f25759a = interfaceC6564a;
        this.f25760b = interfaceC6564a2;
        this.f25761c = interfaceC6564a3;
        this.f25762d = interfaceC6564a4;
    }

    /* JADX INFO: renamed from: a */
    public static C6682w m28771a(InterfaceC6564a<Executor> interfaceC6564a, InterfaceC6564a<InterfaceC7044d> interfaceC6564a2, InterfaceC6564a<InterfaceC6683x> interfaceC6564a3, InterfaceC6564a<InterfaceC7490b> interfaceC6564a4) {
        return new C6682w(interfaceC6564a, interfaceC6564a2, interfaceC6564a3, interfaceC6564a4);
    }

    /* JADX INFO: renamed from: c */
    public static C6681v m28772c(Executor executor, InterfaceC7044d interfaceC7044d, InterfaceC6683x interfaceC6683x, InterfaceC7490b interfaceC7490b) {
        return new C6681v(executor, interfaceC7044d, interfaceC6683x, interfaceC7490b);
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // ht.InterfaceC6564a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6681v get() {
        return m28772c(this.f25759a.get(), this.f25760b.get(), this.f25761c.get(), this.f25762d.get());
    }
}
