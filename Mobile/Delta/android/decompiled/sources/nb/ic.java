package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ic implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d5 f25610a;
    public final /* synthetic */ nc b;

    public ic(nc ncVar, d5 d5Var) {
        this.f25610a = d5Var;
        Objects.requireNonNull(ncVar);
        this.b = ncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nc ncVar = this.b;
        synchronized (ncVar) {
            try {
                ncVar.d(false);
                tc tcVar = ncVar.f25801c;
                if (!tcVar.W()) {
                    tcVar.f25625a.a().v().a("Connected to remote service");
                    tcVar.z(this.f25610a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        tc tcVar2 = this.b.f25801c;
        if (tcVar2.P() != null) {
            tcVar2.P().shutdownNow();
            tcVar2.Q(null);
        }
    }
}
