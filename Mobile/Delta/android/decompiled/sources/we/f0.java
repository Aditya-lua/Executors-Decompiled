package we;

import we.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0<SerializationT extends p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef.a f34394a;
    public final Class<SerializationT> b;

    public class a extends f0<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f34395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ef.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f34395c = bVar;
        }

        @Override // we.f0
        public pe.x d(SerializationT serializationt) {
            return this.f34395c.a(serializationt);
        }
    }

    public interface b<SerializationT extends p0> {
        pe.x a(SerializationT serializationt);
    }

    public /* synthetic */ f0(ef.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends p0> f0<SerializationT> a(b<SerializationT> bVar, ef.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final ef.a b() {
        return this.f34394a;
    }

    public final Class<SerializationT> c() {
        return this.b;
    }

    public abstract pe.x d(SerializationT serializationt);

    public f0(ef.a aVar, Class<SerializationT> cls) {
        this.f34394a = aVar;
        this.b = cls;
    }
}
