package f1;

import android.location.Location;
import com.github.luben.zstd.BuildConfig;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class f extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14917a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Location f14918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f14919d;

    public static final class b extends r.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f14920a;
        public Long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Location f14921c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public File f14922d;

        @Override // f1.r.b.a
        public r.b c() {
            Long l10 = this.f14920a;
            String str = BuildConfig.FLAVOR;
            if (l10 == null) {
                str = BuildConfig.FLAVOR + " fileSizeLimit";
            }
            if (this.b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f14922d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new f(this.f14920a.longValue(), this.b.longValue(), this.f14921c, this.f14922d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.r.b.a
        public r.b.a d(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.f14922d = file;
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
            this.f14920a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // f1.u.b
    public long a() {
        return this.b;
    }

    @Override // f1.u.b
    public long b() {
        return this.f14917a;
    }

    @Override // f1.u.b
    public Location c() {
        return this.f14918c;
    }

    @Override // f1.r.b
    public File d() {
        return this.f14919d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f14917a == bVar.b() && this.b == bVar.a() && ((location = this.f14918c) != null ? location.equals(bVar.c()) : bVar.c() == null) && this.f14919d.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f14917a;
        long j11 = this.b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        Location location = this.f14918c;
        return ((i10 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f14919d.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f14917a + ", durationLimitMillis=" + this.b + ", location=" + this.f14918c + ", file=" + this.f14919d + "}";
    }

    public f(long j10, long j11, Location location, File file) {
        this.f14917a = j10;
        this.b = j11;
        this.f14918c = location;
        this.f14919d = file;
    }
}
