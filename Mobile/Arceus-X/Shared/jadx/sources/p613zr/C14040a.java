package p613zr;

import bs.InterfaceC1488a;
import bs.InterfaceC1489b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p527wr.C12553j;
import p527wr.InterfaceC12555l;

/* JADX INFO: renamed from: zr.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u0004\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\fJ)\u0010\u0013\u001a\u00020\u0011*\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00110\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lzr/a;", "Lwr/l;", "Lzr/b;", "operations", "<init>", "(Lzr/b;)V", "", "", "", "expression", "data", "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "logic", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "c", "Lbs/b;", "operator", "d", "(Ljava/util/Map;Ljava/lang/Object;)Lbs/b;", "Lzr/b;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C14040a implements InterfaceC12555l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final LogicOperations operations;

    public C14040a(@NotNull LogicOperations operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        this.operations = operations;
    }

    @Override // p527wr.InterfaceC12555l
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo46917a(@NotNull Map<String, ? extends Object> expression, @Nullable Object data) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        return m50726b(expression, data);
    }

    /* JADX INFO: renamed from: b */
    public final Object m50726b(Object logic, Object data) {
        if (!(logic instanceof List)) {
            if (!(logic instanceof Map)) {
                return logic;
            }
            Map<?, ?> map = (Map) logic;
            return map.isEmpty() ? data : m50727c(map, data);
        }
        Iterable iterable = (Iterable) logic;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m50726b(it.next(), data));
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0073 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final Object m50727c(Map<?, ?> logic, Object data) throws C12553j {
        Object objM50726b;
        Object objE0 = CollectionsKt.m31707e0(logic.keySet());
        Object obj = logic.get(objE0);
        if (CollectionsKt.m31699W(this.operations.m50729a().keySet(), objE0)) {
            InterfaceC1488a interfaceC1488a = this.operations.m50729a().get(objE0);
            if (interfaceC1488a != null) {
                return interfaceC1488a.mo7614c(obj, data, this);
            }
            return null;
        }
        InterfaceC1489b interfaceC1489bM50728d = m50728d(this.operations.m50730b(), objE0);
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            objM50726b = new ArrayList(C7701q.m31905u(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                objM50726b.add(m50726b(it.next(), data));
            }
        } else {
            objM50726b = obj instanceof Map ? m50726b(obj, data) : m50726b(obj, data);
        }
        return interfaceC1489bM50728d.mo6534l(objM50726b, data);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC1489b m50728d(Map<String, ? extends InterfaceC1489b> map, Object obj) throws C12553j {
        InterfaceC1489b interfaceC1489b = map.get(obj);
        if (interfaceC1489b != null) {
            return interfaceC1489b;
        }
        throw new C12553j("Operation " + obj + " not found.");
    }
}
