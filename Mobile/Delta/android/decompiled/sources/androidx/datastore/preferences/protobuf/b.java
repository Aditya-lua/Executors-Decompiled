package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<MessageType extends r0> implements z0<MessageType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f2130a = o.b();

    public final MessageType c(MessageType messagetype) throws a0 {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw d(messagetype).a().k(messagetype);
    }

    public final m1 d(MessageType messagetype) {
        return messagetype instanceof a ? ((a) messagetype).n() : new m1(messagetype);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType a(g gVar, o oVar) {
        return (MessageType) c(f(gVar, oVar));
    }

    public MessageType f(g gVar, o oVar) throws a0 {
        h hVarM = gVar.m();
        MessageType messagetypeB = b(hVarM, oVar);
        try {
            hVarM.a(0);
            return messagetypeB;
        } catch (a0 e10) {
            throw e10.k(messagetypeB);
        }
    }
}
