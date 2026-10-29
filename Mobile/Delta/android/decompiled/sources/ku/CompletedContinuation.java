package ku;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.b0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\t2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013Jh\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\"\b\u0002\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R.\u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0011\u0010(\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b#\u0010'¨\u0006)"}, d2 = {"Lku/b0;", "R", "", "result", "Lku/m;", "cancelHandler", "Lkotlin/Function3;", "", "Lkotlin/coroutines/CoroutineContext;", "", "onCancellation", "idempotentResume", "cancelCause", "<init>", "(Ljava/lang/Object;Lku/m;Lzt/n;Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lku/p;", "cont", "cause", "d", "(Lku/p;Ljava/lang/Throwable;)V", "a", "(Ljava/lang/Object;Lku/m;Lzt/n;Ljava/lang/Object;Ljava/lang/Throwable;)Lku/b0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "b", "Lku/m;", "c", "Lzt/n;", "e", "Ljava/lang/Throwable;", "()Z", "cancelled", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CompletedContinuation<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final R result;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final m cancelHandler;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final zt.n<Throwable, R, CoroutineContext, Unit> onCancellation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Object idempotentResume;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Throwable cancelCause;

    /* JADX WARN: Multi-variable type inference failed */
    public CompletedContinuation(R r8, @Nullable m mVar, @Nullable zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar, @Nullable Object obj, @Nullable Throwable th2) {
        this.result = r8;
        this.cancelHandler = mVar;
        this.onCancellation = nVar;
        this.idempotentResume = obj;
        this.cancelCause = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation b(CompletedContinuation completedContinuation, Object obj, m mVar, zt.n nVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = completedContinuation.result;
        }
        if ((i10 & 2) != 0) {
            mVar = completedContinuation.cancelHandler;
        }
        if ((i10 & 4) != 0) {
            nVar = completedContinuation.onCancellation;
        }
        if ((i10 & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        if ((i10 & 16) != 0) {
            th2 = completedContinuation.cancelCause;
        }
        Throwable th3 = th2;
        zt.n nVar2 = nVar;
        return completedContinuation.a(obj, mVar, nVar2, obj2, th3);
    }

    @NotNull
    public final CompletedContinuation<R> a(R result, @Nullable m cancelHandler, @Nullable zt.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> onCancellation, @Nullable Object idempotentResume, @Nullable Throwable cancelCause) {
        return new CompletedContinuation<>(result, cancelHandler, onCancellation, idempotentResume, cancelCause);
    }

    public final boolean c() {
        return this.cancelCause != null;
    }

    public final void d(@NotNull p<?> cont, @NotNull Throwable cause) {
        m mVar = this.cancelHandler;
        if (mVar != null) {
            cont.q(mVar, cause);
        }
        zt.n<Throwable, R, CoroutineContext, Unit> nVar = this.onCancellation;
        if (nVar != null) {
            cont.r(nVar, cause, this.result);
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
        return Intrinsics.c(this.result, completedContinuation.result) && Intrinsics.c(this.cancelHandler, completedContinuation.cancelHandler) && Intrinsics.c(this.onCancellation, completedContinuation.onCancellation) && Intrinsics.c(this.idempotentResume, completedContinuation.idempotentResume) && Intrinsics.c(this.cancelCause, completedContinuation.cancelCause);
    }

    public int hashCode() {
        R r8 = this.result;
        int iHashCode = (r8 == null ? 0 : r8.hashCode()) * 31;
        m mVar = this.cancelHandler;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        zt.n<Throwable, R, CoroutineContext, Unit> nVar = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.cancelCause;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    public /* synthetic */ CompletedContinuation(Object obj, m mVar, zt.n nVar, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
