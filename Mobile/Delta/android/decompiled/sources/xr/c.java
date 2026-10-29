package xr;

import java.util.List;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lxr/c;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lxr/d;", "c", "(Ljava/util/List;)Lxr/d;", "", "a", "(Ljava/util/List;)Ljava/lang/Integer;", "", "b", "(Lxr/d;)Ljava/lang/String;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements bs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f35292a = new c();

    public final Integer a(List<? extends Object> list) {
        Object obj = list.get(4);
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Number");
        Number number = (Number) obj;
        if (number.doubleValue() != number.intValue()) {
            number = null;
        }
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    public final String b(JoinToStringArguments joinToStringArguments) {
        return CollectionsKt.m0(joinToStringArguments.a(), joinToStringArguments.getSeparator(), joinToStringArguments.getPrefix(), joinToStringArguments.getPostfix(), joinToStringArguments.getLimit(), joinToStringArguments.getTruncated(), null, 32, null);
    }

    public final JoinToStringArguments c(List<? extends Object> list) {
        Object objB;
        JoinToStringArguments joinToStringArguments;
        try {
            n.Companion companion = n.INSTANCE;
            Integer numA = f35292a.a(list);
            if (numA != null) {
                int iIntValue = numA.intValue();
                List<Object> listC = ts.a.c(list.get(0));
                Object obj = list.get(1);
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = list.get(2);
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj2;
                Object obj3 = list.get(3);
                Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.String");
                Object obj4 = list.get(5);
                Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.String");
                joinToStringArguments = new JoinToStringArguments(listC, str, str2, (String) obj3, iIntValue, (String) obj4);
            } else {
                joinToStringArguments = null;
            }
            objB = n.b(joinToStringArguments);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        if (n.e(objB) == null) {
            return (JoinToStringArguments) objB;
        }
        return null;
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        JoinToStringArguments joinToStringArgumentsC = c(ts.a.c(expression));
        if (joinToStringArgumentsC != null) {
            return b(joinToStringArgumentsC);
        }
        return null;
    }
}
