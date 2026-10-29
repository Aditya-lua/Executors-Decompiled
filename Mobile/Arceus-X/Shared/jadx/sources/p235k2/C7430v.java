package p235k2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import p261l2.C7975b;

/* JADX INFO: renamed from: k2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7430v implements Iterable<Intent> {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Intent> f28692a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final Context f28693b;

    /* JADX INFO: renamed from: k2.v$a */
    public interface a {
        /* JADX INFO: renamed from: t */
        Intent mo29452t();
    }

    public C7430v(Context context) {
        this.f28693b = context;
    }

    /* JADX INFO: renamed from: d */
    public static C7430v m30952d(Context context) {
        return new C7430v(context);
    }

    /* JADX INFO: renamed from: a */
    public C7430v m30953a(Intent intent) {
        this.f28692a.add(intent);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public C7430v m30954b(Activity activity) {
        Intent intentMo29452t = activity instanceof a ? ((a) activity).mo29452t() : null;
        if (intentMo29452t == null) {
            intentMo29452t = C7417i.m30731a(activity);
        }
        if (intentMo29452t != null) {
            ComponentName component = intentMo29452t.getComponent();
            if (component == null) {
                component = intentMo29452t.resolveActivity(this.f28693b.getPackageManager());
            }
            m30955c(component);
            m30953a(intentMo29452t);
        }
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C7430v m30955c(ComponentName componentName) {
        int size = this.f28692a.size();
        try {
            Intent intentM30732b = C7417i.m30732b(this.f28693b, componentName);
            while (intentM30732b != null) {
                this.f28692a.add(size, intentM30732b);
                intentM30732b = C7417i.m30732b(this.f28693b, intentM30732b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m30956e() {
        m30957f(null);
    }

    /* JADX INFO: renamed from: f */
    public void m30957f(Bundle bundle) {
        if (this.f28692a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f28692a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C7975b.m33017o(this.f28693b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f28693b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f28692a.iterator();
    }
}
