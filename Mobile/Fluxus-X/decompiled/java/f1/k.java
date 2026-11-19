package f1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k extends r0.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f14943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f14944i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x2.a<b2> f14945j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f14946k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f14947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f14948m;

    public k(u uVar, Executor executor, x2.a<b2> aVar, boolean z10, boolean z11, long j10) {
        if (uVar == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f14943h = uVar;
        this.f14944i = executor;
        this.f14945j = aVar;
        this.f14946k = z10;
        this.f14947l = z11;
        this.f14948m = j10;
    }

    public boolean equals(Object obj) {
        Executor executor;
        x2.a<b2> aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0.j) {
            r0.j jVar = (r0.j) obj;
            if (this.f14943h.equals(jVar.p()) && ((executor = this.f14944i) != null ? executor.equals(jVar.n()) : jVar.n() == null) && ((aVar = this.f14945j) != null ? aVar.equals(jVar.o()) : jVar.o() == null) && this.f14946k == jVar.u() && this.f14947l == jVar.z() && this.f14948m == jVar.r()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f14943h.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f14944i;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        x2.a<b2> aVar = this.f14945j;
        int iHashCode3 = (((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ (this.f14946k ? 1231 : 1237)) * 1000003;
        int i10 = this.f14947l ? 1231 : 1237;
        long j10 = this.f14948m;
        return ((iHashCode3 ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // f1.r0.j
    public Executor n() {
        return this.f14944i;
    }

    @Override // f1.r0.j
    public x2.a<b2> o() {
        return this.f14945j;
    }

    @Override // f1.r0.j
    public u p() {
        return this.f14943h;
    }

    @Override // f1.r0.j
    public long r() {
        return this.f14948m;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f14943h + ", getCallbackExecutor=" + this.f14944i + ", getEventListener=" + this.f14945j + ", hasAudioEnabled=" + this.f14946k + ", isPersistent=" + this.f14947l + ", getRecordingId=" + this.f14948m + "}";
    }

    @Override // f1.r0.j
    public boolean u() {
        return this.f14946k;
    }

    @Override // f1.r0.j
    public boolean z() {
        return this.f14947l;
    }
}
