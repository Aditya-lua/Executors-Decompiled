package p515we;

import p515we.InterfaceC12388p0;
import pe.AbstractC10243x;

/* JADX INFO: renamed from: we.g0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12370g0<ParametersT extends AbstractC10243x, SerializationT extends InterfaceC12388p0> {

    /* JADX INFO: renamed from: a */
    public final Class<ParametersT> f44261a;

    /* JADX INFO: renamed from: b */
    public final Class<SerializationT> f44262b;

    /* JADX INFO: renamed from: we.g0$a */
    public class a extends AbstractC12370g0<ParametersT, SerializationT> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b f44263c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f44263c = bVar;
        }

        @Override // p515we.AbstractC12370g0
        /* JADX INFO: renamed from: d */
        public SerializationT mo46318d(ParametersT parameterst) {
            return (SerializationT) this.f44263c.mo8227a(parameterst);
        }
    }

    /* JADX INFO: renamed from: we.g0$b */
    public interface b<ParametersT extends AbstractC10243x, SerializationT extends InterfaceC12388p0> {
        /* JADX INFO: renamed from: a */
        SerializationT mo8227a(ParametersT parameterst);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Class), (r2v0 java.lang.Class) A[MD:(java.lang.Class<ParametersT extends pe.x>, java.lang.Class<SerializationT extends we.p0>):void (m)] (LINE:1) call: we.g0.<init>(java.lang.Class, java.lang.Class):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC12370g0(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    /* JADX INFO: renamed from: a */
    public static <ParametersT extends AbstractC10243x, SerializationT extends InterfaceC12388p0> AbstractC12370g0<ParametersT, SerializationT> m46315a(b<ParametersT, SerializationT> bVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    /* JADX INFO: renamed from: b */
    public Class<ParametersT> m46316b() {
        return this.f44261a;
    }

    /* JADX INFO: renamed from: c */
    public Class<SerializationT> m46317c() {
        return this.f44262b;
    }

    /* JADX INFO: renamed from: d */
    public abstract SerializationT mo46318d(ParametersT parameterst);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC12370g0(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.f44261a = cls;
        this.f44262b = cls2;
    }
}
