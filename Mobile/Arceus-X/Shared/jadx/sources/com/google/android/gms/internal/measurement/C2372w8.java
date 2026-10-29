package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import p169he.C6384n;
import p261l2.C7980g;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2372w8 implements InterfaceC2318t8 {

    /* JADX INFO: renamed from: d */
    public static C2372w8 f8731d;

    /* JADX INFO: renamed from: a */
    public final Context f8732a;

    /* JADX INFO: renamed from: b */
    public final ContentObserver f8733b;

    /* JADX INFO: renamed from: c */
    public boolean f8734c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2372w8() {
        this.f8734c = false;
        this.f8732a = null;
        this.f8733b = null;
    }

    /* JADX INFO: renamed from: c */
    public static C2372w8 m10916c(Context context) {
        C2372w8 c2372w8;
        synchronized (C2372w8.class) {
            try {
                if (f8731d == null) {
                    f8731d = C7980g.m33039b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C2372w8(context) : new C2372w8();
                }
                C2372w8 c2372w9 = f8731d;
                if (c2372w9 != null && c2372w9.f8733b != null && !c2372w9.f8734c) {
                    try {
                        context.getContentResolver().registerContentObserver(C2045e8.f8159a, true, f8731d.f8733b);
                        ((C2372w8) C6384n.m27928l(f8731d)).f8734c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                c2372w8 = (C2372w8) C6384n.m27928l(f8731d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2372w8;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m10917e() {
        Context context;
        try {
            C2372w8 c2372w8 = f8731d;
            if (c2372w8 != null && (context = c2372w8.f8732a) != null && c2372w8.f8733b != null && c2372w8.f8734c) {
                context.getContentResolver().unregisterContentObserver(f8731d.f8733b);
            }
            f8731d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: b(Ljava/lang/String;)Ljava/lang/Object; */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2318t8
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String mo10430b(final String str) {
        Context context = this.f8732a;
        if (context != null && !C2156k8.m10319b(context)) {
            try {
                return (String) InterfaceC2318t8.m10767a(new InterfaceC2300s8() { // from class: com.google.android.gms.internal.measurement.v8
                    @Override // com.google.android.gms.internal.measurement.InterfaceC2300s8
                    public final /* synthetic */ Object zza() {
                        return this.f8712a.m10919f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String m10919f(String str) {
        return C2026d8.m9919a(((Context) C6384n.m27928l(this.f8732a)).getContentResolver(), str, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2372w8(Context context) {
        this.f8734c = false;
        this.f8732a = context;
        this.f8733b = new C2336u8(this, null);
    }
}
