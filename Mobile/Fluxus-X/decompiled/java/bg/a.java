package bg;

import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3983a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3984c;

    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3985a;
        public Long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f3986c;

        @Override // bg.m.a
        public m a() {
            String str = this.f3985a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " token";
            }
            if (this.b == null) {
                str2 = str2 + " tokenExpirationTimestamp";
            }
            if (this.f3986c == null) {
                str2 = str2 + " tokenCreationTimestamp";
            }
            if (str2.isEmpty()) {
                return new a(this.f3985a, this.b.longValue(), this.f3986c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // bg.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f3985a = str;
            return this;
        }

        @Override // bg.m.a
        public m.a c(long j10) {
            this.f3986c = Long.valueOf(j10);
            return this;
        }

        @Override // bg.m.a
        public m.a d(long j10) {
            this.b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // bg.m
    @NonNull
    public String b() {
        return this.f3983a;
    }

    @Override // bg.m
    @NonNull
    public long c() {
        return this.f3984c;
    }

    @Override // bg.m
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
            if (this.f3983a.equals(mVar.b()) && this.b == mVar.d() && this.f3984c == mVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f3983a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.b;
        long j11 = this.f3984c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f3983a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.f3984c + "}";
    }

    public a(String str, long j10, long j11) {
        this.f3983a = str;
        this.b = j10;
        this.f3984c = j11;
    }
}
