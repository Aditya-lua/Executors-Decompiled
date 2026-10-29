package ji;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import sg.y;

/* JADX INFO: loaded from: classes2.dex */
public class l extends tk.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f21471c = "ji.l";

    public class a implements tk.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f21472a;

        public a(Context context) {
            this.f21472a = context.getApplicationContext();
        }

        @Override // tk.b.a
        public void a(tk.a aVar) {
            Log.v(l.f21471c, "RBHybridModulePush PushPermissionTrigger.execute() " + aVar.f());
            if (Build.VERSION.SDK_INT >= 33) {
                om.k kVarK = y.h().k();
                om.n nVar = om.n.POST_NOTIFICATIONS;
                if (!kVarK.e0(nVar)) {
                    y.h().k().Z(new String[]{nVar.toString()});
                    return;
                }
            }
            b(this.f21472a);
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
