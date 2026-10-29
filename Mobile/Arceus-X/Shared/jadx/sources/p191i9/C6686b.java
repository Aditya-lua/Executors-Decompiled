package p191i9;

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
import p046cb.C1614a;
import p504w1.C12286j;
import sb.C11264k;
import sb.C11268m;
import sb.InterfaceC11248c;
import sb.InterfaceC11262j;

/* JADX INFO: renamed from: i9.b */
/* JADX INFO: loaded from: classes.dex */
public class C6686b {

    /* JADX INFO: renamed from: h */
    public static int f25765h;

    /* JADX INFO: renamed from: i */
    public static PendingIntent f25766i;

    /* JADX INFO: renamed from: j */
    public static final Executor f25767j = new Executor() { // from class: i9.e0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: k */
    public static final Pattern f25768k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b */
    public final Context f25770b;

    /* JADX INFO: renamed from: c */
    public final C6689c0 f25771c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f25772d;

    /* JADX INFO: renamed from: f */
    public Messenger f25774f;

    /* JADX INFO: renamed from: g */
    public zzd f25775g;

    /* JADX INFO: renamed from: a */
    public final C12286j f25769a = new C12286j();

    /* JADX INFO: renamed from: e */
    public final Messenger f25773e = new Messenger(new HandlerC6697h(this, Looper.getMainLooper()));

    public C6686b(@NonNull Context context) {
        this.f25770b = context;
        this.f25771c = new C6689c0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f25772d = scheduledThreadPoolExecutor;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap boolean:0x0000: INVOKE (r1v0 android.os.Bundle) STATIC call: i9.b.m(android.os.Bundle):boolean A[MD:(android.os.Bundle):boolean (m), WRAPPED]) != false) ? (wrap com.google.android.gms.tasks.Task:0x0007: INVOKE (null java.lang.Object) STATIC call: sb.m.f(java.lang.Object):com.google.android.gms.tasks.Task A[MD:<TResult>:(TResult):com.google.android.gms.tasks.Task<TResult> (m), WRAPPED]) : (wrap com.google.android.gms.tasks.Task:0x000c: INVOKE (r1v0 android.os.Bundle) STATIC call: sb.m.f(java.lang.Object):com.google.android.gms.tasks.Task A[MD:<TResult>:(TResult):com.google.android.gms.tasks.Task<TResult> (m), WRAPPED]) */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Task m28779e(Bundle bundle) {
        return m28783m(bundle) ? C11268m.m42336f(null) : C11268m.m42336f(bundle);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m28780g(C6686b c6686b, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C6699j());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        c6686b.f25775g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c6686b.f25774f = (Messenger) parcelableExtra;
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
                    Matcher matcher = f25768k.matcher(stringExtra);
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
                        c6686b.m28791l(strGroup, extras);
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
                    synchronized (c6686b.f25769a) {
                        for (int i10 = 0; i10 < c6686b.f25769a.getSize(); i10++) {
                            try {
                                c6686b.m28791l((String) c6686b.f25769a.m45625f(i10), intent2.getExtras());
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
                c6686b.m28791l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* JADX INFO: renamed from: j */
    public static synchronized String m28781j() {
        int i10;
        i10 = f25765h;
        f25765h = i10 + 1;
        return Integer.toString(i10);
    }

    /* JADX INFO: renamed from: k */
    public static synchronized void m28782k(Context context, Intent intent) {
        try {
            if (f25766i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f25766i = PendingIntent.getBroadcast(context, 0, intent2, C1614a.f6300a);
            }
            intent.putExtra(Payload.TYPE_APP, f25766i);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m28783m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public Task<CloudMessage> m28784a() {
        return this.f25771c.m28799a() >= 241100000 ? C6687b0.m28793b(this.f25770b).m28796d(5, Bundle.EMPTY).mo11894h(f25767j, new InterfaceC11248c() { // from class: i9.e
            @Override // sb.InterfaceC11248c
            public final Object then(Task task) {
                Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new CloudMessage(intent);
                }
                return null;
            }
        }) : C11268m.m42335e(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public Task<Void> m28785b(@NonNull CloudMessage cloudMessage) {
        if (this.f25771c.m28799a() < 233700000) {
            return C11268m.m42335e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", cloudMessage.m9133w3());
        Integer numM9134x3 = cloudMessage.m9134x3();
        if (numM9134x3 != null) {
            bundle.putInt("google.product_id", numM9134x3.intValue());
        }
        return C6687b0.m28793b(this.f25770b).m28795c(3, bundle);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public Task<Bundle> m28786c(@NonNull final Bundle bundle) {
        if (this.f25771c.m28799a() < 12000000) {
            return this.f25771c.m28800b() != 0 ? m28790i(bundle).mo11895i(f25767j, new InterfaceC11248c() { // from class: i9.f0
                @Override // sb.InterfaceC11248c
                public final Object then(Task task) {
                    return this.f25789a.m28788f(bundle, task);
                }
            }) : C11268m.m42335e(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return C6687b0.m28793b(this.f25770b).m28796d(1, bundle).mo11894h(f25767j, new InterfaceC11248c() { // from class: i9.d
            @Override // sb.InterfaceC11248c
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
    /* JADX INFO: renamed from: d */
    public Task<Void> m28787d(boolean z10) {
        if (this.f25771c.m28799a() < 241100000) {
            return C11268m.m42335e(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return C6687b0.m28793b(this.f25770b).m28795c(4, bundle);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Task m28788f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m28783m((Bundle) task.getResult())) ? m28790i(bundle).mo11900n(f25767j, new InterfaceC11262j() { // from class: i9.d0
            @Override // sb.InterfaceC11262j
            public final Task then(Object obj) {
                return C6686b.m28779e((Bundle) obj);
            }
        }) : task;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m28789h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f25769a) {
            this.f25769a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX INFO: renamed from: i */
    public final Task m28790i(Bundle bundle) {
        final String strM28781j = m28781j();
        final C11264k c11264k = new C11264k();
        synchronized (this.f25769a) {
            this.f25769a.put(strM28781j, c11264k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f25771c.m28800b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m28782k(this.f25770b, intent);
        intent.putExtra("kid", "|ID|" + strM28781j + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f25773e);
        if (this.f25774f != null || this.f25775g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f25774f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f25775g.m9136f(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f25771c.m28800b() == 2) {
                    this.f25770b.sendBroadcast(intent);
                } else {
                    this.f25770b.startService(intent);
                }
            }
        } else if (this.f25771c.m28800b() == 2) {
            this.f25770b.sendBroadcast(intent);
        } else {
            this.f25770b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f25772d.schedule(new Runnable() { // from class: i9.f
            @Override // java.lang.Runnable
            public final void run() {
                if (c11264k.m42329d(new IOException(Payload.RESPONSE_TIMEOUT))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c11264k.m42326a().mo11889c(f25767j, new OnCompleteListener() { // from class: i9.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f25791a.m28789h(strM28781j, scheduledFutureSchedule, task);
            }
        });
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: l */
    public final void m28791l(String str, Bundle bundle) {
        synchronized (this.f25769a) {
            try {
                C11264k c11264k = (C11264k) this.f25769a.remove(str);
                if (c11264k != null) {
                    c11264k.m42328c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
