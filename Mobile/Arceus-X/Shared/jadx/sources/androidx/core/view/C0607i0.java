package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.core.view.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0607i0 {

    /* JADX INFO: renamed from: a */
    public final c f2426a;

    /* JADX INFO: renamed from: androidx.core.view.i0$a */
    public static class a extends c {

        /* JADX INFO: renamed from: a */
        public final View f2427a;

        public a(View view) {
            this.f2427a = view;
        }

        @Override // androidx.core.view.C0607i0.c
        /* JADX INFO: renamed from: a */
        public void mo2912a() {
            View view = this.f2427a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2427a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.C0607i0.c
        /* JADX INFO: renamed from: b */
        public void mo2913b() {
            final View viewFindViewById = this.f2427a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f2427a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.h0
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.i0$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public void mo2912a() {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public void mo2913b() {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0607i0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2426a = new b(view);
        } else {
            this.f2426a = new a(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2909a() {
        this.f2426a.mo2912a();
    }

    /* JADX INFO: renamed from: b */
    public void m2910b() {
        this.f2426a.mo2913b();
    }

    /* JADX INFO: renamed from: androidx.core.view.i0$b */
    public static class b extends a {

        /* JADX INFO: renamed from: b */
        public View f2428b;

        /* JADX INFO: renamed from: c */
        public WindowInsetsController f2429c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(View view) {
            super(view);
            this.f2428b = view;
        }

        @Override // androidx.core.view.C0607i0.a, androidx.core.view.C0607i0.c
        /* JADX INFO: renamed from: a */
        public void mo2912a() {
            View view;
            WindowInsetsController windowInsetsController = this.f2429c;
            if (windowInsetsController == null) {
                View view2 = this.f2428b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.mo2912a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.j0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f2428b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f2428b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.C0607i0.a, androidx.core.view.C0607i0.c
        /* JADX INFO: renamed from: b */
        public void mo2913b() {
            View view = this.f2428b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f2429c;
            if (windowInsetsController == null) {
                View view2 = this.f2428b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.mo2913b();
        }

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f2429c = windowInsetsController;
        }
    }

    @Deprecated
    public C0607i0(WindowInsetsController windowInsetsController) {
        this.f2426a = new b(windowInsetsController);
    }
}
