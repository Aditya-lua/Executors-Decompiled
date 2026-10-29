package p183i1;

/* JADX INFO: renamed from: i1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6627v extends InterfaceC6621p.c {

    /* JADX INFO: renamed from: a */
    public final int f25571a;

    /* JADX INFO: renamed from: b */
    public final long f25572b;

    public C6627v(int i10, long j10) {
        this.f25571a = i10;
        this.f25572b = j10;
    }

    @Override // p183i1.InterfaceC6621p.c
    /* JADX INFO: renamed from: a */
    public int mo28586a() {
        return this.f25571a;
    }

    @Override // p183i1.InterfaceC6621p.c
    /* JADX INFO: renamed from: b */
    public long mo28587b() {
        return this.f25572b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC6621p.c) {
            InterfaceC6621p.c cVar = (InterfaceC6621p.c) obj;
            if (this.f25571a == cVar.mo28586a() && this.f25572b == cVar.mo28587b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f25571a ^ 1000003) * 1000003;
        long j10 = this.f25572b;
        return i10 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "PacketInfo{sizeInBytes=" + this.f25571a + ", timestampNs=" + this.f25572b + "}";
    }
}
