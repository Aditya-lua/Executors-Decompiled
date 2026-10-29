package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.cb;
import com.google.android.gms.internal.measurement.gb;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class cb<MessageType extends gb<MessageType, BuilderType>, BuilderType extends cb<MessageType, BuilderType>> extends q9<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gb f6403a;
    public gb b;

    public cb(MessageType messagetype) {
        this.f6403a = messagetype;
        if (messagetype.k()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = messagetype.n();
    }

    public static void o(Object obj, Object obj2) {
        wc.a().b(obj.getClass()).b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.pc
    public final boolean f() {
        return gb.D(this.b, false);
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final /* bridge */ /* synthetic */ q9 j(byte[] bArr, int i10, int i11) throws sb {
        ra raVar = ra.b;
        wc wcVar = wc.f6869c;
        w(bArr, 0, i11, ra.f6762c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.q9
    public final /* bridge */ /* synthetic */ q9 k(byte[] bArr, int i10, int i11, ra raVar) throws sb {
        w(bArr, 0, i11, raVar);
        return this;
    }

    public final void p() {
        if (this.b.k()) {
            return;
        }
        q();
    }

    public void q() {
        gb gbVarN = this.f6403a.n();
        o(gbVarN, this.b);
        this.b = gbVarN;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final cb clone() {
        cb cbVar = (cb) this.f6403a.E(5, null, null);
        cbVar.b = M();
        return cbVar;
    }

    @Override // com.google.android.gms.internal.measurement.nc
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public MessageType M() {
        if (!this.b.k()) {
            return (MessageType) this.b;
        }
        this.b.p();
        return (MessageType) this.b;
    }

    public final MessageType t() {
        MessageType messagetype = (MessageType) M();
        if (messagetype.f()) {
            return messagetype;
        }
        throw new kd(messagetype);
    }

    public final cb v(gb gbVar) {
        if (!this.f6403a.equals(gbVar)) {
            if (!this.b.k()) {
                q();
            }
            o(this.b, gbVar);
        }
        return this;
    }

    public final cb w(byte[] bArr, int i10, int i11, ra raVar) throws sb {
        if (!this.b.k()) {
            q();
        }
        try {
            wc.a().b(this.b.getClass()).d(this.b, bArr, 0, i11, new v9(raVar));
            return this;
        } catch (sb e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
