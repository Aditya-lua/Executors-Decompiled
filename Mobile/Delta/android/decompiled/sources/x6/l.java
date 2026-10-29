package x6;

import kotlin.Metadata;
import kotlin.Unit;
import ku.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lx6/l;", "Lx6/q;", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/l;", "lifecycle", "Lku/d2;", "job", "<init>", "(Landroidx/lifecycle/l;Lku/d2;)V", "", "start", "()V", "c", "(Lnt/b;)Ljava/lang/Object;", "e", "d", "Landroidx/lifecycle/s;", "owner", "onDestroy", "(Landroidx/lifecycle/s;)V", "a", "Landroidx/lifecycle/l;", "b", "Lku/d2;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements q, androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l lifecycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d2 job;

    public l(@NotNull androidx.p000lifecycle.l lVar, @NotNull d2 d2Var) {
        this.lifecycle = lVar;
        this.job = d2Var;
    }

    @Override // x6.q
    @Nullable
    public Object c(@NotNull nt.b<? super Unit> bVar) throws Throwable {
        Object objA = e7.s.a(this.lifecycle, bVar);
        return objA == ot.c.e() ? objA : Unit.f22483a;
    }

    public void d() {
        d2.a.a(this.job, null, 1, null);
    }

    @Override // x6.q
    public void e() {
        this.lifecycle.d(this);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull androidx.p000lifecycle.s owner) {
        d();
    }

    @Override // x6.q
    public void start() {
        this.lifecycle.a(this);
    }
}
