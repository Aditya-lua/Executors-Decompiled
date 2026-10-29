package p115f1;

import java.util.concurrent.Executor;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: f1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5267k extends C5289r0.j {

    /* JADX INFO: renamed from: h */
    public final AbstractC5297u f20381h;

    /* JADX INFO: renamed from: i */
    public final Executor f20382i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC12631a<AbstractC5241b2> f20383j;

    /* JADX INFO: renamed from: k */
    public final boolean f20384k;

    /* JADX INFO: renamed from: l */
    public final boolean f20385l;

    /* JADX INFO: renamed from: m */
    public final long f20386m;

    public C5267k(AbstractC5297u abstractC5297u, Executor executor, InterfaceC12631a<AbstractC5241b2> interfaceC12631a, boolean z10, boolean z11, long j10) {
        if (abstractC5297u == null) {
            throw new NullPointerException("Null getOutputOptions");
        }
        this.f20381h = abstractC5297u;
        this.f20382i = executor;
        this.f20383j = interfaceC12631a;
        this.f20384k = z10;
        this.f20385l = z11;
        this.f20386m = j10;
    }

    public boolean equals(Object obj) {
        Executor executor;
        InterfaceC12631a<AbstractC5241b2> interfaceC12631a;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5289r0.j) {
            C5289r0.j jVar = (C5289r0.j) obj;
            if (this.f20381h.equals(jVar.mo24330o()) && ((executor = this.f20382i) != null ? executor.equals(jVar.mo24328m()) : jVar.mo24328m() == null) && ((interfaceC12631a = this.f20383j) != null ? interfaceC12631a.equals(jVar.mo24329n()) : jVar.mo24329n() == null) && this.f20384k == jVar.mo24332s() && this.f20385l == jVar.mo24333w() && this.f20386m == jVar.mo24331q()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f20381h.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f20382i;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        InterfaceC12631a<AbstractC5241b2> interfaceC12631a = this.f20383j;
        int iHashCode3 = (((iHashCode2 ^ (interfaceC12631a != null ? interfaceC12631a.hashCode() : 0)) * 1000003) ^ (this.f20384k ? 1231 : 1237)) * 1000003;
        int i10 = this.f20385l ? 1231 : 1237;
        long j10 = this.f20386m;
        return ((iHashCode3 ^ i10) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    @Override // p115f1.C5289r0.j
    /* JADX INFO: renamed from: m */
    public Executor mo24328m() {
        return this.f20382i;
    }

    @Override // p115f1.C5289r0.j
    /* JADX INFO: renamed from: n */
    public InterfaceC12631a<AbstractC5241b2> mo24329n() {
        return this.f20383j;
    }

    @Override // p115f1.C5289r0.j
    /* JADX INFO: renamed from: o */
    public AbstractC5297u mo24330o() {
        return this.f20381h;
    }

    @Override // p115f1.C5289r0.j
    /* JADX INFO: renamed from: q */
    public long mo24331q() {
        return this.f20386m;
    }

    @Override // p115f1.C5289r0.j
    /* JADX INFO: renamed from: s */
    public boolean mo24332s() {
        return this.f20384k;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f20381h + ", getCallbackExecutor=" + this.f20382i + ", getEventListener=" + this.f20383j + ", hasAudioEnabled=" + this.f20384k + ", isPersistent=" + this.f20385l + ", getRecordingId=" + this.f20386m + "}";
    }

    @Override // p115f1.C5289r0.j
    /* JADX INFO: renamed from: w */
    public boolean mo24333w() {
        return this.f20385l;
    }
}
