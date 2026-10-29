package k7;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import l7.c;
import l7.i;
import s7.e;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AssetManager f22262d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<String> f22260a = new i<>();
    public final Map<i<String>, Typeface> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Typeface> f22261c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22263e = ".ttf";

    public a(Drawable.Callback callback, f7.b bVar) {
        if (callback instanceof View) {
            this.f22262d = ((View) callback).getContext().getAssets();
        } else {
            e.c("LottieDrawable must be inside of a view for images to work.");
            this.f22262d = null;
        }
    }

    public final Typeface a(c cVar) {
        String strA = cVar.a();
        Typeface typeface = this.f22261c.get(strA);
        if (typeface != null) {
            return typeface;
        }
        cVar.c();
        cVar.b();
        if (cVar.d() != null) {
            return cVar.d();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f22262d, "fonts/" + strA + this.f22263e);
        this.f22261c.put(strA, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public Typeface b(c cVar) {
        this.f22260a.b(cVar.a(), cVar.c());
        Typeface typeface = this.b.get(this.f22260a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceE = e(a(cVar), cVar.c());
        this.b.put(this.f22260a, typefaceE);
        return typefaceE;
    }

    public void c(String str) {
        this.f22263e = str;
    }

    public void d(f7.b bVar) {
    }

    public final Typeface e(Typeface typeface, String str) {
        int i10;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i10 = 3;
        } else if (zContains) {
            i10 = 2;
        } else {
            i10 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
