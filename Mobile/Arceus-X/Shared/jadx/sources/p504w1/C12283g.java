package p504w1;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C7691l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p532x1.C12627a;
import p532x1.C12630d;

/* JADX INFO: renamed from: w1.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u001f\u0010\u0013\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020\u001d8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b \u0010%R\u0016\u0010)\u001a\u00020'8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0*8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0016\u00100\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, m31665d2 = {"Lw1/g;", "E", "", "", "initialCapacity", "<init>", "(I)V", "b", "()Lw1/g;", "", "key", "e", "(J)Ljava/lang/Object;", "", "j", "(J)V", "index", "k", "value", "i", "(JLjava/lang/Object;)V", "n", "()I", "h", "(I)J", "o", "(I)Ljava/lang/Object;", "f", "(J)I", "", "c", "(J)Z", "a", "()V", "", "toString", "()Ljava/lang/String;", "Z", "garbage", "", "[J", "keys", "", "", "[Ljava/lang/Object;", "values", "d", "I", "size", "collection"}, m31666k = 1, m31667mv = {1, 9, 0}, m31669xi = 48)
public class C12283g<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public /* synthetic */ long[] keys;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public /* synthetic */ int size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12283g() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public void m45598a() {
        int i10 = this.size;
        Object[] objArr = this.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12283g<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.m31981d(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C12283g<E> c12283g = (C12283g) objClone;
        c12283g.keys = (long[]) this.keys.clone();
        c12283g.values = (Object[]) this.values.clone();
        return c12283g;
    }

    /* JADX INFO: renamed from: c */
    public boolean m45600c(long key) {
        return m45602f(key) >= 0;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public E m45601e(long key) {
        int iM47048b = C12627a.m47048b(this.keys, this.size, key);
        if (iM47048b < 0 || this.values[iM47048b] == C12284h.f43513a) {
            return null;
        }
        return (E) this.values[iM47048b];
    }

    /* JADX INFO: renamed from: f */
    public int m45602f(long key) {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C12284h.f43513a) {
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
        return C12627a.m47048b(this.keys, this.size, key);
    }

    /* JADX INFO: renamed from: h */
    public long m45603h(int index) {
        if (!(index >= 0 && index < this.size)) {
            C12630d.m47058a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C12284h.f43513a) {
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

    /* JADX INFO: renamed from: i */
    public void m45604i(long key, E value) {
        int iM47048b = C12627a.m47048b(this.keys, this.size, key);
        if (iM47048b >= 0) {
            this.values[iM47048b] = value;
            return;
        }
        int i10 = ~iM47048b;
        if (i10 < this.size && this.values[i10] == C12284h.f43513a) {
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
                    if (obj != C12284h.f43513a) {
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
                i10 = ~C12627a.m47048b(this.keys, i12, key);
            }
        }
        int i14 = this.size;
        if (i14 >= this.keys.length) {
            int iM47052f = C12627a.m47052f(i14 + 1);
            long[] jArrCopyOf = Arrays.copyOf(this.keys, iM47052f);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.keys = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iM47052f);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i15 = this.size;
        if (i15 - i10 != 0) {
            long[] jArr2 = this.keys;
            int i16 = i10 + 1;
            C7691l.m31813h(jArr2, jArr2, i16, i10, i15);
            Object[] objArr2 = this.values;
            C7691l.m31814i(objArr2, objArr2, i16, i10, this.size);
        }
        this.keys[i10] = key;
        this.values[i10] = value;
        this.size++;
    }

    /* JADX INFO: renamed from: j */
    public void m45605j(long key) {
        int iM47048b = C12627a.m47048b(this.keys, this.size, key);
        if (iM47048b < 0 || this.values[iM47048b] == C12284h.f43513a) {
            return;
        }
        this.values[iM47048b] = C12284h.f43513a;
        this.garbage = true;
    }

    /* JADX INFO: renamed from: k */
    public void m45606k(int index) {
        if (this.values[index] != C12284h.f43513a) {
            this.values[index] = C12284h.f43513a;
            this.garbage = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public int m45607n() {
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C12284h.f43513a) {
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

    /* JADX INFO: renamed from: o */
    public E m45608o(int index) {
        if (!(index >= 0 && index < this.size)) {
            C12630d.m47058a("Expected index to be within 0..size()-1, but was " + index);
        }
        if (this.garbage) {
            int i10 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                Object obj = objArr[i12];
                if (obj != C12284h.f43513a) {
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
        if (m45607n() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m45603h(i11));
            sb2.append('=');
            E eM45608o = m45608o(i11);
            if (eM45608o != sb2) {
                sb2.append(eM45608o);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12283g(int i10) {
        if (i10 == 0) {
            this.keys = C12627a.f44952b;
            this.values = C12627a.f44953c;
        } else {
            int iM47052f = C12627a.m47052f(i10);
            this.keys = new long[iM47052f];
            this.values = new Object[iM47052f];
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r1v0 int))
     A[MD:(int):void (m)] (LINE:8) call: w1.g.<init>(int):void type: THIS */
    public /* synthetic */ C12283g(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
