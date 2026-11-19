package x7;

import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f36199a;
    public u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36200c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36201a;
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
            f36201a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f36201a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f36201a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: x7.b$b, reason: collision with other inner class name */
    public static class C0749b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36202a;
        public final c b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36203c;

        public C0749b(String str, c cVar, String str2) {
            this.f36202a = str;
            this.b = cVar;
            this.f36203c = str2;
        }
    }

    public enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    public static class d extends x7.k.i {

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f36208a;
            public int b;

            public a(int i10, int i11) {
                this.f36208a = i10;
                this.b = i11;
            }
        }

        public d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", BuildConfig.FLAVOR));
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
            x7.c cVarC;
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
                    x7.c cVarC2 = x7.c.c(this.f36622a, this.b, this.f36623c, false);
                    if (cVarC2 != null) {
                        this.b = cVarC2.a();
                    }
                    if (f('n') || f('N')) {
                        if (cVarC2 == null) {
                            cVarC2 = new x7.c(1L, this.b);
                        }
                        A();
                        boolean zF = f('+');
                        if (!zF && (zF = f('-'))) {
                            i11 = -1;
                        }
                        if (zF) {
                            A();
                            cVarC = x7.c.c(this.f36622a, this.b, this.f36623c, false);
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
            char cCharAt = this.f36622a.charAt(this.b);
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
            String strSubstring = this.f36622a.substring(i10, iP);
            this.b = iP;
            return strSubstring;
        }

        public String I() {
            char cCharAt;
            int iC;
            StringBuilder sb2 = new StringBuilder();
            while (!h() && (cCharAt = this.f36622a.charAt(this.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.b++;
                if (cCharAt == '\\') {
                    if (!h()) {
                        String str = this.f36622a;
                        int i10 = this.b;
                        this.b = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iC2 = C(cCharAt);
                            if (iC2 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (iC = C(this.f36622a.charAt(this.b))) != -1; i11++) {
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
            int iCharAt = this.f36622a.charAt(i10);
            int i11 = i10;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !j(iCharAt)) {
                if (!k(iCharAt)) {
                    i11 = this.b + 1;
                }
                iCharAt = a();
            }
            if (this.b > i10) {
                return this.f36622a.substring(i10, i11);
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
            while (it.hasNext() && (list = it.next().f36259a) != null) {
                Iterator<t> it2 = list.iterator();
                while (it2.hasNext() && (list2 = it2.next().f36262d) != null) {
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
        public boolean M(s sVar) throws x7.a {
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
                                throw new x7.a("Invalid attribute simpleSelectors");
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
                                    throw new x7.a("Invalid attribute simpleSelectors");
                                }
                                A();
                            } else {
                                strE = null;
                            }
                            if (!f(']')) {
                                throw new x7.a("Invalid attribute simpleSelectors");
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
                            throw new x7.a("Invalid \"#id\" simpleSelectors");
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
                        throw new x7.a("Invalid \".class\" simpleSelectors");
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

        public final void O(s sVar, t tVar) throws x7.a {
            g gVar;
            g hVar;
            g gVar2;
            String strH = H();
            if (strH == null) {
                throw new x7.a("Invalid pseudo class");
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
                        throw new x7.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    hVar = new h(aVarD.f36208a, aVarD.b, z10, z11, tVar.b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 13:
                    List<s> listK = K();
                    if (listK == null) {
                        throw new x7.a("Invalid or missing parameter section for pseudo class: " + strH);
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
                case MlKitException.UNSUPPORTED /* 18 */:
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
                    throw new x7.a("Unsupported pseudo class: " + strH);
            }
        }

        public final int P() {
            int i10;
            if (h()) {
                return this.b;
            }
            int i11 = this.b;
            int iCharAt = this.f36622a.charAt(i11);
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
        boolean a(q qVar, x7.g.l0 l0Var);
    }

    public static class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36223a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f36224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f36225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f36226e;

        public h(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f36223a = i10;
            this.b = i11;
            this.f36224c = z10;
            this.f36225d = z11;
            this.f36226e = str;
        }

        @Override // x7.b.g
        public boolean a(q qVar, x7.g.l0 l0Var) {
            int i10;
            int i11;
            String strN = (this.f36225d && this.f36226e == null) ? l0Var.n() : this.f36226e;
            x7.g.j0 j0Var = l0Var.b;
            if (j0Var != null) {
                Iterator<x7.g.n0> it = j0Var.getChildren().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    x7.g.l0 l0Var2 = (x7.g.l0) it.next();
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
            int i12 = this.f36224c ? i10 + 1 : i11 - i10;
            int i13 = this.f36223a;
            if (i13 == 0) {
                return i12 == this.b;
            }
            int i14 = this.b;
            return (i12 - i14) % i13 == 0 && (Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.b) == Integer.signum(this.f36223a));
        }

        public String toString() {
            String str = this.f36224c ? BuildConfig.FLAVOR : "last-";
            return this.f36225d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f36223a), Integer.valueOf(this.b), this.f36226e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f36223a), Integer.valueOf(this.b));
        }
    }

    public static class i implements g {
        public i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x7.b.g
        public boolean a(q qVar, x7.g.l0 l0Var) {
            return !(l0Var instanceof x7.g.j0) || ((x7.g.j0) l0Var).getChildren().size() == 0;
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
        public static final Map<String, j> f36251z = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    f36251z.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j a(String str) {
            j jVar = f36251z.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    public static class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<s> f36252a;

        public k(List<s> list) {
            this.f36252a = list;
        }

        @Override // x7.b.g
        public boolean a(q qVar, x7.g.l0 l0Var) {
            Iterator<s> it = this.f36252a.iterator();
            while (it.hasNext()) {
                if (b.l(qVar, it.next(), l0Var)) {
                    return false;
                }
            }
            return true;
        }

        public int b() {
            Iterator<s> it = this.f36252a.iterator();
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
            return "not(" + this.f36252a + ")";
        }
    }

    public static class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f36253a;

        public l(String str) {
            this.f36253a = str;
        }

        @Override // x7.b.g
        public boolean a(q qVar, x7.g.l0 l0Var) {
            return false;
        }

        public String toString() {
            return this.f36253a;
        }
    }

    public static class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f36254a;
        public String b;

        public m(boolean z10, String str) {
            this.f36254a = z10;
            this.b = str;
        }

        @Override // x7.b.g
        public boolean a(q qVar, x7.g.l0 l0Var) {
            int i10;
            String strN = (this.f36254a && this.b == null) ? l0Var.n() : this.b;
            x7.g.j0 j0Var = l0Var.b;
            if (j0Var != null) {
                Iterator<x7.g.n0> it = j0Var.getChildren().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    x7.g.l0 l0Var2 = (x7.g.l0) it.next();
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
            return this.f36254a ? String.format("only-of-type <%s>", this.b) : String.format("only-child", new Object[0]);
        }
    }

    public static class n implements g {
        public n() {
        }

        @Override // x7.b.g
        public boolean a(q qVar, x7.g.l0 l0Var) {
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

        @Override // x7.b.g
        public boolean a(q qVar, x7.g.l0 l0Var) {
            return qVar != null && l0Var == qVar.f36257a;
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
        public s f36255a;
        public x7.g.e0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f36256c;

        public p(s sVar, x7.g.e0 e0Var, u uVar) {
            this.f36255a = sVar;
            this.b = e0Var;
            this.f36256c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f36255a) + " {...} (src=" + this.f36256c + ")";
        }
    }

    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public x7.g.l0 f36257a;

        public String toString() {
            x7.g.l0 l0Var = this.f36257a;
            return l0Var != null ? String.format("<%s id=\"%s\">", l0Var.n(), this.f36257a.f36423c) : BuildConfig.FLAVOR;
        }
    }

    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<p> f36258a = null;

        public void a(p pVar) {
            if (this.f36258a == null) {
                this.f36258a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f36258a.size(); i10++) {
                if (this.f36258a.get(i10).f36255a.b > pVar.f36255a.b) {
                    this.f36258a.add(i10, pVar);
                    return;
                }
            }
            this.f36258a.add(pVar);
        }

        public void b(r rVar) {
            if (rVar.f36258a == null) {
                return;
            }
            if (this.f36258a == null) {
                this.f36258a = new ArrayList(rVar.f36258a.size());
            }
            Iterator<p> it = rVar.f36258a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }

        public List<p> c() {
            return this.f36258a;
        }

        public boolean d() {
            List<p> list = this.f36258a;
            return list == null || list.isEmpty();
        }

        public void e(u uVar) {
            List<p> list = this.f36258a;
            if (list == null) {
                return;
            }
            Iterator<p> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f36256c == uVar) {
                    it.remove();
                }
            }
        }

        public int f() {
            List<p> list = this.f36258a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f36258a == null) {
                return BuildConfig.FLAVOR;
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<p> it = this.f36258a.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f36260a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<C0749b> f36261c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<g> f36262d = null;

        public t(e eVar, String str) {
            this.f36260a = null;
            this.b = null;
            this.f36260a = eVar == null ? e.DESCENDANT : eVar;
            this.b = str;
        }

        public void a(String str, c cVar, String str2) {
            if (this.f36261c == null) {
                this.f36261c = new ArrayList();
            }
            this.f36261c.add(new C0749b(str, cVar, str2));
        }

        public void b(g gVar) {
            if (this.f36262d == null) {
                this.f36262d = new ArrayList();
            }
            this.f36262d.add(gVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f36260a;
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
            List<C0749b> list = this.f36261c;
            if (list != null) {
                for (C0749b c0749b : list) {
                    sb2.append('[');
                    sb2.append(c0749b.f36202a);
                    int i10 = a.f36201a[c0749b.b.ordinal()];
                    if (i10 == 1) {
                        sb2.append('=');
                        sb2.append(c0749b.f36203c);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(c0749b.f36203c);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(c0749b.f36203c);
                    }
                    sb2.append(']');
                }
            }
            List<g> list2 = this.f36262d;
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

    public static int a(List<x7.g.j0> list, int i10, x7.g.l0 l0Var) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        x7.g.j0 j0Var = list.get(i10);
        x7.g.j0 j0Var2 = l0Var.b;
        if (j0Var != j0Var2) {
            return -1;
        }
        Iterator<x7.g.n0> it = j0Var2.getChildren().iterator();
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

    public static boolean k(q qVar, s sVar, int i10, List<x7.g.j0> list, int i11, x7.g.l0 l0Var) {
        t tVarE = sVar.e(i10);
        if (!n(qVar, tVarE, list, i11, l0Var)) {
            return false;
        }
        e eVar = tVarE.f36260a;
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
        return k(qVar, sVar, i10 - 1, list, i11, (x7.g.l0) l0Var.b.getChildren().get(iA - 1));
    }

    public static boolean l(q qVar, s sVar, x7.g.l0 l0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l0Var.b; obj != null; obj = ((x7.g.n0) obj).b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l0Var) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l0Var);
    }

    public static boolean m(q qVar, s sVar, int i10, List<x7.g.j0> list, int i11) {
        t tVarE = sVar.e(i10);
        x7.g.l0 l0Var = (x7.g.l0) list.get(i11);
        if (!n(qVar, tVarE, list, i11, l0Var)) {
            return false;
        }
        e eVar = tVarE.f36260a;
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
        return k(qVar, sVar, i10 - 1, list, i11, (x7.g.l0) l0Var.b.getChildren().get(iA - 1));
    }

    public static boolean n(q qVar, t tVar, List<x7.g.j0> list, int i10, x7.g.l0 l0Var) {
        List<String> list2;
        String str = tVar.b;
        if (str != null && !str.equals(l0Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0749b> list3 = tVar.f36261c;
        if (list3 != null) {
            for (C0749b c0749b : list3) {
                String str2 = c0749b.f36202a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0749b.f36203c.equals(l0Var.f36423c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l0Var.f36427g) == null || !list2.contains(c0749b.f36203c)) {
                    return false;
                }
            }
        }
        List<g> list4 = tVar.f36262d;
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

    public final void e(r rVar, d dVar) throws x7.a {
        String strH = dVar.H();
        dVar.A();
        if (strH == null) {
            throw new x7.a("Invalid '@' rule");
        }
        if (!this.f36200c && strH.equals("media")) {
            List<f> listH = h(dVar);
            if (!dVar.f('{')) {
                throw new x7.a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(listH, this.f36199a)) {
                this.f36200c = true;
                rVar.b(j(dVar));
                this.f36200c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new x7.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f36200c || !strH.equals("import")) {
            p("Ignoring @%s rule", strH);
            o(dVar);
        } else {
            String strN = dVar.N();
            if (strN == null) {
                strN = dVar.F();
            }
            if (strN == null) {
                throw new x7.a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new x7.a("Invalid @media rule: expected '}' at end of rule set");
            }
            x7.g.k();
        }
        dVar.A();
    }

    public final x7.g.e0 g(d dVar) throws x7.a {
        x7.g.e0 e0Var = new x7.g.e0();
        do {
            String strH = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new x7.a("Expected ':'");
            }
            dVar.A();
            String strJ = dVar.J();
            if (strJ == null) {
                throw new x7.a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new x7.a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            x7.k.S0(e0Var, strH, strJ);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e0Var;
    }

    public final boolean i(r rVar, d dVar) throws x7.a {
        List listL = dVar.L();
        if (listL == null || listL.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new x7.a("Malformed rule block: expected '{'");
        }
        dVar.A();
        x7.g.e0 e0VarG = g(dVar);
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
            } catch (x7.a e10) {
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
        this.f36200c = false;
        this.f36199a = fVar;
        this.b = uVar;
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<t> f36259a;
        public int b;

        public s() {
            this.f36259a = null;
            this.b = 0;
        }

        public void a(t tVar) {
            if (this.f36259a == null) {
                this.f36259a = new ArrayList();
            }
            this.f36259a.add(tVar);
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
            return this.f36259a.get(i10);
        }

        public boolean f() {
            List<t> list = this.f36259a;
            return list == null || list.isEmpty();
        }

        public int g() {
            List<t> list = this.f36259a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator<t> it = this.f36259a.iterator();
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
