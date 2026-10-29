package p393qs;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C7802c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p451ts.C11744a;
import ps.InterfaceC10333o;

/* JADX INFO: renamed from: qs.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lqs/c;", "Lbs/b;", "Lps/o;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/time/c;", "c", "(Ljava/util/List;)Ljava/util/List;", "", "b", "(Ljava/util/List;)Ljava/lang/Integer;", "Lqs/b;", "Lqs/b;", "formatter", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10706c implements InterfaceC1489b, InterfaceC10333o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10706c f38261a = new C10706c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final C10705b formatter = new C10705b();

    /* JADX INFO: renamed from: b */
    public final Integer m40803b(List<C7802c> list) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(Integer.valueOf(((C7802c) CollectionsKt.m31706d0(list)).compareTo((C7802c) CollectionsKt.m31717o0(list))));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (!C7347n.m30466h(objM30460b)) {
            if (C7347n.m30465g(objM30460b)) {
                objM30460b = null;
            }
            return (Integer) objM30460b;
        }
        int iIntValue = ((Number) objM30460b).intValue();
        if (iIntValue > 0) {
            return 1;
        }
        return iIntValue < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: c */
    public final List<C7802c> m40804c(List<? extends Object> list) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Object obj = list.get(2);
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.String");
            EnumC10704a enumC10704aValueOf = EnumC10704a.valueOf((String) obj);
            C10705b c10705b = formatter;
            Object obj2 = list.get(0);
            Intrinsics.m31981d(obj2, "null cannot be cast to non-null type kotlin.String");
            C7802c c7802cM40800a = c10705b.m40800a((String) obj2, enumC10704aValueOf);
            Object obj3 = list.get(1);
            Intrinsics.m31981d(obj3, "null cannot be cast to non-null type kotlin.String");
            objM30460b = C7347n.m30460b(C7699p.m31895n(c7802cM40800a, c10705b.m40800a((String) obj3, enumC10704aValueOf)));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = null;
        }
        return (List) objM30460b;
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        List<C7802c> listM40804c = m40804c(C11744a.m43971c(expression));
        if (listM40804c != null) {
            return m40803b(listM40804c);
        }
        return null;
    }
}
