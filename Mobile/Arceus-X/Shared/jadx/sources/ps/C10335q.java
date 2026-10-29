package ps;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7776c0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p451ts.C11744a;

/* JADX INFO: renamed from: ps.q */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lps/q;", "Lbs/b;", "Lps/o;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lps/r;", "c", "(Ljava/util/List;)Lps/r;", "", "Lps/s;", "d", "(Ljava/lang/String;)Lps/s;", "b", "(Lps/r;)Ljava/lang/String;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10335q implements InterfaceC1489b, InterfaceC10333o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10335q f37187a = new C10335q();

    /* JADX INFO: renamed from: b */
    public final String m39652b(TrimArguments trimArguments) {
        AbstractC10337s mode = trimArguments.getMode();
        if (Intrinsics.m31980c(mode, AbstractC10337s.c.f37193a)) {
            return StringsKt.m32189s1(trimArguments.getText(), trimArguments.getChar());
        }
        if (Intrinsics.m31980c(mode, AbstractC10337s.b.f37192a)) {
            return StringsKt.m32187r1(trimArguments.getText(), trimArguments.getChar());
        }
        if (Intrinsics.m31980c(mode, AbstractC10337s.a.f37191a)) {
            return StringsKt.m32185q1(trimArguments.getText(), trimArguments.getChar());
        }
        throw new C7345l();
    }

    /* JADX INFO: renamed from: c */
    public final TrimArguments m39653c(List<? extends Object> list) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Object obj = list.get(0);
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.m31981d(obj2, "null cannot be cast to non-null type kotlin.String");
            char cM32208A1 = C7776c0.m32208A1((String) obj2);
            C10335q c10335q = f37187a;
            Object obj3 = list.get(2);
            Intrinsics.m31981d(obj3, "null cannot be cast to non-null type kotlin.String");
            objM30460b = C7347n.m30460b(new TrimArguments((String) obj, cM32208A1, c10335q.m39654d((String) obj3)));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) == null) {
            return (TrimArguments) objM30460b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC10337s m39654d(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 100571) {
                if (iHashCode != 109757538) {
                    if (iHashCode == 2144573977 && str.equals("bothEnds")) {
                        return AbstractC10337s.a.f37191a;
                    }
                } else if (str.equals("start")) {
                    return AbstractC10337s.c.f37193a;
                }
            } else if (str.equals("end")) {
                return AbstractC10337s.b.f37192a;
            }
        }
        throw new IllegalStateException("Invalid TrimMode value");
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        TrimArguments trimArgumentsM39653c = m39653c(C11744a.m43971c(expression));
        if (trimArgumentsM39653c != null) {
            return m39652b(trimArgumentsM39653c);
        }
        return null;
    }
}
