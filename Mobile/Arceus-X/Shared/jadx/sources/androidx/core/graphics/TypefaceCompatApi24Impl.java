package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {
    private static final String ADD_FONT_WEIGHT_STYLE_METHOD = "addFontWeightStyle";
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String FONT_FAMILY_CLASS = "android.graphics.FontFamily";
    private static final String TAG = "TypefaceCompatApi24Impl";
    private static final Method sAddFontWeightStyle;
    private static final Method sCreateFromFamiliesWithDefault;
    private static final Class sFontFamily;
    private static final Constructor sFontFamilyCtor;

    TypefaceCompatApi24Impl() {
    }

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method addFontMethod;
        Method createFromFamiliesWithDefaultMethod;
        try {
            cls = Class.forName(FONT_FAMILY_CLASS);
            try {
                constructor = cls.getConstructor(new Class[0]);
                try {
                    Class<?> cls2 = Integer.TYPE;
                    addFontMethod = cls.getMethod(ADD_FONT_WEIGHT_STYLE_METHOD, ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
                    try {
                        Object familyArray = Array.newInstance(cls, 1);
                        createFromFamiliesWithDefaultMethod = Typeface.class.getMethod(CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD, familyArray.getClass());
                    } catch (ClassNotFoundException e10) {
                        e = e10;
                        Log.e(TAG, e.getClass().getName(), e);
                        cls = null;
                        constructor = null;
                        addFontMethod = null;
                        createFromFamiliesWithDefaultMethod = null;
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        Log.e(TAG, e.getClass().getName(), e);
                        cls = null;
                        constructor = null;
                        addFontMethod = null;
                        createFromFamiliesWithDefaultMethod = null;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException e12) {
                    e = e12;
                }
            } catch (ClassNotFoundException e13) {
                e = e13;
                Log.e(TAG, e.getClass().getName(), e);
                cls = null;
                constructor = null;
                addFontMethod = null;
                createFromFamiliesWithDefaultMethod = null;
                sFontFamilyCtor = constructor;
                sFontFamily = cls;
                sAddFontWeightStyle = addFontMethod;
                sCreateFromFamiliesWithDefault = createFromFamiliesWithDefaultMethod;
            } catch (NoSuchMethodException e14) {
                e = e14;
                Log.e(TAG, e.getClass().getName(), e);
                cls = null;
                constructor = null;
                addFontMethod = null;
                createFromFamiliesWithDefaultMethod = null;
                sFontFamilyCtor = constructor;
                sFontFamily = cls;
                sAddFontWeightStyle = addFontMethod;
                sCreateFromFamiliesWithDefault = createFromFamiliesWithDefaultMethod;
            }
        } catch (ClassNotFoundException | NoSuchMethodException e15) {
            e = e15;
        }
        sFontFamilyCtor = constructor;
        sFontFamily = cls;
        sAddFontWeightStyle = addFontMethod;
        sCreateFromFamiliesWithDefault = createFromFamiliesWithDefaultMethod;
    }

    public static boolean isUsable() {
        Method method = sAddFontWeightStyle;
        if (method == null) {
            Log.w(TAG, "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object newFamily() {
        try {
            return sFontFamilyCtor.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static boolean addFontWeightStyle(Object family, ByteBuffer buffer, int ttcIndex, int weight, boolean style) {
        try {
            Boolean result = (Boolean) sAddFontWeightStyle.invoke(family, buffer, Integer.valueOf(ttcIndex), null, Integer.valueOf(weight), Boolean.valueOf(style));
            return result.booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface createFromFamiliesWithDefault(Object family) {
        try {
            Object familyArray = Array.newInstance((Class<?>) sFontFamily, 1);
            Array.set(familyArray, 0, family);
            return (Typeface) sCreateFromFamiliesWithDefault.invoke(null, familyArray);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fonts, int style) {
        Object family = newFamily();
        SimpleArrayMap<Uri, ByteBuffer> bufferCache = new SimpleArrayMap<>();
        for (FontsContractCompat.FontInfo font : fonts) {
            Uri uri = font.getUri();
            ByteBuffer buffer = bufferCache.get(uri);
            if (buffer == null) {
                buffer = TypefaceCompatUtil.mmap(context, cancellationSignal, uri);
                bufferCache.put(uri, buffer);
            }
            if (!addFontWeightStyle(family, buffer, font.getTtcIndex(), font.getWeight(), font.isItalic())) {
                return null;
            }
        }
        Typeface typeface = createFromFamiliesWithDefault(family);
        return Typeface.create(typeface, style);
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry entry, Resources resources, int style) {
        Object family = newFamily();
        for (FontResourcesParserCompat.FontFileResourceEntry e10 : entry.getEntries()) {
            ByteBuffer buffer = TypefaceCompatUtil.copyToDirectBuffer(context, resources, e10.getResourceId());
            if (buffer == null || !addFontWeightStyle(family, buffer, e10.getTtcIndex(), e10.getWeight(), e10.isItalic())) {
                return null;
            }
        }
        return createFromFamiliesWithDefault(family);
    }
}
