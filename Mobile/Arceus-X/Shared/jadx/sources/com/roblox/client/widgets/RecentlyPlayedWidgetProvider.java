package com.roblox.client.widgets;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lk.C8155b;
import lk.EnumC8159f;
import lk.EnumC8160g;
import org.jetbrains.annotations.NotNull;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.C7948z2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import vg.C12183m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m31665d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "", "onUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V", "", "appWidgetId", "Landroid/os/Bundle;", "newOptions", "onAppWidgetOptionsChanged", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V", "onDeleted", "(Landroid/content/Context;[I)V", "Lku/p0;", "a", "Lku/p0;", "scope", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RecentlyPlayedWidgetProvider extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 scope = C7910q0.m32885a(C7948z2.m32943b(null, 1, null).plus(C7864g1.m32644b()));

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetProvider$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetProvider$onAppWidgetOptionsChanged$1", m39664f = "RecentlyPlayedWidgetProvider.kt", m39665l = {76}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3281a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f12400t;

        /* JADX INFO: renamed from: u */
        public int f12401u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Context f12402v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Bundle f12403w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ AppWidgetManager f12404x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ int f12405y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ BroadcastReceiver.PendingResult f12406z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3281a(Context context, Bundle bundle, AppWidgetManager appWidgetManager, int i10, BroadcastReceiver.PendingResult pendingResult, InterfaceC9557b<? super C3281a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12402v = context;
            this.f12403w = bundle;
            this.f12404x = appWidgetManager;
            this.f12405y = i10;
            this.f12406z = pendingResult;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3281a(this.f12402v, this.f12403w, this.f12404x, this.f12405y, this.f12406z, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C3281a c3281a;
            C3288a.WidgetLayoutConfig widgetLayoutConfig;
            Throwable th2;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12401u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                try {
                    C3288a c3288a = C3288a.f12466a;
                    Context context = this.f12402v;
                    C3288a.WidgetLayoutConfig widgetLayoutConfigM15767i = c3288a.m15767i(context, this.f12403w, RecentlyPlayedWidgetHandler.INSTANCE.getCachedWidgetVariant(context));
                    AppWidgetManager appWidgetManager = this.f12404x;
                    Context context2 = this.f12402v;
                    int i11 = this.f12405y;
                    this.f12400t = widgetLayoutConfigM15767i;
                    this.f12401u = 1;
                    c3281a = this;
                    try {
                        if (c3288a.m15773o(appWidgetManager, context2, i11, widgetLayoutConfigM15767i, c3281a) == objM38805e) {
                            return objM38805e;
                        }
                        widgetLayoutConfig = widgetLayoutConfigM15767i;
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        c3281a.f12406z.finish();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    c3281a = this;
                    th2 = th;
                    c3281a.f12406z.finish();
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                widgetLayoutConfig = (C3288a.WidgetLayoutConfig) this.f12400t;
                try {
                    C7348o.m30470b(obj);
                    c3281a = this;
                } catch (Throwable th5) {
                    th2 = th5;
                    c3281a = this;
                    c3281a.f12406z.finish();
                    throw th2;
                }
            }
            C8155b.m33429b(C12183m.f42874a, "recents", EnumC8159f.SizeChange, widgetLayoutConfig.getTypeName(), EnumC8160g.Home, String.valueOf(c3281a.f12405y));
            c3281a.f12406z.finish();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3281a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetProvider$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetProvider$onUpdate$1", m39664f = "RecentlyPlayedWidgetProvider.kt", m39665l = {38}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3282b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public int f12407A;

        /* JADX INFO: renamed from: B */
        public int f12408B;

        /* JADX INFO: renamed from: C */
        public int f12409C;

        /* JADX INFO: renamed from: D */
        public int f12410D;

        /* JADX INFO: renamed from: E */
        public int f12411E;

        /* JADX INFO: renamed from: F */
        public int f12412F;

        /* JADX INFO: renamed from: G */
        public final /* synthetic */ Context f12413G;

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ int[] f12414H;

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ BroadcastReceiver.PendingResult f12415I;

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ AppWidgetManager f12416J;

        /* JADX INFO: renamed from: t */
        public Object f12417t;

        /* JADX INFO: renamed from: u */
        public Object f12418u;

        /* JADX INFO: renamed from: v */
        public Object f12419v;

        /* JADX INFO: renamed from: w */
        public Object f12420w;

        /* JADX INFO: renamed from: x */
        public Object f12421x;

        /* JADX INFO: renamed from: y */
        public Object f12422y;

        /* JADX INFO: renamed from: z */
        public int f12423z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3282b(Context context, int[] iArr, BroadcastReceiver.PendingResult pendingResult, AppWidgetManager appWidgetManager, InterfaceC9557b<? super C3282b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12413G = context;
            this.f12414H = iArr;
            this.f12415I = pendingResult;
            this.f12416J = appWidgetManager;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3282b(this.f12413G, this.f12414H, this.f12415I, this.f12416J, interfaceC9557b);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x005e A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:6:0x002e, B:22:0x009c, B:15:0x005e, B:17:0x0066, B:18:0x0068, B:13:0x0046), top: B:28:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:17:0x0066 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:6:0x002e, B:22:0x009c, B:15:0x005e, B:17:0x0066, B:18:0x0068, B:13:0x0046), top: B:28:0x000a }] */
        /* JADX WARN: Code duplicated, block: B:20:0x0097 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0098  */
        /* JADX WARN: Code duplicated, block: B:24:0x00b4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0098 -> B:22:0x009c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r5 = r20
                java.lang.Object r6 = p344ot.C10047c.m38805e()
                int r0 = r5.f12412F
                r7 = 0
                r8 = 1
                if (r0 == 0) goto L43
                if (r0 != r8) goto L3b
                int r0 = r5.f12410D
                int r1 = r5.f12408B
                int r2 = r5.f12407A
                int r3 = r5.f12423z
                java.lang.Object r4 = r5.f12422y
                android.os.Bundle r4 = (android.os.Bundle) r4
                java.lang.Object r4 = r5.f12421x
                com.roblox.client.widgets.a$b r4 = (com.roblox.client.widgets.C3288a.WidgetLayoutConfig) r4
                java.lang.Object r9 = r5.f12420w
                android.content.Context r9 = (android.content.Context) r9
                java.lang.Object r10 = r5.f12419v
                android.appwidget.AppWidgetManager r10 = (android.appwidget.AppWidgetManager) r10
                java.lang.Object r11 = r5.f12418u
                int[] r11 = (int[]) r11
                java.lang.Object r12 = r5.f12417t
                java.lang.String r12 = (java.lang.String) r12
                p229jt.C7348o.m30470b(r21)     // Catch: java.lang.Throwable -> L38
                r13 = r12
                r12 = r11
                r11 = r3
                r3 = r1
                r1 = r10
                goto L9c
            L38:
                r0 = move-exception
                goto Lbc
            L3b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L43:
                p229jt.C7348o.m30470b(r21)
                com.roblox.client.widgets.RecentlyPlayedWidgetHandler r0 = com.roblox.client.widgets.RecentlyPlayedWidgetHandler.INSTANCE     // Catch: java.lang.Throwable -> L38
                android.content.Context r1 = r5.f12413G     // Catch: java.lang.Throwable -> L38
                java.lang.String r0 = r0.getCachedWidgetVariant(r1)     // Catch: java.lang.Throwable -> L38
                int[] r1 = r5.f12414H     // Catch: java.lang.Throwable -> L38
                android.appwidget.AppWidgetManager r2 = r5.f12416J     // Catch: java.lang.Throwable -> L38
                android.content.Context r3 = r5.f12413G     // Catch: java.lang.Throwable -> L38
                int r4 = r1.length     // Catch: java.lang.Throwable -> L38
                r13 = r0
                r12 = r1
                r1 = r2
                r2 = r3
                r9 = r4
                r10 = r7
                r11 = r10
            L5c:
                if (r10 >= r9) goto Lb4
                r3 = r12[r10]     // Catch: java.lang.Throwable -> L38
                android.os.Bundle r0 = r1.getAppWidgetOptions(r3)     // Catch: java.lang.Throwable -> L38
                if (r0 != 0) goto L68
                android.os.Bundle r0 = android.os.Bundle.EMPTY     // Catch: java.lang.Throwable -> L38
            L68:
                com.roblox.client.widgets.a r4 = com.roblox.client.widgets.C3288a.f12466a     // Catch: java.lang.Throwable -> L38
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L38
                r14 = r4
                com.roblox.client.widgets.a$b r4 = r14.m15767i(r2, r0, r13)     // Catch: java.lang.Throwable -> L38
                r5.f12417t = r13     // Catch: java.lang.Throwable -> L38
                r5.f12418u = r12     // Catch: java.lang.Throwable -> L38
                r5.f12419v = r1     // Catch: java.lang.Throwable -> L38
                r5.f12420w = r2     // Catch: java.lang.Throwable -> L38
                r5.f12421x = r4     // Catch: java.lang.Throwable -> L38
                java.lang.Object r0 = pt.C10350l.m39676a(r0)     // Catch: java.lang.Throwable -> L38
                r5.f12422y = r0     // Catch: java.lang.Throwable -> L38
                r5.f12423z = r11     // Catch: java.lang.Throwable -> L38
                r5.f12407A = r10     // Catch: java.lang.Throwable -> L38
                r5.f12408B = r9     // Catch: java.lang.Throwable -> L38
                r5.f12409C = r3     // Catch: java.lang.Throwable -> L38
                r5.f12410D = r3     // Catch: java.lang.Throwable -> L38
                r5.f12411E = r7     // Catch: java.lang.Throwable -> L38
                r5.f12412F = r8     // Catch: java.lang.Throwable -> L38
                r0 = r14
                java.lang.Object r0 = r0.m15773o(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L38
                if (r0 != r6) goto L98
                return r6
            L98:
                r0 = r3
                r3 = r9
                r9 = r2
                r2 = r10
            L9c:
                vg.m r14 = vg.C12183m.f42874a     // Catch: java.lang.Throwable -> L38
                java.lang.String r15 = "recents"
                lk.f r16 = lk.EnumC8159f.Update     // Catch: java.lang.Throwable -> L38
                java.lang.String r17 = r4.getTypeName()     // Catch: java.lang.Throwable -> L38
                lk.g r18 = lk.EnumC8160g.Home     // Catch: java.lang.Throwable -> L38
                java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L38
                lk.C8155b.m33429b(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L38
                int r10 = r2 + 1
                r2 = r9
                r9 = r3
                goto L5c
            Lb4:
                android.content.BroadcastReceiver$PendingResult r0 = r5.f12415I
                r0.finish()
                kotlin.Unit r0 = kotlin.Unit.f29331a
                return r0
            Lbc:
                android.content.BroadcastReceiver$PendingResult r1 = r5.f12415I
                r1.finish()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetProvider.C3282b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3282b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, @NotNull Bundle newOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(newOptions, "newOptions");
        C7882k.m32780d(this.scope, null, null, new C3281a(context, newOptions, appWidgetManager, appWidgetId, goAsync(), null), 3, null);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        super.onDeleted(context, appWidgetIds);
        for (int i10 : appWidgetIds) {
            C8155b.m33429b(C12183m.f42874a, "recents", EnumC8159f.Remove, RecentlyPlayedWidgetHandler.EnumC3276a.V1.getValue(), EnumC8160g.Home, String.valueOf(i10));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        C7882k.m32780d(this.scope, null, null, new C3282b(context, appWidgetIds, goAsync(), appWidgetManager, null), 3, null);
    }
}
