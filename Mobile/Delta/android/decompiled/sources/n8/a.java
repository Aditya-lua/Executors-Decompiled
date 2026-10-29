package n8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import x7.b;
import x7.c;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: n8.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0438a extends b implements a {

        /* JADX INFO: renamed from: n8.a$a$a, reason: collision with other inner class name */
        public static class C0439a extends x7.a implements a {
            public C0439a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // n8.a
            public final Bundle b(Bundle bundle) {
                Parcel parcelR2 = r2();
                c.b(parcelR2, bundle);
                Parcel parcelS2 = s2(parcelR2);
                Bundle bundle2 = (Bundle) c.a(parcelS2, Bundle.CREATOR);
                parcelS2.recycle();
                return bundle2;
            }
        }

        public static a r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0439a(iBinder);
        }
    }

    Bundle b(Bundle bundle);
}
