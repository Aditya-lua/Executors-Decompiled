package f7;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.github.luben.zstd.BuildConfig;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 )2\u00020\u0001:\u0003\u0007\u000e\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR=\u0010\u0011\u001a\"\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00020\u00020\nj\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00020\u0002`\f8\u0006¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0017\u001a\u00060\u0012R\u00020\u00008\u0006¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0016\u0010\b\u001a\u0004\b\u0013\u0010\u0015R!\u0010\u001d\u001a\u00060\u0018R\u00020\u00008\u0006¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010\t\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\b\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lf7/a;", "Lf7/d0;", "Ll6/w;", "strongImageLoaderReference", "<init>", "(Ll6/w;)V", BuildConfig.FLAVOR, "a", "()V", "shutdown", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Lcoil3/util/WeakReference;", "Ljava/lang/ref/WeakReference;", "c", "()Ljava/lang/ref/WeakReference;", "getImageLoader$annotations", "imageLoader", "Lf7/a$a;", "b", "Lf7/a$a;", "()Lf7/a$a;", "getActivityCallbacks$annotations", "activityCallbacks", "Lf7/a$c;", "Lf7/a$c;", "getComponentCallbacks", "()Lf7/a$c;", "getComponentCallbacks$annotations", "componentCallbacks", "Landroid/content/Context;", "d", "Landroid/content/Context;", "application", BuildConfig.FLAVOR, "value", "e", "Z", "getShutdown", "()Z", "getShutdown$annotations", "f", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final WeakReference<l6.w> imageLoader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C0292a activityCallbacks;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c componentCallbacks = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Context application;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean shutdown;

    /* JADX INFO: renamed from: f7.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Lf7/a$a;", "Lf7/h;", "Ll6/w;", "strongImageLoaderReference", "<init>", "(Lf7/a;Ll6/w;)V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;)V", "b", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", BuildConfig.FLAVOR, "D", "backgroundMaxSizePercent", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class C0292a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final double backgroundMaxSizePercent;

        public C0292a(l6.w wVar) {
            this.backgroundMaxSizePercent = l6.u.d(wVar.getOptions());
        }

        public final void a(@NotNull Context context) {
            if (this.backgroundMaxSizePercent == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            a aVar = a.this;
            l6.w wVar = aVar.c().get();
            if (wVar == null) {
                aVar.shutdown();
                return;
            }
            t6.d dVarE = wVar.e();
            if (dVarE != null) {
                dVarE.b((long) (this.backgroundMaxSizePercent * dVarE.c()));
                u logger = wVar.getOptions().getLogger();
                if (logger != null) {
                    u.a aVar2 = u.a.Verbose;
                    if (logger.a().compareTo(aVar2) <= 0) {
                        logger.b("AndroidSystemCallbacks", aVar2, "Restricting " + dVarE + "'s max size to " + dVarE.d() + " bytes.", null);
                    }
                }
            }
        }

        public final void b(@NotNull Context context) {
            if (this.backgroundMaxSizePercent == 1.0d) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Intrinsics.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            a aVar = a.this;
            l6.w wVar = aVar.c().get();
            if (wVar == null) {
                aVar.shutdown();
                return;
            }
            t6.d dVarE = wVar.e();
            if (dVarE != null) {
                dVarE.b(dVarE.c());
                u logger = wVar.getOptions().getLogger();
                if (logger != null) {
                    u.a aVar2 = u.a.Verbose;
                    if (logger.a().compareTo(aVar2) <= 0) {
                        logger.b("AndroidSystemCallbacks", aVar2, "Restoring " + dVarE + "'s max size to " + dVarE.d() + " bytes.", null);
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            b(activity);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf7/a$c;", "Landroid/content/ComponentCallbacks2;", "<init>", "(Lf7/a;)V", BuildConfig.FLAVOR, "level", BuildConfig.FLAVOR, "onTrimMemory", "(I)V", "onLowMemory", "()V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class c implements ComponentCallbacks2 {
        public c() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NotNull Configuration newConfig) {
            a aVar = a.this;
            synchronized (aVar) {
                if (aVar.c().get() == null) {
                    aVar.shutdown();
                }
                Unit unit = Unit.f21506a;
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            onTrimMemory(80);
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            t6.d dVarE;
            a aVar = a.this;
            synchronized (aVar) {
                try {
                    l6.w wVar = aVar.c().get();
                    if (wVar != null) {
                        u logger = wVar.getOptions().getLogger();
                        if (logger != null) {
                            u.a aVar2 = u.a.Verbose;
                            if (logger.a().compareTo(aVar2) <= 0) {
                                logger.b("AndroidSystemCallbacks", aVar2, "trimMemory, level=" + level, null);
                            }
                        }
                        if (level >= 40) {
                            t6.d dVarE2 = wVar.e();
                            if (dVarE2 != null) {
                                dVarE2.clear();
                            }
                        } else if (level >= 20) {
                            aVar.getActivityCallbacks().a(wVar.getOptions().getApplication());
                        } else if (level >= 10 && (dVarE = wVar.e()) != null) {
                            dVarE.f(dVarE.i() / ((long) 2));
                        }
                    } else {
                        aVar.shutdown();
                    }
                    Unit unit = Unit.f21506a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public a(@NotNull l6.w wVar) {
        this.imageLoader = new WeakReference<>(wVar);
        this.activityCallbacks = new C0292a(wVar);
    }

    @Override // f7.d0
    public synchronized void a() {
        try {
            l6.w wVar = c().get();
            if (wVar == null) {
                shutdown();
            } else if (this.application == null) {
                Context application = wVar.getOptions().getApplication();
                this.application = application;
                application.registerComponentCallbacks(this.componentCallbacks);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0292a getActivityCallbacks() {
        return this.activityCallbacks;
    }

    @NotNull
    public final WeakReference<l6.w> c() {
        return this.imageLoader;
    }

    @Override // f7.d0
    public synchronized void shutdown() {
        try {
            if (this.shutdown) {
                return;
            }
            this.shutdown = true;
            Context context = this.application;
            if (context != null) {
                this.activityCallbacks.b(context);
                context.unregisterComponentCallbacks(this.componentCallbacks);
            }
            this.imageLoader.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
