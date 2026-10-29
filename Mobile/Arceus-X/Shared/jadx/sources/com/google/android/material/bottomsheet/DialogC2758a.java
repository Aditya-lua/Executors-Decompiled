package com.google.android.material.bottomsheet;

import ad.C0132d;
import ad.C0146r;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0582a;
import androidx.core.view.C0590c1;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import cd.C1622c;
import p168hd.C6363g;
import p194ic.C6738b;
import p194ic.C6742f;
import p194ic.C6744h;
import p194ic.C6746j;
import p203j.DialogC7002l;
import p463uc.C11840a;
import p564y2.C13017p;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.a */
/* JADX INFO: loaded from: classes2.dex */
public class DialogC2758a extends DialogC7002l {

    /* JADX INFO: renamed from: g */
    public BottomSheetBehavior<FrameLayout> f9779g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f9780h;

    /* JADX INFO: renamed from: i */
    public CoordinatorLayout f9781i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f9782j;

    /* JADX INFO: renamed from: k */
    public boolean f9783k;

    /* JADX INFO: renamed from: l */
    public boolean f9784l;

    /* JADX INFO: renamed from: m */
    public boolean f9785m;

    /* JADX INFO: renamed from: n */
    public boolean f9786n;

    /* JADX INFO: renamed from: o */
    public f f9787o;

    /* JADX INFO: renamed from: p */
    public boolean f9788p;

    /* JADX INFO: renamed from: q */
    public C1622c f9789q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public BottomSheetBehavior.AbstractC2756g f9790r;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a */
    public class a implements InterfaceC0644y {
        public a() {
        }

