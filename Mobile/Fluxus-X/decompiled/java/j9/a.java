package j9;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p9.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Intent f20202f;

    public a(@NonNull Intent intent) {
        this.f20202f = intent;
    }

    @NonNull
    public Intent A3() {
        return this.f20202f;
    }

    public String B3() {
        String stringExtra = this.f20202f.getStringExtra("google.message_id");
        return stringExtra == null ? this.f20202f.getStringExtra("message_id") : stringExtra;
    }

    public final Integer C3() {
        if (this.f20202f.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f20202f.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, this.f20202f, i10, false);
        p9.c.b(parcel, iA);
    }
}
