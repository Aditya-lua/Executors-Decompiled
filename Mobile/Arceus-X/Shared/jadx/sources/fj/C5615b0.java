package fj;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fj.b0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lfj/b0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "productKey", "", "a", "(Ljava/lang/String;)V", "", "c", "(Ljava/lang/String;)Z", "", "b", "()Ljava/util/Set;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "sharedPreferences", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5615b0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final SharedPreferences sharedPreferences;

    public C5615b0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.sharedPreferences = context.getSharedPreferences("google_store_prefs", 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m25436a(@NotNull String productKey) {
        Intrinsics.checkNotNullParameter(productKey, "productKey");
        Set<String> setM25437b = m25437b();
        setM25437b.add(productKey);
        this.sharedPreferences.edit().putStringSet("granted_product_keys", CollectionsKt.m31691Q0(setM25437b)).apply();
    }

    /* JADX INFO: renamed from: b */
    public final Set<String> m25437b() {
        Set<String> setP0;
        Set<String> stringSet = this.sharedPreferences.getStringSet("granted_product_keys", new LinkedHashSet());
        return (stringSet == null || (setP0 = CollectionsKt.m31690P0(stringSet)) == null) ? new LinkedHashSet() : setP0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25438c(@NotNull String productKey) {
        Intrinsics.checkNotNullParameter(productKey, "productKey");
        return m25437b().contains(productKey);
    }
}
