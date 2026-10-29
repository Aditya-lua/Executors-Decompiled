package p221ji;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Html;
import android.text.TextUtils;
import androidx.appcompat.app.DialogInterfaceC0408a;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import org.json.JSONObject;
import p151gk.C6127t;
import sg.C11347q0;
import sg.C11356t0;
import tk.AbstractC11666a;
import tk.C11667b;
import vi.C12216g;

/* JADX INFO: renamed from: ji.o */
/* JADX INFO: loaded from: classes2.dex */
public class C7172o extends C11667b {

    /* JADX INFO: renamed from: ji.o$a */
    public class a implements C11667b.a {
        @Override // tk.C11667b.a
        /* JADX INFO: renamed from: a */
        public void mo29964a(AbstractC11666a abstractC11666a) {
            JSONObject jSONObjectM43816f = abstractC11666a.m43816f();
            String strOptString = jSONObjectM43816f.optString(Text.type);
            String strOptString2 = jSONObjectM43816f.optString("link");
            C12216g.m45228b().m45278q("Android-AppMain-GameShare-ChooserShown");
            if (TextUtils.isEmpty(strOptString2) || strOptString == null) {
                m29969b(abstractC11666a.mo43813c(), C11347q0.f39897A0);
                abstractC11666a.mo43811a(false, null);
                return;
            }
            String string = Html.fromHtml(strOptString, 63).toString();
            String string2 = Html.fromHtml(strOptString2, 63).toString();
            String string3 = abstractC11666a.mo43813c().getString(C11347q0.f40002q0, string);
            C11356t0.m42554x("", string2);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string3 + " " + string2);
            intent.putExtra("android.intent.extra.SUBJECT", string3);
            if (!C6127t.m27085a(abstractC11666a.mo43813c(), intent)) {
                m29969b(abstractC11666a.mo43813c(), C11347q0.f40029z0);
                abstractC11666a.mo43811a(false, null);
                return;
            }
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.PICK_ACTIVITY");
            intent2.putExtra("android.intent.extra.INTENT", intent);
            ((Activity) abstractC11666a.mo43813c()).startActivityForResult(intent2, 20103);
            abstractC11666a.mo43811a(true, null);
        }

        /* JADX INFO: renamed from: b */
        public final void m29969b(Context context, int i10) {
            DialogInterfaceC0408a.a aVar = new DialogInterfaceC0408a.a(context);
            aVar.m1524h(context.getString(i10));
            aVar.m1526j(C11347q0.f40013u, null);
            aVar.m1517a().show();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
        }
    }

    public C7172o() {
        super("Social");
        m43823d("presentShareDialog", new a());
    }
}
