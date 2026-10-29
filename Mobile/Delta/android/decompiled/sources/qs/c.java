package qs;

import java.util.List;
import jt.n;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ps.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lqs/c;", "Lbs/b;", "Lps/o;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/time/c;", "c", "(Ljava/util/List;)Ljava/util/List;", "", "b", "(Ljava/util/List;)Ljava/lang/Integer;", "Lqs/b;", "Lqs/b;", "formatter", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements bs.b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f29631a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final b formatter = new b();

    public final Integer b(List<kotlin.time.c> list) {
        Object objB;
        try {
            n.Companion companion = n.INSTANCE;
            objB = n.b(Integer.valueOf(((kotlin.time.c) CollectionsKt.d0(list)).compareTo((kotlin.time.c) CollectionsKt.o0(list))));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(jt.o.a(th2));
        }
        if (!n.h(objB)) {
            if (n.g(objB)) {
                objB = null;
            }
            return (Integer) objB;
        }
        int iIntValue = ((Number) objB).intValue();
        if (iIntValue > 0) {
            return 1;
        }
        return iIntValue < 0 ? -1 : 0;
    }

    public final List<kotlin.time.c> c(List<? extends Object> list) {
        Object objB;
        try {
            n.Companion companion = n.INSTANCE;
            Object obj = list.get(2);
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            a aVarValueOf = a.valueOf((String) obj);
            b bVar = formatter;
            Object obj2 = list.get(0);
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.String");
            kotlin.time.c cVarA = bVar.a((String) obj2, aVarValueOf);
            Object obj3 = list.get(1);
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.String");
            objB = n.b(p.n(cVarA, bVar.a((String) obj3, aVarValueOf)));
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(jt.o.a(th2));
        }
        if (n.g(objB)) {
            objB = null;
        }
        return (List) objB;
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        List<kotlin.time.c> listC = c(ts.a.c(expression));
        if (listC != null) {
            return b(listC);
        }
        return null;
    }
}
