package p343os;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p451ts.C11744a;
import p451ts.C11746c;
import p451ts.C11747d;

/* JADX INFO: renamed from: os.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u0004\u0018\u00010\b*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0016\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\b*\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\f*\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\f*\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"Los/c;", "Lbs/b;", "Los/b;", "<init>", "()V", "", "expression", "data", "", "g", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "", "", "startIndex", "charsCount", "n", "(Ljava/util/List;II)Ljava/lang/String;", "m", "(Ljava/lang/String;I)Ljava/lang/String;", "h", "(Ljava/lang/String;II)Ljava/lang/String;", "k", "i", "j", "e", "(Ljava/lang/String;I)I", "sourceStringLength", "f", "(II)I", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10044c implements InterfaceC1489b, InterfaceC10043b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10044c f36173a = new C10044c();

    @Override // p343os.InterfaceC10043b
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<String> mo38787a(@Nullable Object obj) {
        return super.mo38787a(obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m38791e(String str, int i10) {
        Integer numValueOf = Integer.valueOf(str.length() + i10);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final int m38792f(int i10, int i11) {
        Integer numValueOf = Integer.valueOf(i10);
        if (numValueOf.intValue() > i11) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    /* JADX DEBUG: Method merged with bridge method: l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // bs.InterfaceC1489b
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String mo6534l(@Nullable Object expression, @Nullable Object data) {
        List<? extends Object> listM43971c = C11744a.m43971c(expression);
        return f36173a.m38799n(listM43971c, C11747d.m43982b(String.valueOf(C11746c.m43979b(listM43971c))), C11747d.m43982b(String.valueOf(C11746c.m43980c(listM43971c))));
    }

    /* JADX INFO: renamed from: h */
    public final String m38794h(String str, int i10, int i11) {
        if (i10 >= 0 && i11 > 0) {
            return m38797k(str, i10, i11);
        }
        if (i10 >= 0 && i11 < 0) {
            String strSubstring = str.substring(i10, str.length() + i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        if (i10 < 0 && i11 < 0) {
            return m38795i(str, i10, i11);
        }
        if (i10 >= 0 || i11 <= 0) {
            return null;
        }
        return m38796j(str, i10, i11);
    }

    /* JADX INFO: renamed from: i */
    public final String m38795i(String str, int i10, int i11) {
        String strSubstring = str.substring(m38791e(str, i10), m38792f(str.length() + i11, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: j */
    public final String m38796j(String str, int i10, int i11) {
        int iM38791e = m38791e(str, i10);
        String strSubstring = str.substring(iM38791e, m38792f(i11 + iM38791e, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: k */
    public final String m38797k(String str, int i10, int i11) {
        String strSubstring = str.substring(i10, m38792f(i11 + i10, str.length()));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: m */
    public final String m38798m(String str, int i10) {
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

    /* JADX INFO: renamed from: n */
    public final String m38799n(List<? extends Object> list, int i10, int i11) {
        Object objM30460b;
        String strM0 = CollectionsKt.m31715m0(mo38787a(CollectionsKt.firstOrNull(list)), ",", null, null, 0, null, null, 62, null);
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            if (list.size() == 2) {
                strM0 = f36173a.m38798m(strM0, i10);
            } else if (list.size() > 2) {
                strM0 = f36173a.m38794h(strM0, i10, i11);
            }
            objM30460b = C7347n.m30460b(strM0);
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30465g(objM30460b)) {
            objM30460b = null;
        }
        String str = (String) objM30460b;
        return str == null ? "" : str;
    }
}
