package com.google.android.material.internal;

import ad.C0135g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.C0417g;
import androidx.appcompat.view.menu.InterfaceC0420j;
import androidx.appcompat.widget.C0484b;
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import p066d3.C4431i;
import p181i.C6589a;
import p194ic.C6740d;
import p194ic.C6741e;
import p194ic.C6742f;
import p194ic.C6744h;
import p298n2.C8870h;
import p365q.C10369e1;
import p368q2.C10425a;
import p564y2.C13017p;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends C0135g implements InterfaceC0420j.a {

    /* JADX INFO: renamed from: G */
    public static final int[] f10313G = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public FrameLayout f10314A;

    /* JADX INFO: renamed from: B */
    public C0417g f10315B;

    /* JADX INFO: renamed from: C */
    public ColorStateList f10316C;

    /* JADX INFO: renamed from: D */
    public boolean f10317D;

    /* JADX INFO: renamed from: E */
    public Drawable f10318E;

    /* JADX INFO: renamed from: F */
    public final C0582a f10319F;

    /* JADX INFO: renamed from: v */
    public int f10320v;

    /* JADX INFO: renamed from: w */
    public boolean f10321w;

    /* JADX INFO: renamed from: x */
    public boolean f10322x;

    /* JADX INFO: renamed from: y */
    public boolean f10323y;

    /* JADX INFO: renamed from: z */
    public final CheckedTextView f10324z;

    /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C2819a extends C0582a {
        public C2819a() {
        }

        @Override // androidx.core.view.C0582a
        /* JADX INFO: renamed from: g */
        public void mo2799g(View view, @NonNull C13017p c13017p) {
            super.mo2799g(view, c13017p);
            c13017p.m48404j0(NavigationMenuItemView.this.f10322x);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f10314A == null) {
                this.f10314A = (FrameLayout) ((ViewStub) findViewById(C6742f.f26036g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f10314A.removeAllViews();
            this.f10314A.addView(view);
        }
    }

    /* JADX INFO: renamed from: A */
    public final StateListDrawable m12853A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C6589a.f25045x, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f10313G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m12854B() {
        return this.f10315B.getTitle() == null && this.f10315B.getIcon() == null && this.f10315B.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j.a
    /* JADX INFO: renamed from: c */
    public void mo1537c(@NonNull C0417g c0417g, int i10) {
        this.f10315B = c0417g;
        if (c0417g.getItemId() > 0) {
            setId(c0417g.getItemId());
        }
        setVisibility(c0417g.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0625o0.m3048q0(this, m12853A());
        }
        setCheckable(c0417g.isCheckable());
        setChecked(c0417g.isChecked());
        setEnabled(c0417g.isEnabled());
        setTitle(c0417g.getTitle());
        setIcon(c0417g.getIcon());
        setActionView(c0417g.getActionView());
        setContentDescription(c0417g.getContentDescription());
        C10369e1.m39834a(this, c0417g.getTooltipText());
        m12855z();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j.a
    /* JADX INFO: renamed from: d */
    public boolean mo1538d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0420j.a
    public C0417g getItemData() {
        return this.f10315B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        C0417g c0417g = this.f10315B;
        if (c0417g != null && c0417g.isCheckable() && this.f10315B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10313G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f10322x != z10) {
            this.f10322x = z10;
            this.f10319F.mo2804l(this.f10324z, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f10324z.setChecked(z10);
        CheckedTextView checkedTextView = this.f10324z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f10323y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f10317D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C10425a.m40121r(drawable).mutate();
                C10425a.m40118o(drawable, this.f10316C);
            }
            int i10 = this.f10320v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f10321w) {
            if (this.f10318E == null) {
                Drawable drawableM35662e = C8870h.m35662e(getResources(), C6741e.f26006m, getContext().getTheme());
                this.f10318E = drawableM35662e;
                if (drawableM35662e != null) {
                    int i11 = this.f10320v;
                    drawableM35662e.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f10318E;
        }
        C4431i.m22306m(this.f10324z, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f10324z.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f10320v = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f10316C = colorStateList;
        this.f10317D = colorStateList != null;
        C0417g c0417g = this.f10315B;
        if (c0417g != null) {
            setIcon(c0417g.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f10324z.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f10321w = z10;
    }

    public void setTextAppearance(int i10) {
        C4431i.m22312s(this.f10324z, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f10324z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10324z.setText(charSequence);
    }

    /* JADX INFO: renamed from: z */
    public final void m12855z() {
        if (m12854B()) {
            this.f10324z.setVisibility(8);
            FrameLayout frameLayout = this.f10314A;
            if (frameLayout != null) {
                C0484b.a aVar = (C0484b.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f10314A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f10324z.setVisibility(0);
        FrameLayout frameLayout2 = this.f10314A;
        if (frameLayout2 != null) {
            C0484b.a aVar2 = (C0484b.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f10314A.setLayoutParams(aVar2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10323y = true;
        C2819a c2819a = new C2819a();
        this.f10319F = c2819a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C6744h.f26062d, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C6740d.f25962d));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C6742f.f26037h);
        this.f10324z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0625o0.m3040m0(checkedTextView, c2819a);
    }
}
