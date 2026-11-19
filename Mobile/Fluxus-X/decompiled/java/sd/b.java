package sd;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import jb.c;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends IInterface {

    public static abstract class a extends jb.b implements b {
        public a() {
            super("com.google.android.play.agesignals.protocol.IAgeSignalsServiceCallback");
        }

        @Override // jb.b
        public boolean r2(int i10, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i11) {
            if (i10 == 1) {
                Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                P(bundle);
            } else {
                if (i10 != 3) {
                    return false;
                }
                Bundle bundle2 = (Bundle) c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                L0(bundle2);
            }
            return true;
        }
    }

    void L0(@NonNull Bundle bundle);

    void P(@NonNull Bundle bundle);
}
