package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.AbstractC0934h;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.C0993y0;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import androidx.p616lifecycle.InterfaceC0980s;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.LocalStaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StyleVariant;
import com.withpersona.sdk2.inquiry.inline_inquiry.InquiryEvent;
import com.withpersona.sdk2.inquiry.internal.C3690i;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.C3678a;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.InterfaceC3680c;
import com.withpersona.sdk2.inquiry.internal.network.C3707f;
import com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment;
import com.withpersona.sdk2.inquiry.internal.workflows.InterfaceC3738a;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import kr.InterfaceC7814a;
import mp.C8614c0;
import mp.C8615d;
import mp.C8625i;
import mp.C8634q;
import mp.C8640w;
import mq.C8645b;
import mq.C8647d;
import mq.InterfaceC8644a;
import nu.C9579j;
import nu.InterfaceC9564b0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p019ap.C1136e;
import p032bp.C1484f;
import p058cp.C4195c;
import p068d5.InterfaceC4445i;
import p082dp.C4649c;
import p093e4.ActivityC4831q;
import p093e4.C4822l0;
import p093e4.C4836u;
import p226jq.C7252c0;
import p226jq.C7265j;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.C7348o;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p237k4.CreationExtras;
import p253kq.InterfaceC7813d;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p278lp.C8221c;
import p315nt.InterfaceC9557b;
import p316o.C9611d;
import p344ot.C10047c;
import p363pq.C10312f;
import p363pq.InterfaceC10307a;
import p363pq.InterfaceC10311e;
import p390qp.C10689c;
import p390qp.C10691e;
import p391qq.C10698a;
import p497vp.C12245h;
import p524wo.InterfaceC12499a;
import p524wo.InterfaceC12500b;
import p524wo.ScreenState;
import p553xn.C12868c;
import p610zo.C13948a;
import p610zo.C13957e0;
import p610zo.C13964i;
import p610zo.C13974n;
import p610zo.C13987x;
import p610zo.InterfaceC13982s;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J+\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0005J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u0005J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010\u0018J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b0\u00101J\u0011\u00102\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\f¨\u0006V"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i;", "Landroidx/fragment/app/c;", "Lwo/b;", "Lkq/d;", "<init>", "()V", "", "resetState", "", "h2", "(Z)V", "r2", "()Z", "Landroid/content/Context;", "context", "i2", "(Landroid/content/Context;)V", "", "redirectUri", "p2", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "resultBundle", "q2", "(Landroid/os/Bundle;)V", "g2", "C0", "savedInstanceState", "F0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "c1", "a1", "V0", "d1", "K0", "N0", "outState", "b1", "Lwo/a;", "k2", "()Lwo/a;", "x", "()Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;", "cancelOutput", "n2", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output$Cancel;)V", "Lcom/withpersona/sdk2/inquiry/internal/workflows/a$a;", "m2", "()Lcom/withpersona/sdk2/inquiry/internal/workflows/a$a;", "Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;", "output", "o2", "(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Output;)V", "Lcom/withpersona/sdk2/inquiry/internal/h;", "f0", "Ljt/h;", "j2", "()Lcom/withpersona/sdk2/inquiry/internal/h;", "args", "Lzo/x;", "g0", "l2", "()Lzo/x;", "viewModel", "Lbp/f;", "h0", "Lbp/f;", "binding", "i0", "Landroid/content/Context;", "themedContext", "", "getTheme", "()Ljava/lang/Integer;", "theme", "isInline", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3690i extends ComponentCallbacksC0929c implements InterfaceC12500b, InterfaceC7813d {

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h args = C7342i.m30456b(new Function0() { // from class: zo.u
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C3690i.m18555f2(this.f48850a);
        }
    });

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public C1484f binding;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @Nullable
    public Context themedContext;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.i$a */
    @Metadata(m31664d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, m31665d2 = {"com/withpersona/sdk2/inquiry/internal/i$a", "Lpq/e;", "Lnu/h;", "Lpq/a;", "a", "Lnu/h;", "c", "()Lnu/h;", "controllerRequestFlow", "Lnu/c0;", "Lwo/c;", "b", "Lnu/c0;", "()Lnu/c0;", "screenStateFlow", "Lnu/b0;", "Lcom/withpersona/sdk2/inquiry/inline_inquiry/InquiryEvent;", "Lnu/b0;", "()Lnu/b0;", "eventFlow", "", "d", "Z", "()Z", "isNavBarEnabled", "e", "handleBackPress", "inquiry-internal_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC10311e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final InterfaceC9575h<InterfaceC10307a> controllerRequestFlow;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final InterfaceC9566c0<ScreenState> screenStateFlow;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final InterfaceC9564b0<InquiryEvent> eventFlow;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final boolean isNavBarEnabled;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public final boolean handleBackPress;

        public a(C3690i c3690i) {
            this.controllerRequestFlow = c3690i.m18557l2().m50546g();
            this.screenStateFlow = c3690i.m18557l2().m50563x();
            this.eventFlow = c3690i.m18557l2().m50551l();
            this.isNavBarEnabled = c3690i.m18556j2().m18523H();
            this.handleBackPress = c3690i.m18556j2().m18535l();
        }

        @Override // p363pq.InterfaceC10311e
        /* JADX INFO: renamed from: a */
        public InterfaceC9564b0<InquiryEvent> mo18568a() {
            return this.eventFlow;
        }

        @Override // p363pq.InterfaceC10311e
        /* JADX INFO: renamed from: b */
        public InterfaceC9566c0<ScreenState> mo18569b() {
            return this.screenStateFlow;
        }

        @Override // p363pq.InterfaceC10311e
        /* JADX INFO: renamed from: c */
        public InterfaceC9575h<InterfaceC10307a> mo18570c() {
            return this.controllerRequestFlow;
        }

        @Override // p363pq.InterfaceC10311e
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getIsNavBarEnabled() {
            return this.isNavBarEnabled;
        }

        @Override // p363pq.InterfaceC10311e
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getHandleBackPress() {
            return this.handleBackPress;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.i$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.internal.InquiryFragment$onViewCreated$1", m39664f = "InquiryFragment.kt", m39665l = {152}, m39666m = "invokeSuspend")
    public static final class b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f15229t;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.i$b$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3690i f15231a;

            public a(C3690i c3690i) {
                this.f15231a = c3690i;
            }

            /* JADX INFO: renamed from: b */
            public final Object m18573b(boolean z10, InterfaceC9557b<? super Unit> interfaceC9557b) {
                this.f15231a.m18560h2(true);
                return Unit.f29331a;
            }

            @Override // nu.InterfaceC9577i
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                return m18573b(((Boolean) obj).booleanValue(), interfaceC9557b);
            }
        }

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C3690i.this.new b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f15229t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9575h interfaceC9575hM37797n = C9579j.m37797n(C3690i.this.m18557l2().m50552m(), 1);
                a aVar = new a(C3690i.this);
                this.f15229t = 1;
                if (interfaceC9575hM37797n.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.i$c */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class c extends AbstractC7746m implements Function0<ComponentCallbacksC0929c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f15232i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f15232i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC0929c invoke() {
            return this.f15232i;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.i$d */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class d extends AbstractC7746m implements Function0<InterfaceC0947c1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f15233i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0) {
            super(0);
            this.f15233i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0947c1 invoke() {
            return (InterfaceC0947c1) this.f15233i.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.i$e */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class e extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7341h f15234i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f15234i = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return C4822l0.m23349c(this.f15234i).mo4712w();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.i$f */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class f extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f15235i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f15236j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f15235i = function0;
            this.f15236j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f15235i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f15236j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return interfaceC0962j != null ? interfaceC0962j.mo4653Z() : CreationExtras.b.f28722c;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.i$g */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", "b", "()Landroidx/lifecycle/a1$c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class g extends AbstractC7746m implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f15237i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f15238j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacksC0929c componentCallbacksC0929c, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f15237i = componentCallbacksC0929c;
            this.f15238j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            C0941a1.c cVarMo4647X;
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f15238j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return (interfaceC0962j == null || (cVarMo4647X = interfaceC0962j.mo4647X()) == null) ? this.f15237i.mo4647X() : cVarMo4647X;
        }
    }

    public C3690i() {
        InterfaceC7341h interfaceC7341hM30455a = C7342i.m30455a(EnumC7344k.NONE, new d(new c(this)));
        this.viewModel = C4822l0.m23348b(this, C7731d0.m32002b(C13987x.class), new e(interfaceC7341hM30455a), new f(null, interfaceC7341hM30455a), new g(this, interfaceC7341hM30455a));
    }

    /* JADX INFO: renamed from: f2 */
    public static final C3689h m18555f2(C3690i c3690i) {
        return new C3689h(c3690i.m4704t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public final C3689h m18556j2() {
        return (C3689h) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public final C13987x m18557l2() {
        return (C13987x) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: r2 */
    private final boolean m18558r2() {
        String strM18546w = m18556j2().m18546w();
        if (strM18546w == null || !StringsKt.m32150Z(strM18546w, '\n', false, 2, null)) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        bundle.putParcelable("ERROR_CODE_KEY", ErrorCode.SessionTokenError);
        m18567q2(bundle);
        m4617M().m4416a1();
        return false;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: C0 */
    public void mo4590C0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.mo4590C0(context);
        if (isInline()) {
            context = new C9611d(context, getTheme().intValue());
        }
        this.themedContext = context;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: F0 */
    public void mo4599F0(@Nullable Bundle savedInstanceState) {
        Context contextM4609I1 = m4609I1();
        Intrinsics.checkNotNullExpressionValue(contextM4609I1, "requireContext(...)");
        Context context = this.themedContext;
        if (context == null) {
            context = contextM4609I1;
        }
        m18561i2(context);
        super.mo4599F0(savedInstanceState);
        C4195c.m21690a(contextM4609I1);
        if (m18556j2().m18528e() || m18556j2().m18525b()) {
            C4195c.m21693d(contextM4609I1, m18557l2().getSdkFilesManager().m40779b());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.mo1225J0(inflater, container, savedInstanceState);
        C1484f c1484fM7605c = C1484f.m7605c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(c1484fM7605c, "inflate(...)");
        this.binding = c1484fM7605c;
        if (c1484fM7605c == null) {
            Intrinsics.m31998u("binding");
            c1484fM7605c = null;
        }
        CoordinatorLayout root = c1484fM7605c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: K0 */
    public void mo4613K0() {
        Context contextM4609I1 = m4609I1();
        Intrinsics.checkNotNullExpressionValue(contextM4609I1, "requireContext(...)");
        C4195c.m21694e(contextM4609I1);
        InterfaceC12499a interfaceC12499aM18562k2 = m18562k2();
        if (interfaceC12499aM18562k2 != null) {
            interfaceC12499aM18562k2.m46818a();
        }
        super.mo4613K0();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: N0 */
    public void mo4621N0() {
        super.mo4621N0();
        this.themedContext = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: V0 */
    public void mo4643V0() {
        super.mo4643V0();
        m18557l2().m50537C();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: a1 */
    public void mo4658a1() {
        super.mo4658a1();
        m18557l2().m50540F();
        m18557l2().m50538D();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: b1 */
    public void mo4661b1(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.mo4661b1(outState);
        InterfaceC7814a.INSTANCE.m32427a().mo20930e(outState);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: c1 */
    public void mo4663c1() {
        super.mo4663c1();
        Context contextM4609I1 = m4609I1();
        Intrinsics.checkNotNullExpressionValue(contextM4609I1, "requireContext(...)");
        C12868c.m47896d(contextM4609I1);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: d1 */
    public void mo4665d1() {
        super.mo4665d1();
        Context contextM4609I1 = m4609I1();
        Intrinsics.checkNotNullExpressionValue(contextM4609I1, "requireContext(...)");
        C12868c.m47898f(contextM4609I1);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        try {
            if (m18558r2()) {
                InterfaceC7814a.INSTANCE.m32427a().mo20927b(savedInstanceState);
                m18557l2().m50536B(this);
                m18557l2().m50553n().mo4863o(m18556j2().m18536m());
                m18557l2().m50535A().mo4863o(m18556j2().m18546w());
                InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
                Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
                C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k0), null, null, new b(null), 3, null);
                m18560h2(false);
                InterfaceC12499a interfaceC12499aM18562k2 = m18562k2();
                if (interfaceC12499aM18562k2 != null) {
                    interfaceC12499aM18562k2.m46819b(this);
                }
            }
        } catch (Exception e10) {
            if (!m18556j2().m18525b()) {
                throw e10;
            }
            if (m18556j2().m18528e()) {
                Context contextM4609I1 = m4609I1();
                Intrinsics.checkNotNullExpressionValue(contextM4609I1, "requireContext(...)");
                C4195c.m21692c(contextM4609I1).m21686c(e10);
            }
            Bundle bundle = new Bundle();
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            bundle.putParcelable("ERROR_CODE_KEY", ErrorCode.ExceptionError);
            m18567q2(bundle);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m18559g2() {
        InterfaceC13982s interfaceC13982sM50545f = m18557l2().getComponent();
        if (interfaceC13982sM50545f == null) {
            return;
        }
        interfaceC13982sM50545f.mo18389j().m18792b();
        interfaceC13982sM50545f.mo18386g().m19990f();
        m18557l2().getSdkFilesManager().m40778a();
    }

    @Override // p253kq.InterfaceC7813d
    @NotNull
    public Integer getTheme() {
        int iIntValue;
        if (isInline()) {
            Integer numM18518C = m18556j2().m18518C();
            iIntValue = (numM18518C == null || numM18518C.intValue() == 0) ? C12245h.f43273c : numM18518C.intValue();
        } else {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX INFO: renamed from: h2 */
    public final void m18560h2(boolean resetState) {
        InquiryWorkflow$Props templateProps;
        Context context = this.themedContext;
        if (context == null) {
            return;
        }
        String strMo4854f = m18557l2().m50553n().mo4854f();
        String strM18538o = m18556j2().m18538o();
        String strM18542s = m18556j2().m18542s();
        String strMo4854f2 = m18557l2().m50535A().mo4854f();
        if (strMo4854f != null) {
            templateProps = new InquiryWorkflow$Props.InquiryProps(strMo4854f, strMo4854f2, m18556j2().m18530g(), m18556j2().m18529f(), m18556j2().m18518C(), false, m18556j2().m18547x(), m18556j2().m18533j(), 32, null);
        } else if (strM18538o != null) {
            templateProps = new InquiryWorkflow$Props.OneTimeCodeProps(strM18538o, m18556j2().m18529f(), m18556j2().m18518C(), false, m18556j2().m18547x(), m18556j2().m18533j(), 8, null);
        } else if (strM18542s != null) {
            templateProps = new InquiryWorkflow$Props.RelaySessionProps(strM18542s, m18556j2().m18529f(), m18556j2().m18518C(), false, null, null, 56, null);
        } else {
            String strM18516A = m18556j2().m18516A();
            String strM18517B = m18556j2().m18517B();
            String strM18524a = m18556j2().m18524a();
            String strM18541r = m18556j2().m18541r();
            InquiryFieldsMap inquiryFieldsMapM18534k = m18556j2().m18534k();
            Map<String, InquiryField> mapM18081a = inquiryFieldsMapM18534k != null ? inquiryFieldsMapM18534k.m18081a() : null;
            templateProps = new InquiryWorkflow$Props.TemplateProps(strM18516A, strM18517B, strM18524a, strM18541r, m18556j2().m18530g(), mapM18081a, m18556j2().m18519D(), m18556j2().m18548y(), m18556j2().m18529f(), m18556j2().m18518C(), false, m18556j2().m18540q(), m18556j2().m18547x(), m18556j2().m18533j(), 1024, null);
        }
        if (resetState) {
            m18561i2(context);
            FragmentManager fragmentManagerM4709v = m4709v();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4709v, "getChildFragmentManager(...)");
            AbstractC0934h abstractC0934hM4452r = fragmentManagerM4709v.m4452r();
            abstractC0934hM4452r.m4781n(C13957e0.f48741d, InquiryWorkflowFragment.INSTANCE.m18846a(m18556j2().m18536m(), m18556j2().m18546w(), templateProps));
            abstractC0934hM4452r.mo4508g();
            return;
        }
        FragmentManager fragmentManagerM4709v2 = m4709v();
        int i10 = C13957e0.f48741d;
        if (fragmentManagerM4709v2.m4441m0(i10) == null) {
            FragmentManager fragmentManagerM4709v3 = m4709v();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4709v3, "getChildFragmentManager(...)");
            AbstractC0934h abstractC0934hM4452r2 = fragmentManagerM4709v3.m4452r();
            abstractC0934hM4452r2.m4781n(i10, InquiryWorkflowFragment.INSTANCE.m18846a(m18556j2().m18536m(), m18556j2().m18546w(), templateProps));
            abstractC0934hM4452r2.mo4508g();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m18561i2(Context context) {
        C3678a c3678a;
        if (m18557l2().getComponent() != null) {
            return;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        boolean zM32309T = C7797x.m32309T(packageName, "com.withpersona", false, 2, null);
        String strM18545v = zM32309T ? m18556j2().m18545v() : "https://withpersona.com";
        String strM18522G = zM32309T ? m18556j2().m18522G() : "https://webrtc-consumer.withpersona.com";
        String strM18532i = zM32309T ? m18556j2().m18532i() : "https://inquiry-fallback.withpersona.com";
        String strM18520E = zM32309T ? m18556j2().m18520E() : "https://tg.withpersona.com";
        InterfaceC8644a interfaceC8644aM50548i = m18556j2().m18544u() ? m18557l2().getDataCollector() : new C8647d();
        FallbackMode fallbackModeM18531h = (m18557l2().m50552m().getValue().booleanValue() || m18556j2().m18548y() != null) ? FallbackMode.ALWAYS : m18556j2().m18531h();
        if (fallbackModeM18531h == FallbackMode.ALWAYS) {
            c3678a = new C3678a(InterfaceC3680c.a.f15150a);
        } else {
            StaticInquiryTemplate staticInquiryTemplateM18548y = m18556j2().m18548y();
            LocalStaticInquiryTemplate localStaticInquiryTemplate = staticInquiryTemplateM18548y instanceof LocalStaticInquiryTemplate ? (LocalStaticInquiryTemplate) staticInquiryTemplateM18548y : null;
            c3678a = localStaticInquiryTemplate != null ? new C3678a(new InterfaceC3680c.b(localStaticInquiryTemplate.getResourceId())) : new C3678a(InterfaceC3680c.a.f15150a);
        }
        a aVar = new a(this);
        C3676e.a aVarM18348a = C3676e.m18348a();
        ActivityC4831q activityC4831qM4606H1 = m4606H1();
        Intrinsics.checkNotNullExpressionValue(activityC4831qM4606H1, "requireActivity(...)");
        C3676e.a aVarM18351c = aVarM18348a.m18358j(new C13974n(activityC4831qM4606H1, m18556j2().m18537n(), C0993y0.m5013a(m18557l2()))).m18353e(new C8625i(m18557l2().m50559t(), m18557l2().m50550k(), m18557l2().m50565z())).m18354f(new C8634q(m18557l2().m50549j())).m18363o(new C8640w(m18557l2().m50560u())).m18362n(new C10691e(m18557l2().m50558s())).m18360l(new C8221c(m18557l2().m50555p())).m18351c(new C8615d(m18557l2().m50547h()));
        boolean zM18521F = m18556j2().m18521F();
        String strM18530g = m18556j2().m18530g();
        String strM18537n = m18556j2().m18537n();
        StyleVariant styleVariantM18549z = m18556j2().m18549z();
        InterfaceC13982s interfaceC13982sM18350b = aVarM18351c.m18361m(new NetworkCoreModule(zM18521F, strM18530g, strM18537n, styleVariantM18549z != null ? styleVariantM18549z.getValue() : null, m18556j2().m18539p())).m18352d(new C8645b(interfaceC8644aM50548i)).m18359k(new C3707f(strM18545v, strM18522G, strM18532i, m18556j2().m18539p())).m18349a(c3678a).m18355g(new C10312f(aVar)).m18365q(new C7252c0(m18556j2().m18526c(), m18556j2().m18527d())).m18364p(new C8614c0(m18557l2().m50561v())).m18356h(new C4649c(fallbackModeM18531h, m18556j2().m18529f(), m18557l2().getSavedStateHandle())).m18357i(new C10698a(m18557l2().getSdkFilesManager())).m18366r(new TrackingEventsModule(strM18520E)).m18350b();
        m18557l2().m50542H(interfaceC13982sM18350b);
        InterfaceC7814a.INSTANCE.m32428b(interfaceC13982sM18350b.mo18387h());
        C10689c.f38213a.m40761a(interfaceC13982sM18350b.mo18381b());
    }

    @Override // p253kq.InterfaceC7813d
    public boolean isInline() {
        return m4606H1().getClass() != InquiryActivity.class;
    }

    @Nullable
    /* JADX INFO: renamed from: k2 */
    public final InterfaceC12499a m18562k2() {
        InterfaceC4445i interfaceC4445iM4612K = m4612K();
        LayoutInflater.Factory factoryM4693p = m4693p();
        if (interfaceC4445iM4612K instanceof InterfaceC12499a) {
            return (InterfaceC12499a) interfaceC4445iM4612K;
        }
        if (factoryM4693p instanceof InterfaceC12499a) {
            return (InterfaceC12499a) factoryM4693p;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: m2 */
    public final InterfaceC3738a.a m18563m2() {
        InterfaceC13982s interfaceC13982sM50545f = m18557l2().getComponent();
        if (interfaceC13982sM50545f != null) {
            return interfaceC13982sM50545f.mo18385f();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: renamed from: n2 */
    public final void m18564n2(@NotNull InquiryWorkflow$Output.Cancel cancelOutput) {
        InterfaceC13982s interfaceC13982sM50545f;
        C13964i c13964iMo18383d;
        TrackingEventsLogger trackingEventsLoggerMo18381b;
        Intrinsics.checkNotNullParameter(cancelOutput, "cancelOutput");
        long jCurrentTimeMillis = System.currentTimeMillis() - m18557l2().getInquiryStartTimeMs();
        InterfaceC13982s interfaceC13982sM50545f2 = m18557l2().getComponent();
        if (interfaceC13982sM50545f2 != null && (trackingEventsLoggerMo18381b = interfaceC13982sM50545f2.mo18381b()) != null) {
            TrackingEventsLogger.logInquiryEndEvent$default(trackingEventsLoggerMo18381b, InquiryEndReason.Cancel, jCurrentTimeMillis, null, false, 12, null);
        }
        if (!cancelOutput.getSkipBackendCall()) {
            String sessionToken = cancelOutput.getSessionToken();
            if (sessionToken != null && (interfaceC13982sM50545f = m18557l2().getComponent()) != null && (c13964iMo18383d = interfaceC13982sM50545f.mo18383d()) != null) {
                c13964iMo18383d.m50475i(sessionToken);
            }
            m18566p2(cancelOutput.getRedirectUri());
        }
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
        if (C7265j.m30290f(cancelOutput.getInquiryId())) {
            bundle.putString("INQUIRY_ID_KEY", cancelOutput.getInquiryId());
            String sessionToken2 = cancelOutput.getSessionToken();
            bundle.putString("SESSION_TOKEN_KEY", sessionToken2 != null ? C3689h.INSTANCE.m18550a(sessionToken2) : null);
        }
        m18567q2(bundle);
    }

    /* JADX INFO: renamed from: o2 */
    public final void m18565o2(@NotNull InquiryWorkflow$Output output) {
        Intrinsics.checkNotNullParameter(output, "output");
        InterfaceC13982s interfaceC13982sM50545f = m18557l2().getComponent();
        if (interfaceC13982sM50545f == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - m18557l2().getInquiryStartTimeMs();
        boolean z10 = output instanceof InquiryWorkflow$Output.Complete;
        if (z10 || (output instanceof InquiryWorkflow$Output.ReinitializeWithFallbackMode)) {
            TrackingEventsLogger.logInquiryEndEvent$default(interfaceC13982sM50545f.mo18381b(), z10 ? InquiryEndReason.Complete : InquiryEndReason.Fallback, jCurrentTimeMillis, null, false, 12, null);
        } else if (output instanceof InquiryWorkflow$Output.Error) {
            TrackingEventsLogger.logInquiryEndEvent$default(interfaceC13982sM50545f.mo18381b(), InquiryEndReason.Error, jCurrentTimeMillis, ((InquiryWorkflow$Output.Error) output).getDebugMessage(), false, 8, null);
        } else if (!(output instanceof InquiryWorkflow$Output.Cancel)) {
            throw new C7345l();
        }
        String sessionToken = output.getSessionToken();
        if (sessionToken != null) {
            interfaceC13982sM50545f.mo18383d().m50474h(sessionToken);
        }
        if (output instanceof InquiryWorkflow$Output.Complete) {
            InquiryWorkflow$Output.Complete complete = (InquiryWorkflow$Output.Complete) output;
            m18566p2(complete.getRedirectUri());
            Bundle bundle = new Bundle();
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_COMPLETE");
            bundle.putString("INQUIRY_ID_KEY", complete.getInquiryId());
            bundle.putString("INQUIRY_STATUS_KEY", complete.getInquiryStatus());
            bundle.putParcelable("FIELDS_MAP_KEY", new InquiryFieldsMap(complete.m18246a()));
            bundle.putParcelable("COLLECTED_DATA", C13948a.m50437d(m18557l2().getDataCollector().m34726c()));
            String sessionToken2 = complete.getSessionToken();
            bundle.putString("SESSION_TOKEN_KEY", sessionToken2 != null ? C3689h.INSTANCE.m18550a(sessionToken2) : null);
            m18567q2(bundle);
            return;
        }
        if (output instanceof InquiryWorkflow$Output.ReinitializeWithFallbackMode) {
            InquiryWorkflow$Output.ReinitializeWithFallbackMode reinitializeWithFallbackMode = (InquiryWorkflow$Output.ReinitializeWithFallbackMode) output;
            m18557l2().m50553n().mo4863o(reinitializeWithFallbackMode.getInquiryId());
            m18557l2().m50535A().mo4863o(reinitializeWithFallbackMode.getSessionToken());
            m18557l2().m50543I(true);
            return;
        }
        if (output instanceof InquiryWorkflow$Output.Cancel) {
            InquiryWorkflow$Output.Cancel cancel = (InquiryWorkflow$Output.Cancel) output;
            if (cancel.getForce()) {
                m18564n2(cancel);
                return;
            }
            C1136e.Companion aVar = C1136e.INSTANCE;
            FragmentManager fragmentManagerM4709v = m4709v();
            Intrinsics.checkNotNullExpressionValue(fragmentManagerM4709v, "getChildFragmentManager(...)");
            aVar.m6460a(fragmentManagerM4709v, getTheme().intValue(), cancel);
            return;
        }
        if (!(output instanceof InquiryWorkflow$Output.Error)) {
            throw new C7345l();
        }
        InquiryWorkflow$Output.Error error = (InquiryWorkflow$Output.Error) output;
        String sessionToken3 = error.getSessionToken();
        if (sessionToken3 != null) {
            interfaceC13982sM50545f.mo18383d().m50473f(sessionToken3, error.getCause());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle2.putString("ERROR_DEBUG_MESSAGE_KEY", error.getDebugMessage());
        bundle2.putParcelable("ERROR_CODE_KEY", error.getErrorCode());
        m18567q2(bundle2);
    }

    /* JADX INFO: renamed from: p2 */
    public final void m18566p2(String redirectUri) {
        if (redirectUri != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(redirectUri));
                Context contextMo4715x = mo4715x();
                if (contextMo4715x != null) {
                    contextMo4715x.startActivity(intent);
                    Unit unit = Unit.f29331a;
                }
            } catch (Exception unused) {
                Unit unit2 = Unit.f29331a;
            }
        }
    }

    /* JADX INFO: renamed from: q2 */
    public final void m18567q2(Bundle resultBundle) {
        m18559g2();
        C4836u.m23391a(this, m18556j2().m18543t(), resultBundle);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @Nullable
    /* JADX INFO: renamed from: x */
    public Context mo4715x() {
        Context context = this.themedContext;
        return context == null ? super.mo4715x() : context;
    }
}
