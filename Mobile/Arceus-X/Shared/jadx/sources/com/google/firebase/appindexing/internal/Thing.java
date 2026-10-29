package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import p271lf.C8136h;
import p305n9.C8947k;
import p325o9.C9718b;
import p487v8.InterfaceC12106g;
import va.C12151u;

/* JADX INFO: loaded from: classes2.dex */
public final class Thing extends AbstractSafeParcelable implements InterfaceC12106g, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Thing> CREATOR = new C8136h();

    /* JADX INFO: renamed from: f */
    public final int f11161f;

    /* JADX INFO: renamed from: g */
    public final Bundle f11162g;

    /* JADX INFO: renamed from: h */
    public final zzj f11163h;

    /* JADX INFO: renamed from: i */
    public final String f11164i;

    /* JADX INFO: renamed from: j */
    public final String f11165j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Thing(int i10, Bundle bundle, zzj zzjVar, String str, String str2) {
        this.f11161f = i10;
        this.f11162g = bundle;
        this.f11163h = zzjVar;
        this.f11164i = str;
        this.f11165j = str2;
        ClassLoader classLoader = Thing.class.getClassLoader();
        C12151u.m44978a(classLoader);
        bundle.setClassLoader(classLoader);
    }

    /* JADX INFO: renamed from: x3 */
    public static int m14386x3(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = bundle.get((String) arrayList.get(i10));
            if (obj instanceof boolean[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((boolean[]) obj)));
            } else if (obj instanceof long[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((long[]) obj)));
            } else if (obj instanceof double[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((double[]) obj)));
            } else if (obj instanceof byte[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((byte[]) obj)));
            } else if (obj instanceof Object[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((Object[]) obj)));
            } else {
                arrayList2.add(Integer.valueOf(C8947k.m36027c(obj)));
            }
        }
        return C8947k.m36027c(arrayList2.toArray());
    }

    /* JADX INFO: renamed from: y3 */
    public static void m14387y3(@NonNull Bundle bundle, @NonNull StringBuilder sb2) {
        try {
            Set<String> setKeySet = bundle.keySet();
            String[] strArr = (String[]) setKeySet.toArray(new String[setKeySet.size()]);
            Arrays.sort(strArr, new Comparator() { // from class: lf.g
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    String str = (String) obj;
                    String str2 = (String) obj2;
                    Parcelable.Creator<Thing> creator = Thing.CREATOR;
                    if (str == null) {
                        return str2 != null ? -1 : 0;
                    }
                    if (str2 == null) {
                        return 1;
                    }
                    return str.compareTo(str2);
                }
            });
            for (String str : strArr) {
                sb2.append("{ key: '");
                sb2.append(str);
                sb2.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    sb2.append("<null>");
                } else if (obj.getClass().isArray()) {
                    sb2.append("[ ");
                    for (int i10 = 0; i10 < Array.getLength(obj); i10++) {
                        sb2.append("'");
                        sb2.append(Array.get(obj, i10));
                        sb2.append("' ");
                    }
                    sb2.append("]");
                } else {
                    sb2.append(obj);
                }
                sb2.append(" } ");
            }
        } catch (RuntimeException unused) {
            sb2.append("<error>");
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static boolean m14388z3(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m14388z3((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
                obj2 = null;
            }
            if (obj instanceof boolean[]) {
                if (!(obj2 instanceof boolean[]) || !Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof double[]) {
                if (!(obj2 instanceof double[]) || !Arrays.equals((double[]) obj, (double[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && (!(obj2 instanceof Object[]) || !Arrays.equals((Object[]) obj, (Object[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) obj;
        return C8947k.m36026b(Integer.valueOf(this.f11161f), Integer.valueOf(thing.f11161f)) && C8947k.m36026b(this.f11164i, thing.f11164i) && C8947k.m36026b(this.f11165j, thing.f11165j) && C8947k.m36026b(this.f11163h, thing.f11163h) && m14388z3(this.f11162g, thing.f11162g);
    }

    public final int hashCode() {
        return C8947k.m36027c(Integer.valueOf(this.f11161f), this.f11164i, this.f11165j, Integer.valueOf(this.f11163h.hashCode()), Integer.valueOf(m14386x3(this.f11162g)));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11165j.equals("Thing") ? "Indexable" : this.f11165j);
        sb2.append(" { { id: ");
        if (this.f11164i == null) {
            sb2.append("<null>");
        } else {
            sb2.append("'");
            sb2.append(this.f11164i);
            sb2.append("'");
        }
        sb2.append(" } Properties { ");
        m14387y3(this.f11162g, sb2);
        sb2.append("} Metadata { ");
        sb2.append(this.f11163h);
        sb2.append(" } }");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38462f(parcel, 1, this.f11162g, false);
        C9718b.m38476t(parcel, 2, this.f11163h, i10, false);
        C9718b.m38478v(parcel, 3, this.f11164i, false);
        C9718b.m38478v(parcel, 4, this.f11165j, false);
        C9718b.m38470n(parcel, 1000, this.f11161f);
        C9718b.m38458b(parcel, iM38457a);
    }

    public Thing(@NonNull Bundle bundle, @NonNull zzj zzjVar, String str, @NonNull String str2) {
        this.f11161f = 10;
        this.f11162g = bundle;
        this.f11163h = zzjVar;
        this.f11164i = str;
        this.f11165j = str2;
    }
}
