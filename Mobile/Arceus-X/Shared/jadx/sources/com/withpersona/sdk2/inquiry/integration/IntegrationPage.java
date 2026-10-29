package com.withpersona.sdk2.inquiry.integration;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p554xo.C12870b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u0016B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006$"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "", "openBrowserButton", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "W0", "()Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "c", "getComponents", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class IntegrationPage implements NestedUiStep {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<UiComponentConfig> componentConfigs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final StepStyles.UiStepStyle styles;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final List<UiComponent> components;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String openBrowserButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<IntegrationPage> CREATOR = new C3602b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationPage$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage$a;", "", "<init>", "()V", "", "titleText", "bodyText", "openBrowserButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;)Lcom/withpersona/sdk2/inquiry/integration/IntegrationPage;", "integration_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.integration.IntegrationPage.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* JADX INFO: renamed from: a */
        public final IntegrationPage m17942a(@Nullable String titleText, @Nullable String bodyText, @Nullable String openBrowserButtonText, @Nullable StepStyles.IntegrationStepStyle styles) {
            StepStyles.StepPaddingStyle padding;
            StepStyles.StepPaddingStyleContainer modal;
            StepStyles.StepBackgroundColorStyle backgroundColor;
            ButtonSubmitComponentStyle buttonPrimaryStyleValue;
            List listM31895n = C7699p.m31895n(new Title(Title.type, new Title.Attributes(titleText == null ? "" : titleText, null, null, 6, null), styles != null ? styles.getTitleStyleValue() : null), new Text("body", new Text.Attributes(String.valueOf(bodyText), null, null, 6, null), styles != null ? styles.getTextStyleValue() : null), new Footer(Footer.type, new Footer.Attributes(C7697o.m31878d(new ActionButton("button_open_browser", new BasicButtonAttributes(String.valueOf(openBrowserButtonText), Button.ButtonType.PRIMARY, null, null, null, null, 60, null), (styles == null || (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) == null) ? null : C12870b.m47901a(buttonPrimaryStyleValue))), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), new Footer.FooterComponentStyle(new AttributeStyles.FooterColorStyle((styles == null || (backgroundColor = styles.getBackgroundColor()) == null) ? null : backgroundColor.getBase()), new AttributeStyles.FooterPaddingStyle(new StyleElements.MeasurementSet((styles == null || (padding = styles.getPadding()) == null || (modal = padding.getModal()) == null) ? null : modal.getBase())), null)));
            return new IntegrationPage(listM31895n, new StepStyles.UiStepStyle(styles != null ? styles.getHeaderButtonColor() : null, styles != null ? styles.getBackgroundColor() : null, styles != null ? styles.getBackgroundImage() : null, styles != null ? styles.getTitleStyle() : null, styles != null ? styles.getNavBarTitleStyle() : null, styles != null ? styles.getTextStyle() : null, styles != null ? styles.getButtonPrimaryStyle() : null, styles != null ? styles.getButtonSecondaryStyle() : null, styles != null ? styles.getStrokeColor() : null, styles != null ? styles.getFillColor() : null, styles != null ? styles.getAlignment() : null, styles != null ? styles.getPadding() : null, styles != null ? styles.getBorderRadius() : null), C4086b.m20892i(listM31895n), "button_open_browser");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.integration.IntegrationPage$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3602b implements Parcelable.Creator<IntegrationPage> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IntegrationPage createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList2.add(parcel.readParcelable(IntegrationPage.class.getClassLoader()));
            }
            StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(IntegrationPage.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList3.add(parcel.readParcelable(IntegrationPage.class.getClassLoader()));
                }
                arrayList = arrayList3;
            }
            return new IntegrationPage(arrayList2, uiStepStyle, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IntegrationPage[] newArray(int i10) {
            return new IntegrationPage[i10];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> */
    /* JADX WARN: Multi-variable type inference failed */
    public IntegrationPage(@NotNull List<? extends UiComponentConfig> componentConfigs, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable List<? extends UiComponent> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(componentConfigs, "componentConfigs");
        this.componentConfigs = componentConfigs;
        this.styles = uiStepStyle;
        this.components = list;
        this.openBrowserButton = str;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep
    @NotNull
    /* JADX INFO: renamed from: W0 */
    public List<UiComponentConfig> mo16272W0() {
        return this.componentConfigs;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOpenBrowserButton() {
        return this.openBrowserButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep
    @Nullable
    public List<UiComponent> getComponents() {
        return this.components;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep
    @Nullable
    public StepStyles.UiStepStyle getStyles() {
        return this.styles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UiComponentConfig> list = this.componentConfigs;
        dest.writeInt(list.size());
        Iterator<UiComponentConfig> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.styles, flags);
        List<UiComponent> list2 = this.components;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<UiComponent> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
        }
        dest.writeString(this.openBrowserButton);
    }
}
