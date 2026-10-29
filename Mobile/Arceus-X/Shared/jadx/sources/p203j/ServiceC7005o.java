package p203j;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: j.o */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceC7005o extends Service {

    /* JADX INFO: renamed from: j.o$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m29625a() {
            return 512;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static ServiceInfo m29624a(@NonNull Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC7005o.class), a.m29625a() | 128);
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@NonNull Intent intent) {
        throw new UnsupportedOperationException();
    }
}
