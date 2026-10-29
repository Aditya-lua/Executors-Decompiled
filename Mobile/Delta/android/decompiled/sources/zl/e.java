package zl;

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
import ku.g1;
import ku.v1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f37644a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<Connection> f37645c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f37646a = new e(MessageBus.f());
    }

    public static /* synthetic */ JSONObject c(Long l10) {
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

    public static e m() {
        return a.f37646a;
    }

    public JSONArray e() {
        String string;
        if (this.b == null) {
            return new JSONArray();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Cursor cursorQuery = this.b.getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"contact_id", "mimetype", "data1", "data2", "data3"}, "mimetype IN (?, ?)", new String[]{"vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name"}, "contact_id ASC");
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
                            return e.c((Long) obj);
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

    public final String f() {
        Context context = this.b;
        return context == null ? "" : context.getResources().getConfiguration().getLocales().get(0).getCountry();
    }

    public final /* synthetic */ void i() {
        JSONArray jSONArray;
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONArray = e();
            } catch (SecurityException e10) {
                Log.e("ContactsProtocol", "Permission denied while enumerating contacts", e10);
                jSONArray = new JSONArray();
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("countryCode", f());
                jSONObject.put("contacts", jSONArray);
            }
            this.f37644a.m("ContactsProtocol", "getContacts", jSONObject, 0, new HashMap());
        } catch (JSONException e11) {
            Log.e("ContactsProtocol", "JSON exception while handling get contacts request", e11);
            this.f37644a.m("ContactsProtocol", "getContacts", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onGetContacts: " + jSONObject.toString());
        v1.a(g1.b()).execute(new Runnable() { // from class: zl.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f37643a.i();
            }
        });
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onSupportsContacts: " + jSONObject.toString());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", true);
            this.f37644a.m("ContactsProtocol", "SupportsContacts", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("ContactsProtocol", "JSON exception while handling supports contacts request: " + e10.toString());
            this.f37644a.m("ContactsProtocol", "SupportsContacts", new JSONObject(), 13, new HashMap());
        }
    }

    public void l(Context context) {
        this.b = context;
    }

    public e(MessageBus messageBus) {
        ArrayList<Connection> arrayList = new ArrayList<>();
        this.f37645c = arrayList;
        this.f37644a = messageBus;
        arrayList.add(messageBus.w("ContactsProtocol", "getContacts", new Callback() { // from class: zl.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f37641a.g(jSONObject);
            }
        }));
        this.f37645c.add(messageBus.w("ContactsProtocol", "SupportsContacts", new Callback() { // from class: zl.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void a(JSONObject jSONObject) {
                this.f37642a.h(jSONObject);
            }
        }));
    }
}
