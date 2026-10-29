package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.p0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001c\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/room/e;", "", "Landroidx/room/c$b;", "observer", "", "tableIds", "", "", "tableNames", "<init>", "(Landroidx/room/c$b;[I[Ljava/lang/String;)V", "", "", "invalidatedTablesIds", "", "c", "(Ljava/util/Set;)V", "invalidatedTablesNames", "d", "a", "Landroidx/room/c$b;", "()Landroidx/room/c$b;", "b", "[I", "()[I", "[Ljava/lang/String;", "Ljava/util/Set;", "singleTableSet", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c.b observer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final int[] tableIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] tableNames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<String> singleTableSet;

    public e(@NotNull c.b observer, @NotNull int[] tableIds, @NotNull String[] tableNames) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? p0.c(tableNames[0]) : q0.d();
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final c.b getObserver() {
        return this.observer;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    public final void c(@NotNull Set<Integer> invalidatedTablesIds) {
        Set<String> setD;
        Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                Set setB = p0.b();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = i11 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                        setB.add(this.tableNames[i11]);
                    }
                    i10++;
                    i11 = i12;
                }
                setD = p0.a(setB);
            } else {
                setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : q0.d();
            }
        } else {
            setD = q0.d();
        }
        if (setD.isEmpty()) {
            return;
        }
        this.observer.c(setD);
    }

    public final void d(@NotNull Set<String> invalidatedTablesNames) {
        Set<String> setD;
        Intrinsics.checkNotNullParameter(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setD = q0.d();
        } else if (length == 1) {
            Set<String> set = invalidatedTablesNames;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (x.E((String) it.next(), this.tableNames[0], true)) {
                            setD = this.singleTableSet;
                            break;
                        }
                    } else {
                        setD = q0.d();
                        break;
                    }
                }
            } else {
                setD = q0.d();
                break;
            }
        } else {
            Set setB = p0.b();
            for (String str : invalidatedTablesNames) {
                for (String str2 : this.tableNames) {
                    if (x.E(str2, str, true)) {
                        setB.add(str2);
                        break;
                    }
                }
            }
            setD = p0.a(setB);
        }
        if (setD.isEmpty()) {
            return;
        }
        this.observer.c(setD);
    }
}
