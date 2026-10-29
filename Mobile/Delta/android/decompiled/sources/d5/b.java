package d5;

import android.os.Bundle;
import androidx.p000lifecycle.p;
import com.appsflyer.sdk_base.referrer.Payload;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jt.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Ld5/b;", "Landroidx/lifecycle/p;", "Ld5/i;", "owner", "<init>", "(Ld5/i;)V", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", "event", "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "", "className", "a", "(Ljava/lang/String;)V", "Ld5/i;", "b", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i owner;

    /* JADX INFO: renamed from: d5.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Ld5/b$b;", "Ld5/f$b;", "Ld5/f;", "registry", "<init>", "(Ld5/f;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "", "className", "", "b", "(Ljava/lang/String;)V", "", "Ljava/util/Set;", "classes", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0266b implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Set<String> classes;

        public C0266b(@NotNull f registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.classes = new LinkedHashSet();
            registry.c("androidx.savedstate.Restarter", this);
        }

        @Override // d5.f.b
        @NotNull
        public Bundle a() {
            Pair[] pairArr;
            Map mapJ = k0.j();
            if (mapJ.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapJ.size());
                for (Map.Entry entry : mapJ.entrySet()) {
                    arrayList.add(s.a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            Bundle bundleA = u2.d.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            j.d(j.a(bundleA), "classes_to_restore", CollectionsKt.M0(this.classes));
            return bundleA;
        }

        public final void b(@NotNull String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.classes.add(className);
        }
    }

    public b(@NotNull i owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
    }

    public final void a(String className) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(className, false, b.class.getClassLoader()).asSubclass(f.a.class);
            Intrinsics.checkNotNull(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Intrinsics.checkNotNull(objNewInstance);
                    ((f.a) objNewInstance).a(this.owner);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + className, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + className + " wasn't found", e12);
        }
    }

    @Override // androidx.p000lifecycle.p
    public void g(@NotNull androidx.p000lifecycle.s source, @NotNull androidx.lifecycle.l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != androidx.lifecycle.l.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.a().d(this);
        Bundle bundleA = this.owner.A().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        List<String> listE = c.e(c.a(bundleA), "classes_to_restore");
        if (listE == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = listE.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
