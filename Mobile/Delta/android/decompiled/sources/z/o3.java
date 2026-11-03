package z;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f37433a;
    public final Object b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<h5> f37434c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<h5> f37435d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<h5> f37436e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CameraDevice.StateCallback f37437f = new a();

    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        public static /* synthetic */ void a(LinkedHashSet linkedHashSet, int i10) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((h5) it.next()).d(i10);
            }
        }

        public final void c() {
            List<h5> listF;
            synchronized (o3.this.b) {
                listF = o3.this.f();
                o3.this.f37436e.clear();
                o3.this.f37434c.clear();
                o3.this.f37435d.clear();
            }
            Iterator<h5> it = listF.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }

        public final void d(final int i10) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (o3.this.b) {
                linkedHashSet.addAll(o3.this.f37436e);
                linkedHashSet.addAll(o3.this.f37434c);
            }
            o3.this.f37433a.execute(new Runnable() { // from class: z.n3
                @Override // java.lang.Runnable
                public final void run() {
                    o3.a.a(linkedHashSet, i10);
                }
            });
        }

        public final void e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (o3.this.b) {
                linkedHashSet.addAll(o3.this.f37436e);
                linkedHashSet.addAll(o3.this.f37434c);
            }
            o3.this.f37433a.execute(new Runnable() { // from class: z.m3
                @Override // java.lang.Runnable
                public final void run() {
                    o3.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            e();
            d(i10);
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public o3(Executor executor) {
        this.f37433a = executor;
    }

    public static void b(Set<h5> set) {
        for (h5 h5Var : set) {
            h5Var.b().r(h5Var);
        }
    }

    public final void a(h5 h5Var) {
        h5 next;
        Iterator<h5> it = f().iterator();
        while (it.hasNext() && (next = it.next()) != h5Var) {
            next.c();
        }
    }

    public CameraDevice.StateCallback c() {
        return this.f37437f;
    }

    public List<h5> d() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.f37434c);
        }
        return arrayList;
    }

    public List<h5> e() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList(this.f37436e);
        }
        return arrayList;
    }

    public List<h5> f() {
        ArrayList arrayList;
        synchronized (this.b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    public void g(h5 h5Var) {
        synchronized (this.b) {
            this.f37434c.remove(h5Var);
            this.f37435d.remove(h5Var);
        }
    }

    public void h(h5 h5Var) {
        synchronized (this.b) {
            this.f37435d.add(h5Var);
        }
    }

    public void i(h5 h5Var) {
        a(h5Var);
        synchronized (this.b) {
            this.f37436e.remove(h5Var);
        }
    }

    public void j(h5 h5Var) {
        synchronized (this.b) {
            this.f37434c.add(h5Var);
            this.f37436e.remove(h5Var);
        }
        a(h5Var);
    }

    public void k(h5 h5Var) {
        synchronized (this.b) {
            this.f37436e.add(h5Var);
        }
    }
}
