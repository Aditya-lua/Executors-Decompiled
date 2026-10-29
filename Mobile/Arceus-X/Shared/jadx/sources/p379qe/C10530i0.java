package p379qe;

import af.C0218f0;
import af.C0222h0;
import af.EnumC0238p0;
import com.google.crypto.tink.shaded.protobuf.AbstractC2920h;
import com.google.crypto.tink.shaded.protobuf.C2903b0;
import com.google.crypto.tink.shaded.protobuf.C2944p;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p515we.C12358a0;
import p515we.C12364d0;
import p515we.C12380l0;
import p515we.C12398w;
import pe.AbstractC10231l;
import pe.AbstractC10243x;
import pe.C10226h0;
import pe.C10229j;
import pe.InterfaceC10211a;

/* JADX INFO: renamed from: qe.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C10530i0 implements InterfaceC10211a {

    /* JADX INFO: renamed from: d */
    public static final byte[] f37764d = new byte[0];

    /* JADX INFO: renamed from: e */
    public static final Set<String> f37765e = m40371g();

    /* JADX INFO: renamed from: a */
    public final String f37766a;

    /* JADX INFO: renamed from: b */
    public final AbstractC10243x f37767b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10211a f37768c;

    @Deprecated
    public C10530i0(C0222h0 c0222h0, InterfaceC10211a interfaceC10211a) {
        if (m40370f(c0222h0.m763f0())) {
            this.f37766a = c0222h0.m763f0();
            this.f37767b = m40373e(c0222h0);
            this.f37768c = interfaceC10211a;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + c0222h0.m763f0() + ". Only Tink AEAD key types are supported.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10211a m40369d(AbstractC10511c abstractC10511c, InterfaceC10211a interfaceC10211a) throws GeneralSecurityException {
        try {
            return new C10530i0(C0222h0.m759j0(C10226h0.m39316b(abstractC10511c), C2944p.m14035b()), interfaceC10211a);
        } catch (C2903b0 e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m40370f(String str) {
        return f37765e.contains(str);
    }

    /* JADX INFO: renamed from: g */
    public static Set<String> m40371g() {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AbstractC10231l abstractC10231lM46471c = C12398w.m46468f().m46471c(this.f37767b, null);
        byte[] bArrMo22645a = this.f37768c.mo22645a(((C12380l0) C12364d0.m46238c().m46249n(abstractC10231lM46471c, C12380l0.class, C10229j.m39322a())).m46397g().m13569x(), f37764d);
        if (bArrMo22645a.length <= 4096) {
            return m40372c(bArrMo22645a, ((InterfaceC10211a) C12358a0.m46226c().m46228b(abstractC10231lM46471c, InterfaceC10211a.class)).mo22645a(bArr, bArr2));
        }
        throw new GeneralSecurityException("length of encrypted DEK too large");
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > 4096 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((InterfaceC10211a) C12358a0.m46226c().m46228b(C12364d0.m46238c().m46241f(C12380l0.m46391b(this.f37766a, AbstractC2920h.m13555e(this.f37768c.mo22646b(bArr3, f37764d)), C0218f0.c.SYMMETRIC, EnumC0238p0.RAW, null), C10229j.m39322a()), InterfaceC10211a.class)).mo22646b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m40372c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC10243x m40373e(C0222h0 c0222h0) {
        return C10226h0.m39315a(C0222h0.m758i0(c0222h0).m766C(EnumC0238p0.RAW).build().m13375n());
    }
}
