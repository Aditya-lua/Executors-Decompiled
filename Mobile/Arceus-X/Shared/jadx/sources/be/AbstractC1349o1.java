package be;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p489vd.InterfaceC12158a;

/* JADX INFO: renamed from: be.o1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1349o1 {

    /* JADX INFO: renamed from: a */
    public final C1355q1 f5393a;

    /* JADX INFO: renamed from: b */
    public final IntentFilter f5394b;

    /* JADX INFO: renamed from: c */
    public final Context f5395c;

    /* JADX INFO: renamed from: d */
    public final Set f5396d = new HashSet();

    /* JADX INFO: renamed from: e */
    public C1346n1 f5397e = null;

    /* JADX INFO: renamed from: f */
    public volatile boolean f5398f = false;

    public AbstractC1349o1(C1355q1 c1355q1, IntentFilter intentFilter, Context context) {
        this.f5393a = c1355q1;
        this.f5394b = intentFilter;
        this.f5395c = C1345n0.m7192a(context);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo481a(Context context, Intent intent);

    /* JADX INFO: renamed from: b */
    public final synchronized void m7195b(InterfaceC12158a interfaceC12158a) {
        this.f5393a.m7210d("registerListener", new Object[0]);
        C1357r0.m7213a(interfaceC12158a, "Registered Play Core listener should not be null.");
        this.f5396d.add(interfaceC12158a);
        m7199f();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7196c(boolean z10) {
        this.f5398f = true;
        m7199f();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7197d(InterfaceC12158a interfaceC12158a) {
        this.f5393a.m7210d("unregisterListener", new Object[0]);
        C1357r0.m7213a(interfaceC12158a, "Unregistered Play Core listener should not be null.");
        this.f5396d.remove(interfaceC12158a);
        m7199f();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m7198e(Object obj) {
        Iterator it = new HashSet(this.f5396d).iterator();
        while (it.hasNext()) {
            ((InterfaceC12158a) it.next()).mo1207a(obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7199f() {
        C1346n1 c1346n1;
        if ((this.f5398f || !this.f5396d.isEmpty()) && this.f5397e == null) {
            C1346n1 c1346n2 = new C1346n1(this, null);
            this.f5397e = c1346n2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f5395c.registerReceiver(c1346n2, this.f5394b, 2);
            } else {
                this.f5395c.registerReceiver(c1346n2, this.f5394b);
            }
        }
        if (this.f5398f || !this.f5396d.isEmpty() || (c1346n1 = this.f5397e) == null) {
            return;
        }
        this.f5395c.unregisterReceiver(c1346n1);
        this.f5397e = null;
    }
}
