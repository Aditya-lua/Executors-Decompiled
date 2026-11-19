package bt;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbt/b;", "Lrs/b;", "Lbt/d;", "Ldt/b;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements rs.b, d, dt.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f4584a = new b();

    public static final Double e(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(CollectionsKt.G0(it));
    }

    @Override // dt.b
    @NotNull
    public List<Object> a(@Nullable Object obj) {
        return super.a(obj);
    }

    @Override // bt.d
    @Nullable
    public Double c(@Nullable Object obj, @NotNull Function1<? super List<Double>, Double> function1) {
        return super.c(obj, function1);
    }

    @Override // rs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        return c(a(expression), new Function1() { // from class: bt.a
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.e((List) obj);
            }
        });
    }
}
