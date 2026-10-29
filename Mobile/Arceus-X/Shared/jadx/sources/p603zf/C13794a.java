package p603zf;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: zf.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C13794a extends AbstractC13806m {

    /* JADX INFO: renamed from: a */
    public final String f48386a;

    /* JADX INFO: renamed from: b */
    public final long f48387b;

    /* JADX INFO: renamed from: c */
    public final long f48388c;

    /* JADX INFO: renamed from: zf.a$b */
    public static final class b extends AbstractC13806m.a {

        /* JADX INFO: renamed from: a */
        public String f48389a;

        /* JADX INFO: renamed from: b */
        public Long f48390b;

        /* JADX INFO: renamed from: c */
        public Long f48391c;

        @Override // p603zf.AbstractC13806m.a
        /* JADX INFO: renamed from: a */
        public AbstractC13806m mo50242a() {
            String str = "";
            if (this.f48389a == null) {
                str = " token";
            }
            if (this.f48390b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f48391c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C13794a(this.f48389a, this.f48390b.longValue(), this.f48391c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p603zf.AbstractC13806m.a
        /* JADX INFO: renamed from: b */
        public AbstractC13806m.a mo50243b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f48389a = str;
            return this;
        }

        @Override // p603zf.AbstractC13806m.a
        /* JADX INFO: renamed from: c */
        public AbstractC13806m.a mo50244c(long j10) {
            this.f48391c = Long.valueOf(j10);
            return this;
        }

        @Override // p603zf.AbstractC13806m.a
        /* JADX INFO: renamed from: d */
        public AbstractC13806m.a mo50245d(long j10) {
            this.f48390b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p603zf.AbstractC13806m
    @NonNull
    /* JADX INFO: renamed from: b */
    public String mo50239b() {
        return this.f48386a;
    }

    @Override // p603zf.AbstractC13806m
    @NonNull
    /* JADX INFO: renamed from: c */
    public long mo50240c() {
        return this.f48388c;
    }

    @Override // p603zf.AbstractC13806m
    @NonNull
    /* JADX INFO: renamed from: d */
    public long mo50241d() {
        return this.f48387b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC13806m) {
            AbstractC13806m abstractC13806m = (AbstractC13806m) obj;
            if (this.f48386a.equals(abstractC13806m.mo50239b()) && this.f48387b == abstractC13806m.mo50241d() && this.f48388c == abstractC13806m.mo50240c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f48386a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f48387b;
        long j11 = this.f48388c;
        return ((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f48386a + ", tokenExpirationTimestamp=" + this.f48387b + ", tokenCreationTimestamp=" + this.f48388c + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C13794a(String str, long j10, long j11) {
        this.f48386a = str;
        this.f48387b = j10;
        this.f48388c = j11;
    }
}
