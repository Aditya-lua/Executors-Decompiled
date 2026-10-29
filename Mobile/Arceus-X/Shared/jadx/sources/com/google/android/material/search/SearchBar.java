package com.google.android.material.search;

import ad.C0144p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0415e;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0625o0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import p168hd.C6363g;
import p168hd.C6364h;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6741e;
import p194ic.C6746j;
import p368q2.C10425a;
import p463uc.C11840a;

/* JADX INFO: loaded from: classes2.dex */
public class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: i0 */
    public static final int f10366i0 = C6746j.f26120l;

    /* JADX INFO: renamed from: T */
    public final TextView f10367T;

    /* JADX INFO: renamed from: U */
    public final boolean f10368U;

    /* JADX INFO: renamed from: V */
    public final boolean f10369V;

    /* JADX INFO: renamed from: W */
    public final Drawable f10370W;

    /* JADX INFO: renamed from: a0 */
    public final boolean f10371a0;

    /* JADX INFO: renamed from: b0 */
    public final boolean f10372b0;

    /* JADX INFO: renamed from: c0 */
    public View f10373c0;

    /* JADX INFO: renamed from: d0 */
    public Integer f10374d0;

    /* JADX INFO: renamed from: e0 */
    public Drawable f10375e0;

    /* JADX INFO: renamed from: f0 */
    public int f10376f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f10377g0;

    /* JADX INFO: renamed from: h0 */
    public C6363g f10378h0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2821a();

        /* JADX INFO: renamed from: c */
        public String f10379c;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchBar$SavedState$a */
        public class C2821a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f10379c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10379c = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: renamed from: X */
    private Drawable m12879X(Drawable drawable) {
        int iM44228d;
        if (!this.f10371a0 || drawable == null) {
            return drawable;
        }
        Integer num = this.f10374d0;
        if (num != null) {
            iM44228d = num.intValue();
        } else {
            iM44228d = C11840a.m44228d(this, drawable == this.f10370W ? C6738b.f25904k : C6738b.f25903j);
        }
        Drawable drawableM40121r = C10425a.m40121r(drawable.mutate());
        C10425a.m40117n(drawableM40121r, iM44228d);
        return drawableM40121r;
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton imageButtonM441d = C0144p.m441d(this);
        if (imageButtonM441d == null) {
            return;
        }
        imageButtonM441d.setClickable(!z10);
        imageButtonM441d.setFocusable(!z10);
        Drawable background = imageButtonM441d.getBackground();
        if (background != null) {
            this.f10375e0 = background;
        }
        imageButtonM441d.setBackgroundDrawable(z10 ? null : this.f10375e0);
        m12885a0();
    }

    /* JADX INFO: renamed from: U */
    public final int m12880U(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    /* JADX INFO: renamed from: V */
    public final void m12881V() {
        View view = this.f10373c0;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f10373c0.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        m12882W(this.f10373c0, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    /* JADX INFO: renamed from: W */
    public final void m12882W(View view, int i10, int i11, int i12, int i13) {
        if (C0625o0.m3065z(this) == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m12883Y(int i10, int i11) {
        View view = this.f10373c0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m12884Z() {
        if (this.f10369V && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C6740d.f25986s);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = m12880U(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = m12880U(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = m12880U(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = m12880U(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m12885a0() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z10 = getLayoutDirection() == 1;
        ImageButton imageButtonM441d = C0144p.m441d(this);
        if (imageButtonM441d == null || !imageButtonM441d.isClickable()) {
            width = 0;
        } else {
            width = z10 ? getWidth() - imageButtonM441d.getLeft() : imageButtonM441d.getRight();
        }
        ActionMenuView actionMenuViewM438a = C0144p.m438a(this);
        if (actionMenuViewM438a != null) {
            right = z10 ? actionMenuViewM438a.getRight() : getWidth() - actionMenuViewM438a.getLeft();
        }
        float f10 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f10, 0.0f, -width, 0.0f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f10368U && this.f10373c0 == null && !(view instanceof ActionMenuView)) {
            this.f10373c0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m12886b0() {
        if (getLayoutParams() instanceof AppBarLayout.C2733d) {
            AppBarLayout.C2733d c2733d = (AppBarLayout.C2733d) getLayoutParams();
            if (this.f10377g0) {
                if (c2733d.m11982c() == 0) {
                    c2733d.m11986g(53);
                }
            } else if (c2733d.m11982c() == 53) {
                c2733d.m11986g(0);
            }
        }
    }

    public View getCenterView() {
        return this.f10373c0;
    }

    public float getCompatElevation() {
        C6363g c6363g = this.f10378h0;
        return c6363g != null ? c6363g.m27748w() : C0625o0.m3055u(this);
    }

    public float getCornerSize() {
        return this.f10378h0.m27703J();
    }

    public int getDefaultMarginVerticalResource() {
        return C6740d.f25987t;
    }

    public int getDefaultNavigationIconResource() {
        return C6741e.f25996c;
    }

    public CharSequence getHint() {
        return this.f10367T.getHint();
    }

    public int getMenuResId() {
        return this.f10376f0;
    }

    public int getStrokeColor() {
        return this.f10378h0.m27699F().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.f10378h0.m27701H();
    }

    @NonNull
    public CharSequence getText() {
        return this.f10367T.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.f10367T;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6364h.m27760f(this, this.f10378h0);
        m12884Z();
        m12886b0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m12881V();
        m12885a0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m12883Y(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m3321a());
        setText(savedState.f10379c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f10379c = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(View view) {
        View view2 = this.f10373c0;
        if (view2 != null) {
            removeView(view2);
            this.f10373c0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f10377g0 = z10;
        m12886b0();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        C6363g c6363g = this.f10378h0;
        if (c6363g != null) {
            c6363g.m27718Z(f10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(CharSequence charSequence) {
        this.f10367T.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m12879X(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f10372b0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        throw null;
    }

    public void setStrokeColor(int i10) {
        if (getStrokeColor() != i10) {
            this.f10378h0.m27731i0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(float f10) {
        if (getStrokeWidth() != f10) {
            this.f10378h0.m27733j0(f10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setText(CharSequence charSequence) {
        this.f10367T.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* JADX INFO: renamed from: y */
    public void mo1935y(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof C0415e;
        if (z10) {
            ((C0415e) menu).m1635e0();
        }
        super.mo1935y(i10);
        this.f10376f0 = i10;
        if (z10) {
            ((C0415e) menu).m1633d0();
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: h */
        public boolean f10380h;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ScrollingViewBehavior() {
            this.f10380h = false;
        }

        @Override // p245kc.AbstractC7539b
        /* JADX INFO: renamed from: T */
        public boolean mo12890T() {
            return true;
        }

        /* JADX INFO: renamed from: Y */
        public final void m12891Y(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: l */
        public boolean mo2612l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean zMo2612l = super.mo2612l(coordinatorLayout, view, view2);
            if (!this.f10380h && (view2 instanceof AppBarLayout)) {
                this.f10380h = true;
                m12891Y((AppBarLayout) view2);
            }
            return zMo2612l;
        }

        public ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10380h = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setHint(int i10) {
        this.f10367T.setHint(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setText(int i10) {
        this.f10367T.setText(i10);
    }
}
