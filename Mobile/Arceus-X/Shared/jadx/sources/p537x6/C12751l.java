package p537x6;

import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4873s;
import p256ku.InterfaceC7850d2;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;

/* JADX INFO: renamed from: x6.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lx6/l;", "Lx6/q;", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/l;", "lifecycle", "Lku/d2;", "job", "<init>", "(Landroidx/lifecycle/l;Lku/d2;)V", "", "start", "()V", "c", "(Lnt/b;)Ljava/lang/Object;", "e", "d", "Landroidx/lifecycle/s;", "owner", "onDestroy", "(Landroidx/lifecycle/s;)V", "a", "Landroidx/lifecycle/l;", "b", "Lku/d2;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12751l implements InterfaceC12756q, InterfaceC0954f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC0966l lifecycle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7850d2 job;

    public C12751l(@NotNull AbstractC0966l abstractC0966l, @NotNull InterfaceC7850d2 interfaceC7850d2) {
        this.lifecycle = abstractC0966l;
        this.job = interfaceC7850d2;
    }

    @Override // p537x6.InterfaceC12756q
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo47603c(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        Object objM23482a = C4873s.m23482a(this.lifecycle, interfaceC9557b);
        return objM23482a == C10047c.m38805e() ? objM23482a : Unit.f29331a;
    }

    /* JADX INFO: renamed from: d */
    public void m47604d() {
        InterfaceC7850d2.a.m32603a(this.job, null, 1, null);
    }

    @Override // p537x6.InterfaceC12756q
    /* JADX INFO: renamed from: e */
    public void mo47605e() {
        this.lifecycle.mo4938d(this);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        m47604d();
    }

    @Override // p537x6.InterfaceC12756q
    public void start() {
        this.lifecycle.mo4935a(this);
    }
}
