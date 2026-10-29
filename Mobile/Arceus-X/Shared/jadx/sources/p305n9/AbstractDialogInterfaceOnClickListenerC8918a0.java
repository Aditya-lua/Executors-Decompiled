package p305n9;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import p268l9.InterfaceC8045j;

/* JADX INFO: renamed from: n9.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC8918a0 implements DialogInterface.OnClickListener {
    /* JADX INFO: renamed from: b */
    public static AbstractDialogInterfaceOnClickListenerC8918a0 m35952b(Activity activity, Intent intent, int i10) {
        return new C8979y(intent, activity, i10);
    }

    /* JADX INFO: renamed from: c */
    public static AbstractDialogInterfaceOnClickListenerC8918a0 m35953c(@NonNull InterfaceC8045j interfaceC8045j, Intent intent, int i10) {
        return new C8981z(intent, interfaceC8045j, 2);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo35954a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                mo35954a();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
