package p510w8;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzj;
import java.util.Arrays;
import p305n9.C8953m;
import p487v8.C12105f;
import p487v8.InterfaceC12106g;
import p510w8.AbstractC12324a;
import va.C12144q0;

/* JADX INFO: renamed from: w8.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12324a<T extends AbstractC12324a<?>> {

    /* JADX INFO: renamed from: a */
    public final Bundle f44176a;

    /* JADX INFO: renamed from: b */
    public final String f44177b;

    /* JADX INFO: renamed from: c */
    public zzj f44178c;

    /* JADX INFO: renamed from: d */
    public String f44179d;

    public AbstractC12324a(@NonNull String str) {
        C8953m.m36047l(str);
        C8953m.m36041f(str);
        this.f44176a = new Bundle();
        this.f44177b = str;
    }

    /* JADX INFO: renamed from: i */
    public static void m46162i(@NonNull Bundle bundle, @NonNull String str, @NonNull String... strArr) {
        C8953m.m36047l(str);
        C8953m.m36047l(strArr);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length <= 0) {
            C12144q0.m44975a("String array is empty and is ignored by put method.");
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < Math.min(strArr2.length, 100); i11++) {
            String str2 = strArr2[i11];
            strArr2[i10] = str2;
            if (strArr2[i11] == null) {
                C12144q0.m44975a("String at " + i11 + " is null and is ignored by put method.");
            } else {
                int i12 = 20000;
                if (str2.length() > 20000) {
                    C12144q0.m44975a("String at " + i11 + " is too long, truncating string.");
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
            bundle.putStringArray(str, (String[]) m46164k((String[]) Arrays.copyOf(strArr2, i10)));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m46163j(@NonNull Bundle bundle, @NonNull String str, @NonNull Thing... thingArr) {
        C8953m.m36047l(str);
        C8953m.m36047l(thingArr);
        if (thingArr.length <= 0) {
            C12144q0.m44975a("Thing array is empty and is ignored by put method.");
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < thingArr.length; i11++) {
            thingArr[i10] = thingArr[i11];
            if (thingArr[i11] == null) {
                C12144q0.m44975a("Thing at " + i11 + " is null and is ignored by put method.");
            } else {
                i10++;
            }
        }
        if (i10 > 0) {
            bundle.putParcelableArray(str, (Parcelable[]) m46164k((Thing[]) Arrays.copyOf(thingArr, i10)));
        }
    }

    /* JADX INFO: renamed from: k */
    public static Object[] m46164k(Object[] objArr) {
        if (objArr.length < 100) {
            return objArr;
        }
        C12144q0.m44975a("Input Array of elements is too big, cutting off.");
        return Arrays.copyOf(objArr, 100);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC12106g m46165a() {
        Bundle bundle = new Bundle(this.f44176a);
        zzj zzjVarM44945a = this.f44178c;
        if (zzjVarM44945a == null) {
            zzjVarM44945a = new C12105f().m44945a();
        }
        return new Thing(bundle, zzjVarM44945a, this.f44179d, this.f44177b);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: w8.a<T extends w8.a<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: b */
    public T m46166b(@NonNull String str, @NonNull String... strArr) {
        m46162i(this.f44176a, str, strArr);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: w8.a<T extends w8.a<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: c */
    public <S extends AbstractC12324a> T m46167c(@NonNull String str, @NonNull S... sArr) {
        C8953m.m36047l(str);
        C8953m.m36047l(sArr);
        int length = sArr.length;
        if (length <= 0) {
            C12144q0.m44975a("Builder array is empty and is ignored by put method.");
            return this;
        }
        Thing[] thingArr = new Thing[length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            S s8 = sArr[i10];
            if (s8 == null) {
                C12144q0.m44975a("Builder at " + i10 + " is null and is ignored by put method.");
            } else {
                thingArr[i10] = (Thing) s8.m46165a();
            }
        }
        m46163j(this.f44176a, str, thingArr);
        return this;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final T m46168d(@NonNull String str) {
        C8953m.m36047l(str);
        return (T) m46166b("description", str);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public T m46169e(@NonNull String str) {
        C8953m.m36047l(str);
        return (T) m46166b("id", str);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final T m46170f(@NonNull String str) {
        C8953m.m36047l(str);
        return (T) m46166b("image", str);
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public final T m46171g(@NonNull String str) {
        C8953m.m36047l(str);
        return (T) m46166b("name", str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: w8.a<T extends w8.a<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    /* JADX INFO: renamed from: h */
    public final T m46172h(@NonNull String str) {
        C8953m.m36047l(str);
        this.f44179d = str;
        return this;
    }
}
