package uv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.j0;
import ew.k0;
import ew.l0;
import ew.m0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import mv.d0;
import mv.e0;
import mv.f0;
import mv.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00100R\u0016\u00103\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00102R\u0014\u00105\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u00104R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Luv/t;", "Lsv/d;", "Lmv/d0;", "client", "Lsv/d$a;", "carrier", "Lsv/g;", "chain", "Luv/o;", "http2Connection", "<init>", "(Lmv/d0;Lsv/d$a;Lsv/g;Luv/o;)V", "Lmv/f0;", "request", BuildConfig.FLAVOR, "contentLength", "Lew/j0;", "j", "(Lmv/f0;J)Lew/j0;", BuildConfig.FLAVOR, "a", "(Lmv/f0;)V", "g", "()V", "b", BuildConfig.FLAVOR, "expectContinue", "Lmv/h0$a;", "e", "(Z)Lmv/h0$a;", "Lmv/h0;", Payload.RESPONSE, "f", "(Lmv/h0;)J", "Lew/l0;", "d", "(Lmv/h0;)Lew/l0;", "cancel", "Lsv/d$a;", "i", "()Lsv/d$a;", "Lsv/g;", "c", "Luv/o;", "Luv/v;", "Luv/v;", "stream", "Lmv/e0;", "Lmv/e0;", "protocol", "Z", "canceled", "()Z", "isResponseComplete", "Lew/k0;", "h", "()Lew/k0;", "socket", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t implements sv.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final List<String> f34060h = nv.q.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final List<String> f34061i = nv.q.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sv.d.a carrier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final sv.g chain;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o http2Connection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile v stream;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0 protocol;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public volatile boolean canceled;

    /* JADX INFO: renamed from: uv.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0014\u0010\u0019\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Luv/t$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/f0;", "request", BuildConfig.FLAVOR, "Luv/d;", "a", "(Lmv/f0;)Ljava/util/List;", "Lmv/y;", "headerBlock", "Lmv/e0;", "protocol", "Lmv/h0$a;", "b", "(Lmv/y;Lmv/e0;)Lmv/h0$a;", BuildConfig.FLAVOR, "CONNECTION", "Ljava/lang/String;", "HOST", "KEEP_ALIVE", "PROXY_CONNECTION", "TRANSFER_ENCODING", "TE", "ENCODING", "UPGRADE", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<d> a(@NotNull f0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            mv.y headers = request.getHeaders();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new d(d.f33974g, request.getMethod()));
            arrayList.add(new d(d.f33975h, sv.i.f31928a.c(request.getUrl())));
            String strE = request.e("Host");
            if (strE != null) {
                arrayList.add(new d(d.f33977j, strE));
            }
            arrayList.add(new d(d.f33976i, request.getUrl().getScheme()));
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strC = headers.c(i10);
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = strC.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (!t.f34060h.contains(lowerCase) || (Intrinsics.c(lowerCase, "te") && Intrinsics.c(headers.g(i10), "trailers"))) {
                    arrayList.add(new d(lowerCase, headers.g(i10)));
                }
            }
            return arrayList;
        }

        @NotNull
        public final h0.a b(@NotNull mv.y headerBlock, @NotNull e0 protocol) throws ProtocolException {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            mv.y.a aVar = new mv.y.a();
            int size = headerBlock.size();
            sv.k kVarA = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strC = headerBlock.c(i10);
                String strG = headerBlock.g(i10);
                if (Intrinsics.c(strC, ":status")) {
                    kVarA = sv.k.INSTANCE.a("HTTP/1.1 " + strG);
                } else if (!t.f34061i.contains(strC)) {
                    aVar.d(strC, strG);
                }
            }
            if (kVarA != null) {
                return new h0.a().o(protocol).f(kVarA.code).l(kVarA.message).j(aVar.f());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }

        public Companion() {
        }
    }

    public t(@NotNull d0 client, @NotNull sv.d.a carrier, @NotNull sv.g chain, @NotNull o http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.carrier = carrier;
        this.chain = chain;
        this.http2Connection = http2Connection;
        List<e0> listC = client.C();
        e0 e0Var = e0.H2_PRIOR_KNOWLEDGE;
        this.protocol = listC.contains(e0Var) ? e0Var : e0.HTTP_2;
    }

    @Override // sv.d
    public void a(@NotNull f0 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.w0(INSTANCE.a(request), request.getBody() != null);
        if (this.canceled) {
            v vVar = this.stream;
            Intrinsics.checkNotNull(vVar);
            vVar.i(b.CANCEL);
            throw new IOException("Canceled");
        }
        v vVar2 = this.stream;
        Intrinsics.checkNotNull(vVar2);
        m0 m0VarY = vVar2.y();
        long readTimeoutMillis = this.chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m0VarY.g(readTimeoutMillis, timeUnit);
        v vVar3 = this.stream;
        Intrinsics.checkNotNull(vVar3);
        vVar3.F().g(this.chain.getWriteTimeoutMillis(), timeUnit);
    }

    @Override // sv.d
    public void b() {
        v vVar = this.stream;
        Intrinsics.checkNotNull(vVar);
        vVar.b().close();
    }

    @Override // sv.d
    public boolean c() {
        v vVar = this.stream;
        return vVar != null && vVar.x();
    }

    @Override // sv.d
    public void cancel() {
        this.canceled = true;
        v vVar = this.stream;
        if (vVar != null) {
            vVar.i(b.CANCEL);
        }
    }

    @Override // sv.d
    @NotNull
    public l0 d(@NotNull h0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        v vVar = this.stream;
        Intrinsics.checkNotNull(vVar);
        return vVar.a();
    }

    @Override // sv.d
    @Nullable
    public h0.a e(boolean expectContinue) throws IOException {
        v vVar = this.stream;
        if (vVar == null) {
            throw new IOException("stream wasn't created");
        }
        h0.a aVarB = INSTANCE.b(vVar.D(expectContinue), this.protocol);
        if (expectContinue && aVarB.getCode() == 100) {
            return null;
        }
        return aVarB;
    }

    @Override // sv.d
    public long f(@NotNull h0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (sv.e.b(response)) {
            return nv.q.k(response);
        }
        return 0L;
    }

    @Override // sv.d
    public void g() {
        this.http2Connection.flush();
    }

    @Override // sv.d
    @NotNull
    public k0 h() {
        v vVar = this.stream;
        Intrinsics.checkNotNull(vVar);
        return vVar;
    }

    @Override // sv.d
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public sv.d.a getCarrier() {
        return this.carrier;
    }

    @Override // sv.d
    @NotNull
    public j0 j(@NotNull f0 request, long contentLength) {
        Intrinsics.checkNotNullParameter(request, "request");
        v vVar = this.stream;
        Intrinsics.checkNotNull(vVar);
        return vVar.b();
    }
}
