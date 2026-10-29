package vi;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import gk.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33257a;
    public final Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0602e> f33258c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0602e f33259a;

        public a(InterfaceC0602e interfaceC0602e) {
            this.f33259a = interfaceC0602e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f33258c.contains(this.f33259a)) {
                return;
            }
            e.this.f33258c.add(this.f33259a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0602e f33260a;

        public b(InterfaceC0602e interfaceC0602e) {
            this.f33260a = interfaceC0602e;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (e.this.f33258c.remove(this.f33260a)) {
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f33261a;
        public final /* synthetic */ Bundle b;

        public c(int i10, Bundle bundle) {
            this.f33261a = i10;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = e.this.f33258c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                InterfaceC0602e interfaceC0602e = (InterfaceC0602e) obj;
                p.h("NotificationManager", "observer= " + interfaceC0602e.getClass() + ". notificationId= " + this.f33261a + ".");
                interfaceC0602e.S(this.f33261a, this.b);
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f33263a = new e();
    }

    /* JADX INFO: renamed from: vi.e$e, reason: collision with other inner class name */
    public interface InterfaceC0602e {
        void S(int i10, Bundle bundle);
    }

    public static e c() {
        return d.f33263a;
    }

    public void b(InterfaceC0602e interfaceC0602e) {
        if (!this.f33257a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.b.post(new a(interfaceC0602e));
    }

    public void d(Context context) {
        p.h("NotificationManager", "init:");
        this.f33257a = true;
    }

    public final void e(int i10, Bundle bundle) {
        this.b.post(new c(i10, bundle));
    }

    public void f(int i10, Bundle bundle) {
        if (!this.f33257a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        e(i10, bundle);
    }

    public void g(InterfaceC0602e interfaceC0602e) {
        if (!this.f33257a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.b.post(new b(interfaceC0602e));
    }

    public e() {
        this.b = new Handler(Looper.getMainLooper());
        this.f33258c = new ArrayList<>();
    }
}
