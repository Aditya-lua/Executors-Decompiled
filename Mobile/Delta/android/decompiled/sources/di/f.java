package di;

import android.content.Context;
import android.os.LocaleList;
import android.util.Log;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/content/Context;", "context", "", "", "eligibleCountries", "", "a", "(Landroid/content/Context;Ljava/util/Set;)Z", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {
    public static final boolean a(@NotNull Context context, @NotNull Set<String> eligibleCountries) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eligibleCountries, "eligibleCountries");
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
        String country = locales.isEmpty() ? "" : locales.get(0).getCountry();
        boolean zContains = eligibleCountries.contains(country);
        Log.i("PgsUtils", "Device country: " + country + ", eligible: " + zContains);
        return zContains;
    }
}
