package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ic implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d5 f26431a;
    public final /* synthetic */ nc b;

    public ic(nc ncVar, d5 d5Var) {
        this.f26431a = d5Var;
        Objects.requireNonNull(ncVar);
        this.b = ncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nc ncVar = this.b;
        synchronized (ncVar) {
            try {
                ncVar.d(false);
                tc tcVar = ncVar.f26622c;
                if (!tcVar.W()) {
                    tcVar.f26446a.a().v().a("Connected to remote service");
                    tcVar.z(this.f26431a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        tc tcVar2 = this.b.f26622c;
        if (tcVar2.P() != null) {
            tcVar2.P().shutdownNow();
            tcVar2.Q(null);
        }
    }
}
