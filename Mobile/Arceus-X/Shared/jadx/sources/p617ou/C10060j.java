package p617ou;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mu.C8685t;
import mu.EnumC8666a;
import mu.InterfaceC8687v;
import mu.InterfaceC8689x;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ou.j */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lou/j;", "T", "Lou/e;", "", "Lnu/h;", "flows", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Ljava/lang/Iterable;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "Lku/p0;", "scope", "Lmu/x;", "m", "(Lku/p0;)Lmu/x;", "Lmu/v;", "", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "Ljava/lang/Iterable;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10060j<T> extends AbstractC10055e<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Iterable<InterfaceC9575h<T>> flows;

    /* JADX INFO: renamed from: ou.j$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", m39664f = "Merge.kt", m39665l = {92}, m39666m = "invokeSuspend")
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36233t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ InterfaceC9575h<T> f36234u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C10076z<T> f36235v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: nu.h<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC9575h<? extends T> interfaceC9575h, C10076z<T> c10076z, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36234u = interfaceC9575h;
            this.f36235v = c10076z;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f36234u, this.f36235v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f36233t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h<T> interfaceC9575h = this.f36234u;
                C10076z<T> c10076z = this.f36235v;
                this.f36233t = 1;
                if (interfaceC9575h.collect(c10076z, this) == objM38805e) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (r1v0 java.lang.Iterable)
      (wrap kotlin.coroutines.CoroutineContext:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.coroutines.CoroutineContext:0x0004: SGET  A[WRAPPED] (LINE:1) kotlin.coroutines.e.a kotlin.coroutines.e) : (r2v0 kotlin.coroutines.CoroutineContext))
      (wrap int:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r3v0 int))
      (wrap mu.a:?: TERNARY null = ((wrap int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap mu.a:0x000f: SGET  A[WRAPPED] (LINE:2) mu.a.a mu.a) : (r4v0 mu.a))
     A[MD:(java.lang.Iterable<? extends nu.h<? extends T>>, kotlin.coroutines.CoroutineContext, int, mu.a):void (m)] (LINE:3) call: ou.j.<init>(java.lang.Iterable, kotlin.coroutines.CoroutineContext, int, mu.a):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C10060j(Iterable iterable, CoroutineContext coroutineContext, int i10, EnumC8666a enumC8666a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iterable, (i11 & 2) != 0 ? C7721e.f29393a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? EnumC8666a.SUSPEND : enumC8666a);
    }

    @Override // p617ou.AbstractC10055e
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo37705d(@NotNull InterfaceC8687v<? super T> interfaceC8687v, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        C10076z c10076z = new C10076z(interfaceC8687v);
        Iterator<InterfaceC9575h<T>> it = this.flows.iterator();
        while (it.hasNext()) {
            C7882k.m32780d(interfaceC8687v, null, null, new a(it.next(), c10076z, null), 3, null);
        }
        return Unit.f29331a;
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: f */
    public AbstractC10055e<T> mo37706f(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        return new C10060j(this.flows, context, capacity, onBufferOverflow);
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: m */
    public InterfaceC8689x<T> mo37715m(@NotNull InterfaceC7906p0 scope) {
        return C8685t.m34965b(scope, this.context, this.capacity, m38817k());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Iterable<? extends nu.h<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C10060j(@NotNull Iterable<? extends InterfaceC9575h<? extends T>> iterable, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        super(coroutineContext, i10, enumC8666a);
        this.flows = iterable;
    }
}
