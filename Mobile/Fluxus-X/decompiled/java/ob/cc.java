package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class cc extends z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yc f27169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc(yc ycVar, q8 q8Var) {
        super(q8Var);
        Objects.requireNonNull(ycVar);
        this.f27169e = ycVar;
    }

    @Override // ob.z
    public final void a() {
        this.f27169e.f27641a.a().r().a("Tasks have been queued for a long time");
    }
}
