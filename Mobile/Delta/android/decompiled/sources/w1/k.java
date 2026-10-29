package w1;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010*\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lw1/k;", "E", "", "", "initialCapacity", "<init>", "(I)V", "c", "()Lw1/k;", "key", "e", "(I)Ljava/lang/Object;", "value", "", "i", "(ILjava/lang/Object;)V", "j", "()I", "index", "h", "(I)I", "k", "f", "(Ljava/lang/Object;)I", "b", "()V", "a", "", "toString", "()Ljava/lang/String;", "", "Z", "garbage", "", "[I", "keys", "", "", "[Ljava/lang/Object;", "values", "d", "I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class k<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public /* synthetic */ int[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int size;

    public k() {
        this(0, 1, null);
    }

    public void a(int key, E value) {
        int i10 = this.size;
        if (i10 != 0 && key <= this.keys[i10 - 1]) {
            i(key, value);
            return;
        }
        if (this.garbage && i10 >= this.keys.length) {
            l.d(this);
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int iE = x1.a.e(i11 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        this.keys[i11] = key;
        this.values[i11] = value;
        this.size = i11 + 1;
    }

    public void b() {
        int i10 = this.size;
        Object[] objArr = this.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        k<E> kVar = (k) objClone;
        kVar.keys = (int[]) this.keys.clone();
        kVar.values = (Object[]) this.values.clone();
        return kVar;
    }

    @Nullable
    public E e(int key) {
        return (E) l.c(this, key);
    }

    public int f(E value) {
        if (this.garbage) {
            l.d(this);
        }
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.values[i11] == value) {
                return i11;
            }
        }
        return -1;
    }

    public int h(int index) {
        if (this.garbage) {
            l.d(this);
        }
        return this.keys[index];
    }

    public void i(int key, E value) {
        int iA = x1.a.a(this.keys, this.size, key);
        if (iA >= 0) {
            this.values[iA] = value;
            return;
        }
        int i10 = ~iA;
        if (i10 < this.size && this.values[i10] == l.f33625a) {
            this.keys[i10] = key;
            this.values[i10] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            l.d(this);
            i10 = ~x1.a.a(this.keys, this.size, key);
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int iE = x1.a.e(i11 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iE);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i12 = this.size;
        if (i12 - i10 != 0) {
            int[] iArr = this.keys;
            int i13 = i10 + 1;
            kotlin.collections.l.g(iArr, iArr, i13, i10, i12);
            Object[] objArr = this.values;
            kotlin.collections.l.i(objArr, objArr, i13, i10, this.size);
        }
        this.keys[i10] = key;
        this.values[i10] = value;
        this.size++;
    }

    public int j() {
        if (this.garbage) {
            l.d(this);
        }
        return this.size;
    }

    public E k(int index) {
        if (this.garbage) {
            l.d(this);
        }
        Object[] objArr = this.values;
        if (index < objArr.length) {
            return (E) objArr[index];
        }
        e eVar = e.f33605a;
        throw new ArrayIndexOutOfBoundsException();
    }

    @NotNull
    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(h(i11));
            sb2.append('=');
            E eK = k(i11);
            if (eK != this) {
                sb2.append(eK);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public k(int i10) {
        if (i10 == 0) {
            this.keys = x1.a.f34678a;
            this.values = x1.a.f34679c;
        } else {
            int iE = x1.a.e(i10);
            this.keys = new int[iE];
            this.values = new Object[iE];
        }
    }

    public /* synthetic */ k(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
