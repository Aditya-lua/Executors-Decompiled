package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ca implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f27167a;
    public final /* synthetic */ va b;

    public ca(va vaVar, Boolean bool) {
        this.f27167a = bool;
        Objects.requireNonNull(vaVar);
        this.b = vaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.W(this.f27167a, true);
    }
}
