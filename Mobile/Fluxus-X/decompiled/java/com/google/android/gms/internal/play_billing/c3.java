package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.c3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c3<MessageType extends c3<MessageType, BuilderType>, BuilderType extends b3<MessageType, BuilderType>> implements x5 {
    protected transient int zza = 0;

    public static void d(Iterable iterable, List list) {
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof f6) {
            ((f6) list).d(list.size() + size);
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

    public final byte[] b() {
        try {
            int iZzn = zzn();
            byte[] bArr = new byte[iZzn];
            boolean z10 = a4.b;
            x3 x3Var = new x3(bArr, 0, iZzn);
            a(x3Var);
            x3Var.a();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public int c(h6 h6Var) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.x5
    public final s3 e() {
        try {
            int iZzn = zzn();
            s3 s3Var = s3.b;
            byte[] bArr = new byte[iZzn];
            boolean z10 = a4.b;
            x3 x3Var = new x3(bArr, 0, iZzn);
            a(x3Var);
            return o3.a(x3Var, bArr);
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }
}
