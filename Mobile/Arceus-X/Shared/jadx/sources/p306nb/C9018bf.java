package p306nb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C2361vf;
import java.util.Objects;

/* JADX INFO: renamed from: nb.bf */
/* JADX INFO: loaded from: classes.dex */
public final class C9018bf extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final C9094g7 f32738a;

    public C9018bf(C9094g7 c9094g7) {
        this.f32738a = c9094g7;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m36151a() {
        this.f32738a.m36319N().m37063o(((Long) C9395z4.f33711D.m37079b(null)).longValue());
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f32738a.mo36321a().m37006r().m36911a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f32738a.mo36321a().m37006r().m36911a("App receiver called with null action");
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode != -1928239649) {
            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                C9094g7 c9094g7 = this.f32738a;
                c9094g7.mo36321a().m37011w().m36911a("[sgtm] App Receiver notified batches are available");
                c9094g7.mo36322b().m36263t(new Runnable() { // from class: nb.ye
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f33698a.m36151a();
                    }
                });
                return;
            }
        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            final C9094g7 c9094g8 = this.f32738a;
            C2361vf.m10862a();
            if (c9094g8.m36338w().m36406H(null, C9395z4.f33740R0)) {
                c9094g8.mo36321a().m37011w().m36911a("App receiver notified triggers are available");
                c9094g8.mo36322b().m36263t(new Runnable() { // from class: nb.ze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C9094g7 c9094g9 = c9094g8;
                        if (!c9094g9.m36308C().m36940G()) {
                            c9094g9.mo36321a().m37006r().m36911a("registerTrigger called but app not eligible");
                            return;
                        }
                        c9094g9.m36307B().m36713t0();
                        final C9257qa c9257qaM36307B = c9094g9.m36307B();
                        Objects.requireNonNull(c9257qaM36307B);
                        new Thread(new Runnable() { // from class: nb.af
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                c9257qaM36307B.m36715u0();
                            }
                        }).start();
                    }
                });
                return;
            }
            return;
        }
        this.f32738a.mo36321a().m37006r().m36911a("App receiver called with unknown action");
    }
}
