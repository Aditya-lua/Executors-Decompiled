package p325o9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* JADX INFO: renamed from: o9.b */
/* JADX INFO: loaded from: classes.dex */
public class C9718b {
    /* JADX INFO: renamed from: A */
    public static void m38453A(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    /* JADX INFO: renamed from: B */
    public static int m38454B(Parcel parcel, int i10) {
        parcel.writeInt(i10 | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: C */
    public static void m38455C(Parcel parcel, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    /* JADX INFO: renamed from: D */
    public static void m38456D(Parcel parcel, Parcelable parcelable, int i10) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    /* JADX INFO: renamed from: a */
    public static int m38457a(@NonNull Parcel parcel) {
        return m38454B(parcel, 20293);
    }

    /* JADX INFO: renamed from: b */
    public static void m38458b(@NonNull Parcel parcel, int i10) {
        m38455C(parcel, i10);
    }

    /* JADX INFO: renamed from: c */
    public static void m38459c(@NonNull Parcel parcel, int i10, boolean z10) {
        m38453A(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: d */
    public static void m38460d(@NonNull Parcel parcel, int i10, @NonNull boolean[] zArr, boolean z10) {
        if (zArr == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
            }
        } else {
            int iM38454B = m38454B(parcel, i10);
            parcel.writeBooleanArray(zArr);
            m38455C(parcel, iM38454B);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m38461e(@NonNull Parcel parcel, int i10, @NonNull Boolean bool, boolean z10) {
        if (bool != null) {
            m38453A(parcel, i10, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z10) {
            m38453A(parcel, i10, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m38462f(@NonNull Parcel parcel, int i10, @NonNull Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
            }
        } else {
            int iM38454B = m38454B(parcel, i10);
            parcel.writeBundle(bundle);
            m38455C(parcel, iM38454B);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m38463g(@NonNull Parcel parcel, int i10, @NonNull byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
            }
        } else {
            int iM38454B = m38454B(parcel, i10);
            parcel.writeByteArray(bArr);
            m38455C(parcel, iM38454B);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m38464h(@NonNull Parcel parcel, int i10, @NonNull byte[][] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
                return;
            }
            return;
        }
        int iM38454B = m38454B(parcel, i10);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m38455C(parcel, iM38454B);
    }

    /* JADX INFO: renamed from: i */
    public static void m38465i(@NonNull Parcel parcel, int i10, double d10) {
        m38453A(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    /* JADX INFO: renamed from: j */
    public static void m38466j(@NonNull Parcel parcel, int i10, @NonNull Double d10, boolean z10) {
        if (d10 != null) {
            m38453A(parcel, i10, 8);
            parcel.writeDouble(d10.doubleValue());
        } else if (z10) {
            m38453A(parcel, i10, 0);
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m38467k(@NonNull Parcel parcel, int i10, float f10) {
        m38453A(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    /* JADX INFO: renamed from: l */
    public static void m38468l(@NonNull Parcel parcel, int i10, @NonNull Float f10, boolean z10) {
        if (f10 != null) {
            m38453A(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            m38453A(parcel, i10, 0);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m38469m(@NonNull Parcel parcel, int i10, @NonNull IBinder iBinder, boolean z10) {
        if (iBinder == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
            }
        } else {
            int iM38454B = m38454B(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            m38455C(parcel, iM38454B);
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m38470n(@NonNull Parcel parcel, int i10, int i11) {
        m38453A(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    /* JADX INFO: renamed from: o */
    public static void m38471o(@NonNull Parcel parcel, int i10, @NonNull int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
            }
        } else {
            int iM38454B = m38454B(parcel, i10);
            parcel.writeIntArray(iArr);
            m38455C(parcel, iM38454B);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m38472p(@NonNull Parcel parcel, int i10, @NonNull List<Integer> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
                return;
            }
            return;
        }
        int iM38454B = m38454B(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(list.get(i11).intValue());
        }
        m38455C(parcel, iM38454B);
    }

    /* JADX INFO: renamed from: q */
    public static void m38473q(@NonNull Parcel parcel, int i10, @NonNull Integer num, boolean z10) {
        if (num != null) {
            m38453A(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            m38453A(parcel, i10, 0);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m38474r(@NonNull Parcel parcel, int i10, long j10) {
        m38453A(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    /* JADX INFO: renamed from: s */
    public static void m38475s(@NonNull Parcel parcel, int i10, @NonNull Long l10, boolean z10) {
        if (l10 != null) {
            m38453A(parcel, i10, 8);
            parcel.writeLong(l10.longValue());
        } else if (z10) {
            m38453A(parcel, i10, 0);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m38476t(@NonNull Parcel parcel, int i10, @NonNull Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
            }
        } else {
            int iM38454B = m38454B(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            m38455C(parcel, iM38454B);
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m38477u(@NonNull Parcel parcel, int i10, short s8) {
        m38453A(parcel, i10, 4);
        parcel.writeInt(s8);
    }

    /* JADX INFO: renamed from: v */
    public static void m38478v(@NonNull Parcel parcel, int i10, @NonNull String str, boolean z10) {
        if (str == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
            }
        } else {
            int iM38454B = m38454B(parcel, i10);
            parcel.writeString(str);
            m38455C(parcel, iM38454B);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m38479w(@NonNull Parcel parcel, int i10, @NonNull String[] strArr, boolean z10) {
        if (strArr == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
            }
        } else {
            int iM38454B = m38454B(parcel, i10);
            parcel.writeStringArray(strArr);
            m38455C(parcel, iM38454B);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m38480x(@NonNull Parcel parcel, int i10, @NonNull List<String> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
            }
        } else {
            int iM38454B = m38454B(parcel, i10);
            parcel.writeStringList(list);
            m38455C(parcel, iM38454B);
        }
    }

    /* JADX INFO: renamed from: y */
    public static <T extends Parcelable> void m38481y(@NonNull Parcel parcel, int i10, @NonNull T[] tArr, int i11, boolean z10) {
        if (tArr == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
                return;
            }
            return;
        }
        int iM38454B = m38454B(parcel, i10);
        parcel.writeInt(tArr.length);
        for (T t8 : tArr) {
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                m38456D(parcel, t8, i11);
            }
        }
        m38455C(parcel, iM38454B);
    }

    /* JADX INFO: renamed from: z */
    public static <T extends Parcelable> void m38482z(@NonNull Parcel parcel, int i10, @NonNull List<T> list, boolean z10) {
        if (list == null) {
            if (z10) {
                m38453A(parcel, i10, 0);
                return;
            }
            return;
        }
        int iM38454B = m38454B(parcel, i10);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            T t8 = list.get(i11);
            if (t8 == null) {
                parcel.writeInt(0);
            } else {
                m38456D(parcel, t8, 0);
            }
        }
        m38455C(parcel, iM38454B);
    }
}
