package p304n8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p538x7.BinderC12765b;
import p538x7.C12764a;
import p538x7.C12766c;

/* JADX INFO: renamed from: n8.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8916a extends IInterface {

    /* JADX INFO: renamed from: n8.a$a */
    public static abstract class a extends BinderC12765b implements InterfaceC8916a {

        /* JADX INFO: renamed from: n8.a$a$a, reason: collision with other inner class name */
        public static class C14201a extends C12764a implements InterfaceC8916a {
            public C14201a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // p304n8.InterfaceC8916a
            /* JADX INFO: renamed from: b */
            public final Bundle mo35949b(Bundle bundle) {
                Parcel parcelM47632r2 = m47632r2();
                C12766c.m47635b(parcelM47632r2, bundle);
                Parcel parcelM47633s2 = m47633s2(parcelM47632r2);
                Bundle bundle2 = (Bundle) C12766c.m47634a(parcelM47633s2, Bundle.CREATOR);
                parcelM47633s2.recycle();
                return bundle2;
            }
        }

        /* JADX INFO: renamed from: r2 */
        public static InterfaceC8916a m35950r2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof InterfaceC8916a ? (InterfaceC8916a) iInterfaceQueryLocalInterface : new C14201a(iBinder);
        }
    }

    /* JADX INFO: renamed from: b */
    Bundle mo35949b(Bundle bundle);
}
