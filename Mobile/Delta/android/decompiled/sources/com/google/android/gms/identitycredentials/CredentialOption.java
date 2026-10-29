package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import sa.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005BE\b\u0007\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR \u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR \u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0018\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001a¨\u0006+"}, d2 = {"Lcom/google/android/gms/identitycredentials/CredentialOption;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "", Payload.TYPE, "credentialRetrievalData", "candidateQueryData", "requestMatcher", "requestType", "protocolType", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "toBundle", "()Landroid/os/Bundle;", "f", "Ljava/lang/String;", "A3", "()Ljava/lang/String;", "g", "Landroid/os/Bundle;", "w3", "h", "v3", "i", "y3", "j", "z3", "getRequestType$annotations", "()V", "k", "x3", "getProtocolType$annotations", "l", "a", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CredentialOption extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Bundle credentialRetrievalData;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Bundle candidateQueryData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String requestMatcher;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String requestType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String protocolType;

    @NotNull
    public static final Parcelable.Creator<CredentialOption> CREATOR = new i();

    public CredentialOption(@NonNull String type, @NonNull Bundle credentialRetrievalData, @NonNull Bundle candidateQueryData, @NonNull String requestMatcher, @NonNull String requestType, @NonNull String protocolType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(credentialRetrievalData, "credentialRetrievalData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(requestMatcher, "requestMatcher");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(protocolType, "protocolType");
        this.type = type;
        this.credentialRetrievalData = credentialRetrievalData;
        this.candidateQueryData = candidateQueryData;
        this.requestMatcher = requestMatcher;
        this.requestType = requestType;
        this.protocolType = protocolType;
        boolean z10 = (StringsKt.p0(requestType) || StringsKt.p0(protocolType)) ? false : true;
        boolean z11 = !StringsKt.p0(type) && requestType.length() == 0 && protocolType.length() == 0;
        if (z10 || z11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(type).length() + 31 + String.valueOf(requestType).length() + 19 + String.valueOf(protocolType).length() + 69);
        sb2.append("Either type: ");
        sb2.append(type);
        sb2.append(", or requestType: ");
        sb2.append(requestType);
        sb2.append(" and protocolType: ");
        sb2.append(protocolType);
        sb2.append(" must be specified, but at least one contains an invalid blank value.");
        throw new IllegalArgumentException(sb2.toString());
    }

    @NotNull
    /* JADX INFO: renamed from: A3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: v3, reason: from getter */
    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    @NotNull
    /* JADX INFO: renamed from: w3, reason: from getter */
    public final Bundle getCredentialRetrievalData() {
        return this.credentialRetrievalData;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        i.c(this, dest, flags);
    }

    @NotNull
    /* JADX INFO: renamed from: x3, reason: from getter */
    public final String getProtocolType() {
        return this.protocolType;
    }

    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public final String getRequestMatcher() {
        return this.requestMatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: z3, reason: from getter */
    public final String getRequestType() {
        return this.requestType;
    }
}
