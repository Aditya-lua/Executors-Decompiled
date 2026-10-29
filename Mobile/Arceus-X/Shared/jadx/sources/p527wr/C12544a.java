package p527wr;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;

/* JADX INFO: renamed from: wr.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lwr/a;", "Lwr/i;", "Lwr/l;", "evaluator", "<init>", "(Lwr/l;)V", "", "", "", "expression", "data", "Lwr/k;", "a", "(Ljava/util/Map;Ljava/lang/Object;)Lwr/k;", "b", "evaluatedValue", "c", "(Ljava/lang/Object;)Lwr/k;", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lwr/l;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12544a implements InterfaceC12552i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC12555l evaluator;

    public C12544a(@NotNull InterfaceC12555l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        this.evaluator = evaluator;
    }

    @Override // p527wr.InterfaceC12552i
    @NotNull
    /* JADX INFO: renamed from: a */
    public AbstractC12554k mo46895a(@NotNull Map<String, ? extends Object> expression, @Nullable Object data) {
        AbstractC12554k abstractC12554kM46896b;
        Intrinsics.checkNotNullParameter(expression, "expression");
        return ((!expression.isEmpty() ? expression : null) == null || (abstractC12554kM46896b = m46896b(expression, data)) == null) ? AbstractC12554k.a.C14280a.f44789a : abstractC12554kM46896b;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC12554k m46896b(Map<String, ? extends Object> expression, Object data) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(this.evaluator.mo46917a(expression, data));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        return C7347n.m30463e(objM30460b) == null ? m46897c(objM30460b) : AbstractC12554k.a.b.f44790a;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC12554k m46897c(Object evaluatedValue) {
        return evaluatedValue != null ? new AbstractC12554k.Success(m46898d(evaluatedValue)) : AbstractC12554k.a.c.f44791a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m46898d(Object obj) {
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
