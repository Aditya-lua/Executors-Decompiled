package zp;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\b\u001a\u00020\u0001*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/widget/TextView;", "", "e", "(Landroid/widget/TextView;)V", "Landroid/view/View;", "Lkotlin/Function0;", "onMidWay", "onEnd", "g", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {
    public static final void e(@NotNull final TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setVisibility(0);
        textView.setAlpha(0.8f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = textView.animate();
        viewPropertyAnimatorAnimate.setStartDelay(700L);
        viewPropertyAnimatorAnimate.setDuration(200L).alpha(0.0f).withEndAction(new Runnable() { // from class: zp.r
            @Override // java.lang.Runnable
            public final void run() {
                v.f(textView);
            }
        });
    }

    public static final void f(TextView textView) {
        textView.setAlpha(0.8f);
        textView.setVisibility(8);
    }

    public static final void g(@NotNull final View view, @NotNull final Function0<Unit> onMidWay, @NotNull final Function0<Unit> onEnd) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onMidWay, "onMidWay");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        view.setVisibility(0);
        view.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.setStartDelay(0L);
        viewPropertyAnimatorAnimate.alpha(1.0f).withEndAction(new Runnable() { // from class: zp.s
            @Override // java.lang.Runnable
            public final void run() {
                v.h(onMidWay, view, onEnd);
            }
        });
    }

    public static final void h(Function0 function0, final View view, final Function0 function1) {
        function0.invoke();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.setStartDelay(1000L);
        viewPropertyAnimatorAnimate.withStartAction(new Runnable() { // from class: zp.t
            @Override // java.lang.Runnable
            public final void run() {
                v.i(function1);
            }
        }).withEndAction(new Runnable() { // from class: zp.u
            @Override // java.lang.Runnable
            public final void run() {
                v.j(view);
            }
        }).alpha(0.0f);
    }

    public static final void i(Function0 function0) {
        function0.invoke();
    }

    public static final void j(View view) {
        view.setVisibility(4);
    }
}
