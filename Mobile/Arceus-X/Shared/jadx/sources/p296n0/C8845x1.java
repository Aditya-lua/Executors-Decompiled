package p296n0;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import ne.InterfaceFutureC9440x;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: n0.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C8845x1 {

    /* JADX INFO: renamed from: n0.x1$a */
    public class a implements InterfaceC10762c<List<Surface>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f32203a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C12997c.a f32204b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(boolean z10, C12997c.a aVar) {
            this.f32203a = z10;
            this.f32204b = aVar;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<Surface> list) {
            C12637g.m47075g(list);
            ArrayList arrayList = new ArrayList(list);
            if (this.f32203a) {
                arrayList.removeAll(Collections.singleton(null));
            }
            this.f32204b.m48314c(arrayList);
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            if (th2 instanceof TimeoutException) {
                this.f32204b.m48317f(th2);
            } else {
                this.f32204b.m48314c(Collections.EMPTY_LIST);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m35499a(final InterfaceFutureC9440x interfaceFutureC9440x, Executor executor, boolean z10, Collection collection, C12997c.a aVar) {
        aVar.m48312a(new Runnable() { // from class: n0.w1
            @Override // java.lang.Runnable
            public final void run() {
                interfaceFutureC9440x.cancel(true);
            }
        }, executor);
        C10773n.m40987j(interfaceFutureC9440x, new a(z10, aVar), executor);
        return "surfaceList[" + collection + "]";
    }

    /* JADX INFO: renamed from: c */
    public static void m35501c(List<AbstractC8830u1> list) {
        Iterator<AbstractC8830u1> it = list.iterator();
        while (it.hasNext()) {
            it.next().m35431e();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m35502d(List<AbstractC8830u1> list) throws AbstractC8830u1.a {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        do {
            try {
                list.get(i10).m35438l();
                i10++;
            } catch (AbstractC8830u1.a e10) {
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    list.get(i11).m35431e();
                }
                throw e10;
            }
        } while (i10 < list.size());
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceFutureC9440x<List<Surface>> m35503e(final Collection<AbstractC8830u1> collection, final boolean z10, long j10, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC8830u1> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C10773n.m40996s(it.next().m35436j()));
        }
        final InterfaceFutureC9440x interfaceFutureC9440xM40995r = C10773n.m40995r(j10, scheduledExecutorService, C10773n.m41000w(arrayList));
        return C12997c.m48311a(new C12997c.c() { // from class: n0.v1
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C8845x1.m35499a(interfaceFutureC9440xM40995r, executor, z10, collection, aVar);
            }
        });
    }
}
