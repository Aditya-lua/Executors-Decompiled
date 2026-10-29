package zr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wr.j;
import wr.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u0004\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ)\u0010\u0013\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lzr/a;", "Lwr/l;", "Lzr/b;", "operations", "<init>", "(Lzr/b;)V", "", "", "", "expression", "data", "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "logic", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "c", "Lbs/b;", "operator", "d", "(Ljava/util/Map;Ljava/lang/Object;)Lbs/b;", "Lzr/b;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LogicOperations operations;

    public a(@NotNull LogicOperations operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        this.operations = operations;
    }

    @Override // wr.l
    @Nullable
    public Object a(@NotNull Map<String, ? extends Object> expression, @Nullable Object data) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return b(expression, data);
    }

    public final Object b(Object logic, Object data) {
        if (!(logic instanceof List)) {
            if (!(logic instanceof Map)) {
                return logic;
            }
            Map<?, ?> map = (Map) logic;
            return map.isEmpty() ? data : c(map, data);
        }
        Iterable iterable = (Iterable) logic;
        ArrayList arrayList = new ArrayList(q.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), data));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    public final Object c(Map<?, ?> logic, Object data) throws j {
        Object objB;
        Object objE0 = CollectionsKt.e0(logic.keySet());
        Object obj = logic.get(objE0);
        if (CollectionsKt.W(this.operations.a().keySet(), objE0)) {
            bs.a aVar = this.operations.a().get(objE0);
            if (aVar != null) {
                return aVar.c(obj, data, this);
            }
            return null;
        }
        bs.b bVarD = d(this.operations.b(), objE0);
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            objB = new ArrayList(q.u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                objB.add(b(it.next(), data));
            }
        } else {
            objB = obj instanceof Map ? b(obj, data) : b(obj, data);
        }
        return bVarD.l(objB, data);
    }

    public final bs.b d(Map<String, ? extends bs.b> map, Object obj) throws j {
        bs.b bVar = map.get(obj);
        if (bVar != null) {
            return bVar;
        }
        throw new j("Operation " + obj + " not found.");
    }
}
