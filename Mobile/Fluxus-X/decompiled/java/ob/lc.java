package ob;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class lc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentName f27566a;
    public final /* synthetic */ sc b;

    public lc(sc scVar, ComponentName componentName) {
        this.f27566a = componentName;
        Objects.requireNonNull(scVar);
        this.b = scVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f27802c.K(this.f27566a);
    }
}
