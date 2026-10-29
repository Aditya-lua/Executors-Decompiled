package es;

import bs.InterfaceC1488a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p085ds.ArrayOperationInputData;
import p527wr.InterfaceC12555l;

/* JADX INFO: renamed from: es.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Les/a;", "Lbs/a;", "Les/e;", "<init>", "()V", "", "expression", "data", "Lwr/l;", "evaluator", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "Les/c;", "e", "(Les/c;Lwr/l;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5208a implements InterfaceC1488a, InterfaceC5212e {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5208a f20251a = new C5208a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // es.InterfaceC5212e, p085ds.InterfaceC4680a
    @NotNull
    /* JADX INFO: renamed from: a */
    public Boolean mo22971a(@Nullable Map<String, ? extends Object> map, @NotNull List<? extends Object> list) {
        return super.mo22971a(map, list);
    }

    @Override // p254ks.InterfaceC7823d
    /* JADX INFO: renamed from: b */
    public boolean mo22977b(@Nullable Object obj) {
        return super.mo22977b(obj);
    }

    @Override // bs.InterfaceC1488a
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo7614c(@Nullable Object expression, @Nullable Object data, @NotNull InterfaceC12555l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return mo24158f(expression, data, evaluator);
    }

    @Override // es.InterfaceC5212e
    @Nullable
    /* JADX INFO: renamed from: e */
    public Object mo24157e(@NotNull OccurrenceCheckInputData data, @NotNull InterfaceC12555l evaluator) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        Iterator<T> it = data.m24160b().iterator();
        while (it.hasNext()) {
            if (!f20251a.mo22977b(evaluator.mo46917a(data.m24159a(), it.next()))) {
                return data.getOperationDefault();
            }
        }
        return Boolean.TRUE;
    }

    @Override // es.InterfaceC5212e
    @Nullable
    /* JADX INFO: renamed from: f */
    public Object mo24158f(@Nullable Object obj, @Nullable Object obj2, @NotNull InterfaceC12555l interfaceC12555l) {
        return super.mo24158f(obj, obj2, interfaceC12555l);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // es.InterfaceC5212e, p085ds.InterfaceC4680a
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ Object mo22971a(Map map, List list) {
        return mo22971a((Map<String, ? extends Object>) map, (List<? extends Object>) list);
    }
}
