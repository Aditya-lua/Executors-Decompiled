package wr;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00122\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lwr/g;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lwr/h;", "k", "(Ljava/lang/String;)Lwr/h;", "", "count", "mode", "e", "(Ljava/lang/Object;ILwr/h;)Ljava/lang/Object;", "Lkotlin/Function0;", "first", "last", "j", "(Lwr/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements bs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f34540a = new g();

    public static final Object f(Object obj, int i10) {
        return c0.u1((String) obj, i10);
    }

    public static final Object g(Object obj, int i10) {
        return c0.v1((String) obj, i10);
    }

    public static final Object h(Object obj, int i10) {
        return CollectionsKt.Y((Iterable) obj, i10);
    }

    public static final Object i(Object obj, int i10) {
        return CollectionsKt.Z((List) obj, i10);
    }

    public final Object e(final Object obj, final int i10, h hVar) {
        if (obj instanceof String) {
            return j(hVar, new Function0() { // from class: wr.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.f(obj, i10);
                }
            }, new Function0() { // from class: wr.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.g(obj, i10);
                }
            });
        }
        if (obj instanceof List) {
            return j(hVar, new Function0() { // from class: wr.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.h(obj, i10);
                }
            }, new Function0() { // from class: wr.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.i(obj, i10);
                }
            });
        }
        return null;
    }

    public final Object j(h mode, Function0<? extends Object> first, Function0<? extends Object> last) {
        if (Intrinsics.c(mode, h.a.f34541a)) {
            return first.invoke();
        }
        if (Intrinsics.c(mode, h.b.f34542a)) {
            return last.invoke();
        }
        if (Intrinsics.c(mode, h.c.f34543a)) {
            return null;
        }
        throw new jt.l();
    }

    public final h k(String str) {
        if (Intrinsics.c(str, "first")) {
            return h.a.f34541a;
        }
        return Intrinsics.c(str, "last") ? h.b.f34542a : h.c.f34543a;
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        List<Object> listC = ts.a.c(expression);
        Object objFirstOrNull = CollectionsKt.firstOrNull(listC);
        Object objB = ts.c.b(listC);
        g gVar = f34540a;
        Object objC = ts.c.c(listC);
        h hVarK = gVar.k(objC instanceof String ? (String) objC : null);
        Integer num = objB instanceof Integer ? (Integer) objB : null;
        if (num != null) {
            return gVar.e(objFirstOrNull, num.intValue(), hVarK);
        }
        return null;
    }
}
