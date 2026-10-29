package ad;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.core.view.C0619l1;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import p261l2.C7975b;
import p513wc.C12348c;

/* JADX INFO: renamed from: ad.r */
/* JADX INFO: loaded from: classes2.dex */
public class C0146r {

    /* JADX INFO: renamed from: ad.r$a */
    public class a implements InterfaceC0644y {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f508a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ d f509b;

        public a(c cVar, d dVar) {
            this.f508a = cVar;
            this.f509b = dVar;
        }

        @Override // androidx.core.view.InterfaceC0644y
        /* JADX INFO: renamed from: K */
        public WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
            return this.f508a.mo461a(view, windowInsetsCompat, new d(this.f509b));
        }
    }

    /* JADX INFO: renamed from: ad.r$b */
    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            C0625o0.m3034j0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: ad.r$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        WindowInsetsCompat mo461a(View view, WindowInsetsCompat windowInsetsCompat, d dVar);
    }

    /* JADX INFO: renamed from: b */
    public static void m447b(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m448c(@NonNull View view, @NonNull c cVar) {
        C0625o0.m2979A0(view, new a(cVar, new d(C0625o0.m2986E(view), view.getPaddingTop(), C0625o0.m2984D(view), view.getPaddingBottom())));
        m457l(view);
    }

    /* JADX INFO: renamed from: d */
    public static float m449d(@NonNull Context context, int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: e */
    public static Integer m450e(@NonNull View view) {
        ColorStateList colorStateListM46208g = C12348c.m46208g(view.getBackground());
        if (colorStateListM46208g != null) {
            return Integer.valueOf(colorStateListM46208g.getDefaultColor());
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static InputMethodManager m451f(@NonNull View view) {
        return (InputMethodManager) C7975b.m33013k(view.getContext(), InputMethodManager.class);
    }

    /* JADX INFO: renamed from: g */
    public static float m452g(@NonNull View view) {
        float fM3055u = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fM3055u += C0625o0.m3055u((View) parent);
        }
        return fM3055u;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m453h(View view) {
        return C0625o0.m3065z(view) == 1;
    }

    /* JADX INFO: renamed from: i */
    public static PorterDuff.Mode m454i(int i10, PorterDuff.Mode mode) {
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

    /* JADX INFO: renamed from: j */
    public static void m455j(View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            m456k(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m456k(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    /* JADX INFO: renamed from: l */
    public static void m457l(@NonNull View view) {
        if (C0625o0.m3005Q(view)) {
            C0625o0.m3034j0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m458m(@NonNull final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: ad.q
            @Override // java.lang.Runnable
            public final void run() {
                C0146r.m459n(view, z10);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static void m459n(@NonNull View view, boolean z10) {
        C0619l1 c0619l1M2996J;
        if (!z10 || (c0619l1M2996J = C0625o0.m2996J(view)) == null) {
            m451f(view).showSoftInput(view, 1);
        } else {
            c0619l1M2996J.m2952f(WindowInsetsCompat.Type.ime());
        }
    }

    /* JADX INFO: renamed from: ad.r$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public int f510a;

        /* JADX INFO: renamed from: b */
        public int f511b;

        /* JADX INFO: renamed from: c */
        public int f512c;

        /* JADX INFO: renamed from: d */
        public int f513d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(int i10, int i11, int i12, int i13) {
            this.f510a = i10;
            this.f511b = i11;
            this.f512c = i12;
            this.f513d = i13;
        }

        public d(@NonNull d dVar) {
            this.f510a = dVar.f510a;
            this.f511b = dVar.f511b;
            this.f512c = dVar.f512c;
            this.f513d = dVar.f513d;
        }
    }
}
