package com.roblox.protocols.systemdialogplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class SystemDialogContext {
    final boolean dismissed;

    /* JADX INFO: renamed from: id */
    final long f12673id;

    public SystemDialogContext(long j10, boolean z10) {
        this.f12673id = j10;
        this.dismissed = z10;
    }

    public boolean getDismissed() {
        return this.dismissed;
    }

    public long getId() {
        return this.f12673id;
    }

    public String toString() {
        return "SystemDialogContext{id=" + this.f12673id + ",dismissed=" + this.dismissed + "}";
    }
}
