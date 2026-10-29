package p163h8;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p028b8.AbstractC1261i;
import p028b8.AbstractC1267o;
import p028b8.C1272t;
import p044c8.InterfaceC1559e;
import p044c8.InterfaceC1567m;
import p190i8.InterfaceC6683x;
import p212j8.InterfaceC7044d;
import p241k8.InterfaceC7490b;
import p569y7.InterfaceC13123j;

/* JADX INFO: renamed from: h8.c */
/* JADX INFO: loaded from: classes.dex */
public class C6317c implements InterfaceC6319e {

    /* JADX INFO: renamed from: f */
    public static final Logger f24038f = Logger.getLogger(C1272t.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC6683x f24039a;

    /* JADX INFO: renamed from: b */
    public final Executor f24040b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1559e f24041c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7044d f24042d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7490b f24043e;

    public C6317c(Executor executor, InterfaceC1559e interfaceC1559e, InterfaceC6683x interfaceC6683x, InterfaceC7044d interfaceC7044d, InterfaceC7490b interfaceC7490b) {
        this.f24040b = executor;
        this.f24041c = interfaceC1559e;
        this.f24039a = interfaceC6683x;
        this.f24042d = interfaceC7044d;
        this.f24043e = interfaceC7490b;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m27622b(C6317c c6317c, AbstractC1267o abstractC1267o, AbstractC1261i abstractC1261i) {
        c6317c.f24042d.mo29754U0(abstractC1267o, abstractC1261i);
        c6317c.f24039a.mo28737b(abstractC1267o, 1);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m27623c(final C6317c c6317c, final AbstractC1267o abstractC1267o, InterfaceC13123j interfaceC13123j, AbstractC1261i abstractC1261i) {
        c6317c.getClass();
        try {
            InterfaceC1567m interfaceC1567mMo8159a = c6317c.f24041c.mo8159a(abstractC1267o.mo7007b());
            if (interfaceC1567mMo8159a == null) {
                String str = String.format("Transport backend '%s' is not registered", abstractC1267o.mo7007b());
                f24038f.warning(str);
                interfaceC13123j.mo7044a(new IllegalArgumentException(str));
            } else {
                final AbstractC1261i abstractC1261iMo8177a = interfaceC1567mMo8159a.mo8177a(abstractC1261i);
                c6317c.f24043e.mo29819b(new InterfaceC7490b.a() { // from class: h8.b
                    @Override // p241k8.InterfaceC7490b.a
                    public final Object execute() {
                        return C6317c.m27622b(this.f24035a, abstractC1267o, abstractC1261iMo8177a);
                    }
                });
                interfaceC13123j.mo7044a(null);
            }
        } catch (Exception e10) {
            f24038f.warning("Error scheduling event " + e10.getMessage());
            interfaceC13123j.mo7044a(e10);
        }
    }

    @Override // p163h8.InterfaceC6319e
    /* JADX INFO: renamed from: a */
    public void mo27624a(final AbstractC1267o abstractC1267o, final AbstractC1261i abstractC1261i, final InterfaceC13123j interfaceC13123j) {
        this.f24040b.execute(new Runnable() { // from class: h8.a
            @Override // java.lang.Runnable
            public final void run() {
                C6317c.m27623c(this.f24031a, abstractC1267o, interfaceC13123j, abstractC1261i);
            }
        });
    }
}
