package ns;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import java.util.Map;
import ms.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lns/b;", "Lrs/a;", "Ljt/a;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", "Lms/l;", "evaluator", "j", "(Ljava/lang/Object;Ljava/lang/Object;Lms/l;)Ljava/lang/Object;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements rs.a, jt.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f26616a = new b();

    @Override // rs.a
    @Nullable
    public Object j(@Nullable Object expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<? extends Object> listC = kt.a.c(expression);
        List<Object> listL = f26616a.l(listC, data, evaluator);
        Map<String, ? extends Object> mapA = kt.c.a(listC);
        if (mapA != null && listL != null) {
            for (Object obj : listL) {
                if (Intrinsics.c(evaluator.a(mapA, obj), Boolean.TRUE)) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override // jt.a
    @Nullable
    public List<Object> l(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.l(list, obj, lVar);
    }
}
