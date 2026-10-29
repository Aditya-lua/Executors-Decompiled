package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.v */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a%\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"", "", "index", "P", "(Ljava/util/List;I)I", "R", "Q", "T", "", "O", "(Ljava/util/List;)Ljava/util/List;", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/CollectionsKt")
public class C7709v extends C7708u {
    @NotNull
    /* JADX INFO: renamed from: O */
    public static <T> List<T> m31935O(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new C7696n0(list);
    }

    /* JADX INFO: renamed from: P */
    public static final int m31936P(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= C7699p.m31894m(list)) {
            return C7699p.m31894m(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new IntRange(0, C7699p.m31894m(list)) + "].");
    }

    /* JADX INFO: renamed from: Q */
    public static final int m31937Q(List<?> list, int i10) {
        return C7699p.m31894m(list) - i10;
    }

    /* JADX INFO: renamed from: R */
    public static final int m31938R(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new IntRange(0, list.size()) + "].");
    }
}
