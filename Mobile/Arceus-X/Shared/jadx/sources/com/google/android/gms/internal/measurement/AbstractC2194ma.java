package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ma */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2194ma extends C2409y9 {

    /* JADX INFO: renamed from: b */
    public static final Logger f8418b = Logger.getLogger(AbstractC2194ma.class.getName());

    /* JADX INFO: renamed from: c */
    public static final boolean f8419c = C2305sd.m10731f();

    /* JADX INFO: renamed from: a */
    public C2212na f8420a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2194ma() {
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public static int m10380G(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: a */
    public static int m10381a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: b */
    public static int m10382b(String str) {
        int length;
        try {
            length = C2359vd.m10855b(str);
        } catch (C2341ud unused) {
            length = str.getBytes(C2267qb.f8595a).length;
        }
        return m10380G(length) + length;
    }

    /* JADX INFO: renamed from: c */
    public static int m10383c(InterfaceC2232oc interfaceC2232oc) {
        int iMo10063a = interfaceC2232oc.mo10063a();
        return m10380G(iMo10063a) + iMo10063a;
    }

    /* JADX INFO: renamed from: d */
    public static int m10384d(InterfaceC2232oc interfaceC2232oc, InterfaceC2430zc interfaceC2430zc) {
        int iMo10066g = ((AbstractC2283r9) interfaceC2232oc).mo10066g(interfaceC2430zc);
        return m10380G(iMo10066g) + iMo10066g;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static int m10385g(int i10, InterfaceC2232oc interfaceC2232oc, InterfaceC2430zc interfaceC2430zc) {
        int iM10380G = m10380G(i10 << 3);
        return iM10380G + iM10380G + ((AbstractC2283r9) interfaceC2232oc).mo10066g(interfaceC2430zc);
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo10322A(int i10);

    /* JADX INFO: renamed from: B */
    public abstract void mo10323B(long j10);

    /* JADX INFO: renamed from: C */
    public abstract void mo10324C(long j10);

    /* JADX INFO: renamed from: D */
    public abstract void mo10325D(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: E */
    public abstract void mo10326E(String str);

    /* JADX INFO: renamed from: F */
    public abstract int mo10327F();

    /* JADX INFO: renamed from: e */
    public final void m10387e() {
        if (mo10327F() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10388f(String str, C2341ud c2341ud) throws C2176la {
        f8418b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2341ud);
        byte[] bytes = str.getBytes(C2267qb.f8595a);
        try {
            int length = bytes.length;
            mo10346z(length);
            mo10325D(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new C2176la(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo10329i(int i10, int i11);

    /* JADX INFO: renamed from: j */
    public abstract void mo10330j(int i10, int i11);

    /* JADX INFO: renamed from: k */
    public abstract void mo10331k(int i10, int i11);

    /* JADX INFO: renamed from: l */
    public abstract void mo10332l(int i10, int i11);

    /* JADX INFO: renamed from: m */
    public abstract void mo10333m(int i10, long j10);

    /* JADX INFO: renamed from: n */
    public abstract void mo10334n(int i10, long j10);

    /* JADX INFO: renamed from: o */
    public abstract void mo10335o(int i10, boolean z10);

    /* JADX INFO: renamed from: p */
    public abstract void mo10336p(int i10, String str);

    /* JADX INFO: renamed from: q */
    public abstract void mo10337q(int i10, AbstractC2104ha abstractC2104ha);

    /* JADX INFO: renamed from: r */
    public abstract void mo10338r(AbstractC2104ha abstractC2104ha);

    /* JADX INFO: renamed from: s */
    public abstract void mo10339s(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: t */
    public abstract void mo10340t(int i10, InterfaceC2232oc interfaceC2232oc, InterfaceC2430zc interfaceC2430zc);

    /* JADX INFO: renamed from: u */
    public abstract void mo10341u(int i10, InterfaceC2232oc interfaceC2232oc);

    /* JADX INFO: renamed from: v */
    public abstract void mo10342v(int i10, AbstractC2104ha abstractC2104ha);

    /* JADX INFO: renamed from: w */
    public abstract void mo10343w(InterfaceC2232oc interfaceC2232oc);

    /* JADX INFO: renamed from: x */
    public abstract void mo10344x(byte b);

    /* JADX INFO: renamed from: y */
    public abstract void mo10345y(int i10);

    /* JADX INFO: renamed from: z */
    public abstract void mo10346z(int i10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ AbstractC2194ma(byte[] bArr) {
    }
}
