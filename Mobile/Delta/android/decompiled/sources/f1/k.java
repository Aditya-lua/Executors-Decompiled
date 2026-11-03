package f1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k extends r0.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f16466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f16467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x2.a<b2> f16468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f16469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f16470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f16471m;

    public k(u uVar, Executor executor, x2.a<b2> aVar, boolean z10, boolean z11, long j10) {
        if (uVar == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f16466h = uVar;
        this.f16467i = executor;
        this.f16468j = aVar;
        this.f16469k = z10;
        this.f16470l = z11;
        this.f16471m = j10;
    }

    public boolean equals(Object obj) {
        Executor executor;
        x2.a<b2> aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0.j) {
            r0.j jVar = (r0.j) obj;
            if (this.f16466h.equals(jVar.o()) && ((executor = this.f16467i) != null ? executor.equals(jVar.m()) : jVar.m() == null) && ((aVar = this.f16468j) != null ? aVar.equals(jVar.n()) : jVar.n() == null) && this.f16469k == jVar.s() && this.f16470l == jVar.w() && this.f16471m == jVar.q()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f16466h.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f16467i;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        x2.a<b2> aVar = this.f16468j;
        int iHashCode3 = (((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ (this.f16469k ? 1231 : 1237)) * 1000003;
        int i10 = this.f16470l ? 1231 : 1237;
        long j10 = this.f16471m;
        return ((iHashCode3 ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // f1.r0.j
    public Executor m() {
        return this.f16467i;
    }

    @Override // f1.r0.j
    public x2.a<b2> n() {
        return this.f16468j;
    }

    @Override // f1.r0.j
    public u o() {
        return this.f16466h;
    }

    @Override // f1.r0.j
    public long q() {
        return this.f16471m;
    }

    @Override // f1.r0.j
    public boolean s() {
        return this.f16469k;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f16466h + ", getCallbackExecutor=" + this.f16467i + ", getEventListener=" + this.f16468j + ", hasAudioEnabled=" + this.f16469k + ", isPersistent=" + this.f16470l + ", getRecordingId=" + this.f16471m + "}";
    }

    @Override // f1.r0.j
    public boolean w() {
        return this.f16470l;
    }
}
