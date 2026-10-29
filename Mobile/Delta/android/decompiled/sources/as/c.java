package as;

import java.util.List;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J?\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Las/c;", "", "expression", "data", "Lkotlin/Function2;", "", "", "formatFloatingPoint", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "formattedArgument", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @Nullable
    default String a(@Nullable Object expression, @Nullable Object data, @NotNull Function2<? super String, ? super Double, String> formatFloatingPoint) {
        Object objB;
        Intrinsics.checkNotNullParameter(formatFloatingPoint, "formatFloatingPoint");
        List<Object> listC = ts.a.c(expression);
        String strValueOf = String.valueOf(CollectionsKt.firstOrNull(listC));
        String strValueOf2 = String.valueOf(ts.c.b(listC));
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(b(strValueOf, strValueOf2, formatFloatingPoint));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        if (n.e(objB) == null) {
            return (String) objB;
        }
        return null;
    }

    default String b(String str, String str2, Function2<? super String, ? super Double, String> function2) {
        Double dR;
        if (!new Regex("%[\\d|.]*[f]").f(str) || (dR = w.r(str2)) == null) {
            return null;
        }
        return function2.invoke(str, Double.valueOf(dR.doubleValue()));
    }
}
