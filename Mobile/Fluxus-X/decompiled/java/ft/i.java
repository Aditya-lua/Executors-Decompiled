package ft;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lft/i;", "Lrs/b;", "Lft/o;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements rs.b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f16605a = new i();

    @Override // rs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        Object objB;
        List<Object> listC = kt.a.c(expression);
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            Object obj = listC.get(0);
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = listC.get(1);
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = listC.get(2);
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.String");
            ReplaceData replaceData = new ReplaceData((String) obj, (String) obj2, (String) obj3);
            k.Companion companion2 = k.INSTANCE;
            Object obj4 = listC.get(3);
            Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.String");
            objB = zt.n.b(companion2.a((String) obj4, replaceData).invoke());
        } catch (Throwable th2) {
            zt.n.Companion companion3 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        if (zt.n.e(objB) == null) {
            return objB;
        }
        return null;
    }
}
