package mv;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00112\u00020\u0001:\u0002\u000b\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001e¨\u0006 "}, d2 = {"Lmv/i0;", "Ljava/io/Closeable;", "<init>", "()V", "Lmv/b0;", "f", "()Lmv/b0;", BuildConfig.FLAVOR, "e", "()J", "Ljava/io/InputStream;", "a", "()Ljava/io/InputStream;", "Lew/g;", "l3", "()Lew/g;", BuildConfig.FLAVOR, "b", "()[B", "Ljava/io/Reader;", "c", "()Ljava/io/Reader;", BuildConfig.FLAVOR, "h", "()Ljava/lang/String;", BuildConfig.FLAVOR, "close", "Ljava/nio/charset/Charset;", "d", "()Ljava/nio/charset/Charset;", "Ljava/io/Reader;", "reader", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class i0 implements Closeable {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final i0 f24648c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Reader reader;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lmv/i0$a;", "Ljava/io/Reader;", "Lew/g;", Payload.SOURCE, "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lew/g;Ljava/nio/charset/Charset;)V", BuildConfig.FLAVOR, "cbuf", BuildConfig.FLAVOR, "off", "len", "read", "([CII)I", BuildConfig.FLAVOR, "close", "()V", "a", "Lew/g;", "b", "Ljava/nio/charset/Charset;", BuildConfig.FLAVOR, "c", "Z", "closed", "d", "Ljava/io/Reader;", "delegate", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.g source;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Charset charset;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean closed;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Reader delegate;

        public a(@NotNull ew.g source, @NotNull Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cbuf, int off, int len) throws IOException {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.x3(), nv.q.n(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    /* JADX INFO: renamed from: mv.i0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u00020\u0007*\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmv/i0$b;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lmv/b0;", "contentType", "Lmv/i0;", "c", "(Ljava/lang/String;Lmv/b0;)Lmv/i0;", BuildConfig.FLAVOR, "e", "([BLmv/b0;)Lmv/i0;", "Lew/h;", "b", "(Lew/h;Lmv/b0;)Lmv/i0;", "Lew/g;", BuildConfig.FLAVOR, "contentLength", "a", "(Lew/g;Lmv/b0;J)Lmv/i0;", "content", "d", "(Lmv/b0;JLew/g;)Lmv/i0;", "EMPTY", "Lmv/i0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: mv.i0$b$a */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"mv/i0$b$a", "Lmv/i0;", "Lmv/b0;", "f", "()Lmv/b0;", BuildConfig.FLAVOR, "e", "()J", "Lew/g;", "l3", "()Lew/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class a extends i0 {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b0 f24653d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f24654e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ ew.g f24655f;

            public a(b0 b0Var, long j10, ew.g gVar) {
                this.f24653d = b0Var;
                this.f24654e = j10;
                this.f24655f = gVar;
            }

            @Override // mv.i0
            /* JADX INFO: renamed from: e, reason: from getter */
            public long getF24654e() {
                return this.f24654e;
            }

            @Override // mv.i0
            /* JADX INFO: renamed from: f, reason: from getter */
            public b0 getF24653d() {
                return this.f24653d;
            }

            @Override // mv.i0
            /* JADX INFO: renamed from: l3, reason: from getter */
            public ew.g getF24655f() {
                return this.f24655f;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ i0 f(Companion companion, ew.h hVar, b0 b0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                b0Var = null;
            }
            return companion.b(hVar, b0Var);
        }

        @NotNull
        public final i0 a(@NotNull ew.g gVar, @Nullable b0 b0Var, long j10) {
            Intrinsics.checkNotNullParameter(gVar, "<this>");
            return new a(b0Var, j10, gVar);
        }

        @NotNull
        public final i0 b(@NotNull ew.h hVar, @Nullable b0 b0Var) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            return a(new ew.e().z1(hVar), b0Var, hVar.I());
        }

        @NotNull
        public final i0 c(@NotNull String str, @Nullable b0 b0Var) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pair<Charset, b0> pairB = nv.b.b(b0Var);
            Charset charsetA = pairB.a();
            b0 b0VarB = pairB.b();
            ew.e eVarE0 = new ew.e().E0(str, charsetA);
            return a(eVarE0, b0VarB, eVarE0.getSize());
        }

        @NotNull
        public final i0 d(@Nullable b0 contentType, long contentLength, @NotNull ew.g content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return a(content, contentType, contentLength);
        }

        @NotNull
        public final i0 e(@NotNull byte[] bArr, @Nullable b0 b0Var) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            return a(new ew.e().write(bArr), b0Var, bArr.length);
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f24648c = Companion.f(companion, ew.h.f14806e, null, 1, null);
    }

    @NotNull
    public static final i0 g(@Nullable b0 b0Var, long j10, @NotNull ew.g gVar) {
        return INSTANCE.d(b0Var, j10, gVar);
    }

    @NotNull
    public final InputStream a() {
        return getF24655f().x3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @NotNull
    public final byte[] b() throws IllegalAccessException, IOException, InvocationTargetException {
        long f24654e = getF24654e();
        if (f24654e > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + f24654e);
        }
        ew.g f24655f = getF24655f();
        byte[] th2 = null;
        try {
            byte[] bArrA2 = f24655f.a2();
            if (f24655f != null) {
                try {
                    f24655f.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = bArrA2;
        } catch (Throwable th4) {
            th = th4;
            if (f24655f != null) {
                try {
                    f24655f.close();
                } catch (Throwable th5) {
                    zt.a.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th2.length;
        if (f24654e == -1 || f24654e == length) {
            return th2;
        }
        throw new IOException("Content-Length (" + f24654e + ") and stream length (" + length + ") disagree");
    }

    @NotNull
    public final Reader c() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(getF24655f(), d());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nv.n.f(getF24655f());
    }

    public final Charset d() {
        return nv.b.a(getF24653d());
    }

    /* JADX INFO: renamed from: e */
    public abstract long getF24654e();

    @Nullable
    /* JADX INFO: renamed from: f */
    public abstract b0 getF24653d();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @NotNull
    public final String h() throws IllegalAccessException, InvocationTargetException {
        ew.g f24655f = getF24655f();
        String th2 = null;
        try {
            String strC2 = f24655f.C2(nv.q.n(f24655f, d()));
            if (f24655f != null) {
                try {
                    f24655f.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = strC2;
        } catch (Throwable th4) {
            th = th4;
            if (f24655f != null) {
                try {
                    f24655f.close();
                } catch (Throwable th5) {
                    zt.a.a(th, th5);
                }
            }
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }

    @NotNull
    /* JADX INFO: renamed from: l3 */
    public abstract ew.g getF24655f();
}
