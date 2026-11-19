package o9;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f26934a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    public static Intent a(Context context, p1 p1Var) throws b1 {
        Bundle bundleCall;
        String strA = p1Var.a();
        if (strA == null) {
            return new Intent().setComponent(p1Var.c());
        }
        Intent intent = null;
        if (p1Var.d()) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", strA);
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(f26934a);
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
                                StringBuilder sb2 = new StringBuilder(strA.length() + 72);
                                sb2.append("Dynamic lookup for intent failed for action ");
                                sb2.append(strA);
                                sb2.append(" but has possible resolution");
                                Log.w("ServiceBindIntentUtils", sb2.toString());
                                throw new b1(new k9.b(25, pendingIntent));
                            }
                        }
                    }
                    if (intent == null) {
                        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(strA));
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
        return intent == null ? new Intent(strA).setPackage(p1Var.b()) : intent;
    }
}
