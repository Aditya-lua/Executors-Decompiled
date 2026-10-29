package p296n0;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: n0.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8785l1 {

    /* JADX INFO: renamed from: i */
    public static final InterfaceC8795n1.a<Integer> f31943i = InterfaceC8795n1.a.m35291a("camerax.core.captureConfig.rotation", Integer.TYPE);

    /* JADX INFO: renamed from: j */
    public static final InterfaceC8795n1.a<Integer> f31944j = InterfaceC8795n1.a.m35291a("camerax.core.captureConfig.jpegQuality", Integer.class);

    /* JADX INFO: renamed from: k */
    public static final InterfaceC8795n1.a<Range<Integer>> f31945k = InterfaceC8795n1.a.m35291a("camerax.core.captureConfig.resolvedFrameRate", Range.class);

    /* JADX INFO: renamed from: a */
    public final List<AbstractC8830u1> f31946a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8795n1 f31947b;

    /* JADX INFO: renamed from: c */
    public final int f31948c;

    /* JADX INFO: renamed from: d */
    public final boolean f31949d;

    /* JADX INFO: renamed from: e */
    public final List<AbstractC8828u> f31950e;

    /* JADX INFO: renamed from: f */
    public final boolean f31951f;

    /* JADX INFO: renamed from: g */
    public final C8857z3 f31952g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8743e0 f31953h;

    /* JADX INFO: renamed from: n0.l1$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo35276a(InterfaceC8771i4<?> interfaceC8771i4, a aVar);
    }

    public C8785l1(List<AbstractC8830u1> list, InterfaceC8795n1 interfaceC8795n1, int i10, boolean z10, List<AbstractC8828u> list2, boolean z11, C8857z3 c8857z3, InterfaceC8743e0 interfaceC8743e0) {
        this.f31946a = list;
        this.f31947b = interfaceC8795n1;
        this.f31948c = i10;
        this.f31950e = Collections.unmodifiableList(list2);
        this.f31951f = z11;
        this.f31952g = c8857z3;
        this.f31953h = interfaceC8743e0;
        this.f31949d = z10;
    }

    /* JADX INFO: renamed from: b */
    public static C8785l1 m35239b() {
        return new a().m35261h();
    }

    /* JADX INFO: renamed from: c */
    public List<AbstractC8828u> m35240c() {
        return this.f31950e;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC8743e0 m35241d() {
        return this.f31953h;
    }

    /* JADX INFO: renamed from: e */
    public Range<Integer> m35242e() {
        Range<Integer> range = (Range) this.f31947b.mo35030h(f31945k, AbstractC8827t3.f32104a);
        Objects.requireNonNull(range);
        return range;
    }

    /* JADX INFO: renamed from: f */
    public int m35243f() {
        Object objM35564d = this.f31952g.m35564d("CAPTURE_CONFIG_ID_KEY");
        if (objM35564d == null) {
            return -1;
        }
        return ((Integer) objM35564d).intValue();
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC8795n1 m35244g() {
        return this.f31947b;
    }

    /* JADX INFO: renamed from: h */
    public int m35245h() {
        Integer num = (Integer) this.f31947b.mo35030h(InterfaceC8771i4.f31903H, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: i */
    public List<AbstractC8830u1> m35246i() {
        return Collections.unmodifiableList(this.f31946a);
    }

    /* JADX INFO: renamed from: j */
    public C8857z3 m35247j() {
        return this.f31952g;
    }

    /* JADX INFO: renamed from: k */
    public int m35248k() {
        return this.f31948c;
    }

    /* JADX INFO: renamed from: l */
    public int m35249l() {
        Integer num = (Integer) this.f31947b.mo35030h(InterfaceC8771i4.f31904I, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    /* JADX INFO: renamed from: m */
    public boolean m35250m() {
        return this.f31949d;
    }

    /* JADX INFO: renamed from: n */
    public boolean m35251n() {
        return this.f31951f;
    }

    /* JADX INFO: renamed from: n0.l1$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Set<AbstractC8830u1> f31954a;

        /* JADX INFO: renamed from: b */
        public InterfaceC8841w2 f31955b;

        /* JADX INFO: renamed from: c */
        public int f31956c;

        /* JADX INFO: renamed from: d */
        public boolean f31957d;

        /* JADX INFO: renamed from: e */
        public List<AbstractC8828u> f31958e;

        /* JADX INFO: renamed from: f */
        public boolean f31959f;

        /* JADX INFO: renamed from: g */
        public C8856z2 f31960g;

        /* JADX INFO: renamed from: h */
        public InterfaceC8743e0 f31961h;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this.f31954a = new HashSet();
            this.f31955b = C8846x2.m35505k0();
            this.f31956c = -1;
            this.f31957d = false;
            this.f31958e = new ArrayList();
            this.f31959f = false;
            this.f31960g = C8856z2.m35557g();
        }

        /* JADX INFO: renamed from: j */
        public static a m35252j(InterfaceC8771i4<?> interfaceC8771i4) {
            b bVarM35203K = interfaceC8771i4.m35203K(null);
            if (bVarM35203K != null) {
                a aVar = new a();
                bVarM35203K.mo35276a(interfaceC8771i4, aVar);
                return aVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + interfaceC8771i4.m42045u(interfaceC8771i4.toString()));
        }

        /* JADX INFO: renamed from: k */
        public static a m35253k(C8785l1 c8785l1) {
            return new a(c8785l1);
        }

        /* JADX INFO: renamed from: a */
        public void m35254a(Collection<AbstractC8828u> collection) {
            Iterator<AbstractC8828u> it = collection.iterator();
            while (it.hasNext()) {
                m35256c(it.next());
            }
        }

        /* JADX INFO: renamed from: b */
        public void m35255b(C8857z3 c8857z3) {
            this.f31960g.m35559f(c8857z3);
        }

        /* JADX INFO: renamed from: c */
        public void m35256c(AbstractC8828u abstractC8828u) {
            if (this.f31958e.contains(abstractC8828u)) {
                return;
            }
            this.f31958e.add(abstractC8828u);
        }

        /* JADX INFO: renamed from: d */
        public <T> void m35257d(InterfaceC8795n1.a<T> aVar, T t8) {
            this.f31955b.mo35473G(aVar, t8);
        }

        /* JADX INFO: renamed from: e */
        public void m35258e(InterfaceC8795n1 interfaceC8795n1) {
            for (InterfaceC8795n1.a<?> aVar : interfaceC8795n1.mo35024b()) {
                Object objMo35030h = this.f31955b.mo35030h(aVar, null);
                Object objMo35027e = interfaceC8795n1.mo35027e(aVar);
                if (objMo35030h instanceof AbstractC8836v2) {
                    ((AbstractC8836v2) objMo35030h).m35463a(((AbstractC8836v2) objMo35027e).m35465c());
                } else {
                    if (objMo35027e instanceof AbstractC8836v2) {
                        objMo35027e = ((AbstractC8836v2) objMo35027e).clone();
                    }
                    this.f31955b.mo35472D(aVar, interfaceC8795n1.mo35029g(aVar), objMo35027e);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m35259f(AbstractC8830u1 abstractC8830u1) {
            this.f31954a.add(abstractC8830u1);
        }

        /* JADX INFO: renamed from: g */
        public void m35260g(String str, Object obj) {
            this.f31960g.m35560i(str, obj);
        }

        /* JADX INFO: renamed from: h */
        public C8785l1 m35261h() {
            return new C8785l1(new ArrayList(this.f31954a), C8734c3.m35022j0(this.f31955b), this.f31956c, this.f31957d, new ArrayList(this.f31958e), this.f31959f, C8857z3.m35563c(this.f31960g), this.f31961h);
        }

        /* JADX INFO: renamed from: i */
        public void m35262i() {
            this.f31954a.clear();
        }

        /* JADX INFO: renamed from: l */
        public Range<Integer> m35263l() {
            return (Range) this.f31955b.mo35030h(C8785l1.f31945k, AbstractC8827t3.f32104a);
        }

        /* JADX INFO: renamed from: m */
        public Set<AbstractC8830u1> m35264m() {
            return this.f31954a;
        }

        /* JADX INFO: renamed from: n */
        public int m35265n() {
            return this.f31956c;
        }

        /* JADX INFO: renamed from: o */
        public boolean m35266o(AbstractC8828u abstractC8828u) {
            return this.f31958e.remove(abstractC8828u);
        }

        /* JADX INFO: renamed from: p */
        public void m35267p(InterfaceC8743e0 interfaceC8743e0) {
            this.f31961h = interfaceC8743e0;
        }

        /* JADX INFO: renamed from: q */
        public void m35268q(Range<Integer> range) {
            m35257d(C8785l1.f31945k, range);
        }

        /* JADX INFO: renamed from: r */
        public void m35269r(int i10) {
            this.f31960g.m35560i("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i10));
        }

        /* JADX INFO: renamed from: s */
        public void m35270s(InterfaceC8795n1 interfaceC8795n1) {
            this.f31955b = C8846x2.m35506l0(interfaceC8795n1);
        }

        /* JADX INFO: renamed from: t */
        public void m35271t(boolean z10) {
            this.f31957d = z10;
        }

        /* JADX INFO: renamed from: u */
        public void m35272u(int i10) {
            if (i10 != 0) {
                m35257d(InterfaceC8771i4.f31903H, Integer.valueOf(i10));
            }
        }

        /* JADX INFO: renamed from: v */
        public void m35273v(int i10) {
            this.f31956c = i10;
        }

        /* JADX INFO: renamed from: w */
        public void m35274w(boolean z10) {
            this.f31959f = z10;
        }

        /* JADX INFO: renamed from: x */
        public void m35275x(int i10) {
            if (i10 != 0) {
                m35257d(InterfaceC8771i4.f31904I, Integer.valueOf(i10));
            }
        }

        public a(C8785l1 c8785l1) {
            HashSet hashSet = new HashSet();
            this.f31954a = hashSet;
            this.f31955b = C8846x2.m35505k0();
            this.f31956c = -1;
            this.f31957d = false;
            this.f31958e = new ArrayList();
            this.f31959f = false;
            this.f31960g = C8856z2.m35557g();
            hashSet.addAll(c8785l1.f31946a);
            this.f31955b = C8846x2.m35506l0(c8785l1.f31947b);
            this.f31956c = c8785l1.f31948c;
            this.f31958e.addAll(c8785l1.m35240c());
            this.f31959f = c8785l1.m35251n();
            this.f31960g = C8856z2.m35558h(c8785l1.m35247j());
            this.f31957d = c8785l1.f31949d;
        }
    }
}
