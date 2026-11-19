package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.inquiry.FallbackMode;
import com.withpersona.sdk2.inquiry.InquiryField;
import com.withpersona.sdk2.inquiry.LocalStaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.StyleVariant;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule;
import com.withpersona.sdk2.inquiry.tracking.model.InquiryEndReason;
import dv.c0;
import f4.k0;
import f4.t0;
import f4.y0;
import java.util.Map;
import kp.ScreenState;
import l4.CreationExtras;
import np.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J+\u0010\"\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0005J\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\u0005J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u0005J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020\u0015H\u0016¢\u0006\u0004\b.\u0010\u0018J\u0011\u00100\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b0\u00101J\u0011\u00102\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0000¢\u0006\u0004\b6\u00107J\r\u00109\u001a\u000208¢\u0006\u0004\b9\u0010:J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\f¨\u0006V"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/i;", "Lf4/q;", "Lkp/b;", "Lyq/d;", "<init>", "()V", BuildConfig.FLAVOR, "resetState", BuildConfig.FLAVOR, "h2", "(Z)V", "r2", "()Z", "Landroid/content/Context;", "context", "i2", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "redirectUri", "p2", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "resultBundle", "q2", "(Landroid/os/Bundle;)V", "g2", "C0", "savedInstanceState", "F0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "c1", "a1", "V0", "d1", "K0", "N0", "outState", "b1", "Lkp/a;", "k2", "()Lkp/a;", "v", "()Landroid/content/Context;", "Lcom/withpersona/sdk2/inquiry/internal/l$a;", "cancelOutput", "n2", "(Lcom/withpersona/sdk2/inquiry/internal/l$a;)V", "Lyp/a$a;", "m2", "()Lyp/a$a;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "output", "o2", "(Lcom/withpersona/sdk2/inquiry/internal/l;)V", "Lcom/withpersona/sdk2/inquiry/internal/h;", "f0", "Lzt/h;", "j2", "()Lcom/withpersona/sdk2/inquiry/internal/h;", "args", "Lnp/z;", "g0", "l2", "()Lnp/z;", "viewModel", "Lpp/f;", "h0", "Lpp/f;", "binding", "i0", "Landroid/content/Context;", "themedContext", BuildConfig.FLAVOR, "getTheme", "()Ljava/lang/Integer;", "theme", "isInline", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends f4.q implements kp.b, yq.d {

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h args = zt.i.a(new Function0() { // from class: np.w
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return com.withpersona.sdk2.inquiry.internal.i.f2(this.f26421a);
        }
    });

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewModel;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    public pp.f binding;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Context themedContext;

    @Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, d2 = {"com/withpersona/sdk2/inquiry/internal/i$a", "Ldr/e;", "Ldv/h;", "Ldr/a;", "a", "Ldv/h;", "c", "()Ldv/h;", "controllerRequestFlow", "Ldv/c0;", "Lkp/e;", "b", "Ldv/c0;", "()Ldv/c0;", "screenStateFlow", "Ldv/b0;", "Lkp/d;", "Ldv/b0;", "()Ldv/b0;", "eventFlow", BuildConfig.FLAVOR, "d", "Z", "()Z", "isNavBarEnabled", "e", "handleBackPress", "inquiry-internal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements dr.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final dv.h<dr.a> controllerRequestFlow;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final c0<ScreenState> screenStateFlow;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final dv.b0<kp.d> eventFlow;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final boolean isNavBarEnabled;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final boolean handleBackPress;

        public a(i iVar) {
            this.controllerRequestFlow = iVar.l2().g();
            this.screenStateFlow = iVar.l2().x();
            this.eventFlow = iVar.l2().l();
            this.isNavBarEnabled = iVar.j2().H();
            this.handleBackPress = iVar.j2().l();
        }

        @Override // dr.e
        public dv.b0<kp.d> a() {
            return this.eventFlow;
        }

        @Override // dr.e
        public c0<ScreenState> b() {
            return this.screenStateFlow;
        }

        @Override // dr.e
        public dv.h<dr.a> c() {
            return this.controllerRequestFlow;
        }

        @Override // dr.e
        /* JADX INFO: renamed from: d, reason: from getter */
        public boolean getIsNavBarEnabled() {
            return this.isNavBarEnabled;
        }

        @Override // dr.e
        /* JADX INFO: renamed from: e, reason: from getter */
        public boolean getHandleBackPress() {
            return this.handleBackPress;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.internal.InquiryFragment$onViewCreated$1", f = "InquiryFragment.kt", l = {152}, m = "invokeSuspend")
    public static final class b extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10462t;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f10464a;

            public a(i iVar) {
                this.f10464a = iVar;
            }

            public final Object b(boolean z10, eu.b<? super Unit> bVar) {
                this.f10464a.h2(true);
                return Unit.f21506a;
            }

            @Override // dv.i
            public /* bridge */ /* synthetic */ Object emit(Object obj, eu.b bVar) {
                return b(((Boolean) obj).booleanValue(), bVar);
            }
        }

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return i.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f10462t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.h hVarN = dv.j.n(i.this.l2().m(), 1);
                a aVar = new a(i.this);
                this.f10462t = 1;
                if (hVarN.collect(aVar, this) == objE) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "b", "()Lf4/q;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends p001kotlin.jvm.internal.m implements Function0<f4.q> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f4.q f10465i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f4.q qVar) {
            super(0);
            this.f10465i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f4.q invoke() {
            return this.f10465i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class d extends p001kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f10466i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0) {
            super(0);
            this.f10466i = function0;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f10466i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class e extends p001kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ zt.h f10467i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(zt.h hVar) {
            super(0);
            this.f10467i = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return y0.c(this.f10467i).w();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Ll4/a;", "b", "()Ll4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class f extends p001kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f10468i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f10469j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, zt.h hVar) {
            super(0);
            this.f10468i = function0;
            this.f10469j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f10468i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = y0.c(this.f10469j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f21886c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/a1$c;", "b", "()Landroidx/lifecycle/a1$c;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends p001kotlin.jvm.internal.m implements Function0<a1.c> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f4.q f10470i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f10471j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f4.q qVar, zt.h hVar) {
            super(0);
            this.f10470i = qVar;
            this.f10471j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            a1.c cVarW;
            c1 c1VarC = y0.c(this.f10471j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return (jVar == null || (cVarW = jVar.W()) == null) ? this.f10470i.W() : cVarW;
        }
    }

    public i() {
        zt.h hVarB = zt.i.b(zt.k.NONE, new d(new c(this)));
        this.viewModel = y0.b(this, d0.b(np.z.class), new e(hVarB), new f(null, hVarB), new g(this, hVarB));
    }

    public static final h f2(i iVar) {
        return new h(iVar.t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h j2() {
        return (h) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final np.z l2() {
        return (np.z) this.viewModel.getValue();
    }

    private final boolean r2() {
        String strW = j2().w();
        if (strW == null || !StringsKt.Z(strW, '\n', false, 2, null)) {
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
        bundle.putParcelable("ERROR_CODE_KEY", ds.d.SessionTokenError);
        q2(bundle);
        L().a1();
        return false;
    }

    @Override // f4.q
    public void C0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.C0(context);
        if (isInline()) {
            context = new o.d(context, getTheme().intValue());
        }
        this.themedContext = context;
    }

    @Override // f4.q
    public void F0(@Nullable Bundle savedInstanceState) {
        Context contextI1 = I1();
        Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
        Context context = this.themedContext;
        if (context == null) {
            context = contextI1;
        }
        i2(context);
        super.F0(savedInstanceState);
        qp.c.a(contextI1);
        if (j2().e() || j2().b()) {
            qp.c.d(contextI1, l2().getSdkFilesManager().b());
        }
    }

    @Override // f4.q
    @NotNull
    public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.J0(inflater, container, savedInstanceState);
        pp.f fVarC = pp.f.c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(fVarC, "inflate(...)");
        this.binding = fVarC;
        if (fVarC == null) {
            Intrinsics.u("binding");
            fVarC = null;
        }
        CoordinatorLayout root = fVarC.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // f4.q
    public void K0() {
        Context contextI1 = I1();
        Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
        qp.c.e(contextI1);
        kp.a aVarK2 = k2();
        if (aVarK2 != null) {
            aVarK2.a();
        }
        super.K0();
    }

    @Override // f4.q
    public void N0() {
        super.N0();
        this.themedContext = null;
    }

    @Override // f4.q
    public void V0() {
        super.V0();
        l2().C();
    }

    @Override // f4.q
    public void a1() {
        super.a1();
        l2().F();
        l2().D();
    }

    @Override // f4.q
    public void b1(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.b1(outState);
        zr.a.INSTANCE.a().e(outState);
    }

    @Override // f4.q
    public void c1() {
        super.c1();
        Context contextI1 = I1();
        Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
        lo.c.d(contextI1);
    }

    @Override // f4.q
    public void d1() {
        super.d1();
        Context contextI1 = I1();
        Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
        lo.c.f(contextI1);
    }

    @Override // f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        try {
            if (r2()) {
                zr.a.INSTANCE.a().b(savedInstanceState);
                l2().B(this);
                l2().n().o(j2().m());
                l2().A().o(j2().w());
                androidx.p000lifecycle.s sVarK0 = k0();
                Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
                av.k.d(androidx.p000lifecycle.t.a(sVarK0), null, null, new b(null), 3, null);
                h2(false);
                kp.a aVarK2 = k2();
                if (aVarK2 != null) {
                    aVarK2.b(this);
                }
            }
        } catch (Exception e10) {
            if (!j2().b()) {
                throw e10;
            }
            if (j2().e()) {
                Context contextI1 = I1();
                Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
                qp.c.c(contextI1).c(e10);
            }
            Bundle bundle = new Bundle();
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            bundle.putString("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            bundle.putParcelable("ERROR_CODE_KEY", ds.d.ExceptionError);
            q2(bundle);
        }
    }

    public final void g2() {
        np.s sVarF = l2().getComponent();
        if (sVarF == null) {
            return;
        }
        sVarF.j().b();
        sVarF.g().f();
        l2().getSdkFilesManager().a();
    }

    @Override // yq.d
    @NotNull
    public Integer getTheme() {
        int iIntValue;
        if (isInline()) {
            Integer numC = j2().C();
            iIntValue = (numC == null || numC.intValue() == 0) ? jq.h.f20898c : numC.intValue();
        } else {
            iIntValue = 0;
        }
        return Integer.valueOf(iIntValue);
    }

    public final void h2(boolean resetState) {
        m templateProps;
        Context context = this.themedContext;
        if (context == null) {
            return;
        }
        String strF = l2().n().f();
        String strO = j2().o();
        String strS = j2().s();
        String strF2 = l2().A().f();
        if (strF != null) {
            templateProps = new m.InquiryProps(strF, strF2, j2().g(), j2().f(), j2().C(), false, j2().x(), j2().j(), 32, null);
        } else if (strO != null) {
            templateProps = new m.OneTimeCodeProps(strO, j2().f(), j2().C(), false, j2().x(), j2().j(), 8, null);
        } else if (strS != null) {
            templateProps = new m.RelaySessionProps(strS, j2().f(), j2().C(), false, null, null, 56, null);
        } else {
            String strA = j2().A();
            String strB = j2().B();
            String strA2 = j2().a();
            String strR = j2().r();
            np.v vVarK = j2().k();
            Map<String, InquiryField> mapA = vVarK != null ? vVarK.a() : null;
            templateProps = new m.TemplateProps(strA, strB, strA2, strR, j2().g(), mapA, j2().D(), j2().y(), j2().f(), j2().C(), false, j2().q(), j2().x(), j2().j(), Barcode.FORMAT_UPC_E, null);
        }
        if (resetState) {
            i2(context);
            k0 k0VarU = u();
            Intrinsics.checkNotNullExpressionValue(k0VarU, "getChildFragmentManager(...)");
            t0 t0VarR = k0VarU.r();
            t0VarR.n(g0.f26310d, yp.d.INSTANCE.a(j2().m(), j2().w(), templateProps));
            t0VarR.g();
            return;
        }
        if (u().m0(g0.f26310d) == null) {
            k0 k0VarU2 = u();
            Intrinsics.checkNotNullExpressionValue(k0VarU2, "getChildFragmentManager(...)");
            t0 t0VarR2 = k0VarU2.r();
            t0VarR2.n(g0.f26310d, yp.d.INSTANCE.a(j2().m(), j2().w(), templateProps));
            t0VarR2.g();
        }
    }

    public final void i2(Context context) {
        com.withpersona.sdk2.inquiry.internal.fallbackmode.a aVar;
        if (l2().getComponent() != null) {
            return;
        }
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        boolean zT = p001kotlin.text.x.T(packageName, "com.withpersona", false, 2, null);
        String strV = zT ? j2().v() : "https://withpersona.com";
        String strG = zT ? j2().G() : "https://webrtc-consumer.withpersona.com";
        String strI = zT ? j2().i() : "https://inquiry-fallback.withpersona.com";
        String strE = zT ? j2().E() : "https://tg.withpersona.com";
        ar.a aVarI = j2().u() ? l2().getDataCollector() : new ar.d();
        FallbackMode fallbackModeH = (l2().m().getValue().booleanValue() || j2().y() != null) ? FallbackMode.ALWAYS : j2().h();
        if (fallbackModeH == FallbackMode.ALWAYS) {
            aVar = new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(com.withpersona.sdk2.inquiry.internal.fallbackmode.c.a.f10391a);
        } else {
            StaticInquiryTemplate staticInquiryTemplateY = j2().y();
            LocalStaticInquiryTemplate localStaticInquiryTemplate = staticInquiryTemplateY instanceof LocalStaticInquiryTemplate ? (LocalStaticInquiryTemplate) staticInquiryTemplateY : null;
            aVar = localStaticInquiryTemplate != null ? new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(new com.withpersona.sdk2.inquiry.internal.fallbackmode.c.b(localStaticInquiryTemplate.getResourceId())) : new com.withpersona.sdk2.inquiry.internal.fallbackmode.a(com.withpersona.sdk2.inquiry.internal.fallbackmode.c.a.f10391a);
        }
        a aVar2 = new a(this);
        com.withpersona.sdk2.inquiry.internal.e.a aVarA = com.withpersona.sdk2.inquiry.internal.e.a();
        f4.v vVarH1 = H1();
        Intrinsics.checkNotNullExpressionValue(vVarH1, "requireActivity(...)");
        com.withpersona.sdk2.inquiry.internal.e.a aVarC = aVarA.j(new np.n(vVarH1, j2().n(), androidx.p000lifecycle.y0.a(l2()))).e(new aq.i(l2().t(), l2().k(), l2().z())).f(new aq.q(l2().j())).o(new aq.w(l2().u())).n(new eq.h(l2().s())).l(new zp.e(l2().p())).c(new aq.d(l2().h()));
        boolean zF = j2().F();
        String strG2 = j2().g();
        String strN = j2().n();
        StyleVariant styleVariantZ = j2().z();
        np.s sVarB = aVarC.m(new NetworkCoreModule(zF, strG2, strN, styleVariantZ != null ? styleVariantZ.getValue() : null, j2().p())).d(new ar.b(aVarI)).k(new com.withpersona.sdk2.inquiry.internal.network.f(strV, strG, strI, j2().p())).a(aVar).g(new dr.f(aVar2)).q(new xq.c0(j2().c(), j2().d())).p(new aq.c0(l2().v())).h(new rp.c(fallbackModeH, j2().f(), l2().getSavedStateHandle())).i(new er.a(l2().getSdkFilesManager())).r(new TrackingEventsModule(strE)).b();
        l2().H(sVarB);
        zr.a.INSTANCE.b(sVarB.h());
        eq.d.f14058a.a(sVarB.b());
    }

    @Override // yq.d
    public boolean isInline() {
        return H1().getClass() != InquiryActivity.class;
    }

    @Nullable
    public final kp.a k2() {
        e5.i iVarJ = J();
        e5.i iVarP = p();
        if (iVarJ instanceof kp.a) {
            return (kp.a) iVarJ;
        }
        if (iVarP instanceof kp.a) {
            return (kp.a) iVarP;
        }
        return null;
    }

    @NotNull
    public final yp.a.InterfaceC0774a m2() {
        np.s sVarF = l2().getComponent();
        if (sVarF != null) {
            return sVarF.f();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void n2(@NotNull l.Cancel cancelOutput) {
        np.s sVarF;
        np.i iVarD;
        TrackingEventsLogger trackingEventsLoggerB;
        Intrinsics.checkNotNullParameter(cancelOutput, "cancelOutput");
        long jCurrentTimeMillis = System.currentTimeMillis() - l2().getInquiryStartTimeMs();
        np.s sVarF2 = l2().getComponent();
        if (sVarF2 != null && (trackingEventsLoggerB = sVarF2.b()) != null) {
            TrackingEventsLogger.logInquiryEndEvent$default(trackingEventsLoggerB, InquiryEndReason.Cancel, jCurrentTimeMillis, null, false, 12, null);
        }
        if (!cancelOutput.getSkipBackendCall()) {
            String sessionToken = cancelOutput.getSessionToken();
            if (sessionToken != null && (sVarF = l2().getComponent()) != null && (iVarD = sVarF.d()) != null) {
                iVarD.i(sessionToken);
            }
            p2(cancelOutput.getRedirectUri());
        }
        Bundle bundle = new Bundle();
        bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
        if (xq.j.f(cancelOutput.getInquiryId())) {
            bundle.putString("INQUIRY_ID_KEY", cancelOutput.getInquiryId());
            String sessionToken2 = cancelOutput.getSessionToken();
            bundle.putString("SESSION_TOKEN_KEY", sessionToken2 != null ? h.INSTANCE.a(sessionToken2) : null);
        }
        q2(bundle);
    }

    public final void o2(@NotNull l output) {
        Intrinsics.checkNotNullParameter(output, "output");
        np.s sVarF = l2().getComponent();
        if (sVarF == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - l2().getInquiryStartTimeMs();
        boolean z10 = output instanceof l.Complete;
        if (z10 || (output instanceof l.ReinitializeWithFallbackMode)) {
            TrackingEventsLogger.logInquiryEndEvent$default(sVarF.b(), z10 ? InquiryEndReason.Complete : InquiryEndReason.Fallback, jCurrentTimeMillis, null, false, 12, null);
        } else if (output instanceof l.Error) {
            TrackingEventsLogger.logInquiryEndEvent$default(sVarF.b(), InquiryEndReason.Error, jCurrentTimeMillis, ((l.Error) output).getDebugMessage(), false, 8, null);
        } else if (!(output instanceof l.Cancel)) {
            throw new zt.l();
        }
        String sessionToken = output.getSessionToken();
        if (sessionToken != null) {
            sVarF.d().h(sessionToken);
        }
        if (output instanceof l.Complete) {
            l.Complete complete = (l.Complete) output;
            p2(complete.getRedirectUri());
            Bundle bundle = new Bundle();
            bundle.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_COMPLETE");
            bundle.putString("INQUIRY_ID_KEY", complete.getInquiryId());
            bundle.putString("INQUIRY_STATUS_KEY", complete.getInquiryStatus());
            bundle.putParcelable("FIELDS_MAP_KEY", new np.v(complete.a()));
            bundle.putParcelable("COLLECTED_DATA", np.a.d(l2().getDataCollector().a()));
            String sessionToken2 = complete.getSessionToken();
            bundle.putString("SESSION_TOKEN_KEY", sessionToken2 != null ? h.INSTANCE.a(sessionToken2) : null);
            q2(bundle);
            return;
        }
        if (output instanceof l.ReinitializeWithFallbackMode) {
            l.ReinitializeWithFallbackMode reinitializeWithFallbackMode = (l.ReinitializeWithFallbackMode) output;
            l2().n().o(reinitializeWithFallbackMode.getInquiryId());
            l2().A().o(reinitializeWithFallbackMode.getSessionToken());
            l2().I(true);
            return;
        }
        if (output instanceof l.Cancel) {
            l.Cancel cancel = (l.Cancel) output;
            if (cancel.getForce()) {
                n2(cancel);
                return;
            }
            op.e.Companion aVar = op.e.INSTANCE;
            k0 k0VarU = u();
            Intrinsics.checkNotNullExpressionValue(k0VarU, "getChildFragmentManager(...)");
            aVar.a(k0VarU, getTheme().intValue(), cancel);
            return;
        }
        if (!(output instanceof l.Error)) {
            throw new zt.l();
        }
        l.Error error = (l.Error) output;
        String sessionToken3 = error.getSessionToken();
        if (sessionToken3 != null) {
            sVarF.d().e(sessionToken3, error.getCause());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
        bundle2.putString("ERROR_DEBUG_MESSAGE_KEY", error.getDebugMessage());
        bundle2.putParcelable("ERROR_CODE_KEY", error.getErrorCode());
        q2(bundle2);
    }

    public final void p2(String redirectUri) {
        if (redirectUri != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(redirectUri));
                Context contextV = v();
                if (contextV != null) {
                    contextV.startActivity(intent);
                    Unit unit = Unit.f21506a;
                }
            } catch (Exception unused) {
                Unit unit2 = Unit.f21506a;
            }
        }
    }

    public final void q2(Bundle resultBundle) {
        g2();
        f4.b0.a(this, j2().t(), resultBundle);
    }

    @Override // f4.q
    @Nullable
    public Context v() {
        Context context = this.themedContext;
        return context == null ? super.v() : context;
    }
}
