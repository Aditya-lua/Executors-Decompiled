package ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zf;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nf extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7 f27630a;

    public nf(l7 l7Var) {
        this.f27630a = l7Var;
    }

    public final /* synthetic */ void a() {
        this.f27630a.N().o(((Long) e5.D.b(null)).longValue());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f27630a.a().r().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f27630a.a().r().a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                l7 l7Var = this.f27630a;
                l7Var.a().w().a("[sgtm] App Receiver notified batches are available");
                l7Var.b().t(new Runnable() { // from class: ob.kf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f27525a.a();
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final l7 l7Var2 = this.f27630a;
            zf.a();
            if (l7Var2.w().H(null, e5.R0)) {
                l7Var2.a().w().a("App receiver notified triggers are available");
                l7Var2.b().t(new Runnable() { // from class: ob.lf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        l7 l7Var3 = l7Var2;
                        if (!l7Var3.C().G()) {
                            l7Var3.a().r().a("registerTrigger called but app not eligible");
                            return;
                        }
                        l7Var3.B().t0();
                        final va vaVarB = l7Var3.B();
                        Objects.requireNonNull(vaVarB);
                        new Thread(new Runnable() { // from class: ob.mf
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                vaVarB.u0();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        this.f27630a.a().r().a("App receiver called with unknown action");
    }
}
