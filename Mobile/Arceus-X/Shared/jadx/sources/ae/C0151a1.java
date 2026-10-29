package ae;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import be.AbstractC1349o1;
import be.C1355q1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: ae.a1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0151a1 extends AbstractC1349o1 {

    /* JADX INFO: renamed from: j */
    public static C0151a1 f519j;

    /* JADX INFO: renamed from: g */
    public final Handler f520g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0170j0 f521h;

    /* JADX INFO: renamed from: i */
    public final Set f522i;

    public C0151a1(Context context, InterfaceC0170j0 interfaceC0170j0) {
        super(new C1355q1("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f520g = new Handler(Looper.getMainLooper());
        this.f522i = new LinkedHashSet();
        this.f521h = interfaceC0170j0;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized C0151a1 m479h(Context context) {
        try {
            if (f519j == null) {
                f519j = new C0151a1(context, EnumC0186r0.INSTANCE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f519j;
    }

    @Override // be.AbstractC1349o1
    /* JADX INFO: renamed from: a */
    public final void mo481a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        AbstractC0159e abstractC0159eM503n = AbstractC0159e.m503n(bundleExtra);
        this.f5393a.m7207a("ListenerRegistryBroadcastReceiver.onReceive: %s", abstractC0159eM503n);
        InterfaceC0172k0 interfaceC0172k0Zza = this.f521h.zza();
        if (abstractC0159eM503n.mo511i() != 3 || interfaceC0172k0Zza == null) {
            m482j(abstractC0159eM503n);
        } else {
            interfaceC0172k0Zza.mo528a(abstractC0159eM503n.mo515m(), new C0200y0(this, abstractC0159eM503n, intent, context));
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m482j(AbstractC0159e abstractC0159e) {
        try {
            Iterator it = new LinkedHashSet(this.f522i).iterator();
            while (it.hasNext()) {
                ((InterfaceC0161f) it.next()).mo1207a(abstractC0159e);
            }
            super.m7198e(abstractC0159e);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
