package p203j;

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
import p235k2.C7413e;
import p456u2.C11781j;
import p504w1.C12278b;

/* JADX INFO: renamed from: j.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6995e {

    /* JADX INFO: renamed from: a */
    public static c f27274a = new c(new d());

    /* JADX INFO: renamed from: b */
    public static int f27275b = -100;

    /* JADX INFO: renamed from: c */
    public static C11781j f27276c = null;

    /* JADX INFO: renamed from: d */
    public static C11781j f27277d = null;

    /* JADX INFO: renamed from: e */
    public static Boolean f27278e = null;

    /* JADX INFO: renamed from: f */
    public static boolean f27279f = false;

    /* JADX INFO: renamed from: g */
    public static final C12278b<WeakReference<AbstractC6995e>> f27280g = new C12278b<>();

    /* JADX INFO: renamed from: h */
    public static final Object f27281h = new Object();

    /* JADX INFO: renamed from: i */
    public static final Object f27282i = new Object();

    /* JADX INFO: renamed from: j.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static LocaleList m29499a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: j.e$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static LocaleList m29500a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* JADX INFO: renamed from: b */
        public static void m29501b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: j.e$c */
    public static class c implements Executor {

        /* JADX INFO: renamed from: a */
        public final Object f27283a = new Object();

        /* JADX INFO: renamed from: b */
        public final Queue<Runnable> f27284b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        public final Executor f27285c;

        /* JADX INFO: renamed from: d */
        public Runnable f27286d;

        public c(Executor executor) {
            this.f27285c = executor;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m29502b(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.m29503c();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m29503c() {
            synchronized (this.f27283a) {
                try {
                    Runnable runnablePoll = this.f27284b.poll();
                    this.f27286d = runnablePoll;
                    if (runnablePoll != null) {
                        this.f27285c.execute(runnablePoll);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f27283a) {
                try {
                    this.f27284b.add(new Runnable() { // from class: j.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC6995e.c.m29502b(this.f27287a, runnable);
                        }
                    });
                    if (this.f27286d == null) {
                        m29503c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j.e$d */
    public static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m29461D(@NonNull AbstractC6995e abstractC6995e) {
        synchronized (f27281h) {
            m29462E(abstractC6995e);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m29462E(@NonNull AbstractC6995e abstractC6995e) {
        synchronized (f27281h) {
            try {
                Iterator<WeakReference<AbstractC6995e>> it = f27280g.iterator();
                while (it.hasNext()) {
                    AbstractC6995e abstractC6995e2 = it.next().get();
                    if (abstractC6995e2 == abstractC6995e || abstractC6995e2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m29463M(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m29469k().m44073e()) {
                    String strM30718b = C7413e.m30718b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.m29501b(systemService, a.m29499a(strM30718b));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m29464N(final Context context) {
        if (m29473u(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f27279f) {
                    return;
                }
                f27274a.execute(new Runnable() { // from class: j.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC6995e.m29465c(context);
                    }
                });
                return;
            }
            synchronized (f27282i) {
                try {
                    C11781j c11781j = f27276c;
                    if (c11781j == null) {
                        if (f27277d == null) {
                            f27277d = C11781j.m44069b(C7413e.m30718b(context));
                        }
                        if (f27277d.m44073e()) {
                        } else {
                            f27276c = f27277d;
                        }
                    } else if (!c11781j.equals(f27277d)) {
                        C11781j c11781j2 = f27276c;
                        f27277d = c11781j2;
                        C7413e.m30717a(context, c11781j2.m44075g());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m29465c(Context context) {
        m29463M(context);
        f27279f = true;
    }

    /* JADX INFO: renamed from: d */
    public static void m29466d(@NonNull AbstractC6995e abstractC6995e) {
        synchronized (f27281h) {
            m29462E(abstractC6995e);
            f27280g.add(new WeakReference<>(abstractC6995e));
        }
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static AbstractC6995e m29467h(@NonNull Activity activity, InterfaceC6993c interfaceC6993c) {
        return new LayoutInflaterFactory2C6997g(activity, interfaceC6993c);
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static AbstractC6995e m29468i(@NonNull Dialog dialog, InterfaceC6993c interfaceC6993c) {
        return new LayoutInflaterFactory2C6997g(dialog, interfaceC6993c);
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static C11781j m29469k() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objM29471o = m29471o();
            if (objM29471o != null) {
                return C11781j.m44071h(b.m29500a(objM29471o));
            }
        } else {
            C11781j c11781j = f27276c;
            if (c11781j != null) {
                return c11781j;
            }
        }
        return C11781j.m44070d();
    }

    /* JADX INFO: renamed from: m */
    public static int m29470m() {
        return f27275b;
    }

    /* JADX INFO: renamed from: o */
    public static Object m29471o() {
        Context contextMo29488l;
        Iterator<WeakReference<AbstractC6995e>> it = f27280g.iterator();
        while (it.hasNext()) {
            AbstractC6995e abstractC6995e = it.next().get();
            if (abstractC6995e != null && (contextMo29488l = abstractC6995e.mo29488l()) != null) {
                return contextMo29488l.getSystemService("locale");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static C11781j m29472q() {
        return f27276c;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m29473u(Context context) {
        if (f27278e == null) {
            try {
                Bundle bundle = ServiceC7005o.m29624a(context).metaData;
                if (bundle != null) {
                    f27278e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f27278e = Boolean.FALSE;
            }
        }
        return f27278e.booleanValue();
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo29474A(Bundle bundle);

    /* JADX INFO: renamed from: B */
    public abstract void mo29475B();

    /* JADX INFO: renamed from: C */
    public abstract void mo29476C();

    /* JADX INFO: renamed from: F */
    public abstract boolean mo29477F(int i10);

    /* JADX INFO: renamed from: G */
    public abstract void mo29478G(int i10);

    /* JADX INFO: renamed from: H */
    public abstract void mo29479H(View view);

    /* JADX INFO: renamed from: I */
    public abstract void mo29480I(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: J */
    public void mo29481J(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* JADX INFO: renamed from: K */
    public void mo29482K(int i10) {
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo29483L(CharSequence charSequence);

    /* JADX INFO: renamed from: e */
    public abstract void mo29484e(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* JADX INFO: renamed from: f */
    public void m29485f(Context context) {
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public Context mo29486g(@NonNull Context context) {
        m29485f(context);
        return context;
    }

    /* JADX INFO: renamed from: j */
    public abstract <T extends View> T mo29487j(int i10);

    /* JADX INFO: renamed from: l */
    public Context mo29488l() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public int mo29489n() {
        return -100;
    }

    /* JADX INFO: renamed from: p */
    public abstract MenuInflater mo29490p();

    /* JADX INFO: renamed from: r */
    public abstract AbstractC6991a mo29491r();

    /* JADX INFO: renamed from: s */
    public abstract void mo29492s();

    /* JADX INFO: renamed from: t */
    public abstract void mo29493t();

    /* JADX INFO: renamed from: v */
    public abstract void mo29494v(Configuration configuration);

    /* JADX INFO: renamed from: w */
    public abstract void mo29495w(Bundle bundle);

    /* JADX INFO: renamed from: x */
    public abstract void mo29496x();

    /* JADX INFO: renamed from: y */
    public abstract void mo29497y(Bundle bundle);

    /* JADX INFO: renamed from: z */
    public abstract void mo29498z();
}
