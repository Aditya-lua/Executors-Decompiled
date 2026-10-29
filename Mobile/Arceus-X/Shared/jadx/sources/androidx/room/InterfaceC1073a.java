package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: androidx.room.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1073a extends IInterface {

    /* JADX INFO: renamed from: j */
    public static final String f4348j = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.a$a */
    public static abstract class a extends Binder implements InterfaceC1073a {

        /* JADX INFO: renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        public static class C14085a implements InterfaceC1073a {

            /* JADX INFO: renamed from: a */
            public IBinder f4349a;

            public C14085a(IBinder iBinder) {
                this.f4349a = iBinder;
            }

            @Override // androidx.room.InterfaceC1073a
            /* JADX INFO: renamed from: A */
            public void mo6097A(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1073a.f4348j);
                    parcelObtain.writeStringArray(strArr);
                    this.f4349a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4349a;
            }
        }

        public a() {
            attachInterface(this, InterfaceC1073a.f4348j);
        }

        /* JADX INFO: renamed from: r2 */
        public static InterfaceC1073a m6098r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1073a.f4348j);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1073a)) ? new C14085a(iBinder) : (InterfaceC1073a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC1073a.f4348j;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            mo6097A(parcel.createStringArray());
            return true;
        }
    }

    /* JADX INFO: renamed from: A */
    void mo6097A(String[] strArr);
}
