package nb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c5 extends com.google.android.gms.internal.measurement.p0 implements d5 {
    public c5() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        j5 h5Var = null;
        g5 e5Var = null;
        switch (i10) {
            case 1:
                zzbg zzbgVar = (zzbg) com.google.android.gms.internal.measurement.q0.b(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                X(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) com.google.android.gms.internal.measurement.q0.b(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                m0(zzplVar, zzrVar2);
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
                zzr zzrVar3 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                K1(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) com.google.android.gms.internal.measurement.q0.b(parcel, zzbg.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                T0(zzbgVar2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                Y(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                boolean zA = com.google.android.gms.internal.measurement.q0.a(parcel);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listL0 = L0(zzrVar5, zA);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL0);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) com.google.android.gms.internal.measurement.q0.b(parcel, zzbg.CREATOR);
                String string3 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                byte[] bArrH0 = h0(zzbgVar3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrH0);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                Y0(j10, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                String strE0 = E0(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strE0);
                return true;
            case 12:
                zzah zzahVar = (zzah) com.google.android.gms.internal.measurement.q0.b(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                q(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) com.google.android.gms.internal.measurement.q0.b(parcel, zzah.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                i0(zzahVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zA2 = com.google.android.gms.internal.measurement.q0.a(parcel);
                zzr zzrVar8 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listY1 = Y1(string7, string8, zA2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY1);
                return true;
            case 15:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                boolean zA3 = com.google.android.gms.internal.measurement.q0.a(parcel);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listO = o(string9, string10, string11, zA3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listO);
                return true;
            case 16:
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzr zzrVar9 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listE2 = e2(string12, string13, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE2);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listM = M(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listM);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                Z0(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.q0.b(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                F1(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                p2(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                zzao zzaoVarD1 = D1(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarD1 == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    zzaoVarD1.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                zzr zzrVar14 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.q0.b(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listU = U(zzrVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listU);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                R(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                e0(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                S1(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) com.google.android.gms.internal.measurement.q0.b(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    h5Var = iInterfaceQueryLocalInterface instanceof j5 ? (j5) iInterfaceQueryLocalInterface : new h5(strongBinder);
                }
                com.google.android.gms.internal.measurement.q0.f(parcel);
                J(zzrVar18, zzooVar, h5Var);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) com.google.android.gms.internal.measurement.q0.b(parcel, zzaf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                w1(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) com.google.android.gms.internal.measurement.q0.b(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.q0.b(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    e5Var = iInterfaceQueryLocalInterface2 instanceof g5 ? (g5) iInterfaceQueryLocalInterface2 : new e5(strongBinder2);
                }
                com.google.android.gms.internal.measurement.q0.f(parcel);
                k1(zzrVar20, bundle3, e5Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
