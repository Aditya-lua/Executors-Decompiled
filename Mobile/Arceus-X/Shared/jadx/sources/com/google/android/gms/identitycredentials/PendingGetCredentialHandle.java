package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sa.C11237r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m31665d2 = {"Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "Landroid/app/PendingIntent;", "pendingIntent", "<init>", "(Landroid/app/PendingIntent;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "f", "Landroid/app/PendingIntent;", "v3", "()Landroid/app/PendingIntent;", "g", "a", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class PendingGetCredentialHandle extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final PendingIntent pendingIntent;

    @NotNull
    public static final Parcelable.Creator<PendingGetCredentialHandle> CREATOR = new C11237r();

    public PendingGetCredentialHandle(@NonNull PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.pendingIntent = pendingIntent;
    }

    @NotNull
    /* JADX INFO: renamed from: v3, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        C11237r.m42287c(this, dest, flags);
    }
}
