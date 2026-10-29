package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2086gb;
import com.google.android.gms.internal.measurement.C2010cb;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.cb */
/* JADX INFO: loaded from: classes.dex */
public class C2010cb<MessageType extends AbstractC2086gb<MessageType, BuilderType>, BuilderType extends C2010cb<MessageType, BuilderType>> extends AbstractC2265q9<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a */
    public final AbstractC2086gb f8130a;

    /* JADX INFO: renamed from: b */
    public AbstractC2086gb f8131b;

    public C2010cb(MessageType messagetype) {
        this.f8130a = messagetype;
        if (messagetype.m10069k()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f8131b = messagetype.m10071m();
    }

    /* JADX INFO: renamed from: o */
    public static void m9873o(Object obj, Object obj2) {
        C2376wc.m10951a().m10952b(obj.getClass()).mo10657b(obj, obj2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.google.android.gms.internal.measurement.gb.C(com.google.android.gms.internal.measurement.gb, boolean):boolean */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2250pc
    /* JADX INFO: renamed from: f */
    public final boolean mo9875f() {
        return AbstractC2086gb.m10055D(this.f8131b, false);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2265q9
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ AbstractC2265q9 mo9876j(byte[] bArr, int i10, int i11) throws C2303sb {
        C2284ra c2284ra = C2284ra.f8610b;
        C2376wc c2376wc = C2376wc.f8740c;
        m9884w(bArr, 0, i11, C2284ra.f8611c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2265q9
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ AbstractC2265q9 mo9877k(byte[] bArr, int i10, int i11, C2284ra c2284ra) throws C2303sb {
        m9884w(bArr, 0, i11, c2284ra);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final void m9878p() {
        if (this.f8131b.m10069k()) {
            return;
        }
        m9879q();
    }

    /* JADX INFO: renamed from: q */
    public void m9879q() {
        AbstractC2086gb abstractC2086gbM10071m = this.f8130a.m10071m();
        m9873o(abstractC2086gbM10071m, this.f8131b);
        this.f8131b = abstractC2086gbM10071m;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final C2010cb clone() {
        C2010cb c2010cb = (C2010cb) this.f8130a.mo9579E(5, null, null);
        c2010cb.f8131b = mo9874L();
        return c2010cb;
    }

    /* JADX DEBUG: Method merged with bridge method: L()Lcom/google/android/gms/internal/measurement/oc; */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2214nc
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public MessageType mo9874L() {
        if (!this.f8131b.m10069k()) {
            return (MessageType) this.f8131b;
        }
        this.f8131b.m10073o();
        return (MessageType) this.f8131b;
    }

    /* JADX INFO: renamed from: t */
    public final MessageType m9882t() {
        MessageType messagetype = (MessageType) mo9874L();
        if (messagetype.mo9875f()) {
            return messagetype;
        }
        throw new C2161kd(messagetype);
    }

    /* JADX INFO: renamed from: v */
    public final C2010cb m9883v(AbstractC2086gb abstractC2086gb) {
        if (!this.f8130a.equals(abstractC2086gb)) {
            if (!this.f8131b.m10069k()) {
                m9879q();
            }
            m9873o(this.f8131b, abstractC2086gb);
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final C2010cb m9884w(byte[] bArr, int i10, int i11, C2284ra c2284ra) throws C2303sb {
        if (!this.f8131b.m10069k()) {
            m9879q();
        }
        try {
            C2376wc.m10951a().m10952b(this.f8131b.getClass()).mo10659d(this.f8131b, bArr, 0, i11, new C2355v9(c2284ra));
            return this;
        } catch (C2303sb e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C2303sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
