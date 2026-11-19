package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i5 f27520a;
    public final /* synthetic */ sc b;

    public kc(sc scVar, i5 i5Var) {
        this.f27520a = i5Var;
        Objects.requireNonNull(scVar);
        this.b = scVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc scVar = this.b;
        synchronized (scVar) {
            try {
                scVar.d(false);
                yc ycVar = scVar.f27802c;
                if (!ycVar.W()) {
                    ycVar.f27641a.a().w().a("Connected to service");
                    ycVar.z(this.f27520a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
