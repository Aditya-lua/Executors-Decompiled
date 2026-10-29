package p068d5;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
import com.appsflyer.sdk_base.referrer.Payload;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7690k0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7352s;
import p456u2.C11775d;

/* JADX INFO: renamed from: d5.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, m31665d2 = {"Ld5/b;", "Landroidx/lifecycle/p;", "Ld5/i;", "owner", "<init>", "(Ld5/i;)V", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "", "className", "a", "(Ljava/lang/String;)V", "Ld5/i;", "b", "savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4438b implements InterfaceC0974p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC4445i owner;

    /* JADX INFO: renamed from: d5.b$b */
    @Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Ld5/b$b;", "Ld5/f$b;", "Ld5/f;", "registry", "<init>", "(Ld5/f;)V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "a", "()Landroid/os/Bundle;", "", "className", "", "b", "(Ljava/lang/String;)V", "", "Ljava/util/Set;", "classes", "savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b implements C4442f.b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Set<String> classes;

        public b(@NotNull C4442f registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.classes = new LinkedHashSet();
            registry.m22354c("androidx.savedstate.Restarter", this);
        }

        @Override // p068d5.C4442f.b
        @NotNull
        /* JADX INFO: renamed from: a */
        public Bundle mo4974a() {
            Pair[] pairArr;
            Map mapM31795j = C7690k0.m31795j();
            if (mapM31795j.isEmpty()) {
                pairArr = new Pair[0];
            } else {
                ArrayList arrayList = new ArrayList(mapM31795j.size());
                for (Map.Entry entry : mapM31795j.entrySet()) {
                    arrayList.add(C7352s.m30477a((String) entry.getKey(), entry.getValue()));
                }
                pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            }
            Bundle bundleM44057a = C11775d.m44057a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            C4446j.m22368d(C4446j.m22365a(bundleM44057a), "classes_to_restore", CollectionsKt.m31687M0(this.classes));
            return bundleM44057a;
        }

        /* JADX INFO: renamed from: b */
        public final void m22342b(@NotNull String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.classes.add(className);
        }
    }

    public C4438b(@NotNull InterfaceC4445i owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
    }

    /* JADX INFO: renamed from: a */
    public final void m22341a(String className) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(className, false, C4438b.class.getClassLoader()).asSubclass(C4442f.a.class);
            Intrinsics.checkNotNull(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    Intrinsics.checkNotNull(objNewInstance);
                    ((C4442f.a) objNewInstance).mo4925a(this.owner);
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

    @Override // androidx.p616lifecycle.InterfaceC0974p
    /* JADX INFO: renamed from: g */
    public void mo1334g(@NotNull InterfaceC0980s source, @NotNull AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != AbstractC0966l.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.mo4656a().mo4938d(this);
        Bundle bundleM22352a = this.owner.mo4583A().m22352a("androidx.savedstate.Restarter");
        if (bundleM22352a == null) {
            return;
        }
        List<String> listM22347e = C4439c.m22347e(C4439c.m22343a(bundleM22352a), "classes_to_restore");
        if (listM22347e == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = listM22347e.iterator();
        while (it.hasNext()) {
            m22341a(it.next());
        }
    }
}
