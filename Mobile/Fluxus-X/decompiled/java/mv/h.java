package mv;

import com.github.luben.zstd.BuildConfig;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 (2\u00020\u0001:\u0003(!\u000fB#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000b0\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lmv/h;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lmv/h$c;", "pins", "Lbw/c;", "certificateChainCleaner", "<init>", "(Ljava/util/Set;Lbw/c;)V", BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "Ljava/security/cert/Certificate;", "peerCertificates", BuildConfig.FLAVOR, "b", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "d", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "e", "(Ljava/lang/String;)Ljava/util/List;", "g", "(Lbw/c;)Lmv/h;", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "a", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lbw/c;", "f", "()Lbw/c;", "c", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final h f24611d = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<c> pins;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final bw.c certificateChainCleaner;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lmv/h$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lmv/h;", "a", "()Lmv/h;", BuildConfig.FLAVOR, "Lmv/h$c;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "pins", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<c> pins = new ArrayList();

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final h a() {
            return new h(CollectionsKt.Q0(this.pins), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: mv.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmv/h$b;", BuildConfig.FLAVOR, "<init>", "()V", "Ljava/security/cert/X509Certificate;", "Lew/h;", "b", "(Ljava/security/cert/X509Certificate;)Lew/h;", "c", "Ljava/security/cert/Certificate;", "certificate", BuildConfig.FLAVOR, "a", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lmv/h;", "DEFAULT", "Lmv/h;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + c((X509Certificate) certificate).a();
        }

        @NotNull
        public final ew.h b(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ew.h.Companion companion = ew.h.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return ew.h.Companion.g(companion, encoded, 0, 0, 3, null).G();
        }

        @NotNull
        public final ew.h c(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            ew.h.Companion companion = ew.h.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return ew.h.Companion.g(companion, encoded, 0, 0, 3, null).H();
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lmv/h$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "hostname", BuildConfig.FLAVOR, "c", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "a", "Ljava/lang/String;", "getPattern", "pattern", "b", "hashAlgorithm", "Lew/h;", "Lew/h;", "()Lew/h;", "hash", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String pattern;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String hashAlgorithm;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final ew.h hash;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ew.h getHash() {
            return this.hash;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final boolean c(@NotNull String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (p001kotlin.text.x.T(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                return p001kotlin.text.x.I(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!p001kotlin.text.x.T(this.pattern, "*.", false, 2, null)) {
                return Intrinsics.c(hostname, this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            return p001kotlin.text.x.I(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null) && StringsKt.s0(hostname, '.', (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.c(this.pattern, cVar.pattern) && Intrinsics.c(this.hashAlgorithm, cVar.hashAlgorithm) && Intrinsics.c(this.hash, cVar.hash);
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        @NotNull
        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.a();
        }
    }

    public h(@NotNull Set<c> pins, @Nullable bw.c cVar) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = cVar;
    }

    public static final List c(h hVar, List list, String str) {
        List<Certificate> listA;
        bw.c cVar = hVar.certificateChainCleaner;
        if (cVar != null && (listA = cVar.a(list, str)) != null) {
            list = listA;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list2, 10));
        for (Certificate certificate : list2) {
            Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    public final void b(@NotNull final String hostname, @NotNull final List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        d(hostname, new Function0() { // from class: mv.g
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.c(this.f24599a, peerCertificates, hostname);
            }
        });
    }

    public final void d(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> listE = e(hostname);
        if (listE.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            ew.h hVarC = null;
            ew.h hVarB = null;
            for (c cVar : listE) {
                String hashAlgorithm = cVar.getHashAlgorithm();
                if (Intrinsics.c(hashAlgorithm, "sha256")) {
                    if (hVarC == null) {
                        hVarC = INSTANCE.c(x509Certificate);
                    }
                    if (Intrinsics.c(cVar.getHash(), hVarC)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.c(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + cVar.getHashAlgorithm());
                    }
                    if (hVarB == null) {
                        hVarB = INSTANCE.b(x509Certificate);
                    }
                    if (Intrinsics.c(cVar.getHash(), hVarB)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : listInvoke) {
            sb2.append("\n    ");
            sb2.append(INSTANCE.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (c cVar2 : listE) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    @NotNull
    public final List<c> e(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<c> set = this.pins;
        List<c> listK = p001kotlin.collections.p.k();
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (listK.isEmpty()) {
                    listK = new ArrayList<>();
                }
                Intrinsics.d(listK, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal._UtilCommonKt.filterList>");
                p001kotlin.jvm.internal.h0.c(listK).add(obj);
            }
        }
        return listK;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return Intrinsics.c(hVar.pins, this.pins) && Intrinsics.c(hVar.certificateChainCleaner, this.certificateChainCleaner);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final bw.c getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @NotNull
    public final h g(@NotNull bw.c certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.c(this.certificateChainCleaner, certificateChainCleaner) ? this : new h(this.pins, certificateChainCleaner);
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        bw.c cVar = this.certificateChainCleaner;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ h(Set set, bw.c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }
}
