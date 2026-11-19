package vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import dp.GovernmentIdRequestArguments;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u000e()*+,-./0123\f4B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0004R\"\u0010\u0012\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138 X \u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178 X \u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00178 X \u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010\u00058 X \u0004¢\u0006\u0006\u001a\u0004\b%\u0010&\u0082\u0001\f56789:;<=>?@¨\u0006A"}, d2 = {"Lvo/j0;", "Lls/c;", "Landroid/os/Parcelable;", "<init>", "()V", BuildConfig.FLAVOR, "error", "u", "(Ljava/lang/String;)Lvo/j0;", BuildConfig.FLAVOR, "v", BuildConfig.FLAVOR, "a", "Z", "z", "()Z", "F", "(Z)V", "didGoBack", "Lvo/i3;", "y", "()Lvo/i3;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "D", "()Ljava/util/List;", "uploadingIds", "C", "parts", BuildConfig.FLAVOR, "B", "()I", "partIndex", "w", "()Lvo/j0;", "backState", "x", "()Ljava/lang/String;", "countryCode", "h", "l", "c", "n", "d", "j", "i", "k", "e", "f", "g", "m", "b", "Lvo/j0$a;", "Lvo/j0$b;", "Lvo/j0$c;", "Lvo/j0$d;", "Lvo/j0$e;", "Lvo/j0$f;", "Lvo/j0$g;", "Lvo/j0$h;", "Lvo/j0$j;", "Lvo/j0$l;", "Lvo/j0$m;", "Lvo/j0$n;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class j0 extends ls.c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean didGoBack;

    /* JADX INFO: renamed from: vo.j0$b, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u009e\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b7\u0010BR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bE\u0010<\u001a\u0004\bF\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010#¨\u0006I"}, d2 = {"Lvo/j0$b;", "Lvo/j0;", "Lvo/i3$a;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/i3;", "parts", BuildConfig.FLAVOR, "partIndex", "backState", BuildConfig.FLAVOR, "countryCode", "Lvo/m;", "captureFrames", "Lsn/v;", "cameraProperties", "Lvo/f3;", "idConfigsForCountry", "selectedCountryCode", "selectedIdClass", "<init>", "(Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ljava/util/List;Lsn/v;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "G", "(Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ljava/util/List;Lsn/v;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lvo/j0$b;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3$a;", "J", "()Lvo/i3$a;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "C", "e", "I", "B", "f", "Lvo/j0;", "w", "()Lvo/j0;", "g", "Ljava/lang/String;", "x", "h", "getCaptureFrames", "i", "Lsn/v;", "()Lsn/v;", "j", "L", "k", "M", "l", "N", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoClassificationManualSelect extends j0 {

        @NotNull
        public static final Parcelable.Creator<AutoClassificationManualSelect> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Frame> captureFrames;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<IdConfigForCountry> idConfigsForCountry;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String selectedCountryCode;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String selectedIdClass;

        /* JADX INFO: renamed from: vo.j0$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoClassificationManualSelect> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationManualSelect createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3.SideIdPart sideIdPartCreateFromParcel = i3.SideIdPart.CREATOR.createFromParcel(parcel);
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
                j0 j0Var = (j0) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                String string = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                sn.v vVar = (sn.v) parcel.readParcelable(AutoClassificationManualSelect.class.getClassLoader());
                int i17 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationManualSelect(sideIdPartCreateFromParcel, arrayList, arrayList2, i14, j0Var, string, arrayList3, vVar, arrayList4, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationManualSelect[] newArray(int i10) {
                return new AutoClassificationManualSelect[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AutoClassificationManualSelect(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @Nullable String str, @NotNull List<Frame> captureFrames, @NotNull sn.v cameraProperties, @NotNull List<IdConfigForCountry> idConfigsForCountry, @Nullable String str2, @Nullable String str3) {
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
            this.backState = j0Var;
            this.countryCode = str;
            this.captureFrames = captureFrames;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = idConfigsForCountry;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AutoClassificationManualSelect H(AutoClassificationManualSelect autoClassificationManualSelect, i3.SideIdPart sideIdPart, List list, List list2, int i10, j0 j0Var, String str, List list3, sn.v vVar, List list4, String str2, String str3, int i11, Object obj) {
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
                j0Var = autoClassificationManualSelect.backState;
            }
            if ((i11 & 32) != 0) {
                str = autoClassificationManualSelect.countryCode;
            }
            if ((i11 & 64) != 0) {
                list3 = autoClassificationManualSelect.captureFrames;
            }
            if ((i11 & Barcode.FORMAT_ITF) != 0) {
                vVar = autoClassificationManualSelect.cameraProperties;
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
            sn.v vVar2 = vVar;
            List list5 = list4;
            String str6 = str;
            List list6 = list3;
            j0 j0Var2 = j0Var;
            List list7 = list2;
            return autoClassificationManualSelect.G(sideIdPart, list, list7, i10, j0Var2, str6, list6, vVar2, list5, str4, str5);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        public final AutoClassificationManualSelect G(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, int partIndex, @Nullable j0 backState, @Nullable String countryCode, @NotNull List<Frame> captureFrames, @NotNull sn.v cameraProperties, @NotNull List<IdConfigForCountry> idConfigsForCountry, @Nullable String selectedCountryCode, @Nullable String selectedIdClass) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureFrames, "captureFrames");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(idConfigsForCountry, "idConfigsForCountry");
            return new AutoClassificationManualSelect(currentPart, uploadingIds, parts, partIndex, backState, countryCode, captureFrames, cameraProperties, idConfigsForCountry, selectedCountryCode, selectedIdClass);
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public i3.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @NotNull
        public final List<IdConfigForCountry> L() {
            return this.idConfigsForCountry;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final String getSelectedCountryCode() {
            return this.selectedCountryCode;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
        public final String getSelectedIdClass() {
            return this.selectedIdClass;
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

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            j0 j0Var = this.backState;
            int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }
    }

    /* JADX INFO: renamed from: vo.j0$d, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ|\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b:\u0010/\u001a\u0004\b;\u00101R\u001a\u0010\u000e\u001a\u00020\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010#R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lvo/j0$d;", "Lvo/j0;", "Lvo/i3$a;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/f;", "captureConfig", "Lvo/n$b;", "idForReview", "Lvo/i3;", "parts", BuildConfig.FLAVOR, "partIndex", "backState", BuildConfig.FLAVOR, "countryCode", "Lcp/d;", "hint", "<init>", "(Lvo/i3$a;Ljava/util/List;Lvo/f;Lvo/n$b;Ljava/util/List;ILvo/j0;Ljava/lang/String;Lcp/d;)V", BuildConfig.FLAVOR, "v", "()V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "G", "(Lvo/i3$a;Ljava/util/List;Lvo/f;Lvo/n$b;Ljava/util/List;ILvo/j0;Ljava/lang/String;Lcp/d;)Lvo/j0$d;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3$a;", "L", "()Lvo/i3$a;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "Lvo/f;", "J", "()Lvo/f;", "e", "Lvo/n$b;", "N", "()Lvo/n$b;", "f", "C", "g", "I", "B", "h", "Lvo/j0;", "w", "()Lvo/j0;", "i", "Ljava/lang/String;", "x", "j", "Lcp/d;", "M", "()Lcp/d;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountdownToCapture extends j0 {

        @NotNull
        public static final Parcelable.Creator<CountdownToCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final vo.f captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n.GovernmentIdImage idForReview;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final cp.d hint;

        /* JADX INFO: renamed from: vo.j0$d$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CountdownToCapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3.SideIdPart sideIdPartCreateFromParcel = i3.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                vo.f fVar = (vo.f) parcel.readParcelable(CountdownToCapture.class.getClassLoader());
                n.GovernmentIdImage governmentIdImageCreateFromParcel = n.GovernmentIdImage.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
                }
                return new CountdownToCapture(sideIdPartCreateFromParcel, arrayList, fVar, governmentIdImageCreateFromParcel, arrayList2, parcel.readInt(), (j0) parcel.readParcelable(CountdownToCapture.class.getClassLoader()), parcel.readString(), (cp.d) parcel.readParcelable(CountdownToCapture.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CountdownToCapture[] newArray(int i10) {
                return new CountdownToCapture[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CountdownToCapture(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull vo.f captureConfig, @NotNull n.GovernmentIdImage idForReview, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @Nullable String str, @Nullable cp.d dVar) {
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
            this.backState = j0Var;
            this.countryCode = str;
            this.hint = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CountdownToCapture H(CountdownToCapture countdownToCapture, i3.SideIdPart sideIdPart, List list, vo.f fVar, n.GovernmentIdImage governmentIdImage, List list2, int i10, j0 j0Var, String str, cp.d dVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sideIdPart = countdownToCapture.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = countdownToCapture.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                fVar = countdownToCapture.captureConfig;
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
                j0Var = countdownToCapture.backState;
            }
            if ((i11 & Barcode.FORMAT_ITF) != 0) {
                str = countdownToCapture.countryCode;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                dVar = countdownToCapture.hint;
            }
            String str2 = str;
            cp.d dVar2 = dVar;
            int i12 = i10;
            j0 j0Var2 = j0Var;
            List list3 = list2;
            vo.f fVar2 = fVar;
            return countdownToCapture.G(sideIdPart, list, fVar2, governmentIdImage, list3, i12, j0Var2, str2, dVar2);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        public final CountdownToCapture G(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull vo.f captureConfig, @NotNull n.GovernmentIdImage idForReview, @NotNull List<? extends i3> parts, int partIndex, @Nullable j0 backState, @Nullable String countryCode, @Nullable cp.d hint) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new CountdownToCapture(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, countryCode, hint);
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final vo.f getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public i3.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final cp.d getHint() {
            return this.hint;
        }

        @NotNull
        /* JADX INFO: renamed from: N, reason: from getter */
        public final n.GovernmentIdImage getIdForReview() {
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
            j0 j0Var = this.backState;
            int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            cp.d dVar = this.hint;
            return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CountdownToCapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", hint=" + this.hint + ")";
        }

        @Override // vo.j0
        public void v() {
            super.v();
            Iterator<T> it = this.idForReview.j3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            this.idForReview.writeToParcel(dest, flags);
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            dest.writeParcelable(this.hint, flags);
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }
    }

    /* JADX INFO: renamed from: vo.j0$e, reason: from toString */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0086\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u001a\u0010&\u001a\u00020\u00132\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u0010/R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bD\u0010*\u001a\u0004\bE\u0010FR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lvo/j0$e;", "Lvo/j0;", "Lvo/d3;", "id", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/i3;", "currentPart", "parts", BuildConfig.FLAVOR, "partIndex", "backState", BuildConfig.FLAVOR, "countryCode", "Ldp/c;", "governmentIdRequestArguments", BuildConfig.FLAVOR, "minDurationMs", BuildConfig.FLAVOR, "isDelayComplete", "<init>", "(Lvo/d3;Ljava/util/List;Lvo/i3;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ldp/c;JZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "G", "(Lvo/d3;Ljava/util/List;Lvo/i3;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ldp/c;JZ)Lvo/j0$e;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/d3;", "J", "()Lvo/d3;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "Lvo/i3;", "y", "()Lvo/i3;", "e", "C", "f", "I", "B", "g", "Lvo/j0;", "w", "()Lvo/j0;", "h", "Ljava/lang/String;", "x", "i", "Ldp/c;", "getGovernmentIdRequestArguments", "()Ldp/c;", "j", "L", "()J", "k", "Z", "M", "()Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FinalizeLocalVideoCapture extends j0 {

        @NotNull
        public static final Parcelable.Creator<FinalizeLocalVideoCapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdConfig id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final i3 currentPart;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

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

        /* JADX INFO: renamed from: vo.j0$e$a */
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
                i3 i3Var = (i3) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()));
                }
                return new FinalizeLocalVideoCapture(idConfigCreateFromParcel, arrayList, i3Var, arrayList2, parcel.readInt(), (j0) parcel.readParcelable(FinalizeLocalVideoCapture.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final FinalizeLocalVideoCapture[] newArray(int i10) {
                return new FinalizeLocalVideoCapture[i10];
            }
        }

        public /* synthetic */ FinalizeLocalVideoCapture(IdConfig idConfig, List list, i3 i3Var, List list2, int i10, j0 j0Var, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, i3Var, list2, i10, (i11 & 32) != 0 ? null : j0Var, str, (i11 & Barcode.FORMAT_ITF) != 0 ? null : governmentIdRequestArguments, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? 3000L : j10, (i11 & Barcode.FORMAT_UPC_A) != 0 ? false : z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinalizeLocalVideoCapture H(FinalizeLocalVideoCapture finalizeLocalVideoCapture, IdConfig idConfig, List list, i3 i3Var, List list2, int i10, j0 j0Var, String str, GovernmentIdRequestArguments governmentIdRequestArguments, long j10, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                idConfig = finalizeLocalVideoCapture.id;
            }
            if ((i11 & 2) != 0) {
                list = finalizeLocalVideoCapture.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                i3Var = finalizeLocalVideoCapture.currentPart;
            }
            if ((i11 & 8) != 0) {
                list2 = finalizeLocalVideoCapture.parts;
            }
            if ((i11 & 16) != 0) {
                i10 = finalizeLocalVideoCapture.partIndex;
            }
            if ((i11 & 32) != 0) {
                j0Var = finalizeLocalVideoCapture.backState;
            }
            if ((i11 & 64) != 0) {
                str = finalizeLocalVideoCapture.countryCode;
            }
            if ((i11 & Barcode.FORMAT_ITF) != 0) {
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
            j0 j0Var2 = j0Var;
            return finalizeLocalVideoCapture.G(idConfig, list, i3Var, list2, i12, j0Var2, str2, governmentIdRequestArguments2, j11, z11);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        public final FinalizeLocalVideoCapture G(@NotNull IdConfig id2, @NotNull List<? extends n> uploadingIds, @NotNull i3 currentPart, @NotNull List<? extends i3> parts, int partIndex, @Nullable j0 backState, @Nullable String countryCode, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, long minDurationMs, boolean isDelayComplete) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new FinalizeLocalVideoCapture(id2, uploadingIds, currentPart, parts, partIndex, backState, countryCode, governmentIdRequestArguments, minDurationMs, isDelayComplete);
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final IdConfig getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final long getMinDurationMs() {
            return this.minDurationMs;
        }

        /* JADX INFO: renamed from: M, reason: from getter */
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
            j0 j0Var = this.backState;
            int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            GovernmentIdRequestArguments governmentIdRequestArguments = this.governmentIdRequestArguments;
            return ((((iHashCode3 + (governmentIdRequestArguments != null ? governmentIdRequestArguments.hashCode() : 0)) * 31) + Long.hashCode(this.minDurationMs)) * 31) + Boolean.hashCode(this.isDelayComplete);
        }

        @NotNull
        public String toString() {
            return "FinalizeLocalVideoCapture(id=" + this.id + ", uploadingIds=" + this.uploadingIds + ", currentPart=" + this.currentPart + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", governmentIdRequestArguments=" + this.governmentIdRequestArguments + ", minDurationMs=" + this.minDurationMs + ", isDelayComplete=" + this.isDelayComplete + ")";
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.id.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.currentPart, flags);
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public i3 getCurrentPart() {
            return this.currentPart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinalizeLocalVideoCapture(@NotNull IdConfig id2, @NotNull List<? extends n> uploadingIds, @NotNull i3 currentPart, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @Nullable String str, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, long j10, boolean z10) {
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
            this.backState = j0Var;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.minDurationMs = j10;
            this.isDelayComplete = z10;
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b(\u00106¨\u00067"}, d2 = {"Lvo/j0$f;", "Lvo/j0;", "Lvo/i3;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "parts", BuildConfig.FLAVOR, "partIndex", "backState", BuildConfig.FLAVOR, "countryCode", "Lvo/d3;", "id", "Lsn/v;", "cameraProperties", "<init>", "(Lvo/i3;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Lvo/d3;Lsn/v;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Lvo/i3;", "y", "()Lvo/i3;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "C", "e", "I", "B", "f", "Lvo/j0;", "w", "()Lvo/j0;", "g", "Ljava/lang/String;", "x", "()Ljava/lang/String;", "h", "Lvo/d3;", "G", "()Lvo/d3;", "i", "Lsn/v;", "()Lsn/v;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f extends j0 {

        @NotNull
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final i3 currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final j0 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final IdConfig id;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final sn.v cameraProperties;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3 i3Var = (i3) parcel.readParcelable(f.class.getClassLoader());
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(f.class.getClassLoader()));
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(f.class.getClassLoader()));
                }
                return new f(i3Var, arrayList, arrayList2, parcel.readInt(), (j0) parcel.readParcelable(f.class.getClassLoader()), parcel.readString(), IdConfig.CREATOR.createFromParcel(parcel), (sn.v) parcel.readParcelable(f.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i10) {
                return new f[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(@NotNull i3 currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @Nullable String str, @NotNull IdConfig id2, @NotNull sn.v cameraProperties) {
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
            this.backState = j0Var;
            this.countryCode = str;
            this.id = id2;
            this.cameraProperties = cameraProperties;
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        /* JADX INFO: renamed from: G, reason: from getter */
        public final IdConfig getId() {
            return this.id;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            dest.writeString(this.countryCode);
            this.id.writeToParcel(dest, flags);
            dest.writeParcelable(this.cameraProperties, flags);
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public i3 getCurrentPart() {
            return this.currentPart;
        }
    }

    /* JADX INFO: renamed from: vo.j0$g, reason: from toString */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010!\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u008e\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u001a\u0010*\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b9\u0010FR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\bH\u0010\u001dR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lvo/j0$g;", "Lvo/j0;", "Lvo/i3$a;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/i3;", "parts", BuildConfig.FLAVOR, "partIndex", "backState", BuildConfig.FLAVOR, "countryCode", "Lvo/f;", "captureConfig", "Lsn/v;", "cameraProperties", "torchDurationMs", "Lvo/n$b;", "capturedImage", BuildConfig.FLAVOR, "holographicTorchEnabled", "<init>", "(Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Lvo/f;Lsn/v;ILvo/n$b;Z)V", BuildConfig.FLAVOR, "v", "()V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "G", "(Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Lvo/f;Lsn/v;ILvo/n$b;Z)Lvo/j0$g;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3$a;", "M", "()Lvo/i3$a;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "C", "e", "I", "B", "f", "Lvo/j0;", "w", "()Lvo/j0;", "g", "Ljava/lang/String;", "x", "h", "Lvo/f;", "J", "()Lvo/f;", "i", "Lsn/v;", "()Lsn/v;", "j", "O", "k", "Lvo/n$b;", "L", "()Lvo/n$b;", "l", "Z", "N", "()Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HolographicTorchDelay extends j0 {

        @NotNull
        public static final Parcelable.Creator<HolographicTorchDelay> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final vo.f captureConfig;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final int torchDurationMs;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n.GovernmentIdImage capturedImage;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean holographicTorchEnabled;

        /* JADX INFO: renamed from: vo.j0$g$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HolographicTorchDelay> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HolographicTorchDelay createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3.SideIdPart sideIdPartCreateFromParcel = i3.SideIdPart.CREATOR.createFromParcel(parcel);
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
                return new HolographicTorchDelay(sideIdPartCreateFromParcel, arrayList, arrayList2, parcel.readInt(), (j0) parcel.readParcelable(HolographicTorchDelay.class.getClassLoader()), parcel.readString(), (vo.f) parcel.readParcelable(HolographicTorchDelay.class.getClassLoader()), (sn.v) parcel.readParcelable(HolographicTorchDelay.class.getClassLoader()), parcel.readInt(), n.GovernmentIdImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final HolographicTorchDelay[] newArray(int i10) {
                return new HolographicTorchDelay[i10];
            }
        }

        public /* synthetic */ HolographicTorchDelay(i3.SideIdPart sideIdPart, List list, List list2, int i10, j0 j0Var, String str, vo.f fVar, sn.v vVar, int i11, n.GovernmentIdImage governmentIdImage, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, list2, i10, j0Var, str, fVar, vVar, i11, governmentIdImage, (i12 & Barcode.FORMAT_UPC_E) != 0 ? true : z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HolographicTorchDelay H(HolographicTorchDelay holographicTorchDelay, i3.SideIdPart sideIdPart, List list, List list2, int i10, j0 j0Var, String str, vo.f fVar, sn.v vVar, int i11, n.GovernmentIdImage governmentIdImage, boolean z10, int i12, Object obj) {
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
                j0Var = holographicTorchDelay.backState;
            }
            if ((i12 & 32) != 0) {
                str = holographicTorchDelay.countryCode;
            }
            if ((i12 & 64) != 0) {
                fVar = holographicTorchDelay.captureConfig;
            }
            if ((i12 & Barcode.FORMAT_ITF) != 0) {
                vVar = holographicTorchDelay.cameraProperties;
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
            n.GovernmentIdImage governmentIdImage2 = governmentIdImage;
            boolean z11 = z10;
            sn.v vVar2 = vVar;
            int i13 = i11;
            String str2 = str;
            vo.f fVar2 = fVar;
            j0 j0Var2 = j0Var;
            List list3 = list2;
            return holographicTorchDelay.G(sideIdPart, list, list3, i10, j0Var2, str2, fVar2, vVar2, i13, governmentIdImage2, z11);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        public final HolographicTorchDelay G(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, int partIndex, @Nullable j0 backState, @Nullable String countryCode, @NotNull vo.f captureConfig, @NotNull sn.v cameraProperties, int torchDurationMs, @NotNull n.GovernmentIdImage capturedImage, boolean holographicTorchEnabled) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            Intrinsics.checkNotNullParameter(capturedImage, "capturedImage");
            return new HolographicTorchDelay(currentPart, uploadingIds, parts, partIndex, backState, countryCode, captureConfig, cameraProperties, torchDurationMs, capturedImage, holographicTorchEnabled);
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final vo.f getCaptureConfig() {
            return this.captureConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: L, reason: from getter */
        public final n.GovernmentIdImage getCapturedImage() {
            return this.capturedImage;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: M, reason: from getter */
        public i3.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public final boolean getHolographicTorchEnabled() {
            return this.holographicTorchEnabled;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final int getTorchDurationMs() {
            return this.torchDurationMs;
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

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            j0 j0Var = this.backState;
            int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            String str = this.countryCode;
            return ((((((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.captureConfig.hashCode()) * 31) + this.cameraProperties.hashCode()) * 31) + Integer.hashCode(this.torchDurationMs)) * 31) + this.capturedImage.hashCode()) * 31) + Boolean.hashCode(this.holographicTorchEnabled);
        }

        @NotNull
        public String toString() {
            return "HolographicTorchDelay(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", countryCode=" + this.countryCode + ", captureConfig=" + this.captureConfig + ", cameraProperties=" + this.cameraProperties + ", torchDurationMs=" + this.torchDurationMs + ", capturedImage=" + this.capturedImage + ", holographicTorchEnabled=" + this.holographicTorchEnabled + ")";
        }

        @Override // vo.j0
        public void v() {
            super.v();
            Iterator<T> it = this.capturedImage.j3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public HolographicTorchDelay(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @Nullable String str, @NotNull vo.f captureConfig, @NotNull sn.v cameraProperties, int i11, @NotNull n.GovernmentIdImage capturedImage, boolean z10) {
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
            this.backState = j0Var;
            this.countryCode = str;
            this.captureConfig = captureConfig;
            this.cameraProperties = cameraProperties;
            this.torchDurationMs = i11;
            this.capturedImage = capturedImage;
            this.holographicTorchEnabled = z10;
        }
    }

    /* JADX INFO: renamed from: vo.j0$i, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010$\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u0090\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010 J\u001a\u0010-\u001a\u00020\u00142\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u001a\u0010\r\u001a\u00020\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010 R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b?\u0010JR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010)R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0010X\u0090\u0004¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bS\u0010)¨\u0006T"}, d2 = {"Lvo/j0$i;", "Lvo/j0$j;", "Lvo/i3$a;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/f;", "captureConfig", "idForReview", "Lvo/i3;", "parts", BuildConfig.FLAVOR, "partIndex", "Lvo/j0;", "backState", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "error", BuildConfig.FLAVOR, "submittingForAutoClassification", "countryCode", "<init>", "(Lvo/i3$a;Ljava/util/List;Lvo/f;Lvo/n;Ljava/util/List;ILvo/j0;Lsn/v;Ljava/lang/String;ZLjava/lang/String;)V", "newValue", "L", "(Z)Lvo/j0$j;", BuildConfig.FLAVOR, "v", "()V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "M", "(Lvo/i3$a;Ljava/util/List;Lvo/f;Lvo/n;Ljava/util/List;ILvo/j0;Lsn/v;Ljava/lang/String;ZLjava/lang/String;)Lvo/j0$i;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3$a;", "H", "()Lvo/i3$a;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "Lvo/f;", "G", "()Lvo/f;", "e", "Lvo/n;", "J", "()Lvo/n;", "f", "C", "g", "I", "B", "h", "Lvo/j0;", "w", "()Lvo/j0;", "i", "Lsn/v;", "()Lsn/v;", "j", "Ljava/lang/String;", "O", "k", "Z", "P", "()Z", "l", "x", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewCapturedImage extends j {

        @NotNull
        public static final Parcelable.Creator<ReviewCapturedImage> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final vo.f captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n idForReview;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean submittingForAutoClassification;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: vo.j0$i$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewCapturedImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReviewCapturedImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3.SideIdPart sideIdPartCreateFromParcel = i3.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                vo.f fVar = (vo.f) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                n nVar = (n) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()));
                }
                return new ReviewCapturedImage(sideIdPartCreateFromParcel, arrayList, fVar, nVar, arrayList2, parcel.readInt(), (j0) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), (sn.v) parcel.readParcelable(ReviewCapturedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReviewCapturedImage[] newArray(int i10) {
                return new ReviewCapturedImage[i10];
            }
        }

        public /* synthetic */ ReviewCapturedImage(i3.SideIdPart sideIdPart, List list, vo.f fVar, n nVar, List list2, int i10, j0 j0Var, sn.v vVar, String str, boolean z10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, fVar, nVar, list2, i10, j0Var, vVar, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? null : str, (i11 & Barcode.FORMAT_UPC_A) != 0 ? false : z10, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReviewCapturedImage N(ReviewCapturedImage reviewCapturedImage, i3.SideIdPart sideIdPart, List list, vo.f fVar, n nVar, List list2, int i10, j0 j0Var, sn.v vVar, String str, boolean z10, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sideIdPart = reviewCapturedImage.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = reviewCapturedImage.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                fVar = reviewCapturedImage.captureConfig;
            }
            if ((i11 & 8) != 0) {
                nVar = reviewCapturedImage.idForReview;
            }
            if ((i11 & 16) != 0) {
                list2 = reviewCapturedImage.parts;
            }
            if ((i11 & 32) != 0) {
                i10 = reviewCapturedImage.partIndex;
            }
            if ((i11 & 64) != 0) {
                j0Var = reviewCapturedImage.backState;
            }
            if ((i11 & Barcode.FORMAT_ITF) != 0) {
                vVar = reviewCapturedImage.cameraProperties;
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
            sn.v vVar2 = vVar;
            String str4 = str;
            int i12 = i10;
            j0 j0Var2 = j0Var;
            List list3 = list2;
            vo.f fVar2 = fVar;
            return reviewCapturedImage.M(sideIdPart, list, fVar2, nVar, list3, i12, j0Var2, vVar2, str4, z11, str3);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @Override // vo.j0.j
        @NotNull
        /* JADX INFO: renamed from: G, reason: from getter */
        public vo.f getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: H, reason: from getter */
        public i3.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // vo.j0.j
        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public n getIdForReview() {
            return this.idForReview;
        }

        @Override // vo.j0.j
        @NotNull
        public j L(boolean newValue) {
            return N(this, null, null, null, null, null, 0, null, null, null, newValue, null, 1535, null);
        }

        @NotNull
        public final ReviewCapturedImage M(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull vo.f captureConfig, @NotNull n idForReview, @NotNull List<? extends i3> parts, int partIndex, @Nullable j0 backState, @NotNull sn.v cameraProperties, @Nullable String error, boolean submittingForAutoClassification, @Nullable String countryCode) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new ReviewCapturedImage(currentPart, uploadingIds, captureConfig, idForReview, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification, countryCode);
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final String getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: P, reason: from getter */
        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
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

        @Override // vo.j0.j
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            j0 j0Var = this.backState;
            int iHashCode2 = (((iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str = this.error;
            int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.submittingForAutoClassification)) * 31;
            String str2 = this.countryCode;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReviewCapturedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ", countryCode=" + this.countryCode + ")";
        }

        @Override // vo.j0
        public void v() {
            super.v();
            Iterator<T> it = getIdForReview().j3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeParcelable(this.idForReview, flags);
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewCapturedImage(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull vo.f captureConfig, @NotNull n idForReview, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @NotNull sn.v cameraProperties, @Nullable String str, boolean z10, @Nullable String str2) {
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
            this.backState = j0Var;
            this.cameraProperties = cameraProperties;
            this.error = str;
            this.submittingForAutoClassification = z10;
            this.countryCode = str2;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8 X \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lvo/j0$j;", "Lvo/j0;", "<init>", "()V", BuildConfig.FLAVOR, "newValue", "L", "(Z)Lvo/j0$j;", "Lvo/i3$a;", "H", "()Lvo/i3$a;", "currentPart", "Lvo/f;", "G", "()Lvo/f;", "captureConfig", "Lvo/n;", "J", "()Lvo/n;", "idForReview", "Lsn/v;", "f", "()Lsn/v;", "cameraProperties", "Lvo/j0$i;", "Lvo/j0$k;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class j extends j0 {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: G */
        public abstract vo.f getCaptureConfig();

        @NotNull
        /* JADX INFO: renamed from: H */
        public abstract i3.SideIdPart getCurrentPart();

        @NotNull
        /* JADX INFO: renamed from: J */
        public abstract n getIdForReview();

        @NotNull
        public abstract j L(boolean newValue);

        @NotNull
        /* JADX INFO: renamed from: f */
        public abstract sn.v getCameraProperties();

        public j() {
            super(null);
        }
    }

    public /* synthetic */ j0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: B */
    public abstract int getPartIndex();

    @NotNull
    public abstract List<i3> C();

    @NotNull
    public abstract List<n> D();

    public final void F(boolean z10) {
        this.didGoBack = z10;
    }

    @NotNull
    public final j0 u(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this instanceof ReviewCapturedImage) {
            return ReviewCapturedImage.N((ReviewCapturedImage) this, null, null, null, null, null, 0, null, null, error, false, null, 1791, null);
        }
        if (this instanceof ReviewSelectedImage) {
            return ReviewSelectedImage.N((ReviewSelectedImage) this, null, null, null, null, null, null, 0, null, null, error, false, null, 3583, null);
        }
        if (this instanceof ChooseCaptureMethod) {
            return ChooseCaptureMethod.H((ChooseCaptureMethod) this, null, null, null, 0, null, null, false, null, error, 255, null);
        }
        return this instanceof ShowInstructions ? ShowInstructions.H((ShowInstructions) this, null, null, null, null, 0, null, null, error, 127, null) : this;
    }

    public void v() {
        Iterator<T> it = D().iterator();
        while (it.hasNext()) {
            Iterator<T> it2 = ((n) it.next()).j3().iterator();
            while (it2.hasNext()) {
                new File(((Frame) it2.next()).getAbsoluteFilePath()).delete();
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public abstract j0 getBackState();

    @Nullable
    /* JADX INFO: renamed from: x */
    public abstract String getCountryCode();

    @NotNull
    /* JADX INFO: renamed from: y */
    public abstract i3 getCurrentPart();

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    /* JADX INFO: renamed from: vo.j0$k, reason: from toString */
    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000e¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000e¢\u0006\u0004\b%\u0010&J\u009c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b+\u0010!J\u001a\u0010.\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010*R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\bC\u00105\u001a\u0004\bD\u00107R\u001a\u0010\u000f\u001a\u00020\u000e8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0010X\u0090\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b@\u0010NR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bP\u0010*R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bU\u0010A\u001a\u0004\bV\u0010*¨\u0006W"}, d2 = {"Lvo/j0$k;", "Lvo/j0$j;", "Lvo/i3$a;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/f;", "captureConfig", "idForReview", BuildConfig.FLAVOR, "fileName", "Lvo/i3;", "parts", BuildConfig.FLAVOR, "partIndex", "Lvo/j0;", "backState", "Lsn/v;", "cameraProperties", "error", BuildConfig.FLAVOR, "submittingForAutoClassification", "countryCode", "<init>", "(Lvo/i3$a;Ljava/util/List;Lvo/f;Lvo/n;Ljava/lang/String;Ljava/util/List;ILvo/j0;Lsn/v;Ljava/lang/String;ZLjava/lang/String;)V", "newValue", "L", "(Z)Lvo/j0$j;", BuildConfig.FLAVOR, "v", "()V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "M", "(Lvo/i3$a;Ljava/util/List;Lvo/f;Lvo/n;Ljava/lang/String;Ljava/util/List;ILvo/j0;Lsn/v;Ljava/lang/String;ZLjava/lang/String;)Lvo/j0$k;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3$a;", "H", "()Lvo/i3$a;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "Lvo/f;", "G", "()Lvo/f;", "e", "Lvo/n;", "J", "()Lvo/n;", "f", "Ljava/lang/String;", "P", "g", "C", "h", "I", "B", "i", "Lvo/j0;", "w", "()Lvo/j0;", "j", "Lsn/v;", "()Lsn/v;", "k", "O", "l", "Z", "R", "()Z", "m", "x", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewSelectedImage extends j {

        @NotNull
        public static final Parcelable.Creator<ReviewSelectedImage> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final vo.f captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final n idForReview;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String fileName;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean submittingForAutoClassification;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: vo.j0$k$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ReviewSelectedImage> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ReviewSelectedImage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3.SideIdPart sideIdPartCreateFromParcel = i3.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                vo.f fVar = (vo.f) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                n nVar = (n) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader());
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()));
                }
                return new ReviewSelectedImage(sideIdPartCreateFromParcel, arrayList, fVar, nVar, string, arrayList2, parcel.readInt(), (j0) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), (sn.v) parcel.readParcelable(ReviewSelectedImage.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ReviewSelectedImage[] newArray(int i10) {
                return new ReviewSelectedImage[i10];
            }
        }

        public /* synthetic */ ReviewSelectedImage(i3.SideIdPart sideIdPart, List list, vo.f fVar, n nVar, String str, List list2, int i10, j0 j0Var, sn.v vVar, String str2, boolean z10, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, fVar, nVar, str, list2, i10, j0Var, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? new sn.v(null, null, null, 0, 0, 31, null) : vVar, (i11 & Barcode.FORMAT_UPC_A) != 0 ? null : str2, (i11 & Barcode.FORMAT_UPC_E) != 0 ? false : z10, str3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ReviewSelectedImage N(ReviewSelectedImage reviewSelectedImage, i3.SideIdPart sideIdPart, List list, vo.f fVar, n nVar, String str, List list2, int i10, j0 j0Var, sn.v vVar, String str2, boolean z10, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sideIdPart = reviewSelectedImage.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = reviewSelectedImage.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                fVar = reviewSelectedImage.captureConfig;
            }
            if ((i11 & 8) != 0) {
                nVar = reviewSelectedImage.idForReview;
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
            if ((i11 & Barcode.FORMAT_ITF) != 0) {
                j0Var = reviewSelectedImage.backState;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                vVar = reviewSelectedImage.cameraProperties;
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
            sn.v vVar2 = vVar;
            String str5 = str2;
            int i12 = i10;
            j0 j0Var2 = j0Var;
            String str6 = str;
            List list3 = list2;
            return reviewSelectedImage.M(sideIdPart, list, fVar, nVar, str6, list3, i12, j0Var2, vVar2, str5, z11, str4);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @Override // vo.j0.j
        @NotNull
        /* JADX INFO: renamed from: G, reason: from getter */
        public vo.f getCaptureConfig() {
            return this.captureConfig;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: H, reason: from getter */
        public i3.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Override // vo.j0.j
        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public n getIdForReview() {
            return this.idForReview;
        }

        @Override // vo.j0.j
        @NotNull
        public j L(boolean newValue) {
            return N(this, null, null, null, null, null, null, 0, null, null, null, newValue, null, 3071, null);
        }

        @NotNull
        public final ReviewSelectedImage M(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull vo.f captureConfig, @NotNull n idForReview, @Nullable String fileName, @NotNull List<? extends i3> parts, int partIndex, @Nullable j0 backState, @NotNull sn.v cameraProperties, @Nullable String error, boolean submittingForAutoClassification, @Nullable String countryCode) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(idForReview, "idForReview");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new ReviewSelectedImage(currentPart, uploadingIds, captureConfig, idForReview, fileName, parts, partIndex, backState, cameraProperties, error, submittingForAutoClassification, countryCode);
        }

        @Nullable
        /* JADX INFO: renamed from: O, reason: from getter */
        public final String getError() {
            return this.error;
        }

        @Nullable
        /* JADX INFO: renamed from: P, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: R, reason: from getter */
        public boolean getSubmittingForAutoClassification() {
            return this.submittingForAutoClassification;
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

        @Override // vo.j0.j
        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        public int hashCode() {
            int iHashCode = ((((((this.currentPart.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.captureConfig.hashCode()) * 31) + this.idForReview.hashCode()) * 31;
            String str = this.fileName;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            j0 j0Var = this.backState;
            int iHashCode3 = (((iHashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31) + this.cameraProperties.hashCode()) * 31;
            String str2 = this.error;
            int iHashCode4 = (((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.submittingForAutoClassification)) * 31;
            String str3 = this.countryCode;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReviewSelectedImage(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", idForReview=" + this.idForReview + ", fileName=" + this.fileName + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", cameraProperties=" + this.cameraProperties + ", error=" + this.error + ", submittingForAutoClassification=" + this.submittingForAutoClassification + ", countryCode=" + this.countryCode + ")";
        }

        @Override // vo.j0
        public void v() {
            super.v();
            Iterator<T> it = getIdForReview().j3().iterator();
            while (it.hasNext()) {
                new File(((Frame) it.next()).getAbsoluteFilePath()).delete();
            }
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeParcelable(this.idForReview, flags);
            dest.writeString(this.fileName);
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ReviewSelectedImage(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull vo.f captureConfig, @NotNull n idForReview, @Nullable String str, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @NotNull sn.v cameraProperties, @Nullable String str2, boolean z10, @Nullable String str3) {
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
            this.backState = j0Var;
            this.cameraProperties = cameraProperties;
            this.error = str2;
            this.submittingForAutoClassification = z10;
            this.countryCode = str3;
        }
    }

    /* JADX INFO: renamed from: vo.j0$m, reason: from toString */
    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u0092\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u001a\u0010'\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\b\u001a\u00020\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010#R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bE\u0010?\u001a\u0004\bF\u0010#R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b7\u0010IR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lvo/j0$m;", "Lvo/j0;", "Lvo/d3;", "id", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/i3;", "currentPart", "parts", BuildConfig.FLAVOR, "partIndex", "backState", BuildConfig.FLAVOR, "countryCode", "Ldp/c;", "governmentIdRequestArguments", "webRtcObjectId", "Lsn/v;", "cameraProperties", BuildConfig.FLAVOR, "hasSubmitted", "<init>", "(Lvo/d3;Ljava/util/List;Lvo/i3;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ldp/c;Ljava/lang/String;Lsn/v;Z)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "G", "(Lvo/d3;Ljava/util/List;Lvo/i3;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ldp/c;Ljava/lang/String;Lsn/v;Z)Lvo/j0$m;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/d3;", "getId", "()Lvo/d3;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "Lvo/i3;", "y", "()Lvo/i3;", "e", "C", "f", "I", "B", "g", "Lvo/j0;", "w", "()Lvo/j0;", "h", "Ljava/lang/String;", "x", "i", "Ldp/c;", "J", "()Ldp/c;", "j", "M", "k", "Lsn/v;", "()Lsn/v;", "l", "Z", "L", "()Z", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Submit extends j0 {

        @NotNull
        public static final Parcelable.Creator<Submit> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final IdConfig id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final i3 currentPart;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

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
        public final sn.v cameraProperties;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean hasSubmitted;

        /* JADX INFO: renamed from: vo.j0$m$a */
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
                i3 i3Var = (i3) parcel.readParcelable(Submit.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(Submit.class.getClassLoader()));
                }
                return new Submit(idConfigCreateFromParcel, arrayList, i3Var, arrayList2, parcel.readInt(), (j0) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : GovernmentIdRequestArguments.CREATOR.createFromParcel(parcel), parcel.readString(), (sn.v) parcel.readParcelable(Submit.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Submit[] newArray(int i10) {
                return new Submit[i10];
            }
        }

        public /* synthetic */ Submit(IdConfig idConfig, List list, i3 i3Var, List list2, int i10, j0 j0Var, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, sn.v vVar, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(idConfig, list, (i11 & 4) != 0 ? new i3.SideIdPart(IdConfig.e.Front) : i3Var, list2, i10, (i11 & 32) != 0 ? null : j0Var, str, (i11 & Barcode.FORMAT_ITF) != 0 ? null : governmentIdRequestArguments, str2, vVar, (i11 & Barcode.FORMAT_UPC_E) != 0 ? false : z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Submit H(Submit submit, IdConfig idConfig, List list, i3 i3Var, List list2, int i10, j0 j0Var, String str, GovernmentIdRequestArguments governmentIdRequestArguments, String str2, sn.v vVar, boolean z10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                idConfig = submit.id;
            }
            if ((i11 & 2) != 0) {
                list = submit.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                i3Var = submit.currentPart;
            }
            if ((i11 & 8) != 0) {
                list2 = submit.parts;
            }
            if ((i11 & 16) != 0) {
                i10 = submit.partIndex;
            }
            if ((i11 & 32) != 0) {
                j0Var = submit.backState;
            }
            if ((i11 & 64) != 0) {
                str = submit.countryCode;
            }
            if ((i11 & Barcode.FORMAT_ITF) != 0) {
                governmentIdRequestArguments = submit.governmentIdRequestArguments;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                str2 = submit.webRtcObjectId;
            }
            if ((i11 & Barcode.FORMAT_UPC_A) != 0) {
                vVar = submit.cameraProperties;
            }
            if ((i11 & Barcode.FORMAT_UPC_E) != 0) {
                z10 = submit.hasSubmitted;
            }
            sn.v vVar2 = vVar;
            boolean z11 = z10;
            GovernmentIdRequestArguments governmentIdRequestArguments2 = governmentIdRequestArguments;
            String str3 = str2;
            j0 j0Var2 = j0Var;
            String str4 = str;
            int i12 = i10;
            i3 i3Var2 = i3Var;
            return submit.G(idConfig, list, i3Var2, list2, i12, j0Var2, str4, governmentIdRequestArguments2, str3, vVar2, z11);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        public final Submit G(@NotNull IdConfig id2, @NotNull List<? extends n> uploadingIds, @NotNull i3 currentPart, @NotNull List<? extends i3> parts, int partIndex, @Nullable j0 backState, @Nullable String countryCode, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String webRtcObjectId, @NotNull sn.v cameraProperties, boolean hasSubmitted) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(cameraProperties, "cameraProperties");
            return new Submit(id2, uploadingIds, currentPart, parts, partIndex, backState, countryCode, governmentIdRequestArguments, webRtcObjectId, cameraProperties, hasSubmitted);
        }

        @Nullable
        /* JADX INFO: renamed from: J, reason: from getter */
        public final GovernmentIdRequestArguments getGovernmentIdRequestArguments() {
            return this.governmentIdRequestArguments;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final boolean getHasSubmitted() {
            return this.hasSubmitted;
        }

        @Nullable
        /* JADX INFO: renamed from: M, reason: from getter */
        public final String getWebRtcObjectId() {
            return this.webRtcObjectId;
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

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final sn.v getCameraProperties() {
            return this.cameraProperties;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.id.hashCode() * 31) + this.uploadingIds.hashCode()) * 31) + this.currentPart.hashCode()) * 31) + this.parts.hashCode()) * 31) + Integer.hashCode(this.partIndex)) * 31;
            j0 j0Var = this.backState;
            int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.id.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.currentPart, flags);
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public i3 getCurrentPart() {
            return this.currentPart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Submit(@NotNull IdConfig id2, @NotNull List<? extends n> uploadingIds, @NotNull i3 currentPart, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @Nullable String str, @Nullable GovernmentIdRequestArguments governmentIdRequestArguments, @Nullable String str2, @NotNull sn.v cameraProperties, boolean z10) {
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
            this.backState = j0Var;
            this.countryCode = str;
            this.governmentIdRequestArguments = governmentIdRequestArguments;
            this.webRtcObjectId = str2;
            this.cameraProperties = cameraProperties;
            this.hasSubmitted = z10;
        }
    }

    /* JADX INFO: renamed from: vo.j0$n, reason: from toString */
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B§\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u0018H\u0016¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\u000f¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-JÄ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b2\u0010(J\u001a\u00105\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\bG\u0010<\u001a\u0004\bH\u0010>R\u001a\u0010\u0010\u001a\u00020\u000f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u00101R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010\u001a\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\b`\u0010^R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0010X\u0090\u0004¢\u0006\f\n\u0004\ba\u0010U\u001a\u0004\bb\u00101R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u0010l\u001a\u0004\bi\u0010j¨\u0006m"}, d2 = {"Lvo/j0$n;", "Lvo/j0;", "Lvo/e;", "Lvo/b;", "Lvo/i3$a;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/f;", "captureConfig", "Lvo/y3$b$a;", "manualCapture", "Lvo/i3;", "parts", BuildConfig.FLAVOR, "partIndex", "backState", "Lip/x;", "webRtcState", BuildConfig.FLAVOR, "webRtcJwt", BuildConfig.FLAVOR, "error", BuildConfig.FLAVOR, "checkCameraPermissions", "checkAudioPermissions", "countryCode", "Lcp/d;", "hint", "Lkotlin/Function0;", BuildConfig.FLAVOR, "webRtcConnectionEstablished", "<init>", "(Lvo/i3$a;Ljava/util/List;Lvo/f;Lvo/y3$b$a;Ljava/util/List;ILvo/j0;Lip/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcp/d;Lkotlin/jvm/functions/Function0;)V", "newValue", "r", "(Z)Lvo/j0;", "q", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "(Lvo/i3$a;Ljava/util/List;Lvo/f;Lvo/y3$b$a;Ljava/util/List;ILvo/j0;Lip/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcp/d;Lkotlin/jvm/functions/Function0;)Lvo/j0$n;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3$a;", "P", "()Lvo/i3$a;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "Lvo/f;", "M", "()Lvo/f;", "e", "Lvo/y3$b$a;", "T", "()Lvo/y3$b$a;", "f", "C", "g", "I", "B", "h", "Lvo/j0;", "w", "()Lvo/j0;", "i", "Lip/x;", "W", "()Lip/x;", "j", "Ljava/lang/String;", "V", "k", "Ljava/lang/Throwable;", "R", "()Ljava/lang/Throwable;", "l", "Z", "O", "()Z", "m", "N", "n", "x", "o", "Lcp/d;", "S", "()Lcp/d;", "p", "Lkotlin/jvm/functions/Function0;", "U", "()Lkotlin/jvm/functions/Function0;", "getWebRtcConnectionEstablished$annotations", "()V", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitForAutocapture extends j0 implements e, b {

        @NotNull
        public static final Parcelable.Creator<WaitForAutocapture> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final vo.f captureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final y3.b.a manualCapture;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final ip.x webRtcState;

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
        public final cp.d hint;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final Function0<Unit> webRtcConnectionEstablished;

        /* JADX INFO: renamed from: vo.j0$n$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WaitForAutocapture> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WaitForAutocapture createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3.SideIdPart sideIdPartCreateFromParcel = i3.SideIdPart.CREATOR.createFromParcel(parcel);
                int i10 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                vo.f fVar = (vo.f) parcel.readParcelable(WaitForAutocapture.class.getClassLoader());
                y3.b.a aVarValueOf = y3.b.a.valueOf(parcel.readString());
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(parcel.readParcelable(WaitForAutocapture.class.getClassLoader()));
                }
                return new WaitForAutocapture(sideIdPartCreateFromParcel, arrayList, fVar, aVarValueOf, arrayList2, parcel.readInt(), (j0) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), parcel.readInt() == 0 ? null : ip.x.valueOf(parcel.readString()), parcel.readString(), (Throwable) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (cp.d) parcel.readParcelable(WaitForAutocapture.class.getClassLoader()), null, 16384, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WaitForAutocapture[] newArray(int i10) {
                return new WaitForAutocapture[i10];
            }
        }

        public /* synthetic */ WaitForAutocapture(i3.SideIdPart sideIdPart, List list, vo.f fVar, y3.b.a aVar, List list2, int i10, j0 j0Var, ip.x xVar, String str, Throwable th2, boolean z10, boolean z11, String str2, cp.d dVar, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(sideIdPart, list, fVar, aVar, list2, i10, j0Var, xVar, str, (i11 & Barcode.FORMAT_UPC_A) != 0 ? null : th2, (i11 & Barcode.FORMAT_UPC_E) != 0 ? true : z10, (i11 & Barcode.FORMAT_PDF417) != 0 ? true : z11, str2, (i11 & 8192) != 0 ? null : dVar, (i11 & 16384) != 0 ? new Function0() { // from class: vo.k0
                @Override // p001kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return j0.WaitForAutocapture.H();
                }
            } : function0);
        }

        public static final Unit H() {
            return Unit.f21506a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WaitForAutocapture L(WaitForAutocapture waitForAutocapture, i3.SideIdPart sideIdPart, List list, vo.f fVar, y3.b.a aVar, List list2, int i10, j0 j0Var, ip.x xVar, String str, Throwable th2, boolean z10, boolean z11, String str2, cp.d dVar, Function0 function0, int i11, Object obj) {
            return waitForAutocapture.J((i11 & 1) != 0 ? waitForAutocapture.currentPart : sideIdPart, (i11 & 2) != 0 ? waitForAutocapture.uploadingIds : list, (i11 & 4) != 0 ? waitForAutocapture.captureConfig : fVar, (i11 & 8) != 0 ? waitForAutocapture.manualCapture : aVar, (i11 & 16) != 0 ? waitForAutocapture.parts : list2, (i11 & 32) != 0 ? waitForAutocapture.partIndex : i10, (i11 & 64) != 0 ? waitForAutocapture.backState : j0Var, (i11 & Barcode.FORMAT_ITF) != 0 ? waitForAutocapture.webRtcState : xVar, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? waitForAutocapture.webRtcJwt : str, (i11 & Barcode.FORMAT_UPC_A) != 0 ? waitForAutocapture.error : th2, (i11 & Barcode.FORMAT_UPC_E) != 0 ? waitForAutocapture.checkCameraPermissions : z10, (i11 & Barcode.FORMAT_PDF417) != 0 ? waitForAutocapture.checkAudioPermissions : z11, (i11 & Barcode.FORMAT_AZTEC) != 0 ? waitForAutocapture.countryCode : str2, (i11 & 8192) != 0 ? waitForAutocapture.hint : dVar, (i11 & 16384) != 0 ? waitForAutocapture.webRtcConnectionEstablished : function0);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        public final WaitForAutocapture J(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull vo.f captureConfig, @NotNull y3.b.a manualCapture, @NotNull List<? extends i3> parts, int partIndex, @Nullable j0 backState, @Nullable ip.x webRtcState, @Nullable String webRtcJwt, @Nullable Throwable error, boolean checkCameraPermissions, boolean checkAudioPermissions, @Nullable String countryCode, @Nullable cp.d hint, @NotNull Function0<Unit> webRtcConnectionEstablished) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            Intrinsics.checkNotNullParameter(manualCapture, "manualCapture");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(webRtcConnectionEstablished, "webRtcConnectionEstablished");
            return new WaitForAutocapture(currentPart, uploadingIds, captureConfig, manualCapture, parts, partIndex, backState, webRtcState, webRtcJwt, error, checkCameraPermissions, checkAudioPermissions, countryCode, hint, webRtcConnectionEstablished);
        }

        @NotNull
        /* JADX INFO: renamed from: M, reason: from getter */
        public final vo.f getCaptureConfig() {
            return this.captureConfig;
        }

        /* JADX INFO: renamed from: N, reason: from getter */
        public boolean getCheckAudioPermissions() {
            return this.checkAudioPermissions;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public boolean getCheckCameraPermissions() {
            return this.checkCameraPermissions;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: P, reason: from getter */
        public i3.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Nullable
        /* JADX INFO: renamed from: R, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        @Nullable
        /* JADX INFO: renamed from: S, reason: from getter */
        public final cp.d getHint() {
            return this.hint;
        }

        @NotNull
        /* JADX INFO: renamed from: T, reason: from getter */
        public final y3.b.a getManualCapture() {
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
        public final ip.x getWebRtcState() {
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
            j0 j0Var = this.backState;
            int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            ip.x xVar = this.webRtcState;
            int iHashCode3 = (iHashCode2 + (xVar == null ? 0 : xVar.hashCode())) * 31;
            String str = this.webRtcJwt;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th2 = this.error;
            int iHashCode5 = (((((iHashCode4 + (th2 == null ? 0 : th2.hashCode())) * 31) + Boolean.hashCode(this.checkCameraPermissions)) * 31) + Boolean.hashCode(this.checkAudioPermissions)) * 31;
            String str2 = this.countryCode;
            int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            cp.d dVar = this.hint;
            return ((iHashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31) + this.webRtcConnectionEstablished.hashCode();
        }

        @Override // vo.b
        @NotNull
        public j0 q(boolean newValue) {
            return L(this, null, null, null, null, null, 0, null, null, null, null, false, newValue, null, null, null, 30719, null);
        }

        @Override // vo.e
        @NotNull
        public j0 r(boolean newValue) {
            return L(this, null, null, null, null, null, 0, null, null, null, null, newValue, false, null, null, null, 31743, null);
        }

        @NotNull
        public String toString() {
            return "WaitForAutocapture(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", captureConfig=" + this.captureConfig + ", manualCapture=" + this.manualCapture + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", backState=" + this.backState + ", webRtcState=" + this.webRtcState + ", webRtcJwt=" + this.webRtcJwt + ", error=" + this.error + ", checkCameraPermissions=" + this.checkCameraPermissions + ", checkAudioPermissions=" + this.checkAudioPermissions + ", countryCode=" + this.countryCode + ", hint=" + this.hint + ", webRtcConnectionEstablished=" + this.webRtcConnectionEstablished + ")";
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeParcelable(this.captureConfig, flags);
            dest.writeString(this.manualCapture.name());
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeParcelable(it2.next(), flags);
            }
            dest.writeInt(this.partIndex);
            dest.writeParcelable(this.backState, flags);
            ip.x xVar = this.webRtcState;
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WaitForAutocapture(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull vo.f captureConfig, @NotNull y3.b.a manualCapture, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @Nullable ip.x xVar, @Nullable String str, @Nullable Throwable th2, boolean z10, boolean z11, @Nullable String str2, @Nullable cp.d dVar, @NotNull Function0<Unit> webRtcConnectionEstablished) {
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
            this.backState = j0Var;
            this.webRtcState = xVar;
            this.webRtcJwt = str;
            this.error = th2;
            this.checkCameraPermissions = z10;
            this.checkAudioPermissions = z11;
            this.countryCode = str2;
            this.hint = dVar;
            this.webRtcConnectionEstablished = webRtcConnectionEstablished;
        }
    }

    public j0() {
    }

    /* JADX INFO: renamed from: vo.j0$a, reason: from toString */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bD\u0010/\u001a\u0004\bE\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bH\u0010<\u001a\u0004\bI\u0010#R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lvo/j0$a;", "Lvo/j0;", "Lvo/i3$a;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/i3;", "parts", BuildConfig.FLAVOR, "partIndex", "backState", BuildConfig.FLAVOR, "countryCode", "Lvo/m;", "captureFrames", "Lsn/v;", "cameraProperties", "Lvo/f3;", "idConfigsForCountry", "selectedCountryCode", "selectedIdClass", "Lvo/c;", "errorType", "<init>", "(Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ljava/util/List;Lsn/v;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lvo/c;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3$a;", "H", "()Lvo/i3$a;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "C", "e", "I", "B", "f", "Lvo/j0;", "w", "()Lvo/j0;", "g", "Ljava/lang/String;", "x", "h", "G", "i", "Lsn/v;", "getCameraProperties", "()Lsn/v;", "j", "L", "k", "getSelectedCountryCode", "l", "getSelectedIdClass", "m", "Lvo/c;", "J", "()Lvo/c;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoClassificationError extends j0 {

        @NotNull
        public static final Parcelable.Creator<AutoClassificationError> CREATOR = new C0714a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<Frame> captureFrames;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final sn.v cameraProperties;

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
        public final c errorType;

        /* JADX INFO: renamed from: vo.j0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0714a implements Parcelable.Creator<AutoClassificationError> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3.SideIdPart sideIdPartCreateFromParcel = i3.SideIdPart.CREATOR.createFromParcel(parcel);
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
                j0 j0Var = (j0) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                String string = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList3.add(Frame.CREATOR.createFromParcel(parcel));
                }
                sn.v vVar = (sn.v) parcel.readParcelable(AutoClassificationError.class.getClassLoader());
                int i17 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList4.add(IdConfigForCountry.CREATOR.createFromParcel(parcel));
                }
                return new AutoClassificationError(sideIdPartCreateFromParcel, arrayList, arrayList2, i14, j0Var, string, arrayList3, vVar, arrayList4, parcel.readString(), parcel.readString(), c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AutoClassificationError[] newArray(int i10) {
                return new AutoClassificationError[i10];
            }
        }

        public /* synthetic */ AutoClassificationError(i3.SideIdPart sideIdPart, List list, List list2, int i10, j0 j0Var, String str, List list3, sn.v vVar, List list4, String str2, String str3, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new i3.SideIdPart(IdConfig.e.Front) : sideIdPart, (i11 & 2) != 0 ? p001kotlin.collections.p.k() : list, list2, i10, j0Var, str, list3, vVar, list4, (i11 & Barcode.FORMAT_UPC_A) != 0 ? null : str2, (i11 & Barcode.FORMAT_UPC_E) != 0 ? null : str3, cVar);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        public final List<Frame> G() {
            return this.captureFrames;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: H, reason: from getter */
        public i3.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final c getErrorType() {
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
            j0 j0Var = this.backState;
            int iHashCode2 = (iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AutoClassificationError(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, int i10, @Nullable j0 j0Var, @Nullable String str, @NotNull List<Frame> captureFrames, @NotNull sn.v cameraProperties, @NotNull List<IdConfigForCountry> idConfigsForCountry, @Nullable String str2, @Nullable String str3, @NotNull c errorType) {
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
            this.backState = j0Var;
            this.countryCode = str;
            this.captureFrames = captureFrames;
            this.cameraProperties = cameraProperties;
            this.idConfigsForCountry = idConfigsForCountry;
            this.selectedCountryCode = str2;
            this.selectedIdClass = str3;
            this.errorType = errorType;
        }
    }

    /* JADX INFO: renamed from: vo.j0$c, reason: from toString */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ|\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u001a\u0010$\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u0010 ¨\u0006D"}, d2 = {"Lvo/j0$c;", "Lvo/j0;", "Lvo/i3$a;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "Lvo/i3;", "parts", BuildConfig.FLAVOR, "partIndex", BuildConfig.FLAVOR, "countryCode", "Lvo/f;", "captureConfig", BuildConfig.FLAVOR, "choosingDocumentToUpload", "backState", "error", "<init>", "(Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lvo/f;ZLvo/j0;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "G", "(Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lvo/f;ZLvo/j0;Ljava/lang/String;)Lvo/j0$c;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3$a;", "M", "()Lvo/i3$a;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "C", "e", "I", "B", "f", "Ljava/lang/String;", "x", "g", "Lvo/f;", "J", "()Lvo/f;", "h", "Z", "L", "()Z", "i", "Lvo/j0;", "w", "()Lvo/j0;", "j", "N", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseCaptureMethod extends j0 {

        @NotNull
        public static final Parcelable.Creator<ChooseCaptureMethod> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3.SideIdPart currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public final int partIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String countryCode;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final vo.f captureConfig;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean choosingDocumentToUpload;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String error;

        /* JADX INFO: renamed from: vo.j0$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ChooseCaptureMethod> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChooseCaptureMethod createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3.SideIdPart sideIdPartCreateFromParcel = i3.SideIdPart.CREATOR.createFromParcel(parcel);
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
                return new ChooseCaptureMethod(sideIdPartCreateFromParcel, arrayList, arrayList2, parcel.readInt(), parcel.readString(), (vo.f) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readInt() != 0, (j0) parcel.readParcelable(ChooseCaptureMethod.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ChooseCaptureMethod[] newArray(int i10) {
                return new ChooseCaptureMethod[i10];
            }
        }

        public /* synthetic */ ChooseCaptureMethod(i3.SideIdPart sideIdPart, List list, List list2, int i10, String str, vo.f fVar, boolean z10, j0 j0Var, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new i3.SideIdPart(IdConfig.e.Front) : sideIdPart, (i11 & 2) != 0 ? p001kotlin.collections.p.k() : list, list2, i10, str, fVar, (i11 & 64) != 0 ? false : z10, j0Var, (i11 & Barcode.FORMAT_QR_CODE) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ChooseCaptureMethod H(ChooseCaptureMethod chooseCaptureMethod, i3.SideIdPart sideIdPart, List list, List list2, int i10, String str, vo.f fVar, boolean z10, j0 j0Var, String str2, int i11, Object obj) {
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
                fVar = chooseCaptureMethod.captureConfig;
            }
            if ((i11 & 64) != 0) {
                z10 = chooseCaptureMethod.choosingDocumentToUpload;
            }
            if ((i11 & Barcode.FORMAT_ITF) != 0) {
                j0Var = chooseCaptureMethod.backState;
            }
            if ((i11 & Barcode.FORMAT_QR_CODE) != 0) {
                str2 = chooseCaptureMethod.error;
            }
            j0 j0Var2 = j0Var;
            String str3 = str2;
            vo.f fVar2 = fVar;
            boolean z11 = z10;
            String str4 = str;
            List list3 = list2;
            return chooseCaptureMethod.G(sideIdPart, list, list3, i10, str4, fVar2, z11, j0Var2, str3);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        public final ChooseCaptureMethod G(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, int partIndex, @Nullable String countryCode, @NotNull vo.f captureConfig, boolean choosingDocumentToUpload, @Nullable j0 backState, @Nullable String error) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            Intrinsics.checkNotNullParameter(captureConfig, "captureConfig");
            return new ChooseCaptureMethod(currentPart, uploadingIds, parts, partIndex, countryCode, captureConfig, choosingDocumentToUpload, backState, error);
        }

        @NotNull
        /* JADX INFO: renamed from: J, reason: from getter */
        public final vo.f getCaptureConfig() {
            return this.captureConfig;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final boolean getChoosingDocumentToUpload() {
            return this.choosingDocumentToUpload;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: M, reason: from getter */
        public i3.SideIdPart getCurrentPart() {
            return this.currentPart;
        }

        @Nullable
        /* JADX INFO: renamed from: N, reason: from getter */
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
            j0 j0Var = this.backState;
            int iHashCode3 = (iHashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            String str2 = this.error;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ChooseCaptureMethod(currentPart=" + this.currentPart + ", uploadingIds=" + this.uploadingIds + ", parts=" + this.parts + ", partIndex=" + this.partIndex + ", countryCode=" + this.countryCode + ", captureConfig=" + this.captureConfig + ", choosingDocumentToUpload=" + this.choosingDocumentToUpload + ", backState=" + this.backState + ", error=" + this.error + ")";
        }

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.currentPart.writeToParcel(dest, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChooseCaptureMethod(@NotNull i3.SideIdPart currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, int i10, @Nullable String str, @NotNull vo.f captureConfig, boolean z10, @Nullable j0 j0Var, @Nullable String str2) {
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
            this.backState = j0Var;
            this.error = str2;
        }
    }

    /* JADX INFO: renamed from: vo.j0$h, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b:\u00104\u001a\u0004\b;\u0010\u001b¨\u0006<"}, d2 = {"Lvo/j0$h;", "Lvo/j0;", "Lvo/i3;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "parts", "backState", BuildConfig.FLAVOR, "partIndex", BuildConfig.FLAVOR, "countryCode", "Lvo/d3;", "selectedId", "error", "<init>", "(Lvo/i3;Ljava/util/List;Ljava/util/List;Lvo/j0;ILjava/lang/String;Lvo/d3;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3;", "y", "()Lvo/i3;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "C", "e", "Lvo/j0;", "w", "()Lvo/j0;", "f", "I", "B", "g", "Ljava/lang/String;", "x", "h", "Lvo/d3;", "getSelectedId", "()Lvo/d3;", "i", "getError", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestartStep extends j0 {

        @NotNull
        public static final Parcelable.Creator<RestartStep> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3 currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

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

        /* JADX INFO: renamed from: vo.j0$h$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RestartStep> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RestartStep createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3 i3Var = (i3) parcel.readParcelable(RestartStep.class.getClassLoader());
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
                return new RestartStep(i3Var, arrayList, arrayList2, (j0) parcel.readParcelable(RestartStep.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RestartStep[] newArray(int i10) {
                return new RestartStep[i10];
            }
        }

        public /* synthetic */ RestartStep(i3 i3Var, List list, List list2, j0 j0Var, int i10, String str, IdConfig idConfig, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new i3.SideIdPart(IdConfig.e.Front) : i3Var, (i11 & 2) != 0 ? p001kotlin.collections.p.k() : list, (i11 & 4) != 0 ? p001kotlin.collections.p.k() : list2, (i11 & 8) != 0 ? null : j0Var, (i11 & 16) != 0 ? -1 : i10, str, (i11 & 64) != 0 ? null : idConfig, (i11 & Barcode.FORMAT_ITF) != 0 ? null : str2);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
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
            j0 j0Var = this.backState;
            int iHashCode2 = (((iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31) + Integer.hashCode(this.partIndex)) * 31;
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public i3 getCurrentPart() {
            return this.currentPart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RestartStep(@NotNull i3 currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, @Nullable j0 j0Var, int i10, @Nullable String str, @Nullable IdConfig idConfig, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.backState = j0Var;
            this.partIndex = i10;
            this.countryCode = str;
            this.selectedId = idConfig;
            this.error = str2;
        }
    }

    /* JADX INFO: renamed from: vo.j0$l, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019Jt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00018\u0010X\u0090\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010\u001d¨\u0006>"}, d2 = {"Lvo/j0$l;", "Lvo/j0;", "Lvo/i3;", "currentPart", BuildConfig.FLAVOR, "Lvo/n;", "uploadingIds", "parts", "backState", BuildConfig.FLAVOR, "partIndex", BuildConfig.FLAVOR, "countryCode", "Lvo/d3;", "selectedId", "error", "<init>", "(Lvo/i3;Ljava/util/List;Ljava/util/List;Lvo/j0;ILjava/lang/String;Lvo/d3;Ljava/lang/String;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "G", "(Lvo/i3;Ljava/util/List;Ljava/util/List;Lvo/j0;ILjava/lang/String;Lvo/d3;Ljava/lang/String;)Lvo/j0$l;", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "b", "Lvo/i3;", "y", "()Lvo/i3;", "c", "Ljava/util/List;", "D", "()Ljava/util/List;", "d", "C", "e", "Lvo/j0;", "w", "()Lvo/j0;", "f", "I", "B", "g", "Ljava/lang/String;", "x", "h", "Lvo/d3;", "getSelectedId", "()Lvo/d3;", "i", "J", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowInstructions extends j0 {

        @NotNull
        public static final Parcelable.Creator<ShowInstructions> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final i3 currentPart;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<n> uploadingIds;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final List<i3> parts;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final j0 backState;

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

        /* JADX INFO: renamed from: vo.j0$l$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowInstructions> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i3 i3Var = (i3) parcel.readParcelable(ShowInstructions.class.getClassLoader());
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
                return new ShowInstructions(i3Var, arrayList, arrayList2, (j0) parcel.readParcelable(ShowInstructions.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : IdConfig.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowInstructions[] newArray(int i10) {
                return new ShowInstructions[i10];
            }
        }

        public /* synthetic */ ShowInstructions(i3 i3Var, List list, List list2, j0 j0Var, int i10, String str, IdConfig idConfig, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? new i3.SideIdPart(IdConfig.e.Front) : i3Var, (i11 & 2) != 0 ? p001kotlin.collections.p.k() : list, (i11 & 4) != 0 ? p001kotlin.collections.p.k() : list2, (i11 & 8) != 0 ? null : j0Var, (i11 & 16) != 0 ? -1 : i10, str, (i11 & 64) != 0 ? null : idConfig, (i11 & Barcode.FORMAT_ITF) != 0 ? null : str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ShowInstructions H(ShowInstructions showInstructions, i3 i3Var, List list, List list2, j0 j0Var, int i10, String str, IdConfig idConfig, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i3Var = showInstructions.currentPart;
            }
            if ((i11 & 2) != 0) {
                list = showInstructions.uploadingIds;
            }
            if ((i11 & 4) != 0) {
                list2 = showInstructions.parts;
            }
            if ((i11 & 8) != 0) {
                j0Var = showInstructions.backState;
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
            if ((i11 & Barcode.FORMAT_ITF) != 0) {
                str2 = showInstructions.error;
            }
            IdConfig idConfig2 = idConfig;
            String str3 = str2;
            int i12 = i10;
            String str4 = str;
            return showInstructions.G(i3Var, list, list2, j0Var, i12, str4, idConfig2, str3);
        }

        @Override // vo.j0
        /* JADX INFO: renamed from: B, reason: from getter */
        public int getPartIndex() {
            return this.partIndex;
        }

        @Override // vo.j0
        @NotNull
        public List<i3> C() {
            return this.parts;
        }

        @Override // vo.j0
        @NotNull
        public List<n> D() {
            return this.uploadingIds;
        }

        @NotNull
        public final ShowInstructions G(@NotNull i3 currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, @Nullable j0 backState, int partIndex, @Nullable String countryCode, @Nullable IdConfig selectedId, @Nullable String error) {
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            return new ShowInstructions(currentPart, uploadingIds, parts, backState, partIndex, countryCode, selectedId, error);
        }

        @Nullable
        /* JADX INFO: renamed from: J, reason: from getter */
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
            j0 j0Var = this.backState;
            int iHashCode2 = (((iHashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31) + Integer.hashCode(this.partIndex)) * 31;
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: w, reason: from getter */
        public j0 getBackState() {
            return this.backState;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.currentPart, flags);
            List<n> list = this.uploadingIds;
            dest.writeInt(list.size());
            Iterator<n> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            List<i3> list2 = this.parts;
            dest.writeInt(list2.size());
            Iterator<i3> it2 = list2.iterator();
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

        @Override // vo.j0
        @Nullable
        /* JADX INFO: renamed from: x, reason: from getter */
        public String getCountryCode() {
            return this.countryCode;
        }

        @Override // vo.j0
        @NotNull
        /* JADX INFO: renamed from: y, reason: from getter */
        public i3 getCurrentPart() {
            return this.currentPart;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ShowInstructions(@NotNull i3 currentPart, @NotNull List<? extends n> uploadingIds, @NotNull List<? extends i3> parts, @Nullable j0 j0Var, int i10, @Nullable String str, @Nullable IdConfig idConfig, @Nullable String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(currentPart, "currentPart");
            Intrinsics.checkNotNullParameter(uploadingIds, "uploadingIds");
            Intrinsics.checkNotNullParameter(parts, "parts");
            this.currentPart = currentPart;
            this.uploadingIds = uploadingIds;
            this.parts = parts;
            this.backState = j0Var;
            this.partIndex = i10;
            this.countryCode = str;
            this.selectedId = idConfig;
            this.error = str2;
        }
    }
}
