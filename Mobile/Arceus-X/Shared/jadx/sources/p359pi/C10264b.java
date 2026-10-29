package p359pi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.C11344p0;
import sg.C11347q0;
import th.C11659h;

/* JADX INFO: renamed from: pi.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lpi/b;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "active", "", "b", "(Landroid/app/Activity;Z)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10264b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10264b f36878a = new C10264b();

    /* JADX INFO: renamed from: c */
    public static final void m39420c(Activity activity, boolean z10) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        new AlertDialog.Builder(activity).setIcon(z10 ? C11344p0.f39894b : C11344p0.f39893a).setTitle(C11347q0.f40025y).setPositiveButton(C11347q0.f40013u, (DialogInterface.OnClickListener) null).show();
    }

    /* JADX INFO: renamed from: b */
    public final void m39421b(@NotNull final Activity activity, final boolean active) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (C11659h.m43403a().mo43434E1()) {
            activity.runOnUiThread(new Runnable() { // from class: pi.a
                @Override // java.lang.Runnable
                public final void run() {
                    C10264b.m39420c(activity, active);
                }
            });
        }
    }
}
