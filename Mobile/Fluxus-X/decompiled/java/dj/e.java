package dj;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12484a;
    public final Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0225e> f12485c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0225e f12486a;

        public a(InterfaceC0225e interfaceC0225e) {
            this.f12486a = interfaceC0225e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f12485c.contains(this.f12486a)) {
                return;
            }
            e.this.f12485c.add(this.f12486a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0225e f12487a;

        public b(InterfaceC0225e interfaceC0225e) {
            this.f12487a = interfaceC0225e;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (e.this.f12485c.remove(this.f12487a)) {
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f12488a;
        public final /* synthetic */ Bundle b;

        public c(int i10, Bundle bundle) {
            this.f12488a = i10;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = e.this.f12485c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                InterfaceC0225e interfaceC0225e = (InterfaceC0225e) obj;
                q.h("NotificationManager", "observer= " + interfaceC0225e.getClass() + ". notificationId= " + this.f12488a + ".");
                interfaceC0225e.R(this.f12488a, this.b);
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f12490a = new e();
    }

    /* JADX INFO: renamed from: dj.e$e, reason: collision with other inner class name */
    public interface InterfaceC0225e {
        void R(int i10, Bundle bundle);
    }

    public static e c() {
        return d.f12490a;
    }

    public void b(InterfaceC0225e interfaceC0225e) {
        if (!this.f12484a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.b.post(new a(interfaceC0225e));
    }

    public void d(Context context) {
        q.h("NotificationManager", "init:");
        this.f12484a = true;
    }

    public final void e(int i10, Bundle bundle) {
        this.b.post(new c(i10, bundle));
    }

    public void f(int i10, Bundle bundle) {
        if (!this.f12484a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        e(i10, bundle);
    }

    public void g(InterfaceC0225e interfaceC0225e) {
        if (!this.f12484a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.b.post(new b(interfaceC0225e));
    }

    public e() {
        this.b = new Handler(Looper.getMainLooper());
        this.f12485c = new ArrayList<>();
    }
}
