package p226jq;

import android.graphics.Color;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.C0546c;
import androidx.core.view.C0619l1;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jq.p0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Landroid/view/Window;", "", "backgroundColor", "", "a", "(Landroid/view/Window;I)V", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7278p0 {
    /* JADX INFO: renamed from: a */
    public static final void m30321a(@NotNull Window window, int i10) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        int iRgb = Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10));
        double dM2670d = C0546c.m2670d(-1, iRgb);
        double dM2670d2 = C0546c.m2670d(ViewCompat.MEASURED_STATE_MASK, iRgb);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        C0619l1 c0619l1 = new C0619l1(window, decorView);
        c0619l1.m2950d(dM2670d < dM2670d2);
        c0619l1.m2949c(dM2670d < dM2670d2);
    }
}
