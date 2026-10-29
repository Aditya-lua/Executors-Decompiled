package p221ji;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import om.AbstractC9810k;
import om.EnumC9813n;
import sg.C11370y;
import tk.AbstractC11666a;
import tk.C11667b;

/* JADX INFO: renamed from: ji.l */
/* JADX INFO: loaded from: classes2.dex */
public class C7169l extends C11667b {

    /* JADX INFO: renamed from: c */
    public static final String f27834c = "ji.l";

    /* JADX INFO: renamed from: ji.l$a */
    public class a implements C11667b.a {

        /* JADX INFO: renamed from: a */
        public final Context f27835a;

        public a(Context context) {
            this.f27835a = context.getApplicationContext();
        }

        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            Log.v(C7169l.f27834c, "RBHybridModulePush PushPermissionTrigger.execute() " + abstractC11666a.m43816f());
            if (Build.VERSION.SDK_INT >= 33) {
                AbstractC9810k abstractC9810kM42591k = C11370y.m42581h().m42591k();
                EnumC9813n enumC9813n = EnumC9813n.POST_NOTIFICATIONS;
                if (!abstractC9810kM42591k.m38648e0(enumC9813n)) {
                    C11370y.m42581h().m42591k().m38643Z(new String[]{enumC9813n.toString()});
                    return;
                }
            }
            m29968b(this.f27835a);
        }

        /* JADX INFO: renamed from: b */
        public void m29968b(Context context) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            if (Build.VERSION.SDK_INT >= 28) {
                intent.addFlags(268435456);
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            context.startActivity(intent);
        }
    }

    public C7169l(Context context) {
        super("Push");
        m43823d("pushPermissionTrigger", new a(context));
    }
}
