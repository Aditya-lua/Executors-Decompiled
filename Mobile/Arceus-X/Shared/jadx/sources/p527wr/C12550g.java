package p527wr;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7776c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p451ts.C11744a;
import p451ts.C11746c;

/* JADX INFO: renamed from: wr.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00122\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lwr/g;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lwr/h;", "k", "(Ljava/lang/String;)Lwr/h;", "", "count", "mode", "e", "(Ljava/lang/Object;ILwr/h;)Ljava/lang/Object;", "Lkotlin/Function0;", "first", "last", "j", "(Lwr/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12550g implements InterfaceC1489b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12550g f44781a = new C12550g();

    /* JADX INFO: renamed from: f */
    public static final Object m46903f(Object obj, int i10) {
        return C7776c0.m32212u1((String) obj, i10);
    }

    /* JADX INFO: renamed from: g */
    public static final Object m46904g(Object obj, int i10) {
        return C7776c0.m32213v1((String) obj, i10);
    }

    /* JADX INFO: renamed from: h */
    public static final Object m46905h(Object obj, int i10) {
        return CollectionsKt.m31701Y((Iterable) obj, i10);
    }

    /* JADX INFO: renamed from: i */
    public static final Object m46906i(Object obj, int i10) {
        return CollectionsKt.m31702Z((List) obj, i10);
    }

    /* JADX INFO: renamed from: e */
    public final Object m46907e(final Object obj, final int i10, AbstractC12551h abstractC12551h) {
        if (obj instanceof String) {
            return m46908j(abstractC12551h, new Function0() { // from class: wr.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12550g.m46903f(obj, i10);
                }
            }, new Function0() { // from class: wr.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12550g.m46904g(obj, i10);
                }
            });
        }
        if (obj instanceof List) {
            return m46908j(abstractC12551h, new Function0() { // from class: wr.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12550g.m46905h(obj, i10);
                }
            }, new Function0() { // from class: wr.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C12550g.m46906i(obj, i10);
                }
            });
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final Object m46908j(AbstractC12551h mode, Function0<? extends Object> first, Function0<? extends Object> last) {
        if (Intrinsics.m31980c(mode, AbstractC12551h.a.f44782a)) {
            return first.invoke();
        }
        if (Intrinsics.m31980c(mode, AbstractC12551h.b.f44783a)) {
            return last.invoke();
        }
        if (Intrinsics.m31980c(mode, AbstractC12551h.c.f44784a)) {
            return null;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC12551h m46909k(String str) {
        if (Intrinsics.m31980c(str, "first")) {
            return AbstractC12551h.a.f44782a;
        }
        return Intrinsics.m31980c(str, "last") ? AbstractC12551h.b.f44783a : AbstractC12551h.c.f44784a;
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        List<Object> listM43971c = C11744a.m43971c(expression);
        Object objFirstOrNull = CollectionsKt.firstOrNull(listM43971c);
        Object objM43979b = C11746c.m43979b(listM43971c);
        C12550g c12550g = f44781a;
        Object objM43980c = C11746c.m43980c(listM43971c);
        AbstractC12551h abstractC12551hM46909k = c12550g.m46909k(objM43980c instanceof String ? (String) objM43980c : null);
        Integer num = objM43979b instanceof Integer ? (Integer) objM43979b : null;
        if (num != null) {
            return c12550g.m46907e(objFirstOrNull, num.intValue(), abstractC12551hM46909k);
        }
        return null;
    }
}
