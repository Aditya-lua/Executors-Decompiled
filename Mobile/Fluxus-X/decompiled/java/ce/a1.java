package ce;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import de.o1;
import de.q1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends o1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static a1 f4953j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f4954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0 f4955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f4956i;

    public a1(Context context, j0 j0Var) {
        super(new q1("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f4954g = new Handler(Looper.getMainLooper());
        this.f4956i = new LinkedHashSet();
        this.f4955h = j0Var;
    }

    public static synchronized a1 h(Context context) {
        try {
            if (f4953j == null) {
                f4953j = new a1(context, r0.INSTANCE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4953j;
    }

    @Override // de.o1
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        e eVarN = e.n(bundleExtra);
        this.f12224a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", eVarN);
        k0 k0VarZza = this.f4955h.zza();
        if (eVarN.i() != 3 || k0VarZza == null) {
            j(eVarN);
        } else {
            k0VarZza.a(eVarN.m(), new y0(this, eVarN, intent, context));
        }
    }

    public final synchronized void j(e eVar) {
        try {
            Iterator it = new LinkedHashSet(this.f4956i).iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(eVar);
            }
            super.e(eVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
