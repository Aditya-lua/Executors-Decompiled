package vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import sn.AutoCaptureRuleSet;

/* JADX INFO: renamed from: vo.d3, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0004*$.0B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0015J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lvo/d3;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "idClassKey", "Lvo/h3;", "icon", BuildConfig.FLAVOR, "Lvo/d3$c;", "sideConfigs", "Lvo/i3;", "parts", "Ldp/e;", Payload.TYPE, "<init>", "(Ljava/lang/String;Lvo/h3;Ljava/util/List;Ljava/util/List;Ldp/e;)V", "Lvo/d3$e;", "side", "g", "(Lvo/d3$e;)Lvo/d3$c;", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "q2", "b", "Lvo/h3;", "()Lvo/h3;", "c", "Ljava/util/List;", "getSideConfigs", "()Ljava/util/List;", "d", "f", "e", "Ldp/e;", "i", "()Ldp/e;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IdConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IdConfig> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String idClassKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final h3 icon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<IdSideConfig> sideConfigs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final List<i3> parts;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final dp.e type;

    /* JADX INFO: renamed from: vo.d3$a, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lvo/d3$a;", "Landroid/os/Parcelable;", "Lsn/f;", "ruleSet", "<init>", "(Lsn/f;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Lsn/f;", "()Lsn/f;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoCaptureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AutoCaptureConfig> CREATOR = new C0709a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final AutoCaptureRuleSet ruleSet;

        /* JADX INFO: renamed from: vo.d3$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0709a implements Parcelable.Creator<AutoCaptureConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AutoCaptureConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoCaptureConfig((AutoCaptureRuleSet) parcel.readParcelable(AutoCaptureConfig.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AutoCaptureConfig[] newArray(int i10) {
                return new AutoCaptureConfig[i10];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AutoCaptureConfig() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final AutoCaptureRuleSet getRuleSet() {
            return this.ruleSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AutoCaptureConfig) && Intrinsics.c(this.ruleSet, ((AutoCaptureConfig) other).ruleSet);
        }

        public int hashCode() {
            return this.ruleSet.hashCode();
        }

        @NotNull
        public String toString() {
            return "AutoCaptureConfig(ruleSet=" + this.ruleSet + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.ruleSet, flags);
        }

        public AutoCaptureConfig(@NotNull AutoCaptureRuleSet ruleSet) {
            Intrinsics.checkNotNullParameter(ruleSet, "ruleSet");
            this.ruleSet = ruleSet;
        }

        public /* synthetic */ AutoCaptureConfig(AutoCaptureRuleSet autoCaptureRuleSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new AutoCaptureRuleSet(null, 1, null) : autoCaptureRuleSet);
        }
    }

    /* JADX INFO: renamed from: vo.d3$b */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IdConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            h3 h3VarValueOf = h3.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(IdSideConfig.CREATOR.createFromParcel(parcel));
            }
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                arrayList2.add(parcel.readParcelable(IdConfig.class.getClassLoader()));
            }
            return new IdConfig(string, h3VarValueOf, arrayList, arrayList2, dp.e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IdConfig[] newArray(int i10) {
            return new IdConfig[i10];
        }
    }

    /* JADX INFO: renamed from: vo.d3$c, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u001f\u0010,R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lvo/d3$c;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "sideKey", "Lvo/d3$e;", "side", "Lvo/y3$f;", "overlay", "Lvo/d3$a;", "autoCaptureConfig", "Lvo/d3$d;", "manualCaptureConfig", "<init>", "(Ljava/lang/String;Lvo/d3$e;Lvo/y3$f;Lvo/d3$a;Lvo/d3$d;)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "b", "Lvo/d3$e;", "i", "()Lvo/d3$e;", "c", "Lvo/y3$f;", "g", "()Lvo/y3$f;", "d", "Lvo/d3$a;", "()Lvo/d3$a;", "e", "Lvo/d3$d;", "f", "()Lvo/d3$d;", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdSideConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<IdSideConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String sideKey;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final e side;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final y3.f overlay;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final AutoCaptureConfig autoCaptureConfig;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final ManualCaptureConfig manualCaptureConfig;

        /* JADX INFO: renamed from: vo.d3$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IdSideConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IdSideConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IdSideConfig(parcel.readString(), e.valueOf(parcel.readString()), (y3.f) parcel.readParcelable(IdSideConfig.class.getClassLoader()), AutoCaptureConfig.CREATOR.createFromParcel(parcel), ManualCaptureConfig.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IdSideConfig[] newArray(int i10) {
                return new IdSideConfig[i10];
            }
        }

        public IdSideConfig(@NotNull String sideKey, @NotNull e side, @NotNull y3.f overlay, @NotNull AutoCaptureConfig autoCaptureConfig, @NotNull ManualCaptureConfig manualCaptureConfig) {
            Intrinsics.checkNotNullParameter(sideKey, "sideKey");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(overlay, "overlay");
            Intrinsics.checkNotNullParameter(autoCaptureConfig, "autoCaptureConfig");
            Intrinsics.checkNotNullParameter(manualCaptureConfig, "manualCaptureConfig");
            this.sideKey = sideKey;
            this.side = side;
            this.overlay = overlay;
            this.autoCaptureConfig = autoCaptureConfig;
            this.manualCaptureConfig = manualCaptureConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final AutoCaptureConfig getAutoCaptureConfig() {
            return this.autoCaptureConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IdSideConfig)) {
                return false;
            }
            IdSideConfig idSideConfig = (IdSideConfig) other;
            return Intrinsics.c(this.sideKey, idSideConfig.sideKey) && this.side == idSideConfig.side && Intrinsics.c(this.overlay, idSideConfig.overlay) && Intrinsics.c(this.autoCaptureConfig, idSideConfig.autoCaptureConfig) && Intrinsics.c(this.manualCaptureConfig, idSideConfig.manualCaptureConfig);
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final ManualCaptureConfig getManualCaptureConfig() {
            return this.manualCaptureConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final y3.f getOverlay() {
            return this.overlay;
        }

        public int hashCode() {
            return (((((((this.sideKey.hashCode() * 31) + this.side.hashCode()) * 31) + this.overlay.hashCode()) * 31) + this.autoCaptureConfig.hashCode()) * 31) + this.manualCaptureConfig.hashCode();
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final e getSide() {
            return this.side;
        }

        @NotNull
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getSideKey() {
            return this.sideKey;
        }

        @NotNull
        public String toString() {
            return "IdSideConfig(sideKey=" + this.sideKey + ", side=" + this.side + ", overlay=" + this.overlay + ", autoCaptureConfig=" + this.autoCaptureConfig + ", manualCaptureConfig=" + this.manualCaptureConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.sideKey);
            dest.writeString(this.side.name());
            dest.writeParcelable(this.overlay, flags);
            this.autoCaptureConfig.writeToParcel(dest, flags);
            this.manualCaptureConfig.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: vo.d3$d, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0003\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lvo/d3$d;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "isEnabled", BuildConfig.FLAVOR, "delayMs", "<init>", "(ZJ)V", BuildConfig.FLAVOR, "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "J", "()J", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManualCaptureConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ManualCaptureConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean isEnabled;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long delayMs;

        /* JADX INFO: renamed from: vo.d3$d$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ManualCaptureConfig> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ManualCaptureConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManualCaptureConfig(parcel.readInt() != 0, parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ManualCaptureConfig[] newArray(int i10) {
                return new ManualCaptureConfig[i10];
            }
        }

        public ManualCaptureConfig(boolean z10, long j10) {
            this.isEnabled = z10;
            this.delayMs = j10;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDelayMs() {
            return this.delayMs;
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
            return this.isEnabled == manualCaptureConfig.isEnabled && this.delayMs == manualCaptureConfig.delayMs;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isEnabled) * 31) + Long.hashCode(this.delayMs);
        }

        /* JADX INFO: renamed from: isEnabled, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        @NotNull
        public String toString() {
            return "ManualCaptureConfig(isEnabled=" + this.isEnabled + ", delayMs=" + this.delayMs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isEnabled ? 1 : 0);
            dest.writeLong(this.delayMs);
        }
    }

    /* JADX INFO: renamed from: vo.d3$e */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lvo/d3$e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "d", "f", "g", "h", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum e {
        Front("front"),
        Back("back"),
        FrontOrBack("front_or_back"),
        BarcodePdf417("barcode_pdf417"),
        PassportSignature("passport_signature");


        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ hu.a f34639j = hu.b.a(b());

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final zt.h<Map<String, e>> f34632c = zt.i.a(new Function0() { // from class: vo.e3
            @Override // p001kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IdConfig.e.h();
            }
        });

        /* JADX INFO: renamed from: vo.d3$e$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lvo/d3$e$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "sideKey", "Lvo/d3$e;", "a", "(Ljava/lang/String;)Lvo/d3$e;", BuildConfig.FLAVOR, "sideKeyToSide$delegate", "Lzt/h;", "b", "()Ljava/util/Map;", "sideKeyToSide", "government-id_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final e a(@NotNull String sideKey) {
                Intrinsics.checkNotNullParameter(sideKey, "sideKey");
                return b().get(sideKey);
            }

            public final Map<String, e> b() {
                return (Map) e.f34632c.getValue();
            }

            public Companion() {
            }
        }

        e(String str) {
            this.key = str;
        }

        @NotNull
        public static hu.a<e> d() {
            return f34639j;
        }

        public static final Map h() {
            e[] eVarArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(p001kotlin.collections.j0.f(eVarArrValues.length), 16));
            for (e eVar : eVarArrValues) {
                linkedHashMap.put(eVar.key, eVar);
            }
            return linkedHashMap;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getKey() {
            return this.key;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IdConfig(@NotNull String idClassKey, @NotNull h3 icon, @NotNull List<IdSideConfig> sideConfigs, @NotNull List<? extends i3> parts, @NotNull dp.e type) {
        Intrinsics.checkNotNullParameter(idClassKey, "idClassKey");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(sideConfigs, "sideConfigs");
        Intrinsics.checkNotNullParameter(parts, "parts");
        Intrinsics.checkNotNullParameter(type, "type");
        this.idClassKey = idClassKey;
        this.icon = icon;
        this.sideConfigs = sideConfigs;
        this.parts = parts;
        this.type = type;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h3 getIcon() {
        return this.icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdConfig)) {
            return false;
        }
        IdConfig idConfig = (IdConfig) other;
        return Intrinsics.c(this.idClassKey, idConfig.idClassKey) && this.icon == idConfig.icon && Intrinsics.c(this.sideConfigs, idConfig.sideConfigs) && Intrinsics.c(this.parts, idConfig.parts) && this.type == idConfig.type;
    }

    @NotNull
    public final List<i3> f() {
        return this.parts;
    }

    @NotNull
    public final IdSideConfig g(@NotNull e side) {
        Intrinsics.checkNotNullParameter(side, "side");
        for (IdSideConfig idSideConfig : this.sideConfigs) {
            if (idSideConfig.getSide() == side) {
                return idSideConfig;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public int hashCode() {
        return (((((((this.idClassKey.hashCode() * 31) + this.icon.hashCode()) * 31) + this.sideConfigs.hashCode()) * 31) + this.parts.hashCode()) * 31) + this.type.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final dp.e getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: q2, reason: from getter */
    public final String getIdClassKey() {
        return this.idClassKey;
    }

    @NotNull
    public String toString() {
        return "IdConfig(idClassKey=" + this.idClassKey + ", icon=" + this.icon + ", sideConfigs=" + this.sideConfigs + ", parts=" + this.parts + ", type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.idClassKey);
        dest.writeString(this.icon.name());
        List<IdSideConfig> list = this.sideConfigs;
        dest.writeInt(list.size());
        Iterator<IdSideConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        List<i3> list2 = this.parts;
        dest.writeInt(list2.size());
        Iterator<i3> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeString(this.type.name());
    }
}
