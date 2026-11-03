package nb;

import android.content.ComponentName;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ComponentName f26384a;
    public final /* synthetic */ nc b;

    public gc(nc ncVar, ComponentName componentName) {
        this.f26384a = componentName;
        Objects.requireNonNull(ncVar);
        this.b = ncVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f26622c.K(this.f26384a);
    }
}
