package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;
import p092e3.ExecutorC4775n;
import sb.C11264k;
import sb.C11268m;

/* JADX INFO: renamed from: com.google.firebase.messaging.h */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class AbstractServiceC2997h extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = C3010n.m14626d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* JADX INFO: renamed from: com.google.firebase.messaging.h$a */
    public class a implements BinderC2990e1.a {
        public a() {
        }

        @Override // com.google.firebase.messaging.BinderC2990e1.a
        /* JADX INFO: renamed from: a */
        public Task<Void> mo14522a(Intent intent) {
            return AbstractServiceC2997h.this.processIntent(intent);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14562a(AbstractServiceC2997h abstractServiceC2997h, Intent intent, C11264k c11264k) {
        abstractServiceC2997h.getClass();
        try {
            abstractServiceC2997h.handleIntent(intent);
        } finally {
            c11264k.m42328c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishTask(Intent intent) {
        if (intent != null) {
            C2984c1.m14503c(intent);
        }
        synchronized (this.lock) {
            try {
                int i10 = this.runningTasks - 1;
                this.runningTasks = i10;
                if (i10 == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C11268m.m42336f(null);
        }
        final C11264k c11264k = new C11264k();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2997h.m14562a(this.f11271a, intent, c11264k);
            }
        });
        return c11264k.m42326a();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new BinderC2990e1(new a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> taskProcessIntent = processIntent(startCommandIntent);
        if (taskProcessIntent.mo11899m()) {
            finishTask(intent);
            return 2;
        }
        taskProcessIntent.mo11889c(new ExecutorC4775n(), new OnCompleteListener() { // from class: com.google.firebase.messaging.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f11268a.finishTask(intent);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }
}
