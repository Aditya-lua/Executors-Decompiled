package androidx.p616lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.lifecycle.b1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0003R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Landroidx/lifecycle/b1;", "", "<init>", "()V", "", "key", "Landroidx/lifecycle/x0;", "viewModel", "", "d", "(Ljava/lang/String;Landroidx/lifecycle/x0;)V", "b", "(Ljava/lang/String;)Landroidx/lifecycle/x0;", "", "c", "()Ljava/util/Set;", "a", "", "Ljava/util/Map;", "map", "lifecycle-viewmodel"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public class C0944b1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, AbstractC0991x0> map = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m4887a() {
        Iterator<AbstractC0991x0> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().m5010b();
        }
        this.map.clear();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final AbstractC0991x0 m4888b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.get(key);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m4889c() {
        return new HashSet(this.map.keySet());
    }

    /* JADX INFO: renamed from: d */
    public final void m4890d(@NotNull String key, @NotNull AbstractC0991x0 viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        AbstractC0991x0 abstractC0991x0Put = this.map.put(key, viewModel);
        if (abstractC0991x0Put != null) {
            abstractC0991x0Put.m5010b();
        }
    }
}
