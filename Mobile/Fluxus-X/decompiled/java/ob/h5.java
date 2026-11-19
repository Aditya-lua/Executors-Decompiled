package ob;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import backtraceio.library.services.BacktraceMetrics;
import com.google.mlkit.common.MlKitException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h5 extends com.google.android.gms.internal.measurement.p0 implements i5 {
    public h5() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        o5 m5Var = null;
        l5 j5Var = null;
        switch (i10) {
            case 1:
                i0 i0Var = (i0) com.google.android.gms.internal.measurement.q0.b(parcel, i0.CREATOR);
                hf hfVar = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                y1(i0Var, hfVar);
                parcel2.writeNoException();
                return true;
            case 2:
                bf bfVar = (bf) com.google.android.gms.internal.measurement.q0.b(parcel, bf.CREATOR);
                hf hfVar2 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                G(bfVar, hfVar2);
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
                hf hfVar3 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                i0(hfVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                i0 i0Var2 = (i0) com.google.android.gms.internal.measurement.q0.b(parcel, i0.CREATOR);
                String string = parcel.readString();
                String string2 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                X0(i0Var2, string, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                hf hfVar4 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                H0(hfVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                hf hfVar5 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                boolean zA = com.google.android.gms.internal.measurement.q0.a(parcel);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listP2 = p2(hfVar5, zA);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP2);
                return true;
            case 9:
                i0 i0Var3 = (i0) com.google.android.gms.internal.measurement.q0.b(parcel, i0.CREATOR);
                String string3 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                byte[] bArrV1 = V1(i0Var3, string3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrV1);
                return true;
            case 10:
                long j10 = parcel.readLong();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                d1(j10, string4, string5, string6);
                parcel2.writeNoException();
                return true;
            case 11:
                hf hfVar6 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                String strY0 = Y0(hfVar6);
                parcel2.writeNoException();
                parcel2.writeString(strY0);
                return true;
            case 12:
                i iVar = (i) com.google.android.gms.internal.measurement.q0.b(parcel, i.CREATOR);
                hf hfVar7 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                F1(iVar, hfVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                i iVar2 = (i) com.google.android.gms.internal.measurement.q0.b(parcel, i.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                a0(iVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                boolean zA2 = com.google.android.gms.internal.measurement.q0.a(parcel);
                hf hfVar8 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listX1 = x1(string7, string8, zA2, hfVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listX1);
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
                hf hfVar9 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listL1 = l1(string12, string13, hfVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL1);
                return true;
            case 17:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listL = L(string14, string15, string16);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL);
                return true;
            case MlKitException.UNSUPPORTED /* 18 */:
                hf hfVar10 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                v(hfVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.google.android.gms.internal.measurement.q0.b(parcel, Bundle.CREATOR);
                hf hfVar11 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                L1(bundle, hfVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                hf hfVar12 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                O(hfVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                hf hfVar13 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                p pVarY = Y(hfVar13);
                parcel2.writeNoException();
                if (pVarY == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    pVarY.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                hf hfVar14 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.measurement.q0.b(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                List listR = R(hfVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listR);
                return true;
            case 25:
                hf hfVar15 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                t0(hfVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                hf hfVar16 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                I0(hfVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                hf hfVar17 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                q(hfVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                hf hfVar18 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                ce ceVar = (ce) com.google.android.gms.internal.measurement.q0.b(parcel, ce.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    m5Var = iInterfaceQueryLocalInterface instanceof o5 ? (o5) iInterfaceQueryLocalInterface : new m5(strongBinder);
                }
                com.google.android.gms.internal.measurement.q0.f(parcel);
                y(hfVar18, ceVar, m5Var);
                parcel2.writeNoException();
                return true;
            case BacktraceMetrics.defaultTimeIntervalInMin /* 30 */:
                hf hfVar19 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                g gVar = (g) com.google.android.gms.internal.measurement.q0.b(parcel, g.CREATOR);
                com.google.android.gms.internal.measurement.q0.f(parcel);
                d0(hfVar19, gVar);
                parcel2.writeNoException();
                return true;
            case 31:
                hf hfVar20 = (hf) com.google.android.gms.internal.measurement.q0.b(parcel, hf.CREATOR);
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.measurement.q0.b(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    j5Var = iInterfaceQueryLocalInterface2 instanceof l5 ? (l5) iInterfaceQueryLocalInterface2 : new j5(strongBinder2);
                }
                com.google.android.gms.internal.measurement.q0.f(parcel);
                H(hfVar20, bundle3, j5Var);
                parcel2.writeNoException();
                return true;
        }
    }
}
