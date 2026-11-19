package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.v9;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class u9<MessageType extends v9<MessageType, BuilderType>, BuilderType extends u9<MessageType, BuilderType>> implements rc {
    public static void k(List list, int i10) {
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

    public static void p(Iterable iterable, List list) {
        Charset charset = ub.f6869a;
        iterable.getClass();
        if (iterable instanceof cc) {
            List listZza = ((cc) iterable).zza();
            cc ccVar = (cc) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = ccVar.size() - size;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String string = sb2.toString();
                    int size3 = ccVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        ccVar.remove(size3);
                    }
                } else if (obj instanceof la) {
                    ccVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    la.h(bArr, 0, bArr.length);
                    ccVar.zzb();
                } else {
                    ccVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zc) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof bd) {
                ((bd) list).c(list.size() + size4);
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    k(list, size5);
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
                k(list, size5);
            }
            list.add(obj3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.rc
    public final /* synthetic */ rc A(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.rc
    public final /* synthetic */ rc Q(byte[] bArr, va vaVar) {
        return o(bArr, 0, bArr.length, vaVar);
    }

    public abstract u9 l(byte[] bArr, int i10, int i11);

    public abstract u9 o(byte[] bArr, int i10, int i11, va vaVar);
}
