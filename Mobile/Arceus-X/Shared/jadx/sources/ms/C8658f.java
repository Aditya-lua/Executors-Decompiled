package ms;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;

/* JADX INFO: renamed from: ms.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lms/f;", "Lbs/b;", "Lms/i;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8658f implements InterfaceC1489b, InterfaceC8661i {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8658f f31644a = new C8658f();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final boolean m34738g(int i10, int i11) {
        return i10 < i11;
    }

    @Override // p060cs.InterfaceC4359a
    @Nullable
    /* JADX INFO: renamed from: b */
    public Boolean mo22006b(@Nullable Object obj) {
        return super.mo22006b(obj);
    }

    @Override // p060cs.InterfaceC4360b
    @Nullable
    /* JADX INFO: renamed from: d */
    public List<Comparable<?>> mo22007d(@Nullable Comparable<?> comparable, @Nullable Comparable<?> comparable2) {
        return super.mo22007d(comparable, comparable2);
    }

    @Override // p060cs.InterfaceC4361c
    /* JADX INFO: renamed from: e */
    public boolean mo22009e(@Nullable List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        return super.mo22009e(list, function2);
    }

    @Override // p060cs.InterfaceC4360b
    @Nullable
    /* JADX INFO: renamed from: h */
    public List<Comparable<?>> mo22008h(@Nullable Comparable<?> comparable, @Nullable Comparable<?> comparable2) {
        return super.mo22008h(comparable, comparable2);
    }

    @Override // ms.InterfaceC8661i
    /* JADX INFO: renamed from: i */
    public boolean mo34739i(@Nullable List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        return super.mo34739i(list, function2);
    }

    @Override // bs.InterfaceC1489b
    @NotNull
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        return Boolean.valueOf(mo34739i(C11744a.m43971c(expression), new Function2() { // from class: ms.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C8658f.m34738g(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
            }
        }));
    }
}
