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
    public static Configuration f26643f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26644a;
    public Resources.Theme b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f26645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f26646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f26647e;

    public d() {
        super(null);
    }

    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f26643f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f26643f = configuration2;
        }
        return configuration.equals(f26643f);
    }

    public void a(Configuration configuration) {
        if (this.f26647e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f26646d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f26646d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f26647e == null) {
            Configuration configuration = this.f26646d;
            if (configuration == null || e(configuration)) {
                this.f26647e = super.getResources();
            } else {
                this.f26647e = createConfigurationContext(this.f26646d).getResources();
            }
        }
        return this.f26647e;
    }

    public int c() {
        return this.f26644a;
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
        f(this.b, this.f26644a, z10);
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
        if (this.f26645c == null) {
            this.f26645c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f26645c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.f26644a == 0) {
            this.f26644a = i.i.f18860c;
        }
        d();
        return this.b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f26644a != i10) {
            this.f26644a = i10;
            d();
        }
    }

    public d(Context context, int i10) {
        super(context);
        this.f26644a = i10;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}
