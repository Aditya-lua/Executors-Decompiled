package w7;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f33709a;
    public u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33710c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33711a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[j.values().length];
            b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f33711a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f33711a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f33711a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: w7.b$b, reason: collision with other inner class name */
    public static class C0619b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33712a;
        public final c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f33713c;

        public C0619b(String str, c cVar, String str2) {
            this.f33712a = str;
            this.b = cVar;
            this.f33713c = str2;
        }
    }

    public enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public static class d extends w7.k.i {

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f33718a;
            public int b;

            public a(int i10, int i11) {
                this.f33718a = i10;
                this.b = i11;
            }
        }

        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        public final int C(int i10) {
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

        public final a D() {
            w7.c cVarC;
            a aVar;
            if (h()) {
                return null;
            }
            int i10 = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            int i11 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i12 = (!f('+') && f('-')) ? -1 : 1;
                    w7.c cVarC2 = w7.c.c(this.f34132a, this.b, this.f34133c, false);
                    if (cVarC2 != null) {
                        this.b = cVarC2.a();
                    }
                    if (f('n') || f('N')) {
                        if (cVarC2 == null) {
                            cVarC2 = new w7.c(1L, this.b);
                        }
                        A();
                        boolean zF = f('+');
                        if (!zF && (zF = f('-'))) {
                            i11 = -1;
                        }
                        if (zF) {
                            A();
                            cVarC = w7.c.c(this.f34132a, this.b, this.f34133c, false);
                            if (cVarC == null) {
                                this.b = i10;
                                return null;
                            }
                            this.b = cVarC.a();
                            int i13 = i11;
                            i11 = i12;
                            i12 = i13;
                        } else {
                            int i14 = i11;
                            i11 = i12;
                            i12 = i14;
                            cVarC = null;
                        }
                    } else {
                        cVarC = cVarC2;
                        cVarC2 = null;
                    }
                    aVar = new a(cVarC2 == null ? 0 : i11 * cVarC2.d(), cVarC != null ? i12 * cVarC.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.b = i10;
            return null;
        }

        public final String E() {
            if (h()) {
                return null;
            }
            String strQ = q();
            return strQ != null ? strQ : H();
        }

        public String F() {
            int iC;
            if (h()) {
                return null;
            }
            char cCharAt = this.f34132a.charAt(this.b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.b++;
            int iIntValue = l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = l().intValue();
                        } else {
                            int iC2 = C(iIntValue);
                            if (iC2 != -1) {
                                for (int i10 = 1; i10 <= 5 && (iC = C((iIntValue = l().intValue()))) != -1; i10++) {
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb2.append((char) iC2);
                            }
                        }
                    }
                }
                sb2.append((char) iIntValue);
                iIntValue = l().intValue();
            }
            return sb2.toString();
        }

        public final List<String> G() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String strH = H();
                if (strH == null) {
                    this.b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strH);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.b = i10;
            return null;
        }

        public String H() {
            int iP = P();
            int i10 = this.b;
            if (iP == i10) {
                return null;
            }
            String strSubstring = this.f34132a.substring(i10, iP);
            this.b = iP;
            return strSubstring;
        }

        public String I() {
            char cCharAt;
            int iC;
            StringBuilder sb2 = new StringBuilder();
            while (!h() && (cCharAt = this.f34132a.charAt(this.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.b++;
                if (cCharAt == '\\') {
                    if (!h()) {
                        String str = this.f34132a;
                        int i10 = this.b;
                        this.b = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iC2 = C(cCharAt);
                            if (iC2 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (iC = C(this.f34132a.charAt(this.b))) != -1; i11++) {
                                    this.b++;
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb2.append((char) iC2);
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

        public String J() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            int iCharAt = this.f34132a.charAt(i10);
            int i11 = i10;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !j(iCharAt)) {
                if (!k(iCharAt)) {
                    i11 = this.b + 1;
                }
                iCharAt = a();
            }
            if (this.b > i10) {
                return this.f34132a.substring(i10, i11);
            }
            this.b = i10;
            return null;
        }

        public final List<s> K() {
            List<t> list;
            List<g> list2;
            if (h()) {
                return null;
            }
            int i10 = this.b;
            if (!f('(')) {
                return null;
            }
            A();
            List<s> listL = L();
            if (listL == null) {
                this.b = i10;
                return null;
            }
            if (!f(')')) {
                this.b = i10;
                return null;
            }
            Iterator<s> it = listL.iterator();
            while (it.hasNext() && (list = it.next().f33769a) != null) {
                Iterator<t> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().f33772d) != null) {
                    Iterator<g> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (it3.next() instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return listL;
        }

        public final List<s> L() {
            a aVar = null;
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(aVar);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(aVar);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        public boolean M(s sVar) throws w7.a {
            e eVar;
            t tVar;
            c cVar;
            String strE;
            if (h()) {
                return false;
            }
            int i10 = this.b;
            if (sVar.f()) {
                eVar = null;
            } else if (f('>')) {
                eVar = e.CHILD;
                A();
            } else if (f('+')) {
                eVar = e.FOLLOWS;
                A();
            } else {
                eVar = null;
            }
            if (f('*')) {
                tVar = new t(eVar, null);
            } else {
                String strH = H();
                if (strH != null) {
                    t tVar2 = new t(eVar, strH);
                    sVar.c();
                    tVar = tVar2;
                } else {
                    tVar = null;
                }
            }
            while (!h()) {
                if (!f('.')) {
                    if (!f('#')) {
                        if (!f('[')) {
                            if (!f(':')) {
                                break;
                            }
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            O(sVar, tVar);
                        } else {
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            A();
                            String strH2 = H();
                            if (strH2 == null) {
                                throw new w7.a("Invalid attribute simpleSelectors");
                            }
                            A();
                            if (f('=')) {
                                cVar = c.EQUALS;
                            } else if (g("~=")) {
                                cVar = c.INCLUDES;
                            } else {
                                cVar = g("|=") ? c.DASHMATCH : null;
                            }
                            if (cVar != null) {
                                A();
                                strE = E();
                                if (strE == null) {
                                    throw new w7.a("Invalid attribute simpleSelectors");
                                }
                                A();
                            } else {
                                strE = null;
                            }
                            if (!f(']')) {
                                throw new w7.a("Invalid attribute simpleSelectors");
                            }
                            if (cVar == null) {
                                cVar = c.EXISTS;
                            }
                            tVar.a(strH2, cVar, strE);
                            sVar.b();
                        }
                    } else {
                        if (tVar == null) {
                            tVar = new t(eVar, null);
                        }
                        String strH3 = H();
                        if (strH3 == null) {
                            throw new w7.a("Invalid \"#id\" simpleSelectors");
                        }
                        tVar.a("id", c.EQUALS, strH3);
                        sVar.d();
                    }
                } else {
                    if (tVar == null) {
                        tVar = new t(eVar, null);
                    }
                    String strH4 = H();
                    if (strH4 == null) {
                        throw new w7.a("Invalid \".class\" simpleSelectors");
                    }
                    tVar.a("class", c.EQUALS, strH4);
                    sVar.b();
                }
            }
            if (tVar != null) {
                sVar.a(tVar);
                return true;
            }
            this.b = i10;
            return false;
        }

        public String N() {
            if (h()) {
                return null;
            }
            int i10 = this.b;
            if (!g("url(")) {
                return null;
            }
            A();
            String strF = F();
            if (strF == null) {
                strF = I();
            }
            if (strF == null) {
                this.b = i10;
                return null;
            }
            A();
            if (h() || g(")")) {
                return strF;
            }
            this.b = i10;
            return null;
        }

        public final void O(s sVar, t tVar) throws w7.a {
            g gVar;
            g hVar;
            g gVar2;
            String strH = H();
            if (strH == null) {
                throw new w7.a("Invalid pseudo class");
            }
            j jVarA = j.a(strH);
            a aVar = null;
            switch (a.b[jVarA.ordinal()]) {
                case 1:
                    g hVar2 = new h(0, 1, true, false, null);
                    sVar.b();
                    gVar2 = hVar2;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 2:
                    g hVar3 = new h(0, 1, false, false, null);
                    sVar.b();
                    gVar = hVar3;
                    tVar.b(gVar);
                    return;
                case 3:
                    g mVar = new m(false, null);
                    sVar.b();
                    gVar = mVar;
                    tVar.b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 5:
                    g hVar4 = new h(0, 1, false, true, tVar.b);
                    sVar.b();
                    gVar = hVar4;
                    tVar.b(gVar);
                    return;
                case 6:
                    g mVar2 = new m(true, tVar.b);
                    sVar.b();
                    gVar = mVar2;
                    tVar.b(gVar);
                    return;
                case 7:
                    g nVar = new n(aVar);
                    sVar.b();
                    gVar = nVar;
                    tVar.b(gVar);
                    return;
                case 8:
                    g iVar = new i(aVar);
                    sVar.b();
                    gVar = iVar;
                    tVar.b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z10 = jVarA == j.nth_child || jVarA == j.nth_of_type;
                    boolean z11 = jVarA == j.nth_of_type || jVarA == j.nth_last_of_type;
                    a aVarD = D();
                    if (aVarD == null) {
                        throw new w7.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    hVar = new h(aVarD.f33718a, aVarD.b, z10, z11, tVar.b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 13:
                    List<s> listK = K();
                    if (listK == null) {
                        throw new w7.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    k kVar = new k(listK);
                    sVar.b = kVar.b();
                    gVar2 = kVar;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 14:
                    g oVar = new o(aVar);
                    sVar.b();
                    gVar = oVar;
                    tVar.b(gVar);
                    return;
                case 15:
                    G();
                    g lVar = new l(strH);
                    sVar.b();
                    gVar = lVar;
                    tVar.b(gVar);
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
                    g lVar2 = new l(strH);
                    sVar.b();
                    gVar = lVar2;
                    tVar.b(gVar);
                    return;
                default:
                    throw new w7.a("Unsupported pseudo class: " + strH);
            }
        }

        public final int P() {
            int i10;
            if (h()) {
                return this.b;
            }
            int i11 = this.b;
            int iCharAt = this.f34132a.charAt(i11);
            if (iCharAt == 45) {
                iCharAt = a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i10 = i11;
            } else {
                int iA = a();
                while (true) {
                    if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                        break;
                    }
                    iA = a();
                }
                i10 = this.b;
            }
            this.b = i11;
            return i10;
        }
    }

    public enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

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

    public interface g {
        boolean a(q qVar, w7.g.l0 l0Var);
    }

    public static class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33733a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f33734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f33735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f33736e;

        public h(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f33733a = i10;
            this.b = i11;
            this.f33734c = z10;
            this.f33735d = z11;
            this.f33736e = str;
        }

        @Override // w7.b.g
        public boolean a(q qVar, w7.g.l0 l0Var) {
            int i10;
            int i11;
            String strN = (this.f33735d && this.f33736e == null) ? l0Var.n() : this.f33736e;
            w7.g.j0 j0Var = l0Var.b;
            if (j0Var != null) {
                Iterator<w7.g.n0> it = j0Var.getChildren().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    w7.g.l0 l0Var2 = (w7.g.l0) it.next();
                    if (l0Var2 == l0Var) {
                        i10 = i11;
                    }
                    if (strN == null || l0Var2.n().equals(strN)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f33734c ? i10 + 1 : i11 - i10;
            int i13 = this.f33733a;
            if (i13 == 0) {
                return i12 == this.b;
            }
            int i14 = this.b;
            return (i12 - i14) % i13 == 0 && (Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.b) == Integer.signum(this.f33733a));
        }

        public String toString() {
            String str = this.f33734c ? "" : "last-";
            return this.f33735d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f33733a), Integer.valueOf(this.b), this.f33736e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f33733a), Integer.valueOf(this.b));
        }
    }

    public static class i implements g {
        public i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // w7.b.g
        public boolean a(q qVar, w7.g.l0 l0Var) {
            return !(l0Var instanceof w7.g.j0) || ((w7.g.j0) l0Var).getChildren().size() == 0;
        }

        public String toString() {
            return "empty";
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

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


        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final Map<String, j> f33761z = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    f33761z.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j a(String str) {
            j jVar = f33761z.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    public static class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<s> f33762a;

        public k(List<s> list) {
            this.f33762a = list;
        }

        @Override // w7.b.g
        public boolean a(q qVar, w7.g.l0 l0Var) {
            Iterator<s> it = this.f33762a.iterator();
            while (it.hasNext()) {
                if (b.l(qVar, it.next(), l0Var)) {
                    return false;
                }
            }
            return true;
        }

        public int b() {
            Iterator<s> it = this.f33762a.iterator();
            int i10 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i11 = it.next().b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f33762a + ")";
        }
    }

    public static class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f33763a;

        public l(String str) {
            this.f33763a = str;
        }

        @Override // w7.b.g
        public boolean a(q qVar, w7.g.l0 l0Var) {
            return false;
        }

        public String toString() {
            return this.f33763a;
        }
    }

    public static class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f33764a;
        public String b;

        public m(boolean z10, String str) {
            this.f33764a = z10;
            this.b = str;
        }

        @Override // w7.b.g
        public boolean a(q qVar, w7.g.l0 l0Var) {
            int i10;
            String strN = (this.f33764a && this.b == null) ? l0Var.n() : this.b;
            w7.g.j0 j0Var = l0Var.b;
            if (j0Var != null) {
                Iterator<w7.g.n0> it = j0Var.getChildren().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    w7.g.l0 l0Var2 = (w7.g.l0) it.next();
                    if (strN == null || l0Var2.n().equals(strN)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f33764a ? String.format("only-of-type <%s>", this.b) : String.format("only-child", new Object[0]);
        }
    }

    public static class n implements g {
        public n() {
        }

        @Override // w7.b.g
        public boolean a(q qVar, w7.g.l0 l0Var) {
            return l0Var.b == null;
        }

        public String toString() {
            return "root";
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    public static class o implements g {
        public o() {
        }

        @Override // w7.b.g
        public boolean a(q qVar, w7.g.l0 l0Var) {
            return qVar != null && l0Var == qVar.f33767a;
        }

        public String toString() {
            return "target";
        }

        public /* synthetic */ o(a aVar) {
            this();
        }
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f33765a;
        public w7.g.e0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f33766c;

        public p(s sVar, w7.g.e0 e0Var, u uVar) {
            this.f33765a = sVar;
            this.b = e0Var;
            this.f33766c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f33765a) + " {...} (src=" + this.f33766c + ")";
        }
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w7.g.l0 f33767a;

        public String toString() {
            w7.g.l0 l0Var = this.f33767a;
            return l0Var != null ? String.format("<%s id=\"%s\">", l0Var.n(), this.f33767a.f33933c) : "";
        }
    }

    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<p> f33768a = null;

        public void a(p pVar) {
            if (this.f33768a == null) {
                this.f33768a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f33768a.size(); i10++) {
                if (this.f33768a.get(i10).f33765a.b > pVar.f33765a.b) {
                    this.f33768a.add(i10, pVar);
                    return;
                }
            }
            this.f33768a.add(pVar);
        }

        public void b(r rVar) {
            if (rVar.f33768a == null) {
                return;
            }
            if (this.f33768a == null) {
                this.f33768a = new ArrayList(rVar.f33768a.size());
            }
            Iterator<p> it = rVar.f33768a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        public List<p> c() {
            return this.f33768a;
        }

        public boolean d() {
            List<p> list = this.f33768a;
            return list == null || list.isEmpty();
        }

        public void e(u uVar) {
            List<p> list = this.f33768a;
            if (list == null) {
                return;
            }
            Iterator<p> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f33766c == uVar) {
                    it.remove();
                }
            }
        }

        public int f() {
            List<p> list = this.f33768a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f33768a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<p> it = this.f33768a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f33770a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<C0619b> f33771c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<g> f33772d = null;

        public t(e eVar, String str) {
            this.f33770a = null;
            this.b = null;
            this.f33770a = eVar == null ? e.DESCENDANT : eVar;
            this.b = str;
        }

        public void a(String str, c cVar, String str2) {
            if (this.f33771c == null) {
                this.f33771c = new ArrayList();
            }
            this.f33771c.add(new C0619b(str, cVar, str2));
        }

        public void b(g gVar) {
            if (this.f33772d == null) {
                this.f33772d = new ArrayList();
            }
            this.f33772d.add(gVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f33770a;
            if (eVar == e.CHILD) {
                sb2.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.b;
            if (str == null) {
                str = "*";
            }
            sb2.append(str);
            List<C0619b> list = this.f33771c;
            if (list != null) {
                for (C0619b c0619b : list) {
                    sb2.append('[');
                    sb2.append(c0619b.f33712a);
                    int i10 = a.f33711a[c0619b.b.ordinal()];
                    if (i10 == 1) {
                        sb2.append('=');
                        sb2.append(c0619b.f33713c);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(c0619b.f33713c);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(c0619b.f33713c);
                    }
                    sb2.append(']');
                }
            }
            List<g> list2 = this.f33772d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb2.append(':');
                    sb2.append(gVar);
                }
            }
            return sb2.toString();
        }
    }

    public enum u {
        Document,
        RenderOptions
    }

    public b(u uVar) {
        this(f.screen, uVar);
    }

    public static int a(List<w7.g.j0> list, int i10, w7.g.l0 l0Var) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        w7.g.j0 j0Var = list.get(i10);
        w7.g.j0 j0Var2 = l0Var.b;
        if (j0Var != j0Var2) {
            return -1;
        }
        Iterator<w7.g.n0> it = j0Var2.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next() == l0Var) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    public static boolean c(List<f> list, f fVar) {
        for (f fVar2 : list) {
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    public static List<String> f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String strR = dVar.r();
            if (strR != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strR);
                dVar.A();
            }
        }
        return arrayList;
    }

    public static List<f> h(d dVar) {
        String strW;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (strW = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(strW));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean k(q qVar, s sVar, int i10, List<w7.g.j0> list, int i11, w7.g.l0 l0Var) {
        t tVarE = sVar.e(i10);
        if (!n(qVar, tVarE, list, i11, l0Var)) {
            return false;
        }
        e eVar = tVarE.f33770a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11);
        }
        int iA = a(list, i11, l0Var);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (w7.g.l0) l0Var.b.getChildren().get(iA - 1));
    }

    public static boolean l(q qVar, s sVar, w7.g.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l0Var.b; obj != null; obj = ((w7.g.n0) obj).b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l0Var) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l0Var);
    }

    public static boolean m(q qVar, s sVar, int i10, List<w7.g.j0> list, int i11) {
        t tVarE = sVar.e(i10);
        w7.g.l0 l0Var = (w7.g.l0) list.get(i11);
        if (!n(qVar, tVarE, list, i11, l0Var)) {
            return false;
        }
        e eVar = tVarE.f33770a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11 - 1);
        }
        int iA = a(list, i11, l0Var);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (w7.g.l0) l0Var.b.getChildren().get(iA - 1));
    }

    public static boolean n(q qVar, t tVar, List<w7.g.j0> list, int i10, w7.g.l0 l0Var) {
        List<String> list2;
        String str = tVar.b;
        if (str != null && !str.equals(l0Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0619b> list3 = tVar.f33771c;
        if (list3 != null) {
            for (C0619b c0619b : list3) {
                String str2 = c0619b.f33712a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0619b.f33713c.equals(l0Var.f33933c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l0Var.f33937g) == null || !list2.contains(c0619b.f33713c)) {
                    return false;
                }
            }
        }
        List<g> list4 = tVar.f33772d;
        if (list4 == null) {
            return true;
        }
        Iterator<g> it = list4.iterator();
        while (it.hasNext()) {
            if (!it.next().a(qVar, l0Var)) {
                return false;
            }
        }
        return true;
    }

    public static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    public r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }

    public final void e(r rVar, d dVar) throws w7.a {
        String strH = dVar.H();
        dVar.A();
        if (strH == null) {
            throw new w7.a("Invalid '@' rule");
        }
        if (!this.f33710c && strH.equals("media")) {
            List<f> listH = h(dVar);
            if (!dVar.f('{')) {
                throw new w7.a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(listH, this.f33709a)) {
                this.f33710c = true;
                rVar.b(j(dVar));
                this.f33710c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new w7.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f33710c || !strH.equals("import")) {
            p("Ignoring @%s rule", strH);
            o(dVar);
        } else {
            String strN = dVar.N();
            if (strN == null) {
                strN = dVar.F();
            }
            if (strN == null) {
                throw new w7.a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new w7.a("Invalid @media rule: expected '}' at end of rule set");
            }
            w7.g.k();
        }
        dVar.A();
    }

    public final w7.g.e0 g(d dVar) throws w7.a {
        w7.g.e0 e0Var = new w7.g.e0();
        do {
            String strH = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new w7.a("Expected ':'");
            }
            dVar.A();
            String strJ = dVar.J();
            if (strJ == null) {
                throw new w7.a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new w7.a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            w7.k.S0(e0Var, strH, strJ);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e0Var;
    }

    public final boolean i(r rVar, d dVar) throws w7.a {
        List listL = dVar.L();
        if (listL == null || listL.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new w7.a("Malformed rule block: expected '{'");
        }
        dVar.A();
        w7.g.e0 e0VarG = g(dVar);
        dVar.A();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), e0VarG, this.b));
        }
        return true;
    }

    public final r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (w7.a e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
                return rVar;
            }
        }
        return rVar;
    }

    public final void o(d dVar) {
        int i10 = 0;
        while (!dVar.h()) {
            int iIntValue = dVar.l().intValue();
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

    public b(f fVar, u uVar) {
        this.f33710c = false;
        this.f33709a = fVar;
        this.b = uVar;
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<t> f33769a;
        public int b;

        public s() {
            this.f33769a = null;
            this.b = 0;
        }

        public void a(t tVar) {
            if (this.f33769a == null) {
                this.f33769a = new ArrayList();
            }
            this.f33769a.add(tVar);
        }

        public void b() {
            this.b += 1000;
        }

        public void c() {
            this.b++;
        }

        public void d() {
            this.b += 1000000;
        }

        public t e(int i10) {
            return this.f33769a.get(i10);
        }

        public boolean f() {
            List<t> list = this.f33769a;
            return list == null || list.isEmpty();
        }

        public int g() {
            List<t> list = this.f33769a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator<t> it = this.f33769a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.b);
            sb2.append(']');
            return sb2.toString();
        }

        public /* synthetic */ s(a aVar) {
            this();
        }
    }
}
