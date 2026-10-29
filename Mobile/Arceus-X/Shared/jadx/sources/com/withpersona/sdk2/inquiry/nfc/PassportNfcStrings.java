package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\bG\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001d\u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020'HÖ\u0001¢\u0006\u0004\b2\u0010)J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u00101R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u00101R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u00101R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\b@\u00101R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u00109\u001a\u0004\bB\u00101R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u00101R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u00109\u001a\u0004\bF\u00101R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u00109\u001a\u0004\bH\u00101R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00109\u001a\u0004\bJ\u00101R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u00109\u001a\u0004\bL\u00101R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u00109\u001a\u0004\bN\u00101R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u00109\u001a\u0004\bP\u00101R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u00109\u001a\u0004\bR\u00101R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u00109\u001a\u0004\bT\u00101R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u00109\u001a\u0004\bV\u00101R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u00109\u001a\u0004\bX\u00101R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u00109\u001a\u0004\bZ\u00101R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u00109\u001a\u0004\b\\\u00101R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u00109\u001a\u0004\b^\u00101R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b_\u00109\u001a\u0004\b`\u00101R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u00109\u001a\u0004\bb\u00101R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u00109\u001a\u0004\bd\u00101R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u00109\u001a\u0004\bf\u00101R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u00109\u001a\u0004\bh\u00101R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u00109\u001a\u0004\bj\u00101R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bk\u00109\u001a\u0004\bl\u00101R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bm\u00109\u001a\u0004\bn\u00101R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bo\u00109\u001a\u0004\bp\u00101R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bq\u00109\u001a\u0004\br\u00101R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bs\u00109\u001a\u0004\bt\u00101R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bu\u00109\u001a\u0004\bv\u00101R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bw\u00109\u001a\u0004\b8\u00101R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bx\u00109\u001a\u0004\by\u00101R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bz\u00109\u001a\u0004\b{\u00101¨\u0006|"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;", "Landroid/os/Parcelable;", "", "nfcScanPromptTitle", "nfcScanPromptDescription", "authenticatingDescription", "authenticatingTitle", "readingDescription", "readingTitle", "cancelNfcScan", "nfcScanSuccessTitle", "nfcScanSuccessDescription", "enablePassportNfcText", "enablePassportNfcConfirmButtonText", "enablePassportNfcCancelButtonText", "connectionLostText", "connectionLostConfirmButtonText", "authenticationErrorText", "authenticationErrorConfirmButtonText", "genericErrorText", "genericErrorConfirmButtonText", "errorModalChipNotDetectedTitle", "errorModalChipNotDetectedText", "errorModalLostConnectionTitle", "errorModalLostConnectionText", "errorModalIncorrectIdDetailsTitle", "errorModalIncorrectIdDetailsText", "errorModalGenericErrorTitle", "errorModalGenericErrorText", "errorModalTryAgainButtonText", "errorModalTroubleshootingTipsButtonText", "errorModalReenterIdDetailsButtonText", "rescanDocumentPromptTitle", "rescanDocumentPromptDescription", "successfulScanTransitionComponentName", "unableToScanTransitionComponentName", "incorrectIdDetailsTransitionComponentName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getNfcScanPromptTitle", "b", "getNfcScanPromptDescription", "c", "getAuthenticatingDescription", "d", "getAuthenticatingTitle", "e", "getReadingDescription", "f", "getReadingTitle", "g", "getCancelNfcScan", "h", "getNfcScanSuccessTitle", "i", "getNfcScanSuccessDescription", "j", "getEnablePassportNfcText", "k", "getEnablePassportNfcConfirmButtonText", "l", "getEnablePassportNfcCancelButtonText", "m", "getConnectionLostText", "n", "getConnectionLostConfirmButtonText", "o", "getAuthenticationErrorText", "p", "getAuthenticationErrorConfirmButtonText", "q", "getGenericErrorText", "r", "getGenericErrorConfirmButtonText", "s", "getErrorModalChipNotDetectedTitle", "t", "getErrorModalChipNotDetectedText", "u", "getErrorModalLostConnectionTitle", "v", "getErrorModalLostConnectionText", "w", "getErrorModalIncorrectIdDetailsTitle", "x", "getErrorModalIncorrectIdDetailsText", "y", "getErrorModalGenericErrorTitle", "z", "getErrorModalGenericErrorText", "A", "getErrorModalTryAgainButtonText", "B", "getErrorModalTroubleshootingTipsButtonText", "C", "getErrorModalReenterIdDetailsButtonText", "D", "getRescanDocumentPromptTitle", "E", "getRescanDocumentPromptDescription", "F", "G", "getUnableToScanTransitionComponentName", "H", "getIncorrectIdDetailsTransitionComponentName", "nfc_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class PassportNfcStrings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PassportNfcStrings> CREATOR = new C3826a();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalTryAgainButtonText;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalTroubleshootingTipsButtonText;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalReenterIdDetailsButtonText;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    @NotNull
    public final String rescanDocumentPromptTitle;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    @NotNull
    public final String rescanDocumentPromptDescription;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    @NotNull
    public final String successfulScanTransitionComponentName;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
    @NotNull
    public final String unableToScanTransitionComponentName;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
    @NotNull
    public final String incorrectIdDetailsTransitionComponentName;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String nfcScanPromptTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String nfcScanPromptDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String authenticatingDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String authenticatingTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final String readingDescription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final String readingTitle;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final String cancelNfcScan;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final String nfcScanSuccessTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final String nfcScanSuccessDescription;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @NotNull
    public final String enablePassportNfcText;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    public final String enablePassportNfcConfirmButtonText;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    public final String enablePassportNfcCancelButtonText;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @NotNull
    public final String connectionLostText;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @NotNull
    public final String connectionLostConfirmButtonText;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @NotNull
    public final String authenticationErrorText;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @NotNull
    public final String authenticationErrorConfirmButtonText;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata and from toString */
    @NotNull
    public final String genericErrorText;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @NotNull
    public final String genericErrorConfirmButtonText;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalChipNotDetectedTitle;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalChipNotDetectedText;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalLostConnectionTitle;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalLostConnectionText;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalIncorrectIdDetailsTitle;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalIncorrectIdDetailsText;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalGenericErrorTitle;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata and from toString */
    @NotNull
    public final String errorModalGenericErrorText;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.nfc.PassportNfcStrings$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3826a implements Parcelable.Creator<PassportNfcStrings> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PassportNfcStrings createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PassportNfcStrings(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PassportNfcStrings[] newArray(int i10) {
            return new PassportNfcStrings[i10];
        }
    }

    public PassportNfcStrings(@NotNull String nfcScanPromptTitle, @NotNull String nfcScanPromptDescription, @NotNull String authenticatingDescription, @NotNull String authenticatingTitle, @NotNull String readingDescription, @NotNull String readingTitle, @NotNull String cancelNfcScan, @NotNull String nfcScanSuccessTitle, @NotNull String nfcScanSuccessDescription, @NotNull String enablePassportNfcText, @NotNull String enablePassportNfcConfirmButtonText, @NotNull String enablePassportNfcCancelButtonText, @NotNull String connectionLostText, @NotNull String connectionLostConfirmButtonText, @NotNull String authenticationErrorText, @NotNull String authenticationErrorConfirmButtonText, @NotNull String genericErrorText, @NotNull String genericErrorConfirmButtonText, @NotNull String errorModalChipNotDetectedTitle, @NotNull String errorModalChipNotDetectedText, @NotNull String errorModalLostConnectionTitle, @NotNull String errorModalLostConnectionText, @NotNull String errorModalIncorrectIdDetailsTitle, @NotNull String errorModalIncorrectIdDetailsText, @NotNull String errorModalGenericErrorTitle, @NotNull String errorModalGenericErrorText, @NotNull String errorModalTryAgainButtonText, @NotNull String errorModalTroubleshootingTipsButtonText, @NotNull String errorModalReenterIdDetailsButtonText, @NotNull String rescanDocumentPromptTitle, @NotNull String rescanDocumentPromptDescription, @NotNull String successfulScanTransitionComponentName, @NotNull String unableToScanTransitionComponentName, @NotNull String incorrectIdDetailsTransitionComponentName) {
        Intrinsics.checkNotNullParameter(nfcScanPromptTitle, "nfcScanPromptTitle");
        Intrinsics.checkNotNullParameter(nfcScanPromptDescription, "nfcScanPromptDescription");
        Intrinsics.checkNotNullParameter(authenticatingDescription, "authenticatingDescription");
        Intrinsics.checkNotNullParameter(authenticatingTitle, "authenticatingTitle");
        Intrinsics.checkNotNullParameter(readingDescription, "readingDescription");
        Intrinsics.checkNotNullParameter(readingTitle, "readingTitle");
        Intrinsics.checkNotNullParameter(cancelNfcScan, "cancelNfcScan");
        Intrinsics.checkNotNullParameter(nfcScanSuccessTitle, "nfcScanSuccessTitle");
        Intrinsics.checkNotNullParameter(nfcScanSuccessDescription, "nfcScanSuccessDescription");
        Intrinsics.checkNotNullParameter(enablePassportNfcText, "enablePassportNfcText");
        Intrinsics.checkNotNullParameter(enablePassportNfcConfirmButtonText, "enablePassportNfcConfirmButtonText");
        Intrinsics.checkNotNullParameter(enablePassportNfcCancelButtonText, "enablePassportNfcCancelButtonText");
        Intrinsics.checkNotNullParameter(connectionLostText, "connectionLostText");
        Intrinsics.checkNotNullParameter(connectionLostConfirmButtonText, "connectionLostConfirmButtonText");
        Intrinsics.checkNotNullParameter(authenticationErrorText, "authenticationErrorText");
        Intrinsics.checkNotNullParameter(authenticationErrorConfirmButtonText, "authenticationErrorConfirmButtonText");
        Intrinsics.checkNotNullParameter(genericErrorText, "genericErrorText");
        Intrinsics.checkNotNullParameter(genericErrorConfirmButtonText, "genericErrorConfirmButtonText");
        Intrinsics.checkNotNullParameter(errorModalChipNotDetectedTitle, "errorModalChipNotDetectedTitle");
        Intrinsics.checkNotNullParameter(errorModalChipNotDetectedText, "errorModalChipNotDetectedText");
        Intrinsics.checkNotNullParameter(errorModalLostConnectionTitle, "errorModalLostConnectionTitle");
        Intrinsics.checkNotNullParameter(errorModalLostConnectionText, "errorModalLostConnectionText");
        Intrinsics.checkNotNullParameter(errorModalIncorrectIdDetailsTitle, "errorModalIncorrectIdDetailsTitle");
        Intrinsics.checkNotNullParameter(errorModalIncorrectIdDetailsText, "errorModalIncorrectIdDetailsText");
        Intrinsics.checkNotNullParameter(errorModalGenericErrorTitle, "errorModalGenericErrorTitle");
        Intrinsics.checkNotNullParameter(errorModalGenericErrorText, "errorModalGenericErrorText");
        Intrinsics.checkNotNullParameter(errorModalTryAgainButtonText, "errorModalTryAgainButtonText");
        Intrinsics.checkNotNullParameter(errorModalTroubleshootingTipsButtonText, "errorModalTroubleshootingTipsButtonText");
        Intrinsics.checkNotNullParameter(errorModalReenterIdDetailsButtonText, "errorModalReenterIdDetailsButtonText");
        Intrinsics.checkNotNullParameter(rescanDocumentPromptTitle, "rescanDocumentPromptTitle");
        Intrinsics.checkNotNullParameter(rescanDocumentPromptDescription, "rescanDocumentPromptDescription");
        Intrinsics.checkNotNullParameter(successfulScanTransitionComponentName, "successfulScanTransitionComponentName");
        Intrinsics.checkNotNullParameter(unableToScanTransitionComponentName, "unableToScanTransitionComponentName");
        Intrinsics.checkNotNullParameter(incorrectIdDetailsTransitionComponentName, "incorrectIdDetailsTransitionComponentName");
        this.nfcScanPromptTitle = nfcScanPromptTitle;
        this.nfcScanPromptDescription = nfcScanPromptDescription;
        this.authenticatingDescription = authenticatingDescription;
        this.authenticatingTitle = authenticatingTitle;
        this.readingDescription = readingDescription;
        this.readingTitle = readingTitle;
        this.cancelNfcScan = cancelNfcScan;
        this.nfcScanSuccessTitle = nfcScanSuccessTitle;
        this.nfcScanSuccessDescription = nfcScanSuccessDescription;
        this.enablePassportNfcText = enablePassportNfcText;
        this.enablePassportNfcConfirmButtonText = enablePassportNfcConfirmButtonText;
        this.enablePassportNfcCancelButtonText = enablePassportNfcCancelButtonText;
        this.connectionLostText = connectionLostText;
        this.connectionLostConfirmButtonText = connectionLostConfirmButtonText;
        this.authenticationErrorText = authenticationErrorText;
        this.authenticationErrorConfirmButtonText = authenticationErrorConfirmButtonText;
        this.genericErrorText = genericErrorText;
        this.genericErrorConfirmButtonText = genericErrorConfirmButtonText;
        this.errorModalChipNotDetectedTitle = errorModalChipNotDetectedTitle;
        this.errorModalChipNotDetectedText = errorModalChipNotDetectedText;
        this.errorModalLostConnectionTitle = errorModalLostConnectionTitle;
        this.errorModalLostConnectionText = errorModalLostConnectionText;
        this.errorModalIncorrectIdDetailsTitle = errorModalIncorrectIdDetailsTitle;
        this.errorModalIncorrectIdDetailsText = errorModalIncorrectIdDetailsText;
        this.errorModalGenericErrorTitle = errorModalGenericErrorTitle;
        this.errorModalGenericErrorText = errorModalGenericErrorText;
        this.errorModalTryAgainButtonText = errorModalTryAgainButtonText;
        this.errorModalTroubleshootingTipsButtonText = errorModalTroubleshootingTipsButtonText;
        this.errorModalReenterIdDetailsButtonText = errorModalReenterIdDetailsButtonText;
        this.rescanDocumentPromptTitle = rescanDocumentPromptTitle;
        this.rescanDocumentPromptDescription = rescanDocumentPromptDescription;
        this.successfulScanTransitionComponentName = successfulScanTransitionComponentName;
        this.unableToScanTransitionComponentName = unableToScanTransitionComponentName;
        this.incorrectIdDetailsTransitionComponentName = incorrectIdDetailsTransitionComponentName;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSuccessfulScanTransitionComponentName() {
        return this.successfulScanTransitionComponentName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportNfcStrings)) {
            return false;
        }
        PassportNfcStrings passportNfcStrings = (PassportNfcStrings) other;
        return Intrinsics.m31980c(this.nfcScanPromptTitle, passportNfcStrings.nfcScanPromptTitle) && Intrinsics.m31980c(this.nfcScanPromptDescription, passportNfcStrings.nfcScanPromptDescription) && Intrinsics.m31980c(this.authenticatingDescription, passportNfcStrings.authenticatingDescription) && Intrinsics.m31980c(this.authenticatingTitle, passportNfcStrings.authenticatingTitle) && Intrinsics.m31980c(this.readingDescription, passportNfcStrings.readingDescription) && Intrinsics.m31980c(this.readingTitle, passportNfcStrings.readingTitle) && Intrinsics.m31980c(this.cancelNfcScan, passportNfcStrings.cancelNfcScan) && Intrinsics.m31980c(this.nfcScanSuccessTitle, passportNfcStrings.nfcScanSuccessTitle) && Intrinsics.m31980c(this.nfcScanSuccessDescription, passportNfcStrings.nfcScanSuccessDescription) && Intrinsics.m31980c(this.enablePassportNfcText, passportNfcStrings.enablePassportNfcText) && Intrinsics.m31980c(this.enablePassportNfcConfirmButtonText, passportNfcStrings.enablePassportNfcConfirmButtonText) && Intrinsics.m31980c(this.enablePassportNfcCancelButtonText, passportNfcStrings.enablePassportNfcCancelButtonText) && Intrinsics.m31980c(this.connectionLostText, passportNfcStrings.connectionLostText) && Intrinsics.m31980c(this.connectionLostConfirmButtonText, passportNfcStrings.connectionLostConfirmButtonText) && Intrinsics.m31980c(this.authenticationErrorText, passportNfcStrings.authenticationErrorText) && Intrinsics.m31980c(this.authenticationErrorConfirmButtonText, passportNfcStrings.authenticationErrorConfirmButtonText) && Intrinsics.m31980c(this.genericErrorText, passportNfcStrings.genericErrorText) && Intrinsics.m31980c(this.genericErrorConfirmButtonText, passportNfcStrings.genericErrorConfirmButtonText) && Intrinsics.m31980c(this.errorModalChipNotDetectedTitle, passportNfcStrings.errorModalChipNotDetectedTitle) && Intrinsics.m31980c(this.errorModalChipNotDetectedText, passportNfcStrings.errorModalChipNotDetectedText) && Intrinsics.m31980c(this.errorModalLostConnectionTitle, passportNfcStrings.errorModalLostConnectionTitle) && Intrinsics.m31980c(this.errorModalLostConnectionText, passportNfcStrings.errorModalLostConnectionText) && Intrinsics.m31980c(this.errorModalIncorrectIdDetailsTitle, passportNfcStrings.errorModalIncorrectIdDetailsTitle) && Intrinsics.m31980c(this.errorModalIncorrectIdDetailsText, passportNfcStrings.errorModalIncorrectIdDetailsText) && Intrinsics.m31980c(this.errorModalGenericErrorTitle, passportNfcStrings.errorModalGenericErrorTitle) && Intrinsics.m31980c(this.errorModalGenericErrorText, passportNfcStrings.errorModalGenericErrorText) && Intrinsics.m31980c(this.errorModalTryAgainButtonText, passportNfcStrings.errorModalTryAgainButtonText) && Intrinsics.m31980c(this.errorModalTroubleshootingTipsButtonText, passportNfcStrings.errorModalTroubleshootingTipsButtonText) && Intrinsics.m31980c(this.errorModalReenterIdDetailsButtonText, passportNfcStrings.errorModalReenterIdDetailsButtonText) && Intrinsics.m31980c(this.rescanDocumentPromptTitle, passportNfcStrings.rescanDocumentPromptTitle) && Intrinsics.m31980c(this.rescanDocumentPromptDescription, passportNfcStrings.rescanDocumentPromptDescription) && Intrinsics.m31980c(this.successfulScanTransitionComponentName, passportNfcStrings.successfulScanTransitionComponentName) && Intrinsics.m31980c(this.unableToScanTransitionComponentName, passportNfcStrings.unableToScanTransitionComponentName) && Intrinsics.m31980c(this.incorrectIdDetailsTransitionComponentName, passportNfcStrings.incorrectIdDetailsTransitionComponentName);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.nfcScanPromptTitle.hashCode() * 31) + this.nfcScanPromptDescription.hashCode()) * 31) + this.authenticatingDescription.hashCode()) * 31) + this.authenticatingTitle.hashCode()) * 31) + this.readingDescription.hashCode()) * 31) + this.readingTitle.hashCode()) * 31) + this.cancelNfcScan.hashCode()) * 31) + this.nfcScanSuccessTitle.hashCode()) * 31) + this.nfcScanSuccessDescription.hashCode()) * 31) + this.enablePassportNfcText.hashCode()) * 31) + this.enablePassportNfcConfirmButtonText.hashCode()) * 31) + this.enablePassportNfcCancelButtonText.hashCode()) * 31) + this.connectionLostText.hashCode()) * 31) + this.connectionLostConfirmButtonText.hashCode()) * 31) + this.authenticationErrorText.hashCode()) * 31) + this.authenticationErrorConfirmButtonText.hashCode()) * 31) + this.genericErrorText.hashCode()) * 31) + this.genericErrorConfirmButtonText.hashCode()) * 31) + this.errorModalChipNotDetectedTitle.hashCode()) * 31) + this.errorModalChipNotDetectedText.hashCode()) * 31) + this.errorModalLostConnectionTitle.hashCode()) * 31) + this.errorModalLostConnectionText.hashCode()) * 31) + this.errorModalIncorrectIdDetailsTitle.hashCode()) * 31) + this.errorModalIncorrectIdDetailsText.hashCode()) * 31) + this.errorModalGenericErrorTitle.hashCode()) * 31) + this.errorModalGenericErrorText.hashCode()) * 31) + this.errorModalTryAgainButtonText.hashCode()) * 31) + this.errorModalTroubleshootingTipsButtonText.hashCode()) * 31) + this.errorModalReenterIdDetailsButtonText.hashCode()) * 31) + this.rescanDocumentPromptTitle.hashCode()) * 31) + this.rescanDocumentPromptDescription.hashCode()) * 31) + this.successfulScanTransitionComponentName.hashCode()) * 31) + this.unableToScanTransitionComponentName.hashCode()) * 31) + this.incorrectIdDetailsTransitionComponentName.hashCode();
    }

    @NotNull
    public String toString() {
        return "PassportNfcStrings(nfcScanPromptTitle=" + this.nfcScanPromptTitle + ", nfcScanPromptDescription=" + this.nfcScanPromptDescription + ", authenticatingDescription=" + this.authenticatingDescription + ", authenticatingTitle=" + this.authenticatingTitle + ", readingDescription=" + this.readingDescription + ", readingTitle=" + this.readingTitle + ", cancelNfcScan=" + this.cancelNfcScan + ", nfcScanSuccessTitle=" + this.nfcScanSuccessTitle + ", nfcScanSuccessDescription=" + this.nfcScanSuccessDescription + ", enablePassportNfcText=" + this.enablePassportNfcText + ", enablePassportNfcConfirmButtonText=" + this.enablePassportNfcConfirmButtonText + ", enablePassportNfcCancelButtonText=" + this.enablePassportNfcCancelButtonText + ", connectionLostText=" + this.connectionLostText + ", connectionLostConfirmButtonText=" + this.connectionLostConfirmButtonText + ", authenticationErrorText=" + this.authenticationErrorText + ", authenticationErrorConfirmButtonText=" + this.authenticationErrorConfirmButtonText + ", genericErrorText=" + this.genericErrorText + ", genericErrorConfirmButtonText=" + this.genericErrorConfirmButtonText + ", errorModalChipNotDetectedTitle=" + this.errorModalChipNotDetectedTitle + ", errorModalChipNotDetectedText=" + this.errorModalChipNotDetectedText + ", errorModalLostConnectionTitle=" + this.errorModalLostConnectionTitle + ", errorModalLostConnectionText=" + this.errorModalLostConnectionText + ", errorModalIncorrectIdDetailsTitle=" + this.errorModalIncorrectIdDetailsTitle + ", errorModalIncorrectIdDetailsText=" + this.errorModalIncorrectIdDetailsText + ", errorModalGenericErrorTitle=" + this.errorModalGenericErrorTitle + ", errorModalGenericErrorText=" + this.errorModalGenericErrorText + ", errorModalTryAgainButtonText=" + this.errorModalTryAgainButtonText + ", errorModalTroubleshootingTipsButtonText=" + this.errorModalTroubleshootingTipsButtonText + ", errorModalReenterIdDetailsButtonText=" + this.errorModalReenterIdDetailsButtonText + ", rescanDocumentPromptTitle=" + this.rescanDocumentPromptTitle + ", rescanDocumentPromptDescription=" + this.rescanDocumentPromptDescription + ", successfulScanTransitionComponentName=" + this.successfulScanTransitionComponentName + ", unableToScanTransitionComponentName=" + this.unableToScanTransitionComponentName + ", incorrectIdDetailsTransitionComponentName=" + this.incorrectIdDetailsTransitionComponentName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.nfcScanPromptTitle);
        dest.writeString(this.nfcScanPromptDescription);
        dest.writeString(this.authenticatingDescription);
        dest.writeString(this.authenticatingTitle);
        dest.writeString(this.readingDescription);
        dest.writeString(this.readingTitle);
        dest.writeString(this.cancelNfcScan);
        dest.writeString(this.nfcScanSuccessTitle);
        dest.writeString(this.nfcScanSuccessDescription);
        dest.writeString(this.enablePassportNfcText);
        dest.writeString(this.enablePassportNfcConfirmButtonText);
        dest.writeString(this.enablePassportNfcCancelButtonText);
        dest.writeString(this.connectionLostText);
        dest.writeString(this.connectionLostConfirmButtonText);
        dest.writeString(this.authenticationErrorText);
        dest.writeString(this.authenticationErrorConfirmButtonText);
        dest.writeString(this.genericErrorText);
        dest.writeString(this.genericErrorConfirmButtonText);
        dest.writeString(this.errorModalChipNotDetectedTitle);
        dest.writeString(this.errorModalChipNotDetectedText);
        dest.writeString(this.errorModalLostConnectionTitle);
        dest.writeString(this.errorModalLostConnectionText);
        dest.writeString(this.errorModalIncorrectIdDetailsTitle);
        dest.writeString(this.errorModalIncorrectIdDetailsText);
        dest.writeString(this.errorModalGenericErrorTitle);
        dest.writeString(this.errorModalGenericErrorText);
        dest.writeString(this.errorModalTryAgainButtonText);
        dest.writeString(this.errorModalTroubleshootingTipsButtonText);
        dest.writeString(this.errorModalReenterIdDetailsButtonText);
        dest.writeString(this.rescanDocumentPromptTitle);
        dest.writeString(this.rescanDocumentPromptDescription);
        dest.writeString(this.successfulScanTransitionComponentName);
        dest.writeString(this.unableToScanTransitionComponentName);
        dest.writeString(this.incorrectIdDetailsTransitionComponentName);
    }
}
