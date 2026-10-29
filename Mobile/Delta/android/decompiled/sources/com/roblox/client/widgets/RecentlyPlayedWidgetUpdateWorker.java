package com.roblox.client.widgets;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.client.shortcuts.PinShortcutHandler;
import gk.p;
import java.util.ArrayList;
import java.util.List;
import jt.o;
import jt.s;
import k6.d0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.i;
import ku.l0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pt.f;
import pt.l;
import pt.m;
import x5.j;
import x5.p0;
import x5.z;
import x6.ErrorResult;
import x6.ImageRequest;
import x6.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lku/l0;", "ioDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lku/l0;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "", "f", "context", "", "widgetDataJson", "d", "(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "a", "Lku/l0;", "e", "()Lku/l0;", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecentlyPlayedWidgetUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "recentlyPlayedData", "", "a", "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "", "MAX_THREADS", "I", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context, @NotNull String recentlyPlayedData) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(recentlyPlayedData, "recentlyPlayedData");
            Pair[] pairArr = {s.a("recently_played_json_list", recentlyPlayedData)};
            androidx.work.b.a aVar = new androidx.work.b.a();
            Pair pair = pairArr[0];
            aVar.b((String) pair.c(), pair.d());
            androidx.work.b bVarA = aVar.a();
            int length = bVarA.j().length;
            if (length <= 10240) {
                p0.INSTANCE.a(context).g("RecentlyPlayedUpdateWork", j.REPLACE, new z.a(RecentlyPlayedWidgetUpdateWorker.class).o(bVarA).b());
                return;
            }
            p.e("RecentlyPlayedWidgetUpdateWorker", "Worker failed to start. Recently played data size (" + length + ") exceeds 10KB limit");
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "", "", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {104}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<ku.p0, nt.b<? super List<? extends Unit>>, Object> {
        public final /* synthetic */ Context A;
        public final /* synthetic */ k6.s B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9535t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9536u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9537v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9538w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ JSONArray f9540y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f9541z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2$1", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {98}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<ku.p0, nt.b<? super Unit>, Object> {
            public final /* synthetic */ k6.s A;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f9542t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f9543u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f9544v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f9545w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f9546x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ String f9547y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Context f9548z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, String str3, Context context, k6.s sVar, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f9545w = str;
                this.f9546x = str2;
                this.f9547y = str3;
                this.f9548z = context;
                this.A = sVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f9545w, this.f9546x, this.f9547y, this.f9548z, this.A, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = ot.c.e();
                int i10 = this.f9544v;
                if (i10 == 0) {
                    o.b(obj);
                    com.roblox.client.widgets.a aVar = com.roblox.client.widgets.a.f9563a;
                    String str = this.f9545w;
                    Intrinsics.checkNotNull(str);
                    String str2 = this.f9546x;
                    Intrinsics.checkNotNull(str2);
                    String strJ = aVar.j(str, str2, this.f9547y);
                    ImageRequest imageRequestB = new ImageRequest.a(this.f9548z).c(this.f9546x).f(strJ).j(strJ).g(x6.c.ENABLED).b();
                    k6.s sVar = this.A;
                    this.f9542t = l.a(strJ);
                    this.f9543u = l.a(imageRequestB);
                    this.f9544v = 1;
                    obj = sVar.d(imageRequestB, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                k kVar = (k) obj;
                if (kVar instanceof ErrorResult) {
                    p.f("RecentlyPlayedWidgetUpdateWorker", "Failed to cache thumbnail for " + this.f9545w, ((ErrorResult) kVar).getThrowable());
                }
                return Unit.f22483a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ku.p0 p0Var, nt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONArray jSONArray, String str, Context context, k6.s sVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f9540y = jSONArray;
            this.f9541z = str;
            this.A = context;
            this.B = sVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            b bVar2 = RecentlyPlayedWidgetUpdateWorker.this.new b(this.f9540y, this.f9541z, this.A, this.B, bVar);
            bVar2.f9538w = obj;
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(ku.p0 p0Var, nt.b<? super List<? extends Unit>> bVar) {
            return invoke2(p0Var, (nt.b<? super List<Unit>>) bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            ku.p0 p0Var = (ku.p0) this.f9538w;
            Object objE = ot.c.e();
            int i10 = this.f9537v;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            l0 l0VarU = l0.U(RecentlyPlayedWidgetUpdateWorker.this.getIoDispatcher(), 3, null, 2, null);
            ArrayList arrayList = new ArrayList();
            int length = this.f9540y.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = this.f9540y.getJSONObject(i11);
                String strOptString = jSONObject.optString("thumbnailUrl");
                String strOptString2 = jSONObject.optString(PinShortcutHandler.EXTRA_PLACE_ID);
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() != 0) {
                    arrayList.add(ku.k.b(p0Var, l0VarU, null, new a(strOptString2, strOptString, this.f9541z, this.A, this.B, null), 2, null));
                }
            }
            this.f9538w = l.a(p0Var);
            this.f9535t = l.a(l0VarU);
            this.f9536u = l.a(arrayList);
            this.f9537v = 1;
            Object objA = ku.f.a(arrayList, this);
            return objA == objE ? objE : objA;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(ku.p0 p0Var, nt.b<? super List<Unit>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {38}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9549t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9551v;

        public c(nt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9549t = obj;
            this.f9551v |= Integer.MIN_VALUE;
            return RecentlyPlayedWidgetUpdateWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$doWork$2", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {43, 50, 51}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<ku.p0, nt.b<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9552t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9553u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9554v;

        public d(nt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return RecentlyPlayedWidgetUpdateWorker.this.new d(bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
        
            if (r10.f(r9) == r0) goto L30;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r9.f9554v
                java.lang.String r2 = "getApplicationContext(...)"
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L41
                if (r1 == r5) goto L35
                if (r1 == r4) goto L28
                if (r1 != r3) goto L20
                java.lang.Object r0 = r9.f9553u
                lk.c r0 = (lk.c) r0
                java.lang.Object r0 = r9.f9552t
                java.lang.String r0 = (java.lang.String) r0
                jt.o.b(r10)
                goto Lbc
            L20:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L28:
                java.lang.Object r1 = r9.f9553u
                lk.c r1 = (lk.c) r1
                java.lang.Object r2 = r9.f9552t
                java.lang.String r2 = (java.lang.String) r2
                jt.o.b(r10)
                goto La5
            L35:
                java.lang.Object r1 = r9.f9553u
                lk.c r1 = (lk.c) r1
                java.lang.Object r5 = r9.f9552t
                java.lang.String r5 = (java.lang.String) r5
                jt.o.b(r10)
                goto L79
            L41:
                jt.o.b(r10)
                com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.this
                androidx.work.b r10 = r10.getInputData()
                java.lang.String r1 = "recently_played_json_list"
                java.lang.String r10 = r10.g(r1)
                if (r10 != 0) goto L57
                androidx.work.c$a r10 = androidx.work.c.a.a()
                return r10
            L57:
                lk.c r1 = new lk.c
                r1.<init>()
                com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker r6 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.this
                android.content.Context r6 = r6.getApplicationContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
                r9.f9552t = r10
                java.lang.Object r7 = pt.l.a(r1)
                r9.f9553u = r7
                r9.f9554v = r5
                java.lang.Object r5 = r1.e(r6, r10, r9)
                if (r5 != r0) goto L76
                goto Lbb
            L76:
                r8 = r5
                r5 = r10
                r10 = r8
            L79:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L86
                androidx.work.c$a r10 = androidx.work.c.a.a()
                return r10
            L86:
                com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.this
                android.content.Context r6 = r10.getApplicationContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
                java.lang.Object r2 = pt.l.a(r5)
                r9.f9552t = r2
                java.lang.Object r2 = pt.l.a(r1)
                r9.f9553u = r2
                r9.f9554v = r4
                java.lang.Object r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.b(r10, r6, r5, r9)
                if (r10 != r0) goto La4
                goto Lbb
            La4:
                r2 = r5
            La5:
                com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.this
                java.lang.Object r2 = pt.l.a(r2)
                r9.f9552t = r2
                java.lang.Object r1 = pt.l.a(r1)
                r9.f9553u = r1
                r9.f9554v = r3
                java.lang.Object r10 = com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.c(r10, r9)
                if (r10 != r0) goto Lbc
            Lbb:
                return r0
            Lbc:
                androidx.work.c$a r10 = androidx.work.c.a.d()
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super androidx.work.c.a> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {65}, m = "requestWidgetUpdate", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends pt.d {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public /* synthetic */ Object G;
        public int I;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9556t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9557u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9558v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9559w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9560x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9561y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f9562z;

        public e(nt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.G = obj;
            this.I |= Integer.MIN_VALUE;
            return RecentlyPlayedWidgetUpdateWorker.this.f(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecentlyPlayedWidgetUpdateWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        this(appContext, workerParams, null, 4, null);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    public final Object d(Context context, String str, nt.b<? super Unit> bVar) {
        JSONArray jSONArray = new JSONArray(str);
        k6.s sVarA = d0.a(context);
        RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler = RecentlyPlayedWidgetHandler.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Object objG = q0.g(new b(jSONArray, recentlyPlayedWidgetHandler.getCachedWidgetVariant(applicationContext), context, sVarA, null), bVar);
        return objG == ot.c.e() ? objG : Unit.f22483a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull nt.b<? super androidx.work.c.a> bVar) {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f9551v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f9551v = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objG = cVar.f9549t;
        Object objE = ot.c.e();
        int i11 = cVar.f9551v;
        if (i11 == 0) {
            o.b(objG);
            l0 l0Var = this.ioDispatcher;
            d dVar = new d(null);
            cVar.f9551v = 1;
            objG = i.g(l0Var, dVar, cVar);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        Intrinsics.checkNotNullExpressionValue(objG, "withContext(...)");
        return objG;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final l0 getIoDispatcher() {
        return this.ioDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x009b  */
    /* JADX WARN: Code duplicated, block: B:18:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00f8 -> B:23:0x00fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(nt.b<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.f(nt.b):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentlyPlayedWidgetUpdateWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams, @NotNull l0 ioDispatcher) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.ioDispatcher = ioDispatcher;
    }

    public /* synthetic */ RecentlyPlayedWidgetUpdateWorker(Context context, WorkerParameters workerParameters, l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, (i10 & 4) != 0 ? g1.b() : l0Var);
    }
}
