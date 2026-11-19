package y5;

import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ly5/b0;", "Ly5/a0;", "Landroidx/lifecycle/a0;", "Ly5/a0$b;", "state", "Lpe/x;", "Ly5/a0$b$c;", "future", "<init>", "(Landroidx/lifecycle/a0;Lpe/x;)V", "c", "Landroidx/lifecycle/a0;", "d", "Lpe/x;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.a0<a0.b> state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pe.x<a0.b.c> future;

    public b0(@NotNull androidx.p000lifecycle.a0<a0.b> state, @NotNull pe.x<a0.b.c> future) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(future, "future");
        this.state = state;
        this.future = future;
    }
}
