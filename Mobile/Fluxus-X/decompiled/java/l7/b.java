package l7;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import g7.c;
import g7.k0;
import java.io.IOException;
import java.util.Map;
import t7.e;
import t7.m;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f21981d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21982a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, k0> f21983c;

    public b(Drawable.Callback callback, String str, c cVar, Map<String, k0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = str + '/';
        }
        this.f21983c = map;
        d(cVar);
        if (callback instanceof View) {
            this.f21982a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f21982a = null;
        }
    }

    public Bitmap a(String str) {
        k0 k0Var = this.f21983c.get(str);
        if (k0Var == null) {
            return null;
        }
        Bitmap bitmapB = k0Var.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.f21982a;
        if (context == null) {
            return null;
        }
        String strC = k0Var.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return c(str, m.m(bitmapDecodeByteArray, k0Var.f(), k0Var.d()));
                    }
                    e.c("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e10) {
                    e.d("Unable to decode image `" + str + "`.", e10);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                e.d("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.b + strC), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, m.m(bitmapDecodeStream, k0Var.f(), k0Var.d()));
                }
                e.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e12) {
                e.d("Unable to decode image `" + str + "`.", e12);
                return null;
            }
        } catch (IOException e13) {
            e.d("Unable to open asset.", e13);
            return null;
        }
    }

    public boolean b(Context context) {
        if (context == null) {
            return this.f21982a == null;
        }
        if (this.f21982a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f21982a;
    }

    public final Bitmap c(String str, Bitmap bitmap) {
        synchronized (f21981d) {
            this.f21983c.get(str).g(bitmap);
        }
        return bitmap;
    }

    public void d(c cVar) {
    }
}
