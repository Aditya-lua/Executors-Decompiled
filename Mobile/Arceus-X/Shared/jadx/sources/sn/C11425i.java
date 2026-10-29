package sn;

import java.util.List;
import p388qn.C10629y;
import p418rn.C10934i;
import p418rn.C10935j;
import vn.InterfaceC12235c;

/* JADX INFO: renamed from: sn.i */
/* JADX INFO: loaded from: classes3.dex */
public class C11425i {

    /* JADX INFO: renamed from: a */
    public final List<C10934i> f40407a;

    /* JADX INFO: renamed from: b */
    public int f40408b;

    /* JADX INFO: renamed from: c */
    public int f40409c;

    /* JADX INFO: renamed from: d */
    public C10934i f40410d = C10934i.m41527c("", null);

    /* JADX INFO: renamed from: e */
    public int f40411e = 0;

    public C11425i(List<C10934i> list, int i10, int i11) {
        this.f40407a = list;
        this.f40408b = i10;
        this.f40409c = i11;
        if (list.isEmpty()) {
            return;
        }
        m42795a(i10, i11);
        m42809p(list.get(i10));
    }

    /* JADX INFO: renamed from: k */
    public static C11425i m42794k(C10935j c10935j) {
        return new C11425i(c10935j.m41536d(), 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m42795a(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f40407a.size()) {
            throw new IllegalArgumentException("Line index " + i10 + " out of range, number of lines: " + this.f40407a.size());
        }
        C10934i c10934i = this.f40407a.get(i10);
        if (i11 < 0 || i11 > c10934i.m41528a().length()) {
            throw new IllegalArgumentException("Index " + i11 + " out of range, line length: " + c10934i.m41528a().length());
        }
    }

    /* JADX INFO: renamed from: b */
    public int m42796b(char c10) {
        int i10 = 0;
        while (true) {
            char cM42805l = m42805l();
            if (cM42805l == 0) {
                return -1;
            }
            if (cM42805l == c10) {
                return i10;
            }
            i10++;
            m42802h();
        }
    }

    /* JADX INFO: renamed from: c */
    public int m42797c(InterfaceC12235c interfaceC12235c) {
        int i10 = 0;
        while (true) {
            char cM42805l = m42805l();
            if (cM42805l == 0) {
                return -1;
            }
            if (interfaceC12235c.mo45371a(cM42805l)) {
                return i10;
            }
            i10++;
            m42802h();
        }
    }

    /* JADX INFO: renamed from: d */
    public C10935j m42798d(C11424h c11424h, C11424h c11424h2) {
        int i10 = c11424h.f40405a;
        if (i10 == c11424h2.f40405a) {
            C10934i c10934i = this.f40407a.get(i10);
            CharSequence charSequenceSubSequence = c10934i.m41528a().subSequence(c11424h.f40406b, c11424h2.f40406b);
            C10629y c10629yM41529b = c10934i.m41529b();
            return C10935j.m41533h(C10934i.m41527c(charSequenceSubSequence, c10629yM41529b != null ? c10629yM41529b.m40721g(c11424h.f40406b, c11424h2.f40406b) : null));
        }
        C10935j c10935jM41531b = C10935j.m41531b();
        C10934i c10934i2 = this.f40407a.get(c11424h.f40405a);
        c10935jM41531b.m41534a(c10934i2.m41530d(c11424h.f40406b, c10934i2.m41528a().length()));
        int i11 = c11424h.f40405a;
        while (true) {
            i11++;
            int i12 = c11424h2.f40405a;
            if (i11 >= i12) {
                c10935jM41531b.m41534a(this.f40407a.get(i12).m41530d(0, c11424h2.f40406b));
                return c10935jM41531b;
            }
            c10935jM41531b.m41534a(this.f40407a.get(i11));
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m42799e() {
        return this.f40409c < this.f40411e || this.f40408b < this.f40407a.size() - 1;
    }

    /* JADX INFO: renamed from: f */
    public int m42800f(InterfaceC12235c interfaceC12235c) {
        int i10 = 0;
        while (interfaceC12235c.mo45371a(m42805l())) {
            i10++;
            m42802h();
        }
        return i10;
    }

    /* JADX INFO: renamed from: g */
    public int m42801g(char c10) {
        int i10 = 0;
        while (m42805l() == c10) {
            i10++;
            m42802h();
        }
        return i10;
    }

    /* JADX INFO: renamed from: h */
    public void m42802h() {
        int i10 = this.f40409c + 1;
        this.f40409c = i10;
        if (i10 > this.f40411e) {
            int i11 = this.f40408b + 1;
            this.f40408b = i11;
            if (i11 < this.f40407a.size()) {
                m42809p(this.f40407a.get(this.f40408b));
            } else {
                m42809p(C10934i.m41527c("", null));
            }
            this.f40409c = 0;
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m42803i(char c10) {
        if (m42805l() != c10) {
            return false;
        }
        m42802h();
        return true;
    }

    /* JADX INFO: renamed from: j */
    public boolean m42804j(String str) {
        int i10 = this.f40409c;
        if (i10 >= this.f40411e || i10 + str.length() > this.f40411e) {
            return false;
        }
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (this.f40410d.m41528a().charAt(this.f40409c + i11) != str.charAt(i11)) {
                return false;
            }
        }
        this.f40409c += str.length();
        return true;
    }

    /* JADX INFO: renamed from: l */
    public char m42805l() {
        if (this.f40409c < this.f40411e) {
            return this.f40410d.m41528a().charAt(this.f40409c);
        }
        return this.f40408b < this.f40407a.size() + (-1) ? '\n' : (char) 0;
    }

    /* JADX INFO: renamed from: m */
    public int m42806m() {
        if (this.f40409c >= this.f40411e) {
            return this.f40408b < this.f40407a.size() + (-1) ? 10 : 0;
        }
        char cCharAt = this.f40410d.m41528a().charAt(this.f40409c);
        if (!Character.isHighSurrogate(cCharAt) || this.f40409c + 1 >= this.f40411e) {
            return cCharAt;
        }
        char cCharAt2 = this.f40410d.m41528a().charAt(this.f40409c + 1);
        return Character.isLowSurrogate(cCharAt2) ? Character.toCodePoint(cCharAt, cCharAt2) : cCharAt;
    }

    /* JADX INFO: renamed from: n */
    public int m42807n() {
        int i10 = this.f40409c;
        if (i10 <= 0) {
            return this.f40408b > 0 ? 10 : 0;
        }
        int i11 = i10 - 1;
        char cCharAt = this.f40410d.m41528a().charAt(i11);
        if (Character.isLowSurrogate(cCharAt) && i11 > 0) {
            char cCharAt2 = this.f40410d.m41528a().charAt(i10 - 2);
            if (Character.isHighSurrogate(cCharAt2)) {
                return Character.toCodePoint(cCharAt2, cCharAt);
            }
        }
        return cCharAt;
    }

    /* JADX INFO: renamed from: o */
    public C11424h m42808o() {
        return new C11424h(this.f40408b, this.f40409c);
    }

    /* JADX INFO: renamed from: p */
    public final void m42809p(C10934i c10934i) {
        this.f40410d = c10934i;
        this.f40411e = c10934i.m41528a().length();
    }

    /* JADX INFO: renamed from: q */
    public void m42810q(C11424h c11424h) {
        m42795a(c11424h.f40405a, c11424h.f40406b);
        int i10 = c11424h.f40405a;
        this.f40408b = i10;
        this.f40409c = c11424h.f40406b;
        m42809p(this.f40407a.get(i10));
    }

    /* JADX INFO: renamed from: r */
    public int m42811r() {
        int i10 = 0;
        while (true) {
            char cM42805l = m42805l();
            if (cM42805l != ' ') {
                switch (cM42805l) {
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
            m42802h();
        }
    }
}
