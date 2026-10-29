package p256ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: ku.b0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013Jh\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R.\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010'¨\u0006)"}, m31665d2 = {"Lku/b0;", "R", "", "result", "Lku/m;", "cancelHandler", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;Lku/m;Lzt/n;Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lku/p;", "cont", "cause", "d", "(Lku/p;Ljava/lang/Throwable;)V", "a", "(Ljava/lang/Object;Lku/m;Lzt/n;Ljava/lang/Object;Ljava/lang/Throwable;)Lku/b0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "b", "Lku/m;", "c", "Lzt/n;", "e", "Ljava/lang/Throwable;", "()Z", "cancelled", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final /* data */ class CompletedContinuation<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final R result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final InterfaceC7892m cancelHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final InterfaceC14057n<Throwable, R, CoroutineContext, Unit> onCancellation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Object idempotentResume;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final Throwable cancelCause;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: zt.n<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(R r8, @Nullable InterfaceC7892m interfaceC7892m, @Nullable InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> interfaceC14057n, @Nullable Object obj, @Nullable Throwable th2) {
        this.result = r8;
        this.cancelHandler = interfaceC7892m;
        this.onCancellation = interfaceC14057n;
        this.idempotentResume = obj;
        this.cancelCause = th2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: ku.b0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ CompletedContinuation m32569b(CompletedContinuation completedContinuation, Object obj, InterfaceC7892m interfaceC7892m, InterfaceC14057n interfaceC14057n, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = completedContinuation.result;
        }
        if ((i10 & 2) != 0) {
            interfaceC7892m = completedContinuation.cancelHandler;
        }
        if ((i10 & 4) != 0) {
            interfaceC14057n = completedContinuation.onCancellation;
        }
        if ((i10 & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        if ((i10 & 16) != 0) {
            th2 = completedContinuation.cancelCause;
        }
        Throwable th3 = th2;
        InterfaceC14057n interfaceC14057n2 = interfaceC14057n;
        return completedContinuation.m32570a(obj, interfaceC7892m, interfaceC14057n2, obj2, th3);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final CompletedContinuation<R> m32570a(R result, @Nullable InterfaceC7892m cancelHandler, @Nullable InterfaceC14057n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, @Nullable Object idempotentResume, @Nullable Throwable cancelCause) {
        return new CompletedContinuation<>(result, cancelHandler, onCancellation, idempotentResume, cancelCause);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m32571c() {
        return this.cancelCause != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m32572d(@NotNull C7905p<?> cont, @NotNull Throwable cause) {
        InterfaceC7892m interfaceC7892m = this.cancelHandler;
        if (interfaceC7892m != null) {
            cont.m32876q(interfaceC7892m, cause);
        }
        InterfaceC14057n<Throwable, R, CoroutineContext, Unit> interfaceC14057n = this.onCancellation;
        if (interfaceC14057n != null) {
            cont.m32877r(interfaceC14057n, cause, this.result);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) other;
        return Intrinsics.m31980c(this.result, completedContinuation.result) && Intrinsics.m31980c(this.cancelHandler, completedContinuation.cancelHandler) && Intrinsics.m31980c(this.onCancellation, completedContinuation.onCancellation) && Intrinsics.m31980c(this.idempotentResume, completedContinuation.idempotentResume) && Intrinsics.m31980c(this.cancelCause, completedContinuation.cancelCause);
    }

    public int hashCode() {
        R r8 = this.result;
        int iHashCode = (r8 == null ? 0 : r8.hashCode()) * 31;
        InterfaceC7892m interfaceC7892m = this.cancelHandler;
        int iHashCode2 = (iHashCode + (interfaceC7892m == null ? 0 : interfaceC7892m.hashCode())) * 31;
        InterfaceC14057n<Throwable, R, CoroutineContext, Unit> interfaceC14057n = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (interfaceC14057n == null ? 0 : interfaceC14057n.hashCode())) * 31;
        Object obj = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.cancelCause;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
      (r2v0 java.lang.Object)
      (wrap ku.m:?: TERNARY null = ((wrap int:0x0000: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null ku.m) : (r3v0 ku.m))
      (wrap zt.n:?: TERNARY null = ((wrap int:0x0006: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null zt.n) : (r4v0 zt.n))
      (wrap java.lang.Object:?: TERNARY null = ((wrap int:0x000b: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r5v0 java.lang.Object))
      (wrap java.lang.Throwable:?: TERNARY null = ((wrap int:0x0010: ARITH (r7v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r6v0 java.lang.Throwable))
     A[MD:(R, ku.m, zt.n<? super java.lang.Throwable, ? super R, ? super kotlin.coroutines.CoroutineContext, kotlin.Unit>, java.lang.Object, java.lang.Throwable):void (m)] (LINE:7) call: ku.b0.<init>(java.lang.Object, ku.m, zt.n, java.lang.Object, java.lang.Throwable):void type: THIS */
    public /* synthetic */ CompletedContinuation(Object obj, InterfaceC7892m interfaceC7892m, InterfaceC14057n interfaceC14057n, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : interfaceC7892m, (i10 & 4) != 0 ? null : interfaceC14057n, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
