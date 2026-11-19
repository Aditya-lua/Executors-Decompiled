package nm;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;
import av.g1;
import av.v1;
import com.github.luben.zstd.BuildConfig;
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

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f25816a;
    public Context b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList<Connection> f25817c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f25818a = new e(MessageBus.getInstance());
    }

    public static /* synthetic */ JSONObject c(Long l10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("firstname", BuildConfig.FLAVOR);
            jSONObject.put("lastname", BuildConfig.FLAVOR);
            jSONObject.put("phonenumber", new JSONArray());
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("ContactsProtocol", "JSON exception while creating new contact object", e10);
            return jSONObject;
        }
    }

    public static e m() {
        return a.f25818a;
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
                    JSONObject jSONObject = (JSONObject) linkedHashMap.computeIfAbsent(Long.valueOf(cursorQuery.getLong(columnIndex)), new Function() { // from class: nm.d
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
        return context == null ? BuildConfig.FLAVOR : context.getResources().getConfiguration().getLocales().get(0).getCountry();
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
            this.f25816a.publishProtocolMethodResponse("ContactsProtocol", "getContacts", jSONObject, 0, new HashMap());
        } catch (JSONException e11) {
            Log.e("ContactsProtocol", "JSON exception while handling get contacts request", e11);
            this.f25816a.publishProtocolMethodResponse("ContactsProtocol", "getContacts", new JSONObject(), 13, new HashMap());
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void g(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onGetContacts: " + jSONObject.toString());
        v1.a(g1.b()).execute(new Runnable() { // from class: nm.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f25815a.i();
            }
        });
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void h(JSONObject jSONObject) {
        Log.d("ContactsProtocol", "onSupportsContacts: " + jSONObject.toString());
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("support", true);
            this.f25816a.publishProtocolMethodResponse("ContactsProtocol", "SupportsContacts", jSONObject2, 0, new HashMap());
        } catch (JSONException e10) {
            Log.e("ContactsProtocol", "JSON exception while handling supports contacts request: " + e10.toString());
            this.f25816a.publishProtocolMethodResponse("ContactsProtocol", "SupportsContacts", new JSONObject(), 13, new HashMap());
        }
    }

    public void l(Context context) {
        this.b = context;
    }

    public e(MessageBus messageBus) {
        ArrayList<Connection> arrayList = new ArrayList<>();
        this.f25817c = arrayList;
        this.f25816a = messageBus;
        arrayList.add(messageBus.subscribeProtocolMethodRequest("ContactsProtocol", "getContacts", new Callback() { // from class: nm.a
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void run(JSONObject jSONObject) {
                this.f25813a.g(jSONObject);
            }
        }));
        this.f25817c.add(messageBus.subscribeProtocolMethodRequest("ContactsProtocol", "SupportsContacts", new Callback() { // from class: nm.b
            @Override // com.roblox.universalapp.messagebus.Callback
            public final void run(JSONObject jSONObject) {
                this.f25814a.h(jSONObject);
            }
        }));
    }
}
