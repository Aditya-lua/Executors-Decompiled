package w;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements ServiceConnection {
    private Context mApplicationContext;

    public class a extends c {
        public a(c.b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, c cVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new a(c.b.a.r2(iBinder), componentName, this.mApplicationContext));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
