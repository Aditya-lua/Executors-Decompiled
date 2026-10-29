package com.roblox.client.ossearch;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItem;
import com.roblox.platform.http.returntypes.ossearch.SearchIndexItemsResult;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7352s;
import p256ku.AbstractC7888l0;
import p256ku.C7857f;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p283m2.C8410c;
import p283m2.C8412e;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p493vk.C12225g;
import p536x5.AbstractC12719p0;
import p536x5.C12694d;
import p536x5.C12701g0;
import p536x5.C12738z;
import p536x5.EnumC12704i;
import p536x5.EnumC12706j;
import p536x5.EnumC12734x;
import p605zi.C13813a;
import p605zi.ThumbnailResult;
import p607zk.InterfaceC13830j;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR(\u0010\u0014\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m31665d2 = {"Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "Lku/l0;", "a", "Lku/l0;", "c", "()Lku/l0;", "setIoDispatcher$NativeShell_googleProdRelease", "(Lku/l0;)V", "getIoDispatcher$NativeShell_googleProdRelease$annotations", "()V", "ioDispatcher", "Lkotlin/Function0;", "", "b", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "setClock$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "getClock$NativeShell_googleProdRelease$annotations", "clock", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class OSSearchIndexSyncWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public AbstractC7888l0 ioDispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function0<Long> clock;

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m31665d2 = {"Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)V", "d", "b", "a", "", "PERIODIC_SYNC_WORK_NAME", "Ljava/lang/String;", "IMMEDIATE_SYNC_WORK_NAME", "TAG", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.ossearch.OSSearchIndexSyncWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15292a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).mo47395b("fetch_search_results");
        }

        /* JADX INFO: renamed from: b */
        public final void m15293b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).mo47395b("periodic_fetch_search_results");
        }

        /* JADX INFO: renamed from: c */
        public final void m15294c(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C6124q.m27063h("OSSearchIndexSyncWorker", "Scheduling immediate OS search index sync");
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).m47400g("fetch_search_results", EnumC12706j.KEEP, new C12738z.a(OSSearchIndexSyncWorker.class).m47416k(new C12694d(EnumC12734x.CONNECTED, false, true, true, 2, null)).m47409b());
        }

        /* JADX INFO: renamed from: d */
        public final void m15295d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C6124q.m27063h("OSSearchIndexSyncWorker", "Scheduling periodic OS search index sync");
            Duration durationOfDays = Duration.ofDays(1L);
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            AbstractC12719p0 abstractC12719p0M47401a = companion.m47401a(applicationContext);
            EnumC12704i enumC12704i = EnumC12704i.KEEP;
            Intrinsics.checkNotNull(durationOfDays);
            abstractC12719p0M47401a.mo47398e("periodic_fetch_search_results", enumC12704i, new C12701g0.a(OSSearchIndexSyncWorker.class, durationOfDays).m47416k(new C12694d(EnumC12734x.CONNECTED, false, true, true, 2, null)).m47409b());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3200b extends C7744k implements Function0<Long> {

        /* JADX INFO: renamed from: a */
        public static final C3200b f11890a = new C3200b();

        public C3200b() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$c */
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker", m39664f = "OSSearchIndexSyncWorker.kt", m39665l = {36, 44, 47}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3201c extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public long f11891t;

        /* JADX INFO: renamed from: u */
        public Object f11892u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f11893v;

        /* JADX INFO: renamed from: x */
        public int f11895x;

        public C3201c(InterfaceC9557b<? super C3201c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11893v = obj;
            this.f11895x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return OSSearchIndexSyncWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$d */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2", m39664f = "OSSearchIndexSyncWorker.kt", m39665l = {50, 51, 54, 68, 69}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3202d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a>, Object> {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f11896A;

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ C3211c f11898C;

        /* JADX INFO: renamed from: t */
        public Object f11899t;

        /* JADX INFO: renamed from: u */
        public Object f11900u;

        /* JADX INFO: renamed from: v */
        public Object f11901v;

        /* JADX INFO: renamed from: w */
        public Object f11902w;

        /* JADX INFO: renamed from: x */
        public int f11903x;

        /* JADX INFO: renamed from: y */
        public int f11904y;

        /* JADX INFO: renamed from: z */
        public int f11905z;

        /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$d$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$1", m39664f = "OSSearchIndexSyncWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f11906t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ OSSearchIndexSyncWorker f11907u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f11907u = oSSearchIndexSyncWorker;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f11907u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f11906t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                C8412e.m34108i(this.f11907u.getApplicationContext());
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$d$b */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$2", m39664f = "OSSearchIndexSyncWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: t */
            public int f11908t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ OSSearchIndexSyncWorker f11909u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ List<Pair<C8410c, ThumbnailResult>> f11910v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ SearchIndexItemsResult f11911w;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends kotlin.Pair<? extends m2.c, zi.e>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, List<? extends Pair<? extends C8410c, ThumbnailResult>> list, SearchIndexItemsResult searchIndexItemsResult, InterfaceC9557b<? super b> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f11909u = oSSearchIndexSyncWorker;
                this.f11910v = list;
                this.f11911w = searchIndexItemsResult;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new b(this.f11909u, this.f11910v, this.f11911w, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f11908t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                Context applicationContext = this.f11909u.getApplicationContext();
                List<Pair<C8410c, ThumbnailResult>> list = this.f11910v;
                ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((C8410c) ((Pair) it.next()).m31673c());
                }
                C8412e.m34112m(applicationContext, arrayList);
                C3210b c3210b = C3210b.f11954a;
                Context applicationContext2 = this.f11909u.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                c3210b.m15323d(applicationContext2, this.f11909u.m15290b().invoke().longValue() + (((long) this.f11911w.getRefreshIntervalSeconds()) * 1000));
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$d$c */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)I"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$availableShortcuts$1", m39664f = "OSSearchIndexSyncWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Integer>, Object> {

            /* JADX INFO: renamed from: t */
            public int f11912t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ OSSearchIndexSyncWorker f11913u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(OSSearchIndexSyncWorker oSSearchIndexSyncWorker, InterfaceC9557b<? super c> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f11913u = oSSearchIndexSyncWorker;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new c(this.f11913u, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f11912t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                Context applicationContext = this.f11913u.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return C10340b.m39661d(C13813a.m50293a(applicationContext));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Integer> interfaceC9557b) {
                return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$d$d */
        @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31665d2 = {"Lku/p0;", "Lkotlin/Pair;", "Lm2/c;", "Lzi/e;", "<anonymous>", "(Lku/p0;)Lkotlin/Pair;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$2$1$indexResults$1$1", m39664f = "OSSearchIndexSyncWorker.kt", m39665l = {61}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Pair<? extends C8410c, ? extends ThumbnailResult>>, Object> {

            /* JADX INFO: renamed from: t */
            public int f11914t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ SearchIndexItem f11915u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ C3211c f11916v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ OSSearchIndexSyncWorker f11917w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SearchIndexItem searchIndexItem, C3211c c3211c, OSSearchIndexSyncWorker oSSearchIndexSyncWorker, InterfaceC9557b<? super d> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f11915u = searchIndexItem;
                this.f11916v = c3211c;
                this.f11917w = oSSearchIndexSyncWorker;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new d(this.f11915u, this.f11916v, this.f11917w, interfaceC9557b);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Pair<? extends C8410c, ? extends ThumbnailResult>> interfaceC9557b) {
                return invoke2(interfaceC7906p0, (InterfaceC9557b<? super Pair<? extends C8410c, ThumbnailResult>>) interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f11914t;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    SearchIndexItem searchIndexItem = this.f11915u;
                    C3211c c3211c = this.f11916v;
                    AbstractC7888l0 ioDispatcher = this.f11917w.getIoDispatcher();
                    Context applicationContext = this.f11917w.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    this.f11914t = 1;
                    obj = C13813a.m50295c(searchIndexItem, c3211c, ioDispatcher, applicationContext, this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                ThumbnailResult thumbnailResult = (ThumbnailResult) obj;
                SearchIndexItem searchIndexItem2 = this.f11915u;
                Bitmap bitmap = thumbnailResult.getBitmap();
                Context applicationContext2 = this.f11917w.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                return C7352s.m30477a(C13813a.m50296d(searchIndexItem2, bitmap, applicationContext2), thumbnailResult);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Pair<? extends C8410c, ThumbnailResult>> interfaceC9557b) {
                return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3202d(C3211c c3211c, InterfaceC9557b<? super C3202d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f11898C = c3211c;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3202d c3202d = OSSearchIndexSyncWorker.this.new C3202d(this.f11898C, interfaceC9557b);
            c3202d.f11896A = obj;
            return c3202d;
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
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM30460b;
            Throwable thM30463e;
            List<SearchIndexItem> searchIndexItems;
            Iterator<T> it;
            int i10;
            List<Pair> list;
            boolean z10;
            int i11;
            C3209a.SyncMetrics syncMetrics;
            Iterator it2;
            int i12;
            Iterator it3;
            int i13;
            Object objM50315f;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker;
            int i14;
            C3211c c3211c;
            InterfaceC7906p0 interfaceC7906p0;
            SearchIndexItemsResult searchIndexItemsResult;
            InterfaceC7906p0 interfaceC7906p1;
            C3211c c3211c2;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker2;
            Object objM32684g;
            C3211c c3211c3;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker3;
            int iIntValue;
            ArrayList arrayList;
            Iterator it4;
            Object objM32632a;
            int i15;
            int i16;
            SearchIndexItemsResult searchIndexItemsResult2;
            InterfaceC7906p0 interfaceC7906p2;
            OSSearchIndexSyncWorker oSSearchIndexSyncWorker4;
            List list2;
            AbstractC7888l0 ioDispatcher;
            b bVar;
            List list3;
            SearchIndexItemsResult searchIndexItemsResult3;
            InterfaceC7906p0 interfaceC7906p3 = (InterfaceC7906p0) this.f11896A;
            Object objM38805e = C10047c.m38805e();
            int i17 = this.f11905z;
            try {
                if (i17 == 0) {
                    C7348o.m30470b(obj);
                    C3209a.f11947a.m15306e();
                    OSSearchIndexSyncWorker oSSearchIndexSyncWorker5 = OSSearchIndexSyncWorker.this;
                    C3211c c3211c4 = this.f11898C;
                    C7347n.Companion companion = C7347n.INSTANCE;
                    InterfaceC13830j interfaceC13830jMo45321g = C12225g.m45326d().mo45321g();
                    this.f11896A = C10350l.m39676a(interfaceC7906p3);
                    this.f11899t = oSSearchIndexSyncWorker5;
                    this.f11900u = c3211c4;
                    this.f11901v = interfaceC7906p3;
                    this.f11903x = 0;
                    this.f11905z = 1;
                    objM50315f = interfaceC13830jMo45321g.m50315f(this);
                    if (objM50315f != objM38805e) {
                        oSSearchIndexSyncWorker = oSSearchIndexSyncWorker5;
                        i14 = 0;
                        c3211c = c3211c4;
                        interfaceC7906p0 = interfaceC7906p3;
                    }
                    return objM38805e;
                }
                if (i17 == 1) {
                    i14 = this.f11903x;
                    InterfaceC7906p0 interfaceC7906p4 = (InterfaceC7906p0) this.f11901v;
                    C3211c c3211c5 = (C3211c) this.f11900u;
                    OSSearchIndexSyncWorker oSSearchIndexSyncWorker6 = (OSSearchIndexSyncWorker) this.f11899t;
                    C7348o.m30470b(obj);
                    oSSearchIndexSyncWorker = oSSearchIndexSyncWorker6;
                    c3211c = c3211c5;
                    interfaceC7906p0 = interfaceC7906p4;
                    objM50315f = obj;
                } else {
                    if (i17 == 2) {
                        i14 = this.f11903x;
                        searchIndexItemsResult = (SearchIndexItemsResult) this.f11902w;
                        interfaceC7906p1 = (InterfaceC7906p0) this.f11901v;
                        c3211c2 = (C3211c) this.f11900u;
                        oSSearchIndexSyncWorker2 = (OSSearchIndexSyncWorker) this.f11899t;
                        C7348o.m30470b(obj);
                        AbstractC7888l0 ioDispatcher2 = oSSearchIndexSyncWorker2.getIoDispatcher();
                        c cVar = new c(oSSearchIndexSyncWorker2, null);
                        this.f11896A = C10350l.m39676a(interfaceC7906p3);
                        this.f11899t = oSSearchIndexSyncWorker2;
                        this.f11900u = c3211c2;
                        this.f11901v = interfaceC7906p1;
                        this.f11902w = searchIndexItemsResult;
                        this.f11903x = i14;
                        this.f11905z = 3;
                        objM32684g = C7872i.m32684g(ioDispatcher2, cVar, this);
                        if (objM32684g == objM38805e) {
                            c3211c3 = c3211c2;
                            oSSearchIndexSyncWorker3 = oSSearchIndexSyncWorker2;
                            iIntValue = ((Number) objM32684g).intValue();
                            List listH0 = CollectionsKt.m31682H0(searchIndexItemsResult.getSearchIndexItems(), iIntValue);
                            arrayList = new ArrayList(C7701q.m31905u(listH0, 10));
                            it4 = listH0.iterator();
                            while (it4.hasNext()) {
                                ArrayList arrayList2 = arrayList;
                                arrayList2.add(C7882k.m32778b(interfaceC7906p1, null, null, new d((SearchIndexItem) it4.next(), c3211c3, oSSearchIndexSyncWorker3, null), 3, null));
                                arrayList = arrayList2;
                                c3211c3 = c3211c3;
                            }
                            this.f11896A = C10350l.m39676a(interfaceC7906p3);
                            this.f11899t = oSSearchIndexSyncWorker3;
                            this.f11900u = C10350l.m39676a(interfaceC7906p1);
                            this.f11901v = searchIndexItemsResult;
                            this.f11902w = null;
                            this.f11903x = i14;
                            this.f11904y = iIntValue;
                            this.f11905z = 4;
                            objM32632a = C7857f.m32632a(arrayList, this);
                            if (objM32632a != objM38805e) {
                                i15 = i14;
                                i16 = iIntValue;
                                searchIndexItemsResult2 = searchIndexItemsResult;
                                interfaceC7906p2 = interfaceC7906p1;
                                oSSearchIndexSyncWorker4 = oSSearchIndexSyncWorker3;
                                list2 = (List) objM32632a;
                                ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                                bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                                this.f11896A = C10350l.m39676a(interfaceC7906p3);
                                this.f11899t = C10350l.m39676a(interfaceC7906p2);
                                this.f11900u = searchIndexItemsResult2;
                                this.f11901v = list2;
                                this.f11903x = i15;
                                this.f11904y = i16;
                                this.f11905z = 5;
                                if (C7872i.m32684g(ioDispatcher, bVar, this) != objM38805e) {
                                    list3 = list2;
                                    searchIndexItemsResult3 = searchIndexItemsResult2;
                                }
                            }
                        }
                        return objM38805e;
                    }
                    if (i17 == 3) {
                        i14 = this.f11903x;
                        SearchIndexItemsResult searchIndexItemsResult4 = (SearchIndexItemsResult) this.f11902w;
                        InterfaceC7906p0 interfaceC7906p5 = (InterfaceC7906p0) this.f11901v;
                        C3211c c3211c6 = (C3211c) this.f11900u;
                        OSSearchIndexSyncWorker oSSearchIndexSyncWorker7 = (OSSearchIndexSyncWorker) this.f11899t;
                        C7348o.m30470b(obj);
                        c3211c3 = c3211c6;
                        oSSearchIndexSyncWorker3 = oSSearchIndexSyncWorker7;
                        interfaceC7906p1 = interfaceC7906p5;
                        searchIndexItemsResult = searchIndexItemsResult4;
                        objM32684g = obj;
                        iIntValue = ((Number) objM32684g).intValue();
                        List listH1 = CollectionsKt.m31682H0(searchIndexItemsResult.getSearchIndexItems(), iIntValue);
                        arrayList = new ArrayList(C7701q.m31905u(listH1, 10));
                        it4 = listH1.iterator();
                        while (it4.hasNext()) {
                            ArrayList arrayList3 = arrayList;
                            arrayList3.add(C7882k.m32778b(interfaceC7906p1, null, null, new d((SearchIndexItem) it4.next(), c3211c3, oSSearchIndexSyncWorker3, null), 3, null));
                            arrayList = arrayList3;
                            c3211c3 = c3211c3;
                        }
                        this.f11896A = C10350l.m39676a(interfaceC7906p3);
                        this.f11899t = oSSearchIndexSyncWorker3;
                        this.f11900u = C10350l.m39676a(interfaceC7906p1);
                        this.f11901v = searchIndexItemsResult;
                        this.f11902w = null;
                        this.f11903x = i14;
                        this.f11904y = iIntValue;
                        this.f11905z = 4;
                        objM32632a = C7857f.m32632a(arrayList, this);
                        if (objM32632a != objM38805e) {
                            i15 = i14;
                            i16 = iIntValue;
                            searchIndexItemsResult2 = searchIndexItemsResult;
                            interfaceC7906p2 = interfaceC7906p1;
                            oSSearchIndexSyncWorker4 = oSSearchIndexSyncWorker3;
                            list2 = (List) objM32632a;
                            ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                            bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                            this.f11896A = C10350l.m39676a(interfaceC7906p3);
                            this.f11899t = C10350l.m39676a(interfaceC7906p2);
                            this.f11900u = searchIndexItemsResult2;
                            this.f11901v = list2;
                            this.f11903x = i15;
                            this.f11904y = i16;
                            this.f11905z = 5;
                            if (C7872i.m32684g(ioDispatcher, bVar, this) != objM38805e) {
                                list3 = list2;
                                searchIndexItemsResult3 = searchIndexItemsResult2;
                            }
                        }
                        return objM38805e;
                    }
                    if (i17 == 4) {
                        i16 = this.f11904y;
                        i15 = this.f11903x;
                        searchIndexItemsResult2 = (SearchIndexItemsResult) this.f11901v;
                        interfaceC7906p2 = (InterfaceC7906p0) this.f11900u;
                        oSSearchIndexSyncWorker4 = (OSSearchIndexSyncWorker) this.f11899t;
                        C7348o.m30470b(obj);
                        objM32632a = obj;
                        list2 = (List) objM32632a;
                        ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                        bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                        this.f11896A = C10350l.m39676a(interfaceC7906p3);
                        this.f11899t = C10350l.m39676a(interfaceC7906p2);
                        this.f11900u = searchIndexItemsResult2;
                        this.f11901v = list2;
                        this.f11903x = i15;
                        this.f11904y = i16;
                        this.f11905z = 5;
                        if (C7872i.m32684g(ioDispatcher, bVar, this) != objM38805e) {
                            list3 = list2;
                            searchIndexItemsResult3 = searchIndexItemsResult2;
                        }
                        return objM38805e;
                    }
                    if (i17 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list3 = (List) this.f11901v;
                    searchIndexItemsResult3 = (SearchIndexItemsResult) this.f11900u;
                    C7348o.m30470b(obj);
                }
                objM30460b = C7347n.m30460b(C7352s.m30477a(searchIndexItemsResult3, list3));
                thM30463e = C7347n.m30463e(objM30460b);
                if (thM30463e == null) {
                    if (thM30463e instanceof CancellationException) {
                        AbstractC1117c.a aVarM6339a = AbstractC1117c.a.m6339a();
                        Intrinsics.checkNotNullExpressionValue(aVarM6339a, "failure(...)");
                        return aVarM6339a;
                    }
                    C6124q.m27060e("OSSearchIndexSyncWorker", "Error syncing OS search results: " + thM30463e.getMessage());
                    AbstractC1117c.a aVarM6341c = AbstractC1117c.a.m6341c();
                    Intrinsics.checkNotNullExpressionValue(aVarM6341c, "retry(...)");
                    return aVarM6341c;
                }
                Pair pair = (Pair) objM30460b;
                SearchIndexItemsResult searchIndexItemsResult5 = (SearchIndexItemsResult) pair.m31671a();
                List list4 = (List) pair.m31672b();
                C6124q.m27063h("OSSearchIndexSyncWorker", "OS search index sync completed. Set " + list4.size() + " shortcuts.");
                C3209a c3209a = C3209a.f11947a;
                int size = searchIndexItemsResult5.getSearchIndexItems().size();
                searchIndexItems = searchIndexItemsResult5.getSearchIndexItems();
                if ((searchIndexItems instanceof Collection) || !searchIndexItems.isEmpty()) {
                    it = searchIndexItems.iterator();
                    int i18 = 0;
                    while (it.hasNext()) {
                        if (((SearchIndexItem) it.next()).getThumbnailUrl().length() <= 0 && (i18 = i18 + 1) < 0) {
                            C7699p.m31900s();
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
                        if (((ThumbnailResult) pair2.m31674d()).getFromCache() && ((ThumbnailResult) pair2.m31674d()).getBitmap() != null && (i11 = i11 + 1) < 0) {
                            C7699p.m31900s();
                        }
                    }
                } else {
                    i11 = 0;
                }
                syncMetrics = new C3209a.SyncMetrics(size, i10, i11, null, null, list4.size(), 24, null);
                if (C11659h.m43403a().mo43646i0()) {
                    if (z10 || !list.isEmpty()) {
                        it2 = list.iterator();
                        i12 = 0;
                        while (it2.hasNext()) {
                            if (!((ThumbnailResult) ((Pair) it2.next()).m31674d()).getFromCache() && (i12 = i12 + 1) < 0) {
                                C7699p.m31900s();
                            }
                        }
                    } else {
                        i12 = 0;
                    }
                    Integer numM39661d = C10340b.m39661d(i12);
                    if (z10 || !list.isEmpty()) {
                        it3 = list.iterator();
                        i13 = 0;
                        while (it3.hasNext()) {
                            if (((ThumbnailResult) ((Pair) it3.next()).m31674d()).getBitmap() != null && (i13 = i13 + 1) < 0) {
                                C7699p.m31900s();
                            }
                        }
                    } else {
                        i13 = 0;
                    }
                    syncMetrics = C3209a.SyncMetrics.m15309b(syncMetrics, 0, 0, 0, numM39661d, C10340b.m39661d(i13), 0, 39, null);
                }
                c3209a.m15305d(syncMetrics);
                AbstractC1117c.a aVarM6342d = AbstractC1117c.a.m6342d();
                Intrinsics.checkNotNull(aVarM6342d);
                return aVarM6342d;
                SearchIndexItemsResult searchIndexItemsResult6 = (SearchIndexItemsResult) objM50315f;
                AbstractC7888l0 ioDispatcher3 = oSSearchIndexSyncWorker.getIoDispatcher();
                a aVar = new a(oSSearchIndexSyncWorker, null);
                this.f11896A = C10350l.m39676a(interfaceC7906p3);
                this.f11899t = oSSearchIndexSyncWorker;
                this.f11900u = c3211c;
                this.f11901v = interfaceC7906p0;
                this.f11902w = searchIndexItemsResult6;
                this.f11903x = i14;
                this.f11905z = 2;
                if (C7872i.m32684g(ioDispatcher3, aVar, this) != objM38805e) {
                    searchIndexItemsResult = searchIndexItemsResult6;
                    interfaceC7906p1 = interfaceC7906p0;
                    c3211c2 = c3211c;
                    oSSearchIndexSyncWorker2 = oSSearchIndexSyncWorker;
                    AbstractC7888l0 ioDispatcher4 = oSSearchIndexSyncWorker2.getIoDispatcher();
                    c cVar2 = new c(oSSearchIndexSyncWorker2, null);
                    this.f11896A = C10350l.m39676a(interfaceC7906p3);
                    this.f11899t = oSSearchIndexSyncWorker2;
                    this.f11900u = c3211c2;
                    this.f11901v = interfaceC7906p1;
                    this.f11902w = searchIndexItemsResult;
                    this.f11903x = i14;
                    this.f11905z = 3;
                    objM32684g = C7872i.m32684g(ioDispatcher4, cVar2, this);
                    if (objM32684g == objM38805e) {
                        c3211c3 = c3211c2;
                        oSSearchIndexSyncWorker3 = oSSearchIndexSyncWorker2;
                        iIntValue = ((Number) objM32684g).intValue();
                        List listH2 = CollectionsKt.m31682H0(searchIndexItemsResult.getSearchIndexItems(), iIntValue);
                        arrayList = new ArrayList(C7701q.m31905u(listH2, 10));
                        it4 = listH2.iterator();
                        while (it4.hasNext()) {
                            ArrayList arrayList4 = arrayList;
                            arrayList4.add(C7882k.m32778b(interfaceC7906p1, null, null, new d((SearchIndexItem) it4.next(), c3211c3, oSSearchIndexSyncWorker3, null), 3, null));
                            arrayList = arrayList4;
                            c3211c3 = c3211c3;
                        }
                        this.f11896A = C10350l.m39676a(interfaceC7906p3);
                        this.f11899t = oSSearchIndexSyncWorker3;
                        this.f11900u = C10350l.m39676a(interfaceC7906p1);
                        this.f11901v = searchIndexItemsResult;
                        this.f11902w = null;
                        this.f11903x = i14;
                        this.f11904y = iIntValue;
                        this.f11905z = 4;
                        objM32632a = C7857f.m32632a(arrayList, this);
                        if (objM32632a != objM38805e) {
                            i15 = i14;
                            i16 = iIntValue;
                            searchIndexItemsResult2 = searchIndexItemsResult;
                            interfaceC7906p2 = interfaceC7906p1;
                            oSSearchIndexSyncWorker4 = oSSearchIndexSyncWorker3;
                            list2 = (List) objM32632a;
                            ioDispatcher = oSSearchIndexSyncWorker4.getIoDispatcher();
                            bVar = new b(oSSearchIndexSyncWorker4, list2, searchIndexItemsResult2, null);
                            this.f11896A = C10350l.m39676a(interfaceC7906p3);
                            this.f11899t = C10350l.m39676a(interfaceC7906p2);
                            this.f11900u = searchIndexItemsResult2;
                            this.f11901v = list2;
                            this.f11903x = i15;
                            this.f11904y = i16;
                            this.f11905z = 5;
                            if (C7872i.m32684g(ioDispatcher, bVar, this) != objM38805e) {
                                list3 = list2;
                                searchIndexItemsResult3 = searchIndexItemsResult2;
                                objM30460b = C7347n.m30460b(C7352s.m30477a(searchIndexItemsResult3, list3));
                                thM30463e = C7347n.m30463e(objM30460b);
                                if (thM30463e == null) {
                                    if (thM30463e instanceof CancellationException) {
                                        AbstractC1117c.a aVarM6339a2 = AbstractC1117c.a.m6339a();
                                        Intrinsics.checkNotNullExpressionValue(aVarM6339a2, "failure(...)");
                                        return aVarM6339a2;
                                    }
                                    C6124q.m27060e("OSSearchIndexSyncWorker", "Error syncing OS search results: " + thM30463e.getMessage());
                                    AbstractC1117c.a aVarM6341c2 = AbstractC1117c.a.m6341c();
                                    Intrinsics.checkNotNullExpressionValue(aVarM6341c2, "retry(...)");
                                    return aVarM6341c2;
                                }
                                Pair pair3 = (Pair) objM30460b;
                                SearchIndexItemsResult searchIndexItemsResult7 = (SearchIndexItemsResult) pair3.m31671a();
                                List list5 = (List) pair3.m31672b();
                                C6124q.m27063h("OSSearchIndexSyncWorker", "OS search index sync completed. Set " + list5.size() + " shortcuts.");
                                C3209a c3209a2 = C3209a.f11947a;
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
                                        if (((ThumbnailResult) pair2.m31674d()).getFromCache()) {
                                        }
                                    }
                                } else {
                                    i11 = 0;
                                    while (r5.hasNext()) {
                                        if (((ThumbnailResult) pair2.m31674d()).getFromCache()) {
                                        }
                                    }
                                }
                                syncMetrics = new C3209a.SyncMetrics(size2, i10, i11, null, null, list5.size(), 24, null);
                                if (C11659h.m43403a().mo43646i0()) {
                                    if (z10) {
                                        it2 = list.iterator();
                                        i12 = 0;
                                        while (it2.hasNext()) {
                                            if (!((ThumbnailResult) ((Pair) it2.next()).m31674d()).getFromCache()) {
                                            }
                                        }
                                    } else {
                                        it2 = list.iterator();
                                        i12 = 0;
                                        while (it2.hasNext()) {
                                            if (!((ThumbnailResult) ((Pair) it2.next()).m31674d()).getFromCache()) {
                                            }
                                        }
                                    }
                                    Integer numM39661d2 = C10340b.m39661d(i12);
                                    if (z10) {
                                        it3 = list.iterator();
                                        i13 = 0;
                                        while (it3.hasNext()) {
                                            if (((ThumbnailResult) ((Pair) it3.next()).m31674d()).getBitmap() != null) {
                                            }
                                        }
                                    } else {
                                        it3 = list.iterator();
                                        i13 = 0;
                                        while (it3.hasNext()) {
                                            if (((ThumbnailResult) ((Pair) it3.next()).m31674d()).getBitmap() != null) {
                                            }
                                        }
                                    }
                                    syncMetrics = C3209a.SyncMetrics.m15309b(syncMetrics, 0, 0, 0, numM39661d2, C10340b.m39661d(i13), 0, 39, null);
                                }
                                c3209a2.m15305d(syncMetrics);
                                AbstractC1117c.a aVarM6342d2 = AbstractC1117c.a.m6342d();
                                Intrinsics.checkNotNull(aVarM6342d2);
                                return aVarM6342d2;
                            }
                        }
                    }
                }
                return objM38805e;
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
            return ((C3202d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$e */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)J"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$nextAllowedSync$1", m39664f = "OSSearchIndexSyncWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3203e extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Long>, Object> {

        /* JADX INFO: renamed from: t */
        public int f11918t;

        public C3203e(InterfaceC9557b<? super C3203e> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return OSSearchIndexSyncWorker.this.new C3203e(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f11918t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C3210b c3210b = C3210b.f11954a;
            Context applicationContext = OSSearchIndexSyncWorker.this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return C10340b.m39662e(c3210b.m15322c(applicationContext));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Long> interfaceC9557b) {
            return ((C3203e) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ossearch.OSSearchIndexSyncWorker$f */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Lcom/roblox/client/ossearch/c;", "<anonymous>", "(Lku/p0;)Lcom/roblox/client/ossearch/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.ossearch.OSSearchIndexSyncWorker$doWork$thumbnailCache$1", m39664f = "OSSearchIndexSyncWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3204f extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super C3211c>, Object> {

        /* JADX INFO: renamed from: t */
        public int f11920t;

        public C3204f(InterfaceC9557b<? super C3204f> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3204f(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f11920t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return C3211c.INSTANCE.m15336a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super C3211c> interfaceC9557b) {
            return ((C3204f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSSearchIndexSyncWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.ioDispatcher = C7864g1.m32644b();
        this.clock = C3200b.f11890a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Function0<Long> m15290b() {
        return this.clock;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC7888l0 getIoDispatcher() {
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
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
        C3201c c3201c;
        long j10;
        if (interfaceC9557b instanceof C3201c) {
            c3201c = (C3201c) interfaceC9557b;
            int i10 = c3201c.f11895x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3201c.f11895x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3201c = new C3201c(interfaceC9557b);
            }
        } else {
            c3201c = new C3201c(interfaceC9557b);
        }
        Object objM32684g = c3201c.f11893v;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3201c.f11895x;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0 = this.ioDispatcher;
            C3203e c3203e = new C3203e(null);
            c3201c.f11895x = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0, c3203e, c3201c);
            if (objM32684g != objM38805e) {
            }
            return objM38805e;
        }
        if (i11 == 1) {
            C7348o.m30470b(objM32684g);
        } else if (i11 == 2) {
            j10 = c3201c.f11891t;
            C7348o.m30470b(objM32684g);
            C3211c c3211c = (C3211c) objM32684g;
            C3202d c3202d = new C3202d(c3211c, null);
            c3201c.f11892u = C10350l.m39676a(c3211c);
            c3201c.f11891t = j10;
            c3201c.f11895x = 3;
            objM32684g = C7910q0.m32891g(c3202d, c3201c);
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        Intrinsics.checkNotNullExpressionValue(objM32684g, "coroutineScope(...)");
        return objM32684g;
        long jLongValue = ((Number) objM32684g).longValue();
        if (this.clock.invoke().longValue() < jLongValue) {
            C6124q.m27063h("OSSearchIndexSyncWorker", "Skipping OS search sync, not yet due");
            AbstractC1117c.a aVarM6342d = AbstractC1117c.a.m6342d();
            Intrinsics.checkNotNullExpressionValue(aVarM6342d, "success(...)");
            return aVarM6342d;
        }
        C6124q.m27063h("OSSearchIndexSyncWorker", "Starting OS search index sync");
        AbstractC7888l0 abstractC7888l1 = this.ioDispatcher;
        C3204f c3204f = new C3204f(null);
        c3201c.f11891t = jLongValue;
        c3201c.f11895x = 2;
        objM32684g = C7872i.m32684g(abstractC7888l1, c3204f, c3201c);
        if (objM32684g != objM38805e) {
            j10 = jLongValue;
            C3211c c3211c2 = (C3211c) objM32684g;
            C3202d c3202d2 = new C3202d(c3211c2, null);
            c3201c.f11892u = C10350l.m39676a(c3211c2);
            c3201c.f11891t = j10;
            c3201c.f11895x = 3;
            objM32684g = C7910q0.m32891g(c3202d2, c3201c);
        }
        return objM38805e;
    }
}
