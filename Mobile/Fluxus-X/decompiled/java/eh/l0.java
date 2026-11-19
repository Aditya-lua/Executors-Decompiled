package eh;

import android.annotation.SuppressLint;
import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Leh/l0;", "Leh/s;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "c", "()Z", "enabled", BuildConfig.FLAVOR, "a", "(Z)V", BuildConfig.FLAVOR, "Leh/f0;", "consent", "b", "(Ljava/util/Map;)V", "Landroid/content/Context;", "appContext", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
public final class l0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context appContext;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13561a;

        static {
            int[] iArr = new int[f0.values().length];
            try {
                iArr[f0.ANALYTICS_STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f0.AD_STORAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f0.AD_USER_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f0.AD_PERSONALIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13561a = iArr;
        }
    }

    public l0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext != null ? applicationContext : context;
    }

    @Override // eh.s
    public void a(boolean enabled) {
        FirebaseAnalytics.getInstance(this.appContext).a(enabled);
    }

    @Override // eh.s
    public void b(@NotNull Map<f0, Boolean> consent) {
        FirebaseAnalytics.b bVar;
        Intrinsics.checkNotNullParameter(consent, "consent");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(this.appContext);
        Set<Map.Entry<f0, Boolean>> setEntrySet = consent.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p001kotlin.ranges.d.c(p001kotlin.collections.j0.f(p001kotlin.collections.q.u(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            f0 f0Var = (f0) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            int i10 = a.f13561a[f0Var.ordinal()];
            if (i10 == 1) {
                bVar = FirebaseAnalytics.b.ANALYTICS_STORAGE;
            } else if (i10 == 2) {
                bVar = FirebaseAnalytics.b.AD_STORAGE;
            } else if (i10 == 3) {
                bVar = FirebaseAnalytics.b.AD_USER_DATA;
            } else {
                if (i10 != 4) {
                    throw new zt.l();
                }
                bVar = FirebaseAnalytics.b.AD_PERSONALIZATION;
            }
            Pair pairA = zt.s.a(bVar, zBooleanValue ? FirebaseAnalytics.a.GRANTED : FirebaseAnalytics.a.DENIED);
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        firebaseAnalytics.b(linkedHashMap);
    }

    @Override // eh.s
    public boolean c() {
        List<hf.e> listK = hf.e.k(this.appContext);
        Intrinsics.checkNotNullExpressionValue(listK, "getApps(...)");
        return !listK.isEmpty();
    }
}
