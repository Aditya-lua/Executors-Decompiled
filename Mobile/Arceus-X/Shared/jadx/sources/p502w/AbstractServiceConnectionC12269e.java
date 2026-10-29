package p502w;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import p035c.InterfaceC1495b;

/* JADX INFO: renamed from: w.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceConnectionC12269e implements ServiceConnection {
    private Context mApplicationContext;

    /* JADX INFO: renamed from: w.e$a */
    public class a extends C12267c {
        public a(InterfaceC1495b interfaceC1495b, ComponentName componentName, Context context) {
            super(interfaceC1495b, componentName, context);
        }
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C12267c c12267c);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        onCustomTabsServiceConnected(componentName, new a(InterfaceC1495b.a.m7643r2(iBinder), componentName, this.mApplicationContext));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
