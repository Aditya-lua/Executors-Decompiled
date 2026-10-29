package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p194ic.C6738b;
import p194ic.C6744h;
import p217jd.InterfaceC7148a;

/* JADX INFO: loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* JADX INFO: renamed from: J */
    public static final int[] f10515J;

    /* JADX INFO: renamed from: K */
    public static final int[] f10516K;

    /* JADX INFO: renamed from: H */
    public final AccessibilityManager f10517H;

    /* JADX INFO: renamed from: I */
    public boolean f10518I;

    public static final class SnackbarLayout extends BaseTransientBottomBar.C2848t {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C2848t, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C2848t, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C2848t, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C2848t, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C2848t, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C2848t, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.C2848t, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.Snackbar$a */
    public static class C2849a extends BaseTransientBottomBar.AbstractC2846r<Snackbar> {
        /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/Object;)V */
        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.AbstractC2846r
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo13037b(Snackbar snackbar) {
        }
    }

    static {
        int i10 = C6738b.f25879U;
        f10515J = new int[]{i10};
        f10516K = new int[]{i10, C6738b.f25881W};
    }

    public Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull InterfaceC7148a interfaceC7148a) {
        super(context, viewGroup, view, interfaceC7148a);
        this.f10517H = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX INFO: renamed from: h0 */
    public static ViewGroup m13046h0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: k0 */
    public static boolean m13047k0(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f10516K);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @NonNull
    /* JADX INFO: renamed from: l0 */
    public static Snackbar m13048l0(@NonNull View view, @NonNull CharSequence charSequence, int i10) {
        return m13049m0(null, view, charSequence, i10);
    }

    @NonNull
    /* JADX INFO: renamed from: m0 */
    public static Snackbar m13049m0(Context context, @NonNull View view, @NonNull CharSequence charSequence, int i10) {
        ViewGroup viewGroupM13046h0 = m13046h0(view);
        if (viewGroupM13046h0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupM13046h0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(m13047k0(context) ? C6744h.f26079u : C6744h.f26061c, viewGroupM13046h0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupM13046h0, snackbarContentLayout, snackbarContentLayout);
        snackbar.m13052n0(charSequence);
        snackbar.m13013V(i10);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* JADX INFO: renamed from: A */
    public void mo12992A() {
        super.mo12992A();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* JADX INFO: renamed from: E */
    public int mo12996E() {
        int iMo12996E = super.mo12996E();
        if (iMo12996E == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f10517H.getRecommendedTimeoutMillis(iMo12996E, (this.f10518I ? 4 : 0) | 3);
        }
        if (this.f10518I && this.f10517H.isTouchExplorationEnabled()) {
            return -2;
        }
        return iMo12996E;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    /* JADX INFO: renamed from: Z */
    public void mo13017Z() {
        super.mo13017Z();
    }

    /* JADX INFO: renamed from: i0 */
    public final SnackbarContentLayout m13050i0() {
        return (SnackbarContentLayout) this.f10461i.getChildAt(0);
    }

    /* JADX INFO: renamed from: j0 */
    public final TextView m13051j0() {
        return m13050i0().getMessageView();
    }

    @NonNull
    /* JADX INFO: renamed from: n0 */
    public Snackbar m13052n0(@NonNull CharSequence charSequence) {
        m13051j0().setText(charSequence);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: o0 */
    public Snackbar m13053o0(int i10) {
        m13051j0().setMaxLines(i10);
        return this;
    }
}
