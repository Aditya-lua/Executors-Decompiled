package p322o5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: o5.p */
/* JADX INFO: loaded from: classes.dex */
public class C9681p extends AbstractC9680o0 {

    /* JADX INFO: renamed from: U */
    public static final TimeInterpolator f35130U = new DecelerateInterpolator();

    /* JADX INFO: renamed from: V */
    public static final TimeInterpolator f35131V = new AccelerateInterpolator();

    /* JADX INFO: renamed from: W */
    public static final g f35132W = new a();

    /* JADX INFO: renamed from: X */
    public static final g f35133X = new b();

    /* JADX INFO: renamed from: Y */
    public static final g f35134Y = new c();

    /* JADX INFO: renamed from: Z */
    public static final g f35135Z = new d();

    /* JADX INFO: renamed from: a0 */
    public static final g f35136a0 = new e();

    /* JADX INFO: renamed from: b0 */
    public static final g f35137b0 = new f();

    /* JADX INFO: renamed from: S */
    public g f35138S = f35137b0;

    /* JADX INFO: renamed from: T */
    public int f35139T = 80;

    /* JADX INFO: renamed from: o5.p$a */
    public class a extends h {
        public a() {
            super(null);
        }

        @Override // p322o5.C9681p.g
        /* JADX INFO: renamed from: b */
        public float mo38241b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: o5.p$b */
    public class b extends h {
        public b() {
            super(null);
        }

        @Override // p322o5.C9681p.g
        /* JADX INFO: renamed from: b */
        public float mo38241b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: o5.p$c */
    public class c extends i {
        public c() {
            super(null);
        }

        @Override // p322o5.C9681p.g
        /* JADX INFO: renamed from: a */
        public float mo38242a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: o5.p$d */
    public class d extends h {
        public d() {
            super(null);
        }

        @Override // p322o5.C9681p.g
        /* JADX INFO: renamed from: b */
        public float mo38241b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: o5.p$e */
    public class e extends h {
        public e() {
            super(null);
        }

        @Override // p322o5.C9681p.g
        /* JADX INFO: renamed from: b */
        public float mo38241b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* JADX INFO: renamed from: o5.p$f */
    public class f extends i {
        public f() {
            super(null);
        }

        @Override // p322o5.C9681p.g
        /* JADX INFO: renamed from: a */
        public float mo38242a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: renamed from: o5.p$g */
    public interface g {
        /* JADX INFO: renamed from: a */
        float mo38242a(ViewGroup viewGroup, View view);

        /* JADX INFO: renamed from: b */
        float mo38241b(ViewGroup viewGroup, View view);
    }

    /* JADX INFO: renamed from: o5.p$h */
    public static abstract class h implements g {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public h() {
        }

        @Override // p322o5.C9681p.g
        /* JADX INFO: renamed from: a */
        public float mo38242a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: o5.p.h.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: o5.p$i */
    public static abstract class i implements g {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public i() {
        }

        @Override // p322o5.C9681p.g
        /* JADX INFO: renamed from: b */
        public float mo38241b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:2) call: o5.p.i.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public C9681p(int i10) {
        m38240I0(i10);
    }

    /* JADX INFO: renamed from: B0 */
    private void m38239B0(C9658d0 c9658d0) {
        int[] iArr = new int[2];
        c9658d0.f35045b.getLocationOnScreen(iArr);
        c9658d0.f35044a.put("android:slide:screenPosition", iArr);
    }

    @Override // p322o5.AbstractC9680o0
    /* JADX INFO: renamed from: D0 */
    public Animator mo38167D0(@NonNull ViewGroup viewGroup, @NonNull View view, C9658d0 c9658d0, C9658d0 c9658d1) {
        if (c9658d1 == null) {
            return null;
        }
        int[] iArr = (int[]) c9658d1.f35044a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C9662f0.m38171a(view, c9658d1, iArr[0], iArr[1], this.f35138S.mo38241b(viewGroup, view), this.f35138S.mo38242a(viewGroup, view), translationX, translationY, f35130U, this);
    }

    @Override // p322o5.AbstractC9680o0
    /* JADX INFO: renamed from: F0 */
    public Animator mo38168F0(@NonNull ViewGroup viewGroup, @NonNull View view, C9658d0 c9658d0, C9658d0 c9658d1) {
        if (c9658d0 == null) {
            return null;
        }
        int[] iArr = (int[]) c9658d0.f35044a.get("android:slide:screenPosition");
        return C9662f0.m38171a(view, c9658d0, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f35138S.mo38241b(viewGroup, view), this.f35138S.mo38242a(viewGroup, view), f35131V, this);
    }

    /* JADX INFO: renamed from: I0 */
    public void m38240I0(int i10) {
        if (i10 == 3) {
            this.f35138S = f35132W;
        } else if (i10 == 5) {
            this.f35138S = f35135Z;
        } else if (i10 == 48) {
            this.f35138S = f35134Y;
        } else if (i10 == 80) {
            this.f35138S = f35137b0;
        } else if (i10 == 8388611) {
            this.f35138S = f35133X;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.f35138S = f35136a0;
        }
        this.f35139T = i10;
        C9679o c9679o = new C9679o();
        c9679o.m38229j(i10);
        mo38147x0(c9679o);
    }

    @Override // p322o5.AbstractC9683q
    /* JADX INFO: renamed from: Y */
    public boolean mo38091Y() {
        return true;
    }

    @Override // p322o5.AbstractC9680o0, p322o5.AbstractC9683q
    /* JADX INFO: renamed from: j */
    public void mo38092j(@NonNull C9658d0 c9658d0) {
        super.mo38092j(c9658d0);
        m38239B0(c9658d0);
    }

    @Override // p322o5.AbstractC9680o0, p322o5.AbstractC9683q
    /* JADX INFO: renamed from: o */
    public void mo38093o(@NonNull C9658d0 c9658d0) {
        super.mo38093o(c9658d0);
        m38239B0(c9658d0);
    }
}
