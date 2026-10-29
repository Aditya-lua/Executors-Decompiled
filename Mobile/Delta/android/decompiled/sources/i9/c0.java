package i9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20415a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20416c = 0;

    public c0(Context context) {
        this.f20415a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfoE;
        if (this.b == 0) {
            try {
                packageInfoE = w9.c.a(this.f20415a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("Metadata", "Failed to find package ".concat(e10.toString()));
                packageInfoE = null;
            }
            if (packageInfoE != null) {
                this.b = packageInfoE.versionCode;
            }
        }
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[Catch: all -> 0x0026, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x001d, B:14:0x0028, B:16:0x002f, B:18:0x0041, B:26:0x0062, B:21:0x0048, B:23:0x005b, B:29:0x0066, B:33:0x0075), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    public final synchronized int b() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        int i10 = this.f20416c;
        if (i10 != 0) {
            return i10;
        }
        Context context = this.f20415a;
        PackageManager packageManager = context.getPackageManager();
        if (w9.c.a(context).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i11 = 1;
        if (u9.m.g()) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null) {
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (true != u9.m.g()) {
                i11 = 2;
            }
            this.f20416c = i11;
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
                if (true != u9.m.g()) {
                    i11 = 2;
                }
                this.f20416c = i11;
                return i11;
            }
            i11 = 2;
        }
        this.f20416c = i11;
        return i11;
    }
}
