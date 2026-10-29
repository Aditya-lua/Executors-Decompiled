package com.withpersona.sdk2.inquiry.steps.ui.mdoc;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qt.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;", "Landroid/os/Parcelable;", "GoogleWalletRequestMetadata", "a", "Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$GoogleWalletRequestMetadata;", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MdocRequestMetadata extends Parcelable {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$GoogleWalletRequestMetadata;", "Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata;", "", "nonce", "Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$a;", "idType", "requestJson", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$a;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getNonce", "b", "Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$a;", "getIdType", "()Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$a;", "c", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GoogleWalletRequestMetadata implements MdocRequestMetadata {

        @NotNull
        public static final Parcelable.Creator<GoogleWalletRequestMetadata> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String nonce;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final a idType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String requestJson;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GoogleWalletRequestMetadata> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GoogleWalletRequestMetadata createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GoogleWalletRequestMetadata(parcel.readString(), a.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GoogleWalletRequestMetadata[] newArray(int i10) {
                return new GoogleWalletRequestMetadata[i10];
            }
        }

        public GoogleWalletRequestMetadata(@NotNull String nonce, @NotNull a idType, @NotNull String requestJson) {
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(idType, "idType");
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            this.nonce = nonce;
            this.idType = idType;
            this.requestJson = requestJson;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getRequestJson() {
            return this.requestJson;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GoogleWalletRequestMetadata)) {
                return false;
            }
            GoogleWalletRequestMetadata googleWalletRequestMetadata = (GoogleWalletRequestMetadata) other;
            return Intrinsics.c(this.nonce, googleWalletRequestMetadata.nonce) && this.idType == googleWalletRequestMetadata.idType && Intrinsics.c(this.requestJson, googleWalletRequestMetadata.requestJson);
        }

        public int hashCode() {
            return (((this.nonce.hashCode() * 31) + this.idType.hashCode()) * 31) + this.requestJson.hashCode();
        }

        @NotNull
        public String toString() {
            return "GoogleWalletRequestMetadata(nonce=" + this.nonce + ", idType=" + this.idType + ", requestJson=" + this.requestJson + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.nonce);
            dest.writeString(this.idType.name());
            dest.writeString(this.requestJson);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/mdoc/MdocRequestMetadata$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        DL,
        PP;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ qt.a f13607d = b.a(a());
    }
}
