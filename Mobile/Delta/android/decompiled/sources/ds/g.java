package ds;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jt.s;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wr.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0016\u001a\u0004\u0018\u00010\u0005*\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lds/g;", "Lbs/a;", "Lds/a;", "<init>", "()V", "", "expression", "data", "Lwr/l;", "evaluator", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "Lds/b;", "operationInput", "initialValue", "b", "(Lds/b;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "accumulator", "evaluatedValue", "", "", "mappingOperation", "n", "(Lwr/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "current", "o", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements bs.a, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f14880a = new g();

    @Override // ds.a
    @Nullable
    public Object a(@Nullable Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
        return super.a(map, list);
    }

    public final Object b(ArrayOperationInputData operationInput, Object initialValue, l evaluator) {
        List<Object> listB = operationInput.b();
        if (listB != null) {
            Iterator<T> it = listB.iterator();
            Object objN = initialValue;
            while (it.hasNext()) {
                objN = f14880a.n(evaluator, objN, it.next(), operationInput.a());
                if (objN == null) {
                    return operationInput.getOperationDefault();
                }
            }
            if (objN != null) {
                return objN;
            }
        }
        return initialValue;
    }

    @Override // bs.a
    @Nullable
    public Object c(@Nullable Object expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<? extends Object> listC = ts.a.c(expression);
        g gVar = f14880a;
        return gVar.b(gVar.l(listC, data, evaluator), ts.c.c(listC), evaluator);
    }

    @Override // ds.a
    @NotNull
    public ArrayOperationInputData l(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.l(list, obj, lVar);
    }

    @Override // ss.a
    @Nullable
    public List<Object> m(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.m(list, obj, lVar);
    }

    public final Object n(l lVar, Object obj, Object obj2, Map<String, ? extends Object> map) {
        if (map != null) {
            return lVar.a(map, f14880a.o(obj, obj2));
        }
        return null;
    }

    public final Map<String, Object> o(Object accumulator, Object current) {
        return k0.m(s.a("accumulator", accumulator), s.a("current", current));
    }
}
