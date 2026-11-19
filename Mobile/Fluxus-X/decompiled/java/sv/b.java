package sv;

import com.github.luben.zstd.BuildConfig;
import ew.v;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import mv.a0;
import mv.f0;
import mv.g0;
import mv.h0;
import mv.i0;
import mv.l0;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lsv/b;", "Lmv/a0;", "<init>", "()V", "Lmv/a0$a;", "chain", "Lmv/h0;", "intercept", "(Lmv/a0$a;)Lmv/h0;", BuildConfig.FLAVOR, "code", BuildConfig.FLAVOR, "a", "(I)Z", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f31910a = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sv/b$a", "Lmv/l0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements l0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ rv.h f31911c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i0 f31912d;

        public a(rv.h hVar, i0 i0Var) {
            this.f31911c = hVar;
            this.f31912d = i0Var;
        }
    }

    public final boolean a(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x020a  */
    /* JADX WARN: Code duplicated, block: B:96:0x020e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [mv.h0$a] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, mv.h0$a] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // mv.a0
    @NotNull
    public h0 intercept(@NotNull a0.a chain) throws IllegalAccessException, IOException, InvocationTargetException {
        boolean z10;
        ?? r10;
        IOException iOException;
        ?? S;
        h0 h0VarC;
        h0.a aVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        rv.h exchange = gVar.getExchange();
        Intrinsics.checkNotNull(exchange);
        f0 f0VarJ = gVar.j();
        g0 body = f0VarJ.getBody();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z11 = false;
        ?? r11 = (!f.c(f0VarJ.getMethod()) || body == null) ? 0 : 1;
        boolean zE = x.E("upgrade", f0VarJ.e("Connection"), true);
        try {
            exchange.x(f0VarJ);
            try {
                if (r11 != 0) {
                    if (x.E("100-continue", f0VarJ.e("Expect"), true)) {
                        exchange.h();
                        h0.a aVarS = exchange.s(true);
                        try {
                            exchange.u();
                            z10 = false;
                            aVar = aVarS;
                        } catch (IOException e10) {
                            e = e10;
                            z10 = true;
                            r10 = aVarS;
                            if (e instanceof uv.a) {
                                throw e;
                            }
                            if (!exchange.getHasFailure()) {
                                throw e;
                            }
                            ?? r17 = r10;
                            iOException = e;
                            S = r17;
                        }
                    } else {
                        z10 = true;
                        aVar = null;
                    }
                    if (aVar != null) {
                        exchange.q();
                        r11 = aVar;
                        if (!exchange.j().r()) {
                            exchange.p();
                            r11 = aVar;
                        }
                    } else if (body.f()) {
                        exchange.h();
                        body.h(v.b(exchange.e(f0VarJ, true)));
                        r11 = aVar;
                    } else {
                        ew.f fVarB = v.b(exchange.e(f0VarJ, false));
                        body.h(fVarB);
                        fVarB.close();
                        r11 = aVar;
                    }
                } else {
                    exchange.q();
                    z10 = true;
                    r11 = 0;
                }
                if (body == null || !body.f()) {
                    exchange.g();
                }
                S = r11;
                iOException = null;
            } catch (IOException e11) {
                e = e11;
                r10 = r11;
            }
        } catch (IOException e12) {
            e = e12;
            z10 = true;
            r10 = 0;
        }
        if (S == 0) {
            try {
                S = exchange.s(false);
                Intrinsics.checkNotNull(S);
                if (z10) {
                    exchange.u();
                    z10 = false;
                }
            } catch (IOException e13) {
                e = e13;
                if (iOException != null) {
                    throw e;
                }
                zt.a.a(iOException, e);
                throw iOException;
            }
        }
        h0 h0VarC2 = S.q(f0VarJ).h(exchange.j().getHandshake()).r(jCurrentTimeMillis).p(System.currentTimeMillis()).c();
        int code = h0VarC2.getCode();
        while (a(code)) {
            try {
                h0.a aVarS2 = exchange.s(z11);
                Intrinsics.checkNotNull(aVarS2);
                if (z10) {
                    exchange.u();
                }
                h0VarC2 = aVarS2.q(f0VarJ).h(exchange.j().getHandshake()).r(jCurrentTimeMillis).p(System.currentTimeMillis()).c();
                code = h0VarC2.getCode();
                z11 = false;
            } catch (IOException e14) {
                e = e14;
                if (iOException != null) {
                    throw e;
                }
                zt.a.a(iOException, e);
                throw iOException;
            }
        }
        exchange.t(h0VarC2);
        boolean z12 = code == 101;
        if (z12 && exchange.j().r()) {
            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
        }
        boolean z13 = z12 && x.E("upgrade", h0.n(h0VarC2, "Connection", null, 2, null), true);
        if (zE && z13) {
            h0VarC = h0VarC2.s().b(new nv.h(h0VarC2.getBody().getMediaType(), h0VarC2.getBody().getContentLength())).s(exchange.w()).c();
        } else {
            i0 i0VarR = exchange.r(h0VarC2);
            h0VarC = h0VarC2.s().b(i0VarR).t(new a(exchange, i0VarR)).c();
        }
        if (x.E("close", h0VarC.getRequest().e("Connection"), true) || x.E("close", h0.n(h0VarC, "Connection", null, 2, null), true)) {
            exchange.p();
        }
        if ((code != 204 && code != 205) || h0VarC.getBody().getContentLength() <= 0) {
            return h0VarC;
        }
        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + h0VarC.getBody().getContentLength());
    }
}
