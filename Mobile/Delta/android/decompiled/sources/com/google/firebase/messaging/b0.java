package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef.e f8747a;
    public final g0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i9.b f8748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xf.b<gg.i> f8749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xf.b<vf.j> f8750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yf.h f8751f;

    public b0(ef.e eVar, g0 g0Var, xf.b<gg.i> bVar, xf.b<vf.j> bVar2, yf.h hVar) {
        this(eVar, g0Var, new i9.b(eVar.j()), bVar, bVar2, hVar);
    }

    public static /* synthetic */ String a(b0 b0Var, Task task) {
        b0Var.getClass();
        return b0Var.g((Bundle) task.k(IOException.class));
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    public static boolean h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public final Task<String> c(Task<Bundle> task) {
        return task.h(new e3.n(), new sb.c() { // from class: com.google.firebase.messaging.a0
            @Override // sb.c
            public final Object then(Task task2) {
                return b0.a(this.f8737a, task2);
            }
        });
    }

    public final String d() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f8747a.m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public Task<CloudMessage> e() {
        return this.f8748c.a();
    }

    public Task<String> f() {
        return c(k(g0.c(this.f8747a), "*", new Bundle()));
    }

    public final String g(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public final void i(String str, String str2, Bundle bundle) {
        vf.j.a aVarB;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f8747a.n().c());
        bundle.putString("gmsv", Integer.toString(this.b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        bundle.putString("app_ver_name", this.b.b());
        bundle.putString("firebase-app-name-hash", d());
        try {
            String strB = ((yf.m) sb.m.a(this.f8751f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) sb.m.a(this.f8751f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        vf.j jVar = this.f8750e.get();
        gg.i iVar = this.f8749d.get();
        if (jVar == null || iVar == null || (aVarB = jVar.b("fire-iid")) == vf.j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.b()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    public Task<Void> j(boolean z10) {
        return this.f8748c.d(z10);
    }

    public final Task<Bundle> k(String str, String str2, Bundle bundle) {
        try {
            i(str, str2, bundle);
            return this.f8748c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return sb.m.e(e10);
        }
    }

    public Task<?> l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return c(k(str, "/topics/" + str2, bundle));
    }

    public Task<?> m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return c(k(str, "/topics/" + str2, bundle));
    }

    public b0(ef.e eVar, g0 g0Var, i9.b bVar, xf.b<gg.i> bVar2, xf.b<vf.j> bVar3, yf.h hVar) {
        this.f8747a = eVar;
        this.b = g0Var;
        this.f8748c = bVar;
        this.f8749d = bVar2;
        this.f8750e = bVar3;
        this.f8751f = hVar;
    }
}
