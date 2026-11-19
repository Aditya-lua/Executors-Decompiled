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
    public static TimeInterpolator f2705s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<RecyclerView.g0> f2706h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<RecyclerView.g0> f2707i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<j> f2708j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<i> f2709k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.g0>> f2710l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<j>> f2711m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<i>> f2712n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.g0> f2713o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<RecyclerView.g0> f2714p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<RecyclerView.g0> f2715q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<RecyclerView.g0> f2716r = new ArrayList<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2717a;

        public a(ArrayList arrayList) {
            this.f2717a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f2717a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                f.this.S(jVar.f2742a, jVar.b, jVar.f2743c, jVar.f2744d, jVar.f2745e);
            }
            this.f2717a.clear();
            f.this.f2711m.remove(this.f2717a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2718a;

        public b(ArrayList arrayList) {
            this.f2718a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f2718a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f.this.R((i) obj);
            }
            this.f2718a.clear();
            f.this.f2712n.remove(this.f2718a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f2719a;

        public c(ArrayList arrayList) {
            this.f2719a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f2719a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f.this.Q((RecyclerView.g0) obj);
            }
            this.f2719a.clear();
            f.this.f2710l.remove(this.f2719a);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.g0 f2720a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2721c;

        public d(RecyclerView.g0 g0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2720a = g0Var;
            this.b = viewPropertyAnimator;
            this.f2721c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f2721c.setAlpha(1.0f);
            f.this.G(this.f2720a);
            f.this.f2715q.remove(this.f2720a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.H(this.f2720a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.g0 f2723a;
        public final /* synthetic */ View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f2724c;

        public e(RecyclerView.g0 g0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2723a = g0Var;
            this.b = view;
            this.f2724c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2724c.setListener(null);
            f.this.A(this.f2723a);
            f.this.f2713o.remove(this.f2723a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.B(this.f2723a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$f, reason: collision with other inner class name */
    public class C0058f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.g0 f2726a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f2728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f2729e;

        public C0058f(RecyclerView.g0 g0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2726a = g0Var;
            this.b = i10;
            this.f2727c = view;
            this.f2728d = i11;
            this.f2729e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.f2727c.setTranslationX(0.0f);
            }
            if (this.f2728d != 0) {
                this.f2727c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2729e.setListener(null);
            f.this.E(this.f2726a);
            f.this.f2714p.remove(this.f2726a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.F(this.f2726a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f2731a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2732c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2731a = iVar;
            this.b = viewPropertyAnimator;
            this.f2732c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f2732c.setAlpha(1.0f);
            this.f2732c.setTranslationX(0.0f);
            this.f2732c.setTranslationY(0.0f);
            f.this.C(this.f2731a.f2737a, true);
            f.this.f2716r.remove(this.f2731a.f2737a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.D(this.f2731a.f2737a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f2734a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2735c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2734a = iVar;
            this.b = viewPropertyAnimator;
            this.f2735c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f2735c.setAlpha(1.0f);
            this.f2735c.setTranslationX(0.0f);
            this.f2735c.setTranslationY(0.0f);
            f.this.C(this.f2734a.b, false);
            f.this.f2716r.remove(this.f2734a.b);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.D(this.f2734a.b, false);
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.g0 f2742a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2745e;

        public j(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13) {
            this.f2742a = g0Var;
            this.b = i10;
            this.f2743c = i11;
            this.f2744d = i12;
            this.f2745e = i13;
        }
    }

    public void Q(RecyclerView.g0 g0Var) {
        View view = g0Var.f2564a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f2713o.add(g0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(g0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    public void R(i iVar) {
        RecyclerView.g0 g0Var = iVar.f2737a;
        View view = g0Var == null ? null : g0Var.f2564a;
        RecyclerView.g0 g0Var2 = iVar.b;
        View view2 = g0Var2 != null ? g0Var2.f2564a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f2716r.add(iVar.f2737a);
            duration.translationX(iVar.f2740e - iVar.f2738c);
            duration.translationY(iVar.f2741f - iVar.f2739d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f2716r.add(iVar.b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void S(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13) {
        View view = g0Var.f2564a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f2714p.add(g0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new C0058f(g0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    public final void T(RecyclerView.g0 g0Var) {
        View view = g0Var.f2564a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f2715q.add(g0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(g0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    public void U(List<RecyclerView.g0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f2564a.animate().cancel();
        }
    }

    public void V() {
        if (p()) {
            return;
        }
        i();
    }

    public final void W(List<i> list, RecyclerView.g0 g0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, g0Var) && iVar.f2737a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void X(i iVar) {
        RecyclerView.g0 g0Var = iVar.f2737a;
        if (g0Var != null) {
            Y(iVar, g0Var);
        }
        RecyclerView.g0 g0Var2 = iVar.b;
        if (g0Var2 != null) {
            Y(iVar, g0Var2);
        }
    }

    public final boolean Y(i iVar, RecyclerView.g0 g0Var) {
        boolean z10 = false;
        if (iVar.b == g0Var) {
            iVar.b = null;
        } else {
            if (iVar.f2737a != g0Var) {
                return false;
            }
            iVar.f2737a = null;
            z10 = true;
        }
        g0Var.f2564a.setAlpha(1.0f);
        g0Var.f2564a.setTranslationX(0.0f);
        g0Var.f2564a.setTranslationY(0.0f);
        C(g0Var, z10);
        return true;
    }

    public final void Z(RecyclerView.g0 g0Var) {
        if (f2705s == null) {
            f2705s = new ValueAnimator().getInterpolator();
        }
        g0Var.f2564a.animate().setInterpolator(f2705s);
        j(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean g(@NonNull RecyclerView.g0 g0Var, @NonNull List<Object> list) {
        return !list.isEmpty() || super.g(g0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void j(RecyclerView.g0 g0Var) {
        View view = g0Var.f2564a;
        view.animate().cancel();
        int size = this.f2708j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f2708j.get(size).f2742a == g0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(g0Var);
                this.f2708j.remove(size);
            }
        }
        W(this.f2709k, g0Var);
        if (this.f2706h.remove(g0Var)) {
            view.setAlpha(1.0f);
            G(g0Var);
        }
        if (this.f2707i.remove(g0Var)) {
            view.setAlpha(1.0f);
            A(g0Var);
        }
        for (int size2 = this.f2712n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f2712n.get(size2);
            W(arrayList, g0Var);
            if (arrayList.isEmpty()) {
                this.f2712n.remove(size2);
            }
        }
        for (int size3 = this.f2711m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f2711m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f2742a == g0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(g0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f2711m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f2710l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.g0> arrayList3 = this.f2710l.get(size5);
            if (arrayList3.remove(g0Var)) {
                view.setAlpha(1.0f);
                A(g0Var);
                if (arrayList3.isEmpty()) {
                    this.f2710l.remove(size5);
                }
            }
        }
        this.f2715q.remove(g0Var);
        this.f2713o.remove(g0Var);
        this.f2716r.remove(g0Var);
        this.f2714p.remove(g0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k() {
        int size = this.f2708j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f2708j.get(size);
            View view = jVar.f2742a.f2564a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f2742a);
            this.f2708j.remove(size);
        }
        for (int size2 = this.f2706h.size() - 1; size2 >= 0; size2--) {
            G(this.f2706h.get(size2));
            this.f2706h.remove(size2);
        }
        int size3 = this.f2707i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.g0 g0Var = this.f2707i.get(size3);
            g0Var.f2564a.setAlpha(1.0f);
            A(g0Var);
            this.f2707i.remove(size3);
        }
        for (int size4 = this.f2709k.size() - 1; size4 >= 0; size4--) {
            X(this.f2709k.get(size4));
        }
        this.f2709k.clear();
        if (p()) {
            for (int size5 = this.f2711m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f2711m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f2742a.f2564a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f2742a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2711m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2710l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.g0> arrayList2 = this.f2710l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.g0 g0Var2 = arrayList2.get(size8);
                    g0Var2.f2564a.setAlpha(1.0f);
                    A(g0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2710l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2712n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f2712n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2712n.remove(arrayList3);
                    }
                }
            }
            U(this.f2715q);
            U(this.f2714p);
            U(this.f2713o);
            U(this.f2716r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean p() {
        return (this.f2707i.isEmpty() && this.f2709k.isEmpty() && this.f2708j.isEmpty() && this.f2706h.isEmpty() && this.f2714p.isEmpty() && this.f2715q.isEmpty() && this.f2713o.isEmpty() && this.f2716r.isEmpty() && this.f2711m.isEmpty() && this.f2710l.isEmpty() && this.f2712n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void u() {
        boolean zIsEmpty = this.f2706h.isEmpty();
        boolean zIsEmpty2 = this.f2708j.isEmpty();
        boolean zIsEmpty3 = this.f2709k.isEmpty();
        boolean zIsEmpty4 = this.f2707i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        ArrayList<RecyclerView.g0> arrayList = this.f2706h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            RecyclerView.g0 g0Var = arrayList.get(i10);
            i10++;
            T(g0Var);
        }
        this.f2706h.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f2708j);
            this.f2711m.add(arrayList2);
            this.f2708j.clear();
            a aVar = new a(arrayList2);
            if (zIsEmpty) {
                aVar.run();
            } else {
                o0.f0(arrayList2.get(0).f2742a.f2564a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f2709k);
            this.f2712n.add(arrayList3);
            this.f2709k.clear();
            b bVar = new b(arrayList3);
            if (zIsEmpty) {
                bVar.run();
            } else {
                o0.f0(arrayList3.get(0).f2737a.f2564a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.g0> arrayList4 = new ArrayList<>();
        arrayList4.addAll(this.f2707i);
        this.f2710l.add(arrayList4);
        this.f2707i.clear();
        c cVar = new c(arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            o0.f0(arrayList4.get(0).f2564a, cVar, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean w(RecyclerView.g0 g0Var) {
        Z(g0Var);
        g0Var.f2564a.setAlpha(0.0f);
        this.f2707i.add(g0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean x(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i10, int i11, int i12, int i13) {
        if (g0Var == g0Var2) {
            return y(g0Var, i10, i11, i12, i13);
        }
        float translationX = g0Var.f2564a.getTranslationX();
        float translationY = g0Var.f2564a.getTranslationY();
        float alpha = g0Var.f2564a.getAlpha();
        Z(g0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        g0Var.f2564a.setTranslationX(translationX);
        g0Var.f2564a.setTranslationY(translationY);
        g0Var.f2564a.setAlpha(alpha);
        if (g0Var2 != null) {
            Z(g0Var2);
            g0Var2.f2564a.setTranslationX(-i14);
            g0Var2.f2564a.setTranslationY(-i15);
            g0Var2.f2564a.setAlpha(0.0f);
        }
        this.f2709k.add(new i(g0Var, g0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean y(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13) {
        View view = g0Var.f2564a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) g0Var.f2564a.getTranslationY());
        Z(g0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(g0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f2708j.add(new j(g0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean z(RecyclerView.g0 g0Var) {
        Z(g0Var);
        this.f2706h.add(g0Var);
        return true;
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.g0 f2737a;
        public RecyclerView.g0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2741f;

        public i(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2) {
            this.f2737a = g0Var;
            this.b = g0Var2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2737a + ", newHolder=" + this.b + ", fromX=" + this.f2738c + ", fromY=" + this.f2739d + ", toX=" + this.f2740e + ", toY=" + this.f2741f + '}';
        }

        public i(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i10, int i11, int i12, int i13) {
            this(g0Var, g0Var2);
            this.f2738c = i10;
            this.f2739d = i11;
            this.f2740e = i12;
            this.f2741f = i13;
        }
    }
}
