package o6;

import com.github.luben.zstd.BuildConfig;
import ew.b0;
import ew.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0003\u001a\u000f\u0012B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Lo6/f;", "Lo6/a;", BuildConfig.FLAVOR, "maxSize", "Lew/b0;", "directory", "Lew/k;", "fileSystem", "Lkotlin/coroutines/CoroutineContext;", "cleanupCoroutineContext", "<init>", "(JLew/b0;Lew/k;Lkotlin/coroutines/CoroutineContext;)V", BuildConfig.FLAVOR, "key", "Lo6/a$c;", "b", "(Ljava/lang/String;)Lo6/a$c;", "Lo6/a$b;", "a", "(Ljava/lang/String;)Lo6/a$b;", "e", "(Ljava/lang/String;)Ljava/lang/String;", "J", "d", "()J", "Lew/b0;", "c", "()Lew/b0;", "Lew/k;", "getFileSystem", "()Lew/k;", "Lo6/d;", "Lo6/d;", "cache", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long maxSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final b0 directory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k fileSystem;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d cache;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lo6/f$b;", "Lo6/a$b;", "Lo6/d$b;", "Lo6/d;", "editor", "<init>", "(Lo6/d$b;)V", "Lo6/f$c;", "c", "()Lo6/f$c;", BuildConfig.FLAVOR, "a", "()V", "Lo6/d$b;", "Lew/b0;", "getMetadata", "()Lew/b0;", "metadata", "getData", "data", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final d.b editor;

        public b(@NotNull d.b bVar) {
            this.editor = bVar;
        }

        @Override // o6.a.b
        public void a() {
            this.editor.a();
        }

        @Override // o6.a.b
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b() {
            d.C0539d c0539dC = this.editor.c();
            if (c0539dC != null) {
                return new c(c0539dC);
            }
            return null;
        }

        @Override // o6.a.b
        @NotNull
        public b0 getData() {
            return this.editor.f(1);
        }

        @Override // o6.a.b
        @NotNull
        public b0 getMetadata() {
            return this.editor.f(0);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"Lo6/f$c;", "Lo6/a$c;", "Lo6/d$d;", "Lo6/d;", "snapshot", "<init>", "(Lo6/d$d;)V", BuildConfig.FLAVOR, "close", "()V", "Lo6/f$b;", "a", "()Lo6/f$b;", "Lo6/d$d;", "Lew/b0;", "getMetadata", "()Lew/b0;", "metadata", "getData", "data", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final d.C0539d snapshot;

        public c(@NotNull d.C0539d c0539d) {
            this.snapshot = c0539d;
        }

        @Override // o6.a.c
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b v2() {
            d.b bVarA = this.snapshot.a();
            if (bVarA != null) {
                return new b(bVarA);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.snapshot.close();
        }

        @Override // o6.a.c
        @NotNull
        public b0 getData() {
            return this.snapshot.b(1);
        }

        @Override // o6.a.c
        @NotNull
        public b0 getMetadata() {
            return this.snapshot.b(0);
        }
    }

    public f(long j10, @NotNull b0 b0Var, @NotNull k kVar, @NotNull CoroutineContext coroutineContext) {
        this.maxSize = j10;
        this.directory = b0Var;
        this.fileSystem = kVar;
        this.cache = new d(getFileSystem(), getDirectory(), coroutineContext, getMaxSize(), 3, 2);
    }

    @Override // o6.a
    @Nullable
    public a.b a(@NotNull String key) {
        d.b bVarZ = this.cache.z(e(key));
        if (bVarZ != null) {
            return new b(bVarZ);
        }
        return null;
    }

    @Override // o6.a
    @Nullable
    public a.c b(@NotNull String key) {
        d.C0539d c0539dA = this.cache.A(e(key));
        if (c0539dA != null) {
            return new c(c0539dA);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public b0 getDirectory() {
        return this.directory;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public long getMaxSize() {
        return this.maxSize;
    }

    public final String e(String str) {
        return ew.h.INSTANCE.d(str).H().r();
    }

    @Override // o6.a
    @NotNull
    public k getFileSystem() {
        return this.fileSystem;
    }
}
