package nv;

import com.github.luben.zstd.BuildConfig;
import ew.l0;
import ew.m0;
import ew.v;
import mv.b0;
import mv.i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lnv/h;", "Lmv/i0;", "Lew/l0;", "Lmv/b0;", "mediaType", BuildConfig.FLAVOR, "contentLength", "<init>", "(Lmv/b0;J)V", "f", "()Lmv/b0;", "e", "()J", "Lew/g;", "l3", "()Lew/g;", "Lew/e;", "sink", "byteCount", "f3", "(Lew/e;J)J", "Lew/m0;", "t", "()Lew/m0;", BuildConfig.FLAVOR, "close", "()V", "d", "Lmv/b0;", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends i0 implements l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final b0 mediaType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long contentLength;

    public h(@Nullable b0 b0Var, long j10) {
        this.mediaType = b0Var;
        this.contentLength = j10;
    }

    @Override // mv.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // mv.i0
    /* JADX INFO: renamed from: e, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // mv.i0
    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public b0 getMediaType() {
        return this.mediaType;
    }

    @Override // ew.l0
    public long f3(@NotNull ew.e sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // mv.i0
    @NotNull
    /* JADX INFO: renamed from: l3 */
    public ew.g getSource() {
        return v.c(this);
    }

    @Override // ew.l0
    @NotNull
    /* JADX INFO: renamed from: t */
    public m0 getTimeout() {
        return m0.f14833e;
    }
}
