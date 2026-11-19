package re;

import cf.j0;
import cf.k0;
import cf.p0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f30678c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f30679a;
    public boolean b = false;

    public k(InputStream inputStream) {
        this.f30679a = inputStream;
    }

    public static int c(lg.l lVar) throws IOException {
        if (!lVar.t()) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!lVar.h().C()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long jA = ye.k.a(lVar.h().j());
            if (jA > 4294967295L || jA < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) jA;
        } catch (NumberFormatException e10) {
            throw new IOException(e10);
        }
    }

    public static cf.f0.c d(String str) {
        str.getClass();
        switch (str) {
            case "REMOTE":
                return cf.f0.c.REMOTE;
            case "SYMMETRIC":
                return cf.f0.c.SYMMETRIC;
            case "ASYMMETRIC_PRIVATE":
                return cf.f0.c.ASYMMETRIC_PRIVATE;
            case "ASYMMETRIC_PUBLIC":
                return cf.f0.c.ASYMMETRIC_PUBLIC;
            default:
                throw new lg.p("unknown key material type: " + str);
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
                throw new lg.p("unknown output prefix type: " + str);
        }
    }

    public static cf.g0 f(String str) {
        str.getClass();
        switch (str) {
            case "ENABLED":
                return cf.g0.ENABLED;
            case "DESTROYED":
                return cf.g0.DESTROYED;
            case "DISABLED":
                return cf.g0.DISABLED;
            default:
                throw new lg.p("unknown status: " + str);
        }
    }

    public static k0.c i(lg.o oVar) {
        return k0.c.e0().G(f(oVar.E("status").l())).D(c(oVar.E("keyId"))).F(e(oVar.E("outputPrefixType").l())).H(oVar.E("typeUrl").l()).build();
    }

    public static k0 k(lg.o oVar) {
        k0.b bVarE0 = k0.e0();
        if (oVar.H("primaryKeyId")) {
            bVarE0.F(c(oVar.E("primaryKeyId")));
        }
        if (oVar.H("keyInfo")) {
            lg.i iVarF = oVar.F("keyInfo");
            for (int i10 = 0; i10 < iVarF.size(); i10++) {
                bVarE0.D(i(iVarF.A(i10).g()));
            }
        }
        return bVarE0.build();
    }

    public static void l(lg.o oVar) {
        if (!oVar.H("encryptedKeyset")) {
            throw new lg.p("invalid encrypted keyset");
        }
    }

    public static k m(String str) {
        return new k(new ByteArrayInputStream(str.getBytes(f30678c)));
    }

    @Override // re.r
    public cf.a0 a() throws IOException {
        try {
            try {
                cf.a0 a0VarB = b(ye.k.c(new String(i0.c(this.f30679a), f30678c)).g());
                InputStream inputStream = this.f30679a;
                if (inputStream != null) {
                    inputStream.close();
                }
                return a0VarB;
            } catch (Throwable th2) {
                InputStream inputStream2 = this.f30679a;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th2;
            }
        } catch (IllegalStateException | lg.p e10) {
            throw new IOException(e10);
        }
    }

    public final cf.a0 b(lg.o oVar) {
        l(oVar);
        byte[] bArrE = this.b ? ff.d.e(oVar.E("encryptedKeyset").l()) : ff.d.a(oVar.E("encryptedKeyset").l());
        return oVar.H("keysetInfo") ? cf.a0.f0().F(com.google.crypto.tink.shaded.protobuf.h.e(bArrE)).G(k(oVar.G("keysetInfo"))).build() : cf.a0.f0().F(com.google.crypto.tink.shaded.protobuf.h.e(bArrE)).build();
    }

    public final cf.f0 g(lg.o oVar) {
        if (oVar.H("typeUrl") && oVar.H("value") && oVar.H("keyMaterialType")) {
            return cf.f0.h0().F(oVar.E("typeUrl").l()).G(com.google.crypto.tink.shaded.protobuf.h.e(this.b ? ff.d.e(oVar.E("value").l()) : ff.d.a(oVar.E("value").l()))).D(d(oVar.E("keyMaterialType").l())).build();
        }
        throw new lg.p("invalid keyData");
    }

    public final j0.c h(lg.o oVar) {
        if (!oVar.H("keyData") || !oVar.H("status") || !oVar.H("keyId") || !oVar.H("outputPrefixType")) {
            throw new lg.p("invalid key");
        }
        lg.l lVarE = oVar.E("keyData");
        if (lVarE.q()) {
            return j0.c.j0().J(f(oVar.E("status").l())).G(c(oVar.E("keyId"))).H(e(oVar.E("outputPrefixType").l())).F(g(lVarE.g())).build();
        }
        throw new lg.p("invalid key: keyData must be an object");
    }

    public final j0 j(lg.o oVar) {
        if (!oVar.H("key")) {
            throw new lg.p("invalid keyset: no key");
        }
        lg.l lVarE = oVar.E("key");
        if (!lVarE.m()) {
            throw new lg.p("invalid keyset: key must be an array");
        }
        lg.i iVarF = lVarE.f();
        if (iVarF.size() == 0) {
            throw new lg.p("invalid keyset: key is empty");
        }
        j0.b bVarI0 = j0.i0();
        if (oVar.H("primaryKeyId")) {
            bVarI0.F(c(oVar.E("primaryKeyId")));
        }
        for (int i10 = 0; i10 < iVarF.size(); i10++) {
            bVarI0.D(h(iVarF.A(i10).g()));
        }
        return bVarI0.build();
    }

    @Override // re.r
    public j0 read() throws IOException {
        try {
            try {
                j0 j0VarJ = j(ye.k.c(new String(i0.c(this.f30679a), f30678c)).g());
                InputStream inputStream = this.f30679a;
                if (inputStream != null) {
                    inputStream.close();
                }
                return j0VarJ;
            } catch (Throwable th2) {
                InputStream inputStream2 = this.f30679a;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th2;
            }
        } catch (IllegalStateException | lg.p e10) {
            throw new IOException(e10);
        }
    }
}
