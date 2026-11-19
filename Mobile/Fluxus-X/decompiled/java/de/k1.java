package de;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12212a;
    public final long b;

    public k1(int i10, long j10) {
        this.f12212a = i10;
        this.b = j10;
    }

    @Override // de.l1
    public final int a() {
        return this.f12212a;
    }

    @Override // de.l1
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            if (this.f12212a == l1Var.a() && this.b == l1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f12212a ^ 1000003;
        long j10 = this.b;
        return (i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f12212a + ", eventTimestamp=" + this.b + "}";
    }
}
