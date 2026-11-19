package com.google.android.material.textfield;

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
import androidx.core.view.o0;
import bd.h;
import bd.o;
import com.github.luben.zstd.BuildConfig;
import fd.c;
import id.g;
import java.util.List;
import jc.j;
import jc.k;
import q.d;
import q.p0;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialAutoCompleteTextView extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final p0 f8128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f8129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Rect f8130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f8132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f8133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f8135l;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.l(i10 < 0 ? materialAutoCompleteTextView.f8128e.u() : materialAutoCompleteTextView.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = MaterialAutoCompleteTextView.this.f8128e.x();
                    i10 = MaterialAutoCompleteTextView.this.f8128e.w();
                    j10 = MaterialAutoCompleteTextView.this.f8128e.v();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f8128e.o(), view, i10, j10);
            }
            MaterialAutoCompleteTextView.this.f8128e.dismiss();
        }
    }

    public class b<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ColorStateList f8137a;
        public ColorStateList b;

        public b(Context context, @NonNull int i10, String[] strArr) {
            super(context, i10, strArr);
            f();
        }

        public final ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            int colorForState = MaterialAutoCompleteTextView.this.f8135l.getColorForState(iArr2, 0);
            int colorForState2 = MaterialAutoCompleteTextView.this.f8135l.getColorForState(iArr, 0);
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{vc.a.i(MaterialAutoCompleteTextView.this.f8134k, colorForState), vc.a.i(MaterialAutoCompleteTextView.this.f8134k, colorForState2), MaterialAutoCompleteTextView.this.f8134k});
        }

        public final Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.f8134k);
            if (this.b == null) {
                return colorDrawable;
            }
            q2.a.o(colorDrawable, this.f8137a);
            return new RippleDrawable(this.b, colorDrawable, null);
        }

        public final boolean c() {
            return MaterialAutoCompleteTextView.this.f8134k != 0;
        }

        public final boolean d() {
            return MaterialAutoCompleteTextView.this.f8135l != null;
        }

        public final ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.f8135l.getColorForState(iArr, 0), 0});
        }

        public void f() {
            this.b = e();
            this.f8137a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                o0.q0(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, jc.b.f20278a);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.f8128e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public final TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean g() {
        return i() || h();
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f8133j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutF = f();
        return (textInputLayoutF == null || !textInputLayoutF.R()) ? super.getHint() : textInputLayoutF.getHint();
    }

    public float getPopupElevation() {
        return this.f8132i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f8134k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f8135l;
    }

    public final boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f8129f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f8129f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i() {
        AccessibilityManager accessibilityManager = this.f8129f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public final int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout textInputLayoutF = f();
        int i10 = 0;
        if (adapter == null || textInputLayoutF == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMin = Math.min(adapter.getCount(), Math.max(0, this.f8128e.w()) + 15);
        View view = null;
        int iMax = 0;
        for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
            int itemViewType = adapter.getItemViewType(iMax2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(iMax2, view, textInputLayoutF);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax = Math.max(iMax, view.getMeasuredWidth());
        }
        Drawable drawableG = this.f8128e.g();
        if (drawableG != null) {
            drawableG.getPadding(this.f8130g);
            Rect rect = this.f8130g;
            iMax += rect.left + rect.right;
        }
        return iMax + textInputLayoutF.getEndIconView().getMeasuredWidth();
    }

    public final void k() {
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null) {
            textInputLayoutF.r0();
        }
    }

    public final <T extends ListAdapter & Filterable> void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutF = f();
        if (textInputLayoutF != null && textInputLayoutF.R() && super.getHint() == null && h.b()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f8128e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t8) {
        super.setAdapter(t8);
        this.f8128e.m(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        p0 p0Var = this.f8128e;
        if (p0Var != null) {
            p0Var.b(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f8133j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).a0(this.f8133j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f8128e.L(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        k();
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f8134k = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f8135l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.f8128e.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(od.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f8130g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = o.i(context2, attributeSet, k.f20677x2, i10, j.f20444e, new int[0]);
        if (typedArrayI.hasValue(k.f20685y2) && typedArrayI.getInt(k.f20685y2, 0) == 0) {
            setKeyListener(null);
        }
        this.f8131h = typedArrayI.getResourceId(k.B2, jc.h.f20408m);
        this.f8132i = typedArrayI.getDimensionPixelOffset(k.f20694z2, jc.d.Z);
        if (typedArrayI.hasValue(k.A2)) {
            this.f8133j = ColorStateList.valueOf(typedArrayI.getColor(k.A2, 0));
        }
        this.f8134k = typedArrayI.getColor(k.C2, 0);
        this.f8135l = c.a(context2, typedArrayI, k.D2);
        this.f8129f = (AccessibilityManager) context2.getSystemService("accessibility");
        p0 p0Var = new p0(context2);
        this.f8128e = p0Var;
        p0Var.I(true);
        p0Var.C(this);
        p0Var.H(2);
        p0Var.m(getAdapter());
        p0Var.K(new a());
        if (typedArrayI.hasValue(k.E2)) {
            setSimpleItems(typedArrayI.getResourceId(k.E2, 0));
        }
        typedArrayI.recycle();
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new b(getContext(), this.f8131h, strArr));
    }
}
