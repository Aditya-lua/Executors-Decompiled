package androidx.p616lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/l$b;", "current", "next", "", "a", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Landroidx/lifecycle/l$b;)V", "lifecycle-runtime"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0986v {
    /* JADX INFO: renamed from: a */
    public static final void m5001a(@Nullable InterfaceC0980s interfaceC0980s, @NotNull AbstractC0966l.b current, @NotNull AbstractC0966l.b next) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == AbstractC0966l.b.INITIALIZED && next == AbstractC0966l.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least '" + AbstractC0966l.b.CREATED + "' to be moved to '" + next + "' in component " + interfaceC0980s).toString());
        }
        AbstractC0966l.b bVar = AbstractC0966l.b.DESTROYED;
        if (current != bVar || current == next) {
            return;
        }
        throw new IllegalStateException(("State is '" + bVar + "' and cannot be moved to `" + next + "` in component " + interfaceC0980s).toString());
    }
}
