package q;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f29690c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList<WeakReference<y0>> f29691d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f29692a;
    public final Resources.Theme b;

    public y0(@NonNull Context context) {
        super(context);
        if (!g1.c()) {
            this.f29692a = new a1(this, context.getResources());
            this.b = null;
            return;
        }
        g1 g1Var = new g1(this, context.getResources());
        this.f29692a = g1Var;
        Resources.Theme themeNewTheme = g1Var.newTheme();
        this.b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(@NonNull Context context) {
        return ((context instanceof y0) || (context.getResources() instanceof a1) || (context.getResources() instanceof g1) || !g1.c()) ? false : true;
    }

    public static Context b(@NonNull Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f29690c) {
            try {
                ArrayList<WeakReference<y0>> arrayList = f29691d;
                if (arrayList == null) {
                    f29691d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<y0> weakReference = f29691d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f29691d.remove(size);
                        }
                    }
                    for (int size2 = f29691d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<y0> weakReference2 = f29691d.get(size2);
                        y0 y0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (y0Var != null && y0Var.getBaseContext() == context) {
                            return y0Var;
                        }
                    }
                }
                y0 y0Var2 = new y0(context);
                f29691d.add(new WeakReference<>(y0Var2));
                return y0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f29692a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f29692a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
