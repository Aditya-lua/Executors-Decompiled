package xq;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/ViewGroup;", "Landroid/view/View;", "oldViewMaybe", "newView", "Lkr/l;", "transition", BuildConfig.FLAVOR, "a", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Lkr/l;)V", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36993a;

        static {
            int[] iArr = new int[kr.l.values().length];
            try {
                iArr[kr.l.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kr.l.SLIDE_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kr.l.SLIDE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36993a = iArr;
        }
    }

    public static final void a(@NotNull ViewGroup viewGroup, @Nullable View view, @NotNull View newView, @NotNull kr.l transition) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(newView, "newView");
        Intrinsics.checkNotNullParameter(transition, "transition");
        if (view != null) {
            int i10 = a.f36993a[transition.ordinal()];
            if (i10 == 1) {
                p5.y.f(new p5.n(viewGroup, newView), null);
                return;
            }
            if (i10 == 2) {
                p5.b0 b0VarZ0 = new p5.b0().H0(new p5.p(8388611).e(view)).H0(new p5.p(8388613).e(newView)).z0(new AccelerateDecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(b0VarZ0, "setInterpolator(...)");
                p5.y.d(viewGroup);
                p5.y.f(new p5.n(viewGroup, newView), b0VarZ0);
                return;
            }
            if (i10 != 3) {
                throw new zt.l();
            }
            p5.b0 b0VarZ1 = new p5.b0().H0(new p5.p(8388613).e(view)).H0(new p5.p(8388611).e(newView)).z0(new AccelerateDecelerateInterpolator());
            Intrinsics.checkNotNullExpressionValue(b0VarZ1, "setInterpolator(...)");
            p5.y.d(viewGroup);
            p5.y.f(new p5.n(viewGroup, newView), b0VarZ1);
        }
    }
}
