package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ va f27490a;

    public j9(va vaVar) {
        Objects.requireNonNull(vaVar);
        this.f27490a = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27490a.f27889r.a();
    }
}
