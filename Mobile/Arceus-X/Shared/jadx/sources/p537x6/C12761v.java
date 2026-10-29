package p537x6;

import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0978r;
import androidx.p616lifecycle.InterfaceC0980s;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027b7.InterfaceC1252d;
import p096e7.C4873s;
import p239k6.InterfaceC7479s;
import p256ku.InterfaceC7850d2;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;

/* JADX INFO: renamed from: x6.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m31665d2 = {"Lx6/v;", "Lx6/q;", "Landroidx/lifecycle/f;", "Lk6/s;", "imageLoader", "Lx6/g;", "initialRequest", "Lb7/d;", "target", "Landroidx/lifecycle/l;", "lifecycle", "Lku/d2;", "job", "<init>", "(Lk6/s;Lx6/g;Lb7/d;Landroidx/lifecycle/l;Lku/d2;)V", "", "f", "()V", "b", "start", "c", "(Lnt/b;)Ljava/lang/Object;", "d", "Landroidx/lifecycle/s;", "owner", "onDestroy", "(Landroidx/lifecycle/s;)V", "a", "Lk6/s;", "Lx6/g;", "Lb7/d;", "Landroidx/lifecycle/l;", "e", "Lku/d2;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12761v implements InterfaceC12756q, InterfaceC0954f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7479s imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ImageRequest initialRequest;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC1252d<?> target;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final AbstractC0966l lifecycle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7850d2 job;

    public C12761v(@NotNull InterfaceC7479s interfaceC7479s, @NotNull ImageRequest imageRequest, @NotNull InterfaceC1252d<?> interfaceC1252d, @Nullable AbstractC0966l abstractC0966l, @NotNull InterfaceC7850d2 interfaceC7850d2) {
        this.imageLoader = interfaceC7479s;
        this.initialRequest = imageRequest;
        this.target = interfaceC1252d;
        this.lifecycle = abstractC0966l;
        this.job = interfaceC7850d2;
    }

    @Override // p537x6.InterfaceC12756q
    /* JADX INFO: renamed from: b */
    public void mo47619b() {
        if (this.target.getView().isAttachedToWindow()) {
            return;
        }
        C12763x.m47631a(this.target.getView()).m47630d(this);
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    @Override // p537x6.InterfaceC12756q
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo47603c(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM23482a;
        AbstractC0966l abstractC0966l = this.lifecycle;
        return (abstractC0966l == null || (objM23482a = C4873s.m23482a(abstractC0966l, interfaceC9557b)) != C10047c.m38805e()) ? Unit.f29331a : objM23482a;
    }

    /* JADX INFO: renamed from: d */
    public void m47625d() {
        AbstractC0966l abstractC0966l;
        InterfaceC7850d2.a.m32603a(this.job, null, 1, null);
        InterfaceC1252d<?> interfaceC1252d = this.target;
        if ((interfaceC1252d instanceof InterfaceC0978r) && (abstractC0966l = this.lifecycle) != null) {
            abstractC0966l.mo4938d((InterfaceC0978r) interfaceC1252d);
        }
        AbstractC0966l abstractC0966l2 = this.lifecycle;
        if (abstractC0966l2 != null) {
            abstractC0966l2.mo4938d(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m47626f() {
        this.imageLoader.mo31067c(this.initialRequest);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        C12763x.m47631a(this.target.getView()).m47627a();
    }

    @Override // p537x6.InterfaceC12756q
    public void start() {
        AbstractC0966l abstractC0966l;
        AbstractC0966l abstractC0966l2 = this.lifecycle;
        if (abstractC0966l2 != null) {
            abstractC0966l2.mo4935a(this);
        }
        InterfaceC1252d<?> interfaceC1252d = this.target;
        if ((interfaceC1252d instanceof InterfaceC0978r) && (abstractC0966l = this.lifecycle) != null) {
            C4873s.m23483b(abstractC0966l, (InterfaceC0978r) interfaceC1252d);
        }
        C12763x.m47631a(this.target.getView()).m47630d(this);
    }
}
