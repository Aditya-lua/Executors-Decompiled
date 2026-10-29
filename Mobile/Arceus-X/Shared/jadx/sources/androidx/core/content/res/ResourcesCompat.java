package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Preconditions;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class ResourcesCompat {
    private static final String TAG = "ResourcesCompat";

    @Nullable
    public static Drawable getDrawable(@NonNull Resources res, @DrawableRes int id2, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return res.getDrawable(id2, theme);
        }
        return res.getDrawable(id2);
    }

    @Nullable
    public static Drawable getDrawableForDensity(@NonNull Resources res, @DrawableRes int id2, int density, @Nullable Resources.Theme theme) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            return res.getDrawableForDensity(id2, density, theme);
        }
        if (i10 >= 15) {
            return res.getDrawableForDensity(id2, density);
        }
        return res.getDrawable(id2);
    }

    @ColorInt
    public static int getColor(@NonNull Resources res, @ColorRes int id2, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return res.getColor(id2, theme);
        }
        return res.getColor(id2);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Resources res, @ColorRes int id2, @Nullable Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return res.getColorStateList(id2, theme);
        }
        return res.getColorStateList(id2);
    }

    @Nullable
    public static Typeface getFont(@NonNull Context context, @FontRes int id2) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, id2, new TypedValue(), 0, null, null, false);
    }

    public static abstract class FontCallback {
        public abstract void onFontRetrievalFailed(int i10);

        public abstract void onFontRetrieved(@NonNull Typeface typeface);

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void callbackSuccessAsync(final Typeface typeface, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() { // from class: androidx.core.content.res.ResourcesCompat.FontCallback.1
                @Override // java.lang.Runnable
                public void run() {
                    FontCallback.this.onFontRetrieved(typeface);
                }
            });
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void callbackFailAsync(final int reason, @Nullable Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable() { // from class: androidx.core.content.res.ResourcesCompat.FontCallback.2
                @Override // java.lang.Runnable
                public void run() {
                    FontCallback.this.onFontRetrievalFailed(reason);
                }
            });
        }
    }

    public static void getFont(@NonNull Context context, @FontRes int id2, @NonNull FontCallback fontCallback, @Nullable Handler handler) throws Throwable {
        Preconditions.checkNotNull(fontCallback);
        if (context.isRestricted()) {
            fontCallback.callbackFailAsync(-4, handler);
        } else {
            loadFont(context, id2, new TypedValue(), 0, fontCallback, handler, false);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Typeface getFont(@NonNull Context context, @FontRes int id2, TypedValue value, int style, @Nullable FontCallback fontCallback) {
        if (context.isRestricted()) {
            return null;
        }
        return loadFont(context, id2, value, style, fontCallback, null, true);
    }

    private static Typeface loadFont(@NonNull Context context, int id2, TypedValue value, int style, @Nullable FontCallback fontCallback, @Nullable Handler handler, boolean isRequestFromLayoutInflator) throws Throwable {
        Resources resources = context.getResources();
        resources.getValue(id2, value, true);
        Typeface typeface = loadFont(context, resources, value, id2, style, fontCallback, handler, isRequestFromLayoutInflator);
        if (typeface == null && fontCallback == null) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(id2) + " could not be retrieved.");
        }
        return typeface;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [406=6, 408=6] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee  */
    private static Typeface loadFont(@NonNull Context context, Resources wrapper, TypedValue value, int id2, int style, @Nullable FontCallback fontCallback, @Nullable Handler handler, boolean isRequestFromLayoutInflator) throws Throwable {
        String file;
        Typeface typeface;
        CharSequence charSequence = value.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + wrapper.getResourceName(id2) + "\" (" + Integer.toHexString(id2) + ") is not a Font: " + value);
        }
        String file2 = charSequence.toString();
        if (!file2.startsWith("res/")) {
            if (fontCallback != null) {
                fontCallback.callbackFailAsync(-3, handler);
            }
            return null;
        }
        Typeface typeface2 = TypefaceCompat.findFromCache(wrapper, id2, style);
        if (typeface2 != null) {
            if (fontCallback != null) {
                fontCallback.callbackSuccessAsync(typeface2, handler);
            }
            return typeface2;
        }
        try {
            if (!file2.toLowerCase().endsWith(".xml")) {
                typeface = typeface2;
                file = file2;
                try {
                    Typeface typeface3 = TypefaceCompat.createFromResourcesFontFile(context, wrapper, id2, file, style);
                    if (fontCallback != null) {
                        try {
                            if (typeface3 != null) {
                                fontCallback.callbackSuccessAsync(typeface3, handler);
                            } else {
                                fontCallback.callbackFailAsync(-3, handler);
                            }
                        } catch (IOException e10) {
                            e = e10;
                            Log.e(TAG, "Failed to read xml resource " + file, e);
                            if (fontCallback != null) {
                                fontCallback.callbackFailAsync(-3, handler);
                            }
                            return null;
                        } catch (XmlPullParserException e11) {
                            e = e11;
                            Log.e(TAG, "Failed to parse xml resource " + file, e);
                            if (fontCallback != null) {
                                fontCallback.callbackFailAsync(-3, handler);
                            }
                            return null;
                        }
                    }
                    return typeface3;
                } catch (IOException e12) {
                    e = e12;
                    Log.e(TAG, "Failed to read xml resource " + file, e);
                    if (fontCallback != null) {
                        fontCallback.callbackFailAsync(-3, handler);
                    }
                    return null;
                } catch (XmlPullParserException e13) {
                    e = e13;
                    Log.e(TAG, "Failed to parse xml resource " + file, e);
                    if (fontCallback != null) {
                        fontCallback.callbackFailAsync(-3, handler);
                    }
                    return null;
                }
            }
            try {
                XmlResourceParser rp2 = wrapper.getXml(id2);
                FontResourcesParserCompat.FamilyResourceEntry familyEntry = FontResourcesParserCompat.parse(rp2, wrapper);
                if (familyEntry != null) {
                    typeface = typeface2;
                    file = file2;
                    try {
                        return TypefaceCompat.createFromResourcesFamilyXml(context, familyEntry, wrapper, id2, style, fontCallback, handler, isRequestFromLayoutInflator);
                    } catch (IOException e14) {
                        e = e14;
                        Log.e(TAG, "Failed to read xml resource " + file, e);
                        if (fontCallback != null) {
                            fontCallback.callbackFailAsync(-3, handler);
                        }
                        return null;
                    } catch (XmlPullParserException e15) {
                        e = e15;
                        Log.e(TAG, "Failed to parse xml resource " + file, e);
                        if (fontCallback != null) {
                            fontCallback.callbackFailAsync(-3, handler);
                        }
                        return null;
                    }
                }
                try {
                    Log.e(TAG, "Failed to find font-family tag");
                    if (fontCallback != null) {
                        fontCallback.callbackFailAsync(-3, handler);
                    }
                    return null;
                } catch (IOException e16) {
                    e = e16;
                    file = file2;
                    Log.e(TAG, "Failed to read xml resource " + file, e);
                    if (fontCallback != null) {
                        fontCallback.callbackFailAsync(-3, handler);
                    }
                    return null;
                } catch (XmlPullParserException e17) {
                    e = e17;
                    file = file2;
                    Log.e(TAG, "Failed to parse xml resource " + file, e);
                    if (fontCallback != null) {
                        fontCallback.callbackFailAsync(-3, handler);
                    }
                    return null;
                }
            } catch (IOException e18) {
                e = e18;
                file = file2;
            } catch (XmlPullParserException e19) {
                e = e19;
                file = file2;
            }
        } catch (IOException e20) {
            e = e20;
            file = file2;
        } catch (XmlPullParserException e21) {
            e = e21;
            file = file2;
        }
        if (fontCallback != null) {
            fontCallback.callbackFailAsync(-3, handler);
        }
        return null;
    }

    private ResourcesCompat() {
    }
}
