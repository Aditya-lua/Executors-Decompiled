package i8;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20348a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<f.c> f20349c;

    public static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f20350a;
        public Long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<f.c> f20351c;

        @Override // i8.f.b.a
        public f.b a() {
            String str = "";
            if (this.f20350a == null) {
                str = " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f20351c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f20350a.longValue(), this.b.longValue(), this.f20351c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // i8.f.b.a
        public f.b.a b(long j10) {
            this.f20350a = Long.valueOf(j10);
            return this;
        }

        @Override // i8.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f20351c = set;
            return this;
        }

        @Override // i8.f.b.a
        public f.b.a d(long j10) {
            this.b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // i8.f.b
    public long b() {
        return this.f20348a;
    }

    @Override // i8.f.b
    public Set<f.c> c() {
        return this.f20349c;
    }

    @Override // i8.f.b
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f20348a == bVar.b() && this.b == bVar.d() && this.f20349c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f20348a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f20349c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f20348a + ", maxAllowedDelay=" + this.b + ", flags=" + this.f20349c + "}";
    }

    public c(long j10, long j11, Set<f.c> set) {
        this.f20348a = j10;
        this.b = j11;
        this.f20349c = set;
    }
}
