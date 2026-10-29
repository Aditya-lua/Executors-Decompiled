package m6;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xu.b0;
import xu.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u00060\u0019j\u0002`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lm6/v;", "Lm6/s;", "Lxu/g;", Payload.SOURCE, "Lxu/l;", "fileSystem", "Lm6/s$a;", "metadata", "<init>", "(Lxu/g;Lxu/l;Lm6/s$a;)V", "", "a", "()V", "()Lxu/g;", "Lxu/h0;", "X2", "()Lxu/h0;", "close", "Lxu/l;", "getFileSystem", "()Lxu/l;", "b", "Lm6/s$a;", "getMetadata", "()Lm6/s$a;", "", "Lkotlinx/atomicfu/locks/SynchronizedObject;", "c", "Ljava/lang/Object;", "lock", "", "d", "Z", "isClosed", "e", "Lxu/g;", "f", "Lxu/h0;", "file", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final xu.l fileSystem;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final s.a metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public xu.g source;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public h0 file;

    public v(@NotNull xu.g gVar, @NotNull xu.l lVar, @Nullable s.a aVar) {
        this.fileSystem = lVar;
        this.metadata = aVar;
        this.source = gVar;
    }

    private final void a() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // m6.s
    @Nullable
    public h0 X2() {
        h0 h0Var;
        synchronized (this.lock) {
            a();
            h0Var = this.file;
        }
        return h0Var;
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
                h0 h0Var = this.file;
                if (h0Var != null) {
                    getFileSystem().delete(h0Var);
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
            xu.l fileSystem = getFileSystem();
            h0 h0Var = this.file;
            Intrinsics.checkNotNull(h0Var);
            xu.g gVarC = b0.c(fileSystem.source(h0Var));
            this.source = gVarC;
            return gVarC;
        }
    }
}
