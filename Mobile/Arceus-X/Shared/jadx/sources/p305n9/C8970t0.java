package p305n9;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: n9.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8970t0 {

    /* JADX INFO: renamed from: a */
    public static final Uri f32637a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a */
    public static Intent m36072a(Context context, C8931e1 c8931e1) throws C8966r0 {
        Bundle bundleCall;
        String strM35982a = c8931e1.m35982a();
        if (strM35982a == null) {
            return new Intent().setComponent(c8931e1.m35984c());
        }
        Intent intent = null;
        if (c8931e1.m35985d()) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", strM35982a);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f32637a);
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    throw new RemoteException("Failed to acquire ContentProviderClient");
                }
                try {
                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    if (bundleCall != null) {
                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
                        if (intent2 != null) {
                            intent = intent2;
                        } else {
                            PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
                            if (pendingIntent != null) {
                                StringBuilder sb2 = new StringBuilder(strM35982a.length() + 72);
                                sb2.append("Dynamic lookup for intent failed for action ");
                                sb2.append(strM35982a);
                                sb2.append(" but has possible resolution");
                                Log.w("ServiceBindIntentUtils", sb2.toString());
                                throw new C8966r0(new ConnectionResult(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(strM35982a));
                    }
                } catch (Throwable th2) {
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    throw th2;
                }
            } catch (RemoteException e10) {
                e = e10;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            } catch (IllegalArgumentException e11) {
                e = e11;
                Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
        }
        return intent == null ? new Intent(strM35982a).setPackage(c8931e1.m35983b()) : intent;
    }
}
