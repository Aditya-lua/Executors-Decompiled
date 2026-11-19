package eg;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13453a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b f13454c;

    /* JADX INFO: renamed from: eg.b$b, reason: collision with other inner class name */
    public static final class C0259b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f13455a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.b f13456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f13457d;

        @Override // eg.f.a
        public f a() {
            if (this.f13457d == 1) {
                return new b(this.f13455a, this.b, this.f13456c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // eg.f.a
        public f.a b(f.b bVar) {
            this.f13456c = bVar;
            return this;
        }

        @Override // eg.f.a
        public f.a c(String str) {
            this.f13455a = str;
            return this;
        }

        @Override // eg.f.a
        public f.a d(long j10) {
            this.b = j10;
            this.f13457d = (byte) (this.f13457d | 1);
            return this;
        }
    }

    @Override // eg.f
    public f.b b() {
        return this.f13454c;
    }

    @Override // eg.f
    public String c() {
        return this.f13453a;
    }

    @Override // eg.f
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
            String str = this.f13453a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.b == fVar.d() && ((bVar = this.f13454c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f13453a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f13454c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f13453a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.f13454c + "}";
    }

    public b(String str, long j10, f.b bVar) {
        this.f13453a = str;
        this.b = j10;
        this.f13454c = bVar;
    }
}
