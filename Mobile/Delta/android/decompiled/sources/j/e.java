package j;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f20878a = new c(new d());
    public static int b = -100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static u2.j f20879c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static u2.j f20880d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Boolean f20881e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f20882f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w1.b<WeakReference<e>> f20883g = new w1.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f20884h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f20885i = new Object();

    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static class c implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20886a = new Object();
        public final Queue<Runnable> b = new ArrayDeque();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Executor f20887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Runnable f20888d;

        public c(Executor executor) {
            this.f20887c = executor;
        }

        public static /* synthetic */ void b(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.c();
            }
        }

        public void c() {
            synchronized (this.f20886a) {
                try {
                    Runnable runnablePoll = this.b.poll();
                    this.f20888d = runnablePoll;
                    if (runnablePoll != null) {
                        this.f20887c.execute(runnablePoll);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f20886a) {
                try {
                    this.b.add(new Runnable() { // from class: j.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.c.b(this.f20889a, runnable);
                        }
                    });
                    if (this.f20888d == null) {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    public static void D(@NonNull e eVar) {
        synchronized (f20884h) {
            E(eVar);
        }
    }

    public static void E(@NonNull e eVar) {
        synchronized (f20884h) {
            try {
                Iterator<WeakReference<e>> it = f20883g.iterator();
                while (it.hasNext()) {
                    e eVar2 = it.next().get();
                    if (eVar2 == eVar || eVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void M(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (k().e()) {
                    String strB = k2.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void N(final Context context) {
        if (u(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f20882f) {
                    return;
                }
                f20878a.execute(new Runnable() { // from class: j.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.c(context);
                    }
                });
                return;
            }
            synchronized (f20885i) {
                try {
                    u2.j jVar = f20879c;
                    if (jVar == null) {
                        if (f20880d == null) {
                            f20880d = u2.j.b(k2.e.b(context));
                        }
                        if (f20880d.e()) {
                        } else {
                            f20879c = f20880d;
                        }
                    } else if (!jVar.equals(f20880d)) {
                        u2.j jVar2 = f20879c;
                        f20880d = jVar2;
                        k2.e.a(context, jVar2.g());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        M(context);
        f20882f = true;
    }

    public static void d(@NonNull e eVar) {
        synchronized (f20884h) {
            E(eVar);
            f20883g.add(new WeakReference<>(eVar));
        }
    }

    @NonNull
    public static e h(@NonNull Activity activity, j.c cVar) {
        return new g(activity, cVar);
    }

    @NonNull
    public static e i(@NonNull Dialog dialog, j.c cVar) {
        return new g(dialog, cVar);
    }

    @NonNull
    public static u2.j k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objO = o();
            if (objO != null) {
                return u2.j.h(b.a(objO));
            }
        } else {
            u2.j jVar = f20879c;
            if (jVar != null) {
                return jVar;
            }
        }
        return u2.j.d();
    }

    public static int m() {
        return b;
    }

    public static Object o() {
        Context contextL;
        Iterator<WeakReference<e>> it = f20883g.iterator();
        while (it.hasNext()) {
            e eVar = it.next().get();
            if (eVar != null && (contextL = eVar.l()) != null) {
                return contextL.getSystemService("locale");
            }
        }
        return null;
    }

    public static u2.j q() {
        return f20879c;
    }

    public static boolean u(Context context) {
        if (f20881e == null) {
            try {
                Bundle bundle = o.a(context).metaData;
                if (bundle != null) {
                    f20881e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f20881e = Boolean.FALSE;
            }
        }
        return f20881e.booleanValue();
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C();

    public abstract boolean F(int i10);

    public abstract void G(int i10);

    public abstract void H(View view);

    public abstract void I(View view, ViewGroup.LayoutParams layoutParams);

    public void J(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public void K(int i10) {
    }

    public abstract void L(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void f(Context context) {
    }

    @NonNull
    public Context g(@NonNull Context context) {
        f(context);
        return context;
    }

    public abstract <T extends View> T j(int i10);

    public Context l() {
        return null;
    }

    public int n() {
        return -100;
    }

    public abstract MenuInflater p();

    public abstract j.a r();

    public abstract void s();

    public abstract void t();

    public abstract void v(Configuration configuration);

    public abstract void w(Bundle bundle);

    public abstract void x();

    public abstract void y(Bundle bundle);

    public abstract void z();
}
