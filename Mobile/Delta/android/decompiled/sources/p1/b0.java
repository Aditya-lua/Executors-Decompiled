package p1;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public final OrientationEventListener b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28122a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<b, c> f28123c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28124d = false;

    public class a extends OrientationEventListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28125a;

        public a(Context context) {
            super(context);
            this.f28125a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int iB;
            ArrayList arrayList;
            if (i10 == -1 || this.f28125a == (iB = b0.b(i10))) {
                return;
            }
            this.f28125a = iB;
            synchronized (b0.this.f28122a) {
                arrayList = new ArrayList(b0.this.f28123c.values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((c) obj).c(iB);
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f28126a;
        public final Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f28127c = new AtomicBoolean(true);

        public c(b bVar, Executor executor) {
            this.f28126a = bVar;
            this.b = executor;
        }

        public static /* synthetic */ void a(c cVar, int i10) {
            if (cVar.f28127c.get()) {
                cVar.f28126a.a(i10);
            }
        }

        public void b() {
            this.f28127c.set(false);
        }

        public void c(final int i10) {
            this.b.execute(new Runnable() { // from class: p1.c0
                @Override // java.lang.Runnable
                public final void run() {
                    b0.c.a(this.f28129a, i10);
                }
            });
        }
    }

    public b0(Context context) {
        this.b = new a(context);
    }

    public static int b(int i10) {
        if (i10 >= 315 || i10 < 45) {
            return 0;
        }
        if (i10 >= 225) {
            return 1;
        }
        return i10 >= 135 ? 2 : 3;
    }

    public boolean a(Executor executor, b bVar) {
        synchronized (this.f28122a) {
            try {
                if (!this.b.canDetectOrientation() && !this.f28124d) {
                    return false;
                }
                this.f28123c.put(bVar, new c(bVar, executor));
                this.b.enable();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(b bVar) {
        synchronized (this.f28122a) {
            try {
                c cVar = this.f28123c.get(bVar);
                if (cVar != null) {
                    cVar.b();
                    this.f28123c.remove(bVar);
                }
                if (this.f28123c.isEmpty()) {
                    this.b.disable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
