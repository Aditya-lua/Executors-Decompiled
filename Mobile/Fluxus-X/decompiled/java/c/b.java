package c;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface b extends IInterface {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f4604m = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: c.b$a$a, reason: collision with other inner class name */
        public static class C0089a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f4605a;

            public C0089a(IBinder iBinder) {
                this.f4605a = iBinder;
            }

            @Override // c.b
            public int B0(c.a aVar, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f4604m);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    C0090b.b(parcelObtain, bundle, 0);
                    this.f4605a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean K(c.a aVar) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f4604m);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f4605a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4605a;
            }

            @Override // c.b
            public boolean m(c.a aVar, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f4604m);
                    parcelObtain.writeStrongInterface(aVar);
                    C0090b.b(parcelObtain, bundle, 0);
                    this.f4605a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean m2(c.a aVar, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f4604m);
                    parcelObtain.writeStrongInterface(aVar);
                    C0090b.b(parcelObtain, uri, 0);
                    C0090b.b(parcelObtain, bundle, 0);
                    this.f4605a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean p1(long j10) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f4604m);
                    parcelObtain.writeLong(j10);
                    this.f4605a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // c.b
            public boolean r1(c.a aVar, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f4604m);
                    parcelObtain.writeStrongInterface(aVar);
                    C0090b.b(parcelObtain, uri, 0);
                    this.f4605a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static b r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f4604m);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0089a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }
    }

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    public static class C0090b {
        public static <T extends Parcelable> void b(Parcel parcel, T t8, int i10) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t8.writeToParcel(parcel, i10);
            }
        }
    }

    int B0(c.a aVar, String str, Bundle bundle);

    boolean K(c.a aVar);

    boolean m(c.a aVar, Bundle bundle);

    boolean m2(c.a aVar, Uri uri, Bundle bundle);

    boolean p1(long j10);

    boolean r1(c.a aVar, Uri uri);
}
