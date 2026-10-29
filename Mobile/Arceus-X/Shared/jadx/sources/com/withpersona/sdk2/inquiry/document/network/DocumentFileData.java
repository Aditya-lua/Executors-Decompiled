package com.withpersona.sdk2.inquiry.document.network;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.InterfaceC11874i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u0010"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData;", "", "", "id", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "attributes", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "()Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "Attributes", "RemoteDocumentFile", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@InterfaceC11874i(generateAdapter = true)
public final class DocumentFileData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final Attributes attributes;

    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$Attributes;", "", "", "Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;", "originals", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class Attributes {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final List<RemoteDocumentFile> originals;

        public Attributes(@Nullable List<RemoteDocumentFile> list) {
            this.originals = list;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final List<RemoteDocumentFile> m16671a() {
            return this.originals;
        }
    }

    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/DocumentFileData$RemoteDocumentFile;", "", "", "url", "filename", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "document_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final class RemoteDocumentFile {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final String url;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String filename;

        public RemoteDocumentFile(@NotNull String url, @NotNull String filename) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(filename, "filename");
            this.url = url;
            this.filename = filename;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFilename() {
            return this.filename;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getUrl() {
            return this.url;
        }
    }

    public DocumentFileData(@NotNull String id2, @Nullable Attributes attributes) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.attributes = attributes;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Attributes getAttributes() {
        return this.attributes;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }
}
