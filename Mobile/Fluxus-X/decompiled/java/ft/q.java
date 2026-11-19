package ft;

import com.github.luben.zstd.BuildConfig;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.StringsKt;
import p001kotlin.text.c0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lft/q;", "Lrs/b;", "Lft/o;", "<init>", "()V", BuildConfig.FLAVOR, "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", BuildConfig.FLAVOR, "Lft/r;", "c", "(Ljava/util/List;)Lft/r;", BuildConfig.FLAVOR, "Lft/s;", "d", "(Ljava/lang/String;)Lft/s;", "b", "(Lft/r;)Ljava/lang/String;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements rs.b, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final q f16612a = new q();

    public final String b(TrimArguments trimArguments) {
        s mode = trimArguments.getMode();
        if (Intrinsics.c(mode, s.c.f16617a)) {
            return StringsKt.q1(trimArguments.getText(), trimArguments.getChar());
        }
        if (Intrinsics.c(mode, s.b.f16616a)) {
            return StringsKt.p1(trimArguments.getText(), trimArguments.getChar());
        }
        if (Intrinsics.c(mode, s.a.f16615a)) {
            return StringsKt.o1(trimArguments.getText(), trimArguments.getChar());
        }
        throw new zt.l();
    }

    public final TrimArguments c(List<? extends Object> list) {
        Object objB;
        try {
            zt.n.Companion companion = zt.n.INSTANCE;
            Object obj = list.get(0);
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.String");
            char cY1 = c0.y1((String) obj2);
            q qVar = f16612a;
            Object obj3 = list.get(2);
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.String");
            objB = zt.n.b(new TrimArguments((String) obj, cY1, qVar.d((String) obj3)));
        } catch (Throwable th2) {
            zt.n.Companion companion2 = zt.n.INSTANCE;
            objB = zt.n.b(zt.o.a(th2));
        }
        if (zt.n.e(objB) == null) {
            return (TrimArguments) objB;
        }
        return null;
    }

    public final s d(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 100571) {
                if (iHashCode != 109757538) {
                    if (iHashCode == 2144573977 && str.equals("bothEnds")) {
                        return s.a.f16615a;
                    }
                } else if (str.equals("start")) {
                    return s.c.f16617a;
                }
            } else if (str.equals("end")) {
                return s.b.f16616a;
            }
        }
        throw new IllegalStateException("Invalid TrimMode value");
    }

    @Override // rs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        TrimArguments trimArgumentsC = c(kt.a.c(expression));
        if (trimArgumentsC != null) {
            return b(trimArgumentsC);
        }
        return null;
    }
}
