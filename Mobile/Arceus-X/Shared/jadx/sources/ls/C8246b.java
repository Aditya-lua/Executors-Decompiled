package ls;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p314ns.InterfaceC9555b;

/* JADX INFO: renamed from: ls.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Lls/b;", "Lbs/b;", "Lls/d;", "Lns/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8246b implements InterfaceC1489b, InterfaceC8248d, InterfaceC9555b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8246b f30549a = new C8246b();

    /* JADX INFO: renamed from: e */
    public static final Double m33624e(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Double.valueOf(CollectionsKt.m31681G0(it));
    }

    @Override // p314ns.InterfaceC9555b
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<Object> mo33625a(@Nullable Object obj) {
        return super.mo33625a(obj);
    }

    @Override // ls.InterfaceC8248d
    @Nullable
    /* JADX INFO: renamed from: c */
    public Double mo33626c(@Nullable Object obj, @NotNull Function1<? super List<Double>, Double> function1) {
        return super.mo33626c(obj, function1);
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        return mo33626c(mo33625a(expression), new Function1() { // from class: ls.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8246b.m33624e((List) obj);
            }
        });
    }
}
