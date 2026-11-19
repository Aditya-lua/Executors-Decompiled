package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xd extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd f27973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(yd ydVar, q8 q8Var) {
        super(q8Var);
        Objects.requireNonNull(ydVar);
        this.f27973e = ydVar;
    }

    @Override // ob.z
    public final void a() {
        yd ydVar = this.f27973e;
        ydVar.n();
        ydVar.f27641a.a().w().a("Starting upload from DelayedRunnable");
        ydVar.b.r();
    }
}
