package com.roblox.protocols.connectivityv2platforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class NetworkChangeReportV2 {
    final boolean constrained;
    final NetworkInterfaceType interfaceType;
    final byte[] ipv4;
    final byte[] ipv6;
    final int ipv6PrefixLength;
    final boolean metered;
    final boolean pathSatisfied;
    final NetworkValidationState validation;

    public NetworkChangeReportV2(NetworkInterfaceType networkInterfaceType, byte[] bArr, byte[] bArr2, int i10, boolean z10, NetworkValidationState networkValidationState, boolean z11, boolean z12) {
        this.interfaceType = networkInterfaceType;
        this.ipv4 = bArr;
        this.ipv6 = bArr2;
        this.ipv6PrefixLength = i10;
        this.pathSatisfied = z10;
        this.validation = networkValidationState;
        this.metered = z11;
        this.constrained = z12;
    }

    public boolean getConstrained() {
        return this.constrained;
    }

    public NetworkInterfaceType getInterfaceType() {
        return this.interfaceType;
    }

    public byte[] getIpv4() {
        return this.ipv4;
    }

    public byte[] getIpv6() {
        return this.ipv6;
    }

    public int getIpv6PrefixLength() {
        return this.ipv6PrefixLength;
    }

    public boolean getMetered() {
        return this.metered;
    }

    public boolean getPathSatisfied() {
        return this.pathSatisfied;
    }

    public NetworkValidationState getValidation() {
        return this.validation;
    }

    public String toString() {
        return "NetworkChangeReportV2{interfaceType=" + this.interfaceType + ",ipv4=" + this.ipv4 + ",ipv6=" + this.ipv6 + ",ipv6PrefixLength=" + this.ipv6PrefixLength + ",pathSatisfied=" + this.pathSatisfied + ",validation=" + this.validation + ",metered=" + this.metered + ",constrained=" + this.constrained + "}";
    }
}
