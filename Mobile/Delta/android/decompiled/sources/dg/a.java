package dg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import l2.b;
import uf.c;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14616a;
    public final SharedPreferences b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f14617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14618d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f14616a = contextA;
        this.b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f14617c = cVar;
        this.f14618d = c();
    }

    public static Context a(Context context) {
        return b.b(context);
    }

    public synchronized boolean b() {
        return this.f14618d;
    }

    public final boolean c() {
        return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f14616a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f14616a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
