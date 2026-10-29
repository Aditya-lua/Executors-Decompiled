package p306nb;

import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: nb.mc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9195mc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ConnectionResult f33213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ServiceConnectionC9211nc f33214b;

    public RunnableC9195mc(ServiceConnectionC9211nc serviceConnectionC9211nc, ConnectionResult connectionResult) {
        this.f33213a = connectionResult;
        Objects.requireNonNull(serviceConnectionC9211nc);
        this.f33214b = serviceConnectionC9211nc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9307tc c9307tc = this.f33214b.f33281c;
        c9307tc.m36874O(null);
        if (this.f33213a.m9140w3() != 7777) {
            c9307tc.m36871L();
            return;
        }
        if (c9307tc.m36875P() == null) {
            c9307tc.m36876Q(Executors.newScheduledThreadPool(1));
        }
        c9307tc.m36875P().schedule(new Runnable() { // from class: nb.kc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final C9307tc c9307tc2 = this.f33154a.f33214b.f33281c;
                c9307tc2.f33067a.mo36322b().m36263t(new Runnable() { // from class: nb.lc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        c9307tc2.m36905w();
                    }
                });
            }
        }, ((Long) C9395z4.f33758a0.m37079b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
