package p302n6;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p560xu.C12924e;
import p560xu.C12953s0;
import p560xu.InterfaceC12947p0;

/* JADX INFO: renamed from: n6.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m31665d2 = {"Ln6/e;", "Lxu/p0;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", "", "onException", "<init>", "(Lxu/p0;Lkotlin/jvm/functions/Function1;)V", "Lxu/e;", Payload.SOURCE, "", "byteCount", "write", "(Lxu/e;J)V", "flush", "()V", "close", "Lxu/s0;", "timeout", "()Lxu/s0;", "a", "Lxu/p0;", "b", "Lkotlin/jvm/functions/Function1;", "", "c", "Z", "hasErrors", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8891e implements InterfaceC12947p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12947p0 delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<IOException, Unit> onException;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean hasErrors;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.io.IOException, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C8891e(@NotNull InterfaceC12947p0 interfaceC12947p0, @NotNull Function1<? super IOException, Unit> function1) {
        this.delegate = interfaceC12947p0;
        this.onException = function1;
    }

    @Override // p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.delegate.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // p560xu.InterfaceC12947p0, java.io.Flushable
    public void flush() {
        try {
            this.delegate.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // p560xu.InterfaceC12947p0
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public C12953s0 getF45809a() {
        return this.delegate.getF45809a();
    }

    @Override // p560xu.InterfaceC12947p0
    public void write(@NotNull C12924e source, long byteCount) throws EOFException {
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            this.delegate.write(source, byteCount);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }
}
