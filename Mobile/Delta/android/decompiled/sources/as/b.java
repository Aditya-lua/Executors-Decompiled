package as;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Las/b;", "Lbs/b;", "Las/c;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements bs.b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f3758a = new b();

    public static final String d(String formatSequence, double d10) {
        Intrinsics.checkNotNullParameter(formatSequence, "formatSequence");
        String str = String.format(formatSequence, Double.valueOf(d10));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // as.c
    @Nullable
    public String a(@Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super String, ? super Double, String> function2) {
        return super.a(obj, obj2, function2);
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        return a(expression, data, new Function2() { // from class: as.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return b.d((String) obj, ((Double) obj2).doubleValue());
            }
        });
    }
}
