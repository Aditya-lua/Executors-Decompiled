package p608zl;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p256ku.C7864g1;
import p256ku.C7931v1;

/* JADX INFO: renamed from: zl.e */
/* JADX INFO: loaded from: classes2.dex */
public class C13839e {

    /* JADX INFO: renamed from: a */
    public MessageBus f48463a;

    /* JADX INFO: renamed from: b */
    public Context f48464b;

    /* JADX INFO: renamed from: c */
    public ArrayList<Connection> f48465c;

    /* JADX INFO: renamed from: zl.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C13839e f48466a = new C13839e(MessageBus.m16016f());
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ JSONObject m50332c(Long l10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("firstname", "");
            jSONObject.put("lastname", "");
            jSONObject.put("phonenumber", new JSONArray());
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("ContactsProtocol", "JSON exception while creating new contact object", e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: m */
    public static C13839e m50334m() {
        return a.f48466a;
    }

    /* JADX INFO: renamed from: e */
    public JSONArray m50335e() {
        String string;
        if (this.f48464b == null) {
            return new JSONArray();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor cursorQuery = this.f48464b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "mimetype", "data1", "data2", "data3"}, "mimetype IN (?, ?)", new String[]{"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name"}, "contact_id ASC");
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("contact_id");
                int columnIndex2 = cursorQuery.getColumnIndex("mimetype");
                int columnIndex3 = cursorQuery.getColumnIndex("data1");
                int columnIndex4 = cursorQuery.getColumnIndex("data2");
                int columnIndex5 = cursorQuery.getColumnIndex("data3");
                while (cursorQuery.moveToNext()) {
                    JSONObject jSONObject = (JSONObject) linkedHashMap.computeIfAbsent(Long.valueOf(cursorQuery.getLong(columnIndex)), new Function() { // from class: zl.d
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return C13839e.m50332c((Long) obj);
                        }
                    });
                    String string2 = cursorQuery.getString(columnIndex2);
                    int iHashCode = string2.hashCode();
                    if (iHashCode != -1079224304) {
                        if (iHashCode == 684173810 && string2.equals("vnd.android.cursor.item/phone_v2") && (string = cursorQuery.getString(columnIndex3)) != null) {
                            jSONObject.getJSONArray("phonenumber").put(string);
                        }
                    } else if (string2.equals("vnd.android.cursor.item/name")) {
                        String string3 = cursorQuery.getString(columnIndex4);
                        String string4 = cursorQuery.getString(columnIndex5);
                        if (string3 != null) {
                            jSONObject.put("firstname", string3);
                        }
                        if (string4 != null) {
                            jSONObject.put("lastname", string4);
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        JSONArray jSONArray = new JSONArray();
        for (JSONObject jSONObject2 : linkedHashMap.values()) {
            if (jSONObject2.getJSONArray("phonenumber").length() > 0) {
                jSONArray.put(jSONObject2);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: f */
    public final String m50336f() {
        Context context = this.f48464b;
        return context == null ? "" : context.getResources().getConfiguration().getLocales().get(0).getCountry();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m50339i() {
        JSONArray jSONArray;
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONArray = m50335e();
            } catch (SecurityException e10) {
                Log.e("ContactsProtocol", "Permission denied while enumerating contacts", e10);
                jSONArray = new JSONArray();
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("countryCode", m50336f());
                jSONObject.put("contacts", jSONArray);
            }
            this.f48463a.m16025m("ContactsProtocol", "getContacts", jSONObject, 0, new HashMap());
        } catch (JSONException e11) {
            Log.e("ContactsProtocol", "JSON exception while handling get contacts request", e11);
            this.f48463a.m16025m("ContactsProtocol", "getContacts", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: g(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m50337g(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onGetContacts: " + jSONObject.toString());
        C7931v1.m32924a(C7864g1.m32644b()).execute(new Runnable() { // from class: zl.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f48462a.m50339i();
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: h(Lorg/json/JSONObject;)V */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m50338h(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onSupportsContacts: " + jSONObject.toString());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", true);
            this.f48463a.m16025m("ContactsProtocol", "SupportsContacts", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("ContactsProtocol", "JSON exception while handling supports contacts request: " + e10.toString());
            this.f48463a.m16025m("ContactsProtocol", "SupportsContacts", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX INFO: renamed from: l */
    public void m50342l(Context context) {
        this.f48464b = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C13839e(MessageBus messageBus) {
        ArrayList<Connection> arrayList = new ArrayList<>();
        this.f48465c = arrayList;
        this.f48463a = messageBus;
        arrayList.add(messageBus.m16033w("ContactsProtocol", "getContacts", new Callback() { // from class: zl.a
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f48460a.m50337g(jSONObject);
            }
        }));
        this.f48465c.add(messageBus.m16033w("ContactsProtocol", "SupportsContacts", new Callback() { // from class: zl.b
            @Override // com.roblox.universalapp.messagebus.Callback
            /* JADX INFO: renamed from: a */
            public final void mo7492a(JSONObject jSONObject) {
                this.f48461a.m50338h(jSONObject);
            }
        }));
    }
}
