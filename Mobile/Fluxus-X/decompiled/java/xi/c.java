package xi;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import av.g1;
import av.p0;
import av.q0;
import av.z2;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.roblox.client.RobloxApplication;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u0006*\u00020\u00192\u0006\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u0006*\u00020\u00192\u0006\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R(\u00103\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010.\u0012\u0004\b2\u0010\u0003\u001a\u0004\b/\u00100\"\u0004\b1\u0010\r¨\u00064"}, d2 = {"Lxi/c;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", BuildConfig.FLAVOR, "onStop", "(Landroidx/lifecycle/s;)V", "onStart", BuildConfig.FLAVOR, "active", "j", "(Z)V", "Landroid/content/Context;", "context", "i", "(Landroid/content/Context;)Z", "classicThemeEnabled", "l", "(Landroid/content/Context;Z)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "k", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Landroid/content/pm/PackageManager;", "pm", "Landroid/content/ComponentName;", "alias", "c", "(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", "h", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "setting", "manifestDefaultEnabled", "e", "(IZ)Z", "component", "f", "(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)V", "d", "Lav/p0;", "b", "Lav/p0;", "scope", "Z", "getAppInForeground$NativeShell_googleProdRelease", "()Z", "setAppInForeground$NativeShell_googleProdRelease", "getAppInForeground$NativeShell_googleProdRelease$annotations", "appInForeground", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f36686a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(z2.b(null, 1, null).plus(g1.b()));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean appInForeground;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.launchericon.ClassicLauncherIconManager$onClassicThemeActiveChanged$1", f = "ClassicLauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36688t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f36689u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ boolean f36690v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, boolean z10, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f36689u = context;
            this.f36690v = z10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f36689u, this.f36690v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f36688t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            c cVar = c.f36686a;
            Context context = this.f36689u;
            Intrinsics.checkNotNull(context);
            SharedPreferences sharedPreferencesK = cVar.k(context);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesK, "access$prefs(...)");
            boolean z10 = this.f36690v;
            SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
            editorEdit.putBoolean("classic_active", z10);
            editorEdit.apply();
            Log.i("ClassicLauncherIcon", "Classic Theme active = " + this.f36690v + " (applies on next background)");
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.launchericon.ClassicLauncherIconManager$onStart$1", f = "ClassicLauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36691t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f36692u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f36692u = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new b(this.f36692u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f36691t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            c cVar = c.f36686a;
            Context context = this.f36692u;
            Intrinsics.checkNotNull(context);
            cVar.h(context);
            return Unit.f21506a;
        }
    }

    /* JADX INFO: renamed from: xi.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.launchericon.ClassicLauncherIconManager$onStop$1", f = "ClassicLauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C0755c extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36693t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f36694u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0755c(Context context, eu.b<? super C0755c> bVar) {
            super(2, bVar);
            this.f36694u = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new C0755c(this.f36694u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((C0755c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f36693t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            c cVar = c.f36686a;
            Context context = this.f36694u;
            Intrinsics.checkNotNull(context);
            Context context2 = this.f36694u;
            Intrinsics.checkNotNull(context2);
            cVar.l(context, cVar.i(context2));
            return Unit.f21506a;
        }
    }

    public final boolean c(PackageManager pm2, ComponentName alias) {
        Object objB;
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            objB = zt.n.b(pm2.getActivityInfo(alias, Barcode.FORMAT_UPC_A));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        return zt.n.h(objB);
    }

    public final void d(PackageManager packageManager, ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
    }

    public final boolean e(int setting, boolean manifestDefaultEnabled) {
        if (setting == 1) {
            return true;
        }
        if (setting != 2) {
            return manifestDefaultEnabled;
        }
        return false;
    }

    public final void f(PackageManager packageManager, ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    public final void h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, "com.roblox.client.startup.LauncherAliasMain");
        ComponentName componentName2 = new ComponentName(context, "com.roblox.client.startup.LauncherAliasClassic");
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            boolean zE = e(packageManager.getComponentEnabledSetting(componentName), true);
            boolean zE2 = e(packageManager.getComponentEnabledSetting(componentName2), false);
            if (!zE && !zE2) {
                Log.w("ClassicLauncherIcon", "No launcher alias enabled; re-enabling default");
                Intrinsics.checkNotNull(packageManager);
                f(packageManager, componentName);
            }
            zt.n.b(Unit.f21506a);
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            zt.n.b(zt.o.a(th2));
        }
    }

    public final boolean i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !ok.t.k() && bi.h.a().Y0() && k(context).getBoolean("classic_active", false);
    }

    public final void j(boolean active) {
        av.k.d(scope, null, null, new a(RobloxApplication.f(), active, null), 3, null);
    }

    public final SharedPreferences k(Context context) {
        return context.getSharedPreferences("classic_launcher_icon", 0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    public final void l(@NotNull Context context, boolean classicThemeEnabled) {
        Object objB;
        Object objB2;
        boolean z10;
        Object objB3;
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, "com.roblox.client.startup.LauncherAliasMain");
        ComponentName componentName2 = new ComponentName(context, "com.roblox.client.startup.LauncherAliasClassic");
        ComponentName componentName3 = new ComponentName(context, "com.roblox.client.startup.LauncherAliasHalloween2026");
        boolean z11 = false;
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            objB = zt.n.b(zt.s.a(Boolean.valueOf(e(packageManager.getComponentEnabledSetting(componentName), true)), Boolean.valueOf(e(packageManager.getComponentEnabledSetting(componentName2), false))));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        if (zt.n.e(objB) == null) {
            Pair pair = (Pair) objB;
            boolean zBooleanValue = ((Boolean) pair.a()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) pair.b()).booleanValue();
            if (bi.h.a().X2()) {
                try {
                    objB2 = zt.n.b(Boolean.valueOf(e(packageManager.getComponentEnabledSetting(componentName3), false)));
                } catch (Throwable th3) {
                    zt.n.Companion companion3 = zt.n.INSTANCE;
                    objB2 = zt.n.b(zt.o.a(th3));
                }
                if (zt.n.e(objB2) != null) {
                    return;
                }
                if (((Boolean) objB2).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (zBooleanValue == (!classicThemeEnabled) && zBooleanValue2 == classicThemeEnabled) {
                z11 = true;
            }
            if (bi.h.a().X2()) {
                if (z11 && !z10) {
                    return;
                }
            } else if (zBooleanValue == (!classicThemeEnabled) && zBooleanValue2 == classicThemeEnabled) {
                return;
            }
            if (appInForeground) {
                Log.i("ClassicLauncherIcon", "App returned to foreground before the swap; deferring to the next background");
                return;
            }
            Intrinsics.checkNotNull(packageManager);
            if (c(packageManager, componentName2)) {
                if (bi.h.a().J1()) {
                    gk.f.a aVarA = gk.f.f17761a.a(context);
                    l.f36695a.v(aVarA);
                    if (aVarA instanceof gk.f.a.Failed) {
                        Log.w("ClassicLauncherIcon", "Could not move shortcuts off the launcher alias; deferring the swap");
                        return;
                    }
                }
                try {
                    if (bi.h.a().X2()) {
                        if (!z11) {
                            if (classicThemeEnabled) {
                                f(packageManager, componentName2);
                                d(packageManager, componentName);
                            } else {
                                f(packageManager, componentName);
                                d(packageManager, componentName2);
                            }
                        }
                        if (z10) {
                            d(packageManager, componentName3);
                        }
                    } else if (classicThemeEnabled) {
                        f(packageManager, componentName2);
                        d(packageManager, componentName);
                    } else {
                        f(packageManager, componentName);
                        d(packageManager, componentName2);
                    }
                    objB3 = zt.n.b(Unit.f21506a);
                } catch (Throwable th4) {
                    zt.n.Companion companion4 = zt.n.INSTANCE;
                    objB3 = zt.n.b(zt.o.a(th4));
                }
                if (zt.n.h(objB3)) {
                    Log.i("ClassicLauncherIcon", "Launcher icon set to " + (classicThemeEnabled ? "classic" : "default"));
                    l.f36695a.t(classicThemeEnabled);
                }
                Throwable thE = zt.n.e(objB3);
                if (thE != null) {
                    Log.i("ClassicLauncherIcon", "Launcher-icon toggle failed; reporting and restoring default alias");
                    l.f36695a.r(classicThemeEnabled, thE);
                    c cVar = f36686a;
                    try {
                        cVar.f(packageManager, componentName);
                        cVar.d(packageManager, componentName2);
                        if (bi.h.a().X2() && z10) {
                            cVar.d(packageManager, componentName3);
                        }
                        zt.n.b(Unit.f21506a);
                    } catch (Throwable th5) {
                        zt.n.Companion companion5 = zt.n.INSTANCE;
                        zt.n.b(zt.o.a(th5));
                    }
                }
            }
        }
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onCreate(@NotNull androidx.p000lifecycle.s sVar) {
        super.onCreate(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onDestroy(@NotNull androidx.p000lifecycle.s sVar) {
        super.onDestroy(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull androidx.p000lifecycle.s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull androidx.p000lifecycle.s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public void onStart(@NotNull androidx.p000lifecycle.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appInForeground = true;
        av.k.d(scope, null, null, new b(RobloxApplication.f(), null), 3, null);
    }

    @Override // androidx.p000lifecycle.f
    public void onStop(@NotNull androidx.p000lifecycle.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appInForeground = false;
        av.k.d(scope, null, null, new C0755c(RobloxApplication.f(), null), 3, null);
    }
}
