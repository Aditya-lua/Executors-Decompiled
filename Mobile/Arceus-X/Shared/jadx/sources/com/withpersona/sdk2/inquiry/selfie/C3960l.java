package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import aq.C1142f;
import aq.C1143g;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.imageview.ShapeableImageView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.selfie.C3960l;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.p055ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.p055ui.Pi2NavigationBar;
import er.C5199h;
import hu.InterfaceC6567c;
import ir.C6966c;
import java.util.ArrayList;
import java.util.List;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lr.C8244d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016an.C0395x;
import p016an.InterfaceC0364a0;
import p016an.InterfaceC0382k;
import p016an.ViewEnvironment;
import p226jq.C7255e;
import p226jq.C7265j;
import p227jr.C7297e;
import p227jr.C7304h0;
import p229jt.C7345l;
import p239k6.C7458d0;
import p498vq.C12247a;
import p498vq.C12249c;
import p526wq.C12521d;
import p526wq.C12524g;
import p537x6.C12749j;
import p537x6.ImageRequest;
import p584yp.C13376p;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "Laq/f;", "binding", "<init>", "(Laq/f;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lvq/a;", "systemUiController", "", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lvq/a;)V", "rendering", "Lan/y;", "viewEnvironment", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;Lan/y;)V", "h", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;Lvq/a;)V", "b", "Laq/f;", "Lcom/withpersona/sdk2/inquiry/selfie/l$b;", "c", "Lcom/withpersona/sdk2/inquiry/selfie/l$b;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "d", "Landroidx/recyclerview/widget/LinearLayoutManager;", "singleItemLayoutManager", "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "e", "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "multiItemLayoutManager", "a", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C3960l implements InterfaceC0382k<SelfieWorkflow.AbstractC3928c.f> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C1142f binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final b adapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final LinearLayoutManager singleItemLayoutManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final GridAutoFitLayoutManager multiItemLayoutManager;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion implements InterfaceC0364a0<SelfieWorkflow.AbstractC3928c.f> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0364a0<SelfieWorkflow.AbstractC3928c.f> f16640a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14147a extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C1142f> {

            /* JADX INFO: renamed from: a */
            public static final C14147a f16641a = new C14147a();

            public C14147a() {
                super(3, C1142f.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C1142f m20101d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C1142f.m6477c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C1142f invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m20101d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$a$b */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class b extends C7744k implements Function1<C1142f, C3960l> {

            /* JADX INFO: renamed from: a */
            public static final b f16642a = new b();

            public b() {
                super(1, C3960l.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;)V", 0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final C3960l invoke(C1142f p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new C3960l(p8);
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.selfie.l.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View; */
        @Override // p016an.InterfaceC0364a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View mo1379a(@NotNull SelfieWorkflow.AbstractC3928c.f initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f16640a.mo1379a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // p016an.InterfaceC0364a0
        @NotNull
        public InterfaceC6567c<? super SelfieWorkflow.AbstractC3928c.f> getType() {
            return this.f16640a.getType();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
            InterfaceC0382k.Companion companion = InterfaceC0382k.INSTANCE;
            this.f16640a = new C0395x(C7731d0.m32002b(SelfieWorkflow.AbstractC3928c.f.class), C14147a.f16641a, b.f16642a);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$b */
    @Metadata(m31664d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0004R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*¨\u0006-"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "", "position", "g", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "e", "()I", "holder", "", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "strings", "J", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "textStyle", "H", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "data", "I", "(Ljava/util/List;)V", "G", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "Ljava/util/List;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "bodyTextStyle", "Ljq/e;", "Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;", "Ljq/e;", "adapterHelper", "a", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class b extends RecyclerView.AbstractC1025h<RecyclerView.AbstractC1023f0> {

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public SelfieWorkflow.AbstractC3928c.f.Strings strings;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public List<? extends Selfie> data = C7699p.m31892k();

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public TextBasedComponentStyle bodyTextStyle;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final C7255e<SelfieItem> adapterHelper;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$b$a, reason: from toString */
        @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;", "", "", "label", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* data */ class SelfieItem {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
            @Nullable
            public final String label;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final Selfie selfie;

            public SelfieItem(@Nullable String str, @NotNull Selfie selfie) {
                Intrinsics.checkNotNullParameter(selfie, "selfie");
                this.label = str;
                this.selfie = selfie;
            }

            @Nullable
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final Selfie getSelfie() {
                return this.selfie;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SelfieItem)) {
                    return false;
                }
                SelfieItem selfieItem = (SelfieItem) other;
                return Intrinsics.m31980c(this.label, selfieItem.label) && Intrinsics.m31980c(this.selfie, selfieItem.selfie);
            }

            public int hashCode() {
                String str = this.label;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.selfie.hashCode();
            }

            @NotNull
            public String toString() {
                return "SelfieItem(label=" + this.label + ", selfie=" + this.selfie + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$b$b, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class C14148b {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f16649a;

            static {
                int[] iArr = new int[EnumC7638a.values().length];
                try {
                    iArr[EnumC7638a.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC7638a.Left.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC7638a.Right.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC7638a.Up.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumC7638a.Down.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f16649a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$b$c */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class c extends C7744k implements InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, C1143g> {

            /* JADX INFO: renamed from: a */
            public static final c f16650a = new c();

            public c() {
                super(3, C1143g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewItemBinding;", 0);
            }

            /* JADX INFO: renamed from: d */
            public final C1143g m20113d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return C1143g.m6480c(p8, viewGroup, z10);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // p615zt.InterfaceC14057n
            public /* bridge */ /* synthetic */ C1143g invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return m20113d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        public b() {
            C7255e<SelfieItem> c7255e = new C7255e<>(new Function2() { // from class: yp.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(C3960l.b.m20105E((C3960l.b.SelfieItem) obj, (C3960l.b.SelfieItem) obj2));
                }
            }, null, null, 6, null);
            c7255e.m30242j(C7731d0.m32002b(SelfieItem.class), C7731d0.m32002b(C1143g.class), c.f16650a, new InterfaceC14057n() { // from class: yp.i0
                @Override // p615zt.InterfaceC14057n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return C3960l.b.m20106F(this.f46760a, (C3960l.b.SelfieItem) obj, (C1143g) obj2, (RecyclerView.AbstractC1023f0) obj3);
                }
            }, null);
            this.adapterHelper = c7255e;
        }

        /* JADX INFO: renamed from: E */
        public static final boolean m20105E(SelfieItem old, SelfieItem selfieItem) {
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(selfieItem, "new");
            return Intrinsics.m31980c(old.getSelfie().getAbsoluteFilePath(), selfieItem.getSelfie().getAbsoluteFilePath());
        }

        /* JADX INFO: renamed from: F */
        public static final Unit m20106F(b bVar, SelfieItem item, C1143g b, RecyclerView.AbstractC1023f0 h10) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(b, "b");
            Intrinsics.checkNotNullParameter(h10, "h");
            b.f4749b.setScaleX(-1.0f);
            ShapeableImageView image = b.f4749b;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            C7458d0.m30978a(image.getContext()).mo31067c(C12749j.m47600q(new ImageRequest.a(image.getContext()).m47525c(item.getSelfie().getAbsoluteFilePath()), image).m47524b());
            String label = item.getLabel();
            if (label == null || StringsKt.m32182p0(label)) {
                b.f4750c.setVisibility(8);
            } else {
                b.f4750c.setVisibility(0);
                TextView label2 = b.f4750c;
                Intrinsics.checkNotNullExpressionValue(label2, "label");
                C5199h.m24129e(label2, item.getLabel());
            }
            TextBasedComponentStyle textBasedComponentStyle = bVar.bodyTextStyle;
            if (textBasedComponentStyle != null) {
                TextView label3 = b.f4750c;
                Intrinsics.checkNotNullExpressionValue(label3, "label");
                C7304h0.m30392l(label3, textBasedComponentStyle, null, 2, null);
            }
            b.getRoot().setContentDescription(item.getLabel());
            return Unit.f29331a;
        }

        /* JADX DEBUG: Class process forced to load method for inline: jq.e.t(jq.e, java.util.List, androidx.recyclerview.widget.RecyclerView$h, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
        /* JADX INFO: renamed from: G */
        public final void m20107G() {
            ArrayList arrayList = new ArrayList();
            for (Selfie selfie : this.data) {
                SelfieItem selfieItem = null;
                strM19905d = null;
                strM19905d = null;
                strM19905d = null;
                strM19905d = null;
                String strM19905d = null;
                if (selfie instanceof Selfie.SelfieImage) {
                    int i10 = C14148b.f16649a[((Selfie.SelfieImage) selfie).getPose().ordinal()];
                    if (i10 == 1) {
                        SelfieWorkflow.AbstractC3928c.f.Strings aVar = this.strings;
                        if (aVar != null) {
                            strM19905d = aVar.getSelfieLabelFront();
                        }
                    } else if (i10 == 2) {
                        SelfieWorkflow.AbstractC3928c.f.Strings aVar2 = this.strings;
                        if (aVar2 != null) {
                            strM19905d = aVar2.getSelfieLabelLeft();
                        }
                    } else if (i10 == 3) {
                        SelfieWorkflow.AbstractC3928c.f.Strings aVar3 = this.strings;
                        if (aVar3 != null) {
                            strM19905d = aVar3.getSelfieLabelRight();
                        }
                    } else if (i10 == 4) {
                        SelfieWorkflow.AbstractC3928c.f.Strings aVar4 = this.strings;
                        if (aVar4 != null) {
                            strM19905d = aVar4.getSelfieLabelUp();
                        }
                    } else {
                        if (i10 != 5) {
                            throw new C7345l();
                        }
                        SelfieWorkflow.AbstractC3928c.f.Strings aVar5 = this.strings;
                        if (aVar5 != null) {
                            strM19905d = aVar5.getSelfieLabelDown();
                        }
                    }
                    selfieItem = new SelfieItem(strM19905d, selfie);
                } else if (!(selfie instanceof Selfie.SelfieVideo)) {
                    throw new C7345l();
                }
                if (selfieItem != null) {
                    arrayList.add(selfieItem);
                }
            }
            C7255e.m30240t(this.adapterHelper, arrayList, this, null, 4, null);
        }

        /* JADX INFO: renamed from: H */
        public final void m20108H(@NotNull TextBasedComponentStyle textStyle) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            this.bodyTextStyle = textStyle;
            m20107G();
        }

        /* JADX INFO: renamed from: I */
        public final void m20109I(@NotNull List<? extends Selfie> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            m20107G();
        }

        /* JADX INFO: renamed from: J */
        public final void m20110J(@NotNull SelfieWorkflow.AbstractC3928c.f.Strings strings) {
            Intrinsics.checkNotNullParameter(strings, "strings");
            this.strings = strings;
            m20107G();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
        /* JADX INFO: renamed from: e */
        public int mo5473e() {
            return this.adapterHelper.m30243m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
        /* JADX INFO: renamed from: g */
        public int mo5475g(int position) {
            return this.adapterHelper.m30245o(position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
        /* JADX INFO: renamed from: r */
        public void mo5486r(@NotNull RecyclerView.AbstractC1023f0 holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            this.adapterHelper.m30247q(holder, position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
        @NotNull
        /* JADX INFO: renamed from: t */
        public RecyclerView.AbstractC1023f0 mo5488t(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return this.adapterHelper.m30248r(parent, viewType);
        }
    }

    public C3960l(@NotNull C1142f binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        b bVar = new b();
        this.adapter = bVar;
        this.singleItemLayoutManager = new LinearLayoutManager(binding.getRoot().getContext());
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.multiItemLayoutManager = new GridAutoFitLayoutManager(context, binding.getRoot().getContext().getResources().getDimensionPixelSize(C13376p.f46852a));
        binding.f4743f.setAdapter(bVar);
        binding.f4743f.setHasFixedSize(true);
        binding.f4743f.m5317j(new C12521d((int) C7265j.m30285a(8.0d), false, false, false, 8, null));
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C12524g.m46873d(root, false, false, false, false, 15, null);
    }

    /* JADX INFO: renamed from: f */
    private final void m20093f(StepStyles.SelfieStepStyle styles, C12247a systemUiController) {
        StepStyles.StepPaddingStyleContainer screen;
        StyleElements.SizeSet base;
        StyleElements.Size right;
        Double dp2;
        StepStyles.StepPaddingStyleContainer screen2;
        StyleElements.SizeSet base2;
        StyleElements.Size left;
        Double dp3;
        StepStyles.StepCancelButtonComponentStyleContainer base3;
        ButtonCancelComponentStyle base4;
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView textView = this.binding.f4746i;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.f4746i.getPaddingRight(), 0);
            TextView title = this.binding.f4746i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C7304h0.m30392l(title, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.f4739b;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.f4739b.getPaddingRight(), 0);
            TextView body = this.binding.f4739b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            C7304h0.m30392l(body, textStyleValue, null, 2, null);
            this.adapter.m20108H(textStyleValue);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.m45389a(context, iIntValue);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableM33622a = C8244d.m33622a(styles, context2);
        if (drawableM33622a != null) {
            this.binding.getRoot().setBackground(drawableM33622a);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f4742e.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            PersonaMaterialButton usePhotosButton = this.binding.f4747j;
            Intrinsics.checkNotNullExpressionValue(usePhotosButton, "usePhotosButton");
            C7297e.m30364h(usePhotosButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        StepStyles.StepSecondaryButtonComponentStyle buttonSecondaryStyle = styles.getButtonSecondaryStyle();
        if (buttonSecondaryStyle != null && (base3 = buttonSecondaryStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            PersonaMaterialButton retakeButton = this.binding.f4744g;
            Intrinsics.checkNotNullExpressionValue(retakeButton, "retakeButton");
            C7297e.m30364h(retakeButton, base4, false, false, false, 14, null);
        }
        Integer headerButtonColorValue2 = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue2 != null) {
            this.binding.f4742e.setControlsColor(headerButtonColorValue2.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f4745h.setGuidelineBegin((int) C7265j.m30285a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f4740c.setGuidelineEnd((int) C7265j.m30285a(dp2.doubleValue()));
    }

    /* JADX INFO: renamed from: i */
    public static final void m20094i(SelfieWorkflow.AbstractC3928c.f fVar, View view) {
        fVar.m19898f().invoke();
    }

    /* JADX INFO: renamed from: j */
    public static final void m20095j(SelfieWorkflow.AbstractC3928c.f fVar, View view) {
        fVar.m19897e().invoke();
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m20096k(SelfieWorkflow.AbstractC3928c.f fVar) {
        fVar.m19895c().invoke();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m20097l(SelfieWorkflow.AbstractC3928c.f fVar) {
        fVar.m19896d().invoke();
        return Unit.f29331a;
    }

    /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;Lan/y;)V */
    @Override // p016an.InterfaceC0382k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo1442a(@NotNull SelfieWorkflow.AbstractC3928c.f rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        m20099h(rendering, C12249c.m45392a(viewEnvironment));
    }

    /* JADX INFO: renamed from: h */
    public final void m20099h(@NotNull final SelfieWorkflow.AbstractC3928c.f rendering, @Nullable C12247a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        C1142f c1142f = this.binding;
        if (rendering.m19899g().size() <= 1) {
            c1142f.f4743f.setLayoutManager(this.singleItemLayoutManager);
        } else {
            c1142f.f4743f.setLayoutManager(this.multiItemLayoutManager);
        }
        if (StringsKt.m32182p0(rendering.getStrings().getTitle())) {
            c1142f.f4746i.setVisibility(8);
        } else {
            c1142f.f4746i.setVisibility(0);
            TextView title = c1142f.f4746i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            C5199h.m24129e(title, rendering.getStrings().getTitle());
        }
        TextView body = c1142f.f4739b;
        Intrinsics.checkNotNullExpressionValue(body, "body");
        C5199h.m24129e(body, rendering.getStrings().getDescription());
        c1142f.f4747j.setText(rendering.getStrings().getSubmitButton());
        c1142f.f4747j.setOnClickListener(new View.OnClickListener() { // from class: yp.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3960l.m20094i(rendering, view);
            }
        });
        c1142f.f4744g.setText(rendering.getStrings().getRetakeButton());
        c1142f.f4744g.setOnClickListener(new View.OnClickListener() { // from class: yp.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3960l.m20095j(rendering, view);
            }
        });
        if (rendering.getStyles() != null) {
            m20093f(rendering.getStyles(), systemUiController);
        }
        this.adapter.m20110J(rendering.getStrings());
        this.adapter.m20109I(rendering.m19899g());
        NavigationState navigationStateM19894b = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: yp.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3960l.m20096k(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: yp.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3960l.m20097l(rendering);
            }
        };
        Pi2NavigationBar navigationBar = this.binding.f4742e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.SelfieStepStyle selfieStepStyleM19901i = rendering.getStyles();
        Rect rectM24132h = selfieStepStyleM19901i != null ? C5199h.m24132h(selfieStepStyleM19901i) : null;
        String strM19893a = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle selfieStepStyleM19901i2 = rendering.getStyles();
        C6966c.m29335e(navigationStateM19894b, function0, function1, null, navigationBar, root, rectM24132h, strM19893a, selfieStepStyleM19901i2 != null ? selfieStepStyleM19901i2.getNavBarTitleStyleValue() : null, 8, null);
    }
}
