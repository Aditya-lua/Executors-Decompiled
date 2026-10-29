package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kn.EnumC7638a;
import kotlin.Metadata;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001d¨\u0006\u001e"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Landroid/os/Parcelable;", "", "Lkn/a;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "poseConfigs", "<init>", "(Ljava/util/Map;)V", "pose", "a", "(Lkn/a;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "selfie_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class PoseConfigs implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PoseConfigs> CREATOR = new C3899a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<EnumC7638a, PoseConfig> poseConfigs;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.PoseConfigs$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3899a implements Parcelable.Creator<PoseConfigs> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PoseConfigs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap.put(EnumC7638a.valueOf(parcel.readString()), PoseConfig.CREATOR.createFromParcel(parcel));
            }
            return new PoseConfigs(linkedHashMap);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PoseConfigs[] newArray(int i10) {
            return new PoseConfigs[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public PoseConfigs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final PoseConfig m19281a(@NotNull EnumC7638a pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        PoseConfig poseConfig = this.poseConfigs.get(pose);
        return poseConfig == null ? PoseConfig.INSTANCE.m19278a() : poseConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PoseConfigs) && Intrinsics.m31980c(this.poseConfigs, ((PoseConfigs) other).poseConfigs);
    }

    public int hashCode() {
        return this.poseConfigs.hashCode();
    }

    @NotNull
    public String toString() {
        return "PoseConfigs(poseConfigs=" + this.poseConfigs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<EnumC7638a, PoseConfig> map = this.poseConfigs;
        dest.writeInt(map.size());
        for (Map.Entry<EnumC7638a, PoseConfig> entry : map.entrySet()) {
            dest.writeString(entry.getKey().name());
            entry.getValue().writeToParcel(dest, flags);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public PoseConfigs(@NotNull Map<EnumC7638a, PoseConfig> poseConfigs) {
        Intrinsics.checkNotNullParameter(poseConfigs, "poseConfigs");
        this.poseConfigs = poseConfigs;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (wrap java.util.Map:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Map:0x0004: INVOKE  STATIC call: kotlin.collections.k0.j():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:4)) : (r1v0 java.util.Map))
     A[MD:(java.util.Map<kn.a, com.withpersona.sdk2.inquiry.selfie.PoseConfig>):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.selfie.PoseConfigs.<init>(java.util.Map):void type: THIS */
    public /* synthetic */ PoseConfigs(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C7690k0.m31795j() : map);
    }
}
