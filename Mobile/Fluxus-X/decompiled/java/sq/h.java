package sq;

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
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.l0;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dv.c0;
import f4.q;
import f4.y0;
import java.util.Map;
import l4.CreationExtras;
import mq.q0;
import mq.q5;
import mq.v0;
import nn.ViewEnvironment;
import nq.k0;
import nq.r0;
import or.ComponentView;
import or.UiComponentScreen;
import or.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.j0;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import sn.b1;
import sn.t;
import sn.u0;
import sn.z;
import to.a0;
import tq.k2;
import un.CameraChoices;
import un.f0;
import un.m0;
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ~2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u007f\u0080\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b%\u0010&J)\u0010,\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$0)¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0003H\u0014¢\u0006\u0004\b/\u00100R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001b\u0010D\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR$\u0010G\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020$\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\"\u0010V\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010_\u001a\b\u0012\u0004\u0012\u00020X0W8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010g\u001a\u00020`8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010o\u001a\u00020h8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR!\u0010}\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\by\u0010A\u0012\u0004\b|\u0010\u0005\u001a\u0004\bz\u0010{¨\u0006\u0081\u0001"}, d2 = {"Lsq/h;", "Lcr/c;", "Loq/h;", "Lmq/q5$d;", "<init>", "()V", "Lmq/l0;", "s2", "()Lmq/l0;", "Lmq/q5$d$a;", "initialRendering", "Lnq/k0;", "p2", "(Lmq/q5$d$a;)Lnq/k0;", "Lmq/q5$d$c;", "Lmq/n;", "r2", "(Lmq/q5$d$c;)Lmq/n;", "Lmq/v0;", "x2", "()Lmq/v0;", "Lmq/q0;", "w2", "()Lmq/q0;", "Lmq/q5$d$g;", "Luq/f;", "y2", "(Lmq/q5$d$g;)Luq/f;", "Lmq/q5$d$d;", "Lsq/a;", "t2", "(Lmq/q5$d$d;)Lsq/a;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lmq/q5$b;", "props", "Lkotlin/Function1;", "Lmq/q5$c;", "handler", "J2", "(Lmq/q5$b;Lkotlin/jvm/functions/Function1;)V", "rendering", "K2", "(Lmq/q5$d;)V", "Lsq/h$c;", "j0", "Lyq/c;", "A2", "()Lsq/h$c;", "args", "Lsq/n$a;", "k0", "Lsq/n$a;", "I2", "()Lsq/n$a;", "setViewModelFactory", "(Lsq/n$a;)V", "viewModelFactory", "Lsq/n;", "l0", "Lzt/h;", "H2", "()Lsq/n;", "viewModel", "m0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "n0", "Lmq/q5$d;", "pendingRendering", BuildConfig.FLAVOR, "o0", "Ljava/lang/Object;", "currentRenderer", "Lsn/t;", "p0", "Lsn/t;", "B2", "()Lsn/t;", "setCameraPreview", "(Lsn/t;)V", "cameraPreview", "Ltt/a;", "Lsn/b1;", "q0", "Ltt/a;", "D2", "()Ltt/a;", "setSelfieDirectionFeed", "(Ltt/a;)V", "selfieDirectionFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "r0", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "F2", "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "setTrackingEventsLogger", "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "trackingEventsLogger", "Ljr/a;", "s0", "Ljr/a;", "E2", "()Ljr/a;", "setSystemUiController", "(Ljr/a;)V", "systemUiController", "Lto/e;", "t0", "Lto/e;", "C2", "()Lto/e;", "setFeatureFlagManager", "(Lto/e;)V", "featureFlagManager", "Lnn/z;", "u0", "G2", "()Lnn/z;", "getViewEnvironment$annotations", "viewEnvironment", "v0", "b", "c", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h extends cr.c<oq.h, q5.d> {

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yq.c args;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public n.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewModel;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super q5.c, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public q5.d pendingRendering;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object currentRenderer;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public t cameraPreview;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public tt.a<b1> selfieDirectionFeed;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public jr.a systemUiController;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public to.e featureFlagManager;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewEnvironment;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, oq.h> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31845a = new a();

        public a() {
            super(3, oq.h.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieStepBinding;", 0);
        }

        public final oq.h d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return oq.h.c(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ oq.h invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: sq.h$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsq/h$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lmq/q5$b;", "props", "Lsq/h;", "a", "(Lmq/q5$b;)Lsq/h;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h a(@NotNull q5.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (h) yq.b.a(new h(), new c(props));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lsq/h$c;", "Landroid/os/Parcelable;", "Lmq/q5$b;", "props", "<init>", "(Lmq/q5$b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lmq/q5$b;", "()Lmq/q5$b;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final q5.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c(q5.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(@NotNull q5.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final q5.Input getProps() {
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
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31847a;

        static {
            int[] iArr = new int[mq.c.values().length];
            try {
                iArr[mq.c.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mq.c.V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mq.c.K0000.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31847a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sq/h$e", "Lsn/z;", BuildConfig.FLAVOR, "a", "()V", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements z {
        public final /* synthetic */ oq.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q5.d.c f31849c;

        public e(oq.a aVar, q5.d.c cVar) {
            this.b = aVar;
            this.f31849c = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(q5.d.c cVar, sn.k it) {
            Intrinsics.checkNotNullParameter(it, "it");
            cVar.i().invoke(it);
            return Unit.f21506a;
        }

        @Override // sn.z
        public void a() {
            t tVarB2 = h.this.B2();
            PreviewView previewviewSelfieCamera = this.b.f28335k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            t.a aVar = t.a.FRONT;
            b1 b1Var = h.this.D2().get();
            final q5.d.c cVar = this.f31849c;
            t.g(tVarB2, previewviewSelfieCamera, aVar, b1Var, true, false, new Function1() { // from class: sq.i
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h.e.c(cVar, (sn.k) obj);
                }
            }, 16, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"sq/h$f", "Lor/h;", "rendering", "Ljr/a;", "systemUiController", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;Ljr/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements or.h<q5.d.C0474d> {
        public final /* synthetic */ UiComponentScreen b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ br.b f31850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ pu.n f31851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ or.j f31852e;

        public f(UiComponentScreen uiComponentScreen, br.b bVar, pu.n nVar, or.j jVar) {
            this.b = uiComponentScreen;
            this.f31850c = bVar;
            this.f31851d = nVar;
            this.f31852e = jVar;
        }

        @Override // or.h
        public void b(q5.d.C0474d rendering, jr.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numI = this.b.i();
            if (numI != null) {
                br.b bVar = this.f31850c;
                int iIntValue = numI.intValue();
                bVar.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f31850c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = uiComponentScreen.a(context2);
            if (drawableA != null) {
                br.b bVar2 = this.f31850c;
                bVar2.getRoot().setBackground(drawableA);
                bVar2.f4560d.setBackgroundColor(0);
            }
            this.f31851d.invoke(this.f31850c, rendering, this.f31852e.getViewBindings().a());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment$onViewCreated$1", f = "SelfieStepFragment.kt", l = {117}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31853t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ k2 f31854u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ h f31855v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f31856a;
            public final /* synthetic */ k2 b;

            public a(h hVar, k2 k2Var) {
                this.f31856a = hVar;
                this.b = k2Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(q5.c cVar, eu.b<? super Unit> bVar) {
                if (cVar == null) {
                    return Unit.f21506a;
                }
                if (this.f31856a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f31856a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(cVar);
                    }
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(k2 k2Var, h hVar, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f31854u = k2Var;
            this.f31855v = hVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.f31854u, this.f31855v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f31853t;
            if (i10 == 0) {
                zt.o.b(obj);
                c0<q5.c> c0VarA = this.f31854u.a();
                a aVar = new a(this.f31855v, this.f31854u);
                this.f31853t = 1;
                if (c0VarA.collect(aVar, this) == objE) {
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

    /* JADX INFO: renamed from: sq.h$h, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0636h implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f31857a;

        public C0636h(q qVar) {
            this.f31857a = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f31857a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f31857a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class i implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f31858a;
        public final /* synthetic */ Function1 b;

        public i(q qVar, Function1 function1) {
            this.f31858a = qVar;
            this.b = function1;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new cr.d(this.f31858a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "b", "()Lf4/q;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends p001kotlin.jvm.internal.m implements Function0<q> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ q f31859i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(q qVar) {
            super(0);
            this.f31859i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return this.f31859i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class k extends p001kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f31860i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0) {
            super(0);
            this.f31860i = function0;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f31860i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class l extends p001kotlin.jvm.internal.m implements Function0<androidx.p000lifecycle.b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ zt.h f31861i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(zt.h hVar) {
            super(0);
            this.f31861i = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.p000lifecycle.b1 invoke() {
            return y0.c(this.f31861i).w();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Ll4/a;", "b", "()Ll4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class m extends p001kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f31862i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f31863j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0, zt.h hVar) {
            super(0);
            this.f31862i = function0;
            this.f31863j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f31862i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = y0.c(this.f31863j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f21886c;
        }
    }

    public h() {
        super(a.f31845a);
        this.args = new yq.c(d0.b(c.class), new C0636h(this));
        i iVar = new i(this, new Function1() { // from class: sq.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.M2(this.f31830a, (l0) obj);
            }
        });
        zt.h hVarB = zt.i.b(zt.k.NONE, new k(new j(this)));
        this.viewModel = y0.b(this, d0.b(n.class), new l(hVarB), new m(null, hVarB), iVar);
        this.viewEnvironment = zt.i.a(new Function0() { // from class: sq.e
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.L2(this.f31831a);
            }
        });
    }

    private final ViewEnvironment G2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public static final ViewEnvironment L2(h hVar) {
        return new ViewEnvironment(j0.g(s.a(jr.b.b, hVar.E2())));
    }

    public static final n M2(h hVar, l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return hVar.I2().a(it, hVar.A2().getProps());
    }

    public static final r0 q2(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new nq.q(context, viewGroup);
    }

    public static final Unit u2(br.b pendingBinding, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = pendingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        kr.g.d(root, false, false, false, false, 15, null);
        return Unit.f21506a;
    }

    public static final Unit v2(br.b pendingBinding, q5.d.C0474d pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        sq.l.d(pendingBinding, pendingRendering);
        return Unit.f21506a;
    }

    public static final uq.g z2(Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new uq.c(context, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c A2() {
        return (c) this.args.getValue();
    }

    @NotNull
    public final t B2() {
        t tVar = this.cameraPreview;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.u("cameraPreview");
        return null;
    }

    @NotNull
    public final to.e C2() {
        to.e eVar = this.featureFlagManager;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.u("featureFlagManager");
        return null;
    }

    @NotNull
    public final tt.a<b1> D2() {
        tt.a<b1> aVar = this.selfieDirectionFeed;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("selfieDirectionFeed");
        return null;
    }

    @NotNull
    public final jr.a E2() {
        jr.a aVar = this.systemUiController;
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

    public final n H2() {
        return (n) this.viewModel.getValue();
    }

    @NotNull
    public final n.a I2() {
        n.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    public final void J2(@NotNull q5.Input props, @NotNull Function1<? super q5.c, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(handler, "handler");
        H2().f(props);
        this.currentOutputHandler = handler;
    }

    @Override // cr.c
    /* JADX INFO: renamed from: K2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull q5.d rendering) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.pendingRendering = rendering;
            return;
        }
        if (rendering instanceof q5.d.b) {
            Object obj = this.currentRenderer;
            mq.l0 l0VarS2 = obj instanceof mq.l0 ? (mq.l0) obj : null;
            if (l0VarS2 == null) {
                l0VarS2 = s2();
            }
            l0VarS2.g((q5.d.b) rendering, E2());
            this.currentRenderer = l0VarS2;
            return;
        }
        if (rendering instanceof q5.d.a) {
            Object obj2 = this.currentRenderer;
            k0 k0VarP2 = obj2 instanceof k0 ? (k0) obj2 : null;
            if (k0VarP2 == null) {
                k0VarP2 = p2((q5.d.a) rendering);
            }
            k0VarP2.H((q5.d.a) rendering, E2());
            this.currentRenderer = k0VarP2;
            return;
        }
        if (rendering instanceof q5.d.c) {
            Object obj3 = this.currentRenderer;
            mq.n nVarR2 = obj3 instanceof mq.n ? (mq.n) obj3 : null;
            if (nVarR2 == null) {
                nVarR2 = r2((q5.d.c) rendering);
            }
            nVarR2.a((q5.d.c) rendering, G2());
            this.currentRenderer = nVarR2;
            return;
        }
        if (rendering instanceof q5.d.e) {
            Object obj4 = this.currentRenderer;
            q0 q0VarW2 = obj4 instanceof q0 ? (q0) obj4 : null;
            if (q0VarW2 == null) {
                q0VarW2 = w2();
            }
            q0VarW2.a((q5.d.e) rendering, G2());
            this.currentRenderer = q0VarW2;
            return;
        }
        if (rendering instanceof q5.d.f) {
            Object obj5 = this.currentRenderer;
            v0 v0VarX2 = obj5 instanceof v0 ? (v0) obj5 : null;
            if (v0VarX2 == null) {
                v0VarX2 = x2();
            }
            v0VarX2.a((q5.d.f) rendering, G2());
            this.currentRenderer = v0VarX2;
            return;
        }
        if (rendering instanceof q5.d.g) {
            Object obj6 = this.currentRenderer;
            uq.f fVarY2 = obj6 instanceof uq.f ? (uq.f) obj6 : null;
            if (fVarY2 == null) {
                fVarY2 = y2((q5.d.g) rendering);
            }
            fVarY2.a((q5.d.g) rendering, G2());
            this.currentRenderer = fVarY2;
            return;
        }
        if (!(rendering instanceof q5.d.C0474d)) {
            throw new zt.l();
        }
        Object obj7 = this.currentRenderer;
        sq.a aVarT2 = obj7 instanceof sq.a ? (sq.a) obj7 : null;
        if (aVarT2 == null) {
            aVarT2 = t2((q5.d.C0474d) rendering);
        }
        aVarT2.b((q5.d.C0474d) rendering, E2());
        this.currentRenderer = aVarT2;
    }

    @Override // cr.c, f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        k2 selfieStepStateManager = H2().getSelfieStepStateManager();
        g2(selfieStepStateManager.c());
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        av.k.d(androidx.p000lifecycle.t.a(sVarK0), null, null, new g(selfieStepStateManager, this, null), 3, null);
        q5.d dVar = this.pendingRendering;
        if (dVar != null) {
            h2(dVar);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k0 p2(q5.d.a initialRendering) {
        ko.d dVar;
        Context context = ((oq.h) b2()).b.getContext();
        ko.a.C0404a c0404aC = ko.a.f21493a.c(r0.a.class, new r0.a() { // from class: sq.b
            @Override // nq.r0.a
            public final r0 a(Context context2, ViewGroup viewGroup) {
                return h.q2(context2, viewGroup);
            }
        });
        int i10 = d.f31847a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Invalid design version.");
        }
        if (i10 == 2) {
            dVar = ko.d.DefaultSelfie;
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            dVar = ko.d.K0000SelfieCapture;
        }
        r0.a aVar = (r0.a) c0404aC.a(dVar);
        Intrinsics.checkNotNull(context);
        r0 r0VarA = aVar.a(context, ((oq.h) b2()).b);
        ((oq.h) b2()).b.removeAllViews();
        ((oq.h) b2()).b.addView(r0VarA.getRoot());
        t tVarB2 = B2();
        b1 b1Var = D2().get();
        Intrinsics.checkNotNullExpressionValue(b1Var, "get(...)");
        return new k0(context, r0VarA, tVarB2, b1Var, F2(), C2().a(a0.f32602a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mq.n r2(q5.d.c initialRendering) throws CameraAccessException {
        sn.i iVarA;
        Context context = ((oq.h) b2()).getRoot().getContext();
        oq.a aVarC = oq.a.c(LayoutInflater.from(context));
        if (initialRendering.getVideoCaptureMethod() != zn.a.None) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            CameraChoices cameraChoicesB = f0.b(applicationContext, m0.FRONT);
            if (cameraChoicesB == null) {
                initialRendering.i().invoke(new sn.v0());
                Camera2PreviewView camera2Preview = aVarC.f28327c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
                iVarA = new u0(camera2Preview);
            } else {
                un.c.a camera2ControllerFactory = initialRendering.getCamera2ControllerFactory();
                Camera2PreviewView camera2Preview2 = aVarC.f28327c;
                Intrinsics.checkNotNullExpressionValue(camera2Preview2, "camera2Preview");
                b1 b1Var = D2().get();
                Intrinsics.checkNotNullExpressionValue(b1Var, "get(...)");
                iVarA = camera2ControllerFactory.a(cameraChoicesB, camera2Preview2, b1Var, zn.a.valueOf(initialRendering.getVideoCaptureMethod().toString()), initialRendering.getWebRtcManager(), initialRendering.getIsAudioRequired());
            }
        } else {
            sn.a0.a cameraXControllerFactory = initialRendering.getCameraXControllerFactory();
            t tVarB2 = B2();
            PreviewView previewviewSelfieCamera = aVarC.f28335k;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            iVarA = cameraXControllerFactory.a(tVarB2, previewviewSelfieCamera, new e(aVarC, initialRendering), initialRendering.getIsAudioRequired());
        }
        ((oq.h) b2()).b.removeAllViews();
        ((oq.h) b2()).b.addView(aVarC.getRoot());
        Intrinsics.checkNotNull(aVarC);
        b1 b1Var2 = D2().get();
        Intrinsics.checkNotNullExpressionValue(b1Var2, "get(...)");
        return new mq.n(aVarC, iVarA, b1Var2, F2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final mq.l0 s2() {
        ((oq.h) b2()).b.removeAllViews();
        oq.e eVarC = oq.e.c(LayoutInflater.from(v()), ((oq.h) b2()).b, true);
        Intrinsics.checkNotNullExpressionValue(eVarC, "inflate(...)");
        return new mq.l0(eVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sq.a t2(q5.d.C0474d initialRendering) {
        v vVar = v.f28513a;
        FrameLayout content = ((oq.h) b2()).b;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        UiComponentScreen uiScreen = initialRendering.getUiScreen();
        Function2<? super br.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: sq.f
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return h.u2((br.b) obj, (Map) obj2);
            }
        };
        pu.n nVar = new pu.n() { // from class: sq.g
            @Override // pu.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return h.v2((br.b) obj, (q5.d.C0474d) obj2, (Map) obj3);
            }
        };
        br.b bVarC = br.b.c(LayoutInflater.from(content.getContext()), content, false);
        Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(...)");
        content.removeAllViews();
        content.addView(bVarC.getRoot());
        return new sq.a(new f(uiScreen, bVarC, nVar, vVar.l(bVarC, uiScreen, function2, true)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q0 w2() {
        oq.d dVarC = oq.d.c(LayoutInflater.from(((oq.h) b2()).b.getContext()), ((oq.h) b2()).b, false);
        Intrinsics.checkNotNullExpressionValue(dVarC, "inflate(...)");
        ((oq.h) b2()).b.removeAllViews();
        ((oq.h) b2()).b.addView(dVarC.getRoot());
        return new q0(dVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final v0 x2() {
        oq.f fVarC = oq.f.c(LayoutInflater.from(((oq.h) b2()).b.getContext()), ((oq.h) b2()).b, false);
        Intrinsics.checkNotNullExpressionValue(fVarC, "inflate(...)");
        ((oq.h) b2()).b.removeAllViews();
        ((oq.h) b2()).b.addView(fVarC.getRoot());
        return new v0(fVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final uq.f y2(q5.d.g initialRendering) {
        ko.d dVar;
        Context context = ((oq.h) b2()).b.getContext();
        ko.a.C0404a c0404aC = ko.a.f21493a.c(uq.g.a.class, new uq.g.a() { // from class: sq.c
            @Override // uq.g.a
            public final uq.g a(Context context2, ViewGroup viewGroup) {
                return h.z2(context2, viewGroup);
            }
        });
        int i10 = d.f31847a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1 || i10 == 2) {
            dVar = ko.d.DefaultSelfie;
        } else {
            if (i10 != 3) {
                throw new zt.l();
            }
            dVar = ko.d.K0000SelfieSubmitting;
        }
        uq.g.a aVar = (uq.g.a) c0404aC.a(dVar);
        Intrinsics.checkNotNull(context);
        uq.g gVarA = aVar.a(context, ((oq.h) b2()).b);
        ((oq.h) b2()).b.removeAllViews();
        ((oq.h) b2()).b.addView(gVarA.getRoot());
        return new uq.f(gVarA);
    }
}
