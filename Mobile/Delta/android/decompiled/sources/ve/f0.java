package ve;

import ve.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f0<SerializationT extends p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.a f32940a;
    public final Class<SerializationT> b;

    public class a extends f0<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f32941c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(df.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f32941c = bVar;
        }

        @Override // ve.f0
        public oe.x d(SerializationT serializationt) {
            return this.f32941c.a(serializationt);
        }
    }

    public interface b<SerializationT extends p0> {
        oe.x a(SerializationT serializationt);
    }

    public /* synthetic */ f0(df.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends p0> f0<SerializationT> a(b<SerializationT> bVar, df.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final df.a b() {
        return this.f32940a;
    }

    public final Class<SerializationT> c() {
        return this.b;
    }

    public abstract oe.x d(SerializationT serializationt);

    public f0(df.a aVar, Class<SerializationT> cls) {
        this.f32940a = aVar;
        this.b = cls;
    }
}
