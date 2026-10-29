package p325o9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.util.ArrayList;

/* JADX INFO: renamed from: o9.a */
/* JADX INFO: loaded from: classes.dex */
public class C9717a {

    /* JADX INFO: renamed from: o9.a$a */
    public static class a extends RuntimeException {
        public a(@NonNull String str, @NonNull Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb2.append(str);
            sb2.append(" Parcel: pos=");
            sb2.append(iDataPosition);
            sb2.append(" size=");
            sb2.append(iDataSize);
            super(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: A */
    public static short m38421A(@NonNull Parcel parcel, int i10) {
        m38425E(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    /* JADX INFO: renamed from: B */
    public static int m38422B(@NonNull Parcel parcel, int i10) {
        return (i10 & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: C */
    public static void m38423C(@NonNull Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + m38422B(parcel, i10));
    }

    /* JADX INFO: renamed from: D */
    public static int m38424D(@NonNull Parcel parcel) {
        int iM38447u = m38447u(parcel);
        int iM38422B = m38422B(parcel, iM38447u);
        int iM38440n = m38440n(iM38447u);
        int iDataPosition = parcel.dataPosition();
        if (iM38440n != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iM38447u))), parcel);
        }
        int i10 = iM38422B + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    /* JADX INFO: renamed from: E */
    public static void m38425E(Parcel parcel, int i10, int i11) {
        int iM38422B = m38422B(parcel, i10);
        if (iM38422B == i11) {
            return;
        }
        String hexString = Integer.toHexString(iM38422B);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(iM38422B).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(iM38422B);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    /* JADX INFO: renamed from: F */
    public static void m38426F(Parcel parcel, int i10, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(i11).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i12);
        sb2.append(" got ");
        sb2.append(i11);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new a(sb2.toString(), parcel);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static boolean[] m38427a(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + iM38422B);
        return zArrCreateBooleanArray;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static Bundle m38428b(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM38422B);
        return bundle;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static byte[] m38429c(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iM38422B);
        return bArrCreateByteArray;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static byte[][] m38430d(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        byte[][] bArr = new byte[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iM38422B);
        return bArr;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static int[] m38431e(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM38422B);
        return iArrCreateIntArray;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static ArrayList<Integer> m38432f(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iM38422B);
        return arrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static <T extends Parcelable> T m38433g(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM38422B);
        return tCreateFromParcel;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static String m38434h(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM38422B);
        return string;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static String[] m38435i(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iM38422B);
        return strArrCreateStringArray;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static ArrayList<String> m38436j(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM38422B);
        return arrayListCreateStringArrayList;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public static <T> T[] m38437k(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM38422B);
        return tArr;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public static <T> ArrayList<T> m38438l(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM38422B);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: m */
    public static void m38439m(@NonNull Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new a(sb2.toString(), parcel);
    }

    /* JADX INFO: renamed from: n */
    public static int m38440n(int i10) {
        return (char) i10;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m38441o(@NonNull Parcel parcel, int i10) {
        m38425E(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public static Boolean m38442p(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        if (iM38422B == 0) {
            return null;
        }
        m38426F(parcel, i10, iM38422B, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* JADX INFO: renamed from: q */
    public static double m38443q(@NonNull Parcel parcel, int i10) {
        m38425E(parcel, i10, 8);
        return parcel.readDouble();
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public static Double m38444r(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        if (iM38422B == 0) {
            return null;
        }
        m38426F(parcel, i10, iM38422B, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* JADX INFO: renamed from: s */
    public static float m38445s(@NonNull Parcel parcel, int i10) {
        m38425E(parcel, i10, 4);
        return parcel.readFloat();
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public static Float m38446t(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        if (iM38422B == 0) {
            return null;
        }
        m38426F(parcel, i10, iM38422B, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* JADX INFO: renamed from: u */
    public static int m38447u(@NonNull Parcel parcel) {
        return parcel.readInt();
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public static IBinder m38448v(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iM38422B == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM38422B);
        return strongBinder;
    }

    /* JADX INFO: renamed from: w */
    public static int m38449w(@NonNull Parcel parcel, int i10) {
        m38425E(parcel, i10, 4);
        return parcel.readInt();
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public static Integer m38450x(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        if (iM38422B == 0) {
            return null;
        }
        m38426F(parcel, i10, iM38422B, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* JADX INFO: renamed from: y */
    public static long m38451y(@NonNull Parcel parcel, int i10) {
        m38425E(parcel, i10, 8);
        return parcel.readLong();
    }

    @NonNull
    /* JADX INFO: renamed from: z */
    public static Long m38452z(@NonNull Parcel parcel, int i10) {
        int iM38422B = m38422B(parcel, i10);
        if (iM38422B == 0) {
            return null;
        }
        m38426F(parcel, i10, iM38422B, 8);
        return Long.valueOf(parcel.readLong());
    }
}
