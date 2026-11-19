package k2;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
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
    public static String f21083d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static f f21086g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21087a;
    public final NotificationManager b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f21082c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Set<String> f21084e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f21085f = new Object();

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    public static class b {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static String d(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel e(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List<NotificationChannelGroup> f(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List<NotificationChannel> g(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    public static class c {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    public static class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21088a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f21089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Notification f21090d;

        public d(String str, int i10, String str2, Notification notification) {
            this.f21088a = str;
            this.b = i10;
            this.f21089c = str2;
            this.f21090d = notification;
        }

        @Override // k2.n.g
        public void a(d.a aVar) {
            aVar.g2(this.f21088a, this.b, this.f21089c, this.f21090d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f21088a + ", id:" + this.b + ", tag:" + this.f21089c + "]";
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f21091a;
        public final IBinder b;

        public e(ComponentName componentName, IBinder iBinder) {
            this.f21091a = componentName;
            this.b = iBinder;
        }
    }

    public static class f implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f21092a;
        public final HandlerThread b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f21093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map<ComponentName, a> f21094d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Set<String> f21095e = new HashSet();

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ComponentName f21096a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public d.a f21097c;
            public boolean b = false;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public ArrayDeque<g> f21098d = new ArrayDeque<>();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f21099e = 0;

            public a(ComponentName componentName) {
                this.f21096a = componentName;
            }
        }

        public f(Context context) {
            this.f21092a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.b = handlerThread;
            handlerThread.start();
            this.f21093c = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.b) {
                return true;
            }
            boolean zBindService = this.f21092a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f21096a), this, 33);
            aVar.b = zBindService;
            if (zBindService) {
                aVar.f21099e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f21096a);
                this.f21092a.unbindService(this);
            }
            return aVar.b;
        }

        public final void b(a aVar) {
            if (aVar.b) {
                this.f21092a.unbindService(this);
                aVar.b = false;
            }
            aVar.f21097c = null;
        }

        public final void c(g gVar) {
            j();
            for (a aVar : this.f21094d.values()) {
                aVar.f21098d.add(gVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = this.f21094d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f21094d.get(componentName);
            if (aVar != null) {
                aVar.f21097c = d.a.AbstractBinderC0206a.r2(iBinder);
                aVar.f21099e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = this.f21094d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f21096a + ", " + aVar.f21098d.size() + " queued tasks");
            }
            if (aVar.f21098d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f21097c == null) {
                i(aVar);
                return;
            }
            while (true) {
                g gVarPeek = aVar.f21098d.peek();
                if (gVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + gVarPeek);
                    }
                    gVarPeek.a(aVar.f21097c);
                    aVar.f21098d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f21096a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f21096a, e10);
                }
            }
            if (aVar.f21098d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        public void h(g gVar) {
            this.f21093c.obtainMessage(0, gVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((g) message.obj);
                return true;
            }
            if (i10 == 1) {
                e eVar = (e) message.obj;
                e(eVar.f21091a, eVar.b);
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
            if (this.f21093c.hasMessages(3, aVar.f21096a)) {
                return;
            }
            int i10 = aVar.f21099e;
            int i11 = i10 + 1;
            aVar.f21099e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f21093c.sendMessageDelayed(this.f21093c.obtainMessage(3, aVar.f21096a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f21098d.size() + " tasks to " + aVar.f21096a + " after " + aVar.f21099e + " retries");
            aVar.f21098d.clear();
        }

        public final void j() {
            Set<String> setH = n.h(this.f21092a);
            if (setH.equals(this.f21095e)) {
                return;
            }
            this.f21095e = setH;
            List<ResolveInfo> listQueryIntentServices = this.f21092a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setH.contains(resolveInfo.serviceInfo.packageName)) {
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
                if (!this.f21094d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f21094d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f21094d.entrySet().iterator();
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
            this.f21093c.obtainMessage(1, new e(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f21093c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface g {
        void a(d.a aVar);
    }

    public n(Context context) {
        this.f21087a = context;
        this.b = (NotificationManager) context.getSystemService("notification");
    }

    public static n g(Context context) {
        return new n(context);
    }

    public static Set<String> h(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f21082c) {
            if (string != null) {
                try {
                    if (!string.equals(f21083d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f21084e = hashSet;
                        f21083d = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f21084e;
        }
        return set;
    }

    public static boolean p(Notification notification) {
        Bundle bundleA = k.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.b);
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.b.cancel(str, i10);
    }

    public void d(NotificationChannel notificationChannel) {
        b.a(this.b, notificationChannel);
    }

    public void e(NotificationChannelGroup notificationChannelGroup) {
        b.b(this.b, notificationChannelGroup);
    }

    public void f(String str) {
        b.c(this.b, str);
    }

    public NotificationChannel i(String str) {
        return b.e(this.b, str);
    }

    public NotificationChannelGroup j(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(this.b, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : k()) {
            if (b.d(notificationChannelGroup).equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    public List<NotificationChannelGroup> k() {
        return b.f(this.b);
    }

    public List<NotificationChannel> l() {
        return b.g(this.b);
    }

    public void m(int i10, Notification notification) {
        n(null, i10, notification);
    }

    public void n(String str, int i10, Notification notification) {
        if (!p(notification)) {
            this.b.notify(str, i10, notification);
        } else {
            o(new d(this.f21087a.getPackageName(), i10, str, notification));
            this.b.cancel(str, i10);
        }
    }

    public final void o(g gVar) {
        synchronized (f21085f) {
            try {
                if (f21086g == null) {
                    f21086g = new f(this.f21087a.getApplicationContext());
                }
                f21086g.h(gVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
