package p395qu;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.AbstractC7888l0;

/* JADX INFO: renamed from: qu.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"", "", "a", "(I)V", "Lku/l0;", "", "name", "b", "(Lku/l0;Ljava/lang/String;)Lku/l0;", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10734m {
    /* JADX INFO: renamed from: a */
    public static final void m40890a(int i10) {
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i10).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC7888l0 m40891b(@NotNull AbstractC7888l0 abstractC7888l0, @Nullable String str) {
        return str != null ? new C10751w(abstractC7888l0, str) : abstractC7888l0;
    }
}
