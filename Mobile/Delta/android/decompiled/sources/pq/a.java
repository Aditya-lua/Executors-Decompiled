package pq;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lpq/a;", "", "a", "Lpq/a$a;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: pq.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lpq/a$a;", "Lpq/a;", "", "force", "skipBackendCall", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelRequest implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean force;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean skipBackendCall;

        public CancelRequest(boolean z10, boolean z11) {
            this.force = z10;
            this.skipBackendCall = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getForce() {
            return this.force;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getSkipBackendCall() {
            return this.skipBackendCall;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CancelRequest)) {
                return false;
            }
            CancelRequest cancelRequest = (CancelRequest) other;
            return this.force == cancelRequest.force && this.skipBackendCall == cancelRequest.skipBackendCall;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.force) * 31) + Boolean.hashCode(this.skipBackendCall);
        }

        @NotNull
        public String toString() {
            return "CancelRequest(force=" + this.force + ", skipBackendCall=" + this.skipBackendCall + ")";
        }
    }
}
