package bg;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4179a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b f4180c;

    /* JADX INFO: renamed from: bg.b$b, reason: collision with other inner class name */
    public static final class C0082b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f4181a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.b f4182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f4183d;

        @Override // bg.f.a
        public f a() {
            if (this.f4183d == 1) {
                return new b(this.f4181a, this.b, this.f4182c);
            }
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }

        @Override // bg.f.a
        public f.a b(f.b bVar) {
            this.f4182c = bVar;
            return this;
        }

        @Override // bg.f.a
        public f.a c(String str) {
            this.f4181a = str;
            return this;
        }

        @Override // bg.f.a
        public f.a d(long j10) {
            this.b = j10;
            this.f4183d = (byte) (this.f4183d | 1);
            return this;
        }
    }

    @Override // bg.f
    public f.b b() {
        return this.f4180c;
    }

    @Override // bg.f
    public String c() {
        return this.f4179a;
    }

    @Override // bg.f
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
            String str = this.f4179a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.b == fVar.d() && ((bVar = this.f4180c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4179a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j10 = this.b;
        int i10 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f4180c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f4179a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.f4180c + "}";
    }

    public b(String str, long j10, f.b bVar) {
        this.f4179a = str;
        this.b = j10;
        this.f4180c = bVar;
    }
}
