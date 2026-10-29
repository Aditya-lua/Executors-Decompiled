package ga;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import fb.k0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends fb.q implements e {
    public d() {
        super("com.google.android.gms.games.internal.IGamesCallbacks");
    }

    @Override // fb.q
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 6001 || i10 == 6002) {
            parcel.readString();
            k0.e(parcel);
        } else if (i10 == 12011) {
            DataHolder dataHolder = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
            k0.e(parcel);
            K0(dataHolder);
        } else if (i10 == 12012) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            k0.e(parcel);
            W0(i12, string);
        } else if (i10 == 13001) {
            k0.e(parcel);
        } else if (i10 == 13002) {
            parcel.readInt();
            k0.e(parcel);
        } else if (i10 == 19001) {
            parcel.readInt();
            k0.e(parcel);
        } else if (i10 != 19002) {
            switch (i10) {
                case 5001:
                    parcel.readInt();
                    parcel.readString();
                    k0.e(parcel);
                    break;
                case 5002:
                    DataHolder dataHolder2 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                    k0.e(parcel);
                    D0(dataHolder2);
                    break;
                case 5003:
                    int i13 = parcel.readInt();
                    String string2 = parcel.readString();
                    k0.e(parcel);
                    J1(i13, string2);
                    break;
                case 5004:
                    DataHolder dataHolder3 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                    k0.e(parcel);
                    t0(dataHolder3);
                    break;
                case 5005:
                    Parcelable.Creator<DataHolder> creator = DataHolder.CREATOR;
                    DataHolder dataHolder4 = (DataHolder) k0.b(parcel, creator);
                    DataHolder dataHolder5 = (DataHolder) k0.b(parcel, creator);
                    k0.e(parcel);
                    c0(dataHolder4, dataHolder5);
                    break;
                case 5006:
                    DataHolder dataHolder6 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                    k0.e(parcel);
                    o1(dataHolder6);
                    break;
                case 5007:
                    DataHolder dataHolder7 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                    k0.e(parcel);
                    O0(dataHolder7);
                    break;
                case 5008:
                    DataHolder dataHolder8 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                    k0.e(parcel);
                    a1(dataHolder8);
                    break;
                case 5009:
                    k0.e(parcel);
                    break;
                case 5010:
                    k0.e(parcel);
                    break;
                case 5011:
                    k0.e(parcel);
                    break;
                default:
                    switch (i10) {
                        case 5016:
                            e();
                            break;
                        case 5017:
                            k0.e(parcel);
                            break;
                        case 5018:
                            k0.e(parcel);
                            break;
                        case 5019:
                            k0.e(parcel);
                            break;
                        case 5020:
                            parcel.readInt();
                            parcel.readString();
                            k0.e(parcel);
                            break;
                        case 5021:
                            k0.e(parcel);
                            break;
                        case 5022:
                            k0.e(parcel);
                            break;
                        case 5023:
                            k0.e(parcel);
                            break;
                        case 5024:
                            k0.e(parcel);
                            break;
                        case 5025:
                            k0.e(parcel);
                            break;
                        case 5026:
                            parcel.createStringArray();
                            k0.e(parcel);
                            break;
                        case 5027:
                            parcel.createStringArray();
                            k0.e(parcel);
                            break;
                        case 5028:
                            parcel.createStringArray();
                            k0.e(parcel);
                            break;
                        case 5029:
                            parcel.createStringArray();
                            k0.e(parcel);
                            break;
                        case 5030:
                            parcel.createStringArray();
                            k0.e(parcel);
                            break;
                        case 5031:
                            parcel.createStringArray();
                            k0.e(parcel);
                            break;
                        case 5032:
                            k0.e(parcel);
                            break;
                        case 5033:
                            parcel.readInt();
                            parcel.readInt();
                            parcel.readString();
                            k0.e(parcel);
                            break;
                        case 5034:
                            parcel.readInt();
                            parcel.readString();
                            k0.a(parcel);
                            k0.e(parcel);
                            break;
                        case 5035:
                            k0.e(parcel);
                            break;
                        case 5036:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 5037:
                            k0.e(parcel);
                            break;
                        case 5038:
                            k0.e(parcel);
                            break;
                        case 5039:
                            k0.e(parcel);
                            break;
                        case 5040:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 9001:
                            k0.e(parcel);
                            break;
                        case 11001:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 12001:
                            DataHolder dataHolder9 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                            k0.e(parcel);
                            k2(dataHolder9);
                            break;
                        case 14001:
                            k0.e(parcel);
                            break;
                        case 15001:
                            DataHolder dataHolder10 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                            k0.e(parcel);
                            n(dataHolder10);
                            break;
                        case 17002:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 19008:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 19009:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 19010:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 20001:
                            k0.e(parcel);
                            break;
                        case 20002:
                            k0.e(parcel);
                            break;
                        case 20003:
                            k0.e(parcel);
                            break;
                        case 20004:
                            k0.e(parcel);
                            break;
                        case 20005:
                            k0.e(parcel);
                            break;
                        case 20006:
                            k0.e(parcel);
                            break;
                        case 20007:
                            k0.e(parcel);
                            break;
                        case 20008:
                            k0.e(parcel);
                            break;
                        case 20009:
                            k0.e(parcel);
                            break;
                        case 20012:
                            k0.e(parcel);
                            break;
                        case 20019:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 20020:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 23001:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 23002:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 23003:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 23004:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 23005:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 24002:
                            k0.a(parcel);
                            k0.e(parcel);
                            break;
                        case 25002:
                            parcel.readString();
                            k0.e(parcel);
                            break;
                        case 25003:
                            Status status = (Status) k0.b(parcel, Status.CREATOR);
                            String string3 = parcel.readString();
                            k0.e(parcel);
                            X0(status, string3);
                            break;
                        case 25004:
                            k0.e(parcel);
                            break;
                        case 25005:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 25006:
                            parcel.readInt();
                            k0.e(parcel);
                            break;
                        case 25007:
                            Status status2 = (Status) k0.b(parcel, Status.CREATOR);
                            String string4 = parcel.readString();
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            k0.e(parcel);
                            U1(status2, string4, arrayListCreateStringArrayList);
                            break;
                        default:
                            switch (i10) {
                                case 8001:
                                    DataHolder dataHolder11 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                                    k0.e(parcel);
                                    O1(dataHolder11);
                                    break;
                                case 8002:
                                    parcel.readInt();
                                    k0.e(parcel);
                                    break;
                                case 8003:
                                    k0.e(parcel);
                                    break;
                                case 8004:
                                    k0.e(parcel);
                                    break;
                                case 8005:
                                    k0.e(parcel);
                                    break;
                                case 8006:
                                    k0.e(parcel);
                                    break;
                                case 8007:
                                    parcel.readInt();
                                    parcel.readString();
                                    k0.e(parcel);
                                    break;
                                case 8008:
                                    k0.e(parcel);
                                    break;
                                case 8009:
                                    parcel.readString();
                                    k0.e(parcel);
                                    break;
                                case 8010:
                                    parcel.readString();
                                    k0.e(parcel);
                                    break;
                                default:
                                    switch (i10) {
                                        case 10001:
                                            k0.e(parcel);
                                            break;
                                        case 10002:
                                            parcel.readString();
                                            k0.e(parcel);
                                            break;
                                        case 10003:
                                            k0.e(parcel);
                                            break;
                                        case 10004:
                                            k0.e(parcel);
                                            break;
                                        case 10005:
                                            parcel.readInt();
                                            k0.e(parcel);
                                            break;
                                        case 10006:
                                            k0.e(parcel);
                                            break;
                                        default:
                                            switch (i10) {
                                                case 12004:
                                                    DataHolder dataHolder12 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                                                    Contents contents = (Contents) k0.b(parcel, Contents.CREATOR);
                                                    k0.e(parcel);
                                                    Q1(dataHolder12, contents);
                                                    break;
                                                case 12005:
                                                    DataHolder dataHolder13 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                                                    k0.e(parcel);
                                                    I(dataHolder13);
                                                    break;
                                                case 12006:
                                                    k0.e(parcel);
                                                    break;
                                                case 12007:
                                                    k0.e(parcel);
                                                    break;
                                                case 12008:
                                                    k0.e(parcel);
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 12014:
                                                            k0.e(parcel);
                                                            break;
                                                        case 12015:
                                                            parcel.readInt();
                                                            k0.e(parcel);
                                                            break;
                                                        case 12016:
                                                            k0.e(parcel);
                                                            break;
                                                        case 12017:
                                                            DataHolder dataHolder14 = (DataHolder) k0.b(parcel, DataHolder.CREATOR);
                                                            String string5 = parcel.readString();
                                                            Parcelable.Creator<Contents> creator2 = Contents.CREATOR;
                                                            Contents contents2 = (Contents) k0.b(parcel, creator2);
                                                            Contents contents3 = (Contents) k0.b(parcel, creator2);
                                                            Contents contents4 = (Contents) k0.b(parcel, creator2);
                                                            k0.e(parcel);
                                                            R1(dataHolder14, string5, contents2, contents3, contents4);
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
            k0.a(parcel);
            k0.e(parcel);
        }
        parcel2.writeNoException();
        return true;
    }
}
