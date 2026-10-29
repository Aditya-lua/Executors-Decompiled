package p322o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p504w1.C12277a;
import p504w1.C12283g;
import p533x2.InterfaceC12631a;
import p565y3.AbstractC13022b;
import p565y3.C13024d;
import p565y3.C13025e;
import p565y3.C13026f;

/* JADX INFO: renamed from: o5.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9683q implements Cloneable {

    /* JADX INFO: renamed from: M */
    public static final Animator[] f35141M = new Animator[0];

    /* JADX INFO: renamed from: N */
    public static final int[] f35142N = {2, 1, 3, 4};

    /* JADX INFO: renamed from: O */
    public static final AbstractC9671k f35143O = new a();

    /* JADX INFO: renamed from: P */
    public static ThreadLocal<C12277a<Animator, d>> f35144P = new ThreadLocal<>();

    /* JADX INFO: renamed from: F */
    public AbstractC9692z f35150F;

    /* JADX INFO: renamed from: G */
    public e f35151G;

    /* JADX INFO: renamed from: H */
    public C12277a<String, String> f35152H;

    /* JADX INFO: renamed from: J */
    public long f35154J;

    /* JADX INFO: renamed from: K */
    public g f35155K;

    /* JADX INFO: renamed from: L */
    public long f35156L;

    /* JADX INFO: renamed from: t */
    public ArrayList<C9658d0> f35176t;

    /* JADX INFO: renamed from: u */
    public ArrayList<C9658d0> f35177u;

    /* JADX INFO: renamed from: v */
    public h[] f35178v;

    /* JADX INFO: renamed from: a */
    public String f35157a = getClass().getName();

    /* JADX INFO: renamed from: b */
    public long f35158b = -1;

    /* JADX INFO: renamed from: c */
    public long f35159c = -1;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f35160d = null;

    /* JADX INFO: renamed from: e */
    public ArrayList<Integer> f35161e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public ArrayList<View> f35162f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public ArrayList<String> f35163g = null;

    /* JADX INFO: renamed from: h */
    public ArrayList<Class<?>> f35164h = null;

    /* JADX INFO: renamed from: i */
    public ArrayList<Integer> f35165i = null;

    /* JADX INFO: renamed from: j */
    public ArrayList<View> f35166j = null;

    /* JADX INFO: renamed from: k */
    public ArrayList<Class<?>> f35167k = null;

    /* JADX INFO: renamed from: l */
    public ArrayList<String> f35168l = null;

    /* JADX INFO: renamed from: m */
    public ArrayList<Integer> f35169m = null;

    /* JADX INFO: renamed from: n */
    public ArrayList<View> f35170n = null;

    /* JADX INFO: renamed from: o */
    public ArrayList<Class<?>> f35171o = null;

    /* JADX INFO: renamed from: p */
    public C9660e0 f35172p = new C9660e0();

    /* JADX INFO: renamed from: q */
    public C9660e0 f35173q = new C9660e0();

    /* JADX INFO: renamed from: r */
    public C9654b0 f35174r = null;

    /* JADX INFO: renamed from: s */
    public int[] f35175s = f35142N;

    /* JADX INFO: renamed from: w */
    public boolean f35179w = false;

    /* JADX INFO: renamed from: x */
    public ArrayList<Animator> f35180x = new ArrayList<>();

    /* JADX INFO: renamed from: y */
    public Animator[] f35181y = f35141M;

    /* JADX INFO: renamed from: z */
    public int f35182z = 0;

    /* JADX INFO: renamed from: A */
    public boolean f35145A = false;

    /* JADX INFO: renamed from: B */
    public boolean f35146B = false;

    /* JADX INFO: renamed from: C */
    public AbstractC9683q f35147C = null;

    /* JADX INFO: renamed from: D */
    public ArrayList<h> f35148D = null;

    /* JADX INFO: renamed from: E */
    public ArrayList<Animator> f35149E = new ArrayList<>();

    /* JADX INFO: renamed from: I */
    public AbstractC9671k f35153I = f35143O;

    /* JADX INFO: renamed from: o5.q$a */
    public class a extends AbstractC9671k {
        @Override // p322o5.AbstractC9671k
        @NonNull
        /* JADX INFO: renamed from: a */
        public Path mo38213a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* JADX INFO: renamed from: o5.q$b */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12277a f35183a;

        public b(C12277a c12277a) {
            this.f35183a = c12277a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35183a.remove(animator);
            AbstractC9683q.this.f35180x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC9683q.this.f35180x.add(animator);
        }
    }

    /* JADX INFO: renamed from: o5.q$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC9683q.this.m38285w();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: o5.q$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public View f35186a;

        /* JADX INFO: renamed from: b */
        public String f35187b;

        /* JADX INFO: renamed from: c */
        public C9658d0 f35188c;

        /* JADX INFO: renamed from: d */
        public WindowId f35189d;

        /* JADX INFO: renamed from: e */
        public AbstractC9683q f35190e;

        /* JADX INFO: renamed from: f */
        public Animator f35191f;

        public d(View view, String str, AbstractC9683q abstractC9683q, WindowId windowId, C9658d0 c9658d0, Animator animator) {
            this.f35186a = view;
            this.f35187b = str;
            this.f35188c = c9658d0;
            this.f35189d = windowId;
            this.f35190e = abstractC9683q;
            this.f35191f = animator;
        }
    }

    /* JADX INFO: renamed from: o5.q$e */
    public static abstract class e {
        /* JADX INFO: renamed from: a */
        public abstract Rect mo38177a(@NonNull AbstractC9683q abstractC9683q);
    }

    /* JADX INFO: renamed from: o5.q$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public static long m38288a(Animator animator) {
            return animator.getTotalDuration();
        }

        /* JADX INFO: renamed from: b */
        public static void m38289b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }
    }

    /* JADX INFO: renamed from: o5.q$g */
    public class g extends C9690x implements InterfaceC9652a0, AbstractC13022b.r {

        /* JADX INFO: renamed from: d */
        public boolean f35195d;

        /* JADX INFO: renamed from: e */
        public boolean f35196e;

        /* JADX INFO: renamed from: f */
        public C13025e f35197f;

        /* JADX INFO: renamed from: i */
        public Runnable f35200i;

        /* JADX INFO: renamed from: a */
        public long f35192a = -1;

        /* JADX INFO: renamed from: b */
        public ArrayList<InterfaceC12631a<InterfaceC9652a0>> f35193b = null;

        /* JADX INFO: renamed from: c */
        public ArrayList<InterfaceC12631a<InterfaceC9652a0>> f35194c = null;

        /* JADX INFO: renamed from: g */
        public InterfaceC12631a<InterfaceC9652a0>[] f35198g = null;

        /* JADX INFO: renamed from: h */
        public final C9664g0 f35199h = new C9664g0();

        public g() {
        }

        /* JADX INFO: renamed from: m */
        public static /* synthetic */ void m38290m(g gVar, AbstractC13022b abstractC13022b, boolean z10, float f10, float f11) {
            if (z10) {
                gVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                AbstractC9683q.this.m38278i0(i.f35203b, false);
                return;
            }
            long jMo38086f = gVar.mo38086f();
            AbstractC9683q abstractC9683qM38118F0 = ((C9654b0) AbstractC9683q.this).m38118F0(0);
            AbstractC9683q abstractC9683q = abstractC9683qM38118F0.f35147C;
            abstractC9683qM38118F0.f35147C = null;
            AbstractC9683q.this.mo38140s0(-1L, gVar.f35192a);
            AbstractC9683q.this.mo38140s0(jMo38086f, -1L);
            gVar.f35192a = jMo38086f;
            Runnable runnable = gVar.f35200i;
            if (runnable != null) {
                runnable.run();
            }
            AbstractC9683q.this.f35149E.clear();
            if (abstractC9683q != null) {
                abstractC9683q.m38278i0(i.f35203b, true);
            }
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
            this.f35196e = true;
        }

        @Override // p322o5.InterfaceC9652a0
        /* JADX INFO: renamed from: c */
        public void mo38085c() {
            m38293o();
            this.f35197f.m48520s(mo38086f() + 1);
        }

        @Override // p565y3.AbstractC13022b.r
        /* JADX INFO: renamed from: e */
        public void mo38291e(AbstractC13022b abstractC13022b, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(mo38086f() + 1, Math.round(f10)));
            AbstractC9683q.this.mo38140s0(jMax, this.f35192a);
            this.f35192a = jMax;
            m38292n();
        }

        @Override // p322o5.InterfaceC9652a0
        /* JADX INFO: renamed from: f */
        public long mo38086f() {
            return AbstractC9683q.this.m38267U();
        }

        @Override // p322o5.InterfaceC9652a0
        /* JADX INFO: renamed from: h */
        public void mo38087h(long j10) {
            if (this.f35197f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f35192a || !isReady()) {
                return;
            }
            if (!this.f35196e) {
                if (j10 != 0 || this.f35192a <= 0) {
                    long jMo38086f = mo38086f();
                    if (j10 == jMo38086f && this.f35192a < jMo38086f) {
                        j10 = 1 + jMo38086f;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f35192a;
                if (j10 != j11) {
                    AbstractC9683q.this.mo38140s0(j10, j11);
                    this.f35192a = j10;
                }
            }
            m38292n();
            this.f35199h.m38178a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // p322o5.InterfaceC9652a0
        public boolean isReady() {
            return this.f35195d;
        }

        @Override // p322o5.InterfaceC9652a0
        /* JADX INFO: renamed from: j */
        public void mo38088j(@NonNull Runnable runnable) {
            this.f35200i = runnable;
            m38293o();
            this.f35197f.m48520s(0.0f);
        }

        /* JADX INFO: renamed from: n */
        public final void m38292n() {
            ArrayList<InterfaceC12631a<InterfaceC9652a0>> arrayList = this.f35194c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f35194c.size();
            if (this.f35198g == null) {
                this.f35198g = new InterfaceC12631a[size];
            }
            InterfaceC12631a<InterfaceC9652a0>[] interfaceC12631aArr = (InterfaceC12631a[]) this.f35194c.toArray(this.f35198g);
            this.f35198g = null;
            for (int i10 = 0; i10 < size; i10++) {
                interfaceC12631aArr[i10].accept(this);
                interfaceC12631aArr[i10] = null;
            }
            this.f35198g = interfaceC12631aArr;
        }

        /* JADX INFO: renamed from: o */
        public final void m38293o() {
            if (this.f35197f != null) {
                return;
            }
            this.f35199h.m38178a(AnimationUtils.currentAnimationTimeMillis(), this.f35192a);
            this.f35197f = new C13025e(new C13024d());
            C13026f c13026f = new C13026f();
            c13026f.m48529d(1.0f);
            c13026f.m48531f(200.0f);
            this.f35197f.m48524w(c13026f);
            this.f35197f.m48484m(this.f35192a);
            this.f35197f.m48475c(this);
            this.f35197f.m48485n(this.f35199h.m38179b());
            this.f35197f.m48480i(mo38086f() + 1);
            this.f35197f.m48481j(-1.0f);
            this.f35197f.m48482k(4.0f);
            this.f35197f.m48474b(new AbstractC13022b.q() { // from class: o5.r
                @Override // p565y3.AbstractC13022b.q
                /* JADX INFO: renamed from: a */
                public final void mo38300a(AbstractC13022b abstractC13022b, boolean z10, float f10, float f11) {
                    AbstractC9683q.g.m38290m(this.f35207a, abstractC13022b, z10, f10, f11);
                }
            });
        }

        /* JADX INFO: renamed from: p */
        public void m38294p() {
            long j10 = mo38086f() == 0 ? 1L : 0L;
            AbstractC9683q.this.mo38140s0(j10, this.f35192a);
            this.f35192a = j10;
        }

        /* JADX INFO: renamed from: q */
        public void m38295q() {
            this.f35195d = true;
            ArrayList<InterfaceC12631a<InterfaceC9652a0>> arrayList = this.f35193b;
            if (arrayList != null) {
                this.f35193b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(this);
                }
            }
            m38292n();
        }
    }

    /* JADX INFO: renamed from: o5.q$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo38105a(@NonNull AbstractC9683q abstractC9683q);

        /* JADX INFO: renamed from: b */
        void mo38106b(@NonNull AbstractC9683q abstractC9683q);

        /* JADX INFO: renamed from: d */
        void mo38107d(@NonNull AbstractC9683q abstractC9683q);

        /* JADX INFO: renamed from: g */
        void mo38108g(@NonNull AbstractC9683q abstractC9683q);

        /* JADX INFO: renamed from: i */
        default void mo38170i(@NonNull AbstractC9683q abstractC9683q, boolean z10) {
            mo38108g(abstractC9683q);
        }

        /* JADX INFO: renamed from: k */
        void mo38109k(@NonNull AbstractC9683q abstractC9683q);

        /* JADX INFO: renamed from: l */
        default void mo38173l(@NonNull AbstractC9683q abstractC9683q, boolean z10) {
            mo38109k(abstractC9683q);
        }
    }

    /* JADX INFO: renamed from: o5.q$i */
    public interface i {

        /* JADX INFO: renamed from: a */
        public static final i f35202a = new i() { // from class: o5.s
            @Override // p322o5.AbstractC9683q.i
            /* JADX INFO: renamed from: a */
            public final void mo38299a(AbstractC9683q.h hVar, AbstractC9683q abstractC9683q, boolean z10) {
                hVar.mo38170i(abstractC9683q, z10);
            }
        };

        /* JADX INFO: renamed from: b */
        public static final i f35203b = new i() { // from class: o5.t
            @Override // p322o5.AbstractC9683q.i
            /* JADX INFO: renamed from: a */
            public final void mo38299a(AbstractC9683q.h hVar, AbstractC9683q abstractC9683q, boolean z10) {
                hVar.mo38173l(abstractC9683q, z10);
            }
        };

        /* JADX INFO: renamed from: c */
        public static final i f35204c = new i() { // from class: o5.u
            @Override // p322o5.AbstractC9683q.i
            /* JADX INFO: renamed from: a */
            public final void mo38299a(AbstractC9683q.h hVar, AbstractC9683q abstractC9683q, boolean z10) {
                hVar.mo38105a(abstractC9683q);
            }
        };

        /* JADX INFO: renamed from: d */
        public static final i f35205d = new i() { // from class: o5.v
            @Override // p322o5.AbstractC9683q.i
            /* JADX INFO: renamed from: a */
            public final void mo38299a(AbstractC9683q.h hVar, AbstractC9683q abstractC9683q, boolean z10) {
                hVar.mo38107d(abstractC9683q);
            }
        };

        /* JADX INFO: renamed from: e */
        public static final i f35206e = new i() { // from class: o5.w
            @Override // p322o5.AbstractC9683q.i
            /* JADX INFO: renamed from: a */
            public final void mo38299a(AbstractC9683q.h hVar, AbstractC9683q abstractC9683q, boolean z10) {
                hVar.mo38106b(abstractC9683q);
            }
        };

        /* JADX INFO: renamed from: a */
        void mo38299a(@NonNull h hVar, @NonNull AbstractC9683q abstractC9683q, boolean z10);
    }

    /* JADX INFO: renamed from: O */
    public static C12277a<Animator, d> m38249O() {
        C12277a<Animator, d> c12277a = f35144P.get();
        if (c12277a != null) {
            return c12277a;
        }
        C12277a<Animator, d> c12277a2 = new C12277a<>();
        f35144P.set(c12277a2);
        return c12277a2;
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m38252b0(C9658d0 c9658d0, C9658d0 c9658d1, String str) {
        Object obj = c9658d0.f35044a.get(str);
        Object obj2 = c9658d1.f35044a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: h */
    public static void m38253h(C9660e0 c9660e0, View view, C9658d0 c9658d0) {
        c9660e0.f35049a.put(view, c9658d0);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c9660e0.f35050b.indexOfKey(id2) >= 0) {
                c9660e0.f35050b.put(id2, null);
            } else {
                c9660e0.f35050b.put(id2, view);
            }
        }
        String strM2992H = C0625o0.m2992H(view);
        if (strM2992H != null) {
            if (c9660e0.f35052d.containsKey(strM2992H)) {
                c9660e0.f35052d.put(strM2992H, null);
            } else {
                c9660e0.f35052d.put(strM2992H, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c9660e0.f35051c.m45602f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c9660e0.f35051c.m45604i(itemIdAtPosition, view);
                    return;
                }
                View viewM45601e = c9660e0.f35051c.m45601e(itemIdAtPosition);
                if (viewM45601e != null) {
                    viewM45601e.setHasTransientState(false);
                    c9660e0.f35051c.m45604i(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public Rect m38254A() {
        e eVar = this.f35151G;
        if (eVar == null) {
            return null;
        }
        return eVar.mo38177a(this);
    }

    /* JADX INFO: renamed from: A0 */
    public String mo38113A0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f35159c != -1) {
            sb2.append("dur(");
            sb2.append(this.f35159c);
            sb2.append(") ");
        }
        if (this.f35158b != -1) {
            sb2.append("dly(");
            sb2.append(this.f35158b);
            sb2.append(") ");
        }
        if (this.f35160d != null) {
            sb2.append("interp(");
            sb2.append(this.f35160d);
            sb2.append(") ");
        }
        if (this.f35161e.size() > 0 || this.f35162f.size() > 0) {
            sb2.append("tgts(");
            if (this.f35161e.size() > 0) {
                for (int i10 = 0; i10 < this.f35161e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f35161e.get(i10));
                }
            }
            if (this.f35162f.size() > 0) {
                for (int i11 = 0; i11 < this.f35162f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f35162f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: C */
    public e m38255C() {
        return this.f35151G;
    }

    /* JADX INFO: renamed from: D */
    public TimeInterpolator m38256D() {
        return this.f35160d;
    }

    /* JADX INFO: renamed from: E */
    public C9658d0 m38257E(View view, boolean z10) {
        C9654b0 c9654b0 = this.f35174r;
        if (c9654b0 != null) {
            return c9654b0.m38257E(view, z10);
        }
        ArrayList<C9658d0> arrayList = z10 ? this.f35176t : this.f35177u;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            C9658d0 c9658d0 = arrayList.get(i10);
            if (c9658d0 == null) {
                return null;
            }
            if (c9658d0.f35045b == view) {
                break;
            }
            i10++;
        }
        if (i10 >= 0) {
            return (z10 ? this.f35177u : this.f35176t).get(i10);
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: G */
    public String m38258G() {
        return this.f35157a;
    }

    @NonNull
    /* JADX INFO: renamed from: J */
    public AbstractC9671k m38259J() {
        return this.f35153I;
    }

    /* JADX INFO: renamed from: K */
    public AbstractC9692z m38260K() {
        return this.f35150F;
    }

    @NonNull
    /* JADX INFO: renamed from: N */
    public final AbstractC9683q m38261N() {
        C9654b0 c9654b0 = this.f35174r;
        return c9654b0 != null ? c9654b0.m38261N() : this;
    }

    /* JADX INFO: renamed from: P */
    public long m38262P() {
        return this.f35158b;
    }

    @NonNull
    /* JADX INFO: renamed from: Q */
    public List<Integer> m38263Q() {
        return this.f35161e;
    }

    /* JADX INFO: renamed from: R */
    public List<String> m38264R() {
        return this.f35163g;
    }

    /* JADX INFO: renamed from: S */
    public List<Class<?>> m38265S() {
        return this.f35164h;
    }

    @NonNull
    /* JADX INFO: renamed from: T */
    public List<View> m38266T() {
        return this.f35162f;
    }

    /* JADX INFO: renamed from: U */
    public final long m38267U() {
        return this.f35154J;
    }

    /* JADX INFO: renamed from: V */
    public String[] mo38090V() {
        return null;
    }

    /* JADX INFO: renamed from: W */
    public C9658d0 m38268W(@NonNull View view, boolean z10) {
        C9654b0 c9654b0 = this.f35174r;
        if (c9654b0 != null) {
            return c9654b0.m38268W(view, z10);
        }
        return (z10 ? this.f35172p : this.f35173q).f35049a.get(view);
    }

    /* JADX INFO: renamed from: X */
    public boolean mo38128X() {
        return !this.f35180x.isEmpty();
    }

    /* JADX INFO: renamed from: Y */
    public boolean mo38091Y() {
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public boolean mo38235Z(C9658d0 c9658d0, C9658d0 c9658d1) {
        if (c9658d0 != null && c9658d1 != null) {
            String[] strArrMo38090V = mo38090V();
            if (strArrMo38090V != null) {
                for (String str : strArrMo38090V) {
                    if (m38252b0(c9658d0, c9658d1, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = c9658d0.f35044a.keySet().iterator();
                while (it.hasNext()) {
                    if (m38252b0(c9658d0, c9658d1, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m38269a0(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f35165i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f35166j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f35167k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f35167k.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f35168l != null && C0625o0.m2992H(view) != null && this.f35168l.contains(C0625o0.m2992H(view))) {
            return false;
        }
        if ((this.f35161e.size() == 0 && this.f35162f.size() == 0 && (((arrayList = this.f35164h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f35163g) == null || arrayList2.isEmpty()))) || this.f35161e.contains(Integer.valueOf(id2)) || this.f35162f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f35163g;
        if (arrayList6 != null && arrayList6.contains(C0625o0.m2992H(view))) {
            return true;
        }
        if (this.f35164h != null) {
            for (int i11 = 0; i11 < this.f35164h.size(); i11++) {
                if (this.f35164h.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public AbstractC9683q mo38129c(@NonNull h hVar) {
        if (this.f35148D == null) {
            this.f35148D = new ArrayList<>();
        }
        this.f35148D.add(hVar);
        return this;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m38270c0(C12277a<View, C9658d0> c12277a, C12277a<View, C9658d0> c12277a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && m38269a0(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && m38269a0(view)) {
                C9658d0 c9658d0 = c12277a.get(viewValueAt);
                C9658d0 c9658d1 = c12277a2.get(view);
                if (c9658d0 != null && c9658d1 != null) {
                    this.f35176t.add(c9658d0);
                    this.f35177u.add(c9658d1);
                    c12277a.remove(viewValueAt);
                    c12277a2.remove(view);
                }
            }
        }
    }

    public void cancel() {
        int size = this.f35180x.size();
        Animator[] animatorArr = (Animator[]) this.f35180x.toArray(this.f35181y);
        this.f35181y = f35141M;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f35181y = animatorArr;
        m38278i0(i.f35204c, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m38271d0(C12277a<View, C9658d0> c12277a, C12277a<View, C9658d0> c12277a2) {
        C9658d0 c9658d0Remove;
        for (int size = c12277a.getSize() - 1; size >= 0; size--) {
            View viewM45625f = c12277a.m45625f(size);
            if (viewM45625f != null && m38269a0(viewM45625f) && (c9658d0Remove = c12277a2.remove(viewM45625f)) != null && m38269a0(c9658d0Remove.f35045b)) {
                this.f35176t.add(c12277a.m45627i(size));
                this.f35177u.add(c9658d0Remove);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public AbstractC9683q mo38130e(@NonNull View view) {
        this.f35162f.add(view);
        return this;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m38272e0(C12277a<View, C9658d0> c12277a, C12277a<View, C9658d0> c12277a2, C12283g<View> c12283g, C12283g<View> c12283g2) {
        View viewM45601e;
        int iM45607n = c12283g.m45607n();
        for (int i10 = 0; i10 < iM45607n; i10++) {
            View viewM45608o = c12283g.m45608o(i10);
            if (viewM45608o != null && m38269a0(viewM45608o) && (viewM45601e = c12283g2.m45601e(c12283g.m45603h(i10))) != null && m38269a0(viewM45601e)) {
                C9658d0 c9658d0 = c12277a.get(viewM45608o);
                C9658d0 c9658d1 = c12277a2.get(viewM45601e);
                if (c9658d0 != null && c9658d1 != null) {
                    this.f35176t.add(c9658d0);
                    this.f35177u.add(c9658d1);
                    c12277a.remove(viewM45608o);
                    c12277a2.remove(viewM45601e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m38273f(C12277a<View, C9658d0> c12277a, C12277a<View, C9658d0> c12277a2) {
        for (int i10 = 0; i10 < c12277a.getSize(); i10++) {
            C9658d0 c9658d0M45629k = c12277a.m45629k(i10);
            if (m38269a0(c9658d0M45629k.f35045b)) {
                this.f35176t.add(c9658d0M45629k);
                this.f35177u.add(null);
            }
        }
        for (int i11 = 0; i11 < c12277a2.getSize(); i11++) {
            C9658d0 c9658d0M45629k2 = c12277a2.m45629k(i11);
            if (m38269a0(c9658d0M45629k2.f35045b)) {
                this.f35177u.add(c9658d0M45629k2);
                this.f35176t.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m38274f0(C12277a<View, C9658d0> c12277a, C12277a<View, C9658d0> c12277a2, C12277a<String, View> c12277a3, C12277a<String, View> c12277a4) {
        View view;
        int size = c12277a3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            View viewM45629k = c12277a3.m45629k(i10);
            if (viewM45629k != null && m38269a0(viewM45629k) && (view = c12277a4.get(c12277a3.m45625f(i10))) != null && m38269a0(view)) {
                C9658d0 c9658d0 = c12277a.get(viewM45629k);
                C9658d0 c9658d1 = c12277a2.get(view);
                if (c9658d0 != null && c9658d1 != null) {
                    this.f35176t.add(c9658d0);
                    this.f35177u.add(c9658d1);
                    c12277a.remove(viewM45629k);
                    c12277a2.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m38275g0(C9660e0 c9660e0, C9660e0 c9660e1) {
        C12277a<View, C9658d0> c12277a = new C12277a<>(c9660e0.f35049a);
        C12277a<View, C9658d0> c12277a2 = new C12277a<>(c9660e1.f35049a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f35175s;
            if (i10 >= iArr.length) {
                m38273f(c12277a, c12277a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                m38271d0(c12277a, c12277a2);
            } else if (i11 == 2) {
                m38274f0(c12277a, c12277a2, c9660e0.f35052d, c9660e1.f35052d);
            } else if (i11 == 3) {
                m38270c0(c12277a, c12277a2, c9660e0.f35050b, c9660e1.f35050b);
            } else if (i11 == 4) {
                m38272e0(c12277a, c12277a2, c9660e0.f35051c, c9660e1.f35051c);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m38276h0(AbstractC9683q abstractC9683q, i iVar, boolean z10) {
        AbstractC9683q abstractC9683q2 = this.f35147C;
        if (abstractC9683q2 != null) {
            abstractC9683q2.m38276h0(abstractC9683q, iVar, z10);
        }
        ArrayList<h> arrayList = this.f35148D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f35148D.size();
        h[] hVarArr = this.f35178v;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f35178v = null;
        h[] hVarArr2 = (h[]) this.f35148D.toArray(hVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            iVar.mo38299a(hVarArr2[i10], abstractC9683q, z10);
            hVarArr2[i10] = null;
        }
        this.f35178v = hVarArr2;
    }

    /* JADX INFO: renamed from: i */
    public void m38277i(Animator animator) {
        if (animator == null) {
            m38285w();
            return;
        }
        if (m38286z() >= 0) {
            animator.setDuration(m38286z());
        }
        if (m38262P() >= 0) {
            animator.setStartDelay(m38262P() + animator.getStartDelay());
        }
        if (m38256D() != null) {
            animator.setInterpolator(m38256D());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* JADX INFO: renamed from: i0 */
    public void m38278i0(i iVar, boolean z10) {
        m38276h0(this, iVar, z10);
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo38092j(@NonNull C9658d0 c9658d0);

    /* JADX INFO: renamed from: j0 */
    public void mo38131j0(View view) {
        if (this.f35146B) {
            return;
        }
        int size = this.f35180x.size();
        Animator[] animatorArr = (Animator[]) this.f35180x.toArray(this.f35181y);
        this.f35181y = f35141M;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f35181y = animatorArr;
        m38278i0(i.f35205d, false);
        this.f35145A = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m38279k(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f35165i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f35166j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f35167k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f35167k.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C9658d0 c9658d0 = new C9658d0(view);
                    if (z10) {
                        mo38093o(c9658d0);
                    } else {
                        mo38092j(c9658d0);
                    }
                    c9658d0.f35046c.add(this);
                    mo38134n(c9658d0);
                    if (z10) {
                        m38253h(this.f35172p, view, c9658d0);
                    } else {
                        m38253h(this.f35173q, view, c9658d0);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f35169m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f35170n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f35171o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f35171o.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                m38279k(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m38280k0(@NonNull ViewGroup viewGroup) {
        d dVar;
        this.f35176t = new ArrayList<>();
        this.f35177u = new ArrayList<>();
        m38275g0(this.f35172p, this.f35173q);
        C12277a<Animator, d> c12277aM38249O = m38249O();
        int size = c12277aM38249O.getSize();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorM45625f = c12277aM38249O.m45625f(i10);
            if (animatorM45625f != null && (dVar = c12277aM38249O.get(animatorM45625f)) != null && dVar.f35186a != null && windowId.equals(dVar.f35189d)) {
                C9658d0 c9658d0 = dVar.f35188c;
                View view = dVar.f35186a;
                C9658d0 c9658d0M38268W = m38268W(view, true);
                C9658d0 c9658d0M38257E = m38257E(view, true);
                if (c9658d0M38268W == null && c9658d0M38257E == null) {
                    c9658d0M38257E = this.f35173q.f35049a.get(view);
                }
                if ((c9658d0M38268W != null || c9658d0M38257E != null) && dVar.f35190e.mo38235Z(c9658d0, c9658d0M38257E)) {
                    AbstractC9683q abstractC9683q = dVar.f35190e;
                    if (abstractC9683q.m38261N().f35155K != null) {
                        animatorM45625f.cancel();
                        abstractC9683q.f35180x.remove(animatorM45625f);
                        c12277aM38249O.remove(animatorM45625f);
                        if (abstractC9683q.f35180x.size() == 0) {
                            abstractC9683q.m38278i0(i.f35204c, false);
                            if (!abstractC9683q.f35146B) {
                                abstractC9683q.f35146B = true;
                                abstractC9683q.m38278i0(i.f35203b, false);
                            }
                        }
                    } else if (animatorM45625f.isRunning() || animatorM45625f.isStarted()) {
                        animatorM45625f.cancel();
                    } else {
                        c12277aM38249O.remove(animatorM45625f);
                    }
                }
            }
        }
        mo38141t(viewGroup, this.f35172p, this.f35173q, this.f35176t, this.f35177u);
        if (this.f35155K == null) {
            mo38137q0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            mo38132l0();
            this.f35155K.m38294p();
            this.f35155K.m38295q();
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void mo38132l0() {
        C12277a<Animator, d> c12277aM38249O = m38249O();
        this.f35154J = 0L;
        for (int i10 = 0; i10 < this.f35149E.size(); i10++) {
            Animator animator = this.f35149E.get(i10);
            d dVar = c12277aM38249O.get(animator);
            if (animator != null && dVar != null) {
                if (m38286z() >= 0) {
                    dVar.f35191f.setDuration(m38286z());
                }
                if (m38262P() >= 0) {
                    dVar.f35191f.setStartDelay(m38262P() + dVar.f35191f.getStartDelay());
                }
                if (m38256D() != null) {
                    dVar.f35191f.setInterpolator(m38256D());
                }
                this.f35180x.add(animator);
                this.f35154J = Math.max(this.f35154J, f.m38288a(animator));
            }
        }
        this.f35149E.clear();
    }

    @NonNull
    /* JADX INFO: renamed from: m0 */
    public AbstractC9683q mo38133m0(@NonNull h hVar) {
        AbstractC9683q abstractC9683q;
        ArrayList<h> arrayList = this.f35148D;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (abstractC9683q = this.f35147C) != null) {
                abstractC9683q.mo38133m0(hVar);
            }
            if (this.f35148D.size() == 0) {
                this.f35148D = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public void mo38134n(C9658d0 c9658d0) {
        String[] strArrMo38245b;
        if (this.f35150F == null || c9658d0.f35044a.isEmpty() || (strArrMo38245b = this.f35150F.mo38245b()) == null) {
            return;
        }
        for (String str : strArrMo38245b) {
            if (!c9658d0.f35044a.containsKey(str)) {
                this.f35150F.mo38244a(c9658d0);
                return;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: n0 */
    public AbstractC9683q mo38135n0(@NonNull View view) {
        this.f35162f.remove(view);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public abstract void mo38093o(@NonNull C9658d0 c9658d0);

    /* JADX INFO: renamed from: o0 */
    public void mo38136o0(View view) {
        if (this.f35145A) {
            if (!this.f35146B) {
                int size = this.f35180x.size();
                Animator[] animatorArr = (Animator[]) this.f35180x.toArray(this.f35181y);
                this.f35181y = f35141M;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f35181y = animatorArr;
                m38278i0(i.f35206e, false);
            }
            this.f35145A = false;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m38281p(@NonNull ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C12277a<String, String> c12277a;
        m38283q(z10);
        if ((this.f35161e.size() > 0 || this.f35162f.size() > 0) && (((arrayList = this.f35163g) == null || arrayList.isEmpty()) && ((arrayList2 = this.f35164h) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f35161e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.f35161e.get(i10).intValue());
                if (viewFindViewById != null) {
                    C9658d0 c9658d0 = new C9658d0(viewFindViewById);
                    if (z10) {
                        mo38093o(c9658d0);
                    } else {
                        mo38092j(c9658d0);
                    }
                    c9658d0.f35046c.add(this);
                    mo38134n(c9658d0);
                    if (z10) {
                        m38253h(this.f35172p, viewFindViewById, c9658d0);
                    } else {
                        m38253h(this.f35173q, viewFindViewById, c9658d0);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f35162f.size(); i11++) {
                View view = this.f35162f.get(i11);
                C9658d0 c9658d1 = new C9658d0(view);
                if (z10) {
                    mo38093o(c9658d1);
                } else {
                    mo38092j(c9658d1);
                }
                c9658d1.f35046c.add(this);
                mo38134n(c9658d1);
                if (z10) {
                    m38253h(this.f35172p, view, c9658d1);
                } else {
                    m38253h(this.f35173q, view, c9658d1);
                }
            }
        } else {
            m38279k(viewGroup, z10);
        }
        if (z10 || (c12277a = this.f35152H) == null) {
            return;
        }
        int size = c12277a.getSize();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList3.add(this.f35172p.f35052d.remove(this.f35152H.m45625f(i12)));
        }
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = (View) arrayList3.get(i13);
            if (view2 != null) {
                this.f35172p.f35052d.put(this.f35152H.m45629k(i13), view2);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m38282p0(Animator animator, C12277a<Animator, d> c12277a) {
        if (animator != null) {
            animator.addListener(new b(c12277a));
            m38277i(animator);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m38283q(boolean z10) {
        if (z10) {
            this.f35172p.f35049a.clear();
            this.f35172p.f35050b.clear();
            this.f35172p.f35051c.m45598a();
        } else {
            this.f35173q.f35049a.clear();
            this.f35173q.f35050b.clear();
            this.f35173q.f35051c.m45598a();
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void mo38137q0() {
        m38287z0();
        C12277a<Animator, d> c12277aM38249O = m38249O();
        ArrayList<Animator> arrayList = this.f35149E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Animator animator = arrayList.get(i10);
            i10++;
            Animator animator2 = animator;
            if (c12277aM38249O.containsKey(animator2)) {
                m38287z0();
                m38282p0(animator2, c12277aM38249O);
            }
        }
        this.f35149E.clear();
        m38285w();
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC9683q clone() {
        try {
            AbstractC9683q abstractC9683q = (AbstractC9683q) super.clone();
            abstractC9683q.f35149E = new ArrayList<>();
            abstractC9683q.f35172p = new C9660e0();
            abstractC9683q.f35173q = new C9660e0();
            abstractC9683q.f35176t = null;
            abstractC9683q.f35177u = null;
            abstractC9683q.f35155K = null;
            abstractC9683q.f35147C = this;
            abstractC9683q.f35148D = null;
            return abstractC9683q;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void mo38139r0(boolean z10) {
        this.f35179w = z10;
    }

    /* JADX INFO: renamed from: s */
    public Animator mo38094s(@NonNull ViewGroup viewGroup, C9658d0 c9658d0, C9658d0 c9658d1) {
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public void mo38140s0(long j10, long j11) {
        long jM38267U = m38267U();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > jM38267U && j10 <= jM38267U)) {
            this.f35146B = false;
            m38278i0(i.f35202a, z10);
        }
        int size = this.f35180x.size();
        Animator[] animatorArr = (Animator[]) this.f35180x.toArray(this.f35181y);
        this.f35181y = f35141M;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            f.m38289b(animator, Math.min(Math.max(0L, j10), f.m38288a(animator)));
            i10++;
            jM38267U = jM38267U;
        }
        long j12 = jM38267U;
        this.f35181y = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.f35146B = true;
        }
        m38278i0(i.f35203b, z10);
    }

    /* JADX INFO: renamed from: t */
    public void mo38141t(@NonNull ViewGroup viewGroup, @NonNull C9660e0 c9660e0, @NonNull C9660e0 c9660e1, @NonNull ArrayList<C9658d0> arrayList, @NonNull ArrayList<C9658d0> arrayList2) {
        Animator animatorMo38094s;
        Animator animator;
        int i10;
        boolean z10;
        int i11;
        View view;
        C9658d0 c9658d0;
        Animator animator2;
        View view2;
        Animator animator3;
        C12277a<Animator, d> c12277aM38249O = m38249O();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z11 = m38261N().f35155K != null;
        long jMin = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            C9658d0 c9658d1 = arrayList.get(i12);
            C9658d0 c9658d2 = arrayList2.get(i12);
            if (c9658d1 != null && !c9658d1.f35046c.contains(this)) {
                c9658d1 = null;
            }
            if (c9658d2 != null && !c9658d2.f35046c.contains(this)) {
                c9658d2 = null;
            }
            if (!(c9658d1 == null && c9658d2 == null) && ((c9658d1 == null || c9658d2 == null || mo38235Z(c9658d1, c9658d2)) && (animatorMo38094s = mo38094s(viewGroup, c9658d1, c9658d2)) != null)) {
                if (c9658d2 != null) {
                    View view3 = c9658d2.f35045b;
                    String[] strArrMo38090V = mo38090V();
                    if (strArrMo38090V != null && strArrMo38090V.length > 0) {
                        c9658d0 = new C9658d0(view3);
                        i10 = size;
                        z10 = z11;
                        C9658d0 c9658d3 = c9660e1.f35049a.get(view3);
                        i11 = i12;
                        if (c9658d3 != null) {
                            int i13 = 0;
                            while (i13 < strArrMo38090V.length) {
                                Map<String, Object> map = c9658d0.f35044a;
                                int i14 = i13;
                                String str = strArrMo38090V[i14];
                                map.put(str, c9658d3.f35044a.get(str));
                                i13 = i14 + 1;
                                strArrMo38090V = strArrMo38090V;
                            }
                        }
                        int size2 = c12277aM38249O.getSize();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                view2 = view3;
                                animator3 = animatorMo38094s;
                                break;
                            }
                            d dVar = c12277aM38249O.get(c12277aM38249O.m45625f(i15));
                            if (dVar.f35188c != null && dVar.f35186a == view3) {
                                view2 = view3;
                                if (dVar.f35187b.equals(m38258G()) && dVar.f35188c.equals(c9658d0)) {
                                    animator3 = null;
                                    break;
                                }
                            } else {
                                view2 = view3;
                            }
                            i15++;
                            view3 = view2;
                        }
                    } else {
                        view2 = view3;
                        i10 = size;
                        z10 = z11;
                        i11 = i12;
                        animator3 = animatorMo38094s;
                        c9658d0 = null;
                    }
                    animator = animator3;
                    view = view2;
                } else {
                    animator = animatorMo38094s;
                    i10 = size;
                    z10 = z11;
                    i11 = i12;
                    view = c9658d1.f35045b;
                    c9658d0 = null;
                }
                if (animator != null) {
                    AbstractC9692z abstractC9692z = this.f35150F;
                    if (abstractC9692z != null) {
                        long jMo38226c = abstractC9692z.mo38226c(viewGroup, this, c9658d1, c9658d2);
                        sparseIntArray.put(this.f35149E.size(), (int) jMo38226c);
                        jMin = Math.min(jMo38226c, jMin);
                    }
                    long j10 = jMin;
                    View view4 = view;
                    C9658d0 c9658d4 = c9658d0;
                    Animator animator4 = animator;
                    d dVar2 = new d(view4, m38258G(), this, viewGroup.getWindowId(), c9658d4, animator4);
                    if (z10) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator4);
                        animator2 = animatorSet;
                    } else {
                        animator2 = animator4;
                    }
                    c12277aM38249O.put(animator2, dVar2);
                    this.f35149E.add(animator2);
                    jMin = j10;
                }
            } else {
                i10 = size;
                z10 = z11;
                i11 = i12;
            }
            i12 = i11 + 1;
            size = i10;
            z11 = z10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i16 = 0; i16 < sparseIntArray.size(); i16++) {
                d dVar3 = c12277aM38249O.get(this.f35149E.get(sparseIntArray.keyAt(i16)));
                dVar3.f35191f.setStartDelay((((long) sparseIntArray.valueAt(i16)) - jMin) + dVar3.f35191f.getStartDelay());
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: t0 */
    public AbstractC9683q mo38142t0(long j10) {
        this.f35159c = j10;
        return this;
    }

    @NonNull
    public String toString() {
        return mo38113A0("");
    }

    /* JADX INFO: renamed from: u0 */
    public void mo38143u0(e eVar) {
        this.f35151G = eVar;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public InterfaceC9652a0 m38284v() {
        g gVar = new g();
        this.f35155K = gVar;
        mo38129c(gVar);
        return this.f35155K;
    }

    @NonNull
    /* JADX INFO: renamed from: v0 */
    public AbstractC9683q mo38144v0(TimeInterpolator timeInterpolator) {
        this.f35160d = timeInterpolator;
        return this;
    }

    /* JADX INFO: renamed from: w */
    public void m38285w() {
        int i10 = this.f35182z - 1;
        this.f35182z = i10;
        if (i10 == 0) {
            m38278i0(i.f35203b, false);
            for (int i11 = 0; i11 < this.f35172p.f35051c.m45607n(); i11++) {
                View viewM45608o = this.f35172p.f35051c.m45608o(i11);
                if (viewM45608o != null) {
                    viewM45608o.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f35173q.f35051c.m45607n(); i12++) {
                View viewM45608o2 = this.f35173q.f35051c.m45608o(i12);
                if (viewM45608o2 != null) {
                    viewM45608o2.setHasTransientState(false);
                }
            }
            this.f35146B = true;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void mo38145w0(AbstractC9671k abstractC9671k) {
        if (abstractC9671k == null) {
            this.f35153I = f35143O;
        } else {
            this.f35153I = abstractC9671k;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: K */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public void mo38146x(ViewGroup viewGroup) {
        C12277a<Animator, d> c12277aM38249O = m38249O();
        int size = c12277aM38249O.getSize();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C12277a c12277a = new C12277a(c12277aM38249O);
        c12277aM38249O.clear();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            d dVar = (d) c12277a.m45629k(i10);
            if (dVar.f35186a != null && windowId.equals(dVar.f35189d)) {
                ((Animator) c12277a.m45625f(i10)).end();
            }
        }
    }

    /* JADX INFO: renamed from: x0 */
    public void mo38147x0(AbstractC9692z abstractC9692z) {
        this.f35150F = abstractC9692z;
    }

    @NonNull
    /* JADX INFO: renamed from: y0 */
    public AbstractC9683q mo38148y0(long j10) {
        this.f35158b = j10;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public long m38286z() {
        return this.f35159c;
    }

    /* JADX INFO: renamed from: z0 */
    public void m38287z0() {
        if (this.f35182z == 0) {
            m38278i0(i.f35202a, false);
            this.f35146B = false;
        }
        this.f35182z++;
    }
}
