package pi;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.roblox.client.RobloxApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import ku.g1;
import ku.p0;
import ku.q0;
import ku.z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R(\u00102\u001a\u00020#8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010,\u0012\u0004\b1\u0010\u0003\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00064"}, d2 = {"Lpi/m;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "h", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "", "name", "", "f", "(Ljava/lang/String;)V", "j", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "owner", "onStart", "(Landroidx/lifecycle/s;)V", "d", "(Landroid/content/Context;)V", "onStop", "i", "", "Lpi/m$a;", "e", "(Landroid/content/Context;)Ljava/util/List;", "aliases", "c", "(Ljava/lang/String;Ljava/util/List;)Lpi/m$a;", "Landroid/content/pm/PackageManager;", "pm", "alias", "", "b", "(Landroid/content/pm/PackageManager;Lpi/m$a;)Z", "enabled", "k", "(Landroid/content/pm/PackageManager;Lpi/m$a;Z)V", "Lku/p0;", "Lku/p0;", "scope", "Z", "getAppInForeground$NativeShell_googleProdRelease", "()Z", "setAppInForeground$NativeShell_googleProdRelease", "(Z)V", "getAppInForeground$NativeShell_googleProdRelease$annotations", "appInForeground", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements androidx.p000lifecycle.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f28640a = new m();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final p0 scope = q0.a(z2.b(null, 1, null).plus(g1.b()));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean appInForeground;

    /* JADX INFO: renamed from: pi.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lpi/m$a;", "", "Landroid/content/ComponentName;", "component", "", "manifestEnabled", "<init>", "(Landroid/content/ComponentName;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "b", "Z", "()Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Alias {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final ComponentName component;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final boolean manifestEnabled;

        public Alias(@NotNull ComponentName component, boolean z10) {
            Intrinsics.checkNotNullParameter(component, "component");
            this.component = component;
            this.manifestEnabled = z10;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ComponentName getComponent() {
            return this.component;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getManifestEnabled() {
            return this.manifestEnabled;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Alias)) {
                return false;
            }
            Alias alias = (Alias) other;
            return Intrinsics.c(this.component, alias.component) && this.manifestEnabled == alias.manifestEnabled;
        }

        public int hashCode() {
            return (this.component.hashCode() * 31) + Boolean.hashCode(this.manifestEnabled);
        }

        @NotNull
        public String toString() {
            return "Alias(component=" + this.component + ", manifestEnabled=" + this.manifestEnabled + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.launchericon.LauncherIconManager$onAppIconChanged$1", f = "LauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f28643t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f28644u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f28645v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f28644u = context;
            this.f28645v = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f28644u, this.f28645v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f28643t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            m mVar = m.f28640a;
            Context context = this.f28644u;
            Intrinsics.checkNotNull(context);
            mVar.j(context, this.f28645v);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.launchericon.LauncherIconManager$onStart$1", f = "LauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f28646t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f28647u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f28647u = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f28647u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f28646t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            m mVar = m.f28640a;
            Context context = this.f28647u;
            Intrinsics.checkNotNull(context);
            mVar.d(context);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.launchericon.LauncherIconManager$onStop$1", f = "LauncherIconManager.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f28648t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Context f28649u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f28649u = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f28649u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f28648t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            m mVar = m.f28640a;
            Context context = this.f28649u;
            Intrinsics.checkNotNull(context);
            Context context2 = this.f28649u;
            Intrinsics.checkNotNull(context2);
            String string = mVar.h(context2).getString("icon_name", "");
            mVar.i(context, string != null ? string : "");
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences h(Context context) {
        return context.getSharedPreferences("launcher_icon", 0);
    }

    public final boolean b(PackageManager pm2, Alias alias) {
        int componentEnabledSetting = pm2.getComponentEnabledSetting(alias.getComponent());
        if (componentEnabledSetting != 0) {
            return componentEnabledSetting == 1;
        }
        return alias.getManifestEnabled();
    }

    public final Alias c(String name, List<Alias> aliases) {
        Object obj = null;
        if (Intrinsics.c(name, "Main")) {
            return null;
        }
        if (Intrinsics.c(name, "Classic") && gk.s.k()) {
            return null;
        }
        String str = name.length() == 0 ? "com.roblox.client.startup.LauncherAliasMain" : "com.roblox.client.startup.LauncherAlias" + name;
        for (Object obj2 : aliases) {
            if (Intrinsics.c(((Alias) obj2).getComponent().getClassName(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Alias) obj;
    }

    public final void d(@NotNull Context context) {
        Object objB;
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            PackageManager packageManager = context.getPackageManager();
            List<Alias> listE = e(context);
            if (listE.isEmpty()) {
                Log.i("LauncherIconManager", "No launcher aliases declared; skipping recovery");
                return;
            }
            List<Alias> list = listE;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Alias alias : list) {
                    Intrinsics.checkNotNull(packageManager);
                    if (b(packageManager, alias)) {
                        Log.i("LauncherIconManager", "A launcher alias is already enabled; recovery not needed");
                        return;
                    }
                }
            }
            Iterator<T> it = listE.iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                next = it.next();
            } while (!Intrinsics.c(((Alias) next).getComponent().getClassName(), "com.roblox.client.startup.LauncherAliasMain"));
            Log.w("LauncherIconManager", "No launcher alias enabled; re-enabling default");
            Intrinsics.checkNotNull(packageManager);
            k(packageManager, (Alias) next, true);
            objB = jt.n.b(Unit.f22483a);
            if (jt.n.h(objB)) {
                v.f28650a.A();
            }
            Throwable thE = jt.n.e(objB);
            if (thE != null) {
                v.f28650a.z(thE);
            }
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
    }

    public final List<Alias> e(Context context) {
        ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 513).activities;
        int i10 = 0;
        if (activityInfoArr == null) {
            activityInfoArr = new ActivityInfo[0];
        }
        ArrayList arrayList = new ArrayList();
        for (ActivityInfo activityInfo : activityInfoArr) {
            String name = activityInfo.name;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            if (x.T(name, "com.roblox.client.startup.LauncherAlias", false, 2, null)) {
                arrayList.add(activityInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.q.u(arrayList, 10));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ActivityInfo activityInfo2 = (ActivityInfo) obj;
            arrayList2.add(new Alias(new ComponentName(context, activityInfo2.name), activityInfo2.enabled));
        }
        return arrayList2;
    }

    public final void f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ku.k.d(scope, null, null, new b(RobloxApplication.f(), name, null), 3, null);
    }

    public final void i(@NotNull Context context, @NotNull String name) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            if (appInForeground) {
                return;
            }
            List<Alias> listE = e(context);
            if (listE.isEmpty()) {
                return;
            }
            Alias aliasC = c(name, listE);
            if (aliasC == null) {
                Log.w("LauncherIconManager", "Attempted to set unsupported app icon '" + name + "'");
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listE) {
                Intrinsics.checkNotNull(packageManager);
                if (b(packageManager, (Alias) obj)) {
                    arrayList.add(obj);
                }
            }
            Log.i("LauncherIconManager", "Found " + arrayList.size() + " enabled launcher aliases before applying icon '" + name + "'");
            if (Intrinsics.c(CollectionsKt.B0(arrayList), aliasC)) {
                Log.i("LauncherIconManager", "Target launcher alias for app icon '" + name + "' is already enabled");
                return;
            }
            if (th.h.a().A1()) {
                yj.f.a aVarA = yj.f.f35895a.a(context);
                l.f28632a.v(aVarA);
                if (aVarA instanceof yj.f.a.Failed) {
                    Log.w("LauncherIconManager", "Could not move shortcuts off the launcher alias; deferring the swap");
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (!Intrinsics.c((Alias) obj2, aliasC)) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList.contains(aliasC)) {
                Intrinsics.checkNotNull(packageManager);
                k(packageManager, aliasC, true);
            }
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                Intrinsics.checkNotNull(packageManager);
                k(packageManager, (Alias) obj3, false);
            }
            objB = jt.n.b(Unit.f22483a);
            if (jt.n.h(objB)) {
                Log.i("LauncherIconManager", "Applied app icon '" + name + "'");
                v.f28650a.B(name);
            }
            Throwable thE = jt.n.e(objB);
            if (thE != null) {
                v.f28650a.y(name, thE);
            }
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
    }

    public final void j(@NotNull Context context, @NotNull String name) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            if (c(name, e(context)) == null) {
                Log.w("LauncherIconManager", "Requested unsupported app icon '" + name + "'");
                return;
            }
            SharedPreferences sharedPreferencesH = h(context);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesH, "prefs(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesH.edit();
            editorEdit.putString("icon_name", name);
            editorEdit.apply();
            objB = jt.n.b(Integer.valueOf(Log.i("LauncherIconManager", "Requested app icon '" + name + "' (applies on background)")));
            Throwable thE = jt.n.e(objB);
            if (thE != null) {
                v.f28650a.y(name, thE);
            }
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
    }

    public final void k(PackageManager pm2, Alias alias, boolean enabled) {
        pm2.setComponentEnabledSetting(alias.getComponent(), enabled ? 1 : 2, 1);
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
        ku.k.d(scope, null, null, new c(RobloxApplication.f(), null), 3, null);
    }

    @Override // androidx.p000lifecycle.f
    public void onStop(@NotNull androidx.p000lifecycle.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appInForeground = false;
        ku.k.d(scope, null, null, new d(RobloxApplication.f(), null), 3, null);
    }
}
