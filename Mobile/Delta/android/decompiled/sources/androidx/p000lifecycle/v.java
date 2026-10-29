package androidx.p000lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/l$b;", "current", "next", "", "a", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Landroidx/lifecycle/l$b;)V", "lifecycle-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class v {
    public static final void a(@Nullable s sVar, @NotNull l.b current, @NotNull l.b next) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == l.b.INITIALIZED && next == l.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + l.b.CREATED + "' to be moved to '" + next + "' in component " + sVar).toString());
        }
        l.b bVar = l.b.DESTROYED;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + sVar).toString());
    }
}
