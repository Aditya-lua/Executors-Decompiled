package com.withpersona.sdk2.inquiry.network.upload;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;", "", "fileKey", "", "fileName", "fileEncrypted", "", "fileContentType", "fileByteSize", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "getFileKey", "()Ljava/lang/String;", "getFileName", "getFileEncrypted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFileContentType", "getFileByteSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class UploadResponse {

    @Nullable
    private final Long fileByteSize;

    @Nullable
    private final String fileContentType;

    @Nullable
    private final Boolean fileEncrypted;

    @Nullable
    private final String fileKey;

    @Nullable
    private final String fileName;

    public UploadResponse(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable Long l10) {
        this.fileKey = str;
        this.fileName = str2;
        this.fileEncrypted = bool;
        this.fileContentType = str3;
        this.fileByteSize = l10;
    }

    @Nullable
    public final Long getFileByteSize() {
        return this.fileByteSize;
    }

    @Nullable
    public final String getFileContentType() {
        return this.fileContentType;
    }

    @Nullable
    public final Boolean getFileEncrypted() {
        return this.fileEncrypted;
    }

    @Nullable
    public final String getFileKey() {
        return this.fileKey;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }
}
