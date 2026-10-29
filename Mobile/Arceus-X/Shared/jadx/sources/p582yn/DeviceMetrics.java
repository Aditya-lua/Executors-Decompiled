package p582yn;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yn.c, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lyn/c;", "", "", "timeSinceBootMs", "totalMemoryBytes", "availableStorageBytes", "Lyn/n;", "phoneCallStatus", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lyn/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "b", "d", "Lyn/n;", "()Lyn/n;", "device_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class DeviceMetrics {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final Long timeSinceBootMs;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final Long totalMemoryBytes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    public final Long availableStorageBytes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final EnumC13251n phoneCallStatus;

    public DeviceMetrics(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable EnumC13251n enumC13251n) {
        this.timeSinceBootMs = l10;
        this.totalMemoryBytes = l11;
        this.availableStorageBytes = l12;
        this.phoneCallStatus = enumC13251n;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAvailableStorageBytes() {
        return this.availableStorageBytes;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC13251n getPhoneCallStatus() {
        return this.phoneCallStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getTimeSinceBootMs() {
        return this.timeSinceBootMs;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getTotalMemoryBytes() {
        return this.totalMemoryBytes;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceMetrics)) {
            return false;
        }
        DeviceMetrics deviceMetrics = (DeviceMetrics) other;
        return Intrinsics.m31980c(this.timeSinceBootMs, deviceMetrics.timeSinceBootMs) && Intrinsics.m31980c(this.totalMemoryBytes, deviceMetrics.totalMemoryBytes) && Intrinsics.m31980c(this.availableStorageBytes, deviceMetrics.availableStorageBytes) && this.phoneCallStatus == deviceMetrics.phoneCallStatus;
    }

    public int hashCode() {
        Long l10 = this.timeSinceBootMs;
        int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        Long l11 = this.totalMemoryBytes;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.availableStorageBytes;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        EnumC13251n enumC13251n = this.phoneCallStatus;
        return iHashCode3 + (enumC13251n != null ? enumC13251n.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceMetrics(timeSinceBootMs=" + this.timeSinceBootMs + ", totalMemoryBytes=" + this.totalMemoryBytes + ", availableStorageBytes=" + this.availableStorageBytes + ", phoneCallStatus=" + this.phoneCallStatus + ")";
    }
}
