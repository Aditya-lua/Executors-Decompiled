package k2;

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
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f22112d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static e f22115g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f22116a;
    public final NotificationManager b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f22111c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Set<String> f22113e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f22114f = new Object();

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    public static class b {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static NotificationChannel c(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }
    }

    public static class c implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22117a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f22118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Notification f22119d;

        public c(String str, int i10, String str2, Notification notification) {
            this.f22117a = str;
            this.b = i10;
            this.f22118c = str2;
            this.f22119d = notification;
        }

        @Override // k2.n.f
        public void a(d.a aVar) {
            aVar.i2(this.f22117a, this.b, this.f22118c, this.f22119d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f22117a + ", id:" + this.b + ", tag:" + this.f22118c + "]";
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f22120a;
        public final IBinder b;

        public d(ComponentName componentName, IBinder iBinder) {
            this.f22120a = componentName;
            this.b = iBinder;
        }
    }

    public static class e implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f22121a;
        public final HandlerThread b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f22122c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<ComponentName, a> f22123d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Set<String> f22124e = new HashSet();

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComponentName f22125a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public d.a f22126c;
            public boolean b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public ArrayDeque<f> f22127d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f22128e = 0;

            public a(ComponentName componentName) {
                this.f22125a = componentName;
            }
        }

        public e(Context context) {
            this.f22121a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.b = handlerThread;
            handlerThread.start();
            this.f22122c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.b) {
                return true;
            }
            boolean zBindService = this.f22121a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f22125a), this, 33);
            aVar.b = zBindService;
            if (zBindService) {
                aVar.f22128e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f22125a);
                this.f22121a.unbindService(this);
            }
            return aVar.b;
        }

        public final void b(a aVar) {
            if (aVar.b) {
                this.f22121a.unbindService(this);
                aVar.b = false;
            }
            aVar.f22126c = null;
        }

        public final void c(f fVar) {
            j();
            for (a aVar : this.f22123d.values()) {
                aVar.f22127d.add(fVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = this.f22123d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f22123d.get(componentName);
            if (aVar != null) {
                aVar.f22126c = d.a.AbstractBinderC0262a.r2(iBinder);
                aVar.f22128e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = this.f22123d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f22125a + ", " + aVar.f22127d.size() + " queued tasks");
            }
            if (aVar.f22127d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f22126c == null) {
                i(aVar);
                return;
            }
            while (true) {
                f fVarPeek = aVar.f22127d.peek();
                if (fVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + fVarPeek);
                    }
                    fVarPeek.a(aVar.f22126c);
                    aVar.f22127d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f22125a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f22125a, e10);
                }
            }
            if (aVar.f22127d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        public void h(f fVar) {
            this.f22122c.obtainMessage(0, fVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((f) message.obj);
                return true;
            }
            if (i10 == 1) {
                d dVar = (d) message.obj;
                e(dVar.f22120a, dVar.b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        public final void i(a aVar) {
            if (this.f22122c.hasMessages(3, aVar.f22125a)) {
                return;
            }
            int i10 = aVar.f22128e;
            int i11 = i10 + 1;
            aVar.f22128e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f22122c.sendMessageDelayed(this.f22122c.obtainMessage(3, aVar.f22125a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f22127d.size() + " tasks to " + aVar.f22125a + " after " + aVar.f22128e + " retries");
            aVar.f22127d.clear();
        }

        public final void j() {
            Set<String> setF = n.f(this.f22121a);
            if (setF.equals(this.f22124e)) {
                return;
            }
            this.f22124e = setF;
            List<ResolveInfo> listQueryIntentServices = this.f22121a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setF.contains(resolveInfo.serviceInfo.packageName)) {
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
                if (!this.f22123d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f22123d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f22123d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f22122c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f22122c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface f {
        void a(d.a aVar);
    }

    public n(Context context) {
        this.f22116a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static n e(Context context) {
        return new n(context);
    }

    public static Set<String> f(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f22111c) {
            if (string != null) {
                try {
                    if (!string.equals(f22112d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f22113e = hashSet;
                        f22112d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f22113e;
        }
        return set;
    }

    public static boolean k(Notification notification) {
        Bundle bundleA = k.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.b);
    }

    public void b(String str, int i10) {
        this.b.cancel(str, i10);
    }

    public void c(NotificationChannel notificationChannel) {
        b.a(this.b, notificationChannel);
    }

    public void d(String str) {
        b.b(this.b, str);
    }

    public NotificationChannel g(String str) {
        return b.c(this.b, str);
    }

    public void h(int i10, Notification notification) {
        i(null, i10, notification);
    }

    public void i(String str, int i10, Notification notification) {
        if (!k(notification)) {
            this.b.notify(str, i10, notification);
        } else {
            j(new c(this.f22116a.getPackageName(), i10, str, notification));
            this.b.cancel(str, i10);
        }
    }

    public final void j(f fVar) {
        synchronized (f22114f) {
            try {
                if (f22115g == null) {
                    f22115g = new e(this.f22116a.getApplicationContext());
                }
                f22115g.h(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
