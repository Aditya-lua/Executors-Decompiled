package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2265q9;
import com.google.android.gms.internal.measurement.AbstractC2283r9;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2283r9<MessageType extends AbstractC2283r9<MessageType, BuilderType>, BuilderType extends AbstractC2265q9<MessageType, BuilderType>> implements InterfaceC2232oc {
    protected int zza = 0;

    /* JADX INFO: renamed from: i */
    public static void m10627i(Iterable iterable, List list) {
        AbstractC2265q9.m10575n(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2232oc
    /* JADX INFO: renamed from: b */
    public final AbstractC2104ha mo10514b() {
        try {
            int iMo10063a = mo10063a();
            AbstractC2104ha abstractC2104ha = AbstractC2104ha.f8218b;
            byte[] bArr = new byte[iMo10063a];
            Logger logger = AbstractC2194ma.f8418b;
            C2158ka c2158ka = new C2158ka(bArr, 0, iMo10063a);
            mo10064c(c2158ka);
            return C2047ea.m9945a(c2158ka, bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m10628d() {
        try {
            int iMo10063a = mo10063a();
            byte[] bArr = new byte[iMo10063a];
            Logger logger = AbstractC2194ma.f8418b;
            C2158ka c2158ka = new C2158ka(bArr, 0, iMo10063a);
            mo10064c(c2158ka);
            c2158ka.m10387e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    /* JADX INFO: renamed from: g */
    public int mo10066g(InterfaceC2430zc interfaceC2430zc) {
        throw null;
    }
}
