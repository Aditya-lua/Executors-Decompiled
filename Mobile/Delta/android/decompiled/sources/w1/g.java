package w1;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b \u0010%R\u0016\u0010)\u001a\u00020'8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0016\u00100\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lw1/g;", "E", "", "", "initialCapacity", "<init>", "(I)V", "b", "()Lw1/g;", "", "key", "e", "(J)Ljava/lang/Object;", "", "j", "(J)V", "index", "k", "value", "i", "(JLjava/lang/Object;)V", "n", "()I", "h", "(I)J", "o", "(I)Ljava/lang/Object;", "f", "(J)I", "", "c", "(J)Z", "a", "()V", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[J", "keys", "", "", "[Ljava/lang/Object;", "values", "d", "I", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class g<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public /* synthetic */ long[] keys;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public /* synthetic */ int size;

    public g() {
        this(0, 1, null);
    }

    public void a() {
        int i10 = this.size;
        Object[] objArr = this.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        g<E> gVar = (g) objClone;
        gVar.keys = (long[]) this.keys.clone();
        gVar.values = (Object[]) this.values.clone();
        return gVar;
    }

    public boolean c(long key) {
        return f(key) >= 0;
    }

    @Nullable
    public E e(long key) {
        int iB = x1.a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == h.f33611a) {
            return null;
        }
        return (E) this.values[iB];
    }

    public int f(long key) {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != h.f33611a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return x1.a.b(this.keys, this.size, key);
    }

    public long h(int index) {
        if (!(index >= 0 && index < this.size)) {
            x1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != h.f33611a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return this.keys[index];
    }

    public void i(long key, E value) {
        int iB = x1.a.b(this.keys, this.size, key);
        if (iB >= 0) {
            this.values[iB] = value;
            return;
        }
        int i10 = ~iB;
        if (i10 < this.size && this.values[i10] == h.f33611a) {
            this.keys[i10] = key;
            this.values[i10] = value;
            return;
        }
        if (this.garbage) {
            int i11 = this.size;
            long[] jArr = this.keys;
            if (i11 >= jArr.length) {
                Object[] objArr = this.values;
                int i12 = 0;
                for (int i13 = 0; i13 < i11; i13++) {
                    Object obj = objArr[i13];
                    if (obj != h.f33611a) {
                        if (i13 != i12) {
                            jArr[i12] = jArr[i13];
                            objArr[i12] = obj;
                            objArr[i13] = null;
                        }
                        i12++;
                    }
                }
                this.garbage = false;
                this.size = i12;
                i10 = ~x1.a.b(this.keys, i12, key);
            }
        }
        int i14 = this.size;
        if (i14 >= this.keys.length) {
            int iF = x1.a.f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iF);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iF);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i15 = this.size;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.keys;
            int i16 = i10 + 1;
            kotlin.collections.l.h(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.values;
            kotlin.collections.l.i(objArr2, objArr2, i16, i10, this.size);
        }
        this.keys[i10] = key;
        this.values[i10] = value;
        this.size++;
    }

    public void j(long key) {
        int iB = x1.a.b(this.keys, this.size, key);
        if (iB < 0 || this.values[iB] == h.f33611a) {
            return;
        }
        this.values[iB] = h.f33611a;
        this.garbage = true;
    }

    public void k(int index) {
        if (this.values[index] != h.f33611a) {
            this.values[index] = h.f33611a;
            this.garbage = true;
        }
    }

    public int n() {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != h.f33611a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return this.size;
    }

    public E o(int index) {
        if (!(index >= 0 && index < this.size)) {
            x1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != h.f33611a) {
                    if (i12 != i11) {
                        jArr[i11] = jArr[i12];
                        objArr[i11] = obj;
                        objArr[i12] = null;
                    }
                    i11++;
                }
            }
            this.garbage = false;
            this.size = i11;
        }
        return (E) this.values[index];
    }

    @NotNull
    public String toString() {
        if (n() <= 0) {
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
            E eO = o(i11);
            if (eO != sb2) {
                sb2.append(eO);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.keys = x1.a.b;
            this.values = x1.a.f34679c;
        } else {
            int iF = x1.a.f(i10);
            this.keys = new long[iF];
            this.values = new Object[iF];
        }
    }

    public /* synthetic */ g(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
