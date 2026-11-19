package com.roblox.protocols.calling;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.collections.p;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import zt.n;
import zt.o;

/* JADX INFO: renamed from: com.roblox.protocols.calling.a, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0013B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/roblox/protocols/calling/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "callId", "callData", BuildConfig.FLAVOR, "callerUserId", "callerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "d", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IncomingCall {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final List<String> f9701f = p.n("inviterUserId", "fromUserId");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String callId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String callData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Long callerUserId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String callerName;

    /* JADX INFO: renamed from: com.roblox.protocols.calling.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/roblox/protocols/calling/a$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "callData", "callerName", "Lcom/roblox/protocols/calling/a;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lcom/roblox/protocols/calling/a;", "Lorg/json/JSONObject;", "leg", BuildConfig.FLAVOR, "a", "(Lorg/json/JSONObject;)Ljava/lang/Long;", BuildConfig.FLAVOR, "CALLER_USER_ID_KEYS", "Ljava/util/List;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Long a(JSONObject leg) {
            Long l10;
            Iterator it = IncomingCall.f9701f.iterator();
            do {
                l10 = null;
                if (!it.hasNext()) {
                    break;
                }
                Long lValueOf = Long.valueOf(leg.optLong((String) it.next()));
                if (lValueOf.longValue() > 0) {
                    l10 = lValueOf;
                }
            } while (l10 == null);
            return l10;
        }

        @Nullable
        public final IncomingCall b(@NotNull String callData, @Nullable String callerName) {
            Object objB;
            JSONArray jSONArrayOptJSONArray;
            Intrinsics.checkNotNullParameter(callData, "callData");
            try {
                n.Companion companion = n.INSTANCE;
                objB = n.b(new JSONObject(callData));
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            String str = null;
            if (n.e(objB) != null) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) objB;
            String strOptString = jSONObject.optString("callId");
            if (strOptString.length() == 0) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("callLegStatuses");
            JSONObject jSONObjectOptJSONObject2 = (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("callLegs")) == null) ? null : jSONArrayOptJSONArray.optJSONObject(0);
            Intrinsics.checkNotNull(strOptString);
            Long lA = jSONObjectOptJSONObject2 != null ? a(jSONObjectOptJSONObject2) : null;
            if (callerName != null) {
                if (callerName.length() == 0) {
                    callerName = null;
                }
                str = callerName;
            }
            return new IncomingCall(strOptString, callData, lA, str);
        }

        public Companion() {
        }
    }

    public IncomingCall(@NotNull String callId, @NotNull String callData, @Nullable Long l10, @Nullable String str) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(callData, "callData");
        this.callId = callId;
        this.callData = callData;
        this.callerUserId = l10;
        this.callerName = str;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCallData() {
        return this.callData;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCallerName() {
        return this.callerName;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getCallerUserId() {
        return this.callerUserId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncomingCall)) {
            return false;
        }
        IncomingCall incomingCall = (IncomingCall) other;
        return Intrinsics.c(this.callId, incomingCall.callId) && Intrinsics.c(this.callData, incomingCall.callData) && Intrinsics.c(this.callerUserId, incomingCall.callerUserId) && Intrinsics.c(this.callerName, incomingCall.callerName);
    }

    public int hashCode() {
        int iHashCode = ((this.callId.hashCode() * 31) + this.callData.hashCode()) * 31;
        Long l10 = this.callerUserId;
        int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str = this.callerName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IncomingCall(callId=" + this.callId + ", callData=" + this.callData + ", callerUserId=" + this.callerUserId + ", callerName=" + this.callerName + ")";
    }
}
