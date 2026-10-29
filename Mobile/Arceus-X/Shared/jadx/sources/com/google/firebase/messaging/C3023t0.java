package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3023t0 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f11321a;

    /* JADX INFO: renamed from: b */
    public final String f11322b;

    /* JADX INFO: renamed from: c */
    public final String f11323c;

    /* JADX INFO: renamed from: e */
    public final Executor f11325e;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque<String> f11324d = new ArrayDeque<>();

    /* JADX INFO: renamed from: f */
    public boolean f11326f = false;

    public C3023t0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f11321a = sharedPreferences;
        this.f11322b = str;
        this.f11323c = str2;
        this.f11325e = executor;
    }

    /* JADX INFO: renamed from: c */
    public static C3023t0 m14645c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C3023t0 c3023t0 = new C3023t0(sharedPreferences, str, str2, executor);
        c3023t0.m14647d();
        return c3023t0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m14646b(boolean z10) {
        if (z10 && !this.f11326f) {
            m14652i();
        }
        return z10;
    }

    /* JADX INFO: renamed from: d */
    public final void m14647d() {
        synchronized (this.f11324d) {
            try {
                this.f11324d.clear();
                String string = this.f11321a.getString(this.f11322b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f11323c)) {
                    String[] strArrSplit = string.split(this.f11323c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f11324d.add(str);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public String m14648e() {
        String strPeek;
        synchronized (this.f11324d) {
            strPeek = this.f11324d.peek();
        }
        return strPeek;
    }

    /* JADX INFO: renamed from: f */
    public boolean m14649f(Object obj) {
        boolean zM14646b;
        synchronized (this.f11324d) {
            zM14646b = m14646b(this.f11324d.remove(obj));
        }
        return zM14646b;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public String m14650g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f11324d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f11323c);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public final void m14651h() {
        synchronized (this.f11324d) {
            this.f11321a.edit().putString(this.f11322b, m14650g()).commit();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m14652i() {
        this.f11325e.execute(new Runnable() { // from class: com.google.firebase.messaging.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f11319a.m14651h();
            }
        });
    }
}
