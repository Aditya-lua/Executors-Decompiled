package is;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: is.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lis/f;", "Lbs/b;", "Lis/c;", "<init>", "()V", "", "expression", "data", "", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6972f implements InterfaceC1489b, InterfaceC6969c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6972f f27236a = new C6972f();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final boolean m29352s(int i10, int i11) {
        return i10 == i11;
    }

    @Override // p254ks.InterfaceC7820a
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo29340a(@Nullable Object obj) {
        return super.mo29340a(obj);
    }

    @Override // p060cs.InterfaceC4359a
    @Nullable
    /* JADX INFO: renamed from: b */
    public Boolean mo22006b(@Nullable Object obj) {
        return super.mo22006b(obj);
    }

    @Override // is.InterfaceC6969c
    /* JADX INFO: renamed from: c */
    public boolean mo29341c(@Nullable Object obj, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        return super.mo29341c(obj, function2);
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

    @Override // p254ks.InterfaceC7822c
    @Nullable
    /* JADX INFO: renamed from: k */
    public Object mo29342k(@Nullable Object obj) {
        return super.mo29342k(obj);
    }

    /* JADX DEBUG: Method merged with bridge method: l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // bs.InterfaceC1489b
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean mo6534l(@Nullable Object expression, @Nullable Object data) {
        return Boolean.valueOf(!mo29341c(expression, new Function2() { // from class: is.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(C6972f.m29352s(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
            }
        }));
    }
}
