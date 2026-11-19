package hs;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.JpMyNumberNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.steps.ui.components.CreatePersonaSheetComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.GovernmentIdNfcScanComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.InputAddressComponent;
import com.withpersona.sdk2.inquiry.steps.ui.components.JpMyNumberNfcScanComponent;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import eq.MrzKey;
import eq.PassportNfcStrings;
import es.g2;
import es.i4;
import es.m1;
import es.m4;
import es.o1;
import es.s6;
import es.x6;
import fq.n1;
import fq.s1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import qr.d6;
import qr.u2;
import qr.x5;
import qr.y5;
import sr.GovernmentIdNfcData;
import zp.JpMyNumberNfcStrings;
import zp.JpMyNumberNfcValidOperation;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b%\u0018\u0000 l2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002mRB\u0087\u0001\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020'2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u0010-\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b3\u00104J-\u00109\u001a\u00020'*\b\u0012\u0004\u0012\u000206052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020'07H\u0002¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020'2\u0006\u0010;\u001a\u0002062\u0006\u0010=\u001a\u00020<2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020'2\u0006\u0010A\u001a\u00020@2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010E\u001a\u00020'2\u0006\u0010A\u001a\u00020D2\u0006\u0010&\u001a\u00020*H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020<2\u0006\u0010A\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ'\u0010K\u001a\u00020'2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020*2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0015\u0010N\u001a\u00020\u00032\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\bN\u0010OJ\r\u0010P\u001a\u00020'¢\u0006\u0004\bP\u0010QR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006n"}, d2 = {"Lhs/g1;", "Lls/d;", "Les/s6$b;", "Les/i4;", "Les/s6$c;", "Les/s6$d;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Landroid/content/Context;", "applicationContext", "Leq/p$a;", "nfcScanWorkerFactory", "Lzp/u$a;", "scanJpMyNumberNfcWorkerFactory", "Lkq/c;", "sandboxFlags", "Les/o1$a;", "createReusablePersonaWorkerFactory", "Les/x6$a;", "verifyReusablePersonaWorkerFactory", "Lir/b;", "navigationStateManager", "Lhs/e0;", "componentWorkHelper", "Ldr/c;", "externalEventLogger", "Lto/e;", "featureFlagManager", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "trackingEventsLogger", "Lhq/i$a;", "permissionRequestWorkerFactory", "Lav/p0;", "coroutineScope", "<init>", "(Les/s6$b;Landroidx/lifecycle/l0;Landroid/content/Context;Leq/p$a;Lzp/u$a;Lkq/c;Les/o1$a;Les/x6$a;Lir/b;Lhs/e0;Ldr/c;Lto/e;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lhq/i$a;Lav/p0;)V", "renderProps", "renderState", BuildConfig.FLAVOR, "S", "(Les/s6$b;Les/i4;Leu/b;)Ljava/lang/Object;", "Les/i4$a;", "m0", "(Les/i4$a;)V", "k0", "(Les/s6$b;Les/i4;)V", "Les/i4$a$d;", "nfcScan", "p0", "(Les/s6$b;Les/i4$a;Les/i4$a$d;)V", "P", "(Les/s6$b;Les/i4$a;)V", BuildConfig.FLAVOR, "Lqr/x5;", "Lkotlin/Function1;", "action", "n0", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "tappedUiComponent", BuildConfig.FLAVOR, "isTappedComponentVisible", "w0", "(Lqr/x5;ZLes/i4$a;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "component", "O", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;Les/i4$a;)V", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;", "N", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;Les/i4$a;)V", "j0", "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/JpMyNumberNfcScanComponent;)Z", "Les/i4$a$c;", "jpMyNumberNfcScan", "s0", "(Les/s6$b;Les/i4$a;Les/i4$a$c;)V", "props", "M", "(Les/s6$b;)Les/i4;", "l0", "()V", "e", "Landroidx/lifecycle/l0;", "f", "Landroid/content/Context;", "g", "Leq/p$a;", "h", "Lzp/u$a;", "i", "Lkq/c;", "j", "Les/o1$a;", "k", "Les/x6$a;", "l", "Lir/b;", "m", "Lhs/e0;", "n", "Ldr/c;", "o", "Lto/e;", "p", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "q", "Lhq/i$a;", "r", "d", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g1 extends ls.d<s6.Input, i4, s6.c, s6.d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final androidx.p000lifecycle.l0 savedStateHandle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context applicationContext;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final eq.p.a nfcScanWorkerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zp.u.a scanJpMyNumberNfcWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.c sandboxFlags;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o1.a createReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final x6.a verifyReusablePersonaWorkerFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ir.b navigationStateManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final e0 componentWorkHelper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dr.c externalEventLogger;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final to.e featureFlagManager;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hq.i.a permissionRequestWorkerFactory;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$1$1", f = "UiStepStateManager.kt", l = {132}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18610t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i4 f18612v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i4 i4Var, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f18612v = i4Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return g1.this.new a(this.f18612v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f18610t;
            if (i10 == 0) {
                zt.o.b(obj);
                g1 g1Var = g1.this;
                s6.Input value = g1Var.b().getValue();
                i4 i4Var = this.f18612v;
                this.f18610t = 1;
                if (g1Var.S(value, i4Var, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$2", f = "UiStepStateManager.kt", l = {136}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18613t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g1 f18615a;

            public a(g1 g1Var) {
                this.f18615a = g1Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(s6.Input input, eu.b<? super Unit> bVar) {
                Object objS;
                g1 g1Var = this.f18615a;
                i4 i4Var = (i4) g1Var.d().i();
                return (i4Var != null && (objS = g1Var.S(input, i4Var, bVar)) == fu.c.e()) ? objS : Unit.f21506a;
            }
        }

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return g1.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f18613t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.c0<s6.Input> c0VarB = g1.this.b();
                a aVar = new a(g1.this);
                this.f18613t = 1;
                if (c0VarB.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            throw new zt.d();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$3", f = "UiStepStateManager.kt", l = {144}, m = "invokeSuspend")
    public static final class c extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18616t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g1 f18618a;

            public a(g1 g1Var) {
                this.f18618a = g1Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, eu.b<? super Unit> bVar) {
                i4 i4Var = (i4) this.f18618a.d().i();
                if (i4Var == null) {
                    return Unit.f21506a;
                }
                g1 g1Var = this.f18618a;
                g1Var.k0(g1Var.b().getValue(), i4Var);
                return Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements dv.h<String> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.h f18619a;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", BuildConfig.FLAVOR, "emit", "(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
            public static final class a<T> implements dv.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ dv.i f18620a;

                /* JADX INFO: renamed from: hs.g1$c$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @gu.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$3$invokeSuspend$$inlined$map$1$2", f = "UiStepStateManager.kt", l = {223}, m = "emit")
                public static final class C0355a extends gu.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f18621t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f18622u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f18623v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f18625x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f18626y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f18627z;

                    public C0355a(eu.b bVar) {
                        super(bVar);
                    }

                    @Override // gu.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f18621t = obj;
                        this.f18622u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(dv.i iVar) {
                    this.f18620a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // dv.i
                @Nullable
                public final Object emit(Object obj, @NotNull eu.b bVar) {
                    C0355a c0355a;
                    if (bVar instanceof C0355a) {
                        c0355a = (C0355a) bVar;
                        int i10 = c0355a.f18622u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0355a.f18622u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0355a = new C0355a(bVar);
                        }
                    } else {
                        c0355a = new C0355a(bVar);
                    }
                    Object obj2 = c0355a.f18621t;
                    Object objE = fu.c.e();
                    int i11 = c0355a.f18622u;
                    if (i11 == 0) {
                        zt.o.b(obj2);
                        dv.i iVar = this.f18620a;
                        String stepName = ((s6.Input) obj).getStepName();
                        c0355a.f18623v = gu.l.a(obj);
                        c0355a.f18625x = gu.l.a(c0355a);
                        c0355a.f18626y = gu.l.a(obj);
                        c0355a.f18627z = gu.l.a(iVar);
                        c0355a.A = 0;
                        c0355a.f18622u = 1;
                        if (iVar.emit(stepName, c0355a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj2);
                    }
                    return Unit.f21506a;
                }
            }

            public b(dv.h hVar) {
                this.f18619a = hVar;
            }

            @Override // dv.h
            @Nullable
            public Object collect(@NotNull dv.i<? super String> iVar, @NotNull eu.b bVar) {
                Object objCollect = this.f18619a.collect(new a(iVar), bVar);
                return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
            }
        }

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return g1.this.new c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f18616t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h hVarM = dv.j.m(new b(g1.this.b()));
                a aVar = new a(g1.this);
                this.f18616t = 1;
                if (hVarM.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lhs/g1$e;", BuildConfig.FLAVOR, "Les/s6$b;", "initialProps", "Landroidx/lifecycle/l0;", "savedStateHandle", "Lhs/g1;", "a", "(Les/s6$b;Landroidx/lifecycle/l0;)Lhs/g1;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface e {
        @NotNull
        g1 a(@NotNull s6.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle);
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18628a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[s1.values().length];
            try {
                iArr[s1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18628a = iArr;
            int[] iArr2 = new int[GovernmentIdNfcScan.DataGroupTypes.values().length];
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg1.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg2.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Dg14.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[GovernmentIdNfcScan.DataGroupTypes.Sod.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements Function1<qr.g0, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f18629a = new g();

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(qr.g0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class h extends p001kotlin.jvm.internal.k implements Function1<s6.c, Unit> {
        public h(Object obj) {
            super(1, obj, g1.class, "setOutput", "setOutput(Ljava/lang/Object;)V", 0);
        }

        public final void d(s6.c p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            ((g1) this.receiver).e(p8);
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(s6.c cVar) {
            d(cVar);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$5$1", f = "UiStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class i extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18630t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ i4 f18632v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ qr.i f18633w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(i4 i4Var, qr.i iVar, eu.b<? super i> bVar) {
            super(1, bVar);
            this.f18632v = i4Var;
            this.f18633w = iVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return g1.this.new i(this.f18632v, this.f18633w, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            String strN;
            fu.c.e();
            if (this.f18630t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            g1 g1Var = g1.this;
            i4.Displaying displaying = (i4.Displaying) this.f18632v;
            qr.i iVar = this.f18633w;
            Integer autoSubmitIntervalSeconds = iVar.getAutoSubmitIntervalSeconds();
            Intrinsics.checkNotNull(autoSubmitIntervalSeconds);
            int iIntValue = autoSubmitIntervalSeconds.intValue();
            String autoSubmitCountdownText = this.f18633w.getAutoSubmitCountdownText();
            if (autoSubmitCountdownText != null) {
                Integer autoSubmitIntervalSeconds2 = this.f18633w.getAutoSubmitIntervalSeconds();
                Intrinsics.checkNotNull(autoSubmitIntervalSeconds2);
                strN = p001kotlin.text.x.N(autoSubmitCountdownText, "{time}", String.valueOf(autoSubmitIntervalSeconds2.intValue()), false, 4, null);
            } else {
                strN = null;
            }
            g1Var.f(i4.Displaying.v(displaying, null, null, null, null, null, null, null, new i4.Displaying.AutoSubmit(iVar, iIntValue, strN), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((i) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$6$1", f = "UiStepStateManager.kt", l = {296}, m = "invokeSuspend")
    public static final class j extends gu.m implements Function1<eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18634t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ i4.Displaying.AutoSubmit f18635u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g1 f18636v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ i4 f18637w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i4.Displaying.AutoSubmit autoSubmit, g1 g1Var, i4 i4Var, eu.b<? super j> bVar) {
            super(1, bVar);
            this.f18635u = autoSubmit;
            this.f18636v = g1Var;
            this.f18637w = i4Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new j(this.f18635u, this.f18636v, this.f18637w, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f18634t;
            if (i10 == 0) {
                zt.o.b(obj);
                this.f18634t = 1;
                if (av.z0.b(1000L, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            int countdown = this.f18635u.getCountdown() - 1;
            g1 g1Var = this.f18636v;
            i4.Displaying displaying = (i4.Displaying) this.f18637w;
            qr.d component = this.f18635u.getComponent();
            String autoSubmitCountdownText = this.f18635u.getComponent().getAutoSubmitCountdownText();
            g1Var.f(i4.Displaying.v(displaying, null, null, null, null, null, null, null, new i4.Displaying.AutoSubmit(component, countdown, autoSubmitCountdownText != null ? p001kotlin.text.x.N(autoSubmitCountdownText, "{time}", String.valueOf(countdown), false, 4, null) : null), null, false, false, null, null, null, false, 0, null, 0, 262015, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((j) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$handleState$7", f = "UiStepStateManager.kt", l = {456}, m = "invokeSuspend")
    public static final class k extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18638t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ s6.d.a f18640v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(s6.d.a aVar, eu.b<? super k> bVar) {
            super(2, bVar);
            this.f18640v = aVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return g1.this.new k(this.f18640v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((k) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f18638t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.c0<s6.d> c0VarC = g1.this.c();
                s6.d.a aVar = this.f18640v;
                this.f18638t = 1;
                if (c0VarC.emit(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.state.UiStepStateManager$runGovIdNfcWork$1", f = "UiStepStateManager.kt", l = {}, m = "invokeSuspend")
    public static final class l extends gu.m implements Function1<eu.b<? super Unit>, Object> {
        public final /* synthetic */ i4.Displaying A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18641t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdNfcScan.Attributes f18642u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g1 f18643v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f18644w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Date f18645x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ Date f18646y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ i4.Displaying.NfcScan f18647z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(GovernmentIdNfcScan.Attributes attributes, g1 g1Var, String str, Date date, Date date2, i4.Displaying.NfcScan nfcScan, i4.Displaying displaying, eu.b<? super l> bVar) {
            super(1, bVar);
            this.f18642u = attributes;
            this.f18643v = g1Var;
            this.f18644w = str;
            this.f18645x = date;
            this.f18646y = date2;
            this.f18647z = nfcScan;
            this.A = displaying;
        }

        @Override // gu.a
        public final eu.b<Unit> create(eu.b<?> bVar) {
            return new l(this.f18642u, this.f18643v, this.f18644w, this.f18645x, this.f18646y, this.f18647z, this.A, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            String string;
            fu.c.e();
            if (this.f18641t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            GovernmentIdNfcScan.Attributes attributes = this.f18642u;
            if (attributes == null || (string = attributes.getRequiredText()) == null) {
                string = this.f18643v.applicationContext.getString(jq.g.F);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (StringsKt.p0(this.f18644w)) {
                linkedHashMap.put(GovernmentIdNfcScan.documentNumberName, string);
            }
            if (this.f18645x == null) {
                linkedHashMap.put(GovernmentIdNfcScan.dateOfBirthName, string);
            }
            if (this.f18646y == null) {
                linkedHashMap.put(GovernmentIdNfcScan.expirationDateName, string);
            }
            this.f18643v.f(i4.Displaying.v(this.A, null, null, p001kotlin.collections.o.d(new g2(new UiComponentError.UiGovernmentIdNfcScanComponentError(this.f18647z.getComponent().getName(), null, linkedHashMap, 2, null), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eu.b<? super Unit> bVar) {
            return ((l) create(bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(@NotNull s6.Input initialProps, @NotNull androidx.p000lifecycle.l0 savedStateHandle, @NotNull Context applicationContext, @NotNull eq.p.a nfcScanWorkerFactory, @NotNull zp.u.a scanJpMyNumberNfcWorkerFactory, @NotNull kq.c sandboxFlags, @NotNull o1.a createReusablePersonaWorkerFactory, @NotNull x6.a verifyReusablePersonaWorkerFactory, @NotNull ir.b navigationStateManager, @NotNull e0 componentWorkHelper, @NotNull dr.c externalEventLogger, @NotNull to.e featureFlagManager, @NotNull TrackingEventsLogger trackingEventsLogger, @NotNull hq.i.a permissionRequestWorkerFactory, @NotNull final av.p0 coroutineScope) {
        super(initialProps, savedStateHandle, coroutineScope);
        Intrinsics.checkNotNullParameter(initialProps, "initialProps");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(nfcScanWorkerFactory, "nfcScanWorkerFactory");
        Intrinsics.checkNotNullParameter(scanJpMyNumberNfcWorkerFactory, "scanJpMyNumberNfcWorkerFactory");
        Intrinsics.checkNotNullParameter(sandboxFlags, "sandboxFlags");
        Intrinsics.checkNotNullParameter(createReusablePersonaWorkerFactory, "createReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(verifyReusablePersonaWorkerFactory, "verifyReusablePersonaWorkerFactory");
        Intrinsics.checkNotNullParameter(navigationStateManager, "navigationStateManager");
        Intrinsics.checkNotNullParameter(componentWorkHelper, "componentWorkHelper");
        Intrinsics.checkNotNullParameter(externalEventLogger, "externalEventLogger");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(trackingEventsLogger, "trackingEventsLogger");
        Intrinsics.checkNotNullParameter(permissionRequestWorkerFactory, "permissionRequestWorkerFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.savedStateHandle = savedStateHandle;
        this.applicationContext = applicationContext;
        this.nfcScanWorkerFactory = nfcScanWorkerFactory;
        this.scanJpMyNumberNfcWorkerFactory = scanJpMyNumberNfcWorkerFactory;
        this.sandboxFlags = sandboxFlags;
        this.createReusablePersonaWorkerFactory = createReusablePersonaWorkerFactory;
        this.verifyReusablePersonaWorkerFactory = verifyReusablePersonaWorkerFactory;
        this.navigationStateManager = navigationStateManager;
        this.componentWorkHelper = componentWorkHelper;
        this.externalEventLogger = externalEventLogger;
        this.featureFlagManager = featureFlagManager;
        this.trackingEventsLogger = trackingEventsLogger;
        this.permissionRequestWorkerFactory = permissionRequestWorkerFactory;
        if (d().i() == null) {
            f(M(b().getValue()));
        }
        d().o(new Function1() { // from class: hs.g0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.G(coroutineScope, this, (i4) obj);
            }
        });
        av.k.d(coroutineScope, av.g1.d(), null, new b(null), 2, null);
        av.k.d(coroutineScope, av.g1.d(), null, new c(null), 2, null);
    }

    public static final Unit G(av.p0 p0Var, g1 g1Var, i4 i4Var) {
        if (i4Var == null) {
            return Unit.f21506a;
        }
        av.k.d(p0Var, av.g1.d(), null, g1Var.new a(i4Var, null), 2, null);
        return Unit.f21506a;
    }

    public static final Unit Q(i4.b bVar, g1 g1Var, i4.Displaying displaying, o1.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        i4.b.CreateReusablePersona createReusablePersona = (i4.b.CreateReusablePersona) bVar;
        if (createReusablePersona.getCreatePersonaSheetComponent().getAutoCompleteOnDismiss()) {
            g1Var.e(s6.c.C0279c.f14484a);
            return Unit.f21506a;
        }
        if (Intrinsics.c(it, o1.b.a.f14383a)) {
            g1Var.f(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        } else {
            if (!(it instanceof o1.b.Error)) {
                throw new zt.l();
            }
            g1Var.f(((o1.b.Error) it).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? i4.Displaying.v(displaying, null, null, null, null, g1Var.applicationContext.getString(jq.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), createReusablePersona.getCreatePersonaSheetComponent(), CreatePersonaSheetComponent.f(createReusablePersona.getCreatePersonaSheetComponent(), null, null, null, false, true, false, false, null, 0L, 463, null)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261886, null));
        }
        return Unit.f21506a;
    }

    public static final Unit R(g1 g1Var, i4.Displaying displaying, x6.b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.c(it, x6.b.a.f14641a)) {
            g1Var.f(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
            g1Var.e(new s6.c.FinishedWithTransition(true));
        } else {
            if (!(it instanceof x6.b.Error)) {
                throw new zt.l();
            }
            g1Var.f(((x6.b.Error) it).getErrorInfo() instanceof InternalErrorInfo.NetworkErrorInfo ? i4.Displaying.v(displaying, null, null, null, null, g1Var.applicationContext.getString(jq.g.B), null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261871, null) : i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261887, null));
        }
        return Unit.f21506a;
    }

    public static final Unit T(g1 g1Var, i4 i4Var, s6.Input input) {
        TrackingEventsLogger.logUiStepButtonEvent$default(g1Var.trackingEventsLogger, UiStepButtonType.Cancel, null, ((i4.Displaying) i4Var).getStepName(), false, 10, null);
        g1Var.e(input.getFinalStep() ? s6.c.C0279c.f14484a : s6.c.b.f14483a);
        return Unit.f21506a;
    }

    public static final Unit U(g1 g1Var, i4 i4Var, GovernmentIdNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        g1Var.O(component, (i4.Displaying) i4Var);
        return Unit.f21506a;
    }

    public static final Unit V(g1 g1Var, i4 i4Var, JpMyNumberNfcScanComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        g1Var.N(component, (i4.Displaying) i4Var);
        return Unit.f21506a;
    }

    public static final Unit W(qr.g0 g0Var, g1 g1Var, i4 i4Var) {
        if (g0Var != null && (g0Var instanceof GovernmentIdNfcScanComponent)) {
            g1Var.O((GovernmentIdNfcScanComponent) g0Var, (i4.Displaying) i4Var);
        }
        return Unit.f21506a;
    }

    public static final Unit X(qr.g0 g0Var, g1 g1Var, i4 i4Var) {
        String unableToScanTransitionComponentName;
        if (g0Var != null && (g0Var instanceof GovernmentIdNfcScanComponent)) {
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) g0Var;
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
            if (attributes != null && (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) != null && (!StringsKt.p0(unableToScanTransitionComponentName))) {
                i4.Displaying displaying = (i4.Displaying) i4Var;
                g1Var.w0(g0Var, true, displaying);
                i4.Displaying displayingV = i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null);
                GovernmentIdNfcScan.Attributes attributes2 = governmentIdNfcScanComponent.getConfig().getAttributes();
                g1Var.f(m1.b(displayingV, attributes2 != null ? attributes2.getUnableToScanTransitionComponentName() : null));
            }
        }
        return Unit.f21506a;
    }

    public static final Unit Y(g1 g1Var, i4 i4Var, d6 component, Map componentParams) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        i4.Displaying displaying = (i4.Displaying) i4Var;
        g1Var.w0(component, true, displaying);
        g1Var.f(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, new i4.b.VerifyReusablePersona(component, componentParams), false, false, null, null, null, false, 0, null, 0, 261887, null));
        return Unit.f21506a;
    }

    public static final Unit Z(g1 g1Var) {
        g1Var.e(s6.c.a.f14482a);
        return Unit.f21506a;
    }

    public static final Unit a0(g1 g1Var, i4 i4Var, InputAddressComponent component, String addressId) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        i4.Displaying displaying = (i4.Displaying) i4Var;
        g1Var.f(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(displaying.getComponents(), component, component.V(addressId).S(Boolean.TRUE)), null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262142, null));
        return Unit.f21506a;
    }

    public static final Unit b0(g1 g1Var, i4 i4Var) {
        g1Var.f(i4.Displaying.v((i4.Displaying) i4Var, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262127, null));
        return Unit.f21506a;
    }

    public static final Unit c0(g1 g1Var, s6.Input input, i4 i4Var, x5 component) {
        Intrinsics.checkNotNullParameter(component, "component");
        g1Var.componentWorkHelper.H(input, (i4.Displaying) i4Var, g1Var.d(), component, new h(g1Var));
        return Unit.f21506a;
    }

    public static final Unit d0(g1 g1Var, i4 i4Var, CreatePersonaSheetComponent createReusablePersonaComponent, x5 buttonClicked) {
        Intrinsics.checkNotNullParameter(createReusablePersonaComponent, "createReusablePersonaComponent");
        Intrinsics.checkNotNullParameter(buttonClicked, "buttonClicked");
        i4.Displaying displaying = (i4.Displaying) i4Var;
        List<x5> components = displaying.getComponents();
        qr.i iVar = buttonClicked instanceof qr.i ? (qr.i) buttonClicked : null;
        if (iVar != null) {
            iVar.b(true);
        }
        Unit unit = Unit.f21506a;
        g1Var.f(i4.Displaying.v(displaying, com.withpersona.sdk2.inquiry.steps.ui.components.g.m(components, createReusablePersonaComponent, qr.r.b(createReusablePersonaComponent, buttonClicked, buttonClicked)), null, null, null, null, null, null, null, new i4.b.CreateReusablePersona(createReusablePersonaComponent), false, false, null, null, null, false, 0, null, 0, 261886, null));
        return Unit.f21506a;
    }

    public static final Unit e0(g1 g1Var, i4 i4Var) {
        g1Var.f(i4.Displaying.v((i4.Displaying) i4Var, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 245759, null));
        return Unit.f21506a;
    }

    public static final Unit f0(g1 g1Var, boolean z10, i4 i4Var, hq.i.b it) {
        i4.Displaying displaying;
        Intrinsics.checkNotNullParameter(it, "it");
        int i10 = f.f18628a[it.getPermissionState().getResult().ordinal()];
        if (i10 == 1) {
            ls.h hVarI = g1Var.d().i();
            displaying = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
            if (displaying == null) {
                return Unit.f21506a;
            }
            g1Var.m0(displaying);
        } else if (i10 != 2) {
            if (i10 != 3) {
                throw new zt.l();
            }
            g1Var.f(i4.Displaying.v((i4.Displaying) i4Var, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        } else if (z10) {
            ls.h hVarI2 = g1Var.d().i();
            displaying = hVarI2 instanceof i4.Displaying ? (i4.Displaying) hVarI2 : null;
            if (displaying == null) {
                return Unit.f21506a;
            }
            g1Var.m0(displaying);
        } else {
            g1Var.f(i4.Displaying.v((i4.Displaying) i4Var, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 261119, null));
        }
        return Unit.f21506a;
    }

    public static final boolean g0(qr.i component) {
        Intrinsics.checkNotNullParameter(component, "component");
        return component.getAutoSubmitIntervalSeconds() != null;
    }

    public static final Unit h0(g1 g1Var, i4 i4Var, s6.Input input, x5 uiComponent, boolean z10, Map componentParams) {
        Intrinsics.checkNotNullParameter(uiComponent, "uiComponent");
        Intrinsics.checkNotNullParameter(componentParams, "componentParams");
        UiStepButtonType uiStepButtonTypeA = m4.a(uiComponent);
        if (uiStepButtonTypeA != null) {
            TrackingEventsLogger.logUiStepButtonEvent$default(g1Var.trackingEventsLogger, uiStepButtonTypeA, uiComponent.getName(), ((i4.Displaying) i4Var).getStepName(), false, 8, null);
        }
        i4.Displaying displaying = (i4.Displaying) i4Var;
        g1Var.w0(uiComponent, z10, displaying);
        if (input.getInquirySessionConfig().getGpsCollectionRequirement() == hr.a.NONE || displaying.getHasRequestedGpsPermissions()) {
            ls.h hVarI = g1Var.d().i();
            i4.Displaying displaying2 = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
            if (displaying2 == null) {
                return Unit.f21506a;
            }
            i4.Displaying displayingV = i4.Displaying.v(displaying2, null, null, null, null, null, null, null, null, null, false, false, componentParams, uiComponent, null, false, 0, null, 0, 255999, null);
            g1Var.f(displayingV);
            g1Var.m0(displayingV);
        } else {
            g1Var.f(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, true, componentParams, uiComponent, null, false, 0, null, 0, 254975, null));
        }
        return Unit.f21506a;
    }

    public static final Unit i0(g1 g1Var, i4 i4Var) {
        TrackingEventsLogger.logUiStepButtonEvent$default(g1Var.trackingEventsLogger, UiStepButtonType.Complete, null, ((i4.Displaying) i4Var).getStepName(), false, 10, null);
        g1Var.e(s6.c.C0279c.f14484a);
        return Unit.f21506a;
    }

    public static final Unit o0(Function1 function1, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.f21506a;
    }

    public static final Unit q0(g1 g1Var, i4.Displaying displaying, final i4.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent governmentIdNfcScanComponent, eq.l output) {
        String scanDocumentError;
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.c(output, eq.l.a.f14069a)) {
            g1Var.f(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262111, null));
        } else if (output instanceof eq.l.b) {
            String name = nfcScan.getComponent().getName();
            GovernmentIdNfcScan.Attributes attributes = governmentIdNfcScanComponent.getConfig().getAttributes();
            if (attributes == null || (scanDocumentError = attributes.getScanDocumentError()) == null) {
                scanDocumentError = BuildConfig.FLAVOR;
            }
            g1Var.f(i4.Displaying.v(displaying, null, null, p001kotlin.collections.o.d(new g2(new UiComponentError.UiInputComponentError(name, BuildConfig.FLAVOR, scanDocumentError), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262107, null));
        } else if (output instanceof eq.l.f) {
            ls.h hVarI = g1Var.d().i();
            i4.Displaying displaying2 = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
            if (displaying2 == null) {
                return Unit.f21506a;
            }
            GovernmentIdNfcScanComponent governmentIdNfcScanComponent2 = (GovernmentIdNfcScanComponent) sr.h.a(displaying2.getComponents(), p001kotlin.jvm.internal.d0.b(GovernmentIdNfcScanComponent.class), new Function1() { // from class: hs.x0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g1.r0(nfcScan, (GovernmentIdNfcScanComponent) obj));
                }
            });
            if (governmentIdNfcScanComponent2 == null) {
                return Unit.f21506a;
            }
            eq.l.f fVar = (eq.l.f) output;
            governmentIdNfcScanComponent2.getNfcDataController().c(new GovernmentIdNfcData(fVar.getDg1Uri(), fVar.getDg2Uri(), fVar.getSodUri(), fVar.getChipAuthenticationStatus()));
            g1Var.f(m1.b(displaying, fVar.getSubmitButtonComponentName()));
        } else if (output instanceof eq.l.e) {
            g1Var.f(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, 0, null, 0, 245727, null));
        } else {
            if (!(output instanceof eq.l.ReenterDetails)) {
                throw new zt.l();
            }
            g1Var.f(m1.b(displaying, ((eq.l.ReenterDetails) output).getButtonComponentName()));
        }
        return Unit.f21506a;
    }

    public static final boolean r0(i4.Displaying.NfcScan nfcScan, GovernmentIdNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), nfcScan.getComponent().getName());
    }

    public static final Unit t0(g1 g1Var, i4.Displaying displaying, final JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, zp.i output) {
        i4.Displaying displaying2;
        sr.k kVarJ;
        sr.k kVarJ2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof zp.i.c) {
            ls.h hVarI = g1Var.d().i();
            displaying2 = hVarI instanceof i4.Displaying ? (i4.Displaying) hVarI : null;
            if (displaying2 == null) {
                return Unit.f21506a;
            }
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent2 = (JpMyNumberNfcScanComponent) sr.h.a(displaying2.getComponents(), p001kotlin.jvm.internal.d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: hs.v0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g1.u0(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
                }
            });
            if (jpMyNumberNfcScanComponent2 != null && (kVarJ2 = jpMyNumberNfcScanComponent2.getScanResultController()) != null) {
                kVarJ2.c(((zp.i.c) output).getResult());
            }
            g1Var.f(m1.b(displaying, ((zp.i.c) output).getTransitionComponentName()));
        } else if (output instanceof zp.i.b) {
            ls.h hVarI2 = g1Var.d().i();
            displaying2 = hVarI2 instanceof i4.Displaying ? (i4.Displaying) hVarI2 : null;
            if (displaying2 == null) {
                return Unit.f21506a;
            }
            JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent3 = (JpMyNumberNfcScanComponent) sr.h.a(displaying2.getComponents(), p001kotlin.jvm.internal.d0.b(JpMyNumberNfcScanComponent.class), new Function1() { // from class: hs.w0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g1.v0(jpMyNumberNfcScanComponent, (JpMyNumberNfcScanComponent) obj));
                }
            });
            if (jpMyNumberNfcScanComponent3 != null && (kVarJ = jpMyNumberNfcScanComponent3.getScanResultController()) != null) {
                kVarJ.c(((zp.i.b) output).getResult());
            }
            String transitionComponentName = ((zp.i.b) output).getTransitionComponentName();
            if (transitionComponentName == null || transitionComponentName.length() == 0) {
                g1Var.f(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
            } else {
                g1Var.f(m1.b(displaying, transitionComponentName));
            }
        } else {
            if (!Intrinsics.c(output, zp.i.a.f39376a)) {
                throw new zt.l();
            }
            g1Var.f(i4.Displaying.v(displaying, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262079, null));
        }
        return Unit.f21506a;
    }

    public static final boolean u0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final boolean v0(JpMyNumberNfcScanComponent jpMyNumberNfcScanComponent, JpMyNumberNfcScanComponent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.c(it.getName(), jpMyNumberNfcScanComponent.getName());
    }

    public static final Unit x0(boolean z10, x5 x5Var, x5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof u2) {
            ((u2) it).b(z10 ? Intrinsics.c(it.getName(), x5Var.getName()) : true);
        }
        return Unit.f21506a;
    }

    @NotNull
    public final i4 M(@NotNull s6.Input props) {
        List<x5> listK;
        Intrinsics.checkNotNullParameter(props, "props");
        List<UiComponentConfig> components = props.getComponents();
        if (components == null || (listK = com.withpersona.sdk2.inquiry.steps.ui.components.g.i(components)) == null) {
            listK = p001kotlin.collections.p.k();
        }
        if (!this.featureFlagManager.a(to.t.f32630a)) {
            listK = m1.d(listK);
        }
        List<x5> list = listK;
        String stepName = props.getStepName();
        StepStyles.UiStepStyle styles = props.getStyles();
        List<g2> listS = props.s();
        if (listS == null) {
            listS = p001kotlin.collections.p.k();
        }
        return new i4.Displaying(list, stepName, listS, styles, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262128, null);
    }

    public final void N(JpMyNumberNfcScanComponent component, i4.Displaying renderState) {
        String enableNfcPrompt;
        if (component.getValidOperation() == null) {
            return;
        }
        if (!j0(component)) {
            w0(component, true, renderState);
            f(i4.Displaying.v(renderState, null, null, p001kotlin.collections.p.k(), null, null, null, new i4.Displaying.JpMyNumberNfcScan(component), null, null, false, false, null, null, null, false, 0, null, 0, 262075, null));
            return;
        }
        String name = component.getName();
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) {
            enableNfcPrompt = BuildConfig.FLAVOR;
        }
        f(i4.Displaying.v(renderState, null, null, p001kotlin.collections.o.d(new g2(new UiComponentError.UiInputComponentError(name, BuildConfig.FLAVOR, enableNfcPrompt), 0L, 2, null)), null, null, null, null, null, null, false, false, null, null, null, false, 0, null, 0, 262139, null));
    }

    public final void O(GovernmentIdNfcScanComponent component, i4.Displaying renderState) {
        w0(component, true, renderState);
        f(i4.Displaying.v(renderState, null, null, null, null, null, new i4.Displaying.NfcScan(component), null, null, null, false, false, null, null, null, false, renderState.getNfcScanAttemptCount() + 1, null, 0, 212959, null));
    }

    public final void P(s6.Input renderProps, final i4.Displaying renderState) {
        final i4.b pendingAction = renderState.getPendingAction();
        if (pendingAction instanceof i4.b.CreateReusablePersona) {
            ls.g<i4> gVarD = d();
            o1.a aVar = this.createReusablePersonaWorkerFactory;
            String sessionToken = renderProps.getSessionToken();
            String inquiryId = renderProps.getInquiryId();
            i4.b.CreateReusablePersona createReusablePersona = (i4.b.CreateReusablePersona) pendingAction;
            String url = createReusablePersona.getCreatePersonaSheetComponent().getUrl();
            if (url == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            gVarD.n(aVar.a(sessionToken, inquiryId, url, createReusablePersona.getCreatePersonaSheetComponent().getName()), new Function1() { // from class: hs.s0
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g1.Q(pendingAction, this, renderState, (o1.b) obj);
                }
            });
            return;
        }
        if (!(pendingAction instanceof i4.b.VerifyReusablePersona)) {
            if (pendingAction != null) {
                throw new zt.l();
            }
            return;
        }
        ls.g<i4> gVarD2 = d();
        x6.a aVar2 = this.verifyReusablePersonaWorkerFactory;
        String sessionToken2 = renderProps.getSessionToken();
        String inquiryId2 = renderProps.getInquiryId();
        i4.b.VerifyReusablePersona verifyReusablePersona = (i4.b.VerifyReusablePersona) pendingAction;
        String url2 = verifyReusablePersona.getVerifyPersonaButtonComponent().getUrl();
        if (url2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        gVarD2.n(aVar2.a(sessionToken2, inquiryId2, url2, verifyReusablePersona.getVerifyPersonaButtonComponent().getName(), verifyReusablePersona.a()), new Function1() { // from class: hs.t0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.R(this.f18708a, renderState, (x6.b) obj);
            }
        });
    }

    public final Object S(final s6.Input input, final i4 i4Var, eu.b<? super Unit> bVar) {
        boolean z10;
        s6.d.a.AutoSubmit autoSubmit;
        if (input.getIsRestoringState()) {
            return Unit.f21506a;
        }
        if (!(i4Var instanceof i4.Displaying)) {
            throw new zt.l();
        }
        i4.Displaying displaying = (i4.Displaying) i4Var;
        P(input, displaying);
        final qr.g0 g0Var = (qr.g0) sr.h.a(displaying.getComponents(), p001kotlin.jvm.internal.d0.b(qr.g0.class), g.f18629a);
        this.navigationStateManager.c(input.getBackStepEnabled(), input.getCancelButtonEnabled(), displaying.getPendingAction() == null && !input.getIsSubmitting(), g0Var != null && g0Var.isEnabled());
        n0(displaying.getComponents(), new Function1() { // from class: hs.r0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.c0(this.f18700a, input, i4Var, (x5) obj);
            }
        });
        if (displaying.getNfcScan() != null) {
            p0(input, displaying, displaying.getNfcScan());
        }
        if (displaying.getJpMyNumberNfcScan() != null) {
            s0(input, displaying, displaying.getJpMyNumberNfcScan());
        }
        fq.n0 n0Var = input.getInquirySessionConfig().getGpsPrecisionRequirement() == hr.e.ROUGH ? fq.n0.RoughLocation : fq.n0.PreciseLocation;
        final boolean z11 = input.getInquirySessionConfig().getGpsCollectionRequirement() == hr.a.OPTIONAL;
        if (displaying.getIsRequestingGpsPermissions()) {
            ls.g<i4> gVarD = d();
            hq.i.a aVar = this.permissionRequestWorkerFactory;
            String gpsPermissionsTitle = input.getGpsPermissionsTitle();
            if (gpsPermissionsTitle == null) {
                gpsPermissionsTitle = BuildConfig.FLAVOR;
            }
            String gpsPermissionsRationale = input.getGpsPermissionsRationale();
            if (gpsPermissionsRationale == null) {
                gpsPermissionsRationale = "Gps permission are required to verify your identity";
            }
            Context context = this.applicationContext;
            String string = context.getString(jq.g.f20873c0, xq.g.b(context));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String gpsFeatureModalPositiveButton = input.getGpsFeatureModalPositiveButton();
            if (gpsFeatureModalPositiveButton == null) {
                gpsFeatureModalPositiveButton = this.applicationContext.getString(jq.g.D);
                Intrinsics.checkNotNullExpressionValue(gpsFeatureModalPositiveButton, "getString(...)");
            }
            String gpsPermissionsModalNegativeButton = input.getGpsPermissionsModalNegativeButton();
            if (gpsPermissionsModalNegativeButton == null) {
                gpsPermissionsModalNegativeButton = this.applicationContext.getString(jq.g.D);
                Intrinsics.checkNotNullExpressionValue(gpsPermissionsModalNegativeButton, "getString(...)");
            }
            gVarD.n(aVar.a(new n1.Props(n0Var, z11, gpsPermissionsTitle, gpsPermissionsRationale, string, gpsFeatureModalPositiveButton, gpsPermissionsModalNegativeButton, input.getGpsFeatureTitle(), input.getGpsFeatureRationale(), input.getGpsPermissionsModalNegativeButton(), input.getStyles())), new Function1() { // from class: hs.e1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return g1.f0(this.f18583a, z11, i4Var, (hq.i.b) obj);
                }
            });
        } else {
            displaying = displaying;
        }
        String error = displaying.getError();
        if (error == null && input.getTransitionError() != null) {
            error = this.applicationContext.getString(jq.g.B);
        }
        String str = error;
        if (displaying.getAutoSubmit() == null) {
            qr.i iVar = (qr.i) sr.h.a(displaying.getComponents(), p001kotlin.jvm.internal.d0.b(qr.i.class), new Function1() { // from class: hs.f1
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(g1.g0((qr.i) obj));
                }
            });
            if (iVar != null) {
                d().m("begin_countdown", new i(i4Var, iVar, null));
            }
        }
        i4.Displaying.AutoSubmit autoSubmit2 = displaying.getAutoSubmit();
        if (autoSubmit2 != null) {
            z10 = true;
            if (autoSubmit2.getCountdown() >= 1) {
                d().m("countdown_" + autoSubmit2.getCountdown(), new j(autoSubmit2, this, i4Var, null));
            }
        } else {
            z10 = true;
        }
        List<x5> components = displaying.getComponents();
        List<UiComponentConfig> components2 = input.getComponents();
        List<g2> listX = displaying.x();
        List<g2> listS = input.s();
        if (listS == null) {
            listS = p001kotlin.collections.p.k();
        }
        List listW0 = CollectionsKt.w0(listX, listS);
        ir.a aVarB = this.navigationStateManager.b();
        String navBarTitle = input.getNavBarTitle();
        if (input.getIsSubmitting() || displaying.getAutoSubmit() == null) {
            autoSubmit = null;
        } else {
            autoSubmit = new s6.d.a.AutoSubmit(displaying.getAutoSubmit().getComponent(), displaying.getAutoSubmit().getCountdownText(), displaying.getAutoSubmit().getCountdown() <= 0 ? z10 : false);
        }
        Object objG = av.i.g(av.g1.c(), new k(new s6.d.a(components, components2, listW0, aVarB, navBarTitle, new pu.n() { // from class: hs.h0
            @Override // pu.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return g1.h0(this.f18650a, i4Var, input, (x5) obj, ((Boolean) obj2).booleanValue(), (Map) obj3);
            }
        }, new Function0() { // from class: hs.i0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.i0(this.f18666a, i4Var);
            }
        }, new Function0() { // from class: hs.j0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.T(this.f18670a, i4Var, input);
            }
        }, new Function1() { // from class: hs.k0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.U(this.f18674a, i4Var, (GovernmentIdNfcScanComponent) obj);
            }
        }, new Function1() { // from class: hs.l0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.V(this.f18676a, i4Var, (JpMyNumberNfcScanComponent) obj);
            }
        }, new Function0() { // from class: hs.m0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.W(g0Var, this, i4Var);
            }
        }, new Function0() { // from class: hs.n0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.X(g0Var, this, i4Var);
            }
        }, new Function2() { // from class: hs.y0
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g1.Y(this.f18724a, i4Var, (d6) obj, (Map) obj2);
            }
        }, autoSubmit, new Function0() { // from class: hs.z0
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.Z(this.f18727a);
            }
        }, new Function2() { // from class: hs.a1
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g1.a0(this.f18555a, i4Var, (InputAddressComponent) obj, (String) obj2);
            }
        }, (displaying.getPendingAction() != null || input.getIsSubmitting()) ? z10 : false, displaying.getStyles(), str, new Function0() { // from class: hs.b1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.b0(this.f18562a, i4Var);
            }
        }, new Function2() { // from class: hs.c1
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g1.d0(this.f18569a, i4Var, (CreatePersonaSheetComponent) obj, (x5) obj2);
            }
        }, g0Var != null ? g0Var.o1(displaying.getNfcScanAttemptCount()) : null, displaying.getShowHelpBottomSheet(), new Function0() { // from class: hs.d1
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g1.e0(this.f18575a, i4Var);
            }
        }), null), bVar);
        return objG == fu.c.e() ? objG : Unit.f21506a;
    }

    public final boolean j0(JpMyNumberNfcScanComponent component) {
        List<String> listD;
        if (!this.sandboxFlags.c()) {
            return !zp.q.f39405a.c(this.applicationContext);
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        boolean zC = attributes != null ? Intrinsics.c(attributes.getPreferVendorMocks(), Boolean.TRUE) : false;
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationK = component.getValidOperation();
        return !zC && zp.t.f39412a.a((jpMyNumberNfcValidOperationK == null || (listD = jpMyNumberNfcValidOperationK.d()) == null) ? null : (String) CollectionsKt.firstOrNull(listD));
    }

    public final void k0(s6.Input renderProps, i4 renderState) {
        dr.i dVar;
        if (!(renderState instanceof i4.Displaying)) {
            throw new zt.l();
        }
        i4.Displaying displaying = (i4.Displaying) renderState;
        if (displaying.getPendingAction() != null) {
            i4.b pendingAction = displaying.getPendingAction();
            if (pendingAction instanceof i4.b.CreateReusablePersona) {
                dVar = new dr.i.a(renderProps.getStepName());
            } else {
                if (!(pendingAction instanceof i4.b.VerifyReusablePersona)) {
                    throw new zt.l();
                }
                dVar = new dr.i.g(renderProps.getStepName());
            }
        } else {
            dVar = displaying.getNfcScan() != null ? new dr.i.d(renderProps.getStepName()) : new dr.i.f(renderProps.getStepName());
        }
        this.externalEventLogger.c(dVar);
        this.trackingEventsLogger.logInquiryPageViewEvent(dVar.getStepName(), dVar.toString(), false);
    }

    public final void l0() {
    }

    public final void m0(i4.Displaying renderState) {
        x5 triggeringComponent = renderState.getTriggeringComponent();
        Map<String, ComponentParam> mapY = renderState.y();
        if (triggeringComponent == null || mapY == null) {
            return;
        }
        e(new s6.c.FinishedWithoutTransition(triggeringComponent, mapY, renderState.getStepName()));
    }

    public final void n0(List<? extends x5> list, final Function1<? super x5, Unit> function1) {
        for (x5 x5Var : list) {
            if (x5Var instanceof y5) {
                n0(((y5) x5Var).getChildren(), new Function1() { // from class: hs.u0
                    @Override // p001kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g1.o0(function1, (x5) obj);
                    }
                });
            } else {
                function1.invoke(x5Var);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0145 A[PHI: r12
      0x0145: PHI (r12v11 java.lang.String) = (r12v3 java.lang.String), (r12v12 java.lang.String) binds: [B:95:0x0150, B:89:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    public final void p0(s6.Input renderProps, final i4.Displaying renderState, final i4.Displaying.NfcScan nfcScan) {
        List<? extends eq.c> listN;
        String scanDocumentError;
        String str;
        String incorrectIdDetailsTransitionComponentName;
        String unableToScanTransitionComponentName;
        String successfulScanTransitionComponentName;
        String rescanDocumentPrompt;
        String scanDocumentPromptTitle;
        String errorModalReenterIdDetailsButtonText;
        String errorModalTroubleshootingTipsButtonText;
        String errorModalTryAgainButtonText;
        String errorModalGenericErrorText;
        String errorModalGenericErrorTitle;
        String errorModalIncorrectIdDetailsText;
        String errorModalIncorrectIdDetailsTitle;
        String errorModalLostConnectionText;
        String errorModalLostConnectionTitle;
        String errorModalChipNotDetectedText;
        String errorModalChipNotDetectedTitle;
        String scanDocumentError2;
        String authenticationErrorPrompt;
        String enableNfcPrompt;
        String scanDocumentSuccess;
        String scanDocumentSuccessTitle;
        String authenticatingTitle;
        String readingTitle;
        String reading;
        String authenticating;
        String scanDocumentPrompt;
        String scanDocumentPromptTitle2;
        List<GovernmentIdNfcScan.DataGroupTypes> enabledDataGroups;
        eq.c cVar;
        final GovernmentIdNfcScanComponent component = nfcScan.getComponent();
        String strB = component.getCardAccessNumberController().b();
        String strB2 = component.getDocumentNumberController().b();
        Date dateB = component.getDateOfBirthController().b();
        Date dateB2 = component.getExpirationDateController().b();
        GovernmentIdNfcScan.Attributes attributes = component.getConfig().getAttributes();
        if (StringsKt.p0(strB2) || dateB == null || dateB2 == null) {
            d().m("client_side_nfc_form_validation", new l(attributes, this, strB2, dateB, dateB2, nfcScan, renderState, null));
            return;
        }
        MrzKey mrzKey = new MrzKey(strB2, dateB2, dateB);
        if (attributes == null || (enabledDataGroups = attributes.getEnabledDataGroups()) == null) {
            listN = p001kotlin.collections.p.n(eq.c.Dg1, eq.c.Dg2, eq.c.Sod);
        } else {
            listN = new ArrayList<>();
            Iterator<T> it = enabledDataGroups.iterator();
            while (it.hasNext()) {
                int i10 = f.b[((GovernmentIdNfcScan.DataGroupTypes) it.next()).ordinal()];
                if (i10 == 1) {
                    cVar = eq.c.Dg1;
                } else if (i10 == 2) {
                    cVar = eq.c.Dg2;
                } else if (i10 != 3) {
                    cVar = i10 != 4 ? null : eq.c.Sod;
                } else {
                    cVar = eq.c.Dg14;
                }
                if (cVar != null) {
                    listN.add(cVar);
                }
            }
        }
        ls.g<i4> gVarD = d();
        eq.p.a aVar = this.nfcScanWorkerFactory;
        String str2 = (attributes == null || (scanDocumentPromptTitle2 = attributes.getScanDocumentPromptTitle()) == null) ? BuildConfig.FLAVOR : scanDocumentPromptTitle2;
        String str3 = (attributes == null || (scanDocumentPrompt = attributes.getScanDocumentPrompt()) == null) ? BuildConfig.FLAVOR : scanDocumentPrompt;
        String str4 = (attributes == null || (authenticating = attributes.getAuthenticating()) == null) ? BuildConfig.FLAVOR : authenticating;
        String str5 = (attributes == null || (reading = attributes.getReading()) == null) ? BuildConfig.FLAVOR : reading;
        String str6 = (attributes == null || (readingTitle = attributes.getReadingTitle()) == null) ? BuildConfig.FLAVOR : readingTitle;
        String str7 = (attributes == null || (authenticatingTitle = attributes.getAuthenticatingTitle()) == null) ? BuildConfig.FLAVOR : authenticatingTitle;
        String string = this.applicationContext.getString(jq.g.C);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String str8 = (attributes == null || (scanDocumentSuccessTitle = attributes.getScanDocumentSuccessTitle()) == null) ? BuildConfig.FLAVOR : scanDocumentSuccessTitle;
        String str9 = (attributes == null || (scanDocumentSuccess = attributes.getScanDocumentSuccess()) == null) ? BuildConfig.FLAVOR : scanDocumentSuccess;
        String str10 = (attributes == null || (enableNfcPrompt = attributes.getEnableNfcPrompt()) == null) ? BuildConfig.FLAVOR : enableNfcPrompt;
        String string2 = this.applicationContext.getString(jq.g.D);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = this.applicationContext.getString(jq.g.C);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (attributes == null || (scanDocumentError = attributes.getConnectionLostPrompt()) == null) {
            scanDocumentError = attributes != null ? attributes.getScanDocumentError() : null;
            if (scanDocumentError == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = scanDocumentError;
            }
        } else {
            str = scanDocumentError;
        }
        String string4 = this.applicationContext.getString(jq.g.F);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String str11 = (attributes == null || (authenticationErrorPrompt = attributes.getAuthenticationErrorPrompt()) == null) ? BuildConfig.FLAVOR : authenticationErrorPrompt;
        String string5 = this.applicationContext.getString(jq.g.F);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String str12 = (attributes == null || (scanDocumentError2 = attributes.getScanDocumentError()) == null) ? BuildConfig.FLAVOR : scanDocumentError2;
        String string6 = this.applicationContext.getString(jq.g.F);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        gVarD.n(aVar.a(strB, mrzKey, new PassportNfcStrings(str2, str3, str4, str7, str5, str6, string, str8, str9, str10, string2, string3, str, string4, str11, string5, str12, string6, (attributes == null || (errorModalChipNotDetectedTitle = attributes.getErrorModalChipNotDetectedTitle()) == null) ? BuildConfig.FLAVOR : errorModalChipNotDetectedTitle, (attributes == null || (errorModalChipNotDetectedText = attributes.getErrorModalChipNotDetectedText()) == null) ? BuildConfig.FLAVOR : errorModalChipNotDetectedText, (attributes == null || (errorModalLostConnectionTitle = attributes.getErrorModalLostConnectionTitle()) == null) ? BuildConfig.FLAVOR : errorModalLostConnectionTitle, (attributes == null || (errorModalLostConnectionText = attributes.getErrorModalLostConnectionText()) == null) ? BuildConfig.FLAVOR : errorModalLostConnectionText, (attributes == null || (errorModalIncorrectIdDetailsTitle = attributes.getErrorModalIncorrectIdDetailsTitle()) == null) ? BuildConfig.FLAVOR : errorModalIncorrectIdDetailsTitle, (attributes == null || (errorModalIncorrectIdDetailsText = attributes.getErrorModalIncorrectIdDetailsText()) == null) ? BuildConfig.FLAVOR : errorModalIncorrectIdDetailsText, (attributes == null || (errorModalGenericErrorTitle = attributes.getErrorModalGenericErrorTitle()) == null) ? BuildConfig.FLAVOR : errorModalGenericErrorTitle, (attributes == null || (errorModalGenericErrorText = attributes.getErrorModalGenericErrorText()) == null) ? BuildConfig.FLAVOR : errorModalGenericErrorText, (attributes == null || (errorModalTryAgainButtonText = attributes.getErrorModalTryAgainButtonText()) == null) ? BuildConfig.FLAVOR : errorModalTryAgainButtonText, (attributes == null || (errorModalTroubleshootingTipsButtonText = attributes.getErrorModalTroubleshootingTipsButtonText()) == null) ? BuildConfig.FLAVOR : errorModalTroubleshootingTipsButtonText, (attributes == null || (errorModalReenterIdDetailsButtonText = attributes.getErrorModalReenterIdDetailsButtonText()) == null) ? BuildConfig.FLAVOR : errorModalReenterIdDetailsButtonText, (attributes == null || (scanDocumentPromptTitle = attributes.getScanDocumentPromptTitle()) == null) ? BuildConfig.FLAVOR : scanDocumentPromptTitle, (attributes == null || (rescanDocumentPrompt = attributes.getRescanDocumentPrompt()) == null) ? BuildConfig.FLAVOR : rescanDocumentPrompt, (attributes == null || (successfulScanTransitionComponentName = attributes.getSuccessfulScanTransitionComponentName()) == null) ? BuildConfig.FLAVOR : successfulScanTransitionComponentName, (attributes == null || (unableToScanTransitionComponentName = attributes.getUnableToScanTransitionComponentName()) == null) ? BuildConfig.FLAVOR : unableToScanTransitionComponentName, (attributes == null || (incorrectIdDetailsTransitionComponentName = attributes.getIncorrectIdDetailsTransitionComponentName()) == null) ? BuildConfig.FLAVOR : incorrectIdDetailsTransitionComponentName), listN, renderProps.getStyles(), null, component.getConfig().getStyles()), new Function1() { // from class: hs.o0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.q0(this.f18688a, renderState, nfcScan, component, (eq.l) obj);
            }
        });
    }

    public final void s0(s6.Input renderProps, final i4.Displaying renderState, i4.Displaying.JpMyNumberNfcScan jpMyNumberNfcScan) {
        Boolean preferVendorMocks;
        final JpMyNumberNfcScanComponent component = jpMyNumberNfcScan.getComponent();
        JpMyNumberNfcValidOperation jpMyNumberNfcValidOperationK = component.getValidOperation();
        if (jpMyNumberNfcValidOperationK == null) {
            return;
        }
        JpMyNumberNfcScan.Attributes attributes = component.getConfig().getAttributes();
        d().n(this.scanJpMyNumberNfcWorkerFactory.a(jpMyNumberNfcValidOperationK, JpMyNumberNfcStrings.INSTANCE.a(attributes), attributes != null ? attributes.getTransitionComponents() : null, component.getConfig().getStyles(), renderProps.getStyles(), null, (attributes == null || (preferVendorMocks = attributes.getPreferVendorMocks()) == null) ? false : preferVendorMocks.booleanValue()), new Function1() { // from class: hs.p0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.t0(this.f18694a, renderState, component, (zp.i) obj);
            }
        });
    }

    public final void w0(final x5 tappedUiComponent, final boolean isTappedComponentVisible, i4.Displaying renderState) {
        n0(renderState.getComponents(), new Function1() { // from class: hs.q0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g1.x0(isTappedComponentVisible, tappedUiComponent, (x5) obj);
            }
        });
    }
}
