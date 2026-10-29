package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477ut.C11958c;
import p560xu.C12919b0;
import p560xu.C12950r;
import p560xu.InterfaceC12926f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lokhttp3/internal/http/GzipRequestBody;", "Lokhttp3/RequestBody;", "delegate", "<init>", "(Lokhttp3/RequestBody;)V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Lxu/f;", "sink", "", "writeTo", "(Lxu/f;)V", "", "isOneShot", "()Z", "Lokhttp3/RequestBody;", "getDelegate", "()Lokhttp3/RequestBody;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class GzipRequestBody extends RequestBody {

    @NotNull
    private final RequestBody delegate;

    public GzipRequestBody(@NotNull RequestBody delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    @Nullable
    /* JADX INFO: renamed from: contentType */
    public MediaType getMediaType() {
        return this.delegate.getMediaType();
    }

    @NotNull
    public final RequestBody getDelegate() {
        return this.delegate;
    }

    @Override // okhttp3.RequestBody
    public boolean isOneShot() {
        return this.delegate.isOneShot();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull InterfaceC12926f sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        InterfaceC12926f interfaceC12926fM47960b = C12919b0.m47960b(new C12950r(sink));
        try {
            this.delegate.writeTo(interfaceC12926fM47960b);
            Unit unit = Unit.f29331a;
            C11958c.m44629a(interfaceC12926fM47960b, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(interfaceC12926fM47960b, th2);
                throw th3;
            }
        }
    }
}
