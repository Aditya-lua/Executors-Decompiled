package de;

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
    public final q1 f12224a;
    public final IntentFilter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f12226d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n1 f12227e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f12228f = false;

    public o1(q1 q1Var, IntentFilter intentFilter, Context context) {
        this.f12224a = q1Var;
        this.b = intentFilter;
        this.f12225c = n0.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(xd.a aVar) {
        this.f12224a.d("registerListener", new Object[0]);
        r0.a(aVar, "Registered Play Core listener should not be null.");
        this.f12226d.add(aVar);
        f();
    }

    public final synchronized void c(boolean z10) {
        this.f12228f = true;
        f();
    }

    public final synchronized void d(xd.a aVar) {
        this.f12224a.d("unregisterListener", new Object[0]);
        r0.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f12226d.remove(aVar);
        f();
    }

    public final synchronized void e(Object obj) {
        Iterator it = new HashSet(this.f12226d).iterator();
        while (it.hasNext()) {
            ((xd.a) it.next()).a(obj);
        }
    }

    public final void f() {
        n1 n1Var;
        if ((this.f12228f || !this.f12226d.isEmpty()) && this.f12227e == null) {
            n1 n1Var2 = new n1(this, null);
            this.f12227e = n1Var2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f12225c.registerReceiver(n1Var2, this.b, 2);
            } else {
                this.f12225c.registerReceiver(n1Var2, this.b);
            }
        }
        if (this.f12228f || !this.f12226d.isEmpty() || (n1Var = this.f12227e) == null) {
            return;
        }
        this.f12225c.unregisterReceiver(n1Var);
        this.f12227e = null;
    }
}
