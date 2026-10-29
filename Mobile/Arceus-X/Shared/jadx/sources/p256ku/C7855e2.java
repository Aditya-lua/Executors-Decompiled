package p256ku;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ku.e2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, m31665d2 = {"Lku/e2;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "", "message", "", "cause", "Lku/d2;", "job", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;Lku/d2;)V", "fillInStackTrace", "()Ljava/lang/Throwable;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lku/d2;", "_job", "()Lku/d2;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C7855e2 extends CancellationException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final transient InterfaceC7850d2 _job;

    public C7855e2(@NotNull String str, @Nullable Throwable th2, @NotNull InterfaceC7850d2 interfaceC7850d2) {
        super(str);
        this._job = interfaceC7850d2;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC7850d2 m32631a() {
        InterfaceC7850d2 interfaceC7850d2 = this._job;
        return interfaceC7850d2 == null ? C7908p2.f29789b : interfaceC7850d2;
    }

    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof C7855e2)) {
            return false;
        }
        C7855e2 c7855e2 = (C7855e2) other;
        return Intrinsics.m31980c(c7855e2.getMessage(), getMessage()) && Intrinsics.m31980c(c7855e2.m32631a(), m32631a()) && Intrinsics.m31980c(c7855e2.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int iHashCode = message.hashCode() * 31;
        InterfaceC7850d2 interfaceC7850d2M32631a = m32631a();
        int iHashCode2 = (iHashCode + (interfaceC7850d2M32631a != null ? interfaceC7850d2M32631a.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + m32631a();
    }
}
