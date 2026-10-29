package j;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes.dex */
public final class o extends Service {

    public static class a {
        public static int a() {
            return Barcode.FORMAT_UPC_A;
        }
    }

    @NonNull
    public static ServiceInfo a(@NonNull Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) o.class), a.a() | 128);
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@NonNull Intent intent) {
        throw new UnsupportedOperationException();
    }
}
