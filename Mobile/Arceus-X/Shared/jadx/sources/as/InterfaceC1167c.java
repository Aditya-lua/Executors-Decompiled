package as;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7796w;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p451ts.C11744a;
import p451ts.C11746c;

/* JADX INFO: renamed from: as.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J?\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, m31665d2 = {"Las/c;", "", "expression", "data", "Lkotlin/Function2;", "", "", "formatFloatingPoint", "a", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "formattedArgument", "b", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC1167c {
    @Nullable
    /* JADX INFO: renamed from: a */
    default String mo6533a(@Nullable Object expression, @Nullable Object data, @NotNull Function2<? super String, ? super Double, String> formatFloatingPoint) {
        Object objM30460b;
        Intrinsics.checkNotNullParameter(formatFloatingPoint, "formatFloatingPoint");
        List<Object> listM43971c = C11744a.m43971c(expression);
        String strValueOf = String.valueOf(CollectionsKt.firstOrNull(listM43971c));
        String strValueOf2 = String.valueOf(C11746c.m43979b(listM43971c));
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(m6535b(strValueOf, strValueOf2, formatFloatingPoint));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) == null) {
            return (String) objM30460b;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    default String m6535b(String str, String str2, Function2<? super String, ? super Double, String> function2) {
        Double dM32289r;
        if (!new Regex("%[\\d|.]*[f]").m32113f(str) || (dM32289r = C7796w.m32289r(str2)) == null) {
            return null;
        }
        return function2.invoke(str, Double.valueOf(dM32289r.doubleValue()));
    }
}
