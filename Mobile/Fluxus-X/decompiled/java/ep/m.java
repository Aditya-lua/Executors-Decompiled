package ep;

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
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import java.io.File;
import java.util.Map;
import l4.CreationExtras;
import nn.ViewEnvironment;
import or.ComponentView;
import or.UiComponentScreen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import vo.d2;
import vo.n3;
import vo.y3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0093\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0094\u0001\u0095\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J%\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\r0#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\r0#2\u0006\u0010\b\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0014¢\u0006\u0004\b0\u00101J)\u00107\u001a\u00020\u00062\u0006\u00103\u001a\u0002022\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u000604¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0006H\u0016¢\u0006\u0004\b9\u0010\u0005R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010X\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010`\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\"\u0010h\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010p\u001a\u00020i8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR!\u0010w\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010\u0005\u001a\u0004\bt\u0010uR\u001b\u0010|\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\by\u0010s\u001a\u0004\bz\u0010{R$\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u0006\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0096\u0001"}, d2 = {"Lep/m;", "Lcr/c;", "Lap/e;", "Lvo/y3;", "<init>", "()V", BuildConfig.FLAVOR, "F2", "rendering", "Lkotlin/Function0;", "bind", "G2", "(Lvo/y3;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "newView", "Lkr/l;", "transition", "Q2", "(Landroid/view/View;Lkr/l;)V", "Lvo/y3$h;", "Landroid/content/Context;", "context", "C2", "(Lvo/y3$h;Landroid/content/Context;)V", "Lvo/y3$d;", "y2", "(Lvo/y3$d;Landroid/content/Context;)V", "Lvo/y3$k;", "E2", "(Lvo/y3$k;Landroid/content/Context;)V", "Lvo/y3$g;", "z2", "(Lvo/y3$g;Landroid/content/Context;)V", "Lvo/y3$b;", "initialRendering", "Lkotlin/Pair;", "Lxo/u;", "w2", "(Lvo/y3$b;)Lkotlin/Pair;", "Lvo/y3$i;", "Lhp/q;", "D2", "(Lvo/y3$i;)Lkotlin/Pair;", "view", "Landroid/os/Bundle;", "savedInstanceState", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "S2", "(Lvo/y3;)V", "Lvo/d2$a;", "input", "Lkotlin/Function1;", "Lvo/d2$b;", "handler", "R2", "(Lvo/d2$a;Lkotlin/jvm/functions/Function1;)V", "M0", "Lep/m$c;", "j0", "Lyq/c;", "H2", "()Lep/m$c;", "args", "Lep/i1$a;", "k0", "Lep/i1$a;", "P2", "()Lep/i1$a;", "setViewModelFactory", "(Lep/i1$a;)V", "viewModelFactory", "Lsn/t;", "l0", "Lsn/t;", "I2", "()Lsn/t;", "setCameraPreview", "(Lsn/t;)V", "cameraPreview", "Ltt/a;", "Lsn/h0;", "m0", "Ltt/a;", "K2", "()Ltt/a;", "setGovernmentIdFeed", "(Ltt/a;)V", "governmentIdFeed", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "n0", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "M2", "()Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "setTrackingEventsLogger", "(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V", "trackingEventsLogger", "Lto/e;", "o0", "Lto/e;", "J2", "()Lto/e;", "setFeatureFlagManager", "(Lto/e;)V", "featureFlagManager", "Ljr/a;", "p0", "Ljr/a;", "L2", "()Ljr/a;", "setSystemUiController", "(Ljr/a;)V", "systemUiController", "Lnn/z;", "q0", "Lzt/h;", "N2", "()Lnn/z;", "getViewEnvironment$annotations", "viewEnvironment", "Lep/i1;", "r0", "O2", "()Lep/i1;", "viewModel", "s0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", BuildConfig.FLAVOR, "t0", "Ljava/lang/Object;", "currentRunner", "u0", "Lvo/y3;", "currentScreen", "v0", "pendingRendering", "w0", "Lxo/u;", "retainedCameraRunner", "x0", "Landroid/view/View;", "retainedCameraView", "Lsn/i;", "y0", "Lsn/i;", "cameraController", "z0", "b", "c", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends cr.c<ap.e, y3> {

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yq.c args;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public i1.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public sn.t cameraPreview;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    public tt.a<sn.h0> governmentIdFeed;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    public TrackingEventsLogger trackingEventsLogger;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public to.e featureFlagManager;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public jr.a systemUiController;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewEnvironment;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewModel;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super d2.b, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Object currentRunner;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public y3 currentScreen;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public y3 pendingRendering;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public xo.u retainedCameraRunner;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View retainedCameraView;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public sn.i cameraController;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, ap.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13987a = new a();

        public a() {
            super(3, ap.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidFragmentBinding;", 0);
        }

        public final ap.e d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return ap.e.c(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ ap.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: ep.m$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lep/m$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lvo/d2$a;", "props", "Lep/m;", "a", "(Lvo/d2$a;)Lep/m;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m a(@NotNull d2.a props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (m) yq.b.a(new m(), new c(props));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lep/m$c;", "Landroid/os/Parcelable;", "Lvo/d2$a;", "props", "<init>", "(Lvo/d2$a;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lvo/d2$a;", "()Lvo/d2$a;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final d2.a props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c(d2.a.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(@NotNull d2.a props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d2.a getProps() {
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
        public static final /* synthetic */ int[] f13989a;

        static {
            int[] iArr = new int[vo.i.values().length];
            try {
                iArr[vo.i.V0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vo.i.K0000.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13989a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ep/m$e", "Lor/h;", "rendering", "Ljr/a;", "systemUiController", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;Ljr/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements or.h<y3.g> {
        public final /* synthetic */ UiComponentScreen b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ br.b f13990c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ pu.n f13991d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ or.j f13992e;

        public e(UiComponentScreen uiComponentScreen, br.b bVar, pu.n nVar, or.j jVar) {
            this.b = uiComponentScreen;
            this.f13990c = bVar;
            this.f13991d = nVar;
            this.f13992e = jVar;
        }

        @Override // or.h
        public void b(y3.g rendering, jr.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numI = this.b.i();
            if (numI != null) {
                br.b bVar = this.f13990c;
                int iIntValue = numI.intValue();
                bVar.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f13990c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = uiComponentScreen.a(context2);
            if (drawableA != null) {
                br.b bVar2 = this.f13990c;
                bVar2.getRoot().setBackground(drawableA);
                bVar2.f4560d.setBackgroundColor(0);
            }
            this.f13991d.invoke(this.f13990c, rendering, this.f13992e.getViewBindings().a());
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ep/m$f", "Lhp/k$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lhp/k;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lhp/k;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements hp.k.a {
        @Override // hp.k.a
        public hp.k a(Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new hp.j(context, container);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$finalizeVideoCaptureThenBind$1", f = "GovernmentIdStepFragment.kt", l = {343}, m = "invokeSuspend")
    public static final class g extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13993t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ sn.i f13994u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f13995v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ m f13996w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ y3 f13997x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(sn.i iVar, Function0<Unit> function0, m mVar, y3 y3Var, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f13994u = iVar;
            this.f13995v = function0;
            this.f13996w = mVar;
            this.f13997x = y3Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new g(this.f13994u, this.f13995v, this.f13996w, this.f13997x, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = fu.c.e();
            int i10 = this.f13993t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.i iVar = this.f13994u;
                if (iVar != null) {
                    this.f13993t = 1;
                    objK = iVar.k(this);
                    if (objK == objE) {
                        return objE;
                    }
                }
                this.f13995v.invoke();
                this.f13996w.F2();
                this.f13996w.currentScreen = this.f13997x;
                return Unit.f21506a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            objK = ((zt.n) obj).getValue();
            m mVar = this.f13996w;
            sn.i iVar2 = this.f13994u;
            if (zt.n.h(objK)) {
                mVar.O2().getGovernmentIdStepStateManager().f0((File) objK, iVar2.f());
            }
            zt.n.a(objK);
            this.f13995v.invoke();
            this.f13996w.F2();
            this.f13996w.currentScreen = this.f13997x;
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$onViewCreated$1", f = "GovernmentIdStepFragment.kt", l = {144}, m = "invokeSuspend")
    public static final class h extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f13998t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ f1 f13999u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ m f14000v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f14001a;
            public final /* synthetic */ f1 b;

            public a(m mVar, f1 f1Var) {
                this.f14001a = mVar;
                this.b = f1Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(d2.b bVar, eu.b<? super Unit> bVar2) {
                if (bVar == null) {
                    return Unit.f21506a;
                }
                if (this.f14001a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f14001a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(bVar);
                    }
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(f1 f1Var, m mVar, eu.b<? super h> bVar) {
            super(2, bVar);
            this.f13999u = f1Var;
            this.f14000v = mVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new h(this.f13999u, this.f14000v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((h) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f13998t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.c0<d2.b> c0VarA = this.f13999u.a();
                a aVar = new a(this.f14000v, this.f13999u);
                this.f13998t = 1;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$16", f = "GovernmentIdStepFragment.kt", l = {313, 314}, m = "invokeSuspend")
    public static final class i extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14002t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ y3 f14004v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f14005w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(y3 y3Var, Context context, eu.b<? super i> bVar) {
            super(2, bVar);
            this.f14004v = y3Var;
            this.f14005w = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return m.this.new i(this.f14004v, this.f14005w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((i) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r5 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r5.b(r1, r4) == r0) goto L18;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = fu.c.e();
            int i10 = this.f14002t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.i iVar = m.this.cameraController;
                if (iVar != null) {
                    this.f14002t = 1;
                    objK = iVar.k(this);
                } else {
                    sn.m mVar = sn.m.f31643a;
                    Context contextI1 = m.this.I1();
                    Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
                    this.f14002t = 2;
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
                objK = ((zt.n) obj).getValue();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            m.this.C2((y3.h) this.f14004v, this.f14005w);
            m.this.F2();
            m.this.currentScreen = this.f14004v;
            return Unit.f21506a;
            zt.n.a(objK);
            sn.m mVar2 = sn.m.f31643a;
            Context contextI2 = m.this.I1();
            Intrinsics.checkNotNullExpressionValue(contextI2, "requireContext(...)");
            this.f14002t = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment$render$9", f = "GovernmentIdStepFragment.kt", l = {252, 253}, m = "invokeSuspend")
    public static final class j extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14006t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ y3 f14008v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Context f14009w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(y3 y3Var, Context context, eu.b<? super j> bVar) {
            super(2, bVar);
            this.f14008v = y3Var;
            this.f14009w = context;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return m.this.new j(this.f14008v, this.f14009w, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((j) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            if (r5 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r5.b(r1, r4) == r0) goto L18;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objK;
            Object objE = fu.c.e();
            int i10 = this.f14006t;
            if (i10 == 0) {
                zt.o.b(obj);
                sn.i iVar = m.this.cameraController;
                if (iVar != null) {
                    this.f14006t = 1;
                    objK = iVar.k(this);
                } else {
                    sn.m mVar = sn.m.f31643a;
                    Context contextI1 = m.this.I1();
                    Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
                    this.f14006t = 2;
                }
                return objE;
            }
            if (i10 == 1) {
                zt.o.b(obj);
                objK = ((zt.n) obj).getValue();
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            m.this.y2((y3.d) this.f14008v, this.f14009w);
            m.this.F2();
            m.this.currentScreen = this.f14008v;
            return Unit.f21506a;
            zt.n.a(objK);
            sn.m mVar2 = sn.m.f31643a;
            Context contextI2 = m.this.I1();
            Intrinsics.checkNotNullExpressionValue(contextI2, "requireContext(...)");
            this.f14006t = 2;
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ep/m$k", "Lwo/d0$a;", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "container", "Lwo/d0;", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;)Lwo/d0;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class k implements wo.d0.a {
        @Override // wo.d0.a
        public wo.d0 a(Context context, ViewGroup container) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new wo.z(context, container);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class l implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f4.q f14010a;

        public l(f4.q qVar) {
            this.f14010a = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f14010a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f14010a + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: ep.m$m, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C0267m implements Function0<androidx.lifecycle.a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f4.q f14011a;
        public final /* synthetic */ Function1 b;

        public C0267m(f4.q qVar, Function1 function1) {
            this.f14011a = qVar;
            this.b = function1;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.a1.c invoke() {
            return new cr.d(this.f14011a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "b", "()Lf4/q;"}, k = 3, mv = {2, 2, 0})
    public static final class n extends p001kotlin.jvm.internal.m implements Function0<f4.q> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f4.q f14012i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(f4.q qVar) {
            super(0);
            this.f14012i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f4.q invoke() {
            return this.f14012i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class o extends p001kotlin.jvm.internal.m implements Function0<androidx.p000lifecycle.c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f14013i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Function0 function0) {
            super(0);
            this.f14013i = function0;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.p000lifecycle.c1 invoke() {
            return (androidx.p000lifecycle.c1) this.f14013i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class p extends p001kotlin.jvm.internal.m implements Function0<androidx.p000lifecycle.b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ zt.h f14014i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(zt.h hVar) {
            super(0);
            this.f14014i = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.p000lifecycle.b1 invoke() {
            return f4.y0.c(this.f14014i).w();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Ll4/a;", "b", "()Ll4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class q extends p001kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f14015i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f14016j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0, zt.h hVar) {
            super(0);
            this.f14015i = function0;
            this.f14016j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f14015i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            androidx.p000lifecycle.c1 c1VarC = f4.y0.c(this.f14016j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f21886c;
        }
    }

    public m() {
        super(a.f13987a);
        this.args = new yq.c(p001kotlin.jvm.internal.d0.b(c.class), new l(this));
        this.viewEnvironment = zt.i.a(new Function0() { // from class: ep.h
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.V2(this.f13960a);
            }
        });
        C0267m c0267m = new C0267m(this, new Function1() { // from class: ep.i
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return m.W2(this.f13963a, (androidx.p000lifecycle.l0) obj);
            }
        });
        zt.h hVarB = zt.i.b(zt.k.NONE, new o(new n(this)));
        this.viewModel = f4.y0.b(this, p001kotlin.jvm.internal.d0.b(i1.class), new p(hVarB), new q(null, hVarB), c0267m);
    }

    public static final Unit A2(br.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        kr.g.d(root, false, false, false, false, 15, null);
        return Unit.f21506a;
    }

    public static final Unit B2(br.b binding, y3.g pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ep.p.d(binding, pendingRendering);
        return Unit.f21506a;
    }

    public static final Unit T2(m mVar, y3 y3Var, Context context) {
        mVar.E2((y3.k) y3Var, context);
        return Unit.f21506a;
    }

    public static final Unit U2(m mVar, y3 y3Var, Context context) {
        mVar.z2((y3.g) y3Var, context);
        return Unit.f21506a;
    }

    public static final ViewEnvironment V2(m mVar) {
        return new ViewEnvironment(p001kotlin.collections.j0.g(zt.s.a(jr.b.b, mVar.L2())));
    }

    public static final i1 W2(m mVar, androidx.p000lifecycle.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return mVar.P2().a(it, mVar.H2().getProps());
    }

    public static final xo.w x2(sn.h0 governmentIdFeed, sn.t cameraPreview, to.e featureFlagManager, y3.b initialRendering, Context context, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(featureFlagManager, "featureFlagManager");
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(context, "context");
        return new xo.m(governmentIdFeed, cameraPreview, featureFlagManager, initialRendering, context, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C2(y3.h rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof gp.k)) {
            obj = null;
        }
        Object obj2 = (gp.k) obj;
        if (obj2 == null) {
            ap.h hVarC = ap.h.c(LayoutInflater.from(context), ((ap.e) b2()).b, false);
            Intrinsics.checkNotNullExpressionValue(hVarC, "inflate(...)");
            Pair pair = new Pair(new gp.k(hVarC), hVarC.getRoot());
            Object objA = pair.a();
            view = (View) pair.b();
            obj2 = objA;
        }
        kr.l transition = rendering.a(this.currentScreen) ? kr.l.NONE : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((gp.k) obj2).a(rendering, N2());
        this.currentRunner = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<hp.q, View> D2(y3.i rendering) {
        ko.d dVar;
        Context context = ((ap.e) b2()).b.getContext();
        ko.a.C0404a c0404aC = ko.a.f21493a.c(hp.k.a.class, new f());
        int i10 = d.f13989a[rendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            dVar = ko.d.DefaultGovIdReview;
        } else {
            if (i10 != 2) {
                throw new zt.l();
            }
            dVar = ko.d.K0000GovIdReview;
        }
        hp.k.a aVar = (hp.k.a) c0404aC.a(dVar);
        Intrinsics.checkNotNull(context);
        hp.k kVarA = aVar.a(context, ((ap.e) b2()).b);
        return new Pair<>(new hp.q(kVarA), kVarA.getRoot());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void E2(y3.k rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof vo.o0)) {
            obj = null;
        }
        Object obj2 = (vo.o0) obj;
        if (obj2 == null) {
            ap.m mVarC = ap.m.c(LayoutInflater.from(context), ((ap.e) b2()).b, false);
            Intrinsics.checkNotNullExpressionValue(mVarC, "inflate(...)");
            Pair pair = new Pair(new vo.o0(mVarC), mVarC.getRoot());
            Object objA = pair.a();
            view = (View) pair.b();
            obj2 = objA;
        }
        kr.l transition = rendering.a(this.currentScreen) ? kr.l.NONE : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((vo.o0) obj2).a(rendering, N2());
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

    public final void G2(y3 rendering, Function0<Unit> bind) {
        sn.i iVar = this.cameraController;
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        av.k.d(androidx.p000lifecycle.t.a(sVarK0), null, null, new g(iVar, bind, this, rendering, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c H2() {
        return (c) this.args.getValue();
    }

    @NotNull
    public final sn.t I2() {
        sn.t tVar = this.cameraPreview;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.u("cameraPreview");
        return null;
    }

    @NotNull
    public final to.e J2() {
        to.e eVar = this.featureFlagManager;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.u("featureFlagManager");
        return null;
    }

    @NotNull
    public final tt.a<sn.h0> K2() {
        tt.a<sn.h0> aVar = this.governmentIdFeed;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("governmentIdFeed");
        return null;
    }

    @NotNull
    public final jr.a L2() {
        jr.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    @Override // yq.a, f4.q
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

    public final i1 O2() {
        return (i1) this.viewModel.getValue();
    }

    @NotNull
    public final i1.a P2() {
        i1.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q2(View newView, kr.l transition) {
        Object tag = ((ap.e) b2()).b.getTag(n3.f34878l0);
        View view = tag instanceof View ? (View) tag : null;
        if (this.currentScreen == null) {
            transition = kr.l.NONE;
        }
        if (view != null) {
            FrameLayout content = ((ap.e) b2()).b;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            xq.i0.a(content, view, newView, transition);
        } else {
            ((ap.e) b2()).b.addView(newView);
        }
        ((ap.e) b2()).b.setTag(n3.f34878l0, newView);
    }

    public final void R2(@NotNull d2.a input, @NotNull Function1<? super d2.b, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        O2().f(input);
        this.currentOutputHandler = handler;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:124:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d7  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr.c
    /* JADX INFO: renamed from: S2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull final y3 rendering) {
        Object obj;
        hp.q qVar;
        kr.l transition;
        ko.d dVar;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.pendingRendering = rendering;
            return;
        }
        final Context contextI1 = I1();
        Intrinsics.checkNotNullExpressionValue(contextI1, "requireContext(...)");
        View viewB = null;
        if (rendering instanceof y3.e) {
            Object obj2 = this.currentRunner;
            if (!(obj2 instanceof vo.w)) {
                obj2 = null;
            }
            Object obj3 = (vo.w) obj2;
            if (obj3 == null) {
                ap.g gVarC = ap.g.c(LayoutInflater.from(contextI1), ((ap.e) b2()).b, false);
                Intrinsics.checkNotNullExpressionValue(gVarC, "inflate(...)");
                Pair pair = new Pair(new vo.w(gVarC), gVarC.getRoot());
                Object objA = pair.a();
                viewB = (View) pair.b();
                obj3 = objA;
            }
            kr.l transition2 = rendering.a(this.currentScreen) ? kr.l.NONE : rendering.getTransition();
            if (viewB != null) {
                Q2(viewB, transition2);
            }
            ((vo.w) obj3).a((y3.e) rendering, N2());
            this.currentRunner = obj3;
        } else if (rendering instanceof y3.a) {
            ko.a.C0404a c0404aC = ko.a.f21493a.c(wo.d0.a.class, new k());
            y3.a aVar = (y3.a) rendering;
            int i10 = d.f13989a[aVar.getDesignVersion().ordinal()];
            if (i10 == 1) {
                dVar = ko.d.DefaultSelectCountryAndIdClass;
            } else {
                if (i10 != 2) {
                    throw new zt.l();
                }
                dVar = ko.d.K0000SelectCountryAndIdClass;
            }
            wo.d0 d0VarA = ((wo.d0.a) c0404aC.a(dVar)).a(contextI1, ((ap.e) b2()).b);
            Object obj4 = this.currentRunner;
            if (!(obj4 instanceof wo.c0)) {
                obj4 = null;
            }
            Object obj5 = (wo.c0) obj4;
            if (obj5 == null) {
                Pair pair2 = new Pair(new wo.c0(d0VarA), d0VarA.getRoot());
                Object objA2 = pair2.a();
                viewB = (View) pair2.b();
                obj5 = objA2;
            }
            kr.l transition3 = rendering.a(this.currentScreen) ? kr.l.NONE : rendering.getTransition();
            if (viewB != null) {
                Q2(viewB, transition3);
            }
            ((wo.c0) obj5).a(aVar, N2());
            this.currentRunner = obj5;
        } else if (rendering instanceof y3.b) {
            if ((this.currentScreen instanceof y3.i) && (this.currentRunner instanceof hp.q)) {
                Object tag = ((ap.e) b2()).b.getTag(n3.f34878l0);
                View view = tag instanceof View ? (View) tag : null;
                if (view != null) {
                    ((ap.e) b2()).b.removeView(view);
                }
            }
            View view2 = this.retainedCameraView;
            if (view2 != null) {
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ((ap.e) b2()).b.setTag(n3.f34878l0, this.retainedCameraView);
                xo.u uVar = this.retainedCameraRunner;
                if (uVar != null) {
                    uVar.a((y3.b) rendering, N2());
                }
                this.currentRunner = this.retainedCameraRunner;
            } else {
                Object obj6 = this.currentRunner;
                if (!(obj6 instanceof xo.u)) {
                    obj6 = null;
                }
                xo.u uVar2 = (xo.u) obj6;
                if (uVar2 == null) {
                    Pair<xo.u, View> pairW2 = w2((y3.b) rendering);
                    xo.u uVarA = pairW2.a();
                    viewB = pairW2.b();
                    uVar2 = uVarA;
                }
                kr.l transition4 = rendering.a(this.currentScreen) ? kr.l.NONE : rendering.getTransition();
                if (viewB != null) {
                    Q2(viewB, transition4);
                }
                uVar2.a((y3.b) rendering, N2());
                this.currentRunner = uVar2;
            }
        } else if (rendering instanceof y3.c) {
            Object obj7 = this.currentRunner;
            if (!(obj7 instanceof gp.e)) {
                obj7 = null;
            }
            Object obj8 = (gp.e) obj7;
            if (obj8 == null) {
                ap.d dVarC = ap.d.c(LayoutInflater.from(contextI1), ((ap.e) b2()).b, false);
                Intrinsics.checkNotNullExpressionValue(dVarC, "inflate(...)");
                Pair pair3 = new Pair(new gp.e(dVarC), dVarC.getRoot());
                Object objA3 = pair3.a();
                viewB = (View) pair3.b();
                obj8 = objA3;
            }
            kr.l transition5 = rendering.a(this.currentScreen) ? kr.l.NONE : rendering.getTransition();
            if (viewB != null) {
                Q2(viewB, transition5);
            }
            ((gp.e) obj8).a((y3.c) rendering, N2());
            this.currentRunner = obj8;
        } else if (rendering instanceof y3.d) {
            y3.d dVar2 = (y3.d) rendering;
            if (dVar2.getVideoCaptureEnabled() && this.cameraController != null) {
                androidx.p000lifecycle.s sVarK0 = k0();
                Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
                av.k.d(androidx.p000lifecycle.t.a(sVarK0), null, null, new j(rendering, contextI1, null), 3, null);
                return;
            }
            y2(dVar2, contextI1);
        } else if (rendering instanceof y3.i) {
            y3.i iVar = (y3.i) rendering;
            if (iVar.getKeepCameraAlive()) {
                Object obj9 = this.currentRunner;
                if ((obj9 instanceof xo.u) && (this.currentScreen instanceof y3.b)) {
                    Intrinsics.d(obj9, "null cannot be cast to non-null type com.withpersona.sdk2.inquiry.governmentid.cameraScreen.CameraScreenRunner");
                    this.retainedCameraRunner = (xo.u) obj9;
                    Object tag2 = ((ap.e) b2()).b.getTag(n3.f34878l0);
                    viewB = tag2 instanceof View ? (View) tag2 : null;
                    this.retainedCameraView = viewB;
                    if (viewB != null) {
                        viewB.setVisibility(4);
                    }
                    Pair<hp.q, View> pairD2 = D2(iVar);
                    hp.q qVarA = pairD2.a();
                    View viewB2 = pairD2.b();
                    ((ap.e) b2()).b.addView(viewB2);
                    ((ap.e) b2()).b.setTag(n3.f34878l0, viewB2);
                    qVarA.a(iVar, N2());
                    this.currentRunner = qVarA;
                } else {
                    obj = this.currentRunner;
                    if (!(obj instanceof hp.q)) {
                        obj = null;
                    }
                    qVar = (hp.q) obj;
                    if (qVar == null) {
                        Pair<hp.q, View> pairD3 = D2(iVar);
                        hp.q qVarA2 = pairD3.a();
                        viewB = pairD3.b();
                        qVar = qVarA2;
                    }
                    if (rendering.a(this.currentScreen)) {
                        transition = kr.l.NONE;
                    } else {
                        transition = rendering.getTransition();
                    }
                    if (viewB != null) {
                        Q2(viewB, transition);
                    }
                    qVar.a(iVar, N2());
                    this.currentRunner = qVar;
                }
            } else {
                obj = this.currentRunner;
                if (!(obj instanceof hp.q)) {
                    obj = null;
                }
                qVar = (hp.q) obj;
                if (qVar == null) {
                    Pair<hp.q, View> pairD4 = D2(iVar);
                    hp.q qVarA3 = pairD4.a();
                    viewB = pairD4.b();
                    qVar = qVarA3;
                }
                if (rendering.a(this.currentScreen)) {
                    transition = kr.l.NONE;
                } else {
                    transition = rendering.getTransition();
                }
                if (viewB != null) {
                    Q2(viewB, transition);
                }
                qVar.a(iVar, N2());
                this.currentRunner = qVar;
            }
        } else if (rendering instanceof y3.j) {
            Object obj10 = this.currentRunner;
            if (!(obj10 instanceof gp.p)) {
                obj10 = null;
            }
            Object obj11 = (gp.p) obj10;
            if (obj11 == null) {
                ap.j jVarC = ap.j.c(LayoutInflater.from(contextI1), ((ap.e) b2()).b, false);
                Intrinsics.checkNotNullExpressionValue(jVarC, "inflate(...)");
                Pair pair4 = new Pair(new gp.p(jVarC), jVarC.getRoot());
                Object objA4 = pair4.a();
                viewB = (View) pair4.b();
                obj11 = objA4;
            }
            kr.l transition6 = rendering.a(this.currentScreen) ? kr.l.NONE : rendering.getTransition();
            if (viewB != null) {
                Q2(viewB, transition6);
            }
            ((gp.p) obj11).a((y3.j) rendering, N2());
            this.currentRunner = obj11;
        } else if (rendering instanceof y3.k) {
            y3.k kVar = (y3.k) rendering;
            if (kVar.getIsFinalizingVideoCapture()) {
                G2(rendering, new Function0() { // from class: ep.f
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.T2(this.f13897a, rendering, contextI1);
                    }
                });
                return;
            }
            E2(kVar, contextI1);
        } else if (rendering instanceof y3.g) {
            y3.g gVar = (y3.g) rendering;
            if (gVar.getIsFinalizingVideoCapture()) {
                G2(rendering, new Function0() { // from class: ep.g
                    @Override // p001kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.U2(this.f13943a, rendering, contextI1);
                    }
                });
                return;
            }
            z2(gVar, contextI1);
        } else {
            if (!(rendering instanceof y3.h)) {
                throw new zt.l();
            }
            if (this.cameraController != null) {
                androidx.p000lifecycle.s sVarK1 = k0();
                Intrinsics.checkNotNullExpressionValue(sVarK1, "getViewLifecycleOwner(...)");
                av.k.d(androidx.p000lifecycle.t.a(sVarK1), null, null, new i(rendering, contextI1, null), 3, null);
                return;
            }
            C2((y3.h) rendering, contextI1);
        }
        this.currentScreen = rendering;
    }

    @Override // cr.c, f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        f1 governmentIdStepStateManager = O2().getGovernmentIdStepStateManager();
        g2(governmentIdStepStateManager.c());
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        av.k.d(androidx.p000lifecycle.t.a(sVarK0), null, null, new h(governmentIdStepStateManager, this, null), 3, null);
        y3 y3Var = this.pendingRendering;
        if (y3Var != null) {
            h2(y3Var);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<xo.u, View> w2(y3.b initialRendering) {
        ko.d dVar;
        Context context = ((ap.e) b2()).b.getContext();
        ko.a.C0404a c0404aC = ko.a.f21493a.c(xo.w.a.class, new xo.w.a() { // from class: ep.j
            @Override // xo.w.a
            public final xo.w b(sn.h0 h0Var, sn.t tVar, to.e eVar, y3.b bVar, Context context2, ViewGroup viewGroup) {
                return m.x2(h0Var, tVar, eVar, bVar, context2, viewGroup);
            }
        });
        int i10 = d.f13989a[initialRendering.getDesignVersion().ordinal()];
        if (i10 == 1) {
            dVar = ko.d.DefaultGovIdCapture;
        } else {
            if (i10 != 2) {
                throw new zt.l();
            }
            dVar = ko.d.K0000GovIdCapture;
        }
        xo.w.a aVar = (xo.w.a) c0404aC.a(dVar);
        sn.h0 h0Var = K2().get();
        Intrinsics.checkNotNullExpressionValue(h0Var, "get(...)");
        sn.t tVarI2 = I2();
        to.e eVarJ2 = J2();
        Intrinsics.checkNotNull(context);
        xo.w wVarB = aVar.b(h0Var, tVarI2, eVarJ2, initialRendering, context, ((ap.e) b2()).b);
        this.cameraController = wVarB.getCameraController();
        sn.i cameraController = wVarB.getCameraController();
        sn.h0 h0Var2 = K2().get();
        Intrinsics.checkNotNullExpressionValue(h0Var2, "get(...)");
        return new Pair<>(new xo.u(context, wVarB, cameraController, h0Var2, M2()), wVarB.getRoot());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y2(y3.d rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof gp.j)) {
            obj = null;
        }
        Object obj2 = (gp.j) obj;
        if (obj2 == null) {
            ap.a aVarC = ap.a.c(LayoutInflater.from(context), ((ap.e) b2()).b, false);
            Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
            Pair pair = new Pair(new gp.j(aVarC), aVarC.getRoot());
            Object objA = pair.a();
            view = (View) pair.b();
            obj2 = objA;
        }
        kr.l transition = rendering.a(this.currentScreen) ? kr.l.NONE : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((gp.j) obj2).a(rendering, N2());
        this.currentRunner = obj2;
    }

    public final void z2(y3.g rendering, Context context) {
        Object obj = this.currentRunner;
        View view = null;
        if (!(obj instanceof ep.a)) {
            obj = null;
        }
        Object objA = (ep.a) obj;
        if (objA == null) {
            FrameLayout frameLayout = new FrameLayout(context);
            or.v vVar = or.v.f28513a;
            UiComponentScreen uiScreen = rendering.getUiScreen();
            Function2<? super br.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: ep.k
                @Override // p001kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return m.A2((br.b) obj2, (Map) obj3);
                }
            };
            pu.n nVar = new pu.n() { // from class: ep.l
                @Override // pu.n
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return m.B2((br.b) obj2, (y3.g) obj3, (Map) obj4);
                }
            };
            br.b bVarC = br.b.c(LayoutInflater.from(frameLayout.getContext()), frameLayout, false);
            Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(...)");
            frameLayout.removeAllViews();
            frameLayout.addView(bVarC.getRoot());
            Pair pair = new Pair(new ep.a(new e(uiScreen, bVarC, nVar, vVar.l(bVarC, uiScreen, function2, true))), frameLayout);
            objA = pair.a();
            view = (View) pair.b();
        }
        kr.l transition = rendering.a(this.currentScreen) ? kr.l.NONE : rendering.getTransition();
        if (view != null) {
            Q2(view, transition);
        }
        ((ep.a) objA).b(rendering, L2());
        this.currentRunner = objA;
    }
}
