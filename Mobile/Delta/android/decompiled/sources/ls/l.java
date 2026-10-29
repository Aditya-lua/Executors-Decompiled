package ls;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lls/l;", "Lbs/b;", "Lns/a;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Double;", "first", "second", "e", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements bs.b, ns.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final l f23546a = new l();

    @Override // bs.b
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double l(@Nullable Object expression, @Nullable Object data) {
        List<Double> listC = c(expression);
        int size = listC.size();
        if (size != 0) {
            if (size != 1) {
                return f23546a.e((Double) CollectionsKt.d0(listC), listC.get(1));
            }
            Double d10 = (Double) CollectionsKt.d0(listC);
            if (d10 != null) {
                return Double.valueOf(-d10.doubleValue());
            }
        }
        return null;
    }

    @Override // ns.a
    @NotNull
    public List<Double> c(@Nullable Object obj) {
        return super.c(obj);
    }

    public final Double e(Double first, Double second) {
        if (first == null || second == null) {
            return null;
        }
        return Double.valueOf(first.doubleValue() - second.doubleValue());
    }
}
