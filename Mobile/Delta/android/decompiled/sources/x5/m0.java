package x5;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"T", "Lx5/l0;", "", "label", "Lkotlin/Function0;", "block", "a", "(Lx5/l0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m0 {
    public static final <T> T a(@NotNull l0 l0Var, @NotNull String label, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean zIsEnabled = l0Var.isEnabled();
        if (zIsEnabled) {
            try {
                l0Var.a(label);
            } finally {
                kotlin.jvm.internal.l.b(1);
                if (zIsEnabled) {
                    l0Var.d();
                }
                kotlin.jvm.internal.l.a(1);
            }
        }
        return block.invoke();
    }
}
