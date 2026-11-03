package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26133a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f26134c;

    public a(y1 y1Var, String str, long j10) {
        this.f26133a = str;
        this.b = j10;
        Objects.requireNonNull(y1Var);
        this.f26134c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26134c.l(this.f26133a, this.b);
    }
}
