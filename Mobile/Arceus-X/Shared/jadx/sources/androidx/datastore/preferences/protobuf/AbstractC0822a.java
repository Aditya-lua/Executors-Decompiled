package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0822a;
import androidx.datastore.preferences.protobuf.AbstractC0822a.a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0822a<MessageType extends AbstractC0822a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0874r0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a */
    public static abstract class a<MessageType extends AbstractC0822a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0874r0.a {
        /* JADX INFO: renamed from: j */
        public static <T> void m3333j(Iterable<T> iterable, List<? super T> list) {
            C0892z.m4236a(iterable);
            if (!(iterable instanceof InterfaceC0835e0)) {
                if (iterable instanceof InterfaceC0824a1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    m3334k(iterable, list);
                    return;
                }
            }
            List<?> listM3386s = ((InterfaceC0835e0) iterable).m3386s();
            InterfaceC0835e0 interfaceC0835e0 = (InterfaceC0835e0) list;
            int size = list.size();
            for (Object obj : listM3386s) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC0835e0.size() - size) + " is null.";
                    for (int size2 = interfaceC0835e0.size() - 1; size2 >= size; size2--) {
                        interfaceC0835e0.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0840g) {
                    interfaceC0835e0.m3384f2((AbstractC0840g) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC0835e0.m3384f2(AbstractC0840g.m3443e((byte[]) obj));
                } else {
                    interfaceC0835e0.add((String) obj);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public static <T> void m3334k(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T t8 : iterable) {
                if (t8 == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(t8);
            }
        }

        /* JADX INFO: renamed from: p */
        public static C0860m1 m3335p(InterfaceC0874r0 interfaceC0874r0) {
            return new C0860m1(interfaceC0874r0);
        }

        /* JADX INFO: renamed from: n */
        public abstract BuilderType mo3337n(MessageType messagetype);

        /* JADX DEBUG: Method merged with bridge method: l(Landroidx/datastore/preferences/protobuf/r0;)Landroidx/datastore/preferences/protobuf/r0$a; */
        @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public BuilderType mo3336l(InterfaceC0874r0 interfaceC0874r0) {
            if (mo4057f().getClass().isInstance(interfaceC0874r0)) {
                return (BuilderType) mo3337n((AbstractC0822a) interfaceC0874r0);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* JADX INFO: renamed from: g */
    public static <T> void m3325g(Iterable<T> iterable, List<? super T> list) {
        a.m3333j(iterable, list);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874r0
    /* JADX INFO: renamed from: b */
    public AbstractC0840g mo3326b() {
        try {
            AbstractC0840g.h hVarM3446l = AbstractC0840g.m3446l(mo4026c());
            mo4029i(hVarM3446l.m3465b());
            return hVarM3446l.m3464a();
        } catch (IOException e10) {
            throw new RuntimeException(m3329m("ByteString"), e10);
        }
    }

    /* JADX INFO: renamed from: j */
    public int mo3327j() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: k */
    public int mo3328k(InterfaceC0842g1 interfaceC0842g1) {
        int iMo3327j = mo3327j();
        if (iMo3327j != -1) {
            return iMo3327j;
        }
        int iMo3471d = interfaceC0842g1.mo3471d(this);
        mo3331o(iMo3471d);
        return iMo3471d;
    }

    /* JADX INFO: renamed from: m */
    public final String m3329m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: n */
    public C0860m1 m3330n() {
        return new C0860m1(this);
    }

    /* JADX INFO: renamed from: o */
    public void mo3331o(int i10) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: p */
    public void m3332p(OutputStream outputStream) {
        AbstractC0849j abstractC0849jM3656e0 = AbstractC0849j.m3656e0(outputStream, AbstractC0849j.m3634I(mo4026c()));
        mo4029i(abstractC0849jM3656e0);
        abstractC0849jM3656e0.mo3706b0();
    }
}
