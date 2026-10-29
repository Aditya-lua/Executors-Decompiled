package p617ou;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mu.EnumC8666a;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;

/* JADX INFO: renamed from: ou.h */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lou/h;", "T", "Lou/g;", "Lnu/h;", "flow", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lnu/h;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "Lou/e;", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "h", "()Lnu/h;", "Lnu/i;", "collector", "", "q", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10058h<T> extends AbstractC10057g<T, T> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (r1v0 nu.h)
      (wrap kotlin.coroutines.CoroutineContext:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.coroutines.CoroutineContext:0x0004: SGET  A[WRAPPED] (LINE:1) kotlin.coroutines.e.a kotlin.coroutines.e) : (r2v0 kotlin.coroutines.CoroutineContext))
      (wrap int:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-3 int) : (r3v0 int))
      (wrap mu.a:?: TERNARY null = ((wrap int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap mu.a:0x000f: SGET  A[WRAPPED] (LINE:2) mu.a.a mu.a) : (r4v0 mu.a))
     A[MD:(nu.h<? extends T>, kotlin.coroutines.CoroutineContext, int, mu.a):void (m)] (LINE:3) call: ou.h.<init>(nu.h, kotlin.coroutines.CoroutineContext, int, mu.a):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C10058h(InterfaceC9575h interfaceC9575h, CoroutineContext coroutineContext, int i10, EnumC8666a enumC8666a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC9575h, (i11 & 2) != 0 ? C7721e.f29393a : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? EnumC8666a.SUSPEND : enumC8666a);
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: f */
    public AbstractC10055e<T> mo37706f(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        return new C10058h(this.flow, context, capacity, onBufferOverflow);
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: h */
    public InterfaceC9575h<T> mo37714h() {
        return (InterfaceC9575h<T>) this.flow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p617ou.AbstractC10057g
    @Nullable
    /* JADX INFO: renamed from: q */
    public Object mo38828q(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objCollect = this.flow.collect((InterfaceC9577i<? super S>) interfaceC9577i, interfaceC9557b);
        return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
    }

    public C10058h(@NotNull InterfaceC9575h<? extends T> interfaceC9575h, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        super(interfaceC9575h, coroutineContext, i10, enumC8666a);
    }
}
