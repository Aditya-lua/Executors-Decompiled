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
import p092e3.ExecutorC4775n;
import p128ff.C5590e;
import p171hg.InterfaceC6404i;
import p191i9.C6686b;
import p575yf.InterfaceC13188b;
import p603zf.AbstractC13806m;
import p603zf.InterfaceC13801h;
import sb.C11268m;
import sb.InterfaceC11248c;
import wf.InterfaceC12411j;

/* JADX INFO: renamed from: com.google.firebase.messaging.b0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2980b0 {

    /* JADX INFO: renamed from: a */
    public final C5590e f11243a;

    /* JADX INFO: renamed from: b */
    public final C2995g0 f11244b;

    /* JADX INFO: renamed from: c */
    public final C6686b f11245c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC13188b<InterfaceC6404i> f11246d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC13188b<InterfaceC12411j> f11247e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC13801h f11248f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2980b0(C5590e c5590e, C2995g0 c2995g0, InterfaceC13188b<InterfaceC6404i> interfaceC13188b, InterfaceC13188b<InterfaceC12411j> interfaceC13188b2, InterfaceC13801h interfaceC13801h) {
        this(c5590e, c2995g0, new C6686b(c5590e.m25268j()), interfaceC13188b, interfaceC13188b2, interfaceC13801h);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m14471a(C2980b0 c2980b0, Task task) {
        c2980b0.getClass();
        return c2980b0.m14478g((Bundle) task.mo11897k(IOException.class));
    }

    /* JADX INFO: renamed from: b */
    public static String m14472b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14473h(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TContinuationResult>, com.google.android.gms.tasks.Task<java.lang.String> */
    /* JADX INFO: renamed from: c */
    public final Task<String> m14474c(Task<Bundle> task) {
        return task.mo11894h(new ExecutorC4775n(), new InterfaceC11248c() { // from class: com.google.firebase.messaging.a0
            @Override // sb.InterfaceC11248c
            public final Object then(Task task2) {
                return C2980b0.m14471a(this.f11230a, task2);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final String m14475d() {
        try {
            return m14472b(MessageDigest.getInstance("SHA-1").digest(this.f11243a.m25269m().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* JADX INFO: renamed from: e */
    public Task<CloudMessage> m14476e() {
        return this.f11245c.m28784a();
    }

    /* JADX INFO: renamed from: f */
    public Task<String> m14477f() {
        return m14474c(m14481k(C2995g0.m14554c(this.f11243a), "*", new Bundle()));
    }

    /* JADX INFO: renamed from: g */
    public final String m14478g(Bundle bundle) throws IOException {
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

    /* JADX INFO: renamed from: i */
    public final void m14479i(String str, String str2, Bundle bundle) {
        InterfaceC12411j.a aVarMo46488b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f11243a.m25270n().m25285c());
        bundle.putString("gmsv", Integer.toString(this.f11244b.m14557d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f11244b.m14555a());
        bundle.putString("app_ver_name", this.f11244b.m14556b());
        bundle.putString("firebase-app-name-hash", m14475d());
        try {
            String strMo50239b = ((AbstractC13806m) C11268m.m42331a(this.f11248f.mo50256a(false))).mo50239b();
            if (TextUtils.isEmpty(strMo50239b)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strMo50239b);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) C11268m.m42331a(this.f11248f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        InterfaceC12411j interfaceC12411j = this.f11247e.get();
        InterfaceC6404i interfaceC6404i = this.f11246d.get();
        if (interfaceC12411j == null || interfaceC6404i == null || (aVarMo46488b = interfaceC12411j.mo46488b("fire-iid")) == InterfaceC12411j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarMo46488b.m46492b()));
        bundle.putString("Firebase-Client", interfaceC6404i.mo27980a());
    }

    /* JADX INFO: renamed from: j */
    public Task<Void> m14480j(boolean z10) {
        return this.f11245c.m28787d(z10);
    }

    /* JADX INFO: renamed from: k */
    public final Task<Bundle> m14481k(String str, String str2, Bundle bundle) {
        try {
            m14479i(str, str2, bundle);
            return this.f11245c.m28786c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return C11268m.m42335e(e10);
        }
    }

    /* JADX INFO: renamed from: l */
    public Task<?> m14482l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m14474c(m14481k(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: renamed from: m */
    public Task<?> m14483m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return m14474c(m14481k(str, "/topics/" + str2, bundle));
    }

    public C2980b0(C5590e c5590e, C2995g0 c2995g0, C6686b c6686b, InterfaceC13188b<InterfaceC6404i> interfaceC13188b, InterfaceC13188b<InterfaceC12411j> interfaceC13188b2, InterfaceC13801h interfaceC13801h) {
        this.f11243a = c5590e;
        this.f11244b = c2995g0;
        this.f11245c = c6686b;
        this.f11246d = interfaceC13188b;
        this.f11247e = interfaceC13188b2;
        this.f11248f = interfaceC13801h;
    }
}
