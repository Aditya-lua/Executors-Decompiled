package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1hSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AFKeystoreWrapper = 0;

    /* JADX INFO: renamed from: e */
    private static int f6881e = 1;
    private static char force;

    /* JADX INFO: renamed from: i */
    private static char f6882i;
    private static char registerClient;
    private static char[] unregisterClient;

    /* JADX INFO: renamed from: v */
    private static int f6883v;

    /* JADX INFO: renamed from: w */
    private static char f6884w;
    private final Map<String, Object> AFLogger;

    /* JADX INFO: renamed from: d */
    private final Context f6885d;

    static {
        registerClient();
        TextUtils.indexOf("", "");
        TextUtils.lastIndexOf("", '0', 0);
        KeyEvent.getDeadChar(0, 0);
        KeyEvent.getModifierMetaStateMask();
        SystemClock.uptimeMillis();
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getPressedStateDuration();
        ViewConfiguration.getMaximumFlingVelocity();
        Process.myPid();
        ViewConfiguration.getZoomControlsTimeout();
        Color.red(0);
        View.getDefaultSize(0, 0);
        AudioTrack.getMaxVolume();
        int i10 = f6883v + 19;
        f6881e = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 24 / 0;
        }
    }

    public AFc1hSDK(Map<String, Object> map, Context context) {
        this.AFLogger = map;
        this.f6885d = context;
        put(AFLogger(), AFKeystoreWrapper());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i10 = 0; i10 < 3; i10++) {
            f6883v = (f6881e + 97) % 128;
            arrayList.add(Integer.valueOf(strArr[i10].length()));
        }
        Collections.sort(arrayList);
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i11 < iIntValue) {
            f6883v = (f6881e + 83) % 128;
            Integer numValueOf = null;
            int i12 = 0;
            while (i12 < 3) {
                int iCharAt = strArr[i12].charAt(i11);
                if (numValueOf != null) {
                    iCharAt ^= numValueOf.intValue();
                }
                numValueOf = Integer.valueOf(iCharAt);
                i12++;
                f6883v = (f6881e + 15) % 128;
            }
            sb2.append(Integer.toHexString(numValueOf.intValue()));
            i11++;
            f6883v = (f6881e + 71) % 128;
        }
        return sb2;
    }

    @NonNull
    private String AFLogger() {
        try {
            String string = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFLogger;
            Object[] objArr = new Object[1];
            m8766a(")!#\u0003\u0001+\r\f\u0005#)\u000f", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 51), objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFLogger;
            Object[] objArr2 = new Object[1];
            m8766a("\u0018\u001b%\f㙣", 4 - ImageFormat.getBitsPerPixel(0), (byte) (Color.red(0) + 101), objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (string3 == null) {
                f6883v = (f6881e + 83) % 128;
                Object[] objArr3 = new Object[1];
                m8766a("\u001f,$\u0018)\u0015 \u0017", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 8, (byte) (21 - ExpandableListView.getPackedPositionChild(0L)), objArr3);
                string3 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb2 = new StringBuilder(string2);
            sb2.reverse();
            StringBuilder sbAFKeystoreWrapper = AFKeystoreWrapper(string, string3, sb2.toString());
            int length = sbAFKeystoreWrapper.length();
            if (length > 4) {
                sbAFKeystoreWrapper.delete(4, length);
            } else {
                while (length < 4) {
                    int i10 = f6883v + 73;
                    f6881e = i10 % 128;
                    if (i10 % 2 == 0) {
                        length += 45;
                        sbAFKeystoreWrapper.append('\\');
                    } else {
                        length++;
                        sbAFKeystoreWrapper.append('1');
                    }
                }
            }
            Object[] objArr4 = new Object[1];
            m8766a("/\u0007㙈", 3 - Color.green(0), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 76), objArr4);
            sbAFKeystoreWrapper.insert(0, ((String) objArr4[0]).intern());
            return sbAFKeystoreWrapper.toString();
        } catch (Exception e10) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.SECURITY;
            Object[] objArr5 = new Object[1];
            m8766a("\u0013\n\u0002\u000e\u0001\u0013\u0013\u001a0!$/\u0013\u0007!+\u0013\n\n\r!/\u0001*\n\u00100+\u0013\u001a", (ViewConfiguration.getPressedStateDuration() >> 16) + 30, (byte) (107 - TextUtils.indexOf("", "")), objArr5);
            aFLogger.m8963e(logTag, ((String) objArr5[0]).intern(), e10, false, false);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            m8766a("!)*\u000f\b!-\u0013\r\n\u0013!#\u0005,\b\u0013-/\u0007\u001a\u0005$0\u0003\u001c\u0005\u0013\n\u0006\r\u0013\u0001*\u0017\n-0", 38 - KeyEvent.getDeadChar(0, 0), (byte) (114 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e10);
            aFLogger.m8966v(logTag, sb3.toString());
            Object[] objArr7 = new Object[1];
            m8766a("/\u0007\u001e\u0006㖺㖺㖺", 6 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (23 - TextUtils.indexOf("", "")), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m8766a(String str, int i10, byte b, Object[] objArr) {
        int i11;
        Object charArray = str;
        if (str != null) {
            $10 = ($11 + 57) % 128;
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        char[] cArr2 = unregisterClient;
        if (cArr2 != null) {
            $10 = ($11 + 111) % 128;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i12 = 0; i12 < length; i12++) {
                cArr3[i12] = (char) (((long) cArr2[i12]) ^ (-3954572101486969845L));
            }
            $10 = ($11 + 53) % 128;
            cArr2 = cArr3;
        }
        char c10 = (char) ((-3954572101486969845L) ^ ((long) AFKeystoreWrapper));
        char[] cArr4 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr4[i11] = (char) (cArr[i11] - b);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            aFk1sSDK.AFLogger = 0;
            while (true) {
                int i13 = aFk1sSDK.AFLogger;
                if (i13 >= i11) {
                    break;
                }
                int i14 = ($11 + 7) % 128;
                $10 = i14;
                char c11 = cArr[i13];
                aFk1sSDK.f7085d = c11;
                char c12 = cArr[i13 + 1];
                aFk1sSDK.AFKeystoreWrapper = c12;
                if (c11 == c12) {
                    cArr4[i13] = (char) (c11 - b);
                    cArr4[i13 + 1] = (char) (c12 - b);
                    $11 = (i14 + 87) % 128;
                } else {
                    int i15 = c11 / c10;
                    aFk1sSDK.unregisterClient = i15;
                    int i16 = c11 % c10;
                    aFk1sSDK.f7086e = i16;
                    int i17 = c12 / c10;
                    aFk1sSDK.registerClient = i17;
                    int i18 = c12 % c10;
                    aFk1sSDK.f7087w = i18;
                    if (i16 == i18) {
                        int i19 = ((i15 + c10) - 1) % c10;
                        aFk1sSDK.unregisterClient = i19;
                        int i20 = ((i17 + c10) - 1) % c10;
                        aFk1sSDK.registerClient = i20;
                        cArr4[i13] = cArr2[(i19 * c10) + i16];
                        cArr4[i13 + 1] = cArr2[(i20 * c10) + i18];
                    } else if (i15 == i17) {
                        int i21 = ((i16 + c10) - 1) % c10;
                        aFk1sSDK.f7086e = i21;
                        int i22 = ((i18 + c10) - 1) % c10;
                        aFk1sSDK.f7087w = i22;
                        cArr4[i13] = cArr2[(i15 * c10) + i21];
                        cArr4[i13 + 1] = cArr2[(i17 * c10) + i22];
                    } else {
                        cArr4[i13] = cArr2[(i15 * c10) + i18];
                        cArr4[i13 + 1] = cArr2[(i17 * c10) + i16];
                    }
                }
                aFk1sSDK.AFLogger = i13 + 2;
            }
        }
        for (int i23 = 0; i23 < i10; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX INFO: renamed from: b */
    private static void m8767b(String str, int i10, Object[] objArr) {
        char[] charArray;
        if (str != null) {
            int i11 = $10 + 39;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        AFk1uSDK aFk1uSDK = new AFk1uSDK();
        char[] cArr2 = new char[cArr.length];
        aFk1uSDK.AFKeystoreWrapper = 0;
        char[] cArr3 = new char[2];
        while (true) {
            int i12 = aFk1uSDK.AFKeystoreWrapper;
            if (i12 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
            cArr3[0] = cArr[i12];
            cArr3[1] = cArr[i12 + 1];
            int i13 = 58224;
            int i14 = 0;
            while (i14 < 16) {
                char c10 = cArr3[1];
                char c11 = cArr3[0];
                char c12 = (char) (c10 - (((c11 + i13) ^ ((c11 << 4) + ((char) (((long) f6882i) ^ (-8065364185533233497L))))) ^ ((c11 >>> 5) + ((char) (((long) f6884w) ^ (-8065364185533233497L))))));
                cArr3[1] = c12;
                cArr3[0] = (char) (c11 - (((c12 >>> 5) + ((char) (((long) force) ^ (-8065364185533233497L)))) ^ ((c12 + i13) ^ ((c12 << 4) + ((char) (((long) registerClient) ^ (-8065364185533233497L)))))));
                i13 -= 40503;
                i14++;
                $10 = ($11 + 93) % 128;
            }
            int i15 = aFk1uSDK.AFKeystoreWrapper;
            cArr2[i15] = cArr3[0];
            cArr2[i15 + 1] = cArr3[1];
            aFk1uSDK.AFKeystoreWrapper = i15 + 2;
        }
    }

    public static void registerClient() {
        unregisterClient = new char[]{51685, 51625, 51624, 51698, 51643, 51619, 51684, 51639, 51616, 51711, 51620, 51682, 51700, 51689, 51709, 51674, 51655, 51702, 51644, 51688, 51681, 51723, 51667, 51699, 51710, 51669, 51683, 51664, 51621, 51701, 51679, 51705, 51707, 51680, 51703, 51651, 51708, 51697, 51662, 51617, 51696, 51686, 51706, 51704, 51627, 51678, 51687, 51633, 51647};
        AFKeystoreWrapper = (char) 64524;
        registerClient = (char) 19924;
        force = (char) 63335;
        f6882i = (char) 43221;
        f6884w = (char) 41623;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x01b9  */
    private String AFKeystoreWrapper() {
        String string;
        int i10;
        try {
            Map<String, Object> map = this.AFLogger;
            Object[] objArr = new Object[1];
            m8766a(")!#\u0003\u0001+\r\f\u0005#)\u000f", 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (byte) (51 - View.getDefaultSize(0, 0)), objArr);
            String string2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFLogger;
            Object[] objArr2 = new Object[1];
            m8767b("激蟰鵏媻ᎈꦝ貮ぞ䯃⥃\ue744邪뇽ຼ\uf74d댳", (Process.myTid() >> 22) + 15, objArr2);
            String string3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            m8767b("༃號ጜ\ue396\uec19➺", 4 - TextUtils.lastIndexOf("", '0'), objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            m8766a("\u0013\u0019\u0006-㘬", (ViewConfiguration.getScrollBarSize() >> 8) + 5, (byte) (124 - Color.alpha(0)), objArr4);
            String strReplaceAll = strIntern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(string3);
            sb2.append(strReplaceAll);
            String strM8931d = AFj1nSDK.m8931d(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("");
            sb3.append(strM8931d.substring(0, 16));
            string = sb3.toString();
        } catch (Exception e10) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.SECURITY;
            Object[] objArr5 = new Object[1];
            m8766a("\u0013\n\u0002\u000e\u0002\u0013#\u0013\u0005\r0!$/\u0013\u0007!+\u0013\n\n\r!/\u0001*\n\u0010-\u0005!\n\u0000-\r\u0004(+/'\u0014\u0000㘟", TextUtils.indexOf("", "", 0, 0) + 43, (byte) (TextUtils.lastIndexOf("", '0', 0) + 33), objArr5);
            aFLogger.m8963e(logTag, ((String) objArr5[0]).intern(), e10, false, false);
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            m8767b("戀꿱㴊㈯⚹혯奞\uf895晷\uf538쓋뾈뇽ຼ\ueaed︕腵踑\uee9f㣥ꂺ酢밡䚕ዻ虎쏻輜뒏嬼鬘\uef18ꃑ䵠\u0e83\uf78a똶Ⴍ侃ৱﹲ⹐彆艹혓\u1aee귉\uebc9씕냏", 49 - (Process.myTid() >> 22), objArr6);
            sb4.append(((String) objArr6[0]).intern());
            sb4.append(e10);
            aFLogger.m8966v(logTag, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("");
            Object[] objArr7 = new Object[1];
            m8766a("\u001a%\u001a\t/\u0013&\u000b #\u001e\u0001\r\u001d\u0004(\u000f\b", (ViewConfiguration.getFadingEdgeLength() >> 16) + 18, (byte) (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr7);
            sb5.append(((String) objArr7[0]).intern());
            string = sb5.toString();
        }
        String str = string;
        try {
            Context context = this.f6885d;
            Object[] objArr8 = new Object[1];
            m8767b("ꄜ䲶\uf29b脦쑷ⳤ㉇䭯\ueaed︕\udd09ḭ\u087f铆抹绬炯\ude12혓\u1aeeᆛ箇䚔祛徃荁桳ꐂꄺ㮽쨃儳ꃝ䤫굍\ueded㍟〪", 37 - KeyEvent.normalizeMetaState(0), objArr8);
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int intExtra = -2700;
            if (intentRegisterReceiver != null) {
                Object[] objArr9 = new Object[1];
                m8767b("\udd09ḭ䴌\uebb7쓋뾈뇽ຼ\uf3e3싺\uf74d댳", 12 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr9);
                intExtra = intentRegisterReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            } else {
                f6883v = (f6881e + 97) % 128;
            }
            String str2 = this.f6885d.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                f6883v = (f6881e + 109) % 128;
                Object[] objArr10 = new Object[1];
                m8767b("獵푯ᔖ莔", Color.rgb(0, 0, 0) + 16777219, objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    f6881e = (f6883v + 111) % 128;
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
            Context context2 = this.f6885d;
            Object[] objArr11 = new Object[1];
            m8766a("\f\r\n\f\u0019\u001b", ExpandableListView.getPackedPositionGroup(0L) + 6, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 70), objArr11);
            int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
            StringBuilder sb6 = new StringBuilder();
            Object[] objArr12 = new Object[1];
            m8767b("哙顗", KeyEvent.keyCodeFromString("") + 1, objArr12);
            sb6.append(((String) objArr12[0]).intern());
            sb6.append(intExtra);
            Object[] objArr13 = new Object[1];
            m8767b("⪹畈", 2 - TextUtils.getTrimmedLength(""), objArr13);
            sb6.append(((String) objArr13[0]).intern());
            sb6.append(i10);
            Object[] objArr14 = new Object[1];
            m8766a("\b\f", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2, (byte) (TextUtils.indexOf("", "", 0) + 37), objArr14);
            sb6.append(((String) objArr14[0]).intern());
            sb6.append(size);
            Object[] objArr15 = new Object[1];
            m8766a("\r\u000e", View.resolveSize(0, 0) + 2, (byte) (TextUtils.indexOf("", "", 0, 0) + 95), objArr15);
            sb6.append(((String) objArr15[0]).intern());
            sb6.append(this.AFLogger.size());
            String string4 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            byte[] bytes = string4.getBytes(Charset.defaultCharset());
            for (int i11 = 0; i11 < bytes.length; i11++) {
                f6881e = (f6883v + 49) % 128;
                bytes[i11] = (byte) (bytes[i11] ^ ((i11 % 2) + 42));
            }
            StringBuilder sb8 = new StringBuilder();
            for (byte b : bytes) {
                String hexString = Integer.toHexString(b);
                if (hexString.length() == 1) {
                    hexString = "0".concat(hexString);
                }
                sb8.append(hexString);
            }
            sb7.append(sb8.toString());
            return sb7.toString();
        } catch (Exception e11) {
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            LogTag logTag2 = LogTag.SECURITY;
            Object[] objArr16 = new Object[1];
            m8766a("\u0013\n\u0002\u000e\u0002\u0013#\u0013\u0005\r\u0005\u0013㘑㘑\u0019\u001b0(\u001d-\u0013\u0007-\u0013\r\n\u0013!#\u0005,\b\u0013-\b(\u0000\u0014#\u0005\u0019\u001b0!\u0013#\u0012\n", View.MeasureSpec.getSize(0) + 48, (byte) (41 - (Process.myPid() >> 22)), objArr16);
            aFLogger2.m8963e(logTag2, ((String) objArr16[0]).intern(), e11, false, false);
            StringBuilder sb9 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            m8767b("戀꿱㴊㈯⚹혯奞\uf895晷\uf538쓋뾈뇽ຼ\ueaed︕腵踑樿샠뒋参뇽ຼ䏳ꦌ澽\ue145瑯⩯爨\ue4a4ꃑ䵠\u0e83\uf78a똶Ⴍ侃ৱﹲ⹐彆艹혓\u1aee귉\uebc9씕냏", Color.alpha(0) + 49, objArr17);
            sb9.append(((String) objArr17[0]).intern());
            sb9.append(e11);
            aFLogger2.m8966v(logTag2, sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str);
            Object[] objArr18 = new Object[1];
            m8766a(" ) (\u001d\f\u000f\r\u0013\u0006\u0006\u0004\u001c\u0003)%", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 15, (byte) (4 - ExpandableListView.getPackedPositionChild(0L)), objArr18);
            sb10.append(((String) objArr18[0]).intern());
            return sb10.toString();
        }
    }
}
