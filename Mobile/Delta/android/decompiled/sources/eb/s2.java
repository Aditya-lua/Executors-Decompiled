package eb;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends t2 {
    public s2(q2 q2Var, Character ch2) {
        super(q2Var, ch2);
        n0.c(q2Var.b.length == 64);
    }

    @Override // eb.t2, eb.u2
    public final void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        n0.e(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = ((bArr[i12 + 1] & 255) << 8) | (i14 << 16) | (bArr[i12 + 2] & 255);
            appendable.append(this.f15400f.a(i15 >>> 18));
            appendable.append(this.f15400f.a((i15 >>> 12) & 63));
            appendable.append(this.f15400f.a((i15 >>> 6) & 63));
            appendable.append(this.f15400f.a(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            g(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // eb.t2
    public final u2 f(q2 q2Var, Character ch2) {
        return new s2(q2Var, ch2);
    }

    public s2(String str, String str2, Character ch2) {
        this(new q2(str, str2.toCharArray()), ch2);
    }
}
