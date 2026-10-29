package vg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vg.h, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001a"}, d2 = {"Lvg/h;", "", "", "uploadUrl", "uploadToken", "", "anrMaximumTimeout", "javaCrashUploadPercentage", "javaAnrUploadPercentage", "<init>", "(Ljava/lang/String;Ljava/lang/String;III)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "I", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BacktraceInitValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String uploadUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String uploadToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int anrMaximumTimeout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final int javaCrashUploadPercentage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int javaAnrUploadPercentage;

    public BacktraceInitValues(@NotNull String uploadUrl, @NotNull String uploadToken, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(uploadToken, "uploadToken");
        this.uploadUrl = uploadUrl;
        this.uploadToken = uploadToken;
        this.anrMaximumTimeout = i10;
        this.javaCrashUploadPercentage = i11;
        this.javaAnrUploadPercentage = i12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAnrMaximumTimeout() {
        return this.anrMaximumTimeout;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getJavaAnrUploadPercentage() {
        return this.javaAnrUploadPercentage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getJavaCrashUploadPercentage() {
        return this.javaCrashUploadPercentage;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUploadToken() {
        return this.uploadToken;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getUploadUrl() {
        return this.uploadUrl;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacktraceInitValues)) {
            return false;
        }
        BacktraceInitValues backtraceInitValues = (BacktraceInitValues) other;
        return Intrinsics.c(this.uploadUrl, backtraceInitValues.uploadUrl) && Intrinsics.c(this.uploadToken, backtraceInitValues.uploadToken) && this.anrMaximumTimeout == backtraceInitValues.anrMaximumTimeout && this.javaCrashUploadPercentage == backtraceInitValues.javaCrashUploadPercentage && this.javaAnrUploadPercentage == backtraceInitValues.javaAnrUploadPercentage;
    }

    public int hashCode() {
        return (((((((this.uploadUrl.hashCode() * 31) + this.uploadToken.hashCode()) * 31) + Integer.hashCode(this.anrMaximumTimeout)) * 31) + Integer.hashCode(this.javaCrashUploadPercentage)) * 31) + Integer.hashCode(this.javaAnrUploadPercentage);
    }

    @NotNull
    public String toString() {
        return "BacktraceInitValues(uploadUrl=" + this.uploadUrl + ", uploadToken=" + this.uploadToken + ", anrMaximumTimeout=" + this.anrMaximumTimeout + ", javaCrashUploadPercentage=" + this.javaCrashUploadPercentage + ", javaAnrUploadPercentage=" + this.javaAnrUploadPercentage + ")";
    }
}
