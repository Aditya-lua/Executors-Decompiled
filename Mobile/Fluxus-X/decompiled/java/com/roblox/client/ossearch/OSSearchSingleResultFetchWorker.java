package com.roblox.client.ossearch;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import av.g1;
import av.i;
import av.l0;
import av.q0;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.platform.http.postbody.notifications.SearchResultRequestItem;
import com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody;
import com.roblox.platform.http.returntypes.ossearch.SearchResultIdentifier;
import gu.f;
import gu.l;
import gu.m;
import m2.e;
import ok.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import y5.j;
import y5.p0;
import y5.x;
import y5.z;
import zt.o;
import zt.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR(\u0010\u0017\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Leu/b;)Ljava/lang/Object;", "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "c", "()Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "Lav/l0;", "a", "Lav/l0;", "d", "()Lav/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Lav/l0;)V", "getIoDispatcher$NativeShell_googleProdRelease$annotations", "()V", "ioDispatcher", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OSSearchSingleResultFetchWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public l0 ioDispatcher;

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, PinShortcutHandler.EXTRA_PLACE_ID, BuildConfig.FLAVOR, "b", "(Landroid/content/Context;J)V", "a", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "WORK_NAME", "Ljava/lang/String;", "TAG", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.a(applicationContext).b("fetch_unique_search_result");
        }

        public final void b(@NotNull Context context, long placeId) {
            Intrinsics.checkNotNullParameter(context, "context");
            q.h("OSSearchSingleResultFetchWorker", "Scheduling immediate OS search index sync");
            p0.Companion companion = p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            p0 p0VarA = companion.a(applicationContext);
            j jVar = j.APPEND_OR_REPLACE;
            z.a aVar = new z.a(OSSearchSingleResultFetchWorker.class);
            Pair[] pairArr = {s.a("place_id", Long.valueOf(placeId))};
            androidx.work.b.a aVar2 = new androidx.work.b.a();
            Pair pair = pairArr[0];
            aVar2.b((String) pair.c(), pair.d());
            p0VarA.g("fetch_unique_search_result", jVar, aVar.o(aVar2.a()).k(new y5.d(x.CONNECTED, false, false, true, 6, null)).b());
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker", f = "OSSearchSingleResultFetchWorker.kt", l = {33, 36}, m = "doWork", v = 1)
    public static final class b extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9034t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9035u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9037w;

        public b(eu.b<? super b> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9035u = obj;
            this.f9037w |= Integer.MIN_VALUE;
            return OSSearchSingleResultFetchWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lav/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2", f = "OSSearchSingleResultFetchWorker.kt", l = {43, 45, 47}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<av.p0, eu.b<? super androidx.work.c.a>, Object> {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public int E;
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ com.roblox.client.ossearch.c I;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9038t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9039u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9040v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9041w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9042x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9043y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f9044z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Z"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2$1$1", f = "OSSearchSingleResultFetchWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<av.p0, eu.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9045t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchSingleResultFetchWorker f9046u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ m2.c f9047v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OSSearchSingleResultFetchWorker oSSearchSingleResultFetchWorker, m2.c cVar, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f9046u = oSSearchSingleResultFetchWorker;
                this.f9047v = cVar;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f9046u, this.f9047v, bVar);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(av.p0 p0Var, eu.b<? super Boolean> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                fu.c.e();
                if (this.f9045t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return gu.b.a(e.h(this.f9046u.getApplicationContext(), this.f9047v));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.roblox.client.ossearch.c cVar, eu.b<? super c> bVar) {
            super(2, bVar);
            this.I = cVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = OSSearchSingleResultFetchWorker.this.new c(this.I, bVar);
            cVar.G = obj;
            return cVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super androidx.work.c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x013f A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:8:0x0048, B:45:0x01e8, B:35:0x0139, B:37:0x013f, B:41:0x018d, B:46:0x01fd, B:29:0x00f1), top: B:117:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x0182  */
        /* JADX WARN: Code duplicated, block: B:40:0x0183  */
        /* JADX WARN: Code duplicated, block: B:44:0x01e1  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v27 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v12 */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v19 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Type inference failed for: r5v24 */
        /* JADX WARN: Type inference failed for: r5v25 */
        /* JADX WARN: Type inference failed for: r5v26 */
        /* JADX WARN: Type inference failed for: r5v27 */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v7 */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01e1 -> B:45:0x01e8). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gu.a
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 867
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Lcom/roblox/client/ossearch/c;", "<anonymous>", "(Lav/p0;)Lcom/roblox/client/ossearch/c;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$thumbnailCache$1", f = "OSSearchSingleResultFetchWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<av.p0, eu.b<? super com.roblox.client.ossearch.c>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9048t;

        public d(eu.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super com.roblox.client.ossearch.c> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9048t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return com.roblox.client.ossearch.c.INSTANCE.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSSearchSingleResultFetchWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.ioDispatcher = g1.b();
    }

    public final SingleOSSearchResultPostBody c() {
        Long lValueOf = Long.valueOf(getInputData().f("place_id", -1L));
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return new SingleOSSearchResultPostBody(p001kotlin.collections.o.d(new SearchResultRequestItem(new SearchResultIdentifier(lValueOf))));
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final l0 getIoDispatcher() {
        return this.ioDispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r7 == r1) goto L21;
     */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(@NotNull eu.b<? super androidx.work.c.a> bVar) {
        b bVar2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i10 = bVar2.f9037w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar2.f9037w = i10 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(bVar);
            }
        } else {
            bVar2 = new b(bVar);
        }
        Object objG = bVar2.f9035u;
        Object objE = fu.c.e();
        int i11 = bVar2.f9037w;
        if (i11 != 0) {
            if (i11 == 1) {
                o.b(objG);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(objG);
            }
            Intrinsics.checkNotNullExpressionValue(objG, "coroutineScope(...)");
            return objG;
        }
        o.b(objG);
        q.h("OSSearchSingleResultFetchWorker", "Starting OS search result fetch");
        l0 l0Var = this.ioDispatcher;
        d dVar = new d(null);
        bVar2.f9037w = 1;
        objG = i.g(l0Var, dVar, bVar2);
        if (objG != objE) {
        }
        return objE;
        com.roblox.client.ossearch.c cVar = (com.roblox.client.ossearch.c) objG;
        c cVar2 = new c(cVar, null);
        bVar2.f9034t = l.a(cVar);
        bVar2.f9037w = 2;
        objG = q0.g(cVar2, bVar2);
    }
}
