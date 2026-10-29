package eg;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import p261l2.C7975b;
import p490vf.InterfaceC12166c;

/* JADX INFO: renamed from: eg.a */
/* JADX INFO: loaded from: classes2.dex */
public class C5112a {

    /* JADX INFO: renamed from: a */
    public final Context f19931a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f19932b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12166c f19933c;

    /* JADX INFO: renamed from: d */
    public boolean f19934d;

    public C5112a(Context context, String str, InterfaceC12166c interfaceC12166c) {
        Context contextM23857a = m23857a(context);
        this.f19931a = contextM23857a;
        this.f19932b = contextM23857a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f19933c = interfaceC12166c;
        this.f19934d = m23859c();
    }

    /* JADX INFO: renamed from: a */
    public static Context m23857a(Context context) {
        return C7975b.m33004b(context);
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m23858b() {
        return this.f19934d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m23859c() {
        return this.f19932b.contains("firebase_data_collection_default_enabled") ? this.f19932b.getBoolean("firebase_data_collection_default_enabled", true) : m23860d();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m23860d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f19931a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f19931a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
