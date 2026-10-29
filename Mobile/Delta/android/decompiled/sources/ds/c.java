package ds;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wr.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u0018\u001a\u00020\u0017*\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lds/c;", "Lbs/a;", "Lds/f;", "Lks/d;", "<init>", "()V", "", "expression", "data", "Lwr/l;", "evaluator", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "Lds/b;", "operationInput", "", "o", "(Lds/b;Lwr/l;)Ljava/util/List;", "evaluatedValue", "", "", "mappingOperation", "operationDefault", "", "p", "(Lwr/l;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Object;)Z", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements bs.a, f, ks.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f14877a = new c();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements Function2<ArrayOperationInputData, l, List<? extends Object>> {
        public a(Object obj) {
            super(2, obj, c.class, "filterOrEmptyList", "filterOrEmptyList(Lcom/withpersona/sdk2/jsonlogic/operations/array/ArrayOperationInputData;Lcom/withpersona/sdk2/jsonlogic/LogicEvaluator;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(ArrayOperationInputData p8, l p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return ((c) this.receiver).o(p8, p10);
        }
    }

    @Override // ds.a
    @Nullable
    public Object a(@Nullable Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
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
        return h(expression, data, evaluator, new a(this));
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

    public final List<Object> o(ArrayOperationInputData operationInput, l evaluator) {
        List<Object> listB = operationInput.b();
        if (listB == null) {
            listB = p.k();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            if (f14877a.p(evaluator, obj, operationInput.a(), operationInput.getOperationDefault())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean p(l lVar, Object obj, Map<String, ? extends Object> map, Object obj2) {
        Object objA;
        if (map != null && (objA = lVar.a(map, obj)) != null) {
            obj2 = objA;
        }
        return b(obj2);
    }
}
