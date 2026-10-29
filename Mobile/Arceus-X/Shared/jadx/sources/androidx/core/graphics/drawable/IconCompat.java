package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p533x2.C12632b;

/* JADX WARN: Classes with same name are omitted, all sources:
  classes.dex
  classes4.dex
 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f2313k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f2314a;

    /* JADX INFO: renamed from: b */
    public Object f2315b;

    /* JADX INFO: renamed from: c */
    public byte[] f2316c;

    /* JADX INFO: renamed from: d */
    public Parcelable f2317d;

    /* JADX INFO: renamed from: e */
    public int f2318e;

    /* JADX INFO: renamed from: f */
    public int f2319f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f2320g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f2321h;

    /* JADX INFO: renamed from: i */
    public String f2322i;

    /* JADX INFO: renamed from: j */
    public String f2323j;

    /* JADX INFO: loaded from: classes4.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface IconType {
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$a */
    public static class C0548a {
        /* JADX INFO: renamed from: a */
        public static int m2700a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0550c.m2706a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        /* JADX INFO: renamed from: b */
        public static String m2701b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0550c.m2707b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public static int m2702c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0550c.m2708c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        /* JADX INFO: renamed from: d */
        public static Uri m2703d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0550c.m2709d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        /* JADX INFO: renamed from: e */
        public static Icon m2704e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f2314a) {
                case -1:
                    return (Icon) iconCompat.f2315b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2315b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.m2691h(), iconCompat.f2318e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f2315b, iconCompat.f2318e, iconCompat.f2319f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f2315b);
                    break;
                case 5:
                    iconCreateWithBitmap = C0549b.m2705a((Bitmap) iconCompat.f2315b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = C0551d.m2710a(iconCompat.m2693j());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m2693j());
                        }
                        InputStream inputStreamM2694k = iconCompat.m2694k(context);
                        if (inputStreamM2694k == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m2693j());
                        }
                        iconCreateWithBitmap = C0549b.m2705a(BitmapFactory.decodeStream(inputStreamM2694k));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f2320g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f2321h;
            if (mode != IconCompat.f2313k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$b */
    public static class C0549b {
        /* JADX INFO: renamed from: a */
        public static Icon m2705a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$c */
    public static class C0550c {
        /* JADX INFO: renamed from: a */
        public static int m2706a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* JADX INFO: renamed from: b */
        public static String m2707b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* JADX INFO: renamed from: c */
        public static int m2708c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* JADX INFO: renamed from: d */
        public static Uri m2709d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$d */
    public static class C0551d {
        /* JADX INFO: renamed from: a */
        public static Icon m2710a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public IconCompat() {
        this.f2314a = -1;
        this.f2316c = null;
        this.f2317d = null;
        this.f2318e = 0;
        this.f2319f = 0;
        this.f2320g = null;
        this.f2321h = f2313k;
        this.f2322i = null;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m2683a(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m2684b(Bitmap bitmap) {
        C12632b.m47062c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f2315b = bitmap;
        return iconCompat;
    }

    /* JADX INFO: renamed from: c */
    public static IconCompat m2685c(Bitmap bitmap) {
        C12632b.m47062c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2315b = bitmap;
        return iconCompat;
    }

    /* JADX INFO: renamed from: d */
    public static IconCompat m2686d(Context context, int i10) {
        C12632b.m47062c(context);
        return m2687e(context.getResources(), context.getPackageName(), i10);
    }

    /* JADX INFO: renamed from: e */
    public static IconCompat m2687e(Resources resources, String str, int i10) {
        C12632b.m47062c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2318e = i10;
        if (resources != null) {
            try {
                iconCompat.f2315b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f2315b = str;
        }
        iconCompat.f2323j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: q */
    public static String m2688q(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: f */
    public Bitmap m2689f() {
        int i10 = this.f2314a;
        if (i10 == -1) {
            Object obj = this.f2315b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f2315b;
        }
        if (i10 == 5) {
            return m2683a((Bitmap) this.f2315b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* JADX INFO: renamed from: g */
    public int m2690g() {
        int i10 = this.f2314a;
        if (i10 == -1) {
            return C0548a.m2700a(this.f2315b);
        }
        if (i10 == 2) {
            return this.f2318e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX INFO: renamed from: h */
    public String m2691h() {
        int i10 = this.f2314a;
        if (i10 == -1) {
            return C0548a.m2701b(this.f2315b);
        }
        if (i10 == 2) {
            String str = this.f2323j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2315b).split(":", -1)[0] : this.f2323j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* JADX INFO: renamed from: i */
    public int m2692i() {
        int i10 = this.f2314a;
        return i10 == -1 ? C0548a.m2702c(this.f2315b) : i10;
    }

    /* JADX INFO: renamed from: j */
    public Uri m2693j() {
        int i10 = this.f2314a;
        if (i10 == -1) {
            return C0548a.m2703d(this.f2315b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f2315b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX INFO: renamed from: k */
    public InputStream m2694k(Context context) {
        Uri uriM2693j = m2693j();
        String scheme = uriM2693j.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM2693j);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriM2693j, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f2315b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriM2693j, e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m2695l() {
        this.f2321h = PorterDuff.Mode.valueOf(this.f2322i);
        switch (this.f2314a) {
            case -1:
                Parcelable parcelable = this.f2317d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f2315b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f2317d;
                if (parcelable2 != null) {
                    this.f2315b = parcelable2;
                    return;
                }
                byte[] bArr = this.f2316c;
                this.f2315b = bArr;
                this.f2314a = 3;
                this.f2318e = 0;
                this.f2319f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2316c, Charset.forName("UTF-16"));
                this.f2315b = str;
                if (this.f2314a == 2 && this.f2323j == null) {
                    this.f2323j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2315b = this.f2316c;
                return;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m2696m(boolean z10) {
        this.f2322i = this.f2321h.name();
        switch (this.f2314a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f2317d = (Parcelable) this.f2315b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f2317d = (Parcelable) this.f2315b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f2315b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f2316c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f2316c = ((String) this.f2315b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2316c = (byte[]) this.f2315b;
                return;
            case 4:
            case 6:
                this.f2316c = this.f2315b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* JADX INFO: renamed from: n */
    public Bundle m2697n() {
        Bundle bundle = new Bundle();
        switch (this.f2314a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f2315b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f2315b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f2315b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f2315b);
                break;
        }
        bundle.putInt(Payload.TYPE, this.f2314a);
        bundle.putInt("int1", this.f2318e);
        bundle.putInt("int2", this.f2319f);
        bundle.putString("string1", this.f2323j);
        ColorStateList colorStateList = this.f2320g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f2321h;
        if (mode != f2313k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    /* JADX INFO: renamed from: o */
    public Icon m2698o() {
        return m2699p(null);
    }

    /* JADX INFO: renamed from: p */
    public Icon m2699p(Context context) {
        return C0548a.m2704e(this, context);
    }

    public String toString() {
        if (this.f2314a == -1) {
            return String.valueOf(this.f2315b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m2688q(this.f2314a));
        switch (this.f2314a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f2315b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f2315b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f2323j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m2690g())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f2318e);
                if (this.f2319f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f2319f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f2315b);
                break;
        }
        if (this.f2320g != null) {
            sb2.append(" tint=");
            sb2.append(this.f2320g);
        }
        if (this.f2321h != f2313k) {
            sb2.append(" mode=");
            sb2.append(this.f2321h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f2316c = null;
        this.f2317d = null;
        this.f2318e = 0;
        this.f2319f = 0;
        this.f2320g = null;
        this.f2321h = f2313k;
        this.f2322i = null;
        this.f2314a = i10;
    }
}
