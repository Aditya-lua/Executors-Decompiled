package sv;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import mv.a0;
import mv.f0;
import mv.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import rv.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0003\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b*\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b+\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b,\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b-\u0010\u0018R\u0016\u0010.\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010$¨\u0006/"}, d2 = {"Lsv/g;", "Lmv/a0$a;", "Lrv/m;", "call", BuildConfig.FLAVOR, "Lmv/a0;", "interceptors", BuildConfig.FLAVOR, "index", "Lrv/h;", "exchange", "Lmv/f0;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "<init>", "(Lrv/m;Ljava/util/List;ILrv/h;Lmv/f0;III)V", "c", "(ILrv/h;Lmv/f0;III)Lsv/g;", "Lmv/k;", "b", "()Lmv/k;", "l", "()I", "Lmv/e;", "()Lmv/e;", "h", "()Lmv/f0;", "Lmv/h0;", "a", "(Lmv/f0;)Lmv/h0;", "Lrv/m;", "e", "()Lrv/m;", "Ljava/util/List;", "I", "d", "Lrv/h;", "g", "()Lrv/h;", "Lmv/f0;", "j", "f", "i", "k", "calls", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final m call;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<a0> interceptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final rv.h exchange;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f0 request;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int connectTimeoutMillis;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int readTimeoutMillis;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int writeTimeoutMillis;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int calls;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull m call, @NotNull List<? extends a0> interceptors, int i10, @Nullable rv.h hVar, @NotNull f0 request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i10;
        this.exchange = hVar;
        this.request = request;
        this.connectTimeoutMillis = i11;
        this.readTimeoutMillis = i12;
        this.writeTimeoutMillis = i13;
    }

    public static /* synthetic */ g d(g gVar, int i10, rv.h hVar, f0 f0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.index;
        }
        if ((i14 & 2) != 0) {
            hVar = gVar.exchange;
        }
        if ((i14 & 4) != 0) {
            f0Var = gVar.request;
        }
        if ((i14 & 8) != 0) {
            i11 = gVar.connectTimeoutMillis;
        }
        if ((i14 & 16) != 0) {
            i12 = gVar.readTimeoutMillis;
        }
        if ((i14 & 32) != 0) {
            i13 = gVar.writeTimeoutMillis;
        }
        int i15 = i12;
        int i16 = i13;
        return gVar.c(i10, hVar, f0Var, i11, i15, i16);
    }

    @Override // mv.a0.a
    @NotNull
    public h0 a(@NotNull f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.index >= this.interceptors.size()) {
            throw new IllegalStateException("Check failed.");
        }
        this.calls++;
        rv.h hVar = this.exchange;
        if (hVar != null) {
            if (!hVar.getFinder().getRoutePlanner().f(request.getUrl())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (this.calls != 1) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        g gVarD = d(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        a0 a0Var = this.interceptors.get(this.index);
        h0 h0VarIntercept = a0Var.intercept(gVarD);
        if (h0VarIntercept == null) {
            throw new NullPointerException("interceptor " + a0Var + " returned null");
        }
        if (this.exchange == null || this.index + 1 >= this.interceptors.size() || gVarD.calls == 1) {
            return h0VarIntercept;
        }
        throw new IllegalStateException(("network interceptor " + a0Var + " must call proceed() exactly once").toString());
    }

    @Override // mv.a0.a
    @Nullable
    public mv.k b() {
        rv.h hVar = this.exchange;
        if (hVar != null) {
            return hVar.j();
        }
        return null;
    }

    @NotNull
    public final g c(int index, @Nullable rv.h exchange, @NotNull f0 request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new g(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    @Override // mv.a0.a
    @NotNull
    public mv.e call() {
        return this.call;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final m getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final rv.h getExchange() {
        return this.exchange;
    }

    @Override // mv.a0.a
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public f0 getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @NotNull
    public final f0 j() {
        return this.request;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    public int l() {
        return this.readTimeoutMillis;
    }
}
