package com.roblox.client.ossearch;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItem;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItemsResult;
import ek.q;
import gt.n;
import gt.o;
import gt.s;
import iu.g1;
import iu.l0;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import nt.l;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rh.h;
import tk.g;
import x5.g0;
import x5.i;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;
import xi.ThumbnailResult;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR(\u0010\u0014\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Llt/b;)Ljava/lang/Object;", "Liu/l0;", "a", "Liu/l0;", "c", "()Liu/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Liu/l0;)V", "getIoDispatcher$NativeShell_googleProdRelease$annotations", "()V", "ioDispatcher", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "setClock$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "getClock$NativeShell_googleProdRelease$annotations", "clock", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)V", "d", "b", "a", "", "PERIODIC_SYNC_WORK_NAME", "Ljava/lang/String;", "IMMEDIATE_SYNC_WORK_NAME", "TAG", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            companion.a(applicationContext).g("fetch_search_results", j.KEEP, new z.a(OSSearchIndexSyncWorker.class).k(new x5.d(x.CONNECTED, false, true, true, 2, null)).b());
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
            p0VarA.e("periodic_fetch_search_results", iVar, new g0.a(OSSearchIndexSyncWorker.class, durationOfDays).k(new x5.d(x.CONNECTED, false, true, true, 2, null)).b());
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b extends k implements Function0<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f9190a = new b();

        public b() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @nt.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker", f = "OSSearchIndexSyncWorker.kt", l = {36, 44, 47}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f9191t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9192u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f9193v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9195x;

        public c(lt.b<? super c> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9193v = obj;
            this.f9195x |= Integer.MIN_VALUE;
            return OSSearchIndexSyncWorker.this.doWork(this);
        }
    }

    @nt.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2", f = "OSSearchIndexSyncWorker.kt", l = {50, 51, 54, 68, 69}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Liu/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<iu.p0, lt.b<? super androidx.work.c.a>, Object> {
        public /* synthetic */ Object A;
        public final /* synthetic */ com.roblox.client.ossearch.c C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9196t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9197u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9198v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9199w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f9200x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f9201y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f9202z;

        @nt.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class a extends m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9203t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9204u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f9204u = oSSearchIndexSyncWorker;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f9204u, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f9203t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                m2.e.i(this.f9204u.getApplicationContext());
                return Unit.f22938a;
            }
        }

        @nt.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$2", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
        public static final class b extends m implements Function2<iu.p0, lt.b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9205t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9206u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List<Pair<m2.c, ThumbnailResult>> f9207v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ SearchIndexItemsResult f9208w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, List<? extends Pair<? extends m2.c, ThumbnailResult>> list, SearchIndexItemsResult searchIndexItemsResult, lt.b<? super b> bVar) {
                super(2, bVar);
                this.f9206u = oSSearchIndexSyncWorker;
                this.f9207v = list;
                this.f9208w = searchIndexItemsResult;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new b(this.f9206u, this.f9207v, this.f9208w, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(iu.p0 p0Var, lt.b<? super Unit> bVar) {
                return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f9205t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Context applicationContext = this.f9206u.getApplicationContext();
                List<Pair<m2.c, ThumbnailResult>> list = this.f9207v;
                ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((m2.c) ((Pair) it.next()).c());
                }
                m2.e.m(applicationContext, arrayList);
                com.roblox.client.ossearch.b bVar = com.roblox.client.ossearch.b.f9240a;
                Context applicationContext2 = this.f9206u.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                bVar.d(applicationContext2, this.f9206u.b().invoke().longValue() + (((long) this.f9208w.getRefreshIntervalSeconds()) * 1000));
                return Unit.f22938a;
            }
        }

        @nt.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$availableShortcuts$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)I"}, k = 3, mv = {2, 2, 0})
        public static final class c extends m implements Function2<iu.p0, lt.b<? super Integer>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9209t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9210u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, lt.b<? super c> bVar) {
                super(2, bVar);
                this.f9210u = oSSearchIndexSyncWorker;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new c(this.f9210u, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(iu.p0 p0Var, lt.b<? super Integer> bVar) {
                return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                mt.c.e();
                if (this.f9209t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                Context applicationContext = this.f9210u.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return nt.b.d(xi.a.a(applicationContext));
            }
        }

        /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$d$d, reason: collision with other inner class name */
        @nt.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$indexResults$1$1", f = "OSSearchIndexSyncWorker.kt", l = {61}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liu/p0;", "Lkotlin/Pair;", "Lm2/c;", "Lxi/e;", "<anonymous>", "(Liu/p0;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
        public static final class C0144d extends m implements Function2<iu.p0, lt.b<? super Pair<? extends m2.c, ? extends ThumbnailResult>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9211t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ SearchIndexItem f9212u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ com.roblox.client.ossearch.c f9213v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ OSSearchIndexSyncWorker f9214w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0144d(SearchIndexItem searchIndexItem, com.roblox.client.ossearch.c cVar, OSSearchIndexSyncWorker oSSearchIndexSyncWorker, lt.b<? super C0144d> bVar) {
                super(2, bVar);
                this.f9212u = searchIndexItem;
                this.f9213v = cVar;
                this.f9214w = oSSearchIndexSyncWorker;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new C0144d(this.f9212u, this.f9213v, this.f9214w, bVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(iu.p0 p0Var, lt.b<? super Pair<? extends m2.c, ThumbnailResult>> bVar) {
                return ((C0144d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objE = mt.c.e();
                int i10 = this.f9211t;
                if (i10 == 0) {
                    o.b(obj);
                    SearchIndexItem searchIndexItem = this.f9212u;
                    com.roblox.client.ossearch.c cVar = this.f9213v;
                    l0 ioDispatcher = this.f9214w.getIoDispatcher();
                    Context applicationContext = this.f9214w.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    this.f9211t = 1;
                    obj = xi.a.c(searchIndexItem, cVar, ioDispatcher, applicationContext, this);
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
                SearchIndexItem searchIndexItem2 = this.f9212u;
                Bitmap bitmap = thumbnailResult.getBitmap();
                Context applicationContext2 = this.f9214w.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                return s.a(xi.a.d(searchIndexItem2, bitmap, applicationContext2), thumbnailResult);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(iu.p0 p0Var, lt.b<? super Pair<? extends m2.c, ? extends ThumbnailResult>> bVar) {
                return invoke2(p0Var, (lt.b<? super Pair<? extends m2.c, ThumbnailResult>>) bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.roblox.client.ossearch.c cVar, lt.b<? super d> bVar) {
            super(2, bVar);
            this.C = cVar;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            d dVar = OSSearchIndexSyncWorker.this.new d(this.C, bVar);
            dVar.A = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super androidx.work.c.a> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code duplicated, block: B:106:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:109:0x02eb  */
        /* JADX WARN: Code duplicated, block: B:116:0x0326  */
        /* JADX WARN: Code duplicated, block: B:118:0x032a  */
        /* JADX WARN: Code duplicated, block: B:119:0x0334  */
        /* JADX WARN: Code duplicated, block: B:124:0x02fd A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:127:0x02e5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:130:0x02c7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:134:0x02af A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:137:0x026f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:142:0x0257 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:147:0x0237 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:150:0x0221 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:39:0x0119  */
        /* JADX WARN: Code duplicated, block: B:40:0x011b  */
        /* JADX WARN: Code duplicated, block: B:44:0x0144 A[Catch: all -> 0x0030, LOOP:4: B:42:0x013e->B:44:0x0144, LOOP_END, TryCatch #0 {all -> 0x0030, blocks: (B:10:0x002b, B:53:0x01b7, B:17:0x004b, B:49:0x018c, B:20:0x0064, B:41:0x011d, B:42:0x013e, B:44:0x0144, B:45:0x0167, B:23:0x0081, B:37:0x00f8, B:26:0x0094, B:33:0x00cf, B:29:0x00a9), top: B:121:0x0013 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0186  */
        /* JADX WARN: Code duplicated, block: B:48:0x0187  */
        /* JADX WARN: Code duplicated, block: B:52:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:58:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:63:0x021c  */
        /* JADX WARN: Code duplicated, block: B:66:0x0227  */
        /* JADX WARN: Code duplicated, block: B:77:0x0252  */
        /* JADX WARN: Code duplicated, block: B:80:0x025d  */
        /* JADX WARN: Code duplicated, block: B:89:0x029d  */
        /* JADX WARN: Code duplicated, block: B:93:0x02aa  */
        /* JADX WARN: Code duplicated, block: B:96:0x02b5  */
        /* JADX WARN: Instruction removed from duplicated block: B:119:0x0334, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:58:0x01d2, please report this as an issue */
        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Throwable thE;
            List<SearchIndexItem> searchIndexItems;
            Iterator<T> it;
            int i10;
            List<Pair> list;
            boolean z10;
            int i11;
            com.roblox.client.ossearch.a.SyncMetrics syncMetrics;
            Iterator it2;
            int i12;
            Iterator it3;
            int i13;
            Object objA;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker;
            int i14;
            com.roblox.client.ossearch.c cVar;
            iu.p0 p0Var;
            SearchIndexItemsResult searchIndexItemsResult;
            iu.p0 p0Var2;
            com.roblox.client.ossearch.c cVar2;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker2;
            Object objG;
            com.roblox.client.ossearch.c cVar3;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker3;
            int iIntValue;
            ArrayList arrayList;
            Iterator it4;
            Object objA2;
            int i15;
            int i16;
            SearchIndexItemsResult searchIndexItemsResult2;
            iu.p0 p0Var3;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker4;
            List list2;
            l0 ioDispatcher;
            b bVar;
            List list3;
            SearchIndexItemsResult searchIndexItemsResult3;
            iu.p0 p0Var4 = (iu.p0) this.A;
            Object objE = mt.c.e();
            int i17 = this.f9202z;
            try {
                if (i17 == 0) {
                    o.b(obj);
                    com.roblox.client.ossearch.a.f9234a.e();
                    OSSearchIndexSyncWorker oSSearchIndexSyncWorker5 = OSSearchIndexSyncWorker.this;
                    com.roblox.client.ossearch.c cVar4 = this.C;
                    n.Companion companion = n.INSTANCE;
                    xk.j jVarF = g.d().f();
                    this.A = l.a(p0Var4);
                    this.f9196t = oSSearchIndexSyncWorker5;
                    this.f9197u = cVar4;
                    this.f9198v = p0Var4;
                    this.f9200x = 0;
                    this.f9202z = 1;
                    objA = jVarF.a(this);
                    if (objA != objE) {
                        oSSearchIndexSyncWorker = oSSearchIndexSyncWorker5;
                        i14 = 0;
                        cVar = cVar4;
                        p0Var = p0Var4;
                    }
                    return objE;
                }
                if (i17 == 1) {
                    i14 = this.f9200x;
                    iu.p0 p0Var5 = (iu.p0) this.f9198v;
                    com.roblox.client.ossearch.c cVar5 = (com.roblox.client.ossearch.c) this.f9197u;
                    OSSearchIndexSyncWorker oSSearchIndexSyncWorker6 = (OSSearchIndexSyncWorker) this.f9196t;
                    o.b(obj);
                    oSSearchIndexSyncWorker = oSSearchIndexSyncWorker6;
                    cVar = cVar5;
                    p0Var = p0Var5;
                    objA = obj;
                } else {
                    if (i17 == 2) {
                        i14 = this.f9200x;
                        searchIndexItemsResult = (SearchIndexItemsResult) this.f9199w;
                        p0Var2 = (iu.p0) this.f9198v;
                        cVar2 = (com.roblox.client.ossearch.c) this.f9197u;
                        oSSearchIndexSyncWorker2 = (OSSearchIndexSyncWorker) this.f9196t;
                        o.b(obj);
                        l0 ioDispatcher2 = oSSearchIndexSyncWorker2.getIoDispatcher();
                        c cVar6 = new c(oSSearchIndexSyncWorker2, null);
                        this.A = l.a(p0Var4);
                        this.f9196t = oSSearchIndexSyncWorker2;
                        this.f9197u = cVar2;
                        this.f9198v = p0Var2;
                        this.f9199w = searchIndexItemsResult;
                        this.f9200x = i14;
                        this.f9202z = 3;
                        objG = iu.i.g(ioDispatcher2, cVar6, this);
                        if (objG == objE) {
                            cVar3 = cVar2;
                            oSSearchIndexSyncWorker3 = oSSearchIndexSyncWorker2;
                            iIntValue = ((Number) objG).intValue();
                            List listH0 = CollectionsKt.H0(searchIndexItemsResult.getSearchIndexItems(), iIntValue);
                            arrayList = new ArrayList(kotlin.collections.q.u(listH0, 10));
                            it4 = listH0.iterator();
                            while (it4.hasNext()) {
                                ArrayList arrayList2 = arrayList;
                                arrayList2.add(iu.k.b(p0Var2, null, null, new C0144d((SearchIndexItem) it4.next(), cVar3, oSSearchIndexSyncWorker3, null), 3, null));
                                arrayList = arrayList2;
                                cVar3 = cVar3;
                            }
                            this.A = l.a(p0Var4);
                            this.f9196t = oSSearchIndexSyncWorker3;
                            this.f9197u = l.a(p0Var2);
                            this.f9198v = searchIndexItemsResult;
                            this.f9199w = null;
                            this.f9200x = i14;
                            this.f9201y = iIntValue;
                            this.f9202z = 4;
                            objA2 = iu.f.a(arrayList, this);
                            if (objA2 != objE) {
                                i15 = i14;
                                i16 = iIntValue;
                                searchIndexItemsResult2 = searchIndexItemsResult;
                                p0Var3 = p0Var2;
                                oSSearchIndexSyncWorker4 = oSSearchIndexSyncWorker3;
                                list2 = (List) objA2;
                                ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                                bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                                this.A = l.a(p0Var4);
                                this.f9196t = l.a(p0Var3);
                                this.f9197u = searchIndexItemsResult2;
                                this.f9198v = list2;
                                this.f9200x = i15;
                                this.f9201y = i16;
                                this.f9202z = 5;
                                if (iu.i.g(ioDispatcher, bVar, this) != objE) {
                                    list3 = list2;
                                    searchIndexItemsResult3 = searchIndexItemsResult2;
                                }
                            }
                        }
                        return objE;
                    }
                    if (i17 == 3) {
                        i14 = this.f9200x;
                        SearchIndexItemsResult searchIndexItemsResult4 = (SearchIndexItemsResult) this.f9199w;
                        iu.p0 p0Var6 = (iu.p0) this.f9198v;
                        com.roblox.client.ossearch.c cVar7 = (com.roblox.client.ossearch.c) this.f9197u;
                        OSSearchIndexSyncWorker oSSearchIndexSyncWorker7 = (OSSearchIndexSyncWorker) this.f9196t;
                        o.b(obj);
                        cVar3 = cVar7;
                        oSSearchIndexSyncWorker3 = oSSearchIndexSyncWorker7;
                        p0Var2 = p0Var6;
                        searchIndexItemsResult = searchIndexItemsResult4;
                        objG = obj;
                        iIntValue = ((Number) objG).intValue();
                        List listH1 = CollectionsKt.H0(searchIndexItemsResult.getSearchIndexItems(), iIntValue);
                        arrayList = new ArrayList(kotlin.collections.q.u(listH1, 10));
                        it4 = listH1.iterator();
                        while (it4.hasNext()) {
                            ArrayList arrayList3 = arrayList;
                            arrayList3.add(iu.k.b(p0Var2, null, null, new C0144d((SearchIndexItem) it4.next(), cVar3, oSSearchIndexSyncWorker3, null), 3, null));
                            arrayList = arrayList3;
                            cVar3 = cVar3;
                        }
                        this.A = l.a(p0Var4);
                        this.f9196t = oSSearchIndexSyncWorker3;
                        this.f9197u = l.a(p0Var2);
                        this.f9198v = searchIndexItemsResult;
                        this.f9199w = null;
                        this.f9200x = i14;
                        this.f9201y = iIntValue;
                        this.f9202z = 4;
                        objA2 = iu.f.a(arrayList, this);
                        if (objA2 != objE) {
                            i15 = i14;
                            i16 = iIntValue;
                            searchIndexItemsResult2 = searchIndexItemsResult;
                            p0Var3 = p0Var2;
                            oSSearchIndexSyncWorker4 = oSSearchIndexSyncWorker3;
                            list2 = (List) objA2;
                            ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                            bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                            this.A = l.a(p0Var4);
                            this.f9196t = l.a(p0Var3);
                            this.f9197u = searchIndexItemsResult2;
                            this.f9198v = list2;
                            this.f9200x = i15;
                            this.f9201y = i16;
                            this.f9202z = 5;
                            if (iu.i.g(ioDispatcher, bVar, this) != objE) {
                                list3 = list2;
                                searchIndexItemsResult3 = searchIndexItemsResult2;
                            }
                        }
                        return objE;
                    }
                    if (i17 == 4) {
                        i16 = this.f9201y;
                        i15 = this.f9200x;
                        searchIndexItemsResult2 = (SearchIndexItemsResult) this.f9198v;
                        p0Var3 = (iu.p0) this.f9197u;
                        oSSearchIndexSyncWorker4 = (OSSearchIndexSyncWorker) this.f9196t;
                        o.b(obj);
                        objA2 = obj;
                        list2 = (List) objA2;
                        ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                        bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                        this.A = l.a(p0Var4);
                        this.f9196t = l.a(p0Var3);
                        this.f9197u = searchIndexItemsResult2;
                        this.f9198v = list2;
                        this.f9200x = i15;
                        this.f9201y = i16;
                        this.f9202z = 5;
                        if (iu.i.g(ioDispatcher, bVar, this) != objE) {
                            list3 = list2;
                            searchIndexItemsResult3 = searchIndexItemsResult2;
                        }
                        return objE;
                    }
                    if (i17 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.f9198v;
                    searchIndexItemsResult3 = (SearchIndexItemsResult) this.f9197u;
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
                com.roblox.client.ossearch.a aVar = com.roblox.client.ossearch.a.f9234a;
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
                syncMetrics = new com.roblox.client.ossearch.a.SyncMetrics(size, i10, i11, null, null, list4.size(), 24, null);
                if (h.a().j0()) {
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
                    Integer numD = nt.b.d(i12);
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
                    syncMetrics = com.roblox.client.ossearch.a.SyncMetrics.b(syncMetrics, 0, 0, 0, numD, nt.b.d(i13), 0, 39, null);
                }
                aVar.d(syncMetrics);
                androidx.work.c.a aVarD = androidx.work.c.a.d();
                Intrinsics.checkNotNull(aVarD);
                return aVarD;
                SearchIndexItemsResult searchIndexItemsResult6 = (SearchIndexItemsResult) objA;
                l0 ioDispatcher3 = oSSearchIndexSyncWorker.getIoDispatcher();
                a aVar2 = new a(oSSearchIndexSyncWorker, null);
                this.A = l.a(p0Var4);
                this.f9196t = oSSearchIndexSyncWorker;
                this.f9197u = cVar;
                this.f9198v = p0Var;
                this.f9199w = searchIndexItemsResult6;
                this.f9200x = i14;
                this.f9202z = 2;
                if (iu.i.g(ioDispatcher3, aVar2, this) != objE) {
                    searchIndexItemsResult = searchIndexItemsResult6;
                    p0Var2 = p0Var;
                    cVar2 = cVar;
                    oSSearchIndexSyncWorker2 = oSSearchIndexSyncWorker;
                    l0 ioDispatcher4 = oSSearchIndexSyncWorker2.getIoDispatcher();
                    c cVar8 = new c(oSSearchIndexSyncWorker2, null);
                    this.A = l.a(p0Var4);
                    this.f9196t = oSSearchIndexSyncWorker2;
                    this.f9197u = cVar2;
                    this.f9198v = p0Var2;
                    this.f9199w = searchIndexItemsResult;
                    this.f9200x = i14;
                    this.f9202z = 3;
                    objG = iu.i.g(ioDispatcher4, cVar8, this);
                    if (objG == objE) {
                        cVar3 = cVar2;
                        oSSearchIndexSyncWorker3 = oSSearchIndexSyncWorker2;
                        iIntValue = ((Number) objG).intValue();
                        List listH2 = CollectionsKt.H0(searchIndexItemsResult.getSearchIndexItems(), iIntValue);
                        arrayList = new ArrayList(kotlin.collections.q.u(listH2, 10));
                        it4 = listH2.iterator();
                        while (it4.hasNext()) {
                            ArrayList arrayList4 = arrayList;
                            arrayList4.add(iu.k.b(p0Var2, null, null, new C0144d((SearchIndexItem) it4.next(), cVar3, oSSearchIndexSyncWorker3, null), 3, null));
                            arrayList = arrayList4;
                            cVar3 = cVar3;
                        }
                        this.A = l.a(p0Var4);
                        this.f9196t = oSSearchIndexSyncWorker3;
                        this.f9197u = l.a(p0Var2);
                        this.f9198v = searchIndexItemsResult;
                        this.f9199w = null;
                        this.f9200x = i14;
                        this.f9201y = iIntValue;
                        this.f9202z = 4;
                        objA2 = iu.f.a(arrayList, this);
                        if (objA2 != objE) {
                            i15 = i14;
                            i16 = iIntValue;
                            searchIndexItemsResult2 = searchIndexItemsResult;
                            p0Var3 = p0Var2;
                            oSSearchIndexSyncWorker4 = oSSearchIndexSyncWorker3;
                            list2 = (List) objA2;
                            ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                            bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                            this.A = l.a(p0Var4);
                            this.f9196t = l.a(p0Var3);
                            this.f9197u = searchIndexItemsResult2;
                            this.f9198v = list2;
                            this.f9200x = i15;
                            this.f9201y = i16;
                            this.f9202z = 5;
                            if (iu.i.g(ioDispatcher, bVar, this) != objE) {
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
                                com.roblox.client.ossearch.a aVar3 = com.roblox.client.ossearch.a.f9234a;
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
                                syncMetrics = new com.roblox.client.ossearch.a.SyncMetrics(size2, i10, i11, null, null, list5.size(), 24, null);
                                if (h.a().j0()) {
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
                                    Integer numD2 = nt.b.d(i12);
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
                                    syncMetrics = com.roblox.client.ossearch.a.SyncMetrics.b(syncMetrics, 0, 0, 0, numD2, nt.b.d(i13), 0, 39, null);
                                }
                                aVar3.d(syncMetrics);
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

    @nt.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$nextAllowedSync$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)J"}, k = 3, mv = {2, 2, 0})
    public static final class e extends m implements Function2<iu.p0, lt.b<? super Long>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9215t;

        public e(lt.b<? super e> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return OSSearchIndexSyncWorker.this.new e(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super Long> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9215t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            com.roblox.client.ossearch.b bVar = com.roblox.client.ossearch.b.f9240a;
            Context applicationContext = OSSearchIndexSyncWorker.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return nt.b.e(bVar.c(applicationContext));
        }
    }

    @nt.f(c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$thumbnailCache$1", f = "OSSearchIndexSyncWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Lcom/roblox/client/ossearch/c;", "<anonymous>", "(Liu/p0;)Lcom/roblox/client/ossearch/c;"}, k = 3, mv = {2, 2, 0})
    public static final class f extends m implements Function2<iu.p0, lt.b<? super com.roblox.client.ossearch.c>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9217t;

        public f(lt.b<? super f> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new f(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(iu.p0 p0Var, lt.b<? super com.roblox.client.ossearch.c> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9217t != 0) {
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
        this.clock = b.f9190a;
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
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull lt.b<? super androidx.work.c.a> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.roblox.client.ossearch.OSSearchIndexSyncWorker.c
            if (r0 == 0) goto L13
            r0 = r12
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$c r0 = (com.roblox.client.ossearch.OSSearchIndexSyncWorker.c) r0
            int r1 = r0.f9195x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9195x = r1
            goto L18
        L13:
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$c r0 = new com.roblox.client.ossearch.OSSearchIndexSyncWorker$c
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f9193v
            java.lang.Object r1 = mt.c.e()
            int r2 = r0.f9195x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r0 = r0.f9192u
            com.roblox.client.ossearch.c r0 = (com.roblox.client.ossearch.c) r0
            gt.o.b(r12)
            goto Lb1
        L35:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3d:
            long r4 = r0.f9191t
            gt.o.b(r12)
            goto L99
        L43:
            gt.o.b(r12)
            goto L5a
        L47:
            gt.o.b(r12)
            iu.l0 r12 = r11.ioDispatcher
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$e r2 = new com.roblox.client.ossearch.OSSearchIndexSyncWorker$e
            r2.<init>(r6)
            r0.f9195x = r5
            java.lang.Object r12 = iu.i.g(r12, r2, r0)
            if (r12 != r1) goto L5a
            goto Lb0
        L5a:
            java.lang.Number r12 = (java.lang.Number) r12
            long r7 = r12.longValue()
            kotlin.jvm.functions.Function0<java.lang.Long> r12 = r11.clock
            java.lang.Object r12 = r12.invoke()
            java.lang.Number r12 = (java.lang.Number) r12
            long r9 = r12.longValue()
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r2 = "OSSearchIndexSyncWorker"
            if (r12 >= 0) goto L81
            java.lang.String r12 = "Skipping OS search sync, not yet due"
            ek.q.h(r2, r12)
            androidx.work.c$a r12 = androidx.work.c.a.d()
            java.lang.String r0 = "success(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            return r12
        L81:
            java.lang.String r12 = "Starting OS search index sync"
            ek.q.h(r2, r12)
            iu.l0 r12 = r11.ioDispatcher
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$f r2 = new com.roblox.client.ossearch.OSSearchIndexSyncWorker$f
            r2.<init>(r6)
            r0.f9191t = r7
            r0.f9195x = r4
            java.lang.Object r12 = iu.i.g(r12, r2, r0)
            if (r12 != r1) goto L98
            goto Lb0
        L98:
            r4 = r7
        L99:
            com.roblox.client.ossearch.c r12 = (com.roblox.client.ossearch.c) r12
            com.roblox.client.ossearch.OSSearchIndexSyncWorker$d r2 = new com.roblox.client.ossearch.OSSearchIndexSyncWorker$d
            r2.<init>(r12, r6)
            java.lang.Object r12 = nt.l.a(r12)
            r0.f9192u = r12
            r0.f9191t = r4
            r0.f9195x = r3
            java.lang.Object r12 = iu.q0.g(r2, r0)
            if (r12 != r1) goto Lb1
        Lb0:
            return r1
        Lb1:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.OSSearchIndexSyncWorker.doWork(lt.b):java.lang.Object");
    }
}
