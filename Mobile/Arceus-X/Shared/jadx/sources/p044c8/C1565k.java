package p044c8;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: c8.k */
/* JADX INFO: loaded from: classes.dex */
public class C1565k implements InterfaceC1559e {

    /* JADX INFO: renamed from: a */
    public final a f6269a;

    /* JADX INFO: renamed from: b */
    public final C1563i f6270b;

    /* JADX INFO: renamed from: c */
    public final Map<String, InterfaceC1567m> f6271c;

    /* JADX INFO: renamed from: c8.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Context f6272a;

        /* JADX INFO: renamed from: b */
        public Map<String, String> f6273b = null;

        public a(Context context) {
            this.f6272a = context;
        }

        /* JADX INFO: renamed from: d */
        public static Bundle m8170d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public final Map<String, String> m8171a(Context context) {
            Bundle bundleM8170d = m8170d(context);
            if (bundleM8170d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleM8170d.keySet()) {
                Object obj = bundleM8170d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC1558d m8172b(String str) {
            String str2 = m8173c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC1558d) Class.forName(str2).asSubclass(InterfaceC1558d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e10) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e10);
                return null;
            } catch (IllegalAccessException e11) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e11);
                return null;
            } catch (InstantiationException e12) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e12);
                return null;
            } catch (NoSuchMethodException e13) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e13);
                return null;
            } catch (InvocationTargetException e14) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e14);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final Map<String, String> m8173c() {
            if (this.f6273b == null) {
                this.f6273b = m8171a(this.f6272a);
            }
            return this.f6273b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1565k(Context context, C1563i c1563i) {
        this(new a(context), c1563i);
    }

    @Override // p044c8.InterfaceC1559e
    /* JADX INFO: renamed from: a */
    public synchronized InterfaceC1567m mo8159a(String str) {
        if (this.f6271c.containsKey(str)) {
            return this.f6271c.get(str);
        }
        InterfaceC1558d interfaceC1558dM8172b = this.f6269a.m8172b(str);
        if (interfaceC1558dM8172b == null) {
            return null;
        }
        InterfaceC1567m interfaceC1567mCreate = interfaceC1558dM8172b.create(this.f6270b.m8166a(str));
        this.f6271c.put(str, interfaceC1567mCreate);
        return interfaceC1567mCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1565k(a aVar, C1563i c1563i) {
        this.f6271c = new HashMap();
        this.f6269a = aVar;
        this.f6270b = c1563i;
    }
}
