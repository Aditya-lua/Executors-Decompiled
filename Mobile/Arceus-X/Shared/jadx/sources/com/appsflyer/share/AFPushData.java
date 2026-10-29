package com.appsflyer.share;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007HÇ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0007HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\u0012R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0014"}, m31665d2 = {"Lcom/appsflyer/share/AFPushData;", "", "", "campaign", "pid", "", "isRetargeting", "", "additionalParameters", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Lcom/appsflyer/share/AFPushData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCampaign", "getPid", "Z", "Ljava/util/Map;", "getAdditionalParameters"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final /* data */ class AFPushData {

    @Nullable
    private final Map<String, Object> additionalParameters;

    @NotNull
    private final String campaign;
    private final boolean isRetargeting;

    @NotNull
    private final String pid;

    public AFPushData(@NotNull String str, @NotNull String str2, boolean z10, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.campaign = str;
        this.pid = str2;
        this.isRetargeting = z10;
        this.additionalParameters = map;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.appsflyer.share.AFPushData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AFPushData copy$default(AFPushData aFPushData, String str, String str2, boolean z10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = aFPushData.campaign;
        }
        if ((i10 & 2) != 0) {
            str2 = aFPushData.pid;
        }
        if ((i10 & 4) != 0) {
            z10 = aFPushData.isRetargeting;
        }
        if ((i10 & 8) != 0) {
            map = aFPushData.additionalParameters;
        }
        return aFPushData.copy(str, str2, z10, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCampaign() {
        return this.campaign;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsRetargeting() {
        return this.isRetargeting;
    }

    @Nullable
    public final Map<String, Object> component4() {
        return this.additionalParameters;
    }

    @NotNull
    public final AFPushData copy(@NotNull String campaign, @NotNull String pid, boolean isRetargeting, @Nullable Map<String, ? extends Object> additionalParameters) {
        Intrinsics.checkNotNullParameter(campaign, "");
        Intrinsics.checkNotNullParameter(pid, "");
        return new AFPushData(campaign, pid, isRetargeting, additionalParameters);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFPushData)) {
            return false;
        }
        AFPushData aFPushData = (AFPushData) other;
        return Intrinsics.m31980c(this.campaign, aFPushData.campaign) && Intrinsics.m31980c(this.pid, aFPushData.pid) && this.isRetargeting == aFPushData.isRetargeting && Intrinsics.m31980c(this.additionalParameters, aFPushData.additionalParameters);
    }

    @Nullable
    public final Map<String, Object> getAdditionalParameters() {
        return this.additionalParameters;
    }

    @NotNull
    public final String getCampaign() {
        return this.campaign;
    }

    @NotNull
    public final String getPid() {
        return this.pid;
    }

    public final int hashCode() {
        int iHashCode = ((((this.campaign.hashCode() * 31) + this.pid.hashCode()) * 31) + Boolean.hashCode(this.isRetargeting)) * 31;
        Map<String, Object> map = this.additionalParameters;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final boolean isRetargeting() {
        return this.isRetargeting;
    }

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("c", this.campaign);
        jSONObject.put("pid", this.pid);
        jSONObject.put("is_retargeting", this.isRetargeting);
        Map<String, Object> map = this.additionalParameters;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        return jSONObject;
    }

    @NotNull
    public final String toString() {
        return "AFPushData(campaign=" + this.campaign + ", pid=" + this.pid + ", isRetargeting=" + this.isRetargeting + ", additionalParameters=" + this.additionalParameters + ")";
    }
}
