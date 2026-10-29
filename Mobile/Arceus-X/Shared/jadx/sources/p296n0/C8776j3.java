package p296n0;

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
import p140g0.C5931r1;
import p436t.InterfaceC11464a;

/* JADX INFO: renamed from: n0.j3 */
/* JADX INFO: loaded from: classes.dex */
public class C8776j3 implements InterfaceC11464a<Context, C8764h3> {

    /* JADX INFO: renamed from: n0.j3$a */
    public static class a extends Service {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static C8764h3 m35223b(Context context, Bundle bundle) {
        boolean z10 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrM35224c = m35224c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrM35224c2 = m35224c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        C5931r1.m26561a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        C5931r1.m26561a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z10);
        C5931r1.m26561a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrM35224c));
        C5931r1.m26561a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrM35224c2));
        return new C8764h3.b().m35151d(z10).m35150c(m35226e(strArrM35224c)).m35149b(m35226e(strArrM35224c2)).m35148a();
    }

    /* JADX INFO: renamed from: c */
    public static String[] m35224c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i10 = bundle.getInt(str, -1);
        if (i10 == -1) {
            C5931r1.m26572l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i10);
        } catch (Resources.NotFoundException e10) {
            C5931r1.m26573m("QuirkSettingsLoader", "Quirk class names resource not found: " + i10, e10);
            return new String[0];
        }
    }

    /* JADX INFO: renamed from: d */
    public static Class<? extends InterfaceC8758g3> m35225d(String str) {
        try {
            Class cls = Class.forName(str);
            if (InterfaceC8758g3.class.isAssignableFrom(cls)) {
                return cls;
            }
            C5931r1.m26572l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e10) {
            C5931r1.m26573m("QuirkSettingsLoader", "Class not found: " + str, e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Set<Class<? extends InterfaceC8758g3>> m35226e(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class<? extends InterfaceC8758g3> clsM35225d = m35225d(str);
            if (clsM35225d != null) {
                hashSet.add(clsM35225d);
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // p436t.InterfaceC11464a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C8764h3 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), 640).metaData;
            if (bundle != null) {
                return m35223b(context, bundle);
            }
            C5931r1.m26572l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            C5931r1.m26561a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
