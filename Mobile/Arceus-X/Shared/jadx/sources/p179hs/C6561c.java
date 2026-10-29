package p179hs;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254ks.InterfaceC7823d;
import p451ts.C11744a;
import p451ts.C11746c;

/* JADX INFO: renamed from: hs.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\nH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lhs/c;", "Lbs/b;", "Lks/d;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "c", "(Ljava/util/List;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6561c implements InterfaceC1489b, InterfaceC7823d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6561c f24935a = new C6561c();

    @Override // p254ks.InterfaceC7823d
    /* JADX INFO: renamed from: b */
    public boolean mo22977b(@Nullable Object obj) {
        return super.mo22977b(obj);
    }

    /* JADX INFO: renamed from: c */
    public final Object m28423c(List<? extends Object> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return CollectionsKt.firstOrNull(list);
        }
        if (size != 2) {
            if (size != 3) {
                return mo22977b(CollectionsKt.firstOrNull(list)) ? C11746c.m43979b(list) : m28423c(list.subList(2, list.size()));
            }
            return mo22977b(CollectionsKt.firstOrNull(list)) ? C11746c.m43979b(list) : C11746c.m43980c(list);
        }
        if (mo22977b(CollectionsKt.firstOrNull(list))) {
            return C11746c.m43979b(list);
        }
        return null;
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        return m28423c(C11744a.m43971c(expression));
    }
}
