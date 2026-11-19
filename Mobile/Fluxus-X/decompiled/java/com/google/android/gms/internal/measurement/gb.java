package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.gb;
import com.google.android.gms.internal.measurement.kb;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class gb<MessageType extends kb<MessageType, BuilderType>, BuilderType extends gb<MessageType, BuilderType>> extends u9<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kb f6520a;
    public kb b;

    public gb(MessageType messagetype) {
        this.f6520a = messagetype;
        if (messagetype.k()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = messagetype.m();
    }

    public static void q(Object obj, Object obj2) {
        ad.a().b(obj.getClass()).b(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.tc
    public final boolean f() {
        return kb.D(this.b, false);
    }

    @Override // com.google.android.gms.internal.measurement.u9
    public final /* bridge */ /* synthetic */ u9 l(byte[] bArr, int i10, int i11) throws wb {
        va vaVar = va.b;
        ad adVar = ad.f6375c;
        y(bArr, 0, i11, va.f6879c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.u9
    public final /* bridge */ /* synthetic */ u9 o(byte[] bArr, int i10, int i11, va vaVar) throws wb {
        y(bArr, 0, i11, vaVar);
        return this;
    }

    public final void r() {
        if (this.b.k()) {
            return;
        }
        s();
    }

    public void s() {
        kb kbVarM = this.f6520a.m();
        q(kbVarM, this.b);
        this.b = kbVarM;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final gb clone() {
        gb gbVar = (gb) this.f6520a.E(5, null, null);
        gbVar.b = T();
        return gbVar;
    }

    @Override // com.google.android.gms.internal.measurement.rc
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public MessageType T() {
        if (!this.b.k()) {
            return (MessageType) this.b;
        }
        this.b.o();
        return (MessageType) this.b;
    }

    public final MessageType v() {
        MessageType messagetype = (MessageType) T();
        if (messagetype.f()) {
            return messagetype;
        }
        throw new od(messagetype);
    }

    public final gb x(kb kbVar) {
        if (!this.f6520a.equals(kbVar)) {
            if (!this.b.k()) {
                s();
            }
            q(this.b, kbVar);
        }
        return this;
    }

    public final gb y(byte[] bArr, int i10, int i11, va vaVar) throws wb {
        if (!this.b.k()) {
            s();
        }
        try {
            ad.a().b(this.b.getClass()).d(this.b, bArr, 0, i11, new z9(vaVar));
            return this;
        } catch (wb e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new wb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
