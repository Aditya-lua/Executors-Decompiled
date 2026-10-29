package p076df;

import bf.C1398i;
import bf.C1400j;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p465ue.C11844b;
import p515we.C12365e;
import pe.C10229j;
import pe.InterfaceC10245z;

/* JADX INFO: renamed from: df.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C4587i implements InterfaceC10245z {

    /* JADX INFO: renamed from: e */
    public static final C11844b.b f18769e = C11844b.b.f41601a;

    /* JADX INFO: renamed from: a */
    public final byte[] f18770a;

    /* JADX INFO: renamed from: b */
    public final byte[] f18771b;

    /* JADX INFO: renamed from: c */
    public final byte[] f18772c;

    /* JADX INFO: renamed from: d */
    public final byte[] f18773d;

    /* JADX INFO: renamed from: df.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final byte[] f18774a;

        /* JADX INFO: renamed from: b */
        public final byte[] f18775b;

        public a(byte[] bArr, byte[] bArr2) {
            this.f18774a = bArr;
            this.f18775b = bArr2;
        }

        /* JADX INFO: renamed from: c */
        public static a m22676c() {
            return m22677d(C4599u.m22724a(32));
        }

        /* JADX INFO: renamed from: d */
        public static a m22677d(byte[] bArr) {
            if (bArr.length == 32) {
                return new a(C12365e.m46273v(C12365e.m46261j(bArr)), bArr);
            }
            throw new IllegalArgumentException(String.format("Given secret seed length is not %s", 32));
        }

        /* JADX INFO: renamed from: a */
        public byte[] m22678a() {
            byte[] bArr = this.f18775b;
            return Arrays.copyOf(bArr, bArr.length);
        }

        /* JADX INFO: renamed from: b */
        public byte[] m22679b() {
            byte[] bArr = this.f18774a;
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public C4587i(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (!f18769e.mo44243a()) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        byte[] bArrM46261j = C12365e.m46261j(bArr);
        this.f18770a = bArrM46261j;
        this.f18771b = C12365e.m46273v(bArrM46261j);
        this.f18772c = bArr2;
        this.f18773d = bArr3;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC10245z m22674b(C1400j c1400j) {
        return new C4587i(c1400j.m7296f().m23856d(C10229j.m39322a()), c1400j.m7251b().m23850d(), c1400j.m7295e().m7290c().equals(C1398i.a.f5479d) ? new byte[]{0} : new byte[0]);
    }

    @Override // pe.InterfaceC10245z
    /* JADX INFO: renamed from: a */
    public byte[] mo7287a(byte[] bArr) {
        byte[] bArr2 = this.f18773d;
        byte[] bArrM22675c = bArr2.length == 0 ? m22675c(bArr) : m22675c(C4583e.m22661a(bArr, bArr2));
        byte[] bArr3 = this.f18772c;
        return bArr3.length == 0 ? bArrM22675c : C4583e.m22661a(bArr3, bArrM22675c);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m22675c(byte[] bArr) {
        return C12365e.m46275x(bArr, this.f18771b, this.f18770a);
    }
}
