package p365q;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import backtraceio.library.services.BacktraceMetrics;
import p368q2.InterfaceC10426b;

/* JADX INFO: renamed from: q.t */
/* JADX INFO: loaded from: classes.dex */
public class C10401t {

    /* JADX INFO: renamed from: c */
    public static final int[] f37464c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final ProgressBar f37465a;

    /* JADX INFO: renamed from: b */
    public Bitmap f37466b;

    /* JADX INFO: renamed from: q.t$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m40030a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i10) {
            layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
            layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
            layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
            layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
            layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
            layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
            layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
            layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
            layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
        }
    }

    public C10401t(ProgressBar progressBar) {
        this.f37465a = progressBar;
    }

    /* JADX INFO: renamed from: a */
    public final Shape m40025a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m40026b() {
        return this.f37466b;
    }

    /* JADX INFO: renamed from: c */
    public void mo40027c(AttributeSet attributeSet, int i10) {
        C10357a1 c10357a1M39728v = C10357a1.m39728v(this.f37465a.getContext(), attributeSet, f37464c, i10, 0);
        Drawable drawableM39736h = c10357a1M39728v.m39736h(0);
        if (drawableM39736h != null) {
            this.f37465a.setIndeterminateDrawable(m40029e(drawableM39736h));
        }
        Drawable drawableM39736h2 = c10357a1M39728v.m39736h(1);
        if (drawableM39736h2 != null) {
            this.f37465a.setProgressDrawable(m40028d(drawableM39736h2, false));
        }
        c10357a1M39728v.m39749x();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: android.graphics.drawable.Drawable */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public Drawable m40028d(Drawable drawable, boolean z10) {
        if (drawable instanceof InterfaceC10426b) {
            InterfaceC10426b interfaceC10426b = (InterfaceC10426b) drawable;
            Drawable drawableM40133a = interfaceC10426b.m40133a();
            if (drawableM40133a != null) {
                interfaceC10426b.m40134b(m40028d(drawableM40133a, z10));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id2 = layerDrawable.getId(i10);
                    drawableArr[i10] = m40028d(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    a.m40030a(layerDrawable, layerDrawable2, i11);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f37466b == null) {
                    this.f37466b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m40025a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m40029e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i10 = 0; i10 < numberOfFrames; i10++) {
            Drawable drawableM40028d = m40028d(animationDrawable.getFrame(i10), true);
            drawableM40028d.setLevel(BacktraceMetrics.defaultTimeBetweenRetriesMs);
            animationDrawable2.addFrame(drawableM40028d, animationDrawable.getDuration(i10));
        }
        animationDrawable2.setLevel(BacktraceMetrics.defaultTimeBetweenRetriesMs);
        return animationDrawable2;
    }
}
