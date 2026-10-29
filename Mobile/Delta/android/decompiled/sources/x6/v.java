package x6;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import ku.d2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lx6/v;", "Lx6/q;", "Landroidx/lifecycle/f;", "Lk6/s;", "imageLoader", "Lx6/g;", "initialRequest", "Lb7/d;", "target", "Landroidx/lifecycle/l;", "lifecycle", "Lku/d2;", "job", "<init>", "(Lk6/s;Lx6/g;Lb7/d;Landroidx/lifecycle/l;Lku/d2;)V", "", "f", "()V", "b", "start", "c", "(Lnt/b;)Ljava/lang/Object;", "d", "Landroidx/lifecycle/s;", "owner", "onDestroy", "(Landroidx/lifecycle/s;)V", "a", "Lk6/s;", "Lx6/g;", "Lb7/d;", "Landroidx/lifecycle/l;", "e", "Lku/d2;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements q, androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k6.s imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ImageRequest initialRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b7.d<?> target;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final androidx.p000lifecycle.l lifecycle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d2 job;

    public v(@NotNull k6.s sVar, @NotNull ImageRequest imageRequest, @NotNull b7.d<?> dVar, @Nullable androidx.p000lifecycle.l lVar, @NotNull d2 d2Var) {
        this.imageLoader = sVar;
        this.initialRequest = imageRequest;
        this.target = dVar;
        this.lifecycle = lVar;
        this.job = d2Var;
    }

    @Override // x6.q
    public void b() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        x.a(this.target.getView()).d(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // x6.q
    @Nullable
    public Object c(@NotNull nt.b<? super Unit> bVar) {
        Object objA;
        androidx.p000lifecycle.l lVar = this.lifecycle;
        return (lVar == null || (objA = e7.s.a(lVar, bVar)) != ot.c.e()) ? Unit.f22483a : objA;
    }

    public void d() {
        androidx.p000lifecycle.l lVar;
        d2.a.a(this.job, null, 1, null);
        b7.d<?> dVar = this.target;
        if ((dVar instanceof androidx.p000lifecycle.r) && (lVar = this.lifecycle) != null) {
            lVar.d((androidx.p000lifecycle.r) dVar);
        }
        androidx.p000lifecycle.l lVar2 = this.lifecycle;
        if (lVar2 != null) {
            lVar2.d(this);
        }
    }

    public final void f() {
        this.imageLoader.c(this.initialRequest);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull androidx.p000lifecycle.s owner) {
        x.a(this.target.getView()).a();
    }

    @Override // x6.q
    public void start() {
        androidx.p000lifecycle.l lVar;
        androidx.p000lifecycle.l lVar2 = this.lifecycle;
        if (lVar2 != null) {
            lVar2.a(this);
        }
        b7.d<?> dVar = this.target;
        if ((dVar instanceof androidx.p000lifecycle.r) && (lVar = this.lifecycle) != null) {
            e7.s.b(lVar, (androidx.p000lifecycle.r) dVar);
        }
        x.a(this.target.getView()).d(this);
    }
}
