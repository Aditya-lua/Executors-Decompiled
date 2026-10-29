package p292mf;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p575yf.InterfaceC13188b;

/* JADX INFO: renamed from: mf.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8498f<T> {

    /* JADX INFO: renamed from: a */
    public final T f31220a;

    /* JADX INFO: renamed from: b */
    public final c<T> f31221b;

    /* JADX INFO: renamed from: mf.f$b */
    public static class b implements c<Context> {

        /* JADX INFO: renamed from: a */
        public final Class<? extends Service> f31222a;

        /* JADX INFO: renamed from: b */
        public final Bundle m34322b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f31222a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f31222a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)Ljava/util/List; */
        @Override // p292mf.C8498f.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> mo34321a(Context context) {
            Bundle bundleM34322b = m34322b(context);
            if (bundleM34322b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleM34322b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleM34322b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(Class<? extends Service> cls) {
            this.f31222a = cls;
        }
    }

    /* JADX INFO: renamed from: mf.f$c */
    public interface c<T> {
        /* JADX INFO: renamed from: a */
        List<String> mo34321a(T t8);
    }

    public C8498f(T t8, c<T> cVar) {
        this.f31220a = t8;
        this.f31221b = cVar;
    }

    /* JADX INFO: renamed from: c */
    public static C8498f<Context> m34318c(Context context, Class<? extends Service> cls) {
        return new C8498f<>(context, new b(cls));
    }

    /* JADX INFO: renamed from: d */
    public static ComponentRegistrar m34319d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new C8516w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e10) {
            throw new C8516w(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new C8516w(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new C8516w(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new C8516w(String.format("Could not instantiate %s", str), e13);
        }
    }

    /* JADX INFO: renamed from: b */
    public List<InterfaceC13188b<ComponentRegistrar>> m34320b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f31221b.mo34321a(this.f31220a)) {
            arrayList.add(new InterfaceC13188b() { // from class: mf.e
                @Override // p575yf.InterfaceC13188b
                public final Object get() {
                    return C8498f.m34319d(str);
                }
            });
        }
        return arrayList;
    }
}
