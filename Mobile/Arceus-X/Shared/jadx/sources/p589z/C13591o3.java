package p589z;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z.o3 */
/* JADX INFO: loaded from: classes.dex */
public class C13591o3 {

    /* JADX INFO: renamed from: a */
    public final Executor f47580a;

    /* JADX INFO: renamed from: b */
    public final Object f47581b = new Object();

    /* JADX INFO: renamed from: c */
    public final Set<InterfaceC13537h5> f47582c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final Set<InterfaceC13537h5> f47583d = new LinkedHashSet();

    /* JADX INFO: renamed from: e */
    public final Set<InterfaceC13537h5> f47584e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final CameraDevice.StateCallback f47585f = new a();

    /* JADX INFO: renamed from: z.o3$a */
    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m49559a(LinkedHashSet linkedHashSet, int i10) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC13537h5) it.next()).mo49412d(i10);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m49561c() {
            List<InterfaceC13537h5> listM49553f;
            synchronized (C13591o3.this.f47581b) {
                listM49553f = C13591o3.this.m49553f();
                C13591o3.this.f47584e.clear();
                C13591o3.this.f47582c.clear();
                C13591o3.this.f47583d.clear();
            }
            Iterator<InterfaceC13537h5> it = listM49553f.iterator();
            while (it.hasNext()) {
                it.next().mo49411c();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m49562d(final int i10) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C13591o3.this.f47581b) {
                linkedHashSet.addAll(C13591o3.this.f47584e);
                linkedHashSet.addAll(C13591o3.this.f47582c);
            }
            C13591o3.this.f47580a.execute(new Runnable() { // from class: z.n3
                @Override // java.lang.Runnable
                public final void run() {
                    C13591o3.a.m49559a(linkedHashSet, i10);
                }
            });
        }

        /* JADX INFO: renamed from: e */
        public final void m49563e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C13591o3.this.f47581b) {
                linkedHashSet.addAll(C13591o3.this.f47584e);
                linkedHashSet.addAll(C13591o3.this.f47582c);
            }
            C13591o3.this.f47580a.execute(new Runnable() { // from class: z.m3
                @Override // java.lang.Runnable
                public final void run() {
                    C13591o3.m49548b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            m49563e();
            m49561c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            m49563e();
            m49561c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            m49563e();
            m49562d(i10);
            m49561c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    public C13591o3(Executor executor) {
        this.f47580a = executor;
    }

    /* JADX INFO: renamed from: b */
    public static void m49548b(Set<InterfaceC13537h5> set) {
        for (InterfaceC13537h5 interfaceC13537h5 : set) {
            interfaceC13537h5.mo49410b().mo49427r(interfaceC13537h5);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m49549a(InterfaceC13537h5 interfaceC13537h5) {
        InterfaceC13537h5 next;
        Iterator<InterfaceC13537h5> it = m49553f().iterator();
        while (it.hasNext() && (next = it.next()) != interfaceC13537h5) {
            next.mo49411c();
        }
    }

    /* JADX INFO: renamed from: c */
    public CameraDevice.StateCallback m49550c() {
        return this.f47585f;
    }

    /* JADX INFO: renamed from: d */
    public List<InterfaceC13537h5> m49551d() {
        ArrayList arrayList;
        synchronized (this.f47581b) {
            arrayList = new ArrayList(this.f47582c);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public List<InterfaceC13537h5> m49552e() {
        ArrayList arrayList;
        synchronized (this.f47581b) {
            arrayList = new ArrayList(this.f47584e);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public List<InterfaceC13537h5> m49553f() {
        ArrayList arrayList;
        synchronized (this.f47581b) {
            arrayList = new ArrayList();
            arrayList.addAll(m49551d());
            arrayList.addAll(m49552e());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public void m49554g(InterfaceC13537h5 interfaceC13537h5) {
        synchronized (this.f47581b) {
            this.f47582c.remove(interfaceC13537h5);
            this.f47583d.remove(interfaceC13537h5);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m49555h(InterfaceC13537h5 interfaceC13537h5) {
        synchronized (this.f47581b) {
            this.f47583d.add(interfaceC13537h5);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m49556i(InterfaceC13537h5 interfaceC13537h5) {
        m49549a(interfaceC13537h5);
        synchronized (this.f47581b) {
            this.f47584e.remove(interfaceC13537h5);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m49557j(InterfaceC13537h5 interfaceC13537h5) {
        synchronized (this.f47581b) {
            this.f47582c.add(interfaceC13537h5);
            this.f47584e.remove(interfaceC13537h5);
        }
        m49549a(interfaceC13537h5);
    }

    /* JADX INFO: renamed from: k */
    public void m49558k(InterfaceC13537h5 interfaceC13537h5) {
        synchronized (this.f47581b) {
            this.f47584e.add(interfaceC13537h5);
        }
    }
}
