package o5;

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
        public final View f27140a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ViewGroup f27141c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f27142d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f27143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f27144f = false;

        public a(View view, int i10, boolean z10) {
            this.f27140a = view;
            this.b = i10;
            this.f27141c = (ViewGroup) view.getParent();
            this.f27142d = z10;
            e(true);
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
            e(true);
            if (this.f27144f) {
                return;
            }
            i0.f(this.f27140a, 0);
        }

        public final void c() {
            if (!this.f27144f) {
                i0.f(this.f27140a, this.b);
                ViewGroup viewGroup = this.f27141c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            e(false);
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
            e(false);
            if (this.f27144f) {
                return;
            }
            i0.f(this.f27140a, this.b);
        }

        public final void e(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f27142d || this.f27143e == z10 || (viewGroup = this.f27141c) == null) {
                return;
            }
            this.f27143e = z10;
            h0.b(viewGroup, z10);
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
            qVar.m0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27144f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c();
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
            c();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                i0.f(this.f27140a, 0);
                ViewGroup viewGroup = this.f27141c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter implements q.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f27145a;
        public final View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f27146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f27147d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f27145a = viewGroup;
            this.b = view;
            this.f27146c = view2;
        }

        @Override // o5.q.h
        public void a(@NonNull q qVar) {
            if (this.f27147d) {
                c();
            }
        }

        @Override // o5.q.h
        public void b(@NonNull q qVar) {
        }

        public final void c() {
            this.f27146c.setTag(l.f27126a, null);
            this.f27145a.getOverlay().remove(this.b);
            this.f27147d = false;
        }

        @Override // o5.q.h
        public void d(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void g(@NonNull q qVar) {
        }

        @Override // o5.q.h
        public void k(@NonNull q qVar) {
            qVar.m0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f27145a.getOverlay().remove(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.b.getParent() == null) {
                this.f27145a.getOverlay().add(this.b);
            } else {
                o0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                this.f27146c.setTag(l.f27126a, this.b);
                this.f27145a.getOverlay().add(this.b);
                this.f27147d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            c();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f27149a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f27151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ViewGroup f27152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ViewGroup f27153f;
    }

    private void B0(d0 d0Var) {
        d0Var.f27089a.put("android:visibility:visibility", Integer.valueOf(d0Var.b.getVisibility()));
        d0Var.f27089a.put("android:visibility:parent", d0Var.b.getParent());
        int[] iArr = new int[2];
        d0Var.b.getLocationOnScreen(iArr);
        d0Var.f27089a.put("android:visibility:screenLocation", iArr);
    }

    public final c C0(d0 d0Var, d0 d0Var2) {
        c cVar = new c();
        cVar.f27149a = false;
        cVar.b = false;
        if (d0Var == null || !d0Var.f27089a.containsKey("android:visibility:visibility")) {
            cVar.f27150c = -1;
            cVar.f27152e = null;
        } else {
            cVar.f27150c = ((Integer) d0Var.f27089a.get("android:visibility:visibility")).intValue();
            cVar.f27152e = (ViewGroup) d0Var.f27089a.get("android:visibility:parent");
        }
        if (d0Var2 == null || !d0Var2.f27089a.containsKey("android:visibility:visibility")) {
            cVar.f27151d = -1;
            cVar.f27153f = null;
        } else {
            cVar.f27151d = ((Integer) d0Var2.f27089a.get("android:visibility:visibility")).intValue();
            cVar.f27153f = (ViewGroup) d0Var2.f27089a.get("android:visibility:parent");
        }
        if (d0Var != null && d0Var2 != null) {
            int i10 = cVar.f27150c;
            int i11 = cVar.f27151d;
            if (i10 != i11 || cVar.f27152e != cVar.f27153f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.b = false;
                        cVar.f27149a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.b = true;
                        cVar.f27149a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f27153f == null) {
                        cVar.b = false;
                        cVar.f27149a = true;
                        return cVar;
                    }
                    if (cVar.f27152e == null) {
                        cVar.b = true;
                        cVar.f27149a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (d0Var == null && cVar.f27151d == 0) {
                cVar.b = true;
                cVar.f27149a = true;
                return cVar;
            }
            if (d0Var2 == null && cVar.f27150c == 0) {
                cVar.b = false;
                cVar.f27149a = true;
            }
        }
        return cVar;
    }

    public abstract Animator D0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2);

    public Animator E0(@NonNull ViewGroup viewGroup, d0 d0Var, int i10, d0 d0Var2, int i11) {
        if ((this.Q & 1) != 1 || d0Var2 == null) {
            return null;
        }
        if (d0Var == null) {
            View view = (View) d0Var2.b.getParent();
            if (C0(E(view, false), W(view, false)).f27149a) {
                return null;
            }
        }
        return D0(viewGroup, d0Var2.b, d0Var, d0Var2);
    }

    public abstract Animator F0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2);

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public Animator G0(@NonNull ViewGroup viewGroup, d0 d0Var, int i10, d0 d0Var2, int i11) {
        View view;
        boolean z10;
        View view2;
        boolean z11;
        if ((this.Q & 2) != 2 || d0Var == null) {
            return null;
        }
        View view3 = d0Var.b;
        View viewA = d0Var2 != null ? d0Var2.b : null;
        int i12 = l.f27126a;
        View view4 = (View) view3.getTag(i12);
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
                        if (C0(W(view5, true), E(view5, true)).f27149a) {
                            int id2 = view5.getId();
                            if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.f27178w) {
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
            Animator animatorF0 = F0(viewGroup, view2, d0Var, d0Var2);
            if (animatorF0 == null) {
                i0.f(view2, visibility);
                return animatorF0;
            }
            a aVar = new a(view2, i11, true);
            animatorF0.addListener(aVar);
            N().c(aVar);
            return animatorF0;
        }
        if (!z11) {
            int[] iArr = (int[]) d0Var.f27089a.get("android:visibility:screenLocation");
            int i13 = iArr[0];
            int i14 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i13 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i14 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorF1 = F0(viewGroup, view4, d0Var, d0Var2);
        if (!z11) {
            if (animatorF1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorF1;
            }
            view3.setTag(i12, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorF1.addListener(bVar);
            animatorF1.addPauseListener(bVar);
            N().c(bVar);
        }
        return animatorF1;
    }

    public void H0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.Q = i10;
    }

    @Override // o5.q
    public String[] V() {
        return R;
    }

    @Override // o5.q
    public boolean Z(d0 d0Var, d0 d0Var2) {
        if (d0Var == null && d0Var2 == null) {
            return false;
        }
        if (d0Var != null && d0Var2 != null && d0Var2.f27089a.containsKey("android:visibility:visibility") != d0Var.f27089a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarC0 = C0(d0Var, d0Var2);
        return cVarC0.f27149a && (cVarC0.f27150c == 0 || cVarC0.f27151d == 0);
    }

    @Override // o5.q
    public void j(@NonNull d0 d0Var) {
        B0(d0Var);
    }

    @Override // o5.q
    public void o(@NonNull d0 d0Var) {
        B0(d0Var);
    }

    @Override // o5.q
    public Animator s(@NonNull ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        c cVarC0 = C0(d0Var, d0Var2);
        if (!cVarC0.f27149a) {
            return null;
        }
        if (cVarC0.f27152e == null && cVarC0.f27153f == null) {
            return null;
        }
        return cVarC0.b ? E0(viewGroup, d0Var, cVarC0.f27150c, d0Var2, cVarC0.f27151d) : G0(viewGroup, d0Var, cVarC0.f27150c, d0Var2, cVarC0.f27151d);
    }
}
