package sv;

import com.github.luben.zstd.BuildConfig;
import ew.v;
import java.util.List;
import mv.a0;
import mv.b0;
import mv.f0;
import mv.g0;
import mv.h0;
import mv.i0;
import mv.n;
import mv.o;
import nv.q;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsv/a;", "Lmv/a0;", "Lmv/o;", "cookieJar", "<init>", "(Lmv/o;)V", "Lmv/a0$a;", "chain", "Lmv/h0;", "intercept", "(Lmv/a0$a;)Lmv/h0;", BuildConfig.FLAVOR, "Lmv/n;", "cookies", BuildConfig.FLAVOR, "a", "(Ljava/util/List;)Ljava/lang/String;", "Lmv/o;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o cookieJar;

    public a(@NotNull o cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    public final String a(List<n> cookies) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : cookies) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p.t();
            }
            n nVar = (n) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(nVar.getName());
            sb2.append('=');
            sb2.append(nVar.getValue());
            i10 = i11;
        }
        return sb2.toString();
    }

    @Override // mv.a0
    @NotNull
    public h0 intercept(@NotNull a0.a chain) {
        i0 body;
        Intrinsics.checkNotNullParameter(chain, "chain");
        f0 request = chain.getRequest();
        f0.a aVarJ = request.j();
        g0 body2 = request.getBody();
        if (body2 != null) {
            b0 mediaType = body2.getMediaType();
            if (mediaType != null) {
                aVarJ.m("Content-Type", mediaType.getMediaType());
            }
            long jA = body2.a();
            if (jA != -1) {
                aVarJ.m("Content-Length", String.valueOf(jA));
                aVarJ.q("Transfer-Encoding");
            } else {
                aVarJ.m("Transfer-Encoding", "chunked");
                aVarJ.q("Content-Length");
            }
        }
        boolean z10 = false;
        if (request.e("Host") == null) {
            aVarJ.m("Host", q.u(request.getUrl(), false, 1, null));
        }
        if (request.e("Connection") == null) {
            aVarJ.m("Connection", "Keep-Alive");
        }
        if (request.e("Accept-Encoding") == null && request.e("Range") == null) {
            aVarJ.m("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<n> listB = this.cookieJar.b(request.getUrl());
        if (!listB.isEmpty()) {
            aVarJ.m("Cookie", a(listB));
        }
        if (request.e("User-Agent") == null) {
            aVarJ.m("User-Agent", "okhttp/5.3.2");
        }
        f0 f0VarB = aVarJ.b();
        h0 h0VarA = chain.a(f0VarB);
        e.f(this.cookieJar, f0VarB.getUrl(), h0VarA.getHeaders());
        h0.a aVarQ = h0VarA.s().q(f0VarB);
        if (z10 && x.E("gzip", h0.n(h0VarA, "Content-Encoding", null, 2, null), true) && e.b(h0VarA) && (body = h0VarA.getBody()) != null) {
            ew.p pVar = new ew.p(body.getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String());
            aVarQ.j(h0VarA.getHeaders().e().i("Content-Encoding").i("Content-Length").f());
            aVarQ.b(new h(h0.n(h0VarA, "Content-Type", null, 2, null), -1L, v.c(pVar)));
        }
        return aVarQ.c();
    }
}
