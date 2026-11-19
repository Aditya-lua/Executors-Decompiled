package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class je implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ we f27500a;
    public final /* synthetic */ ve b;

    public je(ve veVar, we weVar) {
        this.f27500a = weVar;
        Objects.requireNonNull(veVar);
        this.b = veVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ve veVar = this.b;
        veVar.u0(this.f27500a);
        veVar.A0();
    }
}
