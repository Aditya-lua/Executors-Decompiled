package p5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends q {
    public static final String[] R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<i, PointF> S = new a(PointF.class, "topLeft");
    public static final Property<i, PointF> T = new C0555b(PointF.class, "bottomRight");
    public static final Property<View, PointF> U = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> V = new d(PointF.class, "topLeft");
    public static final Property<View, PointF> W = new e(PointF.class, "position");
    public static final m X = new m();
    public boolean Q = false;

    public class a extends Property<i, PointF> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* JADX INFO: renamed from: p5.b$b, reason: collision with other inner class name */
    public class C0555b extends Property<i, PointF> {
        public C0555b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    public class c extends Property<View, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            i0.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            i0.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            i0.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f28792a;
        private final i mViewBounds;

        public f(i iVar) {
            this.f28792a = iVar;
            this.mViewBounds = iVar;
        }
    }

    public static class g extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28793a;
        public final Rect b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f28794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f28795d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f28796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f28797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f28798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f28799h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f28800i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f28801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f28802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f28803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f28804m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f28805n;

        public g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f28793a = view;
            this.b = rect;
            this.f28794c = z10;
            this.f28795d = rect2;
            this.f28796e = z11;
            this.f28797f = i10;
            this.f28798g = i11;
            this.f28799h = i12;
            this.f28800i = i13;
            this.f28801j = i14;
            this.f28802k = i15;
            this.f28803l = i16;
            this.f28804m = i17;
        }

        @Override // p5.q.h
        public void b(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void c(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void f(@NonNull q qVar) {
            this.f28793a.setTag(l.b, this.f28793a.getClipBounds());
            this.f28793a.setClipBounds(this.f28796e ? null : this.f28795d);
        }

        @Override // p5.q.h
        public void h(@NonNull q qVar) {
            Rect rect = (Rect) this.f28793a.getTag(l.b);
            this.f28793a.setTag(l.b, null);
            this.f28793a.setClipBounds(rect);
        }

        @Override // p5.q.h
        public void k(@NonNull q qVar) {
            this.f28805n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f28805n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f28794c) {
                    rect = this.b;
                }
            } else if (!this.f28796e) {
                rect = this.f28795d;
            }
            this.f28793a.setClipBounds(rect);
            if (z10) {
                i0.d(this.f28793a, this.f28797f, this.f28798g, this.f28799h, this.f28800i);
            } else {
                i0.d(this.f28793a, this.f28801j, this.f28802k, this.f28803l, this.f28804m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f28799h - this.f28797f, this.f28803l - this.f28801j);
            int iMax2 = Math.max(this.f28800i - this.f28798g, this.f28804m - this.f28802k);
            int i10 = z10 ? this.f28801j : this.f28797f;
            int i11 = z10 ? this.f28802k : this.f28798g;
            i0.d(this.f28793a, i10, i11, iMax + i10, iMax2 + i11);
            this.f28793a.setClipBounds(z10 ? this.f28795d : this.b);
        }
    }

    public static class h extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28806a = false;
        public final ViewGroup b;

        public h(@NonNull ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // p5.x, p5.q.h
        public void b(@NonNull q qVar) {
            if (!this.f28806a) {
                h0.b(this.b, false);
            }
            qVar.q0(this);
        }

        @Override // p5.x, p5.q.h
        public void f(@NonNull q qVar) {
            h0.b(this.b, false);
        }

        @Override // p5.x, p5.q.h
        public void h(@NonNull q qVar) {
            h0.b(this.b, true);
        }

        @Override // p5.x, p5.q.h
        public void k(@NonNull q qVar) {
            h0.b(this.b, false);
            this.f28806a = true;
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28807a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28808c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28809d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f28810e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f28811f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f28812g;

        public i(View view) {
            this.f28810e = view;
        }

        public void a(PointF pointF) {
            this.f28808c = Math.round(pointF.x);
            this.f28809d = Math.round(pointF.y);
            int i10 = this.f28812g + 1;
            this.f28812g = i10;
            if (this.f28811f == i10) {
                b();
            }
        }

        public final void b() {
            i0.d(this.f28810e, this.f28807a, this.b, this.f28808c, this.f28809d);
            this.f28811f = 0;
            this.f28812g = 0;
        }

        public void c(PointF pointF) {
            this.f28807a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i10 = this.f28811f + 1;
            this.f28811f = i10;
            if (i10 == this.f28812g) {
                b();
            }
        }
    }

    public final void F0(d0 d0Var) {
        View view = d0Var.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        d0Var.f28825a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        d0Var.f28825a.put("android:changeBounds:parent", d0Var.b.getParent());
        if (this.Q) {
            d0Var.f28825a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // p5.q
    @NonNull
    public String[] Y() {
        return R;
    }

    @Override // p5.q
    public boolean c0() {
        return true;
    }

    @Override // p5.q
    public void l(@NonNull d0 d0Var) {
        F0(d0Var);
    }

    @Override // p5.q
    public void q(@NonNull d0 d0Var) {
        Rect rect;
        F0(d0Var);
        if (!this.Q || (rect = (Rect) d0Var.b.getTag(l.b)) == null) {
            return;
        }
        d0Var.f28825a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p5.q
    public Animator u(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        int i10;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        Map<String, Object> map = d0Var.f28825a;
        Map<String, Object> map2 = d0Var2.f28825a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = d0Var2.b;
        Rect rect2 = (Rect) d0Var.f28825a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) d0Var2.f28825a.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) d0Var.f28825a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) d0Var2.f28825a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i24 = i10;
        if (i24 <= 0) {
            return null;
        }
        if (this.Q) {
            i0.d(view, i12, i14, Math.max(i20, i22) + i12, i14 + Math.max(i21, i23));
            ObjectAnimator objectAnimatorA = (i12 == i13 && i14 == i15) ? null : j.a(view, W, J().a(i12, i14, i13, i15));
            boolean z10 = rect4 == null;
            if (z10) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            int i25 = rect5 == null ? 1 : i11;
            Rect rect6 = i25 != 0 ? new Rect(i11, i11, i22, i23) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", X, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i25, i12, i14, i16, i18, i13, i15, i17, i19);
                objectAnimatorOfObject.addListener(gVar);
                c(gVar);
            }
            animatorC = c0.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            i0.d(view, i12, i14, i16, i18);
            if (i24 != 2) {
                animatorC = (i12 == i13 && i14 == i15) ? j.a(view, U, J().a(i16, i18, i17, i19)) : j.a(view, V, J().a(i12, i14, i13, i15));
            } else if (i20 == i22 && i21 == i23) {
                animatorC = j.a(view, W, J().a(i12, i14, i13, i15));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = j.a(iVar, S, J().a(i12, i14, i13, i15));
                ObjectAnimator objectAnimatorA3 = j.a(iVar, T, J().a(i16, i18, i17, i19));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            h0.b(viewGroup4, true);
            O().c(new h(viewGroup4));
        }
        return animatorC;
    }
}
