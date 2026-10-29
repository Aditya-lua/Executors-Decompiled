package com.roblox.client.ossearch;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.C1116b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.platform.http.postbody.notifications.SearchResultRequestItem;
import com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody;
import com.roblox.platform.http.returntypes.ossearch.SearchResultIdentifier;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p283m2.C8410c;
import p283m2.C8412e;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.AbstractC12719p0;
import p536x5.C12694d;
import p536x5.C12738z;
import p536x5.EnumC12706j;
import p536x5.EnumC12734x;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\f\u0010\rR(\u0010\u0017\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m31665d2 = {"Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "c", "()Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;", "Lku/l0;", "a", "Lku/l0;", "d", "()Lku/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Lku/l0;)V", "getIoDispatcher$NativeShell_googleProdRelease$annotations", "()V", "ioDispatcher", "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class OSSearchSingleResultFetchWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public AbstractC7888l0 ioDispatcher;

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", PinShortcutHandler.EXTRA_PLACE_ID, "", "b", "(Landroid/content/Context;J)V", "a", "(Landroid/content/Context;)V", "", "WORK_NAME", "Ljava/lang/String;", "TAG", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15300a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).mo47395b("fetch_unique_search_result");
        }

        /* JADX INFO: renamed from: b */
        public final void m15301b(@NotNull Context context, long placeId) {
            Intrinsics.checkNotNullParameter(context, "context");
            C6124q.m27063h("OSSearchSingleResultFetchWorker", "Scheduling immediate OS search index sync");
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            AbstractC12719p0 abstractC12719p0M47401a = companion.m47401a(applicationContext);
            EnumC12706j enumC12706j = EnumC12706j.APPEND_OR_REPLACE;
            C12738z.a aVar = new C12738z.a(OSSearchSingleResultFetchWorker.class);
            Pair[] pairArr = {C7352s.m30477a("place_id", Long.valueOf(placeId))};
            C1116b.a aVar2 = new C1116b.a();
            Pair pair = pairArr[0];
            aVar2.m6323b((String) pair.m31673c(), pair.m31674d());
            abstractC12719p0M47401a.m47400g("fetch_unique_search_result", enumC12706j, aVar.m47420o(aVar2.m6322a()).m47416k(new C12694d(EnumC12734x.CONNECTED, false, false, true, 6, null)).m47409b());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker", m39664f = "OSSearchSingleResultFetchWorker.kt", m39665l = {34, 37}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3206b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f11923t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f11924u;

        /* JADX INFO: renamed from: w */
        public int f11926w;

        public C3206b(InterfaceC9557b<? super C3206b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11924u = obj;
            this.f11926w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return OSSearchSingleResultFetchWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2", m39664f = "OSSearchSingleResultFetchWorker.kt", m39665l = {44, 46, 48}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3207c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a>, Object> {

        /* JADX INFO: renamed from: A */
        public Object f11927A;

        /* JADX INFO: renamed from: B */
        public Object f11928B;

        /* JADX INFO: renamed from: C */
        public Object f11929C;

        /* JADX INFO: renamed from: D */
        public Object f11930D;

        /* JADX INFO: renamed from: E */
        public int f11931E;

        /* JADX INFO: renamed from: F */
        public int f11932F;

        /* JADX INFO: renamed from: G */
        public /* synthetic */ Object f11933G;

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ C3211c f11935I;

        /* JADX INFO: renamed from: t */
        public Object f11936t;

        /* JADX INFO: renamed from: u */
        public Object f11937u;

        /* JADX INFO: renamed from: v */
        public Object f11938v;

        /* JADX INFO: renamed from: w */
        public Object f11939w;

        /* JADX INFO: renamed from: x */
        public Object f11940x;

        /* JADX INFO: renamed from: y */
        public Object f11941y;

        /* JADX INFO: renamed from: z */
        public Object f11942z;

        /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2$1$1", m39664f = "OSSearchSingleResultFetchWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Boolean>, Object> {

            /* JADX INFO: renamed from: t */
            public int f11943t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ OSSearchSingleResultFetchWorker f11944u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C8410c f11945v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OSSearchSingleResultFetchWorker oSSearchSingleResultFetchWorker, C8410c c8410c, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f11944u = oSSearchSingleResultFetchWorker;
                this.f11945v = c8410c;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f11944u, this.f11945v, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f11943t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return C10340b.m39658a(C8412e.m34107h(this.f11944u.getApplicationContext(), this.f11945v));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3207c(C3211c c3211c, InterfaceC9557b<? super C3207c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f11935I = c3211c;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3207c c3207c = OSSearchSingleResultFetchWorker.this.new C3207c(this.f11935I, interfaceC9557b);
            c3207c.f11933G = obj;
            return c3207c;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x005b */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:119:0x0012 */
        /* JADX DEBUG: Type inference failed for r3v5. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
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
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                r26 = this;
                r1 = r26
                java.lang.Object r0 = r1.f11933G
                ku.p0 r0 = (p256ku.InterfaceC7906p0) r0
                java.lang.Object r2 = p344ot.C10047c.m38805e()
                int r3 = r1.f11932F
                java.lang.String r4 = "getApplicationContext(...)"
                r5 = 3
                r6 = 2
                r8 = 1
                r9 = 0
                if (r3 == 0) goto Lce
                if (r3 == r8) goto La4
                if (r3 == r6) goto L66
                if (r3 != r5) goto L5e
                int r3 = r1.f11931E
                java.lang.Object r8 = r1.f11930D
                zi.e r8 = (p605zi.ThumbnailResult) r8
                java.lang.Object r10 = r1.f11929C
                m2.c r10 = (p283m2.C8410c) r10
                java.lang.Object r10 = r1.f11928B
                com.roblox.platform.http.returntypes.ossearch.SearchIndexItem r10 = (com.roblox.platform.http.returntypes.ossearch.SearchIndexItem) r10
                java.lang.Object r11 = r1.f11927A
                java.util.Iterator r11 = (java.util.Iterator) r11
                java.lang.Object r12 = r1.f11942z
                com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult r12 = (com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult) r12
                java.lang.Object r13 = r1.f11941y
                ku.p0 r13 = (p256ku.InterfaceC7906p0) r13
                java.lang.Object r14 = r1.f11940x
                com.roblox.client.ossearch.OSSearchSingleResultFetchWorker r14 = (com.roblox.client.ossearch.OSSearchSingleResultFetchWorker) r14
                java.lang.Object r15 = r1.f11939w
                com.roblox.client.ossearch.c r15 = (com.roblox.client.ossearch.C3211c) r15
                java.lang.Object r5 = r1.f11938v
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r1.f11937u
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r1.f11936t
                com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody r7 = (com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody) r7
                p229jt.C7348o.m30470b(r27)     // Catch: java.lang.Throwable -> L5b
                r16 = r6
                r6 = r3
                r3 = r12
                r12 = r7
                r7 = r13
                r13 = r11
                r11 = r16
                r16 = r0
                r17 = r4
                r0 = 3
                goto L1e8
            L5b:
                r0 = move-exception
                goto L202
            L5e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L66:
                int r3 = r1.f11931E
                java.lang.Object r5 = r1.f11928B
                com.roblox.platform.http.returntypes.ossearch.SearchIndexItem r5 = (com.roblox.platform.http.returntypes.ossearch.SearchIndexItem) r5
                java.lang.Object r6 = r1.f11927A
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r1.f11942z
                com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult r7 = (com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult) r7
                java.lang.Object r8 = r1.f11941y
                ku.p0 r8 = (p256ku.InterfaceC7906p0) r8
                java.lang.Object r10 = r1.f11940x
                com.roblox.client.ossearch.OSSearchSingleResultFetchWorker r10 = (com.roblox.client.ossearch.OSSearchSingleResultFetchWorker) r10
                java.lang.Object r11 = r1.f11939w
                com.roblox.client.ossearch.c r11 = (com.roblox.client.ossearch.C3211c) r11
                java.lang.Object r12 = r1.f11938v
                java.util.List r12 = (java.util.List) r12
                java.lang.Object r13 = r1.f11937u
                java.util.List r13 = (java.util.List) r13
                java.lang.Object r14 = r1.f11936t
                com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody r14 = (com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody) r14
                p229jt.C7348o.m30470b(r27)     // Catch: java.lang.Throwable -> La0
                r9 = r10
                r10 = r5
                r5 = r12
                r12 = r7
                r7 = r14
                r14 = r9
                r9 = r27
                r16 = r0
                r15 = r11
                r0 = 2
                r11 = r6
                r6 = r13
                r13 = r8
                goto L18d
            La0:
                r0 = move-exception
                r5 = r12
                goto L202
            La4:
                int r3 = r1.f11931E
                java.lang.Object r5 = r1.f11941y
                ku.p0 r5 = (p256ku.InterfaceC7906p0) r5
                java.lang.Object r6 = r1.f11940x
                com.roblox.client.ossearch.OSSearchSingleResultFetchWorker r6 = (com.roblox.client.ossearch.OSSearchSingleResultFetchWorker) r6
                java.lang.Object r7 = r1.f11939w
                com.roblox.client.ossearch.c r7 = (com.roblox.client.ossearch.C3211c) r7
                java.lang.Object r8 = r1.f11938v
                java.util.List r8 = (java.util.List) r8
                java.lang.Object r10 = r1.f11937u
                java.util.List r10 = (java.util.List) r10
                java.lang.Object r11 = r1.f11936t
                com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody r11 = (com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody) r11
                p229jt.C7348o.m30470b(r27)     // Catch: java.lang.Throwable -> Lca
                r12 = r11
                r11 = r10
                r10 = r7
                r7 = r6
                r6 = r5
                r5 = r3
                r3 = r27
                goto L128
            Lca:
                r0 = move-exception
                r5 = r8
                goto L202
            Lce:
                p229jt.C7348o.m30470b(r27)
                com.roblox.client.ossearch.OSSearchSingleResultFetchWorker r3 = com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.this
                com.roblox.platform.http.postbody.notifications.SingleOSSearchResultPostBody r11 = com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.m15297b(r3)
                if (r11 != 0) goto Lde
                androidx.work.c$a r0 = androidx.work.AbstractC1117c.a.m6339a()
                return r0
            Lde:
                com.roblox.client.ossearch.a r3 = com.roblox.client.ossearch.C3209a.f11947a
                r3.m15308g()
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                com.roblox.client.ossearch.c r7 = r1.f11935I
                com.roblox.client.ossearch.OSSearchSingleResultFetchWorker r6 = com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.this
                jt.n$a r3 = p229jt.C7347n.INSTANCE     // Catch: java.lang.Throwable -> L5b
                vk.d r3 = p493vk.C12225g.m45326d()     // Catch: java.lang.Throwable -> L5b
                zk.j r3 = r3.mo45321g()     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r12 = pt.C10350l.m39676a(r0)     // Catch: java.lang.Throwable -> L5b
                r1.f11933G = r12     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r12 = pt.C10350l.m39676a(r11)     // Catch: java.lang.Throwable -> L5b
                r1.f11936t = r12     // Catch: java.lang.Throwable -> L5b
                r1.f11937u = r10     // Catch: java.lang.Throwable -> L5b
                r1.f11938v = r5     // Catch: java.lang.Throwable -> L5b
                r1.f11939w = r7     // Catch: java.lang.Throwable -> L5b
                r1.f11940x = r6     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r12 = pt.C10350l.m39676a(r0)     // Catch: java.lang.Throwable -> L5b
                r1.f11941y = r12     // Catch: java.lang.Throwable -> L5b
                r1.f11931E = r9     // Catch: java.lang.Throwable -> L5b
                r1.f11932F = r8     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r3 = r3.m50311b(r11, r1)     // Catch: java.lang.Throwable -> L5b
                if (r3 != r2) goto L121
                goto L1e0
            L121:
                r8 = r5
                r5 = r9
                r12 = r11
                r11 = r10
                r10 = r7
                r7 = r6
                r6 = r0
            L128:
                com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult r3 = (com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult) r3     // Catch: java.lang.Throwable -> Lca
                java.util.List r13 = r3.getItems()     // Catch: java.lang.Throwable -> Lca
                java.util.Iterator r13 = r13.iterator()     // Catch: java.lang.Throwable -> Lca
                r25 = r6
                r6 = r5
                r5 = r8
                r8 = r7
                r7 = r25
            L139:
                boolean r14 = r13.hasNext()     // Catch: java.lang.Throwable -> L5b
                if (r14 == 0) goto L1fd
                java.lang.Object r14 = r13.next()     // Catch: java.lang.Throwable -> L5b
                com.roblox.platform.http.returntypes.ossearch.SearchIndexItem r14 = (com.roblox.platform.http.returntypes.ossearch.SearchIndexItem) r14     // Catch: java.lang.Throwable -> L5b
                ku.l0 r15 = r8.getIoDispatcher()     // Catch: java.lang.Throwable -> L5b
                android.content.Context r9 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L5b
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r4)     // Catch: java.lang.Throwable -> L5b
                r16 = r0
                java.lang.Object r0 = pt.C10350l.m39676a(r16)     // Catch: java.lang.Throwable -> L5b
                r1.f11933G = r0     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r0 = pt.C10350l.m39676a(r12)     // Catch: java.lang.Throwable -> L5b
                r1.f11936t = r0     // Catch: java.lang.Throwable -> L5b
                r1.f11937u = r11     // Catch: java.lang.Throwable -> L5b
                r1.f11938v = r5     // Catch: java.lang.Throwable -> L5b
                r1.f11939w = r10     // Catch: java.lang.Throwable -> L5b
                r1.f11940x = r8     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r0 = pt.C10350l.m39676a(r7)     // Catch: java.lang.Throwable -> L5b
                r1.f11941y = r0     // Catch: java.lang.Throwable -> L5b
                r1.f11942z = r3     // Catch: java.lang.Throwable -> L5b
                r1.f11927A = r13     // Catch: java.lang.Throwable -> L5b
                r1.f11928B = r14     // Catch: java.lang.Throwable -> L5b
                r0 = 0
                r1.f11929C = r0     // Catch: java.lang.Throwable -> L5b
                r1.f11930D = r0     // Catch: java.lang.Throwable -> L5b
                r1.f11931E = r6     // Catch: java.lang.Throwable -> L5b
                r0 = 2
                r1.f11932F = r0     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r9 = p605zi.C13813a.m50295c(r14, r10, r15, r9, r1)     // Catch: java.lang.Throwable -> L5b
                if (r9 != r2) goto L183
                goto L1e0
            L183:
                r15 = r12
                r12 = r3
                r3 = r6
                r6 = r11
                r11 = r13
                r13 = r7
                r7 = r15
                r15 = r10
                r10 = r14
                r14 = r8
            L18d:
                r8 = r9
                zi.e r8 = (p605zi.ThumbnailResult) r8     // Catch: java.lang.Throwable -> L5b
                android.graphics.Bitmap r9 = r8.getBitmap()     // Catch: java.lang.Throwable -> L5b
                android.content.Context r0 = r14.getApplicationContext()     // Catch: java.lang.Throwable -> L5b
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)     // Catch: java.lang.Throwable -> L5b
                m2.c r0 = p605zi.C13813a.m50296d(r10, r9, r0)     // Catch: java.lang.Throwable -> L5b
                ku.l0 r9 = r14.getIoDispatcher()     // Catch: java.lang.Throwable -> L5b
                r17 = r4
                com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$c$a r4 = new com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$c$a     // Catch: java.lang.Throwable -> L5b
                r27 = r7
                r7 = 0
                r4.<init>(r14, r0, r7)     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r7 = pt.C10350l.m39676a(r16)     // Catch: java.lang.Throwable -> L5b
                r1.f11933G = r7     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r7 = pt.C10350l.m39676a(r27)     // Catch: java.lang.Throwable -> L5b
                r1.f11936t = r7     // Catch: java.lang.Throwable -> L5b
                r1.f11937u = r6     // Catch: java.lang.Throwable -> L5b
                r1.f11938v = r5     // Catch: java.lang.Throwable -> L5b
                r1.f11939w = r15     // Catch: java.lang.Throwable -> L5b
                r1.f11940x = r14     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r7 = pt.C10350l.m39676a(r13)     // Catch: java.lang.Throwable -> L5b
                r1.f11941y = r7     // Catch: java.lang.Throwable -> L5b
                r1.f11942z = r12     // Catch: java.lang.Throwable -> L5b
                r1.f11927A = r11     // Catch: java.lang.Throwable -> L5b
                r1.f11928B = r10     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r0 = pt.C10350l.m39676a(r0)     // Catch: java.lang.Throwable -> L5b
                r1.f11929C = r0     // Catch: java.lang.Throwable -> L5b
                r1.f11930D = r8     // Catch: java.lang.Throwable -> L5b
                r1.f11931E = r3     // Catch: java.lang.Throwable -> L5b
                r0 = 3
                r1.f11932F = r0     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r4 = p256ku.C7872i.m32684g(r9, r4, r1)     // Catch: java.lang.Throwable -> L5b
                if (r4 != r2) goto L1e1
            L1e0:
                return r2
            L1e1:
                r7 = r13
                r13 = r11
                r11 = r6
                r6 = r3
                r3 = r12
                r12 = r27
            L1e8:
                r4 = r11
                java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L5b
                r4.add(r10)     // Catch: java.lang.Throwable -> L5b
                r4 = r5
                java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.lang.Throwable -> L5b
                r4.add(r8)     // Catch: java.lang.Throwable -> L5b
                r8 = r14
                r10 = r15
                r0 = r16
                r4 = r17
                r9 = 0
                goto L139
            L1fd:
                java.lang.Object r0 = p229jt.C7347n.m30460b(r3)     // Catch: java.lang.Throwable -> L5b
                goto L20c
            L202:
                jt.n$a r2 = p229jt.C7347n.INSTANCE
                java.lang.Object r0 = p229jt.C7348o.m30469a(r0)
                java.lang.Object r0 = p229jt.C7347n.m30460b(r0)
            L20c:
                java.lang.Throwable r2 = p229jt.C7347n.m30463e(r0)
                java.lang.String r3 = "OSSearchSingleResultFetchWorker"
                if (r2 != 0) goto L349
                com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult r0 = (com.roblox.platform.http.returntypes.ossearch.SearchSingleItemResult) r0
                java.util.List r2 = r0.getItems()
                int r2 = r2.size()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r6 = "OS search result fetch completed. Set "
                r4.append(r6)
                r4.append(r2)
                java.lang.String r2 = " shortcuts."
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                p151gk.C6124q.m27063h(r3, r2)
                com.roblox.client.ossearch.a r2 = com.roblox.client.ossearch.C3209a.f11947a
                java.util.List r3 = r0.getItems()
                int r7 = r3.size()
                java.util.List r3 = r0.getItems()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                boolean r4 = r3 instanceof java.util.Collection
                if (r4 == 0) goto L256
                r4 = r3
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L256
                r8 = 0
                goto L27a
            L256:
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
            L25b:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L279
                java.lang.Object r6 = r3.next()
                com.roblox.platform.http.returntypes.ossearch.SearchIndexItem r6 = (com.roblox.platform.http.returntypes.ossearch.SearchIndexItem) r6
                java.lang.String r6 = r6.getThumbnailUrl()
                int r6 = r6.length()
                if (r6 <= 0) goto L25b
                int r4 = r4 + 1
                if (r4 >= 0) goto L25b
                kotlin.collections.C7699p.m31900s()
                goto L25b
            L279:
                r8 = r4
            L27a:
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                boolean r3 = r5 instanceof java.util.Collection
                if (r3 == 0) goto L28b
                r4 = r5
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L28b
                r9 = 0
                goto L2b1
            L28b:
                java.util.Iterator r4 = r5.iterator()
                r6 = 0
            L290:
                boolean r9 = r4.hasNext()
                if (r9 == 0) goto L2b0
                java.lang.Object r9 = r4.next()
                zi.e r9 = (p605zi.ThumbnailResult) r9
                boolean r10 = r9.getFromCache()
                if (r10 != 0) goto L290
                android.graphics.Bitmap r9 = r9.getBitmap()
                if (r9 == 0) goto L290
                int r6 = r6 + 1
                if (r6 >= 0) goto L290
                kotlin.collections.C7699p.m31900s()
                goto L290
            L2b0:
                r9 = r6
            L2b1:
                java.util.List r0 = r0.getItems()
                int r12 = r0.size()
                com.roblox.client.ossearch.a$a r16 = new com.roblox.client.ossearch.a$a
                r10 = 0
                r11 = 0
                r13 = 24
                r14 = 0
                r6 = r16
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
                th.i r0 = th.C11659h.m43403a()
                boolean r0 = r0.mo43646i0()
                if (r0 == 0) goto L33f
                if (r3 == 0) goto L2dc
                r0 = r5
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L2dc
                r4 = 0
                goto L2fb
            L2dc:
                java.util.Iterator r0 = r5.iterator()
                r4 = 0
            L2e1:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L2fb
                java.lang.Object r6 = r0.next()
                zi.e r6 = (p605zi.ThumbnailResult) r6
                boolean r6 = r6.getFromCache()
                if (r6 == 0) goto L2e1
                int r4 = r4 + 1
                if (r4 >= 0) goto L2e1
                kotlin.collections.C7699p.m31900s()
                goto L2e1
            L2fb:
                java.lang.Integer r20 = pt.C10340b.m39661d(r4)
                if (r3 == 0) goto L30c
                r0 = r5
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L30c
                r9 = 0
                goto L32b
            L30c:
                java.util.Iterator r0 = r5.iterator()
                r9 = 0
            L311:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L32b
                java.lang.Object r3 = r0.next()
                zi.e r3 = (p605zi.ThumbnailResult) r3
                android.graphics.Bitmap r3 = r3.getBitmap()
                if (r3 != 0) goto L311
                int r9 = r9 + 1
                if (r9 >= 0) goto L311
                kotlin.collections.C7699p.m31900s()
                goto L311
            L32b:
                java.lang.Integer r21 = pt.C10340b.m39661d(r9)
                r23 = 39
                r24 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r22 = 0
                com.roblox.client.ossearch.a$a r16 = com.roblox.client.ossearch.C3209a.SyncMetrics.m15309b(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            L33f:
                r0 = r16
                r2.m15307f(r0)
                androidx.work.c$a r0 = androidx.work.AbstractC1117c.a.m6342d()
                goto L36e
            L349:
                boolean r0 = r2 instanceof java.util.concurrent.CancellationException
                if (r0 == 0) goto L352
                androidx.work.c$a r0 = androidx.work.AbstractC1117c.a.m6339a()
                goto L36e
            L352:
                java.lang.String r0 = r2.getMessage()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Error fetching OS search results: "
                r2.append(r4)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                p151gk.C6124q.m27060e(r3, r0)
                androidx.work.c$a r0 = androidx.work.AbstractC1117c.a.m6341c()
            L36e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker.C3207c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
            return ((C3207c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lcom/roblox/client/ossearch/c;", "<anonymous>", "(Lku/p0;)Lcom/roblox/client/ossearch/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$thumbnailCache$1", m39664f = "OSSearchSingleResultFetchWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3208d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C3211c>, Object> {

        /* JADX INFO: renamed from: t */
        public int f11946t;

        public C3208d(InterfaceC9557b<? super C3208d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3208d(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f11946t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C3211c.INSTANCE.m15336a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C3211c> interfaceC9557b) {
            return ((C3208d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSSearchSingleResultFetchWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.ioDispatcher = C7864g1.m32644b();
    }

    /* JADX INFO: renamed from: c */
    public final SingleOSSearchResultPostBody m15298c() {
        Long lValueOf = Long.valueOf(getInputData().m6317f("place_id", -1L));
        if (lValueOf.longValue() <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            return new SingleOSSearchResultPostBody(C7697o.m31878d(new SearchResultRequestItem(new SearchResultIdentifier(lValueOf))));
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final AbstractC7888l0 getIoDispatcher() {
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
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
        C3206b c3206b;
        if (interfaceC9557b instanceof C3206b) {
            c3206b = (C3206b) interfaceC9557b;
            int i10 = c3206b.f11926w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3206b.f11926w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3206b = new C3206b(interfaceC9557b);
            }
        } else {
            c3206b = new C3206b(interfaceC9557b);
        }
        Object objM32684g = c3206b.f11924u;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3206b.f11926w;
        if (i11 != 0) {
            if (i11 == 1) {
                C7348o.m30470b(objM32684g);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objM32684g);
            }
            Intrinsics.checkNotNullExpressionValue(objM32684g, "coroutineScope(...)");
            return objM32684g;
        }
        C7348o.m30470b(objM32684g);
        C6124q.m27063h("OSSearchSingleResultFetchWorker", "Starting OS search result fetch");
        AbstractC7888l0 abstractC7888l0 = this.ioDispatcher;
        C3208d c3208d = new C3208d(null);
        c3206b.f11926w = 1;
        objM32684g = C7872i.m32684g(abstractC7888l0, c3208d, c3206b);
        if (objM32684g != objM38805e) {
        }
        return objM38805e;
        C3211c c3211c = (C3211c) objM32684g;
        C3207c c3207c = new C3207c(c3211c, null);
        c3206b.f11923t = C10350l.m39676a(c3211c);
        c3206b.f11926w = 2;
        objM32684g = C7910q0.m32891g(c3207c, c3206b);
    }
}
