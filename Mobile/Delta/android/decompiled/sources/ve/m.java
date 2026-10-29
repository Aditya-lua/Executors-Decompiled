package ve;

import ve.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m<SerializationT extends p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df.a f32988a;
    public final Class<SerializationT> b;

    public class a extends m<SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f32989c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(df.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f32989c = bVar;
        }

        @Override // ve.m
        public oe.l d(SerializationT serializationt, oe.d0 d0Var) {
            return this.f32989c.a(serializationt, d0Var);
        }
    }

    public interface b<SerializationT extends p0> {
        oe.l a(SerializationT serializationt, oe.d0 d0Var);
    }

    public /* synthetic */ m(df.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static <SerializationT extends p0> m<SerializationT> a(b<SerializationT> bVar, df.a aVar, Class<SerializationT> cls) {
        return new a(aVar, cls, bVar);
    }

    public final df.a b() {
        return this.f32988a;
    }

    public final Class<SerializationT> c() {
        return this.b;
    }

    public abstract oe.l d(SerializationT serializationt, oe.d0 d0Var);

    public m(df.a aVar, Class<SerializationT> cls) {
        this.f32988a = aVar;
        this.b = cls;
    }
}
