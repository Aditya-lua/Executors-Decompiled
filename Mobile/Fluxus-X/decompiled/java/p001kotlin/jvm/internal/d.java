package p001kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import xu.b;
import xu.f;
import xu.m;
import xu.o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements b, Serializable {
    public static final Object NO_RECEIVER = a.f21576a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient b reflected;
    private final String signature;

    public static class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21576a = new a();
    }

    public d() {
        this(NO_RECEIVER);
    }

    @Override // xu.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // xu.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public b compute() {
        b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        b bVarComputeReflected = computeReflected();
        this.reflected = bVarComputeReflected;
        return bVarComputeReflected;
    }

    public abstract b computeReflected();

    @Override // xu.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // xu.b
    public String getName() {
        return this.name;
    }

    public f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? d0.c(cls) : d0.b(cls);
    }

    @Override // xu.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public b getReflected() {
        b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute;
        }
        throw new ou.b();
    }

    @Override // xu.b
    public m getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // xu.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // xu.b
    public o getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // xu.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // xu.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // xu.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // xu.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public d(Object obj) {
        this(obj, null, null, null, false);
    }

    public d(Object obj, Class cls, String str, String str2, boolean z10) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z10;
    }
}
