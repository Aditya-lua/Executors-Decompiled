package p085ds;

import bs.InterfaceC1488a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7352s;
import p451ts.C11744a;
import p451ts.C11746c;
import p527wr.InterfaceC12555l;

/* JADX INFO: renamed from: ds.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0016\u001a\u0004\u0018\u00010\u0005*\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lds/g;", "Lbs/a;", "Lds/a;", "<init>", "()V", "", "expression", "data", "Lwr/l;", "evaluator", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "Lds/b;", "operationInput", "initialValue", "b", "(Lds/b;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "accumulator", "evaluatedValue", "", "", "mappingOperation", "n", "(Lwr/l;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;", "current", "o", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4686g implements InterfaceC1488a, InterfaceC4680a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4686g f19171a = new C4686g();

    @Override // p085ds.InterfaceC4680a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo22971a(@Nullable Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
        return super.mo22971a(map, list);
    }

    /* JADX INFO: renamed from: b */
    public final Object m22988b(ArrayOperationInputData operationInput, Object initialValue, InterfaceC12555l evaluator) {
        List<Object> listM22974b = operationInput.m22974b();
        if (listM22974b != null) {
            Iterator<T> it = listM22974b.iterator();
            Object objM22989n = initialValue;
            while (it.hasNext()) {
                objM22989n = f19171a.m22989n(evaluator, objM22989n, it.next(), operationInput.m22973a());
                if (objM22989n == null) {
                    return operationInput.getOperationDefault();
                }
            }
            if (objM22989n != null) {
                return objM22989n;
            }
        }
        return initialValue;
    }

    @Override // bs.InterfaceC1488a
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo7614c(@Nullable Object expression, @Nullable Object data, @NotNull InterfaceC12555l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<? extends Object> listM43971c = C11744a.m43971c(expression);
        C4686g c4686g = f19171a;
        return c4686g.m22988b(c4686g.mo22972l(listM43971c, data, evaluator), C11746c.m43980c(listM43971c), evaluator);
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
    public final Object m22989n(InterfaceC12555l interfaceC12555l, Object obj, Object obj2, Map<String, ? extends Object> map) {
        if (map != null) {
            return interfaceC12555l.mo46917a(map, f19171a.m22990o(obj, obj2));
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final Map<String, Object> m22990o(Object accumulator, Object current) {
        return C7690k0.m31798m(C7352s.m30477a("accumulator", accumulator), C7352s.m30477a("current", current));
    }
}
