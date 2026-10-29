package sh;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sh.a, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsh/a;", "", "", "maxRetries", "", "baseDelayMs", "<init>", "(IJ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "J", "()J", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpBackOffRetryPolicy {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final int maxRetries;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long baseDelayMs;

    public ExpBackOffRetryPolicy() {
        this(0, 0L, 3, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBaseDelayMs() {
        return this.baseDelayMs;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpBackOffRetryPolicy)) {
            return false;
        }
        ExpBackOffRetryPolicy expBackOffRetryPolicy = (ExpBackOffRetryPolicy) other;
        return this.maxRetries == expBackOffRetryPolicy.maxRetries && this.baseDelayMs == expBackOffRetryPolicy.baseDelayMs;
    }

    public int hashCode() {
        return (Integer.hashCode(this.maxRetries) * 31) + Long.hashCode(this.baseDelayMs);
    }

    @NotNull
    public String toString() {
        return "ExpBackOffRetryPolicy(maxRetries=" + this.maxRetries + ", baseDelayMs=" + this.baseDelayMs + ")";
    }

    public ExpBackOffRetryPolicy(int i10, long j10) {
        this.maxRetries = i10;
        this.baseDelayMs = j10;
    }

    public /* synthetic */ ExpBackOffRetryPolicy(int i10, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 3 : i10, (i11 & 2) != 0 ? 2000L : j10);
    }
}
