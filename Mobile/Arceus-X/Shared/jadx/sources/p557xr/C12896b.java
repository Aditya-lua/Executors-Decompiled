package p557xr;

import bs.InterfaceC1488a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;
import p451ts.C11746c;
import p527wr.InterfaceC12555l;
import ss.InterfaceC11450a;

/* JADX INFO: renamed from: xr.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lxr/b;", "Lbs/a;", "Lss/a;", "<init>", "()V", "", "expression", "data", "Lwr/l;", "evaluator", "c", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12896b implements InterfaceC1488a, InterfaceC11450a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C12896b f45762a = new C12896b();

    @Override // bs.InterfaceC1488a
    @Nullable
    /* JADX INFO: renamed from: c */
    public Object mo7614c(@Nullable Object expression, @Nullable Object data, @NotNull InterfaceC12555l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        List<? extends Object> listM43971c = C11744a.m43971c(expression);
        List<Object> listMo22979m = f45762a.mo22979m(listM43971c, data, evaluator);
        Map<String, ? extends Object> mapM43978a = C11746c.m43978a(listM43971c);
        if (mapM43978a != null && listMo22979m != null) {
            for (Object obj : listMo22979m) {
                if (Intrinsics.m31980c(evaluator.mo46917a(mapM43978a, obj), Boolean.TRUE)) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override // ss.InterfaceC11450a
    @Nullable
    /* JADX INFO: renamed from: m */
    public List<Object> mo22979m(@NotNull List<? extends Object> list, @Nullable Object obj, @NotNull InterfaceC12555l interfaceC12555l) {
        return super.mo22979m(list, obj, interfaceC12555l);
    }
}
