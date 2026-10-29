package p306nb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.BinderC2238p0;
import com.google.android.gms.internal.measurement.C2256q0;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.List;

/* JADX INFO: renamed from: nb.c5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC9025c5 extends BinderC2238p0 implements InterfaceC9042d5 {
    public AbstractBinderC9025c5() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.BinderC2238p0
    /* JADX INFO: renamed from: r2 */
    public final boolean mo9842r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        InterfaceC9140j5 c9108h5 = null;
        InterfaceC9092g5 c9059e5 = null;
        switch (i10) {
            case 1:
                zzbg zzbgVar = (zzbg) C2256q0.m10548b(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36097V(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) C2256q0.m10548b(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36106j0(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36094K1(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) C2256q0.m10548b(parcel, zzbg.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                C2256q0.m10552f(parcel);
                mo36278Q0(zzbgVar2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36099W(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                boolean zM10547a = C2256q0.m10547a(parcel);
                C2256q0.m10552f(parcel);
                List listMo36277G0 = mo36277G0(zzrVar5, zM10547a);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo36277G0);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) C2256q0.m10548b(parcel, zzbg.CREATOR);
                String string3 = parcel.readString();
                C2256q0.m10552f(parcel);
                byte[] bArrMo36103e0 = mo36103e0(zzbgVar3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrMo36103e0);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                C2256q0.m10552f(parcel);
                mo36098V0(j10, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                String strMo36089A0 = mo36089A0(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strMo36089A0);
                return true;
            case 12:
                zzah zzahVar = (zzah) C2256q0.m10548b(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36109q(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) C2256q0.m10548b(parcel, zzah.CREATOR);
                C2256q0.m10552f(parcel);
                mo36280f0(zzahVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zM10547a2 = C2256q0.m10547a(parcel);
                zzr zzrVar8 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                List listMo36101Y1 = mo36101Y1(string7, string8, zM10547a2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo36101Y1);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zM10547a3 = C2256q0.m10547a(parcel);
                C2256q0.m10552f(parcel);
                List listMo36107o = mo36107o(string9, string10, string11, zM10547a3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo36107o);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzr zzrVar9 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                List listMo36104e2 = mo36104e2(string12, string13, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo36104e2);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                C2256q0.m10552f(parcel);
                List listMo36093K = mo36093K(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo36093K);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36100W0(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36091E1(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36108p2(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                zzao zzaoVarMo36090C1 = mo36090C1(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarMo36090C1 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    zzaoVarMo36090C1.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                zzr zzrVar14 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                C2256q0.m10552f(parcel);
                List listMo36279S = mo36279S(zzrVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo36279S);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36095P(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36102c0(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                C2256q0.m10552f(parcel);
                mo36096S1(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) C2256q0.m10548b(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    c9108h5 = iInterfaceQueryLocalInterface instanceof InterfaceC9140j5 ? (InterfaceC9140j5) iInterfaceQueryLocalInterface : new C9108h5(strongBinder);
                }
                C2256q0.m10552f(parcel);
                mo36092H(zzrVar18, zzooVar, c9108h5);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) C2256q0.m10548b(parcel, zzaf.CREATOR);
                C2256q0.m10552f(parcel);
                mo36110u1(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) C2256q0.m10548b(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) C2256q0.m10548b(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    c9059e5 = iInterfaceQueryLocalInterface2 instanceof InterfaceC9092g5 ? (InterfaceC9092g5) iInterfaceQueryLocalInterface2 : new C9059e5(strongBinder2);
                }
                C2256q0.m10552f(parcel);
                mo36105g1(zzrVar20, bundle3, c9059e5);
                parcel2.writeNoException();
                return true;
        }
    }
}
