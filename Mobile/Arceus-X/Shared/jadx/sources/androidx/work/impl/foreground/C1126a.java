package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import p026b6.AbstractC1237b;
import p026b6.C1247l;
import p026b6.C1248m;
import p026b6.InterfaceC1244i;
import p120f6.C5390j0;
import p120f6.C5406o1;
import p120f6.WorkGenerationalId;
import p161h6.InterfaceC6292b;
import p256ku.InterfaceC7850d2;
import p536x5.AbstractC12732w;
import p536x5.C12708k;
import p567y5.C13048f1;
import p567y5.InterfaceC13043e;

/* JADX INFO: renamed from: androidx.work.impl.foreground.a */
/* JADX INFO: loaded from: classes.dex */
public class C1126a implements InterfaceC1244i, InterfaceC13043e {

    /* JADX INFO: renamed from: k */
    public static final String f4609k = AbstractC12732w.m47443i("SystemFgDispatcher");

    /* JADX INFO: renamed from: a */
    public Context f4610a;

    /* JADX INFO: renamed from: b */
    public C13048f1 f4611b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC6292b f4612c;

    /* JADX INFO: renamed from: d */
    public final Object f4613d = new Object();

    /* JADX INFO: renamed from: e */
    public WorkGenerationalId f4614e;

    /* JADX INFO: renamed from: f */
    public final Map<WorkGenerationalId, C12708k> f4615f;

    /* JADX INFO: renamed from: g */
    public final Map<WorkGenerationalId, C5390j0> f4616g;

    /* JADX INFO: renamed from: h */
    public final Map<WorkGenerationalId, InterfaceC7850d2> f4617h;

    /* JADX INFO: renamed from: i */
    public final C1247l f4618i;

    /* JADX INFO: renamed from: j */
    public b f4619j;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f4620a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(String str) {
            this.f4620a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5390j0 c5390j0M48665g = C1126a.this.f4611b.m48586r().m48665g(this.f4620a);
            if (c5390j0M48665g == null || !c5390j0M48665g.m24760m()) {
                return;
            }
            synchronized (C1126a.this.f4613d) {
                C1126a.this.f4616g.put(C5406o1.m24872a(c5390j0M48665g), c5390j0M48665g);
                C1126a c1126a = C1126a.this;
                C1126a.this.f4617h.put(C5406o1.m24872a(c5390j0M48665g), C1248m.m6965e(c1126a.f4618i, c5390j0M48665g, c1126a.f4612c.mo27571b(), C1126a.this));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.foreground.a$b */
    public interface b {
        /* JADX INFO: renamed from: b */
        void mo6402b(int i10, Notification notification);

        /* JADX INFO: renamed from: c */
        void mo6403c(int i10);

        /* JADX INFO: renamed from: d */
        void mo6404d(int i10, int i11, Notification notification);

        /* JADX INFO: renamed from: e */
        void mo6405e(int i10);
    }

    public C1126a(Context context) {
        this.f4610a = context;
        C13048f1 c13048f1M48580p = C13048f1.m48580p(context);
        this.f4611b = c13048f1M48580p;
        this.f4612c = c13048f1M48580p.m48590v();
        this.f4614e = null;
        this.f4615f = new LinkedHashMap();
        this.f4617h = new HashMap();
        this.f4616g = new HashMap();
        this.f4618i = new C1247l(this.f4611b.m48588t());
        this.f4611b.m48586r().m48663e(this);
    }

    /* JADX INFO: renamed from: c */
    public static Intent m6411c(Context context, WorkGenerationalId workGenerationalId, C12708k c12708k) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c12708k.m47385c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c12708k.m47383a());
        intent.putExtra("KEY_NOTIFICATION", c12708k.m47384b());
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        return intent;
    }

