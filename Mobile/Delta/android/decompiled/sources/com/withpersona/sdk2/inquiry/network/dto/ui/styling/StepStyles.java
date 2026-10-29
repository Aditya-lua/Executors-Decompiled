package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b8\b6\u0018\u00002\u00020\u0001:5\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345678B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u00069"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles;", "", "<init>", "()V", "IntegrationStepStyle", "UiStepStyle", "GovernmentIdStepStyle", "SelfieStepStyle", "DocumentStepStyle", "StepBackgroundColorStyle", "StepBackgroundImageStyle", "StepBackgroundImageStyleContainer", "StepBackgroundImageNameContainer", "StepPaddingStyle", "StepPaddingStyleContainer", "StepBorderRadiusStyle", "StepTextBasedComponentStyle", "StepTextBasedComponentStyleContainer", "InputSelectStyleContainer", "StepPrimaryButtonComponentStyle", "StepSubmitButtonComponentStyleContainer", "StepSecondaryButtonComponentStyle", "StepCancelButtonComponentStyleContainer", "UiStepTitleComponentStyle", "UiStepTextBasedComponentStyle", "UiStepStrokeColor", "UiStepFillColor", "UiStepAlignment", "CombinedStepAlignment", "GovernmentIdStepPrimaryButtonComponentStyle", "GovernmentIdStepSecondaryButtonComponentStyle", "GovernmentIdStepTextBasedComponentStyle", "GovernmentIdStepInputSelectStyle", "GovernmentIdStepTitleComponentStyle", "GovernmentIdStepStrokeColor", "GovernmentIdStepFillColor", "GovernmentIdStepBorderColor", "GovernmentIdStepBorderWidth", "GovernmentIdStepRowHeight", "GovernmentIdStepBorderRadius", "GovernmentIdStepImageLocalStyle", "GovernmentIdStepImageLocalStyleContainer", "SelfieStepTitleComponentStyle", "SelfieStepTextBasedComponentStyle", "SelfieStepStrokeColor", "SelfieStepImageLocalStyle", "SelfieStepImageLocalStyleContainer", "SelfieStepBorderColor", "SelfieStepBorderWidth", "SelfieStepFillColor", "DocumentStepTitleComponentStyle", "DocumentStepTextBasedComponentStyle", "DocumentStepStrokeColor", "DocumentStepFillColor", "DocumentStepBorderColor", "DocumentStepBorderRadius", "DocumentStepBorderWidth", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StepStyles {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "Landroid/os/Parcelable;", "pendingPage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;)V", "getPendingPage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class CombinedStepAlignment implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CombinedStepAlignment> CREATOR = new Creator();

        @Nullable
        private final StyleElements.Position pendingPage;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CombinedStepAlignment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CombinedStepAlignment createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CombinedStepAlignment(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CombinedStepAlignment[] newArray(int i10) {
                return new CombinedStepAlignment[i10];
            }
        }

        public CombinedStepAlignment(@Nullable StyleElements.Position position) {
            this.pendingPage = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.Position getPendingPage() {
            return this.pendingPage;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.Position position = this.pendingPage;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                position.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderColor;", "Landroid/os/Parcelable;", "imagePreview", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getImagePreview", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class DocumentStepBorderColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepBorderColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor imagePreview;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentStepBorderColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepBorderColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderColor[] newArray(int i10) {
                return new DocumentStepBorderColor[i10];
            }
        }

        public DocumentStepBorderColor(@Nullable StyleElements.SimpleElementColor simpleElementColor) {
            this.imagePreview = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getImagePreview() {
            return this.imagePreview;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.imagePreview;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderRadius;", "Landroid/os/Parcelable;", "modal", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "imagePreview", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getModal", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getImagePreview", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class DocumentStepBorderRadius implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepBorderRadius> CREATOR = new Creator();

        @Nullable
        private final StyleElements.Measurement imagePreview;

        @Nullable
        private final StyleElements.Measurement modal;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentStepBorderRadius> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderRadius createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepBorderRadius(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderRadius[] newArray(int i10) {
                return new DocumentStepBorderRadius[i10];
            }
        }

        public DocumentStepBorderRadius(@Nullable StyleElements.Measurement measurement, @Nullable StyleElements.Measurement measurement2) {
            this.modal = measurement;
            this.imagePreview = measurement2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.Measurement getImagePreview() {
            return this.imagePreview;
        }

        @Nullable
        public final StyleElements.Measurement getModal() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.Measurement measurement = this.modal;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.imagePreview;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderWidth;", "Landroid/os/Parcelable;", "imagePreview", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getImagePreview", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class DocumentStepBorderWidth implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepBorderWidth> CREATOR = new Creator();

        @Nullable
        private final StyleElements.MeasurementSet imagePreview;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentStepBorderWidth> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderWidth createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepBorderWidth(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepBorderWidth[] newArray(int i10) {
                return new DocumentStepBorderWidth[i10];
            }
        }

        public DocumentStepBorderWidth(@Nullable StyleElements.MeasurementSet measurementSet) {
            this.imagePreview = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.MeasurementSet getImagePreview() {
            return this.imagePreview;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.MeasurementSet measurementSet = this.imagePreview;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepFillColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "imagePreviewPlusIcon", "imagePreviewXIcon", "imagePreviewMainArea", "imagePreviewCropArea", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getImagePreviewPlusIcon", "getImagePreviewXIcon", "getImagePreviewMainArea", "getImagePreviewCropArea", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class DocumentStepFillColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepFillColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Nullable
        private final StyleElements.SimpleElementColor imagePreviewCropArea;

        @Nullable
        private final StyleElements.SimpleElementColor imagePreviewMainArea;

        @Nullable
        private final StyleElements.SimpleElementColor imagePreviewPlusIcon;

        @Nullable
        private final StyleElements.SimpleElementColor imagePreviewXIcon;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentStepFillColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepFillColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepFillColor[] newArray(int i10) {
                return new DocumentStepFillColor[i10];
            }
        }

        public DocumentStepFillColor(@Nullable StyleElements.SimpleElementColor simpleElementColor, @Nullable StyleElements.SimpleElementColor simpleElementColor2, @Nullable StyleElements.SimpleElementColor simpleElementColor3, @Nullable StyleElements.SimpleElementColor simpleElementColor4, @Nullable StyleElements.SimpleElementColor simpleElementColor5) {
            this.base = simpleElementColor;
            this.imagePreviewPlusIcon = simpleElementColor2;
            this.imagePreviewXIcon = simpleElementColor3;
            this.imagePreviewMainArea = simpleElementColor4;
            this.imagePreviewCropArea = simpleElementColor5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getImagePreviewCropArea() {
            return this.imagePreviewCropArea;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getImagePreviewMainArea() {
            return this.imagePreviewMainArea;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getImagePreviewPlusIcon() {
            return this.imagePreviewPlusIcon;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getImagePreviewXIcon() {
            return this.imagePreviewXIcon;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.imagePreviewPlusIcon;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.imagePreviewXIcon;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.imagePreviewMainArea;
            if (simpleElementColor4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor4.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor5 = this.imagePreviewCropArea;
            if (simpleElementColor5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor5.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStrokeColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "imagePreviewPlusIcon", "imagePreviewXIcon", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getImagePreviewPlusIcon", "getImagePreviewXIcon", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class DocumentStepStrokeColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepStrokeColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Nullable
        private final StyleElements.SimpleElementColor imagePreviewPlusIcon;

        @Nullable
        private final StyleElements.SimpleElementColor imagePreviewXIcon;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentStepStrokeColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepStrokeColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepStrokeColor[] newArray(int i10) {
                return new DocumentStepStrokeColor[i10];
            }
        }

        public DocumentStepStrokeColor(@Nullable StyleElements.SimpleElementColor simpleElementColor, @Nullable StyleElements.SimpleElementColor simpleElementColor2, @Nullable StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.imagePreviewPlusIcon = simpleElementColor2;
            this.imagePreviewXIcon = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getImagePreviewPlusIcon() {
            return this.imagePreviewPlusIcon;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getImagePreviewXIcon() {
            return this.imagePreviewXIcon;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.imagePreviewPlusIcon;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.imagePreviewXIcon;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B©\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J\u0007\u0010\u0092\u0001\u001a\u00020CJ\u001b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020CR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010B\u001a\u0004\u0018\u00010C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010F\u001a\u0004\u0018\u00010C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0016\u0010H\u001a\u0004\u0018\u00010C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010ER\u0016\u0010J\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010N\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010MR\u0016\u0010P\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010MR\u0016\u0010R\u001a\u0004\u0018\u00010S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0016\u0010V\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0016\u0010Z\u001a\u0004\u0018\u00010S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010UR\u0016\u0010\\\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0016\u0010^\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010MR\u0016\u0010`\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010MR\u0016\u0010b\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010MR\u0016\u0010d\u001a\u0004\u0018\u00010K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010MR\u0016\u0010f\u001a\u0004\u0018\u00010C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010ER\u0016\u0010h\u001a\u0004\u0018\u00010i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0016\u0010l\u001a\u0004\u0018\u00010m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0016\u0010p\u001a\u0004\u0018\u00010q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0013\u0010t\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bu\u0010MR\u0013\u0010v\u001a\u0004\u0018\u00010K8F¢\u0006\u0006\u001a\u0004\bw\u0010MR\u0013\u0010x\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\by\u0010ER\u0013\u0010z\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\b{\u0010ER\u0013\u0010|\u001a\u0004\u0018\u00010}8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u007fR\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010C8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010ER\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010C8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010ER\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010C8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010ER\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010C8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010ER\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010C8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010ER\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u00010C8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010ER\u0017\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u00018F¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "backgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTitleComponentStyle;", "navBarTitleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTextBasedComponentStyle;", "disclaimerStyle", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStrokeColor;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepFillColor;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderColor;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderRadius;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderWidth;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderRadius;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderWidth;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;)V", "getHeaderButtonColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "getBackgroundImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTitleComponentStyle;", "getNavBarTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTextBasedComponentStyle;", "getDisclaimerStyle", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStrokeColor;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepFillColor;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderColor;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderRadius;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepBorderWidth;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "strokeColorValue", "getStrokeColorValue", "titleStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyleValue", "getNavBarTitleStyleValue", "textStyleValue", "getTextStyleValue", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "buttonSecondaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "cancelDialogCloseStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogResumeStyleValue", "getCancelDialogResumeStyleValue", "processingTitleStyleValue", "getProcessingTitleStyleValue", "processingTextStyleValue", "getProcessingTextStyleValue", "modalTitleStyleValue", "getModalTitleStyleValue", "modalTextStyleValue", "getModalTextStyleValue", "modalBackgroundColorValue", "getModalBackgroundColorValue", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "modalBorderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "backgroundImageName", "", "getBackgroundImageName", "()Ljava/lang/String;", "imageNameStyleValue", "getImageNameStyleValue", "disclaimerStyleValue", "getDisclaimerStyleValue", "headerButtonColorValue", "getHeaderButtonColorValue", "imagePreviewBorderColor", "getImagePreviewBorderColor", "imagePreviewBorderWidth", "", "getImagePreviewBorderWidth", "()Ljava/lang/Double;", "imagePreviewBorderRadius", "getImagePreviewBorderRadius", "imagePreviewPlusIconFillColor", "getImagePreviewPlusIconFillColor", "imagePreviewXIconFillColor", "getImagePreviewXIconFillColor", "imagePreviewMainAreaFillColor", "getImagePreviewMainAreaFillColor", "imagePreviewCropAreaFillColor", "getImagePreviewCropAreaFillColor", "imagePreviewPlusIconStrokeColor", "getImagePreviewPlusIconStrokeColor", "imagePreviewXIconStrokeColor", "getImagePreviewXIconStrokeColor", "pendingPageAlignmentValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getPendingPageAlignmentValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class DocumentStepStyle implements StepStyle {

        @NotNull
        public static final Parcelable.Creator<DocumentStepStyle> CREATOR = new Creator();

        @Nullable
        private final CombinedStepAlignment alignment;

        @Nullable
        private final StepBackgroundColorStyle backgroundColor;

        @Nullable
        private final StepBackgroundImageStyle backgroundImage;

        @Nullable
        private final DocumentStepBorderColor borderColor;

        @Nullable
        private final DocumentStepBorderRadius borderRadius;

        @Nullable
        private final DocumentStepBorderWidth borderWidth;

        @Nullable
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;

        @Nullable
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;

        @Nullable
        private final StepTextBasedComponentStyle disclaimerStyle;

        @Nullable
        private final DocumentStepFillColor fillColor;

        @Nullable
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;

        @Nullable
        private final StepTextBasedComponentStyle navBarTitleStyle;

        @Nullable
        private final StepPaddingStyle padding;

        @Nullable
        private final DocumentStepStrokeColor strokeColor;

        @Nullable
        private final DocumentStepTextBasedComponentStyle textStyle;

        @Nullable
        private final DocumentStepTitleComponentStyle titleStyle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentStepStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepBorderColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepBorderRadius.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DocumentStepBorderWidth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CombinedStepAlignment.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepStyle[] newArray(int i10) {
                return new DocumentStepStyle[i10];
            }
        }

        public DocumentStepStyle(@g(name = "textColor") @Nullable AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, @Nullable StepBackgroundColorStyle stepBackgroundColorStyle, @Nullable StepBackgroundImageStyle stepBackgroundImageStyle, @Nullable DocumentStepTitleComponentStyle documentStepTitleComponentStyle, @Nullable StepTextBasedComponentStyle stepTextBasedComponentStyle, @Nullable DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle, @Nullable StepTextBasedComponentStyle stepTextBasedComponentStyle2, @Nullable StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, @Nullable StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, @Nullable DocumentStepStrokeColor documentStepStrokeColor, @Nullable DocumentStepFillColor documentStepFillColor, @Nullable DocumentStepBorderColor documentStepBorderColor, @Nullable DocumentStepBorderRadius documentStepBorderRadius, @Nullable DocumentStepBorderWidth documentStepBorderWidth, @Nullable StepPaddingStyle stepPaddingStyle, @Nullable CombinedStepAlignment combinedStepAlignment) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = documentStepTitleComponentStyle;
            this.navBarTitleStyle = stepTextBasedComponentStyle;
            this.textStyle = documentStepTextBasedComponentStyle;
            this.disclaimerStyle = stepTextBasedComponentStyle2;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.strokeColor = documentStepStrokeColor;
            this.fillColor = documentStepFillColor;
            this.borderColor = documentStepBorderColor;
            this.borderRadius = documentStepBorderRadius;
            this.borderWidth = documentStepBorderWidth;
            this.padding = stepPaddingStyle;
            this.alignment = combinedStepAlignment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final CombinedStepAlignment getAlignment() {
            return this.alignment;
        }

        @Nullable
        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public String getBackgroundImageName() {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getLocalName();
        }

        @Nullable
        public final DocumentStepBorderColor getBorderColor() {
            return this.borderColor;
        }

        @Nullable
        public final DocumentStepBorderRadius getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        public final DocumentStepBorderWidth getBorderWidth() {
            return this.borderWidth;
        }

        @Nullable
        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        @Nullable
        public final StepTextBasedComponentStyle getDisclaimerStyle() {
            return this.disclaimerStyle;
        }

        @Nullable
        public final TextBasedComponentStyle getDisclaimerStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final DocumentStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (base = documentStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        @Nullable
        public final Integer getHeaderButtonColorValue() {
            StyleElements.SimpleElementColor headerButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null || (headerButton = headerButtonColorStyle.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final TextBasedComponentStyle getImageNameStyleValue() {
            StepTextBasedComponentStyleContainer imageName;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null || (imageName = documentStepTextBasedComponentStyle.getImageName()) == null) {
                return null;
            }
            return imageName.getBase();
        }

        @Nullable
        public final Integer getImagePreviewBorderColor() {
            StyleElements.SimpleElementColor imagePreview;
            StyleElements.SimpleElementColorValue base;
            DocumentStepBorderColor documentStepBorderColor = this.borderColor;
            if (documentStepBorderColor == null || (imagePreview = documentStepBorderColor.getImagePreview()) == null || (base = imagePreview.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Double getImagePreviewBorderRadius() {
            StyleElements.Measurement imagePreview;
            StyleElements.Size base;
            DocumentStepBorderRadius documentStepBorderRadius = this.borderRadius;
            if (documentStepBorderRadius == null || (imagePreview = documentStepBorderRadius.getImagePreview()) == null || (base = imagePreview.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        @Nullable
        public final Double getImagePreviewBorderWidth() {
            StyleElements.MeasurementSet imagePreview;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            DocumentStepBorderWidth documentStepBorderWidth = this.borderWidth;
            if (documentStepBorderWidth == null || (imagePreview = documentStepBorderWidth.getImagePreview()) == null || (base = imagePreview.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        @Nullable
        public final Integer getImagePreviewCropAreaFillColor() {
            StyleElements.SimpleElementColor imagePreviewCropArea;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewCropArea = documentStepFillColor.getImagePreviewCropArea()) == null || (base = imagePreviewCropArea.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getImagePreviewMainAreaFillColor() {
            StyleElements.SimpleElementColor imagePreviewMainArea;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewMainArea = documentStepFillColor.getImagePreviewMainArea()) == null || (base = imagePreviewMainArea.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getImagePreviewPlusIconFillColor() {
            StyleElements.SimpleElementColor imagePreviewPlusIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewPlusIcon = documentStepFillColor.getImagePreviewPlusIcon()) == null || (base = imagePreviewPlusIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getImagePreviewPlusIconStrokeColor() {
            StyleElements.SimpleElementColor imagePreviewPlusIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null || (imagePreviewPlusIcon = documentStepStrokeColor.getImagePreviewPlusIcon()) == null || (base = imagePreviewPlusIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getImagePreviewXIconFillColor() {
            StyleElements.SimpleElementColor imagePreviewXIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null || (imagePreviewXIcon = documentStepFillColor.getImagePreviewXIcon()) == null || (base = imagePreviewXIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getImagePreviewXIconStrokeColor() {
            StyleElements.SimpleElementColor imagePreviewXIcon;
            StyleElements.SimpleElementColorValue base;
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null || (imagePreviewXIcon = documentStepStrokeColor.getImagePreviewXIcon()) == null || (base = imagePreviewXIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getModalBackgroundColorValue() {
            StyleElements.SimpleElementColor modal;
            StyleElements.SimpleElementColorValue base;
            Integer value;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            return (stepBackgroundColorStyle == null || (modal = stepBackgroundColorStyle.getModal()) == null || (base = modal.getBase()) == null || (value = base.getValue()) == null) ? getBackgroundColorValue() : value;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.Size getModalBorderRadiusValue() {
            StyleElements.Measurement modal;
            DocumentStepBorderRadius documentStepBorderRadius = this.borderRadius;
            if (documentStepBorderRadius == null || (modal = documentStepBorderRadius.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle padding = getPadding();
            if (padding == null || (modal = padding.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTextStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            return (documentStepTextBasedComponentStyle == null || (modal = documentStepTextBasedComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTextStyleValue() : base;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTitleStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            return (documentStepTitleComponentStyle == null || (modal = documentStepTitleComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTitleStyleValue() : base;
        }

        @Nullable
        public final StepTextBasedComponentStyle getNavBarTitleStyle() {
            return this.navBarTitleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getNavBarTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Nullable
        public final StyleElements.PositionType getPendingPageAlignmentValue() {
            StyleElements.Position pendingPage;
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null || (pendingPage = combinedStepAlignment.getPendingPage()) == null) {
                return null;
            }
            return pendingPage.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer documentProcessingText;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null || (documentProcessingText = documentStepTextBasedComponentStyle.getDocumentProcessingText()) == null) {
                return null;
            }
            return documentProcessingText.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer documentProcessingTitle;
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            if (documentStepTitleComponentStyle == null || (documentProcessingTitle = documentStepTitleComponentStyle.getDocumentProcessingTitle()) == null) {
                return null;
            }
            return documentProcessingTitle.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getScreenPaddingValue() {
            return super.getScreenPaddingValue();
        }

        @Nullable
        public final DocumentStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null || (base = documentStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final DocumentStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null || (base = documentStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final DocumentStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            if (documentStepTitleComponentStyle == null || (base = documentStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                headerButtonColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(dest, flags);
            }
            DocumentStepTitleComponentStyle documentStepTitleComponentStyle = this.titleStyle;
            if (documentStepTitleComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentStepTitleComponentStyle.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            DocumentStepTextBasedComponentStyle documentStepTextBasedComponentStyle = this.textStyle;
            if (documentStepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentStepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle2 = this.disclaimerStyle;
            if (stepTextBasedComponentStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyle2.writeToParcel(dest, flags);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            DocumentStepStrokeColor documentStepStrokeColor = this.strokeColor;
            if (documentStepStrokeColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentStepStrokeColor.writeToParcel(dest, flags);
            }
            DocumentStepFillColor documentStepFillColor = this.fillColor;
            if (documentStepFillColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentStepFillColor.writeToParcel(dest, flags);
            }
            DocumentStepBorderColor documentStepBorderColor = this.borderColor;
            if (documentStepBorderColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentStepBorderColor.writeToParcel(dest, flags);
            }
            DocumentStepBorderRadius documentStepBorderRadius = this.borderRadius;
            if (documentStepBorderRadius == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentStepBorderRadius.writeToParcel(dest, flags);
            }
            DocumentStepBorderWidth documentStepBorderWidth = this.borderWidth;
            if (documentStepBorderWidth == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                documentStepBorderWidth.writeToParcel(dest, flags);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPaddingStyle.writeToParcel(dest, flags);
            }
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                combinedStepAlignment.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "governmentIdSelectOption", "governmentIdCaptureFeedBox", "governmentIdReviewImageBox", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getGovernmentIdSelectOption", "getGovernmentIdCaptureFeedBox", "getGovernmentIdReviewImageBox", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepBorderColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepBorderColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Nullable
        private final StyleElements.SimpleElementColor governmentIdCaptureFeedBox;

        @Nullable
        private final StyleElements.SimpleElementColor governmentIdReviewImageBox;

        @Nullable
        private final StyleElements.SimpleElementColor governmentIdSelectOption;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepBorderColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepBorderColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderColor[] newArray(int i10) {
                return new GovernmentIdStepBorderColor[i10];
            }
        }

        public GovernmentIdStepBorderColor(@Nullable StyleElements.SimpleElementColor simpleElementColor, @Nullable StyleElements.SimpleElementColor simpleElementColor2, @Nullable StyleElements.SimpleElementColor simpleElementColor3, @Nullable StyleElements.SimpleElementColor simpleElementColor4) {
            this.base = simpleElementColor;
            this.governmentIdSelectOption = simpleElementColor2;
            this.governmentIdCaptureFeedBox = simpleElementColor3;
            this.governmentIdReviewImageBox = simpleElementColor4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getGovernmentIdReviewImageBox() {
            return this.governmentIdReviewImageBox;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getGovernmentIdSelectOption() {
            return this.governmentIdSelectOption;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.governmentIdSelectOption;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.governmentIdCaptureFeedBox;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.governmentIdReviewImageBox;
            if (simpleElementColor4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor4.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderRadius;", "Landroid/os/Parcelable;", "modal", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "governmentIdCaptureFeedBox", "governmentIdReviewImageBox", "staticCaptureTips", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getModal", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "getGovernmentIdCaptureFeedBox", "getGovernmentIdReviewImageBox", "getStaticCaptureTips", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepBorderRadius implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepBorderRadius> CREATOR = new Creator();

        @Nullable
        private final StyleElements.Measurement governmentIdCaptureFeedBox;

        @Nullable
        private final StyleElements.Measurement governmentIdReviewImageBox;

        @Nullable
        private final StyleElements.Measurement modal;

        @Nullable
        private final StyleElements.Measurement staticCaptureTips;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepBorderRadius> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderRadius createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepBorderRadius(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.Measurement.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderRadius[] newArray(int i10) {
                return new GovernmentIdStepBorderRadius[i10];
            }
        }

        public GovernmentIdStepBorderRadius(@Nullable StyleElements.Measurement measurement, @Nullable StyleElements.Measurement measurement2, @Nullable StyleElements.Measurement measurement3, @Nullable StyleElements.Measurement measurement4) {
            this.modal = measurement;
            this.governmentIdCaptureFeedBox = measurement2;
            this.governmentIdReviewImageBox = measurement3;
            this.staticCaptureTips = measurement4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.Measurement getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        @Nullable
        public final StyleElements.Measurement getGovernmentIdReviewImageBox() {
            return this.governmentIdReviewImageBox;
        }

        @Nullable
        public final StyleElements.Measurement getModal() {
            return this.modal;
        }

        @Nullable
        public final StyleElements.Measurement getStaticCaptureTips() {
            return this.staticCaptureTips;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.Measurement measurement = this.modal;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement2 = this.governmentIdCaptureFeedBox;
            if (measurement2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement2.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement3 = this.governmentIdReviewImageBox;
            if (measurement3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement3.writeToParcel(dest, flags);
            }
            StyleElements.Measurement measurement4 = this.staticCaptureTips;
            if (measurement4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement4.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderWidth;", "Landroid/os/Parcelable;", "governmentIdSelectOption", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "governmentIdCaptureFeedBox", "governmentIdReviewImageBox", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getGovernmentIdSelectOption", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "getGovernmentIdCaptureFeedBox", "getGovernmentIdReviewImageBox", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepBorderWidth implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepBorderWidth> CREATOR = new Creator();

        @Nullable
        private final StyleElements.MeasurementSet governmentIdCaptureFeedBox;

        @Nullable
        private final StyleElements.MeasurementSet governmentIdReviewImageBox;

        @Nullable
        private final StyleElements.MeasurementSet governmentIdSelectOption;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepBorderWidth> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderWidth createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepBorderWidth(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepBorderWidth[] newArray(int i10) {
                return new GovernmentIdStepBorderWidth[i10];
            }
        }

        public GovernmentIdStepBorderWidth(@Nullable StyleElements.MeasurementSet measurementSet, @Nullable StyleElements.MeasurementSet measurementSet2, @Nullable StyleElements.MeasurementSet measurementSet3) {
            this.governmentIdSelectOption = measurementSet;
            this.governmentIdCaptureFeedBox = measurementSet2;
            this.governmentIdReviewImageBox = measurementSet3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.MeasurementSet getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        @Nullable
        public final StyleElements.MeasurementSet getGovernmentIdReviewImageBox() {
            return this.governmentIdReviewImageBox;
        }

        @Nullable
        public final StyleElements.MeasurementSet getGovernmentIdSelectOption() {
            return this.governmentIdSelectOption;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.MeasurementSet measurementSet = this.governmentIdSelectOption;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
            StyleElements.MeasurementSet measurementSet2 = this.governmentIdCaptureFeedBox;
            if (measurementSet2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet2.writeToParcel(dest, flags);
            }
            StyleElements.MeasurementSet measurementSet3 = this.governmentIdReviewImageBox;
            if (measurementSet3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet3.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepFillColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "governmentIdSelectOptionIcon", "capturePageHintIcon", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getGovernmentIdSelectOptionIcon", "getCapturePageHintIcon", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepFillColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepFillColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Nullable
        private final StyleElements.SimpleElementColor capturePageHintIcon;

        @Nullable
        private final StyleElements.SimpleElementColor governmentIdSelectOptionIcon;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepFillColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepFillColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepFillColor[] newArray(int i10) {
                return new GovernmentIdStepFillColor[i10];
            }
        }

        public GovernmentIdStepFillColor(@Nullable StyleElements.SimpleElementColor simpleElementColor, @Nullable StyleElements.SimpleElementColor simpleElementColor2, @Nullable StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.governmentIdSelectOptionIcon = simpleElementColor2;
            this.capturePageHintIcon = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getCapturePageHintIcon() {
            return this.capturePageHintIcon;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getGovernmentIdSelectOptionIcon() {
            return this.governmentIdSelectOptionIcon;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.governmentIdSelectOptionIcon;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.capturePageHintIcon;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyle;", "Landroid/os/Parcelable;", "illustration", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;)V", "getIllustration", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepImageLocalStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepImageLocalStyle> CREATOR = new Creator();

        @Nullable
        private final GovernmentIdStepImageLocalStyleContainer illustration;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepImageLocalStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepImageLocalStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepImageLocalStyle(parcel.readInt() == 0 ? null : GovernmentIdStepImageLocalStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepImageLocalStyle[] newArray(int i10) {
                return new GovernmentIdStepImageLocalStyle[i10];
            }
        }

        public GovernmentIdStepImageLocalStyle(@Nullable GovernmentIdStepImageLocalStyleContainer governmentIdStepImageLocalStyleContainer) {
            this.illustration = governmentIdStepImageLocalStyleContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final GovernmentIdStepImageLocalStyleContainer getIllustration() {
            return this.illustration;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            GovernmentIdStepImageLocalStyleContainer governmentIdStepImageLocalStyleContainer = this.illustration;
            if (governmentIdStepImageLocalStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepImageLocalStyleContainer.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepImageLocalStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepImageLocalStyleContainer> CREATOR = new Creator();

        @Nullable
        private final LocalImageComponentStyle base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepImageLocalStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepImageLocalStyleContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepImageLocalStyleContainer(parcel.readInt() == 0 ? null : LocalImageComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepImageLocalStyleContainer[] newArray(int i10) {
                return new GovernmentIdStepImageLocalStyleContainer[i10];
            }
        }

        public GovernmentIdStepImageLocalStyleContainer(@Nullable LocalImageComponentStyle localImageComponentStyle) {
            this.base = localImageComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final LocalImageComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            LocalImageComponentStyle localImageComponentStyle = this.base;
            if (localImageComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                localImageComponentStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$InputSelectStyleContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$InputSelectStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$InputSelectStyleContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepInputSelectStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepInputSelectStyle> CREATOR = new Creator();

        @Nullable
        private final InputSelectStyleContainer base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepInputSelectStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepInputSelectStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepInputSelectStyle(parcel.readInt() == 0 ? null : InputSelectStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepInputSelectStyle[] newArray(int i10) {
                return new GovernmentIdStepInputSelectStyle[i10];
            }
        }

        public GovernmentIdStepInputSelectStyle(@Nullable InputSelectStyleContainer inputSelectStyleContainer) {
            this.base = inputSelectStyleContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final InputSelectStyleContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            InputSelectStyleContainer inputSelectStyleContainer = this.base;
            if (inputSelectStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputSelectStyleContainer.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "cancelDialogClose", "submitPhotoButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "getCancelDialogClose", "getSubmitPhotoButton", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepPrimaryButtonComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepPrimaryButtonComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepSubmitButtonComponentStyleContainer base;

        @Nullable
        private final StepSubmitButtonComponentStyleContainer cancelDialogClose;

        @Nullable
        private final StepSubmitButtonComponentStyleContainer submitPhotoButton;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepPrimaryButtonComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepPrimaryButtonComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepPrimaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepPrimaryButtonComponentStyle[] newArray(int i10) {
                return new GovernmentIdStepPrimaryButtonComponentStyle[i10];
            }
        }

        public GovernmentIdStepPrimaryButtonComponentStyle(@Nullable StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer, @Nullable StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2, @Nullable StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer3) {
            this.base = stepSubmitButtonComponentStyleContainer;
            this.cancelDialogClose = stepSubmitButtonComponentStyleContainer2;
            this.submitPhotoButton = stepSubmitButtonComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepSubmitButtonComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepSubmitButtonComponentStyleContainer getCancelDialogClose() {
            return this.cancelDialogClose;
        }

        @Nullable
        public final StepSubmitButtonComponentStyleContainer getSubmitPhotoButton() {
            return this.submitPhotoButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer = this.base;
            if (stepSubmitButtonComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepSubmitButtonComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2 = this.cancelDialogClose;
            if (stepSubmitButtonComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepSubmitButtonComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer3 = this.submitPhotoButton;
            if (stepSubmitButtonComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepSubmitButtonComponentStyleContainer3.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepRowHeight;", "Landroid/os/Parcelable;", "governmentIdSelectOptionMinRowHeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getGovernmentIdSelectOptionMinRowHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepRowHeight implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepRowHeight> CREATOR = new Creator();

        @Nullable
        private final StyleElements.Measurement governmentIdSelectOptionMinRowHeight;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepRowHeight> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepRowHeight createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepRowHeight(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepRowHeight[] newArray(int i10) {
                return new GovernmentIdStepRowHeight[i10];
            }
        }

        public GovernmentIdStepRowHeight(@Nullable StyleElements.Measurement measurement) {
            this.governmentIdSelectOptionMinRowHeight = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.Measurement getGovernmentIdSelectOptionMinRowHeight() {
            return this.governmentIdSelectOptionMinRowHeight;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.Measurement measurement = this.governmentIdSelectOptionMinRowHeight;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "cancelDialogResume", "retakePhotoButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "getCancelDialogResume", "getRetakePhotoButton", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepSecondaryButtonComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepSecondaryButtonComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepCancelButtonComponentStyleContainer base;

        @Nullable
        private final StepCancelButtonComponentStyleContainer cancelDialogResume;

        @Nullable
        private final StepCancelButtonComponentStyleContainer retakePhotoButton;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepSecondaryButtonComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepSecondaryButtonComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepSecondaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepSecondaryButtonComponentStyle[] newArray(int i10) {
                return new GovernmentIdStepSecondaryButtonComponentStyle[i10];
            }
        }

        public GovernmentIdStepSecondaryButtonComponentStyle(@Nullable StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer, @Nullable StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2, @Nullable StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer3) {
            this.base = stepCancelButtonComponentStyleContainer;
            this.cancelDialogResume = stepCancelButtonComponentStyleContainer2;
            this.retakePhotoButton = stepCancelButtonComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepCancelButtonComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepCancelButtonComponentStyleContainer getCancelDialogResume() {
            return this.cancelDialogResume;
        }

        @Nullable
        public final StepCancelButtonComponentStyleContainer getRetakePhotoButton() {
            return this.retakePhotoButton;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer = this.base;
            if (stepCancelButtonComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepCancelButtonComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2 = this.cancelDialogResume;
            if (stepCancelButtonComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepCancelButtonComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer3 = this.retakePhotoButton;
            if (stepCancelButtonComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepCancelButtonComponentStyleContainer3.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStrokeColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "governmentIdSelectOptionIcon", "governmentIdSelectOptionChevron", "capturePageHintIcon", "governmentIdCaptureFeedBox", "captureOverlayHeaderButton", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getGovernmentIdSelectOptionIcon", "getGovernmentIdSelectOptionChevron", "getCapturePageHintIcon", "getGovernmentIdCaptureFeedBox", "getCaptureOverlayHeaderButton", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepStrokeColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepStrokeColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Nullable
        private final StyleElements.SimpleElementColor captureOverlayHeaderButton;

        @Nullable
        private final StyleElements.SimpleElementColor capturePageHintIcon;

        @Nullable
        private final StyleElements.SimpleElementColor governmentIdCaptureFeedBox;

        @Nullable
        private final StyleElements.SimpleElementColor governmentIdSelectOptionChevron;

        @Nullable
        private final StyleElements.SimpleElementColor governmentIdSelectOptionIcon;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepStrokeColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepStrokeColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepStrokeColor[] newArray(int i10) {
                return new GovernmentIdStepStrokeColor[i10];
            }
        }

        public GovernmentIdStepStrokeColor(@Nullable StyleElements.SimpleElementColor simpleElementColor, @Nullable StyleElements.SimpleElementColor simpleElementColor2, @Nullable StyleElements.SimpleElementColor simpleElementColor3, @Nullable StyleElements.SimpleElementColor simpleElementColor4, @Nullable StyleElements.SimpleElementColor simpleElementColor5, @Nullable StyleElements.SimpleElementColor simpleElementColor6) {
            this.base = simpleElementColor;
            this.governmentIdSelectOptionIcon = simpleElementColor2;
            this.governmentIdSelectOptionChevron = simpleElementColor3;
            this.capturePageHintIcon = simpleElementColor4;
            this.governmentIdCaptureFeedBox = simpleElementColor5;
            this.captureOverlayHeaderButton = simpleElementColor6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getCaptureOverlayHeaderButton() {
            return this.captureOverlayHeaderButton;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getCapturePageHintIcon() {
            return this.capturePageHintIcon;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getGovernmentIdCaptureFeedBox() {
            return this.governmentIdCaptureFeedBox;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getGovernmentIdSelectOptionChevron() {
            return this.governmentIdSelectOptionChevron;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getGovernmentIdSelectOptionIcon() {
            return this.governmentIdSelectOptionIcon;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.governmentIdSelectOptionIcon;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.governmentIdSelectOptionChevron;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.capturePageHintIcon;
            if (simpleElementColor4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor4.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor5 = this.governmentIdCaptureFeedBox;
            if (simpleElementColor5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor5.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor6 = this.captureOverlayHeaderButton;
            if (simpleElementColor6 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor6.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010&¢\u0006\u0004\b'\u0010(J\u0007\u0010¾\u0001\u001a\u00020OJ\u001b\u0010¿\u0001\u001a\u00030À\u00012\b\u0010Á\u0001\u001a\u00030Â\u00012\u0007\u0010Ã\u0001\u001a\u00020OR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b9\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\u001f\u001a\u0004\u0018\u00010 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0013\u0010#\u001a\u0004\u0018\u00010$¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0016\u0010N\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010R\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0016\u0010T\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010QR\u0016\u0010V\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0016\u0010Z\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0016\u0010\\\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010YR\u0016\u0010^\u001a\u0004\u0018\u00010_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0016\u0010b\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0016\u0010f\u001a\u0004\u0018\u00010_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010aR\u0016\u0010h\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010eR\u0016\u0010j\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010YR\u0016\u0010l\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010YR\u0016\u0010n\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010YR\u0016\u0010p\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010YR\u0016\u0010r\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010QR\u0016\u0010t\u001a\u0004\u0018\u00010u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0016\u0010x\u001a\u0004\u0018\u00010y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0016\u0010|\u001a\u0004\u0018\u00010}8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0080\u0001\u001a\u0004\u0018\u00010_8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010aR\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010c8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010eR\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010W8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010YR\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010W8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010YR\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010W8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010YR\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010W8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010YR\u0015\u0010\u008c\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010QR\u0015\u0010\u008e\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010QR\u0015\u0010\u0090\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010QR\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010QR\u0015\u0010\u0094\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010QR\u0015\u0010\u0096\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010QR\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010QR\u0015\u0010\u009a\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010QR\u0017\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0017\u0010 \u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010\u009f\u0001R\u0015\u0010¢\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b£\u0001\u0010QR\u0015\u0010¤\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010QR\u0015\u0010¦\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b§\u0001\u0010QR\u0015\u0010¨\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b©\u0001\u0010QR\u0017\u0010ª\u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b«\u0001\u0010\u009f\u0001R\u0017\u0010¬\u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010\u009f\u0001R\u0017\u0010®\u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b¯\u0001\u0010\u009f\u0001R\u0017\u0010°\u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b±\u0001\u0010\u009f\u0001R\u0017\u0010²\u0001\u001a\u0005\u0018\u00010³\u00018F¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0015\u0010¶\u0001\u001a\u0004\u0018\u00010W8F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010YR\u0015\u0010¸\u0001\u001a\u0004\u0018\u00010W8F¢\u0006\u0007\u001a\u0005\b¹\u0001\u0010YR\u0015\u0010º\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b»\u0001\u0010QR\u0017\u0010¼\u0001\u001a\u0005\u0018\u00010\u009d\u00018F¢\u0006\b\u001a\u0006\b½\u0001\u0010\u009f\u0001¨\u0006Ä\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "backgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTitleComponentStyle;", "navBarTitleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;", "disclaimerStyle", "height", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepRowHeight;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStrokeColor;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepFillColor;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderColor;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderRadius;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderWidth;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "inputSelectStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "imageLocalStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyle;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepRowHeight;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderRadius;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderWidth;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;)V", "getHeaderButtonColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "getBackgroundImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTitleComponentStyle;", "getNavBarTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepPrimaryButtonComponentStyle;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepSecondaryButtonComponentStyle;", "getDisclaimerStyle", "getHeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepRowHeight;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStrokeColor;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepFillColor;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderColor;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderRadius;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepBorderWidth;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "getInputSelectStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepInputSelectStyle;", "getImageLocalStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepImageLocalStyle;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "strokeColorValue", "getStrokeColorValue", "titleStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyleValue", "getNavBarTitleStyleValue", "textStyleValue", "getTextStyleValue", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "buttonSecondaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "cancelDialogCloseStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogResumeStyleValue", "getCancelDialogResumeStyleValue", "processingTitleStyleValue", "getProcessingTitleStyleValue", "processingTextStyleValue", "getProcessingTextStyleValue", "modalTitleStyleValue", "getModalTitleStyleValue", "modalTextStyleValue", "getModalTextStyleValue", "modalBackgroundColorValue", "getModalBackgroundColorValue", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "modalBorderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "backgroundImageName", "", "getBackgroundImageName", "()Ljava/lang/String;", "submitPhotoButtonStyleValue", "getSubmitPhotoButtonStyleValue", "retakePhotoButtonStyleValue", "getRetakePhotoButtonStyleValue", "governmentIdVerticalOptionTextStyle", "getGovernmentIdVerticalOptionTextStyle", "governmentIdCaptureHintTextStyle", "getGovernmentIdCaptureHintTextStyle", "governmentIdCaptureDescriptionStyle", "getGovernmentIdCaptureDescriptionStyle", "disclaimerStyleValue", "getDisclaimerStyleValue", "activeOptionBackgroundColorValue", "getActiveOptionBackgroundColorValue", "headerButtonColorValue", "getHeaderButtonColorValue", "governmentIdSelectOptionBorderColorValue", "getGovernmentIdSelectOptionBorderColorValue", "chevronColor", "getChevronColor", "governmentIdIconStrokeColor", "getGovernmentIdIconStrokeColor", "governmentIdIconFillColor", "getGovernmentIdIconFillColor", "captureHintIconStrokeColor", "getCaptureHintIconStrokeColor", "captureHintIconFillColor", "getCaptureHintIconFillColor", "governmentIdSelectOptionMinRowHeight", "", "getGovernmentIdSelectOptionMinRowHeight", "()Ljava/lang/Double;", "governmentIdOptionBorderWidthValue", "getGovernmentIdOptionBorderWidthValue", "capturePageHeaderIconColorValue", "getCapturePageHeaderIconColorValue", "governmentIdCaptureFeedBoxStrokeColorValue", "getGovernmentIdCaptureFeedBoxStrokeColorValue", "governmentIdCaptureFeedBoxBorderColorValue", "getGovernmentIdCaptureFeedBoxBorderColorValue", "governmentIdReviewImageBoxBorderColorValue", "getGovernmentIdReviewImageBoxBorderColorValue", "governmentIdCaptureFeedBoxBorderWidthValue", "getGovernmentIdCaptureFeedBoxBorderWidthValue", "governmentIdReviewImageBoxBorderWidthValue", "getGovernmentIdReviewImageBoxBorderWidthValue", "governmentIdCaptureFeedBoxBorderRadiusValue", "getGovernmentIdCaptureFeedBoxBorderRadiusValue", "governmentIdReviewImageBoxBorderRadiusValue", "getGovernmentIdReviewImageBoxBorderRadiusValue", "pendingPageAlignmentValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getPendingPageAlignmentValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "staticCaptureTipsTitleStyle", "getStaticCaptureTipsTitleStyle", "staticCaptureTipsSubtextStyle", "getStaticCaptureTipsSubtextStyle", "staticCaptureTipsBackgroundColor", "getStaticCaptureTipsBackgroundColor", "staticCaptureTipsBorderRadius", "getStaticCaptureTipsBorderRadius", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepStyle implements StepStyle {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepStyle> CREATOR = new Creator();

        @Nullable
        private final CombinedStepAlignment alignment;

        @Nullable
        private final StepBackgroundColorStyle backgroundColor;

        @Nullable
        private final StepBackgroundImageStyle backgroundImage;

        @Nullable
        private final GovernmentIdStepBorderColor borderColor;

        @Nullable
        private final GovernmentIdStepBorderRadius borderRadius;

        @Nullable
        private final GovernmentIdStepBorderWidth borderWidth;

        @Nullable
        private final GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle;

        @Nullable
        private final GovernmentIdStepSecondaryButtonComponentStyle buttonSecondaryStyle;

        @Nullable
        private final StepTextBasedComponentStyle disclaimerStyle;

        @Nullable
        private final GovernmentIdStepFillColor fillColor;

        @Nullable
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;

        @Nullable
        private final GovernmentIdStepRowHeight height;

        @Nullable
        private final GovernmentIdStepImageLocalStyle imageLocalStyle;

        @Nullable
        private final GovernmentIdStepInputSelectStyle inputSelectStyle;

        @Nullable
        private final StepTextBasedComponentStyle navBarTitleStyle;

        @Nullable
        private final StepPaddingStyle padding;

        @Nullable
        private final GovernmentIdStepStrokeColor strokeColor;

        @Nullable
        private final GovernmentIdStepTextBasedComponentStyle textStyle;

        @Nullable
        private final GovernmentIdStepTitleComponentStyle titleStyle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepRowHeight.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepBorderColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepBorderRadius.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepBorderWidth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepInputSelectStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GovernmentIdStepImageLocalStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CombinedStepAlignment.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepStyle[] newArray(int i10) {
                return new GovernmentIdStepStyle[i10];
            }
        }

        public GovernmentIdStepStyle(@g(name = "textColor") @Nullable AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, @Nullable StepBackgroundColorStyle stepBackgroundColorStyle, @Nullable StepBackgroundImageStyle stepBackgroundImageStyle, @Nullable GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle, @Nullable StepTextBasedComponentStyle stepTextBasedComponentStyle, @Nullable GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle, @Nullable GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle, @Nullable GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle, @Nullable StepTextBasedComponentStyle stepTextBasedComponentStyle2, @Nullable GovernmentIdStepRowHeight governmentIdStepRowHeight, @Nullable GovernmentIdStepStrokeColor governmentIdStepStrokeColor, @Nullable GovernmentIdStepFillColor governmentIdStepFillColor, @Nullable GovernmentIdStepBorderColor governmentIdStepBorderColor, @Nullable GovernmentIdStepBorderRadius governmentIdStepBorderRadius, @Nullable GovernmentIdStepBorderWidth governmentIdStepBorderWidth, @Nullable StepPaddingStyle stepPaddingStyle, @Nullable GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle, @Nullable GovernmentIdStepImageLocalStyle governmentIdStepImageLocalStyle, @Nullable CombinedStepAlignment combinedStepAlignment) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = governmentIdStepTitleComponentStyle;
            this.navBarTitleStyle = stepTextBasedComponentStyle;
            this.textStyle = governmentIdStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = governmentIdStepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = governmentIdStepSecondaryButtonComponentStyle;
            this.disclaimerStyle = stepTextBasedComponentStyle2;
            this.height = governmentIdStepRowHeight;
            this.strokeColor = governmentIdStepStrokeColor;
            this.fillColor = governmentIdStepFillColor;
            this.borderColor = governmentIdStepBorderColor;
            this.borderRadius = governmentIdStepBorderRadius;
            this.borderWidth = governmentIdStepBorderWidth;
            this.padding = stepPaddingStyle;
            this.inputSelectStyle = governmentIdStepInputSelectStyle;
            this.imageLocalStyle = governmentIdStepImageLocalStyle;
            this.alignment = combinedStepAlignment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final Integer getActiveOptionBackgroundColorValue() {
            StyleElements.ComplexElementColor option;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (option = stepBackgroundColorStyle.getOption()) == null) {
                return null;
            }
            return option.getActive();
        }

        @Nullable
        public final CombinedStepAlignment getAlignment() {
            return this.alignment;
        }

        @Nullable
        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public String getBackgroundImageName() {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getLocalName();
        }

        @Nullable
        public final GovernmentIdStepBorderColor getBorderColor() {
            return this.borderColor;
        }

        @Nullable
        public final GovernmentIdStepBorderRadius getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        public final GovernmentIdStepBorderWidth getBorderWidth() {
            return this.borderWidth;
        }

        @Nullable
        public final GovernmentIdStepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null || (base = governmentIdStepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final GovernmentIdStepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null || (base = governmentIdStepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null || (cancelDialogClose = governmentIdStepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null || (cancelDialogResume = governmentIdStepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        @Nullable
        public final Integer getCaptureHintIconFillColor() {
            StyleElements.SimpleElementColor capturePageHintIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null || (capturePageHintIcon = governmentIdStepFillColor.getCapturePageHintIcon()) == null || (base = capturePageHintIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getCaptureHintIconStrokeColor() {
            StyleElements.SimpleElementColor capturePageHintIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (capturePageHintIcon = governmentIdStepStrokeColor.getCapturePageHintIcon()) == null || (base = capturePageHintIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getCapturePageHeaderIconColorValue() {
            StyleElements.SimpleElementColor captureOverlayHeaderButton;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (captureOverlayHeaderButton = governmentIdStepStrokeColor.getCaptureOverlayHeaderButton()) == null || (base = captureOverlayHeaderButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getChevronColor() {
            StyleElements.SimpleElementColor governmentIdSelectOptionChevron;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (governmentIdSelectOptionChevron = governmentIdStepStrokeColor.getGovernmentIdSelectOptionChevron()) == null || (base = governmentIdSelectOptionChevron.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final StepTextBasedComponentStyle getDisclaimerStyle() {
            return this.disclaimerStyle;
        }

        @Nullable
        public final TextBasedComponentStyle getDisclaimerStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final GovernmentIdStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null || (base = governmentIdStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final TextBasedComponentStyle getGovernmentIdCaptureDescriptionStyle() {
            StepTextBasedComponentStyleContainer governmentIdCaptureDescription;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdCaptureDescription = governmentIdStepTextBasedComponentStyle.getGovernmentIdCaptureDescription()) == null) {
                return null;
            }
            return governmentIdCaptureDescription.getBase();
        }

        @Nullable
        public final Integer getGovernmentIdCaptureFeedBoxBorderColorValue() {
            StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null || (governmentIdCaptureFeedBox = governmentIdStepBorderColor.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Double getGovernmentIdCaptureFeedBoxBorderRadiusValue() {
            StyleElements.Measurement governmentIdCaptureFeedBox;
            StyleElements.Size base;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (governmentIdCaptureFeedBox = governmentIdStepBorderRadius.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        @Nullable
        public final Double getGovernmentIdCaptureFeedBoxBorderWidthValue() {
            StyleElements.MeasurementSet governmentIdCaptureFeedBox;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null || (governmentIdCaptureFeedBox = governmentIdStepBorderWidth.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        @Nullable
        public final Integer getGovernmentIdCaptureFeedBoxStrokeColorValue() {
            StyleElements.SimpleElementColor governmentIdCaptureFeedBox;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (governmentIdCaptureFeedBox = governmentIdStepStrokeColor.getGovernmentIdCaptureFeedBox()) == null || (base = governmentIdCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final TextBasedComponentStyle getGovernmentIdCaptureHintTextStyle() {
            StepTextBasedComponentStyleContainer governmentIdCaptureHintText;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdCaptureHintText = governmentIdStepTextBasedComponentStyle.getGovernmentIdCaptureHintText()) == null) {
                return null;
            }
            return governmentIdCaptureHintText.getBase();
        }

        @Nullable
        public final Integer getGovernmentIdIconFillColor() {
            StyleElements.SimpleElementColor governmentIdSelectOptionIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null || (governmentIdSelectOptionIcon = governmentIdStepFillColor.getGovernmentIdSelectOptionIcon()) == null || (base = governmentIdSelectOptionIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getGovernmentIdIconStrokeColor() {
            StyleElements.SimpleElementColor governmentIdSelectOptionIcon;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (governmentIdSelectOptionIcon = governmentIdStepStrokeColor.getGovernmentIdSelectOptionIcon()) == null || (base = governmentIdSelectOptionIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Double getGovernmentIdOptionBorderWidthValue() {
            StyleElements.MeasurementSet governmentIdSelectOption;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null || (governmentIdSelectOption = governmentIdStepBorderWidth.getGovernmentIdSelectOption()) == null || (base = governmentIdSelectOption.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        @Nullable
        public final Integer getGovernmentIdReviewImageBoxBorderColorValue() {
            StyleElements.SimpleElementColor governmentIdReviewImageBox;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null || (governmentIdReviewImageBox = governmentIdStepBorderColor.getGovernmentIdReviewImageBox()) == null || (base = governmentIdReviewImageBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Double getGovernmentIdReviewImageBoxBorderRadiusValue() {
            StyleElements.Measurement governmentIdReviewImageBox;
            StyleElements.Size base;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (governmentIdReviewImageBox = governmentIdStepBorderRadius.getGovernmentIdReviewImageBox()) == null || (base = governmentIdReviewImageBox.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        @Nullable
        public final Double getGovernmentIdReviewImageBoxBorderWidthValue() {
            StyleElements.MeasurementSet governmentIdReviewImageBox;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null || (governmentIdReviewImageBox = governmentIdStepBorderWidth.getGovernmentIdReviewImageBox()) == null || (base = governmentIdReviewImageBox.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        @Nullable
        public final Integer getGovernmentIdSelectOptionBorderColorValue() {
            StyleElements.SimpleElementColor governmentIdSelectOption;
            StyleElements.SimpleElementColorValue base;
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null || (governmentIdSelectOption = governmentIdStepBorderColor.getGovernmentIdSelectOption()) == null || (base = governmentIdSelectOption.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Double getGovernmentIdSelectOptionMinRowHeight() {
            StyleElements.Measurement governmentIdSelectOptionMinRowHeight;
            StyleElements.Size base;
            GovernmentIdStepRowHeight governmentIdStepRowHeight = this.height;
            if (governmentIdStepRowHeight == null || (governmentIdSelectOptionMinRowHeight = governmentIdStepRowHeight.getGovernmentIdSelectOptionMinRowHeight()) == null || (base = governmentIdSelectOptionMinRowHeight.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        @Nullable
        public final TextBasedComponentStyle getGovernmentIdVerticalOptionTextStyle() {
            StepTextBasedComponentStyleContainer governmentIdVerticalOption;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdVerticalOption = governmentIdStepTextBasedComponentStyle.getGovernmentIdVerticalOption()) == null) {
                return null;
            }
            return governmentIdVerticalOption.getBase();
        }

        @Nullable
        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        @Nullable
        public final Integer getHeaderButtonColorValue() {
            StyleElements.SimpleElementColor headerButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null || (headerButton = headerButtonColorStyle.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final GovernmentIdStepRowHeight getHeight() {
            return this.height;
        }

        @Nullable
        public final GovernmentIdStepImageLocalStyle getImageLocalStyle() {
            return this.imageLocalStyle;
        }

        @Nullable
        public final GovernmentIdStepInputSelectStyle getInputSelectStyle() {
            return this.inputSelectStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getModalBackgroundColorValue() {
            StyleElements.SimpleElementColor modal;
            StyleElements.SimpleElementColorValue base;
            Integer value;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            return (stepBackgroundColorStyle == null || (modal = stepBackgroundColorStyle.getModal()) == null || (base = modal.getBase()) == null || (value = base.getValue()) == null) ? getBackgroundColorValue() : value;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.Size getModalBorderRadiusValue() {
            StyleElements.Measurement modal;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (modal = governmentIdStepBorderRadius.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle padding = getPadding();
            if (padding == null || (modal = padding.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTextStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            return (governmentIdStepTextBasedComponentStyle == null || (modal = governmentIdStepTextBasedComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTextStyleValue() : base;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTitleStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            return (governmentIdStepTitleComponentStyle == null || (modal = governmentIdStepTitleComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTitleStyleValue() : base;
        }

        @Nullable
        public final StepTextBasedComponentStyle getNavBarTitleStyle() {
            return this.navBarTitleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getNavBarTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Nullable
        public final StyleElements.PositionType getPendingPageAlignmentValue() {
            StyleElements.Position pendingPage;
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null || (pendingPage = combinedStepAlignment.getPendingPage()) == null) {
                return null;
            }
            return pendingPage.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer governmentIdProcessingText;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (governmentIdProcessingText = governmentIdStepTextBasedComponentStyle.getGovernmentIdProcessingText()) == null) {
                return null;
            }
            return governmentIdProcessingText.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer governmentIdProcessingTitle;
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            if (governmentIdStepTitleComponentStyle == null || (governmentIdProcessingTitle = governmentIdStepTitleComponentStyle.getGovernmentIdProcessingTitle()) == null) {
                return null;
            }
            return governmentIdProcessingTitle.getBase();
        }

        @Nullable
        public final ButtonCancelComponentStyle getRetakePhotoButtonStyleValue() {
            StepCancelButtonComponentStyleContainer retakePhotoButton;
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null || (retakePhotoButton = governmentIdStepSecondaryButtonComponentStyle.getRetakePhotoButton()) == null) {
                return null;
            }
            return retakePhotoButton.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getScreenPaddingValue() {
            return super.getScreenPaddingValue();
        }

        @Nullable
        public final Integer getStaticCaptureTipsBackgroundColor() {
            StyleElements.SimpleElementColor staticCaptureTips;
            StyleElements.SimpleElementColorValue base;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (staticCaptureTips = stepBackgroundColorStyle.getStaticCaptureTips()) == null || (base = staticCaptureTips.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Double getStaticCaptureTipsBorderRadius() {
            StyleElements.Measurement staticCaptureTips;
            StyleElements.Size base;
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null || (staticCaptureTips = governmentIdStepBorderRadius.getStaticCaptureTips()) == null || (base = staticCaptureTips.getBase()) == null) {
                return null;
            }
            return base.getDp();
        }

        @Nullable
        public final TextBasedComponentStyle getStaticCaptureTipsSubtextStyle() {
            StepTextBasedComponentStyleContainer staticCaptureTipsSubtext;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (staticCaptureTipsSubtext = governmentIdStepTextBasedComponentStyle.getStaticCaptureTipsSubtext()) == null) {
                return null;
            }
            return staticCaptureTipsSubtext.getBase();
        }

        @Nullable
        public final TextBasedComponentStyle getStaticCaptureTipsTitleStyle() {
            StepTextBasedComponentStyleContainer staticCaptureTipsTitle;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (staticCaptureTipsTitle = governmentIdStepTextBasedComponentStyle.getStaticCaptureTipsTitle()) == null) {
                return null;
            }
            return staticCaptureTipsTitle.getBase();
        }

        @Nullable
        public final GovernmentIdStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null || (base = governmentIdStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final ButtonSubmitComponentStyle getSubmitPhotoButtonStyleValue() {
            StepSubmitButtonComponentStyleContainer submitPhotoButton;
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null || (submitPhotoButton = governmentIdStepPrimaryButtonComponentStyle.getSubmitPhotoButton()) == null) {
                return null;
            }
            return submitPhotoButton.getBase();
        }

        @Nullable
        public final GovernmentIdStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null || (base = governmentIdStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final GovernmentIdStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            if (governmentIdStepTitleComponentStyle == null || (base = governmentIdStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                headerButtonColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(dest, flags);
            }
            GovernmentIdStepTitleComponentStyle governmentIdStepTitleComponentStyle = this.titleStyle;
            if (governmentIdStepTitleComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepTitleComponentStyle.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            GovernmentIdStepTextBasedComponentStyle governmentIdStepTextBasedComponentStyle = this.textStyle;
            if (governmentIdStepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            GovernmentIdStepPrimaryButtonComponentStyle governmentIdStepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (governmentIdStepPrimaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepPrimaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            GovernmentIdStepSecondaryButtonComponentStyle governmentIdStepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (governmentIdStepSecondaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepSecondaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle2 = this.disclaimerStyle;
            if (stepTextBasedComponentStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyle2.writeToParcel(dest, flags);
            }
            GovernmentIdStepRowHeight governmentIdStepRowHeight = this.height;
            if (governmentIdStepRowHeight == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepRowHeight.writeToParcel(dest, flags);
            }
            GovernmentIdStepStrokeColor governmentIdStepStrokeColor = this.strokeColor;
            if (governmentIdStepStrokeColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepStrokeColor.writeToParcel(dest, flags);
            }
            GovernmentIdStepFillColor governmentIdStepFillColor = this.fillColor;
            if (governmentIdStepFillColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepFillColor.writeToParcel(dest, flags);
            }
            GovernmentIdStepBorderColor governmentIdStepBorderColor = this.borderColor;
            if (governmentIdStepBorderColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepBorderColor.writeToParcel(dest, flags);
            }
            GovernmentIdStepBorderRadius governmentIdStepBorderRadius = this.borderRadius;
            if (governmentIdStepBorderRadius == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepBorderRadius.writeToParcel(dest, flags);
            }
            GovernmentIdStepBorderWidth governmentIdStepBorderWidth = this.borderWidth;
            if (governmentIdStepBorderWidth == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepBorderWidth.writeToParcel(dest, flags);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPaddingStyle.writeToParcel(dest, flags);
            }
            GovernmentIdStepInputSelectStyle governmentIdStepInputSelectStyle = this.inputSelectStyle;
            if (governmentIdStepInputSelectStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepInputSelectStyle.writeToParcel(dest, flags);
            }
            GovernmentIdStepImageLocalStyle governmentIdStepImageLocalStyle = this.imageLocalStyle;
            if (governmentIdStepImageLocalStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdStepImageLocalStyle.writeToParcel(dest, flags);
            }
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                combinedStepAlignment.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$InputSelectStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputSelectComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class InputSelectStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputSelectStyleContainer> CREATOR = new Creator();

        @Nullable
        private final InputSelectComponentStyle base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InputSelectStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectStyleContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputSelectStyleContainer(parcel.readInt() == 0 ? null : InputSelectComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InputSelectStyleContainer[] newArray(int i10) {
                return new InputSelectStyleContainer[i10];
            }
        }

        public InputSelectStyleContainer(@Nullable InputSelectComponentStyle inputSelectComponentStyle) {
            this.base = inputSelectComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final InputSelectComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            InputSelectComponentStyle inputSelectComponentStyle = this.base;
            if (inputSelectComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                inputSelectComponentStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u001bHÆ\u0003J¥\u0001\u0010w\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0006\u0010x\u001a\u000209J\u0013\u0010y\u001a\u00020z2\b\u0010{\u001a\u0004\u0018\u00010|HÖ\u0003J\t\u0010}\u001a\u000209HÖ\u0001J\t\u0010~\u001a\u00020gHÖ\u0001J\u001a\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u000209R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0016\u0010>\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0016\u0010@\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0016\u0010D\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0016\u0010F\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0016\u0010H\u001a\u0004\u0018\u00010I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010L\u001a\u0004\u0018\u00010M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010P\u001a\u0004\u0018\u00010I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010KR\u0016\u0010R\u001a\u0004\u0018\u00010M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010OR\u0016\u0010T\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010CR\u0016\u0010V\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010CR\u0016\u0010X\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010CR\u0016\u0010Z\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010CR\u0016\u0010\\\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010;R\u0016\u0010^\u001a\u0004\u0018\u00010_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0016\u0010b\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0016\u0010f\u001a\u0004\u0018\u00010g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006\u0084\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "backgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTitleComponentStyle;", "navBarTitleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTextBasedComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStrokeColor;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepFillColor;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepAlignment;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepAlignment;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;)V", "getHeaderButtonColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "getBackgroundImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTitleComponentStyle;", "getNavBarTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTextBasedComponentStyle;", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStrokeColor;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepFillColor;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepAlignment;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "strokeColorValue", "getStrokeColorValue", "titleStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyleValue", "getNavBarTitleStyleValue", "textStyleValue", "getTextStyleValue", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "buttonSecondaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "cancelDialogCloseStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogResumeStyleValue", "getCancelDialogResumeStyleValue", "processingTitleStyleValue", "getProcessingTitleStyleValue", "processingTextStyleValue", "getProcessingTextStyleValue", "modalTitleStyleValue", "getModalTitleStyleValue", "modalTextStyleValue", "getModalTextStyleValue", "modalBackgroundColorValue", "getModalBackgroundColorValue", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "modalBorderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "backgroundImageName", "", "getBackgroundImageName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class IntegrationStepStyle implements StepStyle {

        @NotNull
        public static final Parcelable.Creator<IntegrationStepStyle> CREATOR = new Creator();

        @Nullable
        private final UiStepAlignment alignment;

        @Nullable
        private final StepBackgroundColorStyle backgroundColor;

        @Nullable
        private final StepBackgroundImageStyle backgroundImage;

        @Nullable
        private final StepBorderRadiusStyle borderRadius;

        @Nullable
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;

        @Nullable
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;

        @Nullable
        private final UiStepFillColor fillColor;

        @Nullable
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;

        @Nullable
        private final StepTextBasedComponentStyle navBarTitleStyle;

        @Nullable
        private final StepPaddingStyle padding;

        @Nullable
        private final UiStepStrokeColor strokeColor;

        @Nullable
        private final UiStepTextBasedComponentStyle textStyle;

        @Nullable
        private final UiStepTitleComponentStyle titleStyle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IntegrationStepStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationStepStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegrationStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepAlignment.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepBorderRadiusStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntegrationStepStyle[] newArray(int i10) {
                return new IntegrationStepStyle[i10];
            }
        }

        public IntegrationStepStyle(@g(name = "textColor") @Nullable AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, @Nullable StepBackgroundColorStyle stepBackgroundColorStyle, @Nullable StepBackgroundImageStyle stepBackgroundImageStyle, @Nullable UiStepTitleComponentStyle uiStepTitleComponentStyle, @Nullable StepTextBasedComponentStyle stepTextBasedComponentStyle, @Nullable UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle, @Nullable StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, @Nullable StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, @Nullable UiStepStrokeColor uiStepStrokeColor, @Nullable UiStepFillColor uiStepFillColor, @Nullable UiStepAlignment uiStepAlignment, @Nullable StepPaddingStyle stepPaddingStyle, @Nullable StepBorderRadiusStyle stepBorderRadiusStyle) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = uiStepTitleComponentStyle;
            this.navBarTitleStyle = stepTextBasedComponentStyle;
            this.textStyle = uiStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.strokeColor = uiStepStrokeColor;
            this.fillColor = uiStepFillColor;
            this.alignment = uiStepAlignment;
            this.padding = stepPaddingStyle;
            this.borderRadius = stepBorderRadiusStyle;
        }

        public static /* synthetic */ IntegrationStepStyle copy$default(IntegrationStepStyle integrationStepStyle, AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, UiStepTitleComponentStyle uiStepTitleComponentStyle, StepTextBasedComponentStyle stepTextBasedComponentStyle, UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle, StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, UiStepStrokeColor uiStepStrokeColor, UiStepFillColor uiStepFillColor, UiStepAlignment uiStepAlignment, StepPaddingStyle stepPaddingStyle, StepBorderRadiusStyle stepBorderRadiusStyle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                headerButtonColorStyle = integrationStepStyle.headerButtonColor;
            }
            return integrationStepStyle.copy(headerButtonColorStyle, (i10 & 2) != 0 ? integrationStepStyle.backgroundColor : stepBackgroundColorStyle, (i10 & 4) != 0 ? integrationStepStyle.backgroundImage : stepBackgroundImageStyle, (i10 & 8) != 0 ? integrationStepStyle.titleStyle : uiStepTitleComponentStyle, (i10 & 16) != 0 ? integrationStepStyle.navBarTitleStyle : stepTextBasedComponentStyle, (i10 & 32) != 0 ? integrationStepStyle.textStyle : uiStepTextBasedComponentStyle, (i10 & 64) != 0 ? integrationStepStyle.buttonPrimaryStyle : stepPrimaryButtonComponentStyle, (i10 & 128) != 0 ? integrationStepStyle.buttonSecondaryStyle : stepSecondaryButtonComponentStyle, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? integrationStepStyle.strokeColor : uiStepStrokeColor, (i10 & Barcode.FORMAT_UPC_A) != 0 ? integrationStepStyle.fillColor : uiStepFillColor, (i10 & Barcode.FORMAT_UPC_E) != 0 ? integrationStepStyle.alignment : uiStepAlignment, (i10 & Barcode.FORMAT_PDF417) != 0 ? integrationStepStyle.padding : stepPaddingStyle, (i10 & Barcode.FORMAT_AZTEC) != 0 ? integrationStepStyle.borderRadius : stepBorderRadiusStyle);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final UiStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final UiStepAlignment getAlignment() {
            return this.alignment;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final UiStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final StepTextBasedComponentStyle getNavBarTitleStyle() {
            return this.navBarTitleStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final UiStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final UiStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @NotNull
        public final IntegrationStepStyle copy(@g(name = "textColor") @Nullable AttributeStyles.HeaderButtonColorStyle headerButtonColor, @Nullable StepBackgroundColorStyle backgroundColor, @Nullable StepBackgroundImageStyle backgroundImage, @Nullable UiStepTitleComponentStyle titleStyle, @Nullable StepTextBasedComponentStyle navBarTitleStyle, @Nullable UiStepTextBasedComponentStyle textStyle, @Nullable StepPrimaryButtonComponentStyle buttonPrimaryStyle, @Nullable StepSecondaryButtonComponentStyle buttonSecondaryStyle, @Nullable UiStepStrokeColor strokeColor, @Nullable UiStepFillColor fillColor, @Nullable UiStepAlignment alignment, @Nullable StepPaddingStyle padding, @Nullable StepBorderRadiusStyle borderRadius) {
            return new IntegrationStepStyle(headerButtonColor, backgroundColor, backgroundImage, titleStyle, navBarTitleStyle, textStyle, buttonPrimaryStyle, buttonSecondaryStyle, strokeColor, fillColor, alignment, padding, borderRadius);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegrationStepStyle)) {
                return false;
            }
            IntegrationStepStyle integrationStepStyle = (IntegrationStepStyle) other;
            return Intrinsics.c(this.headerButtonColor, integrationStepStyle.headerButtonColor) && Intrinsics.c(this.backgroundColor, integrationStepStyle.backgroundColor) && Intrinsics.c(this.backgroundImage, integrationStepStyle.backgroundImage) && Intrinsics.c(this.titleStyle, integrationStepStyle.titleStyle) && Intrinsics.c(this.navBarTitleStyle, integrationStepStyle.navBarTitleStyle) && Intrinsics.c(this.textStyle, integrationStepStyle.textStyle) && Intrinsics.c(this.buttonPrimaryStyle, integrationStepStyle.buttonPrimaryStyle) && Intrinsics.c(this.buttonSecondaryStyle, integrationStepStyle.buttonSecondaryStyle) && Intrinsics.c(this.strokeColor, integrationStepStyle.strokeColor) && Intrinsics.c(this.fillColor, integrationStepStyle.fillColor) && Intrinsics.c(this.alignment, integrationStepStyle.alignment) && Intrinsics.c(this.padding, integrationStepStyle.padding) && Intrinsics.c(this.borderRadius, integrationStepStyle.borderRadius);
        }

        @Nullable
        public final UiStepAlignment getAlignment() {
            return this.alignment;
        }

        @Nullable
        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public String getBackgroundImageName() {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getLocalName();
        }

        @Nullable
        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        @Nullable
        public final UiStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            UiStepFillColor uiStepFillColor = this.fillColor;
            if (uiStepFillColor == null || (base = uiStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getModalBackgroundColorValue() {
            StyleElements.SimpleElementColor modal;
            StyleElements.SimpleElementColorValue base;
            Integer value;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            return (stepBackgroundColorStyle == null || (modal = stepBackgroundColorStyle.getModal()) == null || (base = modal.getBase()) == null || (value = base.getValue()) == null) ? getBackgroundColorValue() : value;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.Size getModalBorderRadiusValue() {
            StyleElements.Measurement modal;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null || (modal = stepBorderRadiusStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle padding = getPadding();
            if (padding == null || (modal = padding.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTextStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            return (uiStepTextBasedComponentStyle == null || (modal = uiStepTextBasedComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTextStyleValue() : base;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTitleStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            return (uiStepTitleComponentStyle == null || (modal = uiStepTitleComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTitleStyleValue() : base;
        }

        @Nullable
        public final StepTextBasedComponentStyle getNavBarTitleStyle() {
            return this.navBarTitleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getNavBarTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer uiStepProcessingText;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null || (uiStepProcessingText = uiStepTextBasedComponentStyle.getUiStepProcessingText()) == null) {
                return null;
            }
            return uiStepProcessingText.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer uiStepProcessingTitle;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null || (uiStepProcessingTitle = uiStepTitleComponentStyle.getUiStepProcessingTitle()) == null) {
                return null;
            }
            return uiStepProcessingTitle.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getScreenPaddingValue() {
            return super.getScreenPaddingValue();
        }

        @Nullable
        public final UiStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            if (uiStepStrokeColor == null || (base = uiStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final UiStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null || (base = uiStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final UiStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null || (base = uiStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public int hashCode() {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            int iHashCode = (headerButtonColorStyle == null ? 0 : headerButtonColorStyle.hashCode()) * 31;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            int iHashCode2 = (iHashCode + (stepBackgroundColorStyle == null ? 0 : stepBackgroundColorStyle.hashCode())) * 31;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            int iHashCode3 = (iHashCode2 + (stepBackgroundImageStyle == null ? 0 : stepBackgroundImageStyle.hashCode())) * 31;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            int iHashCode4 = (iHashCode3 + (uiStepTitleComponentStyle == null ? 0 : uiStepTitleComponentStyle.hashCode())) * 31;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            int iHashCode5 = (iHashCode4 + (stepTextBasedComponentStyle == null ? 0 : stepTextBasedComponentStyle.hashCode())) * 31;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            int iHashCode6 = (iHashCode5 + (uiStepTextBasedComponentStyle == null ? 0 : uiStepTextBasedComponentStyle.hashCode())) * 31;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            int iHashCode7 = (iHashCode6 + (stepPrimaryButtonComponentStyle == null ? 0 : stepPrimaryButtonComponentStyle.hashCode())) * 31;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            int iHashCode8 = (iHashCode7 + (stepSecondaryButtonComponentStyle == null ? 0 : stepSecondaryButtonComponentStyle.hashCode())) * 31;
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            int iHashCode9 = (iHashCode8 + (uiStepStrokeColor == null ? 0 : uiStepStrokeColor.hashCode())) * 31;
            UiStepFillColor uiStepFillColor = this.fillColor;
            int iHashCode10 = (iHashCode9 + (uiStepFillColor == null ? 0 : uiStepFillColor.hashCode())) * 31;
            UiStepAlignment uiStepAlignment = this.alignment;
            int iHashCode11 = (iHashCode10 + (uiStepAlignment == null ? 0 : uiStepAlignment.hashCode())) * 31;
            StepPaddingStyle stepPaddingStyle = this.padding;
            int iHashCode12 = (iHashCode11 + (stepPaddingStyle == null ? 0 : stepPaddingStyle.hashCode())) * 31;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            return iHashCode12 + (stepBorderRadiusStyle != null ? stepBorderRadiusStyle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "IntegrationStepStyle(headerButtonColor=" + this.headerButtonColor + ", backgroundColor=" + this.backgroundColor + ", backgroundImage=" + this.backgroundImage + ", titleStyle=" + this.titleStyle + ", navBarTitleStyle=" + this.navBarTitleStyle + ", textStyle=" + this.textStyle + ", buttonPrimaryStyle=" + this.buttonPrimaryStyle + ", buttonSecondaryStyle=" + this.buttonSecondaryStyle + ", strokeColor=" + this.strokeColor + ", fillColor=" + this.fillColor + ", alignment=" + this.alignment + ", padding=" + this.padding + ", borderRadius=" + this.borderRadius + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                headerButtonColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(dest, flags);
            }
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepTitleComponentStyle.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            if (uiStepStrokeColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepStrokeColor.writeToParcel(dest, flags);
            }
            UiStepFillColor uiStepFillColor = this.fillColor;
            if (uiStepFillColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepFillColor.writeToParcel(dest, flags);
            }
            UiStepAlignment uiStepAlignment = this.alignment;
            if (uiStepAlignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepAlignment.writeToParcel(dest, flags);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPaddingStyle.writeToParcel(dest, flags);
            }
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBorderRadiusStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderColor;", "Landroid/os/Parcelable;", "selfieCaptureFeedBox", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getSelfieCaptureFeedBox", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfieStepBorderColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepBorderColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor selfieCaptureFeedBox;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepBorderColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepBorderColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepBorderColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepBorderColor[] newArray(int i10) {
                return new SelfieStepBorderColor[i10];
            }
        }

        public SelfieStepBorderColor(@Nullable StyleElements.SimpleElementColor simpleElementColor) {
            this.selfieCaptureFeedBox = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getSelfieCaptureFeedBox() {
            return this.selfieCaptureFeedBox;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.selfieCaptureFeedBox;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderWidth;", "Landroid/os/Parcelable;", "selfieCaptureFeedBox", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;)V", "getSelfieCaptureFeedBox", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$MeasurementSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfieStepBorderWidth implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepBorderWidth> CREATOR = new Creator();

        @Nullable
        private final StyleElements.MeasurementSet selfieCaptureFeedBox;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepBorderWidth> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepBorderWidth createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepBorderWidth(parcel.readInt() == 0 ? null : StyleElements.MeasurementSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepBorderWidth[] newArray(int i10) {
                return new SelfieStepBorderWidth[i10];
            }
        }

        public SelfieStepBorderWidth(@Nullable StyleElements.MeasurementSet measurementSet) {
            this.selfieCaptureFeedBox = measurementSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.MeasurementSet getSelfieCaptureFeedBox() {
            return this.selfieCaptureFeedBox;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.MeasurementSet measurementSet = this.selfieCaptureFeedBox;
            if (measurementSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurementSet.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepFillColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "selfieCaptureIconFillColor", "selfieCaptureIconBackgroundFillColor", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getSelfieCaptureIconFillColor", "getSelfieCaptureIconBackgroundFillColor", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfieStepFillColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepFillColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Nullable
        private final StyleElements.SimpleElementColor selfieCaptureIconBackgroundFillColor;

        @Nullable
        private final StyleElements.SimpleElementColor selfieCaptureIconFillColor;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepFillColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepFillColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepFillColor[] newArray(int i10) {
                return new SelfieStepFillColor[i10];
            }
        }

        public SelfieStepFillColor(@Nullable StyleElements.SimpleElementColor simpleElementColor, @Nullable StyleElements.SimpleElementColor simpleElementColor2, @Nullable StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.selfieCaptureIconFillColor = simpleElementColor2;
            this.selfieCaptureIconBackgroundFillColor = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getSelfieCaptureIconBackgroundFillColor() {
            return this.selfieCaptureIconBackgroundFillColor;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getSelfieCaptureIconFillColor() {
            return this.selfieCaptureIconFillColor;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.selfieCaptureIconFillColor;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.selfieCaptureIconBackgroundFillColor;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepImageLocalStyle;", "Landroid/os/Parcelable;", "selfieStartIcon", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepImageLocalStyleContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepImageLocalStyleContainer;)V", "getSelfieStartIcon", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepImageLocalStyleContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfieStepImageLocalStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepImageLocalStyle> CREATOR = new Creator();

        @Nullable
        private final SelfieStepImageLocalStyleContainer selfieStartIcon;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepImageLocalStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepImageLocalStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepImageLocalStyle(parcel.readInt() == 0 ? null : SelfieStepImageLocalStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepImageLocalStyle[] newArray(int i10) {
                return new SelfieStepImageLocalStyle[i10];
            }
        }

        public SelfieStepImageLocalStyle(@Nullable SelfieStepImageLocalStyleContainer selfieStepImageLocalStyleContainer) {
            this.selfieStartIcon = selfieStepImageLocalStyleContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final SelfieStepImageLocalStyleContainer getSelfieStartIcon() {
            return this.selfieStartIcon;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            SelfieStepImageLocalStyleContainer selfieStepImageLocalStyleContainer = this.selfieStartIcon;
            if (selfieStepImageLocalStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieStepImageLocalStyleContainer.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepImageLocalStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfieStepImageLocalStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepImageLocalStyleContainer> CREATOR = new Creator();

        @Nullable
        private final LocalImageComponentStyle base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepImageLocalStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepImageLocalStyleContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepImageLocalStyleContainer(parcel.readInt() == 0 ? null : LocalImageComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepImageLocalStyleContainer[] newArray(int i10) {
                return new SelfieStepImageLocalStyleContainer[i10];
            }
        }

        public SelfieStepImageLocalStyleContainer(@Nullable LocalImageComponentStyle localImageComponentStyle) {
            this.base = localImageComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final LocalImageComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            LocalImageComponentStyle localImageComponentStyle = this.base;
            if (localImageComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                localImageComponentStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStrokeColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "selfieCaptureIconStrokeColor", "captureOverlayHeaderButton", "captureCompleteIcon", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getSelfieCaptureIconStrokeColor", "getCaptureOverlayHeaderButton", "getCaptureCompleteIcon", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfieStepStrokeColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepStrokeColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Nullable
        private final StyleElements.SimpleElementColor captureCompleteIcon;

        @Nullable
        private final StyleElements.SimpleElementColor captureOverlayHeaderButton;

        @Nullable
        private final StyleElements.SimpleElementColor selfieCaptureIconStrokeColor;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepStrokeColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepStrokeColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepStrokeColor[] newArray(int i10) {
                return new SelfieStepStrokeColor[i10];
            }
        }

        public SelfieStepStrokeColor(@Nullable StyleElements.SimpleElementColor simpleElementColor, @Nullable StyleElements.SimpleElementColor simpleElementColor2, @Nullable StyleElements.SimpleElementColor simpleElementColor3, @Nullable StyleElements.SimpleElementColor simpleElementColor4) {
            this.base = simpleElementColor;
            this.selfieCaptureIconStrokeColor = simpleElementColor2;
            this.captureOverlayHeaderButton = simpleElementColor3;
            this.captureCompleteIcon = simpleElementColor4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getCaptureCompleteIcon() {
            return this.captureCompleteIcon;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getCaptureOverlayHeaderButton() {
            return this.captureOverlayHeaderButton;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getSelfieCaptureIconStrokeColor() {
            return this.selfieCaptureIconStrokeColor;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.selfieCaptureIconStrokeColor;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.captureOverlayHeaderButton;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor4 = this.captureCompleteIcon;
            if (simpleElementColor4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor4.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B³\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u0007\u0010\u009a\u0001\u001a\u00020GJ\u001b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00020GR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010F\u001a\u0004\u0018\u00010G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0016\u0010J\u001a\u0004\u0018\u00010G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0016\u0010L\u001a\u0004\u0018\u00010G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010IR\u0016\u0010N\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0016\u0010R\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0016\u0010T\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010QR\u0016\u0010V\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0016\u0010Z\u001a\u0004\u0018\u00010[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0016\u0010^\u001a\u0004\u0018\u00010W8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010YR\u0016\u0010`\u001a\u0004\u0018\u00010[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010]R\u0016\u0010b\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010QR\u0016\u0010d\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010QR\u0016\u0010f\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010QR\u0016\u0010h\u001a\u0004\u0018\u00010O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010QR\u0016\u0010j\u001a\u0004\u0018\u00010G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010IR\u0016\u0010l\u001a\u0004\u0018\u00010m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0016\u0010p\u001a\u0004\u0018\u00010q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010sR\u0016\u0010t\u001a\u0004\u0018\u00010u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010x\u001a\u0004\u0018\u00010O8F¢\u0006\u0006\u001a\u0004\by\u0010QR\u0013\u0010z\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\b{\u0010IR\u0013\u0010|\u001a\u0004\u0018\u00010}8F¢\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0080\u0001\u001a\u0004\u0018\u00010G8F¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010IR\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010G8F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010IR\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010G8F¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010IR\u0015\u0010\u0086\u0001\u001a\u0004\u0018\u00010G8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010IR\u0015\u0010\u0088\u0001\u001a\u0004\u0018\u00010G8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010IR\u0015\u0010\u008a\u0001\u001a\u0004\u0018\u00010G8F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010IR\u0017\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u00018F¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0015\u0010\u0090\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010QR\u0017\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0015\u0010\u0096\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010QR\u0015\u0010\u0098\u0001\u001a\u0004\u0018\u00010O8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010Q¨\u0006 \u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "backgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTitleComponentStyle;", "navBarTitleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTextBasedComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "disclaimerStyle", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStrokeColor;", "borderColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderColor;", "borderWidth", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderWidth;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepFillColor;", "imageLocalStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepImageLocalStyle;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderWidth;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepImageLocalStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;)V", "getHeaderButtonColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "getBackgroundImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTitleComponentStyle;", "getNavBarTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTextBasedComponentStyle;", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "getDisclaimerStyle", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStrokeColor;", "getBorderColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderColor;", "getBorderWidth", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepBorderWidth;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepFillColor;", "getImageLocalStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepImageLocalStyle;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$CombinedStepAlignment;", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "strokeColorValue", "getStrokeColorValue", "titleStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyleValue", "getNavBarTitleStyleValue", "textStyleValue", "getTextStyleValue", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "buttonSecondaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "cancelDialogCloseStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogResumeStyleValue", "getCancelDialogResumeStyleValue", "processingTitleStyleValue", "getProcessingTitleStyleValue", "processingTextStyleValue", "getProcessingTextStyleValue", "modalTitleStyleValue", "getModalTitleStyleValue", "modalTextStyleValue", "getModalTextStyleValue", "modalBackgroundColorValue", "getModalBackgroundColorValue", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "modalBorderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "backgroundImageName", "", "getBackgroundImageName", "()Ljava/lang/String;", "disclaimerStyleValue", "getDisclaimerStyleValue", "headerButtonColorValue", "getHeaderButtonColorValue", "selfieStartIconStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "getSelfieStartIconStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/LocalImageComponentStyle;", "capturePageHeaderIconColorValue", "getCapturePageHeaderIconColorValue", "selfieCaptureIconStrokeColor", "getSelfieCaptureIconStrokeColor", "captureCompleteIconStrokeColor", "getCaptureCompleteIconStrokeColor", "selfieCaptureIconFillColor", "getSelfieCaptureIconFillColor", "selfieCaptureIconBackgroundFillColor", "getSelfieCaptureIconBackgroundFillColor", "selfieCaptureFeedBoxBorderColorValue", "getSelfieCaptureFeedBoxBorderColorValue", "selfieCaptureFeedBoxBorderWidthValue", "", "getSelfieCaptureFeedBoxBorderWidthValue", "()Ljava/lang/Double;", "selfieCaptureHintTextStyle", "getSelfieCaptureHintTextStyle", "pendingPageAlignmentValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getPendingPageAlignmentValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "selfieSmallText", "getSelfieSmallText", "selfieCaptureDisclaimerTextStyle", "getSelfieCaptureDisclaimerTextStyle", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfieStepStyle implements StepStyle {

        @NotNull
        public static final Parcelable.Creator<SelfieStepStyle> CREATOR = new Creator();

        @Nullable
        private final CombinedStepAlignment alignment;

        @Nullable
        private final StepBackgroundColorStyle backgroundColor;

        @Nullable
        private final StepBackgroundImageStyle backgroundImage;

        @Nullable
        private final SelfieStepBorderColor borderColor;

        @Nullable
        private final StepBorderRadiusStyle borderRadius;

        @Nullable
        private final SelfieStepBorderWidth borderWidth;

        @Nullable
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;

        @Nullable
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;

        @Nullable
        private final StepTextBasedComponentStyle disclaimerStyle;

        @Nullable
        private final SelfieStepFillColor fillColor;

        @Nullable
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;

        @Nullable
        private final SelfieStepImageLocalStyle imageLocalStyle;

        @Nullable
        private final StepTextBasedComponentStyle navBarTitleStyle;

        @Nullable
        private final StepPaddingStyle padding;

        @Nullable
        private final SelfieStepStrokeColor strokeColor;

        @Nullable
        private final SelfieStepTextBasedComponentStyle textStyle;

        @Nullable
        private final SelfieStepTitleComponentStyle titleStyle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepBorderColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepBorderWidth.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelfieStepImageLocalStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBorderRadiusStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CombinedStepAlignment.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepStyle[] newArray(int i10) {
                return new SelfieStepStyle[i10];
            }
        }

        public SelfieStepStyle(@g(name = "textColor") @Nullable AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, @Nullable StepBackgroundColorStyle stepBackgroundColorStyle, @Nullable StepBackgroundImageStyle stepBackgroundImageStyle, @Nullable SelfieStepTitleComponentStyle selfieStepTitleComponentStyle, @Nullable StepTextBasedComponentStyle stepTextBasedComponentStyle, @Nullable SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle, @Nullable StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, @Nullable StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, @Nullable StepTextBasedComponentStyle stepTextBasedComponentStyle2, @Nullable SelfieStepStrokeColor selfieStepStrokeColor, @Nullable SelfieStepBorderColor selfieStepBorderColor, @Nullable SelfieStepBorderWidth selfieStepBorderWidth, @Nullable SelfieStepFillColor selfieStepFillColor, @Nullable SelfieStepImageLocalStyle selfieStepImageLocalStyle, @Nullable StepPaddingStyle stepPaddingStyle, @Nullable StepBorderRadiusStyle stepBorderRadiusStyle, @Nullable CombinedStepAlignment combinedStepAlignment) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = selfieStepTitleComponentStyle;
            this.navBarTitleStyle = stepTextBasedComponentStyle;
            this.textStyle = selfieStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.disclaimerStyle = stepTextBasedComponentStyle2;
            this.strokeColor = selfieStepStrokeColor;
            this.borderColor = selfieStepBorderColor;
            this.borderWidth = selfieStepBorderWidth;
            this.fillColor = selfieStepFillColor;
            this.imageLocalStyle = selfieStepImageLocalStyle;
            this.padding = stepPaddingStyle;
            this.borderRadius = stepBorderRadiusStyle;
            this.alignment = combinedStepAlignment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final CombinedStepAlignment getAlignment() {
            return this.alignment;
        }

        @Nullable
        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public String getBackgroundImageName() {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getLocalName();
        }

        @Nullable
        public final SelfieStepBorderColor getBorderColor() {
            return this.borderColor;
        }

        @Nullable
        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        public final SelfieStepBorderWidth getBorderWidth() {
            return this.borderWidth;
        }

        @Nullable
        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        @Nullable
        public final Integer getCaptureCompleteIconStrokeColor() {
            StyleElements.SimpleElementColor captureCompleteIcon;
            StyleElements.SimpleElementColorValue base;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (captureCompleteIcon = selfieStepStrokeColor.getCaptureCompleteIcon()) == null || (base = captureCompleteIcon.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getCapturePageHeaderIconColorValue() {
            StyleElements.SimpleElementColor captureOverlayHeaderButton;
            StyleElements.SimpleElementColorValue base;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (captureOverlayHeaderButton = selfieStepStrokeColor.getCaptureOverlayHeaderButton()) == null || (base = captureOverlayHeaderButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final StepTextBasedComponentStyle getDisclaimerStyle() {
            return this.disclaimerStyle;
        }

        @Nullable
        public final TextBasedComponentStyle getDisclaimerStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.disclaimerStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final SelfieStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null || (base = selfieStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        @Nullable
        public final Integer getHeaderButtonColorValue() {
            StyleElements.SimpleElementColor headerButton;
            StyleElements.SimpleElementColorValue base;
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null || (headerButton = headerButtonColorStyle.getHeaderButton()) == null || (base = headerButton.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final SelfieStepImageLocalStyle getImageLocalStyle() {
            return this.imageLocalStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getModalBackgroundColorValue() {
            StyleElements.SimpleElementColor modal;
            StyleElements.SimpleElementColorValue base;
            Integer value;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            return (stepBackgroundColorStyle == null || (modal = stepBackgroundColorStyle.getModal()) == null || (base = modal.getBase()) == null || (value = base.getValue()) == null) ? getBackgroundColorValue() : value;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.Size getModalBorderRadiusValue() {
            StyleElements.Measurement modal;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null || (modal = stepBorderRadiusStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle padding = getPadding();
            if (padding == null || (modal = padding.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTextStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            return (selfieStepTextBasedComponentStyle == null || (modal = selfieStepTextBasedComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTextStyleValue() : base;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTitleStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            return (selfieStepTitleComponentStyle == null || (modal = selfieStepTitleComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTitleStyleValue() : base;
        }

        @Nullable
        public final StepTextBasedComponentStyle getNavBarTitleStyle() {
            return this.navBarTitleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getNavBarTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Nullable
        public final StyleElements.PositionType getPendingPageAlignmentValue() {
            StyleElements.Position pendingPage;
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null || (pendingPage = combinedStepAlignment.getPendingPage()) == null) {
                return null;
            }
            return pendingPage.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer selfieProcessingText;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (selfieProcessingText = selfieStepTextBasedComponentStyle.getSelfieProcessingText()) == null) {
                return null;
            }
            return selfieProcessingText.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer selfieProcessingTitle;
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            if (selfieStepTitleComponentStyle == null || (selfieProcessingTitle = selfieStepTitleComponentStyle.getSelfieProcessingTitle()) == null) {
                return null;
            }
            return selfieProcessingTitle.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getScreenPaddingValue() {
            return super.getScreenPaddingValue();
        }

        @Nullable
        public final TextBasedComponentStyle getSelfieCaptureDisclaimerTextStyle() {
            StepTextBasedComponentStyleContainer selfieCaptureDisclaimerText;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (selfieCaptureDisclaimerText = selfieStepTextBasedComponentStyle.getSelfieCaptureDisclaimerText()) == null) {
                return null;
            }
            return selfieCaptureDisclaimerText.getBase();
        }

        @Nullable
        public final Integer getSelfieCaptureFeedBoxBorderColorValue() {
            StyleElements.SimpleElementColor selfieCaptureFeedBox;
            StyleElements.SimpleElementColorValue base;
            SelfieStepBorderColor selfieStepBorderColor = this.borderColor;
            if (selfieStepBorderColor == null || (selfieCaptureFeedBox = selfieStepBorderColor.getSelfieCaptureFeedBox()) == null || (base = selfieCaptureFeedBox.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Double getSelfieCaptureFeedBoxBorderWidthValue() {
            StyleElements.MeasurementSet selfieCaptureFeedBox;
            StyleElements.SizeSet base;
            StyleElements.Size top;
            SelfieStepBorderWidth selfieStepBorderWidth = this.borderWidth;
            if (selfieStepBorderWidth == null || (selfieCaptureFeedBox = selfieStepBorderWidth.getSelfieCaptureFeedBox()) == null || (base = selfieCaptureFeedBox.getBase()) == null || (top = base.getTop()) == null) {
                return null;
            }
            return top.getDp();
        }

        @Nullable
        public final TextBasedComponentStyle getSelfieCaptureHintTextStyle() {
            StepTextBasedComponentStyleContainer selfieCaptureHintText;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (selfieCaptureHintText = selfieStepTextBasedComponentStyle.getSelfieCaptureHintText()) == null) {
                return null;
            }
            return selfieCaptureHintText.getBase();
        }

        @Nullable
        public final Integer getSelfieCaptureIconBackgroundFillColor() {
            StyleElements.SimpleElementColor selfieCaptureIconBackgroundFillColor;
            StyleElements.SimpleElementColorValue base;
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null || (selfieCaptureIconBackgroundFillColor = selfieStepFillColor.getSelfieCaptureIconBackgroundFillColor()) == null || (base = selfieCaptureIconBackgroundFillColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getSelfieCaptureIconFillColor() {
            StyleElements.SimpleElementColor selfieCaptureIconFillColor;
            StyleElements.SimpleElementColorValue base;
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null || (selfieCaptureIconFillColor = selfieStepFillColor.getSelfieCaptureIconFillColor()) == null || (base = selfieCaptureIconFillColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final Integer getSelfieCaptureIconStrokeColor() {
            StyleElements.SimpleElementColor selfieCaptureIconStrokeColor;
            StyleElements.SimpleElementColorValue base;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (selfieCaptureIconStrokeColor = selfieStepStrokeColor.getSelfieCaptureIconStrokeColor()) == null || (base = selfieCaptureIconStrokeColor.getBase()) == null) {
                return null;
            }
            return base.getValue();
        }

        @Nullable
        public final TextBasedComponentStyle getSelfieSmallText() {
            StepTextBasedComponentStyleContainer selfieSmallText;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (selfieSmallText = selfieStepTextBasedComponentStyle.getSelfieSmallText()) == null) {
                return null;
            }
            return selfieSmallText.getBase();
        }

        @Nullable
        public final LocalImageComponentStyle getSelfieStartIconStyle() {
            SelfieStepImageLocalStyleContainer selfieStartIcon;
            SelfieStepImageLocalStyle selfieStepImageLocalStyle = this.imageLocalStyle;
            if (selfieStepImageLocalStyle == null || (selfieStartIcon = selfieStepImageLocalStyle.getSelfieStartIcon()) == null) {
                return null;
            }
            return selfieStartIcon.getBase();
        }

        @Nullable
        public final SelfieStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null || (base = selfieStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final SelfieStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null || (base = selfieStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final SelfieStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            if (selfieStepTitleComponentStyle == null || (base = selfieStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                headerButtonColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(dest, flags);
            }
            SelfieStepTitleComponentStyle selfieStepTitleComponentStyle = this.titleStyle;
            if (selfieStepTitleComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieStepTitleComponentStyle.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            SelfieStepTextBasedComponentStyle selfieStepTextBasedComponentStyle = this.textStyle;
            if (selfieStepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieStepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle2 = this.disclaimerStyle;
            if (stepTextBasedComponentStyle2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyle2.writeToParcel(dest, flags);
            }
            SelfieStepStrokeColor selfieStepStrokeColor = this.strokeColor;
            if (selfieStepStrokeColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieStepStrokeColor.writeToParcel(dest, flags);
            }
            SelfieStepBorderColor selfieStepBorderColor = this.borderColor;
            if (selfieStepBorderColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieStepBorderColor.writeToParcel(dest, flags);
            }
            SelfieStepBorderWidth selfieStepBorderWidth = this.borderWidth;
            if (selfieStepBorderWidth == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieStepBorderWidth.writeToParcel(dest, flags);
            }
            SelfieStepFillColor selfieStepFillColor = this.fillColor;
            if (selfieStepFillColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieStepFillColor.writeToParcel(dest, flags);
            }
            SelfieStepImageLocalStyle selfieStepImageLocalStyle = this.imageLocalStyle;
            if (selfieStepImageLocalStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selfieStepImageLocalStyle.writeToParcel(dest, flags);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPaddingStyle.writeToParcel(dest, flags);
            }
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBorderRadiusStyle.writeToParcel(dest, flags);
            }
            CombinedStepAlignment combinedStepAlignment = this.alignment;
            if (combinedStepAlignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                combinedStepAlignment.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageNameContainer;", "Landroid/os/Parcelable;", "localName", "", "<init>", "(Ljava/lang/String;)V", "getLocalName", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepBackgroundImageNameContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBackgroundImageNameContainer> CREATOR = new Creator();

        @Nullable
        private final String localName;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepBackgroundImageNameContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageNameContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepBackgroundImageNameContainer(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageNameContainer[] newArray(int i10) {
                return new StepBackgroundImageNameContainer[i10];
            }
        }

        public StepBackgroundImageNameContainer(@Nullable String str) {
            this.localName = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getLocalName() {
            return this.localName;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.localName);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyleContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyleContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepBackgroundImageStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBackgroundImageStyle> CREATOR = new Creator();

        @Nullable
        private final StepBackgroundImageStyleContainer base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepBackgroundImageStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepBackgroundImageStyle(parcel.readInt() == 0 ? null : StepBackgroundImageStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageStyle[] newArray(int i10) {
                return new StepBackgroundImageStyle[i10];
            }
        }

        public StepBackgroundImageStyle(@Nullable StepBackgroundImageStyleContainer stepBackgroundImageStyleContainer) {
            this.base = stepBackgroundImageStyleContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepBackgroundImageStyleContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepBackgroundImageStyleContainer stepBackgroundImageStyleContainer = this.base;
            if (stepBackgroundImageStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundImageStyleContainer.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageNameContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageNameContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageNameContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepBackgroundImageStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBackgroundImageStyleContainer> CREATOR = new Creator();

        @Nullable
        private final StepBackgroundImageNameContainer base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepBackgroundImageStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageStyleContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepBackgroundImageStyleContainer(parcel.readInt() == 0 ? null : StepBackgroundImageNameContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundImageStyleContainer[] newArray(int i10) {
                return new StepBackgroundImageStyleContainer[i10];
            }
        }

        public StepBackgroundImageStyleContainer(@Nullable StepBackgroundImageNameContainer stepBackgroundImageNameContainer) {
            this.base = stepBackgroundImageNameContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepBackgroundImageNameContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepBackgroundImageNameContainer stepBackgroundImageNameContainer = this.base;
            if (stepBackgroundImageNameContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundImageNameContainer.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;", "Landroid/os/Parcelable;", "modal", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;)V", "getModal", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Measurement;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepBorderRadiusStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBorderRadiusStyle> CREATOR = new Creator();

        @Nullable
        private final StyleElements.Measurement modal;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepBorderRadiusStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBorderRadiusStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepBorderRadiusStyle(parcel.readInt() == 0 ? null : StyleElements.Measurement.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBorderRadiusStyle[] newArray(int i10) {
                return new StepBorderRadiusStyle[i10];
            }
        }

        public StepBorderRadiusStyle(@Nullable StyleElements.Measurement measurement) {
            this.modal = measurement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.Measurement getModal() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.Measurement measurement = this.modal;
            if (measurement == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                measurement.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepCancelButtonComponentStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepCancelButtonComponentStyleContainer> CREATOR = new Creator();

        @Nullable
        private final ButtonCancelComponentStyle base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepCancelButtonComponentStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepCancelButtonComponentStyleContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepCancelButtonComponentStyleContainer(parcel.readInt() == 0 ? null : ButtonCancelComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepCancelButtonComponentStyleContainer[] newArray(int i10) {
                return new StepCancelButtonComponentStyleContainer[i10];
            }
        }

        public StepCancelButtonComponentStyleContainer(@Nullable ButtonCancelComponentStyle buttonCancelComponentStyle) {
            this.base = buttonCancelComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final ButtonCancelComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ButtonCancelComponentStyle buttonCancelComponentStyle = this.base;
            if (buttonCancelComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonCancelComponentStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "Landroid/os/Parcelable;", "modal", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;", "screen", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;)V", "getModal", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;", "getScreen", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepPaddingStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepPaddingStyle> CREATOR = new Creator();

        @Nullable
        private final StepPaddingStyleContainer modal;

        @Nullable
        private final StepPaddingStyleContainer screen;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepPaddingStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPaddingStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepPaddingStyle(parcel.readInt() == 0 ? null : StepPaddingStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepPaddingStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPaddingStyle[] newArray(int i10) {
                return new StepPaddingStyle[i10];
            }
        }

        public StepPaddingStyle(@Nullable StepPaddingStyleContainer stepPaddingStyleContainer, @Nullable StepPaddingStyleContainer stepPaddingStyleContainer2) {
            this.modal = stepPaddingStyleContainer;
            this.screen = stepPaddingStyleContainer2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepPaddingStyleContainer getModal() {
            return this.modal;
        }

        @Nullable
        public final StepPaddingStyleContainer getScreen() {
            return this.screen;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepPaddingStyleContainer stepPaddingStyleContainer = this.modal;
            if (stepPaddingStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPaddingStyleContainer.writeToParcel(dest, flags);
            }
            StepPaddingStyleContainer stepPaddingStyleContainer2 = this.screen;
            if (stepPaddingStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPaddingStyleContainer2.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepPaddingStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepPaddingStyleContainer> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SizeSet base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepPaddingStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPaddingStyleContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepPaddingStyleContainer(parcel.readInt() == 0 ? null : StyleElements.SizeSet.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPaddingStyleContainer[] newArray(int i10) {
                return new StepPaddingStyleContainer[i10];
            }
        }

        public StepPaddingStyleContainer(@Nullable StyleElements.SizeSet sizeSet) {
            this.base = sizeSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SizeSet getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SizeSet sizeSet = this.base;
            if (sizeSet == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                sizeSet.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "cancelDialogClose", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "getCancelDialogClose", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepPrimaryButtonComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepPrimaryButtonComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepSubmitButtonComponentStyleContainer base;

        @Nullable
        private final StepSubmitButtonComponentStyleContainer cancelDialogClose;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepPrimaryButtonComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPrimaryButtonComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepPrimaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepSubmitButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepPrimaryButtonComponentStyle[] newArray(int i10) {
                return new StepPrimaryButtonComponentStyle[i10];
            }
        }

        public StepPrimaryButtonComponentStyle(@Nullable StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer, @Nullable StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2) {
            this.base = stepSubmitButtonComponentStyleContainer;
            this.cancelDialogClose = stepSubmitButtonComponentStyleContainer2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepSubmitButtonComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepSubmitButtonComponentStyleContainer getCancelDialogClose() {
            return this.cancelDialogClose;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer = this.base;
            if (stepSubmitButtonComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepSubmitButtonComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepSubmitButtonComponentStyleContainer stepSubmitButtonComponentStyleContainer2 = this.cancelDialogClose;
            if (stepSubmitButtonComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepSubmitButtonComponentStyleContainer2.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "cancelDialogResume", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepCancelButtonComponentStyleContainer;", "getCancelDialogResume", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepSecondaryButtonComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepSecondaryButtonComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepCancelButtonComponentStyleContainer base;

        @Nullable
        private final StepCancelButtonComponentStyleContainer cancelDialogResume;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepSecondaryButtonComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepSecondaryButtonComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepSecondaryButtonComponentStyle(parcel.readInt() == 0 ? null : StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepCancelButtonComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepSecondaryButtonComponentStyle[] newArray(int i10) {
                return new StepSecondaryButtonComponentStyle[i10];
            }
        }

        public StepSecondaryButtonComponentStyle(@Nullable StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer, @Nullable StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2) {
            this.base = stepCancelButtonComponentStyleContainer;
            this.cancelDialogResume = stepCancelButtonComponentStyleContainer2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepCancelButtonComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepCancelButtonComponentStyleContainer getCancelDialogResume() {
            return this.cancelDialogResume;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer = this.base;
            if (stepCancelButtonComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepCancelButtonComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepCancelButtonComponentStyleContainer stepCancelButtonComponentStyleContainer2 = this.cancelDialogResume;
            if (stepCancelButtonComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepCancelButtonComponentStyleContainer2.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSubmitButtonComponentStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepSubmitButtonComponentStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepSubmitButtonComponentStyleContainer> CREATOR = new Creator();

        @Nullable
        private final ButtonSubmitComponentStyle base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepSubmitButtonComponentStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepSubmitButtonComponentStyleContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepSubmitButtonComponentStyleContainer(parcel.readInt() == 0 ? null : ButtonSubmitComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepSubmitButtonComponentStyleContainer[] newArray(int i10) {
                return new StepSubmitButtonComponentStyleContainer[i10];
            }
        }

        public StepSubmitButtonComponentStyleContainer(@Nullable ButtonSubmitComponentStyle buttonSubmitComponentStyle) {
            this.base = buttonSubmitComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final ButtonSubmitComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ButtonSubmitComponentStyle buttonSubmitComponentStyle = this.base;
            if (buttonSubmitComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                buttonSubmitComponentStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepTextBasedComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepTextBasedComponentStyleContainer base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepTextBasedComponentStyle[] newArray(int i10) {
                return new StepTextBasedComponentStyle[i10];
            }
        }

        public StepTextBasedComponentStyle(@Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer) {
            this.base = stepTextBasedComponentStyleContainer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepTextBasedComponentStyleContainer implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepTextBasedComponentStyleContainer> CREATOR = new Creator();

        @Nullable
        private final TextBasedComponentStyle base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepTextBasedComponentStyleContainer> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepTextBasedComponentStyleContainer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepTextBasedComponentStyleContainer(parcel.readInt() == 0 ? null : TextBasedComponentStyle.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepTextBasedComponentStyleContainer[] newArray(int i10) {
                return new StepTextBasedComponentStyleContainer[i10];
            }
        }

        public StepTextBasedComponentStyleContainer(@Nullable TextBasedComponentStyle textBasedComponentStyle) {
            this.base = textBasedComponentStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final TextBasedComponentStyle getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            TextBasedComponentStyle textBasedComponentStyle = this.base;
            if (textBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                textBasedComponentStyle.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepAlignment;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Position;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class UiStepAlignment implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepAlignment> CREATOR = new Creator();

        @Nullable
        private final StyleElements.Position base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UiStepAlignment> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepAlignment createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiStepAlignment(parcel.readInt() == 0 ? null : StyleElements.Position.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepAlignment[] newArray(int i10) {
                return new UiStepAlignment[i10];
            }
        }

        public UiStepAlignment(@Nullable StyleElements.Position position) {
            this.base = position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.Position getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.Position position = this.base;
            if (position == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                position.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepFillColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class UiStepFillColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepFillColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UiStepFillColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepFillColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiStepFillColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepFillColor[] newArray(int i10) {
                return new UiStepFillColor[i10];
            }
        }

        public UiStepFillColor(@Nullable StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStrokeColor;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class UiStepStrokeColor implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepStrokeColor> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UiStepStrokeColor> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepStrokeColor createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiStepStrokeColor(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepStrokeColor[] newArray(int i10) {
                return new UiStepStrokeColor[i10];
            }
        }

        public UiStepStrokeColor(@Nullable StyleElements.SimpleElementColor simpleElementColor) {
            this.base = simpleElementColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u001bHÆ\u0003J¥\u0001\u0010{\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0006\u0010|\u001a\u000209J\u0014\u0010}\u001a\u00020~2\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001HÖ\u0003J\n\u0010\u0081\u0001\u001a\u000209HÖ\u0001J\n\u0010\u0082\u0001\u001a\u00020gHÖ\u0001J\u001b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0087\u0001\u001a\u000209R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u00108\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0016\u0010<\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0016\u0010>\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0016\u0010@\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0016\u0010D\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0016\u0010F\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0016\u0010H\u001a\u0004\u0018\u00010I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010L\u001a\u0004\u0018\u00010M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0016\u0010P\u001a\u0004\u0018\u00010I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010KR\u0016\u0010R\u001a\u0004\u0018\u00010M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010OR\u0016\u0010T\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010CR\u0016\u0010V\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010CR\u0016\u0010X\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010CR\u0016\u0010Z\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010CR\u0016\u0010\\\u001a\u0004\u0018\u0001098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010;R\u0016\u0010^\u001a\u0004\u0018\u00010_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0016\u0010b\u001a\u0004\u0018\u00010c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0016\u0010f\u001a\u0004\u0018\u00010g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0013\u0010j\u001a\u0004\u0018\u00010k8F¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006\u0088\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "headerButtonColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "backgroundImage", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTitleComponentStyle;", "navBarTitleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTextBasedComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStrokeColor;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepFillColor;", "alignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepAlignment;", "padding", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "borderRadius", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTitleComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTextBasedComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStrokeColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepFillColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepAlignment;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;)V", "getHeaderButtonColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$HeaderButtonColorStyle;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "getBackgroundImage", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundImageStyle;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTitleComponentStyle;", "getNavBarTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyle;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTextBasedComponentStyle;", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPrimaryButtonComponentStyle;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepSecondaryButtonComponentStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStrokeColor;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepFillColor;", "getAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepAlignment;", "getPadding", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepPaddingStyle;", "getBorderRadius", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBorderRadiusStyle;", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "strokeColorValue", "getStrokeColorValue", "titleStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTitleStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "navBarTitleStyleValue", "getNavBarTitleStyleValue", "textStyleValue", "getTextStyleValue", "buttonPrimaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getButtonPrimaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "buttonSecondaryStyleValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "getButtonSecondaryStyleValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "cancelDialogCloseStyleValue", "getCancelDialogCloseStyleValue", "cancelDialogResumeStyleValue", "getCancelDialogResumeStyleValue", "processingTitleStyleValue", "getProcessingTitleStyleValue", "processingTextStyleValue", "getProcessingTextStyleValue", "modalTitleStyleValue", "getModalTitleStyleValue", "modalTextStyleValue", "getModalTextStyleValue", "modalBackgroundColorValue", "getModalBackgroundColorValue", "modalPaddingValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "getModalPaddingValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SizeSet;", "modalBorderRadiusValue", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "getModalBorderRadiusValue", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Size;", "backgroundImageName", "", "getBackgroundImageName", "()Ljava/lang/String;", "pageLevelVerticalAlignment", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "getPageLevelVerticalAlignment", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$PositionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final /* data */ class UiStepStyle implements StepStyle {

        @NotNull
        public static final Parcelable.Creator<UiStepStyle> CREATOR = new Creator();

        @Nullable
        private final UiStepAlignment alignment;

        @Nullable
        private final StepBackgroundColorStyle backgroundColor;

        @Nullable
        private final StepBackgroundImageStyle backgroundImage;

        @Nullable
        private final StepBorderRadiusStyle borderRadius;

        @Nullable
        private final StepPrimaryButtonComponentStyle buttonPrimaryStyle;

        @Nullable
        private final StepSecondaryButtonComponentStyle buttonSecondaryStyle;

        @Nullable
        private final UiStepFillColor fillColor;

        @Nullable
        private final AttributeStyles.HeaderButtonColorStyle headerButtonColor;

        @Nullable
        private final StepTextBasedComponentStyle navBarTitleStyle;

        @Nullable
        private final StepPaddingStyle padding;

        @Nullable
        private final UiStepStrokeColor strokeColor;

        @Nullable
        private final UiStepTextBasedComponentStyle textStyle;

        @Nullable
        private final UiStepTitleComponentStyle titleStyle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UiStepStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiStepStyle(parcel.readInt() == 0 ? null : AttributeStyles.HeaderButtonColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepBackgroundImageStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepTitleComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepTextBasedComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPrimaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepSecondaryButtonComponentStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepStrokeColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepFillColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UiStepAlignment.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepPaddingStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepBorderRadiusStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepStyle[] newArray(int i10) {
                return new UiStepStyle[i10];
            }
        }

        public UiStepStyle(@g(name = "textColor") @Nullable AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, @Nullable StepBackgroundColorStyle stepBackgroundColorStyle, @Nullable StepBackgroundImageStyle stepBackgroundImageStyle, @Nullable UiStepTitleComponentStyle uiStepTitleComponentStyle, @Nullable StepTextBasedComponentStyle stepTextBasedComponentStyle, @Nullable UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle, @Nullable StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, @Nullable StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, @Nullable UiStepStrokeColor uiStepStrokeColor, @Nullable UiStepFillColor uiStepFillColor, @Nullable UiStepAlignment uiStepAlignment, @Nullable StepPaddingStyle stepPaddingStyle, @Nullable StepBorderRadiusStyle stepBorderRadiusStyle) {
            this.headerButtonColor = headerButtonColorStyle;
            this.backgroundColor = stepBackgroundColorStyle;
            this.backgroundImage = stepBackgroundImageStyle;
            this.titleStyle = uiStepTitleComponentStyle;
            this.navBarTitleStyle = stepTextBasedComponentStyle;
            this.textStyle = uiStepTextBasedComponentStyle;
            this.buttonPrimaryStyle = stepPrimaryButtonComponentStyle;
            this.buttonSecondaryStyle = stepSecondaryButtonComponentStyle;
            this.strokeColor = uiStepStrokeColor;
            this.fillColor = uiStepFillColor;
            this.alignment = uiStepAlignment;
            this.padding = stepPaddingStyle;
            this.borderRadius = stepBorderRadiusStyle;
        }

        public static /* synthetic */ UiStepStyle copy$default(UiStepStyle uiStepStyle, AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle, StepBackgroundColorStyle stepBackgroundColorStyle, StepBackgroundImageStyle stepBackgroundImageStyle, UiStepTitleComponentStyle uiStepTitleComponentStyle, StepTextBasedComponentStyle stepTextBasedComponentStyle, UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle, StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle, StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle, UiStepStrokeColor uiStepStrokeColor, UiStepFillColor uiStepFillColor, UiStepAlignment uiStepAlignment, StepPaddingStyle stepPaddingStyle, StepBorderRadiusStyle stepBorderRadiusStyle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                headerButtonColorStyle = uiStepStyle.headerButtonColor;
            }
            return uiStepStyle.copy(headerButtonColorStyle, (i10 & 2) != 0 ? uiStepStyle.backgroundColor : stepBackgroundColorStyle, (i10 & 4) != 0 ? uiStepStyle.backgroundImage : stepBackgroundImageStyle, (i10 & 8) != 0 ? uiStepStyle.titleStyle : uiStepTitleComponentStyle, (i10 & 16) != 0 ? uiStepStyle.navBarTitleStyle : stepTextBasedComponentStyle, (i10 & 32) != 0 ? uiStepStyle.textStyle : uiStepTextBasedComponentStyle, (i10 & 64) != 0 ? uiStepStyle.buttonPrimaryStyle : stepPrimaryButtonComponentStyle, (i10 & 128) != 0 ? uiStepStyle.buttonSecondaryStyle : stepSecondaryButtonComponentStyle, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? uiStepStyle.strokeColor : uiStepStrokeColor, (i10 & Barcode.FORMAT_UPC_A) != 0 ? uiStepStyle.fillColor : uiStepFillColor, (i10 & Barcode.FORMAT_UPC_E) != 0 ? uiStepStyle.alignment : uiStepAlignment, (i10 & Barcode.FORMAT_PDF417) != 0 ? uiStepStyle.padding : stepPaddingStyle, (i10 & Barcode.FORMAT_AZTEC) != 0 ? uiStepStyle.borderRadius : stepBorderRadiusStyle);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final UiStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final UiStepAlignment getAlignment() {
            return this.alignment;
        }

        @Nullable
        /* JADX INFO: renamed from: component12, reason: from getter */
        public final StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Nullable
        /* JADX INFO: renamed from: component13, reason: from getter */
        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final UiStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final StepTextBasedComponentStyle getNavBarTitleStyle() {
            return this.navBarTitleStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final UiStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final UiStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @NotNull
        public final UiStepStyle copy(@g(name = "textColor") @Nullable AttributeStyles.HeaderButtonColorStyle headerButtonColor, @Nullable StepBackgroundColorStyle backgroundColor, @Nullable StepBackgroundImageStyle backgroundImage, @Nullable UiStepTitleComponentStyle titleStyle, @Nullable StepTextBasedComponentStyle navBarTitleStyle, @Nullable UiStepTextBasedComponentStyle textStyle, @Nullable StepPrimaryButtonComponentStyle buttonPrimaryStyle, @Nullable StepSecondaryButtonComponentStyle buttonSecondaryStyle, @Nullable UiStepStrokeColor strokeColor, @Nullable UiStepFillColor fillColor, @Nullable UiStepAlignment alignment, @Nullable StepPaddingStyle padding, @Nullable StepBorderRadiusStyle borderRadius) {
            return new UiStepStyle(headerButtonColor, backgroundColor, backgroundImage, titleStyle, navBarTitleStyle, textStyle, buttonPrimaryStyle, buttonSecondaryStyle, strokeColor, fillColor, alignment, padding, borderRadius);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiStepStyle)) {
                return false;
            }
            UiStepStyle uiStepStyle = (UiStepStyle) other;
            return Intrinsics.c(this.headerButtonColor, uiStepStyle.headerButtonColor) && Intrinsics.c(this.backgroundColor, uiStepStyle.backgroundColor) && Intrinsics.c(this.backgroundImage, uiStepStyle.backgroundImage) && Intrinsics.c(this.titleStyle, uiStepStyle.titleStyle) && Intrinsics.c(this.navBarTitleStyle, uiStepStyle.navBarTitleStyle) && Intrinsics.c(this.textStyle, uiStepStyle.textStyle) && Intrinsics.c(this.buttonPrimaryStyle, uiStepStyle.buttonPrimaryStyle) && Intrinsics.c(this.buttonSecondaryStyle, uiStepStyle.buttonSecondaryStyle) && Intrinsics.c(this.strokeColor, uiStepStyle.strokeColor) && Intrinsics.c(this.fillColor, uiStepStyle.fillColor) && Intrinsics.c(this.alignment, uiStepStyle.alignment) && Intrinsics.c(this.padding, uiStepStyle.padding) && Intrinsics.c(this.borderRadius, uiStepStyle.borderRadius);
        }

        @Nullable
        public final UiStepAlignment getAlignment() {
            return this.alignment;
        }

        @Nullable
        public final StepBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getBackgroundColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null || (base = stepBackgroundColorStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final StepBackgroundImageStyle getBackgroundImage() {
            return this.backgroundImage;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public String getBackgroundImageName() {
            StepBackgroundImageStyleContainer base;
            StepBackgroundImageNameContainer base2;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null || (base = stepBackgroundImageStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getLocalName();
        }

        @Nullable
        public final StepBorderRadiusStyle getBorderRadius() {
            return this.borderRadius;
        }

        @Nullable
        public final StepPrimaryButtonComponentStyle getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getButtonPrimaryStyleValue() {
            StepSubmitButtonComponentStyleContainer base;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (base = stepPrimaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final StepSecondaryButtonComponentStyle getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getButtonSecondaryStyleValue() {
            StepCancelButtonComponentStyleContainer base;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (base = stepSecondaryButtonComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonSubmitComponentStyle getCancelDialogCloseStyleValue() {
            StepSubmitButtonComponentStyleContainer cancelDialogClose;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null || (cancelDialogClose = stepPrimaryButtonComponentStyle.getCancelDialogClose()) == null) {
                return null;
            }
            return cancelDialogClose.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public ButtonCancelComponentStyle getCancelDialogResumeStyleValue() {
            StepCancelButtonComponentStyleContainer cancelDialogResume;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null || (cancelDialogResume = stepSecondaryButtonComponentStyle.getCancelDialogResume()) == null) {
                return null;
            }
            return cancelDialogResume.getBase();
        }

        @Nullable
        public final UiStepFillColor getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getFillColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            UiStepFillColor uiStepFillColor = this.fillColor;
            if (uiStepFillColor == null || (base = uiStepFillColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final AttributeStyles.HeaderButtonColorStyle getHeaderButtonColor() {
            return this.headerButtonColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getModalBackgroundColorValue() {
            StyleElements.SimpleElementColor modal;
            StyleElements.SimpleElementColorValue base;
            Integer value;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            return (stepBackgroundColorStyle == null || (modal = stepBackgroundColorStyle.getModal()) == null || (base = modal.getBase()) == null || (value = base.getValue()) == null) ? getBackgroundColorValue() : value;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.Size getModalBorderRadiusValue() {
            StyleElements.Measurement modal;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null || (modal = stepBorderRadiusStyle.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getModalPaddingValue() {
            StepPaddingStyleContainer modal;
            StepPaddingStyle padding = getPadding();
            if (padding == null || (modal = padding.getModal()) == null) {
                return null;
            }
            return modal.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTextStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            return (uiStepTextBasedComponentStyle == null || (modal = uiStepTextBasedComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTextStyleValue() : base;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getModalTitleStyleValue() {
            StepTextBasedComponentStyleContainer modal;
            TextBasedComponentStyle base;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            return (uiStepTitleComponentStyle == null || (modal = uiStepTitleComponentStyle.getModal()) == null || (base = modal.getBase()) == null) ? getTitleStyleValue() : base;
        }

        @Nullable
        public final StepTextBasedComponentStyle getNavBarTitleStyle() {
            return this.navBarTitleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getNavBarTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null || (base = stepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StepPaddingStyle getPadding() {
            return this.padding;
        }

        @Nullable
        public final StyleElements.PositionType getPageLevelVerticalAlignment() {
            StyleElements.Position base;
            UiStepAlignment uiStepAlignment = this.alignment;
            if (uiStepAlignment == null || (base = uiStepAlignment.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTextStyleValue() {
            StepTextBasedComponentStyleContainer uiStepProcessingText;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null || (uiStepProcessingText = uiStepTextBasedComponentStyle.getUiStepProcessingText()) == null) {
                return null;
            }
            return uiStepProcessingText.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getProcessingTitleStyleValue() {
            StepTextBasedComponentStyleContainer uiStepProcessingTitle;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null || (uiStepProcessingTitle = uiStepTitleComponentStyle.getUiStepProcessingTitle()) == null) {
                return null;
            }
            return uiStepProcessingTitle.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public StyleElements.SizeSet getScreenPaddingValue() {
            return super.getScreenPaddingValue();
        }

        @Nullable
        public final UiStepStrokeColor getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public Integer getStrokeColorValue() {
            StyleElements.SimpleElementColor base;
            StyleElements.SimpleElementColorValue base2;
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            if (uiStepStrokeColor == null || (base = uiStepStrokeColor.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getValue();
        }

        @Nullable
        public final UiStepTextBasedComponentStyle getTextStyle() {
            return this.textStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTextStyleValue() {
            StepTextBasedComponentStyleContainer base;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null || (base = uiStepTextBasedComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final UiStepTitleComponentStyle getTitleStyle() {
            return this.titleStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle
        @Nullable
        public TextBasedComponentStyle getTitleStyleValue() {
            StepTextBasedComponentStyleContainer base;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null || (base = uiStepTitleComponentStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        public int hashCode() {
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            int iHashCode = (headerButtonColorStyle == null ? 0 : headerButtonColorStyle.hashCode()) * 31;
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            int iHashCode2 = (iHashCode + (stepBackgroundColorStyle == null ? 0 : stepBackgroundColorStyle.hashCode())) * 31;
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            int iHashCode3 = (iHashCode2 + (stepBackgroundImageStyle == null ? 0 : stepBackgroundImageStyle.hashCode())) * 31;
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            int iHashCode4 = (iHashCode3 + (uiStepTitleComponentStyle == null ? 0 : uiStepTitleComponentStyle.hashCode())) * 31;
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            int iHashCode5 = (iHashCode4 + (stepTextBasedComponentStyle == null ? 0 : stepTextBasedComponentStyle.hashCode())) * 31;
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            int iHashCode6 = (iHashCode5 + (uiStepTextBasedComponentStyle == null ? 0 : uiStepTextBasedComponentStyle.hashCode())) * 31;
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            int iHashCode7 = (iHashCode6 + (stepPrimaryButtonComponentStyle == null ? 0 : stepPrimaryButtonComponentStyle.hashCode())) * 31;
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            int iHashCode8 = (iHashCode7 + (stepSecondaryButtonComponentStyle == null ? 0 : stepSecondaryButtonComponentStyle.hashCode())) * 31;
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            int iHashCode9 = (iHashCode8 + (uiStepStrokeColor == null ? 0 : uiStepStrokeColor.hashCode())) * 31;
            UiStepFillColor uiStepFillColor = this.fillColor;
            int iHashCode10 = (iHashCode9 + (uiStepFillColor == null ? 0 : uiStepFillColor.hashCode())) * 31;
            UiStepAlignment uiStepAlignment = this.alignment;
            int iHashCode11 = (iHashCode10 + (uiStepAlignment == null ? 0 : uiStepAlignment.hashCode())) * 31;
            StepPaddingStyle stepPaddingStyle = this.padding;
            int iHashCode12 = (iHashCode11 + (stepPaddingStyle == null ? 0 : stepPaddingStyle.hashCode())) * 31;
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            return iHashCode12 + (stepBorderRadiusStyle != null ? stepBorderRadiusStyle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UiStepStyle(headerButtonColor=" + this.headerButtonColor + ", backgroundColor=" + this.backgroundColor + ", backgroundImage=" + this.backgroundImage + ", titleStyle=" + this.titleStyle + ", navBarTitleStyle=" + this.navBarTitleStyle + ", textStyle=" + this.textStyle + ", buttonPrimaryStyle=" + this.buttonPrimaryStyle + ", buttonSecondaryStyle=" + this.buttonSecondaryStyle + ", strokeColor=" + this.strokeColor + ", fillColor=" + this.fillColor + ", alignment=" + this.alignment + ", padding=" + this.padding + ", borderRadius=" + this.borderRadius + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.HeaderButtonColorStyle headerButtonColorStyle = this.headerButtonColor;
            if (headerButtonColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                headerButtonColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundColorStyle stepBackgroundColorStyle = this.backgroundColor;
            if (stepBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundColorStyle.writeToParcel(dest, flags);
            }
            StepBackgroundImageStyle stepBackgroundImageStyle = this.backgroundImage;
            if (stepBackgroundImageStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBackgroundImageStyle.writeToParcel(dest, flags);
            }
            UiStepTitleComponentStyle uiStepTitleComponentStyle = this.titleStyle;
            if (uiStepTitleComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepTitleComponentStyle.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyle stepTextBasedComponentStyle = this.navBarTitleStyle;
            if (stepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            UiStepTextBasedComponentStyle uiStepTextBasedComponentStyle = this.textStyle;
            if (uiStepTextBasedComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepTextBasedComponentStyle.writeToParcel(dest, flags);
            }
            StepPrimaryButtonComponentStyle stepPrimaryButtonComponentStyle = this.buttonPrimaryStyle;
            if (stepPrimaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPrimaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            StepSecondaryButtonComponentStyle stepSecondaryButtonComponentStyle = this.buttonSecondaryStyle;
            if (stepSecondaryButtonComponentStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepSecondaryButtonComponentStyle.writeToParcel(dest, flags);
            }
            UiStepStrokeColor uiStepStrokeColor = this.strokeColor;
            if (uiStepStrokeColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepStrokeColor.writeToParcel(dest, flags);
            }
            UiStepFillColor uiStepFillColor = this.fillColor;
            if (uiStepFillColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepFillColor.writeToParcel(dest, flags);
            }
            UiStepAlignment uiStepAlignment = this.alignment;
            if (uiStepAlignment == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                uiStepAlignment.writeToParcel(dest, flags);
            }
            StepPaddingStyle stepPaddingStyle = this.padding;
            if (stepPaddingStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepPaddingStyle.writeToParcel(dest, flags);
            }
            StepBorderRadiusStyle stepBorderRadiusStyle = this.borderRadius;
            if (stepBorderRadiusStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepBorderRadiusStyle.writeToParcel(dest, flags);
            }
        }
    }

    public /* synthetic */ StepStyles(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private StepStyles() {
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTitleComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "modal", "documentProcessingTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getModal", "getDocumentProcessingTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class DocumentStepTitleComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepTitleComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepTextBasedComponentStyleContainer base;

        @Nullable
        private final StepTextBasedComponentStyleContainer documentProcessingTitle;

        @Nullable
        private final StepTextBasedComponentStyleContainer modal;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentStepTitleComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepTitleComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepTitleComponentStyle[] newArray(int i10) {
                return new DocumentStepTitleComponentStyle[i10];
            }
        }

        public DocumentStepTitleComponentStyle(@Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3) {
            this.base = stepTextBasedComponentStyleContainer;
            this.modal = stepTextBasedComponentStyleContainer2;
            this.documentProcessingTitle = stepTextBasedComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getDocumentProcessingTitle() {
            return this.documentProcessingTitle;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getModal() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.modal;
            if (stepTextBasedComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.documentProcessingTitle;
            if (stepTextBasedComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ DocumentStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stepTextBasedComponentStyleContainer, (i10 & 2) != 0 ? null : stepTextBasedComponentStyleContainer2, stepTextBasedComponentStyleContainer3);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTitleComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "modal", "governmentIdProcessingTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getModal", "getGovernmentIdProcessingTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepTitleComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepTitleComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepTextBasedComponentStyleContainer base;

        @Nullable
        private final StepTextBasedComponentStyleContainer governmentIdProcessingTitle;

        @Nullable
        private final StepTextBasedComponentStyleContainer modal;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepTitleComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepTitleComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepTitleComponentStyle[] newArray(int i10) {
                return new GovernmentIdStepTitleComponentStyle[i10];
            }
        }

        public GovernmentIdStepTitleComponentStyle(@Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3) {
            this.base = stepTextBasedComponentStyleContainer;
            this.modal = stepTextBasedComponentStyleContainer2;
            this.governmentIdProcessingTitle = stepTextBasedComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getGovernmentIdProcessingTitle() {
            return this.governmentIdProcessingTitle;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getModal() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.modal;
            if (stepTextBasedComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.governmentIdProcessingTitle;
            if (stepTextBasedComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ GovernmentIdStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stepTextBasedComponentStyleContainer, (i10 & 2) != 0 ? null : stepTextBasedComponentStyleContainer2, stepTextBasedComponentStyleContainer3);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTitleComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "modal", "selfieProcessingTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getModal", "getSelfieProcessingTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfieStepTitleComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepTitleComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepTextBasedComponentStyleContainer base;

        @Nullable
        private final StepTextBasedComponentStyleContainer modal;

        @Nullable
        private final StepTextBasedComponentStyleContainer selfieProcessingTitle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepTitleComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepTitleComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepTitleComponentStyle[] newArray(int i10) {
                return new SelfieStepTitleComponentStyle[i10];
            }
        }

        public SelfieStepTitleComponentStyle(@Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3) {
            this.base = stepTextBasedComponentStyleContainer;
            this.modal = stepTextBasedComponentStyleContainer2;
            this.selfieProcessingTitle = stepTextBasedComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getModal() {
            return this.modal;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getSelfieProcessingTitle() {
            return this.selfieProcessingTitle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.modal;
            if (stepTextBasedComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.selfieProcessingTitle;
            if (stepTextBasedComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ SelfieStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stepTextBasedComponentStyleContainer, (i10 & 2) != 0 ? null : stepTextBasedComponentStyleContainer2, stepTextBasedComponentStyleContainer3);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "modal", "uiStepProcessingText", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getModal", "getUiStepProcessingText", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class UiStepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepTextBasedComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepTextBasedComponentStyleContainer base;

        @Nullable
        private final StepTextBasedComponentStyleContainer modal;

        @Nullable
        private final StepTextBasedComponentStyleContainer uiStepProcessingText;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UiStepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepTextBasedComponentStyle[] newArray(int i10) {
                return new UiStepTextBasedComponentStyle[i10];
            }
        }

        public UiStepTextBasedComponentStyle(@Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3) {
            this.base = stepTextBasedComponentStyleContainer;
            this.modal = stepTextBasedComponentStyleContainer2;
            this.uiStepProcessingText = stepTextBasedComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getModal() {
            return this.modal;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getUiStepProcessingText() {
            return this.uiStepProcessingText;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.modal;
            if (stepTextBasedComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.uiStepProcessingText;
            if (stepTextBasedComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ UiStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stepTextBasedComponentStyleContainer, (i10 & 2) != 0 ? null : stepTextBasedComponentStyleContainer2, stepTextBasedComponentStyleContainer3);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepTitleComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "modal", "uiStepProcessingTitle", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getModal", "getUiStepProcessingTitle", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class UiStepTitleComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<UiStepTitleComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepTextBasedComponentStyleContainer base;

        @Nullable
        private final StepTextBasedComponentStyleContainer modal;

        @Nullable
        private final StepTextBasedComponentStyleContainer uiStepProcessingTitle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UiStepTitleComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepTitleComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UiStepTitleComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UiStepTitleComponentStyle[] newArray(int i10) {
                return new UiStepTitleComponentStyle[i10];
            }
        }

        public UiStepTitleComponentStyle(@Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3) {
            this.base = stepTextBasedComponentStyleContainer;
            this.modal = stepTextBasedComponentStyleContainer2;
            this.uiStepProcessingTitle = stepTextBasedComponentStyleContainer3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getModal() {
            return this.modal;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getUiStepProcessingTitle() {
            return this.uiStepProcessingTitle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.modal;
            if (stepTextBasedComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.uiStepProcessingTitle;
            if (stepTextBasedComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ UiStepTitleComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stepTextBasedComponentStyleContainer, (i10 & 2) != 0 ? null : stepTextBasedComponentStyleContainer2, stepTextBasedComponentStyleContainer3);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "modal", "documentProcessingText", "imageName", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getModal", "getDocumentProcessingText", "getImageName", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class DocumentStepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<DocumentStepTextBasedComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepTextBasedComponentStyleContainer base;

        @Nullable
        private final StepTextBasedComponentStyleContainer documentProcessingText;

        @Nullable
        private final StepTextBasedComponentStyleContainer imageName;

        @Nullable
        private final StepTextBasedComponentStyleContainer modal;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DocumentStepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DocumentStepTextBasedComponentStyle[] newArray(int i10) {
                return new DocumentStepTextBasedComponentStyle[i10];
            }
        }

        public DocumentStepTextBasedComponentStyle(@Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4) {
            this.base = stepTextBasedComponentStyleContainer;
            this.modal = stepTextBasedComponentStyleContainer2;
            this.documentProcessingText = stepTextBasedComponentStyleContainer3;
            this.imageName = stepTextBasedComponentStyleContainer4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getDocumentProcessingText() {
            return this.documentProcessingText;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getImageName() {
            return this.imageName;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getModal() {
            return this.modal;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.modal;
            if (stepTextBasedComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.documentProcessingText;
            if (stepTextBasedComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4 = this.imageName;
            if (stepTextBasedComponentStyleContainer4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer4.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ DocumentStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stepTextBasedComponentStyleContainer, (i10 & 2) != 0 ? null : stepTextBasedComponentStyleContainer2, stepTextBasedComponentStyleContainer3, stepTextBasedComponentStyleContainer4);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepBackgroundColorStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "modal", "option", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "staticCaptureTips", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$SimpleElementColor;", "getModal", "getOption", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$ComplexElementColor;", "getStaticCaptureTips", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class StepBackgroundColorStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<StepBackgroundColorStyle> CREATOR = new Creator();

        @Nullable
        private final StyleElements.SimpleElementColor base;

        @Nullable
        private final StyleElements.SimpleElementColor modal;

        @Nullable
        private final StyleElements.ComplexElementColor option;

        @Nullable
        private final StyleElements.SimpleElementColor staticCaptureTips;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StepBackgroundColorStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundColorStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StepBackgroundColorStyle(parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleElements.ComplexElementColor.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StyleElements.SimpleElementColor.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StepBackgroundColorStyle[] newArray(int i10) {
                return new StepBackgroundColorStyle[i10];
            }
        }

        public StepBackgroundColorStyle(@Nullable StyleElements.SimpleElementColor simpleElementColor, @Nullable StyleElements.SimpleElementColor simpleElementColor2, @Nullable StyleElements.ComplexElementColor complexElementColor, @Nullable StyleElements.SimpleElementColor simpleElementColor3) {
            this.base = simpleElementColor;
            this.modal = simpleElementColor2;
            this.option = complexElementColor;
            this.staticCaptureTips = simpleElementColor3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getBase() {
            return this.base;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getModal() {
            return this.modal;
        }

        @Nullable
        public final StyleElements.ComplexElementColor getOption() {
            return this.option;
        }

        @Nullable
        public final StyleElements.SimpleElementColor getStaticCaptureTips() {
            return this.staticCaptureTips;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StyleElements.SimpleElementColor simpleElementColor = this.base;
            if (simpleElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor2 = this.modal;
            if (simpleElementColor2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor2.writeToParcel(dest, flags);
            }
            StyleElements.ComplexElementColor complexElementColor = this.option;
            if (complexElementColor == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                complexElementColor.writeToParcel(dest, flags);
            }
            StyleElements.SimpleElementColor simpleElementColor3 = this.staticCaptureTips;
            if (simpleElementColor3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                simpleElementColor3.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ StepBackgroundColorStyle(StyleElements.SimpleElementColor simpleElementColor, StyleElements.SimpleElementColor simpleElementColor2, StyleElements.ComplexElementColor complexElementColor, StyleElements.SimpleElementColor simpleElementColor3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(simpleElementColor, (i10 & 2) != 0 ? null : simpleElementColor2, complexElementColor, simpleElementColor3);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "modal", "selfieProcessingText", "selfieCaptureHintText", "selfieSmallText", "selfieCaptureDisclaimerText", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getModal", "getSelfieProcessingText", "getSelfieCaptureHintText", "getSelfieSmallText", "getSelfieCaptureDisclaimerText", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class SelfieStepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelfieStepTextBasedComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepTextBasedComponentStyleContainer base;

        @Nullable
        private final StepTextBasedComponentStyleContainer modal;

        @Nullable
        private final StepTextBasedComponentStyleContainer selfieCaptureDisclaimerText;

        @Nullable
        private final StepTextBasedComponentStyleContainer selfieCaptureHintText;

        @Nullable
        private final StepTextBasedComponentStyleContainer selfieProcessingText;

        @Nullable
        private final StepTextBasedComponentStyleContainer selfieSmallText;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelfieStepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelfieStepTextBasedComponentStyle[] newArray(int i10) {
                return new SelfieStepTextBasedComponentStyle[i10];
            }
        }

        public SelfieStepTextBasedComponentStyle(@Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer5, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer6) {
            this.base = stepTextBasedComponentStyleContainer;
            this.modal = stepTextBasedComponentStyleContainer2;
            this.selfieProcessingText = stepTextBasedComponentStyleContainer3;
            this.selfieCaptureHintText = stepTextBasedComponentStyleContainer4;
            this.selfieSmallText = stepTextBasedComponentStyleContainer5;
            this.selfieCaptureDisclaimerText = stepTextBasedComponentStyleContainer6;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getModal() {
            return this.modal;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getSelfieCaptureDisclaimerText() {
            return this.selfieCaptureDisclaimerText;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getSelfieCaptureHintText() {
            return this.selfieCaptureHintText;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getSelfieProcessingText() {
            return this.selfieProcessingText;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getSelfieSmallText() {
            return this.selfieSmallText;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.modal;
            if (stepTextBasedComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.selfieProcessingText;
            if (stepTextBasedComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4 = this.selfieCaptureHintText;
            if (stepTextBasedComponentStyleContainer4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer4.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer5 = this.selfieSmallText;
            if (stepTextBasedComponentStyleContainer5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer5.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer6 = this.selfieCaptureDisclaimerText;
            if (stepTextBasedComponentStyleContainer6 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer6.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ SelfieStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer5, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stepTextBasedComponentStyleContainer, (i10 & 2) != 0 ? null : stepTextBasedComponentStyleContainer2, stepTextBasedComponentStyleContainer3, stepTextBasedComponentStyleContainer4, stepTextBasedComponentStyleContainer5, stepTextBasedComponentStyleContainer6);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepTextBasedComponentStyle;", "Landroid/os/Parcelable;", "base", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "modal", "governmentIdVerticalOption", "governmentIdCaptureHintText", "governmentIdCaptureDescription", "governmentIdProcessingText", "staticCaptureTipsTitle", "staticCaptureTipsSubtext", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;)V", "getBase", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$StepTextBasedComponentStyleContainer;", "getModal", "getGovernmentIdVerticalOption", "getGovernmentIdCaptureHintText", "getGovernmentIdCaptureDescription", "getGovernmentIdProcessingText", "getStaticCaptureTipsTitle", "getStaticCaptureTipsSubtext", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(generateAdapter = true)
    public static final class GovernmentIdStepTextBasedComponentStyle implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdStepTextBasedComponentStyle> CREATOR = new Creator();

        @Nullable
        private final StepTextBasedComponentStyleContainer base;

        @Nullable
        private final StepTextBasedComponentStyleContainer governmentIdCaptureDescription;

        @Nullable
        private final StepTextBasedComponentStyleContainer governmentIdCaptureHintText;

        @Nullable
        private final StepTextBasedComponentStyleContainer governmentIdProcessingText;

        @Nullable
        private final StepTextBasedComponentStyleContainer governmentIdVerticalOption;

        @Nullable
        private final StepTextBasedComponentStyleContainer modal;

        @Nullable
        private final StepTextBasedComponentStyleContainer staticCaptureTipsSubtext;

        @Nullable
        private final StepTextBasedComponentStyleContainer staticCaptureTipsTitle;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdStepTextBasedComponentStyle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepTextBasedComponentStyle createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdStepTextBasedComponentStyle(parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? StepTextBasedComponentStyleContainer.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdStepTextBasedComponentStyle[] newArray(int i10) {
                return new GovernmentIdStepTextBasedComponentStyle[i10];
            }
        }

        public GovernmentIdStepTextBasedComponentStyle(@Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer5, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer6, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer7, @Nullable StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer8) {
            this.base = stepTextBasedComponentStyleContainer;
            this.modal = stepTextBasedComponentStyleContainer2;
            this.governmentIdVerticalOption = stepTextBasedComponentStyleContainer3;
            this.governmentIdCaptureHintText = stepTextBasedComponentStyleContainer4;
            this.governmentIdCaptureDescription = stepTextBasedComponentStyleContainer5;
            this.governmentIdProcessingText = stepTextBasedComponentStyleContainer6;
            this.staticCaptureTipsTitle = stepTextBasedComponentStyleContainer7;
            this.staticCaptureTipsSubtext = stepTextBasedComponentStyleContainer8;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getBase() {
            return this.base;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getGovernmentIdCaptureDescription() {
            return this.governmentIdCaptureDescription;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getGovernmentIdCaptureHintText() {
            return this.governmentIdCaptureHintText;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getGovernmentIdProcessingText() {
            return this.governmentIdProcessingText;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getGovernmentIdVerticalOption() {
            return this.governmentIdVerticalOption;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getModal() {
            return this.modal;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getStaticCaptureTipsSubtext() {
            return this.staticCaptureTipsSubtext;
        }

        @Nullable
        public final StepTextBasedComponentStyleContainer getStaticCaptureTipsTitle() {
            return this.staticCaptureTipsTitle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer = this.base;
            if (stepTextBasedComponentStyleContainer == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2 = this.modal;
            if (stepTextBasedComponentStyleContainer2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer2.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3 = this.governmentIdVerticalOption;
            if (stepTextBasedComponentStyleContainer3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer3.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4 = this.governmentIdCaptureHintText;
            if (stepTextBasedComponentStyleContainer4 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer4.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer5 = this.governmentIdCaptureDescription;
            if (stepTextBasedComponentStyleContainer5 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer5.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer6 = this.governmentIdProcessingText;
            if (stepTextBasedComponentStyleContainer6 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer6.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer7 = this.staticCaptureTipsTitle;
            if (stepTextBasedComponentStyleContainer7 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer7.writeToParcel(dest, flags);
            }
            StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer8 = this.staticCaptureTipsSubtext;
            if (stepTextBasedComponentStyleContainer8 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                stepTextBasedComponentStyleContainer8.writeToParcel(dest, flags);
            }
        }

        public /* synthetic */ GovernmentIdStepTextBasedComponentStyle(StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer2, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer3, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer4, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer5, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer6, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer7, StepTextBasedComponentStyleContainer stepTextBasedComponentStyleContainer8, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(stepTextBasedComponentStyleContainer, (i10 & 2) != 0 ? null : stepTextBasedComponentStyleContainer2, stepTextBasedComponentStyleContainer3, stepTextBasedComponentStyleContainer4, (i10 & 16) != 0 ? null : stepTextBasedComponentStyleContainer5, stepTextBasedComponentStyleContainer6, stepTextBasedComponentStyleContainer7, stepTextBasedComponentStyleContainer8);
        }
    }
}
