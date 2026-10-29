package zd;

import ae.o1;
import ae.q1;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends o1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static a1 f37450j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f37451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f37452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f37453i;

    public a1(Context context, j0 j0Var) {
        super(new q1("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f37451g = new Handler(Looper.getMainLooper());
        this.f37453i = new LinkedHashSet();
        this.f37452h = j0Var;
    }

    public static synchronized a1 h(Context context) {
        try {
            if (f37450j == null) {
                f37450j = new a1(context, r0.INSTANCE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f37450j;
    }

    @Override // ae.o1
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        e eVarN = e.n(bundleExtra);
        this.f354a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", eVarN);
        k0 k0VarZza = this.f37452h.zza();
        if (eVarN.i() != 3 || k0VarZza == null) {
            j(eVarN);
        } else {
            k0VarZza.a(eVarN.m(), new y0(this, eVarN, intent, context));
        }
    }

    public final synchronized void j(e eVar) {
        try {
            Iterator it = new LinkedHashSet(this.f37453i).iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(eVar);
            }
            super.e(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