    /* JADX INFO: renamed from: f */
    public static Intent m6412f(Context context, WorkGenerationalId workGenerationalId, C12708k c12708k) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.getWorkSpecId());
        intent.putExtra("KEY_GENERATION", workGenerationalId.getGeneration());
        intent.putExtra("KEY_NOTIFICATION_ID", c12708k.m47385c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c12708k.m47383a());
        intent.putExtra("KEY_NOTIFICATION", c12708k.m47384b());
        return intent;
    }

    /* JADX INFO: renamed from: g */
    public static Intent m6413g(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:18:0x0049 */
    @Override // p567y5.InterfaceC13043e
    /* JADX INFO: renamed from: d */
    public void mo6396d(WorkGenerationalId workGenerationalId, boolean z10) {
        Map.Entry<WorkGenerationalId, C12708k> entry;
        synchronized (this.f4613d) {
            try {
                InterfaceC7850d2 interfaceC7850d2Remove = this.f4616g.remove(workGenerationalId) != null ? this.f4617h.remove(workGenerationalId) : null;
                if (interfaceC7850d2Remove != null) {
                    interfaceC7850d2Remove.mo32597c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C12708k c12708kRemove = this.f4615f.remove(workGenerationalId);
        if (workGenerationalId.equals(this.f4614e)) {
            if (this.f4615f.size() > 0) {
                Iterator<Map.Entry<WorkGenerationalId, C12708k>> it = this.f4615f.entrySet().iterator();
                Map.Entry<WorkGenerationalId, C12708k> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f4614e = entry.getKey();
                if (this.f4619j != null) {
                    C12708k value = entry.getValue();
                    this.f4619j.mo6404d(value.m47385c(), value.m47383a(), value.m47384b());
                    this.f4619j.mo6405e(value.m47385c());
                }
            } else {
                this.f4614e = null;
            }
        }
        b bVar = this.f4619j;
        if (c12708kRemove == null || bVar == null) {
            return;
        }
        AbstractC12732w.m47441e().mo47444a(f4609k, "Removing Notification (id: " + c12708kRemove.m47385c() + ", workSpecId: " + workGenerationalId + ", notificationType: " + c12708kRemove.m47383a());
        bVar.mo6405e(c12708kRemove.m47385c());
    }

    @Override // p026b6.InterfaceC1244i
    /* JADX INFO: renamed from: e */
    public void mo6414e(C5390j0 c5390j0, AbstractC1237b abstractC1237b) {
        if (abstractC1237b instanceof AbstractC1237b.ConstraintsNotMet) {
            String str = c5390j0.id;
            AbstractC12732w.m47441e().mo47444a(f4609k, "Constraints unmet for WorkSpec " + str);
            this.f4611b.m48594z(C5406o1.m24872a(c5390j0), ((AbstractC1237b.ConstraintsNotMet) abstractC1237b).getReason());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m6415h(Intent intent) {
        AbstractC12732w.m47441e().mo47448f(f4609k, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f4611b.m48581k(UUID.fromString(stringExtra));
    }

    /* JADX INFO: renamed from: i */
    public final void m6416i(Intent intent) {
        if (this.f4619j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int iM47383a = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC12732w.m47441e().mo47444a(f4609k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C12708k c12708k = new C12708k(intExtra, notification, intExtra2);
        this.f4615f.put(workGenerationalId, c12708k);
        C12708k c12708k2 = this.f4615f.get(this.f4614e);
        if (c12708k2 == null) {
            this.f4614e = workGenerationalId;
        } else {
            this.f4619j.mo6402b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<WorkGenerationalId, C12708k>> it = this.f4615f.entrySet().iterator();
                while (it.hasNext()) {
                    iM47383a |= it.next().getValue().m47383a();
                }
                c12708k = new C12708k(c12708k2.m47385c(), c12708k2.m47384b(), iM47383a);
            } else {
                c12708k = c12708k2;
            }
        }
        this.f4619j.mo6404d(c12708k.m47385c(), c12708k.m47383a(), c12708k.m47384b());
    }

    /* JADX INFO: renamed from: j */
    public final void m6417j(Intent intent) {
        AbstractC12732w.m47441e().mo47448f(f4609k, "Started foreground service " + intent);
        this.f4612c.m27573d(new a(intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    /* JADX INFO: renamed from: k */
    public void m6418k(Intent intent, int i10) {
        AbstractC12732w.m47441e().mo47448f(f4609k, "Stopping foreground service");
        b bVar = this.f4619j;
        if (bVar != null) {
            bVar.mo6403c(i10);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m6419l() {
        this.f4619j = null;
        synchronized (this.f4613d) {
            try {
                Iterator<InterfaceC7850d2> it = this.f4617h.values().iterator();
                while (it.hasNext()) {
                    it.next().mo32597c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f4611b.m48586r().m48670m(this);
    }

    /* JADX INFO: renamed from: m */
    public void m6420m(Intent intent, int i10) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m6417j(intent);
            m6416i(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m6416i(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m6415h(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            m6418k(intent, i10);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m6421n(int i10, int i11) {
        AbstractC12732w.m47441e().mo47448f(f4609k, "Foreground service timed out, FGS type: " + i11);
        for (Map.Entry<WorkGenerationalId, C12708k> entry : this.f4615f.entrySet()) {
            if (entry.getValue().m47383a() == i11) {
                this.f4611b.m48594z(entry.getKey(), -128);
            }
        }
        b bVar = this.f4619j;
        if (bVar != null) {
            bVar.mo6403c(i10);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m6422o(b bVar) {
        if (this.f4619j != null) {
            AbstractC12732w.m47441e().mo47446c(f4609k, "A callback already exists.");
        } else {
            this.f4619j = bVar;
        }
    }
}
