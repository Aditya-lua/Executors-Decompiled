package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sa.C11242w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB)\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m31665d2 = {"Lcom/google/android/gms/identitycredentials/SignalCredentialStateRequest;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", Payload.TYPE, "origin", "Landroid/os/Bundle;", "requestData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "f", "Ljava/lang/String;", "x3", "()Ljava/lang/String;", "g", "v3", "h", "Landroid/os/Bundle;", "w3", "()Landroid/os/Bundle;", "i", "a", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class SignalCredentialStateRequest extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final String type;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final String origin;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Bundle requestData;

    @NotNull
    public static final Parcelable.Creator<SignalCredentialStateRequest> CREATOR = new C11242w();

    public SignalCredentialStateRequest(@NonNull String type, @Nullable String str, @NonNull Bundle requestData) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        this.type = type;
        this.origin = str;
        this.requestData = requestData;
    }

    /* JADX INFO: renamed from: v3, reason: from getter */
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    /* JADX INFO: renamed from: w3, reason: from getter */
    public final Bundle getRequestData() {
        return this.requestData;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        C11242w.m42302c(this, dest, flags);
    }

    @NotNull
    /* JADX INFO: renamed from: x3, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
