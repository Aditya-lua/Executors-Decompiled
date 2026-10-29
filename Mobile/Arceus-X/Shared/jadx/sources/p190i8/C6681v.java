package p190i8;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p028b8.AbstractC1267o;
import p212j8.InterfaceC7044d;
import p241k8.InterfaceC7490b;

/* JADX INFO: renamed from: i8.v */
/* JADX INFO: loaded from: classes.dex */
public class C6681v {

    /* JADX INFO: renamed from: a */
    public final Executor f25755a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7044d f25756b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6683x f25757c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7490b f25758d;

    public C6681v(Executor executor, InterfaceC7044d interfaceC7044d, InterfaceC6683x interfaceC6683x, InterfaceC7490b interfaceC7490b) {
        this.f25755a = executor;
        this.f25756b = interfaceC7044d;
        this.f25757c = interfaceC6683x;
        this.f25758d = interfaceC7490b;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m28768a(C6681v c6681v) {
        Iterator<AbstractC1267o> it = c6681v.f25756b.mo29756g0().iterator();
        while (it.hasNext()) {
            c6681v.f25757c.mo28737b(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void m28770c() {
        this.f25755a.execute(new Runnable() { // from class: i8.t
            @Override // java.lang.Runnable
            public final void run() {
                C6681v c6681v = this.f25753a;
                c6681v.f25758d.mo29819b(new InterfaceC7490b.a() { // from class: i8.u
                    @Override // p241k8.InterfaceC7490b.a
                    public final Object execute() {
                        return C6681v.m28768a(c6681v);
                    }
                });
            }
        });
    }
}
