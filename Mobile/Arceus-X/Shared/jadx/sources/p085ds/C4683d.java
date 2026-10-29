package p085ds;

import bs.InterfaceC1488a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p527wr.InterfaceC12555l;

/* JADX INFO: renamed from: ds.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0016\u001a\u0004\u0018\u00010\u0005*\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Lds/d;", "Lbs/a;", "Lds/f;", "<init>", "()V", "", "expression", "data", "Lwr/l;", "evaluator", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "Lds/b;", "operationInput", "", "n", "(Lds/b;Lwr/l;)Ljava/util/List;", "evaluatedValue", "", "", "mappingOperation", "operationDefault", "o", "(Lwr/l;Ljava/lang/Object;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4683d implements InterfaceC1488a, InterfaceC4685f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4683d f19169a = new C4683d();

    /* JADX INFO: renamed from: ds.d$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function2<ArrayOperationInputData, InterfaceC12555l, List<? extends Object>> {
        public a(Object obj) {
            super(2, obj, C4683d.class, "mapOrEmptyList", "mapOrEmptyList(Lcom/withpersona/sdk2/jsonlogic/operations/array/ArrayOperationInputData;Lcom/withpersona/sdk2/jsonlogic/LogicEvaluator;)Ljava/util/List;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(ArrayOperationInputData p8, InterfaceC12555l p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return ((C4683d) this.receiver).m22984n(p8, p10);
        }
    }

    @Override // p085ds.InterfaceC4680a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo22971a(@Nullable Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
        return super.mo22971a(map, list);
    }

    @Override // bs.InterfaceC1488a
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo7614c(@Nullable Object expression, @Nullable Object data, @NotNull InterfaceC12555l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return mo22978h(expression, data, evaluator, new a(this));
    }

    @Override // p085ds.InterfaceC4685f
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo22978h(@Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC12555l interfaceC12555l, @NotNull Function2<? super ArrayOperationInputData, ? super InterfaceC12555l, ? extends Object> function2) {
        return super.mo22978h(obj, obj2, interfaceC12555l, function2);
    }

    @Override // p085ds.InterfaceC4680a
    @NotNull
    /* JADX INFO: renamed from: l */
    public ArrayOperationInputData mo22972l(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull InterfaceC12555l interfaceC12555l) {
        return super.mo22972l(list, obj, interfaceC12555l);
    }

    @Override // ss.InterfaceC11450a
    @Nullable
    /* JADX INFO: renamed from: m */
    public List<Object> mo22979m(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull InterfaceC12555l interfaceC12555l) {
        return super.mo22979m(list, obj, interfaceC12555l);
    }

    /* JADX INFO: renamed from: n */
    public final List<Object> m22984n(ArrayOperationInputData operationInput, InterfaceC12555l evaluator) {
        List<Object> listM22974b = operationInput.m22974b();
        if (listM22974b == null) {
            listM22974b = C7699p.m31892k();
        }
        List<Object> list = listM22974b;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f19169a.m22985o(evaluator, it.next(), operationInput.m22973a(), operationInput.getOperationDefault()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public final Object m22985o(InterfaceC12555l interfaceC12555l, Object obj, Map<String, ? extends Object> map, Object obj2) {
        Object objMo46917a;
        return (map == null || (objMo46917a = interfaceC12555l.mo46917a(map, obj)) == null) ? obj2 : objMo46917a;
    }
}
