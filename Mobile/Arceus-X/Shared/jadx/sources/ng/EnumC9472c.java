package ng;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ng.c */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC9472c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* JADX INFO: renamed from: D */
    public static final Map<Integer, EnumC9472c> f34046D = new HashMap();

    /* JADX INFO: renamed from: E */
    public static final Map<String, EnumC9472c> f34047E = new HashMap();

    /* JADX INFO: renamed from: a */
    public final int[] f34073a;

    /* JADX INFO: renamed from: b */
    public final String[] f34074b;

    static {
        for (EnumC9472c enumC9472c : values()) {
            if (Charset.isSupported(enumC9472c.name())) {
                for (int i10 : enumC9472c.f34073a) {
                    f34046D.put(Integer.valueOf(i10), enumC9472c);
                }
                f34047E.put(enumC9472c.name(), enumC9472c);
                for (String str : enumC9472c.f34074b) {
                    f34047E.put(str, enumC9472c);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC9472c(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    /* JADX INFO: renamed from: a */
    public static EnumC9472c m37320a(Charset charset) {
        return f34047E.get(charset.name());
    }

    /* JADX INFO: renamed from: b */
    public static EnumC9472c m37321b(String str) {
        return f34047E.get(str);
    }

    /* JADX INFO: renamed from: c */
    public int m37322c() {
        return this.f34073a[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    EnumC9472c(int i10, String... strArr) {
        this.f34073a = new int[]{i10};
        this.f34074b = strArr;
    }

    EnumC9472c(int[] iArr, String... strArr) {
        this.f34073a = iArr;
        this.f34074b = strArr;
    }
}
