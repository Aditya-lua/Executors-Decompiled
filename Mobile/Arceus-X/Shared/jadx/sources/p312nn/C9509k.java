package p312nn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p388qn.AbstractC10601a;
import p388qn.AbstractC10621q;
import p388qn.C10603b;
import p388qn.C10606c0;
import p388qn.C10609e;
import p388qn.C10610f;
import p388qn.C10612h;
import p388qn.C10614j;
import p388qn.C10615k;
import p388qn.C10618n;
import p388qn.C10627w;
import p388qn.C10629y;
import p418rn.C10934i;
import p418rn.C10935j;
import p418rn.EnumC10926a;
import p418rn.InterfaceC10927b;
import p418rn.InterfaceC10929d;
import p472un.InterfaceC11892a;
import pn.C10300f;
import sn.InterfaceC11418b;
import sn.InterfaceC11421e;
import tn.AbstractC11712f;
import tn.C11709c;
import tn.InterfaceC11710d;
import tn.InterfaceC11711e;
import tn.InterfaceC11713g;
import tn.InterfaceC11714h;
import vn.C12236d;

/* JADX INFO: renamed from: nn.k */
/* JADX INFO: loaded from: classes3.dex */
public class C9509k implements InterfaceC11714h {

    /* JADX INFO: renamed from: v */
    public static final Set<Class<? extends AbstractC10601a>> f34210v = new LinkedHashSet(C9508j.m37484a(new Object[]{C10603b.class, C10614j.class, C10612h.class, C10615k.class, C10606c0.class, AbstractC10621q.class, C10618n.class}));

    /* JADX INFO: renamed from: w */
    public static final Map<Class<? extends AbstractC10601a>, InterfaceC11711e> f34211w;

    /* JADX INFO: renamed from: a */
    public C10934i f34212a;

    /* JADX INFO: renamed from: e */
    public boolean f34216e;

    /* JADX INFO: renamed from: i */
    public boolean f34220i;

    /* JADX INFO: renamed from: j */
    public final List<InterfaceC11711e> f34221j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC10929d f34222k;

    /* JADX INFO: renamed from: l */
    public final List<InterfaceC11418b> f34223l;

    /* JADX INFO: renamed from: m */
    public final List<InterfaceC11892a> f34224m;

    /* JADX INFO: renamed from: n */
    public final List<InterfaceC11421e> f34225n;

    /* JADX INFO: renamed from: o */
    public final Set<Character> f34226o;

    /* JADX INFO: renamed from: p */
    public final EnumC10926a f34227p;

    /* JADX INFO: renamed from: q */
    public final int f34228q;

    /* JADX INFO: renamed from: r */
    public final C9506h f34229r;

    /* JADX INFO: renamed from: b */
    public int f34213b = -1;

    /* JADX INFO: renamed from: c */
    public int f34214c = 0;

    /* JADX INFO: renamed from: d */
    public int f34215d = 0;

    /* JADX INFO: renamed from: f */
    public int f34217f = 0;

    /* JADX INFO: renamed from: g */
    public int f34218g = 0;

    /* JADX INFO: renamed from: h */
    public int f34219h = 0;

    /* JADX INFO: renamed from: s */
    public final C9504f f34230s = new C9504f();

    /* JADX INFO: renamed from: t */
    public final List<b> f34231t = new ArrayList();

    /* JADX INFO: renamed from: u */
    public final List<InterfaceC11710d> f34232u = new ArrayList();

    /* JADX INFO: renamed from: nn.k$a */
    public static class a implements InterfaceC11713g {

        /* JADX INFO: renamed from: a */
        public final InterfaceC11710d f34233a;

        public a(InterfaceC11710d interfaceC11710d) {
            this.f34233a = interfaceC11710d;
        }

        @Override // tn.InterfaceC11713g
        /* JADX INFO: renamed from: a */
        public InterfaceC11710d mo37514a() {
            return this.f34233a;
        }

        @Override // tn.InterfaceC11713g
        /* JADX INFO: renamed from: b */
        public C10935j mo37515b() {
            InterfaceC11710d interfaceC11710d = this.f34233a;
            return interfaceC11710d instanceof C9524z ? ((C9524z) interfaceC11710d).m37608k() : C10935j.m41531b();
        }
    }

    /* JADX INFO: renamed from: nn.k$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC11710d f34234a;

        /* JADX INFO: renamed from: b */
        public int f34235b;

