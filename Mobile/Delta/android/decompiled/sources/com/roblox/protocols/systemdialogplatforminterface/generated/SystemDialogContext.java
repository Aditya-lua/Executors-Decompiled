package com.roblox.protocols.systemdialogplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class SystemDialogContext {
    final boolean dismissed;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    final long f9726id;

    public SystemDialogContext(long j10, boolean z10) {
        this.f9726id = j10;
        this.dismissed = z10;
    }

    public boolean getDismissed() {
        return this.dismissed;
    }

    public long getId() {
        return this.f9726id;
    }

    public String toString() {
        return "SystemDialogContext{id=" + this.f9726id + ",dismissed=" + this.dismissed + "}";
    }
}
