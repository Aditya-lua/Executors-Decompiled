package p268l9;

import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import bb.BinderC1294b;
import bb.C1295c;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: l9.g */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8036g extends IInterface {

    /* JADX INFO: renamed from: l9.g$a */
    public static abstract class a extends BinderC1294b implements InterfaceC8036g {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override // bb.BinderC1294b
        /* JADX INFO: renamed from: r2 */
        public final boolean mo7089r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            Status status = (Status) C1295c.m7090a(parcel, Status.CREATOR);
            C1295c.m7091b(parcel);
            mo33169Z0(status);
            return true;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    void mo33169Z0(@NonNull Status status);
}
