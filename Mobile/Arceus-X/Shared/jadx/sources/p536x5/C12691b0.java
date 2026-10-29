package p536x5;

import androidx.p616lifecycle.AbstractC0940a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ne.InterfaceFutureC9440x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: x5.b0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lx5/b0;", "Lx5/a0;", "Landroidx/lifecycle/a0;", "Lx5/a0$b;", "state", "Lne/x;", "Lx5/a0$b$c;", "future", "<init>", "(Landroidx/lifecycle/a0;Lne/x;)V", "c", "Landroidx/lifecycle/a0;", "d", "Lne/x;", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12691b0 implements InterfaceC12689a0 {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AbstractC0940a0<InterfaceC12689a0.b> state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceFutureC9440x<InterfaceC12689a0.b.c> future;

    public C12691b0(@NotNull AbstractC0940a0<InterfaceC12689a0.b> state, @NotNull InterfaceFutureC9440x<InterfaceC12689a0.b.c> future) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(future, "future");
        this.state = state;
        this.future = future;
    }
}
