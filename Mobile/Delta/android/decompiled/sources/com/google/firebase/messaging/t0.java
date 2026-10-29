package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8806a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8807c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f8809e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<String> f8808d = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8810f = false;

    public t0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f8806a = sharedPreferences;
        this.b = str;
        this.f8807c = str2;
        this.f8809e = executor;
    }

    public static t0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        t0 t0Var = new t0(sharedPreferences, str, str2, executor);
        t0Var.d();
        return t0Var;
    }

    public final boolean b(boolean z10) {
        if (z10 && !this.f8810f) {
            i();
        }
        return z10;
    }

    public final void d() {
        synchronized (this.f8808d) {
            try {
                this.f8808d.clear();
                String string = this.f8806a.getString(this.b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f8807c)) {
                    String[] strArrSplit = string.split(this.f8807c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f8808d.add(str);
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
        synchronized (this.f8808d) {
            strPeek = this.f8808d.peek();
        }
        return strPeek;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.f8808d) {
            zB = b(this.f8808d.remove(obj));
        }
        return zB;
    }

    @NonNull
    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f8808d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f8807c);
        }
        return sb2.toString();
    }

    public final void h() {
        synchronized (this.f8808d) {
            this.f8806a.edit().putString(this.b, g()).commit();
        }
    }

    public final void i() {
        this.f8809e.execute(new Runnable() { // from class: com.google.firebase.messaging.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8804a.h();
            }
        });
    }
}
