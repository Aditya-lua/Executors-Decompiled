package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f27491f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27492a;
    public Resources.Theme b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f27493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f27494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f27495e;

    public d() {
        super(null);
    }

    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f27491f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f27491f = configuration2;
        }
        return configuration.equals(f27491f);
    }

    public void a(Configuration configuration) {
        if (this.f27495e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f27494d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f27494d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f27495e == null) {
            Configuration configuration = this.f27494d;
            if (configuration == null || e(configuration)) {
                this.f27495e = super.getResources();
            } else {
                this.f27495e = createConfigurationContext(this.f27494d).getResources();
            }
        }
        return this.f27495e;
    }

    public int c() {
        return this.f27492a;
    }

    public final void d() {
        boolean z10 = this.b == null;
        if (z10) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        f(this.b, this.f27492a, z10);
    }

    public void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f27493c == null) {
            this.f27493c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f27493c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.f27492a == 0) {
            this.f27492a = i.i.f20133c;
        }
        d();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f27492a != i10) {
            this.f27492a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f27492a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}
