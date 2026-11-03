package f1;

import android.location.Location;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class f extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16440a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Location f16441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f16442d;

    public static final class b extends r.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f16443a;
        public Long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Location f16444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public File f16445d;

        @Override // f1.r.b.a
        public r.b c() {
            String str = "";
            if (this.f16443a == null) {
                str = " fileSizeLimit";
            }
            if (this.b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f16445d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new f(this.f16443a.longValue(), this.b.longValue(), this.f16444c, this.f16445d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.r.b.a
        public r.b.a d(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.f16445d = file;
            return this;
        }

        @Override // f1.u.b.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public r.b.a a(long j10) {
            this.b = Long.valueOf(j10);
            return this;
        }

        @Override // f1.u.b.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public r.b.a b(long j10) {
            this.f16443a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // f1.u.b
    public long a() {
        return this.b;
    }

    @Override // f1.u.b
    public long b() {
        return this.f16440a;
    }

    @Override // f1.u.b
    public Location c() {
        return this.f16441c;
    }

    @Override // f1.r.b
    public File d() {
        return this.f16442d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f16440a == bVar.b() && this.b == bVar.a() && ((location = this.f16441c) != null ? location.equals(bVar.c()) : bVar.c() == null) && this.f16442d.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f16440a;
        long j11 = this.b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        Location location = this.f16441c;
        return ((i10 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f16442d.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f16440a + ", durationLimitMillis=" + this.b + ", location=" + this.f16441c + ", file=" + this.f16442d + "}";
    }

    public f(long j10, long j11, Location location, File file) {
        this.f16440a = j10;
        this.b = j11;
        this.f16441c = location;
        this.f16442d = file;
    }
}
