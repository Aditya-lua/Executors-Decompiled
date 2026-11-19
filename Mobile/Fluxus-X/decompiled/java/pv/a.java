package pv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.l0;
import ew.m0;
import ew.v;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import mv.a0;
import mv.e0;
import mv.f0;
import mv.h0;
import mv.s;
import mv.y;
import nv.i;
import nv.n;
import nv.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.x;
import rv.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u000eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lpv/a;", "Lmv/a0;", "Lmv/c;", "cache", "<init>", "(Lmv/c;)V", "Lmv/a0$a;", "chain", "Lmv/h0;", "intercept", "(Lmv/a0$a;)Lmv/h0;", "Lpv/c;", "cacheRequest", Payload.RESPONSE, "a", "(Lpv/c;Lmv/h0;)Lmv/h0;", "Lmv/c;", "getCache$okhttp", "()Lmv/c;", "b", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements a0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final mv.c cache;

    /* JADX INFO: renamed from: pv.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lpv/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/y;", "cachedHeaders", "networkHeaders", "b", "(Lmv/y;Lmv/y;)Lmv/y;", BuildConfig.FLAVOR, "fieldName", BuildConfig.FLAVOR, "d", "(Ljava/lang/String;)Z", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y b(y cachedHeaders, y networkHeaders) {
            y.a aVar = new y.a();
            int size = cachedHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strC = cachedHeaders.c(i10);
                String strG = cachedHeaders.g(i10);
                if ((!x.E("Warning", strC, true) || !x.T(strG, "1", false, 2, null)) && (c(strC) || !d(strC) || networkHeaders.a(strC) == null)) {
                    aVar.d(strC, strG);
                }
            }
            int size2 = networkHeaders.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strC2 = networkHeaders.c(i11);
                if (!c(strC2) && d(strC2)) {
                    aVar.d(strC2, networkHeaders.g(i11));
                }
            }
            return aVar.f();
        }

        public final boolean c(String fieldName) {
            return x.E("Content-Length", fieldName, true) || x.E("Content-Encoding", fieldName, true) || x.E("Content-Type", fieldName, true);
        }

        public final boolean d(String fieldName) {
            return (x.E("Connection", fieldName, true) || x.E("Keep-Alive", fieldName, true) || x.E("Proxy-Authenticate", fieldName, true) || x.E("Proxy-Authorization", fieldName, true) || x.E("TE", fieldName, true) || x.E("Trailers", fieldName, true) || x.E("Transfer-Encoding", fieldName, true) || x.E("Upgrade", fieldName, true)) ? false : true;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"pv/a$b", "Lew/l0;", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", "Lew/m0;", "t", "()Lew/m0;", BuildConfig.FLAVOR, "close", "()V", BuildConfig.FLAVOR, "a", "Z", "cacheRequestClosed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean cacheRequestClosed;
        public final /* synthetic */ ew.g b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f29322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ew.f f29323d;

        public b(ew.g gVar, c cVar, ew.f fVar) {
            this.b = gVar;
            this.f29322c = cVar;
            this.f29323d = fVar;
        }

        @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.cacheRequestClosed && !q.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.cacheRequestClosed = true;
                this.f29322c.a();
            }
            this.b.close();
        }

        @Override // ew.l0
        public long f3(ew.e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                long jF3 = this.b.f3(sink, byteCount);
                if (jF3 != -1) {
                    sink.f(this.f29323d.getBufferField(), sink.getSize() - jF3, jF3);
                    this.f29323d.l0();
                    return jF3;
                }
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.f29323d.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (this.cacheRequestClosed) {
                    throw e10;
                }
                this.cacheRequestClosed = true;
                this.f29322c.a();
                throw e10;
            }
        }

        @Override // ew.l0
        /* JADX INFO: renamed from: t */
        public m0 getTimeout() {
            return this.b.getTimeout();
        }
    }

    public a(@Nullable mv.c cVar) {
        this.cache = cVar;
    }

    public final h0 a(c cacheRequest, h0 response) {
        if (cacheRequest == null) {
            return response;
        }
        b bVar = new b(response.getBody().getBodySource(), cacheRequest, v.b(cacheRequest.getBody()));
        return response.s().b(new sv.h(h0.n(response, "Content-Type", null, 2, null), response.getBody().getContentLength(), v.c(bVar))).c();
    }

    @Override // mv.a0
    @NotNull
    public h0 intercept(@NotNull a0.a chain) {
        s eventListener;
        Intrinsics.checkNotNullParameter(chain, "chain");
        mv.e eVarCall = chain.call();
        mv.c cVar = this.cache;
        h0 h0VarB = cVar != null ? cVar.b(pv.b.b(chain.getRequest())) : null;
        d dVarB = new d.b(System.currentTimeMillis(), chain.getRequest(), h0VarB).b();
        f0 f0VarB = dVarB.getNetworkRequest();
        h0 h0VarA = dVarB.getCacheResponse();
        mv.c cVar2 = this.cache;
        if (cVar2 != null) {
            cVar2.n(dVarB);
        }
        m mVar = eVarCall instanceof m ? (m) eVarCall : null;
        if (mVar == null || (eventListener = mVar.getEventListener()) == null) {
            eventListener = s.NONE;
        }
        if (h0VarB != null && h0VarA == null) {
            n.f(h0VarB.getBody());
        }
        if (f0VarB == null && h0VarA == null) {
            h0 h0VarC = new h0.a().q(chain.getRequest()).o(e0.HTTP_1_1).f(504).l("Unsatisfiable Request (only-if-cached)").r(-1L).p(System.currentTimeMillis()).c();
            eventListener.satisfactionFailure(eVarCall, h0VarC);
            return h0VarC;
        }
        if (f0VarB == null) {
            Intrinsics.checkNotNull(h0VarA);
            h0 h0VarC2 = h0VarA.s().d(i.a(h0VarA)).c();
            eventListener.cacheHit(eVarCall, h0VarC2);
            return h0VarC2;
        }
        if (h0VarA != null) {
            eventListener.cacheConditionalHit(eVarCall, h0VarA);
        } else if (this.cache != null) {
            eventListener.cacheMiss(eVarCall);
        }
        try {
            h0 h0VarA2 = chain.a(f0VarB);
            if (h0VarA2 == null && h0VarB != null) {
                n.f(h0VarB.getBody());
            }
            if (h0VarA != null) {
                if (h0VarA2 != null && h0VarA2.getCode() == 304) {
                    h0 h0VarC3 = h0VarA.s().j(INSTANCE.b(h0VarA.getHeaders(), h0VarA2.getHeaders())).r(h0VarA2.getSentRequestAtMillis()).p(h0VarA2.getReceivedResponseAtMillis()).d(i.a(h0VarA)).m(i.a(h0VarA2)).c();
                    h0VarA2.getBody().close();
                    mv.c cVar3 = this.cache;
                    Intrinsics.checkNotNull(cVar3);
                    cVar3.m();
                    this.cache.o(h0VarA, h0VarC3);
                    eventListener.cacheHit(eVarCall, h0VarC3);
                    return h0VarC3;
                }
                n.f(h0VarA.getBody());
            }
            Intrinsics.checkNotNull(h0VarA2);
            h0 h0VarC4 = h0VarA2.s().d(h0VarA != null ? i.a(h0VarA) : null).m(i.a(h0VarA2)).c();
            if (this.cache != null) {
                f0 f0VarB2 = pv.b.b(f0VarB);
                if (sv.e.b(h0VarC4) && d.INSTANCE.a(h0VarC4, f0VarB2)) {
                    h0 h0VarA3 = a(this.cache.f(h0VarC4.s().q(f0VarB2).c()), h0VarC4);
                    if (h0VarA != null) {
                        eventListener.cacheMiss(eVarCall);
                    }
                    return h0VarA3;
                }
                if (sv.f.a(f0VarB.getMethod())) {
                    try {
                        this.cache.g(f0VarB);
                    } catch (IOException unused) {
                    }
                }
            }
            return h0VarC4;
        } catch (Throwable th2) {
            if (h0VarB != null) {
                n.f(h0VarB.getBody());
            }
            throw th2;
        }
    }
}
