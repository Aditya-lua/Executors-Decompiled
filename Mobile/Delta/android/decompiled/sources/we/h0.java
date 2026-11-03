package we;

import pe.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0<KeyT extends pe.l, PrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<KeyT> f34409a;
    public final Class<PrimitiveT> b;

    public class a extends h0<KeyT, PrimitiveT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f34410c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f34410c = bVar;
        }

        @Override // we.h0
        public PrimitiveT a(KeyT keyt) {
            return (PrimitiveT) this.f34410c.a(keyt);
        }
    }

    public interface b<KeyT extends pe.l, PrimitiveT> {
        PrimitiveT a(KeyT keyt);
    }

    public /* synthetic */ h0(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends pe.l, PrimitiveT> h0<KeyT, PrimitiveT> b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract PrimitiveT a(KeyT keyt);

    public Class<KeyT> c() {
        return this.f34409a;
    }

    public Class<PrimitiveT> d() {
        return this.b;
    }

    public h0(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f34409a = cls;
        this.b = cls2;
    }
}
