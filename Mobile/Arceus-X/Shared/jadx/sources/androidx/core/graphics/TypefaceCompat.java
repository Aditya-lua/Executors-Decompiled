package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TypefaceCompat {
    private static final String TAG = "TypefaceCompat";
    private static final LruCache<String, Typeface> sTypefaceCache;
    private static final TypefaceCompatBaseImpl sTypefaceCompatImpl;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            sTypefaceCompatImpl = new TypefaceCompatApi28Impl();
        } else if (i10 >= 26) {
            sTypefaceCompatImpl = new TypefaceCompatApi26Impl();
        } else if (i10 >= 24 && TypefaceCompatApi24Impl.isUsable()) {
            sTypefaceCompatImpl = new TypefaceCompatApi24Impl();
        } else if (i10 >= 21) {
            sTypefaceCompatImpl = new TypefaceCompatApi21Impl();
        } else {
            sTypefaceCompatImpl = new TypefaceCompatBaseImpl();
        }
        sTypefaceCache = new LruCache<>(16);
    }

    private TypefaceCompat() {
    }

    @Nullable
    public static Typeface findFromCache(@NonNull Resources resources, int id2, int style) {
        return sTypefaceCache.get(createResourceUid(resources, id2, style));
    }

    private static String createResourceUid(Resources resources, int id2, int style) {
        return resources.getResourcePackageName(id2) + "-" + id2 + "-" + style;
    }

    @Nullable
    public static Typeface createFromResourcesFamilyXml(@NonNull Context context, @NonNull FontResourcesParserCompat.FamilyResourceEntry entry, @NonNull Resources resources, int id2, int style, @Nullable ResourcesCompat.FontCallback fontCallback, @Nullable Handler handler, boolean isRequestFromLayoutInflator) throws Throwable {
        Typeface typeface;
        if (!(entry instanceof FontResourcesParserCompat.ProviderResourceEntry)) {
            typeface = sTypefaceCompatImpl.createFromFontFamilyFilesResourceEntry(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) entry, resources, style);
            if (fontCallback != null) {
                if (typeface != null) {
                    fontCallback.callbackSuccessAsync(typeface, handler);
                } else {
                    fontCallback.callbackFailAsync(-3, handler);
                }
            }
        } else {
            FontResourcesParserCompat.ProviderResourceEntry providerEntry = (FontResourcesParserCompat.ProviderResourceEntry) entry;
            boolean isBlocking = !isRequestFromLayoutInflator ? fontCallback != null : providerEntry.getFetchStrategy() != 0;
            int timeout = isRequestFromLayoutInflator ? providerEntry.getTimeout() : -1;
            typeface = FontsContractCompat.getFontSync(context, providerEntry.getRequest(), fontCallback, handler, isBlocking, timeout, style);
        }
        if (typeface != null) {
            sTypefaceCache.put(createResourceUid(resources, id2, style), typeface);
        }
        return typeface;
    }

    @Nullable
    public static Typeface createFromResourcesFontFile(@NonNull Context context, @NonNull Resources resources, int id2, String path, int style) throws Throwable {
        Typeface typeface = sTypefaceCompatImpl.createFromResourcesFontFile(context, resources, id2, path, style);
        if (typeface != null) {
            String resourceUid = createResourceUid(resources, id2, style);
            sTypefaceCache.put(resourceUid, typeface);
        }
        return typeface;
    }

    @Nullable
    public static Typeface createFromFontInfo(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fonts, int style) {
        return sTypefaceCompatImpl.createFromFontInfo(context, cancellationSignal, fonts, style);
    }
}
