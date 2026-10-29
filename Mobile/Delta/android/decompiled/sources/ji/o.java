package ji;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.TextUtils;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import gk.s;
import org.json.JSONObject;
import sg.q0;
import sg.t0;

/* JADX INFO: loaded from: classes2.dex */
public class o extends tk.b {

    public class a implements tk.b.a {
        @Override // tk.b.a
        public void a(tk.a aVar) {
            JSONObject jSONObjectF = aVar.f();
            String strOptString = jSONObjectF.optString(Text.type);
            String strOptString2 = jSONObjectF.optString("link");
            vi.g.b().q("Android-AppMain-GameShare-ChooserShown");
            if (TextUtils.isEmpty(strOptString2) || strOptString == null) {
                b(aVar.c(), q0.A0);
                aVar.a(false, null);
                return;
            }
            String string = Html.fromHtml(strOptString, 63).toString();
            String string2 = Html.fromHtml(strOptString2, 63).toString();
            String string3 = aVar.c().getString(q0.f30961q0, string);
            t0.x("", string2);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string3 + " " + string2);
            intent.putExtra("android.intent.extra.SUBJECT", string3);
            if (!s.a(aVar.c(), intent)) {
                b(aVar.c(), q0.f30988z0);
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
            androidx.appcompat.app.a.C0013a c0013a = new androidx.appcompat.app.a.C0013a(context);
            c0013a.h(context.getString(i10));
            c0013a.j(q0.f30972u, null);
            c0013a.a().show();
        }

        public a() {
        }
    }

    public o() {
        super("Social");
        d("presentShareDialog", new a());
    }
}
