package n6;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.b0;
import f7.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u00060\u001aj\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Ln6/v;", "Ln6/s;", "Lew/g;", Payload.SOURCE, "Lew/k;", "fileSystem", "Ln6/s$a;", "metadata", "<init>", "(Lew/g;Lew/k;Ln6/s$a;)V", BuildConfig.FLAVOR, "a", "()V", "l3", "()Lew/g;", "Lew/b0;", "b3", "()Lew/b0;", "close", "Lew/k;", "getFileSystem", "()Lew/k;", "b", "Ln6/s$a;", "getMetadata", "()Ln6/s$a;", BuildConfig.FLAVOR, "Lkotlinx/atomicfu/locks/SynchronizedObject;", "c", "Ljava/lang/Object;", "lock", BuildConfig.FLAVOR, "d", "Z", "isClosed", "e", "Lew/g;", "f", "Lew/b0;", "file", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ew.k fileSystem;

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
    public ew.g source;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public b0 file;

    public v(@NotNull ew.g gVar, @NotNull ew.k kVar, @Nullable s.a aVar) {
        this.fileSystem = kVar;
        this.metadata = aVar;
        this.source = gVar;
    }

    private final void a() {
        if (this.isClosed) {
            throw new IllegalStateException("closed");
        }
    }

    @Override // n6.s
    @Nullable
    public b0 b3() {
        b0 b0Var;
        synchronized (this.lock) {
            a();
            b0Var = this.file;
        }
        return b0Var;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            try {
                this.isClosed = true;
                ew.g gVar = this.source;
                if (gVar != null) {
                    h0.h(gVar);
                }
                b0 b0Var = this.file;
                if (b0Var != null) {
                    getFileSystem().h(b0Var);
                }
                Unit unit = Unit.f21506a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n6.s
    @NotNull
    public ew.k getFileSystem() {
        return this.fileSystem;
    }

    @Override // n6.s
    @Nullable
    public s.a getMetadata() {
        return this.metadata;
    }

    @Override // n6.s
    @NotNull
    public ew.g l3() {
        synchronized (this.lock) {
            a();
            ew.g gVar = this.source;
            if (gVar != null) {
                return gVar;
            }
            ew.k fileSystem = getFileSystem();
            b0 b0Var = this.file;
            Intrinsics.checkNotNull(b0Var);
            ew.g gVarC = ew.v.c(fileSystem.w(b0Var));
            this.source = gVarC;
            return gVarC;
        }
    }
}
