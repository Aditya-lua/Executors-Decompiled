package nu;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mu.EnumC8666a;
import mu.InterfaceC8687v;
import mu.InterfaceC8689x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p617ou.AbstractC10055e;
import p617ou.C10076z;

/* JADX INFO: renamed from: nu.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0094@¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u000b\u0010)\u001a\u00020(8\u0002X\u0082\u0004¨\u0006*"}, m31665d2 = {"Lnu/e;", "T", "Lou/e;", "Lmu/x;", "channel", "", "consume", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lmu/a;", "onBufferOverflow", "<init>", "(Lmu/x;ZLkotlin/coroutines/CoroutineContext;ILmu/a;)V", "f", "(Lkotlin/coroutines/CoroutineContext;ILmu/a;)Lou/e;", "Lnu/h;", "h", "()Lnu/h;", "Lmu/v;", "scope", "", "d", "(Lmu/v;Lnt/b;)Ljava/lang/Object;", "Lku/p0;", "m", "(Lku/p0;)Lmu/x;", "Lnu/i;", "collector", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "", "b", "()Ljava/lang/String;", "o", "()V", "Lmu/x;", "e", "Z", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C9569e<T> extends AbstractC10055e<T> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34565f = AtomicIntegerFieldUpdater.newUpdater(C9569e.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC8689x<T> channel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean consume;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
      (r7v0 mu.x)
      (r8v0 boolean)
      (wrap kotlin.coroutines.CoroutineContext:0x0006: TERNARY null = ((wrap int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap kotlin.coroutines.CoroutineContext:0x0004: SGET  A[WRAPPED] (LINE:1) kotlin.coroutines.e.a kotlin.coroutines.e) : (r9v0 kotlin.coroutines.CoroutineContext))
      (wrap int:0x000c: TERNARY null = ((wrap int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-3 int) : (r10v0 int))
      (wrap mu.a:?: TERNARY null = ((wrap int:0x000d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap mu.a:0x0011: SGET  A[WRAPPED] (LINE:2) mu.a.a mu.a) : (r11v0 mu.a))
     A[MD:(mu.x<? extends T>, boolean, kotlin.coroutines.CoroutineContext, int, mu.a):void (m)] (LINE:3) call: nu.e.<init>(mu.x, boolean, kotlin.coroutines.CoroutineContext, int, mu.a):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C9569e(InterfaceC8689x interfaceC8689x, boolean z10, CoroutineContext coroutineContext, int i10, EnumC8666a enumC8666a, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8689x, z10, (i11 & 4) != 0 ? C7721e.f29393a : coroutineContext, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? EnumC8666a.SUSPEND : enumC8666a);
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo37713b() {
        return "channel=" + this.channel;
    }

    @Override // p617ou.AbstractC10055e, nu.InterfaceC9575h
    @Nullable
    public Object collect(@NotNull InterfaceC9577i<? super T> interfaceC9577i, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        if (this.capacity != -3) {
            Object objCollect = super.collect(interfaceC9577i, interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
        m37716o();
        Object objM37821c = C9583l.m37821c(interfaceC9577i, this.channel, this.consume, interfaceC9557b);
        return objM37821c == C10047c.m38805e() ? objM37821c : Unit.f29331a;
    }

    @Override // p617ou.AbstractC10055e
    @Nullable
    /* JADX INFO: renamed from: d */
    public Object mo37705d(@NotNull InterfaceC8687v<? super T> interfaceC8687v, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objM37821c = C9583l.m37821c(new C10076z(interfaceC8687v), this.channel, this.consume, interfaceC9557b);
        return objM37821c == C10047c.m38805e() ? objM37821c : Unit.f29331a;
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: f */
    public AbstractC10055e<T> mo37706f(@NotNull CoroutineContext context, int capacity, @NotNull EnumC8666a onBufferOverflow) {
        return new C9569e(this.channel, this.consume, context, capacity, onBufferOverflow);
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: h */
    public InterfaceC9575h<T> mo37714h() {
        return new C9569e(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // p617ou.AbstractC10055e
    @NotNull
    /* JADX INFO: renamed from: m */
    public InterfaceC8689x<T> mo37715m(@NotNull InterfaceC7906p0 scope) {
        m37716o();
        return this.capacity == -3 ? this.channel : super.mo37715m(scope);
    }

    /* JADX INFO: renamed from: o */
    public final void m37716o() {
        if (this.consume && f34565f.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: mu.x<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C9569e(@NotNull InterfaceC8689x<? extends T> interfaceC8689x, boolean z10, @NotNull CoroutineContext coroutineContext, int i10, @NotNull EnumC8666a enumC8666a) {
        super(coroutineContext, i10, enumC8666a);
        this.channel = interfaceC8689x;
        this.consume = z10;
    }
}
