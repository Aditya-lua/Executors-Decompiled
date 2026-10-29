package p617ou;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.InterfaceC7720d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mu.EnumC8666a;
import mu.InterfaceC8687v;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7878j0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ou.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH¤@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0015\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0096@¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001c\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, m31665d2 = {"Lou/g;", "S", "T", "Lou/e;", "Lnu/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lnu/h;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "Lnu/i;", "collector", "", "q", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "Lmu/v;", "scope", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "collect", "", "toString", "()Ljava/lang/String;", "newContext", "p", "(Lnu/i;Lkotlin/coroutines/CoroutineContext;Lnt/b;)Ljava/lang/Object;", "Lnu/h;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC10057g<S, T> extends AbstractC10055e<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<S> flow;

    /* JADX INFO: renamed from: ou.g$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"T", "Lnu/i;", "it", "", "<anonymous>", "(Lnu/i;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m39664f = "ChannelFlow.kt", m39665l = {148}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC9577i<? super T>, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36210t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f36211u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC10057g<S, T> f36212v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC10057g<S, T> abstractC10057g, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36212v = abstractC10057g;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            a aVar = new a(this.f36212v, interfaceC9557b);
            aVar.f36211u = obj;
            return aVar;
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f36210t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9577i<? super T> interfaceC9577i = (InterfaceC9577i) this.f36211u;
                AbstractC10057g<S, T> abstractC10057g = this.f36212v;
                this.f36210t = 1;
                if (abstractC10057g.mo38828q(interfaceC9577i, this) == objM38805e) {
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

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC9577i, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends S> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC10057g(@NotNull InterfaceC9575h<? extends S> interfaceC9575h, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        super(coroutineContext, i10, enumC8666a);
        this.flow = interfaceC9575h;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ <S, T> Object m38825n(AbstractC10057g<S, T> abstractC10057g, InterfaceC9577i<? super T> interfaceC9577i, InterfaceC9557b<? super Unit> interfaceC9557b) {
        if (abstractC10057g.capacity == -3) {
            CoroutineContext context = interfaceC9557b.getContext();
            CoroutineContext coroutineContextM32704j = C7878j0.m32704j(context, abstractC10057g.context);
            if (Intrinsics.m31980c(coroutineContextM32704j, context)) {
                Object objMo38828q = abstractC10057g.mo38828q(interfaceC9577i, interfaceC9557b);
                return objMo38828q == C10047c.m38805e() ? objMo38828q : Unit.f29331a;
            }
            InterfaceC7720d.Companion companion = InterfaceC7720d.INSTANCE;
            if (Intrinsics.m31980c(coroutineContextM32704j.get(companion), context.get(companion))) {
                Object objM38827p = abstractC10057g.m38827p(interfaceC9577i, coroutineContextM32704j, interfaceC9557b);
                return objM38827p == C10047c.m38805e() ? objM38827p : Unit.f29331a;
            }
        }
        Object objCollect = super.collect(interfaceC9577i, interfaceC9557b);
        return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ <S, T> Object m38826o(AbstractC10057g<S, T> abstractC10057g, InterfaceC8687v<? super T> interfaceC8687v, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objMo38828q = abstractC10057g.mo38828q(new C10076z(interfaceC8687v), interfaceC9557b);
        return objMo38828q == C10047c.m38805e() ? objMo38828q : Unit.f29331a;
    }

    @Override // p617ou.AbstractC10055e, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m38825n(this, interfaceC9577i, interfaceC9557b);
    }

    @Override // p617ou.AbstractC10055e
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo37705d(@NotNull InterfaceC8687v<? super T> interfaceC8687v, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m38826o(this, interfaceC8687v, interfaceC9557b);
    }

    /* JADX DEBUG: Class process forced to load method for inline: ou.f.a(nu.i, kotlin.coroutines.CoroutineContext):nu.i */
    /* JADX INFO: renamed from: p */
    public final Object m38827p(InterfaceC9577i<? super T> interfaceC9577i, CoroutineContext coroutineContext, InterfaceC9557b<? super Unit> interfaceC9557b) {
        return C10056f.m38823d(coroutineContext, C10056f.m38824e(interfaceC9577i, interfaceC9557b.getContext()), null, new a(this, null), interfaceC9557b, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public abstract Object mo38828q(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    @Override // p617ou.AbstractC10055e
    @NotNull
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
