package cg;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4950a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b f4951c;

    /* JADX INFO: renamed from: cg.b$b, reason: collision with other inner class name */
    public static final class C0105b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4952a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.b f4953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f4954d;

        @Override // cg.f.a
        public f a() {
            if (this.f4954d == 1) {
                return new b(this.f4952a, this.b, this.f4953c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // cg.f.a
        public f.a b(f.b bVar) {
            this.f4953c = bVar;
            return this;
        }

        @Override // cg.f.a
        public f.a c(String str) {
            this.f4952a = str;
            return this;
        }

        @Override // cg.f.a
        public f.a d(long j10) {
            this.b = j10;
            this.f4954d = (byte) (this.f4954d | 1);
            return this;
        }
    }

    @Override // cg.f
    public f.b b() {
        return this.f4951c;
    }

    @Override // cg.f
    public String c() {
        return this.f4950a;
    }

    @Override // cg.f
    @NonNull
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f4950a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.b == fVar.d() && ((bVar = this.f4951c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4950a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f4951c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f4950a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.f4951c + "}";
    }

    public b(String str, long j10, f.b bVar) {
        this.f4950a = str;
        this.b = j10;
        this.f4951c = bVar;
    }
}
