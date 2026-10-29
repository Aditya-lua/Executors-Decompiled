package p096e7;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p239k6.C7481u;
import p239k6.C7483w;
import p430s6.InterfaceC11178d;

/* JADX INFO: renamed from: e7.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 )2\u00020\u0001:\u0003\u0007\u000e\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR=\u0010\u0011\u001a\"\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00020\u00020\nj\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00020\u0002`\f8\u0006¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0017\u001a\u00060\u0012R\u00020\u00008\u0006¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0013\u0010\u0015R!\u0010\u001d\u001a\u00060\u0018R\u00020\u00008\u0006¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010\t\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\b\u001a\u0004\b&\u0010'¨\u0006*"}, m31665d2 = {"Le7/a;", "Le7/d0;", "Lk6/w;", "strongImageLoaderReference", "<init>", "(Lk6/w;)V", "", "a", "()V", "shutdown", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Lcoil3/util/WeakReference;", "Ljava/lang/ref/WeakReference;", "c", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "imageLoader", "Le7/a$a;", "b", "Le7/a$a;", "()Le7/a$a;", "getActivityCallbacks$annotations", "activityCallbacks", "Le7/a$c;", "Le7/a$c;", "getComponentCallbacks", "()Le7/a$c;", "getComponentCallbacks$annotations", "componentCallbacks", "Landroid/content/Context;", "d", "Landroid/content/Context;", "application", "", "value", "e", "Z", "getShutdown", "()Z", "getShutdown$annotations", "f", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4846a implements InterfaceC4853d0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<C7483w> imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final a activityCallbacks;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final c componentCallbacks = new c();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Context application;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean shutdown;

    /* JADX INFO: renamed from: e7.a$a */
    @Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Le7/a$a;", "Le7/h;", "Lk6/w;", "strongImageLoaderReference", "<init>", "(Le7/a;Lk6/w;)V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "b", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", "", "D", "backgroundMaxSizePercent", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class a implements InterfaceC4860h {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final double backgroundMaxSizePercent;

        public a(C7483w c7483w) {
            this.backgroundMaxSizePercent = C7481u.m31085d(c7483w.getOptions());
        }

        /* JADX INFO: renamed from: a */
        public final void m23407a(@NotNull Context context) {
            if (this.backgroundMaxSizePercent == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.m31981d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            C4846a c4846a = C4846a.this;
            C7483w c7483w = c4846a.m23406c().get();
            if (c7483w == null) {
                c4846a.shutdown();
                return;
            }
            InterfaceC11178d interfaceC11178dMo31069e = c7483w.mo31069e();
            if (interfaceC11178dMo31069e != null) {
                interfaceC11178dMo31069e.mo42095b((long) (this.backgroundMaxSizePercent * interfaceC11178dMo31069e.mo42096d()));
                InterfaceC4875u logger = c7483w.getOptions().getLogger();
                if (logger != null) {
                    InterfaceC4875u.a aVar = InterfaceC4875u.a.Verbose;
                    if (logger.m23484a().compareTo(aVar) <= 0) {
                        logger.m23485b("AndroidSystemCallbacks", aVar, "Restricting " + interfaceC11178dMo31069e + "'s max size to " + interfaceC11178dMo31069e.mo42097e() + " bytes.", null);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m23408b(@NotNull Context context) {
            if (this.backgroundMaxSizePercent == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.m31981d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            C4846a c4846a = C4846a.this;
            C7483w c7483w = c4846a.m23406c().get();
            if (c7483w == null) {
                c4846a.shutdown();
                return;
            }
            InterfaceC11178d interfaceC11178dMo31069e = c7483w.mo31069e();
            if (interfaceC11178dMo31069e != null) {
                interfaceC11178dMo31069e.mo42095b(interfaceC11178dMo31069e.mo42096d());
                InterfaceC4875u logger = c7483w.getOptions().getLogger();
                if (logger != null) {
                    InterfaceC4875u.a aVar = InterfaceC4875u.a.Verbose;
                    if (logger.m23484a().compareTo(aVar) <= 0) {
                        logger.m23485b("AndroidSystemCallbacks", aVar, "Restoring " + interfaceC11178dMo31069e + "'s max size to " + interfaceC11178dMo31069e.mo42097e() + " bytes.", null);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            m23408b(activity);
        }
    }

    /* JADX INFO: renamed from: e7.a$c */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Le7/a$c;", "Landroid/content/ComponentCallbacks2;", "<init>", "(Le7/a;)V", "", "level", "", "onTrimMemory", "(I)V", "onLowMemory", "()V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public final class c implements ComponentCallbacks2 {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NotNull Configuration newConfig) {
            C4846a c4846a = C4846a.this;
            synchronized (c4846a) {
                if (c4846a.m23406c().get() == null) {
                    c4846a.shutdown();
                }
                Unit unit = Unit.f29331a;
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            InterfaceC11178d interfaceC11178dMo31069e;
            C4846a c4846a = C4846a.this;
            synchronized (c4846a) {
                try {
                    C7483w c7483w = c4846a.m23406c().get();
                    if (c7483w != null) {
                        InterfaceC4875u logger = c7483w.getOptions().getLogger();
                        if (logger != null) {
                            InterfaceC4875u.a aVar = InterfaceC4875u.a.Verbose;
                            if (logger.m23484a().compareTo(aVar) <= 0) {
                                logger.m23485b("AndroidSystemCallbacks", aVar, "trimMemory, level=" + level, null);
                            }
                        }
                        if (level >= 40) {
                            InterfaceC11178d interfaceC11178dMo31069e2 = c7483w.mo31069e();
                            if (interfaceC11178dMo31069e2 != null) {
                                interfaceC11178dMo31069e2.clear();
                            }
                        } else if (level >= 20) {
                            c4846a.getActivityCallbacks().m23407a(c7483w.getOptions().getApplication());
                        } else if (level >= 10 && (interfaceC11178dMo31069e = c7483w.mo31069e()) != null) {
                            interfaceC11178dMo31069e.mo42098g(interfaceC11178dMo31069e.mo42100i() / ((long) 2));
                        }
                    } else {
                        c4846a.shutdown();
                    }
                    Unit unit = Unit.f29331a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C4846a(@NotNull C7483w c7483w) {
        this.imageLoader = new WeakReference<>(c7483w);
        this.activityCallbacks = new a(c7483w);
    }

    @Override // p096e7.InterfaceC4853d0
    /* JADX INFO: renamed from: a */
    public synchronized void mo23404a() {
        try {
            C7483w c7483w = m23406c().get();
            if (c7483w == null) {
                shutdown();
            } else if (this.application == null) {
                Context application = c7483w.getOptions().getApplication();
                this.application = application;
                application.registerComponentCallbacks(this.componentCallbacks);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getActivityCallbacks() {
        return this.activityCallbacks;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final WeakReference<C7483w> m23406c() {
        return this.imageLoader;
    }

    @Override // p096e7.InterfaceC4853d0
    public synchronized void shutdown() {
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Context context = this.application;
            if (context != null) {
                this.activityCallbacks.m23408b(context);
                context.unregisterComponentCallbacks(this.componentCallbacks);
            }
            this.imageLoader.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
