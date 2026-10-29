package g0;

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
import n0.h3;
import n0.i3;
import n0.j3;
import n0.j4;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f17373s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SparseArray<Integer> f17374t = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.d1 f17375a;
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f17376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f17377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f17378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HandlerThread f17379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n0.n0 f17380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n0.m0 f17381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j4 f17382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s0.m f17383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y f17384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f17385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final me.x<Void> f17386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n0.y0 f17387n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f17388o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public me.x<Void> f17389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Integer f17390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f17391r;

    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public f0(Context context, g0.b bVar) {
        this(context, bVar, new j3());
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
    public static /* synthetic */ void a(final f0 f0Var, Context context, final Executor executor, final int i10, final y1.c.a aVar, final long j10) {
        c2.c cVarE;
        f0Var.getClass();
        n5.a.c("CX:initAndRetryRecursively");
        final Context contextA = p0.f.a(context);
        try {
            try {
                n0.n0.a aVarJ0 = f0Var.f17376c.j0(null);
                if (aVarJ0 == null) {
                    throw new p1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
                }
                n0.h1 h1VarA = n0.h1.a(f0Var.f17377d, f0Var.f17378e);
                v vVarH0 = f0Var.f17376c.h0(null);
                long jK0 = f0Var.f17376c.k0();
                j4.c cVarQ0 = f0Var.f17376c.q0(null);
                if (cVarQ0 == null) {
                    throw new p1(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                f0Var.f17382i = cVarQ0.a(contextA);
                s0.n nVar = new s0.n(f0Var.f17382i, null);
                f0Var.f17383j = nVar;
                f0Var.f17380g = aVarJ0.a(contextA, h1VarA, vVarH0, jK0, f0Var.f17376c, nVar);
                n0.m0.a aVarN0 = f0Var.f17376c.n0(null);
                if (aVarN0 == null) {
                    throw new p1(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
                }
                n0.m0 m0VarA = aVarN0.a(contextA, f0Var.f17380g.a(), f0Var.f17380g.d());
                f0Var.f17381h = m0VarA;
                f0Var.f17383j.b(m0VarA);
                if (executor instanceof q) {
                    ((q) executor).e(f0Var.f17380g);
                }
                f0Var.f17375a.n(f0Var.f17380g);
                h0.a aVarF = f0Var.f17380g.f();
                aVarF.a(f0Var.f17375a);
                f0Var.f17384k = new z(f0Var.f17375a, aVarF, f0Var.f17382i, f0Var.f17383j);
                Iterator<n0.p0> it = f0Var.f17375a.m().iterator();
                while (it.hasNext()) {
                    it.next().k().g(f0Var.f17384k);
                }
                f0Var.f17387n.A(f0Var.f17380g, f0Var.f17375a);
                f0Var.f17387n.k(f0Var.f17381h);
                f0Var.f17387n.k(f0Var.f17380g.f());
                n0.j1.a(contextA, f0Var.f17375a, vVarH0);
                if (i10 > 1) {
                    f0Var.s(null);
                }
                f0Var.p();
                aVar.c(null);
                n5.a.f();
            } catch (Throwable th2) {
                n5.a.f();
                throw th2;
            }
        } catch (p1 e10) {
            e = e10;
            n0.z0 z0Var = new n0.z0(j10, i10, e);
            cVarE = f0Var.f17385l.e(z0Var);
            f0Var.s(z0Var);
            f0Var.f17387n.z();
            if (cVarE.d() || i10 >= Integer.MAX_VALUE) {
                synchronized (f0Var.b) {
                    f0Var.f17388o = a.INITIALIZING_ERROR;
                }
                if (cVarE.c()) {
                    f0Var.p();
                    aVar.c(null);
                } else if (e instanceof n0.j1.b) {
                    String str = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((n0.j1.b) e).a();
                    r1.d("CameraX", str, e);
                    aVar.f(new p1(new x(3, str)));
                } else if (e instanceof p1) {
                    aVar.f(e);
                } else {
                    aVar.f(new p1(e));
                }
            } else {
                r1.m("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e);
                u2.i.b(f0Var.f17378e, new Runnable() { // from class: g0.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17363a.n(executor, j10, i10 + 1, contextA, aVar);
                    }
                }, "retry_token", cVarE.b());
            }
            n5.a.f();
        } catch (RuntimeException e11) {
            e = e11;
            n0.z0 z0Var2 = new n0.z0(j10, i10, e);
            cVarE = f0Var.f17385l.e(z0Var2);
            f0Var.s(z0Var2);
            f0Var.f17387n.z();
            if (cVarE.d()) {
                synchronized (f0Var.b) {
                    f0Var.f17388o = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        f0Var.p();
                        aVar.c(null);
                    } else if (e instanceof n0.j1.b) {
                        String str2 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((n0.j1.b) e).a();
                        r1.d("CameraX", str2, e);
                        aVar.f(new p1(new x(3, str2)));
                    } else if (e instanceof p1) {
                        aVar.f(e);
                    } else {
                        aVar.f(new p1(e));
                    }
                }
            } else {
                synchronized (f0Var.b) {
                    f0Var.f17388o = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        f0Var.p();
                        aVar.c(null);
                    } else if (e instanceof n0.j1.b) {
                        String str3 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((n0.j1.b) e).a();
                        r1.d("CameraX", str3, e);
                        aVar.f(new p1(new x(3, str3)));
                    } else if (e instanceof p1) {
                        aVar.f(e);
                    } else {
                        aVar.f(new p1(e));
                    }
                }
            }
            n5.a.f();
        } catch (n0.j1.b e12) {
            e = e12;
            n0.z0 z0Var3 = new n0.z0(j10, i10, e);
            cVarE = f0Var.f17385l.e(z0Var3);
            f0Var.s(z0Var3);
            f0Var.f17387n.z();
            if (cVarE.d()) {
                synchronized (f0Var.b) {
                    f0Var.f17388o = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        f0Var.p();
                        aVar.c(null);
                    } else if (e instanceof n0.j1.b) {
                        String str4 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((n0.j1.b) e).a();
                        r1.d("CameraX", str4, e);
                        aVar.f(new p1(new x(3, str4)));
                    } else if (e instanceof p1) {
                        aVar.f(e);
                    } else {
                        aVar.f(new p1(e));
                    }
                }
            } else {
                synchronized (f0Var.b) {
                    f0Var.f17388o = a.INITIALIZING_ERROR;
                    if (cVarE.c()) {
                        f0Var.p();
                        aVar.c(null);
                    } else if (e instanceof n0.j1.b) {
                        String str5 = "Device reporting less cameras than anticipated. On real devices: Retrying initialization might resolve temporary camera errors. On emulators: Ensure virtual camera configuration matches supported camera features as reported by PackageManager#hasSystemFeature. Available cameras: " + ((n0.j1.b) e).a();
                        r1.d("CameraX", str5, e);
                        aVar.f(new p1(new x(3, str5)));
                    } else if (e instanceof p1) {
                        aVar.f(e);
                    } else {
                        aVar.f(new p1(e));
                    }
                }
            }
            n5.a.f();
        }
    }

    public static /* synthetic */ void b(f0 f0Var, y1.c.a aVar) {
        f0Var.f17380g.shutdown();
        if (f0Var.f17379f != null) {
            Executor executor = f0Var.f17377d;
            if (executor instanceof q) {
                ((q) executor).d();
            }
            f0Var.f17379f.quit();
        }
        aVar.c(null);
    }

    public static /* synthetic */ Object c(f0 f0Var, Context context, y1.c.a aVar) {
        f0Var.n(f0Var.f17377d, SystemClock.elapsedRealtime(), 1, context, aVar);
        return "CameraX initInternal";
    }

    public static /* synthetic */ Object d(final f0 f0Var, final y1.c.a aVar) {
        f0Var.f17387n.z();
        f0Var.f17375a.k().a(new Runnable() { // from class: g0.d0
            @Override // java.lang.Runnable
            public final void run() {
                f0.b(this.f17360a, aVar);
            }
        }, f0Var.f17377d);
        return "CameraX shutdownInternal";
    }

    public static void f(Integer num) {
        synchronized (f17373s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray<Integer> sparseArray = f17374t;
                int iIntValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g0.b k(Context context) {
        ComponentCallbacks2 componentCallbacks2B = p0.f.b(context);
        if (componentCallbacks2B instanceof g0.b) {
            return (g0.b) componentCallbacks2B;
        }
        try {
            Context contextA = p0.f.a(context);
            Bundle bundle = contextA.getPackageManager().getServiceInfo(new ComponentName(contextA, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (g0.b) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
            }
            r1.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (ClassNotFoundException e11) {
            e = e11;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (IllegalAccessException e12) {
            e = e12;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InstantiationException e13) {
            e = e13;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (NullPointerException e15) {
            e = e15;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        } catch (InvocationTargetException e16) {
            e = e16;
            r1.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    public static void m(Integer num) {
        synchronized (f17373s) {
            try {
                if (num == null) {
                    return;
                }
                x2.g.c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = f17374t;
                sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
                t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void t() {
        SparseArray<Integer> sparseArray = f17374t;
        if (sparseArray.size() == 0) {
            r1.i();
            return;
        }
        if (sparseArray.get(3) != null) {
            r1.j(3);
            return;
        }
        if (sparseArray.get(4) != null) {
            r1.j(4);
        } else if (sparseArray.get(5) != null) {
            r1.j(5);
        } else if (sparseArray.get(6) != null) {
            r1.j(6);
        }
    }

    public static void u(Context context, h3 h3Var, t.a<Context, h3> aVar) {
        if (h3Var != null) {
            r1.a("CameraX", "QuirkSettings from CameraXConfig: " + h3Var);
        } else {
            h3Var = aVar.apply(context);
            r1.a("CameraX", "QuirkSettings from app metadata: " + h3Var);
        }
        if (h3Var == null) {
            h3Var = i3.b;
            r1.a("CameraX", "QuirkSettings by default: " + h3Var);
        }
        i3.b().d(h3Var);
    }

    public n0.n0 g() {
        n0.n0 n0Var = this.f17380g;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public n0.d1 h() {
        return this.f17375a;
    }

    public y i() {
        y yVar = this.f17384k;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public int j() {
        return this.f17391r;
    }

    public me.x<Void> l() {
        return this.f17386m;
    }

    public final void n(final Executor executor, final long j10, final int i10, final Context context, final y1.c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: g0.b0
            @Override // java.lang.Runnable
            public final void run() {
                f0.a(this.f17342a, context, executor, i10, aVar, j10);
            }
        });
    }

    public final me.x<Void> o(final Context context) {
        me.x<Void> xVarA;
        synchronized (this.b) {
            x2.g.j(this.f17388o == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f17388o = a.INITIALIZING;
            xVarA = y1.c.a(new y1.c.InterfaceC0650c() { // from class: g0.a0
                @Override // y1.c.InterfaceC0650c
                public final Object a(y1.c.a aVar) {
                    return f0.c(this.f17328a, context, aVar);
                }
            });
        }
        return xVarA;
    }

    public final void p() {
        synchronized (this.b) {
            this.f17388o = a.INITIALIZED;
        }
    }

    public me.x<Void> q() {
        return r();
    }

    public final me.x<Void> r() {
        synchronized (this.b) {
            try {
                this.f17378e.removeCallbacksAndMessages("retry_token");
                int iOrdinal = this.f17388o.ordinal();
                if (iOrdinal == 0) {
                    this.f17388o = a.SHUTDOWN;
                    return r0.n.p(null);
                }
                if (iOrdinal == 1) {
                    throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                }
                if (iOrdinal == 2 || iOrdinal == 3) {
                    this.f17388o = a.SHUTDOWN;
                    f(this.f17390q);
                    this.f17389p = y1.c.a(new y1.c.InterfaceC0650c() { // from class: g0.c0
                        @Override // y1.c.InterfaceC0650c
                        public final Object a(y1.c.a aVar) {
                            return f0.d(this.f17350a, aVar);
                        }
                    });
                }
                return this.f17389p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void s(c2.b bVar) {
        if (n5.a.h()) {
            n5.a.j("CX:CameraProvider-RetryStatus", bVar != null ? bVar.m() : -1);
        }
    }

    public f0(Context context, g0.b bVar, t.a<Context, h3> aVar) {
        this.f17375a = new n0.d1();
        this.b = new Object();
        this.f17388o = a.UNINITIALIZED;
        this.f17389p = r0.n.p(null);
        if (bVar != null) {
            this.f17376c = bVar.getCameraXConfig();
        } else {
            g0.b bVarK = k(context);
            if (bVarK == null) {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
            this.f17376c = bVarK.getCameraXConfig();
        }
        u(context, this.f17376c.o0(), aVar);
        this.f17391r = this.f17376c.m0();
        Executor executorI0 = this.f17376c.i0(null);
        Handler handlerP0 = this.f17376c.p0(null);
        executorI0 = executorI0 == null ? new q() : executorI0;
        this.f17377d = executorI0;
        if (handlerP0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f17379f = handlerThread;
            handlerThread.start();
            this.f17378e = u2.i.a(handlerThread.getLooper());
        } else {
            this.f17379f = null;
            this.f17378e = handlerP0;
        }
        Integer num = (Integer) this.f17376c.h(g0.V, null);
        this.f17390q = num;
        m(num);
        this.f17385l = new c2.a(this.f17376c.l0()).a();
        this.f17387n = new n0.y0(executorI0);
        this.f17386m = o(context);
    }
}
