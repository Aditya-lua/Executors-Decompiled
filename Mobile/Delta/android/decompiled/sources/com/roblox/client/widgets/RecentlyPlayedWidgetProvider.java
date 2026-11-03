package com.roblox.client.widgets;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import gt.o;
import iu.g1;
import iu.k;
import iu.p0;
import iu.q0;
import iu.z2;
import jk.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mt.c;
import nt.f;
import nt.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/appwidget/AppWidgetManager;", "appWidgetManager", "", "appWidgetIds", "", "onUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V", "", "appWidgetId", "Landroid/os/Bundle;", "newOptions", "onAppWidgetOptionsChanged", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V", "onDeleted", "(Landroid/content/Context;[I)V", "Liu/p0;", "a", "Liu/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecentlyPlayedWidgetProvider extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 scope = q0.a(z2.b(null, 1, null).plus(g1.b()));

    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetProvider$onAppWidgetOptionsChanged$1", f = "RecentlyPlayedWidgetProvider.kt", l = {76}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class a extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9597t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f9598u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f9599v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Bundle f9600w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ AppWidgetManager f9601x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ int f9602y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f9603z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Bundle bundle, AppWidgetManager appWidgetManager, int i10, BroadcastReceiver.PendingResult pendingResult, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f9599v = context;
            this.f9600w = bundle;
            this.f9601x = appWidgetManager;
            this.f9602y = i10;
            this.f9603z = pendingResult;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new a(this.f9599v, this.f9600w, this.f9601x, this.f9602y, this.f9603z, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            com.roblox.client.widgets.a.WidgetLayoutConfig widgetLayoutConfig;
            Throwable th2;
            Object objE = c.e();
            int i10 = this.f9598u;
            if (i10 == 0) {
                o.b(obj);
                try {
                    com.roblox.client.widgets.a aVar2 = com.roblox.client.widgets.a.f9640a;
                    Context context = this.f9599v;
                    com.roblox.client.widgets.a.WidgetLayoutConfig widgetLayoutConfigI = aVar2.i(context, this.f9600w, RecentlyPlayedWidgetHandler.INSTANCE.getCachedWidgetVariant(context));
                    AppWidgetManager appWidgetManager = this.f9601x;
                    Context context2 = this.f9599v;
                    int i11 = this.f9602y;
                    this.f9597t = widgetLayoutConfigI;
                    this.f9598u = 1;
                    aVar = this;
                    try {
                        if (aVar2.o(appWidgetManager, context2, i11, widgetLayoutConfigI, aVar) == objE) {
                            return objE;
                        }
                        widgetLayoutConfig = widgetLayoutConfigI;
                    } catch (Throwable th3) {
                        th = th3;
                        th2 = th;
                        aVar.f9603z.finish();
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    aVar = this;
                    th2 = th;
                    aVar.f9603z.finish();
                    throw th2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                widgetLayoutConfig = (com.roblox.client.widgets.a.WidgetLayoutConfig) this.f9597t;
                try {
                    o.b(obj);
                    aVar = this;
                } catch (Throwable th5) {
                    th2 = th5;
                    aVar = this;
                    aVar.f9603z.finish();
                    throw th2;
                }
            }
            jk.b.b(ug.m.f32859a, "recents", jk.f.SizeChange, widgetLayoutConfig.getTypeName(), g.Home, String.valueOf(aVar.f9602y));
            aVar.f9603z.finish();
            return Unit.f22938a;
        }
    }

    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetProvider$onUpdate$1", f = "RecentlyPlayedWidgetProvider.kt", l = {38}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public final /* synthetic */ Context G;
        public final /* synthetic */ int[] H;
        public final /* synthetic */ BroadcastReceiver.PendingResult I;
        public final /* synthetic */ AppWidgetManager J;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9604t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9605u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9606v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9607w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9608x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9609y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9610z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, int[] iArr, BroadcastReceiver.PendingResult pendingResult, AppWidgetManager appWidgetManager, lt.b<? super b> bVar) {
            super(2, bVar);
            this.G = context;
            this.H = iArr;
            this.I = pendingResult;
            this.J = appWidgetManager;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new b(this.G, this.H, this.I, this.J, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
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
        @Override // nt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r5 = r20
                java.lang.Object r6 = mt.c.e()
                int r0 = r5.F
                r7 = 0
                r8 = 1
                if (r0 == 0) goto L43
                if (r0 != r8) goto L3b
                int r0 = r5.D
                int r1 = r5.B
                int r2 = r5.A
                int r3 = r5.f9610z
                java.lang.Object r4 = r5.f9609y
                android.os.Bundle r4 = (android.os.Bundle) r4
                java.lang.Object r4 = r5.f9608x
                com.roblox.client.widgets.a$b r4 = (com.roblox.client.widgets.a.WidgetLayoutConfig) r4
                java.lang.Object r9 = r5.f9607w
                android.content.Context r9 = (android.content.Context) r9
                java.lang.Object r10 = r5.f9606v
                android.appwidget.AppWidgetManager r10 = (android.appwidget.AppWidgetManager) r10
                java.lang.Object r11 = r5.f9605u
                int[] r11 = (int[]) r11
                java.lang.Object r12 = r5.f9604t
                java.lang.String r12 = (java.lang.String) r12
                gt.o.b(r21)     // Catch: java.lang.Throwable -> L38
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
                gt.o.b(r21)
                com.roblox.client.widgets.RecentlyPlayedWidgetHandler r0 = com.roblox.client.widgets.RecentlyPlayedWidgetHandler.INSTANCE     // Catch: java.lang.Throwable -> L38
                android.content.Context r1 = r5.G     // Catch: java.lang.Throwable -> L38
                java.lang.String r0 = r0.getCachedWidgetVariant(r1)     // Catch: java.lang.Throwable -> L38
                int[] r1 = r5.H     // Catch: java.lang.Throwable -> L38
                android.appwidget.AppWidgetManager r2 = r5.J     // Catch: java.lang.Throwable -> L38
                android.content.Context r3 = r5.G     // Catch: java.lang.Throwable -> L38
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
                com.roblox.client.widgets.a r4 = com.roblox.client.widgets.a.f9640a     // Catch: java.lang.Throwable -> L38
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Throwable -> L38
                r14 = r4
                com.roblox.client.widgets.a$b r4 = r14.i(r2, r0, r13)     // Catch: java.lang.Throwable -> L38
                r5.f9604t = r13     // Catch: java.lang.Throwable -> L38
                r5.f9605u = r12     // Catch: java.lang.Throwable -> L38
                r5.f9606v = r1     // Catch: java.lang.Throwable -> L38
                r5.f9607w = r2     // Catch: java.lang.Throwable -> L38
                r5.f9608x = r4     // Catch: java.lang.Throwable -> L38
                java.lang.Object r0 = nt.l.a(r0)     // Catch: java.lang.Throwable -> L38
                r5.f9609y = r0     // Catch: java.lang.Throwable -> L38
                r5.f9610z = r11     // Catch: java.lang.Throwable -> L38
                r5.A = r10     // Catch: java.lang.Throwable -> L38
                r5.B = r9     // Catch: java.lang.Throwable -> L38
                r5.C = r3     // Catch: java.lang.Throwable -> L38
                r5.D = r3     // Catch: java.lang.Throwable -> L38
                r5.E = r7     // Catch: java.lang.Throwable -> L38
                r5.F = r8     // Catch: java.lang.Throwable -> L38
                r0 = r14
                java.lang.Object r0 = r0.o(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L38
                if (r0 != r6) goto L98
                return r6
            L98:
                r0 = r3
                r3 = r9
                r9 = r2
                r2 = r10
            L9c:
                ug.m r14 = ug.m.f32859a     // Catch: java.lang.Throwable -> L38
                java.lang.String r15 = "recents"
                jk.f r16 = jk.f.Update     // Catch: java.lang.Throwable -> L38
                java.lang.String r17 = r4.getTypeName()     // Catch: java.lang.Throwable -> L38
                jk.g r18 = jk.g.Home     // Catch: java.lang.Throwable -> L38
                java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L38
                jk.b.b(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> L38
                int r10 = r2 + 1
                r2 = r9
                r9 = r3
                goto L5c
            Lb4:
                android.content.BroadcastReceiver$PendingResult r0 = r5.I
                r0.finish()
                kotlin.Unit r0 = kotlin.Unit.f22938a
                return r0
            Lbc:
                android.content.BroadcastReceiver$PendingResult r1 = r5.I
                r1.finish()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetProvider.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, @NotNull Bundle newOptions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(newOptions, "newOptions");
        k.d(this.scope, null, null, new a(context, newOptions, appWidgetManager, appWidgetId, goAsync(), null), 3, null);
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(@NotNull Context context, @NotNull int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        super.onDeleted(context, appWidgetIds);
        for (int i10 : appWidgetIds) {
            jk.b.b(ug.m.f32859a, "recents", jk.f.Remove, RecentlyPlayedWidgetHandler.a.V1.getValue(), g.Home, String.valueOf(i10));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        k.d(this.scope, null, null, new b(context, appWidgetIds, goAsync(), appWidgetManager, null), 3, null);
    }
}
