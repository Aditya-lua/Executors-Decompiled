package com.withpersona.sdk2.inquiry.network.dto.p054ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.UiComponentAttributes;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.AttributeStyles;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.InputTextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.InterfaceC11871f;
import p471um.InterfaceC11874i;
import p471um.InterfaceC11891z;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0006\u0017\u0018\u0019\u001a\u001b\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "name", "", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "GovernmentIdNfcScanStyles", "DataGroupTypes", "Attributes", "ScanHint", "TipsButtonLocation", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class GovernmentIdNfcScan implements UiComponentConfig {

    @NotNull
    public static final String cardAccessNumberName = "card_access_number";

    @NotNull
    public static final String dateOfBirthName = "date_of_birth";

    @NotNull
    public static final String documentNumberName = "document_number";

    @NotNull
    public static final String expirationDateName = "expiration_date";

    @NotNull
    public static final String launchButtonName = "launch_button";

    @NotNull
    public static final String type = "government_id_nfc_scan";

    @Nullable
    private final Attributes attributes;

    @NotNull
    private final String name;

    @Nullable
    private final GovernmentIdNfcScanStyles styles;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<GovernmentIdNfcScan> CREATOR = new Creator();

    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Companion;", "", "<init>", "()V", Payload.TYPE, "", "launchButtonName", "cardAccessNumberName", "documentNumberName", "dateOfBirthName", "expirationDateName", "generateTextMonths", "", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> generateTextMonths() {
            ArrayList arrayList = new ArrayList();
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", Locale.getDefault());
            calendar.set(5, 1);
            calendar.set(1, 2000);
            for (int i10 = 0; i10 < 12; i10++) {
                calendar.set(2, i10);
                String str = simpleDateFormat.format(calendar.getTime());
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                arrayList.add(str);
            }
            return arrayList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScan> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdNfcScan createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GovernmentIdNfcScan(parcel.readString(), parcel.readInt() == 0 ? null : Attributes.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GovernmentIdNfcScanStyles.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GovernmentIdNfcScan[] newArray(int i10) {
            return new GovernmentIdNfcScan[i10];
        }
    }

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;", "", "<init>", "(Ljava/lang/String;I)V", "Dg1", "Dg2", "Dg14", "Sod", "Unknown", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum DataGroupTypes {
        Dg1,
        Dg2,
        Dg14,
        Sod,
        Unknown;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<DataGroupTypes> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan.DataGroupTypes.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable DataGroupTypes value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @NotNull
            @InterfaceC11871f
            public DataGroupTypes fromJson(@NotNull AbstractC11878m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object objM44315B = reader.m44315B();
                if (Intrinsics.m31980c(objM44315B, "dg1")) {
                    return DataGroupTypes.Dg1;
                }
                if (Intrinsics.m31980c(objM44315B, "dg2")) {
                    return DataGroupTypes.Dg2;
                }
                if (Intrinsics.m31980c(objM44315B, "dg14")) {
                    return DataGroupTypes.Dg14;
                }
                return Intrinsics.m31980c(objM44315B, "sod") ? DataGroupTypes.Sod : DataGroupTypes.Unknown;
            }
        }

        @NotNull
        public static InterfaceC10707a<DataGroupTypes> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m31664d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010F\u001a\u00020=J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020=R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010(\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0013\u0010,\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b-\u0010+R\u0013\u0010.\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u0001078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010:\u001a\u0004\u0018\u0001078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0016\u0010<\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0016\u0010@\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0016\u0010B\u001a\u0004\u0018\u00010=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010?R\u0016\u0010D\u001a\u0004\u0018\u0001038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u00105¨\u0006L"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;", "buttonPrimaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;", "buttonSecondaryStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStyles;", "inputTextStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;", "inputDateStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;", "textStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStyles;", "titleStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStyles;", "backgroundColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanBackgroundColorStyle;", "strokeColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanStrokeColorStyle;", "fillColor", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanFillColorStyle;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStyles;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanBackgroundColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanStrokeColorStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanFillColorStyle;)V", "getButtonPrimaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanPrimaryButtonStyles;", "getButtonSecondaryStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanSecondaryButtonStyles;", "getInputTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputTextStyles;", "getInputDateStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanInputDateStyles;", "getTextStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTextStyles;", "getTitleStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanTitleStyles;", "getBackgroundColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanBackgroundColorStyle;", "getStrokeColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanStrokeColorStyle;", "getFillColor", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/AttributeStyles$GovernmentIdNfcScanFillColorStyle;", "documentNumberStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "getDocumentNumberStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/InputTextBasedComponentStyle;", "cardAccessNumberStyle", "getCardAccessNumberStyle", "dateStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "getDateStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/InputDate$InputDateComponentStyle;", "errorLabelStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getErrorLabelStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "launchButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getLaunchButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "secondaryButtonStyle", "getSecondaryButtonStyle", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "strokeColorValue", "getStrokeColorValue", "helpTextviewStyle", "getHelpTextviewStyle", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class GovernmentIdNfcScanStyles implements HelpBottomSheetComponentStyle {

        @NotNull
        public static final Parcelable.Creator<GovernmentIdNfcScanStyles> CREATOR = new Creator();

        @Nullable
        private final AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle backgroundColor;

        @Nullable
        private final AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles buttonPrimaryStyle;

        @Nullable
        private final AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles buttonSecondaryStyle;

        @Nullable
        private final AttributeStyles.GovernmentIdNfcScanFillColorStyle fillColor;

        @Nullable
        private final AttributeStyles.GovernmentIdNfcScanInputDateStyles inputDateStyle;

        @Nullable
        private final AttributeStyles.GovernmentIdNfcScanInputTextStyles inputTextStyle;

        @Nullable
        private final AttributeStyles.GovernmentIdNfcScanStrokeColorStyle strokeColor;

        @Nullable
        private final AttributeStyles.GovernmentIdNfcScanTextStyles textStyle;

        @Nullable
        private final AttributeStyles.GovernmentIdNfcScanTitleStyles titleStyle;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<GovernmentIdNfcScanStyles> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanStyles createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GovernmentIdNfcScanStyles(parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanInputTextStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanInputDateStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanTextStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanTitleStyles.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AttributeStyles.GovernmentIdNfcScanStrokeColorStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AttributeStyles.GovernmentIdNfcScanFillColorStyle.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GovernmentIdNfcScanStyles[] newArray(int i10) {
                return new GovernmentIdNfcScanStyles[i10];
            }
        }

        public GovernmentIdNfcScanStyles(@Nullable AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles, @Nullable AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles governmentIdNfcScanSecondaryButtonStyles, @Nullable AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles, @Nullable AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles, @Nullable AttributeStyles.GovernmentIdNfcScanTextStyles governmentIdNfcScanTextStyles, @Nullable AttributeStyles.GovernmentIdNfcScanTitleStyles governmentIdNfcScanTitleStyles, @Nullable AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle governmentIdNfcScanBackgroundColorStyle, @Nullable AttributeStyles.GovernmentIdNfcScanStrokeColorStyle governmentIdNfcScanStrokeColorStyle, @Nullable AttributeStyles.GovernmentIdNfcScanFillColorStyle governmentIdNfcScanFillColorStyle) {
            this.buttonPrimaryStyle = governmentIdNfcScanPrimaryButtonStyles;
            this.buttonSecondaryStyle = governmentIdNfcScanSecondaryButtonStyles;
            this.inputTextStyle = governmentIdNfcScanInputTextStyles;
            this.inputDateStyle = governmentIdNfcScanInputDateStyles;
            this.textStyle = governmentIdNfcScanTextStyles;
            this.titleStyle = governmentIdNfcScanTitleStyles;
            this.backgroundColor = governmentIdNfcScanBackgroundColorStyle;
            this.strokeColor = governmentIdNfcScanStrokeColorStyle;
            this.fillColor = governmentIdNfcScanFillColorStyle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle getBackgroundColor() {
            return this.backgroundColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.HelpBottomSheetComponentStyle
        @Nullable
        public Integer getBackgroundColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle governmentIdNfcScanBackgroundColorStyle = this.backgroundColor;
            if (governmentIdNfcScanBackgroundColorStyle == null || (base = governmentIdNfcScanBackgroundColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles getButtonPrimaryStyle() {
            return this.buttonPrimaryStyle;
        }

        @Nullable
        public final AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles getButtonSecondaryStyle() {
            return this.buttonSecondaryStyle;
        }

        @Nullable
        public final InputTextBasedComponentStyle getCardAccessNumberStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final InputDate.InputDateComponentStyle getDateStyle() {
            AttributeStyles.GovernmentIdNfcScanInputDateStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles = this.inputDateStyle;
            if (governmentIdNfcScanInputDateStyles == null || (base = governmentIdNfcScanInputDateStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final InputTextBasedComponentStyle getDocumentNumberStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final TextBasedComponentStyle getErrorLabelStyle() {
            AttributeStyles.GovernmentIdNfcScanInputTextStylesContainer base;
            InputTextBasedComponentStyle base2;
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null || (base = governmentIdNfcScanInputTextStyles.getBase()) == null || (base2 = base.getBase()) == null) {
                return null;
            }
            return base2.getErrorTextStyle();
        }

        @Nullable
        public final AttributeStyles.GovernmentIdNfcScanFillColorStyle getFillColor() {
            return this.fillColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.HelpBottomSheetComponentStyle
        @Nullable
        public Integer getFillColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.GovernmentIdNfcScanFillColorStyle governmentIdNfcScanFillColorStyle = this.fillColor;
            if (governmentIdNfcScanFillColorStyle == null || (base = governmentIdNfcScanFillColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.GovernmentIdNfcScanInputDateStyles getInputDateStyle() {
            return this.inputDateStyle;
        }

        @Nullable
        public final AttributeStyles.GovernmentIdNfcScanInputTextStyles getInputTextStyle() {
            return this.inputTextStyle;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.HelpBottomSheetComponentStyle
        @Nullable
        public ButtonSubmitComponentStyle getLaunchButtonStyle() {
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles = this.buttonPrimaryStyle;
            if (governmentIdNfcScanPrimaryButtonStyles == null || (base = governmentIdNfcScanPrimaryButtonStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.HelpBottomSheetComponentStyle
        @Nullable
        public ButtonSubmitComponentStyle getSecondaryButtonStyle() {
            AttributeStyles.GovernmentIdNfcScanSecondaryButtonStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles governmentIdNfcScanSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (governmentIdNfcScanSecondaryButtonStyles == null || (base = governmentIdNfcScanSecondaryButtonStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.GovernmentIdNfcScanStrokeColorStyle getStrokeColor() {
            return this.strokeColor;
        }

        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.HelpBottomSheetComponentStyle
        @Nullable
        public Integer getStrokeColorValue() {
            StyleElements.ComplexElementColor base;
            AttributeStyles.GovernmentIdNfcScanStrokeColorStyle governmentIdNfcScanStrokeColorStyle = this.strokeColor;
            if (governmentIdNfcScanStrokeColorStyle == null || (base = governmentIdNfcScanStrokeColorStyle.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }

        @Nullable
        public final AttributeStyles.GovernmentIdNfcScanTextStyles getTextStyle() {
            return this.textStyle;
        }

        @Nullable
        public final AttributeStyles.GovernmentIdNfcScanTitleStyles getTitleStyle() {
            return this.titleStyle;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            AttributeStyles.GovernmentIdNfcScanPrimaryButtonStyles governmentIdNfcScanPrimaryButtonStyles = this.buttonPrimaryStyle;
            if (governmentIdNfcScanPrimaryButtonStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanPrimaryButtonStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanSecondaryButtonStyles governmentIdNfcScanSecondaryButtonStyles = this.buttonSecondaryStyle;
            if (governmentIdNfcScanSecondaryButtonStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanSecondaryButtonStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanInputTextStyles governmentIdNfcScanInputTextStyles = this.inputTextStyle;
            if (governmentIdNfcScanInputTextStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanInputTextStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanInputDateStyles governmentIdNfcScanInputDateStyles = this.inputDateStyle;
            if (governmentIdNfcScanInputDateStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanInputDateStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanTextStyles governmentIdNfcScanTextStyles = this.textStyle;
            if (governmentIdNfcScanTextStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanTextStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanTitleStyles governmentIdNfcScanTitleStyles = this.titleStyle;
            if (governmentIdNfcScanTitleStyles == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanTitleStyles.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanBackgroundColorStyle governmentIdNfcScanBackgroundColorStyle = this.backgroundColor;
            if (governmentIdNfcScanBackgroundColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanBackgroundColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanStrokeColorStyle governmentIdNfcScanStrokeColorStyle = this.strokeColor;
            if (governmentIdNfcScanStrokeColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanStrokeColorStyle.writeToParcel(dest, flags);
            }
            AttributeStyles.GovernmentIdNfcScanFillColorStyle governmentIdNfcScanFillColorStyle = this.fillColor;
            if (governmentIdNfcScanFillColorStyle == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdNfcScanFillColorStyle.writeToParcel(dest, flags);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: getHelpTextviewStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle; */
        @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.HelpBottomSheetComponentStyle
        @Nullable
        public TextBasedComponentStyle getHelpTextviewStyle() {
            AttributeStyles.GovernmentIdNfcScanTextStylesContainer base;
            AttributeStyles.GovernmentIdNfcScanTextStyles governmentIdNfcScanTextStyles = this.textStyle;
            if (governmentIdNfcScanTextStyles == null || (base = governmentIdNfcScanTextStyles.getBase()) == null) {
                return null;
            }
            return base.getBase();
        }
    }

    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$ScanHint;", "Landroid/os/Parcelable;", "hintType", "", "hintText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHintType", "()Ljava/lang/String;", "getHintText", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class ScanHint implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ScanHint> CREATOR = new Creator();

        @NotNull
        private final String hintText;

        @NotNull
        private final String hintType;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<ScanHint> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanHint createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScanHint(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ScanHint[] newArray(int i10) {
                return new ScanHint[i10];
            }
        }

        public ScanHint(@NotNull String hintType, @NotNull String hintText) {
            Intrinsics.checkNotNullParameter(hintType, "hintType");
            Intrinsics.checkNotNullParameter(hintText, "hintText");
            this.hintType = hintType;
            this.hintText = hintText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        public final String getHintText() {
            return this.hintText;
        }

        @NotNull
        public final String getHintType() {
            return this.hintType;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.hintType);
            dest.writeString(this.hintText);
        }
    }

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "", "<init>", "(Ljava/lang/String;I)V", "NavigationBar", "OnScreen", "Unknown", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum TipsButtonLocation {
        NavigationBar,
        OnScreen,
        Unknown;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation$Companion;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "<init>", "()V", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "Lum/t;", "writer", "value", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;)V", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Companion extends AbstractC11873h<TipsButtonLocation> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan.TipsButtonLocation.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
            @Override // p471um.AbstractC11873h
            @InterfaceC11891z
            public void toJson(@NotNull AbstractC11885t writer, @Nullable TipsButtonLocation value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p471um.AbstractC11873h
            @NotNull
            @InterfaceC11871f
            public TipsButtonLocation fromJson(@NotNull AbstractC11878m reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object objM44315B = reader.m44315B();
                if (Intrinsics.m31980c(objM44315B, "navigation_bar")) {
                    return TipsButtonLocation.NavigationBar;
                }
                return Intrinsics.m31980c(objM44315B, "on_screen") ? TipsButtonLocation.OnScreen : TipsButtonLocation.Unknown;
            }
        }

        @NotNull
        public static InterfaceC10707a<TipsButtonLocation> getEntries() {
            return $ENTRIES;
        }
    }

    public GovernmentIdNfcScan(@NotNull String name, @Nullable Attributes attributes, @Nullable GovernmentIdNfcScanStyles governmentIdNfcScanStyles) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.attributes = attributes;
        this.styles = governmentIdNfcScanStyles;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @NotNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public final GovernmentIdNfcScanStyles getStyles() {
        return this.styles;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.name);
        Attributes attributes = this.attributes;
        if (attributes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            attributes.writeToParcel(dest, flags);
        }
        GovernmentIdNfcScanStyles governmentIdNfcScanStyles = this.styles;
        if (governmentIdNfcScanStyles == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            governmentIdNfcScanStyles.writeToParcel(dest, flags);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes; */
    @Override // com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig
    @Nullable
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Metadata(m31664d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b<\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bý\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0014\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0006\u0012\b\u00100\u001a\u0004\u0018\u00010\u0006\u0012\b\u00101\u001a\u0004\u0018\u00010\u0006\u0012\b\u00102\u001a\u0004\u0018\u00010\u0006\u0012\b\u00103\u001a\u0004\u0018\u00010\u0006\u0012\b\u00104\u001a\u0004\u0018\u00010\u0006\u0012\b\u00105\u001a\u0004\u0018\u00010\u0006\u0012\b\u00106\u001a\u0004\u0018\u00010\u0006\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\b\b\u0002\u00109\u001a\u00020:¢\u0006\u0004\b;\u0010<J\u0006\u0010u\u001a\u00020:J\u0016\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020:R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010>R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u0010AR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bC\u0010AR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bD\u0010AR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bE\u0010AR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bF\u0010AR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bG\u0010AR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bH\u0010AR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bI\u0010AR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010AR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bK\u0010AR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bL\u0010AR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bM\u0010AR\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u0010AR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010AR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u0010AR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bS\u0010AR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bT\u0010AR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bV\u0010AR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bW\u0010AR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\n\n\u0002\u0010Z\u001a\u0004\bX\u0010YR\u0013\u0010 \u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b[\u0010AR\u0013\u0010!\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010AR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b]\u0010AR\u0019\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b^\u0010OR\u0013\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b_\u0010AR\u0013\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b`\u0010AR\u0013\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\ba\u0010AR\u0013\u0010(\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bb\u0010AR\u0013\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bc\u0010AR\u0013\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bd\u0010AR\u0013\u0010+\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\be\u0010AR\u0013\u0010,\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bf\u0010AR\u0013\u0010-\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bg\u0010AR\u0013\u0010.\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bh\u0010AR\u0013\u0010/\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bi\u0010AR\u0013\u00100\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bj\u0010AR\u0013\u00101\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bk\u0010AR\u0013\u00102\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bl\u0010AR\u0013\u00103\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bm\u0010AR\u0013\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bn\u0010AR\u0013\u00105\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bo\u0010AR\u0013\u00106\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bp\u0010AR\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bq\u0010rR\u0011\u00109\u001a\u00020:¢\u0006\b\n\u0000\u001a\u0004\bs\u0010t¨\u0006{"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$Attributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "documentNumberLabel", "", "prefillCardAccessNumber", "prefillDocumentNumber", "dateOfBirthLabel", "prefillDateOfBirth", "cardAccessNumberLabel", "expirationDateLabel", "prefillExpirationDate", "launchButtonText", "scanDocumentPrompt", "scanDocumentPromptTitle", "scanDocumentSuccess", "scanDocumentSuccessTitle", "enabledDataGroups", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$DataGroupTypes;", "authenticating", "authenticatingTitle", "reading", "readingTitle", "requiredText", "scanDocumentError", "enableNfcPrompt", "authenticationErrorPrompt", "hidePrefilledInputs", "", "connectionLostPrompt", "unsupportedDocumentType", "retryError", "scanHints", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$ScanHint;", "hintsSheetTitle", "closeHintSheetButtonText", "userUnableToScanHintSheetButtonText", "errorModalChipNotDetectedTitle", "errorModalChipNotDetectedText", "errorModalLostConnectionTitle", "errorModalLostConnectionText", "errorModalIncorrectIdDetailsTitle", "errorModalIncorrectIdDetailsText", "errorModalGenericErrorTitle", "errorModalGenericErrorText", "errorModalTryAgainButtonText", "errorModalTroubleshootingTipsButtonText", "errorModalReenterIdDetailsButtonText", "rescanDocumentPrompt", "successfulScanTransitionComponentName", "unableToScanTransitionComponentName", "incorrectIdDetailsTransitionComponentName", "tipsButtonLocation", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "unableToScanButtonMinAttempts", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;I)V", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getDisabled", "getDocumentNumberLabel", "()Ljava/lang/String;", "getPrefillCardAccessNumber", "getPrefillDocumentNumber", "getDateOfBirthLabel", "getPrefillDateOfBirth", "getCardAccessNumberLabel", "getExpirationDateLabel", "getPrefillExpirationDate", "getLaunchButtonText", "getScanDocumentPrompt", "getScanDocumentPromptTitle", "getScanDocumentSuccess", "getScanDocumentSuccessTitle", "getEnabledDataGroups", "()Ljava/util/List;", "getAuthenticating", "getAuthenticatingTitle", "getReading", "getReadingTitle", "getRequiredText", "getScanDocumentError", "getEnableNfcPrompt", "getAuthenticationErrorPrompt", "getHidePrefilledInputs", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getConnectionLostPrompt", "getUnsupportedDocumentType", "getRetryError", "getScanHints", "getHintsSheetTitle", "getCloseHintSheetButtonText", "getUserUnableToScanHintSheetButtonText", "getErrorModalChipNotDetectedTitle", "getErrorModalChipNotDetectedText", "getErrorModalLostConnectionTitle", "getErrorModalLostConnectionText", "getErrorModalIncorrectIdDetailsTitle", "getErrorModalIncorrectIdDetailsText", "getErrorModalGenericErrorTitle", "getErrorModalGenericErrorText", "getErrorModalTryAgainButtonText", "getErrorModalTroubleshootingTipsButtonText", "getErrorModalReenterIdDetailsButtonText", "getRescanDocumentPrompt", "getSuccessfulScanTransitionComponentName", "getUnableToScanTransitionComponentName", "getIncorrectIdDetailsTransitionComponentName", "getTipsButtonLocation", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$TipsButtonLocation;", "getUnableToScanButtonMinAttempts", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Attributes implements UiComponentAttributes {

        @NotNull
        public static final Parcelable.Creator<Attributes> CREATOR = new Creator();

        @Nullable
        private final String authenticating;

        @Nullable
        private final String authenticatingTitle;

        @Nullable
        private final String authenticationErrorPrompt;

        @Nullable
        private final String cardAccessNumberLabel;

        @Nullable
        private final String closeHintSheetButtonText;

        @Nullable
        private final String connectionLostPrompt;

        @Nullable
        private final String dateOfBirthLabel;

        @Nullable
        private final JsonLogicBoolean disabled;

        @Nullable
        private final String documentNumberLabel;

        @Nullable
        private final String enableNfcPrompt;

        @Nullable
        private final List<DataGroupTypes> enabledDataGroups;

        @Nullable
        private final String errorModalChipNotDetectedText;

        @Nullable
        private final String errorModalChipNotDetectedTitle;

        @Nullable
        private final String errorModalGenericErrorText;

        @Nullable
        private final String errorModalGenericErrorTitle;

        @Nullable
        private final String errorModalIncorrectIdDetailsText;

        @Nullable
        private final String errorModalIncorrectIdDetailsTitle;

        @Nullable
        private final String errorModalLostConnectionText;

        @Nullable
        private final String errorModalLostConnectionTitle;

        @Nullable
        private final String errorModalReenterIdDetailsButtonText;

        @Nullable
        private final String errorModalTroubleshootingTipsButtonText;

        @Nullable
        private final String errorModalTryAgainButtonText;

        @Nullable
        private final String expirationDateLabel;

        @Nullable
        private final JsonLogicBoolean hidden;

        @Nullable
        private final Boolean hidePrefilledInputs;

        @Nullable
        private final String hintsSheetTitle;

        @Nullable
        private final String incorrectIdDetailsTransitionComponentName;

        @Nullable
        private final String launchButtonText;

        @Nullable
        private final String prefillCardAccessNumber;

        @Nullable
        private final String prefillDateOfBirth;

        @Nullable
        private final String prefillDocumentNumber;

        @Nullable
        private final String prefillExpirationDate;

        @Nullable
        private final String reading;

        @Nullable
        private final String readingTitle;

        @Nullable
        private final String requiredText;

        @Nullable
        private final String rescanDocumentPrompt;

        @Nullable
        private final String retryError;

        @Nullable
        private final String scanDocumentError;

        @Nullable
        private final String scanDocumentPrompt;

        @Nullable
        private final String scanDocumentPromptTitle;

        @Nullable
        private final String scanDocumentSuccess;

        @Nullable
        private final String scanDocumentSuccessTitle;

        @Nullable
        private final List<ScanHint> scanHints;

        @Nullable
        private final String successfulScanTransitionComponentName;

        @Nullable
        private final TipsButtonLocation tipsButtonLocation;
        private final int unableToScanButtonMinAttempts;

        @Nullable
        private final String unableToScanTransitionComponentName;

        @Nullable
        private final String unsupportedDocumentType;

        @Nullable
        private final String userUnableToScanHintSheetButtonText;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Attributes> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                JsonLogicBoolean jsonLogicBooleanCreateFromParcel = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                JsonLogicBoolean jsonLogicBooleanCreateFromParcel2 = parcel.readInt() == 0 ? null : JsonLogicBoolean.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i10 = parcel.readInt();
                    arrayList = new ArrayList(i10);
                    int i11 = 0;
                    while (i11 != i10) {
                        arrayList.add(DataGroupTypes.valueOf(parcel.readString()));
                        i11++;
                        i10 = i10;
                    }
                }
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                String string24 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList3 = arrayList;
                    arrayList2 = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i12);
                    ArrayList arrayList5 = arrayList;
                    for (int i13 = 0; i13 != i12; i13++) {
                        arrayList4.add(ScanHint.CREATOR.createFromParcel(parcel));
                    }
                    arrayList2 = arrayList4;
                    arrayList3 = arrayList5;
                }
                return new Attributes(jsonLogicBooleanCreateFromParcel, jsonLogicBooleanCreateFromParcel2, string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, arrayList3, string14, string15, string16, string17, string18, string19, string20, string21, boolValueOf, string22, string23, string24, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TipsButtonLocation.valueOf(parcel.readString()), parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Attributes[] newArray(int i10) {
                return new Attributes[i10];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan$DataGroupTypes> */
        /* JADX WARN: Multi-variable type inference failed */
        public Attributes(@Nullable JsonLogicBoolean jsonLogicBoolean, @Nullable JsonLogicBoolean jsonLogicBoolean2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable List<? extends DataGroupTypes> list, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable Boolean bool, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable List<ScanHint> list2, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable String str29, @Nullable String str30, @Nullable String str31, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable TipsButtonLocation tipsButtonLocation, int i10) {
            this.hidden = jsonLogicBoolean;
            this.disabled = jsonLogicBoolean2;
            this.documentNumberLabel = str;
            this.prefillCardAccessNumber = str2;
            this.prefillDocumentNumber = str3;
            this.dateOfBirthLabel = str4;
            this.prefillDateOfBirth = str5;
            this.cardAccessNumberLabel = str6;
            this.expirationDateLabel = str7;
            this.prefillExpirationDate = str8;
            this.launchButtonText = str9;
            this.scanDocumentPrompt = str10;
            this.scanDocumentPromptTitle = str11;
            this.scanDocumentSuccess = str12;
            this.scanDocumentSuccessTitle = str13;
            this.enabledDataGroups = list;
            this.authenticating = str14;
            this.authenticatingTitle = str15;
            this.reading = str16;
            this.readingTitle = str17;
            this.requiredText = str18;
            this.scanDocumentError = str19;
            this.enableNfcPrompt = str20;
            this.authenticationErrorPrompt = str21;
            this.hidePrefilledInputs = bool;
            this.connectionLostPrompt = str22;
            this.unsupportedDocumentType = str23;
            this.retryError = str24;
            this.scanHints = list2;
            this.hintsSheetTitle = str25;
            this.closeHintSheetButtonText = str26;
            this.userUnableToScanHintSheetButtonText = str27;
            this.errorModalChipNotDetectedTitle = str28;
            this.errorModalChipNotDetectedText = str29;
            this.errorModalLostConnectionTitle = str30;
            this.errorModalLostConnectionText = str31;
            this.errorModalIncorrectIdDetailsTitle = str32;
            this.errorModalIncorrectIdDetailsText = str33;
            this.errorModalGenericErrorTitle = str34;
            this.errorModalGenericErrorText = str35;
            this.errorModalTryAgainButtonText = str36;
            this.errorModalTroubleshootingTipsButtonText = str37;
            this.errorModalReenterIdDetailsButtonText = str38;
            this.rescanDocumentPrompt = str39;
            this.successfulScanTransitionComponentName = str40;
            this.unableToScanTransitionComponentName = str41;
            this.incorrectIdDetailsTransitionComponentName = str42;
            this.tipsButtonLocation = tipsButtonLocation;
            this.unableToScanButtonMinAttempts = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Nullable
        public final String getAuthenticating() {
            return this.authenticating;
        }

        @Nullable
        public final String getAuthenticatingTitle() {
            return this.authenticatingTitle;
        }

        @Nullable
        public final String getAuthenticationErrorPrompt() {
            return this.authenticationErrorPrompt;
        }

        @Nullable
        public final String getCardAccessNumberLabel() {
            return this.cardAccessNumberLabel;
        }

        @Nullable
        public final String getCloseHintSheetButtonText() {
            return this.closeHintSheetButtonText;
        }

        @Nullable
        public final String getConnectionLostPrompt() {
            return this.connectionLostPrompt;
        }

        @Nullable
        public final String getDateOfBirthLabel() {
            return this.dateOfBirthLabel;
        }

        @Nullable
        public final JsonLogicBoolean getDisabled() {
            return this.disabled;
        }

        @Nullable
        public final String getDocumentNumberLabel() {
            return this.documentNumberLabel;
        }

        @Nullable
        public final String getEnableNfcPrompt() {
            return this.enableNfcPrompt;
        }

        @Nullable
        public final List<DataGroupTypes> getEnabledDataGroups() {
            return this.enabledDataGroups;
        }

        @Nullable
        public final String getErrorModalChipNotDetectedText() {
            return this.errorModalChipNotDetectedText;
        }

        @Nullable
        public final String getErrorModalChipNotDetectedTitle() {
            return this.errorModalChipNotDetectedTitle;
        }

        @Nullable
        public final String getErrorModalGenericErrorText() {
            return this.errorModalGenericErrorText;
        }

        @Nullable
        public final String getErrorModalGenericErrorTitle() {
            return this.errorModalGenericErrorTitle;
        }

        @Nullable
        public final String getErrorModalIncorrectIdDetailsText() {
            return this.errorModalIncorrectIdDetailsText;
        }

        @Nullable
        public final String getErrorModalIncorrectIdDetailsTitle() {
            return this.errorModalIncorrectIdDetailsTitle;
        }

        @Nullable
        public final String getErrorModalLostConnectionText() {
            return this.errorModalLostConnectionText;
        }

        @Nullable
        public final String getErrorModalLostConnectionTitle() {
            return this.errorModalLostConnectionTitle;
        }

        @Nullable
        public final String getErrorModalReenterIdDetailsButtonText() {
            return this.errorModalReenterIdDetailsButtonText;
        }

        @Nullable
        public final String getErrorModalTroubleshootingTipsButtonText() {
            return this.errorModalTroubleshootingTipsButtonText;
        }

        @Nullable
        public final String getErrorModalTryAgainButtonText() {
            return this.errorModalTryAgainButtonText;
        }

        @Nullable
        public final String getExpirationDateLabel() {
            return this.expirationDateLabel;
        }

        @Nullable
        public final JsonLogicBoolean getHidden() {
            return this.hidden;
        }

        @Nullable
        public final Boolean getHidePrefilledInputs() {
            return this.hidePrefilledInputs;
        }

        @Nullable
        public final String getHintsSheetTitle() {
            return this.hintsSheetTitle;
        }

        @Nullable
        public final String getIncorrectIdDetailsTransitionComponentName() {
            return this.incorrectIdDetailsTransitionComponentName;
        }

        @Nullable
        public final String getLaunchButtonText() {
            return this.launchButtonText;
        }

        @Nullable
        public final String getPrefillCardAccessNumber() {
            return this.prefillCardAccessNumber;
        }

        @Nullable
        public final String getPrefillDateOfBirth() {
            return this.prefillDateOfBirth;
        }

        @Nullable
        public final String getPrefillDocumentNumber() {
            return this.prefillDocumentNumber;
        }

        @Nullable
        public final String getPrefillExpirationDate() {
            return this.prefillExpirationDate;
        }

        @Nullable
        public final String getReading() {
            return this.reading;
        }

        @Nullable
        public final String getReadingTitle() {
            return this.readingTitle;
        }

        @Nullable
        public final String getRequiredText() {
            return this.requiredText;
        }

        @Nullable
        public final String getRescanDocumentPrompt() {
            return this.rescanDocumentPrompt;
        }

        @Nullable
        public final String getRetryError() {
            return this.retryError;
        }

        @Nullable
        public final String getScanDocumentError() {
            return this.scanDocumentError;
        }

        @Nullable
        public final String getScanDocumentPrompt() {
            return this.scanDocumentPrompt;
        }

        @Nullable
        public final String getScanDocumentPromptTitle() {
            return this.scanDocumentPromptTitle;
        }

        @Nullable
        public final String getScanDocumentSuccess() {
            return this.scanDocumentSuccess;
        }

        @Nullable
        public final String getScanDocumentSuccessTitle() {
            return this.scanDocumentSuccessTitle;
        }

        @Nullable
        public final List<ScanHint> getScanHints() {
            return this.scanHints;
        }

        @Nullable
        public final String getSuccessfulScanTransitionComponentName() {
            return this.successfulScanTransitionComponentName;
        }

        @Nullable
        public final TipsButtonLocation getTipsButtonLocation() {
            return this.tipsButtonLocation;
        }

        public final int getUnableToScanButtonMinAttempts() {
            return this.unableToScanButtonMinAttempts;
        }

        @Nullable
        public final String getUnableToScanTransitionComponentName() {
            return this.unableToScanTransitionComponentName;
        }

        @Nullable
        public final String getUnsupportedDocumentType() {
            return this.unsupportedDocumentType;
        }

        @Nullable
        public final String getUserUnableToScanHintSheetButtonText() {
            return this.userUnableToScanHintSheetButtonText;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            JsonLogicBoolean jsonLogicBoolean = this.hidden;
            if (jsonLogicBoolean == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean.writeToParcel(dest, flags);
            }
            JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
            if (jsonLogicBoolean2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                jsonLogicBoolean2.writeToParcel(dest, flags);
            }
            dest.writeString(this.documentNumberLabel);
            dest.writeString(this.prefillCardAccessNumber);
            dest.writeString(this.prefillDocumentNumber);
            dest.writeString(this.dateOfBirthLabel);
            dest.writeString(this.prefillDateOfBirth);
            dest.writeString(this.cardAccessNumberLabel);
            dest.writeString(this.expirationDateLabel);
            dest.writeString(this.prefillExpirationDate);
            dest.writeString(this.launchButtonText);
            dest.writeString(this.scanDocumentPrompt);
            dest.writeString(this.scanDocumentPromptTitle);
            dest.writeString(this.scanDocumentSuccess);
            dest.writeString(this.scanDocumentSuccessTitle);
            List<DataGroupTypes> list = this.enabledDataGroups;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<DataGroupTypes> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeString(it.next().name());
                }
            }
            dest.writeString(this.authenticating);
            dest.writeString(this.authenticatingTitle);
            dest.writeString(this.reading);
            dest.writeString(this.readingTitle);
            dest.writeString(this.requiredText);
            dest.writeString(this.scanDocumentError);
            dest.writeString(this.enableNfcPrompt);
            dest.writeString(this.authenticationErrorPrompt);
            Boolean bool = this.hidePrefilledInputs;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.connectionLostPrompt);
            dest.writeString(this.unsupportedDocumentType);
            dest.writeString(this.retryError);
            List<ScanHint> list2 = this.scanHints;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<ScanHint> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.hintsSheetTitle);
            dest.writeString(this.closeHintSheetButtonText);
            dest.writeString(this.userUnableToScanHintSheetButtonText);
            dest.writeString(this.errorModalChipNotDetectedTitle);
            dest.writeString(this.errorModalChipNotDetectedText);
            dest.writeString(this.errorModalLostConnectionTitle);
            dest.writeString(this.errorModalLostConnectionText);
            dest.writeString(this.errorModalIncorrectIdDetailsTitle);
            dest.writeString(this.errorModalIncorrectIdDetailsText);
            dest.writeString(this.errorModalGenericErrorTitle);
            dest.writeString(this.errorModalGenericErrorText);
            dest.writeString(this.errorModalTryAgainButtonText);
            dest.writeString(this.errorModalTroubleshootingTipsButtonText);
            dest.writeString(this.errorModalReenterIdDetailsButtonText);
            dest.writeString(this.rescanDocumentPrompt);
            dest.writeString(this.successfulScanTransitionComponentName);
            dest.writeString(this.unableToScanTransitionComponentName);
            dest.writeString(this.incorrectIdDetailsTransitionComponentName);
            TipsButtonLocation tipsButtonLocation = this.tipsButtonLocation;
            if (tipsButtonLocation == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(tipsButtonLocation.name());
            }
            dest.writeInt(this.unableToScanButtonMinAttempts);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006f: CONSTRUCTOR 
          (r52v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
          (r53v0 com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean)
          (r54v0 java.lang.String)
          (r55v0 java.lang.String)
          (r56v0 java.lang.String)
          (r57v0 java.lang.String)
          (r58v0 java.lang.String)
          (r59v0 java.lang.String)
          (r60v0 java.lang.String)
          (r61v0 java.lang.String)
          (r62v0 java.lang.String)
          (r63v0 java.lang.String)
          (r64v0 java.lang.String)
          (r65v0 java.lang.String)
          (r66v0 java.lang.String)
          (r67v0 java.util.List)
          (r68v0 java.lang.String)
          (r69v0 java.lang.String)
          (r70v0 java.lang.String)
          (r71v0 java.lang.String)
          (r72v0 java.lang.String)
          (r73v0 java.lang.String)
          (r74v0 java.lang.String)
          (r75v0 java.lang.String)
          (r76v0 java.lang.Boolean)
          (r77v0 java.lang.String)
          (r78v0 java.lang.String)
          (r79v0 java.lang.String)
          (r80v0 java.util.List)
          (r81v0 java.lang.String)
          (r82v0 java.lang.String)
          (r83v0 java.lang.String)
          (r84v0 java.lang.String)
          (r85v0 java.lang.String)
          (r86v0 java.lang.String)
          (r87v0 java.lang.String)
          (r88v0 java.lang.String)
          (r89v0 java.lang.String)
          (r90v0 java.lang.String)
          (r91v0 java.lang.String)
          (r92v0 java.lang.String)
          (r93v0 java.lang.String)
          (r94v0 java.lang.String)
          (r95v0 java.lang.String)
          (r96v0 java.lang.String)
          (r97v0 java.lang.String)
          (r98v0 java.lang.String)
          (r99v0 com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan$TipsButtonLocation)
          (wrap int:?: TERNARY null = ((wrap int:0x0002: ARITH (r102v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r100v0 int))
         A[MD:(com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan$DataGroupTypes>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan$ScanHint>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan$TipsButtonLocation, int):void (m)] (LINE:51) call: com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan.Attributes.<init>(com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan$TipsButtonLocation, int):void type: THIS */
        public /* synthetic */ Attributes(JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, Boolean bool, String str22, String str23, String str24, List list2, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, TipsButtonLocation tipsButtonLocation, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(jsonLogicBoolean, jsonLogicBoolean2, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, str14, str15, str16, str17, str18, str19, str20, str21, bool, str22, str23, str24, list2, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, tipsButtonLocation, (i12 & 65536) != 0 ? 0 : i10);
        }
    }
}
