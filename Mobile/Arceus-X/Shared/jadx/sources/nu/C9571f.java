package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mu.EnumC8666a;
import mu.InterfaceC8687v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p617ou.AbstractC10055e;

/* JADX INFO: renamed from: nu.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R6\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, m31665d2 = {"Lnu/f;", "T", "Lou/e;", "Lkotlin/Function2;", "Lmu/v;", "Lnt/b;", "", "", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILmu/a;)V", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "scope", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public class C9571f<T> extends AbstractC10055e<T> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Function2<InterfaceC8687v<? super T>, InterfaceC9557b<? super Unit>, Object> block;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
      (r1v0 kotlin.jvm.functions.Function2)
      (wrap kotlin.coroutines.CoroutineContext:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.coroutines.CoroutineContext:0x0004: SGET  A[WRAPPED] (LINE:1) kotlin.coroutines.e.a kotlin.coroutines.e) : (r2v0 kotlin.coroutines.CoroutineContext))
      (wrap int:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r3v0 int))
      (wrap mu.a:?: TERNARY null = ((wrap int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap mu.a:0x000f: SGET  A[WRAPPED] (LINE:2) mu.a.a mu.a) : (r4v0 mu.a))
     A[MD:(kotlin.jvm.functions.Function2<? super mu.v<? super T>, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object>, kotlin.coroutines.CoroutineContext, int, mu.a):void (m)] (LINE:3) call: nu.f.<init>(kotlin.jvm.functions.Function2, kotlin.coroutines.CoroutineContext, int, mu.a):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C9571f(Function2 function2, CoroutineContext coroutineContext, int i10, EnumC8666a enumC8666a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? C7721e.f29393a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? EnumC8666a.SUSPEND : enumC8666a);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ <T> Object m37717n(C9571f<T> c9571f, InterfaceC8687v<? super T> interfaceC8687v, InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objInvoke = c9571f.block.invoke(interfaceC8687v, interfaceC9557b);
        return objInvoke == C10047c.m38805e() ? objInvoke : Unit.f29331a;
    }

    @Override // p617ou.AbstractC10055e
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo37705d(@NotNull InterfaceC8687v<? super T> interfaceC8687v, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        return m37717n(this, interfaceC8687v, interfaceC9557b);
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: f */
    public AbstractC10055e<T> mo37706f(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        return new C9571f(this.block, context, capacity, onBufferOverflow);
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super mu.v<? super T>, ? super nt.b<? super kotlin.Unit>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9571f(@NotNull Function2<? super InterfaceC8687v<? super T>, ? super InterfaceC9557b<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        super(coroutineContext, i10, enumC8666a);
        this.block = function2;
    }
}
