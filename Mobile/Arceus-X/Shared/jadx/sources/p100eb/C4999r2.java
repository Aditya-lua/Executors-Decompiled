package p100eb;

import java.io.IOException;

/* JADX INFO: renamed from: eb.r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C4999r2 extends C5011t2 {

    /* JADX INFO: renamed from: i */
    public final char[] f19778i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4999r2(C4993q2 c4993q2) {
        super(c4993q2, null);
        this.f19778i = new char[512];
        C4973n0.m23679c(c4993q2.f19769b.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.f19778i[i10] = c4993q2.m23694a(i10 >>> 4);
            this.f19778i[i10 | 256] = c4993q2.m23694a(i10 & 15);
        }
    }

    @Override // p100eb.C5011t2, p100eb.AbstractC5017u2
    /* JADX INFO: renamed from: a */
    public final void mo23699a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        C4973n0.m23681e(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.f19778i[i13]);
            appendable.append(this.f19778i[i13 | 256]);
        }
    }

    @Override // p100eb.C5011t2
    /* JADX INFO: renamed from: f */
    public final AbstractC5017u2 mo23700f(C4993q2 c4993q2, Character ch2) {
        return new C4999r2(c4993q2);
    }

    public C4999r2(String str, String str2) {
        this(new C4993q2("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
