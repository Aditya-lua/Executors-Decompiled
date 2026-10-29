package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f */
/* JADX INFO: loaded from: classes.dex */
public class C1055f extends AbstractC1067r {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f4164s;

    /* JADX INFO: renamed from: h */
    public ArrayList<RecyclerView.AbstractC1023f0> f4165h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public ArrayList<RecyclerView.AbstractC1023f0> f4166i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public ArrayList<j> f4167j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public ArrayList<i> f4168k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public ArrayList<ArrayList<RecyclerView.AbstractC1023f0>> f4169l = new ArrayList<>();

    /* JADX INFO: renamed from: m */
    public ArrayList<ArrayList<j>> f4170m = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    public ArrayList<ArrayList<i>> f4171n = new ArrayList<>();

    /* JADX INFO: renamed from: o */
    public ArrayList<RecyclerView.AbstractC1023f0> f4172o = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public ArrayList<RecyclerView.AbstractC1023f0> f4173p = new ArrayList<>();

    /* JADX INFO: renamed from: q */
    public ArrayList<RecyclerView.AbstractC1023f0> f4174q = new ArrayList<>();

    /* JADX INFO: renamed from: r */
    public ArrayList<RecyclerView.AbstractC1023f0> f4175r = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f4176a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(ArrayList arrayList) {
            this.f4176a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f4176a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                C1055f.this.m5905S(jVar.f4210a, jVar.f4211b, jVar.f4212c, jVar.f4213d, jVar.f4214e);
            }
            this.f4176a.clear();
            C1055f.this.f4170m.remove(this.f4176a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f4178a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(ArrayList arrayList) {
            this.f4178a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f4178a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C1055f.this.m5904R((i) obj);
            }
            this.f4178a.clear();
            C1055f.this.f4171n.remove(this.f4178a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f4180a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(ArrayList arrayList) {
            this.f4180a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f4180a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C1055f.this.m5903Q((RecyclerView.AbstractC1023f0) obj);
            }
            this.f4180a.clear();
            C1055f.this.f4169l.remove(this.f4180a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$d */
    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC1023f0 f4182a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f4183b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f4184c;

        public d(RecyclerView.AbstractC1023f0 abstractC1023f0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4182a = abstractC1023f0;
            this.f4183b = viewPropertyAnimator;
            this.f4184c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4183b.setListener(null);
            this.f4184c.setAlpha(1.0f);
            C1055f.this.m6047G(this.f4182a);
            C1055f.this.f4174q.remove(this.f4182a);
            C1055f.this.m5908V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1055f.this.m6048H(this.f4182a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$e */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC1023f0 f4186a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f4187b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f4188c;

        public e(RecyclerView.AbstractC1023f0 abstractC1023f0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4186a = abstractC1023f0;
            this.f4187b = view;
            this.f4188c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4187b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4188c.setListener(null);
            C1055f.this.m6041A(this.f4186a);
            C1055f.this.f4172o.remove(this.f4186a);
            C1055f.this.m5908V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1055f.this.m6042B(this.f4186a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$f */
    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC1023f0 f4190a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f4191b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f4192c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f4193d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f4194e;

        public f(RecyclerView.AbstractC1023f0 abstractC1023f0, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4190a = abstractC1023f0;
            this.f4191b = i10;
            this.f4192c = view;
            this.f4193d = i11;
            this.f4194e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4191b != 0) {
                this.f4192c.setTranslationX(0.0f);
            }
            if (this.f4193d != 0) {
                this.f4192c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4194e.setListener(null);
            C1055f.this.m6045E(this.f4190a);
            C1055f.this.f4173p.remove(this.f4190a);
            C1055f.this.m5908V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1055f.this.m6046F(this.f4190a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$g */
    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i f4196a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f4197b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f4198c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4196a = iVar;
            this.f4197b = viewPropertyAnimator;
            this.f4198c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4197b.setListener(null);
            this.f4198c.setAlpha(1.0f);
            this.f4198c.setTranslationX(0.0f);
            this.f4198c.setTranslationY(0.0f);
            C1055f.this.m6043C(this.f4196a.f4204a, true);
            C1055f.this.f4175r.remove(this.f4196a.f4204a);
            C1055f.this.m5908V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1055f.this.m6044D(this.f4196a.f4204a, true);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$h */
    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i f4200a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f4201b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f4202c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4200a = iVar;
            this.f4201b = viewPropertyAnimator;
            this.f4202c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4201b.setListener(null);
            this.f4202c.setAlpha(1.0f);
            this.f4202c.setTranslationX(0.0f);
            this.f4202c.setTranslationY(0.0f);
            C1055f.this.m6043C(this.f4200a.f4205b, false);
            C1055f.this.f4175r.remove(this.f4200a.f4205b);
            C1055f.this.m5908V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1055f.this.m6044D(this.f4200a.f4205b, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$j */
    public static class j {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC1023f0 f4210a;

        /* JADX INFO: renamed from: b */
        public int f4211b;

        /* JADX INFO: renamed from: c */
        public int f4212c;

        /* JADX INFO: renamed from: d */
        public int f4213d;

        /* JADX INFO: renamed from: e */
        public int f4214e;

        public j(RecyclerView.AbstractC1023f0 abstractC1023f0, int i10, int i11, int i12, int i13) {
            this.f4210a = abstractC1023f0;
            this.f4211b = i10;
            this.f4212c = i11;
            this.f4213d = i12;
            this.f4214e = i13;
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m5903Q(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        View view = abstractC1023f0.f3981a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f4172o.add(abstractC1023f0);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(m5521l()).setListener(new e(abstractC1023f0, view, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: R */
    public void m5904R(i iVar) {
        RecyclerView.AbstractC1023f0 abstractC1023f0 = iVar.f4204a;
        View view = abstractC1023f0 == null ? null : abstractC1023f0.f3981a;
        RecyclerView.AbstractC1023f0 abstractC1023f1 = iVar.f4205b;
        View view2 = abstractC1023f1 != null ? abstractC1023f1.f3981a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m5522m());
            this.f4175r.add(iVar.f4204a);
            duration.translationX(iVar.f4208e - iVar.f4206c);
            duration.translationY(iVar.f4209f - iVar.f4207d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f4175r.add(iVar.f4205b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m5522m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    /* JADX INFO: renamed from: S */
    public void m5905S(RecyclerView.AbstractC1023f0 abstractC1023f0, int i10, int i11, int i12, int i13) {
        View view = abstractC1023f0.f3981a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f4173p.add(abstractC1023f0);
        viewPropertyAnimatorAnimate.setDuration(m5523n()).setListener(new f(abstractC1023f0, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    /* JADX INFO: renamed from: T */
    public final void m5906T(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        View view = abstractC1023f0.f3981a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f4174q.add(abstractC1023f0);
        viewPropertyAnimatorAnimate.setDuration(m5524o()).alpha(0.0f).setListener(new d(abstractC1023f0, viewPropertyAnimatorAnimate, view)).start();
    }

    /* JADX INFO: renamed from: U */
    public void m5907U(List<RecyclerView.AbstractC1023f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3981a.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m5908V() {
        if (mo5525p()) {
            return;
        }
        m5518i();
    }

    /* JADX INFO: renamed from: W */
    public final void m5909W(List<i> list, RecyclerView.AbstractC1023f0 abstractC1023f0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (m5911Y(iVar, abstractC1023f0) && iVar.f4204a == null && iVar.f4205b == null) {
                list.remove(iVar);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m5910X(i iVar) {
        RecyclerView.AbstractC1023f0 abstractC1023f0 = iVar.f4204a;
        if (abstractC1023f0 != null) {
            m5911Y(iVar, abstractC1023f0);
        }
        RecyclerView.AbstractC1023f0 abstractC1023f1 = iVar.f4205b;
        if (abstractC1023f1 != null) {
            m5911Y(iVar, abstractC1023f1);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m5911Y(i iVar, RecyclerView.AbstractC1023f0 abstractC1023f0) {
        boolean z10 = false;
        if (iVar.f4205b == abstractC1023f0) {
            iVar.f4205b = null;
        } else {
            if (iVar.f4204a != abstractC1023f0) {
                return false;
            }
            iVar.f4204a = null;
            z10 = true;
        }
        abstractC1023f0.f3981a.setAlpha(1.0f);
        abstractC1023f0.f3981a.setTranslationX(0.0f);
        abstractC1023f0.f3981a.setTranslationY(0.0f);
        m6043C(abstractC1023f0, z10);
        return true;
    }

    /* JADX INFO: renamed from: Z */
    public final void m5912Z(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        if (f4164s == null) {
            f4164s = new ValueAnimator().getInterpolator();
        }
        abstractC1023f0.f3981a.animate().setInterpolator(f4164s);
        mo5519j(abstractC1023f0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    /* JADX INFO: renamed from: g */
    public boolean mo5516g(@NonNull RecyclerView.AbstractC1023f0 abstractC1023f0, @NonNull List<Object> list) {
        return !list.isEmpty() || super.mo5516g(abstractC1023f0, list);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0011 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: j */
    public void mo5519j(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        View view = abstractC1023f0.f3981a;
        view.animate().cancel();
        int size = this.f4167j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f4167j.get(size).f4210a == abstractC1023f0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m6045E(abstractC1023f0);
                this.f4167j.remove(size);
            }
        }
        m5909W(this.f4168k, abstractC1023f0);
        if (this.f4165h.remove(abstractC1023f0)) {
            view.setAlpha(1.0f);
            m6047G(abstractC1023f0);
        }
        if (this.f4166i.remove(abstractC1023f0)) {
            view.setAlpha(1.0f);
            m6041A(abstractC1023f0);
        }
        for (int size2 = this.f4171n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f4171n.get(size2);
            m5909W(arrayList, abstractC1023f0);
            if (arrayList.isEmpty()) {
                this.f4171n.remove(size2);
            }
        }
        for (int size3 = this.f4170m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f4170m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f4210a == abstractC1023f0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m6045E(abstractC1023f0);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f4170m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f4169l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC1023f0> arrayList3 = this.f4169l.get(size5);
            if (arrayList3.remove(abstractC1023f0)) {
                view.setAlpha(1.0f);
                m6041A(abstractC1023f0);
                if (arrayList3.isEmpty()) {
                    this.f4169l.remove(size5);
                }
            }
        }
        this.f4174q.remove(abstractC1023f0);
        this.f4172o.remove(abstractC1023f0);
        this.f4175r.remove(abstractC1023f0);
        this.f4173p.remove(abstractC1023f0);
        m5908V();
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:10:0x004f */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0008 */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    /* JADX INFO: renamed from: k */
    public void mo5520k() {
        int size = this.f4167j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f4167j.get(size);
            View view = jVar.f4210a.f3981a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m6045E(jVar.f4210a);
            this.f4167j.remove(size);
        }
        for (int size2 = this.f4165h.size() - 1; size2 >= 0; size2--) {
            m6047G(this.f4165h.get(size2));
            this.f4165h.remove(size2);
        }
        int size3 = this.f4166i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC1023f0 abstractC1023f0 = this.f4166i.get(size3);
            abstractC1023f0.f3981a.setAlpha(1.0f);
            m6041A(abstractC1023f0);
            this.f4166i.remove(size3);
        }
        for (int size4 = this.f4168k.size() - 1; size4 >= 0; size4--) {
            m5910X(this.f4168k.get(size4));
        }
        this.f4168k.clear();
        if (mo5525p()) {
            for (int size5 = this.f4170m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f4170m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f4210a.f3981a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m6045E(jVar2.f4210a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4170m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4169l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC1023f0> arrayList2 = this.f4169l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC1023f0 abstractC1023f1 = arrayList2.get(size8);
                    abstractC1023f1.f3981a.setAlpha(1.0f);
                    m6041A(abstractC1023f1);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4169l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4171n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f4171n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5910X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4171n.remove(arrayList3);
                    }
                }
            }
            m5907U(this.f4174q);
            m5907U(this.f4173p);
            m5907U(this.f4172o);
            m5907U(this.f4175r);
            m5518i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    /* JADX INFO: renamed from: p */
    public boolean mo5525p() {
        return (this.f4166i.isEmpty() && this.f4168k.isEmpty() && this.f4167j.isEmpty() && this.f4165h.isEmpty() && this.f4173p.isEmpty() && this.f4174q.isEmpty() && this.f4172o.isEmpty() && this.f4175r.isEmpty() && this.f4170m.isEmpty() && this.f4169l.isEmpty() && this.f4171n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1031n
    /* JADX INFO: renamed from: u */
    public void mo5530u() {
        boolean zIsEmpty = this.f4165h.isEmpty();
        boolean zIsEmpty2 = this.f4167j.isEmpty();
        boolean zIsEmpty3 = this.f4168k.isEmpty();
        boolean zIsEmpty4 = this.f4166i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        ArrayList<RecyclerView.AbstractC1023f0> arrayList = this.f4165h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            RecyclerView.AbstractC1023f0 abstractC1023f0 = arrayList.get(i10);
            i10++;
            m5906T(abstractC1023f0);
        }
        this.f4165h.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f4167j);
            this.f4170m.add(arrayList2);
            this.f4167j.clear();
            a aVar = new a(arrayList2);
            if (zIsEmpty) {
                aVar.run();
            } else {
                C0625o0.m3026f0(arrayList2.get(0).f4210a.f3981a, aVar, m5524o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f4168k);
            this.f4171n.add(arrayList3);
            this.f4168k.clear();
            b bVar = new b(arrayList3);
            if (zIsEmpty) {
                bVar.run();
            } else {
                C0625o0.m3026f0(arrayList3.get(0).f4204a.f3981a, bVar, m5524o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.AbstractC1023f0> arrayList4 = new ArrayList<>();
        arrayList4.addAll(this.f4166i);
        this.f4169l.add(arrayList4);
        this.f4166i.clear();
        c cVar = new c(arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            C0625o0.m3026f0(arrayList4.get(0).f3981a, cVar, (!zIsEmpty ? m5524o() : 0L) + Math.max(!zIsEmpty2 ? m5523n() : 0L, zIsEmpty3 ? 0L : m5522m()));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1067r
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: w */
    public boolean mo5913w(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        m5912Z(abstractC1023f0);
        abstractC1023f0.f3981a.setAlpha(0.0f);
        this.f4166i.add(abstractC1023f0);
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1067r
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: x */
    public boolean mo5914x(RecyclerView.AbstractC1023f0 abstractC1023f0, RecyclerView.AbstractC1023f0 abstractC1023f1, int i10, int i11, int i12, int i13) {
        if (abstractC1023f0 == abstractC1023f1) {
            return mo5915y(abstractC1023f0, i10, i11, i12, i13);
        }
        float translationX = abstractC1023f0.f3981a.getTranslationX();
        float translationY = abstractC1023f0.f3981a.getTranslationY();
        float alpha = abstractC1023f0.f3981a.getAlpha();
        m5912Z(abstractC1023f0);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        abstractC1023f0.f3981a.setTranslationX(translationX);
        abstractC1023f0.f3981a.setTranslationY(translationY);
        abstractC1023f0.f3981a.setAlpha(alpha);
        if (abstractC1023f1 != null) {
            m5912Z(abstractC1023f1);
            abstractC1023f1.f3981a.setTranslationX(-i14);
            abstractC1023f1.f3981a.setTranslationY(-i15);
            abstractC1023f1.f3981a.setAlpha(0.0f);
        }
        this.f4168k.add(new i(abstractC1023f0, abstractC1023f1, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1067r
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: y */
    public boolean mo5915y(RecyclerView.AbstractC1023f0 abstractC1023f0, int i10, int i11, int i12, int i13) {
        View view = abstractC1023f0.f3981a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) abstractC1023f0.f3981a.getTranslationY());
        m5912Z(abstractC1023f0);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            m6045E(abstractC1023f0);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f4167j.add(new j(abstractC1023f0, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1067r
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: z */
    public boolean mo5916z(RecyclerView.AbstractC1023f0 abstractC1023f0) {
        m5912Z(abstractC1023f0);
        this.f4165h.add(abstractC1023f0);
        return true;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$i */
    public static class i {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC1023f0 f4204a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC1023f0 f4205b;

        /* JADX INFO: renamed from: c */
        public int f4206c;

        /* JADX INFO: renamed from: d */
        public int f4207d;

        /* JADX INFO: renamed from: e */
        public int f4208e;

        /* JADX INFO: renamed from: f */
        public int f4209f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public i(RecyclerView.AbstractC1023f0 abstractC1023f0, RecyclerView.AbstractC1023f0 abstractC1023f1) {
            this.f4204a = abstractC1023f0;
            this.f4205b = abstractC1023f1;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4204a + ", newHolder=" + this.f4205b + ", fromX=" + this.f4206c + ", fromY=" + this.f4207d + ", toX=" + this.f4208e + ", toY=" + this.f4209f + '}';
        }

        public i(RecyclerView.AbstractC1023f0 abstractC1023f0, RecyclerView.AbstractC1023f0 abstractC1023f1, int i10, int i11, int i12, int i13) {
            this(abstractC1023f0, abstractC1023f1);
            this.f4206c = i10;
            this.f4207d = i11;
            this.f4208e = i12;
            this.f4209f = i13;
        }
    }
}
