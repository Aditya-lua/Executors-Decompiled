package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<MessageType extends s0> implements a1<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f8393a = p.b();

    public final MessageType c(MessageType messagetype) throws b0 {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    public final m1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).l() : new m1(messagetype);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType b(h hVar, p pVar) {
        return (MessageType) c(f(hVar, pVar));
    }

    public MessageType f(h hVar, p pVar) throws b0 {
        i iVarM = hVar.m();
        MessageType messagetypeA = a(iVarM, pVar);
        try {
            iVarM.a(0);
            return messagetypeA;
        } catch (b0 e10) {
            throw e10.k(messagetypeA);
        }
    }
}