        @Override // androidx.core.view.InterfaceC0644y
        /* JADX INFO: renamed from: K */
        public WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
            if (DialogC2758a.this.f9787o != null) {
                DialogC2758a.this.f9779g.m12108F0(DialogC2758a.this.f9787o);
            }
            if (windowInsetsCompat != null) {
                DialogC2758a dialogC2758a = DialogC2758a.this;
                dialogC2758a.f9787o = new f(dialogC2758a.f9782j, windowInsetsCompat, null);
                DialogC2758a.this.f9787o.m12188e(DialogC2758a.this.getWindow());
                DialogC2758a.this.f9779g.m12131c0(DialogC2758a.this.f9787o);
            }
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC2758a dialogC2758a = DialogC2758a.this;
            if (dialogC2758a.f9784l && dialogC2758a.isShowing() && DialogC2758a.this.m12186z()) {
                DialogC2758a.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$c */
    public class c extends C0582a {
        public c() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            if (!DialogC2758a.this.f9784l) {
                c13017p.m48417q0(false);
            } else {
                c13017p.m48387a(1048576);
                c13017p.m48417q0(true);
            }
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: j */
        public boolean mo2802j(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                DialogC2758a dialogC2758a = DialogC2758a.this;
                if (dialogC2758a.f9784l) {
                    dialogC2758a.cancel();
                    return true;
                }
            }
            return super.mo2802j(view, i10, bundle);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$d */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$e */
    public class e extends BottomSheetBehavior.AbstractC2756g {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: b */
        public void mo12170b(@NonNull View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: c */
        public void mo12171c(@NonNull View view, int i10) {
            if (i10 == 5) {
                DialogC2758a.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$f */
    public static class f extends BottomSheetBehavior.AbstractC2756g {

        /* JADX INFO: renamed from: a */
        public final Boolean f9796a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final WindowInsetsCompat f9797b;

        /* JADX INFO: renamed from: c */
        public Window f9798c;

        /* JADX INFO: renamed from: d */
        public boolean f9799d;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.view.View), (r2v0 androidx.core.view.WindowInsetsCompat) A[MD:(android.view.View, androidx.core.view.WindowInsetsCompat):void (m)] (LINE:1) call: com.google.android.material.bottomsheet.a.f.<init>(android.view.View, androidx.core.view.WindowInsetsCompat):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ f(View view, WindowInsetsCompat windowInsetsCompat, a aVar) {
            this(view, windowInsetsCompat);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: a */
        public void mo12169a(@NonNull View view) {
            m12187d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: b */
        public void mo12170b(@NonNull View view, float f10) {
            m12187d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: c */
        public void mo12171c(@NonNull View view, int i10) {
            m12187d(view);
        }

        /* JADX INFO: renamed from: d */
        public final void m12187d(View view) {
            if (view.getTop() < this.f9797b.getSystemWindowInsetTop()) {
                Window window = this.f9798c;
                if (window != null) {
                    Boolean bool = this.f9796a;
                    C0132d.m395f(window, bool == null ? this.f9799d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f9797b.getSystemWindowInsetTop() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f9798c;
                if (window2 != null) {
                    C0132d.m395f(window2, this.f9799d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        /* JADX INFO: renamed from: e */
        public void m12188e(Window window) {
            if (this.f9798c == window) {
                return;
            }
            this.f9798c = window;
            if (window != null) {
                this.f9799d = C0590c1.m2820a(window, window.getDecorView()).m2948b();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public f(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f9797b = windowInsetsCompat;
            C6363g c6363gM12157t0 = BottomSheetBehavior.m12102q0(view).m12157t0();
            ColorStateList colorStateListM27749x = c6363gM12157t0 != null ? c6363gM12157t0.m27749x() : C0625o0.m3049r(view);
            if (colorStateListM27749x != null) {
                this.f9796a = Boolean.valueOf(C11840a.m44232h(colorStateListM27749x.getDefaultColor()));
                return;
            }
            Integer numM450e = C0146r.m450e(view);
            if (numM450e != null) {
                this.f9796a = Boolean.valueOf(C11840a.m44232h(numM450e.intValue()));
            } else {
                this.f9796a = null;
            }
        }
    }

    public DialogC2758a(@NonNull Context context, int i10) {
        super(context, m12175m(context, i10));
        this.f9784l = true;
        this.f9785m = true;
        this.f9790r = new e();
        m29605o(1);
        this.f9788p = getContext().getTheme().obtainStyledAttributes(new int[]{C6738b.f25913t}).getBoolean(0, false);
    }

    /* JADX INFO: renamed from: m */
    public static int m12175m(@NonNull Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C6738b.f25887b, typedValue, true) ? typedValue.resourceId : C6746j.f26111c;
    }

    /* JADX INFO: renamed from: B */
    public final void m12180B() {
        C1622c c1622c = this.f9789q;
        if (c1622c == null) {
            return;
        }
        if (this.f9784l) {
            c1622c.m8197b();
        } else {
            c1622c.m8199d();
        }
    }

    /* JADX INFO: renamed from: C */
    public final View m12181C(int i10, View view, ViewGroup.LayoutParams layoutParams) {
        m12182u();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f9780h.findViewById(C6742f.f26034e);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f9788p) {
            C0625o0.m2979A0(this.f9782j, new a());
        }
        this.f9782j.removeAllViews();
        if (layoutParams == null) {
            this.f9782j.addView(view);
        } else {
            this.f9782j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C6742f.f26028V).setOnClickListener(new b());
        C0625o0.m3040m0(this.f9782j, new c());
        this.f9782j.setOnTouchListener(new d());
        return this.f9780h;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM12183v = m12183v();
        if (!this.f9783k || bottomSheetBehaviorM12183v.m12159v0() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorM12183v.m12125X0(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f9788p && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f9780h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f9781i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            C0590c1.m2821b(window, !z10);
            f fVar = this.f9787o;
            if (fVar != null) {
                fVar.m12188e(window);
            }
        }
        m12180B();
    }

    @Override // p203j.DialogC7002l, p088e.DialogC4736w, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f9787o;
        if (fVar != null) {
            fVar.m12188e(null);
        }
        C1622c c1622c = this.f9789q;
        if (c1622c != null) {
            c1622c.m8199d();
        }
    }

    @Override // p088e.DialogC4736w, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f9779g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.m12159v0() != 5) {
            return;
        }
        this.f9779g.m12125X0(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f9784l != z10) {
            this.f9784l = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f9779g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m12117P0(z10);
            }
            if (getWindow() != null) {
                m12180B();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f9784l) {
            this.f9784l = true;
        }
        this.f9785m = z10;
        this.f9786n = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p203j.DialogC7002l, p088e.DialogC4736w, android.app.Dialog
    public void setContentView(int i10) {
        super.setContentView(m12181C(i10, null, null));
    }

    /* JADX INFO: renamed from: u */
    public final FrameLayout m12182u() {
        if (this.f9780h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C6744h.f26059a, null);
            this.f9780h = frameLayout;
            this.f9781i = (CoordinatorLayout) frameLayout.findViewById(C6742f.f26034e);
            FrameLayout frameLayout2 = (FrameLayout) this.f9780h.findViewById(C6742f.f26035f);
            this.f9782j = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM12102q0 = BottomSheetBehavior.m12102q0(frameLayout2);
            this.f9779g = bottomSheetBehaviorM12102q0;
            bottomSheetBehaviorM12102q0.m12131c0(this.f9790r);
            this.f9779g.m12117P0(this.f9784l);
            this.f9789q = new C1622c(this.f9779g, this.f9782j);
        }
        return this.f9780h;
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public BottomSheetBehavior<FrameLayout> m12183v() {
        if (this.f9779g == null) {
            m12182u();
        }
        return this.f9779g;
    }

    /* JADX INFO: renamed from: w */
    public boolean m12184w() {
        return this.f9783k;
    }

    /* JADX INFO: renamed from: y */
    public void m12185y() {
        this.f9779g.m12108F0(this.f9790r);
    }

    /* JADX INFO: renamed from: z */
    public boolean m12186z() {
        if (!this.f9786n) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f9785m = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f9786n = true;
        }
        return this.f9785m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p203j.DialogC7002l, p088e.DialogC4736w, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m12181C(0, view, null));
    }

    @Override // p203j.DialogC7002l, p088e.DialogC4736w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m12181C(0, view, layoutParams));
    }
}
