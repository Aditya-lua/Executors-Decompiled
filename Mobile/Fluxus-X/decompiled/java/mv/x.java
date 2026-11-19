package mv;

import com.github.luben.zstd.BuildConfig;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 #2\u00020\u0001:\u0001\u0017B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R!\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010!R\u0018\u0010&\u001a\u00020\u0014*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010%¨\u0006'"}, d2 = {"Lmv/x;", BuildConfig.FLAVOR, "Lmv/k0;", "tlsVersion", "Lmv/j;", "cipherSuite", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "localCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lmv/k0;Lmv/j;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "a", "Lmv/k0;", "g", "()Lmv/k0;", "b", "Lmv/j;", "()Lmv/j;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lzt/h;", "e", "peerCertificates", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final k0 tlsVersion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final j cipherSuite;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Certificate> localCertificates;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h peerCertificates;

    /* JADX INFO: renamed from: mv.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmv/x$a;", BuildConfig.FLAVOR, "<init>", "()V", "Ljavax/net/ssl/SSLSession;", "Lmv/x;", "c", "(Ljavax/net/ssl/SSLSession;)Lmv/x;", "Lmv/k0;", "tlsVersion", "Lmv/j;", "cipherSuite", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "peerCertificates", "localCertificates", "d", "(Lmv/k0;Lmv/j;Ljava/util/List;Ljava/util/List;)Lmv/x;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final List e(List list) {
            return list;
        }

        public static final List f(List list) {
            return list;
        }

        @NotNull
        public final x c(@NotNull SSLSession sSLSession) throws IOException {
            final List listK;
            Intrinsics.checkNotNullParameter(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (Intrinsics.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || Intrinsics.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            j jVarB = j.INSTANCE.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if (Intrinsics.c("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            k0 k0VarA = k0.INSTANCE.a(protocol);
            try {
                listK = nv.q.w(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                listK = p001kotlin.collections.p.k();
            }
            return new x(k0VarA, jVarB, nv.q.w(sSLSession.getLocalCertificates()), new Function0() { // from class: mv.w
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.Companion.f(listK);
                }
            });
        }

        @NotNull
        public final x d(@NotNull k0 tlsVersion, @NotNull j cipherSuite, @NotNull List<? extends Certificate> peerCertificates, @NotNull List<? extends Certificate> localCertificates) {
            Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
            Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
            Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
            Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
            final List listV = nv.q.v(peerCertificates);
            return new x(tlsVersion, cipherSuite, nv.q.v(localCertificates), new Function0() { // from class: mv.v
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.Companion.e(listV);
                }
            });
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(@NotNull k0 tlsVersion, @NotNull j cipherSuite, @NotNull List<? extends Certificate> localCertificates, @NotNull final Function0<? extends List<? extends Certificate>> peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        this.peerCertificates = zt.i.a(new Function0() { // from class: mv.u
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x.f(peerCertificatesFn);
            }
        });
    }

    public static final List f(Function0 function0) {
        try {
            return (List) function0.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return p001kotlin.collections.p.k();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final j getCipherSuite() {
        return this.cipherSuite;
    }

    public final String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }

    @NotNull
    public final List<Certificate> d() {
        return this.localCertificates;
    }

    @NotNull
    public final List<Certificate> e() {
        return (List) this.peerCertificates.getValue();
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof x)) {
            return false;
        }
        x xVar = (x) other;
        return xVar.tlsVersion == this.tlsVersion && Intrinsics.c(xVar.cipherSuite, this.cipherSuite) && Intrinsics.c(xVar.e(), e()) && Intrinsics.c(xVar.localCertificates, this.localCertificates);
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final k0 getTlsVersion() {
        return this.tlsVersion;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + e().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    @NotNull
    public String toString() {
        List<Certificate> listE = e();
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(listE, 10));
        Iterator<T> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(c((Certificate) it.next()));
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.tlsVersion);
        sb2.append(" cipherSuite=");
        sb2.append(this.cipherSuite);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        ArrayList arrayList2 = new ArrayList(p001kotlin.collections.q.u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
