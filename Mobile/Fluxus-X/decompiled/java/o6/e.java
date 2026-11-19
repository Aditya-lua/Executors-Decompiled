package o6;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.j0;
import ew.m0;
import java.io.EOFException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lo6/e;", "Lew/j0;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", BuildConfig.FLAVOR, "onException", "<init>", "(Lew/j0;Lkotlin/jvm/functions/Function1;)V", "Lew/e;", Payload.SOURCE, BuildConfig.FLAVOR, "byteCount", "R2", "(Lew/e;J)V", "flush", "()V", "close", "Lew/m0;", "t", "()Lew/m0;", "a", "Lew/j0;", "b", "Lkotlin/jvm/functions/Function1;", BuildConfig.FLAVOR, "c", "Z", "hasErrors", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j0 delegate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<IOException, Unit> onException;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean hasErrors;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull j0 j0Var, @NotNull Function1<? super IOException, Unit> function1) {
        this.delegate = j0Var;
        this.onException = function1;
    }

    @Override // ew.j0
    public void R2(@NotNull ew.e source, long byteCount) throws EOFException {
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            this.delegate.R2(source, byteCount);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // ew.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.delegate.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // ew.j0, java.io.Flushable
    public void flush() {
        try {
            this.delegate.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // ew.j0
    @NotNull
    public m0 t() {
        return this.delegate.t();
    }
}
