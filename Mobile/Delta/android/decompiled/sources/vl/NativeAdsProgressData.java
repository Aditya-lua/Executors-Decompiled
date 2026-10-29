package vl;

import gk.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: vl.b, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B;\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001d\u0010\"\"\u0004\b#\u0010$R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b \u0010\u0011\"\u0004\b'\u0010(R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010)\u001a\u0004\b%\u0010\u0013\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lvl/b;", "", "", "adProgress", "videoDuration", "", "price", "", "priceCurrencyCode", "", "pricePrecisionType", "<init>", "(DDJLjava/lang/String;I)V", "Lorg/json/JSONObject;", "f", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "setAdProgress", "(D)V", "b", "e", "setVideoDuration", "c", "J", "()J", "setPrice", "(J)V", "d", "Ljava/lang/String;", "setPriceCurrencyCode", "(Ljava/lang/String;)V", "I", "setPricePrecisionType", "(I)V", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NativeAdsProgressData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public double adProgress;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public double videoDuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public long price;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String priceCurrencyCode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int pricePrecisionType;

    public NativeAdsProgressData(double d10, double d11, long j10, @NotNull String priceCurrencyCode, int i10) {
        Intrinsics.checkNotNullParameter(priceCurrencyCode, "priceCurrencyCode");
        this.adProgress = d10;
        this.videoDuration = d11;
        this.price = j10;
        this.priceCurrencyCode = priceCurrencyCode;
        this.pricePrecisionType = i10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAdProgress() {
        return this.adProgress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPrice() {
        return this.price;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPricePrecisionType() {
        return this.pricePrecisionType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final double getVideoDuration() {
        return this.videoDuration;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeAdsProgressData)) {
            return false;
        }
        NativeAdsProgressData nativeAdsProgressData = (NativeAdsProgressData) other;
        return Double.compare(this.adProgress, nativeAdsProgressData.adProgress) == 0 && Double.compare(this.videoDuration, nativeAdsProgressData.videoDuration) == 0 && this.price == nativeAdsProgressData.price && Intrinsics.c(this.priceCurrencyCode, nativeAdsProgressData.priceCurrencyCode) && this.pricePrecisionType == nativeAdsProgressData.pricePrecisionType;
    }

    @NotNull
    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        n.b(jSONObject, "adProgress", this.adProgress);
        n.b(jSONObject, "videoDuration", this.videoDuration);
        n.d(jSONObject, "price", this.price);
        n.e(jSONObject, "priceCurrencyCode", this.priceCurrencyCode);
        n.c(jSONObject, "pricePrecisionType", this.pricePrecisionType);
        return jSONObject;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.adProgress) * 31) + Double.hashCode(this.videoDuration)) * 31) + Long.hashCode(this.price)) * 31) + this.priceCurrencyCode.hashCode()) * 31) + Integer.hashCode(this.pricePrecisionType);
    }

    @NotNull
    public String toString() {
        return "NativeAdsProgressData(adProgress=" + this.adProgress + ", videoDuration=" + this.videoDuration + ", price=" + this.price + ", priceCurrencyCode=" + this.priceCurrencyCode + ", pricePrecisionType=" + this.pricePrecisionType + ")";
    }

    public /* synthetic */ NativeAdsProgressData(double d10, double d11, long j10, String str, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0d : d10, (i11 & 2) != 0 ? 0.0d : d11, (i11 & 4) != 0 ? 0L : j10, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? 0 : i10);
    }
}
