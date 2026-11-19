package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8719a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8720c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f8722e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<String> f8721d = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8723f = false;

    public u0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f8719a = sharedPreferences;
        this.b = str;
        this.f8720c = str2;
        this.f8722e = executor;
    }

    public static u0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        u0 u0Var = new u0(sharedPreferences, str, str2, executor);
        u0Var.d();
        return u0Var;
    }

    public final boolean b(boolean z10) {
        if (z10 && !this.f8723f) {
            i();
        }
        return z10;
    }

    public final void d() {
        synchronized (this.f8721d) {
            try {
                this.f8721d.clear();
                String string = this.f8719a.getString(this.b, BuildConfig.FLAVOR);
                if (!TextUtils.isEmpty(string) && string.contains(this.f8720c)) {
                    String[] strArrSplit = string.split(this.f8720c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f8721d.add(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String e() {
        String strPeek;
        synchronized (this.f8721d) {
            strPeek = this.f8721d.peek();
        }
        return strPeek;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.f8721d) {
            zB = b(this.f8721d.remove(obj));
        }
        return zB;
    }

    @NonNull
    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f8721d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f8720c);
        }
        return sb2.toString();
    }

    public final void h() {
        synchronized (this.f8721d) {
            this.f8719a.edit().putString(this.b, g()).commit();
        }
    }

    public final void i() {
        this.f8722e.execute(new Runnable() { // from class: com.google.firebase.messaging.t0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8717a.h();
            }
        });
    }
}
