package com.roblox.client.ossearch;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import av.g1;
import av.l0;
import av.q0;
import cl.g;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.common.InputImage;
import com.roblox.platform.http.interfaces.NotificationsInterface;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItem;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItemsResult;
import gu.l;
import gu.m;
import hj.ThumbnailResult;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.k;
import y5.g0;
import y5.i;
import y5.j;
import y5.p0;
import y5.x;
import y5.z;
import zt.n;
import zt.o;
import zt.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR(\u0010\u0014\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Leu/b;)Ljava/lang/Object;", "Lav/l0;", "a", "Lav/l0;", "c", "()Lav/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Lav/l0;)V", "getIoDispatcher$NativeShell_googleProdRelease$annotations", "()V", "ioDispatcher", "Lkotlin/Function0;", BuildConfig.FLAVOR, "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "setClock$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "getClock$NativeShell_googleProdRelease$annotations", "clock", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OSSearchIndexSyncWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public l0 ioDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function0<Long> clock;

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "c", "(Landroid/content/Context;)V", "d", "b", "a", BuildConfig.FLAVOR, "PERIODIC_SYNC_WORK_NAME", "Ljava/lang/String;", "IMMEDIATE_SYNC_WORK_NAME", "TAG", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).b("fetch_search_results");
        }

        public final void b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).b("periodic_fetch_search_results");
        }

        public final void c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            q.h("OSSearchIndexSyncWorker", "Scheduling immediate OS search index sync");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).g("fetch_search_results", j.KEEP, new z.a(OSSearchIndexSyncWorker.class).k(new y5.d(x.CONNECTED, false, true, true, 2, null)).b());
        }

        public final void d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            q.h("OSSearchIndexSyncWorker", "Scheduling periodic OS search index sync");
            Duration durationOfDays = Duration.ofDays(1L);
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            p0 p0VarA = companion.a(applicationContext);
            i iVar = i.KEEP;
            Intrinsics.checkNotNull(durationOfDays);
            p0VarA.e("periodic_fetch_search_results", iVar, new g0.a(OSSearchIndexSyncWorker.class, durationOfDays).k(new y5.d(x.CONNECTED, false, true, true, 2, null)).b());
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends k implements Function0<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9005a = new b();

        public b() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker", f = "OSSearchIndexSyncWorker.kt", l = {InputImage.IMAGE_FORMAT_YUV_420_888, 43, 46}, m = "doWork", v = 1)
    public static final class c extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f9006t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9007u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9008v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9010x;

        public c(eu.b<? super c> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9008v = obj;
            this.f9010x |= Integer.MIN_VALUE;
            return OSSearchIndexSyncWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lav/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2", f = "OSSearchIndexSyncWorker.kt", l = {49, RequestError.RESPONSE_CODE_FAILURE, 53, 67, 68}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<av.p0, eu.b<? super androidx.work.c.a>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ com.roblox.client.ossearch.c C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9011t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9012u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9013v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9014w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9015x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f9016y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9017z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9018t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9019u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f9019u = oSSearchIndexSyncWorker;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f9019u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f9018t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                m2.e.i(this.f9019u.getApplicationContext());
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$2", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends m implements Function2<av.p0, eu.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9020t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9021u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<Pair<m2.c, ThumbnailResult>> f9022v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ SearchIndexItemsResult f9023w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, List<? extends Pair<? extends m2.c, ThumbnailResult>> list, SearchIndexItemsResult searchIndexItemsResult, eu.b<? super b> bVar) {
                super(2, bVar);
                this.f9021u = oSSearchIndexSyncWorker;
                this.f9022v = list;
                this.f9023w = searchIndexItemsResult;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new b(this.f9021u, this.f9022v, this.f9023w, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f9020t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Context applicationContext = this.f9021u.getApplicationContext();
                List<Pair<m2.c, ThumbnailResult>> list = this.f9022v;
                ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((m2.c) ((Pair) it.next()).c());
                }
                m2.e.m(applicationContext, arrayList);
                com.roblox.client.ossearch.b bVar = com.roblox.client.ossearch.b.f9055a;
                Context applicationContext2 = this.f9021u.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                bVar.d(applicationContext2, this.f9021u.b().invoke().longValue() + (((long) this.f9023w.getRefreshIntervalSeconds()) * 1000));
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)I"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$availableShortcuts$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class c extends m implements Function2<av.p0, eu.b<? super Integer>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9024t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9025u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, eu.b<? super c> bVar) {
                super(2, bVar);
                this.f9025u = oSSearchIndexSyncWorker;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new c(this.f9025u, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Integer> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f9024t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Context applicationContext = this.f9025u.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return gu.b.c(hj.a.a(applicationContext));
            }
        }

        /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$d$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lav/p0;", "Lkotlin/Pair;", "Lm2/c;", "Lhj/e;", "<anonymous>", "(Lav/p0;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$indexResults$1$1", f = "OSSearchIndexSyncWorker.kt", l = {60}, m = "invokeSuspend", v = 1)
        public static final class C0147d extends m implements Function2<av.p0, eu.b<? super Pair<? extends m2.c, ? extends ThumbnailResult>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9026t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ SearchIndexItem f9027u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ com.roblox.client.ossearch.c f9028v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9029w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0147d(SearchIndexItem searchIndexItem, com.roblox.client.ossearch.c cVar, OSSearchIndexSyncWorker oSSearchIndexSyncWorker, eu.b<? super C0147d> bVar) {
                super(2, bVar);
                this.f9027u = searchIndexItem;
                this.f9028v = cVar;
                this.f9029w = oSSearchIndexSyncWorker;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new C0147d(this.f9027u, this.f9028v, this.f9029w, bVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(av.p0 p0Var, eu.b<? super Pair<? extends m2.c, ThumbnailResult>> bVar) {
                return ((C0147d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objE = fu.c.e();
                int i10 = this.f9026t;
                if (i10 == 0) {
                    o.b(obj);
                    SearchIndexItem searchIndexItem = this.f9027u;
                    com.roblox.client.ossearch.c cVar = this.f9028v;
                    l0 ioDispatcher = this.f9029w.getIoDispatcher();
                    Context applicationContext = this.f9029w.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    this.f9026t = 1;
                    obj = hj.a.c(searchIndexItem, cVar, ioDispatcher, applicationContext, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj);
                }
                ThumbnailResult thumbnailResult = (ThumbnailResult) obj;
                SearchIndexItem searchIndexItem2 = this.f9027u;
                Bitmap bitmap = thumbnailResult.getBitmap();
                Context applicationContext2 = this.f9029w.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                return s.a(hj.a.d(searchIndexItem2, bitmap, applicationContext2), thumbnailResult);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(av.p0 p0Var, eu.b<? super Pair<? extends m2.c, ? extends ThumbnailResult>> bVar) {
                return invoke2(p0Var, (eu.b<? super Pair<? extends m2.c, ThumbnailResult>>) bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.roblox.client.ossearch.c cVar, eu.b<? super d> bVar) {
            super(2, bVar);
            this.C = cVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            d dVar = OSSearchIndexSyncWorker.this.new d(this.C, bVar);
            dVar.A = obj;
            return dVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super androidx.work.c.a> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:105:0x02d6  */
        /* JADX WARN: Code duplicated, block: B:108:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:114:0x031a  */
        /* JADX WARN: Code duplicated, block: B:116:0x031e  */
        /* JADX WARN: Code duplicated, block: B:117:0x0328  */
        /* JADX WARN: Code duplicated, block: B:122:0x02f3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:125:0x02db A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:128:0x02bd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:132:0x02a5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:135:0x026f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:140:0x0257 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:145:0x0237 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:148:0x0221 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x0119  */
        /* JADX WARN: Code duplicated, block: B:40:0x011b  */
        /* JADX WARN: Code duplicated, block: B:44:0x0144 A[Catch: all -> 0x0030, LOOP:4: B:42:0x013e->B:44:0x0144, LOOP_END, TryCatch #0 {all -> 0x0030, blocks: (B:10:0x002b, B:53:0x01b7, B:17:0x004b, B:49:0x018c, B:20:0x0064, B:41:0x011d, B:42:0x013e, B:44:0x0144, B:45:0x0167, B:23:0x0081, B:37:0x00f8, B:26:0x0094, B:33:0x00cf, B:29:0x00a9), top: B:119:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0186  */
        /* JADX WARN: Code duplicated, block: B:48:0x0187  */
        /* JADX WARN: Code duplicated, block: B:52:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:58:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:63:0x021c  */
        /* JADX WARN: Code duplicated, block: B:66:0x0227  */
        /* JADX WARN: Code duplicated, block: B:77:0x0252  */
        /* JADX WARN: Code duplicated, block: B:80:0x025d  */
        /* JADX WARN: Code duplicated, block: B:92:0x02a0  */
        /* JADX WARN: Code duplicated, block: B:95:0x02ab  */
        /* JADX WARN: Instruction removed from duplicated block: B:117:0x0328, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:58:0x01d2, please report this as an issue */
        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Throwable thE;
            List<SearchIndexItem> searchIndexItems;
            Iterator<T> it;
            int i10;
            List<Pair> list;
            boolean z10;
            int i11;
            Iterator it2;
            int i12;
            Iterator it3;
            int i13;
            Object objFetchOSSearchResults;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker;
            int i14;
            com.roblox.client.ossearch.c cVar;
            av.p0 p0Var;
            SearchIndexItemsResult searchIndexItemsResult;
            av.p0 p0Var2;
            com.roblox.client.ossearch.c cVar2;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker2;
            Object objG;
            com.roblox.client.ossearch.c cVar3;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker3;
            int iIntValue;
            ArrayList arrayList;
            Iterator it4;
            Object objA;
            int i15;
            int i16;
            SearchIndexItemsResult searchIndexItemsResult2;
            av.p0 p0Var3;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker4;
            List list2;
            l0 ioDispatcher;
            b bVar;
            List list3;
            SearchIndexItemsResult searchIndexItemsResult3;
            av.p0 p0Var4 = (av.p0) this.A;
            Object objE = fu.c.e();
            int i17 = this.f9017z;
            try {
                if (i17 == 0) {
                    o.b(obj);
                    com.roblox.client.ossearch.a.f9049a.e();
                    OSSearchIndexSyncWorker oSSearchIndexSyncWorker5 = OSSearchIndexSyncWorker.this;
                    com.roblox.client.ossearch.c cVar4 = this.C;
                    n.Companion companion = n.INSTANCE;
                    NotificationsInterface notificationsInterfaceG = g.d().g();
                    this.A = l.a(p0Var4);
                    this.f9011t = oSSearchIndexSyncWorker5;
                    this.f9012u = cVar4;
                    this.f9013v = p0Var4;
                    this.f9015x = 0;
                    this.f9017z = 1;
                    objFetchOSSearchResults = notificationsInterfaceG.fetchOSSearchResults(this);
                    if (objFetchOSSearchResults != objE) {
                        oSSearchIndexSyncWorker = oSSearchIndexSyncWorker5;
                        i14 = 0;
                        cVar = cVar4;
                        p0Var = p0Var4;
                    }
                    return objE;
                }
                if (i17 == 1) {
                    i14 = this.f9015x;
                    av.p0 p0Var5 = (av.p0) this.f9013v;
                    com.roblox.client.ossearch.c cVar5 = (com.roblox.client.ossearch.c) this.f9012u;
                    OSSearchIndexSyncWorker oSSearchIndexSyncWorker6 = (OSSearchIndexSyncWorker) this.f9011t;
                    o.b(obj);
                    oSSearchIndexSyncWorker = oSSearchIndexSyncWorker6;
                    cVar = cVar5;
                    p0Var = p0Var5;
                    objFetchOSSearchResults = obj;
                } else {
                    if (i17 == 2) {
                        i14 = this.f9015x;
                        searchIndexItemsResult = (SearchIndexItemsResult) this.f9014w;
                        p0Var2 = (av.p0) this.f9013v;
                        cVar2 = (com.roblox.client.ossearch.c) this.f9012u;
                        oSSearchIndexSyncWorker2 = (OSSearchIndexSyncWorker) this.f9011t;
                        o.b(obj);
                        l0 ioDispatcher2 = oSSearchIndexSyncWorker2.getIoDispatcher();
                        c cVar6 = new c(oSSearchIndexSyncWorker2, null);
                        this.A = l.a(p0Var4);
                        this.f9011t = oSSearchIndexSyncWorker2;
                        this.f9012u = cVar2;
                        this.f9013v = p0Var2;
                        this.f9014w = searchIndexItemsResult;
                        this.f9015x = i14;
                        this.f9017z = 3;
                        objG = av.i.g(ioDispatcher2, cVar6, this);
                        if (objG == objE) {
                            cVar3 = cVar2;
                            oSSearchIndexSyncWorker3 = oSSearchIndexSyncWorker2;
                            iIntValue = ((Number) objG).intValue();
                            List listH0 = CollectionsKt.H0(searchIndexItemsResult.getSearchIndexItems(), iIntValue);
                            arrayList = new ArrayList(p001kotlin.collections.q.u(listH0, 10));
                            it4 = listH0.iterator();
                            while (it4.hasNext()) {
                                ArrayList arrayList2 = arrayList;
                                arrayList2.add(av.k.b(p0Var2, null, null, new C0147d((SearchIndexItem) it4.next(), cVar3, oSSearchIndexSyncWorker3, null), 3, null));
                                arrayList = arrayList2;
                                cVar3 = cVar3;
                            }
                            this.A = l.a(p0Var4);
                            this.f9011t = oSSearchIndexSyncWorker3;
                            this.f9012u = l.a(p0Var2);
                            this.f9013v = searchIndexItemsResult;
                            this.f9014w = null;
                            this.f9015x = i14;
                            this.f9016y = iIntValue;
                            this.f9017z = 4;
                            objA = av.f.a(arrayList, this);
                            if (objA != objE) {
                                i15 = i14;
                                i16 = iIntValue;
                                searchIndexItemsResult2 = searchIndexItemsResult;
                                p0Var3 = p0Var2;
                                oSSearchIndexSyncWorker4 = oSSearchIndexSyncWorker3;
                                list2 = (List) objA;
                                ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                                bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                                this.A = l.a(p0Var4);
                                this.f9011t = l.a(p0Var3);
                                this.f9012u = searchIndexItemsResult2;
                                this.f9013v = list2;
                                this.f9015x = i15;
                                this.f9016y = i16;
                                this.f9017z = 5;
                                if (av.i.g(ioDispatcher, bVar, this) != objE) {
                                    list3 = list2;
                                    searchIndexItemsResult3 = searchIndexItemsResult2;
                                }
                            }
                        }
                        return objE;
                    }
                    if (i17 == 3) {
                        i14 = this.f9015x;
                        SearchIndexItemsResult searchIndexItemsResult4 = (SearchIndexItemsResult) this.f9014w;
                        av.p0 p0Var6 = (av.p0) this.f9013v;
                        com.roblox.client.ossearch.c cVar7 = (com.roblox.client.ossearch.c) this.f9012u;
                        OSSearchIndexSyncWorker oSSearchIndexSyncWorker7 = (OSSearchIndexSyncWorker) this.f9011t;
                        o.b(obj);
                        cVar3 = cVar7;
                        oSSearchIndexSyncWorker3 = oSSearchIndexSyncWorker7;
                        p0Var2 = p0Var6;
                        searchIndexItemsResult = searchIndexItemsResult4;
                        objG = obj;
                        iIntValue = ((Number) objG).intValue();
                        List listH1 = CollectionsKt.H0(searchIndexItemsResult.getSearchIndexItems(), iIntValue);
                        arrayList = new ArrayList(p001kotlin.collections.q.u(listH1, 10));
                        it4 = listH1.iterator();
                        while (it4.hasNext()) {
                            ArrayList arrayList3 = arrayList;
                            arrayList3.add(av.k.b(p0Var2, null, null, new C0147d((SearchIndexItem) it4.next(), cVar3, oSSearchIndexSyncWorker3, null), 3, null));
                            arrayList = arrayList3;
                            cVar3 = cVar3;
                        }
                        this.A = l.a(p0Var4);
                        this.f9011t = oSSearchIndexSyncWorker3;
                        this.f9012u = l.a(p0Var2);
                        this.f9013v = searchIndexItemsResult;
                        this.f9014w = null;
                        this.f9015x = i14;
                        this.f9016y = iIntValue;
                        this.f9017z = 4;
                        objA = av.f.a(arrayList, this);
                        if (objA != objE) {
                            i15 = i14;
                            i16 = iIntValue;
                            searchIndexItemsResult2 = searchIndexItemsResult;
                            p0Var3 = p0Var2;
                            oSSearchIndexSyncWorker4 = oSSearchIndexSyncWorker3;
                            list2 = (List) objA;
                            ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                            bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                            this.A = l.a(p0Var4);
                            this.f9011t = l.a(p0Var3);
                            this.f9012u = searchIndexItemsResult2;
                            this.f9013v = list2;
                            this.f9015x = i15;
                            this.f9016y = i16;
                            this.f9017z = 5;
                            if (av.i.g(ioDispatcher, bVar, this) != objE) {
                                list3 = list2;
                                searchIndexItemsResult3 = searchIndexItemsResult2;
                            }
                        }
                        return objE;
                    }
                    if (i17 == 4) {
                        i16 = this.f9016y;
                        i15 = this.f9015x;
                        searchIndexItemsResult2 = (SearchIndexItemsResult) this.f9013v;
                        p0Var3 = (av.p0) this.f9012u;
                        oSSearchIndexSyncWorker4 = (OSSearchIndexSyncWorker) this.f9011t;
                        o.b(obj);
                        objA = obj;
                        list2 = (List) objA;
                        ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                        bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                        this.A = l.a(p0Var4);
                        this.f9011t = l.a(p0Var3);
                        this.f9012u = searchIndexItemsResult2;
                        this.f9013v = list2;
                        this.f9015x = i15;
                        this.f9016y = i16;
                        this.f9017z = 5;
                        if (av.i.g(ioDispatcher, bVar, this) != objE) {
                            list3 = list2;
                            searchIndexItemsResult3 = searchIndexItemsResult2;
                        }
                        return objE;
                    }
                    if (i17 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.f9013v;
                    searchIndexItemsResult3 = (SearchIndexItemsResult) this.f9012u;
                    o.b(obj);
                }
                objB = n.b(s.a(searchIndexItemsResult3, list3));
                thE = n.e(objB);
                if (thE == null) {
                    if (thE instanceof CancellationException) {
                        androidx.work.c.a aVarA = androidx.work.c.a.a();
                        Intrinsics.checkNotNullExpressionValue(aVarA, "failure(...)");
                        return aVarA;
                    }
                    q.e("OSSearchIndexSyncWorker", "Error syncing OS search results: " + thE.getMessage());
                    androidx.work.c.a aVarC = androidx.work.c.a.c();
                    Intrinsics.checkNotNullExpressionValue(aVarC, "retry(...)");
                    return aVarC;
                }
                Pair pair = (Pair) objB;
                SearchIndexItemsResult searchIndexItemsResult5 = (SearchIndexItemsResult) pair.a();
                List list4 = (List) pair.b();
                q.h("OSSearchIndexSyncWorker", "OS search index sync completed. Set " + list4.size() + " shortcuts.");
                com.roblox.client.ossearch.a aVar = com.roblox.client.ossearch.a.f9049a;
                int size = searchIndexItemsResult5.getSearchIndexItems().size();
                searchIndexItems = searchIndexItemsResult5.getSearchIndexItems();
                if ((searchIndexItems instanceof Collection) || !searchIndexItems.isEmpty()) {
                    it = searchIndexItems.iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        if (((SearchIndexItem) it.next()).getThumbnailUrl().length() <= 0 && (i18 = i18 + 1) < 0) {
                            p.s();
                        }
                    }
                    i10 = i18;
                } else {
                    i10 = 0;
                }
                list = list4;
                z10 = list instanceof Collection;
                if (z10 || !list.isEmpty()) {
                    i11 = 0;
                    for (Pair pair2 : list) {
                        if (((ThumbnailResult) pair2.d()).getFromCache() && ((ThumbnailResult) pair2.d()).getBitmap() != null && (i11 = i11 + 1) < 0) {
                            p.s();
                        }
                    }
                } else {
                    i11 = 0;
                }
                com.roblox.client.ossearch.a.SyncMetrics syncMetrics = new com.roblox.client.ossearch.a.SyncMetrics(size, i10, i11, null, null, list4.size(), 24, null);
                if (z10 || !list.isEmpty()) {
                    it2 = list.iterator();
                    i12 = 0;
                    while (it2.hasNext()) {
                        if (!((ThumbnailResult) ((Pair) it2.next()).d()).getFromCache() && (i12 = i12 + 1) < 0) {
                            p.s();
                        }
                    }
                } else {
                    i12 = 0;
                }
                Integer numC = gu.b.c(i12);
                if (z10 || !list.isEmpty()) {
                    it3 = list.iterator();
                    i13 = 0;
                    while (it3.hasNext()) {
                        if (((ThumbnailResult) ((Pair) it3.next()).d()).getBitmap() != null && (i13 = i13 + 1) < 0) {
                            p.s();
                        }
                    }
                } else {
                    i13 = 0;
                }
                aVar.d(com.roblox.client.ossearch.a.SyncMetrics.b(syncMetrics, 0, 0, 0, numC, gu.b.c(i13), 0, 39, null));
                androidx.work.c.a aVarD = androidx.work.c.a.d();
                Intrinsics.checkNotNull(aVarD);
                return aVarD;
                SearchIndexItemsResult searchIndexItemsResult6 = (SearchIndexItemsResult) objFetchOSSearchResults;
                l0 ioDispatcher3 = oSSearchIndexSyncWorker.getIoDispatcher();
                a aVar2 = new a(oSSearchIndexSyncWorker, null);
                this.A = l.a(p0Var4);
                this.f9011t = oSSearchIndexSyncWorker;
                this.f9012u = cVar;
                this.f9013v = p0Var;
                this.f9014w = searchIndexItemsResult6;
                this.f9015x = i14;
                this.f9017z = 2;
                if (av.i.g(ioDispatcher3, aVar2, this) != objE) {
                    searchIndexItemsResult = searchIndexItemsResult6;
                    p0Var2 = p0Var;
                    cVar2 = cVar;
                    oSSearchIndexSyncWorker2 = oSSearchIndexSyncWorker;
                    l0 ioDispatcher4 = oSSearchIndexSyncWorker2.getIoDispatcher();
                    c cVar8 = new c(oSSearchIndexSyncWorker2, null);
                    this.A = l.a(p0Var4);
                    this.f9011t = oSSearchIndexSyncWorker2;
                    this.f9012u = cVar2;
                    this.f9013v = p0Var2;
                    this.f9014w = searchIndexItemsResult;
                    this.f9015x = i14;
                    this.f9017z = 3;
                    objG = av.i.g(ioDispatcher4, cVar8, this);
                    if (objG == objE) {
                        cVar3 = cVar2;
                        oSSearchIndexSyncWorker3 = oSSearchIndexSyncWorker2;
                        iIntValue = ((Number) objG).intValue();
                        List listH2 = CollectionsKt.H0(searchIndexItemsResult.getSearchIndexItems(), iIntValue);
                        arrayList = new ArrayList(p001kotlin.collections.q.u(listH2, 10));
                        it4 = listH2.iterator();
                        while (it4.hasNext()) {
                            ArrayList arrayList4 = arrayList;
                            arrayList4.add(av.k.b(p0Var2, null, null, new C0147d((SearchIndexItem) it4.next(), cVar3, oSSearchIndexSyncWorker3, null), 3, null));
                            arrayList = arrayList4;
                            cVar3 = cVar3;
                        }
                        this.A = l.a(p0Var4);
                        this.f9011t = oSSearchIndexSyncWorker3;
                        this.f9012u = l.a(p0Var2);
                        this.f9013v = searchIndexItemsResult;
                        this.f9014w = null;
                        this.f9015x = i14;
                        this.f9016y = iIntValue;
                        this.f9017z = 4;
                        objA = av.f.a(arrayList, this);
                        if (objA != objE) {
                            i15 = i14;
                            i16 = iIntValue;
                            searchIndexItemsResult2 = searchIndexItemsResult;
                            p0Var3 = p0Var2;
                            oSSearchIndexSyncWorker4 = oSSearchIndexSyncWorker3;
                            list2 = (List) objA;
                            ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                            bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                            this.A = l.a(p0Var4);
                            this.f9011t = l.a(p0Var3);
                            this.f9012u = searchIndexItemsResult2;
                            this.f9013v = list2;
                            this.f9015x = i15;
                            this.f9016y = i16;
                            this.f9017z = 5;
                            if (av.i.g(ioDispatcher, bVar, this) != objE) {
                                list3 = list2;
                                searchIndexItemsResult3 = searchIndexItemsResult2;
                                objB = n.b(s.a(searchIndexItemsResult3, list3));
                                thE = n.e(objB);
                                if (thE == null) {
                                    if (thE instanceof CancellationException) {
                                        androidx.work.c.a aVarA2 = androidx.work.c.a.a();
                                        Intrinsics.checkNotNullExpressionValue(aVarA2, "failure(...)");
                                        return aVarA2;
                                    }
                                    q.e("OSSearchIndexSyncWorker", "Error syncing OS search results: " + thE.getMessage());
                                    androidx.work.c.a aVarC2 = androidx.work.c.a.c();
                                    Intrinsics.checkNotNullExpressionValue(aVarC2, "retry(...)");
                                    return aVarC2;
                                }
                                Pair pair3 = (Pair) objB;
                                SearchIndexItemsResult searchIndexItemsResult7 = (SearchIndexItemsResult) pair3.a();
                                List list5 = (List) pair3.b();
                                q.h("OSSearchIndexSyncWorker", "OS search index sync completed. Set " + list5.size() + " shortcuts.");
                                com.roblox.client.ossearch.a aVar3 = com.roblox.client.ossearch.a.f9049a;
                                int size2 = searchIndexItemsResult7.getSearchIndexItems().size();
                                searchIndexItems = searchIndexItemsResult7.getSearchIndexItems();
                                if (searchIndexItems instanceof Collection) {
                                    it = searchIndexItems.iterator();
                                    int i19 = 0;
                                    while (it.hasNext()) {
                                        if (((SearchIndexItem) it.next()).getThumbnailUrl().length() <= 0) {
                                        }
                                    }
                                    i10 = i19;
                                } else {
                                    it = searchIndexItems.iterator();
                                    int i110 = 0;
                                    while (it.hasNext()) {
                                        if (((SearchIndexItem) it.next()).getThumbnailUrl().length() <= 0) {
                                        }
                                    }
                                    i10 = i110;
                                }
                                list = list5;
                                z10 = list instanceof Collection;
                                if (z10) {
                                    i11 = 0;
                                    while (r5.hasNext()) {
                                        if (((ThumbnailResult) pair2.d()).getFromCache()) {
                                        }
                                    }
                                } else {
                                    i11 = 0;
                                    while (r5.hasNext()) {
                                        if (((ThumbnailResult) pair2.d()).getFromCache()) {
                                        }
                                    }
                                }
                                com.roblox.client.ossearch.a.SyncMetrics syncMetrics2 = new com.roblox.client.ossearch.a.SyncMetrics(size2, i10, i11, null, null, list5.size(), 24, null);
                                if (z10) {
                                    it2 = list.iterator();
                                    i12 = 0;
                                    while (it2.hasNext()) {
                                        if (!((ThumbnailResult) ((Pair) it2.next()).d()).getFromCache()) {
                                        }
                                    }
                                } else {
                                    it2 = list.iterator();
                                    i12 = 0;
                                    while (it2.hasNext()) {
                                        if (!((ThumbnailResult) ((Pair) it2.next()).d()).getFromCache()) {
                                        }
                                    }
                                }
                                Integer numC2 = gu.b.c(i12);
                                if (z10) {
                                    it3 = list.iterator();
                                    i13 = 0;
                                    while (it3.hasNext()) {
                                        if (((ThumbnailResult) ((Pair) it3.next()).d()).getBitmap() != null) {
                                        }
                                    }
                                } else {
                                    it3 = list.iterator();
                                    i13 = 0;
                                    while (it3.hasNext()) {
                                        if (((ThumbnailResult) ((Pair) it3.next()).d()).getBitmap() != null) {
                                        }
                                    }
                                }
                                aVar3.d(com.roblox.client.ossearch.a.SyncMetrics.b(syncMetrics2, 0, 0, 0, numC2, gu.b.c(i13), 0, 39, null));
                                androidx.work.c.a aVarD2 = androidx.work.c.a.d();
                                Intrinsics.checkNotNull(aVarD2);
                                return aVarD2;
                            }
                        }
                    }
                }
                return objE;
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)J"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$nextAllowedSync$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends m implements Function2<av.p0, eu.b<? super Long>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9030t;

        public e(eu.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return OSSearchIndexSyncWorker.this.new e(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Long> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9030t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            com.roblox.client.ossearch.b bVar = com.roblox.client.ossearch.b.f9055a;
            Context applicationContext = OSSearchIndexSyncWorker.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return gu.b.d(bVar.c(applicationContext));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Lcom/roblox/client/ossearch/c;", "<anonymous>", "(Lav/p0;)Lcom/roblox/client/ossearch/c;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$thumbnailCache$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends m implements Function2<av.p0, eu.b<? super com.roblox.client.ossearch.c>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9032t;

        public f(eu.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super com.roblox.client.ossearch.c> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9032t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return com.roblox.client.ossearch.c.INSTANCE.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSSearchIndexSyncWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.ioDispatcher = g1.b();
        this.clock = b.f9005a;
    }

    @NotNull
    public final Function0<Long> b() {
        return this.clock;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final l0 getIoDispatcher() {
        return this.ioDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r12 == r1) goto L31;
     */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull eu.b<? super androidx.work.c.a> bVar) {
        c cVar;
        long j10;
        if (bVar instanceof c) {
            cVar = (c) bVar;
            int i10 = cVar.f9010x;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f9010x = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(bVar);
            }
        } else {
            cVar = new c(bVar);
        }
        Object objG = cVar.f9008v;
        Object objE = fu.c.e();
        int i11 = cVar.f9010x;
        if (i11 == 0) {
            o.b(objG);
            l0 l0Var = this.ioDispatcher;
            e eVar = new e(null);
            cVar.f9010x = 1;
            objG = av.i.g(l0Var, eVar, cVar);
            if (objG != objE) {
            }
            return objE;
        }
        if (i11 == 1) {
            o.b(objG);
        } else if (i11 == 2) {
            j10 = cVar.f9006t;
            o.b(objG);
            com.roblox.client.ossearch.c cVar2 = (com.roblox.client.ossearch.c) objG;
            d dVar = new d(cVar2, null);
            cVar.f9007u = l.a(cVar2);
            cVar.f9006t = j10;
            cVar.f9010x = 3;
            objG = q0.g(dVar, cVar);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(objG);
        }
        Intrinsics.checkNotNullExpressionValue(objG, "coroutineScope(...)");
        return objG;
        long jLongValue = ((Number) objG).longValue();
        if (this.clock.invoke().longValue() < jLongValue) {
            q.h("OSSearchIndexSyncWorker", "Skipping OS search sync, not yet due");
            androidx.work.c.a aVarD = androidx.work.c.a.d();
            Intrinsics.checkNotNullExpressionValue(aVarD, "success(...)");
            return aVarD;
        }
        q.h("OSSearchIndexSyncWorker", "Starting OS search index sync");
        l0 l0Var2 = this.ioDispatcher;
        f fVar = new f(null);
        cVar.f9006t = jLongValue;
        cVar.f9010x = 2;
        objG = av.i.g(l0Var2, fVar, cVar);
        if (objG != objE) {
            j10 = jLongValue;
            com.roblox.client.ossearch.c cVar3 = (com.roblox.client.ossearch.c) objG;
            d dVar2 = new d(cVar3, null);
            cVar.f9007u = l.a(cVar3);
            cVar.f9006t = j10;
            cVar.f9010x = 3;
            objG = q0.g(dVar2, cVar);
        }
        return objE;
    }
}
