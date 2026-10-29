package as;

import bs.InterfaceC1489b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: as.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Las/b;", "Lbs/b;", "Las/c;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C1166b implements InterfaceC1489b, InterfaceC1167c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1166b f4918a = new C1166b();

    /* JADX INFO: renamed from: d */
    public static final String m6532d(String formatSequence, double d10) {
        Intrinsics.checkNotNullParameter(formatSequence, "formatSequence");
        String str = String.format(formatSequence, Double.valueOf(d10));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // as.InterfaceC1167c
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo6533a(@Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super String, ? super Double, String> function2) {
        return super.mo6533a(obj, obj2, function2);
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        return mo6533a(expression, data, new Function2() { // from class: as.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return C1166b.m6532d((String) obj, ((Double) obj2).doubleValue());
            }
        });
    }
}
