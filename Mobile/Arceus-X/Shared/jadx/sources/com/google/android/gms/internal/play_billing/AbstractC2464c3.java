package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.AbstractC2453b3;
import com.google.android.gms.internal.play_billing.AbstractC2464c3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2464c3<MessageType extends AbstractC2464c3<MessageType, BuilderType>, BuilderType extends AbstractC2453b3<MessageType, BuilderType>> implements InterfaceC2697x5 {
    protected transient int zza = 0;

    /* JADX INFO: renamed from: d */
    public static void m11330d(Iterable iterable, List list) {
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof C2500f6) {
            ((C2500f6) list).m11407d(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = list2.get(i10);
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m11331b() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            boolean z10 = AbstractC2443a4.f8899b;
            C2695x3 c2695x3 = new C2695x3(bArr, 0, iZzn);
            mo11749a(c2695x3);
            c2695x3.m11175a();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public int mo11332c(InterfaceC2522h6 interfaceC2522h6) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2697x5
    /* JADX INFO: renamed from: e */
    public final AbstractC2640s3 mo11333e() {
        try {
            int iZzn = zzn();
            AbstractC2640s3 abstractC2640s3 = AbstractC2640s3.f9227b;
            byte[] bArr = new byte[iZzn];
            boolean z10 = AbstractC2443a4.f8899b;
            C2695x3 c2695x3 = new C2695x3(bArr, 0, iZzn);
            mo11749a(c2695x3);
            return C2596o3.m11632a(c2695x3, bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
