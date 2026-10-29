package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rd extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd f25934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(sd sdVar, l8 l8Var) {
        super(l8Var);
        Objects.requireNonNull(sdVar);
        this.f25934e = sdVar;
    }

    @Override // nb.w
    public final void a() {
        sd sdVar = this.f25934e;
        sdVar.n();
        sdVar.f25625a.a().w().a("Starting upload from DelayedRunnable");
        sdVar.b.r();
    }
}
