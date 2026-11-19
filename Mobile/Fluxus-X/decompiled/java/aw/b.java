package aw;

import com.github.luben.zstd.BuildConfig;
import ew.g;
import ew.h;
import ew.l0;
import ew.v;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001b\u001a\u00020\u00128\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u000f\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010 ¨\u0006\""}, d2 = {"Law/b;", "Law/d;", "<init>", "()V", "Lew/l0;", "e", "()Lew/l0;", BuildConfig.FLAVOR, "b", "f", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "c", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Lew/h;", "d", "Lew/h;", "a", "()Lew/h;", "h", "(Lew/h;)V", "bytes", "i", "exceptionBytes", "Ljava/io/IOException;", "Ljava/io/IOException;", "readFailure", BuildConfig.FLAVOR, "()Ljava/lang/Object;", "path", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b implements d {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean listRead = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public h bytes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public h exceptionBytes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public IOException readFailure;

    @Override // aw.d
    @NotNull
    public h a() {
        h hVar = this.bytes;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.u("bytes");
        return null;
    }

    @Override // aw.d
    public void b() {
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            g();
        }
        if (this.bytes != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + getPath() + " resource.");
        illegalStateException.initCause(this.readFailure);
        throw illegalStateException;
    }

    @Override // aw.d
    @NotNull
    public h c() {
        h hVar = this.exceptionBytes;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.u("exceptionBytes");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract Object getPath();

    @NotNull
    public abstract l0 e();

    public final void f() {
        try {
            g gVarC = v.c(e());
            try {
                h hVarM1 = gVarC.M1(gVarC.readInt());
                h hVarM2 = gVarC.M1(gVarC.readInt());
                Unit unit = Unit.f21506a;
                lu.c.a(gVarC, null);
                synchronized (this) {
                    Intrinsics.checkNotNull(hVarM1);
                    h(hVarM1);
                    Intrinsics.checkNotNull(hVarM2);
                    i(hVarM2);
                }
                this.readCompleteLatch.countDown();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(gVarC, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.readCompleteLatch.countDown();
            throw th4;
        }
    }

    public final void g() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    f();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    this.readFailure = e10;
                    if (!z10) {
                        return;
                    }
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (!z10) {
            return;
        }
        Thread.currentThread().interrupt();
    }

    public void h(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.bytes = hVar;
    }

    public void i(@NotNull h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.exceptionBytes = hVar;
    }
}
