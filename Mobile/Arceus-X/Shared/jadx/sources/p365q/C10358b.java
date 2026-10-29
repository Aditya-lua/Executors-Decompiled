package p365q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: q.b */
/* JADX INFO: loaded from: classes.dex */
public class C10358b extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f37242a;

    /* JADX INFO: renamed from: q.b$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static void m39750a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C10358b(ActionBarContainer actionBarContainer) {
        this.f37242a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f37242a;
        if (actionBarContainer.f1305h) {
            Drawable drawable = actionBarContainer.f1304g;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1302e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f37242a;
        Drawable drawable3 = actionBarContainer2.f1303f;
        if (drawable3 == null || !actionBarContainer2.f1306i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        ActionBarContainer actionBarContainer = this.f37242a;
        if (actionBarContainer.f1305h) {
            if (actionBarContainer.f1304g != null) {
                a.m39750a(actionBarContainer.f1302e, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f1302e;
            if (drawable != null) {
                a.m39750a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
