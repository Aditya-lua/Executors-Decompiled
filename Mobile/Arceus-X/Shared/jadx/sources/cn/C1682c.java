package cn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cn.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\b\b\u0001\u0010\b*\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006!"}, m31665d2 = {"Lcn/c;", "", "StackedT", "bottom", "", "rest", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "R", "Lkotlin/Function1;", "transform", "d", "(Lkotlin/jvm/functions/Function1;)Lcn/c;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "frames", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "top", "backStack", "wf1-container-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C1682c<StackedT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<StackedT> frames;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final StackedT top;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<StackedT> backStack;

    public C1682c(@NotNull StackedT bottom, @NotNull List<? extends StackedT> rest) {
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        Intrinsics.checkNotNullParameter(rest, "rest");
        List<StackedT> listW0 = CollectionsKt.m31725w0(C7697o.m31878d(bottom), rest);
        this.frames = listW0;
        this.top = (StackedT) CollectionsKt.m31717o0(listW0);
        this.backStack = listW0.subList(0, listW0.size() - 1);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<StackedT> m8395a() {
        return this.backStack;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<StackedT> m8396b() {
        return this.frames;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StackedT m8397c() {
        return this.top;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final <R> C1682c<R> m8398d(@NotNull Function1<? super StackedT, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        List<StackedT> list = this.frames;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke((Object) it.next()));
        }
        return C1683d.m8399a(arrayList);
    }

    public boolean equals(@Nullable Object other) {
        C1682c c1682c = other instanceof C1682c ? (C1682c) other : null;
        return Intrinsics.m31980c(c1682c != null ? c1682c.frames : null, this.frames);
    }

    public int hashCode() {
        return this.frames.hashCode();
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap java.lang.Object:CAST), 40, (wrap java.util.List<StackedT>:IGET), 41 */
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) C1682c.class.getSimpleName());
        sb2.append('(');
        sb2.append(this.frames);
        sb2.append(')');
        return sb2.toString();
    }
}
