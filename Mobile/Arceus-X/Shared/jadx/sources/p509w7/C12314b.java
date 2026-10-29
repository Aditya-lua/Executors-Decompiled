package p509w7;

import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: w7.b */
/* JADX INFO: loaded from: classes.dex */
public class C12314b {

    /* JADX INFO: renamed from: a */
    public f f43629a;

    /* JADX INFO: renamed from: b */
    public u f43630b;

    /* JADX INFO: renamed from: c */
    public boolean f43631c;

    /* JADX INFO: renamed from: w7.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43632a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f43633b;

        static {
            int[] iArr = new int[j.values().length];
            f43633b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43633b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43633b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43633b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43633b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f43633b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f43633b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f43633b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f43633b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f43633b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f43633b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f43633b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f43633b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f43633b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f43633b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f43633b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f43633b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f43633b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f43633b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f43633b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f43633b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f43633b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f43633b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f43633b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f43632a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f43632a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f43632a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: w7.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f43634a;

        /* JADX INFO: renamed from: b */
        public final c f43635b;

        /* JADX INFO: renamed from: c */
        public final String f43636c;

        public b(String str, c cVar, String str2) {
            this.f43634a = str;
            this.f43635b = cVar;
            this.f43636c = str2;
        }
    }

    /* JADX INFO: renamed from: w7.b$c */
    public enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    /* JADX INFO: renamed from: w7.b$d */
    public static class d extends C12323k.i {

        /* JADX INFO: renamed from: w7.b$d$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public int f43642a;

            /* JADX INFO: renamed from: b */
            public int f43643b;

            public a(int i10, int i11) {
                this.f43642a = i10;
                this.f43643b = i11;
            }
        }

        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        /* JADX INFO: renamed from: C */
        public final int m45792C(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        /* JADX INFO: renamed from: D */
        public final a m45793D() {
            C12315c c12315cM45825c;
            a aVar;
            if (m46143h()) {
                return null;
            }
            int i10 = this.f44171b;
            if (!m46141f('(')) {
                return null;
            }
            m46135A();
            int i11 = 1;
            if (m46142g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (m46142g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i12 = (!m46141f('+') && m46141f('-')) ? -1 : 1;
                    C12315c c12315cM45825c2 = C12315c.m45825c(this.f44170a, this.f44171b, this.f44172c, false);
                    if (c12315cM45825c2 != null) {
                        this.f44171b = c12315cM45825c2.m45826a();
                    }
                    if (m46141f('n') || m46141f('N')) {
                        if (c12315cM45825c2 == null) {
                            c12315cM45825c2 = new C12315c(1L, this.f44171b);
                        }
                        m46135A();
                        boolean zM46141f = m46141f('+');
                        if (!zM46141f && (zM46141f = m46141f('-'))) {
                            i11 = -1;
                        }
                        if (zM46141f) {
                            m46135A();
                            c12315cM45825c = C12315c.m45825c(this.f44170a, this.f44171b, this.f44172c, false);
                            if (c12315cM45825c == null) {
                                this.f44171b = i10;
                                return null;
                            }
                            this.f44171b = c12315cM45825c.m45826a();
                            int i13 = i11;
                            i11 = i12;
                            i12 = i13;
                        } else {
                            int i14 = i11;
                            i11 = i12;
                            i12 = i14;
                            c12315cM45825c = null;
                        }
                    } else {
                        c12315cM45825c = c12315cM45825c2;
                        c12315cM45825c2 = null;
                    }
                    aVar = new a(c12315cM45825c2 == null ? 0 : i11 * c12315cM45825c2.m45827d(), c12315cM45825c != null ? i12 * c12315cM45825c.m45827d() : 0);
                }
            }
            m46135A();
            if (m46141f(')')) {
                return aVar;
            }
            this.f44171b = i10;
            return null;
        }

        /* JADX INFO: renamed from: E */
        public final String m45794E() {
            if (m46143h()) {
                return null;
            }
            String strM46152q = m46152q();
            return strM46152q != null ? strM46152q : m45797H();
        }

        /* JADX INFO: renamed from: F */
        public String m45795F() {
            int iM45792C;
            if (m46143h()) {
                return null;
            }
            char cCharAt = this.f44170a.charAt(this.f44171b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f44171b++;
            int iIntValue = m46147l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = m46147l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = m46147l().intValue();
                        } else {
                            int iM45792C2 = m45792C(iIntValue);
                            if (iM45792C2 != -1) {
                                for (int i10 = 1; i10 <= 5 && (iM45792C = m45792C((iIntValue = m46147l().intValue()))) != -1; i10++) {
                                    iM45792C2 = (iM45792C2 * 16) + iM45792C;
                                }
                                sb2.append((char) iM45792C2);
                            }
                        }
                    }
                }
                sb2.append((char) iIntValue);
                iIntValue = m46147l().intValue();
            }
            return sb2.toString();
        }

        /* JADX INFO: renamed from: G */
        public final List<String> m45796G() {
            if (m46143h()) {
                return null;
            }
            int i10 = this.f44171b;
            if (!m46141f('(')) {
                return null;
            }
            m46135A();
            ArrayList arrayList = null;
            do {
                String strM45797H = m45797H();
                if (strM45797H == null) {
                    this.f44171b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strM45797H);
                m46135A();
            } while (m46161z());
            if (m46141f(')')) {
                return arrayList;
            }
            this.f44171b = i10;
            return null;
        }

        /* JADX INFO: renamed from: H */
        public String m45797H() {
            int iM45805P = m45805P();
            int i10 = this.f44171b;
            if (iM45805P == i10) {
                return null;
            }
            String strSubstring = this.f44170a.substring(i10, iM45805P);
            this.f44171b = iM45805P;
            return strSubstring;
        }

        /* JADX INFO: renamed from: I */
        public String m45798I() {
            char cCharAt;
            int iM45792C;
            StringBuilder sb2 = new StringBuilder();
            while (!m46143h() && (cCharAt = this.f44170a.charAt(this.f44171b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !m46146k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f44171b++;
                if (cCharAt == '\\') {
                    if (!m46143h()) {
                        String str = this.f44170a;
                        int i10 = this.f44171b;
                        this.f44171b = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iM45792C2 = m45792C(cCharAt);
                            if (iM45792C2 != -1) {
                                for (int i11 = 1; i11 <= 5 && !m46143h() && (iM45792C = m45792C(this.f44170a.charAt(this.f44171b))) != -1; i11++) {
                                    this.f44171b++;
                                    iM45792C2 = (iM45792C2 * 16) + iM45792C;
                                }
                                sb2.append((char) iM45792C2);
                            }
                        }
                    }
                }
                sb2.append(cCharAt);
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        }

        /* JADX INFO: renamed from: J */
        public String m45799J() {
            if (m46143h()) {
                return null;
            }
            int i10 = this.f44171b;
            int iCharAt = this.f44170a.charAt(i10);
            int i11 = i10;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !m46145j(iCharAt)) {
                if (!m46146k(iCharAt)) {
                    i11 = this.f44171b + 1;
                }
                iCharAt = m46136a();
            }
            if (this.f44171b > i10) {
                return this.f44170a.substring(i10, i11);
            }
            this.f44171b = i10;
            return null;
        }

        /* JADX INFO: renamed from: K */
        public final List<s> m45800K() {
            List<t> list;
            List<g> list2;
            if (m46143h()) {
                return null;
            }
            int i10 = this.f44171b;
            if (!m46141f('(')) {
                return null;
            }
            m46135A();
            List<s> listM45801L = m45801L();
            if (listM45801L == null) {
                this.f44171b = i10;
                return null;
            }
            if (!m46141f(')')) {
                this.f44171b = i10;
                return null;
            }
            Iterator<s> it = listM45801L.iterator();
            while (it.hasNext() && (list = it.next().f43701a) != null) {
                Iterator<t> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().f43706d) != null) {
                    Iterator<g> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return listM45801L;
        }

        /* JADX INFO: renamed from: L */
        public final List<s> m45801L() {
            a aVar = null;
            if (m46143h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!m46143h() && m45802M(sVar)) {
                if (m46161z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.m45820f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        /* JADX INFO: renamed from: M */
        public boolean m45802M(s sVar) throws C12313a {
            e eVar;
            t tVar;
            c cVar;
            String strM45794E;
            if (m46143h()) {
                return false;
            }
            int i10 = this.f44171b;
            if (sVar.m45820f()) {
                eVar = null;
            } else if (m46141f('>')) {
                eVar = e.CHILD;
                m46135A();
            } else if (m46141f('+')) {
                eVar = e.FOLLOWS;
                m46135A();
            } else {
                eVar = null;
            }
            if (m46141f('*')) {
                tVar = new t(eVar, null);
            } else {
                String strM45797H = m45797H();
                if (strM45797H != null) {
                    t tVar2 = new t(eVar, strM45797H);
                    sVar.m45817c();
                    tVar = tVar2;
                } else {
                    tVar = null;
                }
            }
            while (!m46143h()) {
                if (!m46141f('.')) {
                    if (!m46141f('#')) {
                        if (!m46141f('[')) {
                            if (!m46141f(':')) {
                                break;
                            }
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            m45804O(sVar, tVar);
                        } else {
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            m46135A();
                            String strM45797H2 = m45797H();
                            if (strM45797H2 == null) {
                                throw new C12313a("Invalid attribute simpleSelectors");
                            }
                            m46135A();
                            if (m46141f('=')) {
                                cVar = c.EQUALS;
                            } else if (m46142g("~=")) {
                                cVar = c.INCLUDES;
                            } else {
                                cVar = m46142g("|=") ? c.DASHMATCH : null;
                            }
                            if (cVar != null) {
                                m46135A();
                                strM45794E = m45794E();
                                if (strM45794E == null) {
                                    throw new C12313a("Invalid attribute simpleSelectors");
                                }
                                m46135A();
                            } else {
                                strM45794E = null;
                            }
                            if (!m46141f(']')) {
                                throw new C12313a("Invalid attribute simpleSelectors");
                            }
                            if (cVar == null) {
                                cVar = c.EXISTS;
                            }
                            tVar.m45822a(strM45797H2, cVar, strM45794E);
                            sVar.m45816b();
                        }
                    } else {
                        if (tVar == null) {
                            tVar = new t(eVar, null);
                        }
                        String strM45797H3 = m45797H();
                        if (strM45797H3 == null) {
                            throw new C12313a("Invalid \"#id\" simpleSelectors");
                        }
                        tVar.m45822a("id", c.EQUALS, strM45797H3);
                        sVar.m45818d();
                    }
                } else {
                    if (tVar == null) {
                        tVar = new t(eVar, null);
                    }
                    String strM45797H4 = m45797H();
                    if (strM45797H4 == null) {
                        throw new C12313a("Invalid \".class\" simpleSelectors");
                    }
                    tVar.m45822a("class", c.EQUALS, strM45797H4);
                    sVar.m45816b();
                }
            }
            if (tVar != null) {
                sVar.m45815a(tVar);
                return true;
            }
            this.f44171b = i10;
            return false;
        }

        /* JADX INFO: renamed from: N */
        public String m45803N() {
            if (m46143h()) {
                return null;
            }
            int i10 = this.f44171b;
            if (!m46142g("url(")) {
                return null;
            }
            m46135A();
            String strM45795F = m45795F();
            if (strM45795F == null) {
                strM45795F = m45798I();
            }
            if (strM45795F == null) {
                this.f44171b = i10;
                return null;
            }
            m46135A();
            if (m46143h() || m46142g(")")) {
                return strM45795F;
            }
            this.f44171b = i10;
            return null;
        }

        /* JADX INFO: renamed from: O */
        public final void m45804O(s sVar, t tVar) throws C12313a {
            g gVar;
            g hVar;
            g gVar2;
            String strM45797H = m45797H();
            if (strM45797H == null) {
                throw new C12313a("Invalid pseudo class");
            }
            j jVarM45807a = j.m45807a(strM45797H);
            a aVar = null;
            switch (a.f43633b[jVarM45807a.ordinal()]) {
                case 1:
                    g hVar2 = new h(0, 1, true, false, null);
                    sVar.m45816b();
                    gVar2 = hVar2;
                    gVar = gVar2;
                    tVar.m45823b(gVar);
                    return;
                case 2:
                    g hVar3 = new h(0, 1, false, false, null);
                    sVar.m45816b();
                    gVar = hVar3;
                    tVar.m45823b(gVar);
                    return;
                case 3:
                    g mVar = new m(false, null);
                    sVar.m45816b();
                    gVar = mVar;
                    tVar.m45823b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.f43704b);
                    sVar.m45816b();
                    gVar = hVar;
                    tVar.m45823b(gVar);
                    return;
                case 5:
                    g hVar4 = new h(0, 1, false, true, tVar.f43704b);
                    sVar.m45816b();
                    gVar = hVar4;
                    tVar.m45823b(gVar);
                    return;
                case 6:
                    g mVar2 = new m(true, tVar.f43704b);
                    sVar.m45816b();
                    gVar = mVar2;
                    tVar.m45823b(gVar);
                    return;
                case 7:
                    g nVar = new n(aVar);
                    sVar.m45816b();
                    gVar = nVar;
                    tVar.m45823b(gVar);
                    return;
                case 8:
                    g iVar = new i(aVar);
                    sVar.m45816b();
                    gVar = iVar;
                    tVar.m45823b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z10 = jVarM45807a == j.nth_child || jVarM45807a == j.nth_of_type;
                    boolean z11 = jVarM45807a == j.nth_of_type || jVarM45807a == j.nth_last_of_type;
                    a aVarM45793D = m45793D();
                    if (aVarM45793D == null) {
                        throw new C12313a("Invalid or missing parameter section for pseudo class: " + strM45797H);
                    }
                    hVar = new h(aVarM45793D.f43642a, aVarM45793D.f43643b, z10, z11, tVar.f43704b);
                    sVar.m45816b();
                    gVar = hVar;
                    tVar.m45823b(gVar);
                    return;
                case 13:
                    List<s> listM45800K = m45800K();
                    if (listM45800K == null) {
                        throw new C12313a("Invalid or missing parameter section for pseudo class: " + strM45797H);
                    }
                    k kVar = new k(listM45800K);
                    sVar.f43702b = kVar.m45808b();
                    gVar2 = kVar;
                    gVar = gVar2;
                    tVar.m45823b(gVar);
                    return;
                case 14:
                    g oVar = new o(aVar);
                    sVar.m45816b();
                    gVar = oVar;
                    tVar.m45823b(gVar);
                    return;
                case 15:
                    m45796G();
                    g lVar = new l(strM45797H);
                    sVar.m45816b();
                    gVar = lVar;
                    tVar.m45823b(gVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    g lVar2 = new l(strM45797H);
                    sVar.m45816b();
                    gVar = lVar2;
                    tVar.m45823b(gVar);
                    return;
                default:
                    throw new C12313a("Unsupported pseudo class: " + strM45797H);
            }
        }

        /* JADX INFO: renamed from: P */
        public final int m45805P() {
            int i10;
            if (m46143h()) {
                return this.f44171b;
            }
            int i11 = this.f44171b;
            int iCharAt = this.f44170a.charAt(i11);
            if (iCharAt == 45) {
                iCharAt = m46136a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i10 = i11;
            } else {
                int iM46136a = m46136a();
                while (true) {
                    if ((iM46136a < 65 || iM46136a > 90) && ((iM46136a < 97 || iM46136a > 122) && !((iM46136a >= 48 && iM46136a <= 57) || iM46136a == 45 || iM46136a == 95))) {
                        break;
                    }
                    iM46136a = m46136a();
                }
                i10 = this.f44171b;
            }
            this.f44171b = i11;
            return i10;
        }
    }

    /* JADX INFO: renamed from: w7.b$e */
    public enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    /* JADX INFO: renamed from: w7.b$f */
    public enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    /* JADX INFO: renamed from: w7.b$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        boolean mo45806a(q qVar, C12319g.l0 l0Var);
    }

    /* JADX INFO: renamed from: w7.b$h */
    public static class h implements g {

        /* JADX INFO: renamed from: a */
        public int f43660a;

        /* JADX INFO: renamed from: b */
        public int f43661b;

        /* JADX INFO: renamed from: c */
        public boolean f43662c;

        /* JADX INFO: renamed from: d */
        public boolean f43663d;

        /* JADX INFO: renamed from: e */
        public String f43664e;

        public h(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f43660a = i10;
            this.f43661b = i11;
            this.f43662c = z10;
            this.f43663d = z11;
            this.f43664e = str;
        }

        @Override // p509w7.C12314b.g
        /* JADX INFO: renamed from: a */
        public boolean mo45806a(q qVar, C12319g.l0 l0Var) {
            int i10;
            int i11;
            String strMo45862n = (this.f43663d && this.f43664e == null) ? l0Var.mo45862n() : this.f43664e;
            C12319g.j0 j0Var = l0Var.f43914b;
            if (j0Var != null) {
                Iterator<C12319g.n0> it = j0Var.getChildren().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    C12319g.l0 l0Var2 = (C12319g.l0) it.next();
                    if (l0Var2 == l0Var) {
                        i10 = i11;
                    }
                    if (strMo45862n == null || l0Var2.mo45862n().equals(strMo45862n)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f43662c ? i10 + 1 : i11 - i10;
            int i13 = this.f43660a;
            if (i13 == 0) {
                return i12 == this.f43661b;
            }
            int i14 = this.f43661b;
            return (i12 - i14) % i13 == 0 && (Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.f43661b) == Integer.signum(this.f43660a));
        }

        public String toString() {
            String str = this.f43662c ? "" : "last-";
            return this.f43663d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f43660a), Integer.valueOf(this.f43661b), this.f43664e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f43660a), Integer.valueOf(this.f43661b));
        }
    }

    /* JADX INFO: renamed from: w7.b$i */
    public static class i implements g {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public i() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: w7.g$l0 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p509w7.C12314b.g
        /* JADX INFO: renamed from: a */
        public boolean mo45806a(q qVar, C12319g.l0 l0Var) {
            return !(l0Var instanceof C12319g.j0) || ((C12319g.j0) l0Var).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: w7.b.i.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: w7.b$j */
    public enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* JADX INFO: renamed from: z */
        public static final Map<String, j> f43691z = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    f43691z.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public static j m45807a(String str) {
            j jVar = f43691z.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    /* JADX INFO: renamed from: w7.b$k */
    public static class k implements g {

        /* JADX INFO: renamed from: a */
        public List<s> f43692a;

        public k(List<s> list) {
            this.f43692a = list;
        }

        @Override // p509w7.C12314b.g
        /* JADX INFO: renamed from: a */
        public boolean mo45806a(q qVar, C12319g.l0 l0Var) {
            Iterator<s> it = this.f43692a.iterator();
            while (it.hasNext()) {
                if (C12314b.m45781l(qVar, it.next(), l0Var)) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: b */
        public int m45808b() {
            Iterator<s> it = this.f43692a.iterator();
            int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            while (it.hasNext()) {
                int i11 = it.next().f43702b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f43692a + ")";
        }
    }

    /* JADX INFO: renamed from: w7.b$l */
    public static class l implements g {

        /* JADX INFO: renamed from: a */
        public String f43693a;

        public l(String str) {
            this.f43693a = str;
        }

        @Override // p509w7.C12314b.g
        /* JADX INFO: renamed from: a */
        public boolean mo45806a(q qVar, C12319g.l0 l0Var) {
            return false;
        }

        public String toString() {
            return this.f43693a;
        }
    }

    /* JADX INFO: renamed from: w7.b$m */
    public static class m implements g {

        /* JADX INFO: renamed from: a */
        public boolean f43694a;

        /* JADX INFO: renamed from: b */
        public String f43695b;

        public m(boolean z10, String str) {
            this.f43694a = z10;
            this.f43695b = str;
        }

        @Override // p509w7.C12314b.g
        /* JADX INFO: renamed from: a */
        public boolean mo45806a(q qVar, C12319g.l0 l0Var) {
            int i10;
            String strMo45862n = (this.f43694a && this.f43695b == null) ? l0Var.mo45862n() : this.f43695b;
            C12319g.j0 j0Var = l0Var.f43914b;
            if (j0Var != null) {
                Iterator<C12319g.n0> it = j0Var.getChildren().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    C12319g.l0 l0Var2 = (C12319g.l0) it.next();
                    if (strMo45862n == null || l0Var2.mo45862n().equals(strMo45862n)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f43694a ? String.format("only-of-type <%s>", this.f43695b) : String.format("only-child", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: w7.b$n */
    public static class n implements g {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public n() {
        }

        @Override // p509w7.C12314b.g
        /* JADX INFO: renamed from: a */
        public boolean mo45806a(q qVar, C12319g.l0 l0Var) {
            return l0Var.f43914b == null;
        }

        public String toString() {
            return "root";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: w7.b.n.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: w7.b$o */
    public static class o implements g {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public o() {
        }

        @Override // p509w7.C12314b.g
        /* JADX INFO: renamed from: a */
        public boolean mo45806a(q qVar, C12319g.l0 l0Var) {
            return qVar != null && l0Var == qVar.f43699a;
        }

        public String toString() {
            return "target";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: w7.b.o.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ o(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: w7.b$p */
    public static class p {

        /* JADX INFO: renamed from: a */
        public s f43696a;

        /* JADX INFO: renamed from: b */
        public C12319g.e0 f43697b;

        /* JADX INFO: renamed from: c */
        public u f43698c;

        public p(s sVar, C12319g.e0 e0Var, u uVar) {
            this.f43696a = sVar;
            this.f43697b = e0Var;
            this.f43698c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f43696a) + " {...} (src=" + this.f43698c + ")";
        }
    }

    /* JADX INFO: renamed from: w7.b$q */
    public static class q {

        /* JADX INFO: renamed from: a */
        public C12319g.l0 f43699a;

        public String toString() {
            C12319g.l0 l0Var = this.f43699a;
            return l0Var != null ? String.format("<%s id=\"%s\">", l0Var.mo45862n(), this.f43699a.f43903c) : "";
        }
    }

    /* JADX INFO: renamed from: w7.b$r */
    public static class r {

        /* JADX INFO: renamed from: a */
        public List<p> f43700a = null;

        /* JADX INFO: renamed from: a */
        public void m45809a(p pVar) {
            if (this.f43700a == null) {
                this.f43700a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f43700a.size(); i10++) {
                if (this.f43700a.get(i10).f43696a.f43702b > pVar.f43696a.f43702b) {
                    this.f43700a.add(i10, pVar);
                    return;
                }
            }
            this.f43700a.add(pVar);
        }

        /* JADX INFO: renamed from: b */
        public void m45810b(r rVar) {
            if (rVar.f43700a == null) {
                return;
            }
            if (this.f43700a == null) {
                this.f43700a = new ArrayList(rVar.f43700a.size());
            }
            Iterator<p> it = rVar.f43700a.iterator();
            while (it.hasNext()) {
                m45809a(it.next());
            }
        }

        /* JADX INFO: renamed from: c */
        public List<p> m45811c() {
            return this.f43700a;
        }

        /* JADX INFO: renamed from: d */
        public boolean m45812d() {
            List<p> list = this.f43700a;
            return list == null || list.isEmpty();
        }

        /* JADX INFO: renamed from: e */
        public void m45813e(u uVar) {
            List<p> list = this.f43700a;
            if (list == null) {
                return;
            }
            Iterator<p> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f43698c == uVar) {
                    it.remove();
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public int m45814f() {
            List<p> list = this.f43700a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f43700a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<p> it = this.f43700a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: w7.b$t */
    public static class t {

        /* JADX INFO: renamed from: a */
        public e f43703a;

        /* JADX INFO: renamed from: b */
        public String f43704b;

        /* JADX INFO: renamed from: c */
        public List<b> f43705c = null;

        /* JADX INFO: renamed from: d */
        public List<g> f43706d = null;

        public t(e eVar, String str) {
            this.f43703a = null;
            this.f43704b = null;
            this.f43703a = eVar == null ? e.DESCENDANT : eVar;
            this.f43704b = str;
        }

        /* JADX INFO: renamed from: a */
        public void m45822a(String str, c cVar, String str2) {
            if (this.f43705c == null) {
                this.f43705c = new ArrayList();
            }
            this.f43705c.add(new b(str, cVar, str2));
        }

        /* JADX INFO: renamed from: b */
        public void m45823b(g gVar) {
            if (this.f43706d == null) {
                this.f43706d = new ArrayList();
            }
            this.f43706d.add(gVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f43703a;
            if (eVar == e.CHILD) {
                sb2.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f43704b;
            if (str == null) {
                str = "*";
            }
            sb2.append(str);
            List<b> list = this.f43705c;
            if (list != null) {
                for (b bVar : list) {
                    sb2.append('[');
                    sb2.append(bVar.f43634a);
                    int i10 = a.f43632a[bVar.f43635b.ordinal()];
                    if (i10 == 1) {
                        sb2.append('=');
                        sb2.append(bVar.f43636c);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(bVar.f43636c);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(bVar.f43636c);
                    }
                    sb2.append(']');
                }
            }
            List<g> list2 = this.f43706d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb2.append(':');
                    sb2.append(gVar);
                }
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: w7.b$u */
    public enum u {
        Document,
        RenderOptions
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12314b(u uVar) {
        this(f.screen, uVar);
    }

    /* JADX INFO: renamed from: a */
    public static int m45775a(List<C12319g.j0> list, int i10, C12319g.l0 l0Var) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        C12319g.j0 j0Var = list.get(i10);
        C12319g.j0 j0Var2 = l0Var.f43914b;
        if (j0Var != j0Var2) {
            return -1;
        }
        Iterator<C12319g.n0> it = j0Var2.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == l0Var) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m45776b(String str, f fVar) {
        d dVar = new d(str);
        dVar.m46135A();
        return m45777c(m45779h(dVar), fVar);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m45777c(List<f> list, f fVar) {
        for (f fVar2 : list) {
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static List<String> m45778f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.m46143h()) {
            String strM46153r = dVar.m46153r();
            if (strM46153r != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strM46153r);
                dVar.m46135A();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static List<f> m45779h(d dVar) {
        String strM46158w;
        ArrayList arrayList = new ArrayList();
        while (!dVar.m46143h() && (strM46158w = dVar.m46158w()) != null) {
            try {
                arrayList.add(f.valueOf(strM46158w));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.m46161z()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m45780k(q qVar, s sVar, int i10, List<C12319g.j0> list, int i11, C12319g.l0 l0Var) {
        t tVarM45819e = sVar.m45819e(i10);
        if (!m45783n(qVar, tVarM45819e, list, i11, l0Var)) {
            return false;
        }
        e eVar = tVarM45819e.f43703a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m45782m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m45782m(qVar, sVar, i10 - 1, list, i11);
        }
        int iM45775a = m45775a(list, i11, l0Var);
        if (iM45775a <= 0) {
            return false;
        }
        return m45780k(qVar, sVar, i10 - 1, list, i11, (C12319g.l0) l0Var.f43914b.getChildren().get(iM45775a - 1));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m45781l(q qVar, s sVar, C12319g.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l0Var.f43914b; obj != null; obj = ((C12319g.n0) obj).f43914b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.m45821g() == 1 ? m45783n(qVar, sVar.m45819e(0), arrayList, size, l0Var) : m45780k(qVar, sVar, sVar.m45821g() - 1, arrayList, size, l0Var);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m45782m(q qVar, s sVar, int i10, List<C12319g.j0> list, int i11) {
        t tVarM45819e = sVar.m45819e(i10);
        C12319g.l0 l0Var = (C12319g.l0) list.get(i11);
        if (!m45783n(qVar, tVarM45819e, list, i11, l0Var)) {
            return false;
        }
        e eVar = tVarM45819e.f43703a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m45782m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m45782m(qVar, sVar, i10 - 1, list, i11 - 1);
        }
        int iM45775a = m45775a(list, i11, l0Var);
        if (iM45775a <= 0) {
            return false;
        }
        return m45780k(qVar, sVar, i10 - 1, list, i11, (C12319g.l0) l0Var.f43914b.getChildren().get(iM45775a - 1));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m45783n(q qVar, t tVar, List<C12319g.j0> list, int i10, C12319g.l0 l0Var) {
        List<String> list2;
        String str = tVar.f43704b;
        if (str != null && !str.equals(l0Var.mo45862n().toLowerCase(Locale.US))) {
            return false;
        }
        List<b> list3 = tVar.f43705c;
        if (list3 != null) {
            for (b bVar : list3) {
                String str2 = bVar.f43634a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!bVar.f43636c.equals(l0Var.f43903c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l0Var.f43907g) == null || !list2.contains(bVar.f43636c)) {
                    return false;
                }
            }
        }
        List<g> list4 = tVar.f43706d;
        if (list4 == null) {
            return true;
        }
        Iterator<g> it = list4.iterator();
        while (it.hasNext()) {
            if (!it.next().mo45806a(qVar, l0Var)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public static void m45784p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public r m45785d(String str) {
        d dVar = new d(str);
        dVar.m46135A();
        return m45789j(dVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m45786e(r rVar, d dVar) throws C12313a {
        String strM45797H = dVar.m45797H();
        dVar.m46135A();
        if (strM45797H == null) {
            throw new C12313a("Invalid '@' rule");
        }
        if (!this.f43631c && strM45797H.equals("media")) {
            List<f> listM45779h = m45779h(dVar);
            if (!dVar.m46141f('{')) {
                throw new C12313a("Invalid @media rule: missing rule set");
            }
            dVar.m46135A();
            if (m45777c(listM45779h, this.f43629a)) {
                this.f43631c = true;
                rVar.m45810b(m45789j(dVar));
                this.f43631c = false;
            } else {
                m45789j(dVar);
            }
            if (!dVar.m46143h() && !dVar.m46141f('}')) {
                throw new C12313a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f43631c || !strM45797H.equals("import")) {
            m45784p("Ignoring @%s rule", strM45797H);
            m45790o(dVar);
        } else {
            String strM45803N = dVar.m45803N();
            if (strM45803N == null) {
                strM45803N = dVar.m45795F();
            }
            if (strM45803N == null) {
                throw new C12313a("Invalid @import rule: expected string or url()");
            }
            dVar.m46135A();
            m45779h(dVar);
            if (!dVar.m46143h() && !dVar.m46141f(';')) {
                throw new C12313a("Invalid @media rule: expected '}' at end of rule set");
            }
            C12319g.m45840k();
        }
        dVar.m46135A();
    }

    /* JADX INFO: renamed from: g */
    public final C12319g.e0 m45787g(d dVar) throws C12313a {
        C12319g.e0 e0Var = new C12319g.e0();
        do {
            String strM45797H = dVar.m45797H();
            dVar.m46135A();
            if (!dVar.m46141f(':')) {
                throw new C12313a("Expected ':'");
            }
            dVar.m46135A();
            String strM45799J = dVar.m45799J();
            if (strM45799J == null) {
                throw new C12313a("Expected property value");
            }
            dVar.m46135A();
            if (dVar.m46141f('!')) {
                dVar.m46135A();
                if (!dVar.m46142g("important")) {
                    throw new C12313a("Malformed rule set: found unexpected '!'");
                }
                dVar.m46135A();
            }
            dVar.m46141f(';');
            C12323k.m46025S0(e0Var, strM45797H, strM45799J);
            dVar.m46135A();
            if (dVar.m46143h()) {
                break;
            }
        } while (!dVar.m46141f('}'));
        return e0Var;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m45788i(r rVar, d dVar) throws C12313a {
        List listM45801L = dVar.m45801L();
        if (listM45801L == null || listM45801L.isEmpty()) {
            return false;
        }
        if (!dVar.m46141f('{')) {
            throw new C12313a("Malformed rule block: expected '{'");
        }
        dVar.m46135A();
        C12319g.e0 e0VarM45787g = m45787g(dVar);
        dVar.m46135A();
        Iterator it = listM45801L.iterator();
        while (it.hasNext()) {
            rVar.m45809a(new p((s) it.next(), e0VarM45787g, this.f43630b));
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final r m45789j(d dVar) {
        r rVar = new r();
        while (!dVar.m46143h()) {
            try {
                if (!dVar.m46142g("<!--") && !dVar.m46142g("-->")) {
                    if (!dVar.m46141f('@')) {
                        if (!m45788i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        m45786e(rVar, dVar);
                    }
                }
            } catch (C12313a e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
                return rVar;
            }
        }
        return rVar;
    }

    /* JADX INFO: renamed from: o */
    public final void m45790o(d dVar) {
        int i10 = 0;
        while (!dVar.m46143h()) {
            int iIntValue = dVar.m46147l().intValue();
            if (iIntValue == 59 && i10 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i10++;
            } else if (iIntValue == 125 && i10 > 0 && (i10 = i10 - 1) == 0) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12314b(f fVar, u uVar) {
        this.f43631c = false;
        this.f43629a = fVar;
        this.f43630b = uVar;
    }

    /* JADX INFO: renamed from: w7.b$s */
    public static class s {

        /* JADX INFO: renamed from: a */
        public List<t> f43701a;

        /* JADX INFO: renamed from: b */
        public int f43702b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public s() {
            this.f43701a = null;
            this.f43702b = 0;
        }

        /* JADX INFO: renamed from: a */
        public void m45815a(t tVar) {
            if (this.f43701a == null) {
                this.f43701a = new ArrayList();
            }
            this.f43701a.add(tVar);
        }

        /* JADX INFO: renamed from: b */
        public void m45816b() {
            this.f43702b += 1000;
        }

        /* JADX INFO: renamed from: c */
        public void m45817c() {
            this.f43702b++;
        }

        /* JADX INFO: renamed from: d */
        public void m45818d() {
            this.f43702b += 1000000;
        }

        /* JADX INFO: renamed from: e */
        public t m45819e(int i10) {
            return this.f43701a.get(i10);
        }

        /* JADX INFO: renamed from: f */
        public boolean m45820f() {
            List<t> list = this.f43701a;
            return list == null || list.isEmpty();
        }

        /* JADX INFO: renamed from: g */
        public int m45821g() {
            List<t> list = this.f43701a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator<t> it = this.f43701a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.f43702b);
            sb2.append(']');
            return sb2.toString();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:4) call: w7.b.s.<init>():void type: THIS */
        public /* synthetic */ s(a aVar) {
            this();
        }
    }
}
