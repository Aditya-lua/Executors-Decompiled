package p322o5;

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

/* JADX INFO: renamed from: o5.b */
/* JADX INFO: loaded from: classes.dex */
public class C9653b extends AbstractC9683q {

    /* JADX INFO: renamed from: R */
    public static final String[] f34985R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: S */
    public static final Property<i, PointF> f34986S = new a(PointF.class, "topLeft");

    /* JADX INFO: renamed from: T */
    public static final Property<i, PointF> f34987T = new b(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: U */
    public static final Property<View, PointF> f34988U = new c(PointF.class, "bottomRight");

    /* JADX INFO: renamed from: V */
    public static final Property<View, PointF> f34989V = new d(PointF.class, "topLeft");

    /* JADX INFO: renamed from: W */
    public static final Property<View, PointF> f34990W = new e(PointF.class, "position");

    /* JADX INFO: renamed from: X */
    public static final C9675m f34991X = new C9675m();

    /* JADX INFO: renamed from: Q */
    public boolean f34992Q = false;

    /* JADX INFO: renamed from: o5.b$a */
    public class a extends Property<i, PointF> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.m38112c(pointF);
        }
    }

    /* JADX INFO: renamed from: o5.b$b */
    public class b extends Property<i, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.m38110a(pointF);
        }
    }

    /* JADX INFO: renamed from: o5.b$c */
    public class c extends Property<View, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C9668i0.m38192d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: o5.b$d */
    public class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C9668i0.m38192d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* JADX INFO: renamed from: o5.b$e */
    public class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            C9668i0.m38192d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* JADX INFO: renamed from: o5.b$f */
    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i f34993a;
        private final i mViewBounds;

        public f(i iVar) {
            this.f34993a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* JADX INFO: renamed from: o5.b$g */
    public static class g extends AnimatorListenerAdapter implements AbstractC9683q.h {

        /* JADX INFO: renamed from: a */
        public final View f34995a;

        /* JADX INFO: renamed from: b */
        public final Rect f34996b;

        /* JADX INFO: renamed from: c */
        public final boolean f34997c;

        /* JADX INFO: renamed from: d */
        public final Rect f34998d;

        /* JADX INFO: renamed from: e */
        public final boolean f34999e;

        /* JADX INFO: renamed from: f */
        public final int f35000f;

        /* JADX INFO: renamed from: g */
        public final int f35001g;

        /* JADX INFO: renamed from: h */
        public final int f35002h;

        /* JADX INFO: renamed from: i */
        public final int f35003i;

        /* JADX INFO: renamed from: j */
        public final int f35004j;

        /* JADX INFO: renamed from: k */
        public final int f35005k;

        /* JADX INFO: renamed from: l */
        public final int f35006l;

        /* JADX INFO: renamed from: m */
        public final int f35007m;

        /* JADX INFO: renamed from: n */
        public boolean f35008n;

        public g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f34995a = view;
            this.f34996b = rect;
            this.f34997c = z10;
            this.f34998d = rect2;
            this.f34999e = z11;
            this.f35000f = i10;
            this.f35001g = i11;
            this.f35002h = i12;
            this.f35003i = i13;
            this.f35004j = i14;
            this.f35005k = i15;
            this.f35006l = i16;
            this.f35007m = i17;
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
            this.f35008n = true;
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
            View view = this.f34995a;
            int i10 = C9673l.f35095b;
            Rect rect = (Rect) view.getTag(i10);
            this.f34995a.setTag(i10, null);
            this.f34995a.setClipBounds(rect);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
            this.f34995a.setTag(C9673l.f35095b, this.f34995a.getClipBounds());
            this.f34995a.setClipBounds(this.f34999e ? null : this.f34998d);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f35008n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f34997c) {
                    rect = this.f34996b;
                }
            } else if (!this.f34999e) {
                rect = this.f34998d;
            }
            this.f34995a.setClipBounds(rect);
            if (z10) {
                C9668i0.m38192d(this.f34995a, this.f35000f, this.f35001g, this.f35002h, this.f35003i);
            } else {
                C9668i0.m38192d(this.f34995a, this.f35004j, this.f35005k, this.f35006l, this.f35007m);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f35002h - this.f35000f, this.f35006l - this.f35004j);
            int iMax2 = Math.max(this.f35003i - this.f35001g, this.f35007m - this.f35005k);
            int i10 = z10 ? this.f35004j : this.f35000f;
            int i11 = z10 ? this.f35005k : this.f35001g;
            C9668i0.m38192d(this.f34995a, i10, i11, iMax + i10, iMax2 + i11);
            this.f34995a.setClipBounds(z10 ? this.f34998d : this.f34996b);
        }
    }

    /* JADX INFO: renamed from: o5.b$h */
    public static class h extends C9690x {

        /* JADX INFO: renamed from: a */
        public boolean f35009a = false;

        /* JADX INFO: renamed from: b */
        public final ViewGroup f35010b;

        public h(@NonNull ViewGroup viewGroup) {
            this.f35010b = viewGroup;
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
            C9666h0.m38185b(this.f35010b, false);
            this.f35009a = true;
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
            C9666h0.m38185b(this.f35010b, true);
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
            C9666h0.m38185b(this.f35010b, false);
        }

        @Override // p322o5.C9690x, p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
            if (!this.f35009a) {
                C9666h0.m38185b(this.f35010b, false);
            }
            abstractC9683q.mo38133m0(this);
        }
    }

    /* JADX INFO: renamed from: o5.b$i */
    public static class i {

        /* JADX INFO: renamed from: a */
        public int f35011a;

        /* JADX INFO: renamed from: b */
        public int f35012b;

        /* JADX INFO: renamed from: c */
        public int f35013c;

        /* JADX INFO: renamed from: d */
        public int f35014d;

        /* JADX INFO: renamed from: e */
        public final View f35015e;

        /* JADX INFO: renamed from: f */
        public int f35016f;

        /* JADX INFO: renamed from: g */
        public int f35017g;

        public i(View view) {
            this.f35015e = view;
        }

        /* JADX INFO: renamed from: a */
        public void m38110a(PointF pointF) {
            this.f35013c = Math.round(pointF.x);
            this.f35014d = Math.round(pointF.y);
            int i10 = this.f35017g + 1;
            this.f35017g = i10;
            if (this.f35016f == i10) {
                m38111b();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m38111b() {
            C9668i0.m38192d(this.f35015e, this.f35011a, this.f35012b, this.f35013c, this.f35014d);
            this.f35016f = 0;
            this.f35017g = 0;
        }

        /* JADX INFO: renamed from: c */
        public void m38112c(PointF pointF) {
            this.f35011a = Math.round(pointF.x);
            this.f35012b = Math.round(pointF.y);
            int i10 = this.f35016f + 1;
            this.f35016f = i10;
            if (i10 == this.f35017g) {
                m38111b();
            }
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final void m38089B0(C9658d0 c9658d0) {
        View view = c9658d0.f35045b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        c9658d0.f35044a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        c9658d0.f35044a.put("android:changeBounds:parent", c9658d0.f35045b.getParent());
        if (this.f34992Q) {
            c9658d0.f35044a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // p322o5.AbstractC9683q
    @NonNull
    /* JADX INFO: renamed from: V */
    public String[] mo38090V() {
        return f34985R;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: Y */
    public boolean mo38091Y() {
        return true;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: j */
    public void mo38092j(@NonNull C9658d0 c9658d0) {
        m38089B0(c9658d0);
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: o */
    public void mo38093o(@NonNull C9658d0 c9658d0) {
        Rect rect;
        m38089B0(c9658d0);
        if (!this.f34992Q || (rect = (Rect) c9658d0.f35045b.getTag(C9673l.f35095b)) == null) {
            return;
        }
        c9658d0.f35044a.put("android:changeBounds:clip", rect);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: s */
    public Animator mo38094s(@NonNull ViewGroup viewGroup, C9658d0 c9658d0, C9658d0 c9658d1) {
        int i10;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorM38152c;
        if (c9658d0 == null || c9658d1 == null) {
            return null;
        }
        Map<String, Object> map = c9658d0.f35044a;
        Map<String, Object> map2 = c9658d1.f35044a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = c9658d1.f35045b;
        Rect rect2 = (Rect) c9658d0.f35044a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) c9658d1.f35044a.get("android:changeBounds:bounds");
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
        Rect rect4 = (Rect) c9658d0.f35044a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) c9658d1.f35044a.get("android:changeBounds:clip");
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
        if (this.f34992Q) {
            C9668i0.m38192d(view, i12, i14, Math.max(i20, i22) + i12, i14 + Math.max(i21, i23));
            ObjectAnimator objectAnimatorM38201a = (i12 == i13 && i14 == i15) ? null : C9669j.m38201a(view, f34990W, m38259J().mo38213a(i12, i14, i13, i15));
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
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f34991X, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i25, i12, i14, i16, i18, i13, i15, i17, i19);
                objectAnimatorOfObject.addListener(gVar);
                mo38129c(gVar);
            }
            animatorM38152c = C9656c0.m38152c(objectAnimatorM38201a, objectAnimatorOfObject);
        } else {
            C9668i0.m38192d(view, i12, i14, i16, i18);
            if (i24 != 2) {
                animatorM38152c = (i12 == i13 && i14 == i15) ? C9669j.m38201a(view, f34988U, m38259J().mo38213a(i16, i18, i17, i19)) : C9669j.m38201a(view, f34989V, m38259J().mo38213a(i12, i14, i13, i15));
            } else if (i20 == i22 && i21 == i23) {
                animatorM38152c = C9669j.m38201a(view, f34990W, m38259J().mo38213a(i12, i14, i13, i15));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorM38201a2 = C9669j.m38201a(iVar, f34986S, m38259J().mo38213a(i12, i14, i13, i15));
                ObjectAnimator objectAnimatorM38201a3 = C9669j.m38201a(iVar, f34987T, m38259J().mo38213a(i16, i18, i17, i19));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM38201a2, objectAnimatorM38201a3);
                animatorSet.addListener(new f(iVar));
                animatorM38152c = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            C9666h0.m38185b(viewGroup4, true);
            m38261N().mo38129c(new h(viewGroup4));
        }
        return animatorM38152c;
    }
}
