package com.google.android.material.floatingactionbutton;

import ad.C0131c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0625o0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import java.util.List;
import p194ic.C6746j;
import p194ic.C6747k;
import p216jc.C7144h;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.InterfaceC0523b {

    /* JADX INFO: renamed from: C */
    public static final int f10175C = C6746j.f26131w;

    /* JADX INFO: renamed from: D */
    public static final Property<View, Float> f10176D = new C2806a(Float.class, "width");

    /* JADX INFO: renamed from: E */
    public static final Property<View, Float> f10177E = new C2807b(Float.class, "height");

    /* JADX INFO: renamed from: F */
    public static final Property<View, Float> f10178F = new C2808c(Float.class, "paddingStart");

    /* JADX INFO: renamed from: G */
    public static final Property<View, Float> f10179G = new C2809d(Float.class, "paddingEnd");

    /* JADX INFO: renamed from: A */
    public boolean f10180A;

    /* JADX INFO: renamed from: B */
    @NonNull
    public ColorStateList f10181B;

    /* JADX INFO: renamed from: u */
    public final int f10182u;

    /* JADX INFO: renamed from: v */
    public int f10183v;

    /* JADX INFO: renamed from: w */
    public int f10184w;

    /* JADX INFO: renamed from: x */
    @NonNull
    public final CoordinatorLayout.AbstractC0524c<ExtendedFloatingActionButton> f10185x;

    /* JADX INFO: renamed from: y */
    public boolean f10186y;

    /* JADX INFO: renamed from: z */
    public boolean f10187z;

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    public class C2806a extends Property<View, Float> {
        public C2806a(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    public class C2807b extends Property<View, Float> {
        public C2807b(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    public class C2808c extends Property<View, Float> {
        public C2808c(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(C0625o0.m2986E(view));
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f10) {
            C0625o0.m2981B0(view, f10.intValue(), view.getPaddingTop(), C0625o0.m2984D(view), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    public class C2809d extends Property<View, Float> {
        public C2809d(Class cls, String str) {
            super(cls, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@NonNull View view) {
            return Float.valueOf(C0625o0.m2984D(view));
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull View view, @NonNull Float f10) {
            C0625o0.m2981B0(view, C0625o0.m2986E(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    public static abstract class AbstractC2810e {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC0523b
    @NonNull
    public CoordinatorLayout.AbstractC0524c<ExtendedFloatingActionButton> getBehavior() {
        return this.f10185x;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i10 = this.f10182u;
        return i10 < 0 ? (Math.min(C0625o0.m2986E(this), C0625o0.m2984D(this)) * 2) + getIconSize() : i10;
    }

    public C7144h getExtendMotionSpec() {
        throw null;
    }

    public C7144h getHideMotionSpec() {
        throw null;
    }

    public C7144h getShowMotionSpec() {
        throw null;
    }

    public C7144h getShrinkMotionSpec() {
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final void m12723k(int i10, AbstractC2810e abstractC2810e) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            throw null;
        }
        throw new IllegalStateException("Unknown strategy type: " + i10);
    }

    /* JADX INFO: renamed from: l */
    public final void m12724l() {
        this.f10181B = getTextColors();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10186y && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f10186y = false;
            throw null;
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.f10180A = z10;
    }

    public void setExtendMotionSpec(C7144h c7144h) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(C7144h.m29933c(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.f10186y != z10) {
            throw null;
        }
    }

    public void setHideMotionSpec(C7144h c7144h) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(C7144h.m29933c(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.f10186y || this.f10187z) {
            return;
        }
        this.f10183v = C0625o0.m2986E(this);
        this.f10184w = C0625o0.m2984D(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.f10186y || this.f10187z) {
            return;
        }
        this.f10183v = i10;
        this.f10184w = i12;
    }

    public void setShowMotionSpec(C7144h c7144h) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(C7144h.m29933c(getContext(), i10));
    }

    public void setShrinkMotionSpec(C7144h c7144h) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(C7144h.m29933c(getContext(), i10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        m12724l();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.AbstractC0524c<T> {

        /* JADX INFO: renamed from: a */
        public Rect f10188a;

        /* JADX INFO: renamed from: b */
        public boolean f10189b;

        /* JADX INFO: renamed from: c */
        public boolean f10190c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ExtendedFloatingActionButtonBehavior() {
            this.f10189b = false;
            this.f10190c = true;
        }

        /* JADX INFO: renamed from: K */
        public static boolean m12725K(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0527f) {
                return ((CoordinatorLayout.C0527f) layoutParams).m2632f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX INFO: renamed from: I */
        public void m12726I(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m12723k(this.f10190c ? 3 : 0, null);
        }

        /* JADX DEBUG: Method merged with bridge method: f(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/graphics/Rect;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public boolean mo2606f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, @NonNull Rect rect) {
            return super.mo2606f(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* JADX DEBUG: Method merged with bridge method: l(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public boolean mo2612l(CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m12732P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!m12725K(view)) {
                return false;
            }
            m12733Q(view, extendedFloatingActionButton);
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: p(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public boolean mo2616p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> listM2585r = coordinatorLayout.m2585r(extendedFloatingActionButton);
            int size = listM2585r.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listM2585r.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (m12725K(view) && m12733Q(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (m12732P(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m2565I(extendedFloatingActionButton, i10);
            return true;
        }

        /* JADX INFO: renamed from: N */
        public final boolean m12730N(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f10189b || this.f10190c) && ((CoordinatorLayout.C0527f) extendedFloatingActionButton.getLayoutParams()).m2631e() == view.getId();
        }

        /* JADX INFO: renamed from: O */
        public void m12731O(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            extendedFloatingActionButton.m12723k(this.f10190c ? 2 : 1, null);
        }

        /* JADX INFO: renamed from: P */
        public final boolean m12732P(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m12730N(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f10188a == null) {
                this.f10188a = new Rect();
            }
            Rect rect = this.f10188a;
            C0131c.m387a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                m12731O(extendedFloatingActionButton);
                return true;
            }
            m12726I(extendedFloatingActionButton);
            return true;
        }

        /* JADX INFO: renamed from: Q */
        public final boolean m12733Q(@NonNull View view, @NonNull ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m12730N(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.C0527f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                m12731O(extendedFloatingActionButton);
                return true;
            }
            m12726I(extendedFloatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0524c
        /* JADX INFO: renamed from: k */
        public void mo2611k(@NonNull CoordinatorLayout.C0527f c0527f) {
            if (c0527f.f2253h == 0) {
                c0527f.f2253h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26164D1);
            this.f10189b = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26173E1, false);
            this.f10190c = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26182F1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(@NonNull ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m12724l();
    }
}
