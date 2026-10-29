package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d5 f25519a;
    public final /* synthetic */ nc b;

    public fc(nc ncVar, d5 d5Var) {
        this.f25519a = d5Var;
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
                    tcVar.f25625a.a().w().a("Connected to service");
                    tcVar.z(this.f25519a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
