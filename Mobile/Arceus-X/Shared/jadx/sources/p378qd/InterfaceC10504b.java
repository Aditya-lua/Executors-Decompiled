package p378qd;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import p193ib.BinderC6720b;
import p193ib.C6721c;

/* JADX INFO: renamed from: qd.b */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10504b extends IInterface {

    /* JADX INFO: renamed from: qd.b$a */
    public static abstract class a extends BinderC6720b implements InterfaceC10504b {
        public a() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        }

        @Override // p193ib.BinderC6720b
        /* JADX INFO: renamed from: r2 */
        public boolean mo28814r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            if (i10 == 1) {
                Bundle bundle = (Bundle) C6721c.m28815a(parcel, Bundle.CREATOR);
                C6721c.m28816b(parcel);
                mo39291O(bundle);
            } else {
                if (i10 != 3) {
                    return false;
                }
                Bundle bundle2 = (Bundle) C6721c.m28815a(parcel, Bundle.CREATOR);
                C6721c.m28816b(parcel);
                mo39290C0(bundle2);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: C0 */
    void mo39290C0(@NonNull Bundle bundle);

    /* JADX INFO: renamed from: O */
    void mo39291O(@NonNull Bundle bundle);
}
