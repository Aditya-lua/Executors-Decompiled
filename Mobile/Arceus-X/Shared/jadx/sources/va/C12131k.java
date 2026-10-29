package va;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: va.k */
/* JADX INFO: loaded from: classes.dex */
public final class C12131k {

    /* JADX INFO: renamed from: b */
    public static volatile AbstractC12129j f42745b;

    /* JADX INFO: renamed from: a */
    public static final Object f42744a = new Object();

    /* JADX INFO: renamed from: c */
    public static final AtomicReference f42746c = new AtomicReference();

    /* JADX INFO: renamed from: d */
    public static final C12135m f42747d = new C12135m(C12127i.f42741a, null);

    /* JADX INFO: renamed from: e */
    public static final AtomicInteger f42748e = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    public static void m44961a(final Context context) {
        if (f42745b == null) {
            Object obj = f42744a;
            synchronized (obj) {
                try {
                    if (f42745b == null) {
                        synchronized (obj) {
                            try {
                                AbstractC12129j abstractC12129j = f42745b;
                                Context applicationContext = context.getApplicationContext();
                                if (applicationContext != null) {
                                    context = applicationContext;
                                }
                                if (abstractC12129j == null || abstractC12129j.mo44958a() != context) {
                                    C12123g.m44960a();
                                    C12133l.m44962a();
                                    f42745b = new C12121f(context, C12149t.m44977a(new InterfaceC12145r() { // from class: va.h
                                    }));
                                    f42748e.incrementAndGet();
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
