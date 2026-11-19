package qo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.luben.zstd.BuildConfig;
import java.util.Map;
import l4.CreationExtras;
import no.u2;
import or.ComponentView;
import or.UiComponentScreen;
import or.UiStepBottomSheet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002MNB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lqo/g;", "Lcr/c;", "Loo/e;", "Lno/u2$d;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lno/u2$b;", "props", "Lkotlin/Function1;", "Lno/u2$c;", "handler", "w2", "(Lno/u2$b;Lkotlin/jvm/functions/Function1;)V", "rendering", "x2", "(Lno/u2$d;)V", "Lno/q;", "r2", "()Lno/q;", "Lno/u2$d$b;", "initialRendering", "Lqo/b;", "s2", "(Lno/u2$d$b;)Lqo/b;", "Lno/v;", "v2", "()Lno/v;", "Lqo/g$c;", "j0", "Lyq/c;", "n2", "()Lqo/g$c;", "args", "Lqo/h1$a;", "k0", "Lqo/h1$a;", "q2", "()Lqo/h1$a;", "setViewModelFactory", "(Lqo/h1$a;)V", "viewModelFactory", "Ljr/a;", "l0", "Ljr/a;", "o2", "()Ljr/a;", "setSystemUiController", "(Ljr/a;)V", "systemUiController", "Lqo/h1;", "m0", "Lzt/h;", "p2", "()Lqo/h1;", "viewModel", "n0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "o0", "Lno/u2$d;", "pendingRendering", "Lor/h;", "p0", "Lor/h;", "currentScreenRenderer", "Lor/s;", "q0", "Lor/s;", "currentBottomSheet", "r0", "b", "c", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g extends cr.c<oo.e, u2.d> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yq.c args;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public h1.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public jr.a systemUiController;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h viewModel;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super u2.c, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public u2.d pendingRendering;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public or.h<?> currentScreenRenderer;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UiStepBottomSheet currentBottomSheet;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends p001kotlin.jvm.internal.k implements pu.n<LayoutInflater, ViewGroup, Boolean, oo.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30098a = new a();

        public a() {
            super(3, oo.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2FragmentDocumentStepBinding;", 0);
        }

        public final oo.e d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return oo.e.c(p8, viewGroup, z10);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ oo.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: qo.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqo/g$b;", BuildConfig.FLAVOR, "<init>", "()V", "Lno/u2$b;", "props", "Lqo/g;", "a", "(Lno/u2$b;)Lqo/g;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final g a(@NotNull u2.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (g) yq.b.a(new g(), new c(props));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lqo/g$c;", "Landroid/os/Parcelable;", "Lno/u2$b;", "props", "<init>", "(Lno/u2$b;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lno/u2$b;", "()Lno/u2$b;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final u2.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new c(u2.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(@NotNull u2.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final u2.Input getProps() {
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

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"qo/g$d", "Lor/h;", "rendering", "Ljr/a;", "systemUiController", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;Ljr/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements or.h<u2.d.b> {
        public final /* synthetic */ UiComponentScreen b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ br.b f30100c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ pu.n f30101d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ or.j f30102e;

        public d(UiComponentScreen uiComponentScreen, br.b bVar, pu.n nVar, or.j jVar) {
            this.b = uiComponentScreen;
            this.f30100c = bVar;
            this.f30101d = nVar;
            this.f30102e = jVar;
        }

        @Override // or.h
        public void b(u2.d.b rendering, jr.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numI = this.b.i();
            if (numI != null) {
                br.b bVar = this.f30100c;
                int iIntValue = numI.intValue();
                bVar.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f30100c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = uiComponentScreen.a(context2);
            if (drawableA != null) {
                br.b bVar2 = this.f30100c;
                bVar2.getRoot().setBackground(drawableA);
                bVar2.f4560d.setBackgroundColor(0);
            }
            this.f30101d.invoke(this.f30100c, rendering, this.f30102e.getViewBindings().a());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$onViewCreated$1", f = "DocumentStepFragment.kt", l = {74}, m = "invokeSuspend")
    public static final class e extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f30103t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e1 f30104u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ g f30105v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f30106a;
            public final /* synthetic */ e1 b;

            public a(g gVar, e1 e1Var) {
                this.f30106a = gVar;
                this.b = e1Var;
            }

            @Override // dv.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(u2.c cVar, eu.b<? super Unit> bVar) {
                if (cVar == null) {
                    return Unit.f21506a;
                }
                if (this.f30106a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f30106a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(cVar);
                    }
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e1 e1Var, g gVar, eu.b<? super e> bVar) {
            super(2, bVar);
            this.f30104u = e1Var;
            this.f30105v = gVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new e(this.f30104u, this.f30105v, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((e) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f30103t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.c0<u2.c> c0VarA = this.f30104u.a();
                a aVar = new a(this.f30105v, this.f30104u);
                this.f30103t = 1;
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

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"qo/g$f", "Lor/h;", "rendering", "Ljr/a;", "systemUiController", BuildConfig.FLAVOR, "b", "(Ljava/lang/Object;Ljr/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements or.h<no.j> {
        public final /* synthetic */ UiComponentScreen b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ br.b f30107c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ pu.n f30108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ or.j f30109e;

        public f(UiComponentScreen uiComponentScreen, br.b bVar, pu.n nVar, or.j jVar) {
            this.b = uiComponentScreen;
            this.f30107c = bVar;
            this.f30108d = nVar;
            this.f30109e = jVar;
        }

        @Override // or.h
        public void b(no.j rendering, jr.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numI = this.b.i();
            if (numI != null) {
                br.b bVar = this.f30107c;
                int iIntValue = numI.intValue();
                bVar.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f30107c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = uiComponentScreen.a(context2);
            if (drawableA != null) {
                br.b bVar2 = this.f30107c;
                bVar2.getRoot().setBackground(drawableA);
                bVar2.f4560d.setBackgroundColor(0);
            }
            this.f30108d.invoke(this.f30107c, rendering, this.f30109e.getViewBindings().a());
        }
    }

    /* JADX INFO: renamed from: qo.g$g, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0591g extends p001kotlin.jvm.internal.k implements pu.n<br.b, no.j, Map<String, ? extends ComponentView>, Unit> {
        public C0591g(Object obj) {
            super(3, obj, no.j.class, "showRendering", "showRendering$document_release(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Ljava/util/Map;)V", 0);
        }

        public final void d(br.b p8, no.j p10, Map<String, ComponentView> p11) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((no.j) this.receiver).h(p8, p10, p11);
        }

        @Override // pu.n
        public /* bridge */ /* synthetic */ Unit invoke(br.b bVar, no.j jVar, Map<String, ? extends ComponentView> map) {
            d(bVar, jVar, map);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f4.q f30110a;

        public h(f4.q qVar) {
            this.f30110a = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f30110a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f30110a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class i implements Function0<androidx.lifecycle.a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f4.q f30111a;
        public final /* synthetic */ Function1 b;

        public i(f4.q qVar, Function1 function1) {
            this.f30111a = qVar;
            this.b = function1;
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.lifecycle.a1.c invoke() {
            return new cr.d(this.f30111a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lf4/q;", "b", "()Lf4/q;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends p001kotlin.jvm.internal.m implements Function0<f4.q> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ f4.q f30112i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f4.q qVar) {
            super(0);
            this.f30112i = qVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f4.q invoke() {
            return this.f30112i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class k extends p001kotlin.jvm.internal.m implements Function0<androidx.p000lifecycle.c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f30113i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Function0 function0) {
            super(0);
            this.f30113i = function0;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.p000lifecycle.c1 invoke() {
            return (androidx.p000lifecycle.c1) this.f30113i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class l extends p001kotlin.jvm.internal.m implements Function0<androidx.p000lifecycle.b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ zt.h f30114i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(zt.h hVar) {
            super(0);
            this.f30114i = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.p000lifecycle.b1 invoke() {
            return f4.y0.c(this.f30114i).w();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Ll4/a;", "b", "()Ll4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class m extends p001kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f30115i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ zt.h f30116j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0, zt.h hVar) {
            super(0);
            this.f30115i = function0;
            this.f30116j = hVar;
        }

        @Override // p001kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30115i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            androidx.p000lifecycle.c1 c1VarC = f4.y0.c(this.f30116j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f21886c;
        }
    }

    public g() {
        super(a.f30098a);
        this.args = new yq.c(p001kotlin.jvm.internal.d0.b(c.class), new h(this));
        i iVar = new i(this, new Function1() { // from class: qo.c
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.z2(this.f30042a, (androidx.p000lifecycle.l0) obj);
            }
        });
        zt.h hVarB = zt.i.b(zt.k.NONE, new k(new j(this)));
        this.viewModel = f4.y0.b(this, p001kotlin.jvm.internal.d0.b(h1.class), new l(hVarB), new m(null, hVarB), iVar);
    }

    public static final Unit t2(br.b pendingBinding, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = pendingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        kr.g.d(root, false, false, false, false, 15, null);
        return Unit.f21506a;
    }

    public static final Unit u2(br.b pendingBinding, u2.d.b pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        qo.j.d(pendingBinding, pendingRendering);
        return Unit.f21506a;
    }

    public static final Unit y2(br.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        kr.g.d(root, false, false, false, false, 15, null);
        return Unit.f21506a;
    }

    public static final h1 z2(g gVar, androidx.p000lifecycle.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return gVar.q2().a(it, gVar.n2().getProps());
    }

    @Override // cr.c, f4.q
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        e1 stateManager = p2().getStateManager();
        g2(stateManager.c());
        androidx.p000lifecycle.s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        av.k.d(androidx.p000lifecycle.t.a(sVarK0), null, null, new e(stateManager, this, null), 3, null);
        u2.d dVar = this.pendingRendering;
        if (dVar != null) {
            h2(dVar);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c n2() {
        return (c) this.args.getValue();
    }

    @NotNull
    public final jr.a o2() {
        jr.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    public final h1 p2() {
        return (h1) this.viewModel.getValue();
    }

    @NotNull
    public final h1.a q2() {
        h1.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final no.q r2() {
        oo.a aVarC = oo.a.c(LayoutInflater.from(((oo.e) b2()).f28318c.getContext()), ((oo.e) b2()).f28318c, false);
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        ((oo.e) b2()).f28318c.removeAllViews();
        ((oo.e) b2()).f28318c.addView(aVarC.getRoot());
        return new no.q(aVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b s2(u2.d.b initialRendering) {
        or.v vVar = or.v.f28513a;
        FrameLayout content = ((oo.e) b2()).f28318c;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        UiComponentScreen uiScreen = initialRendering.getUiScreen();
        Function2<? super br.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: qo.e
            @Override // p001kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.t2((br.b) obj, (Map) obj2);
            }
        };
        pu.n nVar = new pu.n() { // from class: qo.f
            @Override // pu.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return g.u2((br.b) obj, (u2.d.b) obj2, (Map) obj3);
            }
        };
        br.b bVarC = br.b.c(LayoutInflater.from(content.getContext()), content, false);
        Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(...)");
        content.removeAllViews();
        content.addView(bVarC.getRoot());
        return new b(new d(uiScreen, bVarC, nVar, vVar.l(bVarC, uiScreen, function2, true)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final no.v v2() {
        oo.c cVarC = oo.c.c(LayoutInflater.from(((oo.e) b2()).f28318c.getContext()), ((oo.e) b2()).f28318c, false);
        Intrinsics.checkNotNullExpressionValue(cVarC, "inflate(...)");
        ((oo.e) b2()).f28318c.removeAllViews();
        ((oo.e) b2()).f28318c.addView(cVarC.getRoot());
        return new no.v(cVarC);
    }

    public final void w2(@NotNull u2.Input props, @NotNull Function1<? super u2.c, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(handler, "handler");
        p2().f(props);
        this.currentOutputHandler = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cr.c
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull u2.d rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (rendering instanceof no.j) {
            or.h<?> hVar = this.currentScreenRenderer;
            qo.a aVar = hVar instanceof qo.a ? (qo.a) hVar : null;
            if (aVar == null) {
                or.v vVar = or.v.f28513a;
                FrameLayout content = ((oo.e) b2()).f28318c;
                Intrinsics.checkNotNullExpressionValue(content, "content");
                UiComponentScreen uiScreen = ((no.j) rendering).getUiScreen();
                Function2<? super br.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: qo.d
                    @Override // p001kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g.y2((br.b) obj, (Map) obj2);
                    }
                };
                C0591g c0591g = new C0591g(rendering);
                br.b bVarC = br.b.c(LayoutInflater.from(content.getContext()), content, false);
                Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(...)");
                content.removeAllViews();
                content.addView(bVarC.getRoot());
                aVar = new qo.a(new f(uiScreen, bVarC, c0591g, vVar.l(bVarC, uiScreen, function2, true)));
            }
            aVar.b((no.j) rendering, o2());
            this.currentScreenRenderer = aVar;
        } else if (rendering instanceof u2.d.LoadingAnimation) {
            or.h<?> hVar2 = this.currentScreenRenderer;
            no.q qVarR2 = hVar2 instanceof no.q ? (no.q) hVar2 : null;
            if (qVarR2 == null) {
                qVarR2 = r2();
            }
            qVarR2.b((u2.d.LoadingAnimation) rendering, o2());
            this.currentScreenRenderer = qVarR2;
        } else if (rendering instanceof u2.d.ReviewCaptures) {
            or.h<?> hVar3 = this.currentScreenRenderer;
            no.v vVarV2 = hVar3 instanceof no.v ? (no.v) hVar3 : null;
            if (vVarV2 == null) {
                vVarV2 = v2();
            }
            vVarV2.b((u2.d.ReviewCaptures) rendering, o2());
            this.currentScreenRenderer = vVarV2;
        } else {
            if (!(rendering instanceof u2.d.b)) {
                throw new zt.l();
            }
            or.h<?> hVar4 = this.currentScreenRenderer;
            b bVarS2 = hVar4 instanceof b ? (b) hVar4 : null;
            if (bVarS2 == null) {
                bVarS2 = s2((u2.d.b) rendering);
            }
            bVarS2.b((u2.d.b) rendering, o2());
            this.currentScreenRenderer = bVarS2;
        }
        UiStepBottomSheet bottomSheet = rendering.getBottomSheet();
        if (bottomSheet != null) {
            FrameLayout bottomSheet2 = ((oo.e) b2()).b;
            Intrinsics.checkNotNullExpressionValue(bottomSheet2, "bottomSheet");
            bottomSheet.k(bottomSheet2);
            this.currentBottomSheet = bottomSheet;
            return;
        }
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null) {
            uiStepBottomSheet.j();
        }
        this.currentBottomSheet = null;
    }
}
