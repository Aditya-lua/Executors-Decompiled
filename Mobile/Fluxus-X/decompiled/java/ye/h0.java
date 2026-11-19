package ye;

import re.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0<KeyT extends re.l, PrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<KeyT> f37766a;
    public final Class<PrimitiveT> b;

    public class a extends h0<KeyT, PrimitiveT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f37767c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f37767c = bVar;
        }

        @Override // ye.h0
        public PrimitiveT a(KeyT keyt) {
            return (PrimitiveT) this.f37767c.a(keyt);
        }
    }

    public interface b<KeyT extends re.l, PrimitiveT> {
        PrimitiveT a(KeyT keyt);
    }

    public /* synthetic */ h0(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <KeyT extends re.l, PrimitiveT> h0<KeyT, PrimitiveT> b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract PrimitiveT a(KeyT keyt);

    public Class<KeyT> c() {
        return this.f37766a;
    }

    public Class<PrimitiveT> d() {
        return this.b;
    }

    public h0(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f37766a = cls;
        this.b = cls2;
    }
}
