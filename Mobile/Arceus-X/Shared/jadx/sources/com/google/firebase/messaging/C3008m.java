package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p092e3.ExecutorC4775n;
import p462u9.C11822m;
import sb.C11268m;
import sb.InterfaceC11248c;

/* JADX INFO: renamed from: com.google.firebase.messaging.m */
/* JADX INFO: loaded from: classes2.dex */
public class C3008m {

    /* JADX INFO: renamed from: c */
    public static final Object f11301c = new Object();

    /* JADX INFO: renamed from: d */
    public static ServiceConnectionC2999h1 f11302d;

    /* JADX INFO: renamed from: a */
    public final Context f11303a;

    /* JADX INFO: renamed from: b */
    public final Executor f11304b = new ExecutorC4775n();

    public C3008m(Context context) {
        this.f11303a = context;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = (((wrap boolean:0x0000: INVOKE  STATIC call: u9.m.g():boolean A[MD:():boolean (m), WRAPPED]) == true && (wrap int:0x000c: INVOKE 
      (wrap java.lang.Integer:0x000a: CHECK_CAST (java.lang.Integer) (wrap java.lang.Object:0x0006: INVOKE (r5v0 com.google.android.gms.tasks.Task) VIRTUAL call: com.google.android.gms.tasks.Task.getResult():java.lang.Object A[MD:():TResult (m), WRAPPED]))
     VIRTUAL call: java.lang.Integer.intValue():int A[MD:():int (c), WRAPPED]) == (402 int))) ? (wrap com.google.android.gms.tasks.Task<TContinuationResult>:0x0023: INVOKE 
      (wrap com.google.android.gms.tasks.Task<java.lang.Integer>:0x0015: INVOKE (r2v0 android.content.Context), (r3v0 android.content.Intent), (r4v0 boolean) STATIC call: com.google.firebase.messaging.m.e(android.content.Context, android.content.Intent, boolean):com.google.android.gms.tasks.Task A[MD:(android.content.Context, android.content.Intent, boolean):com.google.android.gms.tasks.Task<java.lang.Integer> (m), WRAPPED])
      (wrap e3.n:0x001b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: e3.n.<init>():void type: CONSTRUCTOR)
      (wrap sb.c<java.lang.Integer, TContinuationResult>:0x0020: CONSTRUCTOR  A[MD:():void (m), WRAPPED] call: com.google.firebase.messaging.k.<init>():void type: CONSTRUCTOR)
     VIRTUAL call: com.google.android.gms.tasks.Task.h(java.util.concurrent.Executor, sb.c):com.google.android.gms.tasks.Task A[MD:<TContinuationResult>:(java.util.concurrent.Executor, sb.c<TResult, TContinuationResult>):com.google.android.gms.tasks.Task<TContinuationResult> (m), WRAPPED]) : (r5v0 com.google.android.gms.tasks.Task) */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m14608a(Context context, Intent intent, boolean z10, Task task) {
        return (C11822m.m44200g() && ((Integer) task.getResult()).intValue() == 402) ? m14612e(context, intent, z10).mo11894h(new ExecutorC4775n(), new InterfaceC11248c() { // from class: com.google.firebase.messaging.k
            @Override // sb.InterfaceC11248c
            public final Object then(Task task2) {
                return C3008m.m14611d(task2);
            }
        }) : task;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Integer m14610c(Task task) {
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Integer m14611d(Task task) {
        return 403;
    }

    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TContinuationResult>, com.google.android.gms.tasks.Task<java.lang.Integer> */
    /* JADX INFO: renamed from: e */
    public static Task<Integer> m14612e(Context context, Intent intent, boolean z10) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        ServiceConnectionC2999h1 serviceConnectionC2999h1M14613f = m14613f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return serviceConnectionC2999h1M14613f.m14593d(intent).mo11894h(new ExecutorC4775n(), new InterfaceC11248c() { // from class: com.google.firebase.messaging.l
                @Override // sb.InterfaceC11248c
                public final Object then(Task task) {
                    return C3008m.m14610c(task);
                }
            });
        }
        if (C3019r0.m14637b().m14641e(context)) {
            C2984c1.m14505e(context, serviceConnectionC2999h1M14613f, intent);
        } else {
            serviceConnectionC2999h1M14613f.m14593d(intent);
        }
        return C11268m.m42336f(-1);
    }

    /* JADX INFO: renamed from: f */
    public static ServiceConnectionC2999h1 m14613f(Context context, String str) {
        ServiceConnectionC2999h1 serviceConnectionC2999h1;
        synchronized (f11301c) {
            try {
                if (f11302d == null) {
                    f11302d = new ServiceConnectionC2999h1(context, str);
                }
                serviceConnectionC2999h1 = f11302d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return serviceConnectionC2999h1;
    }

    /* JADX INFO: renamed from: g */
    public Task<Integer> m14614g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m14615h(this.f11303a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: h */
    public Task<Integer> m14615h(final Context context, final Intent intent) {
        boolean z10 = C11822m.m44200g() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? C11268m.m42333c(this.f11304b, new Callable() { // from class: com.google.firebase.messaging.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(C3019r0.m14637b().m14643g(context, intent));
            }
        }).mo11895i(this.f11304b, new InterfaceC11248c() { // from class: com.google.firebase.messaging.j
            @Override // sb.InterfaceC11248c
            public final Object then(Task task) {
                return C3008m.m14608a(context, intent, z11, task);
            }
        }) : m14612e(context, intent, z11);
    }
}
