package p191i9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p462u9.C11822m;
import p511w9.C12327c;

/* JADX INFO: renamed from: i9.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6689c0 {

    /* JADX INFO: renamed from: a */
    public final Context f25781a;

    /* JADX INFO: renamed from: b */
    public int f25782b;

    /* JADX INFO: renamed from: c */
    public int f25783c = 0;

    public C6689c0(Context context) {
        this.f25781a = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m28799a() {
        PackageInfo packageInfoM46178e;
        if (this.f25782b == 0) {
            try {
                packageInfoM46178e = C12327c.m46181a(this.f25781a).m46178e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfoM46178e = null;
            }
            if (packageInfoM46178e != null) {
                this.f25782b = packageInfoM46178e.versionCode;
            }
        }
        return this.f25782b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x001d, B:14:0x0028, B:16:0x002f, B:18:0x0041, B:26:0x0062, B:21:0x0048, B:23:0x005b, B:29:0x0066, B:33:0x0075), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX INFO: renamed from: b */
    public final synchronized int m28800b() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i10 = this.f25783c;
        if (i10 != 0) {
            return i10;
        }
        Context context = this.f25781a;
        PackageManager packageManager = context.getPackageManager();
        if (C12327c.m46181a(context).m46175b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (C11822m.m44200g()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != C11822m.m44200g()) {
                i11 = 2;
            }
            this.f25783c = i11;
            return i11;
        }
        Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent3.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
            if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                if (true != C11822m.m44200g()) {
                    i11 = 2;
                }
                this.f25783c = i11;
                return i11;
            }
            i11 = 2;
        }
        this.f25783c = i11;
        return i11;
    }
}
