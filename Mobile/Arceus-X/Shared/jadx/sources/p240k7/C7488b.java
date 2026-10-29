package p240k7;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;
import p121f7.C5457k0;
import p121f7.InterfaceC5440c;
import p431s7.C11189e;
import p431s7.C11197m;

/* JADX INFO: renamed from: k7.b */
/* JADX INFO: loaded from: classes3.dex */
public class C7488b {

    /* JADX INFO: renamed from: d */
    public static final Object f28840d = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f28841a;

    /* JADX INFO: renamed from: b */
    public final String f28842b;

    /* JADX INFO: renamed from: c */
    public final Map<String, C5457k0> f28843c;

    public C7488b(Drawable.Callback callback, String str, InterfaceC5440c interfaceC5440c, Map<String, C5457k0> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f28842b = str;
        } else {
            this.f28842b = str + '/';
        }
        this.f28843c = map;
        m31124d(interfaceC5440c);
        if (callback instanceof View) {
            this.f28841a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f28841a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Bitmap m31121a(String str) {
        C5457k0 c5457k0 = this.f28843c.get(str);
        if (c5457k0 == null) {
            return null;
        }
        Bitmap bitmapM25061b = c5457k0.m25061b();
        if (bitmapM25061b != null) {
            return bitmapM25061b;
        }
        Context context = this.f28841a;
        if (context == null) {
            return null;
        }
        String strM25062c = c5457k0.m25062c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strM25062c.startsWith("data:") && strM25062c.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strM25062c.substring(strM25062c.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return m31123c(str, C11197m.m42224m(bitmapDecodeByteArray, c5457k0.m25065f(), c5457k0.m25063d()));
                    }
                    C11189e.m42153c("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e10) {
                    C11189e.m42154d("Unable to decode image `" + str + "`.", e10);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                C11189e.m42154d("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f28842b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f28842b + strM25062c), null, options);
                if (bitmapDecodeStream != null) {
                    return m31123c(str, C11197m.m42224m(bitmapDecodeStream, c5457k0.m25065f(), c5457k0.m25063d()));
                }
                C11189e.m42153c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e12) {
                C11189e.m42154d("Unable to decode image `" + str + "`.", e12);
                return null;
            }
        } catch (IOException e13) {
            C11189e.m42154d("Unable to open asset.", e13);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m31122b(Context context) {
        if (context == null) {
            return this.f28841a == null;
        }
        if (this.f28841a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f28841a;
    }

    /* JADX INFO: renamed from: c */
    public final Bitmap m31123c(String str, Bitmap bitmap) {
        synchronized (f28840d) {
            this.f28843c.get(str).m25066g(bitmap);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    public void m31124d(InterfaceC5440c interfaceC5440c) {
    }
}
