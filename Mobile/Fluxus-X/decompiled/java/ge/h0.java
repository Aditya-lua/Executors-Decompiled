package ge;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17714a;
    public final long b;

    public h0(int i10, long j10) {
        this.f17714a = i10;
        this.b = j10;
    }

    @Override // ge.i0
    public final int a() {
        return this.f17714a;
    }

    @Override // ge.i0
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f17714a == i0Var.a() && this.b == i0Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.b;
        return ((int) (j10 ^ (j10 >>> 32))) ^ ((this.f17714a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f17714a + ", eventTimestamp=" + this.b + "}";
    }
}
