package hi;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import rg.y;

/* JADX INFO: loaded from: classes2.dex */
public class l extends rk.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f19479c = "hi.l";

    public class a implements rk.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f19480a;

        public a(Context context) {
            this.f19480a = context.getApplicationContext();
        }

        @Override // rk.b.a
        public void a(rk.a aVar) {
            Log.v(l.f19479c, "RBHybridModulePush PushPermissionTrigger.execute() " + aVar.f());
            if (Build.VERSION.SDK_INT >= 33) {
                mm.k kVarK = y.h().k();
                mm.n nVar = mm.n.POST_NOTIFICATIONS;
                if (!kVarK.e0(nVar)) {
                    y.h().k().Z(new String[]{nVar.toString()});
                    return;
                }
            }
            b(this.f19480a);
        }

        public void b(Context context) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            if (Build.VERSION.SDK_INT >= 28) {
                intent.addFlags(268435456);
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            context.startActivity(intent);
        }
    }

    public l(Context context) {
        super("Push");
        d("pushPermissionTrigger", new a(context));
    }
}
