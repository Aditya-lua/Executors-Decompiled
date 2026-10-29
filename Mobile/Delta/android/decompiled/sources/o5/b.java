package o5;

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
    public static final Property<i, PointF> T = new C0467b(PointF.class, "bottomRight");
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

    /* JADX INFO: renamed from: o5.b$b, reason: collision with other inner class name */
    public class C0467b extends Property<i, PointF> {
        public C0467b(Class cls, String str) {
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
        public final /* synthetic */ i f27056a;
        private final i mViewBounds;

        public f(i iVar) {
            this.f27056a = iVar;
            this.mViewBounds = iVar;
        }
    }

    public static class g extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f27057a;
        public final Rect b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f27058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f27059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f27060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f27061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f27062g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f27063h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f27064i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f27065j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f27066k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f27067l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f27068m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f27069n;

        public g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f27057a = view;
            this.b = rect;
            this.f27058c = z10;
            this.f27059d = rect2;
            this.f27060e = z11;
            this.f27061f = i10;
            this.f27062g = i11;
            this.f27063h = i12;
            this.f27064i = i13;
            this.f27065j = i14;
            this.f27066k = i15;
            this.f27067l = i16;
            this.f27068m = i17;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
            this.f27069n = true;
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            View view = this.f27057a;
            int i10 = l.b;
            Rect rect = (Rect) view.getTag(i10);
            this.f27057a.setTag(i10, null);
            this.f27057a.setClipBounds(rect);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            this.f27057a.setTag(l.b, this.f27057a.getClipBounds());
            this.f27057a.setClipBounds(this.f27060e ? null : this.f27059d);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
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
            if (this.f27069n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f27058c) {
                    rect = this.b;
                }
            } else if (!this.f27060e) {
                rect = this.f27059d;
            }
            this.f27057a.setClipBounds(rect);
            if (z10) {
                i0.d(this.f27057a, this.f27061f, this.f27062g, this.f27063h, this.f27064i);
            } else {
                i0.d(this.f27057a, this.f27065j, this.f27066k, this.f27067l, this.f27068m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f27063h - this.f27061f, this.f27067l - this.f27065j);
            int iMax2 = Math.max(this.f27064i - this.f27062g, this.f27068m - this.f27066k);
            int i10 = z10 ? this.f27065j : this.f27061f;
            int i11 = z10 ? this.f27066k : this.f27062g;
            i0.d(this.f27057a, i10, i11, iMax + i10, iMax2 + i11);
            this.f27057a.setClipBounds(z10 ? this.f27059d : this.b);
        }
    }

    public static class h extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27070a = false;
        public final ViewGroup b;

        public h(@NonNull ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // o5.x, o5.q.h
        public void a(@NonNull q qVar) {
            h0.b(this.b, false);
            this.f27070a = true;
        }

        @Override // o5.x, o5.q.h
        public void b(@NonNull q qVar) {
            h0.b(this.b, true);
        }

        @Override // o5.x, o5.q.h
        public void d(@NonNull q qVar) {
            h0.b(this.b, false);
        }

        @Override // o5.x, o5.q.h
        public void k(@NonNull q qVar) {
            if (!this.f27070a) {
                h0.b(this.b, false);
            }
            qVar.m0(this);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27071a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27072c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27073d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final View f27074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f27075f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f27076g;

        public i(View view) {
            this.f27074e = view;
        }

        public void a(PointF pointF) {
            this.f27072c = Math.round(pointF.x);
            this.f27073d = Math.round(pointF.y);
            int i10 = this.f27076g + 1;
            this.f27076g = i10;
            if (this.f27075f == i10) {
                b();
            }
        }

        public final void b() {
            i0.d(this.f27074e, this.f27071a, this.b, this.f27072c, this.f27073d);
            this.f27075f = 0;
            this.f27076g = 0;
        }

        public void c(PointF pointF) {
            this.f27071a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i10 = this.f27075f + 1;
            this.f27075f = i10;
            if (i10 == this.f27076g) {
                b();
            }
        }
    }

    public final void B0(d0 d0Var) {
        View view = d0Var.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        d0Var.f27089a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        d0Var.f27089a.put("android:changeBounds:parent", d0Var.b.getParent());
        if (this.Q) {
            d0Var.f27089a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // o5.q
    @NonNull
    public String[] V() {
        return R;
    }

    @Override // o5.q
    public boolean Y() {
        return true;
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        B0(d0Var);
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        Rect rect;
        B0(d0Var);
        if (!this.Q || (rect = (Rect) d0Var.b.getTag(l.b)) == null) {
            return;
        }
        d0Var.f27089a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o5.q
    public Animator s(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        int i10;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (d0Var == null || d0Var2 == null) {
            return null;
        }
        Map<String, Object> map = d0Var.f27089a;
        Map<String, Object> map2 = d0Var2.f27089a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = d0Var2.b;
        Rect rect2 = (Rect) d0Var.f27089a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) d0Var2.f27089a.get("android:changeBounds:bounds");
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
        Rect rect4 = (Rect) d0Var.f27089a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) d0Var2.f27089a.get("android:changeBounds:clip");
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
            N().c(new h(viewGroup4));
        }
        return animatorC;
    }
}
