package com.roblox.client.widgets;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import av.g1;
import av.i;
import av.l0;
import av.q0;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.shortcuts.PinShortcutHandler;
import gu.f;
import gu.l;
import gu.m;
import java.util.ArrayList;
import java.util.List;
import l6.d0;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import y5.j;
import y5.p0;
import y5.z;
import y6.ErrorResult;
import y6.ImageRequest;
import y6.k;
import zt.o;
import zt.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lav/l0;", "ioDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lav/l0;)V", "Landroidx/work/c$a;", "doWork", "(Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "f", "context", BuildConfig.FLAVOR, "widgetDataJson", "d", "(Landroid/content/Context;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "a", "Lav/l0;", "e", "()Lav/l0;", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecentlyPlayedWidgetUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "recentlyPlayedData", BuildConfig.FLAVOR, "a", "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", BuildConfig.FLAVOR, "MAX_THREADS", "I", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            q.e("RecentlyPlayedWidgetUpdateWorker", "Worker failed to start. Recently played data size (" + length + ") exceeds 10KB limit");
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {104}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<av.p0, eu.b<? super List<? extends Unit>>, Object> {
        public final /* synthetic */ Context A;
        public final /* synthetic */ l6.s B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9434t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9435u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9436v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f9437w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ JSONArray f9439y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f9440z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2$1", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {98}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<av.p0, eu.b<? super Unit>, Object> {
            public final /* synthetic */ l6.s A;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f9441t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f9442u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f9443v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ String f9444w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public final /* synthetic */ String f9445x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public final /* synthetic */ String f9446y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Context f9447z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, String str3, Context context, l6.s sVar, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f9444w = str;
                this.f9445x = str2;
                this.f9446y = str3;
                this.f9447z = context;
                this.A = sVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f9444w, this.f9445x, this.f9446y, this.f9447z, this.A, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f9443v;
                if (i10 == 0) {
                    o.b(obj);
                    com.roblox.client.widgets.a aVar = com.roblox.client.widgets.a.f9462a;
                    String str = this.f9444w;
                    Intrinsics.checkNotNull(str);
                    String str2 = this.f9445x;
                    Intrinsics.checkNotNull(str2);
                    String strJ = aVar.j(str, str2, this.f9446y);
                    ImageRequest imageRequestB = new ImageRequest.a(this.f9447z).c(this.f9445x).f(strJ).j(strJ).g(y6.c.ENABLED).b();
                    l6.s sVar = this.A;
                    this.f9441t = l.a(strJ);
                    this.f9442u = l.a(imageRequestB);
                    this.f9443v = 1;
                    obj = sVar.a(imageRequestB, this);
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
                    q.f("RecentlyPlayedWidgetUpdateWorker", "Failed to cache thumbnail for " + this.f9444w, ((ErrorResult) kVar).getThrowable());
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(JSONArray jSONArray, String str, Context context, l6.s sVar, eu.b<? super b> bVar) {
            super(2, bVar);
            this.f9439y = jSONArray;
            this.f9440z = str;
            this.A = context;
            this.B = sVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = RecentlyPlayedWidgetUpdateWorker.this.new b(this.f9439y, this.f9440z, this.A, this.B, bVar);
            bVar2.f9437w = obj;
            return bVar2;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(av.p0 p0Var, eu.b<? super List<Unit>> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) throws JSONException {
            av.p0 p0Var = (av.p0) this.f9437w;
            Object objE = fu.c.e();
            int i10 = this.f9436v;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return obj;
            }
            o.b(obj);
            l0 l0VarT = l0.T(RecentlyPlayedWidgetUpdateWorker.this.getIoDispatcher(), 3, null, 2, null);
            ArrayList arrayList = new ArrayList();
            int length = this.f9439y.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = this.f9439y.getJSONObject(i11);
                String strOptString = jSONObject.optString("thumbnailUrl");
                String strOptString2 = jSONObject.optString(PinShortcutHandler.EXTRA_PLACE_ID);
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() != 0) {
                    arrayList.add(av.k.b(p0Var, l0VarT, null, new a(strOptString2, strOptString, this.f9440z, this.A, this.B, null), 2, null));
                }
            }
            this.f9437w = l.a(p0Var);
            this.f9434t = l.a(l0VarT);
            this.f9435u = l.a(arrayList);
            this.f9436v = 1;
            Object objA = av.f.a(arrayList, this);
            return objA == objE ? objE : objA;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(av.p0 p0Var, eu.b<? super List<? extends Unit>> bVar) {
            return invoke2(p0Var, (eu.b<? super List<Unit>>) bVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {38}, m = "doWork", v = 1)
    public static final class c extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f9448t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9450v;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9448t = obj;
            this.f9450v |= Integer.MIN_VALUE;
            return RecentlyPlayedWidgetUpdateWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lav/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$doWork$2", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {43, RequestError.RESPONSE_CODE_FAILURE, 51}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<av.p0, eu.b<? super androidx.work.c.a>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9451t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9452u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f9453v;

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return RecentlyPlayedWidgetUpdateWorker.this.new d(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super androidx.work.c.a> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
        
            if (r10.f(r9) == r0) goto L30;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            tk.c cVar;
            String str;
            String str2;
            Object objE = fu.c.e();
            int i10 = this.f9453v;
            if (i10 == 0) {
                o.b(obj);
                String strG = RecentlyPlayedWidgetUpdateWorker.this.getInputData().g("recently_played_json_list");
                if (strG == null) {
                    return androidx.work.c.a.a();
                }
                cVar = new tk.c();
                Context applicationContext = RecentlyPlayedWidgetUpdateWorker.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                this.f9451t = strG;
                this.f9452u = l.a(cVar);
                this.f9453v = 1;
                Object objE2 = cVar.e(applicationContext, strG, this);
                if (objE2 != objE) {
                    str = strG;
                    obj = objE2;
                }
                return objE;
            }
            if (i10 == 1) {
                cVar = (tk.c) this.f9452u;
                str = (String) this.f9451t;
                o.b(obj);
            } else if (i10 == 2) {
                cVar = (tk.c) this.f9452u;
                str2 = (String) this.f9451t;
                o.b(obj);
                RecentlyPlayedWidgetUpdateWorker recentlyPlayedWidgetUpdateWorker = RecentlyPlayedWidgetUpdateWorker.this;
                this.f9451t = l.a(str2);
                this.f9452u = l.a(cVar);
                this.f9453v = 3;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            return androidx.work.c.a.d();
            if (!((Boolean) obj).booleanValue()) {
                return androidx.work.c.a.a();
            }
            RecentlyPlayedWidgetUpdateWorker recentlyPlayedWidgetUpdateWorker2 = RecentlyPlayedWidgetUpdateWorker.this;
            Context applicationContext2 = recentlyPlayedWidgetUpdateWorker2.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            this.f9451t = l.a(str);
            this.f9452u = l.a(cVar);
            this.f9453v = 2;
            if (recentlyPlayedWidgetUpdateWorker2.d(applicationContext2, str, this) != objE) {
                str2 = str;
                RecentlyPlayedWidgetUpdateWorker recentlyPlayedWidgetUpdateWorker3 = RecentlyPlayedWidgetUpdateWorker.this;
                this.f9451t = l.a(str2);
                this.f9452u = l.a(cVar);
                this.f9453v = 3;
            }
            return objE;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker", f = "RecentlyPlayedWidgetUpdateWorker.kt", l = {65}, m = "requestWidgetUpdate", v = 1)
    public static final class e extends gu.d {
        public int A;
        public int B;
        public int C;
        public int D;
        public int E;
        public int F;
        public /* synthetic */ Object G;
        public int I;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9455t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9456u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9457v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9458w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9459x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9460y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f9461z;

        public e(eu.b<? super e> bVar) {
            super(bVar);
        }

        @Override // gu.a
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

    public final Object d(Context context, String str, eu.b<? super Unit> bVar) {
        JSONArray jSONArray = new JSONArray(str);
        l6.s sVarA = d0.a(context);
        RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler = RecentlyPlayedWidgetHandler.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Object objG = q0.g(new b(jSONArray, recentlyPlayedWidgetHandler.getCachedWidgetVariant(applicationContext), context, sVarA, null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull eu.b<? super androidx.work.c.a> bVar) {
        c cVar;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f9450v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f9450v = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objG = cVar.f9448t;
        Object objE = fu.c.e();
        int i11 = cVar.f9450v;
        if (i11 == 0) {
            o.b(objG);
            l0 l0Var = this.ioDispatcher;
            d dVar = new d(null);
            cVar.f9450v = 1;
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
    public final java.lang.Object f(eu.b<? super p001kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.f(eu.b):java.lang.Object");
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
