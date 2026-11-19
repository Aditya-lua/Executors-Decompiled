package ri;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import bh.y;

/* JADX INFO: loaded from: classes2.dex */
public class l extends al.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30730c = "ri.l";

    public class a implements al.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f30731a;

        public a(Context context) {
            this.f30731a = context.getApplicationContext();
        }

        @Override // al.b.a
        public void a(al.a aVar) {
            Log.v(l.f30730c, "RBHybridModulePush PushPermissionTrigger.execute() " + aVar.f());
            if (Build.VERSION.SDK_INT >= 33) {
                bn.k kVarK = y.h().k();
                bn.o oVar = bn.o.POST_NOTIFICATIONS;
                if (!kVarK.T(oVar)) {
                    y.h().k().O(new String[]{oVar.toString()});
                    return;
                }
            }
            b(this.f30731a);
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
