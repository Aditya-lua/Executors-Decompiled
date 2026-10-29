package ga;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import java.util.ArrayList;
import p125fb.BinderC5553q;
import p125fb.C5536k0;

/* JADX INFO: renamed from: ga.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC6061d extends BinderC5553q implements InterfaceC6062e {
    public AbstractBinderC6061d() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    @Override // p125fb.BinderC5553q
    /* JADX INFO: renamed from: r2 */
    public final boolean mo25172r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 6001 || i10 == 6002) {
            parcel.readString();
            C5536k0.m25209e(parcel);
        } else if (i10 == 12011) {
            DataHolder dataHolder = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
            C5536k0.m25209e(parcel);
            mo26881F0(dataHolder);
        } else if (i10 == 12012) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            C5536k0.m25209e(parcel);
            mo26888T0(i12, string);
        } else if (i10 == 13001) {
            C5536k0.m25209e(parcel);
        } else if (i10 == 13002) {
            parcel.readInt();
            C5536k0.m25209e(parcel);
        } else if (i10 == 19001) {
            parcel.readInt();
            C5536k0.m25209e(parcel);
        } else if (i10 != 19002) {
            switch (i10) {
                case 5001:
                    parcel.readInt();
                    parcel.readString();
                    C5536k0.m25209e(parcel);
                    break;
                case 5002:
                    DataHolder dataHolder2 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                    C5536k0.m25209e(parcel);
                    mo26898z0(dataHolder2);
                    break;
                case 5003:
                    int i13 = parcel.readInt();
                    String string2 = parcel.readString();
                    C5536k0.m25209e(parcel);
                    mo26883J1(i13, string2);
                    break;
                case 5004:
                    DataHolder dataHolder3 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                    C5536k0.m25209e(parcel);
                    mo26897r0(dataHolder3);
                    break;
                case 5005:
                    Parcelable.Creator<DataHolder> creator = DataHolder.CREATOR;
                    DataHolder dataHolder4 = (DataHolder) C5536k0.m25206b(parcel, creator);
                    DataHolder dataHolder5 = (DataHolder) C5536k0.m25206b(parcel, creator);
                    C5536k0.m25209e(parcel);
                    mo26892a0(dataHolder4, dataHolder5);
                    break;
                case 5006:
                    DataHolder dataHolder6 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                    C5536k0.m25209e(parcel);
                    mo26894k1(dataHolder6);
                    break;
                case 5007:
                    DataHolder dataHolder7 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                    C5536k0.m25209e(parcel);
                    mo26884K0(dataHolder7);
                    break;
                case 5008:
                    DataHolder dataHolder8 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                    C5536k0.m25209e(parcel);
                    mo26891X0(dataHolder8);
                    break;
                case 5009:
                    C5536k0.m25209e(parcel);
                    break;
                case 5010:
                    C5536k0.m25209e(parcel);
                    break;
                case 5011:
                    C5536k0.m25209e(parcel);
                    break;
                default:
                    switch (i10) {
                        case 5016:
                            mo26893e();
                            break;
                        case 5017:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5018:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5019:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5020:
                            parcel.readInt();
                            parcel.readString();
                            C5536k0.m25209e(parcel);
                            break;
                        case 5021:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5022:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5023:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5024:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5025:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5026:
                            parcel.createStringArray();
                            C5536k0.m25209e(parcel);
                            break;
                        case 5027:
                            parcel.createStringArray();
                            C5536k0.m25209e(parcel);
                            break;
                        case 5028:
                            parcel.createStringArray();
                            C5536k0.m25209e(parcel);
                            break;
                        case 5029:
                            parcel.createStringArray();
                            C5536k0.m25209e(parcel);
                            break;
                        case 5030:
                            parcel.createStringArray();
                            C5536k0.m25209e(parcel);
                            break;
                        case 5031:
                            parcel.createStringArray();
                            C5536k0.m25209e(parcel);
                            break;
                        case 5032:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5033:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            C5536k0.m25209e(parcel);
                            break;
                        case 5034:
                            parcel.readInt();
                            parcel.readString();
                            C5536k0.m25205a(parcel);
                            C5536k0.m25209e(parcel);
                            break;
                        case 5035:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5036:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 5037:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5038:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5039:
                            C5536k0.m25209e(parcel);
                            break;
                        case 5040:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 9001:
                            C5536k0.m25209e(parcel);
                            break;
                        case 11001:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 12001:
                            DataHolder dataHolder9 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                            C5536k0.m25209e(parcel);
                            mo26895k2(dataHolder9);
                            break;
                        case 14001:
                            C5536k0.m25209e(parcel);
                            break;
                        case 15001:
                            DataHolder dataHolder10 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                            C5536k0.m25209e(parcel);
                            mo26896n(dataHolder10);
                            break;
                        case 17002:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 19008:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 19009:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 19010:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 20001:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20002:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20003:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20004:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20005:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20006:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20007:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20008:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20009:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20012:
                            C5536k0.m25209e(parcel);
                            break;
                        case 20019:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 20020:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 23001:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 23002:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 23003:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 23004:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 23005:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 24002:
                            C5536k0.m25205a(parcel);
                            C5536k0.m25209e(parcel);
                            break;
                        case 25002:
                            parcel.readString();
                            C5536k0.m25209e(parcel);
                            break;
                        case 25003:
                            Status status = (Status) C5536k0.m25206b(parcel, Status.CREATOR);
                            String string3 = parcel.readString();
                            C5536k0.m25209e(parcel);
                            mo26889U0(status, string3);
                            break;
                        case 25004:
                            C5536k0.m25209e(parcel);
                            break;
                        case 25005:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 25006:
                            parcel.readInt();
                            C5536k0.m25209e(parcel);
                            break;
                        case 25007:
                            Status status2 = (Status) C5536k0.m25206b(parcel, Status.CREATOR);
                            String string4 = parcel.readString();
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            C5536k0.m25209e(parcel);
                            mo26890U1(status2, string4, arrayListCreateStringArrayList);
                            break;
                        default:
                            switch (i10) {
                                case 8001:
                                    DataHolder dataHolder11 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                                    C5536k0.m25209e(parcel);
                                    mo26885O1(dataHolder11);
                                    break;
                                case 8002:
                                    parcel.readInt();
                                    C5536k0.m25209e(parcel);
                                    break;
                                case 8003:
                                    C5536k0.m25209e(parcel);
                                    break;
                                case 8004:
                                    C5536k0.m25209e(parcel);
                                    break;
                                case 8005:
                                    C5536k0.m25209e(parcel);
                                    break;
                                case 8006:
                                    C5536k0.m25209e(parcel);
                                    break;
                                case 8007:
                                    parcel.readInt();
                                    parcel.readString();
                                    C5536k0.m25209e(parcel);
                                    break;
                                case 8008:
                                    C5536k0.m25209e(parcel);
                                    break;
                                case 8009:
                                    parcel.readString();
                                    C5536k0.m25209e(parcel);
                                    break;
                                case 8010:
                                    parcel.readString();
                                    C5536k0.m25209e(parcel);
                                    break;
                                default:
                                    switch (i10) {
                                        case 10001:
                                            C5536k0.m25209e(parcel);
                                            break;
                                        case 10002:
                                            parcel.readString();
                                            C5536k0.m25209e(parcel);
                                            break;
                                        case 10003:
                                            C5536k0.m25209e(parcel);
                                            break;
                                        case 10004:
                                            C5536k0.m25209e(parcel);
                                            break;
                                        case 10005:
                                            parcel.readInt();
                                            C5536k0.m25209e(parcel);
                                            break;
                                        case 10006:
                                            C5536k0.m25209e(parcel);
                                            break;
                                        default:
                                            switch (i10) {
                                                case 12004:
                                                    DataHolder dataHolder12 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                                                    Contents contents = (Contents) C5536k0.m25206b(parcel, Contents.CREATOR);
                                                    C5536k0.m25209e(parcel);
                                                    mo26886Q1(dataHolder12, contents);
                                                    break;
                                                case 12005:
                                                    DataHolder dataHolder13 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                                                    C5536k0.m25209e(parcel);
                                                    mo26882G(dataHolder13);
                                                    break;
                                                case 12006:
                                                    C5536k0.m25209e(parcel);
                                                    break;
                                                case 12007:
                                                    C5536k0.m25209e(parcel);
                                                    break;
                                                case 12008:
                                                    C5536k0.m25209e(parcel);
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 12014:
                                                            C5536k0.m25209e(parcel);
                                                            break;
                                                        case 12015:
                                                            parcel.readInt();
                                                            C5536k0.m25209e(parcel);
                                                            break;
                                                        case 12016:
                                                            C5536k0.m25209e(parcel);
                                                            break;
                                                        case 12017:
                                                            DataHolder dataHolder14 = (DataHolder) C5536k0.m25206b(parcel, DataHolder.CREATOR);
                                                            String string5 = parcel.readString();
                                                            Parcelable.Creator<Contents> creator2 = Contents.CREATOR;
                                                            Contents contents2 = (Contents) C5536k0.m25206b(parcel, creator2);
                                                            Contents contents3 = (Contents) C5536k0.m25206b(parcel, creator2);
                                                            Contents contents4 = (Contents) C5536k0.m25206b(parcel, creator2);
                                                            C5536k0.m25209e(parcel);
                                                            mo26887R1(dataHolder14, string5, contents2, contents3, contents4);
                                                            break;
                                                        default:
                                                            return false;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            parcel.readInt();
            C5536k0.m25205a(parcel);
            C5536k0.m25209e(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
