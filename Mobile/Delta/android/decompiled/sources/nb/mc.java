package nb;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class mc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f25751a;
    public final /* synthetic */ nc b;

    public mc(nc ncVar, ConnectionResult connectionResult) {
        this.f25751a = connectionResult;
        Objects.requireNonNull(ncVar);
        this.b = ncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tc tcVar = this.b.f25801c;
        tcVar.O(null);
        if (this.f25751a.w3() != 7777) {
            tcVar.L();
            return;
        }
        if (tcVar.P() == null) {
            tcVar.Q(Executors.newScheduledThreadPool(1));
        }
        tcVar.P().schedule(new Runnable() { // from class: nb.kc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final tc tcVar2 = this.f25703a.b.f25801c;
                tcVar2.f25625a.b().t(new Runnable() { // from class: nb.lc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        tcVar2.w();
                    }
                });
            }
        }, ((Long) z4.f26150a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