        public b(InterfaceC11710d interfaceC11710d, int i10) {
            this.f34234a = interfaceC11710d;
            this.f34235b = i10;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(C10603b.class, new C9501c.a());
        map.put(C10614j.class, new C9511m.a());
        map.put(C10612h.class, new C9510l.a());
        map.put(C10615k.class, new C9512n.a());
        map.put(C10606c0.class, new C9500b0.a());
        map.put(AbstractC10621q.class, new C9522x.a());
        map.put(C10618n.class, new C9514p.a());
        f34211w = Collections.unmodifiableMap(map);
    }

    public C9509k(List<InterfaceC11711e> list, InterfaceC10929d interfaceC10929d, List<InterfaceC11418b> list2, List<InterfaceC11892a> list3, List<InterfaceC11421e> list4, Set<Character> set, EnumC10926a enumC10926a, int i10) {
        this.f34221j = list;
        this.f34222k = interfaceC10929d;
        this.f34223l = list2;
        this.f34224m = list3;
        this.f34225n = list4;
        this.f34226o = set;
        this.f34227p = enumC10926a;
        this.f34228q = i10;
        C9506h c9506h = new C9506h();
        this.f34229r = c9506h;
        m37497g(new b(c9506h, 0));
    }

    /* JADX INFO: renamed from: m */
    public static List<InterfaceC11711e> m37485m(List<InterfaceC11711e> list, Set<Class<? extends AbstractC10601a>> set) {
        ArrayList arrayList = new ArrayList(list);
        Iterator<Class<? extends AbstractC10601a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f34211w.get(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static Set<Class<? extends AbstractC10601a>> m37486t() {
        return f34210v;
    }

    /* JADX INFO: renamed from: x */
    public static String m37487x(String str) {
        return str.indexOf(0) == -1 ? str : str.replace((char) 0, (char) 65533);
    }

    /* JADX INFO: renamed from: A */
    public final void m37488A(String str, int i10) {
        this.f34213b++;
        this.f34214c = 0;
        this.f34215d = 0;
        this.f34216e = false;
        String strM37487x = m37487x(str);
        this.f34212a = C10934i.m41527c(strM37487x, this.f34227p != EnumC10926a.NONE ? C10629y.m40715e(this.f34213b, 0, i10, strM37487x.length()) : null);
    }

    /* JADX INFO: renamed from: B */
    public final void m37489B(int i10) {
        int i11;
        int i12 = this.f34218g;
        if (i10 >= i12) {
            this.f34214c = this.f34217f;
            this.f34215d = i12;
        }
        int length = this.f34212a.m41528a().length();
        while (true) {
            i11 = this.f34215d;
            if (i11 >= i10 || this.f34214c == length) {
                break;
            } else {
                m37502l();
            }
        }
        if (i11 <= i10) {
            this.f34216e = false;
            return;
        }
        this.f34214c--;
        this.f34215d = i10;
        this.f34216e = true;
    }

    /* JADX INFO: renamed from: C */
    public final void m37490C(int i10) {
        int i11 = this.f34217f;
        if (i10 >= i11) {
            this.f34214c = i11;
            this.f34215d = this.f34218g;
        }
        int length = this.f34212a.m41528a().length();
        while (true) {
            int i12 = this.f34214c;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                m37502l();
            }
        }
        this.f34216e = false;
    }

    @Override // tn.InterfaceC11714h
    /* JADX INFO: renamed from: a */
    public boolean mo37491a() {
        return this.f34220i;
    }

    @Override // tn.InterfaceC11714h
    /* JADX INFO: renamed from: b */
    public C10934i mo37492b() {
        return this.f34212a;
    }

    @Override // tn.InterfaceC11714h
    /* JADX INFO: renamed from: c */
    public int mo37493c() {
        return this.f34215d;
    }

    @Override // tn.InterfaceC11714h
    /* JADX INFO: renamed from: d */
    public int mo37494d() {
        return this.f34219h;
    }

    @Override // tn.InterfaceC11714h
    /* JADX INFO: renamed from: e */
    public int mo37495e() {
        return this.f34217f;
    }

    @Override // tn.InterfaceC11714h
    /* JADX INFO: renamed from: f */
    public InterfaceC11710d mo37496f() {
        List<b> list = this.f34231t;
        return list.get(list.size() - 1).f34234a;
    }

    /* JADX INFO: renamed from: g */
    public final void m37497g(b bVar) {
        this.f34231t.add(bVar);
    }

    @Override // tn.InterfaceC11714h
    public int getIndex() {
        return this.f34214c;
    }

    /* JADX INFO: renamed from: h */
    public final void m37498h(b bVar) {
        while (!mo37496f().mo37460e(bVar.f34234a.mo37455d())) {
            m37503n(1);
        }
        mo37496f().mo37455d().mo40695c(bVar.f34234a.mo37455d());
        m37497g(bVar);
    }

    /* JADX INFO: renamed from: i */
    public final void m37499i(InterfaceC11710d interfaceC11710d) {
        Iterator<C10609e<?>> it = interfaceC11710d.mo37607j().iterator();
        while (it.hasNext()) {
            this.f34230s.m37472a(it.next());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m37500j() {
        CharSequence charSequenceM41528a;
        if (this.f34216e) {
            CharSequence charSequenceSubSequence = this.f34212a.m41528a().subSequence(this.f34214c + 1, this.f34212a.m41528a().length());
            int iM39574a = C10300f.m39574a(this.f34215d);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence.length() + iM39574a);
            for (int i10 = 0; i10 < iM39574a; i10++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence);
            charSequenceM41528a = sb2.toString();
        } else {
            charSequenceM41528a = this.f34214c == 0 ? this.f34212a.m41528a() : this.f34212a.m41528a().subSequence(this.f34214c, this.f34212a.m41528a().length());
        }
        mo37496f().mo37522g(C10934i.m41527c(charSequenceM41528a, (this.f34227p != EnumC10926a.BLOCKS_AND_INLINES || this.f34214c >= this.f34212a.m41529b().m40718c()) ? null : this.f34212a.m41529b().m40720f(this.f34214c)));
        m37501k();
    }

    /* JADX INFO: renamed from: k */
    public final void m37501k() {
        if (this.f34227p != EnumC10926a.NONE) {
            for (int i10 = 1; i10 < this.f34231t.size(); i10++) {
                b bVar = this.f34231t.get(i10);
                int iMin = Math.min(bVar.f34235b, this.f34214c);
                if (this.f34212a.m41528a().length() - iMin != 0) {
                    bVar.f34234a.mo37606i(this.f34212a.m41529b().m40720f(iMin));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m37502l() {
        char cCharAt = this.f34212a.m41528a().charAt(this.f34214c);
        this.f34214c++;
        if (cCharAt != '\t') {
            this.f34215d++;
        } else {
            int i10 = this.f34215d;
            this.f34215d = i10 + C10300f.m39574a(i10);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m37503n(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            InterfaceC11710d interfaceC11710d = m37504o().f34234a;
            m37505p(interfaceC11710d);
            this.f34232u.add(interfaceC11710d);
        }
    }

    /* JADX INFO: renamed from: o */
    public final b m37504o() {
        List<b> list = this.f34231t;
        return list.remove(list.size() - 1);
    }

    /* JADX INFO: renamed from: p */
    public final void m37505p(InterfaceC11710d interfaceC11710d) {
        m37499i(interfaceC11710d);
        interfaceC11710d.mo37523h();
    }

    /* JADX INFO: renamed from: q */
    public final C10610f m37506q() {
        m37503n(this.f34231t.size());
        m37512y();
        return this.f34229r.mo37455d();
    }

    /* JADX INFO: renamed from: r */
    public final C9502d m37507r(InterfaceC11710d interfaceC11710d) {
        if (this.f34231t.size() > this.f34228q) {
            return null;
        }
        a aVar = new a(interfaceC11710d);
        Iterator<InterfaceC11711e> it = this.f34221j.iterator();
        while (it.hasNext()) {
            AbstractC11712f abstractC11712fMo37456a = it.next().mo37456a(this, aVar);
            if (abstractC11712fMo37456a instanceof C9502d) {
                return (C9502d) abstractC11712fMo37456a;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public final void m37508s() {
        int i10 = this.f34214c;
        int i11 = this.f34215d;
        this.f34220i = true;
        int length = this.f34212a.m41528a().length();
        while (i10 < length) {
            char cCharAt = this.f34212a.m41528a().charAt(i10);
            if (cCharAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (cCharAt != ' ') {
                this.f34220i = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f34217f = i10;
        this.f34218g = i11;
        this.f34219h = i11 - this.f34215d;
    }

    /* JADX INFO: renamed from: u */
    public C10610f m37509u(String str) {
        int i10 = 0;
        while (true) {
            int iM45378b = C12236d.m45378b(str, i10);
            if (iM45378b == -1) {
                break;
            }
            m37510v(str.substring(i10, iM45378b), i10);
            i10 = iM45378b + 1;
            if (i10 < str.length() && str.charAt(iM45378b) == '\r' && str.charAt(i10) == '\n') {
                i10 = iM45378b + 2;
            }
        }
        if (!str.isEmpty() && (i10 == 0 || i10 < str.length())) {
            m37510v(str.substring(i10), i10);
        }
        return m37506q();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX INFO: renamed from: v */
    public final void m37510v(String str, int i10) {
        List<C10629y> listM37511w;
        m37488A(str, i10);
        int i11 = 1;
        for (int i12 = 1; i12 < this.f34231t.size(); i12++) {
            b bVar = this.f34231t.get(i12);
            InterfaceC11710d interfaceC11710d = bVar.f34234a;
            m37508s();
            C11709c c11709cMo37454b = interfaceC11710d.mo37454b(this);
            if (!(c11709cMo37454b instanceof C9499b)) {
                break;
            }
            C9499b c9499b = (C9499b) c11709cMo37454b;
            bVar.f34235b = getIndex();
            if (c9499b.m37451g()) {
                m37501k();
                m37503n(this.f34231t.size() - i12);
                return;
            }
            if (c9499b.m37450f() != -1) {
                m37490C(c9499b.m37450f());
            } else if (c9499b.m37449e() != -1) {
                m37489B(c9499b.m37449e());
            }
            i11++;
        }
        int size = this.f34231t.size() - i11;
        interfaceC11710d = this.f34231t.get(i11 - 1).f34234a;
        int i13 = this.f34214c;
        boolean zMo37459a = (interfaceC11710d.mo37455d() instanceof C10627w) || interfaceC11710d.mo37459a();
        boolean z10 = false;
        while (zMo37459a) {
            i13 = this.f34214c;
            m37508s();
            if (mo37491a() || (this.f34219h < C10300f.f37013a && C12236d.m45381e(this.f34212a.m41528a(), this.f34217f))) {
                m37490C(this.f34217f);
                break;
            }
            C9502d c9502dM37507r = m37507r(interfaceC11710d);
            if (c9502dM37507r == null) {
                m37490C(this.f34217f);
                break;
            }
            int index = getIndex();
            if (size > 0) {
                m37503n(size);
                size = 0;
            }
            if (c9502dM37507r.m37467h() != -1) {
                m37490C(c9502dM37507r.m37467h());
            } else if (c9502dM37507r.m37466g() != -1) {
                m37489B(c9502dM37507r.m37466g());
            }
            if (c9502dM37507r.m37468i() >= 1 || c9502dM37507r.m37469j()) {
                InterfaceC11710d interfaceC11710dMo37496f = mo37496f();
                if (interfaceC11710dMo37496f instanceof C9524z) {
                    listM37511w = m37513z(c9502dM37507r.m37469j() ? Integer.MAX_VALUE : c9502dM37507r.m37468i(), (C9524z) interfaceC11710dMo37496f);
                } else if (c9502dM37507r.m37469j()) {
                    listM37511w = m37511w(interfaceC11710dMo37496f);
                } else {
                    listM37511w = null;
                }
            } else {
                listM37511w = null;
            }
            for (InterfaceC11710d interfaceC11710d2 : c9502dM37507r.m37465f()) {
                m37498h(new b(interfaceC11710d2, index));
                if (listM37511w != null) {
                    interfaceC11710d2.mo37455d().m40705l(listM37511w);
                }
                zMo37459a = interfaceC11710d2.mo37459a();
            }
            z10 = true;
        }
        if (!z10 && !mo37491a() && mo37496f().mo37605c()) {
            List<b> list = this.f34231t;
            list.get(list.size() - 1).f34235b = i13;
            m37500j();
            return;
        }
        if (size > 0) {
            m37503n(size);
        }
        if (!interfaceC11710d2.mo37459a()) {
            m37500j();
        } else if (mo37491a()) {
            m37501k();
        } else {
            m37498h(new b(new C9524z(), i13));
            m37500j();
        }
    }

    /* JADX INFO: renamed from: w */
    public final List<C10629y> m37511w(InterfaceC11710d interfaceC11710d) {
        m37504o();
        interfaceC11710d.mo37523h();
        interfaceC11710d.mo37455d().m40706n();
        return interfaceC11710d.mo37455d().m40702h();
    }

    /* JADX INFO: renamed from: y */
    public final void m37512y() {
        InterfaceC10927b interfaceC10927bMo41510a = this.f34222k.mo41510a(new C9515q(this.f34223l, this.f34224m, this.f34225n, this.f34226o, this.f34230s));
        Iterator<InterfaceC11710d> it = this.f34232u.iterator();
        while (it.hasNext()) {
            it.next().mo37530f(interfaceC10927bMo41510a);
        }
    }

    /* JADX INFO: renamed from: z */
    public final List<C10629y> m37513z(int i10, C9524z c9524z) {
        List<C10629y> listM37609l = c9524z.m37609l(i10);
        m37503n(1);
        return listM37609l;
    }
}
