package mv;

import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lmv/g0;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/b0;", "b", "()Lmv/b0;", BuildConfig.FLAVOR, "a", "()J", "Lew/f;", "sink", BuildConfig.FLAVOR, "h", "(Lew/f;)V", BuildConfig.FLAVOR, "f", "()Z", "g", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final g0 b;

    /* JADX INFO: renamed from: mv.g0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u0007*\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u0007*\u00020\n2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u0007*\u00020\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u0007*\u00020\u00132\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lmv/g0$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lmv/b0;", "contentType", "Lmv/g0;", "c", "(Ljava/lang/String;Lmv/b0;)Lmv/g0;", "Lew/h;", "a", "(Lew/h;Lmv/b0;)Lmv/g0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "offset", "byteCount", "h", "([BLmv/b0;II)Lmv/g0;", "Ljava/io/File;", "b", "(Ljava/io/File;Lmv/b0;)Lmv/g0;", "content", "e", "(Lmv/b0;Ljava/lang/String;)Lmv/g0;", "d", "(Lmv/b0;Lew/h;)Lmv/g0;", "g", "(Lmv/b0;[BII)Lmv/g0;", "EMPTY", "Lmv/g0;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: mv.g0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"mv/g0$a$a", "Lmv/g0;", "Lmv/b0;", "b", "()Lmv/b0;", BuildConfig.FLAVOR, "a", "()J", "Lew/f;", "sink", BuildConfig.FLAVOR, "h", "(Lew/f;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0485a extends g0 {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b0 f24602c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ File f24603d;

            public C0485a(b0 b0Var, File file) {
                this.f24602c = b0Var;
                this.f24603d = file;
            }

            @Override // mv.g0
            public long a() {
                return this.f24603d.length();
            }

            @Override // mv.g0
            /* JADX INFO: renamed from: b, reason: from getter */
            public b0 getContentType() {
                return this.f24602c;
            }

            @Override // mv.g0
            public void h(ew.f sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                ew.l0 l0VarI = ew.v.i(this.f24603d);
                try {
                    sink.h3(l0VarI);
                    lu.c.a(l0VarI, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        lu.c.a(l0VarI, th2);
                        throw th3;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: mv.g0$a$b */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"mv/g0$a$b", "Lmv/g0;", "Lmv/b0;", "b", "()Lmv/b0;", BuildConfig.FLAVOR, "a", "()J", "Lew/f;", "sink", BuildConfig.FLAVOR, "h", "(Lew/f;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b extends g0 {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b0 f24604c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ew.h f24605d;

            public b(b0 b0Var, ew.h hVar) {
                this.f24604c = b0Var;
                this.f24605d = hVar;
            }

            @Override // mv.g0
            public long a() {
                return this.f24605d.I();
            }

            @Override // mv.g0
            /* JADX INFO: renamed from: b, reason: from getter */
            public b0 getContentType() {
                return this.f24604c;
            }

            @Override // mv.g0
            public void h(ew.f sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.z1(this.f24605d);
            }
        }

        /* JADX INFO: renamed from: mv.g0$a$c */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"mv/g0$a$c", "Lmv/g0;", "Lmv/b0;", "b", "()Lmv/b0;", BuildConfig.FLAVOR, "a", "()J", "Lew/f;", "sink", BuildConfig.FLAVOR, "h", "(Lew/f;)V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c extends g0 {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b0 f24606c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f24607d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ byte[] f24608e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f24609f;

            public c(b0 b0Var, int i10, byte[] bArr, int i11) {
                this.f24606c = b0Var;
                this.f24607d = i10;
                this.f24608e = bArr;
                this.f24609f = i11;
            }

            @Override // mv.g0
            public long a() {
                return this.f24607d;
            }

            @Override // mv.g0
            /* JADX INFO: renamed from: b, reason: from getter */
            public b0 getContentType() {
                return this.f24606c;
            }

            @Override // mv.g0
            public void h(ew.f sink) {
                Intrinsics.checkNotNullParameter(sink, "sink");
                sink.write(this.f24608e, this.f24609f, this.f24607d);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ g0 i(Companion companion, ew.h hVar, b0 b0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                b0Var = null;
            }
            return companion.a(hVar, b0Var);
        }

        public static /* synthetic */ g0 j(Companion companion, String str, b0 b0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                b0Var = null;
            }
            return companion.c(str, b0Var);
        }

        public static /* synthetic */ g0 k(Companion companion, b0 b0Var, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.g(b0Var, bArr, i10, i11);
        }

        public static /* synthetic */ g0 l(Companion companion, byte[] bArr, b0 b0Var, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                b0Var = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.h(bArr, b0Var, i10, i11);
        }

        @NotNull
        public final g0 a(@NotNull ew.h hVar, @Nullable b0 b0Var) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            return new b(b0Var, hVar);
        }

        @NotNull
        public final g0 b(@NotNull File file, @Nullable b0 b0Var) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return new C0485a(b0Var, file);
        }

        @NotNull
        public final g0 c(@NotNull String str, @Nullable b0 b0Var) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Pair<Charset, b0> pairB = nv.b.b(b0Var);
            Charset charsetA = pairB.a();
            b0 b0VarB = pairB.b();
            byte[] bytes = str.getBytes(charsetA);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return h(bytes, b0VarB, 0, bytes.length);
        }

        @NotNull
        public final g0 d(@Nullable b0 contentType, @NotNull ew.h content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return a(content, contentType);
        }

        @NotNull
        public final g0 e(@Nullable b0 contentType, @NotNull String content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return c(content, contentType);
        }

        @NotNull
        public final g0 f(@Nullable b0 b0Var, @NotNull byte[] content) {
            Intrinsics.checkNotNullParameter(content, "content");
            return k(this, b0Var, content, 0, 0, 12, null);
        }

        @NotNull
        public final g0 g(@Nullable b0 contentType, @NotNull byte[] content, int offset, int byteCount) {
            Intrinsics.checkNotNullParameter(content, "content");
            return h(content, contentType, offset, byteCount);
        }

        @NotNull
        public final g0 h(@NotNull byte[] bArr, @Nullable b0 b0Var, int i10, int i11) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            nv.n.e(bArr.length, i10, i11);
            return new c(b0Var, i11, bArr, i10);
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        b = Companion.i(companion, ew.h.f14806e, null, 1, null);
    }

    @NotNull
    public static final g0 c(@Nullable b0 b0Var, @NotNull ew.h hVar) {
        return INSTANCE.d(b0Var, hVar);
    }

    @NotNull
    public static final g0 d(@Nullable b0 b0Var, @NotNull String str) {
        return INSTANCE.e(b0Var, str);
    }

    @NotNull
    public static final g0 e(@Nullable b0 b0Var, @NotNull byte[] bArr) {
        return INSTANCE.f(b0Var, bArr);
    }

    public long a() {
        return -1L;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract b0 getContentType();

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public abstract void h(@NotNull ew.f sink);
}
