package we;

import we.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m<SerializationT extends p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef.a f34442a;
    public final Class<SerializationT> b;

    public class a extends m<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f34443c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ef.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f34443c = bVar;
        }

        @Override // we.m
        public pe.l d(SerializationT serializationt, pe.d0 d0Var) {
            return this.f34443c.a(serializationt, d0Var);
        }
    }

    public interface b<SerializationT extends p0> {
        pe.l a(SerializationT serializationt, pe.d0 d0Var);
    }

    public /* synthetic */ m(ef.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends p0> m<SerializationT> a(b<SerializationT> bVar, ef.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final ef.a b() {
        return this.f34442a;
    }

    public final Class<SerializationT> c() {
        return this.b;
    }

    public abstract pe.l d(SerializationT serializationt, pe.d0 d0Var);

    public m(ef.a aVar, Class<SerializationT> cls) {
        this.f34442a = aVar;
        this.b = cls;
    }
}
