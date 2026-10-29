package zc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.l1;
import androidx.core.view.o0;
import androidx.core.view.y;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    public class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f37442a;
        public final /* synthetic */ d b;

        public a(c cVar, d dVar) {
            this.f37442a = cVar;
            this.b = dVar;
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat K(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f37442a.a(view, windowInsetsCompat, new d(this.b));
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            o0.j0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, d dVar);
    }

    public static void b(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void c(@NonNull View view, @NonNull c cVar) {
        o0.A0(view, new a(cVar, new d(o0.E(view), view.getPaddingTop(), o0.D(view), view.getPaddingBottom())));
        l(view);
    }

    public static float d(@NonNull Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static Integer e(@NonNull View view) {
        ColorStateList colorStateListG = vc.c.g(view.getBackground());
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    public static InputMethodManager f(@NonNull View view) {
        return (InputMethodManager) l2.b.k(view.getContext(), InputMethodManager.class);
    }

    public static float g(@NonNull View view) {
        float fU = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fU += o0.u((View) parent);
        }
        return fU;
    }

    public static boolean h(View view) {
        return o0.z(view) == 1;
    }

    public static PorterDuff.Mode i(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            k(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void k(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void l(@NonNull View view) {
        if (o0.Q(view)) {
            o0.j0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void m(@NonNull final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: zc.q
            @Override // java.lang.Runnable
            public final void run() {
                r.n(view, z10);
            }
        });
    }

    public static void n(@NonNull View view, boolean z10) {
        l1 l1VarJ;
        if (!z10 || (l1VarJ = o0.J(view)) == null) {
            f(view).showSoftInput(view, 1);
        } else {
            l1VarJ.f(WindowInsetsCompat.Type.ime());
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37443a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37445d;

        public d(int i10, int i11, int i12, int i13) {
            this.f37443a = i10;
            this.b = i11;
            this.f37444c = i12;
            this.f37445d = i13;
        }

        public d(@NonNull d dVar) {
            this.f37443a = dVar.f37443a;
            this.b = dVar.b;
            this.f37444c = dVar.f37444c;
            this.f37445d = dVar.f37445d;
        }
    }
}
