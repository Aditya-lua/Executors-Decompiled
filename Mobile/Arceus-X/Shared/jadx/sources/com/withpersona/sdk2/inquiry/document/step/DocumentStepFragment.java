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
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.p616lifecycle.C0941a1;
import androidx.p616lifecycle.C0944b1;
import androidx.p616lifecycle.C0967l0;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0947c1;
import androidx.p616lifecycle.InterfaceC0962j;
import androidx.p616lifecycle.InterfaceC0980s;
import ao.C1127a;
import ao.C1129c;
import ao.C1131e;
import ar.C1152g;
import ar.C1164s;
import ar.ComponentView;
import ar.InterfaceC1151f;
import ar.UiStepBottomSheet;
import co.C1685a;
import co.C1688b;
import co.C1704i;
import com.withpersona.sdk2.inquiry.document.C3439b;
import com.withpersona.sdk2.inquiry.document.C3441d;
import com.withpersona.sdk2.inquiry.document.C3442e;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.steps.p056ui.UiComponentScreen;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p093e4.C4822l0;
import p229jt.C7334d;
import p229jt.C7342i;
import p229jt.C7345l;
import p229jt.C7348o;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p237k4.CreationExtras;
import p253kq.C7811b;
import p253kq.C7812c;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p313nq.C9546b;
import p315nt.InterfaceC9557b;
import p341oq.AbstractC9844c;
import p341oq.C9845d;
import p344ot.C10047c;
import p498vq.C12247a;
import p526wq.C12524g;
import p615zt.InterfaceC14057n;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 L2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002MNB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006O"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", "Loq/c;", "Lao/e;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "e1", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "props", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;", "handler", "w2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lkotlin/jvm/functions/Function1;)V", "rendering", "x2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;)V", "Lcom/withpersona/sdk2/inquiry/document/d;", "r2", "()Lcom/withpersona/sdk2/inquiry/document/d;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;", "initialRendering", "Lco/b;", "s2", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;)Lco/b;", "Lcom/withpersona/sdk2/inquiry/document/e;", "v2", "()Lcom/withpersona/sdk2/inquiry/document/e;", "Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$DocumentStepFragmentArgs;", "j0", "Lkq/c;", "n2", "()Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$DocumentStepFragmentArgs;", "args", "Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "k0", "Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "q2", "()Lcom/withpersona/sdk2/inquiry/document/step/d$a;", "setViewModelFactory", "(Lcom/withpersona/sdk2/inquiry/document/step/d$a;)V", "viewModelFactory", "Lvq/a;", "l0", "Lvq/a;", "o2", "()Lvq/a;", "setSystemUiController", "(Lvq/a;)V", "systemUiController", "Lcom/withpersona/sdk2/inquiry/document/step/d;", "m0", "Ljt/h;", "p2", "()Lcom/withpersona/sdk2/inquiry/document/step/d;", "viewModel", "n0", "Lkotlin/jvm/functions/Function1;", "currentOutputHandler", "o0", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;", "pendingRendering", "Lar/f;", "p0", "Lar/f;", "currentScreenRenderer", "Lar/p;", "q0", "Lar/p;", "currentBottomSheet", "r0", "b", "DocumentStepFragmentArgs", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class DocumentStepFragment extends AbstractC9844c<C1131e, DocumentWorkflow.InterfaceC3432c> {

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @NotNull
    public final C7812c args;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    public C3475d.a viewModelFactory;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    public C12247a systemUiController;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h viewModel;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    @Nullable
    public Function1<? super DocumentWorkflow.AbstractC3431b, Unit> currentOutputHandler;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    @Nullable
    public DocumentWorkflow.InterfaceC3432c pendingRendering;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    @Nullable
    public InterfaceC1151f<?> currentScreenRenderer;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    @Nullable
    public UiStepBottomSheet currentBottomSheet;

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$DocumentStepFragmentArgs;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "props", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class DocumentStepFragmentArgs implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepFragmentArgs> CREATOR = new C3459a();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final DocumentWorkflow.Input props;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$DocumentStepFragmentArgs$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C3459a implements Parcelable.Creator<DocumentStepFragmentArgs> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DocumentStepFragmentArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepFragmentArgs(DocumentWorkflow.Input.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
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

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3460a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C1131e> {

        /* JADX INFO: renamed from: a */
        public static final C3460a f13448a = new C3460a();

        public C3460a() {
            super(3, C1131e.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/document/databinding/Pi2FragmentDocumentStepBinding;", 0);
        }

        /* JADX INFO: renamed from: d */
        public final C1131e m16788d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            return C1131e.m6443c(p8, viewGroup, z10);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ C1131e invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return m16788d(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$b;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;", "props", "Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", "a", "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/step/DocumentStepFragment;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final DocumentStepFragment m16789a(@NotNull DocumentWorkflow.Input props) {
            Intrinsics.checkNotNullParameter(props, "props");
            return (DocumentStepFragment) C7811b.m32425a(new DocumentStepFragment(), new DocumentStepFragmentArgs(props));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$c */
    @Metadata(m31664d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"com/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$c", "Lar/f;", "rendering", "Lvq/a;", "systemUiController", "", "b", "(Ljava/lang/Object;Lvq/a;)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3462c implements InterfaceC1151f<DocumentWorkflow.InterfaceC3432c.b> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UiComponentScreen f13449b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C9546b f13450c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC14057n f13451d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1152g f13452e;

        public C3462c(UiComponentScreen uiComponentScreen, C9546b c9546b, InterfaceC14057n interfaceC14057n, C1152g c1152g) {
            this.f13449b = uiComponentScreen;
            this.f13450c = c9546b;
            this.f13451d = interfaceC14057n;
            this.f13452e = c1152g;
        }

        @Override // ar.InterfaceC1151f
        /* JADX INFO: renamed from: b */
        public void mo6493b(DocumentWorkflow.InterfaceC3432c.b rendering, C12247a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numM20526i = this.f13449b.m20526i();
            if (numM20526i != null) {
                C9546b c9546b = this.f13450c;
                int iIntValue = numM20526i.intValue();
                c9546b.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = c9546b.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.m45389a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.f13449b;
            Context context2 = this.f13450c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableM20524a = uiComponentScreen.m20524a(context2);
            if (drawableM20524a != null) {
                C9546b c9546b2 = this.f13450c;
                c9546b2.getRoot().setBackground(drawableM20524a);
                c9546b2.f34504d.setBackgroundColor(0);
            }
            this.f13451d.invoke(this.f13450c, rendering, this.f13452e.getViewBindings().m6497a());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$onViewCreated$1", m39664f = "DocumentStepFragment.kt", m39665l = {74}, m39666m = "invokeSuspend")
    public static final class C3463d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f13453t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ C3473b f13454u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ DocumentStepFragment f13455v;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$d$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ DocumentStepFragment f13456a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3473b f13457b;

            public a(DocumentStepFragment documentStepFragment, C3473b c3473b) {
                this.f13456a = documentStepFragment;
                this.f13457b = c3473b;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object; */
            @Override // nu.InterfaceC9577i
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(DocumentWorkflow.AbstractC3431b abstractC3431b, InterfaceC9557b<? super Unit> interfaceC9557b) {
                if (abstractC3431b == null) {
                    return Unit.f29331a;
                }
                if (this.f13456a.currentOutputHandler != null) {
                    this.f13457b.m45394a().setValue(null);
                    Function1 function1 = this.f13456a.currentOutputHandler;
                    if (function1 != null) {
                        function1.invoke(abstractC3431b);
                    }
                }
                return Unit.f29331a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3463d(C3473b c3473b, DocumentStepFragment documentStepFragment, InterfaceC9557b<? super C3463d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f13454u = c3473b;
            this.f13455v = documentStepFragment;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3463d(this.f13454u, this.f13455v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f13453t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC9566c0<DocumentWorkflow.AbstractC3431b> interfaceC9566c0M45394a = this.f13454u.m45394a();
                a aVar = new a(this.f13455v, this.f13454u);
                this.f13453t = 1;
                if (interfaceC9566c0M45394a.collect(aVar, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            throw new C7334d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3463d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$e */
    @Metadata(m31664d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"com/withpersona/sdk2/inquiry/document/step/DocumentStepFragment$e", "Lar/f;", "rendering", "Lvq/a;", "systemUiController", "", "b", "(Ljava/lang/Object;Lvq/a;)V", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3464e implements InterfaceC1151f<C3439b> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UiComponentScreen f13458b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C9546b f13459c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC14057n f13460d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C1152g f13461e;

        public C3464e(UiComponentScreen uiComponentScreen, C9546b c9546b, InterfaceC14057n interfaceC14057n, C1152g c1152g) {
            this.f13458b = uiComponentScreen;
            this.f13459c = c9546b;
            this.f13460d = interfaceC14057n;
            this.f13461e = c1152g;
        }

        @Override // ar.InterfaceC1151f
        /* JADX INFO: renamed from: b */
        public void mo6493b(C3439b rendering, C12247a systemUiController) {
            Intrinsics.checkNotNullParameter(rendering, "rendering");
            Integer numM20526i = this.f13458b.m20526i();
            if (numM20526i != null) {
                C9546b c9546b = this.f13459c;
                int iIntValue = numM20526i.intValue();
                c9546b.getRoot().setBackgroundColor(iIntValue);
                if (systemUiController != null) {
                    Context context = c9546b.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    systemUiController.m45389a(context, iIntValue);
                }
            }
            UiComponentScreen uiComponentScreen = this.f13458b;
            Context context2 = this.f13459c.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Drawable drawableM20524a = uiComponentScreen.m20524a(context2);
            if (drawableM20524a != null) {
                C9546b c9546b2 = this.f13459c;
                c9546b2.getRoot().setBackground(drawableM20524a);
                c9546b2.f34504d.setBackgroundColor(0);
            }
            this.f13460d.invoke(this.f13459c, rendering, this.f13461e.getViewBindings().m6497a());
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$f */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3465f extends C7744k implements InterfaceC14057n<C9546b, C3439b, Map<String, ? extends ComponentView>, Unit> {
        public C3465f(Object obj) {
            super(3, obj, C3439b.class, "showRendering", "showRendering$document_release(Lcom/withpersona/sdk2/inquiry/shared/databinding/Pi2GenericUiStepScreenBinding;Lcom/withpersona/sdk2/inquiry/document/DocumentInstructionsView;Ljava/util/Map;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m16791d(C9546b p8, C3439b p10, Map<String, ComponentView> p11) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            Intrinsics.checkNotNullParameter(p11, "p2");
            ((C3439b) this.receiver).m16575h(p8, p10, p11);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ Unit invoke(C9546b c9546b, C3439b c3439b, Map<String, ? extends ComponentView> map) {
            m16791d(c9546b, c3439b, map);
            return Unit.f29331a;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$g */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3466g implements Function0<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f13462a;

        public C3466g(ComponentCallbacksC0929c componentCallbacksC0929c) {
            this.f13462a = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundleM4704t = this.f13462a.m4704t();
            if (bundleM4704t != null) {
                return bundleM4704t;
            }
            throw new IllegalStateException("Fragment " + this.f13462a + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$h */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3467h implements Function0<C0941a1.c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ComponentCallbacksC0929c f13463a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f13464b;

        public C3467h(ComponentCallbacksC0929c componentCallbacksC0929c, Function1 function1) {
            this.f13463a = componentCallbacksC0929c;
            this.f13464b = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0941a1.c invoke() {
            return new C9845d(this.f13463a, this.f13464b);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$i */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/fragment/app/c;", "b", "()Landroidx/fragment/app/c;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3468i extends AbstractC7746m implements Function0<ComponentCallbacksC0929c> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ComponentCallbacksC0929c f13465i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3468i(ComponentCallbacksC0929c componentCallbacksC0929c) {
            super(0);
            this.f13465i = componentCallbacksC0929c;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ComponentCallbacksC0929c invoke() {
            return this.f13465i;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$j */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/c1;", "b", "()Landroidx/lifecycle/c1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3469j extends AbstractC7746m implements Function0<InterfaceC0947c1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f13466i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3469j(Function0 function0) {
            super(0);
            this.f13466i = function0;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0947c1 invoke() {
            return (InterfaceC0947c1) this.f13466i.invoke();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$k */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Landroidx/lifecycle/b1;", "b", "()Landroidx/lifecycle/b1;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3470k extends AbstractC7746m implements Function0<C0944b1> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC7341h f13467i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3470k(InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f13467i = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C0944b1 invoke() {
            return C4822l0.m23349c(this.f13467i).mo4712w();
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment$l */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Landroidx/lifecycle/x0;", "VM", "Lk4/a;", "b", "()Lk4/a;"}, m31666k = 3, m31667mv = {2, 2, 0})
    public static final class C3471l extends AbstractC7746m implements Function0<CreationExtras> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Function0 f13468i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC7341h f13469j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3471l(Function0 function0, InterfaceC7341h interfaceC7341h) {
            super(0);
            this.f13468i = function0;
            this.f13469j = interfaceC7341h;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f13468i;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            InterfaceC0947c1 interfaceC0947c1M23349c = C4822l0.m23349c(this.f13469j);
            InterfaceC0962j interfaceC0962j = interfaceC0947c1M23349c instanceof InterfaceC0962j ? (InterfaceC0962j) interfaceC0947c1M23349c : null;
            return interfaceC0962j != null ? interfaceC0962j.mo4653Z() : CreationExtras.b.f28722c;
        }
    }

    public DocumentStepFragment() {
        super(C3460a.f13448a);
        this.args = new C7812c(C7731d0.m32002b(DocumentStepFragmentArgs.class), new C3466g(this));
        C3467h c3467h = new C3467h(this, new Function1() { // from class: co.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentStepFragment.m16774z2(this.f6480a, (C0967l0) obj);
            }
        });
        InterfaceC7341h interfaceC7341hM30455a = C7342i.m30455a(EnumC7344k.NONE, new C3469j(new C3468i(this)));
        this.viewModel = C4822l0.m23348b(this, C7731d0.m32002b(C3475d.class), new C3470k(interfaceC7341hM30455a), new C3471l(null, interfaceC7341hM30455a), c3467h);
    }

    /* JADX INFO: renamed from: t2 */
    public static final Unit m16771t2(C9546b pendingBinding, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = pendingBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C12524g.m46873d(root, false, false, false, false, 15, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: u2 */
    public static final Unit m16772u2(C9546b pendingBinding, DocumentWorkflow.InterfaceC3432c.b pendingRendering, Map map) {
        Intrinsics.checkNotNullParameter(pendingBinding, "pendingBinding");
        Intrinsics.checkNotNullParameter(pendingRendering, "pendingRendering");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        C1704i.m8410d(pendingBinding, pendingRendering);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: y2 */
    public static final Unit m16773y2(C9546b binding, Map map) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(map, "<unused var>");
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C12524g.m46873d(root, false, false, false, false, 15, null);
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: z2 */
    public static final C3475d m16774z2(DocumentStepFragment documentStepFragment, C0967l0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return documentStepFragment.m16779q2().mo16905a(it, documentStepFragment.m16776n2().getProps());
    }

    @Override // p341oq.AbstractC9844c, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: e1 */
    public void mo4667e1(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.mo4667e1(view, savedInstanceState);
        C3473b stateManager = m16778p2().getStateManager();
        m38732g2(stateManager.m45396c());
        InterfaceC0980s interfaceC0980sM4680k0 = m4680k0();
        Intrinsics.checkNotNullExpressionValue(interfaceC0980sM4680k0, "getViewLifecycleOwner(...)");
        C7882k.m32780d(C0982t.m4979a(interfaceC0980sM4680k0), null, null, new C3463d(stateManager, this, null), 3, null);
        DocumentWorkflow.InterfaceC3432c interfaceC3432c = this.pendingRendering;
        if (interfaceC3432c != null) {
            mo16775h2(interfaceC3432c);
        }
        this.pendingRendering = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Args */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    public final DocumentStepFragmentArgs m16776n2() {
        return (DocumentStepFragmentArgs) this.args.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: o2 */
    public final C12247a m16777o2() {
        C12247a c12247a = this.systemUiController;
        if (c12247a != null) {
            return c12247a;
        }
        Intrinsics.m31998u("systemUiController");
        return null;
    }

    /* JADX INFO: renamed from: p2 */
    public final C3475d m16778p2() {
        return (C3475d) this.viewModel.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: q2 */
    public final C3475d.a m16779q2() {
        C3475d.a aVar = this.viewModelFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.m31998u("viewModelFactory");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r2 */
    public final C3441d m16780r2() {
        C1127a c1127aM6433c = C1127a.m6433c(LayoutInflater.from(((C1131e) m32421b2()).f4658c.getContext()), ((C1131e) m32421b2()).f4658c, false);
        Intrinsics.checkNotNullExpressionValue(c1127aM6433c, "inflate(...)");
        ((C1131e) m32421b2()).f4658c.removeAllViews();
        ((C1131e) m32421b2()).f4658c.addView(c1127aM6433c.getRoot());
        return new C3441d(c1127aM6433c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s2 */
    public final C1688b m16781s2(DocumentWorkflow.InterfaceC3432c.b initialRendering) {
        C1164s c1164s = C1164s.f4917a;
        FrameLayout content = ((C1131e) m32421b2()).f4658c;
        Intrinsics.checkNotNullExpressionValue(content, "content");
        UiComponentScreen uiScreen = initialRendering.getUiScreen();
        Function2<? super C9546b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: co.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DocumentStepFragment.m16771t2((C9546b) obj, (Map) obj2);
            }
        };
        InterfaceC14057n interfaceC14057n = new InterfaceC14057n() { // from class: co.f
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DocumentStepFragment.m16772u2((C9546b) obj, (DocumentWorkflow.InterfaceC3432c.b) obj2, (Map) obj3);
            }
        };
        C9546b c9546bM37676c = C9546b.m37676c(LayoutInflater.from(content.getContext()), content, false);
        Intrinsics.checkNotNullExpressionValue(c9546bM37676c, "inflate(...)");
        content.removeAllViews();
        content.addView(c9546bM37676c.getRoot());
        return new C1688b(new C3462c(uiScreen, c9546bM37676c, interfaceC14057n, c1164s.m6530l(c9546bM37676c, uiScreen, function2, true)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v2 */
    public final C3442e m16782v2() {
        C1129c c1129cM6438c = C1129c.m6438c(LayoutInflater.from(((C1131e) m32421b2()).f4658c.getContext()), ((C1131e) m32421b2()).f4658c, false);
        Intrinsics.checkNotNullExpressionValue(c1129cM6438c, "inflate(...)");
        ((C1131e) m32421b2()).f4658c.removeAllViews();
        ((C1131e) m32421b2()).f4658c.addView(c1129cM6438c.getRoot());
        return new C3442e(c1129cM6438c);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m16783w2(@NotNull DocumentWorkflow.Input props, @NotNull Function1<? super DocumentWorkflow.AbstractC3431b, Unit> handler) {
        Intrinsics.checkNotNullParameter(props, "props");
        Intrinsics.checkNotNullParameter(handler, "handler");
        m16778p2().m16904f(props);
        this.currentOutputHandler = handler;
    }

    /* JADX DEBUG: Method merged with bridge method: h2(Ljava/lang/Object;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p341oq.AbstractC9844c
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public void mo16775h2(@NotNull DocumentWorkflow.InterfaceC3432c rendering) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        if (rendering instanceof C3439b) {
            InterfaceC1151f<?> interfaceC1151f = this.currentScreenRenderer;
            C1685a c1685a = interfaceC1151f instanceof C1685a ? (C1685a) interfaceC1151f : null;
            if (c1685a == null) {
                C1164s c1164s = C1164s.f4917a;
                FrameLayout content = ((C1131e) m32421b2()).f4658c;
                Intrinsics.checkNotNullExpressionValue(content, "content");
                UiComponentScreen uiScreen = ((C3439b) rendering).getUiScreen();
                Function2<? super C9546b, ? super Map<String, ComponentView>, Unit> function2 = new Function2() { // from class: co.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DocumentStepFragment.m16773y2((C9546b) obj, (Map) obj2);
                    }
                };
                C3465f c3465f = new C3465f(rendering);
                C9546b c9546bM37676c = C9546b.m37676c(LayoutInflater.from(content.getContext()), content, false);
                Intrinsics.checkNotNullExpressionValue(c9546bM37676c, "inflate(...)");
                content.removeAllViews();
                content.addView(c9546bM37676c.getRoot());
                c1685a = new C1685a(new C3464e(uiScreen, c9546bM37676c, c3465f, c1164s.m6530l(c9546bM37676c, uiScreen, function2, true)));
            }
            c1685a.mo6493b((C3439b) rendering, m16777o2());
            this.currentScreenRenderer = c1685a;
        } else if (rendering instanceof DocumentWorkflow.InterfaceC3432c.LoadingAnimation) {
            InterfaceC1151f<?> interfaceC1151f2 = this.currentScreenRenderer;
            C3441d c3441dM16780r2 = interfaceC1151f2 instanceof C3441d ? (C3441d) interfaceC1151f2 : null;
            if (c3441dM16780r2 == null) {
                c3441dM16780r2 = m16780r2();
            }
            c3441dM16780r2.mo6493b((DocumentWorkflow.InterfaceC3432c.LoadingAnimation) rendering, m16777o2());
            this.currentScreenRenderer = c3441dM16780r2;
        } else if (rendering instanceof DocumentWorkflow.InterfaceC3432c.ReviewCaptures) {
            InterfaceC1151f<?> interfaceC1151f3 = this.currentScreenRenderer;
            C3442e c3442eM16782v2 = interfaceC1151f3 instanceof C3442e ? (C3442e) interfaceC1151f3 : null;
            if (c3442eM16782v2 == null) {
                c3442eM16782v2 = m16782v2();
            }
            c3442eM16782v2.mo6493b((DocumentWorkflow.InterfaceC3432c.ReviewCaptures) rendering, m16777o2());
            this.currentScreenRenderer = c3442eM16782v2;
        } else {
            if (!(rendering instanceof DocumentWorkflow.InterfaceC3432c.b)) {
                throw new C7345l();
            }
            InterfaceC1151f<?> interfaceC1151f4 = this.currentScreenRenderer;
            C1688b c1688bM16781s2 = interfaceC1151f4 instanceof C1688b ? (C1688b) interfaceC1151f4 : null;
            if (c1688bM16781s2 == null) {
                c1688bM16781s2 = m16781s2((DocumentWorkflow.InterfaceC3432c.b) rendering);
            }
            c1688bM16781s2.mo6493b((DocumentWorkflow.InterfaceC3432c.b) rendering, m16777o2());
            this.currentScreenRenderer = c1688bM16781s2;
        }
        UiStepBottomSheet bottomSheet = rendering.getBottomSheet();
        if (bottomSheet != null) {
            FrameLayout bottomSheet2 = ((C1131e) m32421b2()).f4657b;
            Intrinsics.checkNotNullExpressionValue(bottomSheet2, "bottomSheet");
            bottomSheet.m6513k(bottomSheet2);
            this.currentBottomSheet = bottomSheet;
            return;
        }
        UiStepBottomSheet uiStepBottomSheet = this.currentBottomSheet;
        if (uiStepBottomSheet != null) {
            uiStepBottomSheet.m6512j();
        }
        this.currentBottomSheet = null;
    }
}
