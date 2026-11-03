package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class w8 implements t8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static w8 f6936d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6937a;
    public final ContentObserver b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6938c;

    public w8() {
        this.f6938c = false;
        this.f6937a = null;
        this.b = null;
    }

    public static w8 c(Context context) {
        w8 w8Var;
        synchronized (w8.class) {
            try {
                if (f6936d == null) {
                    f6936d = l2.g.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new w8(context) : new w8();
                }
                w8 w8Var2 = f6936d;
                if (w8Var2 != null && w8Var2.b != null && !w8Var2.f6938c) {
                    try {
                        context.getContentResolver().registerContentObserver(e8.f6499a, true, f6936d.b);
                        ((w8) he.n.l(f6936d)).f6938c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                w8Var = (w8) he.n.l(f6936d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w8Var;
    }

    public static synchronized void e() {
        Context context;
        try {
            w8 w8Var = f6936d;
            if (w8Var != null && (context = w8Var.f6937a) != null && w8Var.b != null && w8Var.f6938c) {
                context.getContentResolver().unregisterContentObserver(f6936d.b);
            }
            f6936d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.t8
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String b(final String str) {
        Context context = this.f6937a;
        if (context != null && !k8.b(context)) {
            try {
                return (String) t8.a(new s8() { // from class: com.google.android.gms.internal.measurement.v8
                    @Override // com.google.android.gms.internal.measurement.s8
                    public final /* synthetic */ Object zza() {
                        return this.f6922a.f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    public final /* synthetic */ String f(String str) {
        return d8.a(((Context) he.n.l(this.f6937a)).getContentResolver(), str, null);
    }

    public w8(Context context) {
        this.f6938c = false;
        this.f6937a = context;
        this.b = new u8(this, null);
    }
}
