package com.roblox.client.shortcuts;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.client.RobloxApplication;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.protocols.pinshortcutplatforminterface.generated.IPinShortcutHandlerCore;
import com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p201iu.C6988p;
import p229jt.C7347n;
import p229jt.C7348o;
import p239k6.C7458d0;
import p239k6.C7482v;
import p239k6.InterfaceC7474n;
import p239k6.InterfaceC7479s;
import p256ku.AbstractC7900n2;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p283m2.C8410c;
import p283m2.C8412e;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p537x6.C12749j;
import p537x6.ImageRequest;
import p537x6.InterfaceC12750k;
import p578yj.C13194b;
import p578yj.C13198f;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import sg.C11344p0;
import sg.C11347q0;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010 \u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J/\u0010#\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010)R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010)R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010)R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010)R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010)R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010)R\"\u00106\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, m31665d2 = {"Lcom/roblox/client/shortcuts/PinShortcutHandler;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;", "<init>", "()V", "", "placeId", "", "thumbnailUrl", "experienceName", "shortcutId", "Landroid/net/Uri;", "deepLink", "", "requestPinShortcut", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "Landroid/content/Context;", PinShortcutHandler.PARAM_CONTEXT, "Landroidx/core/graphics/drawable/IconCompat;", "loadIcon", "(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "fallbackIcon", "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", "", "isAvailable", "()Z", "isPinExperienceV2Available", "pinExperience", "(JLjava/lang/String;Ljava/lang/String;)V", "universeId", "pinExperienceV2", "(JJLjava/lang/String;Ljava/lang/String;)V", "onPinConfirmed$NativeShell_googleProdRelease", "(J)V", "onPinConfirmed", "TAG", "Ljava/lang/String;", "EXTRA_PLACE_ID", "DEEP_LINK_BASE", "PARAM_PLACE_ID", "PARAM_JOIN_ORIGIN", "JOIN_ORIGIN_PINNED_SHORTCUT", "EXPERIENCE_DETAILS_DEEP_LINK_BASE", "PARAM_GAME_ID", "PARAM_HOME_ROOT", "PARAM_CONTEXT", "CONTEXT_PINNED_SHORTCUT", "PARAM_FULL_VIEW", "Lku/p0;", "coroutineScope", "Lku/p0;", "getCoroutineScope$NativeShell_googleProdRelease", "()Lku/p0;", "setCoroutineScope$NativeShell_googleProdRelease", "(Lku/p0;)V", "Lkotlin/Function0;", "manufacturerProvider", "Lkotlin/jvm/functions/Function0;", "getManufacturerProvider$NativeShell_googleProdRelease", "()Lkotlin/jvm/functions/Function0;", "setManufacturerProvider$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "", "getSilentManufacturers", "()Ljava/util/Set;", "silentManufacturers", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PinShortcutHandler extends IPlatformPinShortcut implements InterfaceC0954f {

    @NotNull
    private static final String CONTEXT_PINNED_SHORTCUT = "AndroidPinnedShortcut";

    @NotNull
    private static final String DEEP_LINK_BASE = "roblox://experiences/start";

    @NotNull
    private static final String EXPERIENCE_DETAILS_DEEP_LINK_BASE = "roblox://navigation/game_details";

    @NotNull
    public static final String EXTRA_PLACE_ID = "placeId";

    @NotNull
    private static final String JOIN_ORIGIN_PINNED_SHORTCUT = "PinnedShortcut";

    @NotNull
    private static final String PARAM_CONTEXT = "context";

    @NotNull
    private static final String PARAM_FULL_VIEW = "fullView";

    @NotNull
    private static final String PARAM_GAME_ID = "gameId";

    @NotNull
    private static final String PARAM_HOME_ROOT = "homeRoot";

    @NotNull
    private static final String PARAM_JOIN_ORIGIN = "joinAttemptOrigin";

    @NotNull
    private static final String PARAM_PLACE_ID = "placeId";

    @NotNull
    private static final String TAG = "PinShortcutHandler";

    @NotNull
    public static final PinShortcutHandler INSTANCE = new PinShortcutHandler();

    @NotNull
    private static InterfaceC7906p0 coroutineScope = C7910q0.m32885a(C7864g1.m32644b().plus(C7948z2.m32943b(null, 1, null)));

    @NotNull
    private static Function0<String> manufacturerProvider = new Function0() { // from class: yj.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Build.MANUFACTURER;
        }
    };

    /* JADX INFO: renamed from: com.roblox.client.shortcuts.PinShortcutHandler$a */
    @InterfaceC10344f(m39663c = "com.roblox.client.shortcuts.PinShortcutHandler", m39664f = "PinShortcutHandler.kt", m39665l = {176}, m39666m = "loadIcon", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3256a extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f12221A;

        /* JADX INFO: renamed from: t */
        public Object f12222t;

        /* JADX INFO: renamed from: u */
        public Object f12223u;

        /* JADX INFO: renamed from: v */
        public Object f12224v;

        /* JADX INFO: renamed from: w */
        public Object f12225w;

        /* JADX INFO: renamed from: x */
        public int f12226x;

        /* JADX INFO: renamed from: y */
        public /* synthetic */ Object f12227y;

        public C3256a(InterfaceC9557b<? super C3256a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12227y = obj;
            this.f12221A |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return PinShortcutHandler.this.loadIcon(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.shortcuts.PinShortcutHandler$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.shortcuts.PinShortcutHandler$requestPinShortcut$1", m39664f = "PinShortcutHandler.kt", m39665l = {122, 157}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3257b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f12229A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ String f12230B;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ Uri f12231C;

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ long f12232D;

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ String f12233E;

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ String f12234F;

        /* JADX INFO: renamed from: t */
        public Object f12235t;

        /* JADX INFO: renamed from: u */
        public Object f12236u;

        /* JADX INFO: renamed from: v */
        public Object f12237v;

        /* JADX INFO: renamed from: w */
        public Object f12238w;

        /* JADX INFO: renamed from: x */
        public Object f12239x;

        /* JADX INFO: renamed from: y */
        public boolean f12240y;

        /* JADX INFO: renamed from: z */
        public int f12241z;

        /* JADX INFO: renamed from: com.roblox.client.shortcuts.PinShortcutHandler$b$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.shortcuts.PinShortcutHandler$requestPinShortcut$1$1", m39664f = "PinShortcutHandler.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f12242t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ Context f12243u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ String f12244v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, String str, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f12243u = context;
                this.f12244v = str;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f12243u, this.f12244v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f12242t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                Context context = this.f12243u;
                Toast.makeText(context, context.getString(C11347q0.f39900B0, this.f12244v), 0).show();
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3257b(String str, Uri uri, long j10, String str2, String str3, InterfaceC9557b<? super C3257b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12230B = str;
            this.f12231C = uri;
            this.f12232D = j10;
            this.f12233E = str2;
            this.f12234F = str3;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3257b c3257b = new C3257b(this.f12230B, this.f12231C, this.f12232D, this.f12233E, this.f12234F, interfaceC9557b);
            c3257b.f12229A = obj;
            return c3257b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x014e, code lost:
        
            if (p256ku.C7872i.m32684g(r8, r9, r12) == r1) goto L29;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Context contextM14834f;
            PendingIntent broadcast;
            C8410c c8410cM34085a;
            Object objM30460b;
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f12229A;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12241z;
            try {
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    contextM14834f = RobloxApplication.m14834f();
                    PinShortcutHandler pinShortcutHandler = PinShortcutHandler.INSTANCE;
                    Intrinsics.checkNotNull(contextM14834f);
                    String str = this.f12230B;
                    this.f12229A = interfaceC7906p0;
                    this.f12235t = contextM14834f;
                    this.f12241z = 1;
                    obj = pinShortcutHandler.loadIcon(contextM14834f, str, this);
                    if (obj != objM38805e) {
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    contextM14834f = (Context) this.f12235t;
                    C7348o.m30470b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                return Unit.f29331a;
                C7347n.Companion companion = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C10340b.m39658a(C8412e.m34111l(contextM14834f, c8410cM34085a, broadcast.getIntentSender())));
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            IconCompat iconCompat = (IconCompat) obj;
            Intent intent = new Intent("android.intent.action.VIEW", this.f12231C).setPackage(contextM14834f.getPackageName());
            Intrinsics.checkNotNullExpressionValue(intent, "setPackage(...)");
            broadcast = PendingIntent.getBroadcast(contextM14834f, (int) this.f12232D, new Intent(contextM14834f, (Class<?>) PinShortcutConfirmationReceiver.class).putExtra("placeId", this.f12232D), 201326592);
            C8410c.b bVarM34088d = new C8410c.b(contextM14834f, this.f12233E).m34092h(this.f12234F).m34087c(iconCompat).m34088d(intent);
            if (C11659h.m43403a().mo43448G1()) {
                C13198f c13198f = C13198f.f46468a;
                Intrinsics.checkNotNull(contextM14834f);
                bVarM34088d.m34086b(c13198f.m48815b(contextM14834f));
            }
            c8410cM34085a = bVarM34088d.m34085a();
            Intrinsics.checkNotNullExpressionValue(c8410cM34085a, "build(...)");
            long j10 = this.f12232D;
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                C6124q.m27066k(PinShortcutHandler.TAG, "Pin request rejected for placeId=" + j10 + ": " + thM30463e);
                return Unit.f29331a;
            }
            boolean zBooleanValue = ((Boolean) objM30460b).booleanValue();
            C13194b.f46462a.m48808d(this.f12232D);
            if (zBooleanValue) {
                PinShortcutHandler pinShortcutHandler2 = PinShortcutHandler.INSTANCE;
                Set silentManufacturers = pinShortcutHandler2.getSilentManufacturers();
                String lowerCase = pinShortcutHandler2.getManufacturerProvider$NativeShell_googleProdRelease().invoke().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (silentManufacturers.contains(lowerCase)) {
                    pinShortcutHandler2.onPinConfirmed$NativeShell_googleProdRelease(this.f12232D);
                    AbstractC7900n2 abstractC7900n2M32645c = C7864g1.m32645c();
                    a aVar = new a(contextM14834f, this.f12234F, null);
                    this.f12229A = C10350l.m39676a(interfaceC7906p0);
                    this.f12235t = C10350l.m39676a(contextM14834f);
                    this.f12236u = C10350l.m39676a(iconCompat);
                    this.f12237v = C10350l.m39676a(intent);
                    this.f12238w = C10350l.m39676a(broadcast);
                    this.f12239x = C10350l.m39676a(c8410cM34085a);
                    this.f12240y = zBooleanValue;
                    this.f12241z = 2;
                }
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3257b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    private PinShortcutHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_silentManufacturers_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String lowerCase = StringsKt.m32183p1(it).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_silentManufacturers_$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 0;
    }

    private final IconCompat fallbackIcon(Context context) {
        IconCompat iconCompatM2686d = IconCompat.m2686d(context, C11344p0.f39893a);
        Intrinsics.checkNotNullExpressionValue(iconCompatM2686d, "createWithResource(...)");
        return iconCompatM2686d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> getSilentManufacturers() {
        String strMo43445F5 = C11659h.m43403a().mo43445F5();
        Intrinsics.checkNotNullExpressionValue(strMo43445F5, "PinShortcutSilentManufacturers(...)");
        return C6988p.m29383A(C6988p.m29388p(C6988p.m29396x(StringsKt.m32137R0(strMo43445F5, new char[]{','}, false, 0, 6, null), new Function1() { // from class: yj.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PinShortcutHandler._get_silentManufacturers_$lambda$0((String) obj);
            }
        }), new Function1() { // from class: yj.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PinShortcutHandler._get_silentManufacturers_$lambda$1((String) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadIcon(Context context, String str, InterfaceC9557b<? super IconCompat> interfaceC9557b) {
        C3256a c3256a;
        Object objM30460b;
        IconCompat iconCompatM2684b;
        if (interfaceC9557b instanceof C3256a) {
            c3256a = (C3256a) interfaceC9557b;
            int i10 = c3256a.f12221A;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3256a.f12221A = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3256a = new C3256a(interfaceC9557b);
            }
        } else {
            c3256a = new C3256a(interfaceC9557b);
        }
        Object objMo31068d = c3256a.f12227y;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3256a.f12221A;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objMo31068d);
                if (str.length() == 0) {
                    return fallbackIcon(context);
                }
                C7347n.Companion companion = C7347n.INSTANCE;
                ImageRequest imageRequestM47524b = C12749j.m47584a(new ImageRequest.a(context).m47525c(str), false).m47524b();
                InterfaceC7479s interfaceC7479sM30978a = C7458d0.m30978a(context);
                c3256a.f12222t = context;
                c3256a.f12223u = C10350l.m39676a(str);
                c3256a.f12224v = C10350l.m39676a(this);
                c3256a.f12225w = C10350l.m39676a(imageRequestM47524b);
                c3256a.f12226x = 0;
                c3256a.f12221A = 1;
                objMo31068d = interfaceC7479sM30978a.mo31068d(imageRequestM47524b, c3256a);
                if (objMo31068d == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) c3256a.f12222t;
                C7348o.m30470b(objMo31068d);
            }
            InterfaceC7474n image = ((InterfaceC12750k) objMo31068d).getImage();
            objM30460b = C7347n.m30460b(image != null ? C7482v.m31092g(image, 0, 0, 3, null) : null);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        Bitmap bitmap = (Bitmap) (C7347n.m30465g(objM30460b) ? null : objM30460b);
        return (bitmap == null || (iconCompatM2684b = IconCompat.m2684b(bitmap)) == null) ? fallbackIcon(context) : iconCompatM2684b;
    }

    private final void requestPinShortcut(long placeId, String thumbnailUrl, String experienceName, String shortcutId, Uri deepLink) {
        C7882k.m32780d(coroutineScope, null, null, new C3257b(thumbnailUrl, deepLink, placeId, shortcutId, experienceName, null), 3, null);
    }

    @NotNull
    public final InterfaceC7906p0 getCoroutineScope$NativeShell_googleProdRelease() {
        return coroutineScope;
    }

    @NotNull
    public final Function0<String> getManufacturerProvider$NativeShell_googleProdRelease() {
        return manufacturerProvider;
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public boolean isAvailable() {
        return C8412e.m34106g(RobloxApplication.m14834f());
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public boolean isPinExperienceV2Available() {
        return C11659h.m43403a().mo43543U0() && isAvailable();
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (C11659h.m43403a().mo43748w4() && !C7910q0.m32893i(coroutineScope)) {
            coroutineScope = C7910q0.m32885a(C7864g1.m32644b().plus(C7948z2.m32943b(null, 1, null)));
        }
        IPinShortcutHandlerCore.setPlatformImpl(this);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        C7910q0.m32890f(coroutineScope, null, 1, null);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onPause(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onPause(interfaceC0980s);
    }

    public final void onPinConfirmed$NativeShell_googleProdRelease(long placeId) {
        C6124q.m27063h(TAG, "Shortcut pinned for placeId=" + placeId);
        C13194b.f46462a.m48809e(placeId);
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
    public /* bridge */ void onStop(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStop(interfaceC0980s);
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public void pinExperience(long placeId, @NotNull String thumbnailUrl, @NotNull String experienceName) {
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(experienceName, "experienceName");
        Uri uriBuild = Uri.parse(DEEP_LINK_BASE).buildUpon().appendQueryParameter("placeId", String.valueOf(placeId)).appendQueryParameter(PARAM_JOIN_ORIGIN, JOIN_ORIGIN_PINNED_SHORTCUT).build();
        String strM48812h = C13194b.f46462a.m48812h(placeId);
        Intrinsics.checkNotNull(uriBuild);
        requestPinShortcut(placeId, thumbnailUrl, experienceName, strM48812h, uriBuild);
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public void pinExperienceV2(long placeId, long universeId, @NotNull String thumbnailUrl, @NotNull String experienceName) {
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(experienceName, "experienceName");
        Uri uriBuild = Uri.parse(EXPERIENCE_DETAILS_DEEP_LINK_BASE).buildUpon().appendQueryParameter(PARAM_GAME_ID, String.valueOf(universeId)).appendQueryParameter(PARAM_HOME_ROOT, "true").appendQueryParameter(PARAM_CONTEXT, CONTEXT_PINNED_SHORTCUT).appendQueryParameter(PARAM_FULL_VIEW, "true").build();
        String strM48811g = C13194b.f46462a.m48811g(placeId);
        Intrinsics.checkNotNull(uriBuild);
        requestPinShortcut(placeId, thumbnailUrl, experienceName, strM48811g, uriBuild);
    }

    public final void setCoroutineScope$NativeShell_googleProdRelease(@NotNull InterfaceC7906p0 interfaceC7906p0) {
        Intrinsics.checkNotNullParameter(interfaceC7906p0, "<set-?>");
        coroutineScope = interfaceC7906p0;
    }

    public final void setManufacturerProvider$NativeShell_googleProdRelease(@NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        manufacturerProvider = function0;
    }
}
