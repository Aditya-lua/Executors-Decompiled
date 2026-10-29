package p504w1;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C7691l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p532x1.C12627a;

/* JADX INFO: renamed from: w1.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u001e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u0016\u0010*\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, m31665d2 = {"Lw1/k;", "E", "", "", "initialCapacity", "<init>", "(I)V", "c", "()Lw1/k;", "key", "e", "(I)Ljava/lang/Object;", "value", "", "i", "(ILjava/lang/Object;)V", "j", "()I", "index", "h", "(I)I", "k", "f", "(Ljava/lang/Object;)I", "b", "()V", "a", "", "toString", "()Ljava/lang/String;", "", "Z", "garbage", "", "[I", "keys", "", "", "[Ljava/lang/Object;", "values", "d", "I", "size", "collection"}, m31666k = 1, m31667mv = {1, 9, 0}, m31669xi = 48)
public class C12287k<E> implements Cloneable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public /* synthetic */ boolean garbage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public /* synthetic */ int[] keys;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public /* synthetic */ Object[] values;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public /* synthetic */ int size;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12287k() {
        this(0, 1, null);
    }

    /* JADX INFO: renamed from: a */
    public void m45630a(int key, E value) {
        int i10 = this.size;
        if (i10 != 0 && key <= this.keys[i10 - 1]) {
            m45636i(key, value);
            return;
        }
        if (this.garbage && i10 >= this.keys.length) {
            C12288l.m45642d(this);
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int iM47051e = C12627a.m47051e(i11 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iM47051e);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iM47051e);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        this.keys[i11] = key;
        this.values[i11] = value;
        this.size = i11 + 1;
    }

    /* JADX INFO: renamed from: b */
    public void m45631b() {
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
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C12287k<E> clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.m31981d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C12287k<E> c12287k = (C12287k) objClone;
        c12287k.keys = (int[]) this.keys.clone();
        c12287k.values = (Object[]) this.values.clone();
        return c12287k;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public E m45633e(int key) {
        return (E) C12288l.m45641c(this, key);
    }

    /* JADX INFO: renamed from: f */
    public int m45634f(E value) {
        if (this.garbage) {
            C12288l.m45642d(this);
        }
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.values[i11] == value) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public int m45635h(int index) {
        if (this.garbage) {
            C12288l.m45642d(this);
        }
        return this.keys[index];
    }

    /* JADX INFO: renamed from: i */
    public void m45636i(int key, E value) {
        int iM47047a = C12627a.m47047a(this.keys, this.size, key);
        if (iM47047a >= 0) {
            this.values[iM47047a] = value;
            return;
        }
        int i10 = ~iM47047a;
        if (i10 < this.size && this.values[i10] == C12288l.f43530a) {
            this.keys[i10] = key;
            this.values[i10] = value;
            return;
        }
        if (this.garbage && this.size >= this.keys.length) {
            C12288l.m45642d(this);
            i10 = ~C12627a.m47047a(this.keys, this.size, key);
        }
        int i11 = this.size;
        if (i11 >= this.keys.length) {
            int iM47051e = C12627a.m47051e(i11 + 1);
            int[] iArrCopyOf = Arrays.copyOf(this.keys, iM47051e);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.values, iM47051e);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.values = objArrCopyOf;
        }
        int i12 = this.size;
        if (i12 - i10 != 0) {
            int[] iArr = this.keys;
            int i13 = i10 + 1;
            C7691l.m31812g(iArr, iArr, i13, i10, i12);
            Object[] objArr = this.values;
            C7691l.m31814i(objArr, objArr, i13, i10, this.size);
        }
        this.keys[i10] = key;
        this.values[i10] = value;
        this.size++;
    }

    /* JADX INFO: renamed from: j */
    public int m45637j() {
        if (this.garbage) {
            C12288l.m45642d(this);
        }
        return this.size;
    }

    /* JADX INFO: renamed from: k */
    public E m45638k(int index) {
        if (this.garbage) {
            C12288l.m45642d(this);
        }
        Object[] objArr = this.values;
        if (index < objArr.length) {
            return (E) objArr[index];
        }
        C12281e c12281e = C12281e.f43505a;
        throw new ArrayIndexOutOfBoundsException();
    }

    @NotNull
    public String toString() {
        if (m45637j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(m45635h(i11));
            sb2.append('=');
            E eM45638k = m45638k(i11);
            if (eM45638k != this) {
                sb2.append(eM45638k);
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
    public C12287k(int i10) {
        if (i10 == 0) {
            this.keys = C12627a.f44951a;
            this.values = C12627a.f44953c;
        } else {
            int iM47051e = C12627a.m47051e(i10);
            this.keys = new int[iM47051e];
            this.values = new Object[iM47051e];
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r1v0 int))
     A[MD:(int):void (m)] (LINE:8) call: w1.k.<init>(int):void type: THIS */
    public /* synthetic */ C12287k(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
