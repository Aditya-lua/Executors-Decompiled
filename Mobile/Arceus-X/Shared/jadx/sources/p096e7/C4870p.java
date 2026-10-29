package p096e7;

import android.os.Build;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.text.C7797x;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e7.p */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\b"}, m31665d2 = {"Le7/u;", "logger", "Le7/o;", "a", "(Le7/u;)Le7/o;", "", "Z", "IS_DEVICE_BLOCKED", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4870p {

    /* JADX INFO: renamed from: a */
    public static final boolean f19560a;

    static {
        String str;
        int i10 = Build.VERSION.SDK_INT;
        boolean zM31838G = false;
        if (i10 == 26) {
            String str2 = Build.MODEL;
            if (str2 != null) {
                if (C7797x.m32309T(StringsKt.m32126G0(str2, "SAMSUNG-"), "SM-", false, 2, null)) {
                    zM31838G = true;
                } else {
                    String str3 = Build.DEVICE;
                    if (str3 != null) {
                        zM31838G = C7693m.m31838G(new String[]{"nora", "nora_8917", "nora_8917_n", "james", "rjames_f", "rjames_go", "pettyl", "hannah", "ahannah", "rhannah", "ali", "ali_n", "aljeter", "aljeter_n", "jeter", "evert", "evert_n", "evert_nt", "G3112", "G3116", "G3121", "G3123", "G3125", "G3412", "G3416", "G3421", "G3423", "G3426", "G3212", "G3221", "G3223", "G3226", "BV6800Pro", "CatS41", "Hi9Pro", "manning", "N5702L"}, str3);
                    }
                }
            }
        } else if (i10 == 27 && (str = Build.DEVICE) != null) {
            zM31838G = C7693m.m31838G(new String[]{"mcv1s", "mcv3", "mcv5a", "mcv7a", "A30ATMO", "A70AXLTMO", "A3A_8_4G_TMO", "Edison_CKT", "EDISON_TF", "FERMI_TF", "U50A_ATT", "U50A_PLUS_ATT", "U50A_PLUS_TF", "U50APLUSTMO", "U5A_PLUS_4G", "RCT6513W87DK5e", "RCT6873W42BMF9A", "RCT6A03W13", "RCT6B03W12", "RCT6B03W13", "RCT6T06E13", "A3_Pro", "One", "One_Max", "One_Pro", "Z2", "Z2_PRO", "Armor_3", "Armor_6", "Blackview", "BV9500", "BV9500Pro", "A6L-C", "N5002LA", "N5501LA", "Power_2_Pro", "Power_5", "Z9", "V0310WW", "V0330WW", "A3", "ASUS_X018_4", "C210AE", "fireball", "ILA_X1", "Infinix-X605_sprout", "j7maxlte", "KING_KONG_3", "M10500", "S70", "S80Lite", "SGINO6", "st18c10bnn", "TECNO-CA8", "SHIFT6m"}, str);
        }
        f19560a = zM31838G;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4869o m23477a(@Nullable InterfaceC4875u interfaceC4875u) {
        int i10 = Build.VERSION.SDK_INT;
        if (f19560a) {
            return new C4871q(false);
        }
        return (i10 == 26 || i10 == 27) ? new C4874t(interfaceC4875u) : new C4871q(true);
    }
}
