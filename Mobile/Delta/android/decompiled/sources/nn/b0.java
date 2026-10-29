package nn;

import qn.c0;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends tn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f26368a;

    public static class a extends tn.b {
        @Override // tn.e
        public tn.f a(tn.h hVar, tn.g gVar) {
            if (hVar.d() >= 4) {
                return tn.f.c();
            }
            int iE = hVar.e();
            CharSequence charSequenceA = hVar.b().a();
            return b0.l(charSequenceA, iE) ? tn.f.d(new b0(String.valueOf(charSequenceA.subSequence(hVar.getIndex(), charSequenceA.length())))).b(charSequenceA.length()) : tn.f.c();
        }
    }

    public b0(String str) {
        c0 c0Var = new c0();
        this.f26368a = c0Var;
        c0Var.p(str);
    }

    public static boolean l(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i13++;
                } else if (cCharAt == '-') {
                    i11++;
                } else {
                    if (cCharAt != '_') {
                        return false;
                    }
                    i12++;
                }
            }
            i10++;
        }
        if (i11 >= 3 && i12 == 0 && i13 == 0) {
            return true;
        }
        if (i12 >= 3 && i11 == 0 && i13 == 0) {
            return true;
        }
        return i13 >= 3 && i11 == 0 && i12 == 0;
    }

    @Override // tn.d
    public tn.c b(tn.h hVar) {
        return tn.c.d();
    }

    @Override // tn.d
    public qn.a d() {
        return this.f26368a;
    }
}
