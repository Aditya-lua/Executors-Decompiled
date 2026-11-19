package li;

import android.content.res.Resources;
import android.os.LocaleList;
import android.util.Log;
import com.github.luben.zstd.BuildConfig;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\r\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "eligibleCountries", BuildConfig.FLAVOR, "b", "(Ljava/util/Set;)Z", "a", "()Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    @NotNull
    public static final String a() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
        if (locales.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        String country = locales.get(0).getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return country;
    }

    public static final boolean b(@NotNull Set<String> eligibleCountries) {
        Intrinsics.checkNotNullParameter(eligibleCountries, "eligibleCountries");
        String strA = a();
        boolean zContains = eligibleCountries.contains(strA);
        Log.i("PgsUtils", "Device country: " + strA + ", eligible: " + zContains);
        return zContains;
    }
}
