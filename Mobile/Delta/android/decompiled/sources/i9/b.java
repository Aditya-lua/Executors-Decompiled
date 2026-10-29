package i9;

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
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;
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
public class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f20401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f20402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Executor f20403j = new Executor() { // from class: i9.e0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f20404k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f20406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f20407d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f20409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzd f20410g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1.j f20405a = new w1.j();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f20408e = new Messenger(new h(this, Looper.getMainLooper()));

    public b(@NonNull Context context) {
        this.b = context;
        this.f20406c = new c0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20407d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ Task e(Bundle bundle) {
        return m(bundle) ? sb.m.f(null) : sb.m.f(bundle);
    }

    public static /* bridge */ /* synthetic */ void g(b bVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new j());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        bVar.f20410g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        bVar.f20409f = (Messenger) parcelableExtra;
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
                    Matcher matcher = f20404k.matcher(stringExtra);
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
                        bVar.l(strGroup, extras);
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
                    synchronized (bVar.f20405a) {
                        for (int i10 = 0; i10 < bVar.f20405a.getSize(); i10++) {
                            try {
                                bVar.l((String) bVar.f20405a.f(i10), intent2.getExtras());
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
                bVar.l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String j() {
        int i10;
        i10 = f20401h;
        f20401h = i10 + 1;
        return Integer.toString(i10);
    }

    public static synchronized void k(Context context, Intent intent) {
        try {
            if (f20402i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f20402i = PendingIntent.getBroadcast(context, 0, intent2, cb.a.f4689a);
            }
            intent.putExtra(Payload.TYPE_APP, f20402i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    public Task<CloudMessage> a() {
        return this.f20406c.a() >= 241100000 ? b0.b(this.b).d(5, Bundle.EMPTY).h(f20403j, new sb.c() { // from class: i9.e
            @Override // sb.c
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : sb.m.e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    @NonNull
    public Task<Void> b(@NonNull CloudMessage cloudMessage) {
        if (this.f20406c.a() < 233700000) {
            return sb.m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", cloudMessage.w3());
        Integer numX3 = cloudMessage.x3();
        if (numX3 != null) {
            bundle.putInt("google.product_id", numX3.intValue());
        }
        return b0.b(this.b).c(3, bundle);
    }

    @NonNull
    public Task<Bundle> c(@NonNull final Bundle bundle) {
        if (this.f20406c.a() < 12000000) {
            return this.f20406c.b() != 0 ? i(bundle).i(f20403j, new sb.c() { // from class: i9.f0
                @Override // sb.c
                public final Object then(Task task) {
                    return this.f20422a.f(bundle, task);
                }
            }) : sb.m.e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return b0.b(this.b).d(1, bundle).h(f20403j, new sb.c() { // from class: i9.d
            @Override // sb.c
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
        if (this.f20406c.a() < 241100000) {
            return sb.m.e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return b0.b(this.b).c(4, bundle);
    }

    public final /* synthetic */ Task f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m((Bundle) task.getResult())) ? i(bundle).n(f20403j, new sb.j() { // from class: i9.d0
            @Override // sb.j
            public final Task then(Object obj) {
                return b.e((Bundle) obj);
            }
        }) : task;
    }

    public final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f20405a) {
            this.f20405a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    public final Task i(Bundle bundle) {
        final String strJ = j();
        final sb.k kVar = new sb.k();
        synchronized (this.f20405a) {
            this.f20405a.put(strJ, kVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f20406c.b() == 2) {
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
        intent.putExtra("google.messenger", this.f20408e);
        if (this.f20409f != null || this.f20410g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f20409f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f20410g.f(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f20406c.b() == 2) {
                    this.b.sendBroadcast(intent);
                } else {
                    this.b.startService(intent);
                }
            }
        } else if (this.f20406c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f20407d.schedule(new Runnable() { // from class: i9.f
            @Override // java.lang.Runnable
            public final void run() {
                if (kVar.d(new IOException(Payload.RESPONSE_TIMEOUT))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        kVar.a().c(f20403j, new OnCompleteListener() { // from class: i9.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f20423a.h(strJ, scheduledFutureSchedule, task);
            }
        });
        return kVar.a();
    }

    public final void l(String str, Bundle bundle) {
        synchronized (this.f20405a) {
            try {
                sb.k kVar = (sb.k) this.f20405a.remove(str);
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
