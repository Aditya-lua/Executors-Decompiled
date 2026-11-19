package p5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 extends q {
    public static final String[] R = {"android:visibility:visibility", "android:visibility:parent"};
    public int Q = 3;

    public static class a extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28876a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f28877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f28878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f28879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f28880f = false;

        public a(View view, int i10, boolean z10) {
            this.f28876a = view;
            this.b = i10;
            this.f28877c = (ViewGroup) view.getParent();
            this.f28878d = z10;
            d(true);
        }

        public final void a() {
            if (!this.f28880f) {
                i0.f(this.f28876a, this.b);
                ViewGroup viewGroup = this.f28877c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            d(false);
        }

        @Override // p5.q.h
        public void b(@NonNull q qVar) {
            qVar.q0(this);
        }

        @Override // p5.q.h
        public void c(@NonNull q qVar) {
        }

        public final void d(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f28878d || this.f28879e == z10 || (viewGroup = this.f28877c) == null) {
                return;
            }
            this.f28879e = z10;
            h0.b(viewGroup, z10);
        }

        @Override // p5.q.h
        public void f(@NonNull q qVar) {
            d(false);
            if (this.f28880f) {
                return;
            }
            i0.f(this.f28876a, this.b);
        }

        @Override // p5.q.h
        public void h(@NonNull q qVar) {
            d(true);
            if (this.f28880f) {
                return;
            }
            i0.f(this.f28876a, 0);
        }

        @Override // p5.q.h
        public void k(@NonNull q qVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f28880f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                i0.f(this.f28876a, 0);
                ViewGroup viewGroup = this.f28877c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f28881a;
        public final View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f28882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f28883d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f28881a = viewGroup;
            this.b = view;
            this.f28882c = view2;
        }

        public final void a() {
            this.f28882c.setTag(l.f28862a, null);
            this.f28881a.getOverlay().remove(this.b);
            this.f28883d = false;
        }

        @Override // p5.q.h
        public void b(@NonNull q qVar) {
            qVar.q0(this);
        }

        @Override // p5.q.h
        public void c(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void f(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void h(@NonNull q qVar) {
        }

        @Override // p5.q.h
        public void k(@NonNull q qVar) {
            if (this.f28883d) {
                a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f28881a.getOverlay().remove(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.b.getParent() == null) {
                this.f28881a.getOverlay().add(this.b);
            } else {
                o0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                this.f28882c.setTag(l.f28862a, this.b);
                this.f28881a.getOverlay().add(this.b);
                this.f28883d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f28885a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28887d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f28888e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f28889f;
    }

    private void F0(d0 d0Var) {
        d0Var.f28825a.put("android:visibility:visibility", Integer.valueOf(d0Var.b.getVisibility()));
        d0Var.f28825a.put("android:visibility:parent", d0Var.b.getParent());
        int[] iArr = new int[2];
        d0Var.b.getLocationOnScreen(iArr);
        d0Var.f28825a.put("android:visibility:screenLocation", iArr);
    }

    public final c G0(d0 d0Var, d0 d0Var2) {
        c cVar = new c();
        cVar.f28885a = false;
        cVar.b = false;
        if (d0Var == null || !d0Var.f28825a.containsKey("android:visibility:visibility")) {
            cVar.f28886c = -1;
            cVar.f28888e = null;
        } else {
            cVar.f28886c = ((Integer) d0Var.f28825a.get("android:visibility:visibility")).intValue();
            cVar.f28888e = (ViewGroup) d0Var.f28825a.get("android:visibility:parent");
        }
        if (d0Var2 == null || !d0Var2.f28825a.containsKey("android:visibility:visibility")) {
            cVar.f28887d = -1;
            cVar.f28889f = null;
        } else {
            cVar.f28887d = ((Integer) d0Var2.f28825a.get("android:visibility:visibility")).intValue();
            cVar.f28889f = (ViewGroup) d0Var2.f28825a.get("android:visibility:parent");
        }
        if (d0Var != null && d0Var2 != null) {
            int i10 = cVar.f28886c;
            int i11 = cVar.f28887d;
            if (i10 != i11 || cVar.f28888e != cVar.f28889f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.b = false;
                        cVar.f28885a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.b = true;
                        cVar.f28885a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f28889f == null) {
                        cVar.b = false;
                        cVar.f28885a = true;
                        return cVar;
                    }
                    if (cVar.f28888e == null) {
                        cVar.b = true;
                        cVar.f28885a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (d0Var == null && cVar.f28887d == 0) {
                cVar.b = true;
                cVar.f28885a = true;
                return cVar;
            }
            if (d0Var2 == null && cVar.f28886c == 0) {
                cVar.b = false;
                cVar.f28885a = true;
            }
        }
        return cVar;
    }

    public abstract Animator H0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2);

    public Animator I0(@NonNull ViewGroup viewGroup, d0 d0Var, int i10, d0 d0Var2, int i11) {
        if ((this.Q & 1) != 1 || d0Var2 == null) {
            return null;
        }
        if (d0Var == null) {
            View view = (View) d0Var2.b.getParent();
            if (G0(G(view, false), Z(view, false)).f28885a) {
                return null;
            }
        }
        return H0(viewGroup, d0Var2.b, d0Var, d0Var2);
    }

    public abstract Animator J0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2);

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator K0(@NonNull ViewGroup viewGroup, d0 d0Var, int i10, d0 d0Var2, int i11) {
        View view;
        boolean z10;
        View view2;
        boolean z11;
        if ((this.Q & 2) != 2 || d0Var == null) {
            return null;
        }
        View view3 = d0Var.b;
        View viewA = d0Var2 != null ? d0Var2.b : null;
        View view4 = (View) view3.getTag(l.f28862a);
        if (view4 != null) {
            view2 = null;
            z11 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z10 = false;
                } else {
                    viewA = null;
                    view = null;
                    z10 = true;
                }
            } else if (i11 == 4 || view3 == viewA) {
                view = viewA;
                z10 = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z10 = true;
            }
            if (z10) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (G0(Z(view5, true), G(view5, true)).f28885a) {
                            int id2 = view5.getId();
                            if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.f28914w) {
                            }
                        } else {
                            viewA = c0.a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                    z11 = false;
                }
                view2 = view;
                z11 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewA;
                view2 = view7;
                z11 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            i0.f(view2, 0);
            Animator animatorJ0 = J0(viewGroup, view2, d0Var, d0Var2);
            if (animatorJ0 == null) {
                i0.f(view2, visibility);
                return animatorJ0;
            }
            a aVar = new a(view2, i11, true);
            animatorJ0.addListener(aVar);
            O().c(aVar);
            return animatorJ0;
        }
        if (!z11) {
            int[] iArr = (int[]) d0Var.f28825a.get("android:visibility:screenLocation");
            int i12 = iArr[0];
            int i13 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i12 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i13 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorJ1 = J0(viewGroup, view4, d0Var, d0Var2);
        if (!z11) {
            if (animatorJ1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorJ1;
            }
            view3.setTag(l.f28862a, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorJ1.addListener(bVar);
            animatorJ1.addPauseListener(bVar);
            O().c(bVar);
        }
        return animatorJ1;
    }

    public void L0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.Q = i10;
    }

    @Override // p5.q
    public String[] Y() {
        return R;
    }

    @Override // p5.q
    public boolean d0(d0 d0Var, d0 d0Var2) {
        if (d0Var == null && d0Var2 == null) {
            return false;
        }
        if (d0Var != null && d0Var2 != null && d0Var2.f28825a.containsKey("android:visibility:visibility") != d0Var.f28825a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarG0 = G0(d0Var, d0Var2);
        return cVarG0.f28885a && (cVarG0.f28886c == 0 || cVarG0.f28887d == 0);
    }

    @Override // p5.q
    public void l(@NonNull d0 d0Var) {
        F0(d0Var);
    }

    @Override // p5.q
    public void q(@NonNull d0 d0Var) {
        F0(d0Var);
    }

    @Override // p5.q
    public Animator u(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        c cVarG0 = G0(d0Var, d0Var2);
        if (!cVarG0.f28885a) {
            return null;
        }
        if (cVarG0.f28888e == null && cVarG0.f28889f == null) {
            return null;
        }
        return cVarG0.b ? I0(viewGroup, d0Var, cVarG0.f28886c, d0Var2, cVarG0.f28887d) : K0(viewGroup, d0Var, cVarG0.f28886c, d0Var2, cVarG0.f28887d);
    }
}
