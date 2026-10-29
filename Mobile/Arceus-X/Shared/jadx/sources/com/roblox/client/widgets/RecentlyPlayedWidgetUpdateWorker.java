package com.roblox.client.widgets;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.C1116b;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.client.shortcuts.PinShortcutHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lk.C8156c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6124q;
import p229jt.C7348o;
import p229jt.C7352s;
import p239k6.C7458d0;
import p239k6.InterfaceC7479s;
import p256ku.AbstractC7888l0;
import p256ku.C7857f;
import p256ku.C7864g1;
import p256ku.C7872i;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p536x5.AbstractC12719p0;
import p536x5.C12738z;
import p536x5.EnumC12706j;
import p537x6.EnumC12742c;
import p537x6.ErrorResult;
import p537x6.ImageRequest;
import p537x6.InterfaceC12750k;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m31665d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "Lku/l0;", "ioDispatcher", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lku/l0;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "", "f", "context", "", "widgetDataJson", "d", "(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "a", "Lku/l0;", "e", "()Lku/l0;", "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class RecentlyPlayedWidgetUpdateWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 ioDispatcher;

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "recentlyPlayedData", "", "a", "(Landroid/content/Context;Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "", "MAX_THREADS", "I", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m15758a(@NotNull Context context, @NotNull String recentlyPlayedData) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(recentlyPlayedData, "recentlyPlayedData");
            Pair[] pairArr = {C7352s.m30477a("recently_played_json_list", recentlyPlayedData)};
            C1116b.a aVar = new C1116b.a();
            Pair pair = pairArr[0];
            aVar.m6323b((String) pair.m31673c(), pair.m31674d());
            C1116b c1116bM6322a = aVar.m6322a();
            int length = c1116bM6322a.m6321j().length;
            if (length <= 10240) {
                AbstractC12719p0.INSTANCE.m47401a(context).m47400g("RecentlyPlayedUpdateWork", EnumC12706j.REPLACE, new C12738z.a(RecentlyPlayedWidgetUpdateWorker.class).m47420o(c1116bM6322a).m47409b());
                return;
            }
            C6124q.m27060e("RecentlyPlayedWidgetUpdateWorker", "Worker failed to start. Recently played data size (" + length + ") exceeds 10KB limit");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "", "", "<anonymous>", "(Lku/p0;)Ljava/util/List;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2", m39664f = "RecentlyPlayedWidgetUpdateWorker.kt", m39665l = {104}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3284b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super List<? extends Unit>>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ Context f12426A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ InterfaceC7479s f12427B;

        /* JADX INFO: renamed from: t */
        public Object f12428t;

        /* JADX INFO: renamed from: u */
        public Object f12429u;

        /* JADX INFO: renamed from: v */
        public int f12430v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f12431w;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ JSONArray f12433y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ String f12434z;

        /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$b$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2$1", m39664f = "RecentlyPlayedWidgetUpdateWorker.kt", m39665l = {98}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

            /* JADX INFO: renamed from: A */
            public final /* synthetic */ InterfaceC7479s f12435A;

            /* JADX INFO: renamed from: t */
            public Object f12436t;

            /* JADX INFO: renamed from: u */
            public Object f12437u;

            /* JADX INFO: renamed from: v */
            public int f12438v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ String f12439w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ String f12440x;

            /* JADX INFO: renamed from: y */
            public final /* synthetic */ String f12441y;

            /* JADX INFO: renamed from: z */
            public final /* synthetic */ Context f12442z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, String str3, Context context, InterfaceC7479s interfaceC7479s, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f12439w = str;
                this.f12440x = str2;
                this.f12441y = str3;
                this.f12442z = context;
                this.f12435A = interfaceC7479s;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new a(this.f12439w, this.f12440x, this.f12441y, this.f12442z, this.f12435A, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f12438v;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    C3288a c3288a = C3288a.f12466a;
                    String str = this.f12439w;
                    Intrinsics.checkNotNull(str);
                    String str2 = this.f12440x;
                    Intrinsics.checkNotNull(str2);
                    String strM15768j = c3288a.m15768j(str, str2, this.f12441y);
                    ImageRequest imageRequestM47524b = new ImageRequest.a(this.f12442z).m47525c(this.f12440x).m47528f(strM15768j).m47532j(strM15768j).m47529g(EnumC12742c.ENABLED).m47524b();
                    InterfaceC7479s interfaceC7479s = this.f12435A;
                    this.f12436t = C10350l.m39676a(strM15768j);
                    this.f12437u = C10350l.m39676a(imageRequestM47524b);
                    this.f12438v = 1;
                    obj = interfaceC7479s.mo31068d(imageRequestM47524b, this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                InterfaceC12750k interfaceC12750k = (InterfaceC12750k) obj;
                if (interfaceC12750k instanceof ErrorResult) {
                    C6124q.m27061f("RecentlyPlayedWidgetUpdateWorker", "Failed to cache thumbnail for " + this.f12439w, ((ErrorResult) interfaceC12750k).getThrowable());
                }
                return Unit.f29331a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3284b(JSONArray jSONArray, String str, Context context, InterfaceC7479s interfaceC7479s, InterfaceC9557b<? super C3284b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12433y = jSONArray;
            this.f12434z = str;
            this.f12426A = context;
            this.f12427B = interfaceC7479s;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            C3284b c3284b = RecentlyPlayedWidgetUpdateWorker.this.new C3284b(this.f12433y, this.f12434z, this.f12426A, this.f12427B, interfaceC9557b);
            c3284b.f12431w = obj;
            return c3284b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super List<? extends Unit>> interfaceC9557b) {
            return invoke2(interfaceC7906p0, (InterfaceC9557b<? super List<Unit>>) interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws JSONException {
            InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f12431w;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12430v;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            AbstractC7888l0 abstractC7888l0M32791U = AbstractC7888l0.m32791U(RecentlyPlayedWidgetUpdateWorker.this.getIoDispatcher(), 3, null, 2, null);
            ArrayList arrayList = new ArrayList();
            int length = this.f12433y.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject = this.f12433y.getJSONObject(i11);
                String strOptString = jSONObject.optString("thumbnailUrl");
                String strOptString2 = jSONObject.optString(PinShortcutHandler.EXTRA_PLACE_ID);
                Intrinsics.checkNotNull(strOptString);
                if (strOptString.length() != 0) {
                    arrayList.add(C7882k.m32778b(interfaceC7906p0, abstractC7888l0M32791U, null, new a(strOptString2, strOptString, this.f12434z, this.f12426A, this.f12427B, null), 2, null));
                }
            }
            this.f12431w = C10350l.m39676a(interfaceC7906p0);
            this.f12428t = C10350l.m39676a(abstractC7888l0M32791U);
            this.f12429u = C10350l.m39676a(arrayList);
            this.f12430v = 1;
            Object objM32632a = C7857f.m32632a(arrayList, this);
            return objM32632a == objM38805e ? objM38805e : objM32632a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super List<Unit>> interfaceC9557b) {
            return ((C3284b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$c */
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker", m39664f = "RecentlyPlayedWidgetUpdateWorker.kt", m39665l = {38}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3285c extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f12443t;

        /* JADX INFO: renamed from: v */
        public int f12445v;

        public C3285c(InterfaceC9557b<? super C3285c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12443t = obj;
            this.f12445v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RecentlyPlayedWidgetUpdateWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$d */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$doWork$2", m39664f = "RecentlyPlayedWidgetUpdateWorker.kt", m39665l = {43, 50, 51}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3286d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f12446t;

        /* JADX INFO: renamed from: u */
        public Object f12447u;

        /* JADX INFO: renamed from: v */
        public int f12448v;

        public C3286d(InterfaceC9557b<? super C3286d> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return RecentlyPlayedWidgetUpdateWorker.this.new C3286d(interfaceC9557b);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
        
            if (r10.m15757f(r9) == r0) goto L30;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C8156c c8156c;
            String str;
            String str2;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f12448v;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                String strM6318g = RecentlyPlayedWidgetUpdateWorker.this.getInputData().m6318g("recently_played_json_list");
                if (strM6318g == null) {
                    return AbstractC1117c.a.m6339a();
                }
                c8156c = new C8156c();
                Context applicationContext = RecentlyPlayedWidgetUpdateWorker.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                this.f12446t = strM6318g;
                this.f12447u = C10350l.m39676a(c8156c);
                this.f12448v = 1;
                Object objM33437e = c8156c.m33437e(applicationContext, strM6318g, this);
                if (objM33437e != objM38805e) {
                    str = strM6318g;
                    obj = objM33437e;
                }
                return objM38805e;
            }
            if (i10 == 1) {
                c8156c = (C8156c) this.f12447u;
                str = (String) this.f12446t;
                C7348o.m30470b(obj);
            } else if (i10 == 2) {
                c8156c = (C8156c) this.f12447u;
                str2 = (String) this.f12446t;
                C7348o.m30470b(obj);
                RecentlyPlayedWidgetUpdateWorker recentlyPlayedWidgetUpdateWorker = RecentlyPlayedWidgetUpdateWorker.this;
                this.f12446t = C10350l.m39676a(str2);
                this.f12447u = C10350l.m39676a(c8156c);
                this.f12448v = 3;
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return AbstractC1117c.a.m6342d();
            if (!((Boolean) obj).booleanValue()) {
                return AbstractC1117c.a.m6339a();
            }
            RecentlyPlayedWidgetUpdateWorker recentlyPlayedWidgetUpdateWorker2 = RecentlyPlayedWidgetUpdateWorker.this;
            Context applicationContext2 = recentlyPlayedWidgetUpdateWorker2.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            this.f12446t = C10350l.m39676a(str);
            this.f12447u = C10350l.m39676a(c8156c);
            this.f12448v = 2;
            if (recentlyPlayedWidgetUpdateWorker2.m15755d(applicationContext2, str, this) != objM38805e) {
                str2 = str;
                RecentlyPlayedWidgetUpdateWorker recentlyPlayedWidgetUpdateWorker3 = RecentlyPlayedWidgetUpdateWorker.this;
                this.f12446t = C10350l.m39676a(str2);
                this.f12447u = C10350l.m39676a(c8156c);
                this.f12448v = 3;
            }
            return objM38805e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
            return ((C3286d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$e */
    @InterfaceC10344f(m39663c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker", m39664f = "RecentlyPlayedWidgetUpdateWorker.kt", m39665l = {65}, m39666m = "requestWidgetUpdate", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3287e extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public int f12450A;

        /* JADX INFO: renamed from: B */
        public int f12451B;

        /* JADX INFO: renamed from: C */
        public int f12452C;

        /* JADX INFO: renamed from: D */
        public int f12453D;

        /* JADX INFO: renamed from: E */
        public int f12454E;

        /* JADX INFO: renamed from: F */
        public int f12455F;

        /* JADX INFO: renamed from: G */
        public /* synthetic */ Object f12456G;

        /* JADX INFO: renamed from: I */
        public int f12458I;

        /* JADX INFO: renamed from: t */
        public Object f12459t;

        /* JADX INFO: renamed from: u */
        public Object f12460u;

        /* JADX INFO: renamed from: v */
        public Object f12461v;

        /* JADX INFO: renamed from: w */
        public Object f12462w;

        /* JADX INFO: renamed from: x */
        public Object f12463x;

        /* JADX INFO: renamed from: y */
        public Object f12464y;

        /* JADX INFO: renamed from: z */
        public Object f12465z;

        public C3287e(InterfaceC9557b<? super C3287e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12456G = obj;
            this.f12458I |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return RecentlyPlayedWidgetUpdateWorker.this.m15757f(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecentlyPlayedWidgetUpdateWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams) {
        this(appContext, workerParams, null, 4, null);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    /* JADX INFO: renamed from: d */
    public final Object m15755d(Context context, String str, InterfaceC9557b<? super Unit> interfaceC9557b) {
        JSONArray jSONArray = new JSONArray(str);
        InterfaceC7479s interfaceC7479sM30978a = C7458d0.m30978a(context);
        RecentlyPlayedWidgetHandler recentlyPlayedWidgetHandler = RecentlyPlayedWidgetHandler.INSTANCE;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Object objM32891g = C7910q0.m32891g(new C3284b(jSONArray, recentlyPlayedWidgetHandler.getCachedWidgetVariant(applicationContext), context, interfaceC7479sM30978a, null), interfaceC9557b);
        return objM32891g == C10047c.m38805e() ? objM32891g : Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
        C3285c c3285c;
        if (interfaceC9557b instanceof C3285c) {
            c3285c = (C3285c) interfaceC9557b;
            int i10 = c3285c.f12445v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3285c.f12445v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3285c = new C3285c(interfaceC9557b);
            }
        } else {
            c3285c = new C3285c(interfaceC9557b);
        }
        Object objM32684g = c3285c.f12443t;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3285c.f12445v;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0 = this.ioDispatcher;
            C3286d c3286d = new C3286d(null);
            c3285c.f12445v = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0, c3286d, c3285c);
            if (objM32684g == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM32684g);
        }
        Intrinsics.checkNotNullExpressionValue(objM32684g, "withContext(...)");
        return objM32684g;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC7888l0 getIoDispatcher() {
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
    /* JADX INFO: renamed from: f */
    public final java.lang.Object m15757f(p315nt.InterfaceC9557b<? super kotlin.Unit> r20) {
        /*
            r19 = this;
            r0 = r20
            boolean r1 = r0 instanceof com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.C3287e
            if (r1 == 0) goto L17
            r1 = r0
            com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$e r1 = (com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.C3287e) r1
            int r2 = r1.f12458I
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f12458I = r2
            r2 = r19
            goto L1e
        L17:
            com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$e r1 = new com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$e
            r2 = r19
            r1.<init>(r0)
        L1e:
            java.lang.Object r0 = r1.f12456G
            java.lang.Object r3 = p344ot.C10047c.m38805e()
            int r4 = r1.f12458I
            r5 = 0
            java.lang.String r6 = "getApplicationContext(...)"
            r7 = 1
            if (r4 == 0) goto L63
            if (r4 != r7) goto L5b
            int r4 = r1.f12452C
            int r8 = r1.f12451B
            int r9 = r1.f12450A
            java.lang.Object r10 = r1.f12465z
            android.os.Bundle r10 = (android.os.Bundle) r10
            java.lang.Object r10 = r1.f12464y
            com.roblox.client.widgets.a$b r10 = (com.roblox.client.widgets.C3288a.WidgetLayoutConfig) r10
            java.lang.Object r10 = r1.f12463x
            int[] r10 = (int[]) r10
            java.lang.Object r11 = r1.f12462w
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r1.f12461v
            int[] r12 = (int[]) r12
            java.lang.Object r13 = r1.f12460u
            android.content.ComponentName r13 = (android.content.ComponentName) r13
            java.lang.Object r14 = r1.f12459t
            android.appwidget.AppWidgetManager r14 = (android.appwidget.AppWidgetManager) r14
            p229jt.C7348o.m30470b(r0)
            r0 = r11
            r17 = r12
            r18 = r13
            r12 = r14
            goto Lfa
        L5b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L63:
            p229jt.C7348o.m30470b(r0)
            android.content.Context r0 = r2.getApplicationContext()
            android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r0)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.Context r8 = r2.getApplicationContext()
            java.lang.Class<com.roblox.client.widgets.RecentlyPlayedWidgetProvider> r9 = com.roblox.client.widgets.RecentlyPlayedWidgetProvider.class
            r4.<init>(r8, r9)
            int[] r8 = r0.getAppWidgetIds(r4)
            com.roblox.client.widgets.RecentlyPlayedWidgetHandler r9 = com.roblox.client.widgets.RecentlyPlayedWidgetHandler.INSTANCE
            android.content.Context r10 = r2.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r6)
            java.lang.String r9 = r9.getCachedWidgetVariant(r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            int r10 = r8.length
            r12 = r0
            r18 = r4
            r17 = r8
            r0 = r9
            r4 = r10
            r8 = r5
            r9 = r8
            r10 = r17
        L99:
            if (r8 >= r4) goto Lfc
            r14 = r10[r8]
            android.os.Bundle r11 = r12.getAppWidgetOptions(r14)
            if (r11 != 0) goto La5
            android.os.Bundle r11 = android.os.Bundle.EMPTY
        La5:
            com.roblox.client.widgets.a r13 = com.roblox.client.widgets.C3288a.f12466a
            android.content.Context r15 = r2.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            com.roblox.client.widgets.a$b r15 = r13.m15767i(r15, r11, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)
            r16 = r11
            r11 = r13
            android.content.Context r13 = r2.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r6)
            r1.f12459t = r12
            java.lang.Object r7 = pt.C10350l.m39676a(r18)
            r1.f12460u = r7
            java.lang.Object r7 = pt.C10350l.m39676a(r17)
            r1.f12461v = r7
            r1.f12462w = r0
            r1.f12463x = r10
            java.lang.Object r7 = pt.C10350l.m39676a(r15)
            r1.f12464y = r7
            java.lang.Object r7 = pt.C10350l.m39676a(r16)
            r1.f12465z = r7
            r1.f12450A = r9
            r1.f12451B = r8
            r1.f12452C = r4
            r1.f12453D = r14
            r1.f12454E = r14
            r1.f12455F = r5
            r7 = 1
            r1.f12458I = r7
            r16 = r1
            java.lang.Object r1 = r11.m15773o(r12, r13, r14, r15, r16)
            if (r1 != r3) goto Lf8
            return r3
        Lf8:
            r1 = r16
        Lfa:
            int r8 = r8 + r7
            goto L99
        Lfc:
            kotlin.Unit r0 = kotlin.Unit.f29331a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.m15757f(nt.b):java.lang.Object");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentlyPlayedWidgetUpdateWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParams, @NotNull AbstractC7888l0 ioDispatcher) {
        super(appContext, workerParams);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (r2v0 androidx.work.WorkerParameters)
      (wrap ku.l0:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap ku.l0:0x0004: INVOKE  STATIC call: ku.g1.b():ku.l0 A[MD:():ku.l0 (m), WRAPPED] (LINE:4)) : (r3v0 ku.l0))
     A[MD:(android.content.Context, androidx.work.WorkerParameters, ku.l0):void (m)] (LINE:5) call: com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker.<init>(android.content.Context, androidx.work.WorkerParameters, ku.l0):void type: THIS */
    public /* synthetic */ RecentlyPlayedWidgetUpdateWorker(Context context, WorkerParameters workerParameters, AbstractC7888l0 abstractC7888l0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters, (i10 & 4) != 0 ? C7864g1.m32644b() : abstractC7888l0);
    }
}
