package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.o */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0016¨\u0006\u0018"}, m31665d2 = {"Lxu/o;", "Lxu/p0;", "delegate", "<init>", "(Lxu/p0;)V", "Lxu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lxu/e;J)V", "flush", "()V", "Lxu/s0;", "timeout", "()Lxu/s0;", "close", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lxu/p0;", "Lxu/p0;", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC12944o implements InterfaceC12947p0 {

    @NotNull
    private final InterfaceC12947p0 delegate;

    public AbstractC12944o(@NotNull InterfaceC12947p0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final InterfaceC12947p0 getDelegate() {
        return this.delegate;
    }

    @Override // p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @NotNull
    public final InterfaceC12947p0 delegate() {
        return this.delegate;
    }

    @Override // p560xu.InterfaceC12947p0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // p560xu.InterfaceC12947p0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public C12953s0 getF45809a() {
        return this.delegate.getF45809a();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // p560xu.InterfaceC12947p0
    public void write(@NotNull C12924e source, long byteCount) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, byteCount);
    }
}
