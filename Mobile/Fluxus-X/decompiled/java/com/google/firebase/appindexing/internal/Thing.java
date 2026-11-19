package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import nf.j;
import nf.k;
import o9.q;
import p9.a;
import p9.c;
import w8.g;
import wa.u;

/* JADX INFO: loaded from: classes2.dex */
public final class Thing extends a implements g, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Thing> CREATOR = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f8595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f8596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f8597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f8598j;

    public Thing(int i10, Bundle bundle, j jVar, String str, String str2) {
        this.f8594f = i10;
        this.f8595g = bundle;
        this.f8596h = jVar;
        this.f8597i = str;
        this.f8598j = str2;
        ClassLoader classLoader = Thing.class.getClassLoader();
        u.a(classLoader);
        bundle.setClassLoader(classLoader);
    }

    public static int C3(Bundle bundle) {
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
                arrayList2.add(Integer.valueOf(q.c(obj)));
            }
        }
        return q.c(arrayList2.toArray());
    }

    public static void D3(@NonNull Bundle bundle, @NonNull StringBuilder sb2) {
        try {
            Set<String> setKeySet = bundle.keySet();
            String[] strArr = (String[]) setKeySet.toArray(new String[setKeySet.size()]);
            Arrays.sort(strArr, new Comparator() { // from class: nf.i
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

    public static boolean E3(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !E3((Bundle) obj, (Bundle) obj2)) {
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
        return q.b(Integer.valueOf(this.f8594f), Integer.valueOf(thing.f8594f)) && q.b(this.f8597i, thing.f8597i) && q.b(this.f8598j, thing.f8598j) && q.b(this.f8596h, thing.f8596h) && E3(this.f8595g, thing.f8595g);
    }

    public final int hashCode() {
        return q.c(Integer.valueOf(this.f8594f), this.f8597i, this.f8598j, Integer.valueOf(this.f8596h.hashCode()), Integer.valueOf(C3(this.f8595g)));
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8598j.equals("Thing") ? "Indexable" : this.f8598j);
        sb2.append(" { { id: ");
        if (this.f8597i == null) {
            sb2.append("<null>");
        } else {
            sb2.append("'");
            sb2.append(this.f8597i);
            sb2.append("'");
        }
        sb2.append(" } Properties { ");
        D3(this.f8595g, sb2);
        sb2.append("} Metadata { ");
        sb2.append(this.f8596h);
        sb2.append(" } }");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.f(parcel, 1, this.f8595g, false);
        c.t(parcel, 2, this.f8596h, i10, false);
        c.v(parcel, 3, this.f8597i, false);
        c.v(parcel, 4, this.f8598j, false);
        c.n(parcel, 1000, this.f8594f);
        c.b(parcel, iA);
    }

    public Thing(@NonNull Bundle bundle, @NonNull j jVar, String str, @NonNull String str2) {
        this.f8594f = 10;
        this.f8595g = bundle;
        this.f8596h = jVar;
        this.f8597i = str;
        this.f8598j = str2;
    }
}
