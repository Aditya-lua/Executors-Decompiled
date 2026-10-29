package k2;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Iterable<Intent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Intent> f22152a = new ArrayList<>();
    public final Context b;

    public interface a {
        Intent t();
    }

    public v(Context context) {
        this.b = context;
    }

    public static v d(Context context) {
        return new v(context);
    }

    public v a(Intent intent) {
        this.f22152a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v b(Activity activity) {
        Intent intentT = activity instanceof a ? ((a) activity).t() : null;
        if (intentT == null) {
            intentT = i.a(activity);
        }
        if (intentT != null) {
            ComponentName component = intentT.getComponent();
            if (component == null) {
                component = intentT.resolveActivity(this.b.getPackageManager());
            }
            c(component);
            a(intentT);
        }
        return this;
    }

    public v c(ComponentName componentName) {
        int size = this.f22152a.size();
        try {
            Intent intentB = i.b(this.b, componentName);
            while (intentB != null) {
                this.f22152a.add(size, intentB);
                intentB = i.b(this.b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (this.f22152a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f22152a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (l2.b.o(this.b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f22152a.iterator();
    }
}
