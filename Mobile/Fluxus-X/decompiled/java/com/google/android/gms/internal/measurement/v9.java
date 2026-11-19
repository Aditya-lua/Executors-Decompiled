package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.v9;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class v9<MessageType extends v9<MessageType, BuilderType>, BuilderType extends u9<MessageType, BuilderType>> implements sc {
    protected int zza = 0;

    public static void h(Iterable iterable, List list) {
        u9.p(iterable, list);
    }

    @Override // com.google.android.gms.internal.measurement.sc
    public final la b() {
        try {
            int iA = a();
            la laVar = la.b;
            byte[] bArr = new byte[iA];
            Logger logger = qa.b;
            oa oaVar = new oa(bArr, 0, iA);
            c(oaVar);
            return ia.a(oaVar, bArr);
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
            Logger logger = qa.b;
            oa oaVar = new oa(bArr, 0, iA);
            c(oaVar);
            oaVar.e();
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

    public int g(dd ddVar) {
        throw null;
    }
}
