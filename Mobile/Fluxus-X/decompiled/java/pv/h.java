package pv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.j0;
import ew.m;
import java.io.EOFException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lpv/h;", "Lew/m;", "Lew/j0;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", BuildConfig.FLAVOR, "onException", "<init>", "(Lew/j0;Lkotlin/jvm/functions/Function1;)V", "Lew/e;", Payload.SOURCE, BuildConfig.FLAVOR, "byteCount", "R2", "(Lew/e;J)V", "flush", "()V", "close", "b", "Lkotlin/jvm/functions/Function1;", "getOnException", "()Lkotlin/jvm/functions/Function1;", BuildConfig.FLAVOR, "c", "Z", "hasErrors", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class h extends m {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function1<IOException, Unit> onException;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean hasErrors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull j0 delegate, @NotNull Function1<? super IOException, Unit> onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.onException = onException;
    }

    @Override // ew.m, ew.j0
    public void R2(@NotNull ew.e source, long byteCount) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.R2(source, byteCount);
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // ew.m, ew.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }

    @Override // ew.m, ew.j0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.hasErrors = true;
            this.onException.invoke(e10);
        }
    }
}
