package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.room.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, m31665d2 = {"Landroidx/room/e;", "", "Landroidx/room/c$b;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/c$b;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "", "c", "(Ljava/util/Set;)V", "invalidatedTablesNames", "d", "a", "Landroidx/room/c$b;", "()Landroidx/room/c$b;", "b", "[I", "()[I", "[Ljava/lang/String;", "Ljava/util/Set;", "singleTableSet", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1077e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final C1075c.b observer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final int[] tableIds;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final String[] tableNames;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Set<String> singleTableSet;

    public C1077e(@NotNull C1075c.b observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? C7700p0.m31904c(tableNames[0]) : C7702q0.m31908d();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1075c.b getObserver() {
        return this.observer;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    /* JADX INFO: renamed from: c */
    public final void m6147c(@NotNull Set<Integer> invalidatedTablesIds) {
        Set<String> setM31908d;
        Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                Set setM31903b = C7700p0.m31903b();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = i11 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                        setM31903b.add(this.tableNames[i11]);
                    }
                    i10++;
                    i11 = i12;
                }
                setM31908d = C7700p0.m31902a(setM31903b);
            } else {
                setM31908d = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : C7702q0.m31908d();
            }
        } else {
            setM31908d = C7702q0.m31908d();
        }
        if (setM31908d.isEmpty()) {
            return;
        }
        this.observer.mo6130c(setM31908d);
    }

    /* JADX INFO: renamed from: d */
    public final void m6148d(@NotNull Set<String> invalidatedTablesNames) {
        Set<String> setM31908d;
        Intrinsics.checkNotNullParameter(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setM31908d = C7702q0.m31908d();
        } else if (length == 1) {
            Set<String> set = invalidatedTablesNames;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C7797x.m32294E((String) it.next(), this.tableNames[0], true)) {
                            setM31908d = this.singleTableSet;
                            break;
                        }
                    } else {
                        setM31908d = C7702q0.m31908d();
                        break;
                    }
                }
            } else {
                setM31908d = C7702q0.m31908d();
                break;
            }
        } else {
            Set setM31903b = C7700p0.m31903b();
            for (String str : invalidatedTablesNames) {
                for (String str2 : this.tableNames) {
                    if (C7797x.m32294E(str2, str, true)) {
                        setM31903b.add(str2);
                        break;
                    }
                }
            }
            setM31908d = C7700p0.m31902a(setM31903b);
        }
        if (setM31908d.isEmpty()) {
            return;
        }
        this.observer.mo6130c(setM31908d);
    }
}
