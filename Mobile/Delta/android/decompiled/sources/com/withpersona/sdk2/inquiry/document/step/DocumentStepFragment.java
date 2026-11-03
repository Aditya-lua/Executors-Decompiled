package com.withpersona.sdk2.inquiry.document.step;

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
import androidx.p000lifecycle.a1;
import androidx.p000lifecycle.b1;
import androidx.p000lifecycle.c1;
import androidx.p000lifecycle.s;
import androidx.p000lifecycle.t;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import e4.l0;
import gt.o;
import iu.p0;
import java.util.Map;
import k4.CreationExtras;
import kotlin.Metadata;
import kotlin.Unit;
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
import xt.n;
import yq.ComponentView;
import yq.UiStepBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002MNB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006O"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", "Lmq/c;", "Lyn/e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "props", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "handler", "w2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "rendering", "x2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;)V", "Lcom/withpersona/sdk2/inquiry/document/d;", "r2", "()Lcom/withpersona/sdk2/inquiry/document/d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "initialRendering", "Lao/b;", "s2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;)Lao/b;", "Lcom/withpersona/sdk2/inquiry/document/e;", "v2", "()Lcom/withpersona/sdk2/inquiry/document/e;", "Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$DocumentStepFragmentArgs;", "j0", "Liq/c;", "n2", "()Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$DocumentStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "k0", "Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "q2", "()Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/document/step/d$a;)V", "viewModelFactory", "Ltq/a;", "l0", "Ltq/a;", "o2", "()Ltq/a;", "setSystemUiController", "(Ltq/a;)V", "systemUiController", "Lcom/withpersona/sdk2/inquiry/document/step/d;", "m0", "Lgt/h;", "p2", "()Lcom/withpersona/sdk2/inquiry/document/step/d;", "viewModel", "n0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "o0", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "pendingRendering", "Lyq/f;", "p0", "Lyq/f;", "currentScreenRenderer", "Lyq/p;", "q0", "Lyq/p;", "currentBottomSheet", "r0", "b", "DocumentStepFragmentArgs", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentStepFragment extends mq.c<yn.e, DocumentWorkflow.c> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final iq.c args;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    public com.withpersona.sdk2.inquiry.document.step.d.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    public tq.a systemUiController;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gt.h viewModel;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super DocumentWorkflow.b, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DocumentWorkflow.c pendingRendering;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public yq.f<?> currentScreenRenderer;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UiStepBottomSheet currentBottomSheet;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$DocumentStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DocumentStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepFragmentArgs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DocumentWorkflow.Input props;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DocumentStepFragmentArgs> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DocumentStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepFragmentArgs(DocumentWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DocumentStepFragmentArgs[] newArray(int i10) {
                return new DocumentStepFragmentArgs[i10];
            }
        }

        public DocumentStepFragmentArgs(@NotNull DocumentWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            this.props = props;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DocumentWorkflow.Input getProps() {
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
    public static final /* synthetic */ class a extends kotlin.jvm.internal.k implements n<LayoutInflater, ViewGroup, Boolean, yn.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10460a = new a();

        public a() {
            super(3, yn.e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2FragmentDocumentStepBinding;", 0);
        }

        public final yn.e d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return yn.e.c(p8, viewGroup, z10);
        }

        @Override // xt.n
        public /* bridge */ /* synthetic */ yn.e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", "a", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DocumentStepFragment a(@NotNull DocumentWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (DocumentStepFragment) iq.b.a(new DocumentStepFragment(), new DocumentStepFragmentArgs(props));
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$c", "Lyq/f;", "rendering", "Ltq/a;", "systemUiController", "", "a", "(Ljava/lang/Object;Ltq/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements yq.f<DocumentWorkflow.c.b> {
        public final /* synthetic */ UiComponentScreen b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lq.b f10461c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f10462d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ yq.g f10463e;

        public c(UiComponentScreen uiComponentScreen, lq.b bVar, n nVar, yq.g gVar) {
            this.b = uiComponentScreen;
            this.f10461c = bVar;
            this.f10462d = nVar;
            this.f10463e = gVar;
        }

        @Override // yq.f
        public void a(DocumentWorkflow.c.b rendering, tq.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numI = this.b.i();
            if (numI != null) {
                lq.b bVar = this.f10461c;
                int iIntValue = numI.intValue();
                bVar.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f10461c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = uiComponentScreen.a(context2);
            if (drawableA != null) {
                lq.b bVar2 = this.f10461c;
                bVar2.getRoot().setBackground(drawableA);
                bVar2.f23927d.setBackgroundColor(0);
            }
            this.f10462d.invoke(this.f10461c, rendering, this.f10463e.getViewBindings().a());
        }
    }

    @nt.f(c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$onViewCreated$1", f = "DocumentStepFragment.kt", l = {74}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f10464t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f10465u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ DocumentStepFragment f10466v;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements lu.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ DocumentStepFragment f10467a;
            public final /* synthetic */ b b;

            public a(DocumentStepFragment documentStepFragment, b bVar) {
                this.f10467a = documentStepFragment;
                this.b = bVar;
            }

            @Override // lu.i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(DocumentWorkflow.b bVar, lt.b<? super Unit> bVar2) {
                if (bVar == null) {
                    return Unit.f22938a;
                }
                if (this.f10467a.currentOutputHandler != null) {
                    this.b.a().setValue(null);
                    Function1 function1 = this.f10467a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(bVar);
                    }
                }
                return Unit.f22938a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b bVar, DocumentStepFragment documentStepFragment, lt.b<? super d> bVar2) {
            super(2, bVar2);
            this.f10465u = bVar;
            this.f10466v = documentStepFragment;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new d(this.f10465u, this.f10466v, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f10464t;
            if (i10 == 0) {
                o.b(obj);
                c0<DocumentWorkflow.b> c0VarA = this.f10465u.a();
                a aVar = new a(this.f10466v, this.f10465u);
                this.f10464t = 1;
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

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$e", "Lyq/f;", "rendering", "Ltq/a;", "systemUiController", "", "a", "(Ljava/lang/Object;Ltq/a;)V", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements yq.f<com.withpersona.sdk2.inquiry.document.b> {
        public final /* synthetic */ UiComponentScreen b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lq.b f10468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n f10469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ yq.g f10470e;

        public e(UiComponentScreen uiComponentScreen, lq.b bVar, n nVar, yq.g gVar) {
            this.b = uiComponentScreen;
            this.f10468c = bVar;
            this.f10469d = nVar;
            this.f10470e = gVar;
        }

        @Override // yq.f
        public void a(com.withpersona.sdk2.inquiry.document.b rendering, tq.a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numI = this.b.i();
            if (numI != null) {
                lq.b bVar = this.f10468c;
                int iIntValue = numI.intValue();
                bVar.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = bVar.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.b;
            Context context2 = this.f10468c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableA = uiComponentScreen.a(context2);
            if (drawableA != null) {
                lq.b bVar2 = this.f10468c;
                bVar2.getRoot().setBackground(drawableA);
                bVar2.f23927d.setBackgroundColor(0);
            }
            this.f10469d.invoke(this.f10468c, rendering, this.f10470e.getViewBindings().a());
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class f extends kotlin.jvm.internal.k implements n<lq.b, com.withpersona.sdk2.inquiry.document.b, Map<String, ? extends ComponentView>, Unit> {
        public f(Object obj) {
            super(3, obj, com.withpersona.sdk2.inquiry.document.b.class, "showRendering", "showRendering$document_release(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Ljava/util/Map;)V", 0);
        }

        public final void d(lq.b p8, com.withpersona.sdk2.inquiry.document.b p10, Map<String, ComponentView> p11) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((com.withpersona.sdk2.inquiry.document.b) this.receiver).h(p8, p10, p11);
        }

        @Override // xt.n
        public /* bridge */ /* synthetic */ Unit invoke(lq.b bVar, com.withpersona.sdk2.inquiry.document.b bVar2, Map<String, ? extends ComponentView> map) {
            d(bVar, bVar2, map);
            return Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class g implements Function0<Bundle> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f10471a;

        public g(androidx.fragment.app.c cVar) {
            this.f10471a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleT = this.f10471a.t();
            if (bundleT != null) {
                return bundleT;
            }
            throw new IllegalStateException("Fragment " + this.f10471a + " has null arguments");
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class h implements Function0<a1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f10472a;
        public final /* synthetic */ Function1 b;

        public h(androidx.fragment.app.c cVar, Function1 function1) {
            this.f10472a = cVar;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a1.c invoke() {
            return new mq.d(this.f10472a, this.b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, k = 3, mv = {2, 2, 0})
    public static final class i extends kotlin.jvm.internal.m implements Function0<androidx.fragment.app.c> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.c f10473i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(androidx.fragment.app.c cVar) {
            super(0);
            this.f10473i = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.fragment.app.c invoke() {
            return this.f10473i;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, k = 3, mv = {2, 2, 0})
    public static final class j extends kotlin.jvm.internal.m implements Function0<c1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f10474i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Function0 function0) {
            super(0);
            this.f10474i = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 invoke() {
            return (c1) this.f10474i.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, k = 3, mv = {2, 2, 0})
    public static final class k extends kotlin.jvm.internal.m implements Function0<b1> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ gt.h f10475i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(gt.h hVar) {
            super(0);
            this.f10475i = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b1 invoke() {
            return l0.c(this.f10475i).v();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, k = 3, mv = {2, 2, 0})
    public static final class l extends kotlin.jvm.internal.m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f10476i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ gt.h f10477j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, gt.h hVar) {
            super(0);
            this.f10476i = function0;
            this.f10477j = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f10476i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            c1 c1VarC = l0.c(this.f10477j);
            androidx.p000lifecycle.j jVar = c1VarC instanceof androidx.p000lifecycle.j ? (androidx.p000lifecycle.j) c1VarC : null;
            return jVar != null ? jVar.Y() : CreationExtras.b.f22393c;
        }
    }

    public DocumentStepFragment() {
        super(a.f10460a);
        this.args = new iq.c(d0.b(DocumentStepFragmentArgs.class), new g(this));
        h hVar = new h(this, new Function1() { // from class: ao.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentStepFragment.z2(this.f3392a, (androidx.p000lifecycle.l0) obj);
            }
        });
        gt.h hVarA = gt.i.a(gt.k.NONE, new j(new i(this)));
        this.viewModel = l0.b(this, d0.b(com.withpersona.sdk2.inquiry.document.step.d.class), new k(hVarA), new l(null, hVarA), hVar);
    }

    public static final Unit t2(lq.b pendingBinding, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = pendingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22938a;
    }

    public static final Unit u2(lq.b pendingBinding, DocumentWorkflow.c.b pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ao.i.d(pendingBinding, pendingRendering);
        return Unit.f22938a;
    }

    public static final Unit y2(lq.b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        uq.g.d(root, false, false, false, false, 15, null);
        return Unit.f22938a;
    }

    public static final com.withpersona.sdk2.inquiry.document.step.d z2(DocumentStepFragment documentStepFragment, androidx.p000lifecycle.l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return documentStepFragment.q2().a(it, documentStepFragment.n2().getProps());
    }

    @Override // mq.c, androidx.fragment.app.c
    public void e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.e1(view, savedInstanceState);
        b stateManager = p2().getStateManager();
        g2(stateManager.c());
        s sVarK0 = k0();
        Intrinsics.checkNotNullExpressionValue(sVarK0, "getViewLifecycleOwner(...)");
        iu.k.d(t.a(sVarK0), null, null, new d(stateManager, this, null), 3, null);
        DocumentWorkflow.c cVar = this.pendingRendering;
        if (cVar != null) {
            h2(cVar);
        }
        this.pendingRendering = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final DocumentStepFragmentArgs n2() {
        return (DocumentStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    public final tq.a o2() {
        tq.a aVar = this.systemUiController;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("systemUiController");
        return null;
    }

    public final com.withpersona.sdk2.inquiry.document.step.d p2() {
        return (com.withpersona.sdk2.inquiry.document.step.d) this.viewModel.getValue();
    }

    @NotNull
    public final com.withpersona.sdk2.inquiry.document.step.d.a q2() {
        com.withpersona.sdk2.inquiry.document.step.d.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.u("viewModelFactory");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.document.d r2() {
        yn.a aVarC = yn.a.c(LayoutInflater.from(((yn.e) b2()).f36926c.getContext()), ((yn.e) b2()).f36926c, false);
        Intrinsics.checkNotNullExpressionValue(aVarC, "inflate(...)");
        ((yn.e) b2()).f36926c.removeAllViews();
        ((yn.e) b2()).f36926c.addView(aVarC.getRoot());
        return new com.withpersona.sdk2.inquiry.document.d(aVarC);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ao.b s2(DocumentWorkflow.c.b initialRendering) {
        yq.s sVar = yq.s.f37116a;
        FrameLayout content = ((yn.e) b2()).f36926c;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        UiComponentScreen uiScreen = initialRendering.getUiScreen();
        Function2<? super lq.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: ao.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DocumentStepFragment.t2((lq.b) obj, (Map) obj2);
            }
        };
        n nVar = new n() { // from class: ao.f
            @Override // xt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DocumentStepFragment.u2((lq.b) obj, (DocumentWorkflow.c.b) obj2, (Map) obj3);
            }
        };
        lq.b bVarC = lq.b.c(LayoutInflater.from(content.getContext()), content, false);
        Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(...)");
        content.removeAllViews();
        content.addView(bVarC.getRoot());
        return new ao.b(new c(uiScreen, bVarC, nVar, sVar.l(bVarC, uiScreen, function2, true)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.withpersona.sdk2.inquiry.document.e v2() {
        yn.c cVarC = yn.c.c(LayoutInflater.from(((yn.e) b2()).f36926c.getContext()), ((yn.e) b2()).f36926c, false);
        Intrinsics.checkNotNullExpressionValue(cVarC, "inflate(...)");
        ((yn.e) b2()).f36926c.removeAllViews();
        ((yn.e) b2()).f36926c.addView(cVarC.getRoot());
        return new com.withpersona.sdk2.inquiry.document.e(cVarC);
    }

    public final void w2(@NotNull DocumentWorkflow.Input props, @NotNull Function1<? super DocumentWorkflow.b, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(handler, "handler");
        p2().f(props);
        this.currentOutputHandler = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mq.c
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void h2(@NotNull DocumentWorkflow.c rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (rendering instanceof com.withpersona.sdk2.inquiry.document.b) {
            yq.f<?> fVar = this.currentScreenRenderer;
            ao.a aVar = fVar instanceof ao.a ? (ao.a) fVar : null;
            if (aVar == null) {
                yq.s sVar = yq.s.f37116a;
                FrameLayout content = ((yn.e) b2()).f36926c;
                Intrinsics.checkNotNullExpressionValue(content, "content");
                UiComponentScreen uiScreen = ((com.withpersona.sdk2.inquiry.document.b) rendering).getUiScreen();
                Function2<? super lq.b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: ao.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DocumentStepFragment.y2((lq.b) obj, (Map) obj2);
                    }
                };
                f fVar2 = new f(rendering);
                lq.b bVarC = lq.b.c(LayoutInflater.from(content.getContext()), content, false);
                Intrinsics.checkNotNullExpressionValue(bVarC, "inflate(...)");
                content.removeAllViews();
                content.addView(bVarC.getRoot());
                aVar = new ao.a(new e(uiScreen, bVarC, fVar2, sVar.l(bVarC, uiScreen, function2, true)));
            }
            aVar.a((com.withpersona.sdk2.inquiry.document.b) rendering, o2());
            this.currentScreenRenderer = aVar;
        } else if (rendering instanceof DocumentWorkflow.c.LoadingAnimation) {
            yq.f<?> fVar3 = this.currentScreenRenderer;
            com.withpersona.sdk2.inquiry.document.d dVarR2 = fVar3 instanceof com.withpersona.sdk2.inquiry.document.d ? (com.withpersona.sdk2.inquiry.document.d) fVar3 : null;
            if (dVarR2 == null) {
                dVarR2 = r2();
            }
            dVarR2.a((DocumentWorkflow.c.LoadingAnimation) rendering, o2());
            this.currentScreenRenderer = dVarR2;
        } else if (rendering instanceof DocumentWorkflow.c.ReviewCaptures) {
            yq.f<?> fVar4 = this.currentScreenRenderer;
            com.withpersona.sdk2.inquiry.document.e eVarV2 = fVar4 instanceof com.withpersona.sdk2.inquiry.document.e ? (com.withpersona.sdk2.inquiry.document.e) fVar4 : null;
            if (eVarV2 == null) {
                eVarV2 = v2();
            }
            eVarV2.a((DocumentWorkflow.c.ReviewCaptures) rendering, o2());
            this.currentScreenRenderer = eVarV2;
        } else {
            if (!(rendering instanceof DocumentWorkflow.c.b)) {
                throw new gt.l();
            }
            yq.f<?> fVar5 = this.currentScreenRenderer;
            ao.b bVarS2 = fVar5 instanceof ao.b ? (ao.b) fVar5 : null;
            if (bVarS2 == null) {
                bVarS2 = s2((DocumentWorkflow.c.b) rendering);
            }
            bVarS2.a((DocumentWorkflow.c.b) rendering, o2());
            this.currentScreenRenderer = bVarS2;
        }
        UiStepBottomSheet bottomSheet = rendering.getBottomSheet();
        if (bottomSheet != null) {
            FrameLayout bottomSheet2 = ((yn.e) b2()).b;
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
