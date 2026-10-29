package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StepStyles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p390qp.EnumC10688b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0016J\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006C"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;", "Landroid/os/Parcelable;", "", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "mrzKey", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "passportNfcStrings", "", "Lqp/b;", "enabledDataGroups", "", "theme", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "stepStyles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "componentStyles", "", "bacFallbackReconnectEnabled", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;Z)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCardAccessNumber", "b", "Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "getMrzKey", "()Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "c", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "getPassportNfcStrings", "()Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "d", "Ljava/util/List;", "getEnabledDataGroups", "()Ljava/util/List;", "e", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStepStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "getComponentStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "h", "Z", "getBacFallbackReconnectEnabled", "()Z", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class PassportNfcReaderConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PassportNfcReaderConfig> CREATOR = new C3819a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String cardAccessNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final MrzKey mrzKey;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final PassportNfcStrings passportNfcStrings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<EnumC10688b> enabledDataGroups;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer theme;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final StepStyles.UiStepStyle stepStyles;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final boolean bacFallbackReconnectEnabled;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderConfig$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3819a implements Parcelable.Creator<PassportNfcReaderConfig> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PassportNfcReaderConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            MrzKey mrzKeyCreateFromParcel = MrzKey.CREATOR.createFromParcel(parcel);
            PassportNfcStrings passportNfcStringsCreateFromParcel = PassportNfcStrings.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(EnumC10688b.valueOf(parcel.readString()));
            }
            return new PassportNfcReaderConfig(string, mrzKeyCreateFromParcel, passportNfcStringsCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (StepStyles.UiStepStyle) parcel.readParcelable(PassportNfcReaderConfig.class.getClassLoader()), (GovernmentIdNfcScan.GovernmentIdNfcScanStyles) parcel.readParcelable(PassportNfcReaderConfig.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PassportNfcReaderConfig[] newArray(int i10) {
            return new PassportNfcReaderConfig[i10];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends qp.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public PassportNfcReaderConfig(@NotNull String cardAccessNumber, @NotNull MrzKey mrzKey, @NotNull PassportNfcStrings passportNfcStrings, @NotNull List<? extends EnumC10688b> enabledDataGroups, @Nullable Integer num, @Nullable StepStyles.UiStepStyle uiStepStyle, @Nullable GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles, boolean z10) {
        Intrinsics.checkNotNullParameter(cardAccessNumber, "cardAccessNumber");
        Intrinsics.checkNotNullParameter(mrzKey, "mrzKey");
        Intrinsics.checkNotNullParameter(passportNfcStrings, "passportNfcStrings");
        Intrinsics.checkNotNullParameter(enabledDataGroups, "enabledDataGroups");
        this.cardAccessNumber = cardAccessNumber;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = enabledDataGroups;
        this.theme = num;
        this.stepStyles = uiStepStyle;
        this.componentStyles = governmentIdNfcScanStyles;
        this.bacFallbackReconnectEnabled = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportNfcReaderConfig)) {
            return false;
        }
        PassportNfcReaderConfig passportNfcReaderConfig = (PassportNfcReaderConfig) other;
        return Intrinsics.m31980c(this.cardAccessNumber, passportNfcReaderConfig.cardAccessNumber) && Intrinsics.m31980c(this.mrzKey, passportNfcReaderConfig.mrzKey) && Intrinsics.m31980c(this.passportNfcStrings, passportNfcReaderConfig.passportNfcStrings) && Intrinsics.m31980c(this.enabledDataGroups, passportNfcReaderConfig.enabledDataGroups) && Intrinsics.m31980c(this.theme, passportNfcReaderConfig.theme) && Intrinsics.m31980c(this.stepStyles, passportNfcReaderConfig.stepStyles) && Intrinsics.m31980c(this.componentStyles, passportNfcReaderConfig.componentStyles) && this.bacFallbackReconnectEnabled == passportNfcReaderConfig.bacFallbackReconnectEnabled;
    }

    public int hashCode() {
        int iHashCode = ((((((this.cardAccessNumber.hashCode() * 31) + this.mrzKey.hashCode()) * 31) + this.passportNfcStrings.hashCode()) * 31) + this.enabledDataGroups.hashCode()) * 31;
        Integer num = this.theme;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        StepStyles.UiStepStyle uiStepStyle = this.stepStyles;
        int iHashCode3 = (iHashCode2 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
        GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles = this.componentStyles;
        return ((iHashCode3 + (governmentIdNfcScanStyles != null ? governmentIdNfcScanStyles.hashCode() : 0)) * 31) + Boolean.hashCode(this.bacFallbackReconnectEnabled);
    }

    @NotNull
    public String toString() {
        return "PassportNfcReaderConfig(cardAccessNumber=" + this.cardAccessNumber + ", mrzKey=" + this.mrzKey + ", passportNfcStrings=" + this.passportNfcStrings + ", enabledDataGroups=" + this.enabledDataGroups + ", theme=" + this.theme + ", stepStyles=" + this.stepStyles + ", componentStyles=" + this.componentStyles + ", bacFallbackReconnectEnabled=" + this.bacFallbackReconnectEnabled + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.cardAccessNumber);
        this.mrzKey.writeToParcel(dest, flags);
        this.passportNfcStrings.writeToParcel(dest, flags);
        List<EnumC10688b> list = this.enabledDataGroups;
        dest.writeInt(list.size());
        Iterator<EnumC10688b> it = list.iterator();
        while (it.hasNext()) {
            dest.writeString(it.next().name());
        }
        Integer num = this.theme;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeParcelable(this.stepStyles, flags);
        dest.writeParcelable(this.componentStyles, flags);
        dest.writeInt(this.bacFallbackReconnectEnabled ? 1 : 0);
    }
}
