package p557xr;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p451ts.C11744a;

/* JADX INFO: renamed from: xr.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lxr/c;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lxr/d;", "c", "(Ljava/util/List;)Lxr/d;", "", "a", "(Ljava/util/List;)Ljava/lang/Integer;", "", "b", "(Lxr/d;)Ljava/lang/String;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12897c implements InterfaceC1489b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12897c f45763a = new C12897c();

    /* JADX INFO: renamed from: a */
    public final Integer m47921a(List<? extends Object> list) {
        Object obj = list.get(4);
        Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.Number");
        Number number = (Number) obj;
        if (number.doubleValue() != number.intValue()) {
            number = null;
        }
        if (number != null) {
            return Integer.valueOf(number.intValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m47922b(JoinToStringArguments joinToStringArguments) {
        return CollectionsKt.m31715m0(joinToStringArguments.m47924a(), joinToStringArguments.getSeparator(), joinToStringArguments.getPrefix(), joinToStringArguments.getPostfix(), joinToStringArguments.getLimit(), joinToStringArguments.getTruncated(), null, 32, null);
    }

    /* JADX INFO: renamed from: c */
    public final JoinToStringArguments m47923c(List<? extends Object> list) {
        Object objM30460b;
        JoinToStringArguments joinToStringArguments;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Integer numM47921a = f45763a.m47921a(list);
            if (numM47921a != null) {
                int iIntValue = numM47921a.intValue();
                List<Object> listM43971c = C11744a.m43971c(list.get(0));
                Object obj = list.get(1);
                Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                Object obj2 = list.get(2);
                Intrinsics.m31981d(obj2, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) obj2;
                Object obj3 = list.get(3);
                Intrinsics.m31981d(obj3, "null cannot be cast to non-null type kotlin.String");
                Object obj4 = list.get(5);
                Intrinsics.m31981d(obj4, "null cannot be cast to non-null type kotlin.String");
                joinToStringArguments = new JoinToStringArguments(listM43971c, str, str2, (String) obj3, iIntValue, (String) obj4);
            } else {
                joinToStringArguments = null;
            }
            objM30460b = C7347n.m30460b(joinToStringArguments);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) == null) {
            return (JoinToStringArguments) objM30460b;
        }
        return null;
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        JoinToStringArguments joinToStringArgumentsM47923c = m47923c(C11744a.m43971c(expression));
        if (joinToStringArgumentsM47923c != null) {
            return m47922b(joinToStringArgumentsM47923c);
        }
        return null;
    }
}
