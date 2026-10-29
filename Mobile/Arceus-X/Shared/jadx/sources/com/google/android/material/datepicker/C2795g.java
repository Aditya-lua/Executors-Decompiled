package com.google.android.material.datepicker;

import ad.C0132d;
import ad.C0146r;
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
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.AbstractC0934h;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p093e4.DialogInterfaceOnCancelListenerC4819k;
import p101ed.C5049b;
import p168hd.C6363g;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6741e;
import p194ic.C6742f;
import p194ic.C6744h;
import p194ic.C6745i;
import p194ic.C6746j;
import p194ic.C6747k;
import p232k.C7399a;
import vc.ViewOnTouchListenerC12157a;

/* JADX INFO: renamed from: com.google.android.material.datepicker.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C2795g<S> extends DialogInterfaceOnCancelListenerC4819k {

    /* JADX INFO: renamed from: Z0 */
    public static final Object f10098Z0 = "CONFIRM_BUTTON_TAG";

    /* JADX INFO: renamed from: a1 */
    public static final Object f10099a1 = "CANCEL_BUTTON_TAG";

    /* JADX INFO: renamed from: b1 */
    public static final Object f10100b1 = "TOGGLE_BUTTON_TAG";

    /* JADX INFO: renamed from: A0 */
    public DateSelector<S> f10101A0;

    /* JADX INFO: renamed from: B0 */
    public AbstractC2801m<S> f10102B0;

    /* JADX INFO: renamed from: C0 */
    public CalendarConstraints f10103C0;

    /* JADX INFO: renamed from: D0 */
    public DayViewDecorator f10104D0;

    /* JADX INFO: renamed from: E0 */
    public C2793e<S> f10105E0;

    /* JADX INFO: renamed from: F0 */
    public int f10106F0;

    /* JADX INFO: renamed from: G0 */
    public CharSequence f10107G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f10108H0;

    /* JADX INFO: renamed from: I0 */
    public int f10109I0;

    /* JADX INFO: renamed from: J0 */
    public int f10110J0;

    /* JADX INFO: renamed from: K0 */
    public CharSequence f10111K0;

    /* JADX INFO: renamed from: L0 */
    public int f10112L0;

    /* JADX INFO: renamed from: M0 */
    public CharSequence f10113M0;

    /* JADX INFO: renamed from: N0 */
    public int f10114N0;

    /* JADX INFO: renamed from: O0 */
    public CharSequence f10115O0;

    /* JADX INFO: renamed from: P0 */
    public int f10116P0;

    /* JADX INFO: renamed from: Q0 */
    public CharSequence f10117Q0;

    /* JADX INFO: renamed from: R0 */
    public TextView f10118R0;

    /* JADX INFO: renamed from: S0 */
    public TextView f10119S0;

    /* JADX INFO: renamed from: T0 */
    public CheckableImageButton f10120T0;

    /* JADX INFO: renamed from: U0 */
    public C6363g f10121U0;

    /* JADX INFO: renamed from: V0 */
    public Button f10122V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f10123W0;

    /* JADX INFO: renamed from: X0 */
    public CharSequence f10124X0;

    /* JADX INFO: renamed from: Y0 */
    public CharSequence f10125Y0;

    /* JADX INFO: renamed from: v0 */
    public final LinkedHashSet<InterfaceC2796h<? super S>> f10126v0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: w0 */
    public final LinkedHashSet<View.OnClickListener> f10127w0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: x0 */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f10128x0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: y0 */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f10129y0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: z0 */
    public int f10130z0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.google.android.material.datepicker.h */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C2795g.this.f10126v0.iterator();
            while (it.hasNext()) {
                ((InterfaceC2796h) it.next()).m12674a(C2795g.this.m12665G2());
            }
            C2795g.this.mo12190e2();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$b */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C2795g.this.f10127w0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C2795g.this.mo12190e2();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$c */
    public class c implements InterfaceC0644y {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f10133a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f10134b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f10135c;

        public c(int i10, View view, int i11) {
            this.f10133a = i10;
            this.f10134b = view;
            this.f10135c = i11;
        }

        @Override // androidx.core.view.InterfaceC0644y
        /* JADX INFO: renamed from: K */
        public WindowInsetsCompat mo460K(View view, WindowInsetsCompat windowInsetsCompat) {
            int i10 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
            if (this.f10133a >= 0) {
                this.f10134b.getLayoutParams().height = this.f10133a + i10;
                View view2 = this.f10134b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f10134b;
            view3.setPadding(view3.getPaddingLeft(), this.f10135c + i10, this.f10134b.getPaddingRight(), this.f10134b.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$d */
    public class d extends AbstractC2800l<S> {
        public d() {
        }

        @Override // com.google.android.material.datepicker.AbstractC2800l
        /* JADX INFO: renamed from: a */
        public void mo12673a(S s8) {
            C2795g c2795g = C2795g.this;
            c2795g.m12670O2(c2795g.m12664E2());
            C2795g.this.f10122V0.setEnabled(C2795g.this.m12650B2().m12572L2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public DateSelector<S> m12650B2() {
        if (this.f10101A0 == null) {
            this.f10101A0 = (DateSelector) m4704t().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f10101A0;
    }

    /* JADX INFO: renamed from: C2 */
    public static CharSequence m12651C2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    /* JADX INFO: renamed from: F2 */
    public static int m12652F2(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C6740d.f25945P);
        int i10 = Month.m12599o().f10036d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C6740d.f25947R) * i10) + ((i10 - 1) * resources.getDimensionPixelOffset(C6740d.f25950U));
    }

    /* JADX INFO: renamed from: J2 */
    public static boolean m12653J2(@NonNull Context context) {
        return m12655M2(context, R.attr.windowFullscreen);
    }

    /* JADX INFO: renamed from: L2 */
    public static boolean m12654L2(@NonNull Context context) {
        return m12655M2(context, C6738b.f25877S);
    }

    /* JADX INFO: renamed from: M2 */
    public static boolean m12655M2(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C5049b.m23733d(context, C6738b.f25919z, C2793e.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    /* JADX INFO: renamed from: u2 */
    public static /* synthetic */ void m12656u2(C2795g c2795g, View view) {
        c2795g.f10122V0.setEnabled(c2795g.m12650B2().m12572L2());
        c2795g.f10120T0.toggle();
        c2795g.f10109I0 = c2795g.f10109I0 == 1 ? 0 : 1;
        c2795g.m12672Q2(c2795g.f10120T0);
        c2795g.m12669N2();
    }

    @NonNull
    /* JADX INFO: renamed from: z2 */
    public static Drawable m12661z2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, C7399a.m30679b(context, C6741e.f25998e));
        stateListDrawable.addState(new int[0], C7399a.m30679b(context, C6741e.f25999f));
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: A2 */
    public final void m12662A2(Window window) {
        if (this.f10123W0) {
            return;
        }
        View viewFindViewById = m4611J1().findViewById(C6742f.f26038i);
        C0132d.m390a(window, true, C0146r.m450e(viewFindViewById), null);
        C0625o0.m2979A0(viewFindViewById, new c(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
        this.f10123W0 = true;
    }

    /* JADX INFO: renamed from: D2 */
    public final String m12663D2() {
        return m12650B2().m12574N0(m4609I1());
    }

    /* JADX INFO: renamed from: E2 */
    public String m12664E2() {
        return m12650B2().m12573M1(mo4715x());
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public final void mo4599F0(Bundle bundle) {
        super.mo4599F0(bundle);
        if (bundle == null) {
            bundle = m4704t();
        }
        this.f10130z0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f10101A0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f10103C0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f10104D0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f10106F0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f10107G0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f10109I0 = bundle.getInt("INPUT_MODE_KEY");
        this.f10110J0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10111K0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f10112L0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10113M0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f10114N0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f10115O0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f10116P0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f10117Q0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f10107G0;
        if (text == null) {
            text = m4609I1().getResources().getText(this.f10106F0);
        }
        this.f10124X0 = text;
        this.f10125Y0 = m12651C2(text);
    }

    /* JADX INFO: renamed from: G2 */
    public final S m12665G2() {
        return m12650B2().m12578Z2();
    }

    /* JADX INFO: renamed from: H2 */
    public final int m12666H2(Context context) {
        int i10 = this.f10130z0;
        return i10 != 0 ? i10 : m12650B2().m12577T0(context);
    }

    /* JADX INFO: renamed from: I2 */
    public final void m12667I2(Context context) {
        this.f10120T0.setTag(f10100b1);
        this.f10120T0.setImageDrawable(m12661z2(context));
        this.f10120T0.setChecked(this.f10109I0 != 0);
        C0625o0.m3040m0(this.f10120T0, null);
        m12672Q2(this.f10120T0);
        this.f10120T0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2795g.m12656u2(this.f10097a, view);
            }
        });
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NonNull
    /* JADX INFO: renamed from: J0 */
    public final View mo1225J0(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f10108H0 ? C6744h.f26081w : C6744h.f26080v, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f10104D0;
        if (dayViewDecorator != null) {
            dayViewDecorator.m12591n(context);
        }
        if (this.f10108H0) {
            viewInflate.findViewById(C6742f.f26055z).setLayoutParams(new LinearLayout.LayoutParams(m12652F2(context), -2));
        } else {
            viewInflate.findViewById(C6742f.f26007A).setLayoutParams(new LinearLayout.LayoutParams(m12652F2(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(C6742f.f26013G);
        this.f10119S0 = textView;
        C0625o0.m3044o0(textView, 1);
        this.f10120T0 = (CheckableImageButton) viewInflate.findViewById(C6742f.f26014H);
        this.f10118R0 = (TextView) viewInflate.findViewById(C6742f.f26015I);
        m12667I2(context);
        this.f10122V0 = (Button) viewInflate.findViewById(C6742f.f26033d);
        if (m12650B2().m12572L2()) {
            this.f10122V0.setEnabled(true);
        } else {
            this.f10122V0.setEnabled(false);
        }
        this.f10122V0.setTag(f10098Z0);
        CharSequence charSequence = this.f10111K0;
        if (charSequence != null) {
            this.f10122V0.setText(charSequence);
        } else {
            int i10 = this.f10110J0;
            if (i10 != 0) {
                this.f10122V0.setText(i10);
            }
        }
        CharSequence charSequence2 = this.f10113M0;
        if (charSequence2 != null) {
            this.f10122V0.setContentDescription(charSequence2);
        } else if (this.f10112L0 != 0) {
            this.f10122V0.setContentDescription(mo4715x().getResources().getText(this.f10112L0));
        }
        this.f10122V0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(C6742f.f26030a);
        button.setTag(f10099a1);
        CharSequence charSequence3 = this.f10115O0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.f10114N0;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.f10117Q0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f10116P0 != 0) {
            button.setContentDescription(mo4715x().getResources().getText(this.f10116P0));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    /* JADX INFO: renamed from: K2 */
    public final boolean m12668K2() {
        return m4637T().getConfiguration().orientation == 2;
    }

    /* JADX INFO: renamed from: N2 */
    public final void m12669N2() {
        int iM12666H2 = m12666H2(m4609I1());
        C2797i c2797iM12635t2 = C2793e.m12635t2(m12650B2(), iM12666H2, this.f10103C0, this.f10104D0);
        this.f10105E0 = c2797iM12635t2;
        if (this.f10109I0 == 1) {
            c2797iM12635t2 = C2797i.m12675d2(m12650B2(), iM12666H2, this.f10103C0);
        }
        this.f10102B0 = c2797iM12635t2;
        m12671P2();
        m12670O2(m12664E2());
        AbstractC0934h abstractC0934hM4452r = m4709v().m4452r();
        abstractC0934hM4452r.m4781n(C6742f.f26055z, this.f10102B0);
        abstractC0934hM4452r.mo4510i();
        this.f10102B0.mo12636b2(new d());
    }

    /* JADX INFO: renamed from: O2 */
    public void m12670O2(String str) {
        this.f10119S0.setContentDescription(m12663D2());
        this.f10119S0.setText(str);
    }

    /* JADX INFO: renamed from: P2 */
    public final void m12671P2() {
        this.f10118R0.setText((this.f10109I0 == 1 && m12668K2()) ? this.f10125Y0 : this.f10124X0);
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m12672Q2(@NonNull CheckableImageButton checkableImageButton) {
        this.f10120T0.setContentDescription(this.f10109I0 == 1 ? checkableImageButton.getContext().getString(C6745i.f26099r) : checkableImageButton.getContext().getString(C6745i.f26101t));
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: b1 */
    public final void mo4661b1(@NonNull Bundle bundle) {
        super.mo4661b1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f10130z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f10101A0);
        CalendarConstraints.C2785b c2785b = new CalendarConstraints.C2785b(this.f10103C0);
        C2793e<S> c2793e = this.f10105E0;
        Month monthM12641o2 = c2793e == null ? null : c2793e.m12641o2();
        if (monthM12641o2 != null) {
            c2785b.m12571b(monthM12641o2.f10038f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2785b.m12570a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f10104D0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f10106F0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f10107G0);
        bundle.putInt("INPUT_MODE_KEY", this.f10109I0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f10110J0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f10111K0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10112L0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10113M0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f10114N0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f10115O0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f10116P0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f10117Q0);
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
        Window window = m23334o2().getWindow();
        if (this.f10108H0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f10121U0);
            m12662A2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m4637T().getDimensionPixelOffset(C6740d.f25949T);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f10121U0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC12157a(m23334o2(), rect));
        }
        m12669N2();
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        this.f10102B0.m12700c2();
        super.mo4665d1();
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k
    @NonNull
    /* JADX INFO: renamed from: k2 */
    public final Dialog mo6459k2(Bundle bundle) {
        Dialog dialog = new Dialog(m4609I1(), m12666H2(m4609I1()));
        Context context = dialog.getContext();
        this.f10108H0 = m12653J2(context);
        int i10 = C6738b.f25919z;
        int i11 = C6746j.f26133y;
        this.f10121U0 = new C6363g(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C6747k.f26421f3, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(C6747k.f26430g3, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f10121U0.m27710Q(context);
        this.f10121U0.m27719a0(ColorStateList.valueOf(color));
        this.f10121U0.m27718Z(C0625o0.m3055u(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f10128x0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f10129y0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) m4677j0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
