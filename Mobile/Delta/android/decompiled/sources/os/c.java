package os;

import java.util.List;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ts.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u0004\u0018\u00010\b*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0016\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\f*\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\f*\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Los/c;", "Lbs/b;", "Los/b;", "<init>", "()V", "", "expression", "data", "", "g", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "", "", "startIndex", "charsCount", "n", "(Ljava/util/List;II)Ljava/lang/String;", "m", "(Ljava/lang/String;I)Ljava/lang/String;", "h", "(Ljava/lang/String;II)Ljava/lang/String;", "k", "i", "j", "e", "(Ljava/lang/String;I)I", "sourceStringLength", "f", "(II)I", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements bs.b, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f27927a = new c();

    @Override // os.b
    @NotNull
    public List<String> a(@Nullable Object obj) {
        return super.a(obj);
    }

    public final int e(String str, int i10) {
        Integer numValueOf = Integer.valueOf(str.length() + i10);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public final int f(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i10);
        if (numValueOf.intValue() > i11) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    @Override // bs.b
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String l(@Nullable Object expression, @Nullable Object data) {
        List<? extends Object> listC = ts.a.c(expression);
        return f27927a.n(listC, d.b(String.valueOf(ts.c.b(listC))), d.b(String.valueOf(ts.c.c(listC))));
    }

    public final String h(String str, int i10, int i11) {
        if (i10 >= 0 && i11 > 0) {
            return k(str, i10, i11);
        }
        if (i10 >= 0 && i11 < 0) {
            String strSubstring = str.substring(i10, str.length() + i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        if (i10 < 0 && i11 < 0) {
            return i(str, i10, i11);
        }
        if (i10 >= 0 || i11 <= 0) {
            return null;
        }
        return j(str, i10, i11);
    }

    public final String i(String str, int i10, int i11) {
        String strSubstring = str.substring(e(str, i10), f(str.length() + i11, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String j(String str, int i10, int i11) {
        int iE = e(str, i10);
        String strSubstring = str.substring(iE, f(i11 + iE, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String k(String str, int i10, int i11) {
        String strSubstring = str.substring(i10, f(i11 + i10, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String m(String str, int i10) {
        if (i10 >= 0) {
            String strSubstring = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        if (Math.abs(i10) > str.length()) {
            return str;
        }
        String strSubstring2 = str.substring(str.length() + i10);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public final String n(List<? extends Object> list, int i10, int i11) {
        Object objB;
        String strM0 = CollectionsKt.m0(a(CollectionsKt.firstOrNull(list)), ",", null, null, 0, null, null, 62, null);
        try {
            n.Companion companion = n.INSTANCE;
            if (list.size() == 2) {
                strM0 = f27927a.m(strM0, i10);
            } else if (list.size() > 2) {
                strM0 = f27927a.h(strM0, i10, i11);
            }
            objB = n.b(strM0);
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
        if (n.g(objB)) {
            objB = null;
        }
        String str = (String) objB;
        return str == null ? "" : str;
    }
}
