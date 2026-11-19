package mp;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.l0;
import androidx.p000lifecycle.t;
import av.p0;
import com.github.luben.zstd.BuildConfig;
import dv.c0;
import f4.q;
import f4.y0;
import l4.CreationExtras;
import lp.v;
import nn.ViewEnvironment;
import nn.b0;
import nn.f0;
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
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 ?2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002@AB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R!\u0010-\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0005\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u00101R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lmp/c;", "Lcr/c;", "Lbr/b;", "Llp/m;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "q2", "(Llp/m;)V", "Llp/v$b;", "input", "Lkotlin/Function1;", "Llp/v$c;", "handler", "r2", "(Llp/v$b;Lkotlin/jvm/functions/Function1;)V", "Lmp/m$a;", "j0", "Lmp/m$a;", "p2", "()Lmp/m$a;", "setViewModelFactory", "(Lmp/m$a;)V", "viewModelFactory", "Ljr/a;", "k0", "Ljr/a;", "m2", "()Ljr/a;", "setSystemUiController", "(Ljr/a;)V", "systemUiController", "Lnn/z;", "l0", "Lzt/h;", "n2", "()Lnn/z;", "getViewEnvironment$annotations", "viewEnvironment", "Lmp/m;", "m0", "o2", "()Lmp/m;", "viewModel", "Lmp/c$c;", "n0", "Lyq/c;", "l2", "()Lmp/c$c;", "args", "o0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "p0", "Landroid/view/View;", "currentView", "q0", "b", "c", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends cr.c<br.b, lp.m> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public m.a viewModelFactory;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public jr.a systemUiController;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewEnvironment;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewModel;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yq.c args;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super v.c, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public View currentView;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, br.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f23445a = new a();

        public a() {
            super(3, br.b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;", 0);
        }

        public final br.b d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return br.b.c(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ br.b invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: mp.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmp/c$b;", BuildConfig.FLAVOR, "<init>", "()V", "Llp/v$b;", "props", "Lmp/c;", "a", "(Llp/v$b;)Lmp/c;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a(@NotNull v.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (c) yq.b.a(new c(), new C0458c(props));
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: mp.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmp/c$c;", "Landroid/os/Parcelable;", "Llp/v$b;", "props", "<init>", "(Llp/v$b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Llp/v$b;", "()Llp/v$b;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0458c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<C0458c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final v.Input props;

        /* JADX INFO: renamed from: mp.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C0458c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0458c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0458c(v.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0458c[] newArray(int i10) {
                return new C0458c[i10];
            }
        }

        public C0458c(@NotNull v.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final v.Input getProps() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment$onViewCreated$1", f = "IntegrationStepFragment.kt", l = {73}, m = "invokeSuspend")
    public static final class d extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23447t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ mp.j f23448u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c f23449v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f23450a;
            public final /* synthetic */ mp.j b;

            public a(c cVar, mp.j jVar) {
                this.f23450a = cVar;
                this.b = jVar;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(v.c cVar, eu.b<? super Unit> bVar) {
                if (cVar == null) {
                    return Unit.f21506a;
                }
                if (this.f23450a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f23450a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(cVar);
                    }
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(mp.j jVar, c cVar, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f23448u = jVar;
            this.f23449v = cVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f23448u, this.f23449v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f23447t;
            if (i10 == 0) {
                zt.o.b(obj);
                c0<v.c> c0VarA = this.f23448u.a();
                a aVar = new a(this.f23449v, this.f23448u);
                this.f23447t = 1;
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

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f23451a;

        public e(q qVar) {
            this.f23451a = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f23451a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f23451a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f23452a;
        public final /* synthetic */ Function1 b;

        public f(q qVar, Function1 function1) {
            this.f23452a = qVar;
            this.b = function1;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new cr.d(this.f23452a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "b", "()Lf4/q;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends p001kotlin.jvm.internal.m implements Function0<q> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ q f23453i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q qVar) {
            super(0);
            this.f23453i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return this.f23453i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class h extends p001kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f23454i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0) {
            super(0);
            this.f23454i = function0;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f23454i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends p001kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ zt.h f23455i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(zt.h hVar) {
            super(0);
            this.f23455i = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return y0.c(this.f23455i).w();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Ll4/a;", "b", "()Ll4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends p001kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f23456i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f23457j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, zt.h hVar) {
            super(0);
            this.f23456i = function0;
            this.f23457j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23456i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = y0.c(this.f23457j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f21886c;
        }
    }

    public c() {
        super(a.f23445a);
        this.viewEnvironment = zt.i.a(new Function0() { // from class: mp.a
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.s2(this.f23435a);
            }
        });
        f fVar = new f(this, new Function1() { // from class: mp.b
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.t2(this.f23436a, (l0) obj);
            }
        });
        zt.h hVarB = zt.i.b(zt.k.NONE, new h(new g(this)));
        this.viewModel = y0.b(this, d0.b(m.class), new i(hVarB), new j(null, hVarB), fVar);
        this.args = new yq.c(d0.b(C0458c.class), new e(this));
    }

    private final ViewEnvironment n2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public static final ViewEnvironment s2(c cVar) {
        return new ViewEnvironment(j0.g(s.a(jr.b.b, cVar.m2())));
    }

    public static final m t2(c cVar, l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cVar.p2().a(it);
    }

    @Override // cr.c, f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        mp.j jVarE = o2().e(l2().getProps());
        g2(jVarE.c());
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        av.k.d(t.a(sVarK0), null, null, new d(jVarE, this, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0458c l2() {
        return (C0458c) this.args.getValue();
    }

    @NotNull
    public final jr.a m2() {
        jr.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    public final m o2() {
        return (m) this.viewModel.getValue();
    }

    @NotNull
    public final m.a p2() {
        m.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr.c
    /* JADX INFO: renamed from: q2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull lp.m rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        View view = this.currentView;
        if (view != null) {
            if (view != null) {
                f0.g(view, rendering, n2());
                return;
            }
            return;
        }
        b0<lp.m> b0VarA = rendering.a();
        ViewEnvironment viewEnvironmentN2 = n2();
        Context context = ((br.b) b2()).getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.currentView = b0VarA.a(rendering, viewEnvironmentN2, context, ((br.b) b2()).getRoot());
        ((br.b) b2()).getRoot().addView(this.currentView);
        View view2 = this.currentView;
        if (view2 != null) {
            f0.h(view2);
        }
    }

    public final void r2(@NotNull v.Input input, @NotNull Function1<? super v.c, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        o2().f(input);
        this.currentOutputHandler = handler;
    }
}
