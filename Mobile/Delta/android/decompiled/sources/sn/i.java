package sn;

import java.util.List;
import qn.y;
import rn.j;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<rn.i> f31246a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rn.i f31248d = rn.i.c("", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31249e = 0;

    public i(List<rn.i> list, int i10, int i11) {
        this.f31246a = list;
        this.b = i10;
        this.f31247c = i11;
        if (list.isEmpty()) {
            return;
        }
        a(i10, i11);
        p(list.get(i10));
    }

    public static i k(j jVar) {
        return new i(jVar.d(), 0, 0);
    }

    public final void a(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f31246a.size()) {
            throw new IllegalArgumentException("Line index " + i10 + " out of range, number of lines: " + this.f31246a.size());
        }
        rn.i iVar = this.f31246a.get(i10);
        if (i11 < 0 || i11 > iVar.a().length()) {
            throw new IllegalArgumentException("Index " + i11 + " out of range, line length: " + iVar.a().length());
        }
    }

    public int b(char c10) {
        int i10 = 0;
        while (true) {
            char cL = l();
            if (cL == 0) {
                return -1;
            }
            if (cL == c10) {
                return i10;
            }
            i10++;
            h();
        }
    }

    public int c(vn.c cVar) {
        int i10 = 0;
        while (true) {
            char cL = l();
            if (cL == 0) {
                return -1;
            }
            if (cVar.a(cL)) {
                return i10;
            }
            i10++;
            h();
        }
    }

    public j d(h hVar, h hVar2) {
        int i10 = hVar.f31245a;
        if (i10 == hVar2.f31245a) {
            rn.i iVar = this.f31246a.get(i10);
            CharSequence charSequenceSubSequence = iVar.a().subSequence(hVar.b, hVar2.b);
            y yVarB = iVar.b();
            return j.h(rn.i.c(charSequenceSubSequence, yVarB != null ? yVarB.g(hVar.b, hVar2.b) : null));
        }
        j jVarB = j.b();
        rn.i iVar2 = this.f31246a.get(hVar.f31245a);
        jVarB.a(iVar2.d(hVar.b, iVar2.a().length()));
        int i11 = hVar.f31245a;
        while (true) {
            i11++;
            int i12 = hVar2.f31245a;
            if (i11 >= i12) {
                jVarB.a(this.f31246a.get(i12).d(0, hVar2.b));
                return jVarB;
            }
            jVarB.a(this.f31246a.get(i11));
        }
    }

    public boolean e() {
        return this.f31247c < this.f31249e || this.b < this.f31246a.size() - 1;
    }

    public int f(vn.c cVar) {
        int i10 = 0;
        while (cVar.a(l())) {
            i10++;
            h();
        }
        return i10;
    }

    public int g(char c10) {
        int i10 = 0;
        while (l() == c10) {
            i10++;
            h();
        }
        return i10;
    }

    public void h() {
        int i10 = this.f31247c + 1;
        this.f31247c = i10;
        if (i10 > this.f31249e) {
            int i11 = this.b + 1;
            this.b = i11;
            if (i11 < this.f31246a.size()) {
                p(this.f31246a.get(this.b));
            } else {
                p(rn.i.c("", null));
            }
            this.f31247c = 0;
        }
    }

    public boolean i(char c10) {
        if (l() != c10) {
            return false;
        }
        h();
        return true;
    }

    public boolean j(String str) {
        int i10 = this.f31247c;
        if (i10 >= this.f31249e || i10 + str.length() > this.f31249e) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (this.f31248d.a().charAt(this.f31247c + i11) != str.charAt(i11)) {
                return false;
            }
        }
        this.f31247c += str.length();
        return true;
    }

    public char l() {
        if (this.f31247c < this.f31249e) {
            return this.f31248d.a().charAt(this.f31247c);
        }
        return this.b < this.f31246a.size() + (-1) ? '\n' : (char) 0;
    }

    public int m() {
        if (this.f31247c >= this.f31249e) {
            return this.b < this.f31246a.size() + (-1) ? 10 : 0;
        }
        char cCharAt = this.f31248d.a().charAt(this.f31247c);
        if (!Character.isHighSurrogate(cCharAt) || this.f31247c + 1 >= this.f31249e) {
            return cCharAt;
        }
        char cCharAt2 = this.f31248d.a().charAt(this.f31247c + 1);
        return Character.isLowSurrogate(cCharAt2) ? Character.toCodePoint(cCharAt, cCharAt2) : cCharAt;
    }

    public int n() {
        int i10 = this.f31247c;
        if (i10 <= 0) {
            return this.b > 0 ? 10 : 0;
        }
        int i11 = i10 - 1;
        char cCharAt = this.f31248d.a().charAt(i11);
        if (Character.isLowSurrogate(cCharAt) && i11 > 0) {
            char cCharAt2 = this.f31248d.a().charAt(i10 - 2);
            if (Character.isHighSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    public h o() {
        return new h(this.b, this.f31247c);
    }

    public final void p(rn.i iVar) {
        this.f31248d = iVar;
        this.f31249e = iVar.a().length();
    }

    public void q(h hVar) {
        a(hVar.f31245a, hVar.b);
        int i10 = hVar.f31245a;
        this.b = i10;
        this.f31247c = hVar.b;
        p(this.f31246a.get(i10));
    }

    public int r() {
        int i10 = 0;
        while (true) {
            char cL = l();
            if (cL != ' ') {
                switch (cL) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i10;
                }
            }
            i10++;
            h();
        }
    }
}
