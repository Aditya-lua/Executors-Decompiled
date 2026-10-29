package ps;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p451ts.C11744a;

/* JADX INFO: renamed from: ps.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lps/i;", "Lbs/b;", "Lps/o;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10327i implements InterfaceC1489b, InterfaceC10333o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10327i f37178a = new C10327i();

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        Object objM30460b;
        List<Object> listM43971c = C11744a.m43971c(expression);
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Object obj = listM43971c.get(0);
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = listM43971c.get(1);
            Intrinsics.m31981d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = listM43971c.get(2);
            Intrinsics.m31981d(obj3, "null cannot be cast to non-null type kotlin.String");
            ReplaceData replaceData = new ReplaceData((String) obj, (String) obj2, (String) obj3);
            AbstractC10329k.Companion companion2 = AbstractC10329k.INSTANCE;
            Object obj4 = listM43971c.get(3);
            Intrinsics.m31981d(obj4, "null cannot be cast to non-null type kotlin.String");
            objM30460b = C7347n.m30460b(companion2.m39645a((String) obj4, replaceData).invoke());
        } catch (Throwable th2) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) == null) {
            return objM30460b;
        }
        return null;
    }
}
