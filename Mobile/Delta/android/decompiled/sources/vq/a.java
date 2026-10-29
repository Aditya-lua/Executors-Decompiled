package vq;

import android.content.Context;
import android.graphics.Color;
import android.view.Window;
import androidx.core.view.l1;
import jq.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lvq/a;", "", "", "controlNavigationBar", "controlStatusBar", "<init>", "(ZZ)V", "Landroid/content/Context;", "context", "", "backgroundColor", "", "a", "(Landroid/content/Context;I)V", "Landroid/view/Window;", "b", "(Landroid/view/Window;I)V", "Z", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean controlNavigationBar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean controlStatusBar;

    public a(boolean z10, boolean z11) {
        this.controlNavigationBar = z10;
        this.controlStatusBar = z11;
    }

    public final void a(@NotNull Context context, int backgroundColor) {
        Window window;
        Intrinsics.checkNotNullParameter(context, "context");
        j.b bVarA = g.a(context);
        if (bVarA == null || (window = bVarA.getWindow()) == null) {
            return;
        }
        b(window, backgroundColor);
    }

    public final void b(Window window, int i10) {
        int iRgb = Color.rgb(Color.red(i10), Color.green(i10), Color.blue(i10));
        double d10 = androidx.core.graphics.c.d(-1, iRgb);
        double d11 = androidx.core.graphics.c.d(-16777216, iRgb);
        l1 l1Var = new l1(window, window.getDecorView());
        if (this.controlNavigationBar) {
            l1Var.c(d10 < d11);
        }
        if (this.controlStatusBar) {
            l1Var.d(d10 < d11);
        }
    }
}
