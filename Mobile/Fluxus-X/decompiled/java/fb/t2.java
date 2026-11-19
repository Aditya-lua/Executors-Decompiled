package fb;

import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class t2 extends u2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q2 f15870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Character f15871g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile u2 f15872h;

    public t2(q2 q2Var, Character ch2) {
        this.f15870f = q2Var;
        if (ch2 != null && q2Var.c('=')) {
            throw new IllegalArgumentException(p0.a("Padding character %s was already in alphabet", ch2));
        }
        this.f15871g = ch2;
    }

    @Override // fb.u2
    public void a(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        n0.e(0, i11, bArr.length);
        while (i12 < i11) {
            g(appendable, bArr, i12, Math.min(this.f15870f.f15834f, i11 - i12));
            i12 += this.f15870f.f15834f;
        }
    }

    @Override // fb.u2
    public final int b(int i10) {
        q2 q2Var = this.f15870f;
        return q2Var.f15833e * w2.a(i10, q2Var.f15834f, RoundingMode.CEILING);
    }

    @Override // fb.u2
    public final u2 c() {
        u2 u2VarF = this.f15872h;
        if (u2VarF == null) {
            q2 q2Var = this.f15870f;
            q2 q2VarB = q2Var.b();
            u2VarF = q2VarB == q2Var ? this : f(q2VarB, this.f15871g);
            this.f15872h = u2VarF;
        }
        return u2VarF;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t2) {
            t2 t2Var = (t2) obj;
            if (this.f15870f.equals(t2Var.f15870f) && Objects.equals(this.f15871g, t2Var.f15871g)) {
                return true;
            }
        }
        return false;
    }

    public u2 f(q2 q2Var, Character ch2) {
        return new t2(q2Var, ch2);
    }

    public final void g(Appendable appendable, byte[] bArr, int i10, int i11) {
        n0.e(i10, i10 + i11, bArr.length);
        int i12 = 0;
        n0.c(i11 <= this.f15870f.f15834f);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = (i11 + 1) * 8;
        q2 q2Var = this.f15870f;
        while (i12 < i11 * 8) {
            long j11 = j10 >>> ((i14 - q2Var.f15832d) - i12);
            q2 q2Var2 = this.f15870f;
            appendable.append(q2Var2.a(((int) j11) & q2Var2.f15831c));
            i12 += this.f15870f.f15832d;
        }
        if (this.f15871g != null) {
            while (i12 < this.f15870f.f15834f * 8) {
                this.f15871g.getClass();
                appendable.append('=');
                i12 += this.f15870f.f15832d;
            }
        }
    }

    public final int hashCode() {
        Character ch2 = this.f15871g;
        return Objects.hashCode(ch2) ^ this.f15870f.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.f15870f);
        if (8 % this.f15870f.f15832d != 0) {
            if (this.f15871g == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.f15871g);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    public t2(String str, String str2, Character ch2) {
        this(new q2(str, str2.toCharArray()), ch2);
    }
}
