package lp;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Footer;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import qr.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u0016B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"¨\u0006$"}, d2 = {"Llp/g;", "Lor/c;", BuildConfig.FLAVOR, "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lqr/x5;", "components", BuildConfig.FLAVOR, "openBrowserButton", "<init>", "(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/util/List;Ljava/lang/String;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "W0", "()Ljava/util/List;", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "c", "getComponents", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements or.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<UiComponentConfig> componentConfigs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final StepStyles.UiStepStyle styles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<x5> components;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String openBrowserButton;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new b();

    /* JADX INFO: renamed from: lp.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llp/g$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "titleText", "bodyText", "openBrowserButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Llp/g;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;)Llp/g;", "integration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final g a(@Nullable String titleText, @Nullable String bodyText, @Nullable String openBrowserButtonText, @Nullable StepStyles.IntegrationStepStyle styles) {
            StepStyles.StepPaddingStyle padding;
            StepStyles.StepPaddingStyleContainer modal;
            StepStyles.StepBackgroundColorStyle backgroundColor;
            ButtonSubmitComponentStyle buttonPrimaryStyleValue;
            List listN = p001kotlin.collections.p.n(new Title(Title.type, new Title.Attributes(titleText == null ? BuildConfig.FLAVOR : titleText, null, null, 6, null), styles != null ? styles.getTitleStyleValue() : null), new Text("body", new Text.Attributes(String.valueOf(bodyText), null, null, 6, null), styles != null ? styles.getTextStyleValue() : null), new Footer(Footer.type, new Footer.Attributes(p001kotlin.collections.o.d(new ActionButton("button_open_browser", new BasicButtonAttributes(String.valueOf(openBrowserButtonText), Button.ButtonType.PRIMARY, null, null, null, null, 60, null), (styles == null || (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) == null) ? null : lp.b.a(buttonPrimaryStyleValue))), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0), new Footer.FooterComponentStyle(new AttributeStyles.FooterColorStyle((styles == null || (backgroundColor = styles.getBackgroundColor()) == null) ? null : backgroundColor.getBase()), new AttributeStyles.FooterPaddingStyle(new StyleElements.MeasurementSet((styles == null || (padding = styles.getPadding()) == null || (modal = padding.getModal()) == null) ? null : modal.getBase())), null)));
            return new g(listN, new StepStyles.UiStepStyle(styles != null ? styles.getHeaderButtonColor() : null, styles != null ? styles.getBackgroundColor() : null, styles != null ? styles.getBackgroundImage() : null, styles != null ? styles.getTitleStyle() : null, styles != null ? styles.getNavBarTitleStyle() : null, styles != null ? styles.getTextStyle() : null, styles != null ? styles.getButtonPrimaryStyle() : null, styles != null ? styles.getButtonSecondaryStyle() : null, styles != null ? styles.getStrokeColor() : null, styles != null ? styles.getFillColor() : null, styles != null ? styles.getAlignment() : null, styles != null ? styles.getPadding() : null, styles != null ? styles.getBorderRadius() : null), com.withpersona.sdk2.inquiry.steps.ui.components.g.i(listN), "button_open_browser");
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList2.add(parcel.readParcelable(g.class.getClassLoader()));
            }
            StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(g.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList3.add(parcel.readParcelable(g.class.getClassLoader()));
                }
                arrayList = arrayList3;
            }
            return new g(arrayList2, uiStepStyle, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g[] newArray(int i10) {
            return new g[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull List<? extends UiComponentConfig> componentConfigs, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable List<? extends x5> list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(componentConfigs, "componentConfigs");
        this.componentConfigs = componentConfigs;
        this.styles = uiStepStyle;
        this.components = list;
        this.openBrowserButton = str;
    }

    @Override // or.c
    @NotNull
    public List<UiComponentConfig> W0() {
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

    @Override // or.c
    @Nullable
    public List<x5> getComponents() {
        return this.components;
    }

    @Override // or.c
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
        List<x5> list2 = this.components;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<x5> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
        }
        dest.writeString(this.openBrowserButton);
    }
}
