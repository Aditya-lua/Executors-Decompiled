package wr;

import java.util.Map;
import jt.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lwr/a;", "Lwr/i;", "Lwr/l;", "evaluator", "<init>", "(Lwr/l;)V", "", "", "", "expression", "data", "Lwr/k;", "a", "(Ljava/util/Map;Ljava/lang/Object;)Lwr/k;", "b", "evaluatedValue", "c", "(Ljava/lang/Object;)Lwr/k;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lwr/l;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l evaluator;

    public a(@NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        this.evaluator = evaluator;
    }

    @Override // wr.i
    @NotNull
    public k a(@NotNull Map<String, ? extends Object> expression, @Nullable Object data) {
        k kVarB;
        Intrinsics.checkNotNullParameter(expression, "expression");
        return ((!expression.isEmpty() ? expression : null) == null || (kVarB = b(expression, data)) == null) ? k.a.C0635a.f34547a : kVarB;
    }

    public final k b(Map<String, ? extends Object> expression, Object data) {
        Object objB;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            objB = jt.n.b(this.evaluator.a(expression, data));
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(o.a(th2));
        }
        return jt.n.e(objB) == null ? c(objB) : k.a.b.f34548a;
    }

    public final k c(Object evaluatedValue) {
        return evaluatedValue != null ? new k.Success(d(evaluatedValue)) : k.a.c.f34549a;
    }

    public final Object d(Object obj) {
        if (!(obj instanceof Double)) {
            return obj;
        }
        Number number = (Number) obj;
        double dDoubleValue = number.doubleValue() % 1.0d;
        if (dDoubleValue != 0.0d && Math.signum(dDoubleValue) != Math.signum(1.0d)) {
            dDoubleValue += 1.0d;
        }
        return dDoubleValue == 0.0d ? Long.valueOf((long) number.doubleValue()) : obj;
    }
}
