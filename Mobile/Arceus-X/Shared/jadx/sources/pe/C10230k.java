package pe;

import af.C0204a0;
import af.C0218f0;
import af.C0226j0;
import af.C0228k0;
import af.EnumC0220g0;
import af.EnumC0238p0;
import androidx.core.app.NotificationCompat;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import kg.AbstractC7596l;
import kg.C7593i;
import kg.C7599o;
import kg.C7600p;
import p076df.C4582d;
import p515we.C12377k;

/* JADX INFO: renamed from: pe.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C10230k implements InterfaceC10237r {

    /* JADX INFO: renamed from: c */
    public static final Charset f36830c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final InputStream f36831a;

    /* JADX INFO: renamed from: b */
    public boolean f36832b = false;

    public C10230k(InputStream inputStream) {
        this.f36831a = inputStream;
    }

    /* JADX INFO: renamed from: c */
    public static int m39323c(AbstractC7596l abstractC7596l) throws IOException {
        if (!abstractC7596l.m31462u()) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!abstractC7596l.m31458h().m31482C()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jM46380a = C12377k.m46380a(abstractC7596l.m31458h().mo31450k());
            if (jM46380a > 4294967295L || jM46380a < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jM46380a;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static C0218f0.c m39324d(String str) {
        str.getClass();
        switch (str) {
            case "REMOTE":
                return C0218f0.c.REMOTE;
            case "SYMMETRIC":
                return C0218f0.c.SYMMETRIC;
            case "ASYMMETRIC_PRIVATE":
                return C0218f0.c.ASYMMETRIC_PRIVATE;
            case "ASYMMETRIC_PUBLIC":
                return C0218f0.c.ASYMMETRIC_PUBLIC;
            default:
                throw new C7600p("unknown key material type: " + str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static EnumC0238p0 m39325e(String str) {
        str.getClass();
        switch (str) {
            case "LEGACY":
                return EnumC0238p0.LEGACY;
            case "RAW":
                return EnumC0238p0.RAW;
            case "TINK":
                return EnumC0238p0.TINK;
            case "CRUNCHY":
                return EnumC0238p0.CRUNCHY;
            default:
                throw new C7600p("unknown output prefix type: " + str);
        }
    }

    /* JADX INFO: renamed from: f */
    public static EnumC0220g0 m39326f(String str) {
        str.getClass();
        switch (str) {
            case "ENABLED":
                return EnumC0220g0.ENABLED;
            case "DESTROYED":
                return EnumC0220g0.DESTROYED;
            case "DISABLED":
                return EnumC0220g0.DISABLED;
            default:
                throw new C7600p("unknown status: " + str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0228k0.c m39327i(C7599o c7599o) {
        return C0228k0.c.m850e0().m857E(m39326f(c7599o.m31468E(NotificationCompat.CATEGORY_STATUS).mo31451l())).m855C(m39323c(c7599o.m31468E("keyId"))).m856D(m39325e(c7599o.m31468E("outputPrefixType").mo31451l())).m858G(c7599o.m31468E("typeUrl").mo31451l()).build();
    }

    /* JADX INFO: renamed from: k */
    public static C0228k0 m39328k(C7599o c7599o) {
        C0228k0.b bVarM839e0 = C0228k0.m839e0();
        if (c7599o.m31471H("primaryKeyId")) {
            bVarM839e0.m844D(m39323c(c7599o.m31468E("primaryKeyId")));
        }
        if (c7599o.m31471H("keyInfo")) {
            C7593i c7593iM31469F = c7599o.m31469F("keyInfo");
            for (int i10 = 0; i10 < c7593iM31469F.size(); i10++) {
                bVarM839e0.m843C(m39327i(c7593iM31469F.m31442A(i10).m31457g()));
            }
        }
        return bVarM839e0.build();
    }

    /* JADX INFO: renamed from: l */
    public static void m39329l(C7599o c7599o) {
        if (!c7599o.m31471H("encryptedKeyset")) {
            throw new C7600p("invalid encrypted keyset");
        }
    }

    /* JADX INFO: renamed from: m */
    public static C10230k m39330m(String str) {
        return new C10230k(new ByteArrayInputStream(str.getBytes(f36830c)));
    }

    @Override // pe.InterfaceC10237r
    /* JADX INFO: renamed from: a */
    public C0204a0 mo39297a() throws IOException {
        try {
            try {
                C0204a0 c0204a0M39331b = m39331b(C12377k.m46382c(new String(C10228i0.m39319c(this.f36831a), f36830c)).m31457g());
                InputStream inputStream = this.f36831a;
                if (inputStream != null) {
                    inputStream.close();
                }
                return c0204a0M39331b;
            } catch (Throwable th2) {
                InputStream inputStream2 = this.f36831a;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th2;
            }
        } catch (IllegalStateException | C7600p e10) {
            throw new IOException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0204a0 m39331b(C7599o c7599o) {
        m39329l(c7599o);
        byte[] bArrM22659e = this.f36832b ? C4582d.m22659e(c7599o.m31468E("encryptedKeyset").mo31451l()) : C4582d.m22655a(c7599o.m31468E("encryptedKeyset").mo31451l());
        return c7599o.m31471H("keysetInfo") ? C0204a0.m583f0().m590D(AbstractC2920h.m13555e(bArrM22659e)).m591E(m39328k(c7599o.m31470G("keysetInfo"))).build() : C0204a0.m583f0().m590D(AbstractC2920h.m13555e(bArrM22659e)).build();
    }

    /* JADX INFO: renamed from: g */
    public final C0218f0 m39332g(C7599o c7599o) {
        if (c7599o.m31471H("typeUrl") && c7599o.m31471H("value") && c7599o.m31471H("keyMaterialType")) {
            return C0218f0.m720h0().m728D(c7599o.m31468E("typeUrl").mo31451l()).m729E(AbstractC2920h.m13555e(this.f36832b ? C4582d.m22659e(c7599o.m31468E("value").mo31451l()) : C4582d.m22655a(c7599o.m31468E("value").mo31451l()))).m727C(m39324d(c7599o.m31468E("keyMaterialType").mo31451l())).build();
        }
        throw new C7600p("invalid keyData");
    }

    /* JADX INFO: renamed from: h */
    public final C0226j0.c m39333h(C7599o c7599o) {
        if (!c7599o.m31471H("keyData") || !c7599o.m31471H(NotificationCompat.CATEGORY_STATUS) || !c7599o.m31471H("keyId") || !c7599o.m31471H("outputPrefixType")) {
            throw new C7600p("invalid key");
        }
        AbstractC7596l abstractC7596lM31468E = c7599o.m31468E("keyData");
        if (abstractC7596lM31468E.m31461t()) {
            return C0226j0.c.m814j0().m828J(m39326f(c7599o.m31468E(NotificationCompat.CATEGORY_STATUS).mo31451l())).m826E(m39323c(c7599o.m31468E("keyId"))).m827G(m39325e(c7599o.m31468E("outputPrefixType").mo31451l())).m825D(m39332g(abstractC7596lM31468E.m31457g())).build();
        }
        throw new C7600p("invalid key: keyData must be an object");
    }

    /* JADX INFO: renamed from: j */
    public final C0226j0 m39334j(C7599o c7599o) {
        if (!c7599o.m31471H("key")) {
            throw new C7600p("invalid keyset: no key");
        }
        AbstractC7596l abstractC7596lM31468E = c7599o.m31468E("key");
        if (!abstractC7596lM31468E.m31459m()) {
            throw new C7600p("invalid keyset: key must be an array");
        }
        C7593i c7593iM31456f = abstractC7596lM31468E.m31456f();
        if (c7593iM31456f.size() == 0) {
            throw new C7600p("invalid keyset: key is empty");
        }
        C0226j0.b bVarM797i0 = C0226j0.m797i0();
        if (c7599o.m31471H("primaryKeyId")) {
            bVarM797i0.m808D(m39323c(c7599o.m31468E("primaryKeyId")));
        }
        for (int i10 = 0; i10 < c7593iM31456f.size(); i10++) {
            bVarM797i0.m807C(m39333h(c7593iM31456f.m31442A(i10).m31457g()));
        }
        return bVarM797i0.build();
    }

    @Override // pe.InterfaceC10237r
    public C0226j0 read() throws IOException {
        try {
            try {
                C0226j0 c0226j0M39334j = m39334j(C12377k.m46382c(new String(C10228i0.m39319c(this.f36831a), f36830c)).m31457g());
                InputStream inputStream = this.f36831a;
                if (inputStream != null) {
                    inputStream.close();
                }
                return c0226j0M39334j;
            } catch (Throwable th2) {
                InputStream inputStream2 = this.f36831a;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th2;
            }
        } catch (IllegalStateException | C7600p e10) {
            throw new IOException(e10);
        }
    }
}
