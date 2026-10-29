package p235k2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p062d.InterfaceC4367a;

/* JADX INFO: renamed from: k2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7422n {

    /* JADX INFO: renamed from: d */
    public static String f28642d;

    /* JADX INFO: renamed from: g */
    public static e f28645g;

    /* JADX INFO: renamed from: a */
    public final Context f28646a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f28647b;

    /* JADX INFO: renamed from: c */
    public static final Object f28641c = new Object();

    /* JADX INFO: renamed from: e */
    public static Set<String> f28643e = new HashSet();

    /* JADX INFO: renamed from: f */
    public static final Object f28644f = new Object();

    /* JADX INFO: renamed from: k2.n$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static boolean m30894a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    /* JADX INFO: renamed from: k2.n$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static void m30895a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        /* JADX INFO: renamed from: b */
        public static void m30896b(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        /* JADX INFO: renamed from: c */
        public static NotificationChannel m30897c(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }
    }

    /* JADX INFO: renamed from: k2.n$c */
    public static class c implements f {

        /* JADX INFO: renamed from: a */
        public final String f28648a;

        /* JADX INFO: renamed from: b */
        public final int f28649b;

        /* JADX INFO: renamed from: c */
        public final String f28650c;

        /* JADX INFO: renamed from: d */
        public final Notification f28651d;

        public c(String str, int i10, String str2, Notification notification) {
            this.f28648a = str;
            this.f28649b = i10;
            this.f28650c = str2;
            this.f28651d = notification;
        }

        @Override // p235k2.C7422n.f
        /* JADX INFO: renamed from: a */
        public void mo30898a(InterfaceC4367a interfaceC4367a) {
            interfaceC4367a.mo22019i2(this.f28648a, this.f28649b, this.f28650c, this.f28651d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f28648a + ", id:" + this.f28649b + ", tag:" + this.f28650c + "]";
        }
    }

    /* JADX INFO: renamed from: k2.n$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final ComponentName f28652a;

        /* JADX INFO: renamed from: b */
        public final IBinder f28653b;

        public d(ComponentName componentName, IBinder iBinder) {
            this.f28652a = componentName;
            this.f28653b = iBinder;
        }
    }

    /* JADX INFO: renamed from: k2.n$e */
    public static class e implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a */
        public final Context f28654a;

        /* JADX INFO: renamed from: b */
        public final HandlerThread f28655b;

        /* JADX INFO: renamed from: c */
        public final Handler f28656c;

        /* JADX INFO: renamed from: d */
        public final Map<ComponentName, a> f28657d = new HashMap();

        /* JADX INFO: renamed from: e */
        public Set<String> f28658e = new HashSet();

        /* JADX INFO: renamed from: k2.n$e$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public final ComponentName f28659a;

            /* JADX INFO: renamed from: c */
            public InterfaceC4367a f28661c;

            /* JADX INFO: renamed from: b */
            public boolean f28660b = false;

            /* JADX INFO: renamed from: d */
            public ArrayDeque<f> f28662d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e */
            public int f28663e = 0;

            public a(ComponentName componentName) {
                this.f28659a = componentName;
            }
        }

        public e(Context context) {
            this.f28654a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f28655b = handlerThread;
            handlerThread.start();
            this.f28656c = new Handler(handlerThread.getLooper(), this);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m30899a(a aVar) {
            if (aVar.f28660b) {
                return true;
            }
            boolean zBindService = this.f28654a.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.f28659a), this, 33);
            aVar.f28660b = zBindService;
            if (zBindService) {
                aVar.f28663e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f28659a);
                this.f28654a.unbindService(this);
            }
            return aVar.f28660b;
        }

        /* JADX INFO: renamed from: b */
        public final void m30900b(a aVar) {
            if (aVar.f28660b) {
                this.f28654a.unbindService(this);
                aVar.f28660b = false;
            }
            aVar.f28661c = null;
        }

        /* JADX INFO: renamed from: c */
        public final void m30901c(f fVar) {
            m30908j();
            for (a aVar : this.f28657d.values()) {
                aVar.f28662d.add(fVar);
                m30905g(aVar);
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m30902d(ComponentName componentName) {
            a aVar = this.f28657d.get(componentName);
            if (aVar != null) {
                m30905g(aVar);
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m30903e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f28657d.get(componentName);
            if (aVar != null) {
                aVar.f28661c = InterfaceC4367a.a.m22020r2(iBinder);
                aVar.f28663e = 0;
                m30905g(aVar);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m30904f(ComponentName componentName) {
            a aVar = this.f28657d.get(componentName);
            if (aVar != null) {
                m30900b(aVar);
            }
        }

        /* JADX INFO: renamed from: g */
        public final void m30905g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f28659a + ", " + aVar.f28662d.size() + " queued tasks");
            }
            if (aVar.f28662d.isEmpty()) {
                return;
            }
            if (!m30899a(aVar) || aVar.f28661c == null) {
                m30907i(aVar);
                return;
            }
            while (true) {
                f fVarPeek = aVar.f28662d.peek();
                if (fVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + fVarPeek);
                    }
                    fVarPeek.mo30898a(aVar.f28661c);
                    aVar.f28662d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f28659a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f28659a, e10);
                }
            }
            if (aVar.f28662d.isEmpty()) {
                return;
            }
            m30907i(aVar);
        }

        /* JADX INFO: renamed from: h */
        public void m30906h(f fVar) {
            this.f28656c.obtainMessage(0, fVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                m30901c((f) message.obj);
                return true;
            }
            if (i10 == 1) {
                d dVar = (d) message.obj;
                m30903e(dVar.f28652a, dVar.f28653b);
                return true;
            }
            if (i10 == 2) {
                m30904f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            m30902d((ComponentName) message.obj);
            return true;
        }

        /* JADX INFO: renamed from: i */
        public final void m30907i(a aVar) {
            if (this.f28656c.hasMessages(3, aVar.f28659a)) {
                return;
            }
            int i10 = aVar.f28663e;
            int i11 = i10 + 1;
            aVar.f28663e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f28656c.sendMessageDelayed(this.f28656c.obtainMessage(3, aVar.f28659a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f28662d.size() + " tasks to " + aVar.f28659a + " after " + aVar.f28663e + " retries");
            aVar.f28662d.clear();
        }

        /* JADX INFO: renamed from: j */
        public final void m30908j() {
            Set<String> setM30884f = C7422n.m30884f(this.f28654a);
            if (setM30884f.equals(this.f28658e)) {
                return;
            }
            this.f28658e = setM30884f;
            List<ResolveInfo> listQueryIntentServices = this.f28654a.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setM30884f.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f28657d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f28657d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f28657d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    m30900b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f28656c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f28656c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: k2.n$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo30898a(InterfaceC4367a interfaceC4367a);
    }

    public C7422n(Context context) {
        this.f28646a = context;
        this.f28647b = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: e */
    public static C7422n m30883e(Context context) {
        return new C7422n(context);
    }

    /* JADX INFO: renamed from: f */
    public static Set<String> m30884f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f28641c) {
            if (string != null) {
                try {
                    if (!string.equals(f28642d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f28643e = hashSet;
                        f28642d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f28643e;
        }
        return set;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m30885k(Notification notification) {
        Bundle bundleM30738a = C7419k.m30738a(notification);
        return bundleM30738a != null && bundleM30738a.getBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL);
    }

    /* JADX INFO: renamed from: a */
    public boolean m30886a() {
        return a.m30894a(this.f28647b);
    }

    /* JADX INFO: renamed from: b */
    public void m30887b(String str, int i10) {
        this.f28647b.cancel(str, i10);
    }

    /* JADX INFO: renamed from: c */
    public void m30888c(NotificationChannel notificationChannel) {
        b.m30895a(this.f28647b, notificationChannel);
    }

    /* JADX INFO: renamed from: d */
    public void m30889d(String str) {
        b.m30896b(this.f28647b, str);
    }

    /* JADX INFO: renamed from: g */
    public NotificationChannel m30890g(String str) {
        return b.m30897c(this.f28647b, str);
    }

    /* JADX INFO: renamed from: h */
    public void m30891h(int i10, Notification notification) {
        m30892i(null, i10, notification);
    }

    /* JADX INFO: renamed from: i */
    public void m30892i(String str, int i10, Notification notification) {
        if (!m30885k(notification)) {
            this.f28647b.notify(str, i10, notification);
        } else {
            m30893j(new c(this.f28646a.getPackageName(), i10, str, notification));
            this.f28647b.cancel(str, i10);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m30893j(f fVar) {
        synchronized (f28644f) {
            try {
                if (f28645g == null) {
                    f28645g = new e(this.f28646a.getApplicationContext());
                }
                f28645g.m30906h(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
