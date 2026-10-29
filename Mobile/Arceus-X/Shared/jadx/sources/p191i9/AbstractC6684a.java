package p191i9;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p046cb.C1618e;
import p488v9.ThreadFactoryC12109b;
import sb.C11268m;

/* JADX INFO: renamed from: i9.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6684a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static SoftReference f25763a;

    /* JADX INFO: renamed from: b */
    public static SoftReference f25764b;

    @NonNull
    /* JADX INFO: renamed from: a */
    public Executor m28774a() {
        ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (AbstractC6684a.class) {
            try {
                SoftReference softReference = f25763a;
                executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorServiceUnconfigurableExecutorService == null) {
                    C1618e.m8186a();
                    executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new ThreadFactoryC12109b("firebase-iid-executor")));
                    f25763a = new SoftReference(executorServiceUnconfigurableExecutorService);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo14408b(@NonNull Context context, @NonNull CloudMessage cloudMessage);

    /* JADX INFO: renamed from: c */
    public void mo14409c(@NonNull Context context, @NonNull Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m28775d(Intent intent, final Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorUnconfigurableExecutorService;
        int iM28776e;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iM28776e = m28776e(context, intent2);
            } else if (intent.getExtras() == null) {
                iM28776e = 500;
            } else {
                final CloudMessage cloudMessage = new CloudMessage(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (AbstractC6684a.class) {
                    try {
                        SoftReference softReference = f25764b;
                        executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                        if (executorUnconfigurableExecutorService == null) {
                            C1618e.m8186a();
                            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC12109b("pscm-ack-executor"));
                            threadPoolExecutor.allowCoreThreadTimeOut(true);
                            executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                            f25764b = new SoftReference(executorUnconfigurableExecutorService);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                executorUnconfigurableExecutorService.execute(new Runnable() { // from class: i9.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        Task taskM28795c;
                        CloudMessage cloudMessage2 = cloudMessage;
                        if (TextUtils.isEmpty(cloudMessage2.m9133w3())) {
                            taskM28795c = C11268m.m42336f(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", cloudMessage2.m9133w3());
                            Integer numM9134x3 = cloudMessage2.m9134x3();
                            if (numM9134x3 != null) {
                                bundle.putInt("google.product_id", numM9134x3.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            taskM28795c = C6687b0.m28793b(context2).m28795c(2, bundle);
                        }
                        final CountDownLatch countDownLatch2 = countDownLatch;
                        taskM28795c.mo11889c(new Executor() { // from class: i9.k
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new OnCompleteListener() { // from class: i9.l
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iMo14408b = mo14408b(context, cloudMessage);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e10) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                }
                iM28776e = iMo14408b;
            }
            if (z10 && pendingResult != null) {
                pendingResult.setResultCode(iM28776e);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (Throwable th3) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m28776e(@NonNull Context context, @NonNull Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            mo14409c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull final Context context, @NonNull final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        m28774a().execute(new Runnable() { // from class: i9.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f25800a.m28775d(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}
