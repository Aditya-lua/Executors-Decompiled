package ie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p169he.C6380j;
import p169he.C6384n;

/* JADX INFO: renamed from: ie.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6765d0 {
    /* JADX INFO: renamed from: a */
    public static boolean m28890a(List<?> list, Object obj) {
        if (obj == C6384n.m27928l(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C6761b0.m28882b(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!C6380j.m27910a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m28891b(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m28892c(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C6380j.m27910a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static int m28892c(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m28893d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m28894e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C6380j.m27910a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m28894e(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static <E> ArrayList<E> m28895f() {
        return new ArrayList<>();
    }

    /* JADX INFO: renamed from: g */
    public static <E> ArrayList<E> m28896g(Iterator<? extends E> it) {
        ArrayList<E> arrayListM28895f = m28895f();
        C6761b0.m28881a(arrayListM28895f, it);
        return arrayListM28895f;
    }

    /* JADX INFO: renamed from: h */
    public static <E> ArrayList<E> m28897h(int i10) {
        C6770g.m28907b(i10, "initialArraySize");
        return new ArrayList<>(i10);
    }
}
