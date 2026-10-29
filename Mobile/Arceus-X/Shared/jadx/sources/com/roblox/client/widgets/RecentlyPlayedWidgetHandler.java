package com.roblox.client.widgets;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.RobloxApplication;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import com.roblox.universalapp.messagebus.MessageBus;
import com.roblox.universalapp.widgets.JNIWidgetDataProtocol;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lk.C8155b;
import lk.C8156c;
import lk.EnumC8159f;
import lk.EnumC8160g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;
import sg.C11295a1;
import th.C11659h;
import vg.C12183m;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001<B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u0011H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0087@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010(\u001a\u00020'8\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020'8\u0000@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R#\u0010;\u001a\n 7*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:¨\u0006="}, m31665d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "variant", "", "cacheWidgetVariant", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onStop", "widgetDataJson", "", "", "thumbnailURLs", "cacheRecentlyPlayedData", "(Ljava/lang/String;Ljava/util/Map;)V", "jsonString", "reformatData", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "", "isRecentlyPlayedWidgetEnabled", "maybeToggleWidget", "(Landroid/content/Context;ZLnt/b;)Ljava/lang/Object;", "getCachedWidgetVariant", "(Landroid/content/Context;)Ljava/lang/String;", "Llk/c;", "recentlyPlayedWidgetFileProvider", "Llk/c;", "TAG", "Ljava/lang/String;", "Luu/a;", "cacheMutex", "Luu/a;", "Lku/l0;", "ioDispatcher", "Lku/l0;", "getIoDispatcher$NativeShell_googleProdRelease", "()Lku/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Lku/l0;)V", "defaultDispatcher", "getDefaultDispatcher$NativeShell_googleProdRelease", "setDefaultDispatcher$NativeShell_googleProdRelease", "Landroid/content/ComponentName;", "componentName$delegate", "Ljt/h;", "getComponentName", "()Landroid/content/ComponentName;", "componentName", "kotlin.jvm.PlatformType", "recentlyPlayedRequestMessageId$delegate", "getRecentlyPlayedRequestMessageId", "()Ljava/lang/String;", "recentlyPlayedRequestMessageId", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RecentlyPlayedWidgetHandler implements InterfaceC0954f {

    @NotNull
    private static final String TAG = "RecentlyPlayedWidgetHandler";

    @NotNull
    public static final RecentlyPlayedWidgetHandler INSTANCE = new RecentlyPlayedWidgetHandler();

    @NotNull
    private static final C8156c recentlyPlayedWidgetFileProvider = new C8156c();

    @NotNull
    private static final InterfaceC11970a cacheMutex = C11976g.m44697b(false, 1, null);

    @NotNull
    private static AbstractC7888l0 ioDispatcher = C7864g1.m32644b();

    @NotNull
    private static AbstractC7888l0 defaultDispatcher = C7864g1.m32643a();

    /* JADX INFO: renamed from: componentName$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC7341h componentName = C7342i.m30456b(new Function0() { // from class: lk.d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecentlyPlayedWidgetHandler.componentName_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: recentlyPlayedRequestMessageId$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC7341h recentlyPlayedRequestMessageId = C7342i.m30456b(new Function0() { // from class: lk.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RecentlyPlayedWidgetHandler.recentlyPlayedRequestMessageId_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetHandler$a */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m31665d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public enum EnumC3276a {
        NO_WIDGET("no_widget"),
        V1("v1"),
        V2("v2");


        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ InterfaceC10707a f12376f = C10708b.m40805a(m15751a());

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String value;

        EnumC3276a(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetHandler$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$cacheRecentlyPlayedData$1", m39664f = "RecentlyPlayedWidgetHandler.kt", m39665l = {216, 119}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3277b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ Map<Long, String> f12378A;

        /* JADX INFO: renamed from: t */
        public Object f12379t;

        /* JADX INFO: renamed from: u */
        public Object f12380u;

        /* JADX INFO: renamed from: v */
        public Object f12381v;

        /* JADX INFO: renamed from: w */
        public int f12382w;

        /* JADX INFO: renamed from: x */
        public int f12383x;

        /* JADX INFO: renamed from: y */
        public int f12384y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ String f12385z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3277b(String str, Map<Long, String> map, InterfaceC9557b<? super C3277b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12385z = str;
            this.f12378A = map;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3277b(this.f12385z, this.f12378A, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x008c A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001c, B:22:0x0084, B:24:0x008c, B:27:0x0092), top: B:34:0x001c }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0092 A[Catch: all -> 0x0020, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001c, B:22:0x0084, B:24:0x008c, B:27:0x0092), top: B:34:0x001c }] */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11970a interfaceC11970a;
            String str;
            Map<Long, String> map;
            int i10;
            InterfaceC11970a interfaceC11970a2;
            Throwable th2;
            String str2;
            Context context;
            Object objM38805e = C10047c.m38805e();
            int i11 = this.f12384y;
            try {
                if (i11 == 0) {
                    C7348o.m30470b(obj);
                    interfaceC11970a = RecentlyPlayedWidgetHandler.cacheMutex;
                    str = this.f12385z;
                    Map<Long, String> map2 = this.f12378A;
                    this.f12379t = interfaceC11970a;
                    this.f12380u = str;
                    this.f12381v = map2;
                    this.f12382w = 0;
                    this.f12384y = 1;
                    if (interfaceC11970a.mo44674f(null, this) != objM38805e) {
                        map = map2;
                        i10 = 0;
                    }
                    return objM38805e;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) this.f12381v;
                    context = (Context) this.f12380u;
                    interfaceC11970a2 = (InterfaceC11970a) this.f12379t;
                    try {
                        C7348o.m30470b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            Unit unit = Unit.f29331a;
                            interfaceC11970a2.mo44673e(null);
                            return unit;
                        }
                        RecentlyPlayedWidgetUpdateWorker.Companion c3283a = RecentlyPlayedWidgetUpdateWorker.INSTANCE;
                        Intrinsics.checkNotNull(context);
                        c3283a.m15758a(context, str2);
                        Unit unit2 = Unit.f29331a;
                        interfaceC11970a2.mo44673e(null);
                        return Unit.f29331a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC11970a2.mo44673e(null);
                        throw th2;
                    }
                }
                i10 = this.f12382w;
                map = (Map) this.f12381v;
                str = (String) this.f12380u;
                InterfaceC11970a interfaceC11970a3 = (InterfaceC11970a) this.f12379t;
                C7348o.m30470b(obj);
                interfaceC11970a = interfaceC11970a3;
                Context contextM14834f = RobloxApplication.m14834f();
                String strReformatData = RecentlyPlayedWidgetHandler.INSTANCE.reformatData(str, map);
                C8156c c8156c = RecentlyPlayedWidgetHandler.recentlyPlayedWidgetFileProvider;
                Intrinsics.checkNotNull(contextM14834f);
                this.f12379t = interfaceC11970a;
                this.f12380u = contextM14834f;
                this.f12381v = strReformatData;
                this.f12382w = i10;
                this.f12383x = 0;
                this.f12384y = 2;
                Object objM33434b = c8156c.m33434b(contextM14834f, strReformatData, this);
                if (objM33434b != objM38805e) {
                    interfaceC11970a2 = interfaceC11970a;
                    obj = objM33434b;
                    str2 = strReformatData;
                    context = contextM14834f;
                    if (!((Boolean) obj).booleanValue()) {
                        Unit unit3 = Unit.f29331a;
                        interfaceC11970a2.mo44673e(null);
                        return unit3;
                    }
                    RecentlyPlayedWidgetUpdateWorker.Companion c3283a2 = RecentlyPlayedWidgetUpdateWorker.INSTANCE;
                    Intrinsics.checkNotNull(context);
                    c3283a2.m15758a(context, str2);
                    Unit unit4 = Unit.f29331a;
                    interfaceC11970a2.mo44673e(null);
                    return Unit.f29331a;
                }
                return objM38805e;
            } catch (Throwable th4) {
                interfaceC11970a2 = interfaceC11970a;
                th2 = th4;
                interfaceC11970a2.mo44673e(null);
                throw th2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3277b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetHandler$c */
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler", m39664f = "RecentlyPlayedWidgetHandler.kt", m39665l = {180}, m39666m = "maybeToggleWidget", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3278c extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f12386A;

        /* JADX INFO: renamed from: t */
        public Object f12387t;

        /* JADX INFO: renamed from: u */
        public Object f12388u;

        /* JADX INFO: renamed from: v */
        public boolean f12389v;

        /* JADX INFO: renamed from: w */
        public int f12390w;

        /* JADX INFO: renamed from: x */
        public int f12391x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f12392y;

        public C3278c(InterfaceC9557b<? super C3278c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12392y = obj;
            this.f12386A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RecentlyPlayedWidgetHandler.this.maybeToggleWidget(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetHandler$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$onCreate$1", m39664f = "RecentlyPlayedWidgetHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3279d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12394t;

        public C3279d(InterfaceC9557b<? super C3279d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3279d(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12394t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            Context contextM14834f = RobloxApplication.m14834f();
            int[] appWidgetIds = AppWidgetManager.getInstance(contextM14834f).getAppWidgetIds(new ComponentName(contextM14834f, (Class<?>) RecentlyPlayedWidgetProvider.class));
            Intrinsics.checkNotNull(appWidgetIds);
            if (!(appWidgetIds.length == 0)) {
                C8155b.m33431d();
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3279d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetHandler$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetHandler$onStop$1", m39664f = "RecentlyPlayedWidgetHandler.kt", m39665l = {77}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3280e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f12395t;

        /* JADX INFO: renamed from: u */
        public Object f12396u;

        /* JADX INFO: renamed from: v */
        public int f12397v;

        /* JADX INFO: renamed from: w */
        public int f12398w;

        public C3280e(InterfaceC9557b<? super C3280e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3280e(interfaceC9557b);
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
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i10;
            Context context;
            Object objM38805e = C10047c.m38805e();
            int i11 = this.f12398w;
            if (i11 == 0) {
                C7348o.m30470b(obj);
                String recentlyPlayedWidgetVariant = JNIWidgetDataProtocol.f12821a.getRecentlyPlayedWidgetVariant();
                boolean z10 = !Intrinsics.m31980c(recentlyPlayedWidgetVariant, EnumC3276a.NO_WIDGET.getValue());
                Context contextM14834f = RobloxApplication.m14834f();
                RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler = RecentlyPlayedWidgetHandler.INSTANCE;
                Intrinsics.checkNotNull(contextM14834f);
                recentlyPlayedWidgetHandler.cacheWidgetVariant(contextM14834f, recentlyPlayedWidgetVariant);
                this.f12395t = recentlyPlayedWidgetVariant;
                this.f12396u = contextM14834f;
                this.f12397v = z10 ? 1 : 0;
                this.f12398w = 1;
                if (recentlyPlayedWidgetHandler.maybeToggleWidget(contextM14834f, z10, this) == objM38805e) {
                    return objM38805e;
                }
                str = recentlyPlayedWidgetVariant;
                i10 = z10 ? 1 : 0;
                context = contextM14834f;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f12397v;
                context = (Context) this.f12396u;
                str = (String) this.f12395t;
                C7348o.m30470b(obj);
            }
            if (i10 == 0) {
                return Unit.f29331a;
            }
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) RecentlyPlayedWidgetProvider.class));
            Intrinsics.checkNotNull(appWidgetIds);
            if (appWidgetIds.length == 0) {
                return Unit.f29331a;
            }
            JNIWidgetDataProtocol.f12821a.initializeProtocol();
            MessageBus messageBusM16016f = MessageBus.m16016f();
            Intrinsics.checkNotNullExpressionValue(messageBusM16016f, "getInstance(...)");
            messageBusM16016f.m16024l(RecentlyPlayedWidgetHandler.INSTANCE.getRecentlyPlayedRequestMessageId(), Intrinsics.m31980c(str, EnumC3276a.V2.getValue()) ? new JSONObject().put(Payload.TYPE, "GameIcon").put("format", "webp").put("width", 256).put("height", 256) : new JSONObject());
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3280e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    private RecentlyPlayedWidgetHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cacheWidgetVariant(Context context, String variant) {
        SharedPreferences sharedPreferencesM42422U = C11295a1.m42422U(context);
        if (Intrinsics.m31980c(sharedPreferencesM42422U.getString("recently_played_widget_variant", null), variant)) {
            return;
        }
        Intrinsics.checkNotNull(sharedPreferencesM42422U);
        SharedPreferences.Editor editorEdit = sharedPreferencesM42422U.edit();
        editorEdit.putString("recently_played_widget_variant", variant);
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentName componentName_delegate$lambda$0() {
        return new ComponentName(RobloxApplication.m14834f(), (Class<?>) RecentlyPlayedWidgetProvider.class);
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
        JNIWidgetDataProtocol jNIWidgetDataProtocol = JNIWidgetDataProtocol.f12821a;
        return MessageBus.getMessageId(jNIWidgetDataProtocol.getProtocolName(), jNIWidgetDataProtocol.getRecentlyPlayedRequestMessage());
    }

    @Keep
    public final void cacheRecentlyPlayedData(@NotNull String widgetDataJson, @NotNull Map<Long, String> thumbnailURLs) {
        Intrinsics.checkNotNullParameter(widgetDataJson, "widgetDataJson");
        Intrinsics.checkNotNullParameter(thumbnailURLs, "thumbnailURLs");
        C7882k.m32780d(C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(defaultDispatcher)), null, null, new C3277b(widgetDataJson, thumbnailURLs, null), 3, null);
    }

    @NotNull
    public final String getCachedWidgetVariant(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = C11295a1.m42422U(context).getString("recently_played_widget_variant", null);
        return string == null ? EnumC3276a.V1.getValue() : string;
    }

    @NotNull
    public final AbstractC7888l0 getDefaultDispatcher$NativeShell_googleProdRelease() {
        return defaultDispatcher;
    }

    @NotNull
    public final AbstractC7888l0 getIoDispatcher$NativeShell_googleProdRelease() {
        return ioDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object maybeToggleWidget(@NotNull Context context, boolean z10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        C3278c c3278c;
        RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler;
        if (interfaceC9557b instanceof C3278c) {
            c3278c = (C3278c) interfaceC9557b;
            int i10 = c3278c.f12386A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3278c.f12386A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                recentlyPlayedWidgetHandler = this;
            } else {
                recentlyPlayedWidgetHandler = this;
                c3278c = recentlyPlayedWidgetHandler.new C3278c(interfaceC9557b);
            }
        } else {
            recentlyPlayedWidgetHandler = this;
            c3278c = recentlyPlayedWidgetHandler.new C3278c(interfaceC9557b);
        }
        Object objM33433a = c3278c.f12392y;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3278c.f12386A;
        if (i11 == 0) {
            C7348o.m30470b(objM33433a);
            PackageManager packageManager = context.getPackageManager();
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(recentlyPlayedWidgetHandler.getComponentName());
            int i12 = z10 ? 1 : 2;
            if (componentEnabledSetting == i12) {
                return Unit.f29331a;
            }
            packageManager.setComponentEnabledSetting(recentlyPlayedWidgetHandler.getComponentName(), i12, 1);
            if (z10) {
                C8155b.m33429b(C12183m.f42874a, "recents", EnumC8159f.Enable, "", EnumC8160g.Home, "");
            } else {
                C8155b.m33429b(C12183m.f42874a, "recents", EnumC8159f.Disable, "", EnumC8160g.Home, "");
                C8156c c8156c = new C8156c();
                c3278c.f12387t = C10350l.m39676a(context);
                c3278c.f12388u = C10350l.m39676a(packageManager);
                c3278c.f12389v = z10;
                c3278c.f12390w = componentEnabledSetting;
                c3278c.f12391x = i12;
                c3278c.f12386A = 1;
                objM33433a = c8156c.m33433a(context, c3278c);
                if (objM33433a == objM38805e) {
                    return objM38805e;
                }
            }
            return Unit.f29331a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C7348o.m30470b(objM33433a);
        if (!((Boolean) objM33433a).booleanValue()) {
            Log.e(TAG, "Recently Played Widget cache cleanup failed");
        }
        return Unit.f29331a;
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (C11659h.m43403a().mo43519Q3()) {
            C7882k.m32780d(C0982t.m4979a(owner), ioDispatcher, null, new C3279d(null), 2, null);
        }
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
    public /* bridge */ void onStart(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStart(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onStop(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C7882k.m32780d(C0982t.m4979a(owner), ioDispatcher, null, new C3280e(null), 2, null);
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

    public final void setDefaultDispatcher$NativeShell_googleProdRelease(@NotNull AbstractC7888l0 abstractC7888l0) {
        Intrinsics.checkNotNullParameter(abstractC7888l0, "<set-?>");
        defaultDispatcher = abstractC7888l0;
    }

    public final void setIoDispatcher$NativeShell_googleProdRelease(@NotNull AbstractC7888l0 abstractC7888l0) {
        Intrinsics.checkNotNullParameter(abstractC7888l0, "<set-?>");
        ioDispatcher = abstractC7888l0;
    }
}
