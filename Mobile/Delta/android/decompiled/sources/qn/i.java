package qn;

import java.util.List;
import on.y;
import pn.j;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<pn.i> f29993a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pn.i f29995d = pn.i.c("", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29996e = 0;

    public i(List<pn.i> list, int i10, int i11) {
        this.f29993a = list;
        this.b = i10;
        this.f29994c = i11;
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
        if (i10 < 0 || i10 >= this.f29993a.size()) {
            throw new IllegalArgumentException("Line index " + i10 + " out of range, number of lines: " + this.f29993a.size());
        }
        pn.i iVar = this.f29993a.get(i10);
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

    public int c(tn.c cVar) {
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
        int i10 = hVar.f29992a;
        if (i10 == hVar2.f29992a) {
            pn.i iVar = this.f29993a.get(i10);
            CharSequence charSequenceSubSequence = iVar.a().subSequence(hVar.b, hVar2.b);
            y yVarB = iVar.b();
            return j.h(pn.i.c(charSequenceSubSequence, yVarB != null ? yVarB.g(hVar.b, hVar2.b) : null));
        }
        j jVarB = j.b();
        pn.i iVar2 = this.f29993a.get(hVar.f29992a);
        jVarB.a(iVar2.d(hVar.b, iVar2.a().length()));
        int i11 = hVar.f29992a;
        while (true) {
            i11++;
            int i12 = hVar2.f29992a;
            if (i11 >= i12) {
                jVarB.a(this.f29993a.get(i12).d(0, hVar2.b));
                return jVarB;
            }
            jVarB.a(this.f29993a.get(i11));
        }
    }

    public boolean e() {
        return this.f29994c < this.f29996e || this.b < this.f29993a.size() - 1;
    }

    public int f(tn.c cVar) {
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
        int i10 = this.f29994c + 1;
        this.f29994c = i10;
        if (i10 > this.f29996e) {
            int i11 = this.b + 1;
            this.b = i11;
            if (i11 < this.f29993a.size()) {
                p(this.f29993a.get(this.b));
            } else {
                p(pn.i.c("", null));
            }
            this.f29994c = 0;
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
        int i10 = this.f29994c;
        if (i10 >= this.f29996e || i10 + str.length() > this.f29996e) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (this.f29995d.a().charAt(this.f29994c + i11) != str.charAt(i11)) {
                return false;
            }
        }
        this.f29994c += str.length();
        return true;
    }

    public char l() {
        if (this.f29994c < this.f29996e) {
            return this.f29995d.a().charAt(this.f29994c);
        }
        return this.b < this.f29993a.size() + (-1) ? '\n' : (char) 0;
    }

    public int m() {
        if (this.f29994c >= this.f29996e) {
            return this.b < this.f29993a.size() + (-1) ? 10 : 0;
        }
        char cCharAt = this.f29995d.a().charAt(this.f29994c);
        if (!Character.isHighSurrogate(cCharAt) || this.f29994c + 1 >= this.f29996e) {
            return cCharAt;
        }
        char cCharAt2 = this.f29995d.a().charAt(this.f29994c + 1);
        return Character.isLowSurrogate(cCharAt2) ? Character.toCodePoint(cCharAt, cCharAt2) : cCharAt;
    }

    public int n() {
        int i10 = this.f29994c;
        if (i10 <= 0) {
            return this.b > 0 ? 10 : 0;
        }
        int i11 = i10 - 1;
        char cCharAt = this.f29995d.a().charAt(i11);
        if (Character.isLowSurrogate(cCharAt) && i11 > 0) {
            char cCharAt2 = this.f29995d.a().charAt(i10 - 2);
            if (Character.isHighSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    public h o() {
        return new h(this.b, this.f29994c);
    }

    public final void p(pn.i iVar) {
        this.f29995d = iVar;
        this.f29996e = iVar.a().length();
    }

    public void q(h hVar) {
        a(hVar.f29992a, hVar.b);
        int i10 = hVar.f29992a;
        this.b = i10;
        this.f29994c = hVar.b;
        p(this.f29993a.get(i10));
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
