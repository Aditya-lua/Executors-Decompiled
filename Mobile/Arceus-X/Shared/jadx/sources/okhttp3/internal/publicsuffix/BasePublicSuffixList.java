package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477ut.C11958c;
import p560xu.C12919b0;
import p560xu.C12930h;
import p560xu.InterfaceC12928g;
import p560xu.InterfaceC12951r0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00118\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m31665d2 = {"Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "()V", "", "readTheList", "readTheListUninterruptibly", "Lxu/r0;", "listSource", "()Lxu/r0;", "ensureLoaded", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "Lxu/h;", "bytes", "Lxu/h;", "getBytes", "()Lxu/h;", "setBytes", "(Lxu/h;)V", "exceptionBytes", "getExceptionBytes", "setExceptionBytes", "Ljava/io/IOException;", "readFailure", "Ljava/io/IOException;", "", "getPath", "()Ljava/lang/Object;", "path", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class BasePublicSuffixList implements PublicSuffixList {
    public C12930h bytes;
    public C12930h exceptionBytes;

    @NotNull
    private final AtomicBoolean listRead = new AtomicBoolean(false);

    @NotNull
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    @Nullable
    private IOException readFailure;

    private final void readTheList() {
        try {
            InterfaceC12928g interfaceC12928gM47961c = C12919b0.m47961c(listSource());
            try {
                C12930h c12930hMo48002K1 = interfaceC12928gM47961c.mo48002K1(interfaceC12928gM47961c.readInt());
                C12930h c12930hMo48002K2 = interfaceC12928gM47961c.mo48002K1(interfaceC12928gM47961c.readInt());
                Unit unit = Unit.f29331a;
                C11958c.m44629a(interfaceC12928gM47961c, null);
                synchronized (this) {
                    Intrinsics.checkNotNull(c12930hMo48002K1);
                    setBytes(c12930hMo48002K1);
                    Intrinsics.checkNotNull(c12930hMo48002K2);
                    setExceptionBytes(c12930hMo48002K2);
                }
                this.readCompleteLatch.countDown();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C11958c.m44629a(interfaceC12928gM47961c, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.readCompleteLatch.countDown();
            throw th4;
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    readTheList();
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

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    public void ensureLoaded() {
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.bytes != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + getPath() + " resource.");
        illegalStateException.initCause(this.readFailure);
        throw illegalStateException;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    @NotNull
    public C12930h getBytes() {
        C12930h c12930h = this.bytes;
        if (c12930h != null) {
            return c12930h;
        }
        Intrinsics.m31998u("bytes");
        return null;
    }

    @Override // okhttp3.internal.publicsuffix.PublicSuffixList
    @NotNull
    public C12930h getExceptionBytes() {
        C12930h c12930h = this.exceptionBytes;
        if (c12930h != null) {
            return c12930h;
        }
        Intrinsics.m31998u("exceptionBytes");
        return null;
    }

    @NotNull
    public abstract Object getPath();

    @NotNull
    public abstract InterfaceC12951r0 listSource();

    public void setBytes(@NotNull C12930h c12930h) {
        Intrinsics.checkNotNullParameter(c12930h, "<set-?>");
        this.bytes = c12930h;
    }

    public void setExceptionBytes(@NotNull C12930h c12930h) {
        Intrinsics.checkNotNullParameter(c12930h, "<set-?>");
        this.exceptionBytes = c12930h;
    }
}
