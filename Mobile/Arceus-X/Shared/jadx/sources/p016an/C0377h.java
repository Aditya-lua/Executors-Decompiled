package p016an;

import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: an.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"", "me", "you", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "wf1-core-common"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0377h {
    /* JADX INFO: renamed from: a */
    public static final boolean m1429a(@NotNull Object me2, @NotNull Object you) {
        Intrinsics.checkNotNullParameter(me2, "me");
        Intrinsics.checkNotNullParameter(you, "you");
        if (!Intrinsics.m31980c(C7731d0.m32002b(me2.getClass()), C7731d0.m32002b(you.getClass()))) {
            return false;
        }
        if (me2 instanceof InterfaceC0375g) {
            return Intrinsics.m31980c(((InterfaceC0375g) me2).getCompatibilityKey(), ((InterfaceC0375g) you).getCompatibilityKey());
        }
        return true;
    }
}
