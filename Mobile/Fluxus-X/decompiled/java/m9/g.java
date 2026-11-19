package m9;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public interface g extends IInterface {

    public static abstract class a extends cb.b implements g {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // cb.b
        public final boolean r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) cb.c.a(parcel, Status.CREATOR);
            cb.c.b(parcel);
            j1(status);
            return true;
        }
    }

    void j1(@NonNull Status status);
}
