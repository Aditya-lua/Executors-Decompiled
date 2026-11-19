package hq;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import dv.c0;
import e.m0;
import f4.b0;
import f4.k0;
import f4.q;
import f4.t0;
import f4.y0;
import fq.CheckRequestPermissionRationaleStateView;
import fq.PermissionState;
import fq.n0;
import fq.n1;
import fq.s1;
import fq.x1;
import l4.CreationExtras;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.d0;
import zt.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003%&'B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006("}, d2 = {"Lhq/c;", "Lcr/c;", "Lgq/b;", "Liq/l$f;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "o2", "(Liq/l$f;)V", "Lhq/c$c;", "j0", "Lyq/c;", "l2", "()Lhq/c$c;", "args", "Lhq/f$a;", "k0", "Lhq/f$a;", "n2", "()Lhq/f$a;", "setViewModelFactory", "(Lhq/f$a;)V", "viewModelFactory", "Lhq/f;", "l0", "Lzt/h;", "m2", "()Lhq/f;", "viewModel", "m0", "b", "c", "d", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends cr.c<gq.b, iq.l.f> {

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yq.c args;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public hq.f.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewModel;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, gq.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18488a = new a();

        public a() {
            super(3, gq.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2FragmentPermissionRequestBinding;", 0);
        }

        public final gq.b d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return gq.b.c(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ gq.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: hq.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhq/c$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lf4/k0;", "fragmentManager", BuildConfig.FLAVOR, "viewId", BuildConfig.FLAVOR, "requestId", "Lfq/n1$c;", "props", BuildConfig.FLAVOR, "a", "(Lf4/k0;ILjava/lang/String;Lfq/n1$c;)V", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(@NotNull k0 fragmentManager, int viewId, @NotNull String requestId, @NotNull n1.Props props) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(props, "props");
            t0 t0VarR = fragmentManager.r();
            t0VarR.b(viewId, yq.b.a(new c(), new C0353c(requestId, props)), "Pi2PermissionRequestFragment");
            t0VarR.i();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: hq.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhq/c$c;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "requestId", "Lfq/n1$c;", "props", "<init>", "(Ljava/lang/String;Lfq/n1$c;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Lfq/n1$c;", "()Lfq/n1$c;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0353c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<C0353c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String requestId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final n1.Props props;

        /* JADX INFO: renamed from: hq.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C0353c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0353c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0353c(parcel.readString(), n1.Props.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0353c[] newArray(int i10) {
                return new C0353c[i10];
            }
        }

        public C0353c(@NotNull String requestId, @NotNull n1.Props props) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(props, "props");
            this.requestId = requestId;
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final n1.Props getProps() {
            return this.props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestId);
            this.props.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhq/c$d;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "requestId", "Lfq/t1;", "permissionState", "<init>", "(Ljava/lang/String;Lfq/t1;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Lfq/t1;", "()Lfq/t1;", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String requestId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final PermissionState permissionState;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new d(parcel.readString(), PermissionState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(@NotNull String requestId, @NotNull PermissionState permissionState) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(permissionState, "permissionState");
            this.requestId = requestId;
            this.permissionState = permissionState;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final PermissionState getPermissionState() {
            return this.permissionState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRequestId() {
            return this.requestId;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.requestId);
            this.permissionState.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"hq/c$e", "Le/m0;", BuildConfig.FLAVOR, "handleOnBackPressed", "()V", "permissions_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends m0 {
        public final /* synthetic */ iq.l X;
        public final /* synthetic */ c Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(iq.l lVar, c cVar) {
            super(true);
            this.X = lVar;
            this.Y = cVar;
        }

        @Override // e.m0
        public void handleOnBackPressed() {
            this.X.a().setValue(new n1.Output(new PermissionState(this.Y.l2().getProps().getPermission(), s1.PermissionRejected)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment$onViewCreated$2", f = "PermissionRequestFragment.kt", l = {96}, m = "invokeSuspend")
    public static final class f extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f18491t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ iq.l f18492u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c f18493v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ iq.l f18494a;
            public final /* synthetic */ c b;

            public a(iq.l lVar, c cVar) {
                this.f18494a = lVar;
                this.b = cVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(n1.Output output, eu.b<? super Unit> bVar) {
                if (output == null) {
                    return Unit.f21506a;
                }
                this.f18494a.a().setValue(null);
                c cVar = this.b;
                Bundle bundle = new Bundle();
                bundle.putParcelable("pi2_result", new d(this.b.l2().getRequestId(), output.getPermissionState()));
                Unit unit = Unit.f21506a;
                b0.a(cVar, "pi2_permission_request_request", bundle);
                k0 k0VarL = this.b.L();
                Intrinsics.checkNotNullExpressionValue(k0VarL, "getParentFragmentManager(...)");
                c cVar2 = this.b;
                t0 t0VarR = k0VarL.r();
                t0VarR.m(cVar2);
                t0VarR.g();
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(iq.l lVar, c cVar, eu.b<? super f> bVar) {
            super(2, bVar);
            this.f18492u = lVar;
            this.f18493v = cVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new f(this.f18492u, this.f18493v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((f) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f18491t;
            if (i10 == 0) {
                o.b(obj);
                c0<n1.Output> c0VarA = this.f18492u.a();
                a aVar = new a(this.f18492u, this.f18493v);
                this.f18491t = 1;
                if (c0VarA.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj);
            }
            throw new zt.d();
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f18495a;

        public g(q qVar) {
            this.f18495a = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f18495a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f18495a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f18496a;
        public final /* synthetic */ Function1 b;

        public h(q qVar, Function1 function1) {
            this.f18496a = qVar;
            this.b = function1;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new cr.d(this.f18496a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "b", "()Lf4/q;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends p001kotlin.jvm.internal.m implements Function0<q> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ q f18497i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(q qVar) {
            super(0);
            this.f18497i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return this.f18497i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends p001kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f18498i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0) {
            super(0);
            this.f18498i = function0;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f18498i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class k extends p001kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ zt.h f18499i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(zt.h hVar) {
            super(0);
            this.f18499i = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return y0.c(this.f18499i).w();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Ll4/a;", "b", "()Ll4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class l extends p001kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f18500i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f18501j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, zt.h hVar) {
            super(0);
            this.f18500i = function0;
            this.f18501j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f18500i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = y0.c(this.f18501j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f21886c;
        }
    }

    public c() {
        super(a.f18488a);
        this.args = new yq.c(d0.b(C0353c.class), new g(this));
        h hVar = new h(this, new Function1() { // from class: hq.a
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.q2(this.f18481a, (l0) obj);
            }
        });
        zt.h hVarB = zt.i.b(zt.k.NONE, new j(new i(this)));
        this.viewModel = y0.b(this, d0.b(hq.f.class), new k(hVarB), new l(null, hVarB), hVar);
    }

    public static final void p2(FrameLayout frameLayout, CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView, j.b bVar) {
        if (frameLayout.isAttachedToWindow()) {
            if (checkRequestPermissionRationaleStateView.getPermission() != n0.RecordAudio || checkRequestPermissionRationaleStateView.getIsPermanentPermissionRejectionCheck()) {
                checkRequestPermissionRationaleStateView.a().invoke(Boolean.valueOf(k2.b.v(bVar, x1.c(checkRequestPermissionRationaleStateView.getPermission()))));
            } else {
                checkRequestPermissionRationaleStateView.a().invoke(Boolean.TRUE);
            }
        }
    }

    public static final hq.f q2(c cVar, l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cVar.n2().a(it);
    }

    @Override // cr.c, f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        iq.l lVarE = m2().e(l2().getProps());
        e.p0 p0VarP = H1().P();
        s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        p0VarP.d(sVarK0, new e(lVarE, this));
        g2(lVarE.c());
        s sVarK1 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK1, "getViewLifecycleOwner(...)");
        av.k.d(t.a(sVarK1), null, null, new f(lVarE, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0353c l2() {
        return (C0353c) this.args.getValue();
    }

    public final hq.f m2() {
        return (hq.f) this.viewModel.getValue();
    }

    @NotNull
    public final hq.f.a n2() {
        hq.f.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr.c
    /* JADX INFO: renamed from: o2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull iq.l.f rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        final FrameLayout content = ((gq.b) b2()).b;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        content.removeAllViews();
        if (rendering instanceof iq.l.f.a) {
            iq.l.f.a aVar = (iq.l.f.a) rendering;
            aVar.getView();
            gq.c cVarC = gq.c.c(LayoutInflater.from(v()), content, true);
            Intrinsics.checkNotNullExpressionValue(cVarC, "inflate(...)");
            aVar.getView().i(cVarC);
            aVar.getView().n(cVarC, aVar.getView());
            return;
        }
        if (!(rendering instanceof iq.l.f.b)) {
            throw new zt.l();
        }
        final CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateViewA = ((iq.l.f.b) rendering).getView();
        Context context = content.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final j.b bVarH = xq.g.h(context);
        if (checkRequestPermissionRationaleStateViewA.a() != null) {
            content.post(new Runnable() { // from class: hq.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.p2(content, checkRequestPermissionRationaleStateViewA, bVarH);
                }
            });
        }
    }
}
