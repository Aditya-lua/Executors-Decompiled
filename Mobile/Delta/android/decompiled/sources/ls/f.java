package ls;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lls/f;", "Lbs/b;", "Lls/d;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements bs.b, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f23542a = new f();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Double b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.q0(it);
    }

    @Override // ls.d
    @Nullable
    public Double c(@Nullable Object obj, @NotNull Function1<? super List<Double>, Double> function1) {
        return super.c(obj, function1);
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        return c(expression, new Function1() { // from class: ls.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.b((List) obj);
            }
        });
    }
}
