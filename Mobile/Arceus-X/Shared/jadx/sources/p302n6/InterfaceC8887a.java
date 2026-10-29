package p302n6;

import kotlin.Metadata;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4867m;
import p096e7.C4868n;
import p560xu.AbstractC12938l;
import p560xu.C12931h0;

/* JADX INFO: renamed from: n6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u000e\u0005\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m31665d2 = {"Ln6/a;", "", "", "key", "Ln6/a$c;", "b", "(Ljava/lang/String;)Ln6/a$c;", "Ln6/a$b;", "a", "(Ljava/lang/String;)Ln6/a$b;", "Lxu/l;", "getFileSystem", "()Lxu/l;", "fileSystem", "c", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC8887a {

    /* JADX INFO: renamed from: n6.a$a */
    @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m31665d2 = {"Ln6/a$a;", "", "<init>", "()V", "Lxu/h0;", "directory", "b", "(Lxu/h0;)Ln6/a$a;", "", "size", "c", "(J)Ln6/a$a;", "Ln6/a;", "a", "()Ln6/a;", "Lxu/h0;", "Lxu/l;", "Lxu/l;", "fileSystem", "", "D", "maxSizePercent", "d", "J", "minimumMaxSizeBytes", "e", "maximumMaxSizeBytes", "f", "maxSizeBytes", "Lkotlin/coroutines/CoroutineContext;", "g", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public C12931h0 directory;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public long maxSizeBytes;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public AbstractC12938l fileSystem = C4868n.m23474a();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public double maxSizePercent = 0.02d;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public long minimumMaxSizeBytes = 10485760;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public long maximumMaxSizeBytes = 262144000;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public CoroutineContext cleanupCoroutineContext = C7721e.f29393a;

        @NotNull
        /* JADX INFO: renamed from: a */
        public final InterfaceC8887a m35764a() {
            long jM32086k;
            C12931h0 c12931h0 = this.directory;
            if (c12931h0 == null) {
                throw new IllegalStateException("directory == null");
            }
            double d10 = this.maxSizePercent;
            if (d10 > 0.0d) {
                try {
                    jM32086k = C7764d.m32086k((long) (d10 * C4867m.m23473a(this.fileSystem, c12931h0)), this.minimumMaxSizeBytes, this.maximumMaxSizeBytes);
                } catch (Exception unused) {
                    jM32086k = this.minimumMaxSizeBytes;
                }
            } else {
                jM32086k = this.maxSizeBytes;
            }
            return new C8892f(jM32086k, c12931h0, this.fileSystem, this.cleanupCoroutineContext);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m35765b(@NotNull C12931h0 directory) {
            this.directory = directory;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m35766c(long size) {
            if (size <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.maximumMaxSizeBytes = size;
            return this;
        }
    }

    /* JADX INFO: renamed from: n6.a$b */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m31665d2 = {"Ln6/a$b;", "", "Ln6/a$c;", "a", "()Ln6/a$c;", "", "abort", "()V", "Lxu/h0;", "getMetadata", "()Lxu/h0;", "metadata", "getData", "data", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface b {
        @Nullable
        /* JADX INFO: renamed from: a */
        c mo35767a();

        void abort();

        @NotNull
        C12931h0 getData();

        @NotNull
        C12931h0 getMetadata();
    }

    /* JADX INFO: renamed from: n6.a$c */
    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m31665d2 = {"Ln6/a$c;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Ln6/a$b;", "s2", "()Ln6/a$b;", "Lxu/h0;", "getMetadata", "()Lxu/h0;", "metadata", "getData", "data", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface c extends AutoCloseable {
        @NotNull
        C12931h0 getData();

        @NotNull
        C12931h0 getMetadata();

        @Nullable
        /* JADX INFO: renamed from: s2 */
        b mo35768s2();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    b mo35762a(@NotNull String key);

    @Nullable
    /* JADX INFO: renamed from: b */
    c mo35763b(@NotNull String key);

    @NotNull
    AbstractC12938l getFileSystem();
}
