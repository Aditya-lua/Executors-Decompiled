package xr;

import java.util.ArrayList;
import java.util.List;
import jt.l;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00112\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lxr/h;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lxr/i;", "c", "(Ljava/lang/String;)Lxr/i;", "", "sortingMode", "b", "(Ljava/util/List;Lxr/i;)Ljava/lang/Object;", "Lkotlin/Function0;", "ascSort", "descSort", "a", "(Lxr/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements bs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f35301a = new h();

    public final Object a(i sortingMode, Function0<? extends Object> ascSort, Function0<? extends Object> descSort) {
        if (Intrinsics.c(sortingMode, i.b.f35303a)) {
            return descSort.invoke();
        }
        if (Intrinsics.c(sortingMode, i.a.f35302a)) {
            return ascSort.invoke();
        }
        if (Intrinsics.c(sortingMode, i.c.f35304a)) {
            return null;
        }
        throw new l();
    }

    public final Object b(List<? extends Object> list, i iVar) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            numValueOf = Integer.valueOf(arrayList.size());
        } else {
            numValueOf = null;
        }
        if (Intrinsics.c(numValueOf, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return a(iVar, new f(list), new g(list));
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof Boolean) {
                    arrayList2.add(obj2);
                }
            }
            numValueOf2 = Integer.valueOf(arrayList2.size());
        } else {
            numValueOf2 = null;
        }
        if (Intrinsics.c(numValueOf2, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return a(iVar, new f(list), new g(list));
            }
            return null;
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list) {
                if (obj3 instanceof Number) {
                    arrayList3.add(obj3);
                }
            }
            numValueOf3 = Integer.valueOf(arrayList3.size());
        } else {
            numValueOf3 = null;
        }
        if (!Intrinsics.c(numValueOf3, list != null ? Integer.valueOf(list.size()) : null)) {
            return null;
        }
        List listA0 = CollectionsKt.a0(ts.a.b(list));
        return a(iVar, new f(listA0), new g(listA0));
    }

    public final i c(String str) {
        if (Intrinsics.c(str, "desc")) {
            return i.b.f35303a;
        }
        return Intrinsics.c(str, "asc") ? i.a.f35302a : i.c.f35304a;
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        List<Object> listC = ts.a.c(expression);
        Object objFirstOrNull = CollectionsKt.firstOrNull(listC);
        List<? extends Object> list = objFirstOrNull instanceof List ? (List) objFirstOrNull : null;
        if (list == null) {
            return null;
        }
        h hVar = f35301a;
        Object objB = ts.c.b(listC);
        return hVar.b(list, hVar.c(objB instanceof String ? (String) objB : null));
    }
}
