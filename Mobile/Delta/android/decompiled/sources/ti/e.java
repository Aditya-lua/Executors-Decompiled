package ti;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import ek.q;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32392a;
    public final Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<InterfaceC0581e> f32393c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0581e f32394a;

        public a(InterfaceC0581e interfaceC0581e) {
            this.f32394a = interfaceC0581e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f32393c.contains(this.f32394a)) {
                return;
            }
            e.this.f32393c.add(this.f32394a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0581e f32395a;

        public b(InterfaceC0581e interfaceC0581e) {
            this.f32395a = interfaceC0581e;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (e.this.f32393c.remove(this.f32395a)) {
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32396a;
        public final /* synthetic */ Bundle b;

        public c(int i10, Bundle bundle) {
            this.f32396a = i10;
            this.b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = e.this.f32393c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                InterfaceC0581e interfaceC0581e = (InterfaceC0581e) obj;
                q.h("NotificationManager", "observer= " + interfaceC0581e.getClass() + ". notificationId= " + this.f32396a + ".");
                interfaceC0581e.R(this.f32396a, this.b);
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f32398a = new e();
    }

    /* JADX INFO: renamed from: ti.e$e, reason: collision with other inner class name */
    public interface InterfaceC0581e {
        void R(int i10, Bundle bundle);
    }

    public static e c() {
        return d.f32398a;
    }

    public void b(InterfaceC0581e interfaceC0581e) {
        if (!this.f32392a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.b.post(new a(interfaceC0581e));
    }

    public void d(Context context) {
        q.h("NotificationManager", "init:");
        this.f32392a = true;
    }

    public final void e(int i10, Bundle bundle) {
        this.b.post(new c(i10, bundle));
    }

    public void f(int i10, Bundle bundle) {
        if (!this.f32392a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        e(i10, bundle);
    }

    public void g(InterfaceC0581e interfaceC0581e) {
        if (!this.f32392a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.b.post(new b(interfaceC0581e));
    }

    public e() {
        this.b = new Handler(Looper.getMainLooper());
        this.f32393c = new ArrayList<>();
    }
}
