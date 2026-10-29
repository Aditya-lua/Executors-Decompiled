package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import an.ViewEnvironment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.t;
import ar.ComponentView;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import e4.l0;
import fn.x;
import io.n2;
import java.io.File;
import java.util.Map;
import jo.b0;
import jo.y;
import jq.i0;
import jt.s;
import k4.CreationExtras;
import ko.u;
import ko.w;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import ku.p0;
import nu.c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import to.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0093\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0094\u0001\u0095\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J%\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\r0#2\u0006\u0010\b\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b0\u00101J)\u00107\u001a\u00020\u00062\u0006\u00103\u001a\u0002022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000604¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0005R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010X\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR!\u0010w\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010\u0005\u001a\u0004\bt\u0010uR\u001b\u0010|\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010s\u001a\u0004\bz\u0010{R$\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0096\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", "Loq/c;", "Lno/e;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "<init>", "()V", "", "F2", "rendering", "Lkotlin/Function0;", "bind", "G2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "newView", "Lwq/l;", "transition", "Q2", "(Landroid/view/View;Lwq/l;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;", "Landroid/content/Context;", "context", "C2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;", "y2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;", "E2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;", "z2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;Landroid/content/Context;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;", "initialRendering", "Lkotlin/Pair;", "Lko/u;", "w2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;)Lkotlin/Pair;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;", "Lto/q;", "D2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;)Lkotlin/Pair;", "view", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "S2", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "input", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;", "handler", "R2", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "M0", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$GovernmentIdStepFragmentArgs;", "j0", "Lkq/c;", "H2", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$GovernmentIdStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "k0", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "P2", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/camera/b;", "l0", "Lcom/withpersona/sdk2/camera/b;", "I2", "()Lcom/withpersona/sdk2/camera/b;", "setCameraPreview", "(Lcom/withpersona/sdk2/camera/b;)V", "cameraPreview", "Lct/a;", "Lfn/x;", "m0", "Lct/a;", "K2", "()Lct/a;", "setGovernmentIdFeed", "(Lct/a;)V", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "n0", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "M2", "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "setTrackingEventsLogger", "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "trackingEventsLogger", "Lgo/e;", "o0", "Lgo/e;", "J2", "()Lgo/e;", "setFeatureFlagManager", "(Lgo/e;)V", "featureFlagManager", "Lvq/a;", "p0", "Lvq/a;", "L2", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "Lan/y;", "q0", "Ljt/h;", "N2", "()Lan/y;", "getViewEnvironment$annotations", "viewEnvironment", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;", "r0", "O2", "()Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/d;", "viewModel", "s0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "", "t0", "Ljava/lang/Object;", "currentRunner", "u0", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;", "currentScreen", "v0", "pendingRendering", "w0", "Lko/u;", "retainedCameraRunner", "x0", "Landroid/view/View;", "retainedCameraView", "Lfn/g;", "y0", "Lfn/g;", "cameraController", "z0", "b", "GovernmentIdStepFragmentArgs", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GovernmentIdStepFragment extends oq.c<no.e, Screen> {

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kq.c args;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public com.withpersona.sdk2.camera.b cameraPreview;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public ct.a<x> governmentIdFeed;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    public TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public go.e featureFlagManager;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public vq.a systemUiController;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h viewEnvironment;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h viewModel;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GovernmentIdWorkflow.a, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object currentRunner;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Screen currentScreen;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Screen pendingRendering;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public u retainedCameraRunner;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View retainedCameraView;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public fn.g cameraController;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$GovernmentIdStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GovernmentIdStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepFragmentArgs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final GovernmentIdWorkflow.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdStepFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepFragmentArgs(GovernmentIdWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepFragmentArgs[] newArray(int i10) {
                return new GovernmentIdStepFragmentArgs[i10];
            }
        }

        public GovernmentIdStepFragmentArgs(@NotNull GovernmentIdWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final GovernmentIdWorkflow.Input getProps() {
            return this.props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.props.writeToParcel(dest, flags);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements zt.n<LayoutInflater, ViewGroup, Boolean, no.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10997a = new a();

        public a() {
            super(3, no.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidFragmentBinding;", 0);
        }

        public final no.e d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return no.e.c(p8, viewGroup, z10);
        }

        @Override // zt.n
        public /* bridge */ /* synthetic */ no.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final GovernmentIdStepFragment a(@NotNull GovernmentIdWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (GovernmentIdStepFragment) kq.b.a(new GovernmentIdStepFragment(), new GovernmentIdStepFragmentArgs(props));
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10998a;

        static {
            int[] iArr = new int[io.d.values().length];
            try {
                iArr[io.d.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[io.d.K0000.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10998a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$d", "Lar/f;", "rendering", "Lvq/a;", "systemUiController", "", "b", "(Ljava/lang/Object;Lvq/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements ar.f<Screen.f> {
        public final /* synthetic */ UiComponentScreen b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ nq.b f10999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ zt.n f11000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ar.g f11001e;

        public d(UiComponentScreen uiComponentScreen, nq.b bVar, zt.n nVar, ar.g gVar) {
            this.b = uiComponentScreen;
            this.f10999c = bVar;
            this.f11000d = nVar;
            this.f11001e = gVar;
        }

        @Override // ar.f
        public void b(Screen.f rendering, vq.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numI = this.b.i();
            if (numI != null) {
                nq.b bVar = this.f10999c;
                int iIntValue = numI.intValue();
                bVar.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f10999c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = uiComponentScreen.a(context2);
            if (drawableA != null) {
                nq.b bVar2 = this.f10999c;
                bVar2.getRoot().setBackground(drawableA);
                bVar2.f26638d.setBackgroundColor(0);
            }
            this.f11000d.invoke(this.f10999c, rendering, this.f11001e.getViewBindings().a());
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$e", "Lto/k$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lto/k;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lto/k;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements to.k.a {
        @Override // to.k.a
        public to.k a(Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new to.j(context, container);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$finalizeVideoCaptureThenBind$1", f = "GovernmentIdStepFragment.kt", l = {343}, m = "invokeSuspend")
    public static final class f extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11002t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ fn.g f11003u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f11004v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdStepFragment f11005w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Screen f11006x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(fn.g gVar, Function0<Unit> function0, GovernmentIdStepFragment governmentIdStepFragment, Screen screen, nt.b<? super f> bVar) {
            super(2, bVar);
            this.f11003u = gVar;
            this.f11004v = function0;
            this.f11005w = governmentIdStepFragment;
            this.f11006x = screen;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new f(this.f11003u, this.f11004v, this.f11005w, this.f11006x, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objI;
            Object objE = ot.c.e();
            int i10 = this.f11002t;
            if (i10 == 0) {
                jt.o.b(obj);
                fn.g gVar = this.f11003u;
                if (gVar != null) {
                    this.f11002t = 1;
                    objI = gVar.i(this);
                    if (objI == objE) {
                        return objE;
                    }
                }
                this.f11004v.invoke();
                this.f11005w.F2();
                this.f11005w.currentScreen = this.f11006x;
                return Unit.f22483a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
            objI = ((jt.n) obj).getValue();
            GovernmentIdStepFragment governmentIdStepFragment = this.f11005w;
            fn.g gVar2 = this.f11003u;
            if (jt.n.h(objI)) {
                governmentIdStepFragment.O2().getGovernmentIdStepStateManager().f0((File) objI, gVar2.a());
            }
            jt.n.a(objI);
            this.f11004v.invoke();
            this.f11005w.F2();
            this.f11005w.currentScreen = this.f11006x;
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$onViewCreated$1", f = "GovernmentIdStepFragment.kt", l = {144}, m = "invokeSuspend")
    public static final class g extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11007t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f11008u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ GovernmentIdStepFragment f11009v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements nu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ GovernmentIdStepFragment f11010a;
            public final /* synthetic */ b b;

            public a(GovernmentIdStepFragment governmentIdStepFragment, b bVar) {
                this.f11010a = governmentIdStepFragment;
                this.b = bVar;
            }

            @Override // nu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(GovernmentIdWorkflow.a aVar, nt.b<? super Unit> bVar) {
                if (aVar == null) {
                    return Unit.f22483a;
                }
                if (this.f11010a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f11010a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(aVar);
                    }
                }
                return Unit.f22483a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar, GovernmentIdStepFragment governmentIdStepFragment, nt.b<? super g> bVar2) {
            super(2, bVar2);
            this.f11008u = bVar;
            this.f11009v = governmentIdStepFragment;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new g(this.f11008u, this.f11009v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f11007t;
            if (i10 == 0) {
                jt.o.b(obj);
                c0<GovernmentIdWorkflow.a> c0VarA = this.f11008u.a();
                a aVar = new a(this.f11009v, this.f11008u);
                this.f11007t = 1;
                if (c0VarA.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            throw new jt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$16", f = "GovernmentIdStepFragment.kt", l = {313, 314}, m = "invokeSuspend")
    public static final class h extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11011t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen f11013v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f11014w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Screen screen, Context context, nt.b<? super h> bVar) {
            super(2, bVar);
            this.f11013v = screen;
            this.f11014w = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return GovernmentIdStepFragment.this.new h(this.f11013v, this.f11014w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r5 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r5.b(r1, r4) == r0) goto L18;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r4.f11011t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jt.o.b(r5)
                goto L51
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jt.o.b(r5)
                jt.n r5 = (jt.n) r5
                java.lang.Object r5 = r5.getValue()
                goto L38
            L24:
                jt.o.b(r5)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                fn.g r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.s2(r5)
                if (r5 == 0) goto L3b
                r4.f11011t = r3
                java.lang.Object r5 = r5.i(r4)
                if (r5 != r0) goto L38
                goto L50
            L38:
                jt.n.a(r5)
            L3b:
                fn.j r5 = fn.j.f16915a
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r1 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                android.content.Context r1 = r1.I1()
                java.lang.String r3 = "requireContext(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                r4.f11011t = r2
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L51
            L50:
                return r0
            L51:
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.Screen r0 = r4.f11013v
                com.withpersona.sdk2.inquiry.governmentid.Screen$g r0 = (com.withpersona.sdk2.inquiry.governmentid.Screen.g) r0
                android.content.Context r1 = r4.f11014w
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.q2(r5, r0, r1)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.r2(r5)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.Screen r0 = r4.f11013v
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.v2(r5, r0)
                kotlin.Unit r5 = kotlin.Unit.f22483a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$9", f = "GovernmentIdStepFragment.kt", l = {252, 253}, m = "invokeSuspend")
    public static final class i extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f11015t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Screen f11017v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f11018w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Screen screen, Context context, nt.b<? super i> bVar) {
            super(2, bVar);
            this.f11017v = screen;
            this.f11018w = context;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return GovernmentIdStepFragment.this.new i(this.f11017v, this.f11018w, bVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r5 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r5.b(r1, r4) == r0) goto L18;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r4.f11015t
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jt.o.b(r5)
                goto L51
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jt.o.b(r5)
                jt.n r5 = (jt.n) r5
                java.lang.Object r5 = r5.getValue()
                goto L38
            L24:
                jt.o.b(r5)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                fn.g r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.s2(r5)
                if (r5 == 0) goto L3b
                r4.f11015t = r3
                java.lang.Object r5 = r5.i(r4)
                if (r5 != r0) goto L38
                goto L50
            L38:
                jt.n.a(r5)
            L3b:
                fn.j r5 = fn.j.f16915a
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r1 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                android.content.Context r1 = r1.I1()
                java.lang.String r3 = "requireContext(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
                r4.f11015t = r2
                java.lang.Object r5 = r5.b(r1, r4)
                if (r5 != r0) goto L51
            L50:
                return r0
            L51:
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.Screen r0 = r4.f11017v
                com.withpersona.sdk2.inquiry.governmentid.Screen$d r0 = (com.withpersona.sdk2.inquiry.governmentid.Screen.d) r0
                android.content.Context r1 = r4.f11018w
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.p2(r5, r0, r1)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.r2(r5)
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment r5 = com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.this
                com.withpersona.sdk2.inquiry.governmentid.Screen r0 = r4.f11017v
                com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.v2(r5, r0)
                kotlin.Unit r5 = kotlin.Unit.f22483a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/withpersona/sdk2/inquiry/governmentid/persona_workflow/GovernmentIdStepFragment$j", "Ljo/c0$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Ljo/c0;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Ljo/c0;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j implements jo.c0.a {
        @Override // jo.c0.a
        public jo.c0 a(Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new y(context, container);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class k implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11019a;

        public k(androidx.fragment.app.c cVar) {
            this.f11019a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f11019a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f11019a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class l implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11020a;
        public final /* synthetic */ Function1 b;

        public l(androidx.fragment.app.c cVar, Function1 function1) {
            this.f11020a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new oq.d(this.f11020a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class m extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f11021i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(androidx.fragment.app.c cVar) {
            super(0);
            this.f11021i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f11021i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class n extends kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f11022i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function0 function0) {
            super(0);
            this.f11022i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f11022i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class o extends kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ jt.h f11023i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(jt.h hVar) {
            super(0);
            this.f11023i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return l0.c(this.f11023i).w();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class p extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f11024i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ jt.h f11025j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Function0 function0, jt.h hVar) {
            super(0);
            this.f11024i = function0;
            this.f11025j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f11024i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = l0.c(this.f11025j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Z() : CreationExtras.b.f22169c;
        }
    }

    public GovernmentIdStepFragment() {
        super(a.f10997a);
        this.args = new kq.c(d0.b(GovernmentIdStepFragmentArgs.class), new k(this));
        this.viewEnvironment = jt.i.b(new Function0() { // from class: qo.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GovernmentIdStepFragment.V2(this.f29542a);
            }
        });
        l lVar = new l(this, new Function1() { // from class: qo.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GovernmentIdStepFragment.W2(this.f29544a, (androidx.p000lifecycle.l0) obj);
            }
        });
        jt.h hVarA = jt.i.a(jt.k.NONE, new n(new m(this)));
        this.viewModel = l0.b(this, d0.b(com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d.class), new o(hVarA), new p(null, hVarA), lVar);
    }

    public static final Unit A2(nq.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        wq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22483a;
    }

    public static final Unit B2(nq.b binding, Screen.f pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        qo.o.d(binding, pendingRendering);
        return Unit.f22483a;
    }

    public static final Unit T2(GovernmentIdStepFragment governmentIdStepFragment, Screen screen, Context context) {
        governmentIdStepFragment.E2((Screen.j) screen, context);
        return Unit.f22483a;
    }

    public static final Unit U2(GovernmentIdStepFragment governmentIdStepFragment, Screen screen, Context context) {
        governmentIdStepFragment.z2((Screen.f) screen, context);
        return Unit.f22483a;
    }

    public static final ViewEnvironment V2(GovernmentIdStepFragment governmentIdStepFragment) {
        return new ViewEnvironment(j0.g(s.a(vq.b.b, governmentIdStepFragment.L2())));
    }

    public static final com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d W2(GovernmentIdStepFragment governmentIdStepFragment, androidx.p000lifecycle.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return governmentIdStepFragment.P2().a(it, governmentIdStepFragment.H2().getProps());
    }

    public static final w x2(x governmentIdFeed, com.withpersona.sdk2.camera.b cameraPreview, go.e featureFlagManager, Screen.b initialRendering, Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ko.m(governmentIdFeed, cameraPreview, featureFlagManager, initialRendering, context, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C2(Screen.g rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof so.k)) {
            obj = null;
        }
        Object obj2 = (so.k) obj;
        if (obj2 == null) {
            no.h hVarC = no.h.c(LayoutInflater.from(context), ((no.e) b2()).b, false);
            Intrinsics.checkNotNullExpressionValue(hVarC, "inflate(...)");
            Pair pair = new Pair(new so.k(hVarC), hVarC.getRoot());
            Object objA = pair.a();
            view = (View) pair.b();
            obj2 = objA;
        }
        wq.l transition = rendering.b(this.currentScreen) ? wq.l.NONE : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((so.k) obj2).a(rendering, N2());
        this.currentRunner = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<q, View> D2(Screen.h rendering) {
        wn.d dVar;
        Context context = ((no.e) b2()).b.getContext();
        wn.a.C0631a c0631aC = wn.a.f34452a.c(to.k.a.class, new e());
        int i10 = c.f10998a[rendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            dVar = wn.d.DefaultGovIdReview;
        } else {
            if (i10 != 2) {
                throw new jt.l();
            }
            dVar = wn.d.K0000GovIdReview;
        }
        to.k.a aVar = (to.k.a) c0631aC.a(dVar);
        Intrinsics.checkNotNull(context);
        to.k kVarA = aVar.a(context, ((no.e) b2()).b);
        return new Pair<>(new q(kVarA), kVarA.getRoot());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E2(Screen.j rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof com.withpersona.sdk2.inquiry.governmentid.m)) {
            obj = null;
        }
        Object obj2 = (com.withpersona.sdk2.inquiry.governmentid.m) obj;
        if (obj2 == null) {
            no.m mVarC = no.m.c(LayoutInflater.from(context), ((no.e) b2()).b, false);
            Intrinsics.checkNotNullExpressionValue(mVarC, "inflate(...)");
            Pair pair = new Pair(new com.withpersona.sdk2.inquiry.governmentid.m(mVarC), mVarC.getRoot());
            Object objA = pair.a();
            view = (View) pair.b();
            obj2 = objA;
        }
        wq.l transition = rendering.b(this.currentScreen) ? wq.l.NONE : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((com.withpersona.sdk2.inquiry.governmentid.m) obj2).a(rendering, N2());
        this.currentRunner = obj2;
    }

    public final void F2() {
        View view = this.retainedCameraView;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.retainedCameraRunner = null;
        this.retainedCameraView = null;
        this.cameraController = null;
    }

    public final void G2(Screen rendering, Function0<Unit> bind) {
        fn.g gVar = this.cameraController;
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        ku.k.d(t.a(sVarK0), null, null, new f(gVar, bind, this, rendering, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GovernmentIdStepFragmentArgs H2() {
        return (GovernmentIdStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    public final com.withpersona.sdk2.camera.b I2() {
        com.withpersona.sdk2.camera.b bVar = this.cameraPreview;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.u("cameraPreview");
        return null;
    }

    @NotNull
    public final go.e J2() {
        go.e eVar = this.featureFlagManager;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.u("featureFlagManager");
        return null;
    }

    @NotNull
    public final ct.a<x> K2() {
        ct.a<x> aVar = this.governmentIdFeed;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("governmentIdFeed");
        return null;
    }

    @NotNull
    public final vq.a L2() {
        vq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    @Override // kq.a, androidx.fragment.app.c
    public void M0() {
        F2();
        super.M0();
    }

    @NotNull
    public final TrackingEventsLogger M2() {
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        if (trackingEventsLogger != null) {
            return trackingEventsLogger;
        }
        Intrinsics.u("trackingEventsLogger");
        return null;
    }

    public final ViewEnvironment N2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public final com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d O2() {
        return (com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d) this.viewModel.getValue();
    }

    @NotNull
    public final com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d.a P2() {
        com.withpersona.sdk2.inquiry.governmentid.persona_workflow.d.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q2(View newView, wq.l transition) {
        FrameLayout frameLayout = ((no.e) b2()).b;
        int i10 = n2.f20725l0;
        Object tag = frameLayout.getTag(i10);
        View view = tag instanceof View ? (View) tag : null;
        if (this.currentScreen == null) {
            transition = wq.l.NONE;
        }
        if (view != null) {
            FrameLayout content = ((no.e) b2()).b;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            i0.a(content, view, newView, transition);
        } else {
            ((no.e) b2()).b.addView(newView);
        }
        ((no.e) b2()).b.setTag(i10, newView);
    }

    public final void R2(@NotNull GovernmentIdWorkflow.Input input, @NotNull Function1<? super GovernmentIdWorkflow.a, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        O2().f(input);
        this.currentOutputHandler = handler;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:118:0x02af  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d5  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oq.c
    /* JADX INFO: renamed from: S2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull final Screen rendering) {
        Object obj;
        q qVar;
        wq.l transition;
        wn.d dVar;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.pendingRendering = rendering;
            return;
        }
        final Context contextI1 = I1();
        Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
        View viewB = null;
        if (rendering instanceof Screen.e) {
            Object obj2 = this.currentRunner;
            if (!(obj2 instanceof com.withpersona.sdk2.inquiry.governmentid.i)) {
                obj2 = null;
            }
            Object obj3 = (com.withpersona.sdk2.inquiry.governmentid.i) obj2;
            if (obj3 == null) {
                no.g gVarC = no.g.c(LayoutInflater.from(contextI1), ((no.e) b2()).b, false);
                Intrinsics.checkNotNullExpressionValue(gVarC, "inflate(...)");
                Pair pair = new Pair(new com.withpersona.sdk2.inquiry.governmentid.i(gVarC), gVarC.getRoot());
                Object objA = pair.a();
                viewB = (View) pair.b();
                obj3 = objA;
            }
            wq.l transition2 = rendering.b(this.currentScreen) ? wq.l.NONE : rendering.getTransition();
            if (viewB != null) {
                Q2(viewB, transition2);
            }
            ((com.withpersona.sdk2.inquiry.governmentid.i) obj3).a((Screen.e) rendering, N2());
            this.currentRunner = obj3;
        } else if (rendering instanceof Screen.a) {
            wn.a.C0631a c0631aC = wn.a.f34452a.c(jo.c0.a.class, new j());
            Screen.a aVar = (Screen.a) rendering;
            int i10 = c.f10998a[aVar.getDesignVersion().ordinal()];
            if (i10 == 1) {
                dVar = wn.d.DefaultSelectCountryAndIdClass;
            } else {
                if (i10 != 2) {
                    throw new jt.l();
                }
                dVar = wn.d.K0000SelectCountryAndIdClass;
            }
            jo.c0 c0VarA = ((jo.c0.a) c0631aC.a(dVar)).a(contextI1, ((no.e) b2()).b);
            Object obj4 = this.currentRunner;
            if (!(obj4 instanceof b0)) {
                obj4 = null;
            }
            Object obj5 = (b0) obj4;
            if (obj5 == null) {
                Pair pair2 = new Pair(new b0(c0VarA), c0VarA.getRoot());
                Object objA2 = pair2.a();
                viewB = (View) pair2.b();
                obj5 = objA2;
            }
            wq.l transition3 = rendering.b(this.currentScreen) ? wq.l.NONE : rendering.getTransition();
            if (viewB != null) {
                Q2(viewB, transition3);
            }
            ((b0) obj5).a(aVar, N2());
            this.currentRunner = obj5;
        } else if (rendering instanceof Screen.b) {
            if ((this.currentScreen instanceof Screen.h) && (this.currentRunner instanceof q)) {
                Object tag = ((no.e) b2()).b.getTag(n2.f20725l0);
                View view = tag instanceof View ? (View) tag : null;
                if (view != null) {
                    ((no.e) b2()).b.removeView(view);
                }
            }
            View view2 = this.retainedCameraView;
            if (view2 != null) {
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ((no.e) b2()).b.setTag(n2.f20725l0, this.retainedCameraView);
                u uVar = this.retainedCameraRunner;
                if (uVar != null) {
                    uVar.a((Screen.b) rendering, N2());
                }
                this.currentRunner = this.retainedCameraRunner;
            } else {
                Object obj6 = this.currentRunner;
                if (!(obj6 instanceof u)) {
                    obj6 = null;
                }
                u uVar2 = (u) obj6;
                if (uVar2 == null) {
                    Pair<u, View> pairW2 = w2((Screen.b) rendering);
                    u uVarA = pairW2.a();
                    viewB = pairW2.b();
                    uVar2 = uVarA;
                }
                wq.l transition4 = rendering.b(this.currentScreen) ? wq.l.NONE : rendering.getTransition();
                if (viewB != null) {
                    Q2(viewB, transition4);
                }
                uVar2.a((Screen.b) rendering, N2());
                this.currentRunner = uVar2;
            }
        } else if (rendering instanceof Screen.c) {
            Object obj7 = this.currentRunner;
            if (!(obj7 instanceof so.e)) {
                obj7 = null;
            }
            Object obj8 = (so.e) obj7;
            if (obj8 == null) {
                no.d dVarC = no.d.c(LayoutInflater.from(contextI1), ((no.e) b2()).b, false);
                Intrinsics.checkNotNullExpressionValue(dVarC, "inflate(...)");
                Pair pair3 = new Pair(new so.e(dVarC), dVarC.getRoot());
                Object objA3 = pair3.a();
                viewB = (View) pair3.b();
                obj8 = objA3;
            }
            wq.l transition5 = rendering.b(this.currentScreen) ? wq.l.NONE : rendering.getTransition();
            if (viewB != null) {
                Q2(viewB, transition5);
            }
            ((so.e) obj8).a((Screen.c) rendering, N2());
            this.currentRunner = obj8;
        } else if (rendering instanceof Screen.d) {
            Screen.d dVar2 = (Screen.d) rendering;
            if (dVar2.getVideoCaptureEnabled() && this.cameraController != null) {
                androidx.p000lifecycle.s sVarK0 = k0();
                Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
                ku.k.d(t.a(sVarK0), null, null, new i(rendering, contextI1, null), 3, null);
                return;
            }
            y2(dVar2, contextI1);
        } else if (rendering instanceof Screen.h) {
            Screen.h hVar = (Screen.h) rendering;
            if (hVar.getKeepCameraAlive()) {
                Object obj9 = this.currentRunner;
                if ((obj9 instanceof u) && (this.currentScreen instanceof Screen.b)) {
                    Intrinsics.d(obj9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner");
                    this.retainedCameraRunner = (u) obj9;
                    FrameLayout frameLayout = ((no.e) b2()).b;
                    int i11 = n2.f20725l0;
                    Object tag2 = frameLayout.getTag(i11);
                    viewB = tag2 instanceof View ? (View) tag2 : null;
                    this.retainedCameraView = viewB;
                    if (viewB != null) {
                        viewB.setVisibility(4);
                    }
                    Pair<q, View> pairD2 = D2(hVar);
                    q qVarA = pairD2.a();
                    View viewB2 = pairD2.b();
                    ((no.e) b2()).b.addView(viewB2);
                    ((no.e) b2()).b.setTag(i11, viewB2);
                    qVarA.a(hVar, N2());
                    this.currentRunner = qVarA;
                } else {
                    obj = this.currentRunner;
                    if (!(obj instanceof q)) {
                        obj = null;
                    }
                    qVar = (q) obj;
                    if (qVar == null) {
                        Pair<q, View> pairD3 = D2(hVar);
                        q qVarA2 = pairD3.a();
                        viewB = pairD3.b();
                        qVar = qVarA2;
                    }
                    if (rendering.b(this.currentScreen)) {
                        transition = wq.l.NONE;
                    } else {
                        transition = rendering.getTransition();
                    }
                    if (viewB != null) {
                        Q2(viewB, transition);
                    }
                    qVar.a(hVar, N2());
                    this.currentRunner = qVar;
                }
            } else {
                obj = this.currentRunner;
                if (!(obj instanceof q)) {
                    obj = null;
                }
                qVar = (q) obj;
                if (qVar == null) {
                    Pair<q, View> pairD4 = D2(hVar);
                    q qVarA3 = pairD4.a();
                    viewB = pairD4.b();
                    qVar = qVarA3;
                }
                if (rendering.b(this.currentScreen)) {
                    transition = wq.l.NONE;
                } else {
                    transition = rendering.getTransition();
                }
                if (viewB != null) {
                    Q2(viewB, transition);
                }
                qVar.a(hVar, N2());
                this.currentRunner = qVar;
            }
        } else if (rendering instanceof Screen.i) {
            Object obj10 = this.currentRunner;
            if (!(obj10 instanceof so.p)) {
                obj10 = null;
            }
            Object obj11 = (so.p) obj10;
            if (obj11 == null) {
                no.j jVarC = no.j.c(LayoutInflater.from(contextI1), ((no.e) b2()).b, false);
                Intrinsics.checkNotNullExpressionValue(jVarC, "inflate(...)");
                Pair pair4 = new Pair(new so.p(jVarC), jVarC.getRoot());
                Object objA4 = pair4.a();
                viewB = (View) pair4.b();
                obj11 = objA4;
            }
            wq.l transition6 = rendering.b(this.currentScreen) ? wq.l.NONE : rendering.getTransition();
            if (viewB != null) {
                Q2(viewB, transition6);
            }
            ((so.p) obj11).a((Screen.i) rendering, N2());
            this.currentRunner = obj11;
        } else if (rendering instanceof Screen.j) {
            Screen.j jVar = (Screen.j) rendering;
            if (jVar.getIsFinalizingVideoCapture()) {
                G2(rendering, new Function0() { // from class: qo.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GovernmentIdStepFragment.T2(this.f29536a, rendering, contextI1);
                    }
                });
                return;
            }
            E2(jVar, contextI1);
        } else if (rendering instanceof Screen.f) {
            Screen.f fVar = (Screen.f) rendering;
            if (fVar.getIsFinalizingVideoCapture()) {
                G2(rendering, new Function0() { // from class: qo.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GovernmentIdStepFragment.U2(this.f29539a, rendering, contextI1);
                    }
                });
                return;
            }
            z2(fVar, contextI1);
        } else {
            if (!(rendering instanceof Screen.g)) {
                throw new jt.l();
            }
            if (this.cameraController != null) {
                androidx.p000lifecycle.s sVarK1 = k0();
                Intrinsics.checkNotNullExpressionValue(sVarK1, "getViewLifecycleOwner(...)");
                ku.k.d(t.a(sVarK1), null, null, new h(rendering, contextI1, null), 3, null);
                return;
            }
            C2((Screen.g) rendering, contextI1);
        }
        this.currentScreen = rendering;
    }

    @Override // oq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        b governmentIdStepStateManager = O2().getGovernmentIdStepStateManager();
        g2(governmentIdStepStateManager.c());
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        ku.k.d(t.a(sVarK0), null, null, new g(governmentIdStepStateManager, this, null), 3, null);
        Screen screen = this.pendingRendering;
        if (screen != null) {
            h2(screen);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<u, View> w2(Screen.b initialRendering) {
        wn.d dVar;
        Context context = ((no.e) b2()).b.getContext();
        wn.a.C0631a c0631aC = wn.a.f34452a.c(w.a.class, new w.a() { // from class: qo.j
            @Override // ko.w.a
            public final ko.w b(fn.x xVar, com.withpersona.sdk2.camera.b bVar, go.e eVar, Screen.b bVar2, Context context2, ViewGroup viewGroup) {
                return GovernmentIdStepFragment.x2(xVar, bVar, eVar, bVar2, context2, viewGroup);
            }
        });
        int i10 = c.f10998a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            dVar = wn.d.DefaultGovIdCapture;
        } else {
            if (i10 != 2) {
                throw new jt.l();
            }
            dVar = wn.d.K0000GovIdCapture;
        }
        w.a aVar = (w.a) c0631aC.a(dVar);
        x xVar = K2().get();
        Intrinsics.checkNotNullExpressionValue(xVar, "get(...)");
        com.withpersona.sdk2.camera.b bVarI2 = I2();
        go.e eVarJ2 = J2();
        Intrinsics.checkNotNull(context);
        w wVarB = aVar.b(xVar, bVarI2, eVarJ2, initialRendering, context, ((no.e) b2()).b);
        this.cameraController = wVarB.getCameraController();
        fn.g cameraController = wVarB.getCameraController();
        x xVar2 = K2().get();
        Intrinsics.checkNotNullExpressionValue(xVar2, "get(...)");
        return new Pair<>(new u(context, wVarB, cameraController, xVar2, M2()), wVarB.getRoot());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y2(Screen.d rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof so.j)) {
            obj = null;
        }
        Object obj2 = (so.j) obj;
        if (obj2 == null) {
            no.a aVarC = no.a.c(LayoutInflater.from(context), ((no.e) b2()).b, false);
            Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
            Pair pair = new Pair(new so.j(aVarC), aVarC.getRoot());
            Object objA = pair.a();
            view = (View) pair.b();
            obj2 = objA;
        }
        wq.l transition = rendering.b(this.currentScreen) ? wq.l.NONE : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((so.j) obj2).a(rendering, N2());
        this.currentRunner = obj2;
    }

    public final void z2(Screen.f rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof qo.a)) {
            obj = null;
        }
        Object objA = (qo.a) obj;
        if (objA == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            ar.s sVar = ar.s.f3757a;
            UiComponentScreen uiScreen = rendering.getUiScreen();
            Function2<? super nq.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: qo.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return GovernmentIdStepFragment.A2((nq.b) obj2, (Map) obj3);
                }
            };
            zt.n nVar = new zt.n() { // from class: qo.l
                @Override // zt.n
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GovernmentIdStepFragment.B2((nq.b) obj2, (Screen.f) obj3, (Map) obj4);
                }
            };
            nq.b bVarC = nq.b.c(LayoutInflater.from(frameLayout.getContext()), frameLayout, false);
            Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(...)");
            frameLayout.removeAllViews();
            frameLayout.addView(bVarC.getRoot());
            Pair pair = new Pair(new qo.a(new d(uiScreen, bVarC, nVar, sVar.l(bVarC, uiScreen, function2, true))), frameLayout);
            objA = pair.a();
            view = (View) pair.b();
        }
        wq.l transition = rendering.b(this.currentScreen) ? wq.l.NONE : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((qo.a) objA).b(rendering, L2());
        this.currentRunner = objA;
    }
}
