package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f8790c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h1 f8791d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8792a;
    public final Executor b = new e3.n();

    public m(Context context) {
        this.f8792a = context;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z10, Task task) {
        return (u9.m.g() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z10).h(new e3.n(), new sb.c() { // from class: com.google.firebase.messaging.k
            @Override // sb.c
            public final Object then(Task task2) {
                return m.d(task2);
            }
        }) : task;
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer d(Task task) {
        return 403;
    }

    public static Task<Integer> e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        h1 h1VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return h1VarF.d(intent).h(new e3.n(), new sb.c() { // from class: com.google.firebase.messaging.l
                @Override // sb.c
                public final Object then(Task task) {
                    return m.c(task);
                }
            });
        }
        if (r0.b().e(context)) {
            c1.e(context, h1VarF, intent);
        } else {
            h1VarF.d(intent);
        }
        return sb.m.f(-1);
    }

    public static h1 f(Context context, String str) {
        h1 h1Var;
        synchronized (f8790c) {
            try {
                if (f8791d == null) {
                    f8791d = new h1(context, str);
                }
                h1Var = f8791d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h1Var;
    }

    public Task<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f8792a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> h(final Context context, final Intent intent) {
        boolean z10 = u9.m.g() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? sb.m.c(this.b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(r0.b().g(context, intent));
            }
        }).i(this.b, new sb.c() { // from class: com.google.firebase.messaging.j
            @Override // sb.c
            public final Object then(Task task) {
                return m.a(context, intent, z11, task);
            }
        }) : e(context, intent, z11);
    }
}
