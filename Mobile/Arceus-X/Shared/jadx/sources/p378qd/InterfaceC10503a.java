package p378qd;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.NonNull;
import p193ib.BinderC6720b;
import p193ib.C6719a;
import p193ib.C6721c;

/* JADX INFO: renamed from: qd.a */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10503a extends IInterface {

    /* JADX INFO: renamed from: qd.a$a */
    public static abstract class a extends BinderC6720b implements InterfaceC10503a {

        /* JADX INFO: renamed from: qd.a$a$a, reason: collision with other inner class name */
        public static class C14234a extends C6719a implements InterfaceC10503a {
            public C14234a(IBinder iBinder) {
                super(iBinder, "com.google.android.play.agesignals.protocol.IAgeSignalsService");
            }

            @Override // p378qd.InterfaceC10503a
            /* JADX INFO: renamed from: y1 */
            public void mo40332y1(@NonNull String str, @NonNull Bundle bundle, @NonNull InterfaceC10504b interfaceC10504b) {
                Parcel parcelM28812r2 = m28812r2();
                parcelM28812r2.writeString(str);
                C6721c.m28817c(parcelM28812r2, bundle);
                if (interfaceC10504b == null) {
                    parcelM28812r2.writeStrongBinder(null);
                } else {
                    parcelM28812r2.writeStrongBinder(interfaceC10504b.asBinder());
                }
                m28813s2(1, parcelM28812r2);
            }
        }

        @NonNull
        /* JADX INFO: renamed from: s2 */
        public static InterfaceC10503a m40333s2(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.agesignals.protocol.IAgeSignalsService");
            return iInterfaceQueryLocalInterface instanceof InterfaceC10503a ? (InterfaceC10503a) iInterfaceQueryLocalInterface : new C14234a(iBinder);
        }
    }

    /* JADX INFO: renamed from: y1 */
    void mo40332y1(@NonNull String str, @NonNull Bundle bundle, @NonNull InterfaceC10504b interfaceC10504b);
}
