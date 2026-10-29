package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f8795a;
    public final Map<String, Task<String>> b = new w1.a();

    public interface a {
        Task<String> start();
    }

    public p0(Executor executor) {
        this.f8795a = executor;
    }

    public static /* synthetic */ Task a(p0 p0Var, String str, Task task) {
        synchronized (p0Var) {
            p0Var.b.remove(str);
        }
        return task;
    }

    public synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task taskI = aVar.start().i(this.f8795a, new sb.c() { // from class: com.google.firebase.messaging.o0
            @Override // sb.c
            public final Object then(Task task2) {
                return p0.a(this.f8794a, str, task2);
            }
        });
        this.b.put(str, (Task<String>) taskI);
        return taskI;
    }
}
