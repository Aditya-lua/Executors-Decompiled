package pe;

import af.j0;
import af.k0;
import af.p0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f28675c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f28676a;
    public boolean b = false;

    public k(InputStream inputStream) {
        this.f28676a = inputStream;
    }

    public static int c(jg.l lVar) throws IOException {
        if (!lVar.u()) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!lVar.h().C()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jA = we.k.a(lVar.h().k());
            if (jA > 4294967295L || jA < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jA;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    public static af.f0.c d(String str) {
        str.getClass();
        switch (str) {
            case "REMOTE":
                return af.f0.c.REMOTE;
            case "SYMMETRIC":
                return af.f0.c.SYMMETRIC;
            case "ASYMMETRIC_PRIVATE":
                return af.f0.c.ASYMMETRIC_PRIVATE;
            case "ASYMMETRIC_PUBLIC":
                return af.f0.c.ASYMMETRIC_PUBLIC;
            default:
                throw new jg.p("unknown key material type: " + str);
        }
    }

    public static p0 e(String str) {
        str.getClass();
        switch (str) {
            case "LEGACY":
                return p0.LEGACY;
            case "RAW":
                return p0.RAW;
            case "TINK":
                return p0.TINK;
            case "CRUNCHY":
                return p0.CRUNCHY;
            default:
                throw new jg.p("unknown output prefix type: " + str);
        }
    }

    public static af.g0 f(String str) {
        str.getClass();
        switch (str) {
            case "ENABLED":
                return af.g0.ENABLED;
            case "DESTROYED":
                return af.g0.DESTROYED;
            case "DISABLED":
                return af.g0.DISABLED;
            default:
                throw new jg.p("unknown status: " + str);
        }
    }

    public static k0.c i(jg.o oVar) {
        return k0.c.e0().E(f(oVar.E("status").l())).C(c(oVar.E("keyId"))).D(e(oVar.E("outputPrefixType").l())).G(oVar.E("typeUrl").l()).build();
    }

    public static k0 k(jg.o oVar) {
        k0.b bVarE0 = k0.e0();
        if (oVar.H("primaryKeyId")) {
            bVarE0.D(c(oVar.E("primaryKeyId")));
        }
        if (oVar.H("keyInfo")) {
            jg.i iVarF = oVar.F("keyInfo");
            for (int i10 = 0; i10 < iVarF.size(); i10++) {
                bVarE0.C(i(iVarF.A(i10).g()));
            }
        }
        return bVarE0.build();
    }

    public static void l(jg.o oVar) {
        if (!oVar.H("encryptedKeyset")) {
            throw new jg.p("invalid encrypted keyset");
        }
    }

    public static k m(String str) {
        return new k(new ByteArrayInputStream(str.getBytes(f28675c)));
    }

    @Override // pe.r
    public af.a0 a() throws IOException {
        try {
            try {
                af.a0 a0VarB = b(we.k.c(new String(i0.c(this.f28676a), f28675c)).g());
                InputStream inputStream = this.f28676a;
                if (inputStream != null) {
                    inputStream.close();
                }
                return a0VarB;
            } catch (Throwable th2) {
                InputStream inputStream2 = this.f28676a;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th2;
            }
        } catch (IllegalStateException | jg.p e10) {
            throw new IOException(e10);
        }
    }

    public final af.a0 b(jg.o oVar) {
        l(oVar);
        byte[] bArrE = this.b ? df.d.e(oVar.E("encryptedKeyset").l()) : df.d.a(oVar.E("encryptedKeyset").l());
        return oVar.H("keysetInfo") ? af.a0.f0().D(com.google.crypto.tink.shaded.protobuf.h.e(bArrE)).E(k(oVar.G("keysetInfo"))).build() : af.a0.f0().D(com.google.crypto.tink.shaded.protobuf.h.e(bArrE)).build();
    }

    public final af.f0 g(jg.o oVar) {
        if (oVar.H("typeUrl") && oVar.H("value") && oVar.H("keyMaterialType")) {
            return af.f0.h0().D(oVar.E("typeUrl").l()).E(com.google.crypto.tink.shaded.protobuf.h.e(this.b ? df.d.e(oVar.E("value").l()) : df.d.a(oVar.E("value").l()))).C(d(oVar.E("keyMaterialType").l())).build();
        }
        throw new jg.p("invalid keyData");
    }

    public final j0.c h(jg.o oVar) {
        if (!oVar.H("keyData") || !oVar.H("status") || !oVar.H("keyId") || !oVar.H("outputPrefixType")) {
            throw new jg.p("invalid key");
        }
        jg.l lVarE = oVar.E("keyData");
        if (lVarE.t()) {
            return j0.c.j0().J(f(oVar.E("status").l())).E(c(oVar.E("keyId"))).G(e(oVar.E("outputPrefixType").l())).D(g(lVarE.g())).build();
        }
        throw new jg.p("invalid key: keyData must be an object");
    }

    public final j0 j(jg.o oVar) {
        if (!oVar.H("key")) {
            throw new jg.p("invalid keyset: no key");
        }
        jg.l lVarE = oVar.E("key");
        if (!lVarE.m()) {
            throw new jg.p("invalid keyset: key must be an array");
        }
        jg.i iVarF = lVarE.f();
        if (iVarF.size() == 0) {
            throw new jg.p("invalid keyset: key is empty");
        }
        j0.b bVarI0 = j0.i0();
        if (oVar.H("primaryKeyId")) {
            bVarI0.D(c(oVar.E("primaryKeyId")));
        }
        for (int i10 = 0; i10 < iVarF.size(); i10++) {
            bVarI0.C(h(iVarF.A(i10).g()));
        }
        return bVarI0.build();
    }

    @Override // pe.r
    public j0 read() throws IOException {
        try {
            try {
                j0 j0VarJ = j(we.k.c(new String(i0.c(this.f28676a), f28675c)).g());
                InputStream inputStream = this.f28676a;
                if (inputStream != null) {
                    inputStream.close();
                }
                return j0VarJ;
            } catch (Throwable th2) {
                InputStream inputStream2 = this.f28676a;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th2;
            }
        } catch (IllegalStateException | jg.p e10) {
            throw new IOException(e10);
        }
    }
}
