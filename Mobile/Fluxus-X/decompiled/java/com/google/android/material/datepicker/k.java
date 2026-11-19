package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.y;
import com.google.android.material.internal.CheckableImageButton;
import f4.t0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class k<S> extends f4.o {
    public static final Object Z0 = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final Object f7796a1 = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final Object f7797b1 = "TOGGLE_BUTTON_TAG";
    public com.google.android.material.datepicker.d<S> A0;
    public r<S> B0;
    public com.google.android.material.datepicker.a C0;
    public g D0;
    public i<S> E0;
    public int F0;
    public CharSequence G0;
    public boolean H0;
    public int I0;
    public int J0;
    public CharSequence K0;
    public int L0;
    public CharSequence M0;
    public int N0;
    public CharSequence O0;
    public int P0;
    public CharSequence Q0;
    public TextView R0;
    public TextView S0;
    public CheckableImageButton T0;
    public id.g U0;
    public Button V0;
    public boolean W0;
    public CharSequence X0;
    public CharSequence Y0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final LinkedHashSet<l<? super S>> f7798v0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f7799w0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f7800x0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f7801y0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f7802z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = k.this.f7798v0.iterator();
            while (it.hasNext()) {
                ((l) it.next()).a(k.this.G2());
            }
            k.this.e2();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = k.this.f7799w0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            k.this.e2();
        }
    }

    public class c implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f7805a;
        public final /* synthetic */ View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f7806c;

        public c(int i10, View view, int i11) {
            this.f7805a = i10;
            this.b = view;
            this.f7806c = i11;
        }

        @Override // androidx.core.view.y
        public WindowInsetsCompat J(View view, WindowInsetsCompat windowInsetsCompat) {
            int i10 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
            if (this.f7805a >= 0) {
                this.b.getLayoutParams().height = this.f7805a + i10;
                View view2 = this.b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.b;
            view3.setPadding(view3.getPaddingLeft(), this.f7806c + i10, this.b.getPaddingRight(), this.b.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    public class d extends q<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.q
        public void a(S s8) {
            k kVar = k.this;
            kVar.O2(kVar.E2());
            k.this.V0.setEnabled(k.this.B2().O2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.material.datepicker.d<S> B2() {
        if (this.A0 == null) {
            this.A0 = (com.google.android.material.datepicker.d) t().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.A0;
    }

    public static CharSequence C2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    public static int F2(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(jc.d.P);
        int i10 = n.p().f7815d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(jc.d.R) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(jc.d.U));
    }

    public static boolean J2(@NonNull Context context) {
        return M2(context, R.attr.windowFullscreen);
    }

    public static boolean L2(@NonNull Context context) {
        return M2(context, jc.b.S);
    }

    public static boolean M2(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(fd.b.d(context, jc.b.f20311z, i.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    public static /* synthetic */ void u2(k kVar, View view) {
        kVar.V0.setEnabled(kVar.B2().O2());
        kVar.T0.toggle();
        kVar.I0 = kVar.I0 == 1 ? 0 : 1;
        kVar.Q2(kVar.T0);
        kVar.N2();
    }

    @NonNull
    public static Drawable z2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, k.a.b(context, jc.e.f20361e));
        stateListDrawable.addState(new int[0], k.a.b(context, jc.e.f20362f));
        return stateListDrawable;
    }

    public final void A2(Window window) {
        if (this.W0) {
            return;
        }
        View viewFindViewById = J1().findViewById(jc.f.f20377i);
        bd.d.a(window, true, bd.r.e(viewFindViewById), null);
        o0.A0(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.W0 = true;
    }

    public final String D2() {
        return B2().O0(I1());
    }

    public String E2() {
        return B2().O1(v());
    }

    @Override // f4.o, f4.q
    public final void F0(Bundle bundle) {
        super.F0(bundle);
        if (bundle == null) {
            bundle = t();
        }
        this.f7802z0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.A0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.C0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.D0 = (g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.F0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.G0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.I0 = bundle.getInt("INPUT_MODE_KEY");
        this.J0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.K0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.L0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.M0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.N0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.O0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.P0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.Q0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.G0;
        if (text == null) {
            text = I1().getResources().getText(this.F0);
        }
        this.X0 = text;
        this.Y0 = C2(text);
    }

    public final S G2() {
        return B2().d3();
    }

    public final int H2(Context context) {
        int i10 = this.f7802z0;
        return i10 != 0 ? i10 : B2().U0(context);
    }

    public final void I2(Context context) {
        this.T0.setTag(f7797b1);
        this.T0.setImageDrawable(z2(context));
        this.T0.setChecked(this.I0 != 0);
        o0.m0(this.T0, null);
        Q2(this.T0);
        this.T0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.u2(this.f7795a, view);
            }
        });
    }

    @Override // f4.q
    @NonNull
    public final View J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.H0 ? jc.h.f20418w : jc.h.f20417v, viewGroup);
        Context context = viewInflate.getContext();
        g gVar = this.D0;
        if (gVar != null) {
            gVar.n(context);
        }
        if (this.H0) {
            viewInflate.findViewById(jc.f.f20394z).setLayoutParams(new LinearLayout.LayoutParams(F2(context), -2));
        } else {
            viewInflate.findViewById(jc.f.A).setLayoutParams(new LinearLayout.LayoutParams(F2(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(jc.f.G);
        this.S0 = textView;
        o0.o0(textView, 1);
        this.T0 = (CheckableImageButton) viewInflate.findViewById(jc.f.H);
        this.R0 = (TextView) viewInflate.findViewById(jc.f.I);
        I2(context);
        this.V0 = (Button) viewInflate.findViewById(jc.f.f20372d);
        if (B2().O2()) {
            this.V0.setEnabled(true);
        } else {
            this.V0.setEnabled(false);
        }
        this.V0.setTag(Z0);
        CharSequence charSequence = this.K0;
        if (charSequence != null) {
            this.V0.setText(charSequence);
        } else {
            int i10 = this.J0;
            if (i10 != 0) {
                this.V0.setText(i10);
            }
        }
        CharSequence charSequence2 = this.M0;
        if (charSequence2 != null) {
            this.V0.setContentDescription(charSequence2);
        } else if (this.L0 != 0) {
            this.V0.setContentDescription(v().getResources().getText(this.L0));
        }
        this.V0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(jc.f.f20370a);
        button.setTag(f7796a1);
        CharSequence charSequence3 = this.O0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.N0;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.Q0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.P0 != 0) {
            button.setContentDescription(v().getResources().getText(this.P0));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    public final boolean K2() {
        return S().getConfiguration().orientation == 2;
    }

    public final void N2() {
        int iH2 = H2(I1());
        m mVarT2 = i.t2(B2(), iH2, this.C0, this.D0);
        this.E0 = mVarT2;
        if (this.I0 == 1) {
            mVarT2 = m.d2(B2(), iH2, this.C0);
        }
        this.B0 = mVarT2;
        P2();
        O2(E2());
        t0 t0VarR = u().r();
        t0VarR.n(jc.f.f20394z, this.B0);
        t0VarR.i();
        this.B0.b2(new d());
    }

    public void O2(String str) {
        this.S0.setContentDescription(D2());
        this.S0.setText(str);
    }

    public final void P2() {
        this.R0.setText((this.I0 == 1 && K2()) ? this.Y0 : this.X0);
    }

    public final void Q2(@NonNull CheckableImageButton checkableImageButton) {
        this.T0.setContentDescription(this.I0 == 1 ? checkableImageButton.getContext().getString(jc.i.f20435r) : checkableImageButton.getContext().getString(jc.i.f20437t));
    }

    @Override // f4.o, f4.q
    public final void b1(@NonNull Bundle bundle) {
        super.b1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f7802z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.A0);
        com.google.android.material.datepicker.a.b bVar = new com.google.android.material.datepicker.a.b(this.C0);
        i<S> iVar = this.E0;
        n nVarO2 = iVar == null ? null : iVar.o2();
        if (nVarO2 != null) {
            bVar.b(nVarO2.f7817f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.D0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.F0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.G0);
        bundle.putInt("INPUT_MODE_KEY", this.I0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.J0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.K0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.L0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.M0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.N0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.O0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.P0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.Q0);
    }

    @Override // f4.o, f4.q
    public void c1() {
        super.c1();
        Window window = o2().getWindow();
        if (this.H0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.U0);
            A2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = S().getDimensionPixelOffset(jc.d.T);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.U0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new wc.a(o2(), rect));
        }
        N2();
    }

    @Override // f4.o, f4.q
    public void d1() {
        this.B0.c2();
        super.d1();
    }

    @Override // f4.o
    @NonNull
    public final Dialog k2(Bundle bundle) {
        Dialog dialog = new Dialog(I1(), H2(I1()));
        Context context = dialog.getContext();
        this.H0 = J2(context);
        this.U0 = new id.g(context, null, jc.b.f20311z, jc.j.f20464y);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, jc.k.f20517f3, jc.b.f20311z, jc.j.f20464y);
        int color = typedArrayObtainStyledAttributes.getColor(jc.k.f20526g3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.U0.Q(context);
        this.U0.a0(ColorStateList.valueOf(color));
        this.U0.Z(o0.u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // f4.o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f7800x0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // f4.o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f7801y0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) j0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
