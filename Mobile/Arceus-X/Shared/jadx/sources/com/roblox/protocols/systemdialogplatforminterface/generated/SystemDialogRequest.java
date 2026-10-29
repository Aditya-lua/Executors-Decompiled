package com.roblox.protocols.systemdialogplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class SystemDialogRequest {
    final long blockTimeInSeconds;
    final String cancelText;
    final String message;
    final String okText;
    final boolean showProgressBar;
    final boolean showSpinner;
    final String title;

    public SystemDialogRequest(String str, String str2, String str3, String str4, boolean z10, boolean z11, long j10) {
        this.title = str;
        this.message = str2;
        this.okText = str3;
        this.cancelText = str4;
        this.showProgressBar = z10;
        this.showSpinner = z11;
        this.blockTimeInSeconds = j10;
    }

    public long getBlockTimeInSeconds() {
        return this.blockTimeInSeconds;
    }

    public String getCancelText() {
        return this.cancelText;
    }

    public String getMessage() {
        return this.message;
    }

    public String getOkText() {
        return this.okText;
    }

    public boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public boolean getShowSpinner() {
        return this.showSpinner;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "SystemDialogRequest{title=" + this.title + ",message=" + this.message + ",okText=" + this.okText + ",cancelText=" + this.cancelText + ",showProgressBar=" + this.showProgressBar + ",showSpinner=" + this.showSpinner + ",blockTimeInSeconds=" + this.blockTimeInSeconds + "}";
    }
}
