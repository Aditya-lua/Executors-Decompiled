package op;

import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "B", "T", "Lcn/c;", "baseScreen", "", "compatibilityKey", "Lop/c;", "b", "(Lcn/c;Ljava/lang/Object;Ljava/lang/String;)Lop/c;", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lop/c;", "modal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    @NotNull
    public static final <B, T> c<B, T> a(@NotNull T t8, @NotNull B baseScreen, @NotNull String compatibilityKey) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(baseScreen, "baseScreen");
        Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
        return b(new cn.c(t8, p.k()), baseScreen, compatibilityKey);
    }

    @NotNull
    public static final <B, T> c<B, T> b(@NotNull cn.c<T> cVar, @NotNull B baseScreen, @NotNull String compatibilityKey) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(baseScreen, "baseScreen");
        Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
        return new c<>(baseScreen, o.d(cVar), compatibilityKey);
    }
}
