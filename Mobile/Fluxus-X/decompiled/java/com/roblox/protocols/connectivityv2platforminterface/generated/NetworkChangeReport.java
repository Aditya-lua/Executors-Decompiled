package com.roblox.protocols.connectivityv2platforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class NetworkChangeReport {
    final NetworkInterfaceType interfaceType;
    final byte[] ipv4;
    final byte[] ipv6;
    final int ipv6PrefixLength;
    final boolean pathSatisfied;
    final NetworkValidationState validation;

    public NetworkChangeReport(NetworkInterfaceType networkInterfaceType, byte[] bArr, byte[] bArr2, int i10, boolean z10, NetworkValidationState networkValidationState) {
        this.interfaceType = networkInterfaceType;
        this.ipv4 = bArr;
        this.ipv6 = bArr2;
        this.ipv6PrefixLength = i10;
        this.pathSatisfied = z10;
        this.validation = networkValidationState;
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

    public boolean getPathSatisfied() {
        return this.pathSatisfied;
    }

    public NetworkValidationState getValidation() {
        return this.validation;
    }

    public String toString() {
        return "NetworkChangeReport{interfaceType=" + this.interfaceType + ",ipv4=" + this.ipv4 + ",ipv6=" + this.ipv6 + ",ipv6PrefixLength=" + this.ipv6PrefixLength + ",pathSatisfied=" + this.pathSatisfied + ",validation=" + this.validation + "}";
    }
}
