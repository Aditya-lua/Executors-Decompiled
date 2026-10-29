package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.Hint;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdRequestArguments;
import com.withpersona.sdk2.inquiry.workflows.SimpleWorkflowState;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u000e()*+,-./012345B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0004R\"\u0010\u0012\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138 X \u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178 X \u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178 X \u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010\u00058 X \u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0001\f6789:;<=>?@A¨\u0006B"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;", "Landroid/os/Parcelable;", "<init>", "()V", "", "error", "u", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "", "v", "", "a", "Z", "A", "()Z", "G", "(Z)V", "didGoBack", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "z", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "E", "()Ljava/util/List;", "uploadingIds", "D", "parts", "", "C", "()I", "partIndex", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "backState", "x", "()Ljava/lang/String;", "countryCode", "RestartStep", "ShowInstructions", "ChooseCaptureMethod", "WaitForAutocapture", "CountdownToCapture", "ReviewImageState", "ReviewCapturedImage", "ReviewSelectedImage", "FinalizeLocalVideoCapture", "FinalizeWebRtc", "HolographicTorchDelay", "Submit", "AutoClassificationError", "AutoClassificationManualSelect", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$RestartStep;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GovernmentIdState extends SimpleWorkflowState implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean didGoBack;

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u009e\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u0010#¨\u0006I"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "selectedCountryCode", "selectedIdClass", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "K", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "D", "e", "C", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "g", "Ljava/lang/String;", "x", "h", "getCaptureFrames", "i", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "j", "L", "k", "N", "l", "O", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoClassificationManualSelect extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<AutoClassificationManualSelect> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Frame> captureFrames;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdConfigForCountry> idConfigsForCountry;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String selectedCountryCode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String selectedIdClass;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoClassificationManualSelect> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationManualSelect createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader()));
                }
                int i14 = parcel.readInt();
                GovernmentIdState governmentIdState = (GovernmentIdState) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                String string = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                int i17 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationManualSelect(sideIdPartCreateFromParcel, arrayList, arrayList2, i14, governmentIdState, string, arrayList3, cameraProperties, arrayList4, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationManualSelect[] newArray(int i10) {
                return new AutoClassificationManualSelect[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AutoClassificationManualSelect(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @Nullable String str, @NotNull List<Frame> captureFrames, @NotNull CameraProperties cameraProperties, @NotNull List<IdConfigForCountry> idConfigsForCountry, @Nullable String str2, @Nullable String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureFrames, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(idConfigsForCountry, "idConfigsForCountry");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.captureFrames = captureFrames;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = idConfigsForCountry;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AutoClassificationManualSelect J(AutoClassificationManualSelect autoClassificationManualSelect, IdPart.SideIdPart sideIdPart, List list, List list2, int i10, GovernmentIdState governmentIdState, String str, List list3, CameraProperties cameraProperties, List list4, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sideIdPart = autoClassificationManualSelect.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = autoClassificationManualSelect.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                list2 = autoClassificationManualSelect.parts;
            }
            if ((i11 & 8) != 0) {
                i10 = autoClassificationManualSelect.partIndex;
            }
            if ((i11 & 16) != 0) {
                governmentIdState = autoClassificationManualSelect.backState;
            }
            if ((i11 & 32) != 0) {
                str = autoClassificationManualSelect.countryCode;
            }
            if ((i11 & 64) != 0) {
                list3 = autoClassificationManualSelect.captureFrames;
            }
            if ((i11 & 128) != 0) {
                cameraProperties = autoClassificationManualSelect.cameraProperties;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                list4 = autoClassificationManualSelect.idConfigsForCountry;
            }
            if ((i11 & Barcode.FORMAT_UPC_A) != 0) {
                str2 = autoClassificationManualSelect.selectedCountryCode;
            }
            if ((i11 & Barcode.FORMAT_UPC_E) != 0) {
                str3 = autoClassificationManualSelect.selectedIdClass;
            }
            String str4 = str2;
            String str5 = str3;
            CameraProperties cameraProperties2 = cameraProperties;
            List list5 = list4;
            String str6 = str;
            List list6 = list3;
            GovernmentIdState governmentIdState2 = governmentIdState;
            List list7 = list2;
            return autoClassificationManualSelect.I(sideIdPart, list, list7, i10, governmentIdState2, str6, list6, cameraProperties2, list5, str4, str5);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        public final AutoClassificationManualSelect I(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int partIndex, @Nullable GovernmentIdState backState, @Nullable String countryCode, @NotNull List<Frame> captureFrames, @NotNull CameraProperties cameraProperties, @NotNull List<IdConfigForCountry> idConfigsForCountry, @Nullable String selectedCountryCode, @Nullable String selectedIdClass) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureFrames, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(idConfigsForCountry, "idConfigsForCountry");
            return new AutoClassificationManualSelect(currentPart, uploadingIds, parts, partIndex, backState, countryCode, captureFrames, cameraProperties, idConfigsForCountry, selectedCountryCode, selectedIdClass);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @NotNull
        public final List<IdConfigForCountry> L() {
            return this.idConfigsForCountry;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final String getSelectedIdClass() {
            return this.selectedIdClass;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoClassificationManualSelect)) {
                return false;
            }
            AutoClassificationManualSelect autoClassificationManualSelect = (AutoClassificationManualSelect) other;
            return Intrinsics.c(this.currentPart, autoClassificationManualSelect.currentPart) && Intrinsics.c(this.uploadingIds, autoClassificationManualSelect.uploadingIds) && Intrinsics.c(this.parts, autoClassificationManualSelect.parts) && this.partIndex == autoClassificationManualSelect.partIndex && Intrinsics.c(this.backState, autoClassificationManualSelect.backState) && Intrinsics.c(this.countryCode, autoClassificationManualSelect.countryCode) && Intrinsics.c(this.captureFrames, autoClassificationManualSelect.captureFrames) && Intrinsics.c(this.cameraProperties, autoClassificationManualSelect.cameraProperties) && Intrinsics.c(this.idConfigsForCountry, autoClassificationManualSelect.idConfigsForCountry) && Intrinsics.c(this.selectedCountryCode, autoClassificationManualSelect.selectedCountryCode) && Intrinsics.c(this.selectedIdClass, autoClassificationManualSelect.selectedIdClass);
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.captureFrames.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + this.idConfigsForCountry.hashCode()) * 31;
            String str2 = this.selectedCountryCode;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectedIdClass;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AutoClassificationManualSelect(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", captureFrames=" + this.captureFrames + ", cameraProperties=" + this.cameraProperties + ", idConfigsForCountry=" + this.idConfigsForCountry + ", selectedCountryCode=" + this.selectedCountryCode + ", selectedIdClass=" + this.selectedIdClass + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            List<Frame> list3 = this.captureFrames;
            dest.writeInt(list3.size());
            Iterator<Frame> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            List<IdConfigForCountry> list4 = this.idConfigsForCountry;
            dest.writeInt(list4.size());
            Iterator<IdConfigForCountry> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.selectedCountryCode);
            dest.writeString(this.selectedIdClass);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ|\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b<\u0010 \u001a\u0004\b=\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "idForReview", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)V", "", "v", "()V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "L", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "K", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "O", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "f", "D", "g", "C", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "i", "Ljava/lang/String;", "x", "j", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "N", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountdownToCapture extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CaptureConfig captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final GovernmentId.GovernmentIdImage idForReview;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Hint hint;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                GovernmentId.GovernmentIdImage governmentIdImageCreateFromParcel = GovernmentId.GovernmentIdImage.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                return new CountdownToCapture(sideIdPartCreateFromParcel, arrayList, captureConfig, governmentIdImageCreateFromParcel, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(CountdownToCapture.class.getClassLoader()), parcel.readString(), (Hint) parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture[] newArray(int i10) {
                return new CountdownToCapture[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToCapture(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId.GovernmentIdImage idForReview, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @Nullable String str, @Nullable Hint hint) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.idForReview = idForReview;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.hint = hint;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CountdownToCapture J(CountdownToCapture countdownToCapture, IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId.GovernmentIdImage governmentIdImage, List list2, int i10, GovernmentIdState governmentIdState, String str, Hint hint, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sideIdPart = countdownToCapture.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = countdownToCapture.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                captureConfig = countdownToCapture.captureConfig;
            }
            if ((i11 & 8) != 0) {
                governmentIdImage = countdownToCapture.idForReview;
            }
            if ((i11 & 16) != 0) {
                list2 = countdownToCapture.parts;
            }
            if ((i11 & 32) != 0) {
                i10 = countdownToCapture.partIndex;
            }
            if ((i11 & 64) != 0) {
                governmentIdState = countdownToCapture.backState;
            }
            if ((i11 & 128) != 0) {
                str = countdownToCapture.countryCode;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                hint = countdownToCapture.hint;
            }
            String str2 = str;
            Hint hint2 = hint;
            int i12 = i10;
            GovernmentIdState governmentIdState2 = governmentIdState;
            List list3 = list2;
            CaptureConfig captureConfig2 = captureConfig;
            return countdownToCapture.I(sideIdPart, list, captureConfig2, governmentIdImage, list3, i12, governmentIdState2, str2, hint2);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        public final CountdownToCapture I(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId.GovernmentIdImage idForReview, @NotNull List<? extends IdPart> parts, int partIndex, @Nullable GovernmentIdState backState, @Nullable String countryCode, @Nullable Hint hint) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new CountdownToCapture(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, countryCode, hint);
        }

        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final Hint getHint() {
            return this.hint;
        }

        @NotNull
        /* JADX INFO: renamed from: O, reason: from getter */
        public final GovernmentId.GovernmentIdImage getIdForReview() {
            return this.idForReview;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CountdownToCapture)) {
                return false;
            }
            CountdownToCapture countdownToCapture = (CountdownToCapture) other;
            return Intrinsics.c(this.currentPart, countdownToCapture.currentPart) && Intrinsics.c(this.uploadingIds, countdownToCapture.uploadingIds) && Intrinsics.c(this.captureConfig, countdownToCapture.captureConfig) && Intrinsics.c(this.idForReview, countdownToCapture.idForReview) && Intrinsics.c(this.parts, countdownToCapture.parts) && this.partIndex == countdownToCapture.partIndex && Intrinsics.c(this.backState, countdownToCapture.backState) && Intrinsics.c(this.countryCode, countdownToCapture.countryCode) && Intrinsics.c(this.hint, countdownToCapture.hint);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Hint hint = this.hint;
            return iHashCode3 + (hint != null ? hint.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CountdownToCapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", hint=" + this.hint + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public void v() {
            super.v();
            Iterator<T> it = this.idForReview.d3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            this.idForReview.writeToParcel(dest, flags);
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.hint, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }
    }

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0086\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010&\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u0010\u001f\u001a\u0004\b7\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "", "minDurationMs", "", "isDelayComplete", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;JZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;JZ)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "K", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "z", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "e", "D", "f", "C", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "h", "Ljava/lang/String;", "x", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "getGovernmentIdRequestArguments", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "j", "J", "L", "()J", "k", "Z", "N", "()Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinalizeLocalVideoCapture extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdConfig id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final IdPart currentPart;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdRequestArguments governmentIdRequestArguments;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final long minDurationMs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isDelayComplete;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeLocalVideoCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig idConfigCreateFromParcel = IdConfig.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                IdPart idPart = (IdPart) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                return new FinalizeLocalVideoCapture(idConfigCreateFromParcel, arrayList, idPart, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture[] newArray(int i10) {
                return new FinalizeLocalVideoCapture[i10];
            }
        }

        public /* synthetic */ FinalizeLocalVideoCapture(IdConfig idConfig, List list, IdPart idPart, List list2, int i10, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, idPart, list2, i10, (i11 & 32) != 0 ? null : governmentIdState, str, (i11 & 128) != 0 ? null : governmentIdRequestArguments, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? 3000L : j10, (i11 & Barcode.FORMAT_UPC_A) != 0 ? false : z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinalizeLocalVideoCapture J(FinalizeLocalVideoCapture finalizeLocalVideoCapture, IdConfig idConfig, List list, IdPart idPart, List list2, int i10, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                idConfig = finalizeLocalVideoCapture.id;
            }
            if ((i11 & 2) != 0) {
                list = finalizeLocalVideoCapture.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                idPart = finalizeLocalVideoCapture.currentPart;
            }
            if ((i11 & 8) != 0) {
                list2 = finalizeLocalVideoCapture.parts;
            }
            if ((i11 & 16) != 0) {
                i10 = finalizeLocalVideoCapture.partIndex;
            }
            if ((i11 & 32) != 0) {
                governmentIdState = finalizeLocalVideoCapture.backState;
            }
            if ((i11 & 64) != 0) {
                str = finalizeLocalVideoCapture.countryCode;
            }
            if ((i11 & 128) != 0) {
                governmentIdRequestArguments = finalizeLocalVideoCapture.governmentIdRequestArguments;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                j10 = finalizeLocalVideoCapture.minDurationMs;
            }
            if ((i11 & Barcode.FORMAT_UPC_A) != 0) {
                z10 = finalizeLocalVideoCapture.isDelayComplete;
            }
            boolean z11 = z10;
            long j11 = j10;
            String str2 = str;
            GovernmentIdRequestArguments governmentIdRequestArguments2 = governmentIdRequestArguments;
            int i12 = i10;
            GovernmentIdState governmentIdState2 = governmentIdState;
            return finalizeLocalVideoCapture.I(idConfig, list, idPart, list2, i12, governmentIdState2, str2, governmentIdRequestArguments2, j11, z11);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        public final FinalizeLocalVideoCapture I(@NotNull IdConfig id2, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull IdPart currentPart, @NotNull List<? extends IdPart> parts, int partIndex, @Nullable GovernmentIdState backState, @Nullable String countryCode, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, long minDurationMs, boolean isDelayComplete) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new FinalizeLocalVideoCapture(id2, uploadingIds, currentPart, parts, partIndex, backState, countryCode, governmentIdRequestArguments, minDurationMs, isDelayComplete);
        }

        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public final IdConfig getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public final boolean getIsDelayComplete() {
            return this.isDelayComplete;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinalizeLocalVideoCapture)) {
                return false;
            }
            FinalizeLocalVideoCapture finalizeLocalVideoCapture = (FinalizeLocalVideoCapture) other;
            return Intrinsics.c(this.id, finalizeLocalVideoCapture.id) && Intrinsics.c(this.uploadingIds, finalizeLocalVideoCapture.uploadingIds) && Intrinsics.c(this.currentPart, finalizeLocalVideoCapture.currentPart) && Intrinsics.c(this.parts, finalizeLocalVideoCapture.parts) && this.partIndex == finalizeLocalVideoCapture.partIndex && Intrinsics.c(this.backState, finalizeLocalVideoCapture.backState) && Intrinsics.c(this.countryCode, finalizeLocalVideoCapture.countryCode) && Intrinsics.c(this.governmentIdRequestArguments, finalizeLocalVideoCapture.governmentIdRequestArguments) && this.minDurationMs == finalizeLocalVideoCapture.minDurationMs && this.isDelayComplete == finalizeLocalVideoCapture.isDelayComplete;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.currentPart.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            return ((((iHashCode3 + (governmentIdRequestArguments != null ? governmentIdRequestArguments.hashCode() : 0)) * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete);
        }

        @NotNull
        public String toString() {
            return "FinalizeLocalVideoCapture(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.id.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.currentPart, flags);
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdRequestArguments.writeToParcel(dest, flags);
            }
            dest.writeLong(this.minDurationMs);
            dest.writeInt(this.isDelayComplete ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: z, reason: from getter */
        public IdPart getCurrentPart() {
            return this.currentPart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeLocalVideoCapture(@NotNull IdConfig id2, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull IdPart currentPart, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @Nullable String str, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, long j10, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.id = id2;
            this.uploadingIds = uploadingIds;
            this.currentPart = currentPart;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.minDurationMs = j10;
            this.isDelayComplete = z10;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b&\u00102R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Lcom/withpersona/sdk2/camera/CameraProperties;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "z", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "D", "e", "I", "C", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "g", "Ljava/lang/String;", "x", "()Ljava/lang/String;", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "i", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FinalizeWebRtc extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<FinalizeWebRtc> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final IdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final IdConfig id;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CameraProperties cameraProperties;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FinalizeWebRtc> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FinalizeWebRtc createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart idPart = (IdPart) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
                }
                return new FinalizeWebRtc(idPart, arrayList, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()), parcel.readString(), IdConfig.CREATOR.createFromParcel(parcel), (CameraProperties) parcel.readParcelable(FinalizeWebRtc.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FinalizeWebRtc[] newArray(int i10) {
                return new FinalizeWebRtc[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeWebRtc(@NotNull IdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @Nullable String str, @NotNull IdConfig id2, @NotNull CameraProperties cameraProperties) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.id = id2;
            this.cameraProperties = cameraProperties;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        /* JADX INFO: renamed from: I, reason: from getter */
        public final IdConfig getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            this.id.writeToParcel(dest, flags);
            dest.writeParcelable(this.cameraProperties, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: z, reason: from getter */
        public IdPart getCurrentPart() {
            return this.currentPart;
        }
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u008e\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010*\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b7\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u0010#\u001a\u0004\bH\u0010\u001dR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "torchDurationMs", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "capturedImage", "", "holographicTorchEnabled", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/camera/CameraProperties;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Z)V", "", "v", "()V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/camera/CameraProperties;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "N", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "D", "e", "C", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "g", "Ljava/lang/String;", "x", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "K", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "i", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "j", "P", "k", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "L", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;", "l", "Z", "O", "()Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HolographicTorchDelay extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<HolographicTorchDelay> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CaptureConfig captureConfig;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final int torchDurationMs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final GovernmentId.GovernmentIdImage capturedImage;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean holographicTorchEnabled;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HolographicTorchDelay> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HolographicTorchDelay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(HolographicTorchDelay.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(HolographicTorchDelay.class.getClassLoader()));
                }
                return new HolographicTorchDelay(sideIdPartCreateFromParcel, arrayList, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(HolographicTorchDelay.class.getClassLoader()), parcel.readString(), (CaptureConfig) parcel.readParcelable(HolographicTorchDelay.class.getClassLoader()), (CameraProperties) parcel.readParcelable(HolographicTorchDelay.class.getClassLoader()), parcel.readInt(), GovernmentId.GovernmentIdImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final HolographicTorchDelay[] newArray(int i10) {
                return new HolographicTorchDelay[i10];
            }
        }

        public /* synthetic */ HolographicTorchDelay(IdPart.SideIdPart sideIdPart, List list, List list2, int i10, GovernmentIdState governmentIdState, String str, CaptureConfig captureConfig, CameraProperties cameraProperties, int i11, GovernmentId.GovernmentIdImage governmentIdImage, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, list2, i10, governmentIdState, str, captureConfig, cameraProperties, i11, governmentIdImage, (i12 & Barcode.FORMAT_UPC_E) != 0 ? true : z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HolographicTorchDelay J(HolographicTorchDelay holographicTorchDelay, IdPart.SideIdPart sideIdPart, List list, List list2, int i10, GovernmentIdState governmentIdState, String str, CaptureConfig captureConfig, CameraProperties cameraProperties, int i11, GovernmentId.GovernmentIdImage governmentIdImage, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                sideIdPart = holographicTorchDelay.currentPart;
            }
            if ((i12 & 2) != 0) {
                list = holographicTorchDelay.uploadingIds;
            }
            if ((i12 & 4) != 0) {
                list2 = holographicTorchDelay.parts;
            }
            if ((i12 & 8) != 0) {
                i10 = holographicTorchDelay.partIndex;
            }
            if ((i12 & 16) != 0) {
                governmentIdState = holographicTorchDelay.backState;
            }
            if ((i12 & 32) != 0) {
                str = holographicTorchDelay.countryCode;
            }
            if ((i12 & 64) != 0) {
                captureConfig = holographicTorchDelay.captureConfig;
            }
            if ((i12 & 128) != 0) {
                cameraProperties = holographicTorchDelay.cameraProperties;
            }
            if ((i12 & Barcode.FORMAT_QR_CODE) != 0) {
                i11 = holographicTorchDelay.torchDurationMs;
            }
            if ((i12 & Barcode.FORMAT_UPC_A) != 0) {
                governmentIdImage = holographicTorchDelay.capturedImage;
            }
            if ((i12 & Barcode.FORMAT_UPC_E) != 0) {
                z10 = holographicTorchDelay.holographicTorchEnabled;
            }
            GovernmentId.GovernmentIdImage governmentIdImage2 = governmentIdImage;
            boolean z11 = z10;
            CameraProperties cameraProperties2 = cameraProperties;
            int i13 = i11;
            String str2 = str;
            CaptureConfig captureConfig2 = captureConfig;
            GovernmentIdState governmentIdState2 = governmentIdState;
            List list3 = list2;
            return holographicTorchDelay.I(sideIdPart, list, list3, i10, governmentIdState2, str2, captureConfig2, cameraProperties2, i13, governmentIdImage2, z11);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        public final HolographicTorchDelay I(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int partIndex, @Nullable GovernmentIdState backState, @Nullable String countryCode, @NotNull CaptureConfig captureConfig, @NotNull CameraProperties cameraProperties, int torchDurationMs, @NotNull GovernmentId.GovernmentIdImage capturedImage, boolean holographicTorchEnabled) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(capturedImage, "capturedImage");
            return new HolographicTorchDelay(currentPart, uploadingIds, parts, partIndex, backState, countryCode, captureConfig, cameraProperties, torchDurationMs, capturedImage, holographicTorchEnabled);
        }

        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public final GovernmentId.GovernmentIdImage getCapturedImage() {
            return this.capturedImage;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: N, reason: from getter */
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final boolean getHolographicTorchEnabled() {
            return this.holographicTorchEnabled;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public final int getTorchDurationMs() {
            return this.torchDurationMs;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HolographicTorchDelay)) {
                return false;
            }
            HolographicTorchDelay holographicTorchDelay = (HolographicTorchDelay) other;
            return Intrinsics.c(this.currentPart, holographicTorchDelay.currentPart) && Intrinsics.c(this.uploadingIds, holographicTorchDelay.uploadingIds) && Intrinsics.c(this.parts, holographicTorchDelay.parts) && this.partIndex == holographicTorchDelay.partIndex && Intrinsics.c(this.backState, holographicTorchDelay.backState) && Intrinsics.c(this.countryCode, holographicTorchDelay.countryCode) && Intrinsics.c(this.captureConfig, holographicTorchDelay.captureConfig) && Intrinsics.c(this.cameraProperties, holographicTorchDelay.cameraProperties) && this.torchDurationMs == holographicTorchDelay.torchDurationMs && Intrinsics.c(this.capturedImage, holographicTorchDelay.capturedImage) && this.holographicTorchEnabled == holographicTorchDelay.holographicTorchEnabled;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            return ((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.captureConfig.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + Integer.hashCode(this.torchDurationMs)) * 31) + this.capturedImage.hashCode()) * 31) + Boolean.hashCode(this.holographicTorchEnabled);
        }

        @NotNull
        public String toString() {
            return "HolographicTorchDelay(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", captureConfig=" + this.captureConfig + ", cameraProperties=" + this.cameraProperties + ", torchDurationMs=" + this.torchDurationMs + ", capturedImage=" + this.capturedImage + ", holographicTorchEnabled=" + this.holographicTorchEnabled + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public void v() {
            super.v();
            Iterator<T> it = this.capturedImage.d3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeInt(this.torchDurationMs);
            this.capturedImage.writeToParcel(dest, flags);
            dest.writeInt(this.holographicTorchEnabled ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public HolographicTorchDelay(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @Nullable String str, @NotNull CaptureConfig captureConfig, @NotNull CameraProperties cameraProperties, int i11, @NotNull GovernmentId.GovernmentIdImage capturedImage, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(capturedImage, "capturedImage");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.captureConfig = captureConfig;
            this.cameraProperties = cameraProperties;
            this.torchDurationMs = i11;
            this.capturedImage = capturedImage;
            this.holographicTorchEnabled = z10;
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0090\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010 J\u001a\u0010-\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bA\u00109\u001a\u0004\bB\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010)R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0010X\u0090\u0004¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010)¨\u0006T"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "idForReview", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "error", "", "submittingForAutoClassification", "countryCode", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;)V", "newValue", "L", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "", "v", "()V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "N", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "J", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "I", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "K", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "f", "D", "g", "C", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "i", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "j", "Ljava/lang/String;", "P", "k", "Z", "Q", "()Z", "l", "x", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewCapturedImage extends ReviewImageState {

        @NotNull
        public static final Parcelable.Creator<ReviewCapturedImage> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CaptureConfig captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final GovernmentId idForReview;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean submittingForAutoClassification;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewCapturedImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReviewCapturedImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                GovernmentId governmentId = (GovernmentId) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                return new ReviewCapturedImage(sideIdPartCreateFromParcel, arrayList, captureConfig, governmentId, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), (CameraProperties) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReviewCapturedImage[] newArray(int i10) {
                return new ReviewCapturedImage[i10];
            }
        }

        public /* synthetic */ ReviewCapturedImage(IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, List list2, int i10, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str, boolean z10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, captureConfig, governmentId, list2, i10, governmentIdState, cameraProperties, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? null : str, (i11 & Barcode.FORMAT_UPC_A) != 0 ? false : z10, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReviewCapturedImage O(ReviewCapturedImage reviewCapturedImage, IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, List list2, int i10, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str, boolean z10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sideIdPart = reviewCapturedImage.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = reviewCapturedImage.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                captureConfig = reviewCapturedImage.captureConfig;
            }
            if ((i11 & 8) != 0) {
                governmentId = reviewCapturedImage.idForReview;
            }
            if ((i11 & 16) != 0) {
                list2 = reviewCapturedImage.parts;
            }
            if ((i11 & 32) != 0) {
                i10 = reviewCapturedImage.partIndex;
            }
            if ((i11 & 64) != 0) {
                governmentIdState = reviewCapturedImage.backState;
            }
            if ((i11 & 128) != 0) {
                cameraProperties = reviewCapturedImage.cameraProperties;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                str = reviewCapturedImage.error;
            }
            if ((i11 & Barcode.FORMAT_UPC_A) != 0) {
                z10 = reviewCapturedImage.submittingForAutoClassification;
            }
            if ((i11 & Barcode.FORMAT_UPC_E) != 0) {
                str2 = reviewCapturedImage.countryCode;
            }
            boolean z11 = z10;
            String str3 = str2;
            CameraProperties cameraProperties2 = cameraProperties;
            String str4 = str;
            int i12 = i10;
            GovernmentIdState governmentIdState2 = governmentIdState;
            List list3 = list2;
            CaptureConfig captureConfig2 = captureConfig;
            return reviewCapturedImage.N(sideIdPart, list, captureConfig2, governmentId, list3, i12, governmentIdState2, cameraProperties2, str4, z11, str3);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        @NotNull
        /* JADX INFO: renamed from: I, reason: from getter */
        public CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public GovernmentId getIdForReview() {
            return this.idForReview;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        @NotNull
        public ReviewImageState L(boolean newValue) {
            return O(this, null, null, null, null, null, 0, null, null, null, newValue, null, 1535, null);
        }

        @NotNull
        public final ReviewCapturedImage N(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId idForReview, @NotNull List<? extends IdPart> parts, int partIndex, @Nullable GovernmentIdState backState, @NotNull CameraProperties cameraProperties, @Nullable String error, boolean submittingForAutoClassification, @Nullable String countryCode) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new ReviewCapturedImage(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification, countryCode);
        }

        @Nullable
        /* JADX INFO: renamed from: P, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: Q, reason: from getter */
        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewCapturedImage)) {
                return false;
            }
            ReviewCapturedImage reviewCapturedImage = (ReviewCapturedImage) other;
            return Intrinsics.c(this.currentPart, reviewCapturedImage.currentPart) && Intrinsics.c(this.uploadingIds, reviewCapturedImage.uploadingIds) && Intrinsics.c(this.captureConfig, reviewCapturedImage.captureConfig) && Intrinsics.c(this.idForReview, reviewCapturedImage.idForReview) && Intrinsics.c(this.parts, reviewCapturedImage.parts) && this.partIndex == reviewCapturedImage.partIndex && Intrinsics.c(this.backState, reviewCapturedImage.backState) && Intrinsics.c(this.cameraProperties, reviewCapturedImage.cameraProperties) && Intrinsics.c(this.error, reviewCapturedImage.error) && this.submittingForAutoClassification == reviewCapturedImage.submittingForAutoClassification && Intrinsics.c(this.countryCode, reviewCapturedImage.countryCode);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (((iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str = this.error;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.submittingForAutoClassification)) * 31;
            String str2 = this.countryCode;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReviewCapturedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ", countryCode=" + this.countryCode + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public void v() {
            super.v();
            Iterator<T> it = getIdForReview().d3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeParcelable(this.idForReview, flags);
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeString(this.error);
            dest.writeInt(this.submittingForAutoClassification ? 1 : 0);
            dest.writeString(this.countryCode);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewCapturedImage(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId idForReview, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @NotNull CameraProperties cameraProperties, @Nullable String str, boolean z10, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.idForReview = idForReview;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.cameraProperties = cameraProperties;
            this.error = str;
            this.submittingForAutoClassification = z10;
            this.countryCode = str2;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8 X \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "<init>", "()V", "", "newValue", "L", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "J", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "I", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "K", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "idForReview", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ReviewImageState extends GovernmentIdState {
        public /* synthetic */ ReviewImageState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: I */
        public abstract CaptureConfig getCaptureConfig();

        @NotNull
        /* JADX INFO: renamed from: J */
        public abstract IdPart.SideIdPart getCurrentPart();

        @NotNull
        /* JADX INFO: renamed from: K */
        public abstract GovernmentId getIdForReview();

        @NotNull
        public abstract ReviewImageState L(boolean newValue);

        @NotNull
        /* JADX INFO: renamed from: a */
        public abstract CameraProperties getCameraProperties();

        public ReviewImageState() {
            super(null);
        }
    }

    public /* synthetic */ GovernmentIdState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    /* JADX INFO: renamed from: C */
    public abstract int getPartIndex();

    @NotNull
    public abstract List<IdPart> D();

    @NotNull
    public abstract List<GovernmentId> E();

    public final void G(boolean z10) {
        this.didGoBack = z10;
    }

    @NotNull
    public final GovernmentIdState u(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this instanceof ReviewCapturedImage) {
            return ReviewCapturedImage.O((ReviewCapturedImage) this, null, null, null, null, null, 0, null, null, error, false, null, 1791, null);
        }
        if (this instanceof ReviewSelectedImage) {
            return ReviewSelectedImage.O((ReviewSelectedImage) this, null, null, null, null, null, null, 0, null, null, error, false, null, 3583, null);
        }
        if (this instanceof ChooseCaptureMethod) {
            return ChooseCaptureMethod.J((ChooseCaptureMethod) this, null, null, null, 0, null, null, false, null, error, 255, null);
        }
        return this instanceof ShowInstructions ? ShowInstructions.J((ShowInstructions) this, null, null, null, null, 0, null, null, error, 127, null) : this;
    }

    public void v() {
        Iterator<T> it = E().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((GovernmentId) it.next()).d3().iterator();
            while (it2.hasNext()) {
                new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public abstract GovernmentIdState getBackState();

    @Nullable
    /* JADX INFO: renamed from: x */
    public abstract String getCountryCode();

    @NotNull
    /* JADX INFO: renamed from: z */
    public abstract IdPart getCurrentPart();

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\u009c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010!J\u001a\u0010.\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010*R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u00107R\u001a\u0010\u000f\u001a\u00020\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bP\u0010*R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bU\u0010A\u001a\u0004\bV\u0010*¨\u0006W"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "idForReview", "", "fileName", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "backState", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "error", "", "submittingForAutoClassification", "countryCode", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;)V", "newValue", "L", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;", "", "v", "()V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "N", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "J", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "I", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "K", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "f", "Ljava/lang/String;", "Q", "g", "D", "h", "C", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "j", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "k", "P", "l", "Z", "R", "()Z", "m", "x", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewSelectedImage extends ReviewImageState {

        @NotNull
        public static final Parcelable.Creator<ReviewSelectedImage> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CaptureConfig captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final GovernmentId idForReview;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String fileName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean submittingForAutoClassification;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewSelectedImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReviewSelectedImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                GovernmentId governmentId = (GovernmentId) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                return new ReviewSelectedImage(sideIdPartCreateFromParcel, arrayList, captureConfig, governmentId, string, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), (CameraProperties) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReviewSelectedImage[] newArray(int i10) {
                return new ReviewSelectedImage[i10];
            }
        }

        public /* synthetic */ ReviewSelectedImage(IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, String str, List list2, int i10, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str2, boolean z10, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, captureConfig, governmentId, str, list2, i10, governmentIdState, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? new CameraProperties(null, null, null, 0, 0, 31, null) : cameraProperties, (i11 & Barcode.FORMAT_UPC_A) != 0 ? null : str2, (i11 & Barcode.FORMAT_UPC_E) != 0 ? false : z10, str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReviewSelectedImage O(ReviewSelectedImage reviewSelectedImage, IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, GovernmentId governmentId, String str, List list2, int i10, GovernmentIdState governmentIdState, CameraProperties cameraProperties, String str2, boolean z10, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sideIdPart = reviewSelectedImage.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = reviewSelectedImage.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                captureConfig = reviewSelectedImage.captureConfig;
            }
            if ((i11 & 8) != 0) {
                governmentId = reviewSelectedImage.idForReview;
            }
            if ((i11 & 16) != 0) {
                str = reviewSelectedImage.fileName;
            }
            if ((i11 & 32) != 0) {
                list2 = reviewSelectedImage.parts;
            }
            if ((i11 & 64) != 0) {
                i10 = reviewSelectedImage.partIndex;
            }
            if ((i11 & 128) != 0) {
                governmentIdState = reviewSelectedImage.backState;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                cameraProperties = reviewSelectedImage.cameraProperties;
            }
            if ((i11 & Barcode.FORMAT_UPC_A) != 0) {
                str2 = reviewSelectedImage.error;
            }
            if ((i11 & Barcode.FORMAT_UPC_E) != 0) {
                z10 = reviewSelectedImage.submittingForAutoClassification;
            }
            if ((i11 & Barcode.FORMAT_PDF417) != 0) {
                str3 = reviewSelectedImage.countryCode;
            }
            boolean z11 = z10;
            String str4 = str3;
            CameraProperties cameraProperties2 = cameraProperties;
            String str5 = str2;
            int i12 = i10;
            GovernmentIdState governmentIdState2 = governmentIdState;
            String str6 = str;
            List list3 = list2;
            return reviewSelectedImage.N(sideIdPart, list, captureConfig, governmentId, str6, list3, i12, governmentIdState2, cameraProperties2, str5, z11, str4);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        @NotNull
        /* JADX INFO: renamed from: I, reason: from getter */
        public CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public GovernmentId getIdForReview() {
            return this.idForReview;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        @NotNull
        public ReviewImageState L(boolean newValue) {
            return O(this, null, null, null, null, null, null, 0, null, null, null, newValue, null, 3071, null);
        }

        @NotNull
        public final ReviewSelectedImage N(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId idForReview, @Nullable String fileName, @NotNull List<? extends IdPart> parts, int partIndex, @Nullable GovernmentIdState backState, @NotNull CameraProperties cameraProperties, @Nullable String error, boolean submittingForAutoClassification, @Nullable String countryCode) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new ReviewSelectedImage(currentPart, uploadingIds, captureConfig, idForReview, fileName, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification, countryCode);
        }

        @Nullable
        /* JADX INFO: renamed from: P, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @Nullable
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: R, reason: from getter */
        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState.ReviewImageState
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewSelectedImage)) {
                return false;
            }
            ReviewSelectedImage reviewSelectedImage = (ReviewSelectedImage) other;
            return Intrinsics.c(this.currentPart, reviewSelectedImage.currentPart) && Intrinsics.c(this.uploadingIds, reviewSelectedImage.uploadingIds) && Intrinsics.c(this.captureConfig, reviewSelectedImage.captureConfig) && Intrinsics.c(this.idForReview, reviewSelectedImage.idForReview) && Intrinsics.c(this.fileName, reviewSelectedImage.fileName) && Intrinsics.c(this.parts, reviewSelectedImage.parts) && this.partIndex == reviewSelectedImage.partIndex && Intrinsics.c(this.backState, reviewSelectedImage.backState) && Intrinsics.c(this.cameraProperties, reviewSelectedImage.cameraProperties) && Intrinsics.c(this.error, reviewSelectedImage.error) && this.submittingForAutoClassification == reviewSelectedImage.submittingForAutoClassification && Intrinsics.c(this.countryCode, reviewSelectedImage.countryCode);
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31;
            String str = this.fileName;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode3 = (((iHashCode2 + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str2 = this.error;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.submittingForAutoClassification)) * 31;
            String str3 = this.countryCode;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReviewSelectedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", fileName=" + this.fileName + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ", countryCode=" + this.countryCode + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        public void v() {
            super.v();
            Iterator<T> it = getIdForReview().d3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeParcelable(this.idForReview, flags);
            dest.writeString(this.fileName);
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeString(this.error);
            dest.writeInt(this.submittingForAutoClassification ? 1 : 0);
            dest.writeString(this.countryCode);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewSelectedImage(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull GovernmentId idForReview, @Nullable String str, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @NotNull CameraProperties cameraProperties, @Nullable String str2, boolean z10, @Nullable String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.idForReview = idForReview;
            this.fileName = str;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.cameraProperties = cameraProperties;
            this.error = str2;
            this.submittingForAutoClassification = z10;
            this.countryCode = str3;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0092\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010'\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bD\u0010>\u001a\u0004\bE\u0010#R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "id", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "governmentIdRequestArguments", "webRtcObjectId", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "", "hasSubmitted", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Z)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getId", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "z", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "e", "D", "f", "C", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "h", "Ljava/lang/String;", "x", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "K", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;", "j", "N", "k", "Lcom/withpersona/sdk2/camera/CameraProperties;", "a", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "l", "Z", "L", "()Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Submit extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<Submit> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdConfig id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final IdPart currentPart;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdRequestArguments governmentIdRequestArguments;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String webRtcObjectId;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean hasSubmitted;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Submit> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Submit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdConfig idConfigCreateFromParcel = IdConfig.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                IdPart idPart = (IdPart) parcel.readParcelable(Submit.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                return new Submit(idConfigCreateFromParcel, arrayList, idPart, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readString(), (CameraProperties) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Submit[] newArray(int i10) {
                return new Submit[i10];
            }
        }

        public /* synthetic */ Submit(IdConfig idConfig, List list, IdPart idPart, List list2, int i10, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, CameraProperties cameraProperties, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, (i11 & 4) != 0 ? new IdPart.SideIdPart(IdConfig.b.Front) : idPart, list2, i10, (i11 & 32) != 0 ? null : governmentIdState, str, (i11 & 128) != 0 ? null : governmentIdRequestArguments, str2, cameraProperties, (i11 & Barcode.FORMAT_UPC_E) != 0 ? false : z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Submit J(Submit submit, IdConfig idConfig, List list, IdPart idPart, List list2, int i10, GovernmentIdState governmentIdState, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, CameraProperties cameraProperties, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                idConfig = submit.id;
            }
            if ((i11 & 2) != 0) {
                list = submit.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                idPart = submit.currentPart;
            }
            if ((i11 & 8) != 0) {
                list2 = submit.parts;
            }
            if ((i11 & 16) != 0) {
                i10 = submit.partIndex;
            }
            if ((i11 & 32) != 0) {
                governmentIdState = submit.backState;
            }
            if ((i11 & 64) != 0) {
                str = submit.countryCode;
            }
            if ((i11 & 128) != 0) {
                governmentIdRequestArguments = submit.governmentIdRequestArguments;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                str2 = submit.webRtcObjectId;
            }
            if ((i11 & Barcode.FORMAT_UPC_A) != 0) {
                cameraProperties = submit.cameraProperties;
            }
            if ((i11 & Barcode.FORMAT_UPC_E) != 0) {
                z10 = submit.hasSubmitted;
            }
            CameraProperties cameraProperties2 = cameraProperties;
            boolean z11 = z10;
            GovernmentIdRequestArguments governmentIdRequestArguments2 = governmentIdRequestArguments;
            String str3 = str2;
            GovernmentIdState governmentIdState2 = governmentIdState;
            String str4 = str;
            int i12 = i10;
            IdPart idPart2 = idPart;
            return submit.I(idConfig, list, idPart2, list2, i12, governmentIdState2, str4, governmentIdRequestArguments2, str3, cameraProperties2, z11);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        public final Submit I(@NotNull IdConfig id2, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull IdPart currentPart, @NotNull List<? extends IdPart> parts, int partIndex, @Nullable GovernmentIdState backState, @Nullable String countryCode, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String webRtcObjectId, @NotNull CameraProperties cameraProperties, boolean hasSubmitted) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new Submit(id2, uploadingIds, currentPart, parts, partIndex, backState, countryCode, governmentIdRequestArguments, webRtcObjectId, cameraProperties, hasSubmitted);
        }

        @Nullable
        /* JADX INFO: renamed from: K, reason: from getter */
        public final GovernmentIdRequestArguments getGovernmentIdRequestArguments() {
            return this.governmentIdRequestArguments;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final boolean getHasSubmitted() {
            return this.hasSubmitted;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CameraProperties getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Submit)) {
                return false;
            }
            Submit submit = (Submit) other;
            return Intrinsics.c(this.id, submit.id) && Intrinsics.c(this.uploadingIds, submit.uploadingIds) && Intrinsics.c(this.currentPart, submit.currentPart) && Intrinsics.c(this.parts, submit.parts) && this.partIndex == submit.partIndex && Intrinsics.c(this.backState, submit.backState) && Intrinsics.c(this.countryCode, submit.countryCode) && Intrinsics.c(this.governmentIdRequestArguments, submit.governmentIdRequestArguments) && Intrinsics.c(this.webRtcObjectId, submit.webRtcObjectId) && Intrinsics.c(this.cameraProperties, submit.cameraProperties) && this.hasSubmitted == submit.hasSubmitted;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.currentPart.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            int iHashCode4 = (iHashCode3 + (governmentIdRequestArguments == null ? 0 : governmentIdRequestArguments.hashCode())) * 31;
            String str2 = this.webRtcObjectId;
            return ((((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.cameraProperties.hashCode()) * 31) + Boolean.hashCode(this.hasSubmitted);
        }

        @NotNull
        public String toString() {
            return "Submit(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", webRtcObjectId=" + this.webRtcObjectId + ", cameraProperties=" + this.cameraProperties + ", hasSubmitted=" + this.hasSubmitted + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.id.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.currentPart, flags);
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            if (governmentIdRequestArguments == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                governmentIdRequestArguments.writeToParcel(dest, flags);
            }
            dest.writeString(this.webRtcObjectId);
            dest.writeParcelable(this.cameraProperties, flags);
            dest.writeInt(this.hasSubmitted ? 1 : 0);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: z, reason: from getter */
        public IdPart getCurrentPart() {
            return this.currentPart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Submit(@NotNull IdConfig id2, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull IdPart currentPart, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @Nullable String str, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str2, @NotNull CameraProperties cameraProperties, boolean z10) {
            super(null);
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            this.id = id2;
            this.uploadingIds = uploadingIds;
            this.currentPart = currentPart;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.webRtcObjectId = str2;
            this.cameraProperties = cameraProperties;
            this.hasSubmitted = z10;
        }
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B§\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-JÄ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u0010(J\u001a\u00105\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010>R\u001a\u0010\u0010\u001a\u00020\u000f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010\u001a\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\b`\u0010^R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\ba\u0010U\u001a\u0004\bb\u00101R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u0010l\u001a\u0004\bi\u0010j¨\u0006m"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lio/c;", "Lio/a;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "manualCapture", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "Luo/x;", "webRtcState", "", "webRtcJwt", "", "error", "", "checkCameraPermissions", "checkAudioPermissions", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "hint", "Lkotlin/Function0;", "", "webRtcConnectionEstablished", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;)V", "newValue", "r", "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "q", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "K", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "Q", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "N", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "T", "()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;", "f", "D", "g", "I", "C", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "i", "Luo/x;", "W", "()Luo/x;", "j", "Ljava/lang/String;", "V", "k", "Ljava/lang/Throwable;", "R", "()Ljava/lang/Throwable;", "l", "Z", "P", "()Z", "m", "O", "n", "x", "o", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "S", "()Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "p", "Lkotlin/jvm/functions/Function0;", "U", "()Lkotlin/jvm/functions/Function0;", "getWebRtcConnectionEstablished$annotations", "()V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitForAutocapture extends GovernmentIdState implements io.c, io.a {

        @NotNull
        public static final Parcelable.Creator<WaitForAutocapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CaptureConfig captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Screen.b.a manualCapture;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final x webRtcState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String webRtcJwt;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Throwable error;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean checkCameraPermissions;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean checkAudioPermissions;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final Hint hint;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Function0<Unit> webRtcConnectionEstablished;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForAutocapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WaitForAutocapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                CaptureConfig captureConfig = (CaptureConfig) parcel.readParcelable(WaitForAutocapture.class.getClassLoader());
                Screen.b.a aVarValueOf = Screen.b.a.valueOf(parcel.readString());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                return new WaitForAutocapture(sideIdPartCreateFromParcel, arrayList, captureConfig, aVarValueOf, arrayList2, parcel.readInt(), (GovernmentIdState) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), parcel.readInt() == 0 ? null : x.valueOf(parcel.readString()), parcel.readString(), (Throwable) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Hint) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), null, Http2.INITIAL_MAX_FRAME_SIZE, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WaitForAutocapture[] newArray(int i10) {
                return new WaitForAutocapture[i10];
            }
        }

        public /* synthetic */ WaitForAutocapture(IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, Screen.b.a aVar, List list2, int i10, GovernmentIdState governmentIdState, x xVar, String str, Throwable th2, boolean z10, boolean z11, String str2, Hint hint, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, captureConfig, aVar, list2, i10, governmentIdState, xVar, str, (i11 & Barcode.FORMAT_UPC_A) != 0 ? null : th2, (i11 & Barcode.FORMAT_UPC_E) != 0 ? true : z10, (i11 & Barcode.FORMAT_PDF417) != 0 ? true : z11, str2, (i11 & 8192) != 0 ? null : hint, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new Function0() { // from class: io.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GovernmentIdState.WaitForAutocapture.J();
                }
            } : function0);
        }

        public static final Unit J() {
            return Unit.f22483a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitForAutocapture L(WaitForAutocapture waitForAutocapture, IdPart.SideIdPart sideIdPart, List list, CaptureConfig captureConfig, Screen.b.a aVar, List list2, int i10, GovernmentIdState governmentIdState, x xVar, String str, Throwable th2, boolean z10, boolean z11, String str2, Hint hint, Function0 function0, int i11, Object obj) {
            return waitForAutocapture.K((i11 & 1) != 0 ? waitForAutocapture.currentPart : sideIdPart, (i11 & 2) != 0 ? waitForAutocapture.uploadingIds : list, (i11 & 4) != 0 ? waitForAutocapture.captureConfig : captureConfig, (i11 & 8) != 0 ? waitForAutocapture.manualCapture : aVar, (i11 & 16) != 0 ? waitForAutocapture.parts : list2, (i11 & 32) != 0 ? waitForAutocapture.partIndex : i10, (i11 & 64) != 0 ? waitForAutocapture.backState : governmentIdState, (i11 & 128) != 0 ? waitForAutocapture.webRtcState : xVar, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? waitForAutocapture.webRtcJwt : str, (i11 & Barcode.FORMAT_UPC_A) != 0 ? waitForAutocapture.error : th2, (i11 & Barcode.FORMAT_UPC_E) != 0 ? waitForAutocapture.checkCameraPermissions : z10, (i11 & Barcode.FORMAT_PDF417) != 0 ? waitForAutocapture.checkAudioPermissions : z11, (i11 & Barcode.FORMAT_AZTEC) != 0 ? waitForAutocapture.countryCode : str2, (i11 & 8192) != 0 ? waitForAutocapture.hint : hint, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? waitForAutocapture.webRtcConnectionEstablished : function0);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        public final WaitForAutocapture K(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull Screen.b.a manualCapture, @NotNull List<? extends IdPart> parts, int partIndex, @Nullable GovernmentIdState backState, @Nullable x webRtcState, @Nullable String webRtcJwt, @Nullable Throwable error, boolean checkCameraPermissions, boolean checkAudioPermissions, @Nullable String countryCode, @Nullable Hint hint, @NotNull Function0<Unit> webRtcConnectionEstablished) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(manualCapture, "manualCapture");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(webRtcConnectionEstablished, "webRtcConnectionEstablished");
            return new WaitForAutocapture(currentPart, uploadingIds, captureConfig, manualCapture, parts, partIndex, backState, webRtcState, webRtcJwt, error, checkCameraPermissions, checkAudioPermissions, countryCode, hint, webRtcConnectionEstablished);
        }

        @NotNull
        /* JADX INFO: renamed from: N, reason: from getter */
        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public boolean getCheckAudioPermissions() {
            return this.checkAudioPermissions;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public boolean getCheckCameraPermissions() {
            return this.checkCameraPermissions;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: Q, reason: from getter */
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Nullable
        /* JADX INFO: renamed from: R, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @Nullable
        /* JADX INFO: renamed from: S, reason: from getter */
        public final Hint getHint() {
            return this.hint;
        }

        @NotNull
        /* JADX INFO: renamed from: T, reason: from getter */
        public final Screen.b.a getManualCapture() {
            return this.manualCapture;
        }

        @NotNull
        public final Function0<Unit> U() {
            return this.webRtcConnectionEstablished;
        }

        @Nullable
        /* JADX INFO: renamed from: V, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @Nullable
        /* JADX INFO: renamed from: W, reason: from getter */
        public final x getWebRtcState() {
            return this.webRtcState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WaitForAutocapture)) {
                return false;
            }
            WaitForAutocapture waitForAutocapture = (WaitForAutocapture) other;
            return Intrinsics.c(this.currentPart, waitForAutocapture.currentPart) && Intrinsics.c(this.uploadingIds, waitForAutocapture.uploadingIds) && Intrinsics.c(this.captureConfig, waitForAutocapture.captureConfig) && this.manualCapture == waitForAutocapture.manualCapture && Intrinsics.c(this.parts, waitForAutocapture.parts) && this.partIndex == waitForAutocapture.partIndex && Intrinsics.c(this.backState, waitForAutocapture.backState) && this.webRtcState == waitForAutocapture.webRtcState && Intrinsics.c(this.webRtcJwt, waitForAutocapture.webRtcJwt) && Intrinsics.c(this.error, waitForAutocapture.error) && this.checkCameraPermissions == waitForAutocapture.checkCameraPermissions && this.checkAudioPermissions == waitForAutocapture.checkAudioPermissions && Intrinsics.c(this.countryCode, waitForAutocapture.countryCode) && Intrinsics.c(this.hint, waitForAutocapture.hint) && Intrinsics.c(this.webRtcConnectionEstablished, waitForAutocapture.webRtcConnectionEstablished);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.manualCapture.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            x xVar = this.webRtcState;
            int iHashCode3 = (iHashCode2 + (xVar == null ? 0 : xVar.hashCode())) * 31;
            String str = this.webRtcJwt;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th2 = this.error;
            int iHashCode5 = (((((iHashCode4 + (th2 == null ? 0 : th2.hashCode())) * 31) + Boolean.hashCode(this.checkCameraPermissions)) * 31) + Boolean.hashCode(this.checkAudioPermissions)) * 31;
            String str2 = this.countryCode;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Hint hint = this.hint;
            return ((iHashCode6 + (hint != null ? hint.hashCode() : 0)) * 31) + this.webRtcConnectionEstablished.hashCode();
        }

        @Override // io.a
        @NotNull
        public GovernmentIdState q(boolean newValue) {
            return L(this, null, null, null, null, null, 0, null, null, null, null, false, newValue, null, null, null, 30719, null);
        }

        @Override // io.c
        @NotNull
        public GovernmentIdState r(boolean newValue) {
            return L(this, null, null, null, null, null, 0, null, null, null, null, newValue, false, null, null, null, 31743, null);
        }

        @NotNull
        public String toString() {
            return "WaitForAutocapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", manualCapture=" + this.manualCapture + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", webRtcState=" + this.webRtcState + ", webRtcJwt=" + this.webRtcJwt + ", error=" + this.error + ", checkCameraPermissions=" + this.checkCameraPermissions + ", checkAudioPermissions=" + this.checkAudioPermissions + ", countryCode=" + this.countryCode + ", hint=" + this.hint + ", webRtcConnectionEstablished=" + this.webRtcConnectionEstablished + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeString(this.manualCapture.name());
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            x xVar = this.webRtcState;
            if (xVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(xVar.name());
            }
            dest.writeString(this.webRtcJwt);
            dest.writeSerializable(this.error);
            dest.writeInt(this.checkCameraPermissions ? 1 : 0);
            dest.writeInt(this.checkAudioPermissions ? 1 : 0);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.hint, flags);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WaitForAutocapture(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull CaptureConfig captureConfig, @NotNull Screen.b.a manualCapture, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @Nullable x xVar, @Nullable String str, @Nullable Throwable th2, boolean z10, boolean z11, @Nullable String str2, @Nullable Hint hint, @NotNull Function0<Unit> webRtcConnectionEstablished) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(manualCapture, "manualCapture");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(webRtcConnectionEstablished, "webRtcConnectionEstablished");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.captureConfig = captureConfig;
            this.manualCapture = manualCapture;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.webRtcState = xVar;
            this.webRtcJwt = str;
            this.error = th2;
            this.checkCameraPermissions = z10;
            this.checkAudioPermissions = z11;
            this.countryCode = str2;
            this.hint = hint;
            this.webRtcConnectionEstablished = webRtcConnectionEstablished;
        }
    }

    public GovernmentIdState() {
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b5\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010#R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "backState", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/Frame;", "captureFrames", "Lcom/withpersona/sdk2/camera/CameraProperties;", "cameraProperties", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "idConfigsForCountry", "selectedCountryCode", "selectedIdClass", "Lio/b;", "errorType", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/b;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "J", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "D", "e", "I", "C", "f", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "g", "Ljava/lang/String;", "x", "h", "i", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "j", "L", "k", "getSelectedCountryCode", "l", "getSelectedIdClass", "m", "Lio/b;", "K", "()Lio/b;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoClassificationError extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<AutoClassificationError> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Frame> captureFrames;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CameraProperties cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdConfigForCountry> idConfigsForCountry;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String selectedCountryCode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String selectedIdClass;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final io.b errorType;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoClassificationError> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(AutoClassificationError.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(AutoClassificationError.class.getClassLoader()));
                }
                int i14 = parcel.readInt();
                GovernmentIdState governmentIdState = (GovernmentIdState) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                String string = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                CameraProperties cameraProperties = (CameraProperties) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                int i17 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationError(sideIdPartCreateFromParcel, arrayList, arrayList2, i14, governmentIdState, string, arrayList3, cameraProperties, arrayList4, parcel.readString(), parcel.readString(), io.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationError[] newArray(int i10) {
                return new AutoClassificationError[i10];
            }
        }

        public /* synthetic */ AutoClassificationError(IdPart.SideIdPart sideIdPart, List list, List list2, int i10, GovernmentIdState governmentIdState, String str, List list3, CameraProperties cameraProperties, List list4, String str2, String str3, io.b bVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new IdPart.SideIdPart(IdConfig.b.Front) : sideIdPart, (i11 & 2) != 0 ? kotlin.collections.p.k() : list, list2, i10, governmentIdState, str, list3, cameraProperties, list4, (i11 & Barcode.FORMAT_UPC_A) != 0 ? null : str2, (i11 & Barcode.FORMAT_UPC_E) != 0 ? null : str3, bVar);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        public final List<Frame> I() {
            return this.captureFrames;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public final io.b getErrorType() {
            return this.errorType;
        }

        @NotNull
        public final List<IdConfigForCountry> L() {
            return this.idConfigsForCountry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AutoClassificationError)) {
                return false;
            }
            AutoClassificationError autoClassificationError = (AutoClassificationError) other;
            return Intrinsics.c(this.currentPart, autoClassificationError.currentPart) && Intrinsics.c(this.uploadingIds, autoClassificationError.uploadingIds) && Intrinsics.c(this.parts, autoClassificationError.parts) && this.partIndex == autoClassificationError.partIndex && Intrinsics.c(this.backState, autoClassificationError.backState) && Intrinsics.c(this.countryCode, autoClassificationError.countryCode) && Intrinsics.c(this.captureFrames, autoClassificationError.captureFrames) && Intrinsics.c(this.cameraProperties, autoClassificationError.cameraProperties) && Intrinsics.c(this.idConfigsForCountry, autoClassificationError.idConfigsForCountry) && Intrinsics.c(this.selectedCountryCode, autoClassificationError.selectedCountryCode) && Intrinsics.c(this.selectedIdClass, autoClassificationError.selectedIdClass) && this.errorType == autoClassificationError.errorType;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.captureFrames.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + this.idConfigsForCountry.hashCode()) * 31;
            String str2 = this.selectedCountryCode;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.selectedIdClass;
            return ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.errorType.hashCode();
        }

        @NotNull
        public String toString() {
            return "AutoClassificationError(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", captureFrames=" + this.captureFrames + ", cameraProperties=" + this.cameraProperties + ", idConfigsForCountry=" + this.idConfigsForCountry + ", selectedCountryCode=" + this.selectedCountryCode + ", selectedIdClass=" + this.selectedIdClass + ", errorType=" + this.errorType + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            List<Frame> list3 = this.captureFrames;
            dest.writeInt(list3.size());
            Iterator<Frame> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.cameraProperties, flags);
            List<IdConfigForCountry> list4 = this.idConfigsForCountry;
            dest.writeInt(list4.size());
            Iterator<IdConfigForCountry> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(dest, flags);
            }
            dest.writeString(this.selectedCountryCode);
            dest.writeString(this.selectedIdClass);
            dest.writeString(this.errorType.name());
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AutoClassificationError(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int i10, @Nullable GovernmentIdState governmentIdState, @Nullable String str, @NotNull List<Frame> captureFrames, @NotNull CameraProperties cameraProperties, @NotNull List<IdConfigForCountry> idConfigsForCountry, @Nullable String str2, @Nullable String str3, @NotNull io.b errorType) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureFrames, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(idConfigsForCountry, "idConfigsForCountry");
            Intrinsics.checkNotNullParameter(errorType, "errorType");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i10;
            this.backState = governmentIdState;
            this.countryCode = str;
            this.captureFrames = captureFrames;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = idConfigsForCountry;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
            this.errorType = errorType;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ|\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bA\u00103\u001a\u0004\bB\u0010 ¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "parts", "", "partIndex", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "captureConfig", "", "choosingDocumentToUpload", "backState", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "N", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "D", "e", "C", "f", "Ljava/lang/String;", "x", "g", "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "K", "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "h", "Z", "L", "()Z", "i", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "j", "O", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseCaptureMethod extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<ChooseCaptureMethod> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final CaptureConfig captureConfig;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean choosingDocumentToUpload;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String error;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ChooseCaptureMethod> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChooseCaptureMethod createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart.SideIdPart sideIdPartCreateFromParcel = IdPart.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()));
                }
                return new ChooseCaptureMethod(sideIdPartCreateFromParcel, arrayList, arrayList2, parcel.readInt(), parcel.readString(), (CaptureConfig) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readInt() != 0, (GovernmentIdState) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChooseCaptureMethod[] newArray(int i10) {
                return new ChooseCaptureMethod[i10];
            }
        }

        public /* synthetic */ ChooseCaptureMethod(IdPart.SideIdPart sideIdPart, List list, List list2, int i10, String str, CaptureConfig captureConfig, boolean z10, GovernmentIdState governmentIdState, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new IdPart.SideIdPart(IdConfig.b.Front) : sideIdPart, (i11 & 2) != 0 ? kotlin.collections.p.k() : list, list2, i10, str, captureConfig, (i11 & 64) != 0 ? false : z10, governmentIdState, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChooseCaptureMethod J(ChooseCaptureMethod chooseCaptureMethod, IdPart.SideIdPart sideIdPart, List list, List list2, int i10, String str, CaptureConfig captureConfig, boolean z10, GovernmentIdState governmentIdState, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sideIdPart = chooseCaptureMethod.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = chooseCaptureMethod.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                list2 = chooseCaptureMethod.parts;
            }
            if ((i11 & 8) != 0) {
                i10 = chooseCaptureMethod.partIndex;
            }
            if ((i11 & 16) != 0) {
                str = chooseCaptureMethod.countryCode;
            }
            if ((i11 & 32) != 0) {
                captureConfig = chooseCaptureMethod.captureConfig;
            }
            if ((i11 & 64) != 0) {
                z10 = chooseCaptureMethod.choosingDocumentToUpload;
            }
            if ((i11 & 128) != 0) {
                governmentIdState = chooseCaptureMethod.backState;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                str2 = chooseCaptureMethod.error;
            }
            GovernmentIdState governmentIdState2 = governmentIdState;
            String str3 = str2;
            CaptureConfig captureConfig2 = captureConfig;
            boolean z11 = z10;
            String str4 = str;
            List list3 = list2;
            return chooseCaptureMethod.I(sideIdPart, list, list3, i10, str4, captureConfig2, z11, governmentIdState2, str3);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        public final ChooseCaptureMethod I(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int partIndex, @Nullable String countryCode, @NotNull CaptureConfig captureConfig, boolean choosingDocumentToUpload, @Nullable GovernmentIdState backState, @Nullable String error) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            return new ChooseCaptureMethod(currentPart, uploadingIds, parts, partIndex, countryCode, captureConfig, choosingDocumentToUpload, backState, error);
        }

        @NotNull
        /* JADX INFO: renamed from: K, reason: from getter */
        public final CaptureConfig getCaptureConfig() {
            return this.captureConfig;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final boolean getChoosingDocumentToUpload() {
            return this.choosingDocumentToUpload;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: N, reason: from getter */
        public IdPart.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChooseCaptureMethod)) {
                return false;
            }
            ChooseCaptureMethod chooseCaptureMethod = (ChooseCaptureMethod) other;
            return Intrinsics.c(this.currentPart, chooseCaptureMethod.currentPart) && Intrinsics.c(this.uploadingIds, chooseCaptureMethod.uploadingIds) && Intrinsics.c(this.parts, chooseCaptureMethod.parts) && this.partIndex == chooseCaptureMethod.partIndex && Intrinsics.c(this.countryCode, chooseCaptureMethod.countryCode) && Intrinsics.c(this.captureConfig, chooseCaptureMethod.captureConfig) && this.choosingDocumentToUpload == chooseCaptureMethod.choosingDocumentToUpload && Intrinsics.c(this.backState, chooseCaptureMethod.backState) && Intrinsics.c(this.error, chooseCaptureMethod.error);
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            String str = this.countryCode;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captureConfig.hashCode()) * 31) + Boolean.hashCode(this.choosingDocumentToUpload)) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode3 = (iHashCode2 + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31;
            String str2 = this.error;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ChooseCaptureMethod(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", countryCode=" + this.countryCode + ", captureConfig=" + this.captureConfig + ", choosingDocumentToUpload=" + this.choosingDocumentToUpload + ", backState=" + this.backState + ", error=" + this.error + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeInt(this.choosingDocumentToUpload ? 1 : 0);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.error);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChooseCaptureMethod(@NotNull IdPart.SideIdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, int i10, @Nullable String str, @NotNull CaptureConfig captureConfig, boolean z10, @Nullable GovernmentIdState governmentIdState, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.partIndex = i10;
            this.countryCode = str;
            this.captureConfig = captureConfig;
            this.choosingDocumentToUpload = z10;
            this.backState = governmentIdState;
            this.error = str2;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u0010\u001b¨\u0006<"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$RestartStep;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "parts", "backState", "", "partIndex", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "selectedId", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "z", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "D", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "I", "C", "g", "Ljava/lang/String;", "x", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getSelectedId", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "i", "getError", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestartStep extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<RestartStep> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final IdConfig selectedId;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String error;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RestartStep> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RestartStep createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart idPart = (IdPart) parcel.readParcelable(RestartStep.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(RestartStep.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(RestartStep.class.getClassLoader()));
                }
                return new RestartStep(idPart, arrayList, arrayList2, (GovernmentIdState) parcel.readParcelable(RestartStep.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RestartStep[] newArray(int i10) {
                return new RestartStep[i10];
            }
        }

        public /* synthetic */ RestartStep(IdPart idPart, List list, List list2, GovernmentIdState governmentIdState, int i10, String str, IdConfig idConfig, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new IdPart.SideIdPart(IdConfig.b.Front) : idPart, (i11 & 2) != 0 ? kotlin.collections.p.k() : list, (i11 & 4) != 0 ? kotlin.collections.p.k() : list2, (i11 & 8) != 0 ? null : governmentIdState, (i11 & 16) != 0 ? -1 : i10, str, (i11 & 64) != 0 ? null : idConfig, (i11 & 128) != 0 ? null : str2);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RestartStep)) {
                return false;
            }
            RestartStep restartStep = (RestartStep) other;
            return Intrinsics.c(this.currentPart, restartStep.currentPart) && Intrinsics.c(this.uploadingIds, restartStep.uploadingIds) && Intrinsics.c(this.parts, restartStep.parts) && Intrinsics.c(this.backState, restartStep.backState) && this.partIndex == restartStep.partIndex && Intrinsics.c(this.countryCode, restartStep.countryCode) && Intrinsics.c(this.selectedId, restartStep.selectedId) && Intrinsics.c(this.error, restartStep.error);
        }

        public int hashCode() {
            int iHashCode = ((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (((iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + Integer.hashCode(this.partIndex)) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            IdConfig idConfig = this.selectedId;
            int iHashCode4 = (iHashCode3 + (idConfig == null ? 0 : idConfig.hashCode())) * 31;
            String str2 = this.error;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RestartStep(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", backState=" + this.backState + ", partIndex=" + this.partIndex + ", countryCode=" + this.countryCode + ", selectedId=" + this.selectedId + ", error=" + this.error + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeParcelable(this.backState, flags);
            dest.writeInt(this.partIndex);
            dest.writeString(this.countryCode);
            IdConfig idConfig = this.selectedId;
            if (idConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                idConfig.writeToParcel(dest, flags);
            }
            dest.writeString(this.error);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: z, reason: from getter */
        public IdPart getCurrentPart() {
            return this.currentPart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RestartStep(@NotNull IdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, @Nullable GovernmentIdState governmentIdState, int i10, @Nullable String str, @Nullable IdConfig idConfig, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.backState = governmentIdState;
            this.partIndex = i10;
            this.countryCode = str;
            this.selectedId = idConfig;
            this.error = str2;
        }
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u0010\u001d¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "currentPart", "", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;", "uploadingIds", "parts", "backState", "", "partIndex", "", "countryCode", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "selectedId", "error", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "z", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;", "c", "Ljava/util/List;", "E", "()Ljava/util/List;", "d", "D", "e", "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "w", "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;", "f", "C", "g", "Ljava/lang/String;", "x", "h", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "getSelectedId", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "i", "K", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowInstructions extends GovernmentIdState {

        @NotNull
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<GovernmentId> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdPart> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final GovernmentIdState backState;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final IdConfig selectedId;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String error;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowInstructions> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                IdPart idPart = (IdPart) parcel.readParcelable(ShowInstructions.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(ShowInstructions.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(ShowInstructions.class.getClassLoader()));
                }
                return new ShowInstructions(idPart, arrayList, arrayList2, (GovernmentIdState) parcel.readParcelable(ShowInstructions.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions[] newArray(int i10) {
                return new ShowInstructions[i10];
            }
        }

        public /* synthetic */ ShowInstructions(IdPart idPart, List list, List list2, GovernmentIdState governmentIdState, int i10, String str, IdConfig idConfig, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new IdPart.SideIdPart(IdConfig.b.Front) : idPart, (i11 & 2) != 0 ? kotlin.collections.p.k() : list, (i11 & 4) != 0 ? kotlin.collections.p.k() : list2, (i11 & 8) != 0 ? null : governmentIdState, (i11 & 16) != 0 ? -1 : i10, str, (i11 & 64) != 0 ? null : idConfig, (i11 & 128) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowInstructions J(ShowInstructions showInstructions, IdPart idPart, List list, List list2, GovernmentIdState governmentIdState, int i10, String str, IdConfig idConfig, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                idPart = showInstructions.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = showInstructions.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                list2 = showInstructions.parts;
            }
            if ((i11 & 8) != 0) {
                governmentIdState = showInstructions.backState;
            }
            if ((i11 & 16) != 0) {
                i10 = showInstructions.partIndex;
            }
            if ((i11 & 32) != 0) {
                str = showInstructions.countryCode;
            }
            if ((i11 & 64) != 0) {
                idConfig = showInstructions.selectedId;
            }
            if ((i11 & 128) != 0) {
                str2 = showInstructions.error;
            }
            IdConfig idConfig2 = idConfig;
            String str3 = str2;
            int i12 = i10;
            String str4 = str;
            return showInstructions.I(idPart, list, list2, governmentIdState, i12, str4, idConfig2, str3);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        /* JADX INFO: renamed from: C, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<IdPart> D() {
            return this.parts;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        public List<GovernmentId> E() {
            return this.uploadingIds;
        }

        @NotNull
        public final ShowInstructions I(@NotNull IdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, @Nullable GovernmentIdState backState, int partIndex, @Nullable String countryCode, @Nullable IdConfig selectedId, @Nullable String error) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new ShowInstructions(currentPart, uploadingIds, parts, backState, partIndex, countryCode, selectedId, error);
        }

        @Nullable
        /* JADX INFO: renamed from: K, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowInstructions)) {
                return false;
            }
            ShowInstructions showInstructions = (ShowInstructions) other;
            return Intrinsics.c(this.currentPart, showInstructions.currentPart) && Intrinsics.c(this.uploadingIds, showInstructions.uploadingIds) && Intrinsics.c(this.parts, showInstructions.parts) && Intrinsics.c(this.backState, showInstructions.backState) && this.partIndex == showInstructions.partIndex && Intrinsics.c(this.countryCode, showInstructions.countryCode) && Intrinsics.c(this.selectedId, showInstructions.selectedId) && Intrinsics.c(this.error, showInstructions.error);
        }

        public int hashCode() {
            int iHashCode = ((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31;
            GovernmentIdState governmentIdState = this.backState;
            int iHashCode2 = (((iHashCode + (governmentIdState == null ? 0 : governmentIdState.hashCode())) * 31) + Integer.hashCode(this.partIndex)) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            IdConfig idConfig = this.selectedId;
            int iHashCode4 = (iHashCode3 + (idConfig == null ? 0 : idConfig.hashCode())) * 31;
            String str2 = this.error;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ShowInstructions(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", backState=" + this.backState + ", partIndex=" + this.partIndex + ", countryCode=" + this.countryCode + ", selectedId=" + this.selectedId + ", error=" + this.error + ")";
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public GovernmentIdState getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<GovernmentId> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<GovernmentId> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<IdPart> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<IdPart> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeParcelable(this.backState, flags);
            dest.writeInt(this.partIndex);
            dest.writeString(this.countryCode);
            IdConfig idConfig = this.selectedId;
            if (idConfig == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                idConfig.writeToParcel(dest, flags);
            }
            dest.writeString(this.error);
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState
        @NotNull
        /* JADX INFO: renamed from: z, reason: from getter */
        public IdPart getCurrentPart() {
            return this.currentPart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowInstructions(@NotNull IdPart currentPart, @NotNull List<? extends GovernmentId> uploadingIds, @NotNull List<? extends IdPart> parts, @Nullable GovernmentIdState governmentIdState, int i10, @Nullable String str, @Nullable IdConfig idConfig, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.backState = governmentIdState;
            this.partIndex = i10;
            this.countryCode = str;
            this.selectedId = idConfig;
            this.error = str2;
        }
    }
}
