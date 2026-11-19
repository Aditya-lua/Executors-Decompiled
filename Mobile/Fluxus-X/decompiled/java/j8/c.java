package j8;

import com.github.luben.zstd.BuildConfig;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20150a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<f.c> f20151c;

    public static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f20152a;
        public Long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<f.c> f20153c;

        @Override // j8.f.b.a
        public f.b a() {
            Long l10 = this.f20152a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f20153c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f20152a.longValue(), this.b.longValue(), this.f20153c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // j8.f.b.a
        public f.b.a b(long j10) {
            this.f20152a = Long.valueOf(j10);
            return this;
        }

        @Override // j8.f.b.a
        public f.b.a c(Set<f.c> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f20153c = set;
            return this;
        }

        @Override // j8.f.b.a
        public f.b.a d(long j10) {
            this.b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // j8.f.b
    public long b() {
        return this.f20150a;
    }

    @Override // j8.f.b
    public Set<f.c> c() {
        return this.f20151c;
    }

    @Override // j8.f.b
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f20150a == bVar.b() && this.b == bVar.d() && this.f20151c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f20150a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f20151c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f20150a + ", maxAllowedDelay=" + this.b + ", flags=" + this.f20151c + "}";
    }

    public c(long j10, long j11, Set<f.c> set) {
        this.f20150a = j10;
        this.b = j11;
        this.f20151c = set;
    }
}
