package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.BasicButtonAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.CombinedStepButton;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonCancelComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.C4086b;
import com.withpersona.sdk2.inquiry.steps.p056ui.components.UiComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p609zn.C13854a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001\u0019BW\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b)\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\u0019\u0010&¨\u0006+"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "components", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "", "selectDocumentButton", "selectPhotoButton", "takePhotoButton", "launchUploadOptionsButton", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "b", "W0", "c", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "d", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", "g", "i", "h", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class DocumentStartPage implements NestedUiStep {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final List<UiComponent> components;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<UiComponentConfig> componentConfigs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final StepStyles.UiStepStyle styles;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final String selectDocumentButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final String selectPhotoButton;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final String takePhotoButton;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final String launchUploadOptionsButton;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<DocumentStartPage> CREATOR = new C3417b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentStartPage$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage$a;", "", "<init>", "()V", "", "titleText", "bodyText", "selectDocumentButtonText", "takePhotoButtonText", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.document.DocumentStartPage.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final DocumentStartPage m16277a(@Nullable String titleText, @Nullable String bodyText, @Nullable String selectDocumentButtonText, @Nullable String takePhotoButtonText, @Nullable StepStyles.DocumentStepStyle styles) {
            ButtonCancelComponentStyle buttonSecondaryStyleValue;
            ButtonSubmitComponentStyle buttonPrimaryStyleValue;
            StepStyles.DocumentStepFillColor fillColor;
            StepStyles.DocumentStepStrokeColor strokeColor;
            List listM31895n = C7699p.m31895n(new Title(Title.type, new Title.Attributes(titleText == null ? "" : titleText, null, null, 6, null), styles != null ? styles.getTitleStyleValue() : null), new Text("body", new Text.Attributes(bodyText == null ? "" : bodyText, null, null, 6, null), styles != null ? styles.getTextStyleValue() : null), new LocalImage("hero_image", new LocalImage.Attributes(LocalImage.Image.DOCUMENT_START_HERO, null), new LocalImageComponentStyle(new AttributeStyles.LocalImageStrokeColorStyle((styles == null || (strokeColor = styles.getStrokeColor()) == null) ? null : strokeColor.getBase()), new AttributeStyles.LocalImageFillColorStyle((styles == null || (fillColor = styles.getFillColor()) == null) ? null : fillColor.getBase(), null), null, null, null, new AttributeStyles.LocalImageMarginStyle(new StyleElements.MeasurementSet(new StyleElements.SizeSet(new StyleElements.DPSize(24.0d), new StyleElements.DPSize(24.0d), new StyleElements.DPSize(0.0d), new StyleElements.DPSize(0.0d)))), 28, null)), new CombinedStepButton("camera_button", new BasicButtonAttributes(takePhotoButtonText == null ? "" : takePhotoButtonText, Button.ButtonType.PRIMARY, null, null, null, null, 60, null), (styles == null || (buttonPrimaryStyleValue = styles.getButtonPrimaryStyleValue()) == null) ? null : C13854a.m50427b(buttonPrimaryStyleValue)), new CombinedStepButton("upload_button", new BasicButtonAttributes(selectDocumentButtonText == null ? "" : selectDocumentButtonText, Button.ButtonType.SECONDARY, null, null, null, null, 60, null), (styles == null || (buttonSecondaryStyleValue = styles.getButtonSecondaryStyleValue()) == null) ? null : C13854a.m50426a(buttonSecondaryStyleValue)));
            return new DocumentStartPage(C4086b.m20892i(listM31895n), listM31895n, new StepStyles.UiStepStyle(styles != null ? styles.getHeaderButtonColor() : null, styles != null ? styles.getBackgroundColor() : null, styles != null ? styles.getBackgroundImage() : null, null, null, null, null, null, null, null, null, null, null), "upload_button", null, "camera_button", null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.document.DocumentStartPage$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3417b implements Parcelable.Creator<DocumentStartPage> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentStartPage createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(parcel.readParcelable(DocumentStartPage.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            int i12 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList3.add(parcel.readParcelable(DocumentStartPage.class.getClassLoader()));
            }
            return new DocumentStartPage(arrayList, arrayList3, (StepStyles.UiStepStyle) parcel.readParcelable(DocumentStartPage.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DocumentStartPage[] newArray(int i10) {
            return new DocumentStartPage[i10];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig> */
    /* JADX WARN: Multi-variable type inference failed */
    public DocumentStartPage(@Nullable List<? extends UiComponent> list, @NotNull List<? extends UiComponentConfig> componentConfigs, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(componentConfigs, "componentConfigs");
        this.components = list;
        this.componentConfigs = componentConfigs;
        this.styles = uiStepStyle;
        this.selectDocumentButton = str;
        this.selectPhotoButton = str2;
        this.takePhotoButton = str3;
        this.launchUploadOptionsButton = str4;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.p056ui.NestedUiStep
    @NotNull
    /* JADX INFO: renamed from: W0 */
    public List<UiComponentConfig> mo16272W0() {
        return this.componentConfigs;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLaunchUploadOptionsButton() {
        return this.launchUploadOptionsButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSelectDocumentButton() {
        return this.selectDocumentButton;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSelectPhotoButton() {
        return this.selectPhotoButton;
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

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTakePhotoButton() {
        return this.takePhotoButton;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UiComponent> list = this.components;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<UiComponent> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
        List<UiComponentConfig> list2 = this.componentConfigs;
        dest.writeInt(list2.size());
        Iterator<UiComponentConfig> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeParcelable(this.styles, flags);
        dest.writeString(this.selectDocumentButton);
        dest.writeString(this.selectPhotoButton);
        dest.writeString(this.takePhotoButton);
        dest.writeString(this.launchUploadOptionsButton);
    }
}
