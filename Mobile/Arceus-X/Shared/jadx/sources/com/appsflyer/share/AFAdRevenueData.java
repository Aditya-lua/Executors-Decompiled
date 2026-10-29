package com.appsflyer.share;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÇ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001e\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0015"}, m31665d2 = {"Lcom/appsflyer/share/AFAdRevenueData;", "", "", "monetizationNetwork", "Lcom/appsflyer/share/MediationNetwork;", "mediationNetwork", "currencyIso4217Code", "", "revenue", "<init>", "(Ljava/lang/String;Lcom/appsflyer/share/MediationNetwork;Ljava/lang/String;D)V", "", "areAllFieldsValid", "()Z", "AFKeystoreWrapper", "component1", "()Ljava/lang/String;", "component2", "()Lcom/appsflyer/share/MediationNetwork;", "component3", "component4", "()D", "copy", "(Ljava/lang/String;Lcom/appsflyer/share/MediationNetwork;Ljava/lang/String;D)Lcom/appsflyer/share/AFAdRevenueData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMonetizationNetwork", "Lcom/appsflyer/share/MediationNetwork;", "getMediationNetwork", "getCurrencyIso4217Code", "D", "getRevenue"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class AFAdRevenueData {

    @NotNull
    private final String currencyIso4217Code;

    @NotNull
    private final MediationNetwork mediationNetwork;

    @NotNull
    private final String monetizationNetwork;
    private final double revenue;

    public AFAdRevenueData(@NotNull String str, @NotNull MediationNetwork mediationNetwork, @NotNull String str2, double d10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.monetizationNetwork = str;
        this.mediationNetwork = mediationNetwork;
        this.currencyIso4217Code = str2;
        this.revenue = d10;
    }

    private final boolean AFKeystoreWrapper() {
        try {
            Currency.getInstance(this.currencyIso4217Code);
            return true;
        } catch (Throwable unused) {
            AFLoggerBase.w$default(AFLogger.INSTANCE, LogTag.AD_REVENUE, "Currency is not ISO 4217 currency code", false, 4, null);
            return false;
        }
    }

    public static /* synthetic */ AFAdRevenueData copy$default(AFAdRevenueData aFAdRevenueData, String str, MediationNetwork mediationNetwork, String str2, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aFAdRevenueData.monetizationNetwork;
        }
        if ((i10 & 2) != 0) {
            mediationNetwork = aFAdRevenueData.mediationNetwork;
        }
        if ((i10 & 4) != 0) {
            str2 = aFAdRevenueData.currencyIso4217Code;
        }
        if ((i10 & 8) != 0) {
            d10 = aFAdRevenueData.revenue;
        }
        String str3 = str2;
        return aFAdRevenueData.copy(str, mediationNetwork, str3, d10);
    }

    public final boolean areAllFieldsValid() {
        return !StringsKt.m32182p0(this.monetizationNetwork) && AFKeystoreWrapper();
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMonetizationNetwork() {
        return this.monetizationNetwork;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MediationNetwork getMediationNetwork() {
        return this.mediationNetwork;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyIso4217Code() {
        return this.currencyIso4217Code;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getRevenue() {
        return this.revenue;
    }

    @NotNull
    public final AFAdRevenueData copy(@NotNull String monetizationNetwork, @NotNull MediationNetwork mediationNetwork, @NotNull String currencyIso4217Code, double revenue) {
        Intrinsics.checkNotNullParameter(monetizationNetwork, "");
        Intrinsics.checkNotNullParameter(mediationNetwork, "");
        Intrinsics.checkNotNullParameter(currencyIso4217Code, "");
        return new AFAdRevenueData(monetizationNetwork, mediationNetwork, currencyIso4217Code, revenue);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFAdRevenueData)) {
            return false;
        }
        AFAdRevenueData aFAdRevenueData = (AFAdRevenueData) other;
        return Intrinsics.m31980c(this.monetizationNetwork, aFAdRevenueData.monetizationNetwork) && this.mediationNetwork == aFAdRevenueData.mediationNetwork && Intrinsics.m31980c(this.currencyIso4217Code, aFAdRevenueData.currencyIso4217Code) && Double.compare(this.revenue, aFAdRevenueData.revenue) == 0;
    }

    @NotNull
    public final String getCurrencyIso4217Code() {
        return this.currencyIso4217Code;
    }

    @NotNull
    public final MediationNetwork getMediationNetwork() {
        return this.mediationNetwork;
    }

    @NotNull
    public final String getMonetizationNetwork() {
        return this.monetizationNetwork;
    }

    public final double getRevenue() {
        return this.revenue;
    }

    public final int hashCode() {
        return (((((this.monetizationNetwork.hashCode() * 31) + this.mediationNetwork.hashCode()) * 31) + this.currencyIso4217Code.hashCode()) * 31) + Double.hashCode(this.revenue);
    }

    @NotNull
    public final String toString() {
        return "AFAdRevenueData(monetizationNetwork=" + this.monetizationNetwork + ", mediationNetwork=" + this.mediationNetwork + ", currencyIso4217Code=" + this.currencyIso4217Code + ", revenue=" + this.revenue + ")";
    }
}
