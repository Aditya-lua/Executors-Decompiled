package com.withpersona.sdk2.inquiry.network.dto.government_id;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.RemoteImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0007&'()*+,B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006-"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig;", "Landroid/os/Parcelable;", "side", "", "manualCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "autoCaptureConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "overlay", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;)V", "getSide", "()Ljava/lang/String;", "getManualCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "getAutoCaptureConfig", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ManualCaptureConfig", "AutoCaptureConfig", "RuleSet", "Rule", "OverlayConfig", "RuleType", "OverlayLocalIcon", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final /* data */ class CapturePageConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CapturePageConfig> CREATOR = new Creator();

    @Nullable
    private final AutoCaptureConfig autoCaptureConfig;

    @Nullable
    private final ManualCaptureConfig manualCaptureConfig;

    @Nullable
    private final OverlayConfig overlay;

    @Nullable
    private final String side;

    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$AutoCaptureConfig;", "Landroid/os/Parcelable;", "ruleSets", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "<init>", "(Ljava/util/List;)V", "getRuleSets", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class AutoCaptureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AutoCaptureConfig> CREATOR = new Creator();

        @Nullable
        private final List<RuleSet> ruleSets;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<AutoCaptureConfig> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoCaptureConfig createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i10 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList2.add(RuleSet.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new AutoCaptureConfig(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AutoCaptureConfig[] newArray(int i10) {
                return new AutoCaptureConfig[i10];
            }
        }

        public AutoCaptureConfig(@Nullable List<RuleSet> list) {
            this.ruleSets = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig$AutoCaptureConfig */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ AutoCaptureConfig copy$default(AutoCaptureConfig autoCaptureConfig, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = autoCaptureConfig.ruleSets;
            }
            return autoCaptureConfig.copy(list);
        }

        @Nullable
        public final List<RuleSet> component1() {
            return this.ruleSets;
        }

        @NotNull
        public final AutoCaptureConfig copy(@Nullable List<RuleSet> ruleSets) {
            return new AutoCaptureConfig(ruleSets);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutoCaptureConfig) && Intrinsics.m31980c(this.ruleSets, ((AutoCaptureConfig) other).ruleSets);
        }

        @Nullable
        public final List<RuleSet> getRuleSets() {
            return this.ruleSets;
        }

        public int hashCode() {
            List<RuleSet> list = this.ruleSets;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "AutoCaptureConfig(ruleSets=" + this.ruleSets + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<RuleSet> list = this.ruleSets;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<RuleSet> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Creator implements Parcelable.Creator<CapturePageConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CapturePageConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CapturePageConfig(parcel.readString(), parcel.readInt() == 0 ? null : ManualCaptureConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AutoCaptureConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlayConfig.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CapturePageConfig[] newArray(int i10) {
            return new CapturePageConfig[i10];
        }
    }

    @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "Landroid/os/Parcelable;", "isEnabled", "", "delayMs", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDelayMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$ManualCaptureConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class ManualCaptureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ManualCaptureConfig> CREATOR = new Creator();

        @Nullable
        private final Long delayMs;

        @Nullable
        private final Boolean isEnabled;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<ManualCaptureConfig> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManualCaptureConfig createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ManualCaptureConfig(boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ManualCaptureConfig[] newArray(int i10) {
                return new ManualCaptureConfig[i10];
            }
        }

        public ManualCaptureConfig(@Nullable Boolean bool, @Nullable Long l10) {
            this.isEnabled = bool;
            this.delayMs = l10;
        }

        public static /* synthetic */ ManualCaptureConfig copy$default(ManualCaptureConfig manualCaptureConfig, Boolean bool, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = manualCaptureConfig.isEnabled;
            }
            if ((i10 & 2) != 0) {
                l10 = manualCaptureConfig.delayMs;
            }
            return manualCaptureConfig.copy(bool, l10);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getDelayMs() {
            return this.delayMs;
        }

        @NotNull
        public final ManualCaptureConfig copy(@Nullable Boolean isEnabled, @Nullable Long delayMs) {
            return new ManualCaptureConfig(isEnabled, delayMs);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualCaptureConfig)) {
                return false;
            }
            ManualCaptureConfig manualCaptureConfig = (ManualCaptureConfig) other;
            return Intrinsics.m31980c(this.isEnabled, manualCaptureConfig.isEnabled) && Intrinsics.m31980c(this.delayMs, manualCaptureConfig.delayMs);
        }

        @Nullable
        public final Long getDelayMs() {
            return this.delayMs;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.delayMs;
            return iHashCode + (l10 != null ? l10.hashCode() : 0);
        }

        @Nullable
        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "ManualCaptureConfig(isEnabled=" + this.isEnabled + ", delayMs=" + this.delayMs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Boolean bool = this.isEnabled;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Long l10 = this.delayMs;
            if (l10 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l10.longValue());
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayConfig;", "Landroid/os/Parcelable;", "overlay", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "overlayFallback", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;)V", "getOverlay", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;", "getOverlayFallback", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class OverlayConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OverlayConfig> CREATOR = new Creator();

        @Nullable
        private final RemoteImage overlay;

        @Nullable
        private final OverlayLocalIcon overlayFallback;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<OverlayConfig> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OverlayConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OverlayConfig(parcel.readInt() == 0 ? null : RemoteImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OverlayLocalIcon.valueOf(parcel.readString()) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OverlayConfig[] newArray(int i10) {
                return new OverlayConfig[i10];
            }
        }

        public OverlayConfig(@Nullable RemoteImage remoteImage, @Nullable OverlayLocalIcon overlayLocalIcon) {
            this.overlay = remoteImage;
            this.overlayFallback = overlayLocalIcon;
        }

        public static /* synthetic */ OverlayConfig copy$default(OverlayConfig overlayConfig, RemoteImage remoteImage, OverlayLocalIcon overlayLocalIcon, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                remoteImage = overlayConfig.overlay;
            }
            if ((i10 & 2) != 0) {
                overlayLocalIcon = overlayConfig.overlayFallback;
            }
            return overlayConfig.copy(remoteImage, overlayLocalIcon);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RemoteImage getOverlay() {
            return this.overlay;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final OverlayLocalIcon getOverlayFallback() {
            return this.overlayFallback;
        }

        @NotNull
        public final OverlayConfig copy(@Nullable RemoteImage overlay, @Nullable OverlayLocalIcon overlayFallback) {
            return new OverlayConfig(overlay, overlayFallback);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OverlayConfig)) {
                return false;
            }
            OverlayConfig overlayConfig = (OverlayConfig) other;
            return Intrinsics.m31980c(this.overlay, overlayConfig.overlay) && this.overlayFallback == overlayConfig.overlayFallback;
        }

        @Nullable
        public final RemoteImage getOverlay() {
            return this.overlay;
        }

        @Nullable
        public final OverlayLocalIcon getOverlayFallback() {
            return this.overlayFallback;
        }

        public int hashCode() {
            RemoteImage remoteImage = this.overlay;
            int iHashCode = (remoteImage == null ? 0 : remoteImage.hashCode()) * 31;
            OverlayLocalIcon overlayLocalIcon = this.overlayFallback;
            return iHashCode + (overlayLocalIcon != null ? overlayLocalIcon.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OverlayConfig(overlay=" + this.overlay + ", overlayFallback=" + this.overlayFallback + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            RemoteImage remoteImage = this.overlay;
            if (remoteImage == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                remoteImage.writeToParcel(dest, flags);
            }
            OverlayLocalIcon overlayLocalIcon = this.overlayFallback;
            if (overlayLocalIcon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(overlayLocalIcon.name());
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$OverlayLocalIcon;", "", "<init>", "(Ljava/lang/String;I)V", "BARCODE", "PASSPORT", "ID_FRONT", "ID_BACK", "CORNERS_ONLY", "EMPTY", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum OverlayLocalIcon {
        BARCODE,
        PASSPORT,
        ID_FRONT,
        ID_BACK,
        CORNERS_ONLY,
        EMPTY;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        @NotNull
        public static InterfaceC10707a<OverlayLocalIcon> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0004\u0010\n¨\u0006\u001d"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "Landroid/os/Parcelable;", Payload.TYPE, "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "isRequired", "", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;Ljava/lang/Boolean;)V", "getType", "()Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;Ljava/lang/Boolean;)Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class Rule implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Rule> CREATOR = new Creator();

        @Nullable
        private final Boolean isRequired;

        @Nullable
        private final RuleType type;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<Rule> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rule createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Boolean boolValueOf = null;
                RuleType ruleTypeValueOf = parcel.readInt() == 0 ? null : RuleType.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Rule(ruleTypeValueOf, boolValueOf);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Rule[] newArray(int i10) {
                return new Rule[i10];
            }
        }

        public Rule(@Nullable RuleType ruleType, @Nullable Boolean bool) {
            this.type = ruleType;
            this.isRequired = bool;
        }

        public static /* synthetic */ Rule copy$default(Rule rule, RuleType ruleType, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                ruleType = rule.type;
            }
            if ((i10 & 2) != 0) {
                bool = rule.isRequired;
            }
            return rule.copy(ruleType, bool);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final RuleType getType() {
            return this.type;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsRequired() {
            return this.isRequired;
        }

        @NotNull
        public final Rule copy(@Nullable RuleType type, @Nullable Boolean isRequired) {
            return new Rule(type, isRequired);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) other;
            return this.type == rule.type && Intrinsics.m31980c(this.isRequired, rule.isRequired);
        }

        @Nullable
        public final RuleType getType() {
            return this.type;
        }

        public int hashCode() {
            RuleType ruleType = this.type;
            int iHashCode = (ruleType == null ? 0 : ruleType.hashCode()) * 31;
            Boolean bool = this.isRequired;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isRequired() {
            return this.isRequired;
        }

        @NotNull
        public String toString() {
            return "Rule(type=" + this.type + ", isRequired=" + this.isRequired + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            RuleType ruleType = this.type;
            if (ruleType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(ruleType.name());
            }
            Boolean bool = this.isRequired;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleSet;", "Landroid/os/Parcelable;", "rules", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$Rule;", "<init>", "(Ljava/util/List;)V", "getRules", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class RuleSet implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RuleSet> CREATOR = new Creator();

        @Nullable
        private final List<Rule> rules;

        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class Creator implements Parcelable.Creator<RuleSet> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuleSet createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i10 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i10);
                    for (int i11 = 0; i11 != i10; i11++) {
                        arrayList2.add(Rule.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new RuleSet(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuleSet[] newArray(int i10) {
                return new RuleSet[i10];
            }
        }

        public RuleSet(@Nullable List<Rule> list) {
            this.rules = list;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.withpersona.sdk2.inquiry.network.dto.government_id.CapturePageConfig$RuleSet */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RuleSet copy$default(RuleSet ruleSet, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = ruleSet.rules;
            }
            return ruleSet.copy(list);
        }

        @Nullable
        public final List<Rule> component1() {
            return this.rules;
        }

        @NotNull
        public final RuleSet copy(@Nullable List<Rule> rules) {
            return new RuleSet(rules);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RuleSet) && Intrinsics.m31980c(this.rules, ((RuleSet) other).rules);
        }

        @Nullable
        public final List<Rule> getRules() {
            return this.rules;
        }

        public int hashCode() {
            List<Rule> list = this.rules;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @NotNull
        public String toString() {
            return "RuleSet(rules=" + this.rules + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<Rule> list = this.rules;
            if (list == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Rule> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CapturePageConfig$RuleType;", "", "<init>", "(Ljava/lang/String;I)V", "ID_FRONT", "ID_FRONT_OR_BACK", "BARCODE_PDF417", "PASSPORT_MRZ", "TEXT_EXTRACTION", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = false)
    public enum RuleType {
        ID_FRONT,
        ID_FRONT_OR_BACK,
        BARCODE_PDF417,
        PASSPORT_MRZ,
        TEXT_EXTRACTION;

        private static final /* synthetic */ InterfaceC10707a $ENTRIES = C10708b.m40805a(values());

        @NotNull
        public static InterfaceC10707a<RuleType> getEntries() {
            return $ENTRIES;
        }
    }

    public CapturePageConfig(@Nullable String str, @Nullable ManualCaptureConfig manualCaptureConfig, @Nullable AutoCaptureConfig autoCaptureConfig, @Nullable OverlayConfig overlayConfig) {
        this.side = str;
        this.manualCaptureConfig = manualCaptureConfig;
        this.autoCaptureConfig = autoCaptureConfig;
        this.overlay = overlayConfig;
    }

    public static /* synthetic */ CapturePageConfig copy$default(CapturePageConfig capturePageConfig, String str, ManualCaptureConfig manualCaptureConfig, AutoCaptureConfig autoCaptureConfig, OverlayConfig overlayConfig, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = capturePageConfig.side;
        }
        if ((i10 & 2) != 0) {
            manualCaptureConfig = capturePageConfig.manualCaptureConfig;
        }
        if ((i10 & 4) != 0) {
            autoCaptureConfig = capturePageConfig.autoCaptureConfig;
        }
        if ((i10 & 8) != 0) {
            overlayConfig = capturePageConfig.overlay;
        }
        return capturePageConfig.copy(str, manualCaptureConfig, autoCaptureConfig, overlayConfig);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ManualCaptureConfig getManualCaptureConfig() {
        return this.manualCaptureConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AutoCaptureConfig getAutoCaptureConfig() {
        return this.autoCaptureConfig;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OverlayConfig getOverlay() {
        return this.overlay;
    }

    @NotNull
    public final CapturePageConfig copy(@Nullable String side, @Nullable ManualCaptureConfig manualCaptureConfig, @Nullable AutoCaptureConfig autoCaptureConfig, @Nullable OverlayConfig overlay) {
        return new CapturePageConfig(side, manualCaptureConfig, autoCaptureConfig, overlay);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapturePageConfig)) {
            return false;
        }
        CapturePageConfig capturePageConfig = (CapturePageConfig) other;
        return Intrinsics.m31980c(this.side, capturePageConfig.side) && Intrinsics.m31980c(this.manualCaptureConfig, capturePageConfig.manualCaptureConfig) && Intrinsics.m31980c(this.autoCaptureConfig, capturePageConfig.autoCaptureConfig) && Intrinsics.m31980c(this.overlay, capturePageConfig.overlay);
    }

    @Nullable
    public final AutoCaptureConfig getAutoCaptureConfig() {
        return this.autoCaptureConfig;
    }

    @Nullable
    public final ManualCaptureConfig getManualCaptureConfig() {
        return this.manualCaptureConfig;
    }

    @Nullable
    public final OverlayConfig getOverlay() {
        return this.overlay;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    public int hashCode() {
        String str = this.side;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ManualCaptureConfig manualCaptureConfig = this.manualCaptureConfig;
        int iHashCode2 = (iHashCode + (manualCaptureConfig == null ? 0 : manualCaptureConfig.hashCode())) * 31;
        AutoCaptureConfig autoCaptureConfig = this.autoCaptureConfig;
        int iHashCode3 = (iHashCode2 + (autoCaptureConfig == null ? 0 : autoCaptureConfig.hashCode())) * 31;
        OverlayConfig overlayConfig = this.overlay;
        return iHashCode3 + (overlayConfig != null ? overlayConfig.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CapturePageConfig(side=" + this.side + ", manualCaptureConfig=" + this.manualCaptureConfig + ", autoCaptureConfig=" + this.autoCaptureConfig + ", overlay=" + this.overlay + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.side);
        ManualCaptureConfig manualCaptureConfig = this.manualCaptureConfig;
        if (manualCaptureConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            manualCaptureConfig.writeToParcel(dest, flags);
        }
        AutoCaptureConfig autoCaptureConfig = this.autoCaptureConfig;
        if (autoCaptureConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            autoCaptureConfig.writeToParcel(dest, flags);
        }
        OverlayConfig overlayConfig = this.overlay;
        if (overlayConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            overlayConfig.writeToParcel(dest, flags);
        }
    }
}
