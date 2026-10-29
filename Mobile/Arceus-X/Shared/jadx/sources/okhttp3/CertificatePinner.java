package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p560xu.C12930h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0003\"#$B#\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J)\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00120\u0015H\u0000¢\u0006\u0002\b\u0017J)\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0018\"\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000f\u001a\u00020\u0010J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006%"}, m31665d2 = {"Lokhttp3/CertificatePinner;", "", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getPins", "()Ljava/util/Set;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "check", "", "hostname", "", "peerCertificates", "", "Ljava/security/cert/Certificate;", "cleanedPeerCertificatesFn", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "check$okhttp", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "findMatchingPins", "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "equals", "", "other", "hashCode", "", "Pin", "Builder", "Companion", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class CertificatePinner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final CertificatePinner DEFAULT = new Builder().build();

    @Nullable
    private final CertificateChainCleaner certificateChainCleaner;

    @NotNull
    private final Set<Pin> pins;

    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\f\"\u00020\u000b¢\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m31665d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "<init>", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Builder {

        @NotNull
        private final List<Pin> pins = new ArrayList();

        @NotNull
        public final Builder add(@NotNull String pattern, @NotNull String... pins) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt.m31691Q0(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        @NotNull
        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "<init>", "()V", "Ljava/security/cert/X509Certificate;", "Lxu/h;", "sha1Hash", "(Ljava/security/cert/X509Certificate;)Lxu/h;", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", "", "pin", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.CertificatePinner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String pin(@NotNull Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).mo48097a();
        }

        @NotNull
        public final C12930h sha1Hash(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            C12930h.Companion companion = C12930h.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return C12930h.Companion.m48113g(companion, encoded, 0, 0, 3, null).m48087G();
        }

        @NotNull
        public final C12930h sha256Hash(@NotNull X509Certificate x509Certificate) {
            Intrinsics.checkNotNullParameter(x509Certificate, "<this>");
            C12930h.Companion companion = C12930h.INSTANCE;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
            return C12930h.Companion.m48113g(companion, encoded, 0, 0, 3, null).m48088H();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m31665d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "hostname", "", "matchesHostname", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getPattern", "hashAlgorithm", "getHashAlgorithm", "Lxu/h;", "hash", "Lxu/h;", "getHash", "()Lxu/h;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Pin {

        @NotNull
        private final C12930h hash;

        @NotNull
        private final String hashAlgorithm;

        @NotNull
        private final String pattern;

        /* JADX WARN: Code duplicated, block: B:16:0x004e  */
        /* JADX WARN: Code duplicated, block: B:18:0x005c  */
        /* JADX WARN: Code duplicated, block: B:20:0x0070  */
        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        /* JADX WARN: Code duplicated, block: B:24:0x0088  */
        /* JADX WARN: Code duplicated, block: B:26:0x0090  */
        /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
        /* JADX WARN: Instruction removed from duplicated block: B:22:0x0073, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:30:0x00a7, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:32:0x00bc, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:34:0x00d3, please report this as an issue */
        public Pin(@NotNull String pattern, @NotNull String pin) {
            String str;
            String canonicalHost;
            C12930h c12930hM48114a;
            C12930h c12930hM48114a2;
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(pin, "pin");
            if (C7797x.m32309T(pattern, "*.", false, 2, null)) {
                str = pattern;
                if (StringsKt.m32178n0(str, "*", 1, false, 4, null) != -1) {
                }
                canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
                if (canonicalHost != null) {
                    throw new IllegalArgumentException("Invalid pattern: " + str);
                }
                this.pattern = canonicalHost;
                if (C7797x.m32309T(pin, "sha1/", false, 2, null)) {
                    this.hashAlgorithm = "sha1";
                    C12930h.Companion companion = C12930h.INSTANCE;
                    String strSubstring = pin.substring(5);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    c12930hM48114a2 = companion.m48114a(strSubstring);
                    if (c12930hM48114a2 != null) {
                        this.hash = c12930hM48114a2;
                        return;
                    }
                    throw new IllegalArgumentException("Invalid pin hash: " + pin);
                }
                if (C7797x.m32309T(pin, "sha256/", false, 2, null)) {
                    throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
                }
                this.hashAlgorithm = "sha256";
                C12930h.Companion companion2 = C12930h.INSTANCE;
                String strSubstring2 = pin.substring(7);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                c12930hM48114a = companion2.m48114a(strSubstring2);
                if (c12930hM48114a != null) {
                    this.hash = c12930hM48114a;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            str = pattern;
            if ((!C7797x.m32309T(str, "**.", false, 2, null) || StringsKt.m32178n0(str, "*", 2, false, 4, null) != -1) && StringsKt.m32178n0(str, "*", 0, false, 6, null) != -1) {
                throw new IllegalArgumentException(("Unexpected pattern: " + str).toString());
            }
            canonicalHost = _HostnamesCommonKt.toCanonicalHost(str);
            if (canonicalHost != null) {
                throw new IllegalArgumentException("Invalid pattern: " + str);
            }
            this.pattern = canonicalHost;
            if (C7797x.m32309T(pin, "sha1/", false, 2, null)) {
                this.hashAlgorithm = "sha1";
                C12930h.Companion companion3 = C12930h.INSTANCE;
                String strSubstring3 = pin.substring(5);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                c12930hM48114a2 = companion3.m48114a(strSubstring3);
                if (c12930hM48114a2 != null) {
                    this.hash = c12930hM48114a2;
                    return;
                }
                throw new IllegalArgumentException("Invalid pin hash: " + pin);
            }
            if (C7797x.m32309T(pin, "sha256/", false, 2, null)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + pin);
            }
            this.hashAlgorithm = "sha256";
            C12930h.Companion companion4 = C12930h.INSTANCE;
            String strSubstring4 = pin.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
            c12930hM48114a = companion4.m48114a(strSubstring4);
            if (c12930hM48114a != null) {
                this.hash = c12930hM48114a;
                return;
            }
            throw new IllegalArgumentException("Invalid pin hash: " + pin);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.m31980c(this.pattern, pin.pattern) && Intrinsics.m31980c(this.hashAlgorithm, pin.hashAlgorithm) && Intrinsics.m31980c(this.hash, pin.hash);
        }

        @NotNull
        public final C12930h getHash() {
            return this.hash;
        }

        @NotNull
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(@NotNull X509Certificate certificate) {
            Intrinsics.checkNotNullParameter(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (Intrinsics.m31980c(str, "sha256")) {
                return Intrinsics.m31980c(this.hash, CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            if (Intrinsics.m31980c(str, "sha1")) {
                return Intrinsics.m31980c(this.hash, CertificatePinner.INSTANCE.sha1Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(@NotNull String hostname) {
            Intrinsics.checkNotNullParameter(hostname, "hostname");
            if (C7797x.m32309T(this.pattern, "**.", false, 2, null)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                return C7797x.m32298I(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null) && (length2 == 0 || hostname.charAt(length2 - 1) == '.');
            }
            if (!C7797x.m32309T(this.pattern, "*.", false, 2, null)) {
                return Intrinsics.m31980c(hostname, this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            return C7797x.m32298I(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null) && StringsKt.m32188s0(hostname, '.', (hostname.length() - length3) + (-1), false, 4, null) == -1;
        }

        @NotNull
        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.mo48097a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CertificatePinner(@NotNull Set<Pin> pins, @Nullable CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List check$lambda$0(CertificatePinner certificatePinner, List list, String str) {
        List<Certificate> listClean;
        CertificateChainCleaner certificateChainCleaner = certificatePinner.certificateChainCleaner;
        if (certificateChainCleaner != null && (listClean = certificateChainCleaner.clean(list, str)) != null) {
            list = listClean;
        }
        List<Certificate> list2 = list;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list2, 10));
        for (Certificate certificate : list2) {
            Intrinsics.m31981d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    @NotNull
    public static final String pin(@NotNull Certificate certificate) {
        return INSTANCE.pin(certificate);
    }

    @NotNull
    public static final C12930h sha1Hash(@NotNull X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    @NotNull
    public static final C12930h sha256Hash(@NotNull X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void check(@NotNull final String hostname, @NotNull final List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new Function0() { // from class: okhttp3.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CertificatePinner.check$lambda$0(this.f35518a, peerCertificates, hostname);
            }
        });
    }

    public final void check$okhttp(@NotNull String hostname, @NotNull Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> listFindMatchingPins = findMatchingPins(hostname);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> listInvoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : listInvoke) {
            C12930h c12930hSha256Hash = null;
            C12930h c12930hSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (Intrinsics.m31980c(hashAlgorithm, "sha256")) {
                    if (c12930hSha256Hash == null) {
                        c12930hSha256Hash = INSTANCE.sha256Hash(x509Certificate);
                    }
                    if (Intrinsics.m31980c(pin.getHash(), c12930hSha256Hash)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.m31980c(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (c12930hSha1Hash == null) {
                        c12930hSha1Hash = INSTANCE.sha1Hash(x509Certificate);
                    }
                    if (Intrinsics.m31980c(pin.getHash(), c12930hSha1Hash)) {
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
            sb2.append(INSTANCE.pin(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (Pin pin2 : listFindMatchingPins) {
            sb2.append("\n    ");
            sb2.append(pin2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) other;
        return Intrinsics.m31980c(certificatePinner.pins, this.pins) && Intrinsics.m31980c(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    @NotNull
    public final List<Pin> findMatchingPins(@NotNull String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Set<Pin> set = this.pins;
        List<Pin> listM31892k = C7699p.m31892k();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (listM31892k.isEmpty()) {
                    listM31892k = new ArrayList<>();
                }
                Intrinsics.m31981d(listM31892k, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal._UtilCommonKt.filterList>");
                C7739h0.m32038c(listM31892k).add(obj);
            }
        }
        return listM31892k;
    }

    @Nullable
    /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @NotNull
    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    @NotNull
    public final CertificatePinner withCertificateChainCleaner$okhttp(@NotNull CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.m31980c(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void check(@NotNull String hostname, @NotNull Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
        check(hostname, C7693m.m31867j0(peerCertificates));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 java.util.Set)
      (wrap okhttp3.internal.tls.CertificateChainCleaner:?: TERNARY null = ((wrap int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null okhttp3.internal.tls.CertificateChainCleaner) : (r2v0 okhttp3.internal.tls.CertificateChainCleaner))
     A[MD:(java.util.Set<okhttp3.CertificatePinner$Pin>, okhttp3.internal.tls.CertificateChainCleaner):void (m)] (LINE:4) call: okhttp3.CertificatePinner.<init>(java.util.Set, okhttp3.internal.tls.CertificateChainCleaner):void type: THIS */
    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i10 & 2) != 0 ? null : certificateChainCleaner);
    }
}
