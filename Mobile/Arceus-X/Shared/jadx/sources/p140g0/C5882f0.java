package p140g0;

import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p155h0.InterfaceC6259a;
import p296n0.AbstractC8762h1;
import p296n0.C8738d1;
import p296n0.C8764h3;
import p296n0.C8770i3;
import p296n0.C8774j1;
import p296n0.C8776j3;
import p296n0.C8849y0;
import p296n0.C8854z0;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8789m0;
import p296n0.InterfaceC8794n0;
import p296n0.InterfaceC8804p0;
import p301n5.C8884a;
import p347p0.C10090f;
import p397r0.C10773n;
import p424s0.C11153n;
import p424s0.InterfaceC11152m;
import p436t.InterfaceC11464a;
import p456u2.C11780i;
import p533x2.C12637g;
import p563y1.C12997c;

/* JADX INFO: renamed from: g0.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5882f0 {

    /* JADX INFO: renamed from: s */
    public static final Object f22419s = new Object();

    /* JADX INFO: renamed from: t */
    public static final SparseArray<Integer> f22420t = new SparseArray<>();

    /* JADX INFO: renamed from: a */
    public final C8738d1 f22421a;

    /* JADX INFO: renamed from: b */
    public final Object f22422b;

    /* JADX INFO: renamed from: c */
    public final C5886g0 f22423c;

    /* JADX INFO: renamed from: d */
    public final Executor f22424d;

    /* JADX INFO: renamed from: e */
    public final Handler f22425e;

    /* JADX INFO: renamed from: f */
    public final HandlerThread f22426f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8794n0 f22427g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8789m0 f22428h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8777j4 f22429i;

    /* JADX INFO: renamed from: j */
    public InterfaceC11152m f22430j;

    /* JADX INFO: renamed from: k */
    public InterfaceC5957y f22431k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC5872c2 f22432l;

    /* JADX INFO: renamed from: m */
    public final InterfaceFutureC9440x<Void> f22433m;

    /* JADX INFO: renamed from: n */
    public final C8849y0 f22434n;

    /* JADX INFO: renamed from: o */
    public a f22435o;

    /* JADX INFO: renamed from: p */
    public InterfaceFutureC9440x<Void> f22436p;

    /* JADX INFO: renamed from: q */
    public final Integer f22437q;

    /* JADX INFO: renamed from: r */
    public final int f22438r;

    /* JADX INFO: renamed from: g0.f0$a */
    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5882f0(Context context, C5886g0.b bVar) {
        this(context, bVar, new C8776j3());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0136  */
    /* JADX WARN: Code duplicated, block: B:39:0x016f A[Catch: all -> 0x01cb, TryCatch #4 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x017d A[Catch: all -> 0x01cb, TryCatch #4 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0184 A[Catch: all -> 0x01cb, TryCatch #4 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0188 A[Catch: all -> 0x01cb, TryCatch #4 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01b4 A[Catch: all -> 0x01cb, TryCatch #4 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01b8 A[Catch: all -> 0x01cb, TryCatch #4 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x01bc A[Catch: all -> 0x01cb, TRY_LEAVE, TryCatch #4 {all -> 0x01cb, blocks: (B:3:0x0017, B:5:0x001f, B:7:0x003b, B:9:0x005a, B:11:0x0075, B:18:0x0087, B:19:0x00b0, B:21:0x00b6, B:22:0x00c6, B:24:0x00e9, B:25:0x00ec, B:28:0x00f6, B:29:0x0102, B:30:0x0103, B:31:0x010f, B:32:0x0110, B:33:0x011c, B:34:0x011d, B:38:0x013b, B:39:0x016f, B:40:0x0171, B:43:0x0177, B:45:0x017d, B:46:0x0184, B:48:0x0188, B:49:0x01b4, B:51:0x01b8, B:52:0x01bc, B:57:0x01ca, B:41:0x0172, B:42:0x0176), top: B:63:0x0017, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x0188, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m26331a(final C5882f0 c5882f0, Context context, final Executor executor, final int i10, final C12997c.a aVar, final long j10) {
        InterfaceC5872c2.c cVarMo26311e;
        c5882f0.getClass();
        C8884a.m35746c("CX:initAndRetryRecursively");
        final Context contextM38911a = C10090f.m38911a(context);
        try {
            try {
                InterfaceC8794n0.a aVarM26446j0 = c5882f0.f22423c.m26446j0(null);
                if (aVarM26446j0 == null) {
                    throw new C5923p1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                AbstractC8762h1 abstractC8762h1M35140a = AbstractC8762h1.m35140a(c5882f0.f22424d, c5882f0.f22425e);
                C5945v c5945vM26444h0 = c5882f0.f22423c.m26444h0(null);
                long jM26447k0 = c5882f0.f22423c.m26447k0();
                InterfaceC8777j4.c cVarM26453q0 = c5882f0.f22423c.m26453q0(null);
                if (cVarM26453q0 == null) {
                    throw new C5923p1(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                c5882f0.f22429i = cVarM26453q0.mo35230a(contextM38911a);
                C11153n c11153n = new C11153n(c5882f0.f22429i, null);
                c5882f0.f22430j = c11153n;
                c5882f0.f22427g = aVarM26446j0.mo35287a(contextM38911a, abstractC8762h1M35140a, c5945vM26444h0, jM26447k0, c5882f0.f22423c, c11153n);
                InterfaceC8789m0.a aVarM26450n0 = c5882f0.f22423c.m26450n0(null);
                if (aVarM26450n0 == null) {
                    throw new C5923p1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                InterfaceC8789m0 interfaceC8789m0Mo35279a = aVarM26450n0.mo35279a(contextM38911a, c5882f0.f22427g.mo35282a(), c5882f0.f22427g.mo35285d());
                c5882f0.f22428h = interfaceC8789m0Mo35279a;
                c5882f0.f22430j.mo42016b(interfaceC8789m0Mo35279a);
                if (executor instanceof ExecutorC5925q) {
                    ((ExecutorC5925q) executor).m26557e(c5882f0.f22427g);
                }
                c5882f0.f22421a.m35041n(c5882f0.f22427g);
                InterfaceC6259a interfaceC6259aMo35286f = c5882f0.f22427g.mo35286f();
                interfaceC6259aMo35286f.m27487a(c5882f0.f22421a);
                c5882f0.f22431k = new C5961z(c5882f0.f22421a, interfaceC6259aMo35286f, c5882f0.f22429i, c5882f0.f22430j);
                Iterator<InterfaceC8804p0> it = c5882f0.f22421a.m35040m().iterator();
                while (it.hasNext()) {
                    it.next().mo6698k().mo35045g(c5882f0.f22431k);
                }
                c5882f0.f22434n.m35532A(c5882f0.f22427g, c5882f0.f22421a);
                c5882f0.f22434n.m35533k(c5882f0.f22428h);
                c5882f0.f22434n.m35533k(c5882f0.f22427g.mo35286f());
                C8774j1.m35220a(contextM38911a, c5882f0.f22421a, c5945vM26444h0);
                if (i10 > 1) {
                    c5882f0.m26351s(null);
                }
                c5882f0.m26348p();
                aVar.m48314c(null);
                C8884a.m35749f();
            } catch (Throwable th2) {
                C8884a.m35749f();
                throw th2;
            }
        } catch (C5923p1 e10) {
            e = e10;
            C8854z0 c8854z0 = new C8854z0(j10, i10, e);
            cVarMo26311e = c5882f0.f22432l.mo26311e(c8854z0);
            c5882f0.m26351s(c8854z0);
            c5882f0.f22434n.m35542z();
            if (cVarMo26311e.m26325d() || i10 >= Integer.MAX_VALUE) {
                synchronized (c5882f0.f22422b) {
                    c5882f0.f22435o = a.INITIALIZING_ERROR;
                }
                if (cVarMo26311e.m26324c()) {
                    c5882f0.m26348p();
                    aVar.m48314c(null);
                } else if (e instanceof C8774j1.b) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C8774j1.b) e).m35222a();
                    C5931r1.m26564d("CameraX", str, e);
                    aVar.m48317f(new C5923p1(new C5953x(3, str)));
                } else if (e instanceof C5923p1) {
                    aVar.m48317f(e);
                } else {
                    aVar.m48317f(new C5923p1(e));
                }
            } else {
                C5931r1.m26573m("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e);
                C11780i.m44065b(c5882f0.f22425e, new Runnable() { // from class: g0.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22406a.m26346n(executor, j10, i10 + 1, contextM38911a, aVar);
                    }
                }, "retry_token", cVarMo26311e.m26323b());
            }
            C8884a.m35749f();
        } catch (RuntimeException e11) {
            e = e11;
            C8854z0 c8854z1 = new C8854z0(j10, i10, e);
            cVarMo26311e = c5882f0.f22432l.mo26311e(c8854z1);
            c5882f0.m26351s(c8854z1);
            c5882f0.f22434n.m35542z();
            if (cVarMo26311e.m26325d()) {
                synchronized (c5882f0.f22422b) {
                    c5882f0.f22435o = a.INITIALIZING_ERROR;
                    if (cVarMo26311e.m26324c()) {
                        c5882f0.m26348p();
                        aVar.m48314c(null);
                    } else if (e instanceof C8774j1.b) {
                        String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C8774j1.b) e).m35222a();
                        C5931r1.m26564d("CameraX", str2, e);
                        aVar.m48317f(new C5923p1(new C5953x(3, str2)));
                    } else if (e instanceof C5923p1) {
                        aVar.m48317f(e);
                    } else {
                        aVar.m48317f(new C5923p1(e));
                    }
                }
            } else {
                synchronized (c5882f0.f22422b) {
                    c5882f0.f22435o = a.INITIALIZING_ERROR;
                    if (cVarMo26311e.m26324c()) {
                        c5882f0.m26348p();
                        aVar.m48314c(null);
                    } else if (e instanceof C8774j1.b) {
                        String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C8774j1.b) e).m35222a();
                        C5931r1.m26564d("CameraX", str3, e);
                        aVar.m48317f(new C5923p1(new C5953x(3, str3)));
                    } else if (e instanceof C5923p1) {
                        aVar.m48317f(e);
                    } else {
                        aVar.m48317f(new C5923p1(e));
                    }
                }
            }
            C8884a.m35749f();
        } catch (C8774j1.b e12) {
            e = e12;
            C8854z0 c8854z2 = new C8854z0(j10, i10, e);
            cVarMo26311e = c5882f0.f22432l.mo26311e(c8854z2);
            c5882f0.m26351s(c8854z2);
            c5882f0.f22434n.m35542z();
            if (cVarMo26311e.m26325d()) {
                synchronized (c5882f0.f22422b) {
                    c5882f0.f22435o = a.INITIALIZING_ERROR;
                    if (cVarMo26311e.m26324c()) {
                        c5882f0.m26348p();
                        aVar.m48314c(null);
                    } else if (e instanceof C8774j1.b) {
                        String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C8774j1.b) e).m35222a();
                        C5931r1.m26564d("CameraX", str4, e);
                        aVar.m48317f(new C5923p1(new C5953x(3, str4)));
                    } else if (e instanceof C5923p1) {
                        aVar.m48317f(e);
                    } else {
                        aVar.m48317f(new C5923p1(e));
                    }
                }
            } else {
                synchronized (c5882f0.f22422b) {
                    c5882f0.f22435o = a.INITIALIZING_ERROR;
                    if (cVarMo26311e.m26324c()) {
                        c5882f0.m26348p();
                        aVar.m48314c(null);
                    } else if (e instanceof C8774j1.b) {
                        String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((C8774j1.b) e).m35222a();
                        C5931r1.m26564d("CameraX", str5, e);
                        aVar.m48317f(new C5923p1(new C5953x(3, str5)));
                    } else if (e instanceof C5923p1) {
                        aVar.m48317f(e);
                    } else {
                        aVar.m48317f(new C5923p1(e));
                    }
                }
            }
            C8884a.m35749f();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m26332b(C5882f0 c5882f0, C12997c.a aVar) {
        c5882f0.f22427g.shutdown();
        if (c5882f0.f22426f != null) {
            Executor executor = c5882f0.f22424d;
            if (executor instanceof ExecutorC5925q) {
                ((ExecutorC5925q) executor).m26556d();
            }
            c5882f0.f22426f.quit();
        }
        aVar.m48314c(null);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m26333c(C5882f0 c5882f0, Context context, C12997c.a aVar) {
        c5882f0.m26346n(c5882f0.f22424d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m26334d(final C5882f0 c5882f0, final C12997c.a aVar) {
        c5882f0.f22434n.m35542z();
        c5882f0.f22421a.m35038k().mo37173a(new Runnable() { // from class: g0.d0
            @Override // java.lang.Runnable
            public final void run() {
                C5882f0.m26332b(this.f22400a, aVar);
            }
        }, c5882f0.f22424d);
        return "CameraX shutdownInternal";
    }

    /* JADX INFO: renamed from: f */
    public static void m26336f(Integer num) {
        synchronized (f22419s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = f22420t;
                int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                m26339t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static C5886g0.b m26337k(Context context) {
        ComponentCallbacks2 componentCallbacks2M38912b = C10090f.m38912b(context);
        if (componentCallbacks2M38912b instanceof C5886g0.b) {
            return (C5886g0.b) componentCallbacks2M38912b;
        }
        try {
            Context contextM38911a = C10090f.m38911a(context);
            Bundle bundle = contextM38911a.getPackageManager().getServiceInfo(new ComponentName(contextM38911a, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C5886g0.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            C5931r1.m26563c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            C5931r1.m26564d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e11) {
            e = e11;
            C5931r1.m26564d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e12) {
            e = e12;
            C5931r1.m26564d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e13) {
            e = e13;
            C5931r1.m26564d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            C5931r1.m26564d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            C5931r1.m26564d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e16) {
            e = e16;
            C5931r1.m26564d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m26338m(Integer num) {
        synchronized (f22419s) {
            try {
                if (num == null) {
                    return;
                }
                C12637g.m47071c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f22420t;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                m26339t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m26339t() {
        SparseArray<Integer> sparseArray = f22420t;
        if (sparseArray.size() == 0) {
            C5931r1.m26569i();
            return;
        }
        if (sparseArray.get(3) != null) {
            C5931r1.m26570j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            C5931r1.m26570j(4);
        } else if (sparseArray.get(5) != null) {
            C5931r1.m26570j(5);
        } else if (sparseArray.get(6) != null) {
            C5931r1.m26570j(6);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m26340u(Context context, C8764h3 c8764h3, InterfaceC11464a<Context, C8764h3> interfaceC11464a) {
        if (c8764h3 != null) {
            C5931r1.m26561a("CameraX", "QuirkSettings from CameraXConfig: " + c8764h3);
        } else {
            c8764h3 = interfaceC11464a.apply(context);
            C5931r1.m26561a("CameraX", "QuirkSettings from app metadata: " + c8764h3);
        }
        if (c8764h3 == null) {
            c8764h3 = C8770i3.f31892b;
            C5931r1.m26561a("CameraX", "QuirkSettings by default: " + c8764h3);
        }
        C8770i3.m35195b().m35198d(c8764h3);
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC8794n0 m26341g() {
        InterfaceC8794n0 interfaceC8794n0 = this.f22427g;
        if (interfaceC8794n0 != null) {
            return interfaceC8794n0;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* JADX INFO: renamed from: h */
    public C8738d1 m26342h() {
        return this.f22421a;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC5957y m26343i() {
        InterfaceC5957y interfaceC5957y = this.f22431k;
        if (interfaceC5957y != null) {
            return interfaceC5957y;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* JADX INFO: renamed from: j */
    public int m26344j() {
        return this.f22438r;
    }

    /* JADX INFO: renamed from: l */
    public InterfaceFutureC9440x<Void> m26345l() {
        return this.f22433m;
    }

    /* JADX INFO: renamed from: n */
    public final void m26346n(final Executor executor, final long j10, final int i10, final Context context, final C12997c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: g0.b0
            @Override // java.lang.Runnable
            public final void run() {
                C5882f0.m26331a(this.f22377a, context, executor, i10, aVar, j10);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceFutureC9440x<Void> m26347o(final Context context) {
        InterfaceFutureC9440x<Void> interfaceFutureC9440xM48311a;
        synchronized (this.f22422b) {
            C12637g.m47078j(this.f22435o == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f22435o = a.INITIALIZING;
            interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: g0.a0
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C5882f0.m26333c(this.f22358a, context, aVar);
                }
            });
        }
        return interfaceFutureC9440xM48311a;
    }

    /* JADX INFO: renamed from: p */
    public final void m26348p() {
        synchronized (this.f22422b) {
            this.f22435o = a.INITIALIZED;
        }
    }

    /* JADX INFO: renamed from: q */
    public InterfaceFutureC9440x<Void> m26349q() {
        return m26350r();
    }

    /* JADX INFO: renamed from: r */
    public final InterfaceFutureC9440x<Void> m26350r() {
        synchronized (this.f22422b) {
            try {
                this.f22425e.removeCallbacksAndMessages("retry_token");
                int iOrdinal = this.f22435o.ordinal();
                if (iOrdinal == 0) {
                    this.f22435o = a.SHUTDOWN;
                    return C10773n.m40993p(null);
                }
                if (iOrdinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.f22435o = a.SHUTDOWN;
                    m26336f(this.f22437q);
                    this.f22436p = C12997c.m48311a(new C12997c.c() { // from class: g0.c0
                        @Override // p563y1.C12997c.c
                        /* JADX INFO: renamed from: a */
                        public final Object mo22051a(C12997c.a aVar) {
                            return C5882f0.m26334d(this.f22387a, aVar);
                        }
                    });
                }
                return this.f22436p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m26351s(InterfaceC5872c2.b bVar) {
        if (C8884a.m35751h()) {
            C8884a.m35753j("CX:CameraProvider-RetryStatus", bVar != null ? bVar.mo26319m() : -1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5882f0(Context context, C5886g0.b bVar, InterfaceC11464a<Context, C8764h3> interfaceC11464a) {
        this.f22421a = new C8738d1();
        this.f22422b = new Object();
        this.f22435o = a.UNINITIALIZED;
        this.f22436p = C10773n.m40993p(null);
        if (bVar != null) {
            this.f22423c = bVar.getCameraXConfig();
        } else {
            C5886g0.b bVarM26337k = m26337k(context);
            if (bVarM26337k == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f22423c = bVarM26337k.getCameraXConfig();
        }
        m26340u(context, this.f22423c.m26451o0(), interfaceC11464a);
        this.f22438r = this.f22423c.m26449m0();
        Executor executorM26445i0 = this.f22423c.m26445i0(null);
        Handler handlerM26452p0 = this.f22423c.m26452p0(null);
        executorM26445i0 = executorM26445i0 == null ? new ExecutorC5925q() : executorM26445i0;
        this.f22424d = executorM26445i0;
        if (handlerM26452p0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f22426f = handlerThread;
            handlerThread.start();
            this.f22425e = C11780i.m44064a(handlerThread.getLooper());
        } else {
            this.f22426f = null;
            this.f22425e = handlerM26452p0;
        }
        Integer num = (Integer) this.f22423c.mo35030h(C5886g0.f22494V, null);
        this.f22437q = num;
        m26338m(num);
        this.f22432l = new InterfaceC5872c2.a(this.f22423c.m26448l0()).m26318a();
        this.f22434n = new C8849y0(executorM26445i0);
        this.f22433m = m26347o(context);
    }
}
