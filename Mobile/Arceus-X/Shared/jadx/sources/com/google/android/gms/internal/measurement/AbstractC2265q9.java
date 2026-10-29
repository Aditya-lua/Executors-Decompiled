package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2265q9;
import com.google.android.gms.internal.measurement.AbstractC2283r9;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2265q9<MessageType extends AbstractC2283r9<MessageType, BuilderType>, BuilderType extends AbstractC2265q9<MessageType, BuilderType>> implements InterfaceC2214nc {
    /* JADX INFO: renamed from: i */
    public static void m10574i(List list, int i10) {
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

    /* JADX INFO: renamed from: n */
    public static void m10575n(Iterable iterable, List list) {
        Charset charset = C2267qb.f8595a;
        iterable.getClass();
        if (iterable instanceof InterfaceC2411yb) {
            List listZza = ((InterfaceC2411yb) iterable).zza();
            InterfaceC2411yb interfaceC2411yb = (InterfaceC2411yb) list;
            int size = list.size();
            for (Object obj : listZza) {
                if (obj == null) {
                    int size2 = interfaceC2411yb.size() - size;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size2).length() + 26);
                    sb2.append("Element at index ");
                    sb2.append(size2);
                    sb2.append(" is null.");
                    String string = sb2.toString();
                    int size3 = interfaceC2411yb.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            throw new NullPointerException(string);
                        }
                        interfaceC2411yb.remove(size3);
                    }
                } else if (obj instanceof AbstractC2104ha) {
                    interfaceC2411yb.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    AbstractC2104ha.m10185h(bArr, 0, bArr.length);
                    interfaceC2411yb.zzb();
                } else {
                    interfaceC2411yb.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC2358vc) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof C2394xc) {
                ((C2394xc) list).m10985c(list.size() + size4);
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    m10574i(list, size5);
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
                m10574i(list, size5);
            }
            list.add(obj3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2214nc
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC2214nc mo10471I(byte[] bArr, C2284ra c2284ra) {
        return mo9877k(bArr, 0, bArr.length, c2284ra);
    }

    /* JADX INFO: renamed from: j */
    public abstract AbstractC2265q9 mo9876j(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: k */
    public abstract AbstractC2265q9 mo9877k(byte[] bArr, int i10, int i11, C2284ra c2284ra);

    @Override // com.google.android.gms.internal.measurement.InterfaceC2214nc
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC2214nc mo10472u(byte[] bArr) {
        return mo9876j(bArr, 0, bArr.length);
    }
}
