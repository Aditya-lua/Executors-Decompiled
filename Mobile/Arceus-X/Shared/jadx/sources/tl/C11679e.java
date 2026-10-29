package tl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tl.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\f"}, m31665d2 = {"Ltl/e;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ltl/g;", "reason", "", "cause", "<init>", "(Ltl/g;Ljava/lang/Throwable;)V", "a", "Ltl/g;", "()Ltl/g;", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11679e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final EnumC11683g reason;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 tl.g)
      (wrap java.lang.Throwable:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
     A[MD:(tl.g, java.lang.Throwable):void (m)] (LINE:1) call: tl.e.<init>(tl.g, java.lang.Throwable):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C11679e(EnumC11683g enumC11683g, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC11683g, (i10 & 2) != 0 ? null : th2);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC11683g getReason() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Illegal instructions before constructor call */
    public C11679e(@NotNull EnumC11683g reason, @Nullable Throwable th2) {
        String message;
        Intrinsics.checkNotNullParameter(reason, "reason");
        super((th2 == null || (message = th2.getMessage()) == null) ? reason.name() : message, th2);
        this.reason = reason;
    }
}
