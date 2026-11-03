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
    public static TimeInterpolator f3003s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3004h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3005i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<j> f3006j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList<i> f3007k = new ArrayList<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.f0>> f3008l = new ArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList<ArrayList<j>> f3009m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<ArrayList<i>> f3010n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3011o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3012p = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3013q = new ArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<RecyclerView.f0> f3014r = new ArrayList<>();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3015a;

        public a(ArrayList arrayList) {
            this.f3015a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f3015a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) obj;
                f.this.S(jVar.f3040a, jVar.b, jVar.f3041c, jVar.f3042d, jVar.f3043e);
            }
            this.f3015a.clear();
            f.this.f3009m.remove(this.f3015a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3016a;

        public b(ArrayList arrayList) {
            this.f3016a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f3016a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f.this.R((i) obj);
            }
            this.f3016a.clear();
            f.this.f3010n.remove(this.f3016a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3017a;

        public c(ArrayList arrayList) {
            this.f3017a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.f3017a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                f.this.Q((RecyclerView.f0) obj);
            }
            this.f3017a.clear();
            f.this.f3008l.remove(this.f3017a);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f3018a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3019c;

        public d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3018a = f0Var;
            this.b = viewPropertyAnimator;
            this.f3019c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f3019c.setAlpha(1.0f);
            f.this.G(this.f3018a);
            f.this.f3013q.remove(this.f3018a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.H(this.f3018a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f3021a;
        public final /* synthetic */ View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3022c;

        public e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3021a = f0Var;
            this.b = view;
            this.f3022c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3022c.setListener(null);
            f.this.A(this.f3021a);
            f.this.f3011o.remove(this.f3021a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.B(this.f3021a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$f, reason: collision with other inner class name */
    public class C0050f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.f0 f3024a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f3026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3027e;

        public C0050f(RecyclerView.f0 f0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3024a = f0Var;
            this.b = i10;
            this.f3025c = view;
            this.f3026d = i11;
            this.f3027e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.f3025c.setTranslationX(0.0f);
            }
            if (this.f3026d != 0) {
                this.f3025c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3027e.setListener(null);
            f.this.E(this.f3024a);
            f.this.f3012p.remove(this.f3024a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.F(this.f3024a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3029a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3030c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3029a = iVar;
            this.b = viewPropertyAnimator;
            this.f3030c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f3030c.setAlpha(1.0f);
            this.f3030c.setTranslationX(0.0f);
            this.f3030c.setTranslationY(0.0f);
            f.this.C(this.f3029a.f3035a, true);
            f.this.f3014r.remove(this.f3029a.f3035a);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.D(this.f3029a.f3035a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3032a;
        public final /* synthetic */ ViewPropertyAnimator b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f3033c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3032a = iVar;
            this.b = viewPropertyAnimator;
            this.f3033c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.f3033c.setAlpha(1.0f);
            this.f3033c.setTranslationX(0.0f);
            this.f3033c.setTranslationY(0.0f);
            f.this.C(this.f3032a.b, false);
            f.this.f3014r.remove(this.f3032a.b);
            f.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.D(this.f3032a.b, false);
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f3040a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3043e;

        public j(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
            this.f3040a = f0Var;
            this.b = i10;
            this.f3041c = i11;
            this.f3042d = i12;
            this.f3043e = i13;
        }
    }

    public void Q(RecyclerView.f0 f0Var) {
        View view = f0Var.f2861a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3011o.add(f0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(f0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    public void R(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3035a;
        View view = f0Var == null ? null : f0Var.f2861a;
        RecyclerView.f0 f0Var2 = iVar.b;
        View view2 = f0Var2 != null ? f0Var2.f2861a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f3014r.add(iVar.f3035a);
            duration.translationX(iVar.f3038e - iVar.f3036c);
            duration.translationY(iVar.f3039f - iVar.f3037d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f3014r.add(iVar.b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void S(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.f2861a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3012p.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new C0050f(f0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    public final void T(RecyclerView.f0 f0Var) {
        View view = f0Var.f2861a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3013q.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(f0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    public void U(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f2861a.animate().cancel();
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
            if (Y(iVar, f0Var) && iVar.f3035a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void X(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3035a;
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
            if (iVar.f3035a != f0Var) {
                return false;
            }
            iVar.f3035a = null;
            z10 = true;
        }
        f0Var.f2861a.setAlpha(1.0f);
        f0Var.f2861a.setTranslationX(0.0f);
        f0Var.f2861a.setTranslationY(0.0f);
        C(f0Var, z10);
        return true;
    }

    public final void Z(RecyclerView.f0 f0Var) {
        if (f3003s == null) {
            f3003s = new ValueAnimator().getInterpolator();
        }
        f0Var.f2861a.animate().setInterpolator(f3003s);
        j(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean g(@NonNull RecyclerView.f0 f0Var, @NonNull List<Object> list) {
        return !list.isEmpty() || super.g(f0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void j(RecyclerView.f0 f0Var) {
        View view = f0Var.f2861a;
        view.animate().cancel();
        int size = this.f3006j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f3006j.get(size).f3040a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(f0Var);
                this.f3006j.remove(size);
            }
        }
        W(this.f3007k, f0Var);
        if (this.f3004h.remove(f0Var)) {
            view.setAlpha(1.0f);
            G(f0Var);
        }
        if (this.f3005i.remove(f0Var)) {
            view.setAlpha(1.0f);
            A(f0Var);
        }
        for (int size2 = this.f3010n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f3010n.get(size2);
            W(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f3010n.remove(size2);
            }
        }
        for (int size3 = this.f3009m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f3009m.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f3040a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(f0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f3009m.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f3008l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.f3008l.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                A(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f3008l.remove(size5);
                }
            }
        }
        this.f3013q.remove(f0Var);
        this.f3011o.remove(f0Var);
        this.f3014r.remove(f0Var);
        this.f3012p.remove(f0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k() {
        int size = this.f3006j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f3006j.get(size);
            View view = jVar.f3040a.f2861a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f3040a);
            this.f3006j.remove(size);
        }
        for (int size2 = this.f3004h.size() - 1; size2 >= 0; size2--) {
            G(this.f3004h.get(size2));
            this.f3004h.remove(size2);
        }
        int size3 = this.f3005i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.f3005i.get(size3);
            f0Var.f2861a.setAlpha(1.0f);
            A(f0Var);
            this.f3005i.remove(size3);
        }
        for (int size4 = this.f3007k.size() - 1; size4 >= 0; size4--) {
            X(this.f3007k.get(size4));
        }
        this.f3007k.clear();
        if (p()) {
            for (int size5 = this.f3009m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f3009m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f3040a.f2861a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f3040a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3009m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3008l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList2 = this.f3008l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                    f0Var2.f2861a.setAlpha(1.0f);
                    A(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3008l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3010n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f3010n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3010n.remove(arrayList3);
                    }
                }
            }
            U(this.f3013q);
            U(this.f3012p);
            U(this.f3011o);
            U(this.f3014r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean p() {
        return (this.f3005i.isEmpty() && this.f3007k.isEmpty() && this.f3006j.isEmpty() && this.f3004h.isEmpty() && this.f3012p.isEmpty() && this.f3013q.isEmpty() && this.f3011o.isEmpty() && this.f3014r.isEmpty() && this.f3009m.isEmpty() && this.f3008l.isEmpty() && this.f3010n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void u() {
        boolean zIsEmpty = this.f3004h.isEmpty();
        boolean zIsEmpty2 = this.f3006j.isEmpty();
        boolean zIsEmpty3 = this.f3007k.isEmpty();
        boolean zIsEmpty4 = this.f3005i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        ArrayList<RecyclerView.f0> arrayList = this.f3004h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            RecyclerView.f0 f0Var = arrayList.get(i10);
            i10++;
            T(f0Var);
        }
        this.f3004h.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f3006j);
            this.f3009m.add(arrayList2);
            this.f3006j.clear();
            a aVar = new a(arrayList2);
            if (zIsEmpty) {
                aVar.run();
            } else {
                o0.f0(arrayList2.get(0).f3040a.f2861a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.f3007k);
            this.f3010n.add(arrayList3);
            this.f3007k.clear();
            b bVar = new b(arrayList3);
            if (zIsEmpty) {
                bVar.run();
            } else {
                o0.f0(arrayList3.get(0).f3035a.f2861a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.f0> arrayList4 = new ArrayList<>();
        arrayList4.addAll(this.f3005i);
        this.f3008l.add(arrayList4);
        this.f3005i.clear();
        c cVar = new c(arrayList4);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            o0.f0(arrayList4.get(0).f2861a, cVar, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean w(RecyclerView.f0 f0Var) {
        Z(f0Var);
        f0Var.f2861a.setAlpha(0.0f);
        this.f3005i.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
        if (f0Var == f0Var2) {
            return y(f0Var, i10, i11, i12, i13);
        }
        float translationX = f0Var.f2861a.getTranslationX();
        float translationY = f0Var.f2861a.getTranslationY();
        float alpha = f0Var.f2861a.getAlpha();
        Z(f0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f0Var.f2861a.setTranslationX(translationX);
        f0Var.f2861a.setTranslationY(translationY);
        f0Var.f2861a.setAlpha(alpha);
        if (f0Var2 != null) {
            Z(f0Var2);
            f0Var2.f2861a.setTranslationX(-i14);
            f0Var2.f2861a.setTranslationY(-i15);
            f0Var2.f2861a.setAlpha(0.0f);
        }
        this.f3007k.add(new i(f0Var, f0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean y(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.f2861a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f0Var.f2861a.getTranslationY());
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
        this.f3006j.add(new j(f0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public boolean z(RecyclerView.f0 f0Var) {
        Z(f0Var);
        this.f3004h.add(f0Var);
        return true;
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.f0 f3035a;
        public RecyclerView.f0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3039f;

        public i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f3035a = f0Var;
            this.b = f0Var2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3035a + ", newHolder=" + this.b + ", fromX=" + this.f3036c + ", fromY=" + this.f3037d + ", toX=" + this.f3038e + ", toY=" + this.f3039f + '}';
        }

        public i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
            this(f0Var, f0Var2);
            this.f3036c = i10;
            this.f3037d = i11;
            this.f3038e = i12;
            this.f3039f = i13;
        }
    }
}
