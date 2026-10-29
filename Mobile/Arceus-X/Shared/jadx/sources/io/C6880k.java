package io;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.governmentid.EnabledIdClass;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryTheme;
import com.withpersona.sdk2.inquiry.shared.p055ui.ClickableConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lr.C8243c;
import no.C9530f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p226jq.C7265j;
import p226jq.C7266j0;
import p226jq.C7268k0;
import p226jq.C7288z;
import p227jr.C7304h0;
import p229jt.C7345l;
import p232k.C7399a;
import p402r5.InterfaceC10784a;
import p497vp.C12238a;
import p497vp.C12244g;
import p585yq.C13442a;

/* JADX INFO: renamed from: io.k */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u001b\u001a\r\u0012\t\u0012\u00070\u0019¢\u0006\u0002\b\u001a0\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010!\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0016H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J3\u0010.\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u00162\b\u0010,\u001a\u0004\u0018\u00010\u00162\u0006\u0010-\u001a\u00020'H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\u0016H\u0002¢\u0006\u0004\b2\u00103R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b9\u0010:R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR0\u0010I\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020'0Ej\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020'`F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR*\u0010P\u001a\u00020J2\u0006\u0010N\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010L\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006T"}, m31665d2 = {"Lio/k;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", "context", "", "Lcom/withpersona/sdk2/inquiry/governmentid/EnabledIdClass;", "data", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "iconStyle", "Lkotlin/Function1;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "", "onClick", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Ljq/j0;", "Lno/f;", "Lkotlin/jvm/internal/EnhancedNullability;", "H", "(Landroid/view/ViewGroup;I)Ljq/j0;", "e", "()I", "holder", "position", "r", "(Landroidx/recyclerview/widget/RecyclerView$f0;I)V", "viewHolder", "D", "(Lno/f;)V", "binding", "Landroid/graphics/drawable/Drawable;", "drawableRes", "J", "(Lno/f;Landroid/graphics/drawable/Drawable;)V", "strokeColor", "fillColor", "iconDrawable", "F", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "pressedColor", "Landroid/content/res/ColorStateList;", "E", "(I)Landroid/content/res/ColorStateList;", "d", "Ljava/util/List;", "getData", "()Ljava/util/List;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;", "g", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "getIconStyle", "()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;", "h", "Lkotlin/jvm/functions/Function1;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "i", "Ljava/util/HashMap;", "cachedImages", "", "j", "Z", "useIcons", "value", "k", "isEnabled", "()Z", "I", "(Z)V", "government-id_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6880k extends RecyclerView.AbstractC1025h<RecyclerView.AbstractC1023f0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<EnabledIdClass> data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final StepStyles.GovernmentIdStepStyle styles;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final NextStep.GovernmentId.AssetConfig.SelectPage assetConfig;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InquiryTheme.EnumC4006c iconStyle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Function1<IdConfig, Unit> onClick;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final HashMap<Integer, Drawable> cachedImages;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final boolean useIcons;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean isEnabled;

    /* JADX INFO: renamed from: io.k$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26978a;

        static {
            int[] iArr = new int[EnumC6879j2.values().length];
            try {
                iArr[EnumC6879j2.World.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6879j2.Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6879j2.Flag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6879j2.House.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26978a = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: kotlin.jvm.functions.Function1<? super com.withpersona.sdk2.inquiry.governmentid.IdConfig, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6880k(@NotNull Context context, @NotNull List<EnabledIdClass> data, @Nullable StepStyles.GovernmentIdStepStyle governmentIdStepStyle, @Nullable NextStep.GovernmentId.AssetConfig.SelectPage selectPage, @NotNull InquiryTheme.EnumC4006c iconStyle, @NotNull Function1<? super IdConfig, Unit> onClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.data = data;
        this.styles = governmentIdStepStyle;
        this.assetConfig = selectPage;
        this.iconStyle = iconStyle;
        this.onClick = onClick;
        this.cachedImages = new HashMap<>();
        this.useIcons = !C7288z.m30326b(context, C12238a.f43171d, null, false, false, 14, null);
        this.isEnabled = true;
    }

    /* JADX INFO: renamed from: G */
    public static final void m29313G(C6880k c6880k, EnabledIdClass enabledIdClass, View view) {
        c6880k.onClick.invoke(enabledIdClass.getIdConfig());
    }

    /* JADX INFO: renamed from: D */
    public final void m29314D(C9530f viewHolder) {
        Double governmentIdSelectOptionMinRowHeight;
        Integer backgroundColorValue;
        Integer chevronColor;
        TextBasedComponentStyle governmentIdVerticalOptionTextStyle;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        if (governmentIdStepStyle != null && (governmentIdVerticalOptionTextStyle = governmentIdStepStyle.getGovernmentIdVerticalOptionTextStyle()) != null) {
            TextView label = viewHolder.f34382e;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            C7304h0.m30392l(label, governmentIdVerticalOptionTextStyle, null, 2, null);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (chevronColor = governmentIdStepStyle2.getChevronColor()) != null) {
            viewHolder.f34379b.setColorFilter(chevronColor.intValue());
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle3 = this.styles;
        if (governmentIdStepStyle3 != null && (backgroundColorValue = governmentIdStepStyle3.getBackgroundColorValue()) != null) {
            int iIntValue = backgroundColorValue.intValue();
            Integer activeOptionBackgroundColorValue = this.styles.getActiveOptionBackgroundColorValue();
            if (activeOptionBackgroundColorValue != null) {
                viewHolder.getRoot().setBackground(new RippleDrawable(m29315E(activeOptionBackgroundColorValue.intValue()), new ColorDrawable(iIntValue), null));
            }
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle4 = this.styles;
        if (governmentIdStepStyle4 == null || (governmentIdSelectOptionMinRowHeight = governmentIdStepStyle4.getGovernmentIdSelectOptionMinRowHeight()) == null) {
            return;
        }
        viewHolder.f34383f.setMinHeight((int) C7265j.m30285a(governmentIdSelectOptionMinRowHeight.doubleValue()));
    }

    /* JADX INFO: renamed from: E */
    public final ColorStateList m29315E(int pressedColor) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{pressedColor});
    }

    /* JADX INFO: renamed from: F */
    public final Drawable m29316F(Context context, Integer strokeColor, Integer fillColor, Drawable iconDrawable) {
        Drawable drawableMutate;
        ArrayList arrayList = new ArrayList();
        if (strokeColor != null) {
            iconDrawable.mutate().setTint(strokeColor.intValue());
        }
        Drawable drawableM30679b = C7399a.m30679b(context, C6891m2.f27001e);
        if (fillColor != null && drawableM30679b != null && (drawableMutate = drawableM30679b.mutate()) != null) {
            drawableMutate.setTint(fillColor.intValue());
        }
        if (drawableM30679b != null) {
            arrayList.add(drawableM30679b);
        }
        arrayList.add(iconDrawable);
        return new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0]));
    }

    /* JADX DEBUG: Method merged with bridge method: t(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$f0; */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public C7266j0<C9530f> mo5488t(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        C9530f c9530fM37627c = C9530f.m37627c(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(c9530fM37627c, "inflate(...)");
        C7266j0<C9530f> c7266j0 = new C7266j0<>(c9530fM37627c);
        InterfaceC10784a interfaceC10784aM30292N = c7266j0.m30292N();
        Intrinsics.checkNotNullExpressionValue(interfaceC10784aM30292N, "<get-binding>(...)");
        m29314D((C9530f) interfaceC10784aM30292N);
        return c7266j0;
    }

    /* JADX INFO: renamed from: I */
    public final void m29318I(boolean z10) {
        if (this.isEnabled == z10) {
            return;
        }
        this.isEnabled = z10;
        m5478j();
    }

    /* JADX INFO: renamed from: J */
    public final void m29319J(C9530f binding, Drawable drawableRes) {
        Integer governmentIdIconFillColor;
        Integer governmentIdIconStrokeColor;
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
        Integer numValueOf = null;
        Integer numValueOf2 = (governmentIdStepStyle == null || (governmentIdIconStrokeColor = governmentIdStepStyle.getGovernmentIdIconStrokeColor()) == null) ? null : Integer.valueOf(governmentIdIconStrokeColor.intValue());
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = this.styles;
        if (governmentIdStepStyle2 != null && (governmentIdIconFillColor = governmentIdStepStyle2.getGovernmentIdIconFillColor()) != null) {
            numValueOf = Integer.valueOf(governmentIdIconFillColor.intValue());
        }
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Drawable drawableMutate = m29316F(context, numValueOf2, numValueOf, drawableRes).mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        binding.f34380c.setImageDrawable(drawableMutate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: e */
    public int mo5473e() {
        return this.data.size();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1025h
    /* JADX INFO: renamed from: r */
    public void mo5486r(@NotNull RecyclerView.AbstractC1023f0 holder, int position) {
        RemoteImage iconPassport;
        int i10;
        Intrinsics.checkNotNullParameter(holder, "holder");
        final EnabledIdClass enabledIdClass = this.data.get(position);
        C9530f c9530f = (C9530f) C7268k0.m30294a(holder);
        c9530f.f34382e.setText(enabledIdClass.getName());
        EnumC6879j2 icon = enabledIdClass.getIcon();
        int[] iArr = a.f26978a;
        int i11 = iArr[icon.ordinal()];
        if (i11 == 1) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage = this.assetConfig;
            if (selectPage != null) {
                iconPassport = selectPage.getIconPassport();
            } else {
                iconPassport = null;
            }
        } else if (i11 == 2) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage2 = this.assetConfig;
            if (selectPage2 != null) {
                iconPassport = selectPage2.getIconGovernmentId();
            } else {
                iconPassport = null;
            }
        } else if (i11 == 3) {
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage3 = this.assetConfig;
            if (selectPage3 != null) {
                iconPassport = selectPage3.getIconDriversLicense();
            } else {
                iconPassport = null;
            }
        } else {
            if (i11 != 4) {
                throw new C7345l();
            }
            NextStep.GovernmentId.AssetConfig.SelectPage selectPage4 = this.assetConfig;
            if (selectPage4 == null || (iconPassport = selectPage4.getIconNationalId()) == null) {
                NextStep.GovernmentId.AssetConfig.SelectPage selectPage5 = this.assetConfig;
                if (selectPage5 != null) {
                    iconPassport = selectPage5.getIconGovernmentId();
                } else {
                    iconPassport = null;
                }
            }
        }
        ConstraintLayout constraintLayout = c9530f.f34381d;
        int i12 = C6895n2.f27080m0;
        Object tag = constraintLayout.getTag(i12);
        View view = tag instanceof View ? (View) tag : null;
        if (view != null) {
            c9530f.f34381d.removeView(view);
        }
        if (!this.useIcons || this.iconStyle == InquiryTheme.EnumC4006c.None) {
            c9530f.f34381d.setVisibility(8);
            TextView label = c9530f.f34382e;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            label.setPaddingRelative(0, label.getPaddingTop(), label.getPaddingEnd(), label.getPaddingBottom());
        } else if (iconPassport != null) {
            ConstraintLayout iconContainer = c9530f.f34381d;
            Intrinsics.checkNotNullExpressionValue(iconContainer, "iconContainer");
            c9530f.f34381d.setTag(i12, C8243c.m33617e(iconPassport, iconContainer, true));
            c9530f.f34380c.setVisibility(8);
            TextView label2 = c9530f.f34382e;
            Intrinsics.checkNotNullExpressionValue(label2, "label");
            label2.setPaddingRelative((int) C7265j.m30285a(8.0d), label2.getPaddingTop(), label2.getPaddingEnd(), label2.getPaddingBottom());
        } else {
            c9530f.f34380c.setVisibility(0);
            if (this.cachedImages.get(Integer.valueOf(position)) != null) {
                c9530f.f34380c.setImageDrawable(this.cachedImages.get(Integer.valueOf(position)));
            } else {
                int i13 = iArr[enabledIdClass.getIcon().ordinal()];
                if (i13 == 1) {
                    i10 = C6891m2.f27007k;
                } else if (i13 == 2) {
                    i10 = C6891m2.f27000d;
                } else if (i13 == 3) {
                    i10 = C6891m2.f27004h;
                } else {
                    if (i13 != 4) {
                        throw new C7345l();
                    }
                    i10 = C6891m2.f27005i;
                }
                Drawable drawableM30679b = C7399a.m30679b(c9530f.getRoot().getContext(), i10);
                if (drawableM30679b != null) {
                    m29319J(c9530f, drawableM30679b);
                    this.cachedImages.put(Integer.valueOf(position), c9530f.f34380c.getDrawable());
                }
            }
            TextView label3 = c9530f.f34382e;
            Intrinsics.checkNotNullExpressionValue(label3, "label");
            label3.setPaddingRelative((int) C7265j.m30285a(8.0d), label3.getPaddingTop(), label3.getPaddingEnd(), label3.getPaddingBottom());
        }
        ClickableConstraintLayout root = c9530f.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C13442a.m49045a(root, C12244g.f43242a);
        c9530f.getRoot().setOnClickListener(new View.OnClickListener() { // from class: io.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C6880k.m29313G(this.f26956a, enabledIdClass, view2);
            }
        });
        c9530f.getRoot().setEnabled(this.isEnabled);
    }
}
