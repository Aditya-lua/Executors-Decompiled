package p557xr;

import bs.InterfaceC1489b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p451ts.C11744a;
import p451ts.C11746c;

/* JADX INFO: renamed from: xr.h */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r2\u0006\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00112\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lxr/h;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lxr/i;", "c", "(Ljava/lang/String;)Lxr/i;", "", "sortingMode", "b", "(Ljava/util/List;Lxr/i;)Ljava/lang/Object;", "Lkotlin/Function0;", "ascSort", "descSort", "a", "(Lxr/i;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12902h implements InterfaceC1489b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12902h f45773a = new C12902h();

    /* JADX INFO: renamed from: a */
    public final Object m47930a(AbstractC12903i sortingMode, Function0<? extends Object> ascSort, Function0<? extends Object> descSort) {
        if (Intrinsics.m31980c(sortingMode, AbstractC12903i.b.f45775a)) {
            return descSort.invoke();
        }
        if (Intrinsics.m31980c(sortingMode, AbstractC12903i.a.f45774a)) {
            return ascSort.invoke();
        }
        if (Intrinsics.m31980c(sortingMode, AbstractC12903i.c.f45776a)) {
            return null;
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: b */
    public final Object m47931b(List<? extends Object> list, AbstractC12903i abstractC12903i) {
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
        if (Intrinsics.m31980c(numValueOf, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return m47930a(abstractC12903i, new C12900f(list), new C12901g(list));
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
        if (Intrinsics.m31980c(numValueOf2, list != null ? Integer.valueOf(list.size()) : null)) {
            if (!(list instanceof List)) {
                list = null;
            }
            if (list != null) {
                return m47930a(abstractC12903i, new C12900f(list), new C12901g(list));
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
        if (!Intrinsics.m31980c(numValueOf3, list != null ? Integer.valueOf(list.size()) : null)) {
            return null;
        }
        List listA0 = CollectionsKt.m31703a0(C11744a.m43970b(list));
        return m47930a(abstractC12903i, new C12900f(listA0), new C12901g(listA0));
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC12903i m47932c(String str) {
        if (Intrinsics.m31980c(str, "desc")) {
            return AbstractC12903i.b.f45775a;
        }
        return Intrinsics.m31980c(str, "asc") ? AbstractC12903i.a.f45774a : AbstractC12903i.c.f45776a;
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        List<Object> listM43971c = C11744a.m43971c(expression);
        Object objFirstOrNull = CollectionsKt.firstOrNull(listM43971c);
        List<? extends Object> list = objFirstOrNull instanceof List ? (List) objFirstOrNull : null;
        if (list == null) {
            return null;
        }
        C12902h c12902h = f45773a;
        Object objM43979b = C11746c.m43979b(listM43971c);
        return c12902h.m47931b(list, c12902h.m47932c(objM43979b instanceof String ? (String) objM43979b : null));
    }
}
