package w8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzj;
import java.util.Arrays;
import n9.m;
import v8.f;
import v8.g;
import va.q0;
import w8.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T extends a<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f34136a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zzj f34137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34138d;

    public a(@NonNull String str) {
        m.l(str);
        m.f(str);
        this.f34136a = new Bundle();
        this.b = str;
    }

    public static void i(@NonNull Bundle bundle, @NonNull String str, @NonNull String... strArr) {
        m.l(str);
        m.l(strArr);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            q0.a("String array is empty and is ignored by put method.");
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < Math.min(strArr2.length, 100); i11++) {
            String str2 = strArr2[i11];
            strArr2[i10] = str2;
            if (strArr2[i11] == null) {
                q0.a("String at " + i11 + " is null and is ignored by put method.");
            } else {
                int i12 = 20000;
                if (str2.length() > 20000) {
                    q0.a("String at " + i11 + " is too long, truncating string.");
                    String strSubstring = strArr2[i10];
                    if (strSubstring.length() > 20000) {
                        if (Character.isHighSurrogate(strSubstring.charAt(19999)) && Character.isLowSurrogate(strSubstring.charAt(20000))) {
                            i12 = 19999;
                        }
                        strSubstring = strSubstring.substring(0, i12);
                    }
                    strArr2[i10] = strSubstring;
                }
                i10++;
            }
        }
        if (i10 > 0) {
            bundle.putStringArray(str, (String[]) k((String[]) Arrays.copyOf(strArr2, i10)));
        }
    }

    public static void j(@NonNull Bundle bundle, @NonNull String str, @NonNull Thing... thingArr) {
        m.l(str);
        m.l(thingArr);
        if (thingArr.length <= 0) {
            q0.a("Thing array is empty and is ignored by put method.");
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < thingArr.length; i11++) {
            thingArr[i10] = thingArr[i11];
            if (thingArr[i11] == null) {
                q0.a("Thing at " + i11 + " is null and is ignored by put method.");
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            bundle.putParcelableArray(str, (Parcelable[]) k((Thing[]) Arrays.copyOf(thingArr, i10)));
        }
    }

    public static Object[] k(Object[] objArr) {
        if (objArr.length < 100) {
            return objArr;
        }
        q0.a("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(objArr, 100);
    }

    @NonNull
    public final g a() {
        Bundle bundle = new Bundle(this.f34136a);
        zzj zzjVarA = this.f34137c;
        if (zzjVarA == null) {
            zzjVarA = new f().a();
        }
        return new Thing(bundle, zzjVarA, this.f34138d, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public T b(@NonNull String str, @NonNull String... strArr) {
        i(this.f34136a, str, strArr);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public <S extends a> T c(@NonNull String str, @NonNull S... sArr) {
        m.l(str);
        m.l(sArr);
        int length = sArr.length;
        if (length <= 0) {
            q0.a("Builder array is empty and is ignored by put method.");
            return this;
        }
        Thing[] thingArr = new Thing[length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            S s8 = sArr[i10];
            if (s8 == null) {
                q0.a("Builder at " + i10 + " is null and is ignored by put method.");
            } else {
                thingArr[i10] = (Thing) s8.a();
            }
        }
        j(this.f34136a, str, thingArr);
        return this;
    }

    @NonNull
    public final T d(@NonNull String str) {
        m.l(str);
        return (T) b("description", str);
    }

    @NonNull
    public T e(@NonNull String str) {
        m.l(str);
        return (T) b("id", str);
    }

    @NonNull
    public final T f(@NonNull String str) {
        m.l(str);
        return (T) b("image", str);
    }

    @NonNull
    public final T g(@NonNull String str) {
        m.l(str);
        return (T) b("name", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final T h(@NonNull String str) {
        m.l(str);
        this.f34138d = str;
        return this;
    }
}
