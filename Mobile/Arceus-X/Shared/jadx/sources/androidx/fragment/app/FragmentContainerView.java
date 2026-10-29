package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.C0625o0;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p067d4.C4436c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001BB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001fH\u0016¢\u0006\u0004\b)\u0010(J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020#H\u0001¢\u0006\u0004\b+\u0010,J)\u00100\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u00062\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001fH\u0016¢\u0006\u0004\b4\u0010(J\u0017\u00105\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u001fH\u0016¢\u0006\u0004\b5\u0010(J\u001f\u00108\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u000fH\u0016¢\u0006\u0004\b;\u0010<J\u0019\u0010?\u001a\u00028\u0000\"\n\b\u0000\u0010>*\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u001fH\u0002¢\u0006\u0004\bB\u0010(R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001f0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010DR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001f0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010DR\u0018\u0010J\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010*\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, m31665d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "Landroid/animation/LayoutTransition;", "transition", "", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "Landroid/view/WindowInsets;", "insets", "onApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Landroid/view/View;", "child", "", "drawingTime", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "view", "startViewTransition", "(Landroid/view/View;)V", "endViewTransition", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "removeViewAt", "(I)V", "removeViewInLayout", "removeView", "start", "count", "removeViews", "(II)V", "removeViewsInLayout", "removeAllViewsInLayout", "()V", "Landroidx/fragment/app/c;", "F", "getFragment", "()Landroidx/fragment/app/c;", "v", "a", "", "Ljava/util/List;", "disappearingFragmentChildren", "b", "transitioningFragmentViews", "c", "Landroid/view/View$OnApplyWindowInsetsListener;", "applyWindowInsetsListener", "d", "Z", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<View> disappearingFragmentChildren;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<View> transitioningFragmentViews;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public View.OnApplyWindowInsetsListener applyWindowInsetsListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean drawDisappearingViewsFirst;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentContainerView$a */
    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Landroidx/fragment/app/FragmentContainerView$a;", "", "<init>", "()V", "Landroid/view/View$OnApplyWindowInsetsListener;", "onApplyWindowInsetsListener", "Landroid/view/View;", "v", "Landroid/view/WindowInsets;", "insets", "a", "(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class C0906a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final C0906a f3259a = new C0906a();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final WindowInsets m4347a(@NotNull View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, @NotNull View v5, @NotNull WindowInsets insets) {
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter(v5, "v");
            Intrinsics.checkNotNullParameter(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v5, insets);
            Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public final void m4346a(View v5) {
        if (this.transitioningFragmentViews.contains(v5)) {
            this.disappearingFragmentChildren.add(v5);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(@NotNull View child, int index, @Nullable ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (FragmentManager.m4348H0(child) != null) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public WindowInsets dispatchApplyWindowInsets(@NotNull WindowInsets insets) {
        WindowInsetsCompat windowInsetsCompatM3013Y;
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            C0906a c0906a = C0906a.f3259a;
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            windowInsetsCompatM3013Y = WindowInsetsCompat.toWindowInsetsCompat(c0906a.m4347a(onApplyWindowInsetsListener, this, insets));
        } else {
            windowInsetsCompatM3013Y = C0625o0.m3013Y(this, windowInsetsCompat);
        }
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatM3013Y, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!windowInsetsCompatM3013Y.isConsumed()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C0625o0.m3027g(getChildAt(i10), windowInsetsCompatM3013Y);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            Iterator<T> it = this.disappearingFragmentChildren.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long drawingTime) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        if (this.drawDisappearingViewsFirst && !this.disappearingFragmentChildren.isEmpty() && this.disappearingFragmentChildren.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends ComponentCallbacksC0929c> F getFragment() {
        return (F) FragmentManager.m4362p0(this).m4441m0(getId());
    }

    @Override // android.view.View
    @NotNull
    public WindowInsets onApplyWindowInsets(@NotNull WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return insets;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                Intrinsics.checkNotNullExpressionValue(view, "view");
                m4346a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m4346a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int index) {
        View view = getChildAt(index);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        m4346a(view);
        super.removeViewAt(index);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m4346a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int start, int count) {
        int i10 = start + count;
        for (int i11 = start; i11 < i10; i11++) {
            View view = getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            m4346a(view);
        }
        super.removeViews(start, count);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int start, int count) {
        int i10 = start + count;
        for (int i11 = start; i11 < i10; i11++) {
            View view = getChildAt(i11);
            Intrinsics.checkNotNullExpressionValue(view, "view");
            m4346a(view);
        }
        super.removeViewsInLayout(start, count);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.drawDisappearingViewsFirst = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(@Nullable LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(@Nullable View.OnApplyWindowInsetsListener listener) {
        this.applyWindowInsetsListener = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (r2v0 android.util.AttributeSet)
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
     A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:2) call: androidx.fragment.app.FragmentContainerView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        String str;
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = C4436c.f18444e;
            Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(C4436c.f18445f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(@NotNull Context context, @NotNull AttributeSet attrs, @NotNull FragmentManager fm2) {
        String str;
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(fm2, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = C4436c.f18444e;
        Intrinsics.checkNotNullExpressionValue(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(C4436c.f18445f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(C4436c.f18446g);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        ComponentCallbacksC0929c componentCallbacksC0929cM4441m0 = fm2.m4441m0(id2);
        if (classAttribute != null && componentCallbacksC0929cM4441m0 == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            ComponentCallbacksC0929c componentCallbacksC0929cMo4483a = fm2.m4474y0().mo4483a(context.getClassLoader(), classAttribute);
            Intrinsics.checkNotNullExpressionValue(componentCallbacksC0929cMo4483a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            componentCallbacksC0929cMo4483a.f3463z = id2;
            componentCallbacksC0929cMo4483a.f3408A = id2;
            componentCallbacksC0929cMo4483a.f3409B = string;
            componentCallbacksC0929cMo4483a.f3459v = fm2;
            componentCallbacksC0929cMo4483a.f3460w = fm2.m4365A0();
            componentCallbacksC0929cMo4483a.m4632R0(context, attrs, null);
            fm2.m4452r().m4786s(true).m4776c(this, componentCallbacksC0929cMo4483a, string).mo4511j();
        }
        fm2.m4412Y0(this);
    }
}
