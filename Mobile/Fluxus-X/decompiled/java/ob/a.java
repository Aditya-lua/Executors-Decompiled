package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27061a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2 f27062c;

    public a(d2 d2Var, String str, long j10) {
        this.f27061a = str;
        this.b = j10;
        Objects.requireNonNull(d2Var);
        this.f27062c = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27062c.l(this.f27061a, this.b);
    }
}
