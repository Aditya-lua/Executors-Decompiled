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
    public static final Object f8700c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i1 f8701d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8702a;
    public final Executor b = new e3.n();

    public m(Context context) {
        this.f8702a = context;
    }

    public static /* synthetic */ Task a(Context context, Intent intent, boolean z10, Task task) {
        return (v9.m.g() && ((Integer) task.getResult()).intValue() == 402) ? e(context, intent, z10).h(new e3.n(), new tb.c() { // from class: com.google.firebase.messaging.k
            @Override // tb.c
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
        i1 i1VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return i1VarF.d(intent).h(new e3.n(), new tb.c() { // from class: com.google.firebase.messaging.l
                @Override // tb.c
                public final Object then(Task task) {
                    return m.c(task);
                }
            });
        }
        if (s0.b().e(context)) {
            d1.e(context, i1VarF, intent);
        } else {
            i1VarF.d(intent);
        }
        return tb.m.f(-1);
    }

    public static i1 f(Context context, String str) {
        i1 i1Var;
        synchronized (f8700c) {
            try {
                if (f8701d == null) {
                    f8701d = new i1(context, str);
                }
                i1Var = f8701d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i1Var;
    }

    public Task<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f8702a, intent);
    }

    @SuppressLint({"InlinedApi"})
    public Task<Integer> h(final Context context, final Intent intent) {
        boolean z10 = v9.m.g() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? tb.m.c(this.b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(s0.b().g(context, intent));
            }
        }).i(this.b, new tb.c() { // from class: com.google.firebase.messaging.j
            @Override // tb.c
            public final Object then(Task task) {
                return m.a(context, intent, z11, task);
            }
        }) : e(context, intent, z11);
    }
}
