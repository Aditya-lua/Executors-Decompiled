package com.google.android.material.internal;

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
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import androidx.core.view.o0;
import bd.g;
import com.google.mlkit.vision.barcode.common.Barcode;
import d3.i;
import jc.d;
import jc.e;
import jc.f;
import n2.h;
import q.f1;
import y2.p;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends g implements j.a {
    public static final int[] G = {R.attr.state_checked};
    public FrameLayout A;
    public androidx.appcompat.view.menu.g B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final androidx.core.view.a F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7952v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f7953w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f7954x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f7955y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CheckedTextView f7956z;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull p pVar) {
            super.g(view, pVar);
            pVar.j0(NavigationMenuItemView.this.f7954x);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(f.f20375g)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    public final StateListDrawable A() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i.a.f18751x, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public final boolean B() {
        return this.B.getTitle() == null && this.B.getIcon() == null && this.B.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(@NonNull androidx.appcompat.view.menu.g gVar, int i10) {
        this.B = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            o0.q0(this, A());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        f1.a(this, gVar.getTooltipText());
        z();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.B;
        if (gVar != null && gVar.isCheckable() && this.B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f7954x != z10) {
            this.f7954x = z10;
            this.F.l(this.f7956z, Barcode.FORMAT_PDF417);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f7956z.setChecked(z10);
        CheckedTextView checkedTextView = this.f7956z;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f7955y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = q2.a.r(drawable).mutate();
                q2.a.o(drawable, this.C);
            }
            int i10 = this.f7952v;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f7953w) {
            if (this.E == null) {
                Drawable drawableE = h.e(getResources(), e.f20369m, getContext().getTheme());
                this.E = drawableE;
                if (drawableE != null) {
                    int i11 = this.f7952v;
                    drawableE.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.E;
        }
        i.m(this.f7956z, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f7956z.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f7952v = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.B;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f7956z.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f7953w = z10;
    }

    public void setTextAppearance(int i10) {
        i.s(this.f7956z, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7956z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7956z.setText(charSequence);
    }

    public final void z() {
        if (B()) {
            this.f7956z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                b.a aVar = (b.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f7956z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            b.a aVar2 = (b.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7955y = true;
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(jc.h.f20399d, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(d.f20326d));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(f.f20376h);
        this.f7956z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        o0.m0(checkedTextView, aVar);
    }
}
