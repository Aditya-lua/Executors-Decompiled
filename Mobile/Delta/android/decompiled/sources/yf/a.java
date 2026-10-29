package yf;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35852a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f35853c;

    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f35854a;
        public Long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f35855c;

        @Override // yf.m.a
        public m a() {
            String str = "";
            if (this.f35854a == null) {
                str = " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f35855c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f35854a, this.b.longValue(), this.f35855c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // yf.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f35854a = str;
            return this;
        }

        @Override // yf.m.a
        public m.a c(long j10) {
            this.f35855c = Long.valueOf(j10);
            return this;
        }

        @Override // yf.m.a
        public m.a d(long j10) {
            this.b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // yf.m
    @NonNull
    public String b() {
        return this.f35852a;
    }

    @Override // yf.m
    @NonNull
    public long c() {
        return this.f35853c;
    }

    @Override // yf.m
    @NonNull
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f35852a.equals(mVar.b()) && this.b == mVar.d() && this.f35853c == mVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f35852a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.b;
        long j11 = this.f35853c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f35852a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.f35853c + "}";
    }

    public a(String str, long j10, long j11) {
        this.f35852a = str;
        this.b = j10;
        this.f35853c = j11;
    }
}
