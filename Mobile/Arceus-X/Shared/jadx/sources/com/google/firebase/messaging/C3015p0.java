package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p504w1.C12277a;
import sb.InterfaceC11248c;

/* JADX INFO: renamed from: com.google.firebase.messaging.p0 */
/* JADX INFO: loaded from: classes2.dex */
public class C3015p0 {

    /* JADX INFO: renamed from: a */
    public final Executor f11308a;

    /* JADX INFO: renamed from: b */
    public final Map<String, Task<String>> f11309b = new C12277a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.p0$a */
    public interface a {
        Task<String> start();
    }

    public C3015p0(Executor executor) {
        this.f11308a = executor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Task m14634a(C3015p0 c3015p0, String str, Task task) {
        synchronized (c3015p0) {
            c3015p0.f11309b.remove(str);
        }
        return task;
    }

    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: com.google.android.gms.tasks.Task<TContinuationResult>, com.google.android.gms.tasks.Task<java.lang.String>, java.lang.Object */
    /* JADX INFO: renamed from: b */
    public synchronized Task<String> m14635b(final String str, a aVar) {
        Task<String> task = this.f11309b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskMo11895i = aVar.start().mo11895i(this.f11308a, new InterfaceC11248c() { // from class: com.google.firebase.messaging.o0
            @Override // sb.InterfaceC11248c
            public final Object then(Task task2) {
                return C3015p0.m14634a(this.f11306a, str, task2);
            }
        });
        this.f11309b.put(str, (Task<String>) taskMo11895i);
        return taskMo11895i;
    }
}
