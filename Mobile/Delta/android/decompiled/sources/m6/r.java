package m6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.b0;
import xu.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001c\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0018\u0010+\u001a\u00060'j\u0002`(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lm6/r;", "Lm6/s;", "Lxu/h0;", "file", "Lxu/l;", "fileSystem", "", "diskCacheKey", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Lm6/s$a;", "metadata", "<init>", "(Lxu/h0;Lxu/l;Ljava/lang/String;Ljava/lang/AutoCloseable;Lm6/s$a;)V", "Lxu/g;", Payload.SOURCE, "()Lxu/g;", "b", "()Lxu/h0;", "X2", "", "close", "()V", "a", "Lxu/h0;", "getFile$coil_core_release", "Lxu/l;", "getFileSystem", "()Lxu/l;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "Ljava/lang/AutoCloseable;", "e", "Lm6/s$a;", "getMetadata", "()Lm6/s$a;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "f", "Ljava/lang/Object;", "lock", "", "g", "Z", "isClosed", "h", "Lxu/g;", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h0 file;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final xu.l fileSystem;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String diskCacheKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AutoCloseable closeable;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final s.a metadata;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public xu.g source;

    public r(@NotNull h0 h0Var, @NotNull xu.l lVar, @Nullable String str, @Nullable AutoCloseable autoCloseable, @Nullable s.a aVar) {
        this.file = h0Var;
        this.fileSystem = lVar;
        this.diskCacheKey = str;
        this.closeable = autoCloseable;
        this.metadata = aVar;
    }

    @Override // m6.s
    @NotNull
    public h0 X2() {
        return b();
    }

    public final void a() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }

    @NotNull
    public h0 b() {
        h0 h0Var;
        synchronized (this.lock) {
            a();
            h0Var = this.file;
        }
        return h0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                this.isClosed = true;
                xu.g gVar = this.source;
                if (gVar != null) {
                    e7.h0.h(gVar);
                }
                AutoCloseable autoCloseable = this.closeable;
                if (autoCloseable != null) {
                    e7.h0.i(autoCloseable);
                }
                Unit unit = Unit.f22483a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m6.s
    @NotNull
    public xu.l getFileSystem() {
        return this.fileSystem;
    }

    @Override // m6.s
    @Nullable
    public s.a getMetadata() {
        return this.metadata;
    }

    @Override // m6.s
    @NotNull
    public xu.g source() {
        synchronized (this.lock) {
            a();
            xu.g gVar = this.source;
            if (gVar != null) {
                return gVar;
            }
            xu.g gVarC = b0.c(getFileSystem().source(this.file));
            this.source = gVarC;
            return gVarC;
        }
    }
}
