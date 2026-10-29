package p560xu;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, m31665d2 = {"Lxu/d;", "Lxu/p0;", "<init>", "()V", "Lxu/e;", Payload.SOURCE, "", "byteCount", "", "write", "(Lxu/e;J)V", "flush", "Lxu/s0;", "timeout", "()Lxu/s0;", "close", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12922d implements InterfaceC12947p0 {
    @Override // p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // p560xu.InterfaceC12947p0, java.io.Flushable
    public void flush() {
    }

    @Override // p560xu.InterfaceC12947p0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public C12953s0 getF45809a() {
        return C12953s0.NONE;
    }

    @Override // p560xu.InterfaceC12947p0
    public void write(@NotNull C12924e source, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(byteCount);
    }
}
