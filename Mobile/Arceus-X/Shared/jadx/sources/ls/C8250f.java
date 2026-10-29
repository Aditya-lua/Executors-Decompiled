package ls;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ls.f */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lls/f;", "Lbs/b;", "Lls/d;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8250f implements InterfaceC1489b, InterfaceC8248d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8250f f30551a = new C8250f();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final Double m33630b(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.m31719q0(it);
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
        return mo33626c(expression, new Function1() { // from class: ls.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C8250f.m33630b((List) obj);
            }
        });
    }
}
