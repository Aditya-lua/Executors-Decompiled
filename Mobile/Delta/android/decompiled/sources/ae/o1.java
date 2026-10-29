package ae;

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
    public final q1 f354a;
    public final IntentFilter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f356d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n1 f357e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f358f = false;

    public o1(q1 q1Var, IntentFilter intentFilter, Context context) {
        this.f354a = q1Var;
        this.b = intentFilter;
        this.f355c = n0.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(ud.a aVar) {
        this.f354a.d("registerListener", new Object[0]);
        r0.a(aVar, "Registered Play Core listener should not be null.");
        this.f356d.add(aVar);
        f();
    }

    public final synchronized void c(boolean z10) {
        this.f358f = true;
        f();
    }

    public final synchronized void d(ud.a aVar) {
        this.f354a.d("unregisterListener", new Object[0]);
        r0.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f356d.remove(aVar);
        f();
    }

    public final synchronized void e(Object obj) {
        Iterator it = new HashSet(this.f356d).iterator();
        while (it.hasNext()) {
            ((ud.a) it.next()).a(obj);
        }
    }

    public final void f() {
        n1 n1Var;
        if ((this.f358f || !this.f356d.isEmpty()) && this.f357e == null) {
            n1 n1Var2 = new n1(this, null);
            this.f357e = n1Var2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f355c.registerReceiver(n1Var2, this.b, 2);
            } else {
                this.f355c.registerReceiver(n1Var2, this.b);
            }
        }
        if (this.f358f || !this.f356d.isEmpty() || (n1Var = this.f357e) == null) {
            return;
        }
        this.f355c.unregisterReceiver(n1Var);
        this.f357e = null;
    }
}
