package com.withpersona.sdk2.inquiry.document;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentPages;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "documentStartPage", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "uploadOptionsDialog", "<init>", "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "()Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;", "b", "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "f", "()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;", "document_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentPages implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DocumentPages> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DocumentStartPage documentStartPage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final UploadOptionsDialog uploadOptionsDialog;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DocumentPages> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentPages createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DocumentPages(DocumentStartPage.CREATOR.createFromParcel(parcel), UploadOptionsDialog.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DocumentPages[] newArray(int i10) {
            return new DocumentPages[i10];
        }
    }

    public DocumentPages(@NotNull DocumentStartPage documentStartPage, @NotNull UploadOptionsDialog uploadOptionsDialog) {
        Intrinsics.checkNotNullParameter(documentStartPage, "documentStartPage");
        Intrinsics.checkNotNullParameter(uploadOptionsDialog, "uploadOptionsDialog");
        this.documentStartPage = documentStartPage;
        this.uploadOptionsDialog = uploadOptionsDialog;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DocumentStartPage getDocumentStartPage() {
        return this.documentStartPage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final UploadOptionsDialog getUploadOptionsDialog() {
        return this.uploadOptionsDialog;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.documentStartPage.writeToParcel(dest, flags);
        this.uploadOptionsDialog.writeToParcel(dest, flags);
    }
}
