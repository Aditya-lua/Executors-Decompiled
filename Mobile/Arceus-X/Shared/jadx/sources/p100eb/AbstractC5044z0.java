package p100eb;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: renamed from: eb.z0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5044z0 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Object[] f19844a = new Object[0];

    /* JADX INFO: renamed from: a */
    public int mo23574a(Object[] objArr, int i10) {
        AbstractC4909c2 abstractC4909c2Mo23575d = mo23575d();
        int i11 = 0;
        while (abstractC4909c2Mo23575d.hasNext()) {
            objArr[i11] = abstractC4909c2Mo23575d.next();
            i11++;
        }
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: b */
    public int mo23564b() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public int mo23565c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract AbstractC4909c2 mo23575d();

    /* JADX INFO: renamed from: e */
    public Object[] mo23566e() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f19844a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrMo23566e = mo23566e();
            if (objArrMo23566e != null) {
                return Arrays.copyOfRange(objArrMo23566e, mo23565c(), mo23564b(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo23574a(objArr, 0);
        return objArr;
    }
}
