package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.q9;
import com.google.android.gms.internal.measurement.r9;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class q9<MessageType extends r9<MessageType, BuilderType>, BuilderType extends q9<MessageType, BuilderType>> implements nc {
    public static void i(List list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public static void n(Iterable iterable, List list) {
        Charset charset = qb.f6750a;
        iterable.getClass();
        if (iterable instanceof yb) {
            List listZza = ((yb) iterable).zza();
            yb ybVar = (yb) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = ybVar.size() - size;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String string = sb2.toString();
                    int size3 = ybVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        ybVar.remove(size3);
                    }
                } else if (obj instanceof ha) {
                    ybVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    ha.h(bArr, 0, bArr.length);
                    ybVar.zzb();
                } else {
                    ybVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof vc) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof xc) {
                ((xc) list).c(list.size() + size4);
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    i(list, size5);
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj3 = list2.get(i10);
            if (obj3 == null) {
                i(list, size5);
            }
            list.add(obj3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.nc
    public final /* synthetic */ nc I(byte[] bArr, ra raVar) {
        return k(bArr, 0, bArr.length, raVar);
    }

    public abstract q9 j(byte[] bArr, int i10, int i11);

    public abstract q9 k(byte[] bArr, int i10, int i11, ra raVar);

    @Override // com.google.android.gms.internal.measurement.nc
    public final /* synthetic */ nc m(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }
}
