package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import b6.i;
import b6.l;
import b6.m;
import f6.WorkGenerationalId;
import f6.j0;
import f6.o1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import ku.d2;
import x5.k;
import x5.w;
import y5.e;
import y5.f1;

/* JADX INFO: loaded from: classes.dex */
public class a implements i, e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f3526k = w.i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f3527a;
    public f1 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h6.b f3528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3529d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WorkGenerationalId f3530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<WorkGenerationalId, k> f3531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<WorkGenerationalId, j0> f3532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<WorkGenerationalId, d2> f3533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f3534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f3535j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public class RunnableC0068a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f3536a;

        public RunnableC0068a(String str) {
            this.f3536a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            j0 j0VarG = a.this.b.r().g(this.f3536a);
            if (j0VarG == null || !j0VarG.m()) {
                return;
            }
            synchronized (a.this.f3529d) {
                a.this.f3532g.put(o1.a(j0VarG), j0VarG);
                a aVar = a.this;
                a.this.f3533h.put(o1.a(j0VarG), m.e(aVar.f3534i, j0VarG, aVar.f3528c.b(), a.this));
            }
        }
    }

    public interface b {
        void b(int i10, Notification notification);

        void c(int i10);

        void d(int i10, int i11, Notification notification);

        void e(int i10);
    }

    public a(Context context) {
        this.f3527a = context;
        f1 f1VarP = f1.p(context);
        this.b = f1VarP;
        this.f3528c = f1VarP.v();
        this.f3530e = null;
        this.f3531f = new LinkedHashMap();
        this.f3533h = new HashMap();
        this.f3532g = new HashMap();
        this.f3534i = new l(this.b.t());
        this.b.r().e(this);
    }

    public static Intent c(Context context, WorkGenerationalId workGenerationalId, k kVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", kVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kVar.a());
        intent.putExtra("KEY_NOTIFICATION", kVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    public static Intent f(Context context, WorkGenerationalId workGenerationalId, k kVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", kVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", kVar.a());
        intent.putExtra("KEY_NOTIFICATION", kVar.b());
        return intent;
    }

    public static Intent g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // y5.e
    public void d(WorkGenerationalId workGenerationalId, boolean z10) {
        Map.Entry<WorkGenerationalId, k> entry;
        synchronized (this.f3529d) {
            try {
                d2 d2VarRemove = this.f3532g.remove(workGenerationalId) != null ? this.f3533h.remove(workGenerationalId) : null;
                if (d2VarRemove != null) {
                    d2VarRemove.c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k kVarRemove = this.f3531f.remove(workGenerationalId);
        if (workGenerationalId.equals(this.f3530e)) {
            if (this.f3531f.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, k>> it = this.f3531f.entrySet().iterator();
                Map.Entry<WorkGenerationalId, k> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f3530e = entry.getKey();
                if (this.f3535j != null) {
                    k value = entry.getValue();
                    this.f3535j.d(value.c(), value.a(), value.b());
                    this.f3535j.e(value.c());
                }
            } else {
                this.f3530e = null;
            }
        }
        b bVar = this.f3535j;
        if (kVarRemove == null || bVar == null) {
            return;
        }
        w.e().a(f3526k, "Removing Notification (id: " + kVarRemove.c() + ", workSpecId: " + workGenerationalId + ", notificationType: " + kVarRemove.a());
        bVar.e(kVarRemove.c());
    }

    @Override // b6.i
    public void e(j0 j0Var, b6.b bVar) {
        if (bVar instanceof b6.b.ConstraintsNotMet) {
            String str = j0Var.id;
            w.e().a(f3526k, "Constraints unmet for WorkSpec " + str);
            this.b.z(o1.a(j0Var), ((b6.b.ConstraintsNotMet) bVar).getReason());
        }
    }

    public final void h(Intent intent) {
        w.e().f(f3526k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.b.k(UUID.fromString(stringExtra));
    }

    public final void i(Intent intent) {
        if (this.f3535j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        w.e().a(f3526k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        k kVar = new k(intExtra, notification, intExtra2);
        this.f3531f.put(workGenerationalId, kVar);
        k kVar2 = this.f3531f.get(this.f3530e);
        if (kVar2 == null) {
            this.f3530e = workGenerationalId;
        } else {
            this.f3535j.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<WorkGenerationalId, k>> it = this.f3531f.entrySet().iterator();
                while (it.hasNext()) {
                    iA |= it.next().getValue().a();
                }
                kVar = new k(kVar2.c(), kVar2.b(), iA);
            } else {
                kVar = kVar2;
            }
        }
        this.f3535j.d(kVar.c(), kVar.a(), kVar.b());
    }

    public final void j(Intent intent) {
        w.e().f(f3526k, "Started foreground service " + intent);
        this.f3528c.d(new RunnableC0068a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void k(Intent intent, int i10) {
        w.e().f(f3526k, "Stopping foreground service");
        b bVar = this.f3535j;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void l() {
        this.f3535j = null;
        synchronized (this.f3529d) {
            try {
                Iterator<d2> it = this.f3533h.values().iterator();
                while (it.hasNext()) {
                    it.next().c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.b.r().m(this);
    }

    public void m(Intent intent, int i10) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j(intent);
            i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            k(intent, i10);
        }
    }

    public void n(int i10, int i11) {
        w.e().f(f3526k, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry<WorkGenerationalId, k> entry : this.f3531f.entrySet()) {
            if (entry.getValue().a() == i11) {
                this.b.z(entry.getKey(), -128);
            }
        }
        b bVar = this.f3535j;
        if (bVar != null) {
            bVar.c(i10);
        }
    }

    public void o(b bVar) {
        if (this.f3535j != null) {
            w.e().c(f3526k, "A callback already exists.");
        } else {
            this.f3535j = bVar;
        }
    }
}
