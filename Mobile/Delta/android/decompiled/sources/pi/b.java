package pi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sg.p0;
import sg.q0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpi/b;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "active", "", "b", "(Landroid/app/Activity;Z)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f28622a = new b();

    public static final void c(Activity activity, boolean z10) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        new AlertDialog.Builder(activity).setIcon(z10 ? p0.b : p0.f30911a).setTitle(q0.f30984y).setPositiveButton(q0.f30972u, (DialogInterface.OnClickListener) null).show();
    }

    public final void b(@NotNull final Activity activity, final boolean active) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (th.h.a().y1()) {
            activity.runOnUiThread(new Runnable() { // from class: pi.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.c(activity, active);
                }
            });
        }
    }
}
