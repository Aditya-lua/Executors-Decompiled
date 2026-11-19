package mv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0003\u001b\u0016\u0014B'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0015R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0016\u0010'\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0011\u0010+\u001a\u00020(8G¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lmv/c0;", "Lmv/g0;", "Lew/h;", "boundaryByteString", "Lmv/b0;", Payload.TYPE, BuildConfig.FLAVOR, "Lmv/c0$c;", "parts", "<init>", "(Lew/h;Lmv/b0;Ljava/util/List;)V", "Lew/f;", "sink", BuildConfig.FLAVOR, "countBytes", BuildConfig.FLAVOR, "l", "(Lew/f;Z)J", "g", "()Z", "b", "()Lmv/b0;", "a", "()J", BuildConfig.FLAVOR, "h", "(Lew/f;)V", "c", "Lew/h;", "d", "Lmv/b0;", "k", "e", "Ljava/util/List;", "j", "()Ljava/util/List;", "f", "contentType", "J", "contentLength", BuildConfig.FLAVOR, "i", "()Ljava/lang/String;", "boundary", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final b0 f24489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final b0 f24490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final b0 f24491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final b0 f24492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final b0 f24493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final byte[] f24494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final byte[] f24495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final byte[] f24496p;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ew.h boundaryByteString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<c> parts;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b0 contentType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long contentLength;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001f¨\u0006!"}, d2 = {"Lmv/c0$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "boundary", "<init>", "(Ljava/lang/String;)V", "Lmv/b0;", Payload.TYPE, "e", "(Lmv/b0;)Lmv/c0$a;", "Lmv/y;", "headers", "Lmv/g0;", "body", "b", "(Lmv/y;Lmv/g0;)Lmv/c0$a;", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$a;", "Lmv/c0$c;", "part", "c", "(Lmv/c0$c;)Lmv/c0$a;", "Lmv/c0;", "d", "()Lmv/c0;", "Lew/h;", "Lew/h;", "Lmv/b0;", BuildConfig.FLAVOR, "Ljava/util/List;", "parts", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.h boundary;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public b0 type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<c> parts;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final a a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            c(c.INSTANCE.b(name, value));
            return this;
        }

        @NotNull
        public final a b(@Nullable y headers, @NotNull g0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            c(c.INSTANCE.a(headers, body));
            return this;
        }

        @NotNull
        public final a c(@NotNull c part) {
            Intrinsics.checkNotNullParameter(part, "part");
            this.parts.add(part);
            return this;
        }

        @NotNull
        public final c0 d() {
            if (this.parts.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new c0(this.boundary, this.type, nv.q.v(this.parts));
        }

        @NotNull
        public final a e(@NotNull b0 type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.c(type.getType(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        public a(@NotNull String boundary) {
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            this.boundary = ew.h.INSTANCE.d(boundary);
            this.type = c0.f24489i;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            }
            this(str);
        }
    }

    /* JADX INFO: renamed from: mv.c0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lmv/c0$b;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lmv/b0;", "MIXED", "Lmv/b0;", "ALTERNATIVE", "DIGEST", "PARALLEL", "FORM", BuildConfig.FLAVOR, "COLONSPACE", "[B", "CRLF", "DASHDASH", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull StringBuilder sb2, @NotNull String key) {
            Intrinsics.checkNotNullParameter(sb2, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb2.append('\"');
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt != '\"') {
                    sb2.append(cCharAt);
                } else {
                    sb2.append("%22");
                }
            }
            sb2.append('\"');
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"Lmv/c0$c;", BuildConfig.FLAVOR, "Lmv/y;", "headers", "Lmv/g0;", "body", "<init>", "(Lmv/y;Lmv/g0;)V", "a", "Lmv/y;", "b", "()Lmv/y;", "Lmv/g0;", "()Lmv/g0;", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final y headers;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final g0 body;

        /* JADX INFO: renamed from: mv.c0$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmv/c0$c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/y;", "headers", "Lmv/g0;", "body", "Lmv/c0$c;", "a", "(Lmv/y;Lmv/g0;)Lmv/c0$c;", BuildConfig.FLAVOR, "name", "value", "b", "(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;", "filename", "c", "(Ljava/lang/String;Ljava/lang/String;Lmv/g0;)Lmv/c0$c;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final c a(@Nullable y headers, @NotNull g0 body) {
                Intrinsics.checkNotNullParameter(body, "body");
                DefaultConstructorMarker defaultConstructorMarker = null;
                if ((headers != null ? headers.a("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type");
                }
                if ((headers != null ? headers.a("Content-Length") : null) == null) {
                    return new c(headers, body, defaultConstructorMarker);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }

            @NotNull
            public final c b(@NotNull String name, @NotNull String value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                return c(name, null, g0.Companion.j(g0.INSTANCE, value, null, 1, null));
            }

            @NotNull
            public final c c(@NotNull String name, @Nullable String filename, @NotNull g0 body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                Companion companion = c0.INSTANCE;
                companion.a(sb2, name);
                if (filename != null) {
                    sb2.append("; filename=");
                    companion.a(sb2, filename);
                }
                return a(new y.a().e("Content-Disposition", sb2.toString()).f(), body);
            }

            public Companion() {
            }
        }

        public /* synthetic */ c(y yVar, g0 g0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(yVar, g0Var);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final g0 getBody() {
            return this.body;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final y getHeaders() {
            return this.headers;
        }

        public c(y yVar, g0 g0Var) {
            this.headers = yVar;
            this.body = g0Var;
        }
    }

    static {
        b0.Companion companion = b0.INSTANCE;
        f24489i = companion.a("multipart/mixed");
        f24490j = companion.a("multipart/alternative");
        f24491k = companion.a("multipart/digest");
        f24492l = companion.a("multipart/parallel");
        f24493m = companion.a("multipart/form-data");
        f24494n = new byte[]{58, 32};
        f24495o = new byte[]{13, 10};
        f24496p = new byte[]{45, 45};
    }

    public c0(@NotNull ew.h boundaryByteString, @NotNull b0 type, @NotNull List<c> parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = b0.INSTANCE.a(type + "; boundary=" + i());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long l(ew.f sink, boolean countBytes) throws EOFException {
        ew.e eVar;
        if (countBytes) {
            sink = new ew.e();
            eVar = sink;
        } else {
            eVar = 0;
        }
        int size = this.parts.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.parts.get(i10);
            y headers = cVar.getHeaders();
            g0 body = cVar.getBody();
            Intrinsics.checkNotNull(sink);
            sink.write(f24496p);
            sink.z1(this.boundaryByteString);
            sink.write(f24495o);
            if (headers != null) {
                int size2 = headers.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    sink.D0(headers.c(i11)).write(f24494n).D0(headers.g(i11)).write(f24495o);
                }
            }
            b0 contentType = body.getContentType();
            if (contentType != null) {
                sink.D0("Content-Type: ").D0(contentType.getMediaType()).write(f24495o);
            }
            long jA = body.a();
            if (jA == -1 && countBytes) {
                Intrinsics.checkNotNull(eVar);
                eVar.a();
                return -1L;
            }
            byte[] bArr = f24495o;
            sink.write(bArr);
            if (countBytes) {
                j10 += jA;
            } else {
                body.h(sink);
            }
            sink.write(bArr);
        }
        Intrinsics.checkNotNull(sink);
        byte[] bArr2 = f24496p;
        sink.write(bArr2);
        sink.z1(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(f24495o);
        if (!countBytes) {
            return j10;
        }
        Intrinsics.checkNotNull(eVar);
        long size3 = j10 + eVar.getSize();
        eVar.a();
        return size3;
    }

    @Override // mv.g0
    public long a() throws EOFException {
        long j10 = this.contentLength;
        if (j10 != -1) {
            return j10;
        }
        long jL = l(null, true);
        this.contentLength = jL;
        return jL;
    }

    @Override // mv.g0
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public b0 getContentType() {
        return this.contentType;
    }

    @Override // mv.g0
    public boolean g() {
        List<c> list = this.parts;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).getBody().g()) {
                return true;
            }
        }
        return false;
    }

    @Override // mv.g0
    public void h(@NotNull ew.f sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        l(sink, false);
    }

    @NotNull
    public final String i() {
        return this.boundaryByteString.P();
    }

    @NotNull
    public final List<c> j() {
        return this.parts;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final b0 getType() {
        return this.type;
    }
}
