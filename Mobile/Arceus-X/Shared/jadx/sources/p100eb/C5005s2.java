package p100eb;

import java.io.IOException;

/* JADX INFO: renamed from: eb.s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5005s2 extends C5011t2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5005s2(C4993q2 c4993q2, Character ch2) {
        super(c4993q2, ch2);
        C4973n0.m23679c(c4993q2.f19769b.length == 64);
    }

    @Override // p100eb.C5011t2, p100eb.AbstractC5017u2
    /* JADX INFO: renamed from: a */
    public final void mo23699a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        C4973n0.m23681e(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = ((bArr[i12 + 1] & 255) << 8) | (i14 << 16) | (bArr[i12 + 2] & 255);
            appendable.append(this.f19812f.m23694a(i15 >>> 18));
            appendable.append(this.f19812f.m23694a((i15 >>> 12) & 63));
            appendable.append(this.f19812f.m23694a((i15 >>> 6) & 63));
            appendable.append(this.f19812f.m23694a(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            m23703g(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // p100eb.C5011t2
    /* JADX INFO: renamed from: f */
    public final AbstractC5017u2 mo23700f(C4993q2 c4993q2, Character ch2) {
        return new C5005s2(c4993q2, ch2);
    }

    public C5005s2(String str, String str2, Character ch2) {
        this(new C4993q2(str, str2.toCharArray()), ch2);
    }
}
