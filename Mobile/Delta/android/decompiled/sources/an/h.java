package an;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "me", "you", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "wf1-core-common"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class h {
    public static final boolean a(@NotNull Object me2, @NotNull Object you) {
        Intrinsics.checkNotNullParameter(me2, "me");
        Intrinsics.checkNotNullParameter(you, "you");
        if (!Intrinsics.c(kotlin.jvm.internal.d0.b(me2.getClass()), kotlin.jvm.internal.d0.b(you.getClass()))) {
            return false;
        }
        if (me2 instanceof g) {
            return Intrinsics.c(((g) me2).getCompatibilityKey(), ((g) you).getCompatibilityKey());
        }
        return true;
    }
}
