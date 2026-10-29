package p617ou;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import p315nt.InterfaceC9557b;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: ou.w, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, m31665d2 = {"Lkotlin/Function3;", "Lnu/i;", "", "Lnt/b;", "", "a", "Lzt/n;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class Function3 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final InterfaceC14057n<InterfaceC9577i<Object>, Object, InterfaceC9557b<? super Unit>, Object> f36274a;

    /* JADX INFO: renamed from: ou.w$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class a extends C7744k implements InterfaceC14057n<InterfaceC9577i<? super Object>, Object, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        public static final a f36275a = new a();

        public a() {
            super(3, InterfaceC9577i.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // p615zt.InterfaceC14057n
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<Object> interfaceC9577i, Object obj, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return interfaceC9577i.emit(obj, interfaceC9557b);
        }
    }

    static {
        a aVar = a.f36275a;
        Intrinsics.m31981d(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f36274a = (InterfaceC14057n) C7739h0.m32040e(aVar, 3);
    }
}
