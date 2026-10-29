package p316o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p181i.C6589a;
import p181i.C6590b;
import p181i.C6592d;
import p181i.C6598j;

/* JADX INFO: renamed from: o.a */
/* JADX INFO: loaded from: classes.dex */
public class C9608a {

    /* JADX INFO: renamed from: a */
    public Context f34828a;

    public C9608a(Context context) {
        this.f34828a = context;
    }

    /* JADX INFO: renamed from: b */
    public static C9608a m37910b(Context context) {
        return new C9608a(context);
    }

    /* JADX INFO: renamed from: a */
    public boolean m37911a() {
        return this.f34828a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* JADX INFO: renamed from: c */
    public int m37912c() {
        return this.f34828a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* JADX INFO: renamed from: d */
    public int m37913d() {
        Configuration configuration = this.f34828a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    /* JADX INFO: renamed from: e */
    public int m37914e() {
        return this.f34828a.getResources().getDimensionPixelSize(C6592d.f25058b);
    }

    /* JADX INFO: renamed from: f */
    public int m37915f() {
        TypedArray typedArrayObtainStyledAttributes = this.f34828a.obtainStyledAttributes(null, C6598j.f25326a, C6589a.f25024c, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(C6598j.f25371j, 0);
        Resources resources = this.f34828a.getResources();
        if (!m37916g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C6592d.f25057a));
        }
        typedArrayObtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* JADX INFO: renamed from: g */
    public boolean m37916g() {
        return this.f34828a.getResources().getBoolean(C6590b.f25048a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m37917h() {
        return true;
    }
}
