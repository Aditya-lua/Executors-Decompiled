package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f3151j = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    /* JADX INFO: renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0052a extends Binder implements a {

        /* JADX INFO: renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        public static class C0053a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f3152a;

            public C0053a(IBinder iBinder) {
                this.f3152a = iBinder;
            }

            @Override // androidx.room.a
            public void A(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f3151j);
                    parcelObtain.writeStringArray(strArr);
                    this.f3152a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f3152a;
            }
        }

        public AbstractBinderC0052a() {
            attachInterface(this, a.f3151j);
        }

        public static a r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f3151j);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0053a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = a.f3151j;
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
            A(parcel.createStringArray());
            return true;
        }
    }

    void A(String[] strArr);
}
