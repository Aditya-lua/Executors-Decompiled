package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8 f26221a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa f26223d;

    public z9(qa qaVar, q8 q8Var, long j10, boolean z10) {
        this.f26221a = q8Var;
        this.b = j10;
        this.f26222c = z10;
        Objects.requireNonNull(qaVar);
        this.f26223d = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.f26223d;
        q8 q8Var = this.f26221a;
        qaVar.o(q8Var);
        qaVar.X(q8Var, this.b, true, this.f26222c);
    }
}
