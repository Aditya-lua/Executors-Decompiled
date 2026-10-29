package p348p1;

import android.content.Context;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: p1.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10114b0 {

    /* JADX INFO: renamed from: b */
    public final OrientationEventListener f36402b;

    /* JADX INFO: renamed from: a */
    public final Object f36401a = new Object();

    /* JADX INFO: renamed from: c */
    public final Map<b, c> f36403c = new HashMap();

    /* JADX INFO: renamed from: d */
    public boolean f36404d = false;

    /* JADX INFO: renamed from: p1.b0$a */
    public class a extends OrientationEventListener {

        /* JADX INFO: renamed from: a */
        public int f36405a;

        public a(Context context) {
            super(context);
            this.f36405a = -1;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int iM39013b;
            ArrayList arrayList;
            if (i10 == -1 || this.f36405a == (iM39013b = C10114b0.m39013b(i10))) {
                return;
            }
            this.f36405a = iM39013b;
            synchronized (C10114b0.this.f36401a) {
                arrayList = new ArrayList(C10114b0.this.f36403c.values());
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((c) obj).m39019c(iM39013b);
            }
        }
    }

    /* JADX INFO: renamed from: p1.b0$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo39016a(int i10);
    }

    /* JADX INFO: renamed from: p1.b0$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final b f36407a;

        /* JADX INFO: renamed from: b */
        public final Executor f36408b;

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f36409c = new AtomicBoolean(true);

        public c(b bVar, Executor executor) {
            this.f36407a = bVar;
            this.f36408b = executor;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m39017a(c cVar, int i10) {
            if (cVar.f36409c.get()) {
                cVar.f36407a.mo39016a(i10);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m39018b() {
            this.f36409c.set(false);
        }

        /* JADX INFO: renamed from: c */
        public void m39019c(final int i10) {
            this.f36408b.execute(new Runnable() { // from class: p1.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C10114b0.c.m39017a(this.f36411a, i10);
                }
            });
        }
    }

    public C10114b0(Context context) {
        this.f36402b = new a(context);
    }

    /* JADX INFO: renamed from: b */
    public static int m39013b(int i10) {
        if (i10 >= 315 || i10 < 45) {
            return 0;
        }
        if (i10 >= 225) {
            return 1;
        }
        return i10 >= 135 ? 2 : 3;
    }

    /* JADX INFO: renamed from: a */
    public boolean m39014a(Executor executor, b bVar) {
        synchronized (this.f36401a) {
            try {
                if (!this.f36402b.canDetectOrientation() && !this.f36404d) {
                    return false;
                }
                this.f36403c.put(bVar, new c(bVar, executor));
                this.f36402b.enable();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m39015c(b bVar) {
        synchronized (this.f36401a) {
            try {
                c cVar = this.f36403c.get(bVar);
                if (cVar != null) {
                    cVar.m39018b();
                    this.f36403c.remove(bVar);
                }
                if (this.f36403c.isEmpty()) {
                    this.f36402b.disable();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
