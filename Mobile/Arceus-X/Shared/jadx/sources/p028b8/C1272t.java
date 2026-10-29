package p028b8;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p163h8.InterfaceC6319e;
import p190i8.C6677r;
import p190i8.C6681v;
import p267l8.InterfaceC8011a;
import p569y7.C13116c;
import p569y7.InterfaceC13122i;
import p569y7.InterfaceC13123j;

/* JADX INFO: renamed from: b8.t */
/* JADX INFO: loaded from: classes.dex */
public class C1272t implements InterfaceC1271s {

    /* JADX INFO: renamed from: e */
    public static volatile AbstractC1273u f5291e;

    /* JADX INFO: renamed from: a */
    public final InterfaceC8011a f5292a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8011a f5293b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6319e f5294c;

    /* JADX INFO: renamed from: d */
    public final C6677r f5295d;

    public C1272t(InterfaceC8011a interfaceC8011a, InterfaceC8011a interfaceC8011a2, InterfaceC6319e interfaceC6319e, C6677r c6677r, C6681v c6681v) {
        this.f5292a = interfaceC8011a;
        this.f5293b = interfaceC8011a2;
        this.f5294c = interfaceC6319e;
        this.f5295d = c6677r;
        c6681v.m28770c();
    }

    /* JADX INFO: renamed from: c */
    public static C1272t m7049c() {
        AbstractC1273u abstractC1273u = f5291e;
        if (abstractC1273u != null) {
            return abstractC1273u.mo7016b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX INFO: renamed from: d */
    public static Set<C13116c> m7050d(InterfaceC1258f interfaceC1258f) {
        return interfaceC1258f instanceof InterfaceC1259g ? Collections.unmodifiableSet(((InterfaceC1259g) interfaceC1258f).mo7019a()) : Collections.singleton(C13116c.m48729b("proto"));
    }

    /* JADX INFO: renamed from: f */
    public static void m7051f(Context context) {
        if (f5291e == null) {
            synchronized (C1272t.class) {
                try {
                    if (f5291e == null) {
                        f5291e = C1257e.m7014c().setApplicationContext(context).build();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p028b8.InterfaceC1271s
    /* JADX INFO: renamed from: a */
    public void mo7048a(AbstractC1266n abstractC1266n, InterfaceC13123j interfaceC13123j) {
        this.f5294c.mo27624a(abstractC1266n.mo6999f().m7042f(abstractC1266n.mo6997c().mo48726c()), m7052b(abstractC1266n), interfaceC13123j);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1261i m7052b(AbstractC1266n abstractC1266n) {
        return AbstractC1261i.m7022a().mo6993i(this.f5292a.mo33091a()).mo6995k(this.f5293b.mo33091a()).mo6994j(abstractC1266n.mo7000g()).mo6992h(new C1260h(abstractC1266n.mo6996b(), abstractC1266n.m7039d())).mo6991g(abstractC1266n.mo6997c().mo48724a()).mo6988d();
    }

    /* JADX INFO: renamed from: e */
    public C6677r m7053e() {
        return this.f5295d;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC13122i m7054g(InterfaceC1258f interfaceC1258f) {
        return new C1268p(m7050d(interfaceC1258f), AbstractC1267o.m7040a().mo7011b(interfaceC1258f.getName()).mo7012c(interfaceC1258f.getExtras()).mo7010a(), this);
    }
}
