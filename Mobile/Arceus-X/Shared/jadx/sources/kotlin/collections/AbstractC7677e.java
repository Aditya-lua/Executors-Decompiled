package kotlin.collections;

import au.InterfaceC1171b;
import java.util.AbstractCollection;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: renamed from: kotlin.collections.e */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Lkotlin/collections/e;", "E", "", "Ljava/util/AbstractCollection;", "<init>", "()V", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC7677e<E> extends AbstractCollection<E> implements Collection<E>, InterfaceC1171b {
    /* JADX INFO: renamed from: a */
    public abstract int mo31759a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return mo31759a();
    }
}
