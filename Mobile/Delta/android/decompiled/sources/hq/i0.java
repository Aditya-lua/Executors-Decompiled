package hq;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/ViewGroup;", "Landroid/view/View;", "oldViewMaybe", "newView", "Luq/l;", "transition", "", "a", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Luq/l;)V", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19634a;

        static {
            int[] iArr = new int[uq.l.values().length];
            try {
                iArr[uq.l.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[uq.l.SLIDE_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[uq.l.SLIDE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19634a = iArr;
        }
    }

    public static final void a(@NotNull ViewGroup viewGroup, @Nullable View view, @NotNull View newView, @NotNull uq.l transition) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(newView, "newView");
        Intrinsics.checkNotNullParameter(transition, "transition");
        if (view != null) {
            int i10 = a.f19634a[transition.ordinal()];
            if (i10 == 1) {
                o5.y.f(new o5.n(viewGroup, newView), null);
                return;
            }
            if (i10 == 2) {
                o5.b0 b0VarV0 = new o5.b0().D0(new o5.p(8388611).e(view)).D0(new o5.p(8388613).e(newView)).v0(new AccelerateDecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(b0VarV0, "setInterpolator(...)");
                o5.y.d(viewGroup);
                o5.y.f(new o5.n(viewGroup, newView), b0VarV0);
                return;
            }
            if (i10 != 3) {
                throw new gt.l();
            }
            o5.b0 b0VarV1 = new o5.b0().D0(new o5.p(8388613).e(view)).D0(new o5.p(8388611).e(newView)).v0(new AccelerateDecelerateInterpolator());
            Intrinsics.checkNotNullExpressionValue(b0VarV1, "setInterpolator(...)");
            o5.y.d(viewGroup);
            o5.y.f(new o5.n(viewGroup, newView), b0VarV1);
        }
    }
}
