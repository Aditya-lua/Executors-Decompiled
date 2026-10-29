package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f extends r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f3158s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3159h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3160i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<j> f3161j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<i> f3162k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.f0>> f3163l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<j>> f3164m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<i>> f3165n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3166o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3167p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3168q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3169r = new ArrayList<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3170a;

        public a(ArrayList arrayList) {
            this.f3170a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f3170a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                f.this.S(jVar.f3195a, jVar.b, jVar.f3196c, jVar.f3197d, jVar.f3198e);
            }
            this.f3170a.clear();
            f.this.f3164m.remove(this.f3170a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3171a;

        public b(ArrayList arrayList) {
            this.f3171a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f3171a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f.this.R((i) obj);
            }
            this.f3171a.clear();
            f.this.f3165n.remove(this.f3171a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3172a;

        public c(ArrayList arrayList) {
            this.f3172a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f3172a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f.this.Q((RecyclerView.f0) obj);
            }
            this.f3172a.clear();
            f.this.f3163l.remove(this.f3172a);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f3173a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3174c;

        public d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3173a = f0Var;
            this.b = viewPropertyAnimator;
            this.f3174c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f3174c.setAlpha(1.0f);
            f.this.G(this.f3173a);
            f.this.f3168q.remove(this.f3173a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.H(this.f3173a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f3176a;
        public final /* synthetic */ View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3177c;

        public e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3176a = f0Var;
            this.b = view;
            this.f3177c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3177c.setListener(null);
            f.this.A(this.f3176a);
            f.this.f3166o.remove(this.f3176a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.B(this.f3176a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$f, reason: collision with other inner class name */
    public class C0054f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f3179a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f3181d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3182e;

        public C0054f(RecyclerView.f0 f0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3179a = f0Var;
            this.b = i10;
            this.f3180c = view;
            this.f3181d = i11;
            this.f3182e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.f3180c.setTranslationX(0.0f);
            }
            if (this.f3181d != 0) {
                this.f3180c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3182e.setListener(null);
            f.this.E(this.f3179a);
            f.this.f3167p.remove(this.f3179a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.F(this.f3179a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3184a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3185c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3184a = iVar;
            this.b = viewPropertyAnimator;
            this.f3185c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f3185c.setAlpha(1.0f);
            this.f3185c.setTranslationX(0.0f);
            this.f3185c.setTranslationY(0.0f);
            f.this.C(this.f3184a.f3190a, true);
            f.this.f3169r.remove(this.f3184a.f3190a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.D(this.f3184a.f3190a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3187a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3188c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3187a = iVar;
            this.b = viewPropertyAnimator;
            this.f3188c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f3188c.setAlpha(1.0f);
            this.f3188c.setTranslationX(0.0f);
            this.f3188c.setTranslationY(0.0f);
            f.this.C(this.f3187a.b, false);
            f.this.f3169r.remove(this.f3187a.b);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.D(this.f3187a.b, false);
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f3195a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3198e;

        public j(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
            this.f3195a = f0Var;
            this.b = i10;
            this.f3196c = i11;
            this.f3197d = i12;
            this.f3198e = i13;
        }
    }

    public void Q(RecyclerView.f0 f0Var) {
        View view = f0Var.f3016a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3166o.add(f0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(f0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    public void R(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3190a;
        View view = f0Var == null ? null : f0Var.f3016a;
        RecyclerView.f0 f0Var2 = iVar.b;
        View view2 = f0Var2 != null ? f0Var2.f3016a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f3169r.add(iVar.f3190a);
            duration.translationX(iVar.f3193e - iVar.f3191c);
            duration.translationY(iVar.f3194f - iVar.f3192d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f3169r.add(iVar.b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void S(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.f3016a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3167p.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new C0054f(f0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    public final void T(RecyclerView.f0 f0Var) {
        View view = f0Var.f3016a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3168q.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(f0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    public void U(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3016a.animate().cancel();
        }
    }

    public void V() {
        if (p()) {
            return;
        }
        i();
    }

    public final void W(List<i> list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, f0Var) && iVar.f3190a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void X(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3190a;
        if (f0Var != null) {
            Y(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.b;
        if (f0Var2 != null) {
            Y(iVar, f0Var2);
        }
    }

    public final boolean Y(i iVar, RecyclerView.f0 f0Var) {
        boolean z10 = false;
        if (iVar.b == f0Var) {
            iVar.b = null;
        } else {
            if (iVar.f3190a != f0Var) {
                return false;
            }
            iVar.f3190a = null;
            z10 = true;
        }
        f0Var.f3016a.setAlpha(1.0f);
        f0Var.f3016a.setTranslationX(0.0f);
        f0Var.f3016a.setTranslationY(0.0f);
        C(f0Var, z10);
        return true;
    }

    public final void Z(RecyclerView.f0 f0Var) {
        if (f3158s == null) {
            f3158s = new ValueAnimator().getInterpolator();
        }
        f0Var.f3016a.animate().setInterpolator(f3158s);
        j(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean g(@NonNull RecyclerView.f0 f0Var, @NonNull List<Object> list) {
        return !list.isEmpty() || super.g(f0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void j(RecyclerView.f0 f0Var) {
        View view = f0Var.f3016a;
        view.animate().cancel();
        int size = this.f3161j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f3161j.get(size).f3195a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(f0Var);
                this.f3161j.remove(size);
            }
        }
        W(this.f3162k, f0Var);
        if (this.f3159h.remove(f0Var)) {
            view.setAlpha(1.0f);
            G(f0Var);
        }
        if (this.f3160i.remove(f0Var)) {
            view.setAlpha(1.0f);
            A(f0Var);
        }
        for (int size2 = this.f3165n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f3165n.get(size2);
            W(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f3165n.remove(size2);
            }
        }
        for (int size3 = this.f3164m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f3164m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f3195a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(f0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f3164m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f3163l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.f3163l.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                A(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f3163l.remove(size5);
                }
            }
        }
        this.f3168q.remove(f0Var);
        this.f3166o.remove(f0Var);
        this.f3169r.remove(f0Var);
        this.f3167p.remove(f0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k() {
        int size = this.f3161j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f3161j.get(size);
            View view = jVar.f3195a.f3016a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f3195a);
            this.f3161j.remove(size);
        }
        for (int size2 = this.f3159h.size() - 1; size2 >= 0; size2--) {
            G(this.f3159h.get(size2));
            this.f3159h.remove(size2);
        }
        int size3 = this.f3160i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.f3160i.get(size3);
            f0Var.f3016a.setAlpha(1.0f);
            A(f0Var);
            this.f3160i.remove(size3);
        }
        for (int size4 = this.f3162k.size() - 1; size4 >= 0; size4--) {
            X(this.f3162k.get(size4));
        }
        this.f3162k.clear();
        if (p()) {
            for (int size5 = this.f3164m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f3164m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f3195a.f3016a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f3195a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3164m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3163l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList2 = this.f3163l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                    f0Var2.f3016a.setAlpha(1.0f);
                    A(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3163l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3165n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f3165n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3165n.remove(arrayList3);
                    }
                }
            }
            U(this.f3168q);
            U(this.f3167p);
            U(this.f3166o);
            U(this.f3169r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean p() {
        return (this.f3160i.isEmpty() && this.f3162k.isEmpty() && this.f3161j.isEmpty() && this.f3159h.isEmpty() && this.f3167p.isEmpty() && this.f3168q.isEmpty() && this.f3166o.isEmpty() && this.f3169r.isEmpty() && this.f3164m.isEmpty() && this.f3163l.isEmpty() && this.f3165n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void u() {
        boolean zIsEmpty = this.f3159h.isEmpty();
        boolean zIsEmpty2 = this.f3161j.isEmpty();
        boolean zIsEmpty3 = this.f3162k.isEmpty();
        boolean zIsEmpty4 = this.f3160i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        ArrayList<RecyclerView.f0> arrayList = this.f3159h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            RecyclerView.f0 f0Var = arrayList.get(i10);
            i10++;
            T(f0Var);
        }
        this.f3159h.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f3161j);
            this.f3164m.add(arrayList2);
            this.f3161j.clear();
            a aVar = new a(arrayList2);
            if (zIsEmpty) {
                aVar.run();
            } else {
                o0.f0(arrayList2.get(0).f3195a.f3016a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f3162k);
            this.f3165n.add(arrayList3);
            this.f3162k.clear();
            b bVar = new b(arrayList3);
            if (zIsEmpty) {
                bVar.run();
            } else {
                o0.f0(arrayList3.get(0).f3190a.f3016a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.f0> arrayList4 = new ArrayList<>();
        arrayList4.addAll(this.f3160i);
        this.f3163l.add(arrayList4);
        this.f3160i.clear();
        c cVar = new c(arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            o0.f0(arrayList4.get(0).f3016a, cVar, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean w(RecyclerView.f0 f0Var) {
        Z(f0Var);
        f0Var.f3016a.setAlpha(0.0f);
        this.f3160i.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
        if (f0Var == f0Var2) {
            return y(f0Var, i10, i11, i12, i13);
        }
        float translationX = f0Var.f3016a.getTranslationX();
        float translationY = f0Var.f3016a.getTranslationY();
        float alpha = f0Var.f3016a.getAlpha();
        Z(f0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f0Var.f3016a.setTranslationX(translationX);
        f0Var.f3016a.setTranslationY(translationY);
        f0Var.f3016a.setAlpha(alpha);
        if (f0Var2 != null) {
            Z(f0Var2);
            f0Var2.f3016a.setTranslationX(-i14);
            f0Var2.f3016a.setTranslationY(-i15);
            f0Var2.f3016a.setAlpha(0.0f);
        }
        this.f3162k.add(new i(f0Var, f0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean y(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.f3016a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f0Var.f3016a.getTranslationY());
        Z(f0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(f0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f3161j.add(new j(f0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean z(RecyclerView.f0 f0Var) {
        Z(f0Var);
        this.f3159h.add(f0Var);
        return true;
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f3190a;
        public RecyclerView.f0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3192d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3193e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3194f;

        public i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f3190a = f0Var;
            this.b = f0Var2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3190a + ", newHolder=" + this.b + ", fromX=" + this.f3191c + ", fromY=" + this.f3192d + ", toX=" + this.f3193e + ", toY=" + this.f3194f + '}';
        }

        public i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
            this(f0Var, f0Var2);
            this.f3191c = i10;
            this.f3192d = i11;
            this.f3193e = i12;
            this.f3194f = i13;
        }
    }
}
