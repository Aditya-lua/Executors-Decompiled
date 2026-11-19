package ts;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ms.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.collections.q;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0016\u001a\u0004\u0018\u00010\u0005*\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lts/d;", "Lrs/a;", "Lts/f;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", "Lms/l;", "evaluator", "j", "(Ljava/lang/Object;Ljava/lang/Object;Lms/l;)Ljava/lang/Object;", "Lts/b;", "operationInput", BuildConfig.FLAVOR, "n", "(Lts/b;Lms/l;)Ljava/util/List;", "evaluatedValue", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "mappingOperation", "operationDefault", "o", "(Lms/l;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements rs.a, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f32841a = new d();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements Function2<ArrayOperationInputData, l, List<? extends Object>> {
        public a(Object obj) {
            super(2, obj, d.class, "mapOrEmptyList", "mapOrEmptyList(Lcom/withpersona/sdk2/jsonlogic/operations/array/ArrayOperationInputData;Lcom/withpersona/sdk2/jsonlogic/LogicEvaluator;)Ljava/util/List;", 0);
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(ArrayOperationInputData p8, l p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return ((d) this.receiver).n(p8, p10);
        }
    }

    @Override // ts.a
    @Nullable
    public Object a(@Nullable Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
        return super.a(map, list);
    }

    @Override // ts.a
    @NotNull
    public ArrayOperationInputData e(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.e(list, obj, lVar);
    }

    @Override // ts.f
    @Nullable
    public Object i(@Nullable Object obj, @Nullable Object obj2, @NotNull l lVar, @NotNull Function2<? super ArrayOperationInputData, ? super l, ? extends Object> function2) {
        return super.i(obj, obj2, lVar, function2);
    }

    @Override // rs.a
    @Nullable
    public Object j(@Nullable Object expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return i(expression, data, evaluator, new a(this));
    }

    @Override // jt.a
    @Nullable
    public List<Object> l(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull l lVar) {
        return super.l(list, obj, lVar);
    }

    public final List<Object> n(ArrayOperationInputData operationInput, l evaluator) {
        List<Object> listB = operationInput.b();
        if (listB == null) {
            listB = p.k();
        }
        List<Object> list = listB;
        ArrayList arrayList = new ArrayList(q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f32841a.o(evaluator, it.next(), operationInput.a(), operationInput.getOperationDefault()));
        }
        return arrayList;
    }

    public final Object o(l lVar, Object obj, Map<String, ? extends Object> map, Object obj2) {
        Object objA;
        return (map == null || (objA = lVar.a(map, obj)) == null) ? obj2 : objA;
    }
}
