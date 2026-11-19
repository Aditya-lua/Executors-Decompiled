package ob;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k9.b f27767a;
    public final /* synthetic */ sc b;

    public rc(sc scVar, k9.b bVar) {
        this.f27767a = bVar;
        Objects.requireNonNull(scVar);
        this.b = scVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc ycVar = this.b.f27802c;
        ycVar.O(null);
        if (this.f27767a.B3() != 7777) {
            ycVar.L();
            return;
        }
        if (ycVar.P() == null) {
            ycVar.Q(Executors.newScheduledThreadPool(1));
        }
        ycVar.P().schedule(new Runnable() { // from class: ob.pc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final yc ycVar2 = this.f27718a.b.f27802c;
                ycVar2.f27641a.b().t(new Runnable() { // from class: ob.qc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        ycVar2.w();
                    }
                });
            }
        }, ((Long) e5.f27225a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
