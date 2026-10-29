package f1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k extends r0.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f15870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f15871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x2.a<b2> f15872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f15873k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f15874l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f15875m;

    public k(u uVar, Executor executor, x2.a<b2> aVar, boolean z10, boolean z11, long j10) {
        if (uVar == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f15870h = uVar;
        this.f15871i = executor;
        this.f15872j = aVar;
        this.f15873k = z10;
        this.f15874l = z11;
        this.f15875m = j10;
    }

    public boolean equals(Object obj) {
        Executor executor;
        x2.a<b2> aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0.j) {
            r0.j jVar = (r0.j) obj;
            if (this.f15870h.equals(jVar.o()) && ((executor = this.f15871i) != null ? executor.equals(jVar.m()) : jVar.m() == null) && ((aVar = this.f15872j) != null ? aVar.equals(jVar.n()) : jVar.n() == null) && this.f15873k == jVar.s() && this.f15874l == jVar.w() && this.f15875m == jVar.q()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f15870h.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f15871i;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        x2.a<b2> aVar = this.f15872j;
        int iHashCode3 = (((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ (this.f15873k ? 1231 : 1237)) * 1000003;
        int i10 = this.f15874l ? 1231 : 1237;
        long j10 = this.f15875m;
        return ((iHashCode3 ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // f1.r0.j
    public Executor m() {
        return this.f15871i;
    }

    @Override // f1.r0.j
    public x2.a<b2> n() {
        return this.f15872j;
    }

    @Override // f1.r0.j
    public u o() {
        return this.f15870h;
    }

    @Override // f1.r0.j
    public long q() {
        return this.f15875m;
    }

    @Override // f1.r0.j
    public boolean s() {
        return this.f15873k;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f15870h + ", getCallbackExecutor=" + this.f15871i + ", getEventListener=" + this.f15872j + ", hasAudioEnabled=" + this.f15873k + ", isPersistent=" + this.f15874l + ", getRecordingId=" + this.f15875m + "}";
    }

    @Override // f1.r0.j
    public boolean w() {
        return this.f15874l;
    }
}
