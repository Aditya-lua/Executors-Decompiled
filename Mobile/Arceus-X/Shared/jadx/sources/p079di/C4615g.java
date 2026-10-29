package p079di;

import android.content.Context;
import android.os.LocaleList;
import android.util.Log;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: di.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Landroid/content/Context;", "context", "", "", "eligibleCountries", "", "b", "(Landroid/content/Context;Ljava/util/Set;)Z", "a", "(Landroid/content/Context;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4615g {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m22783a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
        if (locales.isEmpty()) {
            return "";
        }
        String country = locales.get(0).getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return country;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m22784b(@NotNull Context context, @NotNull Set<String> eligibleCountries) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eligibleCountries, "eligibleCountries");
        String strM22783a = m22783a(context);
        boolean zContains = eligibleCountries.contains(strM22783a);
        Log.i("PgsUtils", "Device country: " + strM22783a + ", eligible: " + zContains);
        return zContains;
    }
}
