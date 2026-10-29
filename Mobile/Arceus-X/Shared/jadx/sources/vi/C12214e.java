package vi;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import p151gk.C6124q;

/* JADX INFO: renamed from: vi.e */
/* JADX INFO: loaded from: classes2.dex */
public class C12214e {

    /* JADX INFO: renamed from: a */
    public boolean f43063a;

    /* JADX INFO: renamed from: b */
    public final Handler f43064b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<e> f43065c;

    /* JADX INFO: renamed from: vi.e$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e f43066a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(e eVar) {
            this.f43066a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C12214e.this.f43065c.contains(this.f43066a)) {
                return;
            }
            C12214e.this.f43065c.add(this.f43066a);
        }
    }

    /* JADX INFO: renamed from: vi.e$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e f43068a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(e eVar) {
            this.f43068a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (C12214e.this.f43065c.remove(this.f43068a)) {
            }
        }
    }

    /* JADX INFO: renamed from: vi.e$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f43070a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Bundle f43071b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(int i10, Bundle bundle) {
            this.f43070a = i10;
            this.f43071b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = C12214e.this.f43065c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                e eVar = (e) obj;
                C6124q.m27063h("NotificationManager", "observer= " + eVar.getClass() + ". notificationId= " + this.f43070a + ".");
                eVar.mo1335S(this.f43070a, this.f43071b);
            }
        }
    }

    /* JADX INFO: renamed from: vi.e$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public static final C12214e f43073a = new C12214e();
    }

    /* JADX INFO: renamed from: vi.e$e */
    public interface e {
        /* JADX INFO: renamed from: S */
        void mo1335S(int i10, Bundle bundle);
    }

    /* JADX INFO: renamed from: c */
    public static C12214e m45220c() {
        return d.f43073a;
    }

    /* JADX INFO: renamed from: b */
    public void m45221b(e eVar) {
        if (!this.f43063a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.f43064b.post(new a(eVar));
    }

    /* JADX INFO: renamed from: d */
    public void m45222d(Context context) {
        C6124q.m27063h("NotificationManager", "init:");
        this.f43063a = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m45223e(int i10, Bundle bundle) {
        this.f43064b.post(new c(i10, bundle));
    }

    /* JADX INFO: renamed from: f */
    public void m45224f(int i10, Bundle bundle) {
        if (!this.f43063a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        m45223e(i10, bundle);
    }

    /* JADX INFO: renamed from: g */
    public void m45225g(e eVar) {
        if (!this.f43063a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.f43064b.post(new b(eVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12214e() {
        this.f43064b = new Handler(Looper.getMainLooper());
        this.f43065c = new ArrayList<>();
    }
}
