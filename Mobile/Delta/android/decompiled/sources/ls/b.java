package ls;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lls/b;", "Lbs/b;", "Lls/d;", "Lns/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements bs.b, d, ns.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f23540a = new b();

    public static final Double e(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(CollectionsKt.G0(it));
    }

    @Override // ns.b
    @NotNull
    public List<Object> a(@Nullable Object obj) {
        return super.a(obj);
    }

    @Override // ls.d
    @Nullable
    public Double c(@Nullable Object obj, @NotNull Function1<? super List<Double>, Double> function1) {
        return super.c(obj, function1);
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        return c(a(expression), new Function1() { // from class: ls.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b.e((List) obj);
            }
        });
    }
}
