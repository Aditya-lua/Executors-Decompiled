package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ob f27626a;

    public nb(ob obVar) {
        Objects.requireNonNull(obVar);
        this.f27626a = obVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27626a.E(null);
    }
}
