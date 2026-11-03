package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class aa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8 f26154a;
    public final /* synthetic */ long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa f26156d;

    public aa(qa qaVar, q8 q8Var, long j10, boolean z10) {
        this.f26154a = q8Var;
        this.b = j10;
        this.f26155c = z10;
        Objects.requireNonNull(qaVar);
        this.f26156d = qaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qa qaVar = this.f26156d;
        q8 q8Var = this.f26154a;
        qaVar.o(q8Var);
        qaVar.X(q8Var, this.b, false, this.f26155c);
    }
}
