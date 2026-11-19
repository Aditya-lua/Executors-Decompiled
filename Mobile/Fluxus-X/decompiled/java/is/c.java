package is;

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
import es.h4;
import es.s6;
import f4.q;
import f4.y0;
import gu.m;
import hs.g1;
import l4.CreationExtras;
import nn.ViewEnvironment;
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
import p001kotlin.jvm.internal.k;
import pu.n;
import zt.l;
import zt.o;
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002DEB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R!\u0010-\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u0005\u001a\u0004\b*\u0010+R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u00107R$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\n\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lis/c;", "Lcr/c;", "Lfs/a;", "Les/s6$d;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "rendering", "r2", "(Les/s6$d;)V", "Les/s6$b;", "input", "Lkotlin/Function1;", "Les/s6$c;", "handler", "q2", "(Les/s6$b;Lkotlin/jvm/functions/Function1;)V", "Lis/f$a;", "j0", "Lis/f$a;", "p2", "()Lis/f$a;", "setViewModelFactory", "(Lis/f$a;)V", "viewModelFactory", "Ljr/a;", "k0", "Ljr/a;", "m2", "()Ljr/a;", "setSystemUiController", "(Ljr/a;)V", "systemUiController", "Lnn/z;", "l0", "Lzt/h;", "n2", "()Lnn/z;", "getViewEnvironment$annotations", "viewEnvironment", "Lis/c$c;", "m0", "Lyq/c;", "l2", "()Lis/c$c;", "args", "Lis/f;", "n0", "o2", "()Lis/f;", "viewModel", "o0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "Les/h4;", "p0", "Les/h4;", "runner", "q0", "Les/s6$d;", "pendingRendering", "r0", "b", "c", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends cr.c<fs.a, s6.d> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    public is.f.a viewModelFactory;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public jr.a systemUiController;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewEnvironment;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yq.c args;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewModel;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super s6.c, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public h4 runner;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public s6.d pendingRendering;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements n<LayoutInflater, ViewGroup, Boolean, fs.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19769a = new a();

        public a() {
            super(3, fs.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/ui/databinding/Pi2InquiryUiBinding;", 0);
        }

        public final fs.a d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return fs.a.d(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ fs.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: is.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lis/c$b;", BuildConfig.FLAVOR, "<init>", "()V", "Les/s6$b;", "props", "Lis/c;", "a", "(Les/s6$b;)Lis/c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a(@NotNull s6.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (c) yq.b.a(new c(), new C0369c(props));
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: is.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lis/c$c;", "Landroid/os/Parcelable;", "Les/s6$b;", "props", "<init>", "(Les/s6$b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Les/s6$b;", "()Les/s6$b;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0369c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<C0369c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final s6.Input props;

        /* JADX INFO: renamed from: is.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<C0369c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0369c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new C0369c(s6.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0369c[] newArray(int i10) {
                return new C0369c[i10];
            }
        }

        public C0369c(@NotNull s6.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final s6.Input getProps() {
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
    @gu.f(c = "com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$onViewCreated$1", f = "UiStepFragment.kt", l = {72}, m = "invokeSuspend")
    public static final class d extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f19771t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ g1 f19772u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c f19773v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f19774a;
            public final /* synthetic */ g1 b;

            public a(c cVar, g1 g1Var) {
                this.f19774a = cVar;
                this.b = g1Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(s6.c cVar, eu.b<? super Unit> bVar) {
                if (cVar == null) {
                    return Unit.f21506a;
                }
                if (this.f19774a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f19774a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(cVar);
                    }
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g1 g1Var, c cVar, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f19772u = g1Var;
            this.f19773v = cVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f19772u, this.f19773v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f19771t;
            if (i10 == 0) {
                o.b(obj);
                c0<s6.c> c0VarA = this.f19772u.a();
                a aVar = new a(this.f19773v, this.f19772u);
                this.f19771t = 1;
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
    public static final class e implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f19775a;

        public e(q qVar) {
            this.f19775a = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f19775a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f19775a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f19776a;
        public final /* synthetic */ Function1 b;

        public f(q qVar, Function1 function1) {
            this.f19776a = qVar;
            this.b = function1;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new cr.d(this.f19776a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "b", "()Lf4/q;"}, k = 3, mv = {2, 2, 0})
    public static final class g extends p001kotlin.jvm.internal.m implements Function0<q> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ q f19777i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q qVar) {
            super(0);
            this.f19777i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q invoke() {
            return this.f19777i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class h extends p001kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f19778i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0) {
            super(0);
            this.f19778i = function0;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f19778i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends p001kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ zt.h f19779i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(zt.h hVar) {
            super(0);
            this.f19779i = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return y0.c(this.f19779i).w();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Ll4/a;", "b", "()Ll4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends p001kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f19780i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f19781j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0, zt.h hVar) {
            super(0);
            this.f19780i = function0;
            this.f19781j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f19780i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = y0.c(this.f19781j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f21886c;
        }
    }

    public c() {
        super(a.f19769a);
        this.viewEnvironment = zt.i.a(new Function0() { // from class: is.a
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c.s2(this.f19758a);
            }
        });
        this.args = new yq.c(d0.b(C0369c.class), new e(this));
        f fVar = new f(this, new Function1() { // from class: is.b
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.t2(this.f19759a, (l0) obj);
            }
        });
        zt.h hVarB = zt.i.b(zt.k.NONE, new h(new g(this)));
        this.viewModel = y0.b(this, d0.b(is.f.class), new i(hVarB), new j(null, hVarB), fVar);
    }

    private final ViewEnvironment n2() {
        return (ViewEnvironment) this.viewEnvironment.getValue();
    }

    public static final ViewEnvironment s2(c cVar) {
        return new ViewEnvironment(j0.g(s.a(jr.b.b, cVar.m2())));
    }

    public static final is.f t2(c cVar, l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return cVar.p2().a(it, cVar.l2().getProps());
    }

    @Override // cr.c, f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        g1 uiStepStateManager = o2().getUiStepStateManager();
        g2(uiStepStateManager.c());
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        av.k.d(t.a(sVarK0), null, null, new d(uiStepStateManager, this, null), 3, null);
        s6.d dVar = this.pendingRendering;
        if (dVar != null) {
            h2(dVar);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C0369c l2() {
        return (C0369c) this.args.getValue();
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

    public final is.f o2() {
        return (is.f) this.viewModel.getValue();
    }

    @NotNull
    public final is.f.a p2() {
        is.f.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    public final void q2(@NotNull s6.Input input, @NotNull Function1<? super s6.c, Unit> handler) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(handler, "handler");
        o2().f(input);
        this.currentOutputHandler = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr.c
    /* JADX INFO: renamed from: r2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull s6.d rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (!d2()) {
            this.pendingRendering = rendering;
            return;
        }
        if (!(rendering instanceof s6.d.a)) {
            throw new l();
        }
        h4 h4Var = this.runner;
        if (h4Var == null) {
            h4Var = new h4((fs.a) b2(), (s6.d.a) rendering);
            this.runner = h4Var;
        }
        h4Var.a((s6.d.a) rendering, n2());
    }
}
