package p312nn;

import p388qn.AbstractC10601a;
import p388qn.C10606c0;
import tn.AbstractC11707a;
import tn.AbstractC11708b;
import tn.AbstractC11712f;
import tn.C11709c;
import tn.InterfaceC11713g;
import tn.InterfaceC11714h;

/* JADX INFO: renamed from: nn.b0 */
/* JADX INFO: loaded from: classes3.dex */
public class C9500b0 extends AbstractC11707a {

    /* JADX INFO: renamed from: a */
    public final C10606c0 f34185a;

    /* JADX INFO: renamed from: nn.b0$a */
    public static class a extends AbstractC11708b {
        @Override // tn.InterfaceC11711e
        /* JADX INFO: renamed from: a */
        public AbstractC11712f mo37456a(InterfaceC11714h interfaceC11714h, InterfaceC11713g interfaceC11713g) {
            if (interfaceC11714h.mo37494d() >= 4) {
                return AbstractC11712f.m43905c();
            }
            int iMo37495e = interfaceC11714h.mo37495e();
            CharSequence charSequenceM41528a = interfaceC11714h.mo37492b().m41528a();
            return C9500b0.m37453l(charSequenceM41528a, iMo37495e) ? AbstractC11712f.m43906d(new C9500b0(String.valueOf(charSequenceM41528a.subSequence(interfaceC11714h.getIndex(), charSequenceM41528a.length())))).mo37463b(charSequenceM41528a.length()) : AbstractC11712f.m43905c();
        }
    }

    public C9500b0(String str) {
        C10606c0 c10606c0 = new C10606c0();
        this.f34185a = c10606c0;
        c10606c0.m40643p(str);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m37453l(CharSequence charSequence, int i10) {
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

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: b */
    public C11709c mo37454b(InterfaceC11714h interfaceC11714h) {
        return C11709c.m43904d();
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: d */
    public AbstractC10601a mo37455d() {
        return this.f34185a;
    }
}
