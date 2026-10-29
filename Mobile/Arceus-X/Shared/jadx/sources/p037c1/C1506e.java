package p037c1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: renamed from: c1.e */
/* JADX INFO: loaded from: classes.dex */
public class C1506e {

    /* JADX INFO: renamed from: a */
    public final Context f5784a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1507f f5785b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1507f f5786c;

    public C1506e(Context context) {
        this.f5784a = context;
        if (Build.VERSION.SDK_INT >= 35) {
            this.f5786c = new C1504c(context);
        }
        this.f5785b = m7661b();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC1505d m7660a(String str) {
        ArrayList arrayList = new ArrayList();
        InterfaceC1507f interfaceC1507f = this.f5785b;
        if (interfaceC1507f != null) {
            arrayList.add(interfaceC1507f.mo7658a(str));
        }
        InterfaceC1507f interfaceC1507f2 = this.f5786c;
        if (interfaceC1507f2 != null) {
            try {
                arrayList.add(interfaceC1507f2.mo7658a(str));
            } catch (UnsupportedOperationException unused) {
            }
        }
        return new C1502a(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC1507f m7661b() {
        String string;
        try {
            ServiceInfo[] serviceInfoArr = this.f5784a.getPackageManager().getPackageInfo(this.f5784a.getPackageName(), 132).services;
            if (serviceInfoArr == null) {
                return null;
            }
            String str = null;
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                    if (str != null) {
                        throw new IllegalStateException("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                    }
                    str = string;
                }
            }
            if (str == null) {
                return null;
            }
            return m7662c(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1507f m7662c(String str) {
        try {
            return (InterfaceC1507f) Class.forName(str).getConstructor(Context.class).newInstance(this.f5784a);
        } catch (Exception e10) {
            throw new IllegalStateException("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e10);
        }
    }
}
