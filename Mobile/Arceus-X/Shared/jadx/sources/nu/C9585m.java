package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p617ou.C10069s;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: nu.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00002\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00000\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lnu/h;", "", "a", "(Lnu/h;Lnt/b;)Ljava/lang/Object;", "T", "Lku/p0;", "scope", "Lku/d2;", "d", "(Lnu/h;Lku/p0;)Lku/d2;", "Lkotlin/Function2;", "Lnt/b;", "", "action", "b", "(Lnu/h;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "Lnu/i;", "flow", "c", "(Lnu/i;Lnu/h;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class C9585m {

    /* JADX INFO: renamed from: nu.m$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m39664f = "Collect.kt", m39665l = {46}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f34620t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC9575h<T> f34621u;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC9575h<? extends T> interfaceC9575h, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f34621u = interfaceC9575h;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f34621u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f34620t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h<T> interfaceC9575h = this.f34621u;
                this.f34620t = 1;
                if (C9579j.m37792i(interfaceC9575h, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m37824a(@NotNull InterfaceC9575h<?> interfaceC9575h, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objCollect = interfaceC9575h.collect(C10069s.f36265a, interfaceC9557b);
        return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final <T> Object m37825b(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull Function2<? super T, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM37792i = C9579j.m37792i(C9589o.m37835b(C9579j.m37764A(interfaceC9575h, function2), 0, null, 2, null), interfaceC9557b);
        return objM37792i == C10047c.m38805e() ? objM37792i : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <T> Object m37826c(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        C9579j.m37801r(interfaceC9577i);
        Object objCollect = interfaceC9575h.collect(interfaceC9577i, interfaceC9557b);
        return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> InterfaceC7850d2 m37827d(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull InterfaceC7906p0 interfaceC7906p0) {
        return C7882k.m32780d(interfaceC7906p0, null, null, new a(interfaceC9575h, null), 3, null);
    }
}
