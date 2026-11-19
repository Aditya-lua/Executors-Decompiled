package j9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f20207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f20208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f20209j = new Executor() { // from class: j9.g0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f20210k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f20212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f20213d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f20215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f20216g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.j f20211a = new w1.j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f20214e = new Messenger(new i(this, Looper.getMainLooper()));

    public c(@NonNull Context context) {
        this.b = context;
        this.f20212c = new e0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20213d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ Task e(Bundle bundle) {
        return m(bundle) ? tb.m.f(null) : tb.m.f(bundle);
    }

    public static /* bridge */ /* synthetic */ void g(c cVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        cVar.f20216g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        cVar.f20215f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f20210k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        cVar.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (cVar.f20211a) {
                        for (int i10 = 0; i10 < cVar.f20211a.getSize(); i10++) {
                            try {
                                cVar.l((String) cVar.f20211a.f(i10), intent2.getExtras());
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                cVar.l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String j() {
        int i10;
        i10 = f20207h;
        f20207h = i10 + 1;
        return Integer.toString(i10);
    }

    public static synchronized void k(Context context, Intent intent) {
        try {
            if (f20208i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f20208i = PendingIntent.getBroadcast(context, 0, intent2, db.a.f12162a);
            }
            intent.putExtra(Payload.TYPE_APP, f20208i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    public Task<a> a() {
        return this.f20212c.a() >= 241100000 ? d0.b(this.b).d(5, Bundle.EMPTY).h(f20209j, new tb.c() { // from class: j9.f
            @Override // tb.c
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
            }
        }) : tb.m.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    @NonNull
    public Task<Void> b(@NonNull a aVar) {
        if (this.f20212c.a() < 233700000) {
            return tb.m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", aVar.B3());
        Integer numC3 = aVar.C3();
        if (numC3 != null) {
            bundle.putInt("google.product_id", numC3.intValue());
        }
        return d0.b(this.b).c(3, bundle);
    }

    @NonNull
    public Task<Bundle> c(@NonNull final Bundle bundle) {
        if (this.f20212c.a() < 12000000) {
            return this.f20212c.b() != 0 ? i(bundle).i(f20209j, new tb.c() { // from class: j9.h0
                @Override // tb.c
                public final Object then(Task task) {
                    return this.f20230a.f(bundle, task);
                }
            }) : tb.m.e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return d0.b(this.b).d(1, bundle).h(f20209j, new tb.c() { // from class: j9.e
            @Override // tb.c
            public final Object then(Task task) throws IOException {
                if (task.isSuccessful()) {
                    return (Bundle) task.getResult();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
            }
        });
    }

    @NonNull
    public Task<Void> d(boolean z10) {
        if (this.f20212c.a() < 241100000) {
            return tb.m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return d0.b(this.b).c(4, bundle);
    }

    public final /* synthetic */ Task f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m((Bundle) task.getResult())) ? i(bundle).n(f20209j, new tb.j() { // from class: j9.f0
            @Override // tb.j
            public final Task then(Object obj) {
                return c.e((Bundle) obj);
            }
        }) : task;
    }

    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f20211a) {
            this.f20211a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    public final Task i(Bundle bundle) {
        final String strJ = j();
        final tb.k kVar = new tb.k();
        synchronized (this.f20211a) {
            this.f20211a.put(strJ, kVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f20212c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f20214e);
        if (this.f20215f != null || this.f20216g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f20215f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f20216g.f(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f20212c.b() == 2) {
                    this.b.sendBroadcast(intent);
                } else {
                    this.b.startService(intent);
                }
            }
        } else if (this.f20212c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f20213d.schedule(new Runnable() { // from class: j9.g
            @Override // java.lang.Runnable
            public final void run() {
                if (kVar.d(new IOException(Payload.RESPONSE_TIMEOUT))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        kVar.a().c(f20209j, new OnCompleteListener() { // from class: j9.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f20228a.h(strJ, scheduledFutureSchedule, task);
            }
        });
        return kVar.a();
    }

    public final void l(String str, Bundle bundle) {
        synchronized (this.f20211a) {
            try {
                tb.k kVar = (tb.k) this.f20211a.remove(str);
                if (kVar != null) {
                    kVar.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
