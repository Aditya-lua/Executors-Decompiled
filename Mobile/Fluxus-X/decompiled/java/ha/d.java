package ha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import gb.l0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends gb.r implements e {
    public d() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    @Override // gb.r
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 6001 || i10 == 6002) {
            parcel.readString();
            l0.e(parcel);
        } else if (i10 == 12011) {
            DataHolder dataHolder = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
            l0.e(parcel);
            M0(dataHolder);
        } else if (i10 == 12012) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            l0.e(parcel);
            a1(i12, string);
        } else if (i10 == 13001) {
            l0.e(parcel);
        } else if (i10 == 13002) {
            parcel.readInt();
            l0.e(parcel);
        } else if (i10 == 19001) {
            parcel.readInt();
            l0.e(parcel);
        } else if (i10 != 19002) {
            switch (i10) {
                case 5001:
                    parcel.readInt();
                    parcel.readString();
                    l0.e(parcel);
                    break;
                case 5002:
                    DataHolder dataHolder2 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                    l0.e(parcel);
                    G0(dataHolder2);
                    break;
                case 5003:
                    int i13 = parcel.readInt();
                    String string2 = parcel.readString();
                    l0.e(parcel);
                    P1(i13, string2);
                    break;
                case 5004:
                    DataHolder dataHolder3 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                    l0.e(parcel);
                    s0(dataHolder3);
                    break;
                case 5005:
                    Parcelable.Creator<DataHolder> creator = DataHolder.CREATOR;
                    DataHolder dataHolder4 = (DataHolder) l0.b(parcel, creator);
                    DataHolder dataHolder5 = (DataHolder) l0.b(parcel, creator);
                    l0.e(parcel);
                    W(dataHolder4, dataHolder5);
                    break;
                case 5006:
                    DataHolder dataHolder6 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                    l0.e(parcel);
                    s1(dataHolder6);
                    break;
                case 5007:
                    DataHolder dataHolder7 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                    l0.e(parcel);
                    S0(dataHolder7);
                    break;
                case 5008:
                    DataHolder dataHolder8 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                    l0.e(parcel);
                    g1(dataHolder8);
                    break;
                case 5009:
                    l0.e(parcel);
                    break;
                case 5010:
                    l0.e(parcel);
                    break;
                case 5011:
                    l0.e(parcel);
                    break;
                default:
                    switch (i10) {
                        case 5016:
                            e();
                            break;
                        case 5017:
                            l0.e(parcel);
                            break;
                        case 5018:
                            l0.e(parcel);
                            break;
                        case 5019:
                            l0.e(parcel);
                            break;
                        case 5020:
                            parcel.readInt();
                            parcel.readString();
                            l0.e(parcel);
                            break;
                        case 5021:
                            l0.e(parcel);
                            break;
                        case 5022:
                            l0.e(parcel);
                            break;
                        case 5023:
                            l0.e(parcel);
                            break;
                        case 5024:
                            l0.e(parcel);
                            break;
                        case 5025:
                            l0.e(parcel);
                            break;
                        case 5026:
                            parcel.createStringArray();
                            l0.e(parcel);
                            break;
                        case 5027:
                            parcel.createStringArray();
                            l0.e(parcel);
                            break;
                        case 5028:
                            parcel.createStringArray();
                            l0.e(parcel);
                            break;
                        case 5029:
                            parcel.createStringArray();
                            l0.e(parcel);
                            break;
                        case 5030:
                            parcel.createStringArray();
                            l0.e(parcel);
                            break;
                        case 5031:
                            parcel.createStringArray();
                            l0.e(parcel);
                            break;
                        case 5032:
                            l0.e(parcel);
                            break;
                        case 5033:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            l0.e(parcel);
                            break;
                        case 5034:
                            parcel.readInt();
                            parcel.readString();
                            l0.a(parcel);
                            l0.e(parcel);
                            break;
                        case 5035:
                            l0.e(parcel);
                            break;
                        case 5036:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 5037:
                            l0.e(parcel);
                            break;
                        case 5038:
                            l0.e(parcel);
                            break;
                        case 5039:
                            l0.e(parcel);
                            break;
                        case 5040:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 9001:
                            l0.e(parcel);
                            break;
                        case 11001:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 12001:
                            DataHolder dataHolder9 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                            l0.e(parcel);
                            j2(dataHolder9);
                            break;
                        case 14001:
                            l0.e(parcel);
                            break;
                        case 15001:
                            DataHolder dataHolder10 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                            l0.e(parcel);
                            n(dataHolder10);
                            break;
                        case 17002:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 19008:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 19009:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 19010:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 20001:
                            l0.e(parcel);
                            break;
                        case 20002:
                            l0.e(parcel);
                            break;
                        case 20003:
                            l0.e(parcel);
                            break;
                        case 20004:
                            l0.e(parcel);
                            break;
                        case 20005:
                            l0.e(parcel);
                            break;
                        case 20006:
                            l0.e(parcel);
                            break;
                        case 20007:
                            l0.e(parcel);
                            break;
                        case 20008:
                            l0.e(parcel);
                            break;
                        case 20009:
                            l0.e(parcel);
                            break;
                        case 20012:
                            l0.e(parcel);
                            break;
                        case 20019:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 20020:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 23001:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 23002:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 23003:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 23004:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 23005:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 24002:
                            l0.a(parcel);
                            l0.e(parcel);
                            break;
                        case 25002:
                            parcel.readString();
                            l0.e(parcel);
                            break;
                        case 25003:
                            Status status = (Status) l0.b(parcel, Status.CREATOR);
                            String string3 = parcel.readString();
                            l0.e(parcel);
                            c1(status, string3);
                            break;
                        case 25004:
                            l0.e(parcel);
                            break;
                        case 25005:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 25006:
                            parcel.readInt();
                            l0.e(parcel);
                            break;
                        case 25007:
                            Status status2 = (Status) l0.b(parcel, Status.CREATOR);
                            String string4 = parcel.readString();
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            l0.e(parcel);
                            Z1(status2, string4, arrayListCreateStringArrayList);
                            break;
                        default:
                            switch (i10) {
                                case 8001:
                                    DataHolder dataHolder11 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                                    l0.e(parcel);
                                    X1(dataHolder11);
                                    break;
                                case 8002:
                                    parcel.readInt();
                                    l0.e(parcel);
                                    break;
                                case 8003:
                                    l0.e(parcel);
                                    break;
                                case 8004:
                                    l0.e(parcel);
                                    break;
                                case 8005:
                                    l0.e(parcel);
                                    break;
                                case 8006:
                                    l0.e(parcel);
                                    break;
                                case 8007:
                                    parcel.readInt();
                                    parcel.readString();
                                    l0.e(parcel);
                                    break;
                                case 8008:
                                    l0.e(parcel);
                                    break;
                                case 8009:
                                    parcel.readString();
                                    l0.e(parcel);
                                    break;
                                case 8010:
                                    parcel.readString();
                                    l0.e(parcel);
                                    break;
                                default:
                                    switch (i10) {
                                        case 10001:
                                            l0.e(parcel);
                                            break;
                                        case 10002:
                                            parcel.readString();
                                            l0.e(parcel);
                                            break;
                                        case 10003:
                                            l0.e(parcel);
                                            break;
                                        case 10004:
                                            l0.e(parcel);
                                            break;
                                        case 10005:
                                            parcel.readInt();
                                            l0.e(parcel);
                                            break;
                                        case 10006:
                                            l0.e(parcel);
                                            break;
                                        default:
                                            switch (i10) {
                                                case 12004:
                                                    DataHolder dataHolder12 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                                                    y9.a aVar = (y9.a) l0.b(parcel, y9.a.CREATOR);
                                                    l0.e(parcel);
                                                    T0(dataHolder12, aVar);
                                                    break;
                                                case 12005:
                                                    DataHolder dataHolder13 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                                                    l0.e(parcel);
                                                    J(dataHolder13);
                                                    break;
                                                case 12006:
                                                    l0.e(parcel);
                                                    break;
                                                case 12007:
                                                    l0.e(parcel);
                                                    break;
                                                case 12008:
                                                    l0.e(parcel);
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 12014:
                                                            l0.e(parcel);
                                                            break;
                                                        case 12015:
                                                            parcel.readInt();
                                                            l0.e(parcel);
                                                            break;
                                                        case 12016:
                                                            l0.e(parcel);
                                                            break;
                                                        case 12017:
                                                            DataHolder dataHolder14 = (DataHolder) l0.b(parcel, DataHolder.CREATOR);
                                                            String string5 = parcel.readString();
                                                            Parcelable.Creator<y9.a> creator2 = y9.a.CREATOR;
                                                            y9.a aVar2 = (y9.a) l0.b(parcel, creator2);
                                                            y9.a aVar3 = (y9.a) l0.b(parcel, creator2);
                                                            y9.a aVar4 = (y9.a) l0.b(parcel, creator2);
                                                            l0.e(parcel);
                                                            F0(dataHolder14, string5, aVar2, aVar3, aVar4);
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
            l0.a(parcel);
            l0.e(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
