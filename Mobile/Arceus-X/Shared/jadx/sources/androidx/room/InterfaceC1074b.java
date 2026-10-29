package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: androidx.room.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1074b extends IInterface {

    /* JADX INFO: renamed from: k */
    public static final String f4350k = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.b$a */
    public static abstract class a extends Binder implements InterfaceC1074b {

        /* JADX INFO: renamed from: androidx.room.b$a$a, reason: collision with other inner class name */
        public static class C14086a implements InterfaceC1074b {

            /* JADX INFO: renamed from: a */
            public IBinder f4351a;

            public C14086a(IBinder iBinder) {
                this.f4351a = iBinder;
            }

            @Override // androidx.room.InterfaceC1074b
            /* JADX INFO: renamed from: B0 */
            public void mo6093B0(int i10, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1074b.f4350k);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeStringArray(strArr);
                    this.f4351a.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC1074b
            /* JADX INFO: renamed from: Y0 */
            public int mo6094Y0(InterfaceC1073a interfaceC1073a, String str) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1074b.f4350k);
                    parcelObtain.writeStrongInterface(interfaceC1073a);
                    parcelObtain.writeString(str);
                    this.f4351a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4351a;
            }

            @Override // androidx.room.InterfaceC1074b
            /* JADX INFO: renamed from: n2 */
            public void mo6095n2(InterfaceC1073a interfaceC1073a, int i10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1074b.f4350k);
                    parcelObtain.writeStrongInterface(interfaceC1073a);
                    parcelObtain.writeInt(i10);
                    this.f4351a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, InterfaceC1074b.f4350k);
        }

        /* JADX INFO: renamed from: r2 */
        public static InterfaceC1074b m6099r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1074b.f4350k);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1074b)) ? new C14086a(iBinder) : (InterfaceC1074b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = InterfaceC1074b.f4350k;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i10 == 1) {
                int iMo6094Y0 = mo6094Y0(InterfaceC1073a.a.m6098r2(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iMo6094Y0);
            } else if (i10 == 2) {
                mo6095n2(InterfaceC1073a.a.m6098r2(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                mo6093B0(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: B0 */
    void mo6093B0(int i10, String[] strArr);

    /* JADX INFO: renamed from: Y0 */
    int mo6094Y0(InterfaceC1073a interfaceC1073a, String str);

    /* JADX INFO: renamed from: n2 */
    void mo6095n2(InterfaceC1073a interfaceC1073a, int i10);
}
