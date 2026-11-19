package mv;

import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u001e\u000fB9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\"\u0010!R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8G¢\u0006\u0006\u001a\u0004\b#\u0010)R\u0019\u0010-\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010'8G¢\u0006\u0006\u001a\u0004\b,\u0010)¨\u0006."}, d2 = {"Lmv/m;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "isTls", "supportsTlsExtensions", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "cipherSuitesAsString", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", BuildConfig.FLAVOR, "b", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "e", "(Ljavax/net/ssl/SSLSocket;)Z", "other", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "toString", "()Ljava/lang/String;", "g", "(Ljavax/net/ssl/SSLSocket;Z)Lmv/m;", "a", "Z", "f", "()Z", "h", "c", "[Ljava/lang/String;", "d", "()[Ljava/lang/String;", BuildConfig.FLAVOR, "Lmv/j;", "()Ljava/util/List;", "cipherSuites", "Lmv/k0;", "i", "tlsVersions", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final List<j> f24740f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final List<j> f24741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final m f24742h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final m f24743i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final m f24744j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final m f24745k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isTls;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean supportsTlsExtensions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String[] cipherSuitesAsString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String[] tlsVersionsAsString;

    static {
        j jVar = j.f24698o1;
        j jVar2 = j.f24701p1;
        j jVar3 = j.f24704q1;
        j jVar4 = j.f24657a1;
        j jVar5 = j.f24668e1;
        j jVar6 = j.f24659b1;
        j jVar7 = j.f24671f1;
        j jVar8 = j.f24689l1;
        j jVar9 = j.f24686k1;
        List<j> listN = p001kotlin.collections.p.n(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9);
        f24740f = listN;
        List<j> listN2 = p001kotlin.collections.p.n(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, j.L0, j.M0, j.f24682j0, j.f24685k0, j.H, j.L, j.f24687l);
        f24741g = listN2;
        a aVar = new a(true);
        j[] jVarArr = (j[]) listN.toArray(new j[0]);
        a aVarC = aVar.c((j[]) Arrays.copyOf(jVarArr, jVarArr.length));
        k0 k0Var = k0.TLS_1_3;
        k0 k0Var2 = k0.TLS_1_2;
        f24742h = aVarC.f(k0Var, k0Var2).d(true).a();
        a aVar2 = new a(true);
        j[] jVarArr2 = (j[]) listN2.toArray(new j[0]);
        f24743i = aVar2.c((j[]) Arrays.copyOf(jVarArr2, jVarArr2.length)).f(k0Var, k0Var2).d(true).a();
        a aVar3 = new a(true);
        j[] jVarArr3 = (j[]) listN2.toArray(new j[0]);
        f24744j = aVar3.c((j[]) Arrays.copyOf(jVarArr3, jVarArr3.length)).f(k0Var, k0Var2, k0.TLS_1_1, k0.TLS_1_0).d(true).a();
        f24745k = new a(false).a();
    }

    public m(boolean z10, boolean z11, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.isTls = z10;
        this.supportsTlsExtensions = z11;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    public final void b(@NotNull SSLSocket sslSocket, boolean isFallback) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        m mVarG = g(sslSocket, isFallback);
        if (mVarG.i() != null) {
            sslSocket.setEnabledProtocols(mVarG.tlsVersionsAsString);
        }
        if (mVarG.c() != null) {
            sslSocket.setEnabledCipherSuites(mVarG.cipherSuitesAsString);
        }
    }

    @Nullable
    public final List<j> c() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(j.INSTANCE.b(str));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String[] getCipherSuitesAsString() {
        return this.cipherSuitesAsString;
    }

    public final boolean e(@NotNull SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !nv.n.n(strArr, socket.getEnabledProtocols(), cu.a.b())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || nv.n.n(strArr2, socket.getEnabledCipherSuites(), j.INSTANCE.c());
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof m)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z10 = this.isTls;
        m mVar = (m) other;
        if (z10 != mVar.isTls) {
            return false;
        }
        return !z10 || (Arrays.equals(this.cipherSuitesAsString, mVar.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, mVar.tlsVersionsAsString) && this.supportsTlsExtensions == mVar.supportsTlsExtensions);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    public final m g(SSLSocket sslSocket, boolean isFallback) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        Intrinsics.checkNotNull(enabledCipherSuites);
        String[] strArrC = nv.b.c(this, enabledCipherSuites);
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = nv.n.w(enabledProtocols2, this.tlsVersionsAsString, cu.a.b());
        } else {
            enabledProtocols = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNull(supportedCipherSuites);
        int iO = nv.n.o(supportedCipherSuites, "TLS_FALLBACK_SCSV", j.INSTANCE.c());
        if (isFallback && iO != -1) {
            String str = supportedCipherSuites[iO];
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            strArrC = nv.n.g(strArrC, str);
        }
        return new a(this).b((String[]) Arrays.copyOf(strArrC, strArrC.length)).e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).a();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    @Nullable
    public final List<k0> i() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(k0.INSTANCE.a(str));
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(c(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\t\"\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0005R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u0005¨\u0006("}, d2 = {"Lmv/m$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "tls", "<init>", "(Z)V", "Lmv/m;", "connectionSpec", "(Lmv/m;)V", BuildConfig.FLAVOR, "Lmv/j;", "cipherSuites", "c", "([Lmv/j;)Lmv/m$a;", BuildConfig.FLAVOR, "b", "([Ljava/lang/String;)Lmv/m$a;", "Lmv/k0;", "tlsVersions", "f", "([Lmv/k0;)Lmv/m$a;", "e", "supportsTlsExtensions", "d", "(Z)Lmv/m$a;", "a", "()Lmv/m;", "Z", "getTls$okhttp", "()Z", "setTls$okhttp", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "setCipherSuites$okhttp", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "setTlsVersions$okhttp", "getSupportsTlsExtensions$okhttp", "setSupportsTlsExtensions$okhttp", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean tls;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public String[] cipherSuites;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String[] tlsVersions;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public boolean supportsTlsExtensions;

        public a(boolean z10) {
            this.tls = z10;
        }

        @NotNull
        public final m a() {
            return new m(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        @NotNull
        public final a b(@NotNull String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.cipherSuites = (String[]) objArrCopyOf;
            return this;
        }

        @NotNull
        public final a c(@NotNull j... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.tls) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (j jVar : cipherSuites) {
                arrayList.add(jVar.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @NotNull
        public final a d(boolean supportsTlsExtensions) {
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.supportsTlsExtensions = supportsTlsExtensions;
            return this;
        }

        @NotNull
        public final a e(@NotNull String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] objArrCopyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.tlsVersions = (String[]) objArrCopyOf;
            return this;
        }

        @NotNull
        public final a f(@NotNull k0... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.tls) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (k0 k0Var : tlsVersions) {
                arrayList.add(k0Var.getJavaName());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return e((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public a(@NotNull m connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.getIsTls();
            this.cipherSuites = connectionSpec.getCipherSuitesAsString();
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.getSupportsTlsExtensions();
        }
    }
}
