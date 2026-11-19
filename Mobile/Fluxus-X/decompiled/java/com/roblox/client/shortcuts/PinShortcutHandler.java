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
import androidx.p000lifecycle.f;
import av.g1;
import av.n2;
import av.p0;
import av.q0;
import av.z2;
import bi.h;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.protocols.pinshortcutplatforminterface.generated.IPinShortcutHandlerCore;
import com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut;
import fu.c;
import gu.d;
import gu.l;
import gu.m;
import java.util.Locale;
import java.util.Set;
import l6.d0;
import l6.s;
import l6.v;
import m2.e;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import y6.ImageRequest;
import y6.j;
import y6.k;
import yu.p;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010 \u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J/\u0010#\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010)R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010)R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010)R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010)R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010)R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010)R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010)R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010)R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u0010)R\"\u00106\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/roblox/client/shortcuts/PinShortcutHandler;", "Landroidx/lifecycle/f;", "Lcom/roblox/protocols/pinshortcutplatforminterface/generated/IPlatformPinShortcut;", "<init>", "()V", BuildConfig.FLAVOR, "placeId", BuildConfig.FLAVOR, "thumbnailUrl", "experienceName", "shortcutId", "Landroid/net/Uri;", "deepLink", BuildConfig.FLAVOR, "requestPinShortcut", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "Landroid/content/Context;", PinShortcutHandler.PARAM_CONTEXT, "Landroidx/core/graphics/drawable/IconCompat;", "loadIcon", "(Landroid/content/Context;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "fallbackIcon", "(Landroid/content/Context;)Landroidx/core/graphics/drawable/IconCompat;", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onDestroy", BuildConfig.FLAVOR, "isAvailable", "()Z", "isPinExperienceV2Available", "pinExperience", "(JLjava/lang/String;Ljava/lang/String;)V", "universeId", "pinExperienceV2", "(JJLjava/lang/String;Ljava/lang/String;)V", "onPinConfirmed$NativeShell_googleProdRelease", "(J)V", "onPinConfirmed", "TAG", "Ljava/lang/String;", "EXTRA_PLACE_ID", "DEEP_LINK_BASE", "PARAM_PLACE_ID", "PARAM_JOIN_ORIGIN", "JOIN_ORIGIN_PINNED_SHORTCUT", "EXPERIENCE_DETAILS_DEEP_LINK_BASE", "PARAM_GAME_ID", "PARAM_HOME_ROOT", "PARAM_CONTEXT", "CONTEXT_PINNED_SHORTCUT", "PARAM_FULL_VIEW", "Lav/p0;", "coroutineScope", "Lav/p0;", "getCoroutineScope$NativeShell_googleProdRelease", "()Lav/p0;", "setCoroutineScope$NativeShell_googleProdRelease", "(Lav/p0;)V", "Lkotlin/Function0;", "manufacturerProvider", "Lkotlin/jvm/functions/Function0;", "getManufacturerProvider$NativeShell_googleProdRelease", "()Lkotlin/jvm/functions/Function0;", "setManufacturerProvider$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", BuildConfig.FLAVOR, "getSilentManufacturers", "()Ljava/util/Set;", "silentManufacturers", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PinShortcutHandler extends IPlatformPinShortcut implements f {

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
    private static p0 coroutineScope = q0.a(g1.b().plus(z2.b(null, 1, null)));

    @NotNull
    private static Function0<String> manufacturerProvider = new Function0() { // from class: gk.e
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Build.MANUFACTURER;
        }
    };

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.shortcuts.PinShortcutHandler", f = "PinShortcutHandler.kt", l = {176}, m = "loadIcon", v = 1)
    public static final class a extends d {
        public int A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9270t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9271u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9272v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9273w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9274x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f9275y;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9275y = obj;
            this.A |= Integer.MIN_VALUE;
            return PinShortcutHandler.this.loadIcon(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.shortcuts.PinShortcutHandler$requestPinShortcut$1", f = "PinShortcutHandler.kt", l = {122, 157}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ String B;
        public final /* synthetic */ Uri C;
        public final /* synthetic */ long D;
        public final /* synthetic */ String E;
        public final /* synthetic */ String F;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9277t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9278u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9279v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9280w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9281x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f9282y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9283z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.shortcuts.PinShortcutHandler$requestPinShortcut$1$1", f = "PinShortcutHandler.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9284t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Context f9285u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ String f9286v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, String str, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f9285u = context;
                this.f9286v = str;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f9285u, this.f9286v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                c.e();
                if (this.f9284t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Context context = this.f9285u;
                Toast.makeText(context, context.getString(bh.q0.L0, this.f9286v), 0).show();
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Uri uri, long j10, String str2, String str3, eu.b<? super b> bVar) {
            super(2, bVar);
            this.B = str;
            this.C = uri;
            this.D = j10;
            this.E = str2;
            this.F = str3;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = new b(this.B, this.C, this.D, this.E, this.F, bVar);
            bVar2.A = obj;
            return bVar2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x014e, code lost:
        
            if (av.i.g(r8, r9, r12) == r1) goto L29;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Context contextF;
            PendingIntent broadcast;
            m2.c cVarA;
            Object objB;
            p0 p0Var = (p0) this.A;
            Object objE = c.e();
            int i10 = this.f9283z;
            try {
                if (i10 == 0) {
                    o.b(obj);
                    contextF = RobloxApplication.f();
                    PinShortcutHandler pinShortcutHandler = PinShortcutHandler.INSTANCE;
                    Intrinsics.checkNotNull(contextF);
                    String str = this.B;
                    this.A = p0Var;
                    this.f9277t = contextF;
                    this.f9283z = 1;
                    obj = pinShortcutHandler.loadIcon(contextF, str, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    contextF = (Context) this.f9277t;
                    o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                return Unit.f21506a;
                n.Companion companion = n.INSTANCE;
                objB = n.b(gu.b.a(e.l(contextF, cVarA, broadcast.getIntentSender())));
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            IconCompat iconCompat = (IconCompat) obj;
            Intent intent = new Intent("android.intent.action.VIEW", this.C).setPackage(contextF.getPackageName());
            Intrinsics.checkNotNullExpressionValue(intent, "setPackage(...)");
            broadcast = PendingIntent.getBroadcast(contextF, (int) this.D, new Intent(contextF, (Class<?>) PinShortcutConfirmationReceiver.class).putExtra("placeId", this.D), 201326592);
            m2.c.b bVarD = new m2.c.b(contextF, this.E).h(this.F).c(iconCompat).d(intent);
            if (h.a().J1()) {
                gk.f fVar = gk.f.f17761a;
                Intrinsics.checkNotNull(contextF);
                bVarD.b(fVar.b(contextF));
            }
            cVarA = bVarD.a();
            Intrinsics.checkNotNullExpressionValue(cVarA, "build(...)");
            long j10 = this.D;
            Throwable thE = n.e(objB);
            if (thE != null) {
                q.k(PinShortcutHandler.TAG, "Pin request rejected for placeId=" + j10 + ": " + thE);
                return Unit.f21506a;
            }
            boolean zBooleanValue = ((Boolean) objB).booleanValue();
            gk.b.f17757a.d(this.D);
            if (zBooleanValue) {
                PinShortcutHandler pinShortcutHandler2 = PinShortcutHandler.INSTANCE;
                Set silentManufacturers = pinShortcutHandler2.getSilentManufacturers();
                String lowerCase = pinShortcutHandler2.getManufacturerProvider$NativeShell_googleProdRelease().invoke().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (silentManufacturers.contains(lowerCase)) {
                    pinShortcutHandler2.onPinConfirmed$NativeShell_googleProdRelease(this.D);
                    n2 n2VarC = g1.c();
                    a aVar = new a(contextF, this.F, null);
                    this.A = l.a(p0Var);
                    this.f9277t = l.a(contextF);
                    this.f9278u = l.a(iconCompat);
                    this.f9279v = l.a(intent);
                    this.f9280w = l.a(broadcast);
                    this.f9281x = l.a(cVarA);
                    this.f9282y = zBooleanValue;
                    this.f9283z = 2;
                }
            }
            return Unit.f21506a;
        }
    }

    private PinShortcutHandler() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _get_silentManufacturers_$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String lowerCase = StringsKt.n1(it).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_silentManufacturers_$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 0;
    }

    private final IconCompat fallbackIcon(Context context) {
        IconCompat iconCompatD = IconCompat.d(context, bh.p0.f4218a);
        Intrinsics.checkNotNullExpressionValue(iconCompatD, "createWithResource(...)");
        return iconCompatD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> getSilentManufacturers() {
        String strI5 = h.a().I5();
        Intrinsics.checkNotNullExpressionValue(strI5, "PinShortcutSilentManufacturers(...)");
        return p.A(p.p(p.x(StringsKt.P0(strI5, new char[]{','}, false, 0, 6, null), new Function1() { // from class: gk.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PinShortcutHandler._get_silentManufacturers_$lambda$0((String) obj);
            }
        }), new Function1() { // from class: gk.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PinShortcutHandler._get_silentManufacturers_$lambda$1((String) obj));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object loadIcon(Context context, String str, eu.b<? super IconCompat> bVar) {
        a aVar;
        Object objB;
        IconCompat iconCompatB;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.A;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.A = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objA = aVar.f9275y;
        Object objE = c.e();
        int i11 = aVar.A;
        try {
            if (i11 == 0) {
                o.b(objA);
                if (str.length() == 0) {
                    return fallbackIcon(context);
                }
                n.Companion companion = n.INSTANCE;
                ImageRequest imageRequestB = j.a(new ImageRequest.a(context).c(str), false).b();
                s sVarA = d0.a(context);
                aVar.f9270t = context;
                aVar.f9271u = l.a(str);
                aVar.f9272v = l.a(this);
                aVar.f9273w = l.a(imageRequestB);
                aVar.f9274x = 0;
                aVar.A = 1;
                objA = sVarA.a(imageRequestB, aVar);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                context = (Context) aVar.f9270t;
                o.b(objA);
            }
            l6.n image = ((k) objA).getImage();
            objB = n.b(image != null ? v.g(image, 0, 0, 3, null) : null);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        Bitmap bitmap = (Bitmap) (n.g(objB) ? null : objB);
        return (bitmap == null || (iconCompatB = IconCompat.b(bitmap)) == null) ? fallbackIcon(context) : iconCompatB;
    }

    private final void requestPinShortcut(long placeId, String thumbnailUrl, String experienceName, String shortcutId, Uri deepLink) {
        av.k.d(coroutineScope, null, null, new b(thumbnailUrl, deepLink, placeId, shortcutId, experienceName, null), 3, null);
    }

    @NotNull
    public final p0 getCoroutineScope$NativeShell_googleProdRelease() {
        return coroutineScope;
    }

    @NotNull
    public final Function0<String> getManufacturerProvider$NativeShell_googleProdRelease() {
        return manufacturerProvider;
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public boolean isAvailable() {
        return e.g(RobloxApplication.f());
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public boolean isPinExperienceV2Available() {
        return h.a().Z0() && isAvailable();
    }

    @Override // androidx.p000lifecycle.f
    public void onCreate(@NotNull androidx.p000lifecycle.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (h.a().D4() && !q0.i(coroutineScope)) {
            coroutineScope = q0.a(g1.b().plus(z2.b(null, 1, null)));
        }
        IPinShortcutHandlerCore.setPlatformImpl(this);
    }

    @Override // androidx.p000lifecycle.f
    public void onDestroy(@NotNull androidx.p000lifecycle.s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        q0.f(coroutineScope, null, 1, null);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onPause(@NotNull androidx.p000lifecycle.s sVar) {
        super.onPause(sVar);
    }

    public final void onPinConfirmed$NativeShell_googleProdRelease(long placeId) {
        q.h(TAG, "Shortcut pinned for placeId=" + placeId);
        gk.b.f17757a.e(placeId);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onResume(@NotNull androidx.p000lifecycle.s sVar) {
        super.onResume(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStart(@NotNull androidx.p000lifecycle.s sVar) {
        super.onStart(sVar);
    }

    @Override // androidx.p000lifecycle.f
    public /* bridge */ void onStop(@NotNull androidx.p000lifecycle.s sVar) {
        super.onStop(sVar);
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public void pinExperience(long placeId, @NotNull String thumbnailUrl, @NotNull String experienceName) {
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(experienceName, "experienceName");
        Uri uriBuild = Uri.parse(DEEP_LINK_BASE).buildUpon().appendQueryParameter("placeId", String.valueOf(placeId)).appendQueryParameter(PARAM_JOIN_ORIGIN, JOIN_ORIGIN_PINNED_SHORTCUT).build();
        String strH = gk.b.f17757a.h(placeId);
        Intrinsics.checkNotNull(uriBuild);
        requestPinShortcut(placeId, thumbnailUrl, experienceName, strH, uriBuild);
    }

    @Override // com.roblox.protocols.pinshortcutplatforminterface.generated.IPlatformPinShortcut
    public void pinExperienceV2(long placeId, long universeId, @NotNull String thumbnailUrl, @NotNull String experienceName) {
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(experienceName, "experienceName");
        Uri uriBuild = Uri.parse(EXPERIENCE_DETAILS_DEEP_LINK_BASE).buildUpon().appendQueryParameter(PARAM_GAME_ID, String.valueOf(universeId)).appendQueryParameter(PARAM_HOME_ROOT, "true").appendQueryParameter(PARAM_CONTEXT, CONTEXT_PINNED_SHORTCUT).appendQueryParameter(PARAM_FULL_VIEW, "true").build();
        String strG = gk.b.f17757a.g(placeId);
        Intrinsics.checkNotNull(uriBuild);
        requestPinShortcut(placeId, thumbnailUrl, experienceName, strG, uriBuild);
    }

    public final void setCoroutineScope$NativeShell_googleProdRelease(@NotNull p0 p0Var) {
        Intrinsics.checkNotNullParameter(p0Var, "<set-?>");
        coroutineScope = p0Var;
    }

    public final void setManufacturerProvider$NativeShell_googleProdRelease(@NotNull Function0<String> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        manufacturerProvider = function0;
    }
}
