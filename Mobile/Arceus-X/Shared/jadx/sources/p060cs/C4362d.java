package p060cs;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;
import p451ts.C11746c;

/* JADX INFO: renamed from: cs.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lcs/d;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4362d implements InterfaceC1489b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4362d f18218a = new C4362d();

    /* JADX DEBUG: Method merged with bridge method: l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean mo6534l(@Nullable Object expression, @Nullable Object data) {
        Object objFirstOrNull = CollectionsKt.firstOrNull(C11744a.m43971c(expression));
        Object objM43979b = C11746c.m43979b(C11744a.m43971c(expression));
        if (objM43979b instanceof String) {
            return Boolean.valueOf(StringsKt.m32152a0((CharSequence) objM43979b, String.valueOf(objFirstOrNull), false, 2, null));
        }
        return objM43979b instanceof List ? Boolean.valueOf(((List) objM43979b).contains(objFirstOrNull)) : Boolean.FALSE;
    }
}
