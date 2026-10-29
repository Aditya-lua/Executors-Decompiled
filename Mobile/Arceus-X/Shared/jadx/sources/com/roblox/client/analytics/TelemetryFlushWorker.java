package com.roblox.client.analytics;

import android.content.Context;
import android.os.Build;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.work.AbstractC1117c;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.roblox.client.analytics.TelemetryFlushWorker;
import com.roblox.engine.jni.NativeReportingInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;
import p229jt.C7347n;
import p229jt.C7348o;
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
import p536x5.C12694d;
import p536x5.C12738z;
import p536x5.EnumC12699f0;
import p536x5.EnumC12706j;
import p536x5.EnumC12734x;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;
import th.C11659h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u0000 \u001b2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR.\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u000e\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012¨\u0006\u001c"}, m31665d2 = {"Lcom/roblox/client/analytics/TelemetryFlushWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(Lnt/b;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "e", "()Lkotlin/jvm/functions/Function0;", "setNativeFlushV1$NativeShell_googleProdRelease", "(Lkotlin/jvm/functions/Function0;)V", "getNativeFlushV1$NativeShell_googleProdRelease$annotations", "()V", "nativeFlushV1", "b", "f", "setNativeFlushV2$NativeShell_googleProdRelease", "getNativeFlushV2$NativeShell_googleProdRelease$annotations", "nativeFlushV2", "c", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TelemetryFlushWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> nativeFlushV1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Function0<Unit> nativeFlushV2;

    /* JADX INFO: renamed from: com.roblox.client.analytics.TelemetryFlushWorker$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m31665d2 = {"Lcom/roblox/client/analytics/TelemetryFlushWorker$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "WORK_NAME", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.analytics.TelemetryFlushWorker.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m14871a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C12738z.a aVarM47416k = new C12738z.a(TelemetryFlushWorker.class).m47416k(new C12694d(EnumC12734x.CONNECTED, false, false, false, 14, null));
            if (Build.VERSION.SDK_INT >= 31) {
                aVarM47416k.m47417l(EnumC12699f0.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
            }
            C12738z c12738zM47409b = aVarM47416k.m47409b();
            AbstractC12719p0.Companion companion = AbstractC12719p0.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            companion.m47401a(applicationContext).m47400g("TelemetryFlushUniqueWork", EnumC12706j.REPLACE, c12738zM47409b);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.analytics.TelemetryFlushWorker$b */
    @InterfaceC10344f(m39663c = "com.roblox.client.analytics.TelemetryFlushWorker", m39664f = "TelemetryFlushWorker.kt", m39665l = {41}, m39666m = "doWork", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3154b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f11645t;

        /* JADX INFO: renamed from: v */
        public int f11647v;

        public C3154b(InterfaceC9557b<? super C3154b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11645t = obj;
            this.f11647v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return TelemetryFlushWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.analytics.TelemetryFlushWorker$c */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lku/p0;", "Landroidx/work/c$a;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2", m39664f = "TelemetryFlushWorker.kt", m39665l = {42}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3155c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a>, Object> {

        /* JADX INFO: renamed from: t */
        public int f11648t;

        /* JADX INFO: renamed from: com.roblox.client.analytics.TelemetryFlushWorker$c$a */
        @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "Landroidx/work/c$a;", "<anonymous>", "(Lku/p0;)Landroidx/work/c$a;"}, m31666k = 3, m31667mv = {2, 2, 0})
        @InterfaceC10344f(m39663c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2$1", m39664f = "TelemetryFlushWorker.kt", m39665l = {59}, m39666m = "invokeSuspend", m39667v = 1)
        public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a>, Object> {

            /* JADX INFO: renamed from: t */
            public Object f11650t;

            /* JADX INFO: renamed from: u */
            public int f11651u;

            /* JADX INFO: renamed from: v */
            public /* synthetic */ Object f11652v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ TelemetryFlushWorker f11653w;

            /* JADX INFO: renamed from: com.roblox.client.analytics.TelemetryFlushWorker$c$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2$1$flushes$1$1", m39664f = "TelemetryFlushWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class C14108a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Boolean>, Object> {

                /* JADX INFO: renamed from: t */
                public int f11654t;

                /* JADX INFO: renamed from: u */
                public /* synthetic */ Object f11655u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ TelemetryFlushWorker f11656v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14108a(TelemetryFlushWorker telemetryFlushWorker, InterfaceC9557b<? super C14108a> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f11656v = telemetryFlushWorker;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    C14108a c14108a = new C14108a(this.f11656v, interfaceC9557b);
                    c14108a.f11655u = obj;
                    return c14108a;
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    Object objM30460b;
                    C10047c.m38805e();
                    if (this.f11654t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    TelemetryFlushWorker telemetryFlushWorker = this.f11656v;
                    try {
                        C7347n.Companion companion = C7347n.INSTANCE;
                        telemetryFlushWorker.m14869e().invoke();
                        objM30460b = C7347n.m30460b(Unit.f29331a);
                    } catch (Throwable th2) {
                        C7347n.Companion companion2 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
                    }
                    Throwable thM30463e = C7347n.m30463e(objM30460b);
                    if (thM30463e != null) {
                        C6124q.m27061f("TelemetryFlushWorker", "V1 telemetry flush failed: " + thM30463e.getMessage(), thM30463e);
                    }
                    return C10340b.m39658a(C7347n.m30465g(objM30460b));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                    return ((C14108a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX INFO: renamed from: com.roblox.client.analytics.TelemetryFlushWorker$c$a$b */
            @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)Z"}, m31666k = 3, m31667mv = {2, 2, 0})
            @InterfaceC10344f(m39663c = "com.roblox.client.analytics.TelemetryFlushWorker$doWork$2$1$flushes$1$2", m39664f = "TelemetryFlushWorker.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
            public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Boolean>, Object> {

                /* JADX INFO: renamed from: t */
                public int f11657t;

                /* JADX INFO: renamed from: u */
                public /* synthetic */ Object f11658u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ TelemetryFlushWorker f11659v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(TelemetryFlushWorker telemetryFlushWorker, InterfaceC9557b<? super b> interfaceC9557b) {
                    super(2, interfaceC9557b);
                    this.f11659v = telemetryFlushWorker;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    b bVar = new b(this.f11659v, interfaceC9557b);
                    bVar.f11658u = obj;
                    return bVar;
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    Object objM30460b;
                    C10047c.m38805e();
                    if (this.f11657t != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    TelemetryFlushWorker telemetryFlushWorker = this.f11659v;
                    try {
                        C7347n.Companion companion = C7347n.INSTANCE;
                        telemetryFlushWorker.m14870f().invoke();
                        objM30460b = C7347n.m30460b(Unit.f29331a);
                    } catch (Throwable th2) {
                        C7347n.Companion companion2 = C7347n.INSTANCE;
                        objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
                    }
                    Throwable thM30463e = C7347n.m30463e(objM30460b);
                    if (thM30463e != null) {
                        C6124q.m27061f("TelemetryFlushWorker", "V2 telemetry flush failed: " + thM30463e.getMessage(), thM30463e);
                    }
                    return C10340b.m39658a(C7347n.m30465g(objM30460b));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Boolean> interfaceC9557b) {
                    return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TelemetryFlushWorker telemetryFlushWorker, InterfaceC9557b<? super a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f11653w = telemetryFlushWorker;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(this.f11653w, interfaceC9557b);
                aVar.f11652v = obj;
                return aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                AbstractC1117c.a aVarM6339a;
                InterfaceC7906p0 interfaceC7906p0 = (InterfaceC7906p0) this.f11652v;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f11651u;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    TelemetryFlushWorker telemetryFlushWorker = this.f11653w;
                    List listM31877c = C7697o.m31877c();
                    if (C11659h.m43403a().mo43491M2()) {
                        listM31877c.add(C7882k.m32778b(interfaceC7906p0, null, null, new C14108a(telemetryFlushWorker, null), 3, null));
                    }
                    if (C11659h.m43403a().mo43624f()) {
                        listM31877c.add(C7882k.m32778b(interfaceC7906p0, null, null, new b(telemetryFlushWorker, null), 3, null));
                    }
                    List listM31875a = C7697o.m31875a(listM31877c);
                    this.f11652v = C10350l.m39676a(interfaceC7906p0);
                    this.f11650t = C10350l.m39676a(listM31875a);
                    this.f11651u = 1;
                    obj = C7857f.m32632a(listM31875a, this);
                    if (obj == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                }
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    aVarM6339a = AbstractC1117c.a.m6342d();
                } else {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((Boolean) it.next()).booleanValue()) {
                            aVarM6339a = AbstractC1117c.a.m6339a();
                        }
                    }
                    aVarM6339a = AbstractC1117c.a.m6342d();
                }
                Intrinsics.checkNotNull(aVarM6339a);
                return aVarM6339a;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
                return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        public C3155c(InterfaceC9557b<? super C3155c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return TelemetryFlushWorker.this.new C3155c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f11648t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            a aVar = new a(TelemetryFlushWorker.this, null);
            this.f11648t = 1;
            Object objM32891g = C7910q0.m32891g(aVar, this);
            return objM32891g == objM38805e ? objM38805e : objM32891g;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
            return ((C3155c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TelemetryFlushWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.nativeFlushV1 = new Function0() { // from class: vg.t
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TelemetryFlushWorker.m14867g();
            }
        };
        this.nativeFlushV2 = new Function0() { // from class: vg.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TelemetryFlushWorker.m14868h();
            }
        };
    }

    /* JADX INFO: renamed from: d */
    public static final void m14866d(@NotNull Context context) {
        INSTANCE.m14871a(context);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m14867g() {
        NativeReportingInterface.flushEngineTelemetryV1Events();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m14868h() {
        NativeReportingInterface.flushEngineTelemetryV2Events();
        return Unit.f29331a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    @Nullable
    public Object doWork(@NotNull InterfaceC9557b<? super AbstractC1117c.a> interfaceC9557b) {
        C3154b c3154b;
        if (interfaceC9557b instanceof C3154b) {
            c3154b = (C3154b) interfaceC9557b;
            int i10 = c3154b.f11647v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c3154b.f11647v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c3154b = new C3154b(interfaceC9557b);
            }
        } else {
            c3154b = new C3154b(interfaceC9557b);
        }
        Object objM32684g = c3154b.f11645t;
        Object objM38805e = C10047c.m38805e();
        int i11 = c3154b.f11647v;
        if (i11 == 0) {
            C7348o.m30470b(objM32684g);
            AbstractC7888l0 abstractC7888l0M32644b = C7864g1.m32644b();
            C3155c c3155c = new C3155c(null);
            c3154b.f11647v = 1;
            objM32684g = C7872i.m32684g(abstractC7888l0M32644b, c3155c, c3154b);
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
    /* JADX INFO: renamed from: e */
    public final Function0<Unit> m14869e() {
        return this.nativeFlushV1;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Function0<Unit> m14870f() {
        return this.nativeFlushV2;
    }
}
