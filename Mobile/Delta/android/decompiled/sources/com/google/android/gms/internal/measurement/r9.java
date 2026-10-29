package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.q9;
import com.google.android.gms.internal.measurement.r9;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class r9<MessageType extends r9<MessageType, BuilderType>, BuilderType extends q9<MessageType, BuilderType>> implements oc {
    protected int zza = 0;

    public static void i(Iterable iterable, List list) {
        q9.n(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.oc
    public final ha b() {
        try {
            int iA = a();
            ha haVar = ha.b;
            byte[] bArr = new byte[iA];
            Logger logger = ma.b;
            ka kaVar = new ka(bArr, 0, iA);
            c(kaVar);
            return ea.a(kaVar, bArr);
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public final byte[] d() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            Logger logger = ma.b;
            ka kaVar = new ka(bArr, 0, iA);
            c(kaVar);
            kaVar.e();
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

    public int g(zc zcVar) {
        throw null;
    }
}
