package p526wq;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.C0625o0;
import androidx.core.view.InterfaceC0644y;
import androidx.core.view.WindowInsetsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wq.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\f\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, m31665d2 = {"Landroid/view/View;", "Lkotlin/Function1;", "Landroidx/core/view/WindowInsetsCompat;", "", "cb", "g", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "", "applyTopInset", "applyBottomInset", "applyLeftInset", "applyRightInset", "c", "(Landroid/view/View;ZZZZ)V", "i", "(Landroid/view/View;)V", "a", "Z", "f", "()Z", "supportsCustomNavigationBar", "b", "getSupportsCustomStatusBar", "supportsCustomStatusBar", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12524g {

    /* JADX INFO: renamed from: a */
    public static final boolean f44745a;

    /* JADX INFO: renamed from: b */
    public static final boolean f44746b;

    /* JADX INFO: renamed from: wq.g$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"wq/g$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
            v5.removeOnAttachStateChangeListener(this);
            v5.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v5) {
            Intrinsics.checkNotNullParameter(v5, "v");
        }
    }

    static {
        f44745a = Build.VERSION.SDK_INT >= 30;
        f44746b = true;
    }

    /* JADX INFO: renamed from: c */
    public static final void m46872c(@NotNull final View view, final boolean z10, final boolean z11, final boolean z12, final boolean z13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        m46876g(view, new Function1() { // from class: wq.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12524g.m46874e(view, z12, z10, z13, z11, (WindowInsetsCompat) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m46873d(View view, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        if ((i10 & 8) != 0) {
            z13 = true;
        }
        m46872c(view, z10, z11, z12, z13);
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m46874e(View view, boolean z10, boolean z11, boolean z12, boolean z13, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i10 = insets2.bottom;
        int paddingTop = insetsIgnoringVisibility.top;
        int iMax = Integer.max(insetsIgnoringVisibility.bottom, i10);
        int paddingLeft = insetsIgnoringVisibility.left;
        int paddingRight = insetsIgnoringVisibility.right;
        if (!z10) {
            paddingLeft = view.getPaddingLeft();
        }
        if (!z11) {
            paddingTop = view.getPaddingTop();
        }
        if (!z12) {
            paddingRight = view.getPaddingRight();
        }
        if (!z13) {
            iMax = view.getPaddingBottom();
        }
        view.setPadding(paddingLeft, paddingTop, paddingRight, iMax);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m46875f() {
        return f44745a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m46876g(@NotNull View view, @NotNull final Function1<? super WindowInsetsCompat, Unit> cb2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(cb2, "cb");
        C0625o0.m2979A0(view, new InterfaceC0644y() { // from class: wq.f
            @Override // androidx.core.view.InterfaceC0644y
            /* JADX INFO: renamed from: K */
            public final WindowInsetsCompat mo460K(View view2, WindowInsetsCompat windowInsetsCompat) {
                return C12524g.m46877h(cb2, view2, windowInsetsCompat);
            }
        });
        m46878i(view);
    }

    /* JADX INFO: renamed from: h */
    public static final WindowInsetsCompat m46877h(Function1 function1, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        function1.invoke(insets);
        return insets;
    }

    /* JADX INFO: renamed from: i */
    public static final void m46878i(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }
}
