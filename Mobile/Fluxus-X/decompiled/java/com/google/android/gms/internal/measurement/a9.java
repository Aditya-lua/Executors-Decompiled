package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class a9 implements x8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a9 f6368d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6369a;
    public final ContentObserver b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6370c;

    public a9() {
        this.f6370c = false;
        this.f6369a = null;
        this.b = null;
    }

    public static a9 c(Context context) {
        a9 a9Var;
        synchronized (a9.class) {
            try {
                if (f6368d == null) {
                    f6368d = l2.g.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new a9(context) : new a9();
                }
                a9 a9Var2 = f6368d;
                if (a9Var2 != null && a9Var2.b != null && !a9Var2.f6370c) {
                    try {
                        context.getContentResolver().registerContentObserver(i8.f6545a, true, f6368d.b);
                        ((a9) je.n.l(f6368d)).f6370c = true;
                    } catch (SecurityException e10) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e10);
                    }
                }
                a9Var = (a9) je.n.l(f6368d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a9Var;
    }

    public static synchronized void e() {
        Context context;
        try {
            a9 a9Var = f6368d;
            if (a9Var != null && (context = a9Var.f6369a) != null && a9Var.b != null && a9Var.f6370c) {
                context.getContentResolver().unregisterContentObserver(f6368d.b);
            }
            f6368d = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.x8
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String b(final String str) {
        Context context = this.f6369a;
        if (context != null && !o8.b(context)) {
            try {
                return (String) x8.a(new w8() { // from class: com.google.android.gms.internal.measurement.z8
                    @Override // com.google.android.gms.internal.measurement.w8
                    public final /* synthetic */ Object zza() {
                        return this.f6970a.f(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e10);
            }
        }
        return null;
    }

    public final /* synthetic */ String f(String str) {
        return h8.a(((Context) je.n.l(this.f6369a)).getContentResolver(), str, null);
    }

    public a9(Context context) {
        this.f6370c = false;
        this.f6369a = context;
        this.b = new y8(this, null);
    }
}
