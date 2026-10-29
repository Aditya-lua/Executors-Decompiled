package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a.AbstractC0031a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0031a<MessageType, BuilderType>> implements r0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0031a<MessageType extends a<MessageType, BuilderType>, BuilderType extends AbstractC0031a<MessageType, BuilderType>> implements r0.a {
        public static <T> void j(Iterable<T> iterable, List<? super T> list) {
            z.a(iterable);
            if (!(iterable instanceof e0)) {
                if (iterable instanceof a1) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    k(iterable, list);
                    return;
                }
            }
            List<?> listS = ((e0) iterable).s();
            e0 e0Var = (e0) list;
            int size = list.size();
            for (Object obj : listS) {
                if (obj == null) {
                    String str = "Element at index " + (e0Var.size() - size) + " is null.";
                    for (int size2 = e0Var.size() - 1; size2 >= size; size2--) {
                        e0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof g) {
                    e0Var.f2((g) obj);
                } else if (obj instanceof byte[]) {
                    e0Var.f2(g.e((byte[]) obj));
                } else {
                    e0Var.add((String) obj);
                }
            }
        }

        public static <T> void k(Iterable<T> iterable, List<? super T> list) {
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

        public static m1 p(r0 r0Var) {
            return new m1(r0Var);
        }

        public abstract BuilderType n(MessageType messagetype);

        @Override // androidx.datastore.preferences.protobuf.r0.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public BuilderType l(r0 r0Var) {
            if (f().getClass().isInstance(r0Var)) {
                return (BuilderType) n((a) r0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static <T> void g(Iterable<T> iterable, List<? super T> list) {
        AbstractC0031a.j(iterable, list);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public g b() {
        try {
            g.h hVarL = g.l(c());
            i(hVarL.b());
            return hVarL.a();
        } catch (IOException e10) {
            throw new RuntimeException(m("ByteString"), e10);
        }
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public int k(g1 g1Var) {
        int iJ = j();
        if (iJ != -1) {
            return iJ;
        }
        int iD = g1Var.d(this);
        o(iD);
        return iD;
    }

    public final String m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public m1 n() {
        return new m1(this);
    }

    public void o(int i10) {
        throw new UnsupportedOperationException();
    }

    public void p(OutputStream outputStream) {
        j jVarE0 = j.e0(outputStream, j.I(c()));
        i(jVarE0);
        jVarE0.b0();
    }
}
