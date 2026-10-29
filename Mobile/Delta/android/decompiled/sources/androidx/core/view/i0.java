package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f1872a;

    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f1873a;

        public a(View view) {
            this.f1873a = view;
        }

        @Override // androidx.core.view.i0.c
        public void a() {
            View view = this.f1873a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f1873a.getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.i0.c
        public void b() {
            final View viewFindViewById = this.f1873a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f1873a.getRootView().findViewById(R.id.content);
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

    public static class c {
        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }
    }

    public i0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1872a = new b(view);
        } else {
            this.f1872a = new a(view);
        }
    }

    public void a() {
        this.f1872a.a();
    }

    public void b() {
        this.f1872a.b();
    }

    public static class b extends a {
        public View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WindowInsetsController f1874c;

        public b(View view) {
            super(view);
            this.b = view;
        }

        @Override // androidx.core.view.i0.a, androidx.core.view.i0.c
        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f1874c;
            if (windowInsetsController == null) {
                View view2 = this.b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
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
            if (!atomicBoolean.get() && (view = this.b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // androidx.core.view.i0.a, androidx.core.view.i0.c
        public void b() {
            View view = this.b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f1874c;
            if (windowInsetsController == null) {
                View view2 = this.b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f1874c = windowInsetsController;
        }
    }

    @Deprecated
    public i0(WindowInsetsController windowInsetsController) {
        this.f1872a = new b(windowInsetsController);
    }
}
