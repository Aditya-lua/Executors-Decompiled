package com.roblox.protocols.callingplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class CallingState {
    final String callId;
    final CallingStatus status;

    public CallingState(String str, CallingStatus callingStatus) {
        this.callId = str;
        this.status = callingStatus;
    }

    public String getCallId() {
        return this.callId;
    }

    public CallingStatus getStatus() {
        return this.status;
    }

    public String toString() {
        return "CallingState{callId=" + this.callId + ",status=" + this.status + "}";
    }
}
