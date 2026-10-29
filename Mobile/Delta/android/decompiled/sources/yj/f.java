package yj;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.roblox.client.startup.ActivitySplash;
import gk.p;
import java.util.ArrayList;
import java.util.List;
import jt.n;
import jt.o;
import kotlin.Metadata;
import kotlin.collections.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyj/f;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/ComponentName;", "b", "(Landroid/content/Context;)Landroid/content/ComponentName;", "Lyj/f$a;", "a", "(Landroid/content/Context;)Lyj/f$a;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f35895a = new f();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lyj/f$a;", "", "c", "b", "a", "Lyj/f$a$a;", "Lyj/f$a$b;", "Lyj/f$a$c;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: yj.f$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\t¨\u0006\u0015"}, d2 = {"Lyj/f$a$a;", "Lyj/f$a;", "", "count", "", "reason", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Failed implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            public final int count;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
            @NotNull
            public final String reason;

            public Failed(int i10, @NotNull String reason) {
                Intrinsics.checkNotNullParameter(reason, "reason");
                this.count = i10;
                this.reason = reason;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getCount() {
                return this.count;
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getReason() {
                return this.reason;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failed)) {
                    return false;
                }
                Failed failed = (Failed) other;
                return this.count == failed.count && Intrinsics.c(this.reason, failed.reason);
            }

            public int hashCode() {
                return (Integer.hashCode(this.count) * 31) + this.reason.hashCode();
            }

            @NotNull
            public String toString() {
                return "Failed(count=" + this.count + ", reason=" + this.reason + ")";
            }
        }

        /* JADX INFO: renamed from: yj.f$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lyj/f$a$b;", "Lyj/f$a;", "", "count", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Migrated implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            public final int count;

            public Migrated(int i10) {
                this.count = i10;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getCount() {
                return this.count;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Migrated) && this.count == ((Migrated) other).count;
            }

            public int hashCode() {
                return Integer.hashCode(this.count);
            }

            @NotNull
            public String toString() {
                return "Migrated(count=" + this.count + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyj/f$a$c;", "Lyj/f$a;", "<init>", "()V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final c f35898a = new c();
        }
    }

    @NotNull
    public final a a(@NotNull Context context) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            n.Companion companion = n.INSTANCE;
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager == null) {
                return a.c.f35898a;
            }
            ComponentName componentNameB = b(context);
            List<ShortcutInfo> pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            Intrinsics.checkNotNullExpressionValue(pinnedShortcuts, "getPinnedShortcuts(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj : pinnedShortcuts) {
                if (!((ShortcutInfo) obj).isImmutable()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                if (!Intrinsics.c(((ShortcutInfo) obj2).getActivity(), componentNameB)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                return a.c.f35898a;
            }
            ArrayList arrayList3 = new ArrayList(q.u(arrayList2, 10));
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                arrayList3.add(new ShortcutInfo.Builder(context, ((ShortcutInfo) obj3).getId()).setActivity(componentNameB).build());
            }
            if (!shortcutManager.updateShortcuts(arrayList3)) {
                p.k("ShortcutTarget", "ShortcutManager rejected the migration of " + arrayList3.size() + " shortcut(s) (rate limited?)");
                return new a.Failed(arrayList3.size(), "updateShortcutsRejected");
            }
            p.h("ShortcutTarget", "Migrated " + arrayList3.size() + " shortcut(s) to " + componentNameB.getClassName());
            objB = n.b(new a.Migrated(arrayList3.size()));
            Throwable thE = n.e(objB);
            if (thE != null) {
                p.k("ShortcutTarget", "Failed to migrate shortcuts to " + ActivitySplash.class.getSimpleName() + ": " + thE);
                String name = thE.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                objB = new a.Failed(0, name);
            }
            return (a) objB;
        } catch (Throwable th2) {
            n.Companion companion2 = n.INSTANCE;
            objB = n.b(o.a(th2));
        }
    }

    @NotNull
    public final ComponentName b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ComponentName(context, (Class<?>) ActivitySplash.class);
    }
}
