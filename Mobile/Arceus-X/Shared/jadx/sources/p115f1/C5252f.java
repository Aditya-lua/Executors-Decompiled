package p115f1;

import android.location.Location;
import java.io.File;

/* JADX INFO: renamed from: f1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5252f extends C5288r.b {

    /* JADX INFO: renamed from: a */
    public final long f20345a;

    /* JADX INFO: renamed from: b */
    public final long f20346b;

    /* JADX INFO: renamed from: c */
    public final Location f20347c;

    /* JADX INFO: renamed from: d */
    public final File f20348d;

    /* JADX INFO: renamed from: f1.f$b */
    public static final class b extends C5288r.b.a {

        /* JADX INFO: renamed from: a */
        public Long f20349a;

        /* JADX INFO: renamed from: b */
        public Long f20350b;

        /* JADX INFO: renamed from: c */
        public Location f20351c;

        /* JADX INFO: renamed from: d */
        public File f20352d;

        @Override // p115f1.C5288r.b.a
        /* JADX INFO: renamed from: c */
        public C5288r.b mo24296c() {
            String str = "";
            if (this.f20349a == null) {
                str = " fileSizeLimit";
            }
            if (this.f20350b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f20352d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new C5252f(this.f20349a.longValue(), this.f20350b.longValue(), this.f20351c, this.f20352d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p115f1.C5288r.b.a
        /* JADX INFO: renamed from: d */
        public C5288r.b.a mo24297d(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.f20352d = file;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: a(J)Ljava/lang/Object; */
        @Override // p115f1.AbstractC5297u.b.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C5288r.b.a mo24294a(long j10) {
            this.f20350b = Long.valueOf(j10);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: b(J)Ljava/lang/Object; */
        @Override // p115f1.AbstractC5297u.b.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C5288r.b.a mo24295b(long j10) {
            this.f20349a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // p115f1.AbstractC5297u.b
    /* JADX INFO: renamed from: a */
    public long mo24290a() {
        return this.f20346b;
    }

    @Override // p115f1.AbstractC5297u.b
    /* JADX INFO: renamed from: b */
    public long mo24291b() {
        return this.f20345a;
    }

    @Override // p115f1.AbstractC5297u.b
    /* JADX INFO: renamed from: c */
    public Location mo24292c() {
        return this.f20347c;
    }

    @Override // p115f1.C5288r.b
    /* JADX INFO: renamed from: d */
    public File mo24293d() {
        return this.f20348d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5288r.b) {
            C5288r.b bVar = (C5288r.b) obj;
            if (this.f20345a == bVar.mo24291b() && this.f20346b == bVar.mo24290a() && ((location = this.f20347c) != null ? location.equals(bVar.mo24292c()) : bVar.mo24292c() == null) && this.f20348d.equals(bVar.mo24293d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f20345a;
        long j11 = this.f20346b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        Location location = this.f20347c;
        return ((i10 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f20348d.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f20345a + ", durationLimitMillis=" + this.f20346b + ", location=" + this.f20347c + ", file=" + this.f20348d + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5252f(long j10, long j11, Location location, File file) {
        this.f20345a = j10;
        this.f20346b = j11;
        this.f20347c = location;
        this.f20348d = file;
    }
}
