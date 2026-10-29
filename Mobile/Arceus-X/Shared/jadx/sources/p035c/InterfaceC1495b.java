package p035c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1495b extends IInterface {

    /* JADX INFO: renamed from: m */
    public static final String f5774m = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    /* JADX INFO: renamed from: c.b$a */
    public static abstract class a extends Binder implements InterfaceC1495b {

        /* JADX INFO: renamed from: c.b$a$a, reason: collision with other inner class name */
        public static class C14097a implements InterfaceC1495b {

            /* JADX INFO: renamed from: a */
            public IBinder f5775a;

            public C14097a(IBinder iBinder) {
                this.f5775a = iBinder;
            }

            @Override // p035c.InterfaceC1495b
            /* JADX INFO: renamed from: J */
            public boolean mo7637J(InterfaceC1494a interfaceC1494a) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1495b.f5774m);
                    parcelObtain.writeStrongInterface(interfaceC1494a);
                    this.f5775a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f5775a;
            }

            @Override // p035c.InterfaceC1495b
            /* JADX INFO: renamed from: h1 */
            public boolean mo7638h1(long j10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1495b.f5774m);
                    parcelObtain.writeLong(j10);
                    this.f5775a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p035c.InterfaceC1495b
            /* JADX INFO: renamed from: j1 */
            public boolean mo7639j1(InterfaceC1494a interfaceC1494a, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1495b.f5774m);
                    parcelObtain.writeStrongInterface(interfaceC1494a);
                    b.m7645b(parcelObtain, uri, 0);
                    this.f5775a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p035c.InterfaceC1495b
            /* JADX INFO: renamed from: l2 */
            public boolean mo7640l2(InterfaceC1494a interfaceC1494a, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1495b.f5774m);
                    parcelObtain.writeStrongInterface(interfaceC1494a);
                    b.m7645b(parcelObtain, uri, 0);
                    b.m7645b(parcelObtain, bundle, 0);
                    this.f5775a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p035c.InterfaceC1495b
            /* JADX INFO: renamed from: m */
            public boolean mo7641m(InterfaceC1494a interfaceC1494a, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1495b.f5774m);
                    parcelObtain.writeStrongInterface(interfaceC1494a);
                    b.m7645b(parcelObtain, bundle, 0);
                    this.f5775a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // p035c.InterfaceC1495b
            /* JADX INFO: renamed from: w0 */
            public int mo7642w0(InterfaceC1494a interfaceC1494a, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1495b.f5774m);
                    parcelObtain.writeStrongInterface(interfaceC1494a);
                    parcelObtain.writeString(str);
                    b.m7645b(parcelObtain, bundle, 0);
                    this.f5775a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        /* JADX INFO: renamed from: r2 */
        public static InterfaceC1495b m7643r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1495b.f5774m);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1495b)) ? new C14097a(iBinder) : (InterfaceC1495b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: c.b$b */
    public static class b {
        /* JADX INFO: renamed from: b */
        public static <T extends Parcelable> void m7645b(Parcel parcel, T t8, int i10) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, i10);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    boolean mo7637J(InterfaceC1494a interfaceC1494a);

    /* JADX INFO: renamed from: h1 */
    boolean mo7638h1(long j10);

    /* JADX INFO: renamed from: j1 */
    boolean mo7639j1(InterfaceC1494a interfaceC1494a, Uri uri);

    /* JADX INFO: renamed from: l2 */
    boolean mo7640l2(InterfaceC1494a interfaceC1494a, Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: m */
    boolean mo7641m(InterfaceC1494a interfaceC1494a, Bundle bundle);

    /* JADX INFO: renamed from: w0 */
    int mo7642w0(InterfaceC1494a interfaceC1494a, String str, Bundle bundle);
}
