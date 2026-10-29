package ve;

import oe.x;
import ve.p0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g0<ParametersT extends oe.x, SerializationT extends p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<ParametersT> f32951a;
    public final Class<SerializationT> b;

    public class a extends g0<ParametersT, SerializationT> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f32952c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f32952c = bVar;
        }

        @Override // ve.g0
        public SerializationT d(ParametersT parameterst) {
            return (SerializationT) this.f32952c.a(parameterst);
        }
    }

    public interface b<ParametersT extends oe.x, SerializationT extends p0> {
        SerializationT a(ParametersT parameterst);
    }

    public /* synthetic */ g0(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static <ParametersT extends oe.x, SerializationT extends p0> g0<ParametersT, SerializationT> a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class<ParametersT> b() {
        return this.f32951a;
    }

    public Class<SerializationT> c() {
        return this.b;
    }

    public abstract SerializationT d(ParametersT parameterst);

    public g0(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f32951a = cls;
        this.b = cls2;
    }
}
