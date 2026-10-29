package com.roblox.client.ossearch;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.platform.http.postbody.notifications.SearchResultRequestItem;
import com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody;
import com.roblox.platform.http.returntypes.ossearch.SearchResultIdentifier;
import gk.p;
import jt.o;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import m2.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.f;
import pt.m;
import x5.j;
import x5.p0;
import x5.x;
import x5.z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR(\u0010\u0017\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "c", "()Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "Lku/l0;", "a", "Lku/l0;", "d", "()Lku/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Lku/l0;)V", "getIoDispatcher$NativeShell_googleProdRelease$annotations", "()V", "ioDispatcher", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OSSearchSingleResultFetchWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public l0 ioDispatcher;

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", PinShortcutHandler.EXTRA_PLACE_ID, "", "b", "(Landroid/content/Context;J)V", "a", "(Landroid/content/Context;)V", "", "WORK_NAME", "Ljava/lang/String;", "TAG", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            p.h("OSSearchSingleResultFetchWorker", "Scheduling immediate OS search index sync");
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
            p0VarA.g("fetch_unique_search_result", jVar, aVar.o(aVar2.a()).k(new x5.d(x.CONNECTED, false, false, true, 6, null)).b());
        }

        public Companion() {
        }
    }

    @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker", f = "OSSearchSingleResultFetchWorker.kt", l = {34, 37}, m = "doWork", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9146t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f9147u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f9149w;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f9147u = obj;
            this.f9149w |= Integer.MIN_VALUE;
            return OSSearchSingleResultFetchWorker.this.doWork(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2", f = "OSSearchSingleResultFetchWorker.kt", l = {44, 46, 48}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<ku.p0, nt.b<? super androidx.work.c.a>, Object> {
        public Object A;
        public Object B;
        public Object C;
        public Object D;
        public int E;
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ com.roblox.client.ossearch.c I;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f9150t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f9151u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f9152v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f9153w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f9154x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f9155y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f9156z;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, k = 3, mv = {2, 2, 0})
        @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2$1$1", f = "OSSearchSingleResultFetchWorker.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends m implements Function2<ku.p0, nt.b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f9157t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ OSSearchSingleResultFetchWorker f9158u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ m2.c f9159v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OSSearchSingleResultFetchWorker oSSearchSingleResultFetchWorker, m2.c cVar, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f9158u = oSSearchSingleResultFetchWorker;
                this.f9159v = cVar;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f9158u, this.f9159v, bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                ot.c.e();
                if (this.f9157t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
                return pt.b.a(e.h(this.f9158u.getApplicationContext(), this.f9159v));
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ku.p0 p0Var, nt.b<? super Boolean> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.roblox.client.ossearch.c cVar, nt.b<? super c> bVar) {
            super(2, bVar);
            this.I = cVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = OSSearchSingleResultFetchWorker.this.new c(this.I, bVar);
            cVar.G = obj;
            return cVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x013f A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:8:0x0048, B:45:0x01e8, B:35:0x0139, B:37:0x013f, B:41:0x018d, B:46:0x01fd, B:29:0x00f1), top: B:119:0x0012 }] */
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
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instruction units count: 879
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super androidx.work.c.a> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Lcom/roblox/client/ossearch/c;", "<anonymous>", "(Lku/p0;)Lcom/roblox/client/ossearch/c;"}, k = 3, mv = {2, 2, 0})
    @f(c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$thumbnailCache$1", f = "OSSearchSingleResultFetchWorker.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<ku.p0, nt.b<? super com.roblox.client.ossearch.c>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9160t;

        public d(nt.b<? super d> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9160t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            return com.roblox.client.ossearch.c.INSTANCE.a();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku.p0 p0Var, nt.b<? super com.roblox.client.ossearch.c> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
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
            return new SingleOSSearchResultPostBody(kotlin.collections.o.d(new SearchResultRequestItem(new SearchResultIdentifier(lValueOf))));
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
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull nt.b<? super androidx.work.c.a> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.b
            if (r0 == 0) goto L13
            r0 = r7
            com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$b r0 = (com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.b) r0
            int r1 = r0.f9149w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9149w = r1
            goto L18
        L13:
            com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$b r0 = new com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9147u
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f9149w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.f9146t
            com.roblox.client.ossearch.c r0 = (com.roblox.client.ossearch.c) r0
            jt.o.b(r7)
            goto L6d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            jt.o.b(r7)
            goto L57
        L3d:
            jt.o.b(r7)
            java.lang.String r7 = "OSSearchSingleResultFetchWorker"
            java.lang.String r2 = "Starting OS search result fetch"
            gk.p.h(r7, r2)
            ku.l0 r7 = r6.ioDispatcher
            com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$d r2 = new com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$d
            r2.<init>(r3)
            r0.f9149w = r5
            java.lang.Object r7 = ku.i.g(r7, r2, r0)
            if (r7 != r1) goto L57
            goto L6c
        L57:
            com.roblox.client.ossearch.c r7 = (com.roblox.client.ossearch.c) r7
            com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$c r2 = new com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$c
            r2.<init>(r7, r3)
            java.lang.Object r7 = pt.l.a(r7)
            r0.f9146t = r7
            r0.f9149w = r4
            java.lang.Object r7 = ku.q0.g(r2, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            java.lang.String r0 = "coroutineScope(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.doWork(nt.b):java.lang.Object");
    }
}
