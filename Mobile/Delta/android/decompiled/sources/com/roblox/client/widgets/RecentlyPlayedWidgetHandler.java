package com.roblox.client.widgets;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.roblox.client.RobloxApplication;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.widgets.JNIWidgetDataProtocol;
import gt.h;
import gt.i;
import gt.o;
import iu.g1;
import iu.k;
import iu.l0;
import iu.p0;
import iu.q0;
import iu.z2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rg.a1;
import su.g;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001<B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0087@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020'8\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R#\u0010;\u001a\n 7*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "variant", "", "cacheWidgetVariant", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onStop", "widgetDataJson", "", "", "thumbnailURLs", "cacheRecentlyPlayedData", "(Ljava/lang/String;Ljava/util/Map;)V", "jsonString", "reformatData", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "", "isRecentlyPlayedWidgetEnabled", "maybeToggleWidget", "(Landroid/content/Context;ZLlt/b;)Ljava/lang/Object;", "getCachedWidgetVariant", "(Landroid/content/Context;)Ljava/lang/String;", "Ljk/c;", "recentlyPlayedWidgetFileProvider", "Ljk/c;", "TAG", "Ljava/lang/String;", "Lsu/a;", "cacheMutex", "Lsu/a;", "Liu/l0;", "ioDispatcher", "Liu/l0;", "getIoDispatcher$NativeShell_googleProdRelease", "()Liu/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Liu/l0;)V", "defaultDispatcher", "getDefaultDispatcher$NativeShell_googleProdRelease", "setDefaultDispatcher$NativeShell_googleProdRelease", "Landroid/content/ComponentName;", "componentName$delegate", "Lgt/h;", "getComponentName", "()Landroid/content/ComponentName;", "componentName", "kotlin.jvm.PlatformType", "recentlyPlayedRequestMessageId$delegate", "getRecentlyPlayedRequestMessageId", "()Ljava/lang/String;", "recentlyPlayedRequestMessageId", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecentlyPlayedWidgetHandler implements f {

    @NotNull
    private static final String TAG = "RecentlyPlayedWidgetHandler";

    @NotNull
    public static final RecentlyPlayedWidgetHandler INSTANCE = new RecentlyPlayedWidgetHandler();

    @NotNull
    private static final jk.c recentlyPlayedWidgetFileProvider = new jk.c();

    @NotNull
    private static final su.a cacheMutex = g.b(false, 1, null);

    @NotNull
    private static l0 ioDispatcher = g1.b();

    @NotNull
    private static l0 defaultDispatcher = g1.a();

    /* JADX INFO: renamed from: componentName$delegate, reason: from kotlin metadata */
    @NotNull
    private static final h componentName = i.b(new Function0() { // from class: jk.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecentlyPlayedWidgetHandler.componentName_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: recentlyPlayedRequestMessageId$delegate, reason: from kotlin metadata */
    @NotNull
    private static final h recentlyPlayedRequestMessageId = i.b(new Function0() { // from class: jk.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecentlyPlayedWidgetHandler.recentlyPlayedRequestMessageId_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        NO_WIDGET("no_widget"),
        V1("v1"),
        V2("v2");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ot.a f9575f = ot.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        a(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    @nt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$cacheRecentlyPlayedData$1", f = "RecentlyPlayedWidgetHandler.kt", l = {216, 119}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {
        public final /* synthetic */ Map<Long, String> A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9577t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9578u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9579v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9580w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9581x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f9582y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f9583z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Map<Long, String> map, lt.b<? super b> bVar) {
            super(2, bVar);
            this.f9583z = str;
            this.A = map;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.f9583z, this.A, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x008c A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001c, B:22:0x0084, B:24:0x008c, B:27:0x0092), top: B:34:0x001c }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0092 A[Catch: all -> 0x0020, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001c, B:22:0x0084, B:24:0x008c, B:27:0x0092), top: B:34:0x001c }] */
        @Override // nt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            su.a aVar;
            String str;
            Map<Long, String> map;
            int i10;
            su.a aVar2;
            Throwable th2;
            String str2;
            Context context;
            Object objE = mt.c.e();
            int i11 = this.f9582y;
            try {
                if (i11 == 0) {
                    o.b(obj);
                    aVar = RecentlyPlayedWidgetHandler.cacheMutex;
                    str = this.f9583z;
                    Map<Long, String> map2 = this.A;
                    this.f9577t = aVar;
                    this.f9578u = str;
                    this.f9579v = map2;
                    this.f9580w = 0;
                    this.f9582y = 1;
                    if (aVar.b(null, this) != objE) {
                        map = map2;
                        i10 = 0;
                    }
                    return objE;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.f9579v;
                    context = (Context) this.f9578u;
                    aVar2 = (su.a) this.f9577t;
                    try {
                        o.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            Unit unit = Unit.f22938a;
                            aVar2.f(null);
                            return unit;
                        }
                        RecentlyPlayedWidgetUpdateWorker.Companion aVar3 = RecentlyPlayedWidgetUpdateWorker.INSTANCE;
                        Intrinsics.checkNotNull(context);
                        aVar3.a(context, str2);
                        Unit unit2 = Unit.f22938a;
                        aVar2.f(null);
                        return Unit.f22938a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.f(null);
                        throw th2;
                    }
                }
                i10 = this.f9580w;
                map = (Map) this.f9579v;
                str = (String) this.f9578u;
                su.a aVar4 = (su.a) this.f9577t;
                o.b(obj);
                aVar = aVar4;
                Context contextF = RobloxApplication.f();
                String strReformatData = RecentlyPlayedWidgetHandler.INSTANCE.reformatData(str, map);
                jk.c cVar = RecentlyPlayedWidgetHandler.recentlyPlayedWidgetFileProvider;
                Intrinsics.checkNotNull(contextF);
                this.f9577t = aVar;
                this.f9578u = contextF;
                this.f9579v = strReformatData;
                this.f9580w = i10;
                this.f9581x = 0;
                this.f9582y = 2;
                Object objB = cVar.b(contextF, strReformatData, this);
                if (objB != objE) {
                    aVar2 = aVar;
                    obj = objB;
                    str2 = strReformatData;
                    context = contextF;
                    if (!((Boolean) obj).booleanValue()) {
                        Unit unit3 = Unit.f22938a;
                        aVar2.f(null);
                        return unit3;
                    }
                    RecentlyPlayedWidgetUpdateWorker.Companion aVar5 = RecentlyPlayedWidgetUpdateWorker.INSTANCE;
                    Intrinsics.checkNotNull(context);
                    aVar5.a(context, str2);
                    Unit unit4 = Unit.f22938a;
                    aVar2.f(null);
                    return Unit.f22938a;
                }
                return objE;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.f(null);
                throw th2;
            }
        }
    }

    @nt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler", f = "RecentlyPlayedWidgetHandler.kt", l = {180}, m = "maybeToggleWidget", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends nt.d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9584t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9585u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f9586v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9587w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9588x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f9589y;

        public c(lt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9589y = obj;
            this.A |= Integer.MIN_VALUE;
            return RecentlyPlayedWidgetHandler.this.maybeToggleWidget(null, false, this);
        }
    }

    @nt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$onCreate$1", f = "RecentlyPlayedWidgetHandler.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9591t;

        public d(lt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new d(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9591t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            Context contextF = RobloxApplication.f();
            int[] appWidgetIds = AppWidgetManager.getInstance(contextF).getAppWidgetIds(new ComponentName(contextF, (Class<?>) RecentlyPlayedWidgetProvider.class));
            Intrinsics.checkNotNull(appWidgetIds);
            if (!(appWidgetIds.length == 0)) {
                jk.b.d();
            }
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$onStop$1", f = "RecentlyPlayedWidgetHandler.kt", l = {77}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9592t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9593u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9594v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9595w;

        public e(lt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new e(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i10;
            Context context;
            Object objE = mt.c.e();
            int i11 = this.f9595w;
            if (i11 == 0) {
                o.b(obj);
                String recentlyPlayedWidgetVariant = JNIWidgetDataProtocol.f9932a.getRecentlyPlayedWidgetVariant();
                boolean z10 = !Intrinsics.c(recentlyPlayedWidgetVariant, a.NO_WIDGET.getValue());
                Context contextF = RobloxApplication.f();
                RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler = RecentlyPlayedWidgetHandler.INSTANCE;
                Intrinsics.checkNotNull(contextF);
                recentlyPlayedWidgetHandler.cacheWidgetVariant(contextF, recentlyPlayedWidgetVariant);
                this.f9592t = recentlyPlayedWidgetVariant;
                this.f9593u = contextF;
                this.f9594v = z10 ? 1 : 0;
                this.f9595w = 1;
                if (recentlyPlayedWidgetHandler.maybeToggleWidget(contextF, z10, this) == objE) {
                    return objE;
                }
                str = recentlyPlayedWidgetVariant;
                i10 = z10 ? 1 : 0;
                context = contextF;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f9594v;
                context = (Context) this.f9593u;
                str = (String) this.f9592t;
                o.b(obj);
            }
            if (i10 == 0) {
                return Unit.f22938a;
            }
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) RecentlyPlayedWidgetProvider.class));
            Intrinsics.checkNotNull(appWidgetIds);
            if (appWidgetIds.length == 0) {
                return Unit.f22938a;
            }
            JNIWidgetDataProtocol.f9932a.initializeProtocol();
            MessageBus messageBusF = MessageBus.f();
            Intrinsics.checkNotNullExpressionValue(messageBusF, "getInstance(...)");
            messageBusF.l(RecentlyPlayedWidgetHandler.INSTANCE.getRecentlyPlayedRequestMessageId(), Intrinsics.c(str, a.V2.getValue()) ? new JSONObject().put(Payload.TYPE, "GameIcon").put("format", "webp").put("width", Barcode.FORMAT_QR_CODE).put("height", Barcode.FORMAT_QR_CODE) : new JSONObject());
            return Unit.f22938a;
        }
    }

    private RecentlyPlayedWidgetHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cacheWidgetVariant(Context context, String variant) {
        SharedPreferences sharedPreferencesU = a1.U(context);
        if (Intrinsics.c(sharedPreferencesU.getString("recently_played_widget_variant", null), variant)) {
            return;
        }
        Intrinsics.checkNotNull(sharedPreferencesU);
        SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
        editorEdit.putString("recently_played_widget_variant", variant);
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentName componentName_delegate$lambda$0() {
        return new ComponentName(RobloxApplication.f(), (Class<?>) RecentlyPlayedWidgetProvider.class);
    }

    private final ComponentName getComponentName() {
        return (ComponentName) componentName.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRecentlyPlayedRequestMessageId() {
        return (String) recentlyPlayedRequestMessageId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String recentlyPlayedRequestMessageId_delegate$lambda$0() {
        JNIWidgetDataProtocol jNIWidgetDataProtocol = JNIWidgetDataProtocol.f9932a;
        return MessageBus.getMessageId(jNIWidgetDataProtocol.getProtocolName(), jNIWidgetDataProtocol.getRecentlyPlayedRequestMessage());
    }

    @Keep
    public final void cacheRecentlyPlayedData(@NotNull String widgetDataJson, @NotNull Map<Long, String> thumbnailURLs) {
        Intrinsics.checkNotNullParameter(widgetDataJson, "widgetDataJson");
        Intrinsics.checkNotNullParameter(thumbnailURLs, "thumbnailURLs");
        k.d(q0.a(z2.b(null, 1, null).plus(defaultDispatcher)), null, null, new b(widgetDataJson, thumbnailURLs, null), 3, null);
    }

    @NotNull
    public final String getCachedWidgetVariant(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = a1.U(context).getString("recently_played_widget_variant", null);
        return string == null ? a.V1.getValue() : string;
    }

    @NotNull
    public final l0 getDefaultDispatcher$NativeShell_googleProdRelease() {
        return defaultDispatcher;
    }

    @NotNull
    public final l0 getIoDispatcher$NativeShell_googleProdRelease() {
        return ioDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object maybeToggleWidget(@NotNull Context context, boolean z10, @NotNull lt.b<? super Unit> bVar) {
        c cVar;
        RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.A = i10 - Integer.MIN_VALUE;
                recentlyPlayedWidgetHandler = this;
            } else {
                recentlyPlayedWidgetHandler = this;
                cVar = recentlyPlayedWidgetHandler.new c(bVar);
            }
        } else {
            recentlyPlayedWidgetHandler = this;
            cVar = recentlyPlayedWidgetHandler.new c(bVar);
        }
        Object objA = cVar.f9589y;
        Object objE = mt.c.e();
        int i11 = cVar.A;
        if (i11 == 0) {
            o.b(objA);
            PackageManager packageManager = context.getPackageManager();
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(recentlyPlayedWidgetHandler.getComponentName());
            int i12 = z10 ? 1 : 2;
            if (componentEnabledSetting == i12) {
                return Unit.f22938a;
            }
            packageManager.setComponentEnabledSetting(recentlyPlayedWidgetHandler.getComponentName(), i12, 1);
            if (z10) {
                jk.b.b(ug.m.f32859a, "recents", jk.f.Enable, "", jk.g.Home, "");
            } else {
                jk.b.b(ug.m.f32859a, "recents", jk.f.Disable, "", jk.g.Home, "");
                jk.c cVar2 = new jk.c();
                cVar.f9584t = l.a(context);
                cVar.f9585u = l.a(packageManager);
                cVar.f9586v = z10;
                cVar.f9587w = componentEnabledSetting;
                cVar.f9588x = i12;
                cVar.A = 1;
                objA = cVar2.a(context, cVar);
                if (objA == objE) {
                    return objE;
                }
            }
            return Unit.f22938a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(objA);
        if (!((Boolean) objA).booleanValue()) {
            Log.e(TAG, "Recently Played Widget cache cleanup failed");
        }
        return Unit.f22938a;
    }

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (rh.h.a().W3()) {
            k.d(t.a(owner), ioDispatcher, null, new d(null), 2, null);
        }
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onDestroy(@NotNull s sVar) {
        super.onDestroy(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull s sVar) {
        super.onPause(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public void onStop(@NotNull s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        k.d(t.a(owner), ioDispatcher, null, new e(null), 2, null);
    }

    @NotNull
    public final String reformatData(@NotNull String jsonString, @NotNull Map<Long, String> thumbnailURLs) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Intrinsics.checkNotNullParameter(thumbnailURLs, "thumbnailURLs");
        JSONArray jSONArray = new JSONArray(jsonString);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String str = thumbnailURLs.get(Long.valueOf(jSONObject.optLong(PinShortcutHandler.EXTRA_PLACE_ID)));
            if (str != null) {
                jSONObject.put("thumbnailUrl", str);
            }
            jSONObject.remove("thumbnailPath");
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void setDefaultDispatcher$NativeShell_googleProdRelease(@NotNull l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<set-?>");
        defaultDispatcher = l0Var;
    }

    public final void setIoDispatcher$NativeShell_googleProdRelease(@NotNull l0 l0Var) {
        Intrinsics.checkNotNullParameter(l0Var, "<set-?>");
        ioDispatcher = l0Var;
    }
}
