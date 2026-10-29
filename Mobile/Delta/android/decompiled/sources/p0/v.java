package p0;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp0/v;", "T", "Lp0/s;", "initialValue", "<init>", "(Ljava/lang/Object;)V", "p", "Ljava/lang/Object;", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v<T> extends s<T, T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final T initialValue;

    public v(T t8) {
        super(t8, new t.a() { // from class: p0.u
            @Override // t.a
            public final Object apply(Object obj) {
                return v.z(obj);
            }
        });
        this.initialValue = t8;
    }

    public static final Object z(Object obj) {
        return obj;
    }
}
