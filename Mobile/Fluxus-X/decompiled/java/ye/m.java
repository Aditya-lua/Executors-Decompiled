package ye;

import ye.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m<SerializationT extends p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gf.a f37799a;
    public final Class<SerializationT> b;

    public class a extends m<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f37800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gf.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f37800c = bVar;
        }

        @Override // ye.m
        public re.l d(SerializationT serializationt, re.d0 d0Var) {
            return this.f37800c.a(serializationt, d0Var);
        }
    }

    public interface b<SerializationT extends p0> {
        re.l a(SerializationT serializationt, re.d0 d0Var);
    }

    public /* synthetic */ m(gf.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends p0> m<SerializationT> a(b<SerializationT> bVar, gf.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final gf.a b() {
        return this.f37799a;
    }

    public final Class<SerializationT> c() {
        return this.b;
    }

    public abstract re.l d(SerializationT serializationt, re.d0 d0Var);

    public m(gf.a aVar, Class<SerializationT> cls) {
        this.f37799a = aVar;
        this.b = cls;
    }
}
