package be;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f4026a;
    public final IntentFilter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f4028d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n1 f4029e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f4030f = false;

    public o1(q1 q1Var, IntentFilter intentFilter, Context context) {
        this.f4026a = q1Var;
        this.b = intentFilter;
        this.f4027c = n0.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(vd.a aVar) {
        this.f4026a.d("registerListener", new Object[0]);
        r0.a(aVar, "Registered Play Core listener should not be null.");
        this.f4028d.add(aVar);
        f();
    }

    public final synchronized void c(boolean z10) {
        this.f4030f = true;
        f();
    }

    public final synchronized void d(vd.a aVar) {
        this.f4026a.d("unregisterListener", new Object[0]);
        r0.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f4028d.remove(aVar);
        f();
    }

    public final synchronized void e(Object obj) {
        Iterator it = new HashSet(this.f4028d).iterator();
        while (it.hasNext()) {
            ((vd.a) it.next()).a(obj);
        }
    }

    public final void f() {
        n1 n1Var;
        if ((this.f4030f || !this.f4028d.isEmpty()) && this.f4029e == null) {
            n1 n1Var2 = new n1(this, null);
            this.f4029e = n1Var2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f4027c.registerReceiver(n1Var2, this.b, 2);
            } else {
                this.f4027c.registerReceiver(n1Var2, this.b);
            }
        }
        if (this.f4030f || !this.f4028d.isEmpty() || (n1Var = this.f4029e) == null) {
            return;
        }
        this.f4027c.unregisterReceiver(n1Var);
        this.f4029e = null;
    }
}
