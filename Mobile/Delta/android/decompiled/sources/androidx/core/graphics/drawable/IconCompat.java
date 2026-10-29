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
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f1784k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1785a;
    public Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f1786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f1787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f1790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f1791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f1793j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
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

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
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

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
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

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
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

        public static Icon e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f1785a) {
                case -1:
                    return (Icon) iconCompat.b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.h(), iconCompat.f1788e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.f1788e, iconCompat.f1789f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                    break;
                case 5:
                    iconCreateWithBitmap = b.a((Bitmap) iconCompat.b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.j());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.j());
                        }
                        InputStream inputStreamK = iconCompat.k(context);
                        if (inputStreamK == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.j());
                        }
                        iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamK));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f1790g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f1791h;
            if (mode != IconCompat.f1784k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    public static class b {
        public static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1785a = -1;
        this.f1786c = null;
        this.f1787d = null;
        this.f1788e = 0;
        this.f1789f = 0;
        this.f1790g = null;
        this.f1791h = f1784k;
        this.f1792i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
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
        paint.setColor(-16777216);
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

    public static IconCompat b(Bitmap bitmap) {
        x2.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Bitmap bitmap) {
        x2.b.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Context context, int i10) {
        x2.b.c(context);
        return e(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat e(Resources resources, String str, int i10) {
        x2.b.c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1788e = i10;
        if (resources != null) {
            try {
                iconCompat.b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.b = str;
        }
        iconCompat.f1793j = str;
        return iconCompat;
    }

    public static String q(int i10) {
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

    public Bitmap f() {
        int i10 = this.f1785a;
        if (i10 == -1) {
            Object obj = this.b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.b;
        }
        if (i10 == 5) {
            return a((Bitmap) this.b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int g() {
        int i10 = this.f1785a;
        if (i10 == -1) {
            return a.a(this.b);
        }
        if (i10 == 2) {
            return this.f1788e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String h() {
        int i10 = this.f1785a;
        if (i10 == -1) {
            return a.b(this.b);
        }
        if (i10 == 2) {
            String str = this.f1793j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.b).split(":", -1)[0] : this.f1793j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int i() {
        int i10 = this.f1785a;
        return i10 == -1 ? a.c(this.b) : i10;
    }

    public Uri j() {
        int i10 = this.f1785a;
        if (i10 == -1) {
            return a.d(this.b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream k(Context context) {
        Uri uriJ = j();
        String scheme = uriJ.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriJ);
            } catch (Exception e10) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriJ, e10);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.b));
        } catch (FileNotFoundException e11) {
            Log.w("IconCompat", "Unable to load image from path: " + uriJ, e11);
            return null;
        }
    }

    public void l() {
        this.f1791h = PorterDuff.Mode.valueOf(this.f1792i);
        switch (this.f1785a) {
            case -1:
                Parcelable parcelable = this.f1787d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f1787d;
                if (parcelable2 != null) {
                    this.b = parcelable2;
                    return;
                }
                byte[] bArr = this.f1786c;
                this.b = bArr;
                this.f1785a = 3;
                this.f1788e = 0;
                this.f1789f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1786c, Charset.forName("UTF-16"));
                this.b = str;
                if (this.f1785a == 2 && this.f1793j == null) {
                    this.f1793j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.b = this.f1786c;
                return;
        }
    }

    public void m(boolean z10) {
        this.f1792i = this.f1791h.name();
        switch (this.f1785a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f1787d = (Parcelable) this.b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f1787d = (Parcelable) this.b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f1786c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f1786c = ((String) this.b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1786c = (byte[]) this.b;
                return;
            case 4:
            case 6:
                this.f1786c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle n() {
        Bundle bundle = new Bundle();
        switch (this.f1785a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.b);
                break;
        }
        bundle.putInt(Payload.TYPE, this.f1785a);
        bundle.putInt("int1", this.f1788e);
        bundle.putInt("int2", this.f1789f);
        bundle.putString("string1", this.f1793j);
        ColorStateList colorStateList = this.f1790g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f1791h;
        if (mode != f1784k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon o() {
        return p(null);
    }

    public Icon p(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f1785a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(q(this.f1785a));
        switch (this.f1785a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1793j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(g())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1788e);
                if (this.f1789f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1789f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.b);
                break;
        }
        if (this.f1790g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1790g);
        }
        if (this.f1791h != f1784k) {
            sb2.append(" mode=");
            sb2.append(this.f1791h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i10) {
        this.f1786c = null;
        this.f1787d = null;
        this.f1788e = 0;
        this.f1789f = 0;
        this.f1790g = null;
        this.f1791h = f1784k;
        this.f1792i = null;
        this.f1785a = i10;
    }
}
