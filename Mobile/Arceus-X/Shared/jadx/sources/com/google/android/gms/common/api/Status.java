package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p242k9.C7494d;
import p242k9.C7514x;
import p242k9.InterfaceC7504n;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements InterfaceC7504n, ReflectedParcelable {

    /* JADX INFO: renamed from: f */
    public final int f7412f;

    /* JADX INFO: renamed from: g */
    public final String f7413g;

    /* JADX INFO: renamed from: h */
    public final PendingIntent f7414h;

    /* JADX INFO: renamed from: i */
    public final ConnectionResult f7415i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public static final Status f7404j = new Status(-1);

    /* JADX INFO: renamed from: k */
    @NonNull
    public static final Status f7405k = new Status(0);

    /* JADX INFO: renamed from: l */
    @NonNull
    public static final Status f7406l = new Status(14);

    /* JADX INFO: renamed from: m */
    @NonNull
    public static final Status f7407m = new Status(8);

    /* JADX INFO: renamed from: n */
    @NonNull
    public static final Status f7408n = new Status(15);

    /* JADX INFO: renamed from: o */
    @NonNull
    public static final Status f7409o = new Status(16);

    /* JADX INFO: renamed from: p */
    @NonNull
    public static final Status f7410p = new Status(17);

    /* JADX INFO: renamed from: q */
    @NonNull
    public static final Status f7411q = new Status(18);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new C7514x();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Status(int i10, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f7412f = i10;
        this.f7413g = str;
        this.f7414h = pendingIntent;
        this.f7415i = connectionResult;
    }

    /* JADX INFO: renamed from: A3 */
    public boolean m9163A3() {
        return this.f7412f <= 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f7412f == status.f7412f && C8947k.m36026b(this.f7413g, status.f7413g) && C8947k.m36026b(this.f7414h, status.f7414h) && C8947k.m36026b(this.f7415i, status.f7415i);
    }

    public int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f7412f), this.f7413g, this.f7414h, this.f7415i);
    }

    @Override // p242k9.InterfaceC7504n
    @NonNull
    /* JADX INFO: renamed from: m */
    public Status mo8183m() {
        return this;
    }

    @NonNull
    public String toString() {
        C8947k.a aVarM36028d = C8947k.m36028d(this);
        aVarM36028d.m36029a("statusCode", zza());
        aVarM36028d.m36029a("resolution", this.f7414h);
        return aVarM36028d.toString();
    }

    /* JADX INFO: renamed from: v3 */
    public ConnectionResult m9164v3() {
        return this.f7415i;
    }

    /* JADX INFO: renamed from: w3 */
    public PendingIntent m9165w3() {
        return this.f7414h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, m9166x3());
        C9718b.m38478v(parcel, 2, m9167y3(), false);
        C9718b.m38476t(parcel, 3, this.f7414h, i10, false);
        C9718b.m38476t(parcel, 4, m9164v3(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX INFO: renamed from: x3 */
    public int m9166x3() {
        return this.f7412f;
    }

    /* JADX INFO: renamed from: y3 */
    public String m9167y3() {
        return this.f7413g;
    }

    /* JADX INFO: renamed from: z3 */
    public boolean m9168z3() {
        return this.f7414h != null;
    }

    @NonNull
    public final String zza() {
        String str = this.f7413g;
        return str != null ? str : C7494d.m31132a(this.f7412f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i10) {
        this(i10, str, connectionResult.m9142y3(), connectionResult);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
