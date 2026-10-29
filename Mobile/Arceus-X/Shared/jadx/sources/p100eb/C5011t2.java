package p100eb;

import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: renamed from: eb.t2 */
/* JADX INFO: loaded from: classes.dex */
public class C5011t2 extends AbstractC5017u2 {

    /* JADX INFO: renamed from: f */
    public final C4993q2 f19812f;

    /* JADX INFO: renamed from: g */
    public final Character f19813g;

    /* JADX INFO: renamed from: h */
    public volatile AbstractC5017u2 f19814h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5011t2(C4993q2 c4993q2, Character ch2) {
        this.f19812f = c4993q2;
        if (ch2 != null && c4993q2.m23696c('=')) {
            throw new IllegalArgumentException(C4985p0.m23687a("Padding character %s was already in alphabet", ch2));
        }
        this.f19813g = ch2;
    }

    @Override // p100eb.AbstractC5017u2
    /* JADX INFO: renamed from: a */
    public void mo23699a(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        C4973n0.m23681e(0, i11, bArr.length);
        while (i12 < i11) {
            m23703g(appendable, bArr, i12, Math.min(this.f19812f.f19773f, i11 - i12));
            i12 += this.f19812f.f19773f;
        }
    }

    @Override // p100eb.AbstractC5017u2
    /* JADX INFO: renamed from: b */
    public final int mo23701b(int i10) {
        C4993q2 c4993q2 = this.f19812f;
        return c4993q2.f19772e * C5029w2.m23714a(i10, c4993q2.f19773f, RoundingMode.CEILING);
    }

    @Override // p100eb.AbstractC5017u2
    /* JADX INFO: renamed from: c */
    public final AbstractC5017u2 mo23702c() {
        AbstractC5017u2 abstractC5017u2Mo23700f = this.f19814h;
        if (abstractC5017u2Mo23700f == null) {
            C4993q2 c4993q2 = this.f19812f;
            C4993q2 c4993q2M23695b = c4993q2.m23695b();
            abstractC5017u2Mo23700f = c4993q2M23695b == c4993q2 ? this : mo23700f(c4993q2M23695b, this.f19813g);
            this.f19814h = abstractC5017u2Mo23700f;
        }
        return abstractC5017u2Mo23700f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5011t2) {
            C5011t2 c5011t2 = (C5011t2) obj;
            if (this.f19812f.equals(c5011t2.f19812f) && Objects.equals(this.f19813g, c5011t2.f19813g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC5017u2 mo23700f(C4993q2 c4993q2, Character ch2) {
        return new C5011t2(c4993q2, ch2);
    }

    /* JADX INFO: renamed from: g */
    public final void m23703g(Appendable appendable, byte[] bArr, int i10, int i11) {
        C4973n0.m23681e(i10, i10 + i11, bArr.length);
        int i12 = 0;
        C4973n0.m23679c(i11 <= this.f19812f.f19773f);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = (i11 + 1) * 8;
        C4993q2 c4993q2 = this.f19812f;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - c4993q2.f19771d) - i12);
            C4993q2 c4993q3 = this.f19812f;
            appendable.append(c4993q3.m23694a(((int) j11) & c4993q3.f19770c));
            i12 += this.f19812f.f19771d;
        }
        if (this.f19813g != null) {
            while (i12 < this.f19812f.f19773f * 8) {
                this.f19813g.getClass();
                appendable.append('=');
                i12 += this.f19812f.f19771d;
            }
        }
    }

    public final int hashCode() {
        Character ch2 = this.f19813g;
        return Objects.hashCode(ch2) ^ this.f19812f.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.f19812f);
        if (8 % this.f19812f.f19771d != 0) {
            if (this.f19813g == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.f19813g);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public C5011t2(String str, String str2, Character ch2) {
        this(new C4993q2(str, str2.toCharArray()), ch2);
    }
}
