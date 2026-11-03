package we;

import pe.l;
import we.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n<KeyT extends pe.l, SerializationT extends p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<KeyT> f34445a;
    public final Class<SerializationT> b;

    public class a extends n<KeyT, SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f34446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f34446c = bVar;
        }

        @Override // we.n
        public SerializationT d(KeyT keyt, pe.d0 d0Var) {
            return (SerializationT) this.f34446c.a(keyt, d0Var);
        }
    }

    public interface b<KeyT extends pe.l, SerializationT extends p0> {
        SerializationT a(KeyT keyt, pe.d0 d0Var);
    }

    public /* synthetic */ n(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends pe.l, SerializationT extends p0> n<KeyT, SerializationT> a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<KeyT> b() {
        return this.f34445a;
    }

    public Class<SerializationT> c() {
        return this.b;
    }

    public abstract SerializationT d(KeyT keyt, pe.d0 d0Var);

    public n(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f34445a = cls;
        this.b = cls2;
    }
}
