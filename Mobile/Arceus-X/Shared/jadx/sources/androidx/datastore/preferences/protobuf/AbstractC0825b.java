package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InterfaceC0874r0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0825b<MessageType extends InterfaceC0874r0> implements InterfaceC0893z0<MessageType> {

    /* JADX INFO: renamed from: a */
    public static final C0864o f2813a = C0864o.m3911b();

    /* JADX INFO: renamed from: c */
    public final MessageType m3353c(MessageType messagetype) throws C0823a0 {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw m3354d(messagetype).m3885a().m3351k(messagetype);
    }

    /* JADX INFO: renamed from: d */
    public final C0860m1 m3354d(MessageType messagetype) {
        return messagetype instanceof AbstractC0822a ? ((AbstractC0822a) messagetype).m3330n() : new C0860m1(messagetype);
    }

    /* JADX DEBUG: Method merged with bridge method: a(Landroidx/datastore/preferences/protobuf/g;Landroidx/datastore/preferences/protobuf/o;)Ljava/lang/Object; */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0893z0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public MessageType mo3352a(AbstractC0840g abstractC0840g, C0864o c0864o) {
        return (MessageType) m3353c(m3356f(abstractC0840g, c0864o));
    }

    /* JADX INFO: renamed from: f */
    public MessageType m3356f(AbstractC0840g abstractC0840g, C0864o c0864o) throws C0823a0 {
        AbstractC0843h abstractC0843hMo3453m = abstractC0840g.mo3453m();
        MessageType messagetypeMo4212b = mo4212b(abstractC0843hMo3453m, c0864o);
        try {
            abstractC0843hMo3453m.mo3491a(0);
            return messagetypeMo4212b;
        } catch (C0823a0 e10) {
            throw e10.m3351k(messagetypeMo4212b);
        }
    }
}
