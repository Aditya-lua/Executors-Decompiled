package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f25312a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y1 f25313c;

    public a(y1 y1Var, String str, long j10) {
        this.f25312a = str;
        this.b = j10;
        Objects.requireNonNull(y1Var);
        this.f25313c = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25313c.l(this.f25312a, this.b);
    }
}
