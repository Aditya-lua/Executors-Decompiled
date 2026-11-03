package va;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static volatile j b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f33459a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f33460c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f33461d = new m(i.f33457a, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f33462e = new AtomicInteger();

    public static void a(final Context context) {
        if (b == null) {
            Object obj = f33459a;
            synchronized (obj) {
                try {
                    if (b == null) {
                        synchronized (obj) {
                            try {
                                j jVar = b;
                                Context applicationContext = context.getApplicationContext();
                                if (applicationContext != null) {
                                    context = applicationContext;
                                }
                                if (jVar == null || jVar.a() != context) {
                                    g.a();
                                    l.a();
                                    b = new f(context, t.a(new r() { // from class: va.h
                                    }));
                                    f33462e.incrementAndGet();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
