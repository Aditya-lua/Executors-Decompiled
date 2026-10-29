package p226jq;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.view.GravityCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p322o5.C9654b0;
import p322o5.C9677n;
import p322o5.C9681p;
import p322o5.C9691y;
import p526wq.EnumC12529l;

/* JADX INFO: renamed from: jq.i0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Landroid/view/ViewGroup;", "Landroid/view/View;", "oldViewMaybe", "newView", "Lwq/l;", "transition", "", "a", "(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Lwq/l;)V", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7264i0 {

    /* JADX INFO: renamed from: jq.i0$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f28028a;

        static {
            int[] iArr = new int[EnumC12529l.values().length];
            try {
                iArr[EnumC12529l.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12529l.SLIDE_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC12529l.SLIDE_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28028a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m30284a(@NotNull ViewGroup viewGroup, @Nullable View view, @NotNull View newView, @NotNull EnumC12529l transition) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Intrinsics.checkNotNullParameter(newView, "newView");
        Intrinsics.checkNotNullParameter(transition, "transition");
        if (view != null) {
            int i10 = a.f28028a[transition.ordinal()];
            if (i10 == 1) {
                C9691y.m38306f(new C9677n(viewGroup, newView), null);
                return;
            }
            if (i10 == 2) {
                C9654b0 c9654b0Mo38144v0 = new C9654b0().m38116D0(new C9681p(GravityCompat.START).mo38130e(view)).m38116D0(new C9681p(GravityCompat.END).mo38130e(newView)).mo38144v0(new AccelerateDecelerateInterpolator());
                Intrinsics.checkNotNullExpressionValue(c9654b0Mo38144v0, "setInterpolator(...)");
                C9691y.m38304d(viewGroup);
                C9691y.m38306f(new C9677n(viewGroup, newView), c9654b0Mo38144v0);
                return;
            }
            if (i10 != 3) {
                throw new C7345l();
            }
            C9654b0 c9654b0Mo38144v1 = new C9654b0().m38116D0(new C9681p(GravityCompat.END).mo38130e(view)).m38116D0(new C9681p(GravityCompat.START).mo38130e(newView)).mo38144v0(new AccelerateDecelerateInterpolator());
            Intrinsics.checkNotNullExpressionValue(c9654b0Mo38144v1, "setInterpolator(...)");
            C9691y.m38304d(viewGroup);
            C9691y.m38306f(new C9677n(viewGroup, newView), c9654b0Mo38144v1);
        }
    }
}
