package p526wq;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wq.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lkotlin/Function0;", "", "onCancel", "Landroid/view/View;", "bottomSheet", "contentContainer", "tintView", "b", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lkotlin/jvm/functions/Function0;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12519b {

    /* JADX INFO: renamed from: wq.b$a */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"wq/b$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$g;", "Landroid/view/View;", "bottomSheet", "", "newState", "", "c", "(Landroid/view/View;I)V", "", "slideOffset", "b", "(Landroid/view/View;F)V", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends BottomSheetBehavior.AbstractC2756g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0<Unit> f44730a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f44731b;

        public a(Function0<Unit> function0, View view) {
            this.f44730a = function0;
            this.f44731b = view;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: b */
        public void mo12170b(View bottomSheet, float slideOffset) {
            View view;
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (slideOffset > 0.0f && (view = this.f44731b) != null) {
                view.setVisibility(0);
            }
            View view2 = this.f44731b;
            if (view2 != null) {
                view2.setAlpha(C7764d.m32077b(slideOffset, 0.0f));
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC2756g
        /* JADX INFO: renamed from: c */
        public void mo12171c(View bottomSheet, int newState) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
            if (newState == 4 || newState == 5) {
                this.f44730a.invoke();
                View view = this.f44731b;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m46866b(@NotNull BottomSheetBehavior<?> bottomSheetBehavior, @NotNull Function0<Unit> onCancel, @NotNull final View bottomSheet, @Nullable View view, @Nullable View view2) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        bottomSheetBehavior.m12131c0(new a(onCancel, view2));
        bottomSheetBehavior.m12124W0(true);
        if (view != null) {
            bottomSheet = view;
        }
        C12524g.m46876g(bottomSheet, new Function1() { // from class: wq.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12519b.m46867c(bottomSheet, (WindowInsetsCompat) obj);
            }
        });
        C12524g.m46878i(bottomSheet);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m46867c(View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insetsIgnoringVisibility = insets.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insetsIgnoringVisibility, "getInsetsIgnoringVisibility(...)");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), Integer.max(insetsIgnoringVisibility.bottom, insets2.bottom));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = insetsIgnoringVisibility.top;
        view.setLayoutParams(marginLayoutParams);
        return Unit.f29331a;
    }
}
