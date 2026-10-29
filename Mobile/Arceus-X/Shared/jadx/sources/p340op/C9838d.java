package p340op;

import cn.C1682c;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: op.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aG\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"", "B", "T", "Lcn/c;", "baseScreen", "", "compatibilityKey", "Lop/c;", "b", "(Lcn/c;Ljava/lang/Object;Ljava/lang/String;)Lop/c;", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lop/c;", "modal_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C9838d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <B, T> C9837c<B, T> m38723a(@NotNull T t8, @NotNull B baseScreen, @NotNull String compatibilityKey) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        Intrinsics.checkNotNullParameter(baseScreen, "baseScreen");
        Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
        return m38724b(new C1682c(t8, C7699p.m31892k()), baseScreen, compatibilityKey);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <B, T> C9837c<B, T> m38724b(@NotNull C1682c<T> c1682c, @NotNull B baseScreen, @NotNull String compatibilityKey) {
        Intrinsics.checkNotNullParameter(c1682c, "<this>");
        Intrinsics.checkNotNullParameter(baseScreen, "baseScreen");
        Intrinsics.checkNotNullParameter(compatibilityKey, "compatibilityKey");
        return new C9837c<>(baseScreen, C7697o.m31878d(c1682c), compatibilityKey);
    }
}
