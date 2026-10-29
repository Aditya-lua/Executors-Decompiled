package da;

import androidx.annotation.NonNull;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.common.api.Status;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static void a(sb.k kVar, @NonNull SecurityException securityException) {
        if (kVar != null) {
            kVar.d(new k9.b(d.b(4)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    public static void b(@NonNull sb.k kVar, int i10) {
        int i11;
        Status statusA = p.a(i10);
        int iX3 = statusA.x3();
        if (iX3 == 1) {
            i11 = 8;
        } else if (iX3 == 2) {
            i11 = 26502;
        } else if (iX3 == 3) {
            i11 = 26503;
        } else if (iX3 == 4) {
            i11 = 26504;
        } else if (iX3 == 5) {
            i11 = 26505;
        } else if (iX3 == 6) {
            i11 = 26506;
        } else if (iX3 == 7) {
            i11 = 26507;
        } else if (iX3 == 1500) {
            i11 = 26540;
        } else if (iX3 != 1501) {
            switch (iX3) {
                case 7:
                    i11 = 26507;
                    break;
                case 8:
                    i11 = 26508;
                    break;
                case 9:
                    i11 = 26509;
                    break;
                case 500:
                    i11 = 26520;
                    break;
                case 9000:
                    i11 = 26620;
                    break;
                case 9001:
                    i11 = 26621;
                    break;
                case 9002:
                    i11 = 26622;
                    break;
                case 9003:
                    i11 = 26623;
                    break;
                case 9004:
                    i11 = 26624;
                    break;
                case 9006:
                    i11 = 26625;
                    break;
                case 9009:
                    i11 = 26626;
                    break;
                case 9010:
                    i11 = 26627;
                    break;
                case 9011:
                    i11 = 26628;
                    break;
                case 9012:
                    i11 = 26629;
                    break;
                case 9016:
                    i11 = 26630;
                    break;
                case 9017:
                    i11 = 26631;
                    break;
                case 9018:
                    i11 = 26632;
                    break;
                case 9200:
                    i11 = 26650;
                    break;
                case 9202:
                    i11 = 26652;
                    break;
                case BacktraceMetrics.defaultTimeBetweenRetriesMs /* 10000 */:
                    i11 = 26700;
                    break;
                case 10001:
                    i11 = 26701;
                    break;
                case 10002:
                    i11 = 26702;
                    break;
                case 10003:
                    i11 = 26703;
                    break;
                case 10004:
                    i11 = 26704;
                    break;
                default:
                    switch (iX3) {
                        case 1000:
                            i11 = 26530;
                            break;
                        case WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY /* 1001 */:
                            i11 = 26531;
                            break;
                        case 1002:
                            i11 = 26532;
                            break;
                        case 1003:
                            i11 = 26533;
                            break;
                        case 1004:
                            i11 = 26534;
                            break;
                        case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
                            i11 = 26535;
                            break;
                        case 1006:
                            i11 = 26536;
                            break;
                        default:
                            switch (iX3) {
                                case 2000:
                                    i11 = 26550;
                                    break;
                                case 2001:
                                    i11 = 26551;
                                    break;
                                case 2002:
                                    i11 = 26552;
                                    break;
                                default:
                                    switch (iX3) {
                                        case 3000:
                                            i11 = 26560;
                                            break;
                                        case 3001:
                                            i11 = 26561;
                                            break;
                                        case 3002:
                                            i11 = 26562;
                                            break;
                                        case 3003:
                                            i11 = 26563;
                                            break;
                                        default:
                                            switch (iX3) {
                                                case 4000:
                                                    i11 = 26570;
                                                    break;
                                                case 4001:
                                                    i11 = 26571;
                                                    break;
                                                case 4002:
                                                    i11 = 26572;
                                                    break;
                                                case 4003:
                                                    i11 = 26573;
                                                    break;
                                                case 4004:
                                                    i11 = 26574;
                                                    break;
                                                case 4005:
                                                    i11 = 26575;
                                                    break;
                                                case 4006:
                                                    i11 = 26576;
                                                    break;
                                                default:
                                                    switch (iX3) {
                                                        case 6000:
                                                            i11 = 26580;
                                                            break;
                                                        case 6001:
                                                            i11 = 26581;
                                                            break;
                                                        case 6002:
                                                            i11 = 26582;
                                                            break;
                                                        case 6003:
                                                            i11 = 26583;
                                                            break;
                                                        case 6004:
                                                            i11 = 26584;
                                                            break;
                                                        default:
                                                            switch (iX3) {
                                                                case 6500:
                                                                    i11 = 26590;
                                                                    break;
                                                                case 6501:
                                                                    i11 = 26591;
                                                                    break;
                                                                case 6502:
                                                                    i11 = 26592;
                                                                    break;
                                                                case 6503:
                                                                    i11 = 26593;
                                                                    break;
                                                                case 6504:
                                                                    i11 = 26594;
                                                                    break;
                                                                case 6505:
                                                                    i11 = 26595;
                                                                    break;
                                                                case 6506:
                                                                    i11 = 26596;
                                                                    break;
                                                                case 6507:
                                                                    i11 = 26597;
                                                                    break;
                                                                default:
                                                                    switch (iX3) {
                                                                        case 7000:
                                                                            i11 = 26600;
                                                                            break;
                                                                        case 7001:
                                                                            i11 = 26601;
                                                                            break;
                                                                        case 7002:
                                                                            i11 = 26602;
                                                                            break;
                                                                        case 7003:
                                                                            i11 = 26603;
                                                                            break;
                                                                        case 7004:
                                                                            i11 = 26604;
                                                                            break;
                                                                        case 7005:
                                                                            i11 = 26605;
                                                                            break;
                                                                        case 7006:
                                                                            i11 = 26606;
                                                                            break;
                                                                        case 7007:
                                                                            i11 = 26607;
                                                                            break;
                                                                        default:
                                                                            switch (iX3) {
                                                                                case 8000:
                                                                                    i11 = 26610;
                                                                                    break;
                                                                                case 8001:
                                                                                    i11 = 26611;
                                                                                    break;
                                                                                case 8002:
                                                                                    i11 = 26612;
                                                                                    break;
                                                                                case 8003:
                                                                                    i11 = 26613;
                                                                                    break;
                                                                                default:
                                                                                    i11 = iX3;
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
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 26541;
        }
        if (i11 != statusA.x3()) {
            if (!p.b(statusA.x3()).equals(statusA.y3())) {
                switch (iX3) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 10:
                        break;
                    case 9:
                    default:
                        statusA = new Status(i11, statusA.y3(), statusA.w3());
                        break;
                }
            } else {
                statusA = d.c(i11, statusA.w3());
            }
        }
        kVar.b(n9.a.a(statusA));
    }
}
