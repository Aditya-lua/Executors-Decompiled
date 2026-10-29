package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import p092e3.ExecutorC4775n;

/* JADX INFO: renamed from: com.google.firebase.messaging.e1 */
/* JADX INFO: loaded from: classes2.dex */
public class BinderC2990e1 extends Binder {

    /* JADX INFO: renamed from: a */
    public final a f11267a;

    /* JADX INFO: renamed from: com.google.firebase.messaging.e1$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        Task<Void> mo14522a(Intent intent);
    }

    public BinderC2990e1(a aVar) {
        this.f11267a = aVar;
    }

    /* JADX INFO: renamed from: b */
    public void m14521b(final ServiceConnectionC2999h1.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f11267a.mo14522a(aVar.f11288a).mo11889c(new ExecutorC4775n(), new OnCompleteListener() { // from class: com.google.firebase.messaging.d1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                aVar.m14598d();
            }
        });
    }
}
