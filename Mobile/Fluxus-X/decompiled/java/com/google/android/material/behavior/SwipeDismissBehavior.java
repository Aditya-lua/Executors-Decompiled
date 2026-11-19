package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.o0;
import y2.p;
import y2.s;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s3.c f7451a;
    public c b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7453d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7455f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f7454e = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7456g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f7457h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f7458i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7459j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s3.c.AbstractC0615c f7460k = new a();

    public class a extends s3.c.AbstractC0615c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7461a;
        public int b = -1;

        public a() {
        }

        @Override // s3.c.AbstractC0615c
        public int a(@NonNull View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = o0.z(view) == 1;
            int i12 = SwipeDismissBehavior.this.f7456g;
            if (i12 == 0) {
                if (z10) {
                    width = this.f7461a - view.getWidth();
                    width2 = this.f7461a;
                } else {
                    width = this.f7461a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f7461a - view.getWidth();
                width2 = view.getWidth() + this.f7461a;
            } else if (z10) {
                width = this.f7461a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f7461a - view.getWidth();
                width2 = this.f7461a;
            }
            return SwipeDismissBehavior.L(width, i10, width2);
        }

        @Override // s3.c.AbstractC0615c
        public int b(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // s3.c.AbstractC0615c
        public int d(@NonNull View view) {
            return view.getWidth();
        }

        @Override // s3.c.AbstractC0615c
        public void i(@NonNull View view, int i10) {
            this.b = i10;
            this.f7461a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f7453d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f7453d = false;
            }
        }

        @Override // s3.c.AbstractC0615c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // s3.c.AbstractC0615c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f7458i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f7459j;
            float fAbs = Math.abs(i10 - this.f7461a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(0.0f, 1.0f - SwipeDismissBehavior.N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // s3.c.AbstractC0615c
        public void l(@NonNull View view, float f10, float f11) {
            int i10;
            boolean z10;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i11 = this.f7461a;
                    if (left < i11) {
                        i10 = this.f7461a - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f7461a - width;
                }
                z10 = true;
            } else {
                i10 = this.f7461a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f7451a.F(i10, view.getTop())) {
                o0.e0(view, new d(view, z10));
            } else {
                if (!z10 || (cVar = SwipeDismissBehavior.this.b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // s3.c.AbstractC0615c
        public boolean m(View view, int i10) {
            int i11 = this.b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.J(view);
        }

        public final boolean n(@NonNull View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f7461a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f7457h);
            }
            boolean z10 = o0.z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f7456g;
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

    public class b implements s {
        public b() {
        }

        @Override // y2.s
        public boolean a(@NonNull View view, s.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z10 = o0.z(view) == 1;
            int i10 = SwipeDismissBehavior.this.f7456g;
            o0.W(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f7464a;
        public final boolean b;

        public d(View view, boolean z10) {
            this.f7464a = view;
            this.b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            s3.c cVar2 = SwipeDismissBehavior.this.f7451a;
            if (cVar2 != null && cVar2.k(true)) {
                o0.e0(this.f7464a, this);
            } else {
                if (!this.b || (cVar = SwipeDismissBehavior.this.b) == null) {
                    return;
                }
                cVar.a(this.f7464a);
            }
        }
    }

    public static float K(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    public static int L(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    public static float N(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v8, MotionEvent motionEvent) {
        if (this.f7451a == null) {
            return false;
        }
        if (this.f7453d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f7451a.z(motionEvent);
        return true;
    }

    public boolean J(@NonNull View view) {
        return true;
    }

    public final void M(ViewGroup viewGroup) {
        if (this.f7451a == null) {
            this.f7451a = this.f7455f ? s3.c.l(viewGroup, this.f7454e, this.f7460k) : s3.c.m(viewGroup, this.f7460k);
        }
    }

    public void O(float f10) {
        this.f7459j = K(0.0f, f10, 1.0f);
    }

    public void P(c cVar) {
        this.b = cVar;
    }

    public void Q(float f10) {
        this.f7458i = K(0.0f, f10, 1.0f);
    }

    public void R(int i10) {
        this.f7456g = i10;
    }

    public final void S(View view) {
        o0.g0(view, 1048576);
        if (J(view)) {
            o0.i0(view, p.a.f37218y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, @NonNull MotionEvent motionEvent) {
        boolean zB = this.f7452c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(v8, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f7452c = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7452c = false;
        }
        if (zB) {
            M(coordinatorLayout);
            if (!this.f7453d && this.f7451a.G(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v8, int i10) {
        boolean zP = super.p(coordinatorLayout, v8, i10);
        if (o0.x(v8) == 0) {
            o0.w0(v8, 1);
            S(v8);
        }
        return zP;
    }
}
