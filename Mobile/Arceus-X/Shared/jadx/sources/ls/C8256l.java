package ls;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314ns.InterfaceC9554a;

/* JADX INFO: renamed from: ls.l */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lls/l;", "Lbs/b;", "Lns/a;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Double;", "first", "second", "e", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8256l implements InterfaceC1489b, InterfaceC9554a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8256l f30555a = new C8256l();

    /* JADX DEBUG: Method merged with bridge method: l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double mo6534l(@Nullable Object expression, @Nullable Object data) {
        List<Double> listMo33628c = mo33628c(expression);
        int size = listMo33628c.size();
        if (size != 0) {
            if (size != 1) {
                return f30555a.m33637e((Double) CollectionsKt.m31706d0(listMo33628c), listMo33628c.get(1));
            }
            Double d10 = (Double) CollectionsKt.m31706d0(listMo33628c);
            if (d10 != null) {
                return Double.valueOf(-d10.doubleValue());
            }
        }
        return null;
    }

    @Override // p314ns.InterfaceC9554a
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<Double> mo33628c(@Nullable Object obj) {
        return super.mo33628c(obj);
    }

    /* JADX INFO: renamed from: e */
    public final Double m33637e(Double first, Double second) {
        if (first == null || second == null) {
            return null;
        }
        return Double.valueOf(first.doubleValue() - second.doubleValue());
    }
}
