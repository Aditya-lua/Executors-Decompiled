package n0;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    public class a implements r0.c<List<Surface>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f24945a;
        public final /* synthetic */ y1.c.a b;

        public a(boolean z10, y1.c.a aVar) {
            this.f24945a = z10;
            this.b = aVar;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Surface> list) {
            x2.g.g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f24945a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.b.c(arrayList);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof TimeoutException) {
                this.b.f(th2);
            } else {
                this.b.c(Collections.EMPTY_LIST);
            }
        }
    }

    public static /* synthetic */ Object a(final me.x xVar, Executor executor, boolean z10, Collection collection, y1.c.a aVar) {
        aVar.a(new Runnable() { // from class: n0.w1
            @Override // java.lang.Runnable
            public final void run() {
                xVar.cancel(true);
            }
        }, executor);
        r0.n.j(xVar, new a(z10, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    public static void c(List<u1> list) {
        Iterator<u1> it = list.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public static void d(List<u1> list) throws u1.a {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                list.get(i10).l();
                i10++;
            } catch (u1.a e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    list.get(i11).e();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    public static me.x<List<Surface>> e(final Collection<u1> collection, final boolean z10, long j10, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<u1> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(r0.n.s(it.next().j()));
        }
        final me.x xVarR = r0.n.r(j10, scheduledExecutorService, r0.n.w(arrayList));
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: n0.v1
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return x1.a(xVarR, executor, z10, collection, aVar);
            }
        });
    }
}
