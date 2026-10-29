package ps;

import bs.InterfaceC1489b;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.EnumC7786m;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p451ts.C11744a;

/* JADX INFO: renamed from: ps.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\u00162\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0016*\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m31665d2 = {"Lps/g;", "Lbs/b;", "Lps/o;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lps/h;", "f", "(Ljava/util/List;)Lps/h;", "options", "", "Lkotlin/text/m;", "b", "(Ljava/util/List;)Ljava/util/Set;", "", "regexPattern", Text.type, "", "d", "(Ljava/lang/String;Ljava/lang/String;)Z", "e", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Z", "c", "(Lps/h;)Z", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10325g implements InterfaceC1489b, InterfaceC10333o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10325g f37174a = new C10325g();

    /* JADX INFO: renamed from: b */
    public final Set<EnumC7786m> m39634b(List<? extends Object> options) {
        List<? extends Object> list = options;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        for (Object obj : list) {
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(EnumC7786m.valueOf((String) obj));
        }
        return CollectionsKt.m31691Q0(arrayList);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m39635c(MatchArguments matchArguments) {
        List<Object> listM39639a = matchArguments.m39639a();
        return (listM39639a == null || listM39639a.isEmpty()) ? m39636d(matchArguments.getRegexPattern(), matchArguments.getText()) : m39637e(matchArguments.m39639a(), matchArguments.getRegexPattern(), matchArguments.getText());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m39636d(String regexPattern, String text) {
        return new Regex(regexPattern).m32113f(text);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m39637e(List<? extends Object> options, String regexPattern, String text) {
        Set<EnumC7786m> setM39634b = m39634b(options);
        Regex regex = new Regex(regexPattern, setM39634b);
        Set<EnumC7786m> set = setM39634b;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (((EnumC7786m) it.next()) == EnumC7786m.MULTILINE) {
                    List listSplit$default = StringsKt.split$default(text, new String[]{"\n"}, false, 0, 6, null);
                    if ((listSplit$default instanceof Collection) && listSplit$default.isEmpty()) {
                        return true;
                    }
                    Iterator it2 = listSplit$default.iterator();
                    while (it2.hasNext()) {
                        if (!regex.m32113f((String) it2.next())) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return regex.m32113f(text);
    }

    /* JADX INFO: renamed from: f */
    public final MatchArguments m39638f(List<? extends Object> list) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Object obj = list.get(0);
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.m31981d(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(2);
            Intrinsics.m31981d(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            objM30460b = C7347n.m30460b(new MatchArguments((String) obj, (String) obj2, (List) obj3));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) == null) {
            return (MatchArguments) objM30460b;
        }
        return null;
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        MatchArguments matchArgumentsM39638f = m39638f(C11744a.m43971c(expression));
        if (matchArgumentsM39638f != null) {
            return Boolean.valueOf(m39635c(matchArgumentsM39638f));
        }
        return null;
    }
}
