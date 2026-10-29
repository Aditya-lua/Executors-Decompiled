package is;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lis/b;", "Lbs/b;", "Lis/c;", "<init>", "()V", "", "expression", "data", "", "r", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements bs.b, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f20849a = new b();

    public static final boolean s(int i10, int i11) {
        return i10 == i11;
    }

    @Override // ks.a
    @Nullable
    public Object a(@Nullable Object obj) {
        return super.a(obj);
    }

    @Override // cs.a
    @Nullable
    public Boolean b(@Nullable Object obj) {
        return super.b(obj);
    }

    @Override // is.c
    public boolean c(@Nullable Object obj, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        return super.c(obj, function2);
    }

    @Override // cs.b
    @Nullable
    public List<Comparable<?>> d(@Nullable Comparable<?> comparable, @Nullable Comparable<?> comparable2) {
        return super.d(comparable, comparable2);
    }

    @Override // cs.c
    public boolean e(@Nullable List<? extends Object> list, @NotNull Function2<? super Integer, ? super Integer, Boolean> function2) {
        return super.e(list, function2);
    }

    @Override // cs.b
    @Nullable
    public List<Comparable<?>> h(@Nullable Comparable<?> comparable, @Nullable Comparable<?> comparable2) {
        return super.h(comparable, comparable2);
    }

    @Override // ks.c
    @Nullable
    public Object k(@Nullable Object obj) {
        return super.k(obj);
    }

    @Override // bs.b
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean l(@Nullable Object expression, @Nullable Object data) {
        return Boolean.valueOf(c(expression, new Function2() { // from class: is.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(b.s(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
            }
        }));
    }
}
