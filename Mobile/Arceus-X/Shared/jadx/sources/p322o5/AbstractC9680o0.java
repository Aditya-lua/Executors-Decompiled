package p322o5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.o0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9680o0 extends AbstractC9683q {

    /* JADX INFO: renamed from: R */
    public static final String[] f35111R = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: Q */
    public int f35112Q = 3;

    /* JADX INFO: renamed from: o5.o0$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC9683q.h {

        /* JADX INFO: renamed from: a */
        public final View f35113a;

        /* JADX INFO: renamed from: b */
        public final int f35114b;

        /* JADX INFO: renamed from: c */
        public final ViewGroup f35115c;

        /* JADX INFO: renamed from: d */
        public final boolean f35116d;

        /* JADX INFO: renamed from: e */
        public boolean f35117e;

        /* JADX INFO: renamed from: f */
        public boolean f35118f = false;

        public a(View view, int i10, boolean z10) {
            this.f35113a = view;
            this.f35114b = i10;
            this.f35115c = (ViewGroup) view.getParent();
            this.f35116d = z10;
            m38237e(true);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
            m38237e(true);
            if (this.f35118f) {
                return;
            }
            C9668i0.m38194f(this.f35113a, 0);
        }

        /* JADX INFO: renamed from: c */
        public final void m38236c() {
            if (!this.f35118f) {
                C9668i0.m38194f(this.f35113a, this.f35114b);
                ViewGroup viewGroup = this.f35115c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m38237e(false);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
            m38237e(false);
            if (this.f35118f) {
                return;
            }
            C9668i0.m38194f(this.f35113a, this.f35114b);
        }

        /* JADX INFO: renamed from: e */
        public final void m38237e(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f35116d || this.f35117e == z10 || (viewGroup = this.f35115c) == null) {
                return;
            }
            this.f35117e = z10;
            C9666h0.m38185b(viewGroup, z10);
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
            abstractC9683q.mo38133m0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35118f = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m38236c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            m38236c();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                C9668i0.m38194f(this.f35113a, 0);
                ViewGroup viewGroup = this.f35115c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o5.o0$b */
    public class b extends AnimatorListenerAdapter implements AbstractC9683q.h {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f35119a;

        /* JADX INFO: renamed from: b */
        public final View f35120b;

        /* JADX INFO: renamed from: c */
        public final View f35121c;

        /* JADX INFO: renamed from: d */
        public boolean f35122d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f35119a = viewGroup;
            this.f35120b = view;
            this.f35121c = view2;
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: a */
        public void mo38105a(@NonNull AbstractC9683q abstractC9683q) {
            if (this.f35122d) {
                m38238c();
            }
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: b */
        public void mo38106b(@NonNull AbstractC9683q abstractC9683q) {
        }

        /* JADX INFO: renamed from: c */
        public final void m38238c() {
            this.f35121c.setTag(C9673l.f35094a, null);
            this.f35119a.getOverlay().remove(this.f35120b);
            this.f35122d = false;
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: d */
        public void mo38107d(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: g */
        public void mo38108g(@NonNull AbstractC9683q abstractC9683q) {
        }

        @Override // p322o5.AbstractC9683q.h
        /* JADX INFO: renamed from: k */
        public void mo38109k(@NonNull AbstractC9683q abstractC9683q) {
            abstractC9683q.mo38133m0(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m38238c();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f35119a.getOverlay().remove(this.f35120b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f35120b.getParent() == null) {
                this.f35119a.getOverlay().add(this.f35120b);
            } else {
                AbstractC9680o0.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                this.f35121c.setTag(C9673l.f35094a, this.f35120b);
                this.f35119a.getOverlay().add(this.f35120b);
                this.f35122d = true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            m38238c();
        }
    }

    /* JADX INFO: renamed from: o5.o0$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f35124a;

        /* JADX INFO: renamed from: b */
        public boolean f35125b;

        /* JADX INFO: renamed from: c */
        public int f35126c;

        /* JADX INFO: renamed from: d */
        public int f35127d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f35128e;

        /* JADX INFO: renamed from: f */
        public ViewGroup f35129f;
    }

    /* JADX INFO: renamed from: B0 */
    private void m38230B0(C9658d0 c9658d0) {
        c9658d0.f35044a.put("android:visibility:visibility", Integer.valueOf(c9658d0.f35045b.getVisibility()));
        c9658d0.f35044a.put("android:visibility:parent", c9658d0.f35045b.getParent());
        int[] iArr = new int[2];
        c9658d0.f35045b.getLocationOnScreen(iArr);
        c9658d0.f35044a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: C0 */
    public final c m38231C0(C9658d0 c9658d0, C9658d0 c9658d1) {
        c cVar = new c();
        cVar.f35124a = false;
        cVar.f35125b = false;
        if (c9658d0 == null || !c9658d0.f35044a.containsKey("android:visibility:visibility")) {
            cVar.f35126c = -1;
            cVar.f35128e = null;
        } else {
            cVar.f35126c = ((Integer) c9658d0.f35044a.get("android:visibility:visibility")).intValue();
            cVar.f35128e = (ViewGroup) c9658d0.f35044a.get("android:visibility:parent");
        }
        if (c9658d1 == null || !c9658d1.f35044a.containsKey("android:visibility:visibility")) {
            cVar.f35127d = -1;
            cVar.f35129f = null;
        } else {
            cVar.f35127d = ((Integer) c9658d1.f35044a.get("android:visibility:visibility")).intValue();
            cVar.f35129f = (ViewGroup) c9658d1.f35044a.get("android:visibility:parent");
        }
        if (c9658d0 != null && c9658d1 != null) {
            int i10 = cVar.f35126c;
            int i11 = cVar.f35127d;
            if (i10 != i11 || cVar.f35128e != cVar.f35129f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f35125b = false;
                        cVar.f35124a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f35125b = true;
                        cVar.f35124a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f35129f == null) {
                        cVar.f35125b = false;
                        cVar.f35124a = true;
                        return cVar;
                    }
                    if (cVar.f35128e == null) {
                        cVar.f35125b = true;
                        cVar.f35124a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (c9658d0 == null && cVar.f35127d == 0) {
                cVar.f35125b = true;
                cVar.f35124a = true;
                return cVar;
            }
            if (c9658d1 == null && cVar.f35126c == 0) {
                cVar.f35125b = false;
                cVar.f35124a = true;
            }
        }
        return cVar;
    }

    /* JADX INFO: renamed from: D0 */
    public abstract Animator mo38167D0(@NonNull ViewGroup viewGroup, @NonNull View view, C9658d0 c9658d0, C9658d0 c9658d1);

    /* JADX INFO: renamed from: E0 */
    public Animator m38232E0(@NonNull ViewGroup viewGroup, C9658d0 c9658d0, int i10, C9658d0 c9658d1, int i11) {
        if ((this.f35112Q & 1) != 1 || c9658d1 == null) {
            return null;
        }
        if (c9658d0 == null) {
            View view = (View) c9658d1.f35045b.getParent();
            if (m38231C0(m38257E(view, false), m38268W(view, false)).f35124a) {
                return null;
            }
        }
        return mo38167D0(viewGroup, c9658d1.f35045b, c9658d0, c9658d1);
    }

    /* JADX INFO: renamed from: F0 */
    public abstract Animator mo38168F0(@NonNull ViewGroup viewGroup, @NonNull View view, C9658d0 c9658d0, C9658d0 c9658d1);

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX INFO: renamed from: G0 */
    public Animator m38233G0(@NonNull ViewGroup viewGroup, C9658d0 c9658d0, int i10, C9658d0 c9658d1, int i11) {
        View view;
        boolean z10;
        View view2;
        boolean z11;
        if ((this.f35112Q & 2) != 2 || c9658d0 == null) {
            return null;
        }
        View view3 = c9658d0.f35045b;
        View viewM38150a = c9658d1 != null ? c9658d1.f35045b : null;
        int i12 = C9673l.f35094a;
        View view4 = (View) view3.getTag(i12);
        if (view4 != null) {
            view2 = null;
            z11 = true;
        } else {
            if (viewM38150a == null || viewM38150a.getParent() == null) {
                if (viewM38150a != null) {
                    view = null;
                    z10 = false;
                } else {
                    viewM38150a = null;
                    view = null;
                    z10 = true;
                }
            } else if (i11 == 4 || view3 == viewM38150a) {
                view = viewM38150a;
                z10 = false;
                viewM38150a = null;
            } else {
                viewM38150a = null;
                view = null;
                z10 = true;
            }
            if (z10) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (m38231C0(m38268W(view5, true), m38257E(view5, true)).f35124a) {
                            int id2 = view5.getId();
                            if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.f35179w) {
                            }
                        } else {
                            viewM38150a = C9656c0.m38150a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewM38150a;
                    view2 = view6;
                    z11 = false;
                }
                view2 = view;
                z11 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewM38150a;
                view2 = view7;
                z11 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            C9668i0.m38194f(view2, 0);
            Animator animatorMo38168F0 = mo38168F0(viewGroup, view2, c9658d0, c9658d1);
            if (animatorMo38168F0 == null) {
                C9668i0.m38194f(view2, visibility);
                return animatorMo38168F0;
            }
            a aVar = new a(view2, i11, true);
            animatorMo38168F0.addListener(aVar);
            m38261N().mo38129c(aVar);
            return animatorMo38168F0;
        }
        if (!z11) {
            int[] iArr = (int[]) c9658d0.f35044a.get("android:visibility:screenLocation");
            int i13 = iArr[0];
            int i14 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i13 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i14 - iArr2[1]) - view4.getTop());
            viewGroup.getOverlay().add(view4);
        }
        Animator animatorMo38168F1 = mo38168F0(viewGroup, view4, c9658d0, c9658d1);
        if (!z11) {
            if (animatorMo38168F1 == null) {
                viewGroup.getOverlay().remove(view4);
                return animatorMo38168F1;
            }
            view3.setTag(i12, view4);
            b bVar = new b(viewGroup, view4, view3);
            animatorMo38168F1.addListener(bVar);
            animatorMo38168F1.addPauseListener(bVar);
            m38261N().mo38129c(bVar);
        }
        return animatorMo38168F1;
    }

    /* JADX INFO: renamed from: H0 */
    public void m38234H0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f35112Q = i10;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: V */
    public String[] mo38090V() {
        return f35111R;
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: Z */
    public boolean mo38235Z(C9658d0 c9658d0, C9658d0 c9658d1) {
        if (c9658d0 == null && c9658d1 == null) {
            return false;
        }
        if (c9658d0 != null && c9658d1 != null && c9658d1.f35044a.containsKey("android:visibility:visibility") != c9658d0.f35044a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarM38231C0 = m38231C0(c9658d0, c9658d1);
        return cVarM38231C0.f35124a && (cVarM38231C0.f35126c == 0 || cVarM38231C0.f35127d == 0);
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: j */
    public void mo38092j(@NonNull C9658d0 c9658d0) {
        m38230B0(c9658d0);
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: o */
    public void mo38093o(@NonNull C9658d0 c9658d0) {
        m38230B0(c9658d0);
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: s */
    public Animator mo38094s(@NonNull ViewGroup viewGroup, C9658d0 c9658d0, C9658d0 c9658d1) {
        c cVarM38231C0 = m38231C0(c9658d0, c9658d1);
        if (!cVarM38231C0.f35124a) {
            return null;
        }
        if (cVarM38231C0.f35128e == null && cVarM38231C0.f35129f == null) {
            return null;
        }
        return cVarM38231C0.f35125b ? m38232E0(viewGroup, c9658d0, cVarM38231C0.f35126c, c9658d1, cVarM38231C0.f35127d) : m38233G0(viewGroup, c9658d0, cVarM38231C0.f35126c, c9658d1, cVarM38231C0.f35127d);
    }
}
