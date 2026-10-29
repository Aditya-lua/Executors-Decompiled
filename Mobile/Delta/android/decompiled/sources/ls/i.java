package ls;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lls/i;", "Lbs/b;", "Lns/a;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Double;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements bs.b, ns.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f23544a = new i();

    @Override // bs.b
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double l(@Nullable Object expression, @Nullable Object data) {
        List<Double> listC = c(expression);
        if (listC.size() < 2) {
            listC = null;
        }
        if (listC != null) {
            Double d10 = listC.get(1);
            Double d11 = (Double) CollectionsKt.d0(listC);
            if (d11 != null && d10 != null && !Intrinsics.a(d10, 0.0d)) {
                return Double.valueOf(d11.doubleValue() % d10.doubleValue());
            }
        }
        return null;
    }

    @Override // ns.a
    @NotNull
    public List<Double> c(@Nullable Object obj) {
        return super.c(obj);
    }
}
