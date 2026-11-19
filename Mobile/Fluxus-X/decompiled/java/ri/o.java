package ri;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.TextUtils;
import bh.q0;
import bh.t0;
import com.github.luben.zstd.BuildConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import ok.t;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o extends al.b {

    public class a implements al.b.a {
        @Override // al.b.a
        public void a(al.a aVar) {
            JSONObject jSONObjectF = aVar.f();
            String strOptString = jSONObjectF.optString(Text.type);
            String strOptString2 = jSONObjectF.optString("link");
            dj.g.b().q("Android-AppMain-GameShare-ChooserShown");
            if (TextUtils.isEmpty(strOptString2) || strOptString == null) {
                b(aVar.c(), q0.K0);
                aVar.a(false, null);
                return;
            }
            String string = Html.fromHtml(strOptString, 63).toString();
            String string2 = Html.fromHtml(strOptString2, 63).toString();
            String string3 = aVar.c().getString(q0.A0, string);
            t0.x(BuildConfig.FLAVOR, string2);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string3 + " " + string2);
            intent.putExtra("android.intent.extra.SUBJECT", string3);
            if (!t.a(aVar.c(), intent)) {
                b(aVar.c(), q0.J0);
                aVar.a(false, null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.PICK_ACTIVITY");
            intent2.putExtra("android.intent.extra.INTENT", intent);
            ((Activity) aVar.c()).startActivityForResult(intent2, 20103);
            aVar.a(true, null);
        }

        public final void b(Context context, int i10) {
            androidx.appcompat.app.a.C0021a c0021a = new androidx.appcompat.app.a.C0021a(context);
            c0021a.h(context.getString(i10));
            c0021a.j(q0.f4279u, null);
            c0021a.a().show();
        }

        public a() {
        }
    }

    public o() {
        super("Social");
        d("presentShareDialog", new a());
    }
}
