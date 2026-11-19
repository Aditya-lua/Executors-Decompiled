package mv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.net.URL;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001!B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0004\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00152\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b!\u0010.R\u0019\u0010/\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b(\u0010$R\u001a\u00103\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b,\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00105R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0011\u0010<\u001a\u0002048G¢\u0006\u0006\u001a\u0004\b%\u0010;¨\u0006="}, d2 = {"Lmv/f0;", BuildConfig.FLAVOR, "Lmv/f0$a;", "builder", "<init>", "(Lmv/f0$a;)V", "Lmv/z;", "url", "Lmv/y;", "headers", BuildConfig.FLAVOR, "method", "Lmv/g0;", "body", "(Lmv/z;Lmv/y;Ljava/lang/String;Lmv/g0;)V", "name", "e", "(Ljava/lang/String;)Ljava/lang/String;", BuildConfig.FLAVOR, "f", "(Ljava/lang/String;)Ljava/util/List;", "T", "Lxu/c;", Payload.TYPE, "l", "(Lxu/c;)Ljava/lang/Object;", "Ljava/lang/Class;", "k", "(Ljava/lang/Class;)Ljava/lang/Object;", "j", "()Lmv/f0$a;", "toString", "()Ljava/lang/String;", "a", "Lmv/z;", "m", "()Lmv/z;", "b", "Ljava/lang/String;", "i", "c", "Lmv/y;", "g", "()Lmv/y;", "d", "Lmv/g0;", "()Lmv/g0;", "cacheUrlOverride", "Lnv/g;", "Lnv/g;", "()Lnv/g;", "tags", "Lmv/d;", "Lmv/d;", "lazyCacheControl", BuildConfig.FLAVOR, "h", "()Z", "isHttps", "()Lmv/d;", "cacheControl", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final y headers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final g0 body;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final z cacheUrlOverride;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final nv.g tags;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public d lazyCacheControl;

    public f0(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        z url = builder.getUrl();
        if (url == null) {
            throw new IllegalStateException("url == null");
        }
        this.url = url;
        this.method = builder.getMethod();
        this.headers = builder.getHeaders().f();
        this.body = builder.getBody();
        this.cacheUrlOverride = builder.getCacheUrlOverride();
        this.tags = builder.getTags();
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final g0 getBody() {
        return this.body;
    }

    @NotNull
    public final d b() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d dVarA = d.INSTANCE.a(this.headers);
        this.lazyCacheControl = dVarA;
        return dVarA;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final z getCacheUrlOverride() {
        return this.cacheUrlOverride;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final nv.g getTags() {
        return this.tags;
    }

    @Nullable
    public final String e(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.a(name);
    }

    @NotNull
    public final List<String> f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.headers.h(name);
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final y getHeaders() {
        return this.headers;
    }

    public final boolean h() {
        return this.url.i();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final a j() {
        return new a(this);
    }

    @Nullable
    public final <T> T k(@NotNull Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) l(ou.a.c(type));
    }

    @Nullable
    public final <T> T l(@NotNull xu.c<T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (T) ou.a.a(type).cast(this.tags.a(type));
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final z getUrl() {
        return this.url;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    p001kotlin.collections.p.t();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strA = pair2.a();
                String strB = pair2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strA);
                sb2.append(':');
                if (nv.n.y(strA)) {
                    strB = "██";
                }
                sb2.append(strB);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!Intrinsics.c(this.tags, nv.a.f26630a)) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b%\u0010&J/\u0010+\u001a\u00020\u0000\"\b\b\u0000\u0010'*\u00020\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\b\u0010*\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b+\u0010,J/\u0010.\u001a\u00020\u0000\"\u0004\b\u0000\u0010'2\u000e\u0010)\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000-2\b\u0010*\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b1\u0010\rJ\u000f\u00102\u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u00103R$\u0010\b\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010$\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u001a\u001a\u00020>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010!\u001a\u0004\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\t\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u00100\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u00104\u001a\u0004\bI\u00106\"\u0004\bJ\u00108R\"\u0010Q\u001a\u00020K8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006R"}, d2 = {"Lmv/f0$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/f0;", "request", "(Lmv/f0;)V", BuildConfig.FLAVOR, "url", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Lmv/z;", "v", "(Lmv/z;)Lmv/f0$a;", "t", "(Ljava/lang/String;)Lmv/f0$a;", "Ljava/net/URL;", "u", "(Ljava/net/URL;)Lmv/f0$a;", "name", "value", "m", "(Ljava/lang/String;Ljava/lang/String;)Lmv/f0$a;", "a", "q", "Lmv/y;", "headers", "n", "(Lmv/y;)Lmv/f0$a;", "e", "()Lmv/f0$a;", "l", "Lmv/g0;", "body", "p", "(Lmv/g0;)Lmv/f0$a;", "method", "o", "(Ljava/lang/String;Lmv/g0;)Lmv/f0$a;", "T", "Lxu/c;", Payload.TYPE, "tag", "s", "(Lxu/c;Ljava/lang/Object;)Lmv/f0$a;", "Ljava/lang/Class;", "r", "(Ljava/lang/Class;Ljava/lang/Object;)Lmv/f0$a;", "cacheUrlOverride", "c", "b", "()Lmv/f0;", "Lmv/z;", "k", "()Lmv/z;", "setUrl$okhttp", "(Lmv/z;)V", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lmv/y$a;", "Lmv/y$a;", "h", "()Lmv/y$a;", "setHeaders$okhttp", "(Lmv/y$a;)V", "Lmv/g0;", "f", "()Lmv/g0;", "setBody$okhttp", "(Lmv/g0;)V", "g", "setCacheUrlOverride$okhttp", "Lnv/g;", "Lnv/g;", "j", "()Lnv/g;", "setTags$okhttp", "(Lnv/g;)V", "tags", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public z url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String method;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public y.a headers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public g0 body;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public z cacheUrlOverride;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public nv.g tags;

        public a() {
            this.tags = nv.a.f26630a;
            this.method = "GET";
            this.headers = new y.a();
        }

        @NotNull
        public a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.a(name, value);
            return this;
        }

        @NotNull
        public f0 b() {
            return new f0(this);
        }

        @NotNull
        public final a c(@Nullable z cacheUrlOverride) {
            this.cacheUrlOverride = cacheUrlOverride;
            return this;
        }

        public final String d(String url) {
            if (p001kotlin.text.x.R(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                return sb2.toString();
            }
            if (!p001kotlin.text.x.R(url, "wss:", true)) {
                return url;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https:");
            String strSubstring2 = url.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb3.append(strSubstring2);
            return sb3.toString();
        }

        @NotNull
        public a e() {
            return o("GET", null);
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public final g0 getBody() {
            return this.body;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final z getCacheUrlOverride() {
            return this.cacheUrlOverride;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final y.a getHeaders() {
            return this.headers;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final nv.g getTags() {
            return this.tags;
        }

        @Nullable
        /* JADX INFO: renamed from: k, reason: from getter */
        public final z getUrl() {
            return this.url;
        }

        @NotNull
        public a l() {
            return o("HEAD", null);
        }

        @NotNull
        public a m(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.headers.j(name, value);
            return this;
        }

        @NotNull
        public a n(@NotNull y headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.headers = headers.e();
            return this;
        }

        @NotNull
        public a o(@NotNull String method, @Nullable g0 body) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (body == null) {
                if (sv.f.f(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!sv.f.c(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        @NotNull
        public a p(@NotNull g0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return o("POST", body);
        }

        @NotNull
        public a q(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.headers.i(name);
            return this;
        }

        @NotNull
        public <T> a r(@NotNull Class<? super T> type, @Nullable T tag) {
            Intrinsics.checkNotNullParameter(type, "type");
            return s(ou.a.c(type), tag);
        }

        @NotNull
        public final <T> a s(@NotNull xu.c<T> type, @Nullable T tag) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.tags = this.tags.b(type, tag);
            return this;
        }

        @NotNull
        public a t(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return v(z.INSTANCE.c(d(url)));
        }

        @NotNull
        public a u(@NotNull URL url) {
            Intrinsics.checkNotNullParameter(url, "url");
            z.Companion bVar = z.INSTANCE;
            String string = url.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return v(bVar.c(string));
        }

        @NotNull
        public a v(@NotNull z url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            return this;
        }

        public a(@NotNull f0 request) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.tags = nv.a.f26630a;
            this.url = request.getUrl();
            this.method = request.getMethod();
            this.body = request.getBody();
            this.tags = request.getTags();
            this.headers = request.getHeaders().e();
            this.cacheUrlOverride = request.getCacheUrlOverride();
        }
    }

    public /* synthetic */ f0(z zVar, y yVar, String str, g0 g0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(zVar, (i10 & 2) != 0 ? y.INSTANCE.a(new String[0]) : yVar, (i10 & 4) != 0 ? "\u0000" : str, (i10 & 8) != 0 ? null : g0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(@NotNull z url, @NotNull y headers, @NotNull String method, @Nullable g0 g0Var) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        a aVarN = new a().v(url).n(headers);
        if (Intrinsics.c(method, "\u0000")) {
            if (g0Var != null) {
                method = "POST";
            } else {
                method = "GET";
            }
        }
        this(aVarN.o(method, g0Var));
    }
}
