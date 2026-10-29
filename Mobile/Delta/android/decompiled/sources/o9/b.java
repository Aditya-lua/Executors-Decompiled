package o9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static void A(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static int B(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void C(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static void D(Parcel parcel, Parcelable parcelable, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static int a(@NonNull Parcel parcel) {
        return B(parcel, 20293);
    }

    public static void b(@NonNull Parcel parcel, int i10) {
        C(parcel, i10);
    }

    public static void c(@NonNull Parcel parcel, int i10, boolean z10) {
        A(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void d(@NonNull Parcel parcel, int i10, @NonNull boolean[] zArr, boolean z10) {
        if (zArr == null) {
            if (z10) {
                A(parcel, i10, 0);
            }
        } else {
            int iB = B(parcel, i10);
            parcel.writeBooleanArray(zArr);
            C(parcel, iB);
        }
    }

    public static void e(@NonNull Parcel parcel, int i10, @NonNull Boolean bool, boolean z10) {
        if (bool != null) {
            A(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            A(parcel, i10, 0);
        }
    }

    public static void f(@NonNull Parcel parcel, int i10, @NonNull Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                A(parcel, i10, 0);
            }
        } else {
            int iB = B(parcel, i10);
            parcel.writeBundle(bundle);
            C(parcel, iB);
        }
    }

    public static void g(@NonNull Parcel parcel, int i10, @NonNull byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                A(parcel, i10, 0);
            }
        } else {
            int iB = B(parcel, i10);
            parcel.writeByteArray(bArr);
            C(parcel, iB);
        }
    }

    public static void h(@NonNull Parcel parcel, int i10, @NonNull byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                A(parcel, i10, 0);
                return;
            }
            return;
        }
        int iB = B(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        C(parcel, iB);
    }

    public static void i(@NonNull Parcel parcel, int i10, double d10) {
        A(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void j(@NonNull Parcel parcel, int i10, @NonNull Double d10, boolean z10) {
        if (d10 != null) {
            A(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            A(parcel, i10, 0);
        }
    }

    public static void k(@NonNull Parcel parcel, int i10, float f10) {
        A(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void l(@NonNull Parcel parcel, int i10, @NonNull Float f10, boolean z10) {
        if (f10 != null) {
            A(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            A(parcel, i10, 0);
        }
    }

    public static void m(@NonNull Parcel parcel, int i10, @NonNull IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                A(parcel, i10, 0);
            }
        } else {
            int iB = B(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            C(parcel, iB);
        }
    }

    public static void n(@NonNull Parcel parcel, int i10, int i11) {
        A(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void o(@NonNull Parcel parcel, int i10, @NonNull int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                A(parcel, i10, 0);
            }
        } else {
            int iB = B(parcel, i10);
            parcel.writeIntArray(iArr);
            C(parcel, iB);
        }
    }

    public static void p(@NonNull Parcel parcel, int i10, @NonNull List<Integer> list, boolean z10) {
        if (list == null) {
            if (z10) {
                A(parcel, i10, 0);
                return;
            }
            return;
        }
        int iB = B(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(list.get(i11).intValue());
        }
        C(parcel, iB);
    }

    public static void q(@NonNull Parcel parcel, int i10, @NonNull Integer num, boolean z10) {
        if (num != null) {
            A(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            A(parcel, i10, 0);
        }
    }

    public static void r(@NonNull Parcel parcel, int i10, long j10) {
        A(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void s(@NonNull Parcel parcel, int i10, @NonNull Long l10, boolean z10) {
        if (l10 != null) {
            A(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            A(parcel, i10, 0);
        }
    }

    public static void t(@NonNull Parcel parcel, int i10, @NonNull Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                A(parcel, i10, 0);
            }
        } else {
            int iB = B(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            C(parcel, iB);
        }
    }

    public static void u(@NonNull Parcel parcel, int i10, short s8) {
        A(parcel, i10, 4);
        parcel.writeInt(s8);
    }

    public static void v(@NonNull Parcel parcel, int i10, @NonNull String str, boolean z10) {
        if (str == null) {
            if (z10) {
                A(parcel, i10, 0);
            }
        } else {
            int iB = B(parcel, i10);
            parcel.writeString(str);
            C(parcel, iB);
        }
    }

    public static void w(@NonNull Parcel parcel, int i10, @NonNull String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                A(parcel, i10, 0);
            }
        } else {
            int iB = B(parcel, i10);
            parcel.writeStringArray(strArr);
            C(parcel, iB);
        }
    }

    public static void x(@NonNull Parcel parcel, int i10, @NonNull List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                A(parcel, i10, 0);
            }
        } else {
            int iB = B(parcel, i10);
            parcel.writeStringList(list);
            C(parcel, iB);
        }
    }

    public static <T extends Parcelable> void y(@NonNull Parcel parcel, int i10, @NonNull T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                A(parcel, i10, 0);
                return;
            }
            return;
        }
        int iB = B(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t8 : tArr) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                D(parcel, t8, i11);
            }
        }
        C(parcel, iB);
    }

    public static <T extends Parcelable> void z(@NonNull Parcel parcel, int i10, @NonNull List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                A(parcel, i10, 0);
                return;
            }
            return;
        }
        int iB = B(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t8 = list.get(i11);
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                D(parcel, t8, 0);
            }
        }
        C(parcel, iB);
    }
}
