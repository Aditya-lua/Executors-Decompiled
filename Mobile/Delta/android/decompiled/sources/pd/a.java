package pd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import ib.c;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: pd.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0496a extends ib.b implements a {

        /* JADX INFO: renamed from: pd.a$a$a, reason: collision with other inner class name */
        public static class C0497a extends ib.a implements a {
            public C0497a(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsService");
            }

            @Override // pd.a
            public void G0(@NonNull String str, @NonNull Bundle bundle, @NonNull b bVar) {
                Parcel parcelR2 = r2();
                parcelR2.writeString(str);
                c.c(parcelR2, bundle);
                if (bVar == null) {
                    parcelR2.writeStrongBinder(null);
                } else {
                    parcelR2.writeStrongBinder(bVar.asBinder());
                }
                s2(1, parcelR2);
            }
        }

        @NonNull
        public static a s2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0497a(iBinder);
        }
    }

    void G0(@NonNull String str, @NonNull Bundle bundle, @NonNull b bVar);
}
