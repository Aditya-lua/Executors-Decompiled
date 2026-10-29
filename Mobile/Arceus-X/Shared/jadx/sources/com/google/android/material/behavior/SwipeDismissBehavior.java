package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0625o0;
import p400r3.C10782c;
import p564y2.C13017p;
import p564y2.InterfaceC13020s;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0524c<V> {

    /* JADX INFO: renamed from: a */
    public C10782c f9632a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2738c f9633b;

    /* JADX INFO: renamed from: c */
    public boolean f9634c;

    /* JADX INFO: renamed from: d */
    public boolean f9635d;

    /* JADX INFO: renamed from: f */
    public boolean f9637f;

    /* JADX INFO: renamed from: e */
    public float f9636e = 0.0f;

    /* JADX INFO: renamed from: g */
    public int f9638g = 2;

    /* JADX INFO: renamed from: h */
    public float f9639h = 0.5f;

    /* JADX INFO: renamed from: i */
    public float f9640i = 0.0f;

    /* JADX INFO: renamed from: j */
    public float f9641j = 0.5f;

    /* JADX INFO: renamed from: k */
    public final C10782c.c f9642k = new C2736a();

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C2736a extends C10782c.c {

        /* JADX INFO: renamed from: a */
        public int f9643a;

        /* JADX INFO: renamed from: b */
        public int f9644b = -1;

        public C2736a() {
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: a */
        public int mo12015a(@NonNull View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = C0625o0.m3065z(view) == 1;
            int i12 = SwipeDismissBehavior.this.f9638g;
            if (i12 == 0) {
                if (z10) {
                    width = this.f9643a - view.getWidth();
                    width2 = this.f9643a;
                } else {
                    width = this.f9643a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f9643a - view.getWidth();
                width2 = view.getWidth() + this.f9643a;
            } else if (z10) {
                width = this.f9643a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f9643a - view.getWidth();
                width2 = this.f9643a;
            }
            return SwipeDismissBehavior.m12006L(width, i10, width2);
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: b */
        public int mo12016b(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: d */
        public int mo12017d(@NonNull View view) {
            return view.getWidth();
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: i */
        public void mo12018i(@NonNull View view, int i10) {
            this.f9644b = i10;
            this.f9643a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f9635d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f9635d = false;
            }
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: j */
        public void mo12019j(int i10) {
            InterfaceC2738c interfaceC2738c = SwipeDismissBehavior.this.f9633b;
            if (interfaceC2738c != null) {
                interfaceC2738c.mo12025b(i10);
            }
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: k */
        public void mo12020k(@NonNull View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f9640i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f9641j;
            float fAbs = Math.abs(i10 - this.f9643a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m12005K(0.0f, 1.0f - SwipeDismissBehavior.m12007N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: l */
        public void mo12021l(@NonNull View view, float f10, float f11) {
            int i10;
            boolean z10;
            InterfaceC2738c interfaceC2738c;
            this.f9644b = -1;
            int width = view.getWidth();
            if (m12023n(view, f10)) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i11 = this.f9643a;
                    if (left < i11) {
                        i10 = this.f9643a - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f9643a - width;
                }
                z10 = true;
            } else {
                i10 = this.f9643a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f9632a.m41074F(i10, view.getTop())) {
                C0625o0.m3024e0(view, new RunnableC2739d(view, z10));
            } else {
                if (!z10 || (interfaceC2738c = SwipeDismissBehavior.this.f9633b) == null) {
                    return;
                }
                interfaceC2738c.mo12024a(view);
            }
        }

        @Override // p400r3.C10782c.c
        /* JADX INFO: renamed from: m */
        public boolean mo12022m(View view, int i10) {
            int i11 = this.f9644b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.mo12008J(view);
        }

        /* JADX INFO: renamed from: n */
        public final boolean m12023n(@NonNull View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f9643a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f9639h);
            }
            boolean z10 = C0625o0.m3065z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f9638g;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    return f10 < 0.0f;
                }
                return f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class C2737b implements InterfaceC13020s {
        public C2737b() {
        }

        @Override // p564y2.InterfaceC13020s
        /* JADX INFO: renamed from: a */
        public boolean mo6223a(@NonNull View view, InterfaceC13020s.a aVar) {
            if (!SwipeDismissBehavior.this.mo12008J(view)) {
                return false;
            }
            boolean z10 = C0625o0.m3065z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f9638g;
            C0625o0.m3011W(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            InterfaceC2738c interfaceC2738c = SwipeDismissBehavior.this.f9633b;
            if (interfaceC2738c != null) {
                interfaceC2738c.mo12024a(view);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface InterfaceC2738c {
        /* JADX INFO: renamed from: a */
        void mo12024a(View view);

        /* JADX INFO: renamed from: b */
        void mo12025b(int i10);
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    public class RunnableC2739d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final View f9647a;

        /* JADX INFO: renamed from: b */
        public final boolean f9648b;

        public RunnableC2739d(View view, boolean z10) {
            this.f9647a = view;
            this.f9648b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2738c interfaceC2738c;
            C10782c c10782c = SwipeDismissBehavior.this.f9632a;
            if (c10782c != null && c10782c.m41088k(true)) {
                C0625o0.m3024e0(this.f9647a, this);
            } else {
                if (!this.f9648b || (interfaceC2738c = SwipeDismissBehavior.this.f9633b) == null) {
                    return;
                }
                interfaceC2738c.mo12024a(this.f9647a);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static float m12005K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    /* JADX INFO: renamed from: L */
    public static int m12006L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    /* JADX INFO: renamed from: N */
    public static float m12007N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: H */
    public boolean mo2604H(CoordinatorLayout coordinatorLayout, V v5, MotionEvent motionEvent) {
        if (this.f9632a == null) {
            return false;
        }
        if (this.f9635d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f9632a.m41101z(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: J */
    public boolean mo12008J(@NonNull View view) {
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final void m12009M(ViewGroup viewGroup) {
        if (this.f9632a == null) {
            this.f9632a = this.f9637f ? C10782c.m41067l(viewGroup, this.f9636e, this.f9642k) : C10782c.m41068m(viewGroup, this.f9642k);
        }
    }

    /* JADX INFO: renamed from: O */
    public void m12010O(float f10) {
        this.f9641j = m12005K(0.0f, f10, 1.0f);
    }

    /* JADX INFO: renamed from: P */
    public void m12011P(InterfaceC2738c interfaceC2738c) {
        this.f9633b = interfaceC2738c;
    }

    /* JADX INFO: renamed from: Q */
    public void m12012Q(float f10) {
        this.f9640i = m12005K(0.0f, f10, 1.0f);
    }

    /* JADX INFO: renamed from: R */
    public void m12013R(int i10) {
        this.f9638g = i10;
    }

    /* JADX INFO: renamed from: S */
    public final void m12014S(View view) {
        C0625o0.m3028g0(view, 1048576);
        if (mo12008J(view)) {
            C0625o0.m3032i0(view, C13017p.a.f46083y, null, new C2737b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: o */
    public boolean mo2615o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, @NonNull MotionEvent motionEvent) {
        boolean zM2558B = this.f9634c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM2558B = coordinatorLayout.m2558B(v5, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f9634c = zM2558B;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f9634c = false;
        }
        if (zM2558B) {
            m12009M(coordinatorLayout);
            if (!this.f9635d && this.f9632a.m41075G(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
    /* JADX INFO: renamed from: p */
    public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v5, int i10) {
        boolean zMo2616p = super.mo2616p(coordinatorLayout, v5, i10);
        if (C0625o0.m3061x(v5) == 0) {
            C0625o0.m3060w0(v5, 1);
            m12014S(v5);
        }
        return zMo2616p;
    }
}
