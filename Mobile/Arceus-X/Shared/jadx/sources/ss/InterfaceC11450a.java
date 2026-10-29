package ss;

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
import p451ts.C11744a;
import p527wr.InterfaceC12555l;

/* JADX INFO: renamed from: ss.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J;\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00022\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\t\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, m31665d2 = {"Lss/a;", "", "", "expression", "data", "Lwr/l;", "evaluator", "m", "(Ljava/util/List;Ljava/lang/Object;Lwr/l;)Ljava/util/List;", "g", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "operations-api_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC11450a {
    /* JADX INFO: renamed from: g */
    default Object m42869g(Object obj, Object obj2, InterfaceC12555l interfaceC12555l) {
        if (!(obj instanceof List)) {
            if (!C11744a.m43974f(obj)) {
                return obj;
            }
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return interfaceC12555l.mo46917a((Map) obj, obj2);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m42869g(it.next(), obj2, interfaceC12555l));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    default List<Object> mo22979m(@NotNull List<? extends Object> expression, @Nullable Object data, @NotNull InterfaceC12555l evaluator) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Object objM42869g = m42869g(CollectionsKt.firstOrNull(expression), data, evaluator);
        if (objM42869g instanceof List) {
            return (List) objM42869g;
        }
        return null;
    }
}
