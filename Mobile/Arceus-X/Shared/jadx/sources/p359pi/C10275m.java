package p359pi;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.client.RobloxApplication;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6127t;
import p229jt.C7347n;
import p229jt.C7348o;
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

/* JADX INFO: renamed from: pi.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u00013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001aH\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R(\u00102\u001a\u00020#8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001e\u0010,\u0012\u0004\b1\u0010\u0003\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00064"}, m31665d2 = {"Lpi/m;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "h", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "", "name", "", "f", "(Ljava/lang/String;)V", "j", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "owner", "onStart", "(Landroidx/lifecycle/s;)V", "d", "(Landroid/content/Context;)V", "onStop", "i", "", "Lpi/m$a;", "e", "(Landroid/content/Context;)Ljava/util/List;", "aliases", "c", "(Ljava/lang/String;Ljava/util/List;)Lpi/m$a;", "Landroid/content/pm/PackageManager;", "pm", "alias", "", "b", "(Landroid/content/pm/PackageManager;Lpi/m$a;)Z", "enabled", "k", "(Landroid/content/pm/PackageManager;Lpi/m$a;Z)V", "Lku/p0;", "Lku/p0;", "scope", "Z", "getAppInForeground$NativeShell_googleProdRelease", "()Z", "setAppInForeground$NativeShell_googleProdRelease", "(Z)V", "getAppInForeground$NativeShell_googleProdRelease$annotations", "appInForeground", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10275m implements InterfaceC0954f {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10275m f36898a = new C10275m();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final InterfaceC7906p0 scope = C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(C7864g1.m32644b()));

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static volatile boolean appInForeground;

    /* JADX INFO: renamed from: pi.m$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lpi/m$a;", "", "Landroid/content/ComponentName;", "component", "", "manifestEnabled", "<init>", "(Landroid/content/ComponentName;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "b", "Z", "()Z", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Alias {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
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
            return Intrinsics.m31980c(this.component, alias.component) && this.manifestEnabled == alias.manifestEnabled;
        }

        public int hashCode() {
            return (this.component.hashCode() * 31) + Boolean.hashCode(this.manifestEnabled);
        }

        @NotNull
        public String toString() {
            return "Alias(component=" + this.component + ", manifestEnabled=" + this.manifestEnabled + ")";
        }
    }

    /* JADX INFO: renamed from: pi.m$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.launchericon.LauncherIconManager$onAppIconChanged$1", m39664f = "LauncherIconManager.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36903t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f36904u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f36905v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36904u = context;
            this.f36905v = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f36904u, this.f36905v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f36903t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C10275m c10275m = C10275m.f36898a;
            Context context = this.f36904u;
            Intrinsics.checkNotNull(context);
            c10275m.m39471j(context, this.f36905v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: pi.m$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.launchericon.LauncherIconManager$onStart$1", m39664f = "LauncherIconManager.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36906t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f36907u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36907u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f36907u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f36906t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C10275m c10275m = C10275m.f36898a;
            Context context = this.f36907u;
            Intrinsics.checkNotNull(context);
            c10275m.m39467d(context);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: pi.m$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.launchericon.LauncherIconManager$onStop$1", m39664f = "LauncherIconManager.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f36908t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Context f36909u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f36909u = context;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f36909u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f36908t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C10275m c10275m = C10275m.f36898a;
            Context context = this.f36909u;
            Intrinsics.checkNotNull(context);
            Context context2 = this.f36909u;
            Intrinsics.checkNotNull(context2);
            String string = c10275m.m39464h(context2).getString("icon_name", "");
            c10275m.m39470i(context, string != null ? string : "");
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public final SharedPreferences m39464h(Context context) {
        return context.getSharedPreferences("launcher_icon", 0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m39465b(PackageManager pm2, Alias alias) {
        int componentEnabledSetting = pm2.getComponentEnabledSetting(alias.getComponent());
        if (componentEnabledSetting != 0) {
            return componentEnabledSetting == 1;
        }
        return alias.getManifestEnabled();
    }

    /* JADX INFO: renamed from: c */
    public final Alias m39466c(String name, List<Alias> aliases) {
        Object obj = null;
        if (Intrinsics.m31980c(name, "Main")) {
            return null;
        }
        if (Intrinsics.m31980c(name, "Classic") && C6127t.m27095k()) {
            return null;
        }
        String str = name.length() == 0 ? "com.roblox.client.startup.LauncherAliasMain" : "com.roblox.client.startup.LauncherAlias" + name;
        for (Object obj2 : aliases) {
            if (Intrinsics.m31980c(((Alias) obj2).getComponent().getClassName(), str)) {
                obj = obj2;
                break;
            }
        }
        return (Alias) obj;
    }

    /* JADX INFO: renamed from: d */
    public final void m39467d(@NotNull Context context) {
        Object objM30460b;
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            PackageManager packageManager = context.getPackageManager();
            List<Alias> listM39468e = m39468e(context);
            if (listM39468e.isEmpty()) {
                Log.i("LauncherIconManager", "No launcher aliases declared; skipping recovery");
                return;
            }
            List<Alias> list = listM39468e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Alias alias : list) {
                    Intrinsics.checkNotNull(packageManager);
                    if (m39465b(packageManager, alias)) {
                        Log.i("LauncherIconManager", "A launcher alias is already enabled; recovery not needed");
                        return;
                    }
                }
            }
            Iterator<T> it = listM39468e.iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                next = it.next();
            } while (!Intrinsics.m31980c(((Alias) next).getComponent().getClassName(), "com.roblox.client.startup.LauncherAliasMain"));
            Log.w("LauncherIconManager", "No launcher alias enabled; re-enabling default");
            Intrinsics.checkNotNull(packageManager);
            m39472k(packageManager, (Alias) next, true);
            objM30460b = C7347n.m30460b(Unit.f29331a);
            if (C7347n.m30466h(objM30460b)) {
                C10284v.f36910a.m39491A();
            }
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                C10284v.f36910a.m39504z(thM30463e);
            }
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
    }

    /* JADX INFO: renamed from: e */
    public final List<Alias> m39468e(Context context) {
        ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), InputDeviceCompat.SOURCE_DPAD).activities;
        int i10 = 0;
        if (activityInfoArr == null) {
            activityInfoArr = new ActivityInfo[0];
        }
        ArrayList arrayList = new ArrayList();
        for (ActivityInfo activityInfo : activityInfoArr) {
            String name = activityInfo.name;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            if (C7797x.m32309T(name, "com.roblox.client.startup.LauncherAlias", false, 2, null)) {
                arrayList.add(activityInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7701q.m31905u(arrayList, 10));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ActivityInfo activityInfo2 = (ActivityInfo) obj;
            arrayList2.add(new Alias(new ComponentName(context, activityInfo2.name), activityInfo2.enabled));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    public final void m39469f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        C7882k.m32780d(scope, null, null, new b(RobloxApplication.m14834f(), name, null), 3, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m39470i(@NotNull Context context, @NotNull String name) {
        Object objM30460b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            if (appInForeground) {
                return;
            }
            List<Alias> listM39468e = m39468e(context);
            if (listM39468e.isEmpty()) {
                return;
            }
            Alias aliasM39466c = m39466c(name, listM39468e);
            if (aliasM39466c == null) {
                Log.w("LauncherIconManager", "Attempted to set unsupported app icon '" + name + "'");
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM39468e) {
                Intrinsics.checkNotNull(packageManager);
                if (m39465b(packageManager, (Alias) obj)) {
                    arrayList.add(obj);
                }
            }
            Log.i("LauncherIconManager", "Found " + arrayList.size() + " enabled launcher aliases before applying icon '" + name + "'");
            if (Intrinsics.m31980c(CollectionsKt.m31676B0(arrayList), aliasM39466c)) {
                Log.i("LauncherIconManager", "Target launcher alias for app icon '" + name + "' is already enabled");
                return;
            }
            if (C11659h.m43403a().mo43448G1()) {
                C13198f.a aVarM48814a = C13198f.f46468a.m48814a(context);
                C10274l.f36889a.m39462v(aVarM48814a);
                if (aVarM48814a instanceof C13198f.a.Failed) {
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
                if (!Intrinsics.m31980c((Alias) obj2, aliasM39466c)) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList.contains(aliasM39466c)) {
                Intrinsics.checkNotNull(packageManager);
                m39472k(packageManager, aliasM39466c, true);
            }
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                Intrinsics.checkNotNull(packageManager);
                m39472k(packageManager, (Alias) obj3, false);
            }
            objM30460b = C7347n.m30460b(Unit.f29331a);
            if (C7347n.m30466h(objM30460b)) {
                Log.i("LauncherIconManager", "Applied app icon '" + name + "'");
                C10284v.f36910a.m39492B(name);
            }
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                C10284v.f36910a.m39503y(name, thM30463e);
            }
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m39471j(@NotNull Context context, @NotNull String name) {
        Object objM30460b;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            if (m39466c(name, m39468e(context)) == null) {
                Log.w("LauncherIconManager", "Requested unsupported app icon '" + name + "'");
                return;
            }
            SharedPreferences sharedPreferencesM39464h = m39464h(context);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesM39464h, "prefs(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesM39464h.edit();
            editorEdit.putString("icon_name", name);
            editorEdit.apply();
            objM30460b = C7347n.m30460b(Integer.valueOf(Log.i("LauncherIconManager", "Requested app icon '" + name + "' (applies on background)")));
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                C10284v.f36910a.m39503y(name, thM30463e);
            }
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m39472k(PackageManager pm2, Alias alias, boolean enabled) {
        pm2.setComponentEnabledSetting(alias.getComponent(), enabled ? 1 : 2, 1);
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
        C7882k.m32780d(scope, null, null, new c(RobloxApplication.m14834f(), null), 3, null);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onStop(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        appInForeground = false;
        C7882k.m32780d(scope, null, null, new d(RobloxApplication.m14834f(), null), 3, null);
    }
}
