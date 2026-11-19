package tv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import ew.j0;
import ew.l0;
import ew.m0;
import ew.o;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import mv.d0;
import mv.f0;
import mv.g0;
import mv.h0;
import mv.y;
import mv.z;
import nv.n;
import nv.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p001kotlin.text.x;
import sv.d;
import sv.i;
import sv.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ,2\u00020\u0001:\u0007(-$7?,*B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u001aH\u0016¢\u0006\u0004\b,\u0010#J\u000f\u0010-\u001a\u00020\u001aH\u0016¢\u0006\u0004\b-\u0010#J\u001d\u00102\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0019\u00107\u001a\u0004\u0018\u0001062\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b9\u0010:R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010;R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010DR\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010GR\u0018\u0010J\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010IR\u0018\u0010M\u001a\u000204*\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0018\u0010M\u001a\u000204*\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010Q\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010P¨\u0006R"}, d2 = {"Ltv/b;", "Lsv/d;", "Lmv/d0;", "client", "Lsv/d$a;", "carrier", "Lrv/a;", "socket", "<init>", "(Lmv/d0;Lsv/d$a;Lrv/a;)V", "Lew/j0;", "v", "()Lew/j0;", "y", "Lmv/z;", "url", BuildConfig.FLAVOR, "length", "Lew/l0;", "x", "(Lmv/z;J)Lew/l0;", "w", "(Lmv/z;)Lew/l0;", "z", "Lew/o;", "timeout", BuildConfig.FLAVOR, "r", "(Lew/o;)V", "Lmv/f0;", "request", "contentLength", "j", "(Lmv/f0;J)Lew/j0;", "cancel", "()V", "a", "(Lmv/f0;)V", "Lmv/h0;", Payload.RESPONSE, "f", "(Lmv/h0;)J", "d", "(Lmv/h0;)Lew/l0;", "g", "b", "Lmv/y;", "headers", BuildConfig.FLAVOR, "requestLine", "B", "(Lmv/y;Ljava/lang/String;)V", BuildConfig.FLAVOR, "expectContinue", "Lmv/h0$a;", "e", "(Z)Lmv/h0$a;", "A", "(Lmv/h0;)V", "Lmv/d0;", "Lsv/d$a;", "i", "()Lsv/d$a;", "c", "Lrv/a;", "s", "()Lrv/a;", BuildConfig.FLAVOR, "I", "state", "Ltv/a;", "Ltv/a;", "headersReader", "Lmv/y;", "trailers", "u", "(Lmv/h0;)Z", "isChunked", "t", "(Lmv/f0;)Z", "()Z", "isResponseComplete", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final y f32847h = y.INSTANCE.a("OkHttp-Response-Body", "Truncated");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final d0 client;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final d.a carrier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final rv.a socket;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final tv.a headersReader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public y trailers;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00188\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010 \"\u0004\b\u001e\u0010!¨\u0006#"}, d2 = {"Ltv/b$a;", "Lew/l0;", "Lmv/z;", "url", "<init>", "(Ltv/b;Lmv/z;)V", "Lew/m0;", "t", "()Lew/m0;", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", "Lmv/y;", "trailers", BuildConfig.FLAVOR, "b", "(Lmv/y;)V", "a", "Lmv/z;", "getUrl", "()Lmv/z;", "Lew/o;", "Lew/o;", "getTimeout", "()Lew/o;", "timeout", BuildConfig.FLAVOR, "c", "Z", "()Z", "(Z)V", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public abstract class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final z url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final o timeout;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f32855d;

        public a(@NotNull b bVar, z url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f32855d = bVar;
            this.url = url;
            this.timeout = new o(bVar.h().getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String().getTimeout());
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        public final void b(@NotNull y trailers) {
            d0 d0Var;
            mv.o cookieJar;
            Intrinsics.checkNotNullParameter(trailers, "trailers");
            if (this.f32855d.state == 6) {
                return;
            }
            if (this.f32855d.state != 5) {
                throw new IllegalStateException("state: " + this.f32855d.state);
            }
            this.f32855d.r(this.timeout);
            this.f32855d.trailers = trailers;
            this.f32855d.state = 6;
            if (trailers.size() <= 0 || (d0Var = this.f32855d.client) == null || (cookieJar = d0Var.getCookieJar()) == null) {
                return;
            }
            sv.e.f(cookieJar, this.url, trailers);
        }

        public final void c(boolean z10) {
            this.closed = z10;
        }

        @Override // ew.l0
        public long f3(@NotNull ew.e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return this.f32855d.h().getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String().f3(sink, byteCount);
            } catch (IOException e10) {
                this.f32855d.getCarrier().d();
                b(b.f32847h);
                throw e10;
            }
        }

        @Override // ew.l0
        @NotNull
        /* JADX INFO: renamed from: t */
        public m0 getTimeout() {
            return this.timeout;
        }
    }

    /* JADX INFO: renamed from: tv.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ltv/b$b;", "Lew/j0;", "<init>", "(Ltv/b;)V", "Lew/m0;", "t", "()Lew/m0;", "Lew/e;", Payload.SOURCE, BuildConfig.FLAVOR, "byteCount", BuildConfig.FLAVOR, "R2", "(Lew/e;J)V", "flush", "()V", "close", "Lew/o;", "a", "Lew/o;", "timeout", BuildConfig.FLAVOR, "b", "Z", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C0658b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final o timeout;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean closed;

        public C0658b() {
            this.timeout = new o(b.this.h().getSink().getTimeout());
        }

        @Override // ew.j0
        public void R2(@NotNull ew.e source, long byteCount) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            if (byteCount == 0) {
                return;
            }
            ew.f fVarB = b.this.h().getSink();
            fVarB.H2(byteCount);
            fVarB.D0("\r\n");
            fVarB.R2(source, byteCount);
            fVarB.D0("\r\n");
        }

        @Override // ew.j0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            b.this.h().getSink().D0("0\r\n\r\n");
            b.this.r(this.timeout);
            b.this.state = 3;
        }

        @Override // ew.j0, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            b.this.h().getSink().flush();
        }

        @Override // ew.j0
        @NotNull
        /* JADX INFO: renamed from: t */
        public m0 getTimeout() {
            return this.timeout;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Ltv/b$c;", "Ltv/b$a;", "Ltv/b;", "Lmv/z;", "url", "<init>", "(Ltv/b;Lmv/z;)V", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", BuildConfig.FLAVOR, "close", "()V", "d", "e", "J", "bytesRemainingInChunk", BuildConfig.FLAVOR, "f", "Z", "hasMoreChunks", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long bytesRemainingInChunk;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public boolean hasMoreChunks;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f32860g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull b bVar, z url) {
            super(bVar, url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f32860g = bVar;
            this.bytesRemainingInChunk = -1L;
            this.hasMoreChunks = true;
        }

        @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !q.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f32860g.getCarrier().d();
                b(b.f32847h);
            }
            c(true);
        }

        public final void d() throws ProtocolException {
            if (this.bytesRemainingInChunk != -1) {
                this.f32860g.h().getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String().b1();
            }
            try {
                this.bytesRemainingInChunk = this.f32860g.h().getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String().t3();
                String string = StringsKt.n1(this.f32860g.h().getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String().b1()).toString();
                if (this.bytesRemainingInChunk >= 0 && (string.length() <= 0 || x.T(string, ";", false, 2, null))) {
                    if (this.bytesRemainingInChunk == 0) {
                        this.hasMoreChunks = false;
                        b(this.f32860g.headersReader.a());
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + string + '\"');
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // tv.b.a, ew.l0
        public long f3(@NotNull ew.e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (!this.hasMoreChunks) {
                return -1L;
            }
            long j10 = this.bytesRemainingInChunk;
            if (j10 == 0 || j10 == -1) {
                d();
                if (!this.hasMoreChunks) {
                    return -1L;
                }
            }
            long jF3 = super.f3(sink, Math.min(byteCount, this.bytesRemainingInChunk));
            if (jF3 != -1) {
                this.bytesRemainingInChunk -= jF3;
                return jF3;
            }
            this.f32860g.getCarrier().d();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b(b.f32847h);
            throw protocolException;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltv/b$e;", "Ltv/b$a;", "Ltv/b;", "Lmv/z;", "url", BuildConfig.FLAVOR, "bytesRemaining", "<init>", "(Ltv/b;Lmv/z;J)V", "Lew/e;", "sink", "byteCount", "f3", "(Lew/e;J)J", BuildConfig.FLAVOR, "close", "()V", "e", "J", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public long bytesRemaining;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f32862f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@NotNull b bVar, z url, long j10) {
            super(bVar, url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f32862f = bVar;
            this.bytesRemaining = j10;
            if (j10 == 0) {
                b(y.f24791c);
            }
        }

        @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !q.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f32862f.getCarrier().d();
                b(b.f32847h);
            }
            c(true);
        }

        @Override // tv.b.a, ew.l0
        public long f3(@NotNull ew.e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            long j10 = this.bytesRemaining;
            if (j10 == 0) {
                return -1L;
            }
            long jF3 = super.f3(sink, Math.min(j10, byteCount));
            if (jF3 == -1) {
                this.f32862f.getCarrier().d();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b(b.f32847h);
                throw protocolException;
            }
            long j11 = this.bytesRemaining - jF3;
            this.bytesRemaining = j11;
            if (j11 == 0) {
                b(y.f24791c);
            }
            return jF3;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ltv/b$f;", "Lew/j0;", "<init>", "(Ltv/b;)V", "Lew/m0;", "t", "()Lew/m0;", "Lew/e;", Payload.SOURCE, BuildConfig.FLAVOR, "byteCount", BuildConfig.FLAVOR, "R2", "(Lew/e;J)V", "flush", "()V", "close", "Lew/o;", "a", "Lew/o;", "timeout", BuildConfig.FLAVOR, "b", "Z", "closed", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class f implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final o timeout;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean closed;

        public f() {
            this.timeout = new o(b.this.h().getSink().getTimeout());
        }

        @Override // ew.j0
        public void R2(@NotNull ew.e source, long byteCount) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.closed) {
                throw new IllegalStateException("closed");
            }
            n.e(source.getSize(), 0L, byteCount);
            b.this.h().getSink().R2(source, byteCount);
        }

        @Override // ew.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            b.this.r(this.timeout);
            b.this.state = 3;
        }

        @Override // ew.j0, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            b.this.h().getSink().flush();
        }

        @Override // ew.j0
        @NotNull
        /* JADX INFO: renamed from: t */
        public m0 getTimeout() {
            return this.timeout;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ltv/b$g;", "Ltv/b$a;", "Ltv/b;", "Lmv/z;", "url", "<init>", "(Ltv/b;Lmv/z;)V", "Lew/e;", "sink", BuildConfig.FLAVOR, "byteCount", "f3", "(Lew/e;J)J", BuildConfig.FLAVOR, "close", "()V", BuildConfig.FLAVOR, "e", "Z", "inputExhausted", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class g extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public boolean inputExhausted;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b f32866f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@NotNull b bVar, z url) {
            super(bVar, url);
            Intrinsics.checkNotNullParameter(url, "url");
            this.f32866f = bVar;
        }

        @Override // ew.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                b(b.f32847h);
            }
            c(true);
        }

        @Override // tv.b.a, ew.l0
        public long f3(@NotNull ew.e sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (byteCount < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (getClosed()) {
                throw new IllegalStateException("closed");
            }
            if (this.inputExhausted) {
                return -1L;
            }
            long jF3 = super.f3(sink, byteCount);
            if (jF3 != -1) {
                return jF3;
            }
            this.inputExhausted = true;
            b(y.f24791c);
            return -1L;
        }
    }

    public b(@Nullable d0 d0Var, @NotNull d.a carrier, @NotNull rv.a socket) {
        Intrinsics.checkNotNullParameter(carrier, "carrier");
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.client = d0Var;
        this.carrier = carrier;
        this.socket = socket;
        this.headersReader = new tv.a(h().getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String());
    }

    public final void A(@NotNull h0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        long jK = q.k(response);
        if (jK == -1) {
            return;
        }
        l0 l0VarX = x(response.getRequest().getUrl(), jK);
        q.o(l0VarX, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        l0VarX.close();
    }

    public final void B(@NotNull y headers, @NotNull String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        if (this.state != 0) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        h().getSink().D0(requestLine).D0("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            h().getSink().D0(headers.c(i10)).D0(": ").D0(headers.g(i10)).D0("\r\n");
        }
        h().getSink().D0("\r\n");
        this.state = 1;
    }

    @Override // sv.d
    public void a(@NotNull f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        i iVar = i.f31928a;
        Proxy.Type type = getCarrier().getRoute().getProxy().type();
        Intrinsics.checkNotNullExpressionValue(type, "type(...)");
        B(request.getHeaders(), iVar.a(request, type));
    }

    @Override // sv.d
    public void b() {
        h().getSink().flush();
    }

    @Override // sv.d
    public boolean c() {
        return this.state == 6;
    }

    @Override // sv.d
    public void cancel() {
        getCarrier().cancel();
    }

    @Override // sv.d
    @NotNull
    public l0 d(@NotNull h0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!sv.e.b(response)) {
            return x(response.getRequest().getUrl(), 0L);
        }
        if (u(response)) {
            return w(response.getRequest().getUrl());
        }
        long jK = q.k(response);
        return jK != -1 ? x(response.getRequest().getUrl(), jK) : z(response.getRequest().getUrl());
    }

    @Override // sv.d
    @Nullable
    public h0.a e(boolean expectContinue) throws IOException {
        int i10 = this.state;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.state).toString());
        }
        try {
            k kVarA = k.INSTANCE.a(this.headersReader.b());
            h0.a aVarJ = new h0.a().o(kVarA.protocol).f(kVarA.code).l(kVarA.message).j(this.headersReader.a());
            if (expectContinue && kVarA.code == 100) {
                return null;
            }
            int i11 = kVarA.code;
            if (i11 == 100) {
                this.state = 3;
                return aVarJ;
            }
            if (102 > i11 || i11 >= 200) {
                this.state = 4;
                return aVarJ;
            }
            this.state = 3;
            return aVarJ;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + getCarrier().getRoute().getAddress().getUrl().r(), e10);
        }
    }

    @Override // sv.d
    public long f(@NotNull h0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!sv.e.b(response)) {
            return 0L;
        }
        if (u(response)) {
            return -1L;
        }
        return q.k(response);
    }

    @Override // sv.d
    public void g() {
        h().getSink().flush();
    }

    @Override // sv.d
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public d.a getCarrier() {
        return this.carrier;
    }

    @Override // sv.d
    @NotNull
    public j0 j(@NotNull f0 request, long contentLength) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        g0 body = request.getBody();
        if (body != null && body.f()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (t(request)) {
            return v();
        }
        if (contentLength != -1) {
            return y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public final void r(o timeout) {
        m0 delegate = timeout.getDelegate();
        timeout.j(m0.f14833e);
        delegate.a();
        delegate.b();
    }

    @Override // sv.d
    @NotNull
    /* JADX INFO: renamed from: s, reason: from getter and merged with bridge method [inline-methods] */
    public rv.a h() {
        return this.socket;
    }

    public final boolean t(f0 f0Var) {
        return x.E("chunked", f0Var.e("Transfer-Encoding"), true);
    }

    public final boolean u(h0 h0Var) {
        return x.E("chunked", h0.n(h0Var, "Transfer-Encoding", null, 2, null), true);
    }

    public final j0 v() {
        if (this.state == 1) {
            this.state = 2;
            return new C0658b();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public final l0 w(z url) {
        if (this.state == 4) {
            this.state = 5;
            return new c(this, url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public final l0 x(z url, long length) {
        if (this.state == 4) {
            this.state = 5;
            return new e(this, url, length);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public final j0 y() {
        if (this.state == 1) {
            this.state = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }

    public final l0 z(z url) {
        if (this.state == 4) {
            this.state = 5;
            getCarrier().d();
            return new g(this, url);
        }
        throw new IllegalStateException(("state: " + this.state).toString());
    }
}
