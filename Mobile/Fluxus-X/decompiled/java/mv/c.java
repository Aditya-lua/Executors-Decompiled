package mv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.q0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u000449\u0014\u0019B)\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u000e\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0018\u00010\u0010R\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0000¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0013H\u0016¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0013H\u0016¢\u0006\u0004\b(\u0010&J\u0017\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0000¢\u0006\u0004\b-\u0010&R\u001a\u00101\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010;\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\u0016\u0010<\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0016\u0010=\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00103R\u0016\u0010>\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00103¨\u0006?"}, d2 = {"Lmv/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lew/b0;", "directory", BuildConfig.FLAVOR, "maxSize", "Lew/k;", "fileSystem", "Lqv/d;", "taskRunner", "<init>", "(Lew/b0;JLew/k;Lqv/d;)V", "(Lew/k;Lew/b0;J)V", "Ljava/io/File;", "(Ljava/io/File;J)V", "Lpv/f$b;", "Lpv/f;", "editor", BuildConfig.FLAVOR, "a", "(Lpv/f$b;)V", "Lmv/f0;", "request", "Lmv/h0;", "b", "(Lmv/f0;)Lmv/h0;", Payload.RESPONSE, "Lpv/c;", "f", "(Lmv/h0;)Lpv/c;", "g", "(Lmv/f0;)V", "cached", "network", "o", "(Lmv/h0;Lmv/h0;)V", "e", "()V", "flush", "close", "Lpv/d;", "cacheStrategy", "n", "(Lpv/d;)V", "m", "Lpv/f;", "getCache$okhttp", "()Lpv/f;", "cache", BuildConfig.FLAVOR, "I", "d", "()I", "k", "(I)V", "writeSuccessCount", "c", "h", "writeAbortCount", "networkCount", "hitCount", "requestCount", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final pv.f cache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public int writeSuccessCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int writeAbortCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int networkCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int hitCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int requestCount;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lmv/c$a;", "Lmv/i0;", "Lpv/f$d;", "Lpv/f;", "snapshot", BuildConfig.FLAVOR, "contentType", "contentLength", "<init>", "(Lpv/f$d;Ljava/lang/String;Ljava/lang/String;)V", "Lmv/b0;", "f", "()Lmv/b0;", BuildConfig.FLAVOR, "e", "()J", "Lew/g;", "l3", "()Lew/g;", "d", "Lpv/f$d;", "k", "()Lpv/f$d;", "Ljava/lang/String;", "g", "Lew/g;", "bodySource", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends i0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final pv.f.d snapshot;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String contentType;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String contentLength;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.g bodySource;

        /* JADX INFO: renamed from: mv.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"mv/c$a$a", "Lew/n;", BuildConfig.FLAVOR, "close", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0483a extends ew.n {
            public final /* synthetic */ a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0483a(ew.l0 l0Var, a aVar) {
                super(l0Var);
                this.b = aVar;
            }

            @Override // ew.n, ew.l0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.b.getSnapshot().close();
                super.close();
            }
        }

        public a(@NotNull pv.f.d snapshot, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = ew.v.c(new C0483a(snapshot.b(1), this));
        }

        @Override // mv.i0
        /* JADX INFO: renamed from: e */
        public long getContentLength() {
            String str = this.contentLength;
            if (str != null) {
                return nv.n.C(str, -1L);
            }
            return -1L;
        }

        @Override // mv.i0
        @Nullable
        /* JADX INFO: renamed from: f */
        public b0 getMediaType() {
            String str = this.contentType;
            if (str != null) {
                return b0.INSTANCE.b(str);
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: k, reason: from getter */
        public final pv.f.d getSnapshot() {
            return this.snapshot;
        }

        @Override // mv.i0
        @NotNull
        /* JADX INFO: renamed from: l3, reason: from getter */
        public ew.g getCom.appsflyer.sdk_base.referrer.Payload.SOURCE java.lang.String() {
            return this.bodySource;
        }
    }

    /* JADX INFO: renamed from: mv.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0014*\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0010*\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b*\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lmv/c$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/z;", "url", BuildConfig.FLAVOR, "b", "(Lmv/z;)Ljava/lang/String;", "Lew/g;", Payload.SOURCE, BuildConfig.FLAVOR, "c", "(Lew/g;)I", "Lmv/h0;", "cachedResponse", "Lmv/y;", "cachedRequest", "Lmv/f0;", "newRequest", BuildConfig.FLAVOR, "g", "(Lmv/h0;Lmv/y;Lmv/f0;)Z", "a", "(Lmv/h0;)Z", "f", "(Lmv/h0;)Lmv/y;", BuildConfig.FLAVOR, "d", "(Lmv/y;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "e", "(Lmv/y;Lmv/y;)Lmv/y;", "VERSION", "I", "ENTRY_METADATA", "ENTRY_BODY", "ENTRY_COUNT", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@NotNull h0 h0Var) {
            Intrinsics.checkNotNullParameter(h0Var, "<this>");
            return d(h0Var.getHeaders()).contains("*");
        }

        @NotNull
        public final String b(@NotNull z url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return ew.h.INSTANCE.d(url.getUrl()).B().r();
        }

        public final int c(@NotNull ew.g source) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            try {
                long jL2 = source.l2();
                String strB1 = source.b1();
                if (jL2 >= 0 && jL2 <= 2147483647L && strB1.length() <= 0) {
                    return (int) jL2;
                }
                throw new IOException("expected an int but was \"" + jL2 + strB1 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final Set<String> d(y yVar) {
            int size = yVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (p001kotlin.text.x.E("Vary", yVar.c(i10), true)) {
                    String strG = yVar.g(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(p001kotlin.text.x.G(p001kotlin.jvm.internal.g0.f21582a));
                    }
                    Iterator it = StringsKt.N0(strG, new char[]{','}, false, 0, 6, null).iterator();
                    while (it.hasNext()) {
                        treeSet.add(StringsKt.n1((String) it.next()).toString());
                    }
                }
            }
            return treeSet == null ? q0.d() : treeSet;
        }

        public final y e(y requestHeaders, y responseHeaders) {
            Set<String> setD = d(responseHeaders);
            if (setD.isEmpty()) {
                return y.f24791c;
            }
            y.a aVar = new y.a();
            int size = requestHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strC = requestHeaders.c(i10);
                if (setD.contains(strC)) {
                    aVar.a(strC, requestHeaders.g(i10));
                }
            }
            return aVar.f();
        }

        @NotNull
        public final y f(@NotNull h0 h0Var) {
            Intrinsics.checkNotNullParameter(h0Var, "<this>");
            h0 networkResponse = h0Var.getNetworkResponse();
            Intrinsics.checkNotNull(networkResponse);
            return e(networkResponse.getRequest().getHeaders(), h0Var.getHeaders());
        }

        public final boolean g(@NotNull h0 cachedResponse, @NotNull y cachedRequest, @NotNull f0 newRequest) {
            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.getHeaders());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!Intrinsics.c(cachedRequest.h(str), newRequest.f(str))) {
                    return false;
                }
            }
            return true;
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmv/c$d;", "Lpv/c;", "Lpv/f$b;", "Lpv/f;", "editor", "<init>", "(Lmv/c;Lpv/f$b;)V", BuildConfig.FLAVOR, "a", "()V", "Lew/j0;", "b", "()Lew/j0;", "Lpv/f$b;", "Lew/j0;", "cacheOut", "c", "body", BuildConfig.FLAVOR, "d", "Z", "()Z", "e", "(Z)V", "done", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class d implements pv.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final pv.f.b editor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ew.j0 cacheOut;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.j0 body;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public boolean done;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f24486e;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"mv/c$d$a", "Lew/m;", BuildConfig.FLAVOR, "close", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends ew.m {
            public final /* synthetic */ c b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f24487c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, d dVar, ew.j0 j0Var) {
                super(j0Var);
                this.b = cVar;
                this.f24487c = dVar;
            }

            @Override // ew.m, ew.j0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                c cVar = this.b;
                d dVar = this.f24487c;
                synchronized (cVar) {
                    if (dVar.getDone()) {
                        return;
                    }
                    dVar.e(true);
                    cVar.k(cVar.getWriteSuccessCount() + 1);
                    super.close();
                    this.f24487c.editor.c();
                }
            }
        }

        public d(@NotNull c cVar, pv.f.b editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            this.f24486e = cVar;
            this.editor = editor;
            ew.j0 j0VarG = editor.g(1);
            this.cacheOut = j0VarG;
            this.body = new a(cVar, this, j0VarG);
        }

        @Override // pv.c
        public void a() {
            c cVar = this.f24486e;
            synchronized (cVar) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cVar.h(cVar.getWriteAbortCount() + 1);
                nv.n.f(this.cacheOut);
                try {
                    this.editor.b();
                } catch (IOException unused) {
                }
            }
        }

        @Override // pv.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public ew.j0 getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getDone() {
            return this.done;
        }

        public final void e(boolean z10) {
            this.done = z10;
        }
    }

    public c(@NotNull ew.b0 directory, long j10, @NotNull ew.k fileSystem, @NotNull qv.d taskRunner) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.cache = new pv.f(fileSystem, directory, 201105, 2, j10, taskRunner);
    }

    public final void a(pv.f.b editor) {
        if (editor != null) {
            try {
                editor.b();
            } catch (IOException unused) {
            }
        }
    }

    @Nullable
    public final h0 b(@NotNull f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            pv.f.d dVarS = this.cache.s(INSTANCE.b(request.getUrl()));
            if (dVarS == null) {
                return null;
            }
            try {
                C0484c c0484c = new C0484c(dVarS.b(0));
                h0 h0VarC = c0484c.c(dVarS);
                if (c0484c.a(request, h0VarC)) {
                    return h0VarC;
                }
                nv.n.f(h0VarC.getBody());
                return null;
            } catch (IOException unused) {
                nv.n.f(dVarS);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cache.close();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final void e() {
        this.cache.A();
    }

    @Nullable
    public final pv.c f(@NotNull h0 response) {
        pv.f.b bVarR;
        Intrinsics.checkNotNullParameter(response, "response");
        String method = response.getRequest().getMethod();
        if (sv.f.a(response.getRequest().getMethod())) {
            try {
                g(response.getRequest());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!Intrinsics.c(method, "GET")) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.a(response)) {
            return null;
        }
        C0484c c0484c = new C0484c(response);
        try {
            bVarR = pv.f.r(this.cache, companion.b(response.getRequest().getUrl()), 0L, 2, null);
            if (bVarR == null) {
                return null;
            }
            try {
                c0484c.e(bVarR);
                return new d(this, bVarR);
            } catch (IOException unused2) {
                a(bVarR);
                return null;
            }
        } catch (IOException unused3) {
            bVarR = null;
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        this.cache.flush();
    }

    public final void g(@NotNull f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.cache.T(INSTANCE.b(request.getUrl()));
    }

    public final void h(int i10) {
        this.writeAbortCount = i10;
    }

    public final void k(int i10) {
        this.writeSuccessCount = i10;
    }

    public final synchronized void m() {
        this.hitCount++;
    }

    public final synchronized void n(@NotNull pv.d cacheStrategy) {
        try {
            Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            this.requestCount++;
            if (cacheStrategy.getNetworkRequest() != null) {
                this.networkCount++;
            } else if (cacheStrategy.getCacheResponse() != null) {
                this.hitCount++;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void o(@NotNull h0 cached, @NotNull h0 network) {
        pv.f.b bVarA;
        Intrinsics.checkNotNullParameter(cached, "cached");
        Intrinsics.checkNotNullParameter(network, "network");
        C0484c c0484c = new C0484c(network);
        i0 body = cached.getBody();
        Intrinsics.d(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            bVarA = ((a) body).getSnapshot().a();
            if (bVarA == null) {
                return;
            }
            try {
                c0484c.e(bVarA);
                bVarA.c();
            } catch (IOException unused) {
                a(bVarA);
            }
        } catch (IOException unused2) {
            bVarA = null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull ew.k fileSystem, @NotNull ew.b0 directory, long j10) {
        this(directory, j10, fileSystem, qv.d.f30482m);
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull File directory, long j10) {
        this(ew.k.b, ew.b0.Companion.d(ew.b0.INSTANCE, directory, false, 1, null), j10);
        Intrinsics.checkNotNullParameter(directory, "directory");
    }

    /* JADX INFO: renamed from: mv.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u0000 @2\u00020\u0001:\u0001\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tR\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00062\n\u0010\u0015\u001a\u00060\u0014R\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u00103\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010*R\u0014\u00105\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010'R\u0016\u00109\u001a\u0004\u0018\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<¨\u0006A"}, d2 = {"Lmv/c$c;", BuildConfig.FLAVOR, "Lew/l0;", "rawSource", "<init>", "(Lew/l0;)V", "Lmv/h0;", Payload.RESPONSE, "(Lmv/h0;)V", "Lpv/f$b;", "Lpv/f;", "editor", BuildConfig.FLAVOR, "e", "(Lpv/f$b;)V", "Lmv/f0;", "request", BuildConfig.FLAVOR, "a", "(Lmv/f0;Lmv/h0;)Z", "Lpv/f$d;", "snapshot", "c", "(Lpv/f$d;)Lmv/h0;", "Lew/g;", Payload.SOURCE, BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "b", "(Lew/g;)Ljava/util/List;", "Lew/f;", "sink", "certificates", "d", "(Lew/f;Ljava/util/List;)V", "Lmv/z;", "Lmv/z;", "url", "Lmv/y;", "Lmv/y;", "varyHeaders", BuildConfig.FLAVOR, "Ljava/lang/String;", "requestMethod", "Lmv/e0;", "Lmv/e0;", "protocol", BuildConfig.FLAVOR, "I", "code", "f", "message", "g", "responseHeaders", "Lmv/x;", "h", "Lmv/x;", "handshake", BuildConfig.FLAVOR, "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "k", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0484c {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public static final String f24472l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public static final String f24473m;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final z url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final y varyHeaders;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String requestMethod;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final e0 protocol;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final int code;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String message;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final y responseHeaders;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final x handshake;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        public final long sentRequestMillis;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        public final long receivedResponseMillis;

        static {
            StringBuilder sb2 = new StringBuilder();
            okhttp3.internal.platform.c.Companion companion = okhttp3.internal.platform.c.INSTANCE;
            sb2.append(companion.e().i());
            sb2.append("-Sent-Millis");
            f24472l = sb2.toString();
            f24473m = companion.e().i() + "-Received-Millis";
        }

        public C0484c(@NotNull ew.l0 rawSource) {
            Intrinsics.checkNotNullParameter(rawSource, "rawSource");
            try {
                ew.g gVarC = ew.v.c(rawSource);
                String strB1 = gVarC.b1();
                z zVarD = z.INSTANCE.d(strB1);
                if (zVarD == null) {
                    IOException iOException = new IOException("Cache corruption for " + strB1);
                    okhttp3.internal.platform.c.INSTANCE.e().m("cache corruption", 5, iOException);
                    throw iOException;
                }
                this.url = zVarD;
                this.requestMethod = gVarC.b1();
                y.a aVar = new y.a();
                int iC = c.INSTANCE.c(gVarC);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.c(gVarC.b1());
                }
                this.varyHeaders = aVar.f();
                sv.k kVarA = sv.k.INSTANCE.a(gVarC.b1());
                this.protocol = kVarA.protocol;
                this.code = kVarA.code;
                this.message = kVarA.message;
                y.a aVar2 = new y.a();
                int iC2 = c.INSTANCE.c(gVarC);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.c(gVarC.b1());
                }
                String str = f24472l;
                String strG = aVar2.g(str);
                String str2 = f24473m;
                String strG2 = aVar2.g(str2);
                aVar2.i(str);
                aVar2.i(str2);
                this.sentRequestMillis = strG != null ? Long.parseLong(strG) : 0L;
                this.receivedResponseMillis = strG2 != null ? Long.parseLong(strG2) : 0L;
                this.responseHeaders = aVar2.f();
                if (this.url.i()) {
                    String strB2 = gVarC.b1();
                    if (strB2.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + strB2 + '\"');
                    }
                    this.handshake = x.INSTANCE.d(!gVarC.c2() ? k0.INSTANCE.a(gVarC.b1()) : k0.SSL_3_0, j.INSTANCE.b(gVarC.b1()), b(gVarC), b(gVarC));
                } else {
                    this.handshake = null;
                }
                Unit unit = Unit.f21506a;
                lu.c.a(rawSource, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(rawSource, th2);
                    throw th3;
                }
            }
        }

        public final boolean a(@NotNull f0 request, @NotNull h0 response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return Intrinsics.c(this.url, request.getUrl()) && Intrinsics.c(this.requestMethod, request.getMethod()) && c.INSTANCE.g(response, this.varyHeaders, request);
        }

        public final List<Certificate> b(ew.g source) throws IOException {
            int iC = c.INSTANCE.c(source);
            if (iC == -1) {
                return p001kotlin.collections.p.k();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String strB1 = source.b1();
                    ew.e eVar = new ew.e();
                    ew.h hVarA = ew.h.INSTANCE.a(strB1);
                    if (hVarA == null) {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                    eVar.z1(hVarA);
                    arrayList.add(certificateFactory.generateCertificate(eVar.x3()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        @NotNull
        public final h0 c(@NotNull pv.f.d snapshot) {
            Intrinsics.checkNotNullParameter(snapshot, "snapshot");
            String strA = this.responseHeaders.a("Content-Type");
            String strA2 = this.responseHeaders.a("Content-Length");
            return new h0.a().q(new f0(this.url, this.varyHeaders, this.requestMethod, null, 8, null)).o(this.protocol).f(this.code).l(this.message).j(this.responseHeaders).b(new a(snapshot, strA, strA2)).h(this.handshake).r(this.sentRequestMillis).p(this.receivedResponseMillis).c();
        }

        public final void d(ew.f sink, List<? extends Certificate> certificates) throws IOException {
            try {
                sink.A1(certificates.size()).writeByte(10);
                Iterator<? extends Certificate> it = certificates.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    ew.h.Companion companion = ew.h.INSTANCE;
                    Intrinsics.checkNotNull(encoded);
                    sink.D0(ew.h.Companion.g(companion, encoded, 0, 0, 3, null).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final void e(@NotNull pv.f.b editor) {
            Intrinsics.checkNotNullParameter(editor, "editor");
            ew.f fVarB = ew.v.b(editor.g(0));
            try {
                fVarB.D0(this.url.getUrl()).writeByte(10);
                fVarB.D0(this.requestMethod).writeByte(10);
                fVarB.A1(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    fVarB.D0(this.varyHeaders.c(i10)).D0(": ").D0(this.varyHeaders.g(i10)).writeByte(10);
                }
                fVarB.D0(new sv.k(this.protocol, this.code, this.message).toString()).writeByte(10);
                fVarB.A1(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    fVarB.D0(this.responseHeaders.c(i11)).D0(": ").D0(this.responseHeaders.g(i11)).writeByte(10);
                }
                fVarB.D0(f24472l).D0(": ").A1(this.sentRequestMillis).writeByte(10);
                fVarB.D0(f24473m).D0(": ").A1(this.receivedResponseMillis).writeByte(10);
                if (this.url.i()) {
                    fVarB.writeByte(10);
                    x xVar = this.handshake;
                    Intrinsics.checkNotNull(xVar);
                    fVarB.D0(xVar.getCipherSuite().getJavaName()).writeByte(10);
                    d(fVarB, this.handshake.e());
                    d(fVarB, this.handshake.d());
                    fVarB.D0(this.handshake.getTlsVersion().getJavaName()).writeByte(10);
                }
                Unit unit = Unit.f21506a;
                lu.c.a(fVarB, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    lu.c.a(fVarB, th2);
                    throw th3;
                }
            }
        }

        public C0484c(@NotNull h0 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.url = response.getRequest().getUrl();
            this.varyHeaders = c.INSTANCE.f(response);
            this.requestMethod = response.getRequest().getMethod();
            this.protocol = response.getProtocol();
            this.code = response.getCode();
            this.message = response.getMessage();
            this.responseHeaders = response.getHeaders();
            this.handshake = response.getHandshake();
            this.sentRequestMillis = response.getSentRequestAtMillis();
            this.receivedResponseMillis = response.getReceivedResponseAtMillis();
        }
    }
}
