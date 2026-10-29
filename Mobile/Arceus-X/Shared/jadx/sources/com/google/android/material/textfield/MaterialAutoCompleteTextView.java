package com.google.android.material.textfield;

import ad.C0136h;
import ad.C0143o;
import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import java.util.List;
import md.C8485a;
import p101ed.C5050c;
import p168hd.C6363g;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6744h;
import p194ic.C6746j;
import p194ic.C6747k;
import p365q.C10364d;
import p365q.C10392o0;
import p368q2.C10425a;
import p463uc.C11840a;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends C10364d {

    /* JADX INFO: renamed from: e */
    @NonNull
    public final C10392o0 f10533e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f10534f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final Rect f10535g;

    /* JADX INFO: renamed from: h */
    public final int f10536h;

    /* JADX INFO: renamed from: i */
    public final float f10537i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f10538j;

    /* JADX INFO: renamed from: k */
    public int f10539k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f10540l;

    /* JADX INFO: renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$a */
    public class C2852a implements AdapterView.OnItemClickListener {
        public C2852a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.m13088l(i10 < 0 ? materialAutoCompleteTextView.f10533e.m39966u() : materialAutoCompleteTextView.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.f10533e.m39969x();
                    i10 = MaterialAutoCompleteTextView.this.f10533e.m39968w();
                    j10 = MaterialAutoCompleteTextView.this.f10533e.m39967v();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f10533e.mo1579o(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f10533e.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$b */
    public class C2853b<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a */
        public ColorStateList f10542a;

        /* JADX INFO: renamed from: b */
        public ColorStateList f10543b;

        public C2853b(Context context, @NonNull int i10, String[] strArr) {
            super(context, i10, strArr);
            m13094f();
        }

        /* JADX INFO: renamed from: a */
        public final ColorStateList m13089a() {
            if (!m13091c() || !m13092d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.f10540l.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.f10540l.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{C11840a.m44233i(MaterialAutoCompleteTextView.this.f10539k, colorForState), C11840a.m44233i(MaterialAutoCompleteTextView.this.f10539k, colorForState2), MaterialAutoCompleteTextView.this.f10539k});
        }

        /* JADX INFO: renamed from: b */
        public final Drawable m13090b() {
            if (!m13091c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f10539k);
            if (this.f10543b == null) {
                return colorDrawable;
            }
            C10425a.m40118o(colorDrawable, this.f10542a);
            return new RippleDrawable(this.f10543b, colorDrawable, null);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m13091c() {
            return MaterialAutoCompleteTextView.this.f10539k != 0;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m13092d() {
            return MaterialAutoCompleteTextView.this.f10540l != null;
        }

        /* JADX INFO: renamed from: e */
        public final ColorStateList m13093e() {
            if (!m13092d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f10540l.getColorForState(iArr, 0), 0});
        }

        /* JADX INFO: renamed from: f */
        public void m13094f() {
            this.f10543b = m13093e();
            this.f10542a = m13089a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                C0625o0.m3048q0(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? m13090b() : null);
            }
            return view2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25885a);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (m13083g()) {
            this.f10533e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    /* JADX INFO: renamed from: f */
    public final TextInputLayout m13082f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m13083g() {
        return m13085i() || m13084h();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f10538j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM13082f = m13082f();
        return (textInputLayoutM13082f == null || !textInputLayoutM13082f.m13124R()) ? super.getHint() : textInputLayoutM13082f.getHint();
    }

    public float getPopupElevation() {
        return this.f10537i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f10539k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f10540l;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m13084h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f10534f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f10534f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m13085i() {
        AccessibilityManager accessibilityManager = this.f10534f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: renamed from: j */
    public final int m13086j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutM13082f = m13082f();
        int i10 = 0;
        if (adapter == null || textInputLayoutM13082f == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f10533e.m39968w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutM13082f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableM39958g = this.f10533e.m39958g();
        if (drawableM39958g != null) {
            drawableM39958g.getPadding(this.f10535g);
            Rect rect = this.f10535g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutM13082f.getEndIconView().getMeasuredWidth();
    }

    /* JADX INFO: renamed from: k */
    public final void m13087k() {
        TextInputLayout textInputLayoutM13082f = m13082f();
        if (textInputLayoutM13082f != null) {
            textInputLayoutM13082f.m13158r0();
        }
    }

    /* JADX INFO: renamed from: l */
    public final <T extends ListAdapter & Filterable> void m13088l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM13082f = m13082f();
        if (textInputLayoutM13082f != null && textInputLayoutM13082f.m13124R() && super.getHint() == null && C0136h.m401b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f10533e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m13086j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (m13083g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t8) {
        super.setAdapter(t8);
        this.f10533e.mo1805m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C10392o0 c10392o0 = this.f10533e;
        if (c10392o0 != null) {
            c10392o0.m39955b(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f10538j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C6363g) {
            ((C6363g) dropDownBackground).m27719a0(this.f10538j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f10533e.m39949L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        m13087k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f10539k = i10;
        if (getAdapter() instanceof C2853b) {
            ((C2853b) getAdapter()).m13094f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f10540l = colorStateList;
        if (getAdapter() instanceof C2853b) {
            ((C2853b) getAdapter()).m13094f();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (m13083g()) {
            this.f10533e.show();
        } else {
            super.showDropDown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(C8485a.m34268c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f10535g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM436i = C0143o.m436i(context2, attributeSet, C6747k.f26582x2, i10, C6746j.f26113e, new int[0]);
        int i11 = C6747k.f26591y2;
        if (typedArrayM436i.hasValue(i11) && typedArrayM436i.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f10536h = typedArrayM436i.getResourceId(C6747k.f26147B2, C6744h.f26071m);
        this.f10537i = typedArrayM436i.getDimensionPixelOffset(C6747k.f26600z2, C6740d.f25955Z);
        int i12 = C6747k.f26138A2;
        if (typedArrayM436i.hasValue(i12)) {
            this.f10538j = ColorStateList.valueOf(typedArrayM436i.getColor(i12, 0));
        }
        this.f10539k = typedArrayM436i.getColor(C6747k.f26156C2, 0);
        this.f10540l = C5050c.m23736a(context2, typedArrayM436i, C6747k.f26165D2);
        this.f10534f = (AccessibilityManager) context2.getSystemService("accessibility");
        C10392o0 c10392o0 = new C10392o0(context2);
        this.f10533e = c10392o0;
        c10392o0.m39946I(true);
        c10392o0.m39940C(this);
        c10392o0.m39945H(2);
        c10392o0.mo1805m(getAdapter());
        c10392o0.m39948K(new C2852a());
        int i13 = C6747k.f26174E2;
        if (typedArrayM436i.hasValue(i13)) {
            setSimpleItems(typedArrayM436i.getResourceId(i13, 0));
        }
        typedArrayM436i.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new C2853b(getContext(), this.f10536h, strArr));
    }
}
