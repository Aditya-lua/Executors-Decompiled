package p239k6;

import hu.InterfaceC6567c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.AbstractC7717a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import mt.C8662a;
import org.jetbrains.annotations.NotNull;
import p096e7.C4851c0;
import p096e7.C4876v;
import p096e7.InterfaceC4858g;
import p096e7.InterfaceC4864j;
import p096e7.InterfaceC4875u;
import p229jt.C7352s;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7893m0;
import p256ku.InterfaceC7906p0;
import p287m6.InterfaceC8435i;
import p323o6.C9695c;
import p323o6.C9699g;
import p323o6.C9703k;
import p323o6.InterfaceC9702j;
import p372q6.C10437b;
import p372q6.C10439d;
import p403r6.C10789d;
import p403r6.C10791f;
import p560xu.C12931h0;

/* JADX INFO: renamed from: k6.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Le7/u;", "logger", "Lku/p0;", "c", "(Le7/u;)Lku/p0;", "Lk6/h$a;", "Lk6/w$a;", "options", "f", "(Lk6/h$a;Lk6/w$a;)Lk6/h$a;", "e", "(Lk6/h$a;)Lk6/h$a;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7486z {

    /* JADX INFO: renamed from: k6.z$a */
    @Metadata(m31664d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"k6/z$a", "Lkotlin/coroutines/a;", "Lku/m0;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC7717a implements InterfaceC7893m0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC4875u f28834b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC7893m0.Companion companion, InterfaceC4875u interfaceC4875u) {
            super(companion);
            this.f28834b = interfaceC4875u;
        }

        @Override // p256ku.InterfaceC7893m0
        public void handleException(CoroutineContext context, Throwable exception) {
            InterfaceC4875u interfaceC4875u = this.f28834b;
            if (interfaceC4875u != null) {
                C4876v.m23487a(interfaceC4875u, "RealImageLoader", exception);
            }
        }
    }

    /* JADX INFO: renamed from: k6.z$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(Integer.valueOf(((InterfaceC4864j) t10).priority()), Integer.valueOf(((InterfaceC4864j) t8).priority()));
        }
    }

    /* JADX INFO: renamed from: k6.z$c */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t8, T t10) {
            return C8662a.m34743a(Integer.valueOf(((InterfaceC4858g) t10).priority()), Integer.valueOf(((InterfaceC4858g) t8).priority()));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC7906p0 m31110c(InterfaceC4875u interfaceC4875u) {
        return C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(new a(InterfaceC7893m0.INSTANCE, interfaceC4875u)));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final C7465h.a m31112e(@NotNull C7465h.a aVar) {
        return aVar.m31010k(new C10791f(), C7731d0.m32002b(String.class)).m31010k(new C10789d(), C7731d0.m32002b(C12931h0.class)).m31009j(new C10437b(), C7731d0.m32002b(C7466h0.class)).m31009j(new C10439d(), C7731d0.m32002b(C7466h0.class)).m31007h(new C9703k.a(), C7731d0.m32002b(C7466h0.class)).m31007h(new C9695c.a(), C7731d0.m32002b(byte[].class)).m31007h(new C9699g.b(), C7731d0.m32002b(C7466h0.class));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final C7465h.a m31113f(@NotNull C7465h.a aVar, @NotNull C7483w.Options options) {
        if (C7480t.m31081a(options)) {
            aVar.m31012o(new Function0() { // from class: k6.x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7486z.m31114g();
                }
            });
            aVar.m31011n(new Function0() { // from class: k6.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7486z.m31115h();
                }
            });
        }
        return aVar;
    }

    /* JADX INFO: renamed from: g */
    public static final List m31114g() {
        InterfaceC6567c interfaceC6567cType;
        List listF0 = CollectionsKt.m31680F0(C4851c0.f19541a.m23420f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = listF0.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC4864j interfaceC4864j = (InterfaceC4864j) listF0.get(i10);
            Intrinsics.m31981d(interfaceC4864j, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            InterfaceC9702j.a aVarMo23466a = interfaceC4864j.mo23466a();
            Pair pairM30477a = null;
            if (aVarMo23466a != null && (interfaceC6567cType = interfaceC4864j.type()) != null) {
                pairM30477a = C7352s.m30477a(aVarMo23466a, interfaceC6567cType);
            }
            if (pairM30477a != null) {
                arrayList.add(pairM30477a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final List m31115h() {
        List listF0 = CollectionsKt.m31680F0(C4851c0.f19541a.m23419e(), new c());
        ArrayList arrayList = new ArrayList();
        int size = listF0.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC8435i.a aVarMo204a = ((InterfaceC4858g) listF0.get(i10)).mo204a();
            if (aVarMo204a != null) {
                arrayList.add(aVarMo204a);
            }
        }
        return arrayList;
    }
}
