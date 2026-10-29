package es;

import ds.ArrayOperationInputData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wr.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Les/f;", "Lbs/a;", "Les/e;", "<init>", "()V", "", "expression", "data", "Lwr/l;", "evaluator", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "Les/c;", "e", "(Les/c;Lwr/l;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements bs.a, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f15779a = new f();

    @Override // es.e, ds.a
    @NotNull
    public Boolean a(@Nullable Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
        return super.a(map, list);
    }

    @Override // ks.d
    public boolean b(@Nullable Object obj) {
        return super.b(obj);
    }

    @Override // bs.a
    @Nullable
    public Object c(@Nullable Object expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return f(expression, data, evaluator);
    }

    @Override // es.e
    @Nullable
    public Object e(@NotNull OccurrenceCheckInputData data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Iterator<T> it = data.b().iterator();
        while (it.hasNext()) {
            if (f15779a.b(evaluator.a(data.a(), it.next()))) {
                return Boolean.TRUE;
            }
        }
        return data.getOperationDefault();
    }

    @Override // es.e
    @Nullable
    public Object f(@Nullable Object obj, @Nullable Object obj2, @NotNull l lVar) {
        return super.f(obj, obj2, lVar);
    }

    @Override // ds.f
    @Nullable
    public Object h(@Nullable Object obj, @Nullable Object obj2, @NotNull l lVar, @NotNull Function2<? super ArrayOperationInputData, ? super l, ? extends Object> function2) {
        return super.h(obj, obj2, lVar, function2);
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

    @Override // es.e, ds.a
    public /* bridge */ /* synthetic */ Object a(Map map, List list) {
        return a((Map<String, ? extends Object>) map, (List<? extends Object>) list);
    }
}
