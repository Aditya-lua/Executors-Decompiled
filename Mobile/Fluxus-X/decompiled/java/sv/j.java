package sv;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import mv.a0;
import mv.d0;
import mv.f0;
import mv.g0;
import mv.h0;
import mv.j0;
import mv.z;
import nv.q;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.p;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Regex;
import rv.m;
import rv.n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\f\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\f\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010%¨\u0006&"}, d2 = {"Lsv/j;", "Lmv/a0;", "Lmv/d0;", "client", "<init>", "(Lmv/d0;)V", "Lmv/a0$a;", "chain", "Lmv/h0;", "intercept", "(Lmv/a0$a;)Lmv/h0;", "Ljava/io/IOException;", "e", "Lrv/m;", "call", "Lmv/f0;", "userRequest", BuildConfig.FLAVOR, "d", "(Ljava/io/IOException;Lrv/m;Lmv/f0;)Z", "(Ljava/io/IOException;Lmv/f0;)Z", "requestSendStarted", "c", "(Ljava/io/IOException;Z)Z", "userResponse", "Lrv/h;", "exchange", "b", "(Lmv/h0;Lrv/h;)Lmv/f0;", BuildConfig.FLAVOR, "method", "a", "(Lmv/h0;Ljava/lang/String;)Lmv/f0;", BuildConfig.FLAVOR, "defaultDelay", "f", "(Lmv/h0;I)I", "Lmv/d0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d0 client;

    public j(@NotNull d0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    public final f0 a(h0 userResponse, String method) {
        String strN;
        z zVarS;
        if (!this.client.getFollowRedirects() || (strN = h0.n(userResponse, "Location", null, 2, null)) == null || (zVarS = userResponse.getRequest().getUrl().s(strN)) == null) {
            return null;
        }
        if (!Intrinsics.c(zVarS.getScheme(), userResponse.getRequest().getUrl().getScheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        f0.a aVarJ = userResponse.getRequest().j();
        if (f.c(method)) {
            int code = userResponse.getCode();
            f fVar = f.f31916a;
            boolean z10 = fVar.e(method) || code == 308 || code == 307;
            if (!fVar.d(method) || code == 308 || code == 307) {
                aVarJ.o(method, z10 ? userResponse.getRequest().getBody() : null);
            } else {
                aVarJ.o("GET", null);
            }
            if (!z10) {
                aVarJ.q("Transfer-Encoding");
                aVarJ.q("Content-Length");
                aVarJ.q("Content-Type");
            }
        }
        if (!q.f(userResponse.getRequest().getUrl(), zVarS)) {
            aVarJ.q("Authorization");
        }
        return aVarJ.v(zVarS).b();
    }

    public final f0 b(h0 userResponse, rv.h exchange) throws ProtocolException {
        n nVarJ;
        j0 j0VarU = (exchange == null || (nVarJ = exchange.j()) == null) ? null : nVarJ.u();
        int code = userResponse.getCode();
        String method = userResponse.getRequest().getMethod();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.getAuthenticator().a(j0VarU, userResponse);
            }
            if (code == 421) {
                g0 body = userResponse.getRequest().getBody();
                if ((body != null && body.g()) || exchange == null || !exchange.n()) {
                    return null;
                }
                exchange.j().t();
                return userResponse.getRequest();
            }
            if (code == 503) {
                h0 priorResponse = userResponse.getPriorResponse();
                if ((priorResponse == null || priorResponse.getCode() != 503) && f(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            if (code == 407) {
                Intrinsics.checkNotNull(j0VarU);
                if (j0VarU.getProxy().type() == Proxy.Type.HTTP) {
                    return this.client.getProxyAuthenticator().a(j0VarU, userResponse);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (code == 408) {
                if (!this.client.getRetryOnConnectionFailure()) {
                    return null;
                }
                g0 body2 = userResponse.getRequest().getBody();
                if (body2 != null && body2.g()) {
                    return null;
                }
                h0 priorResponse2 = userResponse.getPriorResponse();
                if ((priorResponse2 == null || priorResponse2.getCode() != 408) && f(userResponse, 0) <= 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            switch (code) {
                case MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE /* 300 */:
                case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return a(userResponse, method);
    }

    public final boolean c(IOException e10, boolean requestSendStarted) {
        if (e10 instanceof ProtocolException) {
            return false;
        }
        if (e10 instanceof InterruptedIOException) {
            return (e10 instanceof SocketTimeoutException) && !requestSendStarted;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final boolean d(IOException e10, m call, f0 userRequest) {
        boolean z10 = e10 instanceof uv.a;
        boolean z11 = !z10;
        if (this.client.getRetryOnConnectionFailure()) {
            return (z10 || !e(e10, userRequest)) && c(e10, z11) && call.F();
        }
        return false;
    }

    public final boolean e(IOException e10, f0 userRequest) {
        g0 body = userRequest.getBody();
        return (body != null && body.g()) || (e10 instanceof FileNotFoundException);
    }

    public final int f(h0 userResponse, int defaultDelay) {
        String strN = h0.n(userResponse, "Retry-After", null, 2, null);
        if (strN == null) {
            return defaultDelay;
        }
        if (!new Regex("\\d+").f(strN)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strN);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    @Override // mv.a0
    @NotNull
    public h0 intercept(@NotNull a0.a chain) throws Throwable {
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        f0 f0VarJ = gVar.j();
        m call = gVar.getCall();
        List listK = p.k();
        boolean z10 = false;
        int i10 = 0;
        h0 h0VarC = null;
        while (true) {
            boolean z11 = true;
            while (true) {
                call.k(f0VarJ, z11, gVar);
                try {
                    if (call.getCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                    } catch (IOException e10) {
                        boolean zD = d(e10, call, f0VarJ);
                        call.getEventListener().retryDecision(call, e10, zD);
                        if (!zD) {
                            throw nv.n.G(e10, listK);
                        }
                        listK = CollectionsKt.x0(listK, e10);
                        call.l(true);
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z10 = true;
                }
                call.l(z10);
                throw th;
            }
            h0VarC = gVar.a(f0VarJ).s().q(f0VarJ).n(h0VarC != null ? nv.i.a(h0VarC) : null).c();
            rv.h interceptorScopedExchange = call.getInterceptorScopedExchange();
            f0 f0VarB = b(h0VarC, interceptorScopedExchange);
            try {
                if (f0VarB == null) {
                    if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                        call.G();
                    }
                    call.getEventListener().followUpDecision(call, h0VarC, null);
                    call.l(false);
                    return h0VarC;
                }
                g0 body = f0VarB.getBody();
                if (body != null && body.g()) {
                    call.getEventListener().followUpDecision(call, h0VarC, null);
                    call.l(false);
                    return h0VarC;
                }
                nv.n.f(h0VarC.getBody());
                i10++;
                if (i10 > 20) {
                    call.getEventListener().followUpDecision(call, h0VarC, null);
                    throw new ProtocolException("Too many follow-up requests: " + i10);
                }
                call.getEventListener().followUpDecision(call, h0VarC, f0VarB);
                call.l(true);
                f0VarJ = f0VarB;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }
}
