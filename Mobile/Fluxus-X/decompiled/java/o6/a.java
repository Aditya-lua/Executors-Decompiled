package o6;

import com.github.luben.zstd.BuildConfig;
import ew.b0;
import ew.k;
import f7.m;
import f7.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u000e\u0005\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lo6/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "key", "Lo6/a$c;", "b", "(Ljava/lang/String;)Lo6/a$c;", "Lo6/a$b;", "a", "(Ljava/lang/String;)Lo6/a$b;", "Lew/k;", "getFileSystem", "()Lew/k;", "fileSystem", "c", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: o6.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lo6/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lew/b0;", "directory", "b", "(Lew/b0;)Lo6/a$a;", BuildConfig.FLAVOR, "size", "c", "(J)Lo6/a$a;", "Lo6/a;", "a", "()Lo6/a;", "Lew/b0;", "Lew/k;", "Lew/k;", "fileSystem", BuildConfig.FLAVOR, "D", "maxSizePercent", "d", "J", "minimumMaxSizeBytes", "e", "maximumMaxSizeBytes", "f", "maxSizeBytes", "Lkotlin/coroutines/CoroutineContext;", "g", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0538a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public b0 directory;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public long maxSizeBytes;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public k fileSystem = n.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public double maxSizePercent = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public long minimumMaxSizeBytes = 10485760;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long maximumMaxSizeBytes = 262144000;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public CoroutineContext cleanupCoroutineContext = p001kotlin.coroutines.e.f21548a;

        @NotNull
        public final a a() {
            long jK;
            b0 b0Var = this.directory;
            if (b0Var == null) {
                throw new IllegalStateException("directory == null");
            }
            double d10 = this.maxSizePercent;
            if (d10 > 0.0d) {
                try {
                    jK = p001kotlin.ranges.d.k((long) (d10 * m.a(this.fileSystem, b0Var)), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    jK = this.minimumMaxSizeBytes;
                }
            } else {
                jK = this.maxSizeBytes;
            }
            return new f(jK, b0Var, this.fileSystem, this.cleanupCoroutineContext);
        }

        @NotNull
        public final C0538a b(@NotNull b0 directory) {
            this.directory = directory;
            return this;
        }

        @NotNull
        public final C0538a c(long size) {
            if (size <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.maximumMaxSizeBytes = size;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lo6/a$b;", BuildConfig.FLAVOR, "Lo6/a$c;", "b", "()Lo6/a$c;", BuildConfig.FLAVOR, "a", "()V", "Lew/b0;", "getMetadata", "()Lew/b0;", "metadata", "getData", "data", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        void a();

        @Nullable
        c b();

        @NotNull
        b0 getData();

        @NotNull
        b0 getMetadata();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lo6/a$c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lo6/a$b;", "v2", "()Lo6/a$b;", "Lew/b0;", "getMetadata", "()Lew/b0;", "metadata", "getData", "data", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c extends AutoCloseable {
        @NotNull
        b0 getData();

        @NotNull
        b0 getMetadata();

        @Nullable
        b v2();
    }

    @Nullable
    b a(@NotNull String key);

    @Nullable
    c b(@NotNull String key);

    @NotNull
    k getFileSystem();
}
