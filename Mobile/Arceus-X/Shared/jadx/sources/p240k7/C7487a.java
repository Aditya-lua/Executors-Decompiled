package p240k7;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p121f7.C5438b;
import p266l7.C8004c;
import p266l7.C8010i;
import p431s7.C11189e;

/* JADX INFO: renamed from: k7.a */
/* JADX INFO: loaded from: classes3.dex */
public class C7487a {

    /* JADX INFO: renamed from: d */
    public final AssetManager f28838d;

    /* JADX INFO: renamed from: a */
    public final C8010i<String> f28835a = new C8010i<>();

    /* JADX INFO: renamed from: b */
    public final Map<C8010i<String>, Typeface> f28836b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<String, Typeface> f28837c = new HashMap();

    /* JADX INFO: renamed from: e */
    public String f28839e = ".ttf";

    public C7487a(Drawable.Callback callback, C5438b c5438b) {
        if (callback instanceof View) {
            this.f28838d = ((View) callback).getContext().getAssets();
        } else {
            C11189e.m42153c("LottieDrawable must be inside of a view for images to work.");
            this.f28838d = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Typeface m31116a(C8004c c8004c) {
        String strM33068a = c8004c.m33068a();
        Typeface typeface = this.f28837c.get(strM33068a);
        if (typeface != null) {
            return typeface;
        }
        c8004c.m33070c();
        c8004c.m33069b();
        if (c8004c.m33071d() != null) {
            return c8004c.m33071d();
        }
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(this.f28838d, "fonts/" + strM33068a + this.f28839e);
        this.f28837c.put(strM33068a, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    /* JADX INFO: renamed from: b */
    public Typeface m31117b(C8004c c8004c) {
        this.f28835a.m33090b(c8004c.m33068a(), c8004c.m33070c());
        Typeface typeface = this.f28836b.get(this.f28835a);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceM31120e = m31120e(m31116a(c8004c), c8004c.m33070c());
        this.f28836b.put(this.f28835a, typefaceM31120e);
        return typefaceM31120e;
    }

    /* JADX INFO: renamed from: c */
    public void m31118c(String str) {
        this.f28839e = str;
    }

    /* JADX INFO: renamed from: d */
    public void m31119d(C5438b c5438b) {
    }

    /* JADX INFO: renamed from: e */
    public final Typeface m31120e(Typeface typeface, String str) {
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
