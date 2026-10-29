package kotlin.collections;

import au.InterfaceC1173d;
import java.util.AbstractList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: kotlin.collections.f */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lkotlin/collections/f;", "E", "", "Ljava/util/AbstractList;", "<init>", "()V", "", "index", "b", "(I)Ljava/lang/Object;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC7679f<E> extends AbstractList<E> implements List<E>, InterfaceC1173d {
    /* JADX INFO: renamed from: a */
    public abstract int mo31760a();

    /* JADX INFO: renamed from: b */
    public abstract E mo31761b(int index);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i10) {
        return mo31761b(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo31760a();
    }
}
