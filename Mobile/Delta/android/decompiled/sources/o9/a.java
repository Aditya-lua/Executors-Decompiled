package o9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: o9.a$a, reason: collision with other inner class name */
    public static class C0471a extends RuntimeException {
        public C0471a(@NonNull String str, @NonNull Parcel parcel) {
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

    public static short A(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 4);
        return (short) parcel.readInt();
    }

    public static int B(@NonNull Parcel parcel, int i10) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static void C(@NonNull Parcel parcel, int i10) {
        parcel.setDataPosition(parcel.dataPosition() + B(parcel, i10));
    }

    public static int D(@NonNull Parcel parcel) {
        int iU = u(parcel);
        int iB = B(parcel, iU);
        int iN = n(iU);
        int iDataPosition = parcel.dataPosition();
        if (iN != 20293) {
            throw new C0471a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iU))), parcel);
        }
        int i10 = iB + iDataPosition;
        if (i10 >= iDataPosition && i10 <= parcel.dataSize()) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i10).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i10);
        throw new C0471a(sb2.toString(), parcel);
    }

    public static void E(Parcel parcel, int i10, int i11) {
        int iB = B(parcel, i10);
        if (iB == i11) {
            return;
        }
        String hexString = Integer.toHexString(iB);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(iB).length() + 4 + String.valueOf(hexString).length() + 1);
        sb2.append("Expected size ");
        sb2.append(i11);
        sb2.append(" got ");
        sb2.append(iB);
        sb2.append(" (0x");
        sb2.append(hexString);
        sb2.append(")");
        throw new C0471a(sb2.toString(), parcel);
    }

    public static void F(Parcel parcel, int i10, int i11, int i12) {
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
        throw new C0471a(sb2.toString(), parcel);
    }

    @NonNull
    public static boolean[] a(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(iDataPosition + iB);
        return zArrCreateBooleanArray;
    }

    @NonNull
    public static Bundle b(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iB);
        return bundle;
    }

    @NonNull
    public static byte[] c(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iB);
        return bArrCreateByteArray;
    }

    @NonNull
    public static byte[][] d(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        int i11 = parcel.readInt();
        byte[][] bArr = new byte[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i12] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iB);
        return bArr;
    }

    @NonNull
    public static int[] e(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iB);
        return iArrCreateIntArray;
    }

    @NonNull
    public static ArrayList<Integer> f(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iB);
        return arrayList;
    }

    @NonNull
    public static <T extends Parcelable> T g(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iB);
        return tCreateFromParcel;
    }

    @NonNull
    public static String h(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iB);
        return string;
    }

    @NonNull
    public static String[] i(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iB);
        return strArrCreateStringArray;
    }

    @NonNull
    public static ArrayList<String> j(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iB);
        return arrayListCreateStringArrayList;
    }

    @NonNull
    public static <T> T[] k(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iB);
        return tArr;
    }

    @NonNull
    public static <T> ArrayList<T> l(@NonNull Parcel parcel, int i10, @NonNull Parcelable.Creator<T> creator) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iB);
        return arrayListCreateTypedArrayList;
    }

    public static void m(@NonNull Parcel parcel, int i10) {
        if (parcel.dataPosition() == i10) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Overread allowed size end=");
        sb2.append(i10);
        throw new C0471a(sb2.toString(), parcel);
    }

    public static int n(int i10) {
        return (char) i10;
    }

    public static boolean o(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    @NonNull
    public static Boolean p(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        if (iB == 0) {
            return null;
        }
        F(parcel, i10, iB, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double q(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 8);
        return parcel.readDouble();
    }

    @NonNull
    public static Double r(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        if (iB == 0) {
            return null;
        }
        F(parcel, i10, iB, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float s(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 4);
        return parcel.readFloat();
    }

    @NonNull
    public static Float t(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        if (iB == 0) {
            return null;
        }
        F(parcel, i10, iB, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int u(@NonNull Parcel parcel) {
        return parcel.readInt();
    }

    @NonNull
    public static IBinder v(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        int iDataPosition = parcel.dataPosition();
        if (iB == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iB);
        return strongBinder;
    }

    public static int w(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 4);
        return parcel.readInt();
    }

    @NonNull
    public static Integer x(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        if (iB == 0) {
            return null;
        }
        F(parcel, i10, iB, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long y(@NonNull Parcel parcel, int i10) {
        E(parcel, i10, 8);
        return parcel.readLong();
    }

    @NonNull
    public static Long z(@NonNull Parcel parcel, int i10) {
        int iB = B(parcel, i10);
        if (iB == 0) {
            return null;
        }
        F(parcel, i10, iB, 8);
        return Long.valueOf(parcel.readLong());
    }
}
