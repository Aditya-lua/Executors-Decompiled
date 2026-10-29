package xu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001aB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017¨\u0006\u001b"}, d2 = {"Lxu/f0;", "Lkotlin/collections/d;", "Lxu/h;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lxu/h;[I)V", "", "index", "e", "(I)Lxu/h;", "b", "[Lxu/h;", "f", "()[Lxu/h;", "c", "[I", "g", "()[I", "()I", "size", "d", "a", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 extends kotlin.collections.d<h> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h[] byteStrings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final int[] trie;

    /* JADX INFO: renamed from: xu.f0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ[\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\n*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lxu/f0$a;", "", "<init>", "()V", "", "Lxu/h;", "byteStrings", "Lxu/f0;", "d", "([Lxu/h;)Lxu/f0;", "", "nodeOffset", "Lxu/e;", "node", "", "byteStringOffset", "", "fromIndex", "toIndex", "indexes", "", "a", "(JLxu/e;ILjava/util/List;IILjava/util/List;)V", "c", "(Lxu/e;)J", "intCount", "okio"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(Companion companion, long j10, e eVar, int i10, List list, int i11, int i12, List list2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            companion.a(j10, eVar, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        public final void a(long nodeOffset, e node, int byteStringOffset, List<? extends h> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) {
            int i10;
            int i11;
            int i12;
            long j10;
            int i13 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i14 = fromIndex; i14 < toIndex; i14++) {
                if (byteStrings.get(i14).I() < i13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            h hVar = byteStrings.get(fromIndex);
            h hVar2 = byteStrings.get(toIndex - 1);
            if (i13 == hVar.I()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i15 = fromIndex + 1;
                h hVar3 = byteStrings.get(i15);
                i10 = i15;
                i11 = iIntValue;
                hVar = hVar3;
            } else {
                i10 = fromIndex;
                i11 = -1;
            }
            if (hVar.j(i13) == hVar2.j(i13)) {
                int iMin = Math.min(hVar.I(), hVar2.I());
                int i16 = 0;
                for (int i17 = i13; i17 < iMin && hVar.j(i17) == hVar2.j(i17); i17++) {
                    i16++;
                }
                long jC = nodeOffset + c(node) + ((long) 2) + ((long) i16) + 1;
                node.writeInt(-i16);
                node.writeInt(i11);
                int i18 = i13 + i16;
                while (i13 < i18) {
                    node.writeInt(hVar.j(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == toIndex) {
                    if (i18 != byteStrings.get(i10).I()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i10).intValue());
                    return;
                } else {
                    e eVar = new e();
                    node.writeInt(((int) (c(eVar) + jC)) * (-1));
                    a(jC, eVar, i18, byteStrings, i10, toIndex, indexes);
                    node.g2(eVar);
                    return;
                }
            }
            int i19 = 1;
            for (int i20 = i10 + 1; i20 < toIndex; i20++) {
                if (byteStrings.get(i20 - 1).j(i13) != byteStrings.get(i20).j(i13)) {
                    i19++;
                }
            }
            long jC2 = nodeOffset + c(node) + ((long) 2) + ((long) (i19 * 2));
            node.writeInt(i19);
            node.writeInt(i11);
            for (int i21 = i10; i21 < toIndex; i21++) {
                byte bJ = byteStrings.get(i21).j(i13);
                if (i21 == i10 || bJ != byteStrings.get(i21 - 1).j(i13)) {
                    node.writeInt(bJ & 255);
                }
            }
            e eVar2 = new e();
            while (i10 < toIndex) {
                byte bJ2 = byteStrings.get(i10).j(i13);
                int i22 = i10 + 1;
                int i23 = i22;
                while (true) {
                    if (i23 >= toIndex) {
                        i12 = toIndex;
                        break;
                    } else {
                        if (bJ2 != byteStrings.get(i23).j(i13)) {
                            i12 = i23;
                            break;
                        }
                        i23++;
                    }
                }
                if (i22 == i12 && i13 + 1 == byteStrings.get(i10).I()) {
                    node.writeInt(indexes.get(i10).intValue());
                    j10 = jC2;
                } else {
                    node.writeInt(((int) (c(eVar2) + jC2)) * (-1));
                    j10 = jC2;
                    a(j10, eVar2, i13 + 1, byteStrings, i10, i12, indexes);
                }
                jC2 = j10;
                i10 = i12;
            }
            node.g2(eVar2);
        }

        public final long c(e eVar) {
            return eVar.getSize() / ((long) 4);
        }

        @NotNull
        public final f0 d(@NotNull h... byteStrings) {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (byteStrings.length == 0) {
                return new f0(new h[0], new int[]{0, -1}, defaultConstructorMarker);
            }
            List listL0 = kotlin.collections.m.l0(byteStrings);
            kotlin.collections.t.x(listL0);
            int size = listL0.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(-1);
            }
            int length = byteStrings.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                arrayList.set(kotlin.collections.p.j(listL0, byteStrings[i11], 0, 0, 6, null), Integer.valueOf(i12));
                i11++;
                i12++;
            }
            if (((h) listL0.get(0)).I() <= 0) {
                throw new IllegalArgumentException("the empty byte string is not a supported option");
            }
            int i13 = 0;
            while (i13 < listL0.size()) {
                h hVar = (h) listL0.get(i13);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < listL0.size()) {
                    h hVar2 = (h) listL0.get(i15);
                    if (!hVar2.J(hVar)) {
                        break;
                    }
                    if (hVar2.I() == hVar.I()) {
                        throw new IllegalArgumentException(("duplicate option: " + hVar2).toString());
                    }
                    if (((Number) arrayList.get(i15)).intValue() > ((Number) arrayList.get(i13)).intValue()) {
                        listL0.remove(i15);
                        ((Number) arrayList.remove(i15)).intValue();
                    } else {
                        i15++;
                    }
                }
                i13 = i14;
            }
            e eVar = new e();
            b(this, 0L, eVar, 0, listL0, 0, 0, arrayList, 53, null);
            int iC = (int) c(eVar);
            int[] iArr = new int[iC];
            for (int i16 = 0; i16 < iC; i16++) {
                iArr[i16] = eVar.readInt();
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            return new f0((h[]) objArrCopyOf, iArr, defaultConstructorMarker);
        }

        public Companion() {
        }
    }

    public /* synthetic */ f0(h[] hVarArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVarArr, iArr);
    }

    @NotNull
    public static final f0 l(@NotNull h... hVarArr) {
        return INSTANCE.d(hVarArr);
    }

    @Override // kotlin.collections.b
    /* JADX INFO: renamed from: b */
    public int getSize() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof h) {
            return d((h) obj);
        }
        return false;
    }

    public /* bridge */ boolean d(h hVar) {
        return super.contains(hVar);
    }

    @Override // kotlin.collections.d, java.util.List
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public h get(int index) {
        return this.byteStrings[index];
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final h[] getByteStrings() {
        return this.byteStrings;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ int i(h hVar) {
        return super.indexOf(hVar);
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof h) {
            return i((h) obj);
        }
        return -1;
    }

    public /* bridge */ int k(h hVar) {
        return super.lastIndexOf(hVar);
    }

    @Override // kotlin.collections.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof h) {
            return k((h) obj);
        }
        return -1;
    }

    public f0(h[] hVarArr, int[] iArr) {
        this.byteStrings = hVarArr;
        this.trie = iArr;
    }
}
