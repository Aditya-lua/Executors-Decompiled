package p268l9;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import bb.HandlerC1302j;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;
import p213j9.C7089c;
import p348p1.C10146t;

/* JADX INFO: renamed from: l9.t1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC8077t1 extends C8042i implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: b */
    public volatile boolean f30096b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f30097c;

    /* JADX INFO: renamed from: d */
    public final Handler f30098d;

    /* JADX INFO: renamed from: e */
    public final C7089c f30099e;

    public AbstractDialogInterfaceOnCancelListenerC8077t1(InterfaceC8045j interfaceC8045j, C7089c c7089c) {
        super(interfaceC8045j);
        this.f30097c = new AtomicReference(null);
        this.f30098d = new HandlerC1302j(Looper.getMainLooper());
        this.f30099e = c7089c;
    }

    /* JADX INFO: renamed from: p */
    public static final int m33274p(C8068q1 c8068q1) {
        if (c8068q1 == null) {
            return -1;
        }
        return c8068q1.m33270a();
    }

    @Override // p268l9.C8042i
    /* JADX INFO: renamed from: e */
    public final void mo33179e(int i10, int i11, Intent intent) {
        C8068q1 c8068q1 = (C8068q1) this.f30097c.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iMo29854g = this.f30099e.mo29854g(m33178b());
                if (iMo29854g == 0) {
                    m33278o();
                    return;
                } else {
                    if (c8068q1 == null) {
                        return;
                    }
                    if (c8068q1.m33271b().m9140w3() == 18 && iMo29854g == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            m33278o();
            return;
        } else if (i11 == 0) {
            if (c8068q1 != null) {
                m33277l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c8068q1.m33271b().toString()), m33274p(c8068q1));
                return;
            }
            return;
        }
        if (c8068q1 != null) {
            m33277l(c8068q1.m33271b(), c8068q1.m33270a());
        }
    }

    @Override // p268l9.C8042i
    /* JADX INFO: renamed from: f */
    public final void mo33180f(Bundle bundle) {
        super.mo33180f(bundle);
        if (bundle != null) {
            this.f30097c.set(bundle.getBoolean("resolving_error", false) ? new C8068q1(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // p268l9.C8042i
    /* JADX INFO: renamed from: i */
    public final void mo33182i(Bundle bundle) {
        super.mo33182i(bundle);
        C8068q1 c8068q1 = (C8068q1) this.f30097c.get();
        if (c8068q1 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c8068q1.m33270a());
        bundle.putInt("failed_status", c8068q1.m33271b().m9140w3());
        bundle.putParcelable("failed_resolution", c8068q1.m33271b().m9142y3());
    }

    @Override // p268l9.C8042i
    /* JADX INFO: renamed from: j */
    public void mo33105j() {
        super.mo33105j();
        this.f30096b = true;
    }

    @Override // p268l9.C8042i
    /* JADX INFO: renamed from: k */
    public void mo33106k() {
        super.mo33106k();
        this.f30096b = false;
    }

    /* JADX INFO: renamed from: l */
    public final void m33277l(ConnectionResult connectionResult, int i10) {
        this.f30097c.set(null);
        mo33107m(connectionResult, i10);
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo33107m(ConnectionResult connectionResult, int i10);

    /* JADX INFO: renamed from: n */
    public abstract void mo33108n();

    /* JADX INFO: renamed from: o */
    public final void m33278o() {
        this.f30097c.set(null);
        mo33108n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        m33277l(new ConnectionResult(13, null), m33274p((C8068q1) this.f30097c.get()));
    }

    /* JADX INFO: renamed from: s */
    public final void m33279s(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        C8068q1 c8068q1 = new C8068q1(connectionResult, i10);
        do {
            atomicReference = this.f30097c;
            if (C10146t.m39085a(atomicReference, null, c8068q1)) {
                this.f30098d.post(new RunnableC8074s1(this, c8068q1));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
