package p316o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p181i.C6597i;

/* JADX INFO: renamed from: o.d */
/* JADX INFO: loaded from: classes.dex */
public class C9611d extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f34831f;

    /* JADX INFO: renamed from: a */
    public int f34832a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f34833b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f34834c;

    /* JADX INFO: renamed from: d */
    public Configuration f34835d;

    /* JADX INFO: renamed from: e */
    public Resources f34836e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C9611d() {
        super(null);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m37921e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f34831f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f34831f = configuration2;
        }
        return configuration.equals(f34831f);
    }

    /* JADX INFO: renamed from: a */
    public void m37922a(Configuration configuration) {
        if (this.f34836e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f34835d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f34835d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final Resources m37923b() {
        if (this.f34836e == null) {
            Configuration configuration = this.f34835d;
            if (configuration == null || m37921e(configuration)) {
                this.f34836e = super.getResources();
            } else {
                this.f34836e = createConfigurationContext(this.f34835d).getResources();
            }
        }
        return this.f34836e;
    }

    /* JADX INFO: renamed from: c */
    public int m37924c() {
        return this.f34832a;
    }

    /* JADX INFO: renamed from: d */
    public final void m37925d() {
        boolean z10 = this.f34833b == null;
        if (z10) {
            this.f34833b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f34833b.setTo(theme);
            }
        }
        m37926f(this.f34833b, this.f34832a, z10);
    }

    /* JADX INFO: renamed from: f */
    public void m37926f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m37923b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f34834c == null) {
            this.f34834c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f34834c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f34833b;
        if (theme != null) {
            return theme;
        }
        if (this.f34832a == 0) {
            this.f34832a = C6597i.f25201c;
        }
        m37925d();
        return this.f34833b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f34832a != i10) {
            this.f34832a = i10;
            m37925d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C9611d(Context context, int i10) {
        super(context);
        this.f34832a = i10;
    }

    public C9611d(Context context, Resources.Theme theme) {
        super(context);
        this.f34833b = theme;
    }
}
