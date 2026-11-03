package com.withpersona.sdk2.inquiry.selfie.selfieStep;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraAccessException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.t;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dn.i0;
import dn.n0;
import dn.s;
import dq.k2;
import e4.l0;
import eo.a0;
import fn.CameraChoices;
import fn.f0;
import fn.m0;
import gt.o;
import iu.p0;
import java.util.Map;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import lu.c0;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xp.k0;
import xp.q;
import xp.r0;
import xt.n;
import ym.ViewEnvironment;
import yq.ComponentView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ~2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u007f\u0080\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J)\u0010,\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0)¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0003H\u0014¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010G\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010_\u001a\b\u0012\u0004\u0012\u00020X0W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR!\u0010}\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\by\u0010A\u0012\u0004\b|\u0010\u0005\u001a\u0004\bz\u0010{¨\u0006\u0081\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", "Lmq/c;", "Lyp/h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/h;", "s2", "()Lcom/withpersona/sdk2/inquiry/selfie/h;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;", "initialRendering", "Lxp/k0;", "p2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;)Lxp/k0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;", "Lcom/withpersona/sdk2/inquiry/selfie/c;", "r2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;)Lcom/withpersona/sdk2/inquiry/selfie/c;", "Lcom/withpersona/sdk2/inquiry/selfie/l;", "x2", "()Lcom/withpersona/sdk2/inquiry/selfie/l;", "Lcom/withpersona/sdk2/inquiry/selfie/k;", "w2", "()Lcom/withpersona/sdk2/inquiry/selfie/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;", "Leq/f;", "y2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;)Leq/f;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;", "Lcq/a;", "t2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;)Lcq/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "props", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;", "handler", "J2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "rendering", "K2", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;)V", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$SelfieStepFragmentArgs;", "j0", "Liq/c;", "A2", "()Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$SelfieStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;", "k0", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;", "I2", "()Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b$a;)V", "viewModelFactory", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;", "l0", "Lgt/h;", "H2", "()Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/b;", "viewModel", "m0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "n0", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;", "pendingRendering", "", "o0", "Ljava/lang/Object;", "currentRenderer", "Lcom/withpersona/sdk2/camera/b;", "p0", "Lcom/withpersona/sdk2/camera/b;", "B2", "()Lcom/withpersona/sdk2/camera/b;", "setCameraPreview", "(Lcom/withpersona/sdk2/camera/b;)V", "cameraPreview", "Lat/a;", "Ldn/n0;", "q0", "Lat/a;", "D2", "()Lat/a;", "setSelfieDirectionFeed", "(Lat/a;)V", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "r0", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "F2", "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "setTrackingEventsLogger", "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "trackingEventsLogger", "Ltq/a;", "s0", "Ltq/a;", "E2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Leo/e;", "t0", "Leo/e;", "C2", "()Leo/e;", "setFeatureFlagManager", "(Leo/e;)V", "featureFlagManager", "Lym/y;", "u0", "G2", "()Lym/y;", "getViewEnvironment$annotations", "viewEnvironment", "v0", "b", "SelfieStepFragmentArgs", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelfieStepFragment extends mq.c<yp.h, SelfieWorkflow.c> {

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public b.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super SelfieWorkflow.b, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SelfieWorkflow.c pendingRendering;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object currentRenderer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public com.withpersona.sdk2.camera.b cameraPreview;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public at.a<n0> selfieDirectionFeed;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public eo.e featureFlagManager;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewEnvironment;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$SelfieStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelfieStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepFragmentArgs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SelfieWorkflow.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieStepFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepFragmentArgs(SelfieWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieStepFragmentArgs[] newArray(int i10) {
                return new SelfieStepFragmentArgs[i10];
            }
        }

        public SelfieStepFragmentArgs(@NotNull SelfieWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final SelfieWorkflow.Input getProps() {
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
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements n<LayoutInflater, ViewGroup, Boolean, yp.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13129a = new a();

        public a() {
            super(3, yp.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieStepBinding;", 0);
        }

        public final yp.h d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return yp.h.c(p8, viewGroup, z10);
        }

        @Override // xt.n
        public /* bridge */ /* synthetic */ yp.h invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelfieStepFragment a(@NotNull SelfieWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (SelfieStepFragment) iq.b.a(new SelfieStepFragment(), new SelfieStepFragmentArgs(props));
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13130a;

        static {
            int[] iArr = new int[wp.a.values().length];
            try {
                iArr[wp.a.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wp.a.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wp.a.K0000.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13130a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$d", "Ldn/s;", "", "a", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements s {
        public final /* synthetic */ yp.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SelfieWorkflow.c.C0238c f13132c;

        public d(yp.a aVar, SelfieWorkflow.c.C0238c c0238c) {
            this.b = aVar;
            this.f13132c = c0238c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(SelfieWorkflow.c.C0238c c0238c, dn.h it) {
            Intrinsics.checkNotNullParameter(it, "it");
            c0238c.i().invoke(it);
            return Unit.f22938a;
        }

        @Override // dn.s
        public void a() {
            com.withpersona.sdk2.camera.b bVarB2 = SelfieStepFragment.this.B2();
            PreviewView previewviewSelfieCamera = this.b.f36943k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            com.withpersona.sdk2.camera.b.a aVar = com.withpersona.sdk2.camera.b.a.FRONT;
            n0 n0Var = SelfieStepFragment.this.D2().get();
            final SelfieWorkflow.c.C0238c c0238c = this.f13132c;
            com.withpersona.sdk2.camera.b.g(bVarB2, previewviewSelfieCamera, aVar, n0Var, true, false, new Function1() { // from class: cq.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SelfieStepFragment.d.c(c0238c, (dn.h) obj);
                }
            }, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e", "Lyq/f;", "rendering", "Ltq/a;", "systemUiController", "", "a", "(Ljava/lang/Object;Ltq/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements yq.f<SelfieWorkflow.c.d> {
        public final /* synthetic */ UiComponentScreen b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lq.b f13133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f13134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ yq.g f13135e;

        public e(UiComponentScreen uiComponentScreen, lq.b bVar, n nVar, yq.g gVar) {
            this.b = uiComponentScreen;
            this.f13133c = bVar;
            this.f13134d = nVar;
            this.f13135e = gVar;
        }

        @Override // yq.f
        public void a(SelfieWorkflow.c.d rendering, tq.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numI = this.b.i();
            if (numI != null) {
                lq.b bVar = this.f13133c;
                int iIntValue = numI.intValue();
                bVar.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f13133c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = uiComponentScreen.a(context2);
            if (drawableA != null) {
                lq.b bVar2 = this.f13133c;
                bVar2.getRoot().setBackground(drawableA);
                bVar2.f23927d.setBackgroundColor(0);
            }
            this.f13134d.invoke(this.f13133c, rendering, this.f13135e.getViewBindings().a());
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$onViewCreated$1", f = "SelfieStepFragment.kt", l = {117}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class f extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13136t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k2 f13137u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ SelfieStepFragment f13138v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SelfieStepFragment f13139a;
            public final /* synthetic */ k2 b;

            public a(SelfieStepFragment selfieStepFragment, k2 k2Var) {
                this.f13139a = selfieStepFragment;
                this.b = k2Var;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(SelfieWorkflow.b bVar, lt.b<? super Unit> bVar2) {
                if (bVar == null) {
                    return Unit.f22938a;
                }
                if (this.f13139a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f13139a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(bVar);
                    }
                }
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(k2 k2Var, SelfieStepFragment selfieStepFragment, lt.b<? super f> bVar) {
            super(2, bVar);
            this.f13137u = k2Var;
            this.f13138v = selfieStepFragment;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new f(this.f13137u, this.f13138v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f13136t;
            if (i10 == 0) {
                o.b(obj);
                c0<SelfieWorkflow.b> c0VarA = this.f13137u.a();
                a aVar = new a(this.f13138v, this.f13137u);
                this.f13136t = 1;
                if (c0VarA.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new gt.d();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f13140a;

        public g(androidx.fragment.app.c cVar) {
            this.f13140a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f13140a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f13140a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f13141a;
        public final /* synthetic */ Function1 b;

        public h(androidx.fragment.app.c cVar, Function1 function1) {
            this.f13141a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f13141a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f13142i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(androidx.fragment.app.c cVar) {
            super(0);
            this.f13142i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f13142i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f13143i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0) {
            super(0);
            this.f13143i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f13143i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class k extends kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f13144i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(gt.h hVar) {
            super(0);
            this.f13144i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return l0.c(this.f13144i).v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class l extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f13145i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f13146j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, gt.h hVar) {
            super(0);
            this.f13145i = function0;
            this.f13146j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f13145i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = l0.c(this.f13146j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22393c;
        }
    }

    public SelfieStepFragment() {
        super(a.f13129a);
        this.args = new iq.c(d0.b(SelfieStepFragmentArgs.class), new g(this));
        h hVar = new h(this, new Function1() { // from class: cq.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SelfieStepFragment.M2(this.f14177a, (androidx.p000lifecycle.l0) obj);
            }
        });
        gt.h hVarA = gt.i.a(gt.k.NONE, new j(new i(this)));
        this.viewModel = l0.b(this, d0.b(b.class), new k(hVarA), new l(null, hVarA), hVar);
        this.viewEnvironment = gt.i.b(new Function0() { // from class: cq.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SelfieStepFragment.L2(this.f14178a);
            }
        });
    }

    private final ViewEnvironment G2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public static final ViewEnvironment L2(SelfieStepFragment selfieStepFragment) {
        return new ViewEnvironment(j0.g(gt.s.a(tq.b.b, selfieStepFragment.E2())));
    }

    public static final b M2(SelfieStepFragment selfieStepFragment, androidx.p000lifecycle.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return selfieStepFragment.I2().a(it, selfieStepFragment.A2().getProps());
    }

    public static final r0 q2(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new q(context, viewGroup);
    }

    public static final Unit u2(lq.b pendingBinding, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = pendingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22938a;
    }

    public static final Unit v2(lq.b pendingBinding, SelfieWorkflow.c.d pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        cq.k.d(pendingBinding, pendingRendering);
        return Unit.f22938a;
    }

    public static final eq.g z2(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new eq.c(context, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SelfieStepFragmentArgs A2() {
        return (SelfieStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    public final com.withpersona.sdk2.camera.b B2() {
        com.withpersona.sdk2.camera.b bVar = this.cameraPreview;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.u("cameraPreview");
        return null;
    }

    @NotNull
    public final eo.e C2() {
        eo.e eVar = this.featureFlagManager;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.u("featureFlagManager");
        return null;
    }

    @NotNull
    public final at.a<n0> D2() {
        at.a<n0> aVar = this.selfieDirectionFeed;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("selfieDirectionFeed");
        return null;
    }

    @NotNull
    public final tq.a E2() {
        tq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    @NotNull
    public final TrackingEventsLogger F2() {
        TrackingEventsLogger trackingEventsLogger = this.trackingEventsLogger;
        if (trackingEventsLogger != null) {
            return trackingEventsLogger;
        }
        Intrinsics.u("trackingEventsLogger");
        return null;
    }

    public final b H2() {
        return (b) this.viewModel.getValue();
    }

    @NotNull
    public final b.a I2() {
        b.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    public final void J2(@NotNull SelfieWorkflow.Input props, @NotNull Function1<? super SelfieWorkflow.b, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(handler, "handler");
        H2().f(props);
        this.currentOutputHandler = handler;
    }

    @Override // mq.c
    /* JADX INFO: renamed from: K2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull SelfieWorkflow.c rendering) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.pendingRendering = rendering;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.b) {
            Object obj = this.currentRenderer;
            com.withpersona.sdk2.inquiry.selfie.h hVarS2 = obj instanceof com.withpersona.sdk2.inquiry.selfie.h ? (com.withpersona.sdk2.inquiry.selfie.h) obj : null;
            if (hVarS2 == null) {
                hVarS2 = s2();
            }
            hVarS2.g((SelfieWorkflow.c.b) rendering, E2());
            this.currentRenderer = hVarS2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.a) {
            Object obj2 = this.currentRenderer;
            k0 k0VarP2 = obj2 instanceof k0 ? (k0) obj2 : null;
            if (k0VarP2 == null) {
                k0VarP2 = p2((SelfieWorkflow.c.a) rendering);
            }
            k0VarP2.H((SelfieWorkflow.c.a) rendering, E2());
            this.currentRenderer = k0VarP2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.C0238c) {
            Object obj3 = this.currentRenderer;
            com.withpersona.sdk2.inquiry.selfie.c cVarR2 = obj3 instanceof com.withpersona.sdk2.inquiry.selfie.c ? (com.withpersona.sdk2.inquiry.selfie.c) obj3 : null;
            if (cVarR2 == null) {
                cVarR2 = r2((SelfieWorkflow.c.C0238c) rendering);
            }
            cVarR2.b((SelfieWorkflow.c.C0238c) rendering, G2());
            this.currentRenderer = cVarR2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.e) {
            Object obj4 = this.currentRenderer;
            com.withpersona.sdk2.inquiry.selfie.k kVarW2 = obj4 instanceof com.withpersona.sdk2.inquiry.selfie.k ? (com.withpersona.sdk2.inquiry.selfie.k) obj4 : null;
            if (kVarW2 == null) {
                kVarW2 = w2();
            }
            kVarW2.b((SelfieWorkflow.c.e) rendering, G2());
            this.currentRenderer = kVarW2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.f) {
            Object obj5 = this.currentRenderer;
            com.withpersona.sdk2.inquiry.selfie.l lVarX2 = obj5 instanceof com.withpersona.sdk2.inquiry.selfie.l ? (com.withpersona.sdk2.inquiry.selfie.l) obj5 : null;
            if (lVarX2 == null) {
                lVarX2 = x2();
            }
            lVarX2.b((SelfieWorkflow.c.f) rendering, G2());
            this.currentRenderer = lVarX2;
            return;
        }
        if (rendering instanceof SelfieWorkflow.c.g) {
            Object obj6 = this.currentRenderer;
            eq.f fVarY2 = obj6 instanceof eq.f ? (eq.f) obj6 : null;
            if (fVarY2 == null) {
                fVarY2 = y2((SelfieWorkflow.c.g) rendering);
            }
            fVarY2.b((SelfieWorkflow.c.g) rendering, G2());
            this.currentRenderer = fVarY2;
            return;
        }
        if (!(rendering instanceof SelfieWorkflow.c.d)) {
            throw new gt.l();
        }
        Object obj7 = this.currentRenderer;
        cq.a aVarT2 = obj7 instanceof cq.a ? (cq.a) obj7 : null;
        if (aVarT2 == null) {
            aVarT2 = t2((SelfieWorkflow.c.d) rendering);
        }
        aVarT2.a((SelfieWorkflow.c.d) rendering, E2());
        this.currentRenderer = aVarT2;
    }

    @Override // mq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        k2 selfieStepStateManager = H2().getSelfieStepStateManager();
        g2(selfieStepStateManager.c());
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        iu.k.d(t.a(sVarK0), null, null, new f(selfieStepStateManager, this, null), 3, null);
        SelfieWorkflow.c cVar = this.pendingRendering;
        if (cVar != null) {
            h2(cVar);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k0 p2(SelfieWorkflow.c.a initialRendering) {
        un.d dVar;
        Context context = ((yp.h) b2()).b.getContext();
        un.a.C0599a c0599aC = un.a.f33136a.c(r0.a.class, new r0.a() { // from class: cq.b
            @Override // xp.r0.a
            public final r0 a(Context context2, ViewGroup viewGroup) {
                return SelfieStepFragment.q2(context2, viewGroup);
            }
        });
        int i10 = c.f13130a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Invalid design version.");
        }
        if (i10 == 2) {
            dVar = un.d.DefaultSelfie;
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            dVar = un.d.K0000SelfieCapture;
        }
        r0.a aVar = (r0.a) c0599aC.a(dVar);
        Intrinsics.checkNotNull(context);
        r0 r0VarA = aVar.a(context, ((yp.h) b2()).b);
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(r0VarA.getRoot());
        com.withpersona.sdk2.camera.b bVarB2 = B2();
        n0 n0Var = D2().get();
        Intrinsics.checkNotNullExpressionValue(n0Var, "get(...)");
        return new k0(context, r0VarA, bVarB2, n0Var, F2(), C2().a(a0.f16182a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.selfie.c r2(SelfieWorkflow.c.C0238c initialRendering) throws CameraAccessException {
        dn.g gVarA;
        Context context = ((yp.h) b2()).getRoot().getContext();
        yp.a aVarC = yp.a.c(LayoutInflater.from(context));
        if (initialRendering.getVideoCaptureMethod() != kn.a.None) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices cameraChoicesB = f0.b(applicationContext, m0.FRONT);
            if (cameraChoicesB == null) {
                initialRendering.i().invoke(new i0());
                Camera2PreviewView camera2Preview = aVarC.f36935c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                gVarA = new com.withpersona.sdk2.camera.g(camera2Preview);
            } else {
                fn.c.a camera2ControllerFactory = initialRendering.getCamera2ControllerFactory();
                Camera2PreviewView camera2Preview2 = aVarC.f36935c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                n0 n0Var = D2().get();
                Intrinsics.checkNotNullExpressionValue(n0Var, "get(...)");
                gVarA = camera2ControllerFactory.a(cameraChoicesB, camera2Preview2, n0Var, kn.a.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired());
            }
        } else {
            com.withpersona.sdk2.camera.e.a cameraXControllerFactory = initialRendering.getCameraXControllerFactory();
            com.withpersona.sdk2.camera.b bVarB2 = B2();
            PreviewView previewviewSelfieCamera = aVarC.f36943k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            gVarA = cameraXControllerFactory.a(bVarB2, previewviewSelfieCamera, new d(aVarC, initialRendering), initialRendering.getIsAudioRequired());
        }
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(aVarC.getRoot());
        Intrinsics.checkNotNull(aVarC);
        n0 n0Var2 = D2().get();
        Intrinsics.checkNotNullExpressionValue(n0Var2, "get(...)");
        return new com.withpersona.sdk2.inquiry.selfie.c(aVarC, gVarA, n0Var2, F2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.selfie.h s2() {
        ((yp.h) b2()).b.removeAllViews();
        yp.e eVarC = yp.e.c(LayoutInflater.from(w()), ((yp.h) b2()).b, true);
        Intrinsics.checkNotNullExpressionValue(eVarC, "inflate(...)");
        return new com.withpersona.sdk2.inquiry.selfie.h(eVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cq.a t2(SelfieWorkflow.c.d initialRendering) {
        yq.s sVar = yq.s.f37116a;
        FrameLayout content = ((yp.h) b2()).b;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        UiComponentScreen uiScreen = initialRendering.getUiScreen();
        Function2<? super lq.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: cq.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SelfieStepFragment.u2((lq.b) obj, (Map) obj2);
            }
        };
        n nVar = new n() { // from class: cq.g
            @Override // xt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SelfieStepFragment.v2((lq.b) obj, (SelfieWorkflow.c.d) obj2, (Map) obj3);
            }
        };
        lq.b bVarC = lq.b.c(LayoutInflater.from(content.getContext()), content, false);
        Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(...)");
        content.removeAllViews();
        content.addView(bVarC.getRoot());
        return new cq.a(new e(uiScreen, bVarC, nVar, sVar.l(bVarC, uiScreen, function2, true)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.selfie.k w2() {
        yp.d dVarC = yp.d.c(LayoutInflater.from(((yp.h) b2()).b.getContext()), ((yp.h) b2()).b, false);
        Intrinsics.checkNotNullExpressionValue(dVarC, "inflate(...)");
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(dVarC.getRoot());
        return new com.withpersona.sdk2.inquiry.selfie.k(dVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.selfie.l x2() {
        yp.f fVarC = yp.f.c(LayoutInflater.from(((yp.h) b2()).b.getContext()), ((yp.h) b2()).b, false);
        Intrinsics.checkNotNullExpressionValue(fVarC, "inflate(...)");
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(fVarC.getRoot());
        return new com.withpersona.sdk2.inquiry.selfie.l(fVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final eq.f y2(SelfieWorkflow.c.g initialRendering) {
        un.d dVar;
        Context context = ((yp.h) b2()).b.getContext();
        un.a.C0599a c0599aC = un.a.f33136a.c(eq.g.a.class, new eq.g.a() { // from class: cq.c
            @Override // eq.g.a
            public final eq.g a(Context context2, ViewGroup viewGroup) {
                return SelfieStepFragment.z2(context2, viewGroup);
            }
        });
        int i10 = c.f13130a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1 || i10 == 2) {
            dVar = un.d.DefaultSelfie;
        } else {
            if (i10 != 3) {
                throw new gt.l();
            }
            dVar = un.d.K0000SelfieSubmitting;
        }
        eq.g.a aVar = (eq.g.a) c0599aC.a(dVar);
        Intrinsics.checkNotNull(context);
        eq.g gVarA = aVar.a(context, ((yp.h) b2()).b);
        ((yp.h) b2()).b.removeAllViews();
        ((yp.h) b2()).b.addView(gVarA.getRoot());
        return new eq.f(gVarA);
    }
}
