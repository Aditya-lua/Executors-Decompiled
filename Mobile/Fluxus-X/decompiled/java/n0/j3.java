package n0;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class j3 implements t.a<Context, h3> {

    public static class a extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    public static h3 b(Context context, Bundle bundle) {
        boolean z10 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrC = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrC2 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        g0.r1.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        g0.r1.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z10);
        g0.r1.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrC));
        g0.r1.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrC2));
        return new h3.b().d(z10).c(e(strArrC)).b(e(strArrC2)).a();
    }

    public static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i10 = bundle.getInt(str, -1);
        if (i10 == -1) {
            g0.r1.l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i10);
        } catch (Resources.NotFoundException e10) {
            g0.r1.m("QuirkSettingsLoader", "Quirk class names resource not found: " + i10, e10);
            return new String[0];
        }
    }

    public static Class<? extends g3> d(String str) {
        try {
            Class cls = Class.forName(str);
            if (g3.class.isAssignableFrom(cls)) {
                return cls;
            }
            g0.r1.l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e10) {
            g0.r1.m("QuirkSettingsLoader", "Class not found: " + str, e10);
            return null;
        }
    }

    public static Set<Class<? extends g3>> e(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends g3> clsD = d(str);
            if (clsD != null) {
                hashSet.add(clsD);
            }
        }
        return hashSet;
    }

    @Override // t.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public h3 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), 640).metaData;
            if (bundle != null) {
                return b(context, bundle);
            }
            g0.r1.l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            g0.r1.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
