package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "Landroid/os/Parcelable;", "", "isEnabled", "extractTextFromImage", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "idSideConfig", "<init>", "(ZZLcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Z", "()Z", "b", "c", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "f", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "d", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoClassificationConfig implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean extractTextFromImage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IdConfig.IdSideConfig idSideConfig;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<AutoClassificationConfig> CREATOR = new b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationConfig$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig$a;", "", "<init>", "()V", "", "isEnabled", "extractTextFromImage", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "idSideConfig", "Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "b", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;", "a", "()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdConfig.IdSideConfig a() {
            return new IdConfig.IdSideConfig("unknown", IdConfig.b.Front, Screen.Overlay.CornersOnly.f10710a, new IdConfig.AutoCaptureConfig(null, 1, null), new IdConfig.ManualCaptureConfig(true, 0L));
        }

        @NotNull
        public final AutoClassificationConfig b(@Nullable Boolean isEnabled, @Nullable Boolean extractTextFromImage, @Nullable IdConfig.IdSideConfig idSideConfig) {
            boolean zBooleanValue = isEnabled != null ? isEnabled.booleanValue() : false;
            boolean zBooleanValue2 = extractTextFromImage != null ? extractTextFromImage.booleanValue() : true;
            if (idSideConfig == null) {
                idSideConfig = a();
            }
            return new AutoClassificationConfig(zBooleanValue, zBooleanValue2, idSideConfig);
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AutoClassificationConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AutoClassificationConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoClassificationConfig(parcel.readInt() != 0, parcel.readInt() != 0, IdConfig.IdSideConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AutoClassificationConfig[] newArray(int i10) {
            return new AutoClassificationConfig[i10];
        }
    }

    public AutoClassificationConfig(boolean z10, boolean z11, @NotNull IdConfig.IdSideConfig idSideConfig) {
        Intrinsics.checkNotNullParameter(idSideConfig, "idSideConfig");
        this.isEnabled = z10;
        this.extractTextFromImage = z11;
        this.idSideConfig = idSideConfig;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getExtractTextFromImage() {
        return this.extractTextFromImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final IdConfig.IdSideConfig getIdSideConfig() {
        return this.idSideConfig;
    }

    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeInt(this.extractTextFromImage ? 1 : 0);
        this.idSideConfig.writeToParcel(dest, flags);
    }
}
