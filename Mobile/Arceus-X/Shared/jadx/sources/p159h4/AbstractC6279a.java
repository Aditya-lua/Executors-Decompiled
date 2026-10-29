package p159h4;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import okhttp3.internal.p336ws.RealWebSocket;

/* JADX INFO: renamed from: h4.a */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class AbstractC6279a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final SparseArray<PowerManager.WakeLock> f23832a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    public static int f23833b = 1;

    /* JADX INFO: renamed from: b */
    public static boolean m27537b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f23832a;
        synchronized (sparseArray) {
            try {
                PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray.remove(intExtra);
                    return true;
                }
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static ComponentName m27538c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f23832a;
        synchronized (sparseArray) {
            try {
                int i10 = f23833b;
                int i11 = i10 + 1;
                f23833b = i11;
                if (i11 <= 0) {
                    f23833b = 1;
                }
                intent.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
                sparseArray.put(i10, wakeLockNewWakeLock);
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
