package o5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class p extends o0 {
    public static final TimeInterpolator U = new DecelerateInterpolator();
    public static final TimeInterpolator V = new AccelerateInterpolator();
    public static final g W = new a();
    public static final g X = new b();
    public static final g Y = new c();
    public static final g Z = new d();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final g f27154a0 = new e();

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final g f27155b0 = new f();
    public g S = f27155b0;
    public int T = 80;

    public class a extends h {
        public a() {
            super(null);
        }

        @Override // o5.p.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class b extends h {
        public b() {
            super(null);
        }

        @Override // o5.p.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    public class c extends i {
        public c() {
            super(null);
        }

        @Override // o5.p.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    public class d extends h {
        public d() {
            super(null);
        }

        @Override // o5.p.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class e extends h {
        public e() {
            super(null);
        }

        @Override // o5.p.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    public class f extends i {
        public f() {
            super(null);
        }

        @Override // o5.p.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    public static abstract class h implements g {
        public h() {
        }

        @Override // o5.p.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    public static abstract class i implements g {
        public i() {
        }

        @Override // o5.p.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public p(int i10) {
        I0(i10);
    }

    private void B0(d0 d0Var) {
        int[] iArr = new int[2];
        d0Var.b.getLocationOnScreen(iArr);
        d0Var.f27089a.put("android:slide:screenPosition", iArr);
    }

    @Override // o5.o0
    public Animator D0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2) {
        if (d0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) d0Var2.f27089a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return f0.a(view, d0Var2, iArr[0], iArr[1], this.S.b(viewGroup, view), this.S.a(viewGroup, view), translationX, translationY, U, this);
    }

    @Override // o5.o0
    public Animator F0(@NonNull ViewGroup viewGroup, @NonNull View view, d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            return null;
        }
        int[] iArr = (int[]) d0Var.f27089a.get("android:slide:screenPosition");
        return f0.a(view, d0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.S.b(viewGroup, view), this.S.a(viewGroup, view), V, this);
    }

    public void I0(int i10) {
        if (i10 == 3) {
            this.S = W;
        } else if (i10 == 5) {
            this.S = Z;
        } else if (i10 == 48) {
            this.S = Y;
        } else if (i10 == 80) {
            this.S = f27155b0;
        } else if (i10 == 8388611) {
            this.S = X;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.S = f27154a0;
        }
        this.T = i10;
        o oVar = new o();
        oVar.j(i10);
        x0(oVar);
    }

    @Override // o5.q
    public boolean Y() {
        return true;
    }

    @Override // o5.o0, o5.q
    public void j(@NonNull d0 d0Var) {
        super.j(d0Var);
        B0(d0Var);
    }

    @Override // o5.o0, o5.q
    public void o(@NonNull d0 d0Var) {
        super.o(d0Var);
        B0(d0Var);
    }
}
