package p359pi;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.client.RobloxApplication;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6127t;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p578yj.C13198f;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import th.C11659h;

/* JADX INFO: renamed from: pi.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00152\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010%J\u001b\u0010'\u001a\u00020\u0006*\u00020\u00192\u0006\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u0006*\u00020\u00192\u0006\u0010&\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R(\u00103\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001d\u0010.\u0012\u0004\b2\u0010\u0003\u001a\u0004\b/\u00100\"\u0004\b1\u0010\r¨\u00064"}, m31665d2 = {"Lpi/c;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroidx/lifecycle/s;", "owner", "", "onStop", "(Landroidx/lifecycle/s;)V", "onStart", "", "active", "j", "(Z)V", "Landroid/content/Context;", "context", "i", "(Landroid/content/Context;)Z", "classicThemeEnabled", "l", "(Landroid/content/Context;Z)V", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "k", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Landroid/content/pm/PackageManager;", "pm", "Landroid/content/ComponentName;", "alias", "c", "(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", "h", "(Landroid/content/Context;)V", "", "setting", "manifestDefaultEnabled", "e", "(IZ)Z", "component", "f", "(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)V", "d", "Lku/p0;", "b", "Lku/p0;", "scope", "Z", "getAppInForeground$NativeShell_googleProdRelease", "()Z", "setAppInForeground$NativeShell_googleProdRelease", "getAppInForeground$NativeShell_googleProdRelease$annotations", "appInForeground", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10265c implements InterfaceC0954f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10265c f36879a = new C10265c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7906p0 scope = C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(C7864g1.m32644b()));

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static volatile boolean appInForeground;

    /* JADX INFO: renamed from: pi.c$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.launchericon.ClassicLauncherIconManager$onClassicThemeActiveChanged$1", m39664f = "ClassicLauncherIconManager.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36882t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f36883u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ boolean f36884v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, boolean z10, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36883u = context;
            this.f36884v = z10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f36883u, this.f36884v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f36882t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C10265c c10265c = C10265c.f36879a;
            Context context = this.f36883u;
            Intrinsics.checkNotNull(context);
            SharedPreferences sharedPreferencesM39431k = c10265c.m39431k(context);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesM39431k, "access$prefs(...)");
            boolean z10 = this.f36884v;
            SharedPreferences.Editor editorEdit = sharedPreferencesM39431k.edit();
            editorEdit.putBoolean("classic_active", z10);
            editorEdit.apply();
            Log.i("ClassicLauncherIcon", "Classic Theme active = " + this.f36884v + " (applies on next background)");
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: pi.c$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.launchericon.ClassicLauncherIconManager$onStart$1", m39664f = "ClassicLauncherIconManager.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36885t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f36886u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36886u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f36886u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f36885t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C10265c c10265c = C10265c.f36879a;
            Context context = this.f36886u;
            Intrinsics.checkNotNull(context);
            c10265c.m39428h(context);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: pi.c$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.launchericon.ClassicLauncherIconManager$onStop$1", m39664f = "ClassicLauncherIconManager.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36887t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f36888u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36888u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f36888u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f36887t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C10265c c10265c = C10265c.f36879a;
            Context context = this.f36888u;
            Intrinsics.checkNotNull(context);
            Context context2 = this.f36888u;
            Intrinsics.checkNotNull(context2);
            c10265c.m39432l(context, c10265c.m39429i(context2));
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m39424c(PackageManager pm2, ComponentName alias) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(pm2.getActivityInfo(alias, 512));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        return C7347n.m30466h(objM30460b);
    }

    /* JADX INFO: renamed from: d */
    public final void m39425d(PackageManager packageManager, ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, 2, 1);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m39426e(int setting, boolean manifestDefaultEnabled) {
        if (setting == 1) {
            return true;
        }
        if (setting != 2) {
            return manifestDefaultEnabled;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m39427f(PackageManager packageManager, ComponentName componentName) {
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    /* JADX INFO: renamed from: h */
    public final void m39428h(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, "com.roblox.client.startup.LauncherAliasMain");
        ComponentName componentName2 = new ComponentName(context, "com.roblox.client.startup.LauncherAliasClassic");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            boolean zM39426e = m39426e(packageManager.getComponentEnabledSetting(componentName), true);
            boolean zM39426e2 = m39426e(packageManager.getComponentEnabledSetting(componentName2), false);
            if (!zM39426e && !zM39426e2) {
                Log.w("ClassicLauncherIcon", "No launcher alias enabled; re-enabling default");
                Intrinsics.checkNotNull(packageManager);
                m39427f(packageManager, componentName);
            }
            C7347n.m30460b(Unit.f29331a);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            C7347n.m30460b(C7348o.m30469a(th2));
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m39429i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return !C6127t.m27095k() && C11659h.m43403a().mo43536T0() && m39431k(context).getBoolean("classic_active", false);
    }

    /* JADX INFO: renamed from: j */
    public final void m39430j(boolean active) {
        C7882k.m32780d(scope, null, null, new a(RobloxApplication.m14834f(), active, null), 3, null);
    }

    /* JADX INFO: renamed from: k */
    public final SharedPreferences m39431k(Context context) {
        return context.getSharedPreferences("classic_launcher_icon", 0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00a1  */
    /* JADX INFO: renamed from: l */
    public final void m39432l(@NotNull Context context, boolean classicThemeEnabled) {
        Object objM30460b;
        Object objM30460b2;
        boolean z10;
        Object objM30460b3;
        Intrinsics.checkNotNullParameter(context, "context");
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, "com.roblox.client.startup.LauncherAliasMain");
        ComponentName componentName2 = new ComponentName(context, "com.roblox.client.startup.LauncherAliasClassic");
        ComponentName componentName3 = new ComponentName(context, "com.roblox.client.startup.LauncherAliasHalloween2026");
        boolean z11 = false;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7352s.m30477a(Boolean.valueOf(m39426e(packageManager.getComponentEnabledSetting(componentName), true)), Boolean.valueOf(m39426e(packageManager.getComponentEnabledSetting(componentName2), false))));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) == null) {
            Pair pair = (Pair) objM30460b;
            boolean zBooleanValue = ((Boolean) pair.m31671a()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) pair.m31672b()).booleanValue();
            if (C11659h.m43403a().mo43518Q2()) {
                try {
                    objM30460b2 = C7347n.m30460b(Boolean.valueOf(m39426e(packageManager.getComponentEnabledSetting(componentName3), false)));
                } catch (Throwable th3) {
                    C7347n.Companion companion3 = C7347n.INSTANCE;
                    objM30460b2 = C7347n.m30460b(C7348o.m30469a(th3));
                }
                if (C7347n.m30463e(objM30460b2) != null) {
                    return;
                }
                if (((Boolean) objM30460b2).booleanValue()) {
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
            if (C11659h.m43403a().mo43518Q2()) {
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
            if (m39424c(packageManager, componentName2)) {
                if (C11659h.m43403a().mo43448G1()) {
                    C13198f.a aVarM48814a = C13198f.f46468a.m48814a(context);
                    C10274l.f36889a.m39462v(aVarM48814a);
                    if (aVarM48814a instanceof C13198f.a.Failed) {
                        Log.w("ClassicLauncherIcon", "Could not move shortcuts off the launcher alias; deferring the swap");
                        return;
                    }
                }
                try {
                    if (C11659h.m43403a().mo43518Q2()) {
                        if (!z11) {
                            if (classicThemeEnabled) {
                                m39427f(packageManager, componentName2);
                                m39425d(packageManager, componentName);
                            } else {
                                m39427f(packageManager, componentName);
                                m39425d(packageManager, componentName2);
                            }
                        }
                        if (z10) {
                            m39425d(packageManager, componentName3);
                        }
                    } else if (classicThemeEnabled) {
                        m39427f(packageManager, componentName2);
                        m39425d(packageManager, componentName);
                    } else {
                        m39427f(packageManager, componentName);
                        m39425d(packageManager, componentName2);
                    }
                    objM30460b3 = C7347n.m30460b(Unit.f29331a);
                } catch (Throwable th4) {
                    C7347n.Companion companion4 = C7347n.INSTANCE;
                    objM30460b3 = C7347n.m30460b(C7348o.m30469a(th4));
                }
                if (C7347n.m30466h(objM30460b3)) {
                    Log.i("ClassicLauncherIcon", "Launcher icon set to " + (classicThemeEnabled ? "classic" : "default"));
                    C10274l.f36889a.m39460t(classicThemeEnabled);
                }
                Throwable thM30463e = C7347n.m30463e(objM30460b3);
                if (thM30463e != null) {
                    Log.i("ClassicLauncherIcon", "Launcher-icon toggle failed; reporting and restoring default alias");
                    C10274l.f36889a.m39458r(classicThemeEnabled, thM30463e);
                    C10265c c10265c = f36879a;
                    try {
                        c10265c.m39427f(packageManager, componentName);
                        c10265c.m39425d(packageManager, componentName2);
                        if (C11659h.m43403a().mo43518Q2() && z10) {
                            c10265c.m39425d(packageManager, componentName3);
                        }
                        C7347n.m30460b(Unit.f29331a);
                    } catch (Throwable th5) {
                        C7347n.Companion companion5 = C7347n.INSTANCE;
                        C7347n.m30460b(C7348o.m30469a(th5));
                    }
                }
            }
        }
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onCreate(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onCreate(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onDestroy(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onDestroy(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onPause(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onPause(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onResume(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onResume(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onStart(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appInForeground = true;
        C7882k.m32780d(scope, null, null, new b(RobloxApplication.m14834f(), null), 3, null);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onStop(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appInForeground = false;
        C7882k.m32780d(scope, null, null, new c(RobloxApplication.m14834f(), null), 3, null);
    }
}
