package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8 f25333a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa f25335d;

    public aa(qa qaVar, q8 q8Var, long j10, boolean z10) {
        this.f25333a = q8Var;
        this.b = j10;
        this.f25334c = z10;
        Objects.requireNonNull(qaVar);
        this.f25335d = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.f25335d;
        q8 q8Var = this.f25333a;
        qaVar.o(q8Var);
        qaVar.X(q8Var, this.b, false, this.f25334c);
    }
}
