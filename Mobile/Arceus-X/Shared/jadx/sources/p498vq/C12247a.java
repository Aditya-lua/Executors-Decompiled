package p498vq;

import android.content.Context;
import android.graphics.Color;
import android.view.Window;
import androidx.core.graphics.C0546c;
import androidx.core.view.C0619l1;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p203j.ActivityC6992b;
import p226jq.C7259g;

/* JADX INFO: renamed from: vq.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lvq/a;", "", "", "controlNavigationBar", "controlStatusBar", "<init>", "(ZZ)V", "Landroid/content/Context;", "context", "", "backgroundColor", "", "a", "(Landroid/content/Context;I)V", "Landroid/view/Window;", "b", "(Landroid/view/Window;I)V", "Z", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12247a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean controlNavigationBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean controlStatusBar;

    public C12247a(boolean z10, boolean z11) {
        this.controlNavigationBar = z10;
        this.controlStatusBar = z11;
    }

    /* JADX INFO: renamed from: a */
    public final void m45389a(@NotNull Context context, int backgroundColor) {
        Window window;
        Intrinsics.checkNotNullParameter(context, "context");
        ActivityC6992b activityC6992bM30267a = C7259g.m30267a(context);
        if (activityC6992bM30267a == null || (window = activityC6992bM30267a.getWindow()) == null) {
            return;
        }
        m45390b(window, backgroundColor);
    }

    /* JADX INFO: renamed from: b */
    public final void m45390b(Window window, int i10) {
        int iRgb = Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10));
        double dM2670d = C0546c.m2670d(-1, iRgb);
        double dM2670d2 = C0546c.m2670d(ViewCompat.MEASURED_STATE_MASK, iRgb);
        C0619l1 c0619l1 = new C0619l1(window, window.getDecorView());
        if (this.controlNavigationBar) {
            c0619l1.m2949c(dM2670d < dM2670d2);
        }
        if (this.controlStatusBar) {
            c0619l1.m2950d(dM2670d < dM2670d2);
        }
    }
}
