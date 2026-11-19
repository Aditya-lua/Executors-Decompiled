package ye;

import ye.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0<SerializationT extends p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gf.a f37751a;
    public final Class<SerializationT> b;

    public class a extends f0<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f37752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gf.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f37752c = bVar;
        }

        @Override // ye.f0
        public re.x d(SerializationT serializationt) {
            return this.f37752c.a(serializationt);
        }
    }

    public interface b<SerializationT extends p0> {
        re.x a(SerializationT serializationt);
    }

    public /* synthetic */ f0(gf.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends p0> f0<SerializationT> a(b<SerializationT> bVar, gf.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final gf.a b() {
        return this.f37751a;
    }

    public final Class<SerializationT> c() {
        return this.b;
    }

    public abstract re.x d(SerializationT serializationt);

    public f0(gf.a aVar, Class<SerializationT> cls) {
        this.f37751a = aVar;
        this.b = cls;
    }
}
