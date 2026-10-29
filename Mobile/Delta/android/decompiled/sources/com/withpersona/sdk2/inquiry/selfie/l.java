package com.withpersona.sdk2.inquiry.selfie;

import an.ViewEnvironment;
import an.a0;
import an.x;
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
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.material.imageview.ShapeableImageView;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import java.util.ArrayList;
import java.util.List;
import jr.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x6.ImageRequest;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l;", "Lan/k;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "Laq/f;", "binding", "<init>", "(Laq/f;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lvq/a;", "systemUiController", "", "f", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lvq/a;)V", "rendering", "Lan/y;", "viewEnvironment", "g", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;Lan/y;)V", "h", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;Lvq/a;)V", "b", "Laq/f;", "Lcom/withpersona/sdk2/inquiry/selfie/l$b;", "c", "Lcom/withpersona/sdk2/inquiry/selfie/l$b;", "adapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "d", "Landroidx/recyclerview/widget/LinearLayoutManager;", "singleItemLayoutManager", "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "e", "Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "multiItemLayoutManager", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements an.k<SelfieWorkflow.c.f> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final aq.f binding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b adapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinearLayoutManager singleItemLayoutManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GridAutoFitLayoutManager multiItemLayoutManager;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$a;", "Lan/a0;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;", "<init>", "()V", "initialRendering", "Lan/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "b", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;Lan/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lhu/c;", "getType", "()Lhu/c;", Payload.TYPE, "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements a0<SelfieWorkflow.c.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a0<SelfieWorkflow.c.f> f12979a;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0245a extends kotlin.jvm.internal.k implements zt.n<LayoutInflater, ViewGroup, Boolean, aq.f> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0245a f12980a = new C0245a();

            public C0245a() {
                super(3, aq.f.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;", 0);
            }

            public final aq.f d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return aq.f.c(p8, viewGroup, z10);
            }

            @Override // zt.n
            public /* bridge */ /* synthetic */ aq.f invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class b extends kotlin.jvm.internal.k implements Function1<aq.f, l> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f12981a = new b();

            public b() {
                super(1, l.class, "<init>", "<init>(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewCapturesBinding;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public final l invoke(aq.f p8) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return new l(p8);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // an.a0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public View a(@NotNull SelfieWorkflow.c.f initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, @Nullable ViewGroup container) {
            Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
            Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
            Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
            return this.f12979a.a(initialRendering, initialViewEnvironment, contextForNewView, container);
        }

        @Override // an.a0
        @NotNull
        public hu.c<? super SelfieWorkflow.c.f> getType() {
            return this.f12979a.getType();
        }

        public Companion() {
            an.k.Companion companion = an.k.INSTANCE;
            this.f12979a = new x(d0.b(SelfieWorkflow.c.f.class), C0245a.f12980a, b.f12981a);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001f\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b!\u0010\u0004R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$b;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "<init>", "()V", "", "position", "g", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "t", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0;", "e", "()I", "holder", "", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "strings", "J", "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;)V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "textStyle", "H", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "data", "I", "(Ljava/util/List;)V", "G", "d", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;", "Ljava/util/List;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "bodyTextStyle", "Ljq/e;", "Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;", "Ljq/e;", "adapterHelper", "a", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends RecyclerView.h<RecyclerView.f0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SelfieWorkflow.c.f.Strings strings;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public List<? extends Selfie> data = kotlin.collections.p.k();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public TextBasedComponentStyle bodyTextStyle;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final jq.e<SelfieItem> adapterHelper;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.l$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/l$b$a;", "", "", "label", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SelfieItem {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
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
                return Intrinsics.c(this.label, selfieItem.label) && Intrinsics.c(this.selfie, selfieItem.selfie);
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
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0246b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12987a;

            static {
                int[] iArr = new int[kn.a.values().length];
                try {
                    iArr[kn.a.Center.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kn.a.Left.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[kn.a.Right.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[kn.a.Up.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[kn.a.Down.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f12987a = iArr;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class c extends kotlin.jvm.internal.k implements zt.n<LayoutInflater, ViewGroup, Boolean, aq.g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f12988a = new c();

            public c() {
                super(3, aq.g.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieReviewItemBinding;", 0);
            }

            public final aq.g d(LayoutInflater p8, ViewGroup viewGroup, boolean z10) {
                Intrinsics.checkNotNullParameter(p8, "p0");
                return aq.g.c(p8, viewGroup, z10);
            }

            @Override // zt.n
            public /* bridge */ /* synthetic */ aq.g invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return d(layoutInflater, viewGroup, bool.booleanValue());
            }
        }

        public b() {
            jq.e<SelfieItem> eVar = new jq.e<>(new Function2() { // from class: yp.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(com.withpersona.sdk2.inquiry.selfie.l.b.E((com.withpersona.sdk2.inquiry.selfie.l.b.SelfieItem) obj, (com.withpersona.sdk2.inquiry.selfie.l.b.SelfieItem) obj2));
                }
            }, null, null, 6, null);
            eVar.j(d0.b(SelfieItem.class), d0.b(aq.g.class), c.f12988a, new zt.n() { // from class: yp.i0
                @Override // zt.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return com.withpersona.sdk2.inquiry.selfie.l.b.F(this.f36120a, (com.withpersona.sdk2.inquiry.selfie.l.b.SelfieItem) obj, (aq.g) obj2, (RecyclerView.f0) obj3);
                }
            }, null);
            this.adapterHelper = eVar;
        }

        public static final boolean E(SelfieItem old, SelfieItem selfieItem) {
            Intrinsics.checkNotNullParameter(old, "old");
            Intrinsics.checkNotNullParameter(selfieItem, "new");
            return Intrinsics.c(old.getSelfie().getAbsoluteFilePath(), selfieItem.getSelfie().getAbsoluteFilePath());
        }

        public static final Unit F(b bVar, SelfieItem item, aq.g b, RecyclerView.f0 h10) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(b, "b");
            Intrinsics.checkNotNullParameter(h10, "h");
            b.b.setScaleX(-1.0f);
            ShapeableImageView image = b.b;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            k6.d0.a(image.getContext()).c(x6.j.q(new ImageRequest.a(image.getContext()).c(item.getSelfie().getAbsoluteFilePath()), image).b());
            String label = item.getLabel();
            if (label == null || StringsKt.p0(label)) {
                b.f3643c.setVisibility(8);
            } else {
                b.f3643c.setVisibility(0);
                TextView label2 = b.f3643c;
                Intrinsics.checkNotNullExpressionValue(label2, "label");
                er.h.e(label2, item.getLabel());
            }
            TextBasedComponentStyle textBasedComponentStyle = bVar.bodyTextStyle;
            if (textBasedComponentStyle != null) {
                TextView label3 = b.f3643c;
                Intrinsics.checkNotNullExpressionValue(label3, "label");
                h0.l(label3, textBasedComponentStyle, null, 2, null);
            }
            b.getRoot().setContentDescription(item.getLabel());
            return Unit.f22483a;
        }

        public final void G() {
            ArrayList arrayList = new ArrayList();
            for (Selfie selfie : this.data) {
                SelfieItem selfieItem = null;
                strD = null;
                strD = null;
                strD = null;
                strD = null;
                String strD = null;
                if (selfie instanceof Selfie.SelfieImage) {
                    int i10 = C0246b.f12987a[((Selfie.SelfieImage) selfie).getPose().ordinal()];
                    if (i10 == 1) {
                        SelfieWorkflow.c.f.Strings aVar = this.strings;
                        if (aVar != null) {
                            strD = aVar.getSelfieLabelFront();
                        }
                    } else if (i10 == 2) {
                        SelfieWorkflow.c.f.Strings aVar2 = this.strings;
                        if (aVar2 != null) {
                            strD = aVar2.getSelfieLabelLeft();
                        }
                    } else if (i10 == 3) {
                        SelfieWorkflow.c.f.Strings aVar3 = this.strings;
                        if (aVar3 != null) {
                            strD = aVar3.getSelfieLabelRight();
                        }
                    } else if (i10 == 4) {
                        SelfieWorkflow.c.f.Strings aVar4 = this.strings;
                        if (aVar4 != null) {
                            strD = aVar4.getSelfieLabelUp();
                        }
                    } else {
                        if (i10 != 5) {
                            throw new jt.l();
                        }
                        SelfieWorkflow.c.f.Strings aVar5 = this.strings;
                        if (aVar5 != null) {
                            strD = aVar5.getSelfieLabelDown();
                        }
                    }
                    selfieItem = new SelfieItem(strD, selfie);
                } else if (!(selfie instanceof Selfie.SelfieVideo)) {
                    throw new jt.l();
                }
                if (selfieItem != null) {
                    arrayList.add(selfieItem);
                }
            }
            jq.e.t(this.adapterHelper, arrayList, this, null, 4, null);
        }

        public final void H(@NotNull TextBasedComponentStyle textStyle) {
            Intrinsics.checkNotNullParameter(textStyle, "textStyle");
            this.bodyTextStyle = textStyle;
            G();
        }

        public final void I(@NotNull List<? extends Selfie> data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            G();
        }

        public final void J(@NotNull SelfieWorkflow.c.f.Strings strings) {
            Intrinsics.checkNotNullParameter(strings, "strings");
            this.strings = strings;
            G();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int e() {
            return this.adapterHelper.m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int g(int position) {
            return this.adapterHelper.o(position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void r(@NotNull RecyclerView.f0 holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            this.adapterHelper.q(holder, position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        @NotNull
        public RecyclerView.f0 t(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return this.adapterHelper.r(parent, viewType);
        }
    }

    public l(@NotNull aq.f binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        b bVar = new b();
        this.adapter = bVar;
        this.singleItemLayoutManager = new LinearLayoutManager(binding.getRoot().getContext());
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.multiItemLayoutManager = new GridAutoFitLayoutManager(context, binding.getRoot().getContext().getResources().getDimensionPixelSize(yp.p.f36187a));
        binding.f3637f.setAdapter(bVar);
        binding.f3637f.setHasFixedSize(true);
        binding.f3637f.j(new wq.d((int) jq.j.a(8.0d), false, false, false, 8, null));
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        wq.g.d(root, false, false, false, false, 15, null);
    }

    private final void f(StepStyles.SelfieStepStyle styles, vq.a systemUiController) {
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
            TextView textView = this.binding.f3640i;
            textView.setPadding(textView.getPaddingLeft(), 0, this.binding.f3640i.getPaddingRight(), 0);
            TextView title = this.binding.f3640i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            h0.l(title, titleStyleValue, null, 2, null);
        }
        TextBasedComponentStyle textStyleValue = styles.getTextStyleValue();
        if (textStyleValue != null) {
            TextView textView2 = this.binding.b;
            textView2.setPadding(textView2.getPaddingLeft(), 0, this.binding.b.getPaddingRight(), 0);
            TextView body = this.binding.b;
            Intrinsics.checkNotNullExpressionValue(body, "body");
            h0.l(body, textStyleValue, null, 2, null);
            this.adapter.H(textStyleValue);
        }
        Integer backgroundColorValue = styles.getBackgroundColorValue();
        if (backgroundColorValue != null) {
            int iIntValue = backgroundColorValue.intValue();
            this.binding.getRoot().setBackgroundColor(iIntValue);
            if (systemUiController != null) {
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                systemUiController.a(context, iIntValue);
            }
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Drawable drawableA = lr.d.a(styles, context2);
        if (drawableA != null) {
            this.binding.getRoot().setBackground(drawableA);
        }
        Integer headerButtonColorValue = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue != null) {
            this.binding.f3636e.setControlsColor(headerButtonColorValue.intValue());
        }
        ButtonSubmitComponentStyle buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue();
        if (buttonPrimaryStyleValue != null) {
            PersonaMaterialButton usePhotosButton = this.binding.f3641j;
            Intrinsics.checkNotNullExpressionValue(usePhotosButton, "usePhotosButton");
            jr.e.h(usePhotosButton, buttonPrimaryStyleValue, false, false, false, 14, null);
        }
        StepStyles.StepSecondaryButtonComponentStyle buttonSecondaryStyle = styles.getButtonSecondaryStyle();
        if (buttonSecondaryStyle != null && (base3 = buttonSecondaryStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
            PersonaMaterialButton retakeButton = this.binding.f3638g;
            Intrinsics.checkNotNullExpressionValue(retakeButton, "retakeButton");
            jr.e.h(retakeButton, base4, false, false, false, 14, null);
        }
        Integer headerButtonColorValue2 = styles.getHeaderButtonColorValue();
        if (headerButtonColorValue2 != null) {
            this.binding.f3636e.setControlsColor(headerButtonColorValue2.intValue());
        }
        StepStyles.StepPaddingStyle padding = styles.getPadding();
        if (padding != null && (screen2 = padding.getScreen()) != null && (base2 = screen2.getBase()) != null && (left = base2.getLeft()) != null && (dp3 = left.getDp()) != null) {
            this.binding.f3639h.setGuidelineBegin((int) jq.j.a(dp3.doubleValue()));
        }
        StepStyles.StepPaddingStyle padding2 = styles.getPadding();
        if (padding2 == null || (screen = padding2.getScreen()) == null || (base = screen.getBase()) == null || (right = base.getRight()) == null || (dp2 = right.getDp()) == null) {
            return;
        }
        this.binding.f3634c.setGuidelineEnd((int) jq.j.a(dp2.doubleValue()));
    }

    public static final void i(SelfieWorkflow.c.f fVar, View view) {
        fVar.f().invoke();
    }

    public static final void j(SelfieWorkflow.c.f fVar, View view) {
        fVar.e().invoke();
    }

    public static final Unit k(SelfieWorkflow.c.f fVar) {
        fVar.c().invoke();
        return Unit.f22483a;
    }

    public static final Unit l(SelfieWorkflow.c.f fVar) {
        fVar.d().invoke();
        return Unit.f22483a;
    }

    @Override // an.k
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull SelfieWorkflow.c.f rendering, @NotNull ViewEnvironment viewEnvironment) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        h(rendering, vq.c.a(viewEnvironment));
    }

    public final void h(@NotNull final SelfieWorkflow.c.f rendering, @Nullable vq.a systemUiController) {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        aq.f fVar = this.binding;
        if (rendering.g().size() <= 1) {
            fVar.f3637f.setLayoutManager(this.singleItemLayoutManager);
        } else {
            fVar.f3637f.setLayoutManager(this.multiItemLayoutManager);
        }
        if (StringsKt.p0(rendering.getStrings().getTitle())) {
            fVar.f3640i.setVisibility(8);
        } else {
            fVar.f3640i.setVisibility(0);
            TextView title = fVar.f3640i;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            er.h.e(title, rendering.getStrings().getTitle());
        }
        TextView body = fVar.b;
        Intrinsics.checkNotNullExpressionValue(body, "body");
        er.h.e(body, rendering.getStrings().getDescription());
        fVar.f3641j.setText(rendering.getStrings().getSubmitButton());
        fVar.f3641j.setOnClickListener(new View.OnClickListener() { // from class: yp.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.selfie.l.i(rendering, view);
            }
        });
        fVar.f3638g.setText(rendering.getStrings().getRetakeButton());
        fVar.f3638g.setOnClickListener(new View.OnClickListener() { // from class: yp.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.withpersona.sdk2.inquiry.selfie.l.j(rendering, view);
            }
        });
        if (rendering.getStyles() != null) {
            f(rendering.getStyles(), systemUiController);
        }
        this.adapter.J(rendering.getStrings());
        this.adapter.I(rendering.g());
        NavigationState navigationStateB = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: yp.f0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.l.k(rendering);
            }
        };
        Function0 function1 = new Function0() { // from class: yp.g0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.selfie.l.l(rendering);
            }
        };
        Pi2NavigationBar navigationBar = this.binding.f3636e;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        StepStyles.SelfieStepStyle selfieStepStyleI = rendering.getStyles();
        Rect rectH = selfieStepStyleI != null ? er.h.h(selfieStepStyleI) : null;
        String strA = rendering.getNavBarTitle();
        StepStyles.SelfieStepStyle selfieStepStyleI2 = rendering.getStyles();
        ir.c.e(navigationStateB, function0, function1, null, navigationBar, root, rectH, strA, selfieStepStyleI2 != null ? selfieStepStyleI2.getNavBarTitleStyleValue() : null, 8, null);
    }
}
