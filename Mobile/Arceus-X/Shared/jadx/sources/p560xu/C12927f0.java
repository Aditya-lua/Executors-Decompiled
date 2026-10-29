package p560xu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC7675d;
import kotlin.collections.C7693m;
import kotlin.collections.C7699p;
import kotlin.collections.C7707t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: xu.f0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001aB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u001b"}, m31665d2 = {"Lxu/f0;", "Lkotlin/collections/d;", "Lxu/h;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lxu/h;[I)V", "", "index", "e", "(I)Lxu/h;", "b", "[Lxu/h;", "f", "()[Lxu/h;", "c", "[I", "g", "()[I", "()I", "size", "d", "a", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12927f0 extends AbstractC7675d<C12930h> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C12930h[] byteStrings;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final int[] trie;

    /* JADX INFO: renamed from: xu.f0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ[\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\n*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m31665d2 = {"Lxu/f0$a;", "", "<init>", "()V", "", "Lxu/h;", "byteStrings", "Lxu/f0;", "d", "([Lxu/h;)Lxu/f0;", "", "nodeOffset", "Lxu/e;", "node", "", "byteStringOffset", "", "fromIndex", "toIndex", "indexes", "", "a", "(JLxu/e;ILjava/util/List;IILjava/util/List;)V", "c", "(Lxu/e;)J", "intCount", "okio"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: xu.f0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m48073b(Companion companion, long j10, C12924e c12924e, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            companion.m48074a(j10, c12924e, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        /* JADX INFO: renamed from: a */
        public final void m48074a(long nodeOffset, C12924e node, int byteStringOffset, List<? extends C12930h> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) {
            int i10;
            int i11;
            int i12;
            long j10;
            int i13 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i14 = fromIndex; i14 < toIndex; i14++) {
                if (byteStrings.get(i14).m48089I() < i13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C12930h c12930h = byteStrings.get(fromIndex);
            C12930h c12930h2 = byteStrings.get(toIndex - 1);
            if (i13 == c12930h.m48089I()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i15 = fromIndex + 1;
                C12930h c12930h3 = byteStrings.get(i15);
                i10 = i15;
                i11 = iIntValue;
                c12930h = c12930h3;
            } else {
                i10 = fromIndex;
                i11 = -1;
            }
            if (c12930h.m48101j(i13) == c12930h2.m48101j(i13)) {
                int iMin = Math.min(c12930h.m48089I(), c12930h2.m48089I());
                int i16 = 0;
                for (int i17 = i13; i17 < iMin && c12930h.m48101j(i17) == c12930h2.m48101j(i17); i17++) {
                    i16++;
                }
                long jM48075c = nodeOffset + m48075c(node) + ((long) 2) + ((long) i16) + 1;
                node.writeInt(-i16);
                node.writeInt(i11);
                int i18 = i13 + i16;
                while (i13 < i18) {
                    node.writeInt(c12930h.m48101j(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == toIndex) {
                    if (i18 != byteStrings.get(i10).m48089I()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i10).intValue());
                    return;
                } else {
                    C12924e c12924e = new C12924e();
                    node.writeInt(((int) (m48075c(c12924e) + jM48075c)) * (-1));
                    m48074a(jM48075c, c12924e, i18, byteStrings, i10, toIndex, indexes);
                    node.mo48028g2(c12924e);
                    return;
                }
            }
            int i19 = 1;
            for (int i20 = i10 + 1; i20 < toIndex; i20++) {
                if (byteStrings.get(i20 - 1).m48101j(i13) != byteStrings.get(i20).m48101j(i13)) {
                    i19++;
                }
            }
            long jM48075c2 = nodeOffset + m48075c(node) + ((long) 2) + ((long) (i19 * 2));
            node.writeInt(i19);
            node.writeInt(i11);
            for (int i21 = i10; i21 < toIndex; i21++) {
                byte bM48101j = byteStrings.get(i21).m48101j(i13);
                if (i21 == i10 || bM48101j != byteStrings.get(i21 - 1).m48101j(i13)) {
                    node.writeInt(bM48101j & 255);
                }
            }
            C12924e c12924e2 = new C12924e();
            while (i10 < toIndex) {
                byte bM48101j2 = byteStrings.get(i10).m48101j(i13);
                int i22 = i10 + 1;
                int i23 = i22;
                while (true) {
                    if (i23 >= toIndex) {
                        i12 = toIndex;
                        break;
                    } else {
                        if (bM48101j2 != byteStrings.get(i23).m48101j(i13)) {
                            i12 = i23;
                            break;
                        }
                        i23++;
                    }
                }
                if (i22 == i12 && i13 + 1 == byteStrings.get(i10).m48089I()) {
                    node.writeInt(indexes.get(i10).intValue());
                    j10 = jM48075c2;
                } else {
                    node.writeInt(((int) (m48075c(c12924e2) + jM48075c2)) * (-1));
                    j10 = jM48075c2;
                    m48074a(j10, c12924e2, i13 + 1, byteStrings, i10, i12, indexes);
                }
                jM48075c2 = j10;
                i10 = i12;
            }
            node.mo48028g2(c12924e2);
        }

        /* JADX INFO: renamed from: c */
        public final long m48075c(C12924e c12924e) {
            return c12924e.getSize() / ((long) 4);
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C12927f0 m48076d(@NotNull C12930h... byteStrings) {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new C12927f0(new C12930h[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List listM31869l0 = C7693m.m31869l0(byteStrings);
            C7707t.m31918x(listM31869l0);
            int size = listM31869l0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(C7699p.m31891j(listM31869l0, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((C12930h) listM31869l0.get(0)).m48089I() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < listM31869l0.size()) {
                C12930h c12930h = (C12930h) listM31869l0.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listM31869l0.size()) {
                    C12930h c12930h2 = (C12930h) listM31869l0.get(i15);
                    if (!c12930h2.m48090J(c12930h)) {
                        break;
                    }
                    if (c12930h2.m48089I() == c12930h.m48089I()) {
                        throw new IllegalArgumentException(("duplicate option: " + c12930h2).toString());
                    }
                    if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                        listM31869l0.remove(i15);
                        ((Number) arrayList.remove(i15)).intValue();
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            C12924e c12924e = new C12924e();
            m48073b(this, 0L, c12924e, 0, listM31869l0, 0, 0, arrayList, 53, null);
            int iM48075c = (int) m48075c(c12924e);
            int[] iArr = new int[iM48075c];
            for (int i16 = 0; i16 < iM48075c; i16++) {
                iArr[i16] = c12924e.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            return new C12927f0((C12930h[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 xu.h[]), (r2v0 int[]) A[MD:(xu.h[], int[]):void (m)] (LINE:1) call: xu.f0.<init>(xu.h[], int[]):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C12927f0(C12930h[] c12930hArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12930hArr, iArr);
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static final C12927f0 m48066l(@NotNull C12930h... c12930hArr) {
        return INSTANCE.m48076d(c12930hArr);
    }

    @Override // kotlin.collections.AbstractC7671b
    /* JADX INFO: renamed from: b */
    public int getSize() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.AbstractC7671b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C12930h) {
            return m48067d((C12930h) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public /* bridge */ boolean m48067d(C12930h c12930h) {
        return super.contains(c12930h);
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Ljava/lang/Object; */
    @Override // kotlin.collections.AbstractC7675d, java.util.List
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C12930h get(int index) {
        return this.byteStrings[index];
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final C12930h[] getByteStrings() {
        return this.byteStrings;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    /* JADX INFO: renamed from: i */
    public /* bridge */ int m48071i(C12930h c12930h) {
        return super.indexOf(c12930h);
    }

    @Override // kotlin.collections.AbstractC7675d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C12930h) {
            return m48071i((C12930h) obj);
        }
        return -1;
    }

    /* JADX INFO: renamed from: k */
    public /* bridge */ int m48072k(C12930h c12930h) {
        return super.lastIndexOf(c12930h);
    }

    @Override // kotlin.collections.AbstractC7675d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C12930h) {
            return m48072k((C12930h) obj);
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12927f0(C12930h[] c12930hArr, int[] iArr) {
        this.byteStrings = c12930hArr;
        this.trie = iArr;
    }
}
